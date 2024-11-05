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
 * ProjectTimeLogDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T15:38:22.045900400-05:00[America/Bogota]", comments = "Generator version: 7.9.0")
public class ProjectTimeLogDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private String projectId;

  public static final String SERIALIZED_NAME_PROJECT_TASK_ID = "projectTaskId";
  @SerializedName(SERIALIZED_NAME_PROJECT_TASK_ID)
  private String projectTaskId;

  public static final String SERIALIZED_NAME_TASK_CATEGORY_ID = "taskCategoryId";
  @SerializedName(SERIALIZED_NAME_TASK_CATEGORY_ID)
  private String taskCategoryId;

  public static final String SERIALIZED_NAME_PROJECT_PERIOD_ID = "projectPeriodId";
  @SerializedName(SERIALIZED_NAME_PROJECT_PERIOD_ID)
  private String projectPeriodId;

  public static final String SERIALIZED_NAME_RESPONSIBLE_CONTACT_ID = "responsibleContactId";
  @SerializedName(SERIALIZED_NAME_RESPONSIBLE_CONTACT_ID)
  private String responsibleContactId;

  public static final String SERIALIZED_NAME_CREATOR_CONTACT_ID = "creatorContactId";
  @SerializedName(SERIALIZED_NAME_CREATOR_CONTACT_ID)
  private String creatorContactId;

  /**
   * Gets or Sets recordType
   */
  @JsonAdapter(RecordTypeEnum.Adapter.class)
  public enum RecordTypeEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2);

    private Integer value;

    RecordTypeEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RecordTypeEnum fromValue(Integer value) {
      for (RecordTypeEnum b : RecordTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RecordTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RecordTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RecordTypeEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return RecordTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      Integer value = jsonElement.getAsInt();
      RecordTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_RECORD_TYPE = "recordType";
  @SerializedName(SERIALIZED_NAME_RECORD_TYPE)
  private RecordTypeEnum recordType;

  public static final String SERIALIZED_NAME_TIME_STAMP = "timeStamp";
  @SerializedName(SERIALIZED_NAME_TIME_STAMP)
  private OffsetDateTime timeStamp;

  public static final String SERIALIZED_NAME_TIME_SPAN = "timeSpan";
  @SerializedName(SERIALIZED_NAME_TIME_SPAN)
  private String timeSpan;

  public static final String SERIALIZED_NAME_LOG_DATE = "logDate";
  @SerializedName(SERIALIZED_NAME_LOG_DATE)
  private OffsetDateTime logDate;

  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private String comments;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public ProjectTimeLogDto() {
  }

  public ProjectTimeLogDto id(String id) {
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


  public ProjectTimeLogDto timestamp(OffsetDateTime timestamp) {
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


  public ProjectTimeLogDto projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Get projectId
   * @return projectId
   */
  @javax.annotation.Nullable
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }


  public ProjectTimeLogDto projectTaskId(String projectTaskId) {
    this.projectTaskId = projectTaskId;
    return this;
  }

  /**
   * Get projectTaskId
   * @return projectTaskId
   */
  @javax.annotation.Nullable
  public String getProjectTaskId() {
    return projectTaskId;
  }

  public void setProjectTaskId(String projectTaskId) {
    this.projectTaskId = projectTaskId;
  }


  public ProjectTimeLogDto taskCategoryId(String taskCategoryId) {
    this.taskCategoryId = taskCategoryId;
    return this;
  }

  /**
   * Get taskCategoryId
   * @return taskCategoryId
   */
  @javax.annotation.Nullable
  public String getTaskCategoryId() {
    return taskCategoryId;
  }

  public void setTaskCategoryId(String taskCategoryId) {
    this.taskCategoryId = taskCategoryId;
  }


  public ProjectTimeLogDto projectPeriodId(String projectPeriodId) {
    this.projectPeriodId = projectPeriodId;
    return this;
  }

  /**
   * Get projectPeriodId
   * @return projectPeriodId
   */
  @javax.annotation.Nullable
  public String getProjectPeriodId() {
    return projectPeriodId;
  }

  public void setProjectPeriodId(String projectPeriodId) {
    this.projectPeriodId = projectPeriodId;
  }


  public ProjectTimeLogDto responsibleContactId(String responsibleContactId) {
    this.responsibleContactId = responsibleContactId;
    return this;
  }

  /**
   * Get responsibleContactId
   * @return responsibleContactId
   */
  @javax.annotation.Nullable
  public String getResponsibleContactId() {
    return responsibleContactId;
  }

  public void setResponsibleContactId(String responsibleContactId) {
    this.responsibleContactId = responsibleContactId;
  }


  public ProjectTimeLogDto creatorContactId(String creatorContactId) {
    this.creatorContactId = creatorContactId;
    return this;
  }

  /**
   * Get creatorContactId
   * @return creatorContactId
   */
  @javax.annotation.Nullable
  public String getCreatorContactId() {
    return creatorContactId;
  }

  public void setCreatorContactId(String creatorContactId) {
    this.creatorContactId = creatorContactId;
  }


  public ProjectTimeLogDto recordType(RecordTypeEnum recordType) {
    this.recordType = recordType;
    return this;
  }

  /**
   * Get recordType
   * @return recordType
   */
  @javax.annotation.Nullable
  public RecordTypeEnum getRecordType() {
    return recordType;
  }

  public void setRecordType(RecordTypeEnum recordType) {
    this.recordType = recordType;
  }


  public ProjectTimeLogDto timeStamp(OffsetDateTime timeStamp) {
    this.timeStamp = timeStamp;
    return this;
  }

  /**
   * Get timeStamp
   * @return timeStamp
   */
  @javax.annotation.Nullable
  public OffsetDateTime getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(OffsetDateTime timeStamp) {
    this.timeStamp = timeStamp;
  }


  public ProjectTimeLogDto timeSpan(String timeSpan) {
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


  public ProjectTimeLogDto logDate(OffsetDateTime logDate) {
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


  public ProjectTimeLogDto comments(String comments) {
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


  public ProjectTimeLogDto type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectTimeLogDto projectTimeLogDto = (ProjectTimeLogDto) o;
    return Objects.equals(this.id, projectTimeLogDto.id) &&
        Objects.equals(this.timestamp, projectTimeLogDto.timestamp) &&
        Objects.equals(this.projectId, projectTimeLogDto.projectId) &&
        Objects.equals(this.projectTaskId, projectTimeLogDto.projectTaskId) &&
        Objects.equals(this.taskCategoryId, projectTimeLogDto.taskCategoryId) &&
        Objects.equals(this.projectPeriodId, projectTimeLogDto.projectPeriodId) &&
        Objects.equals(this.responsibleContactId, projectTimeLogDto.responsibleContactId) &&
        Objects.equals(this.creatorContactId, projectTimeLogDto.creatorContactId) &&
        Objects.equals(this.recordType, projectTimeLogDto.recordType) &&
        Objects.equals(this.timeStamp, projectTimeLogDto.timeStamp) &&
        Objects.equals(this.timeSpan, projectTimeLogDto.timeSpan) &&
        Objects.equals(this.logDate, projectTimeLogDto.logDate) &&
        Objects.equals(this.comments, projectTimeLogDto.comments) &&
        Objects.equals(this.type, projectTimeLogDto.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, timestamp, projectId, projectTaskId, taskCategoryId, projectPeriodId, responsibleContactId, creatorContactId, recordType, timeStamp, timeSpan, logDate, comments, type);
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
    sb.append("class ProjectTimeLogDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    projectTaskId: ").append(toIndentedString(projectTaskId)).append("\n");
    sb.append("    taskCategoryId: ").append(toIndentedString(taskCategoryId)).append("\n");
    sb.append("    projectPeriodId: ").append(toIndentedString(projectPeriodId)).append("\n");
    sb.append("    responsibleContactId: ").append(toIndentedString(responsibleContactId)).append("\n");
    sb.append("    creatorContactId: ").append(toIndentedString(creatorContactId)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("    timeSpan: ").append(toIndentedString(timeSpan)).append("\n");
    sb.append("    logDate: ").append(toIndentedString(logDate)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("projectId");
    openapiFields.add("projectTaskId");
    openapiFields.add("taskCategoryId");
    openapiFields.add("projectPeriodId");
    openapiFields.add("responsibleContactId");
    openapiFields.add("creatorContactId");
    openapiFields.add("recordType");
    openapiFields.add("timeStamp");
    openapiFields.add("timeSpan");
    openapiFields.add("logDate");
    openapiFields.add("comments");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProjectTimeLogDto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProjectTimeLogDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectTimeLogDto is not found in the empty JSON string", ProjectTimeLogDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProjectTimeLogDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProjectTimeLogDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("projectId") != null && !jsonObj.get("projectId").isJsonNull()) && !jsonObj.get("projectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectId").toString()));
      }
      if ((jsonObj.get("projectTaskId") != null && !jsonObj.get("projectTaskId").isJsonNull()) && !jsonObj.get("projectTaskId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectTaskId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectTaskId").toString()));
      }
      if ((jsonObj.get("taskCategoryId") != null && !jsonObj.get("taskCategoryId").isJsonNull()) && !jsonObj.get("taskCategoryId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `taskCategoryId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taskCategoryId").toString()));
      }
      if ((jsonObj.get("projectPeriodId") != null && !jsonObj.get("projectPeriodId").isJsonNull()) && !jsonObj.get("projectPeriodId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectPeriodId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectPeriodId").toString()));
      }
      if ((jsonObj.get("responsibleContactId") != null && !jsonObj.get("responsibleContactId").isJsonNull()) && !jsonObj.get("responsibleContactId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `responsibleContactId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("responsibleContactId").toString()));
      }
      if ((jsonObj.get("creatorContactId") != null && !jsonObj.get("creatorContactId").isJsonNull()) && !jsonObj.get("creatorContactId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creatorContactId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creatorContactId").toString()));
      }
      // validate the optional field `recordType`
      if (jsonObj.get("recordType") != null && !jsonObj.get("recordType").isJsonNull()) {
        RecordTypeEnum.validateJsonElement(jsonObj.get("recordType"));
      }
      if ((jsonObj.get("timeSpan") != null && !jsonObj.get("timeSpan").isJsonNull()) && !jsonObj.get("timeSpan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeSpan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeSpan").toString()));
      }
      if ((jsonObj.get("comments") != null && !jsonObj.get("comments").isJsonNull()) && !jsonObj.get("comments").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comments` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comments").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectTimeLogDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectTimeLogDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectTimeLogDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectTimeLogDto.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectTimeLogDto>() {
           @Override
           public void write(JsonWriter out, ProjectTimeLogDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectTimeLogDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ProjectTimeLogDto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProjectTimeLogDto
   * @throws IOException if the JSON string is invalid with respect to ProjectTimeLogDto
   */
  public static ProjectTimeLogDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectTimeLogDto.class);
  }

  /**
   * Convert an instance of ProjectTimeLogDto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

