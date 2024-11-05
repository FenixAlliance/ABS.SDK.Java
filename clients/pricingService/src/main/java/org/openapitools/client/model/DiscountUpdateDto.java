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
 * DiscountUpdateDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T15:37:07.573626400-05:00[America/Bogota]", comments = "Generator version: 7.9.0")
public class DiscountUpdateDto {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_BEGIN_QUANTITY = "beginQuantity";
  @SerializedName(SERIALIZED_NAME_BEGIN_QUANTITY)
  private Double beginQuantity;

  public static final String SERIALIZED_NAME_END_QUANTITY = "endQuantity";
  @SerializedName(SERIALIZED_NAME_END_QUANTITY)
  private Double endQuantity;

  public static final String SERIALIZED_NAME_PERCENT = "percent";
  @SerializedName(SERIALIZED_NAME_PERCENT)
  private Double percent;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Double value;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_ENROLMENT_ID = "enrolmentId";
  @SerializedName(SERIALIZED_NAME_ENROLMENT_ID)
  private String enrolmentId;

  public static final String SERIALIZED_NAME_DISCOUNT_LIST_ID = "discountListId";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_LIST_ID)
  private String discountListId;

  public DiscountUpdateDto() {
  }

  public DiscountUpdateDto description(String description) {
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


  public DiscountUpdateDto beginQuantity(Double beginQuantity) {
    this.beginQuantity = beginQuantity;
    return this;
  }

  /**
   * Get beginQuantity
   * @return beginQuantity
   */
  @javax.annotation.Nullable
  public Double getBeginQuantity() {
    return beginQuantity;
  }

  public void setBeginQuantity(Double beginQuantity) {
    this.beginQuantity = beginQuantity;
  }


  public DiscountUpdateDto endQuantity(Double endQuantity) {
    this.endQuantity = endQuantity;
    return this;
  }

  /**
   * Get endQuantity
   * @return endQuantity
   */
  @javax.annotation.Nullable
  public Double getEndQuantity() {
    return endQuantity;
  }

  public void setEndQuantity(Double endQuantity) {
    this.endQuantity = endQuantity;
  }


  public DiscountUpdateDto percent(Double percent) {
    this.percent = percent;
    return this;
  }

  /**
   * Get percent
   * @return percent
   */
  @javax.annotation.Nullable
  public Double getPercent() {
    return percent;
  }

  public void setPercent(Double percent) {
    this.percent = percent;
  }


  public DiscountUpdateDto value(Double value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   */
  @javax.annotation.Nullable
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }


  public DiscountUpdateDto tenantId(String tenantId) {
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


  public DiscountUpdateDto enrolmentId(String enrolmentId) {
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


  public DiscountUpdateDto discountListId(String discountListId) {
    this.discountListId = discountListId;
    return this;
  }

  /**
   * Get discountListId
   * @return discountListId
   */
  @javax.annotation.Nullable
  public String getDiscountListId() {
    return discountListId;
  }

  public void setDiscountListId(String discountListId) {
    this.discountListId = discountListId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscountUpdateDto discountUpdateDto = (DiscountUpdateDto) o;
    return Objects.equals(this.description, discountUpdateDto.description) &&
        Objects.equals(this.beginQuantity, discountUpdateDto.beginQuantity) &&
        Objects.equals(this.endQuantity, discountUpdateDto.endQuantity) &&
        Objects.equals(this.percent, discountUpdateDto.percent) &&
        Objects.equals(this.value, discountUpdateDto.value) &&
        Objects.equals(this.tenantId, discountUpdateDto.tenantId) &&
        Objects.equals(this.enrolmentId, discountUpdateDto.enrolmentId) &&
        Objects.equals(this.discountListId, discountUpdateDto.discountListId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, beginQuantity, endQuantity, percent, value, tenantId, enrolmentId, discountListId);
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
    sb.append("class DiscountUpdateDto {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    beginQuantity: ").append(toIndentedString(beginQuantity)).append("\n");
    sb.append("    endQuantity: ").append(toIndentedString(endQuantity)).append("\n");
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    enrolmentId: ").append(toIndentedString(enrolmentId)).append("\n");
    sb.append("    discountListId: ").append(toIndentedString(discountListId)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("beginQuantity");
    openapiFields.add("endQuantity");
    openapiFields.add("percent");
    openapiFields.add("value");
    openapiFields.add("tenantId");
    openapiFields.add("enrolmentId");
    openapiFields.add("discountListId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DiscountUpdateDto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DiscountUpdateDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DiscountUpdateDto is not found in the empty JSON string", DiscountUpdateDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DiscountUpdateDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DiscountUpdateDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("tenantId") != null && !jsonObj.get("tenantId").isJsonNull()) && !jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      if ((jsonObj.get("enrolmentId") != null && !jsonObj.get("enrolmentId").isJsonNull()) && !jsonObj.get("enrolmentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enrolmentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enrolmentId").toString()));
      }
      if ((jsonObj.get("discountListId") != null && !jsonObj.get("discountListId").isJsonNull()) && !jsonObj.get("discountListId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `discountListId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("discountListId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DiscountUpdateDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DiscountUpdateDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DiscountUpdateDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DiscountUpdateDto.class));

       return (TypeAdapter<T>) new TypeAdapter<DiscountUpdateDto>() {
           @Override
           public void write(JsonWriter out, DiscountUpdateDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DiscountUpdateDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DiscountUpdateDto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DiscountUpdateDto
   * @throws IOException if the JSON string is invalid with respect to DiscountUpdateDto
   */
  public static DiscountUpdateDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DiscountUpdateDto.class);
  }

  /**
   * Convert an instance of DiscountUpdateDto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

