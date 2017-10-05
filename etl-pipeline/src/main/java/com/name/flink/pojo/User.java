
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
    "id",
    "id_str",
    "name",
    "screen_name",
    "location",
    "url",
    "description",
    "translator_type",
    "protected",
    "verified",
    "followers_count",
    "friends_count",
    "listed_count",
    "favourites_count",
    "statuses_count",
    "created_at",
    "utc_offset",
    "time_zone",
    "geo_enabled",
    "lang",
    "contributors_enabled",
    "is_translator",
    "profile_background_color",
    "profile_background_image_url",
    "profile_background_image_url_https",
    "profile_background_tile",
    "profile_link_color",
    "profile_sidebar_border_color",
    "profile_sidebar_fill_color",
    "profile_text_color",
    "profile_use_background_image",
    "profile_image_url",
    "profile_image_url_https",
    "profile_banner_url",
    "default_profile",
    "default_profile_image",
    "following",
    "follow_request_sent",
    "notifications"
})
public class User {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("id_str")
    private String idStr;
    @JsonProperty("name")
    private String name;
    @JsonProperty("screen_name")
    private String screenName;
    @JsonProperty("location")
    private String location;
    @JsonProperty("url")
    private String url;
    @JsonProperty("description")
    private String description;
    @JsonProperty("translator_type")
    private String translatorType;
    @JsonProperty("protected")
    private Boolean _protected;
    @JsonProperty("verified")
    private Boolean verified;
    @JsonProperty("followers_count")
    private Long followersCount;
    @JsonProperty("friends_count")
    private Long friendsCount;
    @JsonProperty("listed_count")
    private Long listedCount;
    @JsonProperty("favourites_count")
    private Long favouritesCount;
    @JsonProperty("statuses_count")
    private Long statusesCount;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("utc_offset")
    private Long utcOffset;
    @JsonProperty("time_zone")
    private String timeZone;
    @JsonProperty("geo_enabled")
    private Boolean geoEnabled;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("contributors_enabled")
    private Boolean contributorsEnabled;
    @JsonProperty("is_translator")
    private Boolean isTranslator;
    @JsonProperty("profile_background_color")
    private String profileBackgroundColor;
    @JsonProperty("profile_background_image_url")
    private String profileBackgroundImageUrl;
    @JsonProperty("profile_background_image_url_https")
    private String profileBackgroundImageUrlHttps;
    @JsonProperty("profile_background_tile")
    private Boolean profileBackgroundTile;
    @JsonProperty("profile_link_color")
    private String profileLinkColor;
    @JsonProperty("profile_sidebar_border_color")
    private String profileSidebarBorderColor;
    @JsonProperty("profile_sidebar_fill_color")
    private String profileSidebarFillColor;
    @JsonProperty("profile_text_color")
    private String profileTextColor;
    @JsonProperty("profile_use_background_image")
    private Boolean profileUseBackgroundImage;
    @JsonProperty("profile_image_url")
    private String profileImageUrl;
    @JsonProperty("profile_image_url_https")
    private String profileImageUrlHttps;
    @JsonProperty("profile_banner_url")
    private String profileBannerUrl;
    @JsonProperty("default_profile")
    private Boolean defaultProfile;
    @JsonProperty("default_profile_image")
    private Boolean defaultProfileImage;
    @JsonProperty("following")
    private Object following;
    @JsonProperty("follow_request_sent")
    private Object followRequestSent;
    @JsonProperty("notifications")
    private Object notifications;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("screen_name")
    public String getScreenName() {
        return screenName;
    }

    @JsonProperty("screen_name")
    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("translator_type")
    public String getTranslatorType() {
        return translatorType;
    }

    @JsonProperty("translator_type")
    public void setTranslatorType(String translatorType) {
        this.translatorType = translatorType;
    }

    @JsonProperty("protected")
    public Boolean getProtected() {
        return _protected;
    }

    @JsonProperty("protected")
    public void setProtected(Boolean _protected) {
        this._protected = _protected;
    }

    @JsonProperty("verified")
    public Boolean getVerified() {
        return verified;
    }

    @JsonProperty("verified")
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    @JsonProperty("followers_count")
    public Long getFollowersCount() {
        return followersCount;
    }

    @JsonProperty("followers_count")
    public void setFollowersCount(Long followersCount) {
        this.followersCount = followersCount;
    }

    @JsonProperty("friends_count")
    public Long getFriendsCount() {
        return friendsCount;
    }

    @JsonProperty("friends_count")
    public void setFriendsCount(Long friendsCount) {
        this.friendsCount = friendsCount;
    }

    @JsonProperty("listed_count")
    public Long getListedCount() {
        return listedCount;
    }

    @JsonProperty("listed_count")
    public void setListedCount(Long listedCount) {
        this.listedCount = listedCount;
    }

    @JsonProperty("favourites_count")
    public Long getFavouritesCount() {
        return favouritesCount;
    }

