
package com.name.flink.pojo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReducedTweet {

	private String createdAt;
	private Long id;
	private String text;
	private String source;
	private String username;
	private Long retweetCount;
	private Long favoriteCount;
	private Boolean retweeted;
	private String lang;
	private String timestampMs;
	
	public ReducedTweet(Tweet tweet) {
		super();
		this.createdAt = tweet.getCreatedAt();
		this.id = tweet.getId();
		this.text = tweet.getText();
		this.source = tweet.getSource();
		try {
			this.username = tweet.getUser().getName();
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.retweetCount = tweet.getRetweetCount();
		this.favoriteCount = tweet.getFavoriteCount();
		this.retweeted = tweet.getRetweeted();
		this.lang = tweet.getLang();
		this.timestampMs = tweet.getTimestampMs();
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public Long getId() {
		return id;
	}

	public String getText() {
		return text;
	}

	public String getSource() {
		return source;
	}

	public String getUsername() {
		return username;
	}

	public Long getRetweetCount() {
		return retweetCount;
	}

	public Long getFavoriteCount() {
		return favoriteCount;
	}

	public Boolean getRetweeted() {
		return retweeted;
	}

	public String getLang() {
		return lang;
	}

	public String getTimestampMs() {
		return timestampMs;
	}

	@Override
	public String toString() {
		try {
			return  new ObjectMapper().writeValueAsString(this);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "ReducedTweet []";
	}

	
	
	
	}
