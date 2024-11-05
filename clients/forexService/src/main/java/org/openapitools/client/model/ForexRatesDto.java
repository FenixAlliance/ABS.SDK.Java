/*
 * ForexService
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
import java.util.HashMap;
import java.util.Map;
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
 * ForexRatesDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T15:35:53.717605400-05:00[America/Bogota]", comments = "Generator version: 7.9.0")
public class ForexRatesDto {
  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date;

  public static final String SERIALIZED_NAME_BASE = "base";
  @SerializedName(SERIALIZED_NAME_BASE)
  private String base;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private Long timestamp;

  public static final String SERIALIZED_NAME_REQUEST_TIMESTAMP = "requestTimestamp";
  @SerializedName(SERIALIZED_NAME_REQUEST_TIMESTAMP)
  private OffsetDateTime requestTimestamp;

  public static final String SERIALIZED_NAME_RATES = "rates";
  @SerializedName(SERIALIZED_NAME_RATES)
  private Map<String, Double> rates;

  public ForexRatesDto() {
  }

  public ForexRatesDto success(Boolean success) {
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


  public ForexRatesDto date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
   */
  @javax.annotation.Nullable
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


  public ForexRatesDto base(String base) {
    this.base = base;
    return this;
  }

  /**
   * Get base
   * @return base
   */
  @javax.annotation.Nullable
  public String getBase() {
    return base;
  }

  public void setBase(String base) {
    this.base = base;
  }


  public ForexRatesDto timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
   */
  @javax.annotation.Nullable
  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }


  public ForexRatesDto requestTimestamp(OffsetDateTime requestTimestamp) {
    this.requestTimestamp = requestTimestamp;
    return this;
  }

  /**
   * Get requestTimestamp
   * @return requestTimestamp
   */
  @javax.annotation.Nullable
  public OffsetDateTime getRequestTimestamp() {
    return requestTimestamp;
  }

  public void setRequestTimestamp(OffsetDateTime requestTimestamp) {
    this.requestTimestamp = requestTimestamp;
  }


  public ForexRatesDto rates(Map<String, Double> rates) {
    this.rates = rates;
    return this;
  }

  public ForexRatesDto putRatesItem(String key, Double ratesItem) {
    if (this.rates == null) {
      this.rates = new HashMap<>();
    }
    this.rates.put(key, ratesItem);
    return this;
  }

  /**
   * Get rates
   * @return rates
   */
  @javax.annotation.Nullable
  public Map<String, Double> getRates() {
    return rates;
  }

  public void setRates(Map<String, Double> rates) {
    this.rates = rates;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForexRatesDto forexRatesDto = (ForexRatesDto) o;
    return Objects.equals(this.success, forexRatesDto.success) &&
        Objects.equals(this.date, forexRatesDto.date) &&
        Objects.equals(this.base, forexRatesDto.base) &&
        Objects.equals(this.timestamp, forexRatesDto.timestamp) &&
        Objects.equals(this.requestTimestamp, forexRatesDto.requestTimestamp) &&
        Objects.equals(this.rates, forexRatesDto.rates);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, date, base, timestamp, requestTimestamp, rates);
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
    sb.append("class ForexRatesDto {\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    requestTimestamp: ").append(toIndentedString(requestTimestamp)).append("\n");
    sb.append("    rates: ").append(toIndentedString(rates)).append("\n");
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
    openapiFields.add("date");
    openapiFields.add("base");
    openapiFields.add("timestamp");
    openapiFields.add("requestTimestamp");
    openapiFields.add("rates");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ForexRatesDto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ForexRatesDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ForexRatesDto is not found in the empty JSON string", ForexRatesDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ForexRatesDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ForexRatesDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("date") != null && !jsonObj.get("date").isJsonNull()) && !jsonObj.get("date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date").toString()));
      }
      if ((jsonObj.get("base") != null && !jsonObj.get("base").isJsonNull()) && !jsonObj.get("base").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `base` to be a primitive type in the JSON string but got `%s`", jsonObj.get("base").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ForexRatesDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ForexRatesDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ForexRatesDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ForexRatesDto.class));

       return (TypeAdapter<T>) new TypeAdapter<ForexRatesDto>() {
           @Override
           public void write(JsonWriter out, ForexRatesDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ForexRatesDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ForexRatesDto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ForexRatesDto
   * @throws IOException if the JSON string is invalid with respect to ForexRatesDto
   */
  public static ForexRatesDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ForexRatesDto.class);
  }

  /**
   * Convert an instance of ForexRatesDto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
