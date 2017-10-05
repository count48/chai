
package com.name.flink.pojo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"created_at",
	"id",
	"id_str",
	"text",
	"source",
	"truncated",
	"in_reply_to_status_id",
	"in_reply_to_status_id_str",
	"in_reply_to_user_id",
	"in_reply_to_user_id_str",
	"in_reply_to_screen_name",
	"user",
	"geo",
	"coordinates",
	"place",
	"contributors",
	"is_quote_status",
	"quote_count",
	"reply_count",
	"retweet_count",
	"favorite_count",
	"entities",
	"favorited",
	"retweeted",
	"possibly_sensitive",
	"filter_level",
	"lang",
	"timestamp_ms"
})
public class Tweet {

	@JsonProperty("created_at")
	private String createdAt;
	@JsonProperty("id")
	private Long id;
	@JsonProperty("id_str")
	private String idStr;
	@JsonProperty("text")
	private String text;
	@JsonProperty("source")
	private String source;
	@JsonProperty("truncated")
	private Boolean truncated;
	@JsonProperty("in_reply_to_status_id")
	private Object inReplyToStatusId;
	@JsonProperty("in_reply_to_status_id_str")
	private Object inReplyToStatusIdStr;
	@JsonProperty("in_reply_to_user_id")
	private Object inReplyToUserId;
	@JsonProperty("in_reply_to_user_id_str")
	private Object inReplyToUserIdStr;
	@JsonProperty("in_reply_to_screen_name")
	private Object inReplyToScreenName;
	@JsonProperty("user")
	private User user;
	@JsonProperty("geo")
	private Object geo;
	@JsonProperty("coordinates")
	private Object coordinates;
	@JsonProperty("place")
	private Object place;
	@JsonProperty("contributors")
	private Object contributors;
	@JsonProperty("is_quote_status")
	private Boolean isQuoteStatus;
	@JsonProperty("quote_count")
	private Long quoteCount;
	@JsonProperty("reply_count")
	private Long replyCount;
	@JsonProperty("retweet_count")
	private Long retweetCount;
	@JsonProperty("favorite_count")
	private Long favoriteCount;
	@JsonProperty("entities")
	private Entities entities;
	@JsonProperty("favorited")
	private Boolean favorited;
	@JsonProperty("retweeted")
	private Boolean retweeted;
	@JsonProperty("possibly_sensitive")
	private Boolean possiblySensitive;
	@JsonProperty("filter_level")
	private String filterLevel;
	@JsonProperty("lang")
	private String lang;
	@JsonProperty("timestamp_ms")
	private String timestampMs;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("created_at")
	public String getCreatedAt() {
		return createdAt;
	}

	@JsonProperty("created_at")
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	@JsonProperty("id")
	public Long getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(Long id) {
		this.id = id;
	}

	@JsonProperty("id_str")
	public String getIdStr() {
		return idStr;
	}

	@JsonProperty("id_str")
	public void setIdStr(String idStr) {
		this.idStr = idStr;
	}

	@JsonProperty("text")
	public String getText() {
		return text;
	}

	@JsonProperty("text")
	public void setText(String text) {
		this.text = text;
	}

	@JsonProperty("source")
	public String getSource() {
		return source;
	}

	@JsonProperty("source")
	public void setSource(String source) {
		this.source = source;
	}

	@JsonProperty("truncated")
	public Boolean getTruncated() {
		return truncated;
	}

	@JsonProperty("truncated")
	public void setTruncated(Boolean truncated) {
		this.truncated = truncated;
	}

	@JsonProperty("in_reply_to_status_id")
	public Object getInReplyToStatusId() {
		return inReplyToStatusId;
	}

	@JsonProperty("in_reply_to_status_id")
	public void setInReplyToStatusId(Object inReplyToStatusId) {
		this.inReplyToStatusId = inReplyToStatusId;
	}

	@JsonProperty("in_reply_to_status_id_str")
	public Object getInReplyToStatusIdStr() {
		return inReplyToStatusIdStr;
	}

	@JsonProperty("in_reply_to_status_id_str")
	public void setInReplyToStatusIdStr(Object inReplyToStatusIdStr) {
		this.inReplyToStatusIdStr = inReplyToStatusIdStr;
	}

	@JsonProperty("in_reply_to_user_id")
	public Object getInReplyToUserId() {
		return inReplyToUserId;
	}

	@JsonProperty("in_reply_to_user_id")
	public void setInReplyToUserId(Object inReplyToUserId) {
		this.inReplyToUserId = inReplyToUserId;
	}

	@JsonProperty("in_reply_to_user_id_str")
	public Object getInReplyToUserIdStr() {
		return inReplyToUserIdStr;
	}

	@JsonProperty("in_reply_to_user_id_str")
	public void setInReplyToUserIdStr(Object inReplyToUserIdStr) {
		this.inReplyToUserIdStr = inReplyToUserIdStr;
	}

	@JsonProperty("in_reply_to_screen_name")
	public Object getInReplyToScreenName() {
		return inReplyToScreenName;
	}

	@JsonProperty("in_reply_to_screen_name")
	public void setInReplyToScreenName(Object inReplyToScreenName) {
		this.inReplyToScreenName = inReplyToScreenName;
	}

	@JsonProperty("user")
	public User getUser() {
		return user;
	}

	@JsonProperty("user")
	public void setUser(User user) {
		this.user = user;
	}

	@JsonProperty("geo")
	public Object getGeo() {
		return geo;
	}

	@JsonProperty("geo")
	public void setGeo(Object geo) {
		this.geo = geo;
	}

