/*
 * MarketingService
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
 * SocialMediaPostDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T15:36:45.577528700-05:00[America/Bogota]", comments = "Generator version: 7.9.0")
public class SocialMediaPostDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_FEATURED_IMAGE_URL = "featuredImageUrl";
  @SerializedName(SERIALIZED_NAME_FEATURED_IMAGE_URL)
  private String featuredImageUrl;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_SOCIAL_POST_BUCKET_ID = "socialPostBucketId";
  @SerializedName(SERIALIZED_NAME_SOCIAL_POST_BUCKET_ID)
  private String socialPostBucketId;

  public static final String SERIALIZED_NAME_ENROLMENT_ID = "enrolmentId";
  @SerializedName(SERIALIZED_NAME_ENROLMENT_ID)
  private String enrolmentId;

  public SocialMediaPostDto() {
  }

  public SocialMediaPostDto id(String id) {
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


  public SocialMediaPostDto timestamp(OffsetDateTime timestamp) {
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


  public SocialMediaPostDto title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public SocialMediaPostDto content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
   */
  @javax.annotation.Nullable
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public SocialMediaPostDto featuredImageUrl(String featuredImageUrl) {
    this.featuredImageUrl = featuredImageUrl;
    return this;
  }

  /**
   * Get featuredImageUrl
   * @return featuredImageUrl
   */
  @javax.annotation.Nullable
  public String getFeaturedImageUrl() {
    return featuredImageUrl;
  }

  public void setFeaturedImageUrl(String featuredImageUrl) {
    this.featuredImageUrl = featuredImageUrl;
  }


  public SocialMediaPostDto tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
   */
  @javax.annotation.Nullable
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public SocialMediaPostDto socialPostBucketId(String socialPostBucketId) {
    this.socialPostBucketId = socialPostBucketId;
    return this;
  }

  /**
   * Get socialPostBucketId
   * @return socialPostBucketId
   */
  @javax.annotation.Nullable
  public String getSocialPostBucketId() {
    return socialPostBucketId;
  }

  public void setSocialPostBucketId(String socialPostBucketId) {
    this.socialPostBucketId = socialPostBucketId;
  }


  public SocialMediaPostDto enrolmentId(String enrolmentId) {
    this.enrolmentId = enrolmentId;
    return this;
  }

  /**
   * Get enrolmentId
   * @return enrolmentId
   */
  @javax.annotation.Nullable
  public String getEnrolmentId() {
    return enrolmentId;
  }

  public void setEnrolmentId(String enrolmentId) {
    this.enrolmentId = enrolmentId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SocialMediaPostDto socialMediaPostDto = (SocialMediaPostDto) o;
    return Objects.equals(this.id, socialMediaPostDto.id) &&
        Objects.equals(this.timestamp, socialMediaPostDto.timestamp) &&
        Objects.equals(this.title, socialMediaPostDto.title) &&
        Objects.equals(this.content, socialMediaPostDto.content) &&
        Objects.equals(this.featuredImageUrl, socialMediaPostDto.featuredImageUrl) &&
        Objects.equals(this.tenantId, socialMediaPostDto.tenantId) &&
        Objects.equals(this.socialPostBucketId, socialMediaPostDto.socialPostBucketId) &&
        Objects.equals(this.enrolmentId, socialMediaPostDto.enrolmentId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, timestamp, title, content, featuredImageUrl, tenantId, socialPostBucketId, enrolmentId);
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
    sb.append("class SocialMediaPostDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    featuredImageUrl: ").append(toIndentedString(featuredImageUrl)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    socialPostBucketId: ").append(toIndentedString(socialPostBucketId)).append("\n");
    sb.append("    enrolmentId: ").append(toIndentedString(enrolmentId)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("content");
    openapiFields.add("featuredImageUrl");
    openapiFields.add("tenantId");
    openapiFields.add("socialPostBucketId");
    openapiFields.add("enrolmentId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SocialMediaPostDto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SocialMediaPostDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SocialMediaPostDto is not found in the empty JSON string", SocialMediaPostDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SocialMediaPostDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SocialMediaPostDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull()) && !jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
      if ((jsonObj.get("featuredImageUrl") != null && !jsonObj.get("featuredImageUrl").isJsonNull()) && !jsonObj.get("featuredImageUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `featuredImageUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("featuredImageUrl").toString()));
      }
      if ((jsonObj.get("tenantId") != null && !jsonObj.get("tenantId").isJsonNull()) && !jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      if ((jsonObj.get("socialPostBucketId") != null && !jsonObj.get("socialPostBucketId").isJsonNull()) && !jsonObj.get("socialPostBucketId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `socialPostBucketId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("socialPostBucketId").toString()));
      }
      if ((jsonObj.get("enrolmentId") != null && !jsonObj.get("enrolmentId").isJsonNull()) && !jsonObj.get("enrolmentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enrolmentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enrolmentId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SocialMediaPostDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SocialMediaPostDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SocialMediaPostDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SocialMediaPostDto.class));

       return (TypeAdapter<T>) new TypeAdapter<SocialMediaPostDto>() {
           @Override
           public void write(JsonWriter out, SocialMediaPostDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SocialMediaPostDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SocialMediaPostDto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SocialMediaPostDto
   * @throws IOException if the JSON string is invalid with respect to SocialMediaPostDto
   */
  public static SocialMediaPostDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SocialMediaPostDto.class);
  }

  /**
   * Convert an instance of SocialMediaPostDto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

