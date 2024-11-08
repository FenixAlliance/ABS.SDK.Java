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
 * ItemPriceDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T15:37:07.573626400-05:00[America/Bogota]", comments = "Generator version: 7.9.0")
public class ItemPriceDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_ITEM_ID = "itemId";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_UNIT_ID = "unitId";
  @SerializedName(SERIALIZED_NAME_UNIT_ID)
  private String unitId;

  public static final String SERIALIZED_NAME_CURRENCY_ID = "currencyId";
  @SerializedName(SERIALIZED_NAME_CURRENCY_ID)
  private String currencyId;

  public static final String SERIALIZED_NAME_DISCOUNT_ID = "discountId";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_ID)
  private String discountId;

  public static final String SERIALIZED_NAME_UNIT_GROUP_ID = "unitGroupId";
  @SerializedName(SERIALIZED_NAME_UNIT_GROUP_ID)
  private String unitGroupId;

  public static final String SERIALIZED_NAME_PRICE_LIST_ID = "priceListId";
  @SerializedName(SERIALIZED_NAME_PRICE_LIST_ID)
  private String priceListId;

  public static final String SERIALIZED_NAME_DISCOUNT_LIST_ID = "discountListId";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_LIST_ID)
  private String discountListId;

  public static final String SERIALIZED_NAME_ROUNDING_POLICY_ID = "roundingPolicyId";
  @SerializedName(SERIALIZED_NAME_ROUNDING_POLICY_ID)
  private String roundingPolicyId;

  public static final String SERIALIZED_NAME_ENROLLMENT_ID = "enrollmentId";
  @SerializedName(SERIALIZED_NAME_ENROLLMENT_ID)
  private String enrollmentId;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Double price;

  public static final String SERIALIZED_NAME_PERCENT = "percent";
  @SerializedName(SERIALIZED_NAME_PERCENT)
  private Double percent;

  public ItemPriceDto() {
  }

  public ItemPriceDto id(String id) {
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


  public ItemPriceDto timestamp(OffsetDateTime timestamp) {
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


  public ItemPriceDto itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * Get itemId
   * @return itemId
   */
  @javax.annotation.Nullable
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public ItemPriceDto unitId(String unitId) {
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


  public ItemPriceDto currencyId(String currencyId) {
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


  public ItemPriceDto discountId(String discountId) {
    this.discountId = discountId;
    return this;
  }

  /**
   * Get discountId
   * @return discountId
   */
  @javax.annotation.Nullable
  public String getDiscountId() {
    return discountId;
  }

  public void setDiscountId(String discountId) {
    this.discountId = discountId;
  }


  public ItemPriceDto unitGroupId(String unitGroupId) {
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


  public ItemPriceDto priceListId(String priceListId) {
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


  public ItemPriceDto discountListId(String discountListId) {
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


  public ItemPriceDto roundingPolicyId(String roundingPolicyId) {
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


  public ItemPriceDto enrollmentId(String enrollmentId) {
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


  public ItemPriceDto tenantId(String tenantId) {
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


  public ItemPriceDto price(Double price) {
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


  public ItemPriceDto percent(Double percent) {
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
    ItemPriceDto itemPriceDto = (ItemPriceDto) o;
    return Objects.equals(this.id, itemPriceDto.id) &&
        Objects.equals(this.timestamp, itemPriceDto.timestamp) &&
        Objects.equals(this.itemId, itemPriceDto.itemId) &&
        Objects.equals(this.unitId, itemPriceDto.unitId) &&
        Objects.equals(this.currencyId, itemPriceDto.currencyId) &&
        Objects.equals(this.discountId, itemPriceDto.discountId) &&
        Objects.equals(this.unitGroupId, itemPriceDto.unitGroupId) &&
        Objects.equals(this.priceListId, itemPriceDto.priceListId) &&
        Objects.equals(this.discountListId, itemPriceDto.discountListId) &&
        Objects.equals(this.roundingPolicyId, itemPriceDto.roundingPolicyId) &&
        Objects.equals(this.enrollmentId, itemPriceDto.enrollmentId) &&
        Objects.equals(this.tenantId, itemPriceDto.tenantId) &&
        Objects.equals(this.price, itemPriceDto.price) &&
        Objects.equals(this.percent, itemPriceDto.percent);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, timestamp, itemId, unitId, currencyId, discountId, unitGroupId, priceListId, discountListId, roundingPolicyId, enrollmentId, tenantId, price, percent);
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
    sb.append("class ItemPriceDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    unitId: ").append(toIndentedString(unitId)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    discountId: ").append(toIndentedString(discountId)).append("\n");
    sb.append("    unitGroupId: ").append(toIndentedString(unitGroupId)).append("\n");
    sb.append("    priceListId: ").append(toIndentedString(priceListId)).append("\n");
    sb.append("    discountListId: ").append(toIndentedString(discountListId)).append("\n");
    sb.append("    roundingPolicyId: ").append(toIndentedString(roundingPolicyId)).append("\n");
    sb.append("    enrollmentId: ").append(toIndentedString(enrollmentId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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
    openapiFields.add("currencyId");
    openapiFields.add("discountId");
    openapiFields.add("unitGroupId");
    openapiFields.add("priceListId");
    openapiFields.add("discountListId");
    openapiFields.add("roundingPolicyId");
    openapiFields.add("enrollmentId");
    openapiFields.add("tenantId");
    openapiFields.add("price");
    openapiFields.add("percent");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ItemPriceDto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ItemPriceDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ItemPriceDto is not found in the empty JSON string", ItemPriceDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ItemPriceDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ItemPriceDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("itemId") != null && !jsonObj.get("itemId").isJsonNull()) && !jsonObj.get("itemId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `itemId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("itemId").toString()));
      }
      if ((jsonObj.get("unitId") != null && !jsonObj.get("unitId").isJsonNull()) && !jsonObj.get("unitId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unitId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unitId").toString()));
      }
      if ((jsonObj.get("currencyId") != null && !jsonObj.get("currencyId").isJsonNull()) && !jsonObj.get("currencyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyId").toString()));
      }
      if ((jsonObj.get("discountId") != null && !jsonObj.get("discountId").isJsonNull()) && !jsonObj.get("discountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `discountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("discountId").toString()));
      }
      if ((jsonObj.get("unitGroupId") != null && !jsonObj.get("unitGroupId").isJsonNull()) && !jsonObj.get("unitGroupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unitGroupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unitGroupId").toString()));
      }
      if ((jsonObj.get("priceListId") != null && !jsonObj.get("priceListId").isJsonNull()) && !jsonObj.get("priceListId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `priceListId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("priceListId").toString()));
      }
      if ((jsonObj.get("discountListId") != null && !jsonObj.get("discountListId").isJsonNull()) && !jsonObj.get("discountListId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `discountListId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("discountListId").toString()));
      }
      if ((jsonObj.get("roundingPolicyId") != null && !jsonObj.get("roundingPolicyId").isJsonNull()) && !jsonObj.get("roundingPolicyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `roundingPolicyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("roundingPolicyId").toString()));
      }
      if ((jsonObj.get("enrollmentId") != null && !jsonObj.get("enrollmentId").isJsonNull()) && !jsonObj.get("enrollmentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enrollmentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enrollmentId").toString()));
      }
      if ((jsonObj.get("tenantId") != null && !jsonObj.get("tenantId").isJsonNull()) && !jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ItemPriceDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ItemPriceDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ItemPriceDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ItemPriceDto.class));

       return (TypeAdapter<T>) new TypeAdapter<ItemPriceDto>() {
           @Override
           public void write(JsonWriter out, ItemPriceDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ItemPriceDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ItemPriceDto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ItemPriceDto
   * @throws IOException if the JSON string is invalid with respect to ItemPriceDto
   */
  public static ItemPriceDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ItemPriceDto.class);
  }

  /**
   * Convert an instance of ItemPriceDto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

