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
 * InvoiceAdjustmentCreateDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T15:36:31.930950900-05:00[America/Bogota]", comments = "Generator version: 7.9.0")
public class InvoiceAdjustmentCreateDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_INVOICE_ID = "invoiceId";
  @SerializedName(SERIALIZED_NAME_INVOICE_ID)
  private String invoiceId;

  public static final String SERIALIZED_NAME_CURRENCY_ID = "currencyId";
  @SerializedName(SERIALIZED_NAME_CURRENCY_ID)
  private String currencyId;

  public static final String SERIALIZED_NAME_ENROLLMENT_ID = "enrollmentId";
  @SerializedName(SERIALIZED_NAME_ENROLLMENT_ID)
  private String enrollmentId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SURCHARGE_PERCENT = "surchargePercent";
  @SerializedName(SERIALIZED_NAME_SURCHARGE_PERCENT)
  private Double surchargePercent;

  public static final String SERIALIZED_NAME_SURCHARGE_AMOUNT = "surchargeAmount";
  @SerializedName(SERIALIZED_NAME_SURCHARGE_AMOUNT)
  private Double surchargeAmount;

  public static final String SERIALIZED_NAME_DISCOUNT_PERCENT = "discountPercent";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_PERCENT)
  private Double discountPercent;

  public static final String SERIALIZED_NAME_DISCOUNT_AMOUNT = "discountAmount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_AMOUNT)
  private Double discountAmount;

  public static final String SERIALIZED_NAME_TOTAL_SURCHARGE = "totalSurcharge";
  @SerializedName(SERIALIZED_NAME_TOTAL_SURCHARGE)
  private Double totalSurcharge;

  public static final String SERIALIZED_NAME_TOTAL_DISCOUNT = "totalDiscount";
  @SerializedName(SERIALIZED_NAME_TOTAL_DISCOUNT)
  private Double totalDiscount;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    NUMBER_0(0),
    
    NUMBER_1(1);

    private Integer value;

    TypeEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(Integer value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      Integer value = jsonElement.getAsInt();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public InvoiceAdjustmentCreateDto() {
  }

  public InvoiceAdjustmentCreateDto(
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



  public InvoiceAdjustmentCreateDto tenantId(String tenantId) {
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


  public InvoiceAdjustmentCreateDto invoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

  /**
   * Get invoiceId
   * @return invoiceId
   */
  @javax.annotation.Nullable
  public String getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
  }


  public InvoiceAdjustmentCreateDto currencyId(String currencyId) {
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


  public InvoiceAdjustmentCreateDto enrollmentId(String enrollmentId) {
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


  public InvoiceAdjustmentCreateDto description(String description) {
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


  public InvoiceAdjustmentCreateDto surchargePercent(Double surchargePercent) {
    this.surchargePercent = surchargePercent;
    return this;
  }

  /**
   * Get surchargePercent
   * @return surchargePercent
   */
  @javax.annotation.Nullable
  public Double getSurchargePercent() {
    return surchargePercent;
  }

  public void setSurchargePercent(Double surchargePercent) {
    this.surchargePercent = surchargePercent;
  }


  public InvoiceAdjustmentCreateDto surchargeAmount(Double surchargeAmount) {
    this.surchargeAmount = surchargeAmount;
    return this;
  }

  /**
   * Get surchargeAmount
   * @return surchargeAmount
   */
  @javax.annotation.Nullable
  public Double getSurchargeAmount() {
    return surchargeAmount;
  }

  public void setSurchargeAmount(Double surchargeAmount) {
    this.surchargeAmount = surchargeAmount;
  }


  public InvoiceAdjustmentCreateDto discountPercent(Double discountPercent) {
    this.discountPercent = discountPercent;
    return this;
  }

  /**
   * Get discountPercent
   * @return discountPercent
   */
  @javax.annotation.Nullable
  public Double getDiscountPercent() {
    return discountPercent;
  }

  public void setDiscountPercent(Double discountPercent) {
    this.discountPercent = discountPercent;
  }


  public InvoiceAdjustmentCreateDto discountAmount(Double discountAmount) {
    this.discountAmount = discountAmount;
    return this;
  }

  /**
   * Get discountAmount
   * @return discountAmount
   */
  @javax.annotation.Nullable
  public Double getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(Double discountAmount) {
    this.discountAmount = discountAmount;
  }


  public InvoiceAdjustmentCreateDto totalSurcharge(Double totalSurcharge) {
    this.totalSurcharge = totalSurcharge;
    return this;
  }

  /**
   * Get totalSurcharge
   * @return totalSurcharge
   */
  @javax.annotation.Nullable
  public Double getTotalSurcharge() {
    return totalSurcharge;
  }

  public void setTotalSurcharge(Double totalSurcharge) {
    this.totalSurcharge = totalSurcharge;
  }


  public InvoiceAdjustmentCreateDto totalDiscount(Double totalDiscount) {
    this.totalDiscount = totalDiscount;
    return this;
  }

  /**
   * Get totalDiscount
   * @return totalDiscount
   */
  @javax.annotation.Nullable
  public Double getTotalDiscount() {
    return totalDiscount;
  }

  public void setTotalDiscount(Double totalDiscount) {
    this.totalDiscount = totalDiscount;
  }


  public InvoiceAdjustmentCreateDto type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceAdjustmentCreateDto invoiceAdjustmentCreateDto = (InvoiceAdjustmentCreateDto) o;
    return Objects.equals(this.id, invoiceAdjustmentCreateDto.id) &&
        Objects.equals(this.timestamp, invoiceAdjustmentCreateDto.timestamp) &&
        Objects.equals(this.tenantId, invoiceAdjustmentCreateDto.tenantId) &&
        Objects.equals(this.invoiceId, invoiceAdjustmentCreateDto.invoiceId) &&
        Objects.equals(this.currencyId, invoiceAdjustmentCreateDto.currencyId) &&
        Objects.equals(this.enrollmentId, invoiceAdjustmentCreateDto.enrollmentId) &&
        Objects.equals(this.description, invoiceAdjustmentCreateDto.description) &&
        Objects.equals(this.surchargePercent, invoiceAdjustmentCreateDto.surchargePercent) &&
        Objects.equals(this.surchargeAmount, invoiceAdjustmentCreateDto.surchargeAmount) &&
        Objects.equals(this.discountPercent, invoiceAdjustmentCreateDto.discountPercent) &&
        Objects.equals(this.discountAmount, invoiceAdjustmentCreateDto.discountAmount) &&
        Objects.equals(this.totalSurcharge, invoiceAdjustmentCreateDto.totalSurcharge) &&
        Objects.equals(this.totalDiscount, invoiceAdjustmentCreateDto.totalDiscount) &&
        Objects.equals(this.type, invoiceAdjustmentCreateDto.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, timestamp, tenantId, invoiceId, currencyId, enrollmentId, description, surchargePercent, surchargeAmount, discountPercent, discountAmount, totalSurcharge, totalDiscount, type);
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
    sb.append("class InvoiceAdjustmentCreateDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    enrollmentId: ").append(toIndentedString(enrollmentId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    surchargePercent: ").append(toIndentedString(surchargePercent)).append("\n");
    sb.append("    surchargeAmount: ").append(toIndentedString(surchargeAmount)).append("\n");
    sb.append("    discountPercent: ").append(toIndentedString(discountPercent)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    totalSurcharge: ").append(toIndentedString(totalSurcharge)).append("\n");
    sb.append("    totalDiscount: ").append(toIndentedString(totalDiscount)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("tenantId");
    openapiFields.add("invoiceId");
    openapiFields.add("currencyId");
    openapiFields.add("enrollmentId");
    openapiFields.add("description");
    openapiFields.add("surchargePercent");
    openapiFields.add("surchargeAmount");
    openapiFields.add("discountPercent");
    openapiFields.add("discountAmount");
    openapiFields.add("totalSurcharge");
    openapiFields.add("totalDiscount");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to InvoiceAdjustmentCreateDto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InvoiceAdjustmentCreateDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoiceAdjustmentCreateDto is not found in the empty JSON string", InvoiceAdjustmentCreateDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InvoiceAdjustmentCreateDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InvoiceAdjustmentCreateDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("tenantId") != null && !jsonObj.get("tenantId").isJsonNull()) && !jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      if ((jsonObj.get("invoiceId") != null && !jsonObj.get("invoiceId").isJsonNull()) && !jsonObj.get("invoiceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoiceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoiceId").toString()));
      }
      if ((jsonObj.get("currencyId") != null && !jsonObj.get("currencyId").isJsonNull()) && !jsonObj.get("currencyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyId").toString()));
      }
      if ((jsonObj.get("enrollmentId") != null && !jsonObj.get("enrollmentId").isJsonNull()) && !jsonObj.get("enrollmentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enrollmentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enrollmentId").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        TypeEnum.validateJsonElement(jsonObj.get("type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoiceAdjustmentCreateDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoiceAdjustmentCreateDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoiceAdjustmentCreateDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoiceAdjustmentCreateDto.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoiceAdjustmentCreateDto>() {
           @Override
           public void write(JsonWriter out, InvoiceAdjustmentCreateDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InvoiceAdjustmentCreateDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of InvoiceAdjustmentCreateDto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InvoiceAdjustmentCreateDto
   * @throws IOException if the JSON string is invalid with respect to InvoiceAdjustmentCreateDto
   */
  public static InvoiceAdjustmentCreateDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoiceAdjustmentCreateDto.class);
  }

  /**
   * Convert an instance of InvoiceAdjustmentCreateDto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

