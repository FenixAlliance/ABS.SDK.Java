/*
 * CrmService
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0.1.4089
 * Contact: support@fenix-alliance.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * SocialProfileDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T15:35:39.798602200-05:00[America/Bogota]", comments = "Generator version: 7.9.0")
public class SocialProfileDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ABOUT = "about";
  @SerializedName(SERIALIZED_NAME_ABOUT)
  private String about;

  public static final String SERIALIZED_NAME_COVER = "cover";
  @SerializedName(SERIALIZED_NAME_COVER)
  private String cover;

  public static final String SERIALIZED_NAME_AVATAR = "avatar";
  @SerializedName(SERIALIZED_NAME_AVATAR)
  private String avatar;

  public static final String SERIALIZED_NAME_COUNTRY_ID = "countryId";
  @SerializedName(SERIALIZED_NAME_COUNTRY_ID)
  private String countryId;

  public static final String SERIALIZED_NAME_COUNTRY_NAME = "countryName";
  @SerializedName(SERIALIZED_NAME_COUNTRY_NAME)
  private String countryName;

  public static final String SERIALIZED_NAME_IDENTITY_ID = "identityId";
  @SerializedName(SERIALIZED_NAME_IDENTITY_ID)
  private String identityId;

  public static final String SERIALIZED_NAME_FOLLOWS_COUNT = "followsCount";
  @SerializedName(SERIALIZED_NAME_FOLLOWS_COUNT)
  private Integer followsCount;

  public static final String SERIALIZED_NAME_MESSAGES_COUNT = "messagesCount";
  @SerializedName(SERIALIZED_NAME_MESSAGES_COUNT)
  private Integer messagesCount;

  public static final String SERIALIZED_NAME_FOLLOWERS_COUNT = "followersCount";
  @SerializedName(SERIALIZED_NAME_FOLLOWERS_COUNT)
  private Integer followersCount;

  public static final String SERIALIZED_NAME_NOTIFICATIONS_COUNT = "notificationsCount";
  @SerializedName(SERIALIZED_NAME_NOTIFICATIONS_COUNT)
  private Integer notificationsCount;

  public static final String SERIALIZED_NAME_UNREAD_NOTIFICATIONS_COUNT = "unreadNotificationsCount";
  @SerializedName(SERIALIZED_NAME_UNREAD_NOTIFICATIONS_COUNT)
  private Integer unreadNotificationsCount;

  public static final String SERIALIZED_NAME_UNREAD_MESSAGES_COUNT = "unreadMessagesCount";
  @SerializedName(SERIALIZED_NAME_UNREAD_MESSAGES_COUNT)
  private Integer unreadMessagesCount;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2);

    private Integer value;

    TypeEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(Integer value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      Integer value = jsonElement.getAsInt();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_SOCIAL_FEED_ID = "socialFeedId";
  @SerializedName(SERIALIZED_NAME_SOCIAL_FEED_ID)
  private String socialFeedId;

  public static final String SERIALIZED_NAME_TWITTER_URL = "twitterUrl";
  @SerializedName(SERIALIZED_NAME_TWITTER_URL)
  private String twitterUrl;

  public static final String SERIALIZED_NAME_FACEBOOK_U_R_L = "facebookURL";
  @SerializedName(SERIALIZED_NAME_FACEBOOK_U_R_L)
  private String facebookURL;

  public static final String SERIALIZED_NAME_LINKED_IN_U_R_L = "linkedInURL";
  @SerializedName(SERIALIZED_NAME_LINKED_IN_U_R_L)
  private String linkedInURL;

  public static final String SERIALIZED_NAME_YOUTUBE_U_R_L = "youtubeURL";
  @SerializedName(SERIALIZED_NAME_YOUTUBE_U_R_L)
  private String youtubeURL;

  public static final String SERIALIZED_NAME_GITHUB_U_R_L = "githubURL";
  @SerializedName(SERIALIZED_NAME_GITHUB_U_R_L)
  private String githubURL;

  public static final String SERIALIZED_NAME_PINTEREST_U_R_L = "pinterestURL";
  @SerializedName(SERIALIZED_NAME_PINTEREST_U_R_L)
  private String pinterestURL;

  public static final String SERIALIZED_NAME_DRIBBLE_U_R_L = "dribbleURL";
  @SerializedName(SERIALIZED_NAME_DRIBBLE_U_R_L)
  private String dribbleURL;

  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public SocialProfileDto() {
  }

  public SocialProfileDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public SocialProfileDto timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
   */
  @javax.annotation.Nullable
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  public SocialProfileDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public SocialProfileDto about(String about) {
    this.about = about;
    return this;
  }

  /**
   * Get about
   * @return about
   */
  @javax.annotation.Nullable
  public String getAbout() {
    return about;
  }

  public void setAbout(String about) {
    this.about = about;
  }


  public SocialProfileDto cover(String cover) {
    this.cover = cover;
    return this;
  }

  /**
   * Get cover
   * @return cover
   */
  @javax.annotation.Nullable
  public String getCover() {
    return cover;
  }

  public void setCover(String cover) {
    this.cover = cover;
  }


  public SocialProfileDto avatar(String avatar) {
    this.avatar = avatar;
    return this;
  }

  /**
   * Get avatar
   * @return avatar
   */
  @javax.annotation.Nullable
  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }


  public SocialProfileDto countryId(String countryId) {
    this.countryId = countryId;
    return this;
  }

  /**
   * Get countryId
   * @return countryId
   */
  @javax.annotation.Nullable
  public String getCountryId() {
    return countryId;
  }

  public void setCountryId(String countryId) {
    this.countryId = countryId;
  }


  public SocialProfileDto countryName(String countryName) {
    this.countryName = countryName;
    return this;
  }

  /**
   * Get countryName
   * @return countryName
   */
  @javax.annotation.Nullable
  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }


  public SocialProfileDto identityId(String identityId) {
    this.identityId = identityId;
    return this;
  }

  /**
   * Get identityId
   * @return identityId
   */
  @javax.annotation.Nullable
  public String getIdentityId() {
    return identityId;
  }

  public void setIdentityId(String identityId) {
    this.identityId = identityId;
  }


  public SocialProfileDto followsCount(Integer followsCount) {
    this.followsCount = followsCount;
    return this;
  }

  /**
   * Get followsCount
   * @return followsCount
   */
  @javax.annotation.Nullable
  public Integer getFollowsCount() {
    return followsCount;
  }

  public void setFollowsCount(Integer followsCount) {
    this.followsCount = followsCount;
  }


  public SocialProfileDto messagesCount(Integer messagesCount) {
    this.messagesCount = messagesCount;
    return this;
  }

  /**
   * Get messagesCount
   * @return messagesCount
   */
  @javax.annotation.Nullable
  public Integer getMessagesCount() {
    return messagesCount;
  }

  public void setMessagesCount(Integer messagesCount) {
    this.messagesCount = messagesCount;
  }


  public SocialProfileDto followersCount(Integer followersCount) {
    this.followersCount = followersCount;
    return this;
  }

  /**
   * Get followersCount
   * @return followersCount
   */
  @javax.annotation.Nullable
  public Integer getFollowersCount() {
    return followersCount;
  }

  public void setFollowersCount(Integer followersCount) {
    this.followersCount = followersCount;
  }


  public SocialProfileDto notificationsCount(Integer notificationsCount) {
    this.notificationsCount = notificationsCount;
    return this;
  }

  /**
   * Get notificationsCount
   * @return notificationsCount
   */
  @javax.annotation.Nullable
  public Integer getNotificationsCount() {
    return notificationsCount;
  }

  public void setNotificationsCount(Integer notificationsCount) {
    this.notificationsCount = notificationsCount;
  }


  public SocialProfileDto unreadNotificationsCount(Integer unreadNotificationsCount) {
    this.unreadNotificationsCount = unreadNotificationsCount;
    return this;
  }

  /**
   * Get unreadNotificationsCount
   * @return unreadNotificationsCount
   */
  @javax.annotation.Nullable
  public Integer getUnreadNotificationsCount() {
    return unreadNotificationsCount;
  }

  public void setUnreadNotificationsCount(Integer unreadNotificationsCount) {
    this.unreadNotificationsCount = unreadNotificationsCount;
  }


  public SocialProfileDto unreadMessagesCount(Integer unreadMessagesCount) {
    this.unreadMessagesCount = unreadMessagesCount;
    return this;
  }

  /**
   * Get unreadMessagesCount
   * @return unreadMessagesCount
   */
  @javax.annotation.Nullable
  public Integer getUnreadMessagesCount() {
    return unreadMessagesCount;
  }

  public void setUnreadMessagesCount(Integer unreadMessagesCount) {
    this.unreadMessagesCount = unreadMessagesCount;
  }


  public SocialProfileDto type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  public SocialProfileDto socialFeedId(String socialFeedId) {
    this.socialFeedId = socialFeedId;
    return this;
  }

  /**
   * Get socialFeedId
   * @return socialFeedId
   */
  @javax.annotation.Nullable
  public String getSocialFeedId() {
    return socialFeedId;
  }

  public void setSocialFeedId(String socialFeedId) {
    this.socialFeedId = socialFeedId;
  }


  public SocialProfileDto twitterUrl(String twitterUrl) {
    this.twitterUrl = twitterUrl;
    return this;
  }

  /**
   * Get twitterUrl
   * @return twitterUrl
   */
  @javax.annotation.Nullable
  public String getTwitterUrl() {
    return twitterUrl;
  }

  public void setTwitterUrl(String twitterUrl) {
    this.twitterUrl = twitterUrl;
  }


  public SocialProfileDto facebookURL(String facebookURL) {
    this.facebookURL = facebookURL;
    return this;
  }

  /**
   * Get facebookURL
   * @return facebookURL
   */
  @javax.annotation.Nullable
  public String getFacebookURL() {
    return facebookURL;
  }

  public void setFacebookURL(String facebookURL) {
    this.facebookURL = facebookURL;
  }


  public SocialProfileDto linkedInURL(String linkedInURL) {
    this.linkedInURL = linkedInURL;
    return this;
  }

  /**
   * Get linkedInURL
   * @return linkedInURL
   */
  @javax.annotation.Nullable
  public String getLinkedInURL() {
    return linkedInURL;
  }

  public void setLinkedInURL(String linkedInURL) {
    this.linkedInURL = linkedInURL;
  }


  public SocialProfileDto youtubeURL(String youtubeURL) {
    this.youtubeURL = youtubeURL;
    return this;
  }

  /**
   * Get youtubeURL
   * @return youtubeURL
   */
  @javax.annotation.Nullable
  public String getYoutubeURL() {
    return youtubeURL;
  }

  public void setYoutubeURL(String youtubeURL) {
    this.youtubeURL = youtubeURL;
  }


  public SocialProfileDto githubURL(String githubURL) {
    this.githubURL = githubURL;
    return this;
  }

  /**
   * Get githubURL
   * @return githubURL
   */
  @javax.annotation.Nullable
  public String getGithubURL() {
    return githubURL;
  }

  public void setGithubURL(String githubURL) {
    this.githubURL = githubURL;
  }


  public SocialProfileDto pinterestURL(String pinterestURL) {
    this.pinterestURL = pinterestURL;
    return this;
  }

  /**
   * Get pinterestURL
   * @return pinterestURL
   */
  @javax.annotation.Nullable
  public String getPinterestURL() {
    return pinterestURL;
  }

  public void setPinterestURL(String pinterestURL) {
    this.pinterestURL = pinterestURL;
  }


  public SocialProfileDto dribbleURL(String dribbleURL) {
    this.dribbleURL = dribbleURL;
    return this;
  }

  /**
   * Get dribbleURL
   * @return dribbleURL
   */
  @javax.annotation.Nullable
  public String getDribbleURL() {
    return dribbleURL;
  }

  public void setDribbleURL(String dribbleURL) {
    this.dribbleURL = dribbleURL;
  }


  public SocialProfileDto domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * Get domain
   * @return domain
   */
  @javax.annotation.Nullable
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }


  public SocialProfileDto notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Get notes
   * @return notes
   */
  @javax.annotation.Nullable
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SocialProfileDto socialProfileDto = (SocialProfileDto) o;
    return Objects.equals(this.id, socialProfileDto.id) &&
        Objects.equals(this.timestamp, socialProfileDto.timestamp) &&
        Objects.equals(this.name, socialProfileDto.name) &&
        Objects.equals(this.about, socialProfileDto.about) &&
        Objects.equals(this.cover, socialProfileDto.cover) &&
        Objects.equals(this.avatar, socialProfileDto.avatar) &&
        Objects.equals(this.countryId, socialProfileDto.countryId) &&
        Objects.equals(this.countryName, socialProfileDto.countryName) &&
        Objects.equals(this.identityId, socialProfileDto.identityId) &&
        Objects.equals(this.followsCount, socialProfileDto.followsCount) &&
        Objects.equals(this.messagesCount, socialProfileDto.messagesCount) &&
        Objects.equals(this.followersCount, socialProfileDto.followersCount) &&
        Objects.equals(this.notificationsCount, socialProfileDto.notificationsCount) &&
        Objects.equals(this.unreadNotificationsCount, socialProfileDto.unreadNotificationsCount) &&
        Objects.equals(this.unreadMessagesCount, socialProfileDto.unreadMessagesCount) &&
        Objects.equals(this.type, socialProfileDto.type) &&
        Objects.equals(this.socialFeedId, socialProfileDto.socialFeedId) &&
        Objects.equals(this.twitterUrl, socialProfileDto.twitterUrl) &&
        Objects.equals(this.facebookURL, socialProfileDto.facebookURL) &&
        Objects.equals(this.linkedInURL, socialProfileDto.linkedInURL) &&
        Objects.equals(this.youtubeURL, socialProfileDto.youtubeURL) &&
        Objects.equals(this.githubURL, socialProfileDto.githubURL) &&
        Objects.equals(this.pinterestURL, socialProfileDto.pinterestURL) &&
        Objects.equals(this.dribbleURL, socialProfileDto.dribbleURL) &&
        Objects.equals(this.domain, socialProfileDto.domain) &&
        Objects.equals(this.notes, socialProfileDto.notes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, timestamp, name, about, cover, avatar, countryId, countryName, identityId, followsCount, messagesCount, followersCount, notificationsCount, unreadNotificationsCount, unreadMessagesCount, type, socialFeedId, twitterUrl, facebookURL, linkedInURL, youtubeURL, githubURL, pinterestURL, dribbleURL, domain, notes);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SocialProfileDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    about: ").append(toIndentedString(about)).append("\n");
    sb.append("    cover: ").append(toIndentedString(cover)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    identityId: ").append(toIndentedString(identityId)).append("\n");
    sb.append("    followsCount: ").append(toIndentedString(followsCount)).append("\n");
    sb.append("    messagesCount: ").append(toIndentedString(messagesCount)).append("\n");
    sb.append("    followersCount: ").append(toIndentedString(followersCount)).append("\n");
    sb.append("    notificationsCount: ").append(toIndentedString(notificationsCount)).append("\n");
    sb.append("    unreadNotificationsCount: ").append(toIndentedString(unreadNotificationsCount)).append("\n");
    sb.append("    unreadMessagesCount: ").append(toIndentedString(unreadMessagesCount)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    socialFeedId: ").append(toIndentedString(socialFeedId)).append("\n");
    sb.append("    twitterUrl: ").append(toIndentedString(twitterUrl)).append("\n");
    sb.append("    facebookURL: ").append(toIndentedString(facebookURL)).append("\n");
    sb.append("    linkedInURL: ").append(toIndentedString(linkedInURL)).append("\n");
    sb.append("    youtubeURL: ").append(toIndentedString(youtubeURL)).append("\n");
    sb.append("    githubURL: ").append(toIndentedString(githubURL)).append("\n");
    sb.append("    pinterestURL: ").append(toIndentedString(pinterestURL)).append("\n");
    sb.append("    dribbleURL: ").append(toIndentedString(dribbleURL)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("timestamp");
    openapiFields.add("name");
    openapiFields.add("about");
    openapiFields.add("cover");
    openapiFields.add("avatar");
    openapiFields.add("countryId");
    openapiFields.add("countryName");
    openapiFields.add("identityId");
    openapiFields.add("followsCount");
    openapiFields.add("messagesCount");
    openapiFields.add("followersCount");
    openapiFields.add("notificationsCount");
    openapiFields.add("unreadNotificationsCount");
    openapiFields.add("unreadMessagesCount");
    openapiFields.add("type");
    openapiFields.add("socialFeedId");
    openapiFields.add("twitterUrl");
    openapiFields.add("facebookURL");
    openapiFields.add("linkedInURL");
    openapiFields.add("youtubeURL");
    openapiFields.add("githubURL");
    openapiFields.add("pinterestURL");
    openapiFields.add("dribbleURL");
    openapiFields.add("domain");
    openapiFields.add("notes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SocialProfileDto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SocialProfileDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SocialProfileDto is not found in the empty JSON string", SocialProfileDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SocialProfileDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SocialProfileDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("about") != null && !jsonObj.get("about").isJsonNull()) && !jsonObj.get("about").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `about` to be a primitive type in the JSON string but got `%s`", jsonObj.get("about").toString()));
      }
      if ((jsonObj.get("cover") != null && !jsonObj.get("cover").isJsonNull()) && !jsonObj.get("cover").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cover` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cover").toString()));
      }
      if ((jsonObj.get("avatar") != null && !jsonObj.get("avatar").isJsonNull()) && !jsonObj.get("avatar").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `avatar` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avatar").toString()));
      }
      if ((jsonObj.get("countryId") != null && !jsonObj.get("countryId").isJsonNull()) && !jsonObj.get("countryId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryId").toString()));
      }
      if ((jsonObj.get("countryName") != null && !jsonObj.get("countryName").isJsonNull()) && !jsonObj.get("countryName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryName").toString()));
      }
      if ((jsonObj.get("identityId") != null && !jsonObj.get("identityId").isJsonNull()) && !jsonObj.get("identityId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identityId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identityId").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        TypeEnum.validateJsonElement(jsonObj.get("type"));
      }
      if ((jsonObj.get("socialFeedId") != null && !jsonObj.get("socialFeedId").isJsonNull()) && !jsonObj.get("socialFeedId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `socialFeedId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("socialFeedId").toString()));
      }
      if ((jsonObj.get("twitterUrl") != null && !jsonObj.get("twitterUrl").isJsonNull()) && !jsonObj.get("twitterUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `twitterUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("twitterUrl").toString()));
      }
      if ((jsonObj.get("facebookURL") != null && !jsonObj.get("facebookURL").isJsonNull()) && !jsonObj.get("facebookURL").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `facebookURL` to be a primitive type in the JSON string but got `%s`", jsonObj.get("facebookURL").toString()));
      }
      if ((jsonObj.get("linkedInURL") != null && !jsonObj.get("linkedInURL").isJsonNull()) && !jsonObj.get("linkedInURL").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `linkedInURL` to be a primitive type in the JSON string but got `%s`", jsonObj.get("linkedInURL").toString()));
      }
      if ((jsonObj.get("youtubeURL") != null && !jsonObj.get("youtubeURL").isJsonNull()) && !jsonObj.get("youtubeURL").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `youtubeURL` to be a primitive type in the JSON string but got `%s`", jsonObj.get("youtubeURL").toString()));
      }
      if ((jsonObj.get("githubURL") != null && !jsonObj.get("githubURL").isJsonNull()) && !jsonObj.get("githubURL").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `githubURL` to be a primitive type in the JSON string but got `%s`", jsonObj.get("githubURL").toString()));
      }
      if ((jsonObj.get("pinterestURL") != null && !jsonObj.get("pinterestURL").isJsonNull()) && !jsonObj.get("pinterestURL").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pinterestURL` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pinterestURL").toString()));
      }
      if ((jsonObj.get("dribbleURL") != null && !jsonObj.get("dribbleURL").isJsonNull()) && !jsonObj.get("dribbleURL").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dribbleURL` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dribbleURL").toString()));
      }
      if ((jsonObj.get("domain") != null && !jsonObj.get("domain").isJsonNull()) && !jsonObj.get("domain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `domain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("domain").toString()));
      }
      if ((jsonObj.get("notes") != null && !jsonObj.get("notes").isJsonNull()) && !jsonObj.get("notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SocialProfileDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SocialProfileDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SocialProfileDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SocialProfileDto.class));

       return (TypeAdapter<T>) new TypeAdapter<SocialProfileDto>() {
           @Override
           public void write(JsonWriter out, SocialProfileDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SocialProfileDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SocialProfileDto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SocialProfileDto
   * @throws IOException if the JSON string is invalid with respect to SocialProfileDto
   */
  public static SocialProfileDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SocialProfileDto.class);
  }

  /**
   * Convert an instance of SocialProfileDto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
