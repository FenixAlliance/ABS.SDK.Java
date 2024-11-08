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
 * PriceListDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T15:37:07.573626400-05:00[America/Bogota]", comments = "Generator version: 7.9.0")
public class PriceListDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CURRENCY_ID = "currencyId";
  @SerializedName(SERIALIZED_NAME_CURRENCY_ID)
  private String currencyId;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_UNIT_ID = "unitId";
  @SerializedName(SERIALIZED_NAME_UNIT_ID)
  private String unitId;

  public static final String SERIALIZED_NAME_UNIT_GROUP_ID = "unitGroupId";
  @SerializedName(SERIALIZED_NAME_UNIT_GROUP_ID)
  private String unitGroupId;

  public static final String SERIALIZED_NAME_PARTNER_VISIBLE = "partnerVisible";
  @SerializedName(SERIALIZED_NAME_PARTNER_VISIBLE)
  private Boolean partnerVisible;

  public static final String SERIALIZED_NAME_UNIT_OF_MEASURE_DEPENDANT = "unitOfMeasureDependant";
  @SerializedName(SERIALIZED_NAME_UNIT_OF_MEASURE_DEPENDANT)
  private Boolean unitOfMeasureDependant;

  public static final String SERIALIZED_NAME_ENROLMENT_ID = "enrolmentId";
  @SerializedName(SERIALIZED_NAME_ENROLMENT_ID)
  private String enrolmentId;

  public PriceListDto() {
  }

  public PriceListDto id(String id) {
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


  public PriceListDto timestamp(OffsetDateTime timestamp) {
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


  public PriceListDto name(String name) {
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


  public PriceListDto startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public PriceListDto endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public PriceListDto description(String description) {
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


  public PriceListDto currencyId(String currencyId) {
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


  public PriceListDto tenantId(String tenantId) {
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


  public PriceListDto unitId(String unitId) {
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


  public PriceListDto unitGroupId(String unitGroupId) {
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


  public PriceListDto partnerVisible(Boolean partnerVisible) {
    this.partnerVisible = partnerVisible;
    return this;
  }

  /**
   * Get partnerVisible
   * @return partnerVisible
   */
  @javax.annotation.Nullable
  public Boolean getPartnerVisible() {
    return partnerVisible;
  }

  public void setPartnerVisible(Boolean partnerVisible) {
    this.partnerVisible = partnerVisible;
  }


  public PriceListDto unitOfMeasureDependant(Boolean unitOfMeasureDependant) {
    this.unitOfMeasureDependant = unitOfMeasureDependant;
    return this;
  }

  /**
   * Get unitOfMeasureDependant
   * @return unitOfMeasureDependant
   */
  @javax.annotation.Nullable
  public Boolean getUnitOfMeasureDependant() {
    return unitOfMeasureDependant;
  }

  public void setUnitOfMeasureDependant(Boolean unitOfMeasureDependant) {
    this.unitOfMeasureDependant = unitOfMeasureDependant;
  }


  public PriceListDto enrolmentId(String enrolmentId) {
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
    PriceListDto priceListDto = (PriceListDto) o;
    return Objects.equals(this.id, priceListDto.id) &&
        Objects.equals(this.timestamp, priceListDto.timestamp) &&
        Objects.equals(this.name, priceListDto.name) &&
        Objects.equals(this.startDate, priceListDto.startDate) &&
        Objects.equals(this.endDate, priceListDto.endDate) &&
        Objects.equals(this.description, priceListDto.description) &&
        Objects.equals(this.currencyId, priceListDto.currencyId) &&
        Objects.equals(this.tenantId, priceListDto.tenantId) &&
        Objects.equals(this.unitId, priceListDto.unitId) &&
        Objects.equals(this.unitGroupId, priceListDto.unitGroupId) &&
        Objects.equals(this.partnerVisible, priceListDto.partnerVisible) &&
        Objects.equals(this.unitOfMeasureDependant, priceListDto.unitOfMeasureDependant) &&
        Objects.equals(this.enrolmentId, priceListDto.enrolmentId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, timestamp, name, startDate, endDate, description, currencyId, tenantId, unitId, unitGroupId, partnerVisible, unitOfMeasureDependant, enrolmentId);
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
    sb.append("class PriceListDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    unitId: ").append(toIndentedString(unitId)).append("\n");
    sb.append("    unitGroupId: ").append(toIndentedString(unitGroupId)).append("\n");
    sb.append("    partnerVisible: ").append(toIndentedString(partnerVisible)).append("\n");
    sb.append("    unitOfMeasureDependant: ").append(toIndentedString(unitOfMeasureDependant)).append("\n");
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
    openapiFields.add("startDate");
    openapiFields.add("endDate");
    openapiFields.add("description");
    openapiFields.add("currencyId");
    openapiFields.add("tenantId");
    openapiFields.add("unitId");
    openapiFields.add("unitGroupId");
    openapiFields.add("partnerVisible");
    openapiFields.add("unitOfMeasureDependant");
    openapiFields.add("enrolmentId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PriceListDto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PriceListDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PriceListDto is not found in the empty JSON string", PriceListDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PriceListDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PriceListDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("currencyId") != null && !jsonObj.get("currencyId").isJsonNull()) && !jsonObj.get("currencyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyId").toString()));
      }
      if ((jsonObj.get("tenantId") != null && !jsonObj.get("tenantId").isJsonNull()) && !jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      if ((jsonObj.get("unitId") != null && !jsonObj.get("unitId").isJsonNull()) && !jsonObj.get("unitId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unitId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unitId").toString()));
      }
      if ((jsonObj.get("unitGroupId") != null && !jsonObj.get("unitGroupId").isJsonNull()) && !jsonObj.get("unitGroupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unitGroupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unitGroupId").toString()));
      }
      if ((jsonObj.get("enrolmentId") != null && !jsonObj.get("enrolmentId").isJsonNull()) && !jsonObj.get("enrolmentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enrolmentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enrolmentId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PriceListDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PriceListDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PriceListDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PriceListDto.class));

       return (TypeAdapter<T>) new TypeAdapter<PriceListDto>() {
           @Override
           public void write(JsonWriter out, PriceListDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PriceListDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PriceListDto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PriceListDto
   * @throws IOException if the JSON string is invalid with respect to PriceListDto
   */
  public static PriceListDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PriceListDto.class);
  }

  /**
   * Convert an instance of PriceListDto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

