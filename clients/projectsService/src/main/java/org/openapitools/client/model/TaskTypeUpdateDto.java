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
 * TaskTypeUpdateDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T15:37:14.905059500-05:00[America/Bogota]", comments = "Generator version: 7.9.0")
public class TaskTypeUpdateDto {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DISPLAY_IN_TIME_TRACKER = "displayInTimeTracker";
  @SerializedName(SERIALIZED_NAME_DISPLAY_IN_TIME_TRACKER)
  private Boolean displayInTimeTracker;

  public static final String SERIALIZED_NAME_REQUIRES_DESCRIPTION = "requiresDescription";
  @SerializedName(SERIALIZED_NAME_REQUIRES_DESCRIPTION)
  private Boolean requiresDescription;

  public TaskTypeUpdateDto() {
  }

  public TaskTypeUpdateDto title(String title) {
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


  public TaskTypeUpdateDto displayInTimeTracker(Boolean displayInTimeTracker) {
    this.displayInTimeTracker = displayInTimeTracker;
    return this;
  }

  /**
   * Get displayInTimeTracker
   * @return displayInTimeTracker
   */
  @javax.annotation.Nullable
  public Boolean getDisplayInTimeTracker() {
    return displayInTimeTracker;
  }

  public void setDisplayInTimeTracker(Boolean displayInTimeTracker) {
    this.displayInTimeTracker = displayInTimeTracker;
  }


  public TaskTypeUpdateDto requiresDescription(Boolean requiresDescription) {
    this.requiresDescription = requiresDescription;
    return this;
  }

  /**
   * Get requiresDescription
   * @return requiresDescription
   */
  @javax.annotation.Nullable
  public Boolean getRequiresDescription() {
    return requiresDescription;
  }

  public void setRequiresDescription(Boolean requiresDescription) {
    this.requiresDescription = requiresDescription;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskTypeUpdateDto taskTypeUpdateDto = (TaskTypeUpdateDto) o;
    return Objects.equals(this.title, taskTypeUpdateDto.title) &&
        Objects.equals(this.displayInTimeTracker, taskTypeUpdateDto.displayInTimeTracker) &&
        Objects.equals(this.requiresDescription, taskTypeUpdateDto.requiresDescription);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, displayInTimeTracker, requiresDescription);
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
    sb.append("class TaskTypeUpdateDto {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    displayInTimeTracker: ").append(toIndentedString(displayInTimeTracker)).append("\n");
    sb.append("    requiresDescription: ").append(toIndentedString(requiresDescription)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("displayInTimeTracker");
    openapiFields.add("requiresDescription");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TaskTypeUpdateDto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TaskTypeUpdateDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TaskTypeUpdateDto is not found in the empty JSON string", TaskTypeUpdateDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TaskTypeUpdateDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TaskTypeUpdateDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TaskTypeUpdateDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TaskTypeUpdateDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TaskTypeUpdateDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TaskTypeUpdateDto.class));

       return (TypeAdapter<T>) new TypeAdapter<TaskTypeUpdateDto>() {
           @Override
           public void write(JsonWriter out, TaskTypeUpdateDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TaskTypeUpdateDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TaskTypeUpdateDto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TaskTypeUpdateDto
   * @throws IOException if the JSON string is invalid with respect to TaskTypeUpdateDto
   */
  public static TaskTypeUpdateDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TaskTypeUpdateDto.class);
  }

  /**
   * Convert an instance of TaskTypeUpdateDto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
