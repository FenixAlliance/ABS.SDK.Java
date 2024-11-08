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
import java.util.UUID;
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
 * EmailTemplateCreateDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T15:36:45.577528700-05:00[America/Bogota]", comments = "Generator version: 7.9.0")
public class EmailTemplateCreateDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_ENROLMENT_ID = "enrolmentId";
  @SerializedName(SERIALIZED_NAME_ENROLMENT_ID)
  private String enrolmentId;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_AUTHOR_ID = "authorId";
  @SerializedName(SERIALIZED_NAME_AUTHOR_ID)
  private String authorId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_HTML_CONTENT = "htmlContent";
  @SerializedName(SERIALIZED_NAME_HTML_CONTENT)
  private String htmlContent;

  public static final String SERIALIZED_NAME_FEATURED_IMAGE_URL = "featuredImageUrl";
  @SerializedName(SERIALIZED_NAME_FEATURED_IMAGE_URL)
  private String featuredImageUrl;

  public static final String SERIALIZED_NAME_MARKETING_CAMPAIGN_ID = "marketingCampaignId";
  @SerializedName(SERIALIZED_NAME_MARKETING_CAMPAIGN_ID)
  private String marketingCampaignId;

  public EmailTemplateCreateDto() {
  }

  public EmailTemplateCreateDto(
     UUID id, 
     OffsetDateTime timestamp
  ) {
    this();
    this.id = id;
    this.timestamp = timestamp;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public UUID getId() {
    return id;
  }



  /**
   * Get timestamp
   * @return timestamp
   */
  @javax.annotation.Nullable
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }



  public EmailTemplateCreateDto tenantId(String tenantId) {
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


  public EmailTemplateCreateDto enrolmentId(String enrolmentId) {
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


  public EmailTemplateCreateDto title(String title) {
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


  public EmailTemplateCreateDto authorId(String authorId) {
    this.authorId = authorId;
    return this;
  }

  /**
   * Get authorId
   * @return authorId
   */
  @javax.annotation.Nullable
  public String getAuthorId() {
    return authorId;
  }

  public void setAuthorId(String authorId) {
    this.authorId = authorId;
  }


  public EmailTemplateCreateDto description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public EmailTemplateCreateDto htmlContent(String htmlContent) {
    this.htmlContent = htmlContent;
    return this;
  }

  /**
   * Get htmlContent
   * @return htmlContent
   */
  @javax.annotation.Nullable
  public String getHtmlContent() {
    return htmlContent;
  }

  public void setHtmlContent(String htmlContent) {
    this.htmlContent = htmlContent;
  }


  public EmailTemplateCreateDto featuredImageUrl(String featuredImageUrl) {
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


  public EmailTemplateCreateDto marketingCampaignId(String marketingCampaignId) {
    this.marketingCampaignId = marketingCampaignId;
    return this;
  }

  /**
   * Get marketingCampaignId
   * @return marketingCampaignId
   */
  @javax.annotation.Nullable
  public String getMarketingCampaignId() {
    return marketingCampaignId;
  }

  public void setMarketingCampaignId(String marketingCampaignId) {
    this.marketingCampaignId = marketingCampaignId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailTemplateCreateDto emailTemplateCreateDto = (EmailTemplateCreateDto) o;
    return Objects.equals(this.id, emailTemplateCreateDto.id) &&
        Objects.equals(this.timestamp, emailTemplateCreateDto.timestamp) &&
        Objects.equals(this.tenantId, emailTemplateCreateDto.tenantId) &&
        Objects.equals(this.enrolmentId, emailTemplateCreateDto.enrolmentId) &&
        Objects.equals(this.title, emailTemplateCreateDto.title) &&
        Objects.equals(this.authorId, emailTemplateCreateDto.authorId) &&
        Objects.equals(this.description, emailTemplateCreateDto.description) &&
        Objects.equals(this.htmlContent, emailTemplateCreateDto.htmlContent) &&
        Objects.equals(this.featuredImageUrl, emailTemplateCreateDto.featuredImageUrl) &&
        Objects.equals(this.marketingCampaignId, emailTemplateCreateDto.marketingCampaignId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, timestamp, tenantId, enrolmentId, title, authorId, description, htmlContent, featuredImageUrl, marketingCampaignId);
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
    sb.append("class EmailTemplateCreateDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    enrolmentId: ").append(toIndentedString(enrolmentId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    htmlContent: ").append(toIndentedString(htmlContent)).append("\n");
    sb.append("    featuredImageUrl: ").append(toIndentedString(featuredImageUrl)).append("\n");
    sb.append("    marketingCampaignId: ").append(toIndentedString(marketingCampaignId)).append("\n");
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
    openapiFields.add("tenantId");
    openapiFields.add("enrolmentId");
    openapiFields.add("title");
    openapiFields.add("authorId");
    openapiFields.add("description");
    openapiFields.add("htmlContent");
    openapiFields.add("featuredImageUrl");
    openapiFields.add("marketingCampaignId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EmailTemplateCreateDto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EmailTemplateCreateDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmailTemplateCreateDto is not found in the empty JSON string", EmailTemplateCreateDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EmailTemplateCreateDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EmailTemplateCreateDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("tenantId") != null && !jsonObj.get("tenantId").isJsonNull()) && !jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      if ((jsonObj.get("enrolmentId") != null && !jsonObj.get("enrolmentId").isJsonNull()) && !jsonObj.get("enrolmentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enrolmentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enrolmentId").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("authorId") != null && !jsonObj.get("authorId").isJsonNull()) && !jsonObj.get("authorId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authorId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authorId").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("htmlContent") != null && !jsonObj.get("htmlContent").isJsonNull()) && !jsonObj.get("htmlContent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `htmlContent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("htmlContent").toString()));
      }
      if ((jsonObj.get("featuredImageUrl") != null && !jsonObj.get("featuredImageUrl").isJsonNull()) && !jsonObj.get("featuredImageUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `featuredImageUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("featuredImageUrl").toString()));
      }
      if ((jsonObj.get("marketingCampaignId") != null && !jsonObj.get("marketingCampaignId").isJsonNull()) && !jsonObj.get("marketingCampaignId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `marketingCampaignId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("marketingCampaignId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmailTemplateCreateDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmailTemplateCreateDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmailTemplateCreateDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmailTemplateCreateDto.class));

       return (TypeAdapter<T>) new TypeAdapter<EmailTemplateCreateDto>() {
           @Override
           public void write(JsonWriter out, EmailTemplateCreateDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EmailTemplateCreateDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EmailTemplateCreateDto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EmailTemplateCreateDto
   * @throws IOException if the JSON string is invalid with respect to EmailTemplateCreateDto
   */
  public static EmailTemplateCreateDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmailTemplateCreateDto.class);
  }

  /**
   * Convert an instance of EmailTemplateCreateDto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

