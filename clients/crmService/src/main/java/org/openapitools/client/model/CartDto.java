/*
 * CrmService
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
 * CartDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T15:35:39.798602200-05:00[America/Bogota]", comments = "Generator version: 7.9.0")
public class CartDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Double total;

  public static final String SERIALIZED_NAME_TAXES = "taxes";
  @SerializedName(SERIALIZED_NAME_TAXES)
  private Double taxes;

  public static final String SERIALIZED_NAME_FREIGHT = "freight";
  @SerializedName(SERIALIZED_NAME_FREIGHT)
  private Double freight;

  public static final String SERIALIZED_NAME_SUB_TOTAL = "subTotal";
  @SerializedName(SERIALIZED_NAME_SUB_TOTAL)
  private Double subTotal;

  public static final String SERIALIZED_NAME_CURRENCY_ID = "currencyId";
  @SerializedName(SERIALIZED_NAME_CURRENCY_ID)
  private String currencyId;

  public static final String SERIALIZED_NAME_COUNTRY_ID = "countryId";
  @SerializedName(SERIALIZED_NAME_COUNTRY_ID)
  private String countryId;

  public static final String SERIALIZED_NAME_ITEM_CART_RECORDS_COUNT = "itemCartRecordsCount";
  @SerializedName(SERIALIZED_NAME_ITEM_CART_RECORDS_COUNT)
  private Integer itemCartRecordsCount;

  public static final String SERIALIZED_NAME_ITEM_TO_COMPARE_RECORDS_COUNT = "itemToCompareRecordsCount";
  @SerializedName(SERIALIZED_NAME_ITEM_TO_COMPARE_RECORDS_COUNT)
  private Integer itemToCompareRecordsCount;

  public CartDto() {
  }

  public CartDto id(String id) {
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


  public CartDto ip(String ip) {
    this.ip = ip;
    return this;
  }

  /**
   * Get ip
   * @return ip
   */
  @javax.annotation.Nullable
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }


  public CartDto type(String type) {
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


  public CartDto total(Double total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
   */
  @javax.annotation.Nullable
  public Double getTotal() {
    return total;
  }

  public void setTotal(Double total) {
    this.total = total;
  }


  public CartDto taxes(Double taxes) {
    this.taxes = taxes;
    return this;
  }

  /**
   * Get taxes
   * @return taxes
   */
  @javax.annotation.Nullable
  public Double getTaxes() {
    return taxes;
  }

  public void setTaxes(Double taxes) {
    this.taxes = taxes;
  }


  public CartDto freight(Double freight) {
    this.freight = freight;
    return this;
  }

  /**
   * Get freight
   * @return freight
   */
  @javax.annotation.Nullable
  public Double getFreight() {
    return freight;
  }

  public void setFreight(Double freight) {
    this.freight = freight;
  }


  public CartDto subTotal(Double subTotal) {
    this.subTotal = subTotal;
    return this;
  }

  /**
   * Get subTotal
   * @return subTotal
   */
  @javax.annotation.Nullable
  public Double getSubTotal() {
    return subTotal;
  }

  public void setSubTotal(Double subTotal) {
    this.subTotal = subTotal;
  }


  public CartDto currencyId(String currencyId) {
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


  public CartDto countryId(String countryId) {
    this.countryId = countryId;
    return this;
  }

  /**
   * Get countryId
   * @return countryId
   */
  @javax.annotation.Nullable
  public String getCountryId() {
    return countryId;
  }

  public void setCountryId(String countryId) {
    this.countryId = countryId;
  }


  public CartDto itemCartRecordsCount(Integer itemCartRecordsCount) {
    this.itemCartRecordsCount = itemCartRecordsCount;
    return this;
  }

  /**
   * Get itemCartRecordsCount
   * @return itemCartRecordsCount
   */
  @javax.annotation.Nullable
  public Integer getItemCartRecordsCount() {
    return itemCartRecordsCount;
  }

  public void setItemCartRecordsCount(Integer itemCartRecordsCount) {
    this.itemCartRecordsCount = itemCartRecordsCount;
  }


  public CartDto itemToCompareRecordsCount(Integer itemToCompareRecordsCount) {
    this.itemToCompareRecordsCount = itemToCompareRecordsCount;
    return this;
  }

  /**
   * Get itemToCompareRecordsCount
   * @return itemToCompareRecordsCount
   */
  @javax.annotation.Nullable
  public Integer getItemToCompareRecordsCount() {
    return itemToCompareRecordsCount;
  }

  public void setItemToCompareRecordsCount(Integer itemToCompareRecordsCount) {
    this.itemToCompareRecordsCount = itemToCompareRecordsCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartDto cartDto = (CartDto) o;
    return Objects.equals(this.id, cartDto.id) &&
        Objects.equals(this.ip, cartDto.ip) &&
        Objects.equals(this.type, cartDto.type) &&
        Objects.equals(this.total, cartDto.total) &&
        Objects.equals(this.taxes, cartDto.taxes) &&
        Objects.equals(this.freight, cartDto.freight) &&
        Objects.equals(this.subTotal, cartDto.subTotal) &&
        Objects.equals(this.currencyId, cartDto.currencyId) &&
        Objects.equals(this.countryId, cartDto.countryId) &&
        Objects.equals(this.itemCartRecordsCount, cartDto.itemCartRecordsCount) &&
        Objects.equals(this.itemToCompareRecordsCount, cartDto.itemToCompareRecordsCount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ip, type, total, taxes, freight, subTotal, currencyId, countryId, itemCartRecordsCount, itemToCompareRecordsCount);
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
    sb.append("class CartDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    freight: ").append(toIndentedString(freight)).append("\n");
    sb.append("    subTotal: ").append(toIndentedString(subTotal)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
    sb.append("    itemCartRecordsCount: ").append(toIndentedString(itemCartRecordsCount)).append("\n");
    sb.append("    itemToCompareRecordsCount: ").append(toIndentedString(itemToCompareRecordsCount)).append("\n");
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
    openapiFields.add("ip");
    openapiFields.add("type");
    openapiFields.add("total");
    openapiFields.add("taxes");
    openapiFields.add("freight");
    openapiFields.add("subTotal");
    openapiFields.add("currencyId");
    openapiFields.add("countryId");
    openapiFields.add("itemCartRecordsCount");
    openapiFields.add("itemToCompareRecordsCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CartDto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CartDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CartDto is not found in the empty JSON string", CartDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CartDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CartDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("ip") != null && !jsonObj.get("ip").isJsonNull()) && !jsonObj.get("ip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ip").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("currencyId") != null && !jsonObj.get("currencyId").isJsonNull()) && !jsonObj.get("currencyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyId").toString()));
      }
      if ((jsonObj.get("countryId") != null && !jsonObj.get("countryId").isJsonNull()) && !jsonObj.get("countryId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CartDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CartDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CartDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CartDto.class));

       return (TypeAdapter<T>) new TypeAdapter<CartDto>() {
           @Override
           public void write(JsonWriter out, CartDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CartDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CartDto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CartDto
   * @throws IOException if the JSON string is invalid with respect to CartDto
   */
  public static CartDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CartDto.class);
  }

  /**
   * Convert an instance of CartDto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

