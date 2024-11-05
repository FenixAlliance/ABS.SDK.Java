/*
 * GlobeService
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.CountryStateDto;
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
 * CountryStateDtoListEnvelope
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T15:36:00.095262200-05:00[America/Bogota]", comments = "Generator version: 7.9.0")
public class CountryStateDtoListEnvelope {
  public static final String SERIALIZED_NAME_IS_SUCCESS = "isSuccess";
  @SerializedName(SERIALIZED_NAME_IS_SUCCESS)
  private Boolean isSuccess;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "errorMessage";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage;

  public static final String SERIALIZED_NAME_CORRELATION_ID = "correlationId";
  @SerializedName(SERIALIZED_NAME_CORRELATION_ID)
  private String correlationId;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_ACTIVITY_ID = "activityId";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_ID)
  private String activityId;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private List<CountryStateDto> result;

  public CountryStateDtoListEnvelope() {
  }

  public CountryStateDtoListEnvelope(
     Boolean isSuccess, 
     OffsetDateTime timestamp, 
     String activityId
  ) {
    this();
    this.isSuccess = isSuccess;
    this.timestamp = timestamp;
    this.activityId = activityId;
  }

  /**
   * Get isSuccess
   * @return isSuccess
   */
  @javax.annotation.Nullable
  public Boolean getIsSuccess() {
    return isSuccess;
  }



  public CountryStateDtoListEnvelope errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Get errorMessage
   * @return errorMessage
   */
  @javax.annotation.Nullable
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public CountryStateDtoListEnvelope correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

  /**
   * Get correlationId
   * @return correlationId
   */
  @javax.annotation.Nullable
  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }


  /**
   * Get timestamp
   * @return timestamp
   */
  @javax.annotation.Nullable
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }



  /**
   * Get activityId
   * @return activityId
   */
  @javax.annotation.Nullable
  public String getActivityId() {
    return activityId;
  }



  public CountryStateDtoListEnvelope result(List<CountryStateDto> result) {
    this.result = result;
    return this;
  }

  public CountryStateDtoListEnvelope addResultItem(CountryStateDto resultItem) {
    if (this.result == null) {
      this.result = new ArrayList<>();
    }
    this.result.add(resultItem);
    return this;
  }

  /**
   * Get result
   * @return result
   */
  @javax.annotation.Nullable
  public List<CountryStateDto> getResult() {
    return result;
  }

  public void setResult(List<CountryStateDto> result) {
    this.result = result;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CountryStateDtoListEnvelope countryStateDtoListEnvelope = (CountryStateDtoListEnvelope) o;
    return Objects.equals(this.isSuccess, countryStateDtoListEnvelope.isSuccess) &&
        Objects.equals(this.errorMessage, countryStateDtoListEnvelope.errorMessage) &&
        Objects.equals(this.correlationId, countryStateDtoListEnvelope.correlationId) &&
        Objects.equals(this.timestamp, countryStateDtoListEnvelope.timestamp) &&
        Objects.equals(this.activityId, countryStateDtoListEnvelope.activityId) &&
        Objects.equals(this.result, countryStateDtoListEnvelope.result);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(isSuccess, errorMessage, correlationId, timestamp, activityId, result);
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
    sb.append("class CountryStateDtoListEnvelope {\n");
    sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
    openapiFields.add("isSuccess");
    openapiFields.add("errorMessage");
    openapiFields.add("correlationId");
    openapiFields.add("timestamp");
    openapiFields.add("activityId");
    openapiFields.add("result");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CountryStateDtoListEnvelope
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CountryStateDtoListEnvelope.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CountryStateDtoListEnvelope is not found in the empty JSON string", CountryStateDtoListEnvelope.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CountryStateDtoListEnvelope.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CountryStateDtoListEnvelope` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("errorMessage") != null && !jsonObj.get("errorMessage").isJsonNull()) && !jsonObj.get("errorMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorMessage").toString()));
      }
      if ((jsonObj.get("correlationId") != null && !jsonObj.get("correlationId").isJsonNull()) && !jsonObj.get("correlationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `correlationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("correlationId").toString()));
      }
      if ((jsonObj.get("activityId") != null && !jsonObj.get("activityId").isJsonNull()) && !jsonObj.get("activityId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activityId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activityId").toString()));
      }
      if (jsonObj.get("result") != null && !jsonObj.get("result").isJsonNull()) {
        JsonArray jsonArrayresult = jsonObj.getAsJsonArray("result");
        if (jsonArrayresult != null) {
          // ensure the json data is an array
          if (!jsonObj.get("result").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `result` to be an array in the JSON string but got `%s`", jsonObj.get("result").toString()));
          }

          // validate the optional field `result` (array)
          for (int i = 0; i < jsonArrayresult.size(); i++) {
            CountryStateDto.validateJsonElement(jsonArrayresult.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CountryStateDtoListEnvelope.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CountryStateDtoListEnvelope' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CountryStateDtoListEnvelope> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CountryStateDtoListEnvelope.class));

       return (TypeAdapter<T>) new TypeAdapter<CountryStateDtoListEnvelope>() {
           @Override
           public void write(JsonWriter out, CountryStateDtoListEnvelope value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CountryStateDtoListEnvelope read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CountryStateDtoListEnvelope given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CountryStateDtoListEnvelope
   * @throws IOException if the JSON string is invalid with respect to CountryStateDtoListEnvelope
   */
  public static CountryStateDtoListEnvelope fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CountryStateDtoListEnvelope.class);
  }

  /**
   * Convert an instance of CountryStateDtoListEnvelope to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

