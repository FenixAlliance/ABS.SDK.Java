/*
 * TimeTrackerService
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
 * ProjectHoursApprovalCreateDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T15:38:22.045900400-05:00[America/Bogota]", comments = "Generator version: 7.9.0")
public class ProjectHoursApprovalCreateDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_REQUESTER_CONTACT_I_D = "requesterContactID";
  @SerializedName(SERIALIZED_NAME_REQUESTER_CONTACT_I_D)
  private String requesterContactID;

  public static final String SERIALIZED_NAME_APPROVER_CONTACT_I_D = "approverContactID";
  @SerializedName(SERIALIZED_NAME_APPROVER_CONTACT_I_D)
  private String approverContactID;

  public static final String SERIALIZED_NAME_PROJECT_PERIOD_I_D = "projectPeriodID";
  @SerializedName(SERIALIZED_NAME_PROJECT_PERIOD_I_D)
  private String projectPeriodID;

  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private String comments;

  public ProjectHoursApprovalCreateDto() {
  }

  public ProjectHoursApprovalCreateDto(
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



  public ProjectHoursApprovalCreateDto requesterContactID(String requesterContactID) {
    this.requesterContactID = requesterContactID;
    return this;
  }

  /**
   * Get requesterContactID
   * @return requesterContactID
   */
  @javax.annotation.Nullable
  public String getRequesterContactID() {
    return requesterContactID;
  }

  public void setRequesterContactID(String requesterContactID) {
    this.requesterContactID = requesterContactID;
  }


  public ProjectHoursApprovalCreateDto approverContactID(String approverContactID) {
    this.approverContactID = approverContactID;
    return this;
  }

  /**
   * Get approverContactID
   * @return approverContactID
   */
  @javax.annotation.Nullable
  public String getApproverContactID() {
    return approverContactID;
  }

  public void setApproverContactID(String approverContactID) {
    this.approverContactID = approverContactID;
  }


  public ProjectHoursApprovalCreateDto projectPeriodID(String projectPeriodID) {
    this.projectPeriodID = projectPeriodID;
    return this;
  }

  /**
   * Get projectPeriodID
   * @return projectPeriodID
   */
  @javax.annotation.Nullable
  public String getProjectPeriodID() {
    return projectPeriodID;
  }

  public void setProjectPeriodID(String projectPeriodID) {
    this.projectPeriodID = projectPeriodID;
  }


  public ProjectHoursApprovalCreateDto comments(String comments) {
    this.comments = comments;
    return this;
  }

  /**
   * Get comments
   * @return comments
   */
  @javax.annotation.Nullable
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectHoursApprovalCreateDto projectHoursApprovalCreateDto = (ProjectHoursApprovalCreateDto) o;
    return Objects.equals(this.id, projectHoursApprovalCreateDto.id) &&
        Objects.equals(this.timestamp, projectHoursApprovalCreateDto.timestamp) &&
        Objects.equals(this.requesterContactID, projectHoursApprovalCreateDto.requesterContactID) &&
        Objects.equals(this.approverContactID, projectHoursApprovalCreateDto.approverContactID) &&
        Objects.equals(this.projectPeriodID, projectHoursApprovalCreateDto.projectPeriodID) &&
        Objects.equals(this.comments, projectHoursApprovalCreateDto.comments);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, timestamp, requesterContactID, approverContactID, projectPeriodID, comments);
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
    sb.append("class ProjectHoursApprovalCreateDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    requesterContactID: ").append(toIndentedString(requesterContactID)).append("\n");
    sb.append("    approverContactID: ").append(toIndentedString(approverContactID)).append("\n");
    sb.append("    projectPeriodID: ").append(toIndentedString(projectPeriodID)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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
    openapiFields.add("requesterContactID");
    openapiFields.add("approverContactID");
    openapiFields.add("projectPeriodID");
    openapiFields.add("comments");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProjectHoursApprovalCreateDto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProjectHoursApprovalCreateDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectHoursApprovalCreateDto is not found in the empty JSON string", ProjectHoursApprovalCreateDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProjectHoursApprovalCreateDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProjectHoursApprovalCreateDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("requesterContactID") != null && !jsonObj.get("requesterContactID").isJsonNull()) && !jsonObj.get("requesterContactID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requesterContactID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requesterContactID").toString()));
      }
      if ((jsonObj.get("approverContactID") != null && !jsonObj.get("approverContactID").isJsonNull()) && !jsonObj.get("approverContactID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `approverContactID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("approverContactID").toString()));
      }
      if ((jsonObj.get("projectPeriodID") != null && !jsonObj.get("projectPeriodID").isJsonNull()) && !jsonObj.get("projectPeriodID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectPeriodID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectPeriodID").toString()));
      }
      if ((jsonObj.get("comments") != null && !jsonObj.get("comments").isJsonNull()) && !jsonObj.get("comments").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comments` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comments").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectHoursApprovalCreateDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectHoursApprovalCreateDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectHoursApprovalCreateDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectHoursApprovalCreateDto.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectHoursApprovalCreateDto>() {
           @Override
           public void write(JsonWriter out, ProjectHoursApprovalCreateDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectHoursApprovalCreateDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ProjectHoursApprovalCreateDto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProjectHoursApprovalCreateDto
   * @throws IOException if the JSON string is invalid with respect to ProjectHoursApprovalCreateDto
   */
  public static ProjectHoursApprovalCreateDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectHoursApprovalCreateDto.class);
  }

  /**
   * Convert an instance of ProjectHoursApprovalCreateDto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

