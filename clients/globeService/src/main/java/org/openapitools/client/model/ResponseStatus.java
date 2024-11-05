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
import java.util.Arrays;
import org.openapitools.client.model.Error;
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
 * ResponseStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T15:36:00.095262200-05:00[America/Bogota]", comments = "Generator version: 7.9.0")
public class ResponseStatus {
  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private Error error;

  public static final String SERIALIZED_NAME_CORRELATION_I_D = "correlationID";
  @SerializedName(SERIALIZED_NAME_CORRELATION_I_D)
  private String correlationID;

  public static final String SERIALIZED_NAME_UTC_TIMESTAMP = "utcTimestamp";
  @SerializedName(SERIALIZED_NAME_UTC_TIMESTAMP)
  private OffsetDateTime utcTimestamp;

  public ResponseStatus() {
  }

  public ResponseStatus success(Boolean success) {
    this.success = success;
    return this;
  }

  /**
   * Get success
   * @return success
   */
  @javax.annotation.Nullable
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }


  public ResponseStatus error(Error error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
   */
  @javax.annotation.Nullable
  public Error getError() {
    return error;
  }

  public void setError(Error error) {
    this.error = error;
  }


  public ResponseStatus correlationID(String correlationID) {
    this.correlationID = correlationID;
    return this;
  }

  /**
   * Get correlationID
   * @return correlationID
   */
  @javax.annotation.Nullable
  public String getCorrelationID() {
    return correlationID;
  }

  public void setCorrelationID(String correlationID) {
    this.correlationID = correlationID;
  }


  public ResponseStatus utcTimestamp(OffsetDateTime utcTimestamp) {
    this.utcTimestamp = utcTimestamp;
    return this;
  }

  /**
   * Get utcTimestamp
   * @return utcTimestamp
   */
  @javax.annotation.Nullable
  public OffsetDateTime getUtcTimestamp() {
    return utcTimestamp;
  }

  public void setUtcTimestamp(OffsetDateTime utcTimestamp) {
    this.utcTimestamp = utcTimestamp;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseStatus responseStatus = (ResponseStatus) o;
    return Objects.equals(this.success, responseStatus.success) &&
        Objects.equals(this.error, responseStatus.error) &&
        Objects.equals(this.correlationID, responseStatus.correlationID) &&
        Objects.equals(this.utcTimestamp, responseStatus.utcTimestamp);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, error, correlationID, utcTimestamp);
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
    sb.append("class ResponseStatus {\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    correlationID: ").append(toIndentedString(correlationID)).append("\n");
    sb.append("    utcTimestamp: ").append(toIndentedString(utcTimestamp)).append("\n");
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
    openapiFields.add("success");
    openapiFields.add("error");
    openapiFields.add("correlationID");
    openapiFields.add("utcTimestamp");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ResponseStatus
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResponseStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResponseStatus is not found in the empty JSON string", ResponseStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ResponseStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResponseStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `error`
      if (jsonObj.get("error") != null && !jsonObj.get("error").isJsonNull()) {
        Error.validateJsonElement(jsonObj.get("error"));
      }
      if ((jsonObj.get("correlationID") != null && !jsonObj.get("correlationID").isJsonNull()) && !jsonObj.get("correlationID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `correlationID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("correlationID").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResponseStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResponseStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResponseStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResponseStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<ResponseStatus>() {
           @Override
           public void write(JsonWriter out, ResponseStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResponseStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ResponseStatus given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ResponseStatus
   * @throws IOException if the JSON string is invalid with respect to ResponseStatus
   */
  public static ResponseStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResponseStatus.class);
  }

  /**
   * Convert an instance of ResponseStatus to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
