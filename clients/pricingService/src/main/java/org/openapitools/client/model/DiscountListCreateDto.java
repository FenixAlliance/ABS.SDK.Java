/*
 * PricingService
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
 * DiscountListCreateDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T15:37:07.573626400-05:00[America/Bogota]", comments = "Generator version: 7.9.0")
public class DiscountListCreateDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CURRENCY_ID = "currencyId";
  @SerializedName(SERIALIZED_NAME_CURRENCY_ID)
  private String currencyId;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_ENROLMENT_ID = "enrolmentId";
  @SerializedName(SERIALIZED_NAME_ENROLMENT_ID)
  private String enrolmentId;

  public DiscountListCreateDto() {
  }

  public DiscountListCreateDto(
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



  public DiscountListCreateDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public DiscountListCreateDto currencyId(String currencyId) {
    this.currencyId = currencyId;
    return this;
  }

  /**
   * Get currencyId
   * @return currencyId
   */
  @javax.annotation.Nullable
  public String getCurrencyId() {
    return currencyId;
  }

  public void setCurrencyId(String currencyId) {
    this.currencyId = currencyId;
  }


  public DiscountListCreateDto tenantId(String tenantId) {
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


  public DiscountListCreateDto enrolmentId(String enrolmentId) {
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
    DiscountListCreateDto discountListCreateDto = (DiscountListCreateDto) o;
    return Objects.equals(this.id, discountListCreateDto.id) &&
        Objects.equals(this.timestamp, discountListCreateDto.timestamp) &&
        Objects.equals(this.name, discountListCreateDto.name) &&
        Objects.equals(this.currencyId, discountListCreateDto.currencyId) &&
        Objects.equals(this.tenantId, discountListCreateDto.tenantId) &&
        Objects.equals(this.enrolmentId, discountListCreateDto.enrolmentId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, timestamp, name, currencyId, tenantId, enrolmentId);
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
    sb.append("class DiscountListCreateDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("currencyId");
    openapiFields.add("tenantId");
    openapiFields.add("enrolmentId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DiscountListCreateDto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DiscountListCreateDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DiscountListCreateDto is not found in the empty JSON string", DiscountListCreateDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DiscountListCreateDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DiscountListCreateDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("currencyId") != null && !jsonObj.get("currencyId").isJsonNull()) && !jsonObj.get("currencyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyId").toString()));
      }
      if ((jsonObj.get("tenantId") != null && !jsonObj.get("tenantId").isJsonNull()) && !jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      if ((jsonObj.get("enrolmentId") != null && !jsonObj.get("enrolmentId").isJsonNull()) && !jsonObj.get("enrolmentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enrolmentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enrolmentId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DiscountListCreateDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DiscountListCreateDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DiscountListCreateDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DiscountListCreateDto.class));

       return (TypeAdapter<T>) new TypeAdapter<DiscountListCreateDto>() {
           @Override
           public void write(JsonWriter out, DiscountListCreateDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DiscountListCreateDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DiscountListCreateDto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DiscountListCreateDto
   * @throws IOException if the JSON string is invalid with respect to DiscountListCreateDto
   */
  public static DiscountListCreateDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DiscountListCreateDto.class);
  }

  /**
   * Convert an instance of DiscountListCreateDto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