    @JsonProperty("favourites_count")
    public void setFavouritesCount(Long favouritesCount) {
        this.favouritesCount = favouritesCount;
    }

    @JsonProperty("statuses_count")
    public Long getStatusesCount() {
        return statusesCount;
    }

    @JsonProperty("statuses_count")
    public void setStatusesCount(Long statusesCount) {
        this.statusesCount = statusesCount;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("utc_offset")
    public Long getUtcOffset() {
        return utcOffset;
    }

    @JsonProperty("utc_offset")
    public void setUtcOffset(Long utcOffset) {
        this.utcOffset = utcOffset;
    }

    @JsonProperty("time_zone")
    public String getTimeZone() {
        return timeZone;
    }

    @JsonProperty("time_zone")
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    @JsonProperty("geo_enabled")
    public Boolean getGeoEnabled() {
        return geoEnabled;
    }

    @JsonProperty("geo_enabled")
    public void setGeoEnabled(Boolean geoEnabled) {
        this.geoEnabled = geoEnabled;
    }

    @JsonProperty("lang")
    public String getLang() {
        return lang;
    }

    @JsonProperty("lang")
    public void setLang(String lang) {
        this.lang = lang;
    }

    @JsonProperty("contributors_enabled")
    public Boolean getContributorsEnabled() {
        return contributorsEnabled;
    }

    @JsonProperty("contributors_enabled")
    public void setContributorsEnabled(Boolean contributorsEnabled) {
        this.contributorsEnabled = contributorsEnabled;
    }

    @JsonProperty("is_translator")
    public Boolean getIsTranslator() {
        return isTranslator;
    }

    @JsonProperty("is_translator")
    public void setIsTranslator(Boolean isTranslator) {
        this.isTranslator = isTranslator;
    }

    @JsonProperty("profile_background_color")
    public String getProfileBackgroundColor() {
        return profileBackgroundColor;
    }

    @JsonProperty("profile_background_color")
    public void setProfileBackgroundColor(String profileBackgroundColor) {
        this.profileBackgroundColor = profileBackgroundColor;
    }

    @JsonProperty("profile_background_image_url")
    public String getProfileBackgroundImageUrl() {
        return profileBackgroundImageUrl;
    }

    @JsonProperty("profile_background_image_url")
    public void setProfileBackgroundImageUrl(String profileBackgroundImageUrl) {
        this.profileBackgroundImageUrl = profileBackgroundImageUrl;
    }

    @JsonProperty("profile_background_image_url_https")
    public String getProfileBackgroundImageUrlHttps() {
        return profileBackgroundImageUrlHttps;
    }

    @JsonProperty("profile_background_image_url_https")
    public void setProfileBackgroundImageUrlHttps(String profileBackgroundImageUrlHttps) {
        this.profileBackgroundImageUrlHttps = profileBackgroundImageUrlHttps;
    }

    @JsonProperty("profile_background_tile")
    public Boolean getProfileBackgroundTile() {
        return profileBackgroundTile;
    }

    @JsonProperty("profile_background_tile")
    public void setProfileBackgroundTile(Boolean profileBackgroundTile) {
        this.profileBackgroundTile = profileBackgroundTile;
    }

    @JsonProperty("profile_link_color")
    public String getProfileLinkColor() {
        return profileLinkColor;
    }

    @JsonProperty("profile_link_color")
    public void setProfileLinkColor(String profileLinkColor) {
        this.profileLinkColor = profileLinkColor;
    }

    @JsonProperty("profile_sidebar_border_color")
    public String getProfileSidebarBorderColor() {
        return profileSidebarBorderColor;
    }

    @JsonProperty("profile_sidebar_border_color")
    public void setProfileSidebarBorderColor(String profileSidebarBorderColor) {
        this.profileSidebarBorderColor = profileSidebarBorderColor;
    }

    @JsonProperty("profile_sidebar_fill_color")
    public String getProfileSidebarFillColor() {
        return profileSidebarFillColor;
    }

    @JsonProperty("profile_sidebar_fill_color")
    public void setProfileSidebarFillColor(String profileSidebarFillColor) {
        this.profileSidebarFillColor = profileSidebarFillColor;
    }

    @JsonProperty("profile_text_color")
    public String getProfileTextColor() {
        return profileTextColor;
    }

    @JsonProperty("profile_text_color")
    public void setProfileTextColor(String profileTextColor) {
        this.profileTextColor = profileTextColor;
    }

    @JsonProperty("profile_use_background_image")
    public Boolean getProfileUseBackgroundImage() {
        return profileUseBackgroundImage;
    }

    @JsonProperty("profile_use_background_image")
    public void setProfileUseBackgroundImage(Boolean profileUseBackgroundImage) {
        this.profileUseBackgroundImage = profileUseBackgroundImage;
    }

    @JsonProperty("profile_image_url")
    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    @JsonProperty("profile_image_url")
    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    @JsonProperty("profile_image_url_https")
    public String getProfileImageUrlHttps() {
        return profileImageUrlHttps;
    }

    @JsonProperty("profile_image_url_https")
    public void setProfileImageUrlHttps(String profileImageUrlHttps) {
        this.profileImageUrlHttps = profileImageUrlHttps;
    }

    @JsonProperty("profile_banner_url")
    public String getProfileBannerUrl() {
        return profileBannerUrl;
    }

    @JsonProperty("profile_banner_url")
    public void setProfileBannerUrl(String profileBannerUrl) {
        this.profileBannerUrl = profileBannerUrl;
    }

    @JsonProperty("default_profile")
    public Boolean getDefaultProfile() {
        return defaultProfile;
    }

    @JsonProperty("default_profile")
    public void setDefaultProfile(Boolean defaultProfile) {
        this.defaultProfile = defaultProfile;
    }

    @JsonProperty("default_profile_image")
    public Boolean getDefaultProfileImage() {
        return defaultProfileImage;
    }

    @JsonProperty("default_profile_image")
    public void setDefaultProfileImage(Boolean defaultProfileImage) {
        this.defaultProfileImage = defaultProfileImage;
    }

    @JsonProperty("following")
    public Object getFollowing() {
        return following;
    }

    @JsonProperty("following")
    public void setFollowing(Object following) {
        this.following = following;
    }

    @JsonProperty("follow_request_sent")
    public Object getFollowRequestSent() {
        return followRequestSent;
    }

    @JsonProperty("follow_request_sent")
    public void setFollowRequestSent(Object followRequestSent) {
        this.followRequestSent = followRequestSent;
    }

    @JsonProperty("notifications")
    public Object getNotifications() {
        return notifications;
    }

    @JsonProperty("notifications")
    public void setNotifications(Object notifications) {
        this.notifications = notifications;
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
        return new HashCodeBuilder().append(isTranslator).append(friendsCount).append(profileUseBackgroundImage).append(profileBackgroundColor).append(followRequestSent).append(location).append(profileBannerUrl).append(favouritesCount).append(screenName).append(profileImageUrl).append(timeZone).append(profileSidebarBorderColor).append(defaultProfileImage).append(lang).append(id).append(following).append(profileSidebarFillColor).append(createdAt).append(verified).append(description).append(name).append(contributorsEnabled).append(profileBackgroundImageUrlHttps).append(profileImageUrlHttps).append(geoEnabled).append(listedCount).append(_protected).append(url).append(idStr).append(profileBackgroundTile).append(profileLinkColor).append(translatorType).append(notifications).append(additionalProperties).append(utcOffset).append(followersCount).append(profileTextColor).append(profileBackgroundImageUrl).append(statusesCount).append(defaultProfile).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof User) == false) {
            return false;
        }
        User rhs = ((User) other);
        return new EqualsBuilder().append(isTranslator, rhs.isTranslator).append(friendsCount, rhs.friendsCount).append(profileUseBackgroundImage, rhs.profileUseBackgroundImage).append(profileBackgroundColor, rhs.profileBackgroundColor).append(followRequestSent, rhs.followRequestSent).append(location, rhs.location).append(profileBannerUrl, rhs.profileBannerUrl).append(favouritesCount, rhs.favouritesCount).append(screenName, rhs.screenName).append(profileImageUrl, rhs.profileImageUrl).append(timeZone, rhs.timeZone).append(profileSidebarBorderColor, rhs.profileSidebarBorderColor).append(defaultProfileImage, rhs.defaultProfileImage).append(lang, rhs.lang).append(id, rhs.id).append(following, rhs.following).append(profileSidebarFillColor, rhs.profileSidebarFillColor).append(createdAt, rhs.createdAt).append(verified, rhs.verified).append(description, rhs.description).append(name, rhs.name).append(contributorsEnabled, rhs.contributorsEnabled).append(profileBackgroundImageUrlHttps, rhs.profileBackgroundImageUrlHttps).append(profileImageUrlHttps, rhs.profileImageUrlHttps).append(geoEnabled, rhs.geoEnabled).append(listedCount, rhs.listedCount).append(_protected, rhs._protected).append(url, rhs.url).append(idStr, rhs.idStr).append(profileBackgroundTile, rhs.profileBackgroundTile).append(profileLinkColor, rhs.profileLinkColor).append(translatorType, rhs.translatorType).append(notifications, rhs.notifications).append(additionalProperties, rhs.additionalProperties).append(utcOffset, rhs.utcOffset).append(followersCount, rhs.followersCount).append(profileTextColor, rhs.profileTextColor).append(profileBackgroundImageUrl, rhs.profileBackgroundImageUrl).append(statusesCount, rhs.statusesCount).append(defaultProfile, rhs.defaultProfile).isEquals();
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
