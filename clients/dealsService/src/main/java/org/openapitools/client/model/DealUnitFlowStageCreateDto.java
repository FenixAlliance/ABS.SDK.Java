/*
 * DealsService
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
 * DealUnitFlowStageCreateDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T15:35:46.834379800-05:00[America/Bogota]", comments = "Generator version: 7.9.0")
public class DealUnitFlowStageCreateDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Integer order;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DEAL_UNIT_FLOW_ID = "dealUnitFlowId";
  @SerializedName(SERIALIZED_NAME_DEAL_UNIT_FLOW_ID)
  private String dealUnitFlowId;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ENROLMENT_ID = "enrolmentId";
  @SerializedName(SERIALIZED_NAME_ENROLMENT_ID)
  private String enrolmentId;

  public static final String SERIALIZED_NAME_PARENT_BUSINESS_PROCESS_STAGE_ID = "parentBusinessProcessStageId";
  @SerializedName(SERIALIZED_NAME_PARENT_BUSINESS_PROCESS_STAGE_ID)
  private String parentBusinessProcessStageId;

  public DealUnitFlowStageCreateDto() {
  }

  public DealUnitFlowStageCreateDto(
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



  public DealUnitFlowStageCreateDto order(Integer order) {
    this.order = order;
    return this;
  }

  /**
   * Get order
   * @return order
   */
  @javax.annotation.Nullable
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }


  public DealUnitFlowStageCreateDto name(String name) {
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


  public DealUnitFlowStageCreateDto dealUnitFlowId(String dealUnitFlowId) {
    this.dealUnitFlowId = dealUnitFlowId;
    return this;
  }

  /**
   * Get dealUnitFlowId
   * @return dealUnitFlowId
   */
  @javax.annotation.Nullable
  public String getDealUnitFlowId() {
    return dealUnitFlowId;
  }

  public void setDealUnitFlowId(String dealUnitFlowId) {
    this.dealUnitFlowId = dealUnitFlowId;
  }


  public DealUnitFlowStageCreateDto tenantId(String tenantId) {
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


  public DealUnitFlowStageCreateDto description(String description) {
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


  public DealUnitFlowStageCreateDto enrolmentId(String enrolmentId) {
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


  public DealUnitFlowStageCreateDto parentBusinessProcessStageId(String parentBusinessProcessStageId) {
    this.parentBusinessProcessStageId = parentBusinessProcessStageId;
    return this;
  }

  /**
   * Get parentBusinessProcessStageId
   * @return parentBusinessProcessStageId
   */
  @javax.annotation.Nullable
  public String getParentBusinessProcessStageId() {
    return parentBusinessProcessStageId;
  }

  public void setParentBusinessProcessStageId(String parentBusinessProcessStageId) {
    this.parentBusinessProcessStageId = parentBusinessProcessStageId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DealUnitFlowStageCreateDto dealUnitFlowStageCreateDto = (DealUnitFlowStageCreateDto) o;
    return Objects.equals(this.id, dealUnitFlowStageCreateDto.id) &&
        Objects.equals(this.timestamp, dealUnitFlowStageCreateDto.timestamp) &&
        Objects.equals(this.order, dealUnitFlowStageCreateDto.order) &&
        Objects.equals(this.name, dealUnitFlowStageCreateDto.name) &&
        Objects.equals(this.dealUnitFlowId, dealUnitFlowStageCreateDto.dealUnitFlowId) &&
        Objects.equals(this.tenantId, dealUnitFlowStageCreateDto.tenantId) &&
        Objects.equals(this.description, dealUnitFlowStageCreateDto.description) &&
        Objects.equals(this.enrolmentId, dealUnitFlowStageCreateDto.enrolmentId) &&
        Objects.equals(this.parentBusinessProcessStageId, dealUnitFlowStageCreateDto.parentBusinessProcessStageId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, timestamp, order, name, dealUnitFlowId, tenantId, description, enrolmentId, parentBusinessProcessStageId);
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
    sb.append("class DealUnitFlowStageCreateDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dealUnitFlowId: ").append(toIndentedString(dealUnitFlowId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enrolmentId: ").append(toIndentedString(enrolmentId)).append("\n");
    sb.append("    parentBusinessProcessStageId: ").append(toIndentedString(parentBusinessProcessStageId)).append("\n");
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
    openapiFields.add("order");
    openapiFields.add("name");
    openapiFields.add("dealUnitFlowId");
    openapiFields.add("tenantId");
    openapiFields.add("description");
    openapiFields.add("enrolmentId");
    openapiFields.add("parentBusinessProcessStageId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DealUnitFlowStageCreateDto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DealUnitFlowStageCreateDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DealUnitFlowStageCreateDto is not found in the empty JSON string", DealUnitFlowStageCreateDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DealUnitFlowStageCreateDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DealUnitFlowStageCreateDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("dealUnitFlowId") != null && !jsonObj.get("dealUnitFlowId").isJsonNull()) && !jsonObj.get("dealUnitFlowId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dealUnitFlowId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dealUnitFlowId").toString()));
      }
      if ((jsonObj.get("tenantId") != null && !jsonObj.get("tenantId").isJsonNull()) && !jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("enrolmentId") != null && !jsonObj.get("enrolmentId").isJsonNull()) && !jsonObj.get("enrolmentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enrolmentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enrolmentId").toString()));
      }
      if ((jsonObj.get("parentBusinessProcessStageId") != null && !jsonObj.get("parentBusinessProcessStageId").isJsonNull()) && !jsonObj.get("parentBusinessProcessStageId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentBusinessProcessStageId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentBusinessProcessStageId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DealUnitFlowStageCreateDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DealUnitFlowStageCreateDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DealUnitFlowStageCreateDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DealUnitFlowStageCreateDto.class));

       return (TypeAdapter<T>) new TypeAdapter<DealUnitFlowStageCreateDto>() {
           @Override
           public void write(JsonWriter out, DealUnitFlowStageCreateDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DealUnitFlowStageCreateDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DealUnitFlowStageCreateDto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DealUnitFlowStageCreateDto
   * @throws IOException if the JSON string is invalid with respect to DealUnitFlowStageCreateDto
   */
  public static DealUnitFlowStageCreateDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DealUnitFlowStageCreateDto.class);
  }

  /**
   * Convert an instance of DealUnitFlowStageCreateDto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
