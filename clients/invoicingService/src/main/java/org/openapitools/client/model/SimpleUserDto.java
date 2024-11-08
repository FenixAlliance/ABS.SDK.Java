/*
 * InvoicingService
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
 * SimpleUserDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T15:36:31.930950900-05:00[America/Bogota]", comments = "Generator version: 7.9.0")
public class SimpleUserDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_FULL_NAME = "fullName";
  @SerializedName(SERIALIZED_NAME_FULL_NAME)
  private String fullName;

  public static final String SERIALIZED_NAME_QUALIFIED_NAME = "qualifiedName";
  @SerializedName(SERIALIZED_NAME_QUALIFIED_NAME)
  private String qualifiedName;

  public static final String SERIALIZED_NAME_PUBLIC_NAME = "publicName";
  @SerializedName(SERIALIZED_NAME_PUBLIC_NAME)
  private String publicName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_COVER_URL = "coverUrl";
  @SerializedName(SERIALIZED_NAME_COVER_URL)
  private String coverUrl;

  public static final String SERIALIZED_NAME_AVATAR_URL = "avatarUrl";
  @SerializedName(SERIALIZED_NAME_AVATAR_URL)
  private String avatarUrl;

  public static final String SERIALIZED_NAME_GIT_HUB_URL = "gitHubUrl";
  @SerializedName(SERIALIZED_NAME_GIT_HUB_URL)
  private String gitHubUrl;

  public static final String SERIALIZED_NAME_COUNTRY_ID = "countryId";
  @SerializedName(SERIALIZED_NAME_COUNTRY_ID)
  private String countryId;

  public static final String SERIALIZED_NAME_TIMEZONE_ID = "timezoneId";
  @SerializedName(SERIALIZED_NAME_TIMEZONE_ID)
  private String timezoneId;

  public static final String SERIALIZED_NAME_WEBSITE_URL = "websiteUrl";
  @SerializedName(SERIALIZED_NAME_WEBSITE_URL)
  private String websiteUrl;

  public static final String SERIALIZED_NAME_TWITTER_URL = "twitterUrl";
  @SerializedName(SERIALIZED_NAME_TWITTER_URL)
  private String twitterUrl;

  public static final String SERIALIZED_NAME_YOU_TUBE_URL = "youTubeUrl";
  @SerializedName(SERIALIZED_NAME_YOU_TUBE_URL)
  private String youTubeUrl;

  public static final String SERIALIZED_NAME_LINKED_IN_URL = "linkedInUrl";
  @SerializedName(SERIALIZED_NAME_LINKED_IN_URL)
  private String linkedInUrl;

  public static final String SERIALIZED_NAME_FACEBOOK_URL = "facebookUrl";
  @SerializedName(SERIALIZED_NAME_FACEBOOK_URL)
  private String facebookUrl;

  public static final String SERIALIZED_NAME_INSTAGRAM_URL = "instagramUrl";
  @SerializedName(SERIALIZED_NAME_INSTAGRAM_URL)
  private String instagramUrl;

  public static final String SERIALIZED_NAME_SOCIAL_PROFILE_ID = "socialProfileId";
  @SerializedName(SERIALIZED_NAME_SOCIAL_PROFILE_ID)
  private String socialProfileId;

  public SimpleUserDto() {
  }

  public SimpleUserDto(
     String fullName
  ) {
    this();
    this.fullName = fullName;
  }

  public SimpleUserDto id(String id) {
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


  public SimpleUserDto timestamp(OffsetDateTime timestamp) {
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


  /**
   * Get fullName
   * @return fullName
   */
  @javax.annotation.Nullable
  public String getFullName() {
    return fullName;
  }



  public SimpleUserDto qualifiedName(String qualifiedName) {
    this.qualifiedName = qualifiedName;
    return this;
  }

  /**
   * Get qualifiedName
   * @return qualifiedName
   */
  @javax.annotation.Nullable
  public String getQualifiedName() {
    return qualifiedName;
  }

  public void setQualifiedName(String qualifiedName) {
    this.qualifiedName = qualifiedName;
  }


  public SimpleUserDto publicName(String publicName) {
    this.publicName = publicName;
    return this;
  }

  /**
   * Get publicName
   * @return publicName
   */
  @javax.annotation.Nullable
  public String getPublicName() {
    return publicName;
  }

  public void setPublicName(String publicName) {
    this.publicName = publicName;
  }


  public SimpleUserDto lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
   */
  @javax.annotation.Nullable
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public SimpleUserDto firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
   */
  @javax.annotation.Nullable
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public SimpleUserDto coverUrl(String coverUrl) {
    this.coverUrl = coverUrl;
    return this;
  }

  /**
   * Get coverUrl
   * @return coverUrl
   */
  @javax.annotation.Nullable
  public String getCoverUrl() {
    return coverUrl;
  }

  public void setCoverUrl(String coverUrl) {
    this.coverUrl = coverUrl;
  }


  public SimpleUserDto avatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

  /**
   * Get avatarUrl
   * @return avatarUrl
   */
  @javax.annotation.Nullable
  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }


  public SimpleUserDto gitHubUrl(String gitHubUrl) {
    this.gitHubUrl = gitHubUrl;
    return this;
  }

  /**
   * Get gitHubUrl
   * @return gitHubUrl
   */
  @javax.annotation.Nullable
  public String getGitHubUrl() {
    return gitHubUrl;
  }

  public void setGitHubUrl(String gitHubUrl) {
    this.gitHubUrl = gitHubUrl;
  }


  public SimpleUserDto countryId(String countryId) {
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


  public SimpleUserDto timezoneId(String timezoneId) {
    this.timezoneId = timezoneId;
    return this;
  }

  /**
   * Get timezoneId
   * @return timezoneId
   */
  @javax.annotation.Nullable
  public String getTimezoneId() {
    return timezoneId;
  }

  public void setTimezoneId(String timezoneId) {
    this.timezoneId = timezoneId;
  }


  public SimpleUserDto websiteUrl(String websiteUrl) {
    this.websiteUrl = websiteUrl;
    return this;
  }

  /**
   * Get websiteUrl
   * @return websiteUrl
   */
  @javax.annotation.Nullable
  public String getWebsiteUrl() {
    return websiteUrl;
  }

  public void setWebsiteUrl(String websiteUrl) {
    this.websiteUrl = websiteUrl;
  }


  public SimpleUserDto twitterUrl(String twitterUrl) {
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


  public SimpleUserDto youTubeUrl(String youTubeUrl) {
    this.youTubeUrl = youTubeUrl;
    return this;
  }

  /**
   * Get youTubeUrl
   * @return youTubeUrl
   */
  @javax.annotation.Nullable
  public String getYouTubeUrl() {
    return youTubeUrl;
  }

  public void setYouTubeUrl(String youTubeUrl) {
    this.youTubeUrl = youTubeUrl;
  }


  public SimpleUserDto linkedInUrl(String linkedInUrl) {
    this.linkedInUrl = linkedInUrl;
    return this;
  }

  /**
   * Get linkedInUrl
   * @return linkedInUrl
   */
  @javax.annotation.Nullable
  public String getLinkedInUrl() {
    return linkedInUrl;
  }

  public void setLinkedInUrl(String linkedInUrl) {
    this.linkedInUrl = linkedInUrl;
  }


  public SimpleUserDto facebookUrl(String facebookUrl) {
    this.facebookUrl = facebookUrl;
    return this;
  }

  /**
   * Get facebookUrl
   * @return facebookUrl
   */
  @javax.annotation.Nullable
  public String getFacebookUrl() {
    return facebookUrl;
  }

  public void setFacebookUrl(String facebookUrl) {
    this.facebookUrl = facebookUrl;
  }


  public SimpleUserDto instagramUrl(String instagramUrl) {
    this.instagramUrl = instagramUrl;
    return this;
  }

  /**
   * Get instagramUrl
   * @return instagramUrl
   */
  @javax.annotation.Nullable
  public String getInstagramUrl() {
    return instagramUrl;
  }

  public void setInstagramUrl(String instagramUrl) {
    this.instagramUrl = instagramUrl;
  }


  public SimpleUserDto socialProfileId(String socialProfileId) {
    this.socialProfileId = socialProfileId;
    return this;
  }

  /**
   * Get socialProfileId
   * @return socialProfileId
   */
  @javax.annotation.Nullable
  public String getSocialProfileId() {
    return socialProfileId;
  }

  public void setSocialProfileId(String socialProfileId) {
    this.socialProfileId = socialProfileId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleUserDto simpleUserDto = (SimpleUserDto) o;
    return Objects.equals(this.id, simpleUserDto.id) &&
        Objects.equals(this.timestamp, simpleUserDto.timestamp) &&
        Objects.equals(this.fullName, simpleUserDto.fullName) &&
        Objects.equals(this.qualifiedName, simpleUserDto.qualifiedName) &&
        Objects.equals(this.publicName, simpleUserDto.publicName) &&
        Objects.equals(this.lastName, simpleUserDto.lastName) &&
        Objects.equals(this.firstName, simpleUserDto.firstName) &&
        Objects.equals(this.coverUrl, simpleUserDto.coverUrl) &&
        Objects.equals(this.avatarUrl, simpleUserDto.avatarUrl) &&
        Objects.equals(this.gitHubUrl, simpleUserDto.gitHubUrl) &&
        Objects.equals(this.countryId, simpleUserDto.countryId) &&
        Objects.equals(this.timezoneId, simpleUserDto.timezoneId) &&
        Objects.equals(this.websiteUrl, simpleUserDto.websiteUrl) &&
        Objects.equals(this.twitterUrl, simpleUserDto.twitterUrl) &&
        Objects.equals(this.youTubeUrl, simpleUserDto.youTubeUrl) &&
        Objects.equals(this.linkedInUrl, simpleUserDto.linkedInUrl) &&
        Objects.equals(this.facebookUrl, simpleUserDto.facebookUrl) &&
        Objects.equals(this.instagramUrl, simpleUserDto.instagramUrl) &&
        Objects.equals(this.socialProfileId, simpleUserDto.socialProfileId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, timestamp, fullName, qualifiedName, publicName, lastName, firstName, coverUrl, avatarUrl, gitHubUrl, countryId, timezoneId, websiteUrl, twitterUrl, youTubeUrl, linkedInUrl, facebookUrl, instagramUrl, socialProfileId);
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
    sb.append("class SimpleUserDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    qualifiedName: ").append(toIndentedString(qualifiedName)).append("\n");
    sb.append("    publicName: ").append(toIndentedString(publicName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    coverUrl: ").append(toIndentedString(coverUrl)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    gitHubUrl: ").append(toIndentedString(gitHubUrl)).append("\n");
    sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
    sb.append("    timezoneId: ").append(toIndentedString(timezoneId)).append("\n");
    sb.append("    websiteUrl: ").append(toIndentedString(websiteUrl)).append("\n");
    sb.append("    twitterUrl: ").append(toIndentedString(twitterUrl)).append("\n");
    sb.append("    youTubeUrl: ").append(toIndentedString(youTubeUrl)).append("\n");
    sb.append("    linkedInUrl: ").append(toIndentedString(linkedInUrl)).append("\n");
    sb.append("    facebookUrl: ").append(toIndentedString(facebookUrl)).append("\n");
    sb.append("    instagramUrl: ").append(toIndentedString(instagramUrl)).append("\n");
    sb.append("    socialProfileId: ").append(toIndentedString(socialProfileId)).append("\n");
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
    openapiFields.add("fullName");
    openapiFields.add("qualifiedName");
    openapiFields.add("publicName");
    openapiFields.add("lastName");
    openapiFields.add("firstName");
    openapiFields.add("coverUrl");
    openapiFields.add("avatarUrl");
    openapiFields.add("gitHubUrl");
    openapiFields.add("countryId");
    openapiFields.add("timezoneId");
    openapiFields.add("websiteUrl");
    openapiFields.add("twitterUrl");
    openapiFields.add("youTubeUrl");
    openapiFields.add("linkedInUrl");
    openapiFields.add("facebookUrl");
    openapiFields.add("instagramUrl");
    openapiFields.add("socialProfileId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SimpleUserDto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SimpleUserDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SimpleUserDto is not found in the empty JSON string", SimpleUserDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SimpleUserDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SimpleUserDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("fullName") != null && !jsonObj.get("fullName").isJsonNull()) && !jsonObj.get("fullName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fullName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fullName").toString()));
      }
      if ((jsonObj.get("qualifiedName") != null && !jsonObj.get("qualifiedName").isJsonNull()) && !jsonObj.get("qualifiedName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `qualifiedName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("qualifiedName").toString()));
      }
      if ((jsonObj.get("publicName") != null && !jsonObj.get("publicName").isJsonNull()) && !jsonObj.get("publicName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publicName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publicName").toString()));
      }
      if ((jsonObj.get("lastName") != null && !jsonObj.get("lastName").isJsonNull()) && !jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if ((jsonObj.get("firstName") != null && !jsonObj.get("firstName").isJsonNull()) && !jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if ((jsonObj.get("coverUrl") != null && !jsonObj.get("coverUrl").isJsonNull()) && !jsonObj.get("coverUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `coverUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("coverUrl").toString()));
      }
      if ((jsonObj.get("avatarUrl") != null && !jsonObj.get("avatarUrl").isJsonNull()) && !jsonObj.get("avatarUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `avatarUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avatarUrl").toString()));
      }
      if ((jsonObj.get("gitHubUrl") != null && !jsonObj.get("gitHubUrl").isJsonNull()) && !jsonObj.get("gitHubUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gitHubUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gitHubUrl").toString()));
      }
      if ((jsonObj.get("countryId") != null && !jsonObj.get("countryId").isJsonNull()) && !jsonObj.get("countryId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryId").toString()));
      }
      if ((jsonObj.get("timezoneId") != null && !jsonObj.get("timezoneId").isJsonNull()) && !jsonObj.get("timezoneId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezoneId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezoneId").toString()));
      }
      if ((jsonObj.get("websiteUrl") != null && !jsonObj.get("websiteUrl").isJsonNull()) && !jsonObj.get("websiteUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `websiteUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("websiteUrl").toString()));
      }
      if ((jsonObj.get("twitterUrl") != null && !jsonObj.get("twitterUrl").isJsonNull()) && !jsonObj.get("twitterUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `twitterUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("twitterUrl").toString()));
      }
      if ((jsonObj.get("youTubeUrl") != null && !jsonObj.get("youTubeUrl").isJsonNull()) && !jsonObj.get("youTubeUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `youTubeUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("youTubeUrl").toString()));
      }
      if ((jsonObj.get("linkedInUrl") != null && !jsonObj.get("linkedInUrl").isJsonNull()) && !jsonObj.get("linkedInUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `linkedInUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("linkedInUrl").toString()));
      }
      if ((jsonObj.get("facebookUrl") != null && !jsonObj.get("facebookUrl").isJsonNull()) && !jsonObj.get("facebookUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `facebookUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("facebookUrl").toString()));
      }
      if ((jsonObj.get("instagramUrl") != null && !jsonObj.get("instagramUrl").isJsonNull()) && !jsonObj.get("instagramUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instagramUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instagramUrl").toString()));
      }
      if ((jsonObj.get("socialProfileId") != null && !jsonObj.get("socialProfileId").isJsonNull()) && !jsonObj.get("socialProfileId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `socialProfileId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("socialProfileId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SimpleUserDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SimpleUserDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SimpleUserDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SimpleUserDto.class));

       return (TypeAdapter<T>) new TypeAdapter<SimpleUserDto>() {
           @Override
           public void write(JsonWriter out, SimpleUserDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SimpleUserDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SimpleUserDto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SimpleUserDto
   * @throws IOException if the JSON string is invalid with respect to SimpleUserDto
   */
  public static SimpleUserDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SimpleUserDto.class);
  }

  /**
   * Convert an instance of SimpleUserDto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

