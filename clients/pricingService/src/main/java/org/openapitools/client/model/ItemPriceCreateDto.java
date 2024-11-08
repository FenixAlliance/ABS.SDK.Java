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
 * ItemPriceCreateDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T15:37:07.573626400-05:00[America/Bogota]", comments = "Generator version: 7.9.0")
public class ItemPriceCreateDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_ITEM_ID = "itemId";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_UNIT_ID = "unitId";
  @SerializedName(SERIALIZED_NAME_UNIT_ID)
  private String unitId;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_CURRENCY_ID = "currencyId";
  @SerializedName(SERIALIZED_NAME_CURRENCY_ID)
  private String currencyId;

  public static final String SERIALIZED_NAME_PRICE_LIST_ID = "priceListId";
  @SerializedName(SERIALIZED_NAME_PRICE_LIST_ID)
  private String priceListId;

  public static final String SERIALIZED_NAME_UNIT_GROUP_ID = "unitGroupId";
  @SerializedName(SERIALIZED_NAME_UNIT_GROUP_ID)
  private String unitGroupId;

  public static final String SERIALIZED_NAME_ENROLLMENT_ID = "enrollmentId";
  @SerializedName(SERIALIZED_NAME_ENROLLMENT_ID)
  private String enrollmentId;

  public static final String SERIALIZED_NAME_DISCOUNT_LIST_ID = "discountListId";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_LIST_ID)
  private String discountListId;

  public static final String SERIALIZED_NAME_ROUNDING_POLICY_ID = "roundingPolicyId";
  @SerializedName(SERIALIZED_NAME_ROUNDING_POLICY_ID)
  private String roundingPolicyId;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Double price;

  public static final String SERIALIZED_NAME_PERCENT = "percent";
  @SerializedName(SERIALIZED_NAME_PERCENT)
  private Double percent;

  public ItemPriceCreateDto() {
  }

  public ItemPriceCreateDto(
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



  public ItemPriceCreateDto itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * Get itemId
   * @return itemId
   */
  @javax.annotation.Nonnull
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public ItemPriceCreateDto unitId(String unitId) {
    this.unitId = unitId;
    return this;
  }

  /**
   * Get unitId
   * @return unitId
   */
  @javax.annotation.Nullable
  public String getUnitId() {
    return unitId;
  }

  public void setUnitId(String unitId) {
    this.unitId = unitId;
  }


  public ItemPriceCreateDto tenantId(String tenantId) {
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


  public ItemPriceCreateDto currencyId(String currencyId) {
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


  public ItemPriceCreateDto priceListId(String priceListId) {
    this.priceListId = priceListId;
    return this;
  }

  /**
   * Get priceListId
   * @return priceListId
   */
  @javax.annotation.Nullable
  public String getPriceListId() {
    return priceListId;
  }

  public void setPriceListId(String priceListId) {
    this.priceListId = priceListId;
  }


  public ItemPriceCreateDto unitGroupId(String unitGroupId) {
    this.unitGroupId = unitGroupId;
    return this;
  }

  /**
   * Get unitGroupId
   * @return unitGroupId
   */
  @javax.annotation.Nullable
  public String getUnitGroupId() {
    return unitGroupId;
  }

  public void setUnitGroupId(String unitGroupId) {
    this.unitGroupId = unitGroupId;
  }


  public ItemPriceCreateDto enrollmentId(String enrollmentId) {
    this.enrollmentId = enrollmentId;
    return this;
  }

  /**
   * Get enrollmentId
   * @return enrollmentId
   */
  @javax.annotation.Nullable
  public String getEnrollmentId() {
    return enrollmentId;
  }

  public void setEnrollmentId(String enrollmentId) {
    this.enrollmentId = enrollmentId;
  }


  public ItemPriceCreateDto discountListId(String discountListId) {
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


  public ItemPriceCreateDto roundingPolicyId(String roundingPolicyId) {
    this.roundingPolicyId = roundingPolicyId;
    return this;
  }

  /**
   * Get roundingPolicyId
   * @return roundingPolicyId
   */
  @javax.annotation.Nullable
  public String getRoundingPolicyId() {
    return roundingPolicyId;
  }

  public void setRoundingPolicyId(String roundingPolicyId) {
    this.roundingPolicyId = roundingPolicyId;
  }


  public ItemPriceCreateDto price(Double price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
   */
  @javax.annotation.Nullable
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }


  public ItemPriceCreateDto percent(Double percent) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemPriceCreateDto itemPriceCreateDto = (ItemPriceCreateDto) o;
    return Objects.equals(this.id, itemPriceCreateDto.id) &&
        Objects.equals(this.timestamp, itemPriceCreateDto.timestamp) &&
        Objects.equals(this.itemId, itemPriceCreateDto.itemId) &&
        Objects.equals(this.unitId, itemPriceCreateDto.unitId) &&
        Objects.equals(this.tenantId, itemPriceCreateDto.tenantId) &&
        Objects.equals(this.currencyId, itemPriceCreateDto.currencyId) &&
        Objects.equals(this.priceListId, itemPriceCreateDto.priceListId) &&
        Objects.equals(this.unitGroupId, itemPriceCreateDto.unitGroupId) &&
        Objects.equals(this.enrollmentId, itemPriceCreateDto.enrollmentId) &&
        Objects.equals(this.discountListId, itemPriceCreateDto.discountListId) &&
        Objects.equals(this.roundingPolicyId, itemPriceCreateDto.roundingPolicyId) &&
        Objects.equals(this.price, itemPriceCreateDto.price) &&
        Objects.equals(this.percent, itemPriceCreateDto.percent);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, timestamp, itemId, unitId, tenantId, currencyId, priceListId, unitGroupId, enrollmentId, discountListId, roundingPolicyId, price, percent);
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
    sb.append("class ItemPriceCreateDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    unitId: ").append(toIndentedString(unitId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    priceListId: ").append(toIndentedString(priceListId)).append("\n");
    sb.append("    unitGroupId: ").append(toIndentedString(unitGroupId)).append("\n");
    sb.append("    enrollmentId: ").append(toIndentedString(enrollmentId)).append("\n");
    sb.append("    discountListId: ").append(toIndentedString(discountListId)).append("\n");
    sb.append("    roundingPolicyId: ").append(toIndentedString(roundingPolicyId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
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
    openapiFields.add("itemId");
    openapiFields.add("unitId");
    openapiFields.add("tenantId");
    openapiFields.add("currencyId");
    openapiFields.add("priceListId");
    openapiFields.add("unitGroupId");
    openapiFields.add("enrollmentId");
    openapiFields.add("discountListId");
    openapiFields.add("roundingPolicyId");
    openapiFields.add("price");
    openapiFields.add("percent");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("itemId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ItemPriceCreateDto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ItemPriceCreateDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ItemPriceCreateDto is not found in the empty JSON string", ItemPriceCreateDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ItemPriceCreateDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ItemPriceCreateDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ItemPriceCreateDto.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("itemId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `itemId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("itemId").toString()));
      }
      if ((jsonObj.get("unitId") != null && !jsonObj.get("unitId").isJsonNull()) && !jsonObj.get("unitId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unitId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unitId").toString()));
      }
      if ((jsonObj.get("tenantId") != null && !jsonObj.get("tenantId").isJsonNull()) && !jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      if ((jsonObj.get("currencyId") != null && !jsonObj.get("currencyId").isJsonNull()) && !jsonObj.get("currencyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyId").toString()));
      }
      if ((jsonObj.get("priceListId") != null && !jsonObj.get("priceListId").isJsonNull()) && !jsonObj.get("priceListId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `priceListId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("priceListId").toString()));
      }
      if ((jsonObj.get("unitGroupId") != null && !jsonObj.get("unitGroupId").isJsonNull()) && !jsonObj.get("unitGroupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unitGroupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unitGroupId").toString()));
      }
      if ((jsonObj.get("enrollmentId") != null && !jsonObj.get("enrollmentId").isJsonNull()) && !jsonObj.get("enrollmentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enrollmentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enrollmentId").toString()));
      }
      if ((jsonObj.get("discountListId") != null && !jsonObj.get("discountListId").isJsonNull()) && !jsonObj.get("discountListId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `discountListId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("discountListId").toString()));
      }
      if ((jsonObj.get("roundingPolicyId") != null && !jsonObj.get("roundingPolicyId").isJsonNull()) && !jsonObj.get("roundingPolicyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `roundingPolicyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("roundingPolicyId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ItemPriceCreateDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ItemPriceCreateDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ItemPriceCreateDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ItemPriceCreateDto.class));

       return (TypeAdapter<T>) new TypeAdapter<ItemPriceCreateDto>() {
           @Override
           public void write(JsonWriter out, ItemPriceCreateDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ItemPriceCreateDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ItemPriceCreateDto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ItemPriceCreateDto
   * @throws IOException if the JSON string is invalid with respect to ItemPriceCreateDto
   */
  public static ItemPriceCreateDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ItemPriceCreateDto.class);
  }

  /**
   * Convert an instance of ItemPriceCreateDto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

