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
 * ProjectTimeLogCreateDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T15:38:22.045900400-05:00[America/Bogota]", comments = "Generator version: 7.9.0")
public class ProjectTimeLogCreateDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_TIME_SPAN = "timeSpan";
  @SerializedName(SERIALIZED_NAME_TIME_SPAN)
  private String timeSpan;

  public static final String SERIALIZED_NAME_LOG_DATE = "logDate";
  @SerializedName(SERIALIZED_NAME_LOG_DATE)
  private OffsetDateTime logDate;

  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private String comments;

  public static final String SERIALIZED_NAME_PROJECT_TASK_I_D = "projectTaskID";
  @SerializedName(SERIALIZED_NAME_PROJECT_TASK_I_D)
  private String projectTaskID;

  public static final String SERIALIZED_NAME_PROJECT_PERIOD_I_D = "projectPeriodID";
  @SerializedName(SERIALIZED_NAME_PROJECT_PERIOD_I_D)
  private String projectPeriodID;

  /**
   * Gets or Sets projectTimeLogRecordType
   */
  @JsonAdapter(ProjectTimeLogRecordTypeEnum.Adapter.class)
  public enum ProjectTimeLogRecordTypeEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2);

    private Integer value;

    ProjectTimeLogRecordTypeEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProjectTimeLogRecordTypeEnum fromValue(Integer value) {
      for (ProjectTimeLogRecordTypeEnum b : ProjectTimeLogRecordTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ProjectTimeLogRecordTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProjectTimeLogRecordTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProjectTimeLogRecordTypeEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return ProjectTimeLogRecordTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      Integer value = jsonElement.getAsInt();
      ProjectTimeLogRecordTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PROJECT_TIME_LOG_RECORD_TYPE = "projectTimeLogRecordType";
  @SerializedName(SERIALIZED_NAME_PROJECT_TIME_LOG_RECORD_TYPE)
  private ProjectTimeLogRecordTypeEnum projectTimeLogRecordType;

  public static final String SERIALIZED_NAME_PROJECT_I_D = "projectID";
  @SerializedName(SERIALIZED_NAME_PROJECT_I_D)
  private String projectID;

  public ProjectTimeLogCreateDto() {
  }

  public ProjectTimeLogCreateDto(
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



  public ProjectTimeLogCreateDto timeSpan(String timeSpan) {
    this.timeSpan = timeSpan;
    return this;
  }

  /**
   * Get timeSpan
   * @return timeSpan
   */
  @javax.annotation.Nullable
  public String getTimeSpan() {
    return timeSpan;
  }

  public void setTimeSpan(String timeSpan) {
    this.timeSpan = timeSpan;
  }


  public ProjectTimeLogCreateDto logDate(OffsetDateTime logDate) {
    this.logDate = logDate;
    return this;
  }

  /**
   * Get logDate
   * @return logDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getLogDate() {
    return logDate;
  }

  public void setLogDate(OffsetDateTime logDate) {
    this.logDate = logDate;
  }


  public ProjectTimeLogCreateDto comments(String comments) {
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


  public ProjectTimeLogCreateDto projectTaskID(String projectTaskID) {
    this.projectTaskID = projectTaskID;
    return this;
  }

  /**
   * Get projectTaskID
   * @return projectTaskID
   */
  @javax.annotation.Nonnull
  public String getProjectTaskID() {
    return projectTaskID;
  }

  public void setProjectTaskID(String projectTaskID) {
    this.projectTaskID = projectTaskID;
  }


  public ProjectTimeLogCreateDto projectPeriodID(String projectPeriodID) {
    this.projectPeriodID = projectPeriodID;
    return this;
  }

  /**
   * Get projectPeriodID
   * @return projectPeriodID
   */
  @javax.annotation.Nonnull
  public String getProjectPeriodID() {
    return projectPeriodID;
  }

  public void setProjectPeriodID(String projectPeriodID) {
    this.projectPeriodID = projectPeriodID;
  }


  public ProjectTimeLogCreateDto projectTimeLogRecordType(ProjectTimeLogRecordTypeEnum projectTimeLogRecordType) {
    this.projectTimeLogRecordType = projectTimeLogRecordType;
    return this;
  }

  /**
   * Get projectTimeLogRecordType
   * @return projectTimeLogRecordType
   */
  @javax.annotation.Nullable
  public ProjectTimeLogRecordTypeEnum getProjectTimeLogRecordType() {
    return projectTimeLogRecordType;
  }

  public void setProjectTimeLogRecordType(ProjectTimeLogRecordTypeEnum projectTimeLogRecordType) {
    this.projectTimeLogRecordType = projectTimeLogRecordType;
  }


  public ProjectTimeLogCreateDto projectID(String projectID) {
    this.projectID = projectID;
    return this;
  }

  /**
   * Get projectID
   * @return projectID
   */
  @javax.annotation.Nullable
  public String getProjectID() {
    return projectID;
  }

  public void setProjectID(String projectID) {
    this.projectID = projectID;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectTimeLogCreateDto projectTimeLogCreateDto = (ProjectTimeLogCreateDto) o;
    return Objects.equals(this.id, projectTimeLogCreateDto.id) &&
        Objects.equals(this.timestamp, projectTimeLogCreateDto.timestamp) &&
        Objects.equals(this.timeSpan, projectTimeLogCreateDto.timeSpan) &&
        Objects.equals(this.logDate, projectTimeLogCreateDto.logDate) &&
        Objects.equals(this.comments, projectTimeLogCreateDto.comments) &&
        Objects.equals(this.projectTaskID, projectTimeLogCreateDto.projectTaskID) &&
        Objects.equals(this.projectPeriodID, projectTimeLogCreateDto.projectPeriodID) &&
        Objects.equals(this.projectTimeLogRecordType, projectTimeLogCreateDto.projectTimeLogRecordType) &&
        Objects.equals(this.projectID, projectTimeLogCreateDto.projectID);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, timestamp, timeSpan, logDate, comments, projectTaskID, projectPeriodID, projectTimeLogRecordType, projectID);
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
    sb.append("class ProjectTimeLogCreateDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    timeSpan: ").append(toIndentedString(timeSpan)).append("\n");
    sb.append("    logDate: ").append(toIndentedString(logDate)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    projectTaskID: ").append(toIndentedString(projectTaskID)).append("\n");
    sb.append("    projectPeriodID: ").append(toIndentedString(projectPeriodID)).append("\n");
    sb.append("    projectTimeLogRecordType: ").append(toIndentedString(projectTimeLogRecordType)).append("\n");
    sb.append("    projectID: ").append(toIndentedString(projectID)).append("\n");
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
    openapiFields.add("timeSpan");
    openapiFields.add("logDate");
    openapiFields.add("comments");
    openapiFields.add("projectTaskID");
    openapiFields.add("projectPeriodID");
    openapiFields.add("projectTimeLogRecordType");
    openapiFields.add("projectID");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("projectTaskID");
    openapiRequiredFields.add("projectPeriodID");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProjectTimeLogCreateDto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProjectTimeLogCreateDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectTimeLogCreateDto is not found in the empty JSON string", ProjectTimeLogCreateDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProjectTimeLogCreateDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProjectTimeLogCreateDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProjectTimeLogCreateDto.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("timeSpan") != null && !jsonObj.get("timeSpan").isJsonNull()) && !jsonObj.get("timeSpan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeSpan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeSpan").toString()));
      }
      if ((jsonObj.get("comments") != null && !jsonObj.get("comments").isJsonNull()) && !jsonObj.get("comments").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comments` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comments").toString()));
      }
      if (!jsonObj.get("projectTaskID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectTaskID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectTaskID").toString()));
      }
      if (!jsonObj.get("projectPeriodID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectPeriodID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectPeriodID").toString()));
      }
      // validate the optional field `projectTimeLogRecordType`
      if (jsonObj.get("projectTimeLogRecordType") != null && !jsonObj.get("projectTimeLogRecordType").isJsonNull()) {
        ProjectTimeLogRecordTypeEnum.validateJsonElement(jsonObj.get("projectTimeLogRecordType"));
      }
      if ((jsonObj.get("projectID") != null && !jsonObj.get("projectID").isJsonNull()) && !jsonObj.get("projectID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectID").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectTimeLogCreateDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectTimeLogCreateDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectTimeLogCreateDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectTimeLogCreateDto.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectTimeLogCreateDto>() {
           @Override
           public void write(JsonWriter out, ProjectTimeLogCreateDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectTimeLogCreateDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ProjectTimeLogCreateDto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProjectTimeLogCreateDto
   * @throws IOException if the JSON string is invalid with respect to ProjectTimeLogCreateDto
   */
  public static ProjectTimeLogCreateDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectTimeLogCreateDto.class);
  }

  /**
   * Convert an instance of ProjectTimeLogCreateDto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