	@JsonProperty("coordinates")
	public Object getCoordinates() {
		return coordinates;
	}

	@JsonProperty("coordinates")
	public void setCoordinates(Object coordinates) {
		this.coordinates = coordinates;
	}

	@JsonProperty("place")
	public Object getPlace() {
		return place;
	}

	@JsonProperty("place")
	public void setPlace(Object place) {
		this.place = place;
	}

	@JsonProperty("contributors")
	public Object getContributors() {
		return contributors;
	}

	@JsonProperty("contributors")
	public void setContributors(Object contributors) {
		this.contributors = contributors;
	}

	@JsonProperty("is_quote_status")
	public Boolean getIsQuoteStatus() {
		return isQuoteStatus;
	}

	@JsonProperty("is_quote_status")
	public void setIsQuoteStatus(Boolean isQuoteStatus) {
		this.isQuoteStatus = isQuoteStatus;
	}

	@JsonProperty("quote_count")
	public Long getQuoteCount() {
		return quoteCount;
	}

	@JsonProperty("quote_count")
	public void setQuoteCount(Long quoteCount) {
		this.quoteCount = quoteCount;
	}

	@JsonProperty("reply_count")
	public Long getReplyCount() {
		return replyCount;
	}

	@JsonProperty("reply_count")
	public void setReplyCount(Long replyCount) {
		this.replyCount = replyCount;
	}

	@JsonProperty("retweet_count")
	public Long getRetweetCount() {
		return retweetCount;
	}

	@JsonProperty("retweet_count")
	public void setRetweetCount(Long retweetCount) {
		this.retweetCount = retweetCount;
	}

	@JsonProperty("favorite_count")
	public Long getFavoriteCount() {
		return favoriteCount;
	}

	@JsonProperty("favorite_count")
	public void setFavoriteCount(Long favoriteCount) {
		this.favoriteCount = favoriteCount;
	}

	@JsonProperty("entities")
	public Entities getEntities() {
		return entities;
	}

	@JsonProperty("entities")
	public void setEntities(Entities entities) {
		this.entities = entities;
	}

	@JsonProperty("favorited")
	public Boolean getFavorited() {
		return favorited;
	}

	@JsonProperty("favorited")
	public void setFavorited(Boolean favorited) {
		this.favorited = favorited;
	}

	@JsonProperty("retweeted")
	public Boolean getRetweeted() {
		return retweeted;
	}

	@JsonProperty("retweeted")
	public void setRetweeted(Boolean retweeted) {
		this.retweeted = retweeted;
	}

	@JsonProperty("possibly_sensitive")
	public Boolean getPossiblySensitive() {
		return possiblySensitive;
	}

	@JsonProperty("possibly_sensitive")
	public void setPossiblySensitive(Boolean possiblySensitive) {
		this.possiblySensitive = possiblySensitive;
	}

	@JsonProperty("filter_level")
	public String getFilterLevel() {
		return filterLevel;
	}

	@JsonProperty("filter_level")
	public void setFilterLevel(String filterLevel) {
		this.filterLevel = filterLevel;
	}

	@JsonProperty("lang")
	public String getLang() {
		return lang;
	}

	@JsonProperty("lang")
	public void setLang(String lang) {
		this.lang = lang;
	}

	@JsonProperty("timestamp_ms")
	public String getTimestampMs() {
		return timestampMs;
	}

	@JsonProperty("timestamp_ms")
	public void setTimestampMs(String timestampMs) {
		this.timestampMs = timestampMs;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(retweeted).append(replyCount).append(inReplyToUserIdStr).append(retweetCount).append(quoteCount).append(truncated).append(lang).append(id).append(inReplyToStatusIdStr).append(createdAt).append(place).append(coordinates).append(contributors).append(text).append(filterLevel).append(geo).append(timestampMs).append(inReplyToScreenName).append(entities).append(possiblySensitive).append(idStr).append(inReplyToStatusId).append(favoriteCount).append(source).append(favorited).append(additionalProperties).append(inReplyToUserId).append(user).append(isQuoteStatus).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Tweet) == false) {
			return false;
		}
		Tweet rhs = ((Tweet) other);
		return new EqualsBuilder().append(retweeted, rhs.retweeted).append(replyCount, rhs.replyCount).append(inReplyToUserIdStr, rhs.inReplyToUserIdStr).append(retweetCount, rhs.retweetCount).append(quoteCount, rhs.quoteCount).append(truncated, rhs.truncated).append(lang, rhs.lang).append(id, rhs.id).append(inReplyToStatusIdStr, rhs.inReplyToStatusIdStr).append(createdAt, rhs.createdAt).append(place, rhs.place).append(coordinates, rhs.coordinates).append(contributors, rhs.contributors).append(text, rhs.text).append(filterLevel, rhs.filterLevel).append(geo, rhs.geo).append(timestampMs, rhs.timestampMs).append(inReplyToScreenName, rhs.inReplyToScreenName).append(entities, rhs.entities).append(possiblySensitive, rhs.possiblySensitive).append(idStr, rhs.idStr).append(inReplyToStatusId, rhs.inReplyToStatusId).append(favoriteCount, rhs.favoriteCount).append(source, rhs.source).append(favorited, rhs.favorited).append(additionalProperties, rhs.additionalProperties).append(inReplyToUserId, rhs.inReplyToUserId).append(user, rhs.user).append(isQuoteStatus, rhs.isQuoteStatus).isEquals();
	}

	@Override
	public String toString() {
		try {
			return  new ObjectMapper().writeValueAsString(this);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return createdAt;
	}
	
	

}
