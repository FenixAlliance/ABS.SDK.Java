/*
 * ProjectsService
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
 * ProjectPeriodCreateDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T15:37:14.905059500-05:00[America/Bogota]", comments = "Generator version: 7.9.0")
public class ProjectPeriodCreateDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_PERIOD_START_DATE = "periodStartDate";
  @SerializedName(SERIALIZED_NAME_PERIOD_START_DATE)
  private OffsetDateTime periodStartDate;

  public static final String SERIALIZED_NAME_PERIOD_END_DATE = "periodEndDate";
  @SerializedName(SERIALIZED_NAME_PERIOD_END_DATE)
  private OffsetDateTime periodEndDate;

  public static final String SERIALIZED_NAME_PROJECT_I_D = "projectID";
  @SerializedName(SERIALIZED_NAME_PROJECT_I_D)
  private String projectID;

  public ProjectPeriodCreateDto() {
  }

  public ProjectPeriodCreateDto(
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



  public ProjectPeriodCreateDto periodStartDate(OffsetDateTime periodStartDate) {
    this.periodStartDate = periodStartDate;
    return this;
  }

  /**
   * Get periodStartDate
   * @return periodStartDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getPeriodStartDate() {
    return periodStartDate;
  }

  public void setPeriodStartDate(OffsetDateTime periodStartDate) {
    this.periodStartDate = periodStartDate;
  }


  public ProjectPeriodCreateDto periodEndDate(OffsetDateTime periodEndDate) {
    this.periodEndDate = periodEndDate;
    return this;
  }

  /**
   * Get periodEndDate
   * @return periodEndDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getPeriodEndDate() {
    return periodEndDate;
  }

  public void setPeriodEndDate(OffsetDateTime periodEndDate) {
    this.periodEndDate = periodEndDate;
  }


  public ProjectPeriodCreateDto projectID(String projectID) {
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
    ProjectPeriodCreateDto projectPeriodCreateDto = (ProjectPeriodCreateDto) o;
    return Objects.equals(this.id, projectPeriodCreateDto.id) &&
        Objects.equals(this.timestamp, projectPeriodCreateDto.timestamp) &&
        Objects.equals(this.periodStartDate, projectPeriodCreateDto.periodStartDate) &&
        Objects.equals(this.periodEndDate, projectPeriodCreateDto.periodEndDate) &&
        Objects.equals(this.projectID, projectPeriodCreateDto.projectID);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, timestamp, periodStartDate, periodEndDate, projectID);
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
    sb.append("class ProjectPeriodCreateDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    periodStartDate: ").append(toIndentedString(periodStartDate)).append("\n");
    sb.append("    periodEndDate: ").append(toIndentedString(periodEndDate)).append("\n");
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
    openapiFields.add("periodStartDate");
    openapiFields.add("periodEndDate");
    openapiFields.add("projectID");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProjectPeriodCreateDto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProjectPeriodCreateDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectPeriodCreateDto is not found in the empty JSON string", ProjectPeriodCreateDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProjectPeriodCreateDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProjectPeriodCreateDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("projectID") != null && !jsonObj.get("projectID").isJsonNull()) && !jsonObj.get("projectID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectID").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectPeriodCreateDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectPeriodCreateDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectPeriodCreateDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectPeriodCreateDto.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectPeriodCreateDto>() {
           @Override
           public void write(JsonWriter out, ProjectPeriodCreateDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectPeriodCreateDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ProjectPeriodCreateDto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProjectPeriodCreateDto
   * @throws IOException if the JSON string is invalid with respect to ProjectPeriodCreateDto
   */
  public static ProjectPeriodCreateDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectPeriodCreateDto.class);
  }

  /**
   * Convert an instance of ProjectPeriodCreateDto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

