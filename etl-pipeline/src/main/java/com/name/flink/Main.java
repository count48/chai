package com.name.flink;

import java.util.Properties;
import java.util.StringTokenizer;

import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.api.java.utils.ParameterTool;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.connectors.twitter.TwitterSource;

import org.apache.flink.util.Collector;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.name.flink.pojo.ReducedTweet;
import com.name.flink.pojo.Tweet;

public class Main {

	// *************************************************************************
	// PROGRAM
	// *************************************************************************

	public static void main(String[] args) throws Exception {

		// Checking input parameters
		final ParameterTool params = ParameterTool.fromArgs(args);
		System.out.println("Usage: TwitterExample [--output <path>] " +
				"[--twitter-source.consumerKey <key> --twitter-source.consumerSecret <secret> --twitter-source.token <token> --twitter-source.tokenSecret <tokenSecret>]");


		Properties properties = new Properties();
		properties.setProperty("bootstrap.servers", "localhost:9092");
		// only required for Kafka 0.8
		//properties.setProperty("zookeeper.connect", "localhost:2181");
		properties.setProperty("group.id", "test");

		// set up the execution environment
		StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

		// make parameters available in the web interface
		env.getConfig().setGlobalJobParameters(params);

		env.setParallelism(params.getInt("parallelism", 1));

		// get input data
		DataStream<String> streamSource;
		if (params.has(TwitterSource.CONSUMER_KEY) &&
				params.has(TwitterSource.CONSUMER_SECRET) &&
				params.has(TwitterSource.TOKEN) &&
				params.has(TwitterSource.TOKEN_SECRET)
				) {
			streamSource = env.addSource(new TwitterSource(params.getProperties()));
		} else {
			System.out.println("Executing TwitterStream example with default props.");
			System.out.println("Use --twitter-source.consumerKey <key> --twitter-source.consumerSecret <secret> " +
					"--twitter-source.token <token> --twitter-source.tokenSecret <tokenSecret> specify the authentication info.");
			// get default test text data
			streamSource = env.fromElements(TwitterExampleData.TEXTS);
		}

		DataStream<Tweet> tweets = streamSource
				// selecting English tweets and splitting to (word, 1)
				.map(new ReleventTweetsMap());
	/*	FlinkKafkaProducer010Configuration<String> myProducerConfig = FlinkKafkaProducer010.writeToKafkaWithTimestamps(
				streamSource,                     // input stream
		        "my-topic",                 // target topic
		        new SimpleStringSchema(),   // serialization schema
		        properties);                // custom configuration for KafkaProducer (including broker list)

		// the following is necessary for at-least-once delivery guarantee
		myProducerConfig.setLogFailuresOnly(false);   // "false" by default
		myProducerConfig.setFlushOnCheckpoint(true);  // "false" by default
*/


		// emit result
		if (params.has("output")) {
			tweets.writeAsText(params.get("output"));
		} else {
			System.out.println("Printing result to stdout. Use --output to specify output path.");
			tweets.print();
		}

		// execute program
		env.execute("Twitter Streaming Example");
	}

	// *************************************************************************
	// USER FUNCTIONS
	// *************************************************************************

	/**
	 * Deserialize JSON from twitter source
	 *
	 * <p>Implements a string tokenizer that splits sentences into words as a
	 * user-defined FlatMapFunction. The function takes a line (String) and
	 * splits it into multiple pairs in the form of "(word,1)" ({@code Tuple2<String,
	 * Integer>}).
	 */
	public static class SelectEnglishAndTokenizeFlatMap implements FlatMapFunction<String, Tuple2<String, Integer>> {
		private static final long serialVersionUID = 1L;

		private transient ObjectMapper jsonParser;

		/**
		 * Select the language from the incoming JSON text.
		 */
		//@Override
		public void flatMap(String value, Collector<Tuple2<String, Integer>> out) throws Exception {
			if (jsonParser == null) {
				jsonParser = new ObjectMapper();
			}
			JsonNode jsonNode = jsonParser.readValue(value, JsonNode.class);
			boolean isEnglish = jsonNode.has("user") && jsonNode.get("user").has("lang") && jsonNode.get("user").get("lang").asText().equals("en");
			boolean hasText = jsonNode.has("text");
			if (isEnglish && hasText) {
				// message of tweet
				StringTokenizer tokenizer = new StringTokenizer(jsonNode.get("text").asText());

				// split the message
				while (tokenizer.hasMoreTokens()) {
					String result = tokenizer.nextToken().replaceAll("\\s*", "").toLowerCase();

					if (!result.equals("")) {
						out.collect(new Tuple2<>(result, 1));
					}
				}
			}
		}
	}
	public static class ReleventTweetsMap implements MapFunction<String, Tweet> {
		private static final long serialVersionUID = 1L;

		private transient ObjectMapper jsonParser;

		//@Override
		public Tweet map(String value) throws Exception {
			Tweet thisTweet;
			if (jsonParser == null) {
				jsonParser = new ObjectMapper();
				jsonParser.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
			}
			thisTweet = jsonParser.readValue(value, Tweet.class);
			return thisTweet;
		}
	}
	public static class ReduceFields implements MapFunction<Tweet, ReducedTweet> {
		private static final long serialVersionUID = 1L;

		private transient ObjectMapper jsonParser;

		@Override
		public ReducedTweet map(Tweet tweet) throws Exception {
			return new ReducedTweet(tweet);
		}
	}

}
