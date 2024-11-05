/*
 * InvoicingService
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
 * InvoiceLineUpdateDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T15:36:31.930950900-05:00[America/Bogota]", comments = "Generator version: 7.9.0")
public class InvoiceLineUpdateDto {
  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Double price;

  public static final String SERIALIZED_NAME_UNIT_ID = "unitId";
  @SerializedName(SERIALIZED_NAME_UNIT_ID)
  private String unitId;

  public static final String SERIALIZED_NAME_PERCENT = "percent";
  @SerializedName(SERIALIZED_NAME_PERCENT)
  private Double percent;

  public static final String SERIALIZED_NAME_UNIT_GROUP_ID = "unitGroupId";
  @SerializedName(SERIALIZED_NAME_UNIT_GROUP_ID)
  private String unitGroupId;

  public static final String SERIALIZED_NAME_CURRENCY_ID = "currencyId";
  @SerializedName(SERIALIZED_NAME_CURRENCY_ID)
  private String currencyId;

  public static final String SERIALIZED_NAME_DISCOUNT_LIST_ID = "discountListId";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_LIST_ID)
  private String discountListId;

  public static final String SERIALIZED_NAME_ROUNDING_POLICY_ID = "roundingPolicyId";
  @SerializedName(SERIALIZED_NAME_ROUNDING_POLICY_ID)
  private String roundingPolicyId;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_ITEM_ID = "itemId";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_ITEM_PRICE_ID = "itemPriceId";
  @SerializedName(SERIALIZED_NAME_ITEM_PRICE_ID)
  private String itemPriceId;

  public static final String SERIALIZED_NAME_INVOICE_LINE_ID = "invoiceLineId";
  @SerializedName(SERIALIZED_NAME_INVOICE_LINE_ID)
  private String invoiceLineId;

  public static final String SERIALIZED_NAME_TAX_AMOUNT_IN_USD = "taxAmountInUsd";
  @SerializedName(SERIALIZED_NAME_TAX_AMOUNT_IN_USD)
  private Double taxAmountInUsd;

  public static final String SERIALIZED_NAME_TAX_BASE_AMOUNT_IN_USD = "taxBaseAmountInUsd";
  @SerializedName(SERIALIZED_NAME_TAX_BASE_AMOUNT_IN_USD)
  private Double taxBaseAmountInUsd;

  public InvoiceLineUpdateDto() {
  }

  public InvoiceLineUpdateDto price(Double price) {
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


  public InvoiceLineUpdateDto unitId(String unitId) {
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


  public InvoiceLineUpdateDto percent(Double percent) {
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


  public InvoiceLineUpdateDto unitGroupId(String unitGroupId) {
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


  public InvoiceLineUpdateDto currencyId(String currencyId) {
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


  public InvoiceLineUpdateDto discountListId(String discountListId) {
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


  public InvoiceLineUpdateDto roundingPolicyId(String roundingPolicyId) {
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


  public InvoiceLineUpdateDto quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
   */
  @javax.annotation.Nullable
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public InvoiceLineUpdateDto itemId(String itemId) {
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


  public InvoiceLineUpdateDto itemPriceId(String itemPriceId) {
    this.itemPriceId = itemPriceId;
    return this;
  }

  /**
   * Get itemPriceId
   * @return itemPriceId
   */
  @javax.annotation.Nullable
  public String getItemPriceId() {
    return itemPriceId;
  }

  public void setItemPriceId(String itemPriceId) {
    this.itemPriceId = itemPriceId;
  }


  public InvoiceLineUpdateDto invoiceLineId(String invoiceLineId) {
    this.invoiceLineId = invoiceLineId;
    return this;
  }

  /**
   * Get invoiceLineId
   * @return invoiceLineId
   */
  @javax.annotation.Nullable
  public String getInvoiceLineId() {
    return invoiceLineId;
  }

  public void setInvoiceLineId(String invoiceLineId) {
    this.invoiceLineId = invoiceLineId;
  }


  public InvoiceLineUpdateDto taxAmountInUsd(Double taxAmountInUsd) {
    this.taxAmountInUsd = taxAmountInUsd;
    return this;
  }

  /**
   * Get taxAmountInUsd
   * @return taxAmountInUsd
   */
  @javax.annotation.Nullable
  public Double getTaxAmountInUsd() {
    return taxAmountInUsd;
  }

  public void setTaxAmountInUsd(Double taxAmountInUsd) {
    this.taxAmountInUsd = taxAmountInUsd;
  }


  public InvoiceLineUpdateDto taxBaseAmountInUsd(Double taxBaseAmountInUsd) {
    this.taxBaseAmountInUsd = taxBaseAmountInUsd;
    return this;
  }

  /**
   * Get taxBaseAmountInUsd
   * @return taxBaseAmountInUsd
   */
  @javax.annotation.Nullable
  public Double getTaxBaseAmountInUsd() {
    return taxBaseAmountInUsd;
  }

  public void setTaxBaseAmountInUsd(Double taxBaseAmountInUsd) {
    this.taxBaseAmountInUsd = taxBaseAmountInUsd;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceLineUpdateDto invoiceLineUpdateDto = (InvoiceLineUpdateDto) o;
    return Objects.equals(this.price, invoiceLineUpdateDto.price) &&
        Objects.equals(this.unitId, invoiceLineUpdateDto.unitId) &&
        Objects.equals(this.percent, invoiceLineUpdateDto.percent) &&
        Objects.equals(this.unitGroupId, invoiceLineUpdateDto.unitGroupId) &&
        Objects.equals(this.currencyId, invoiceLineUpdateDto.currencyId) &&
        Objects.equals(this.discountListId, invoiceLineUpdateDto.discountListId) &&
        Objects.equals(this.roundingPolicyId, invoiceLineUpdateDto.roundingPolicyId) &&
        Objects.equals(this.quantity, invoiceLineUpdateDto.quantity) &&
        Objects.equals(this.itemId, invoiceLineUpdateDto.itemId) &&
        Objects.equals(this.itemPriceId, invoiceLineUpdateDto.itemPriceId) &&
        Objects.equals(this.invoiceLineId, invoiceLineUpdateDto.invoiceLineId) &&
        Objects.equals(this.taxAmountInUsd, invoiceLineUpdateDto.taxAmountInUsd) &&
        Objects.equals(this.taxBaseAmountInUsd, invoiceLineUpdateDto.taxBaseAmountInUsd);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, unitId, percent, unitGroupId, currencyId, discountListId, roundingPolicyId, quantity, itemId, itemPriceId, invoiceLineId, taxAmountInUsd, taxBaseAmountInUsd);
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
    sb.append("class InvoiceLineUpdateDto {\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    unitId: ").append(toIndentedString(unitId)).append("\n");
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
    sb.append("    unitGroupId: ").append(toIndentedString(unitGroupId)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    discountListId: ").append(toIndentedString(discountListId)).append("\n");
    sb.append("    roundingPolicyId: ").append(toIndentedString(roundingPolicyId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    itemPriceId: ").append(toIndentedString(itemPriceId)).append("\n");
    sb.append("    invoiceLineId: ").append(toIndentedString(invoiceLineId)).append("\n");
    sb.append("    taxAmountInUsd: ").append(toIndentedString(taxAmountInUsd)).append("\n");
    sb.append("    taxBaseAmountInUsd: ").append(toIndentedString(taxBaseAmountInUsd)).append("\n");
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
    openapiFields.add("price");
    openapiFields.add("unitId");
    openapiFields.add("percent");
    openapiFields.add("unitGroupId");
    openapiFields.add("currencyId");
    openapiFields.add("discountListId");
    openapiFields.add("roundingPolicyId");
    openapiFields.add("quantity");
    openapiFields.add("itemId");
    openapiFields.add("itemPriceId");
    openapiFields.add("invoiceLineId");
    openapiFields.add("taxAmountInUsd");
    openapiFields.add("taxBaseAmountInUsd");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to InvoiceLineUpdateDto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InvoiceLineUpdateDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoiceLineUpdateDto is not found in the empty JSON string", InvoiceLineUpdateDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InvoiceLineUpdateDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InvoiceLineUpdateDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("unitId") != null && !jsonObj.get("unitId").isJsonNull()) && !jsonObj.get("unitId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unitId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unitId").toString()));
      }
      if ((jsonObj.get("unitGroupId") != null && !jsonObj.get("unitGroupId").isJsonNull()) && !jsonObj.get("unitGroupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unitGroupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unitGroupId").toString()));
      }
      if ((jsonObj.get("currencyId") != null && !jsonObj.get("currencyId").isJsonNull()) && !jsonObj.get("currencyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyId").toString()));
      }
      if ((jsonObj.get("discountListId") != null && !jsonObj.get("discountListId").isJsonNull()) && !jsonObj.get("discountListId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `discountListId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("discountListId").toString()));
      }
      if ((jsonObj.get("roundingPolicyId") != null && !jsonObj.get("roundingPolicyId").isJsonNull()) && !jsonObj.get("roundingPolicyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `roundingPolicyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("roundingPolicyId").toString()));
      }
      if ((jsonObj.get("itemId") != null && !jsonObj.get("itemId").isJsonNull()) && !jsonObj.get("itemId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `itemId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("itemId").toString()));
      }
      if ((jsonObj.get("itemPriceId") != null && !jsonObj.get("itemPriceId").isJsonNull()) && !jsonObj.get("itemPriceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `itemPriceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("itemPriceId").toString()));
      }
      if ((jsonObj.get("invoiceLineId") != null && !jsonObj.get("invoiceLineId").isJsonNull()) && !jsonObj.get("invoiceLineId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoiceLineId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoiceLineId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoiceLineUpdateDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoiceLineUpdateDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoiceLineUpdateDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoiceLineUpdateDto.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoiceLineUpdateDto>() {
           @Override
           public void write(JsonWriter out, InvoiceLineUpdateDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InvoiceLineUpdateDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of InvoiceLineUpdateDto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InvoiceLineUpdateDto
   * @throws IOException if the JSON string is invalid with respect to InvoiceLineUpdateDto
   */
  public static InvoiceLineUpdateDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoiceLineUpdateDto.class);
  }

  /**
   * Convert an instance of InvoiceLineUpdateDto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

