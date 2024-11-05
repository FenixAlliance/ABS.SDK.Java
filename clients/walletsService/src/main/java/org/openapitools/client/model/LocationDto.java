/*
 * WalletsService
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
 * LocationDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T15:38:29.301949300-05:00[America/Bogota]", comments = "Generator version: 7.9.0")
public class LocationDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_BUSINESS = "business";
  @SerializedName(SERIALIZED_NAME_BUSINESS)
  private String business;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_FAX = "fax";
  @SerializedName(SERIALIZED_NAME_FAX)
  private String fax;

  public static final String SERIALIZED_NAME_ADDRESS1 = "address1";
  @SerializedName(SERIALIZED_NAME_ADDRESS1)
  private String address1;

  public static final String SERIALIZED_NAME_ADDRESS2 = "address2";
  @SerializedName(SERIALIZED_NAME_ADDRESS2)
  private String address2;

  public static final String SERIALIZED_NAME_ADDRESS3 = "address3";
  @SerializedName(SERIALIZED_NAME_ADDRESS3)
  private String address3;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit;

  public static final String SERIALIZED_NAME_CITY_ID = "cityId";
  @SerializedName(SERIALIZED_NAME_CITY_ID)
  private String cityId;

  public static final String SERIALIZED_NAME_STATE_ID = "stateId";
  @SerializedName(SERIALIZED_NAME_STATE_ID)
  private String stateId;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postalCode";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_COUNTRY_ID = "countryId";
  @SerializedName(SERIALIZED_NAME_COUNTRY_ID)
  private String countryId;

  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  private Double longitude;

  public static final String SERIALIZED_NAME_LATITUDE = "latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  private Double latitude;

  public static final String SERIALIZED_NAME_IS_ROUTABLE = "isRoutable";
  @SerializedName(SERIALIZED_NAME_IS_ROUTABLE)
  private Boolean isRoutable;

  public static final String SERIALIZED_NAME_IS_GLOBAL_PRIMARY = "isGlobalPrimary";
  @SerializedName(SERIALIZED_NAME_IS_GLOBAL_PRIMARY)
  private Boolean isGlobalPrimary;

  public static final String SERIALIZED_NAME_IS_COUNTRY_PRIMARY = "isCountryPrimary";
  @SerializedName(SERIALIZED_NAME_IS_COUNTRY_PRIMARY)
  private Boolean isCountryPrimary;

  public static final String SERIALIZED_NAME_CAN_GENERATE_LABELS = "canGenerateLabels";
  @SerializedName(SERIALIZED_NAME_CAN_GENERATE_LABELS)
  private Boolean canGenerateLabels;

  public static final String SERIALIZED_NAME_IS_DEFAULT_SENDER_ADDRESS = "isDefaultSenderAddress";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT_SENDER_ADDRESS)
  private Boolean isDefaultSenderAddress;

  public static final String SERIALIZED_NAME_IS_DEFAULT_RETURN_ADDRESS = "isDefaultReturnAddress";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT_RETURN_ADDRESS)
  private Boolean isDefaultReturnAddress;

  public static final String SERIALIZED_NAME_IS_DEFAULT_SUPPING_LOCATION = "isDefaultSuppingLocation";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT_SUPPING_LOCATION)
  private Boolean isDefaultSuppingLocation;

  public LocationDto() {
  }

  public LocationDto id(String id) {
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


  public LocationDto timestamp(OffsetDateTime timestamp) {
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


  public LocationDto title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public LocationDto business(String business) {
    this.business = business;
    return this;
  }

  /**
   * Get business
   * @return business
   */
  @javax.annotation.Nullable
  public String getBusiness() {
    return business;
  }

  public void setBusiness(String business) {
    this.business = business;
  }


  public LocationDto email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public LocationDto phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
   */
  @javax.annotation.Nullable
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public LocationDto fax(String fax) {
    this.fax = fax;
    return this;
  }

  /**
   * Get fax
   * @return fax
   */
  @javax.annotation.Nullable
  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }


  public LocationDto address1(String address1) {
    this.address1 = address1;
    return this;
  }

  /**
   * Get address1
   * @return address1
   */
  @javax.annotation.Nullable
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }


  public LocationDto address2(String address2) {
    this.address2 = address2;
    return this;
  }

  /**
   * Get address2
   * @return address2
   */
  @javax.annotation.Nullable
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }


  public LocationDto address3(String address3) {
    this.address3 = address3;
    return this;
  }

  /**
   * Get address3
   * @return address3
   */
  @javax.annotation.Nullable
  public String getAddress3() {
    return address3;
  }

  public void setAddress3(String address3) {
    this.address3 = address3;
  }


  public LocationDto unit(String unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Get unit
   * @return unit
   */
  @javax.annotation.Nullable
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }


  public LocationDto cityId(String cityId) {
    this.cityId = cityId;
    return this;
  }

  /**
   * Get cityId
   * @return cityId
   */
  @javax.annotation.Nullable
  public String getCityId() {
    return cityId;
  }

  public void setCityId(String cityId) {
    this.cityId = cityId;
  }


  public LocationDto stateId(String stateId) {
    this.stateId = stateId;
    return this;
  }

  /**
   * Get stateId
   * @return stateId
   */
  @javax.annotation.Nullable
  public String getStateId() {
    return stateId;
  }

  public void setStateId(String stateId) {
    this.stateId = stateId;
  }


  public LocationDto postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Get postalCode
   * @return postalCode
   */
  @javax.annotation.Nullable
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public LocationDto countryId(String countryId) {
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


  public LocationDto longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   * @return longitude
   */
  @javax.annotation.Nullable
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }


  public LocationDto latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   * @return latitude
   */
  @javax.annotation.Nullable
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }


  public LocationDto isRoutable(Boolean isRoutable) {
    this.isRoutable = isRoutable;
    return this;
  }

  /**
   * Get isRoutable
   * @return isRoutable
   */
  @javax.annotation.Nullable
  public Boolean getIsRoutable() {
    return isRoutable;
  }

  public void setIsRoutable(Boolean isRoutable) {
    this.isRoutable = isRoutable;
  }


  public LocationDto isGlobalPrimary(Boolean isGlobalPrimary) {
    this.isGlobalPrimary = isGlobalPrimary;
    return this;
  }

  /**
   * Get isGlobalPrimary
   * @return isGlobalPrimary
   */
  @javax.annotation.Nullable
  public Boolean getIsGlobalPrimary() {
    return isGlobalPrimary;
  }

  public void setIsGlobalPrimary(Boolean isGlobalPrimary) {
    this.isGlobalPrimary = isGlobalPrimary;
  }


  public LocationDto isCountryPrimary(Boolean isCountryPrimary) {
    this.isCountryPrimary = isCountryPrimary;
    return this;
  }

  /**
   * Get isCountryPrimary
   * @return isCountryPrimary
   */
  @javax.annotation.Nullable
  public Boolean getIsCountryPrimary() {
    return isCountryPrimary;
  }

  public void setIsCountryPrimary(Boolean isCountryPrimary) {
    this.isCountryPrimary = isCountryPrimary;
  }


  public LocationDto canGenerateLabels(Boolean canGenerateLabels) {
    this.canGenerateLabels = canGenerateLabels;
    return this;
  }

  /**
   * Get canGenerateLabels
   * @return canGenerateLabels
   */
  @javax.annotation.Nullable
  public Boolean getCanGenerateLabels() {
    return canGenerateLabels;
  }

  public void setCanGenerateLabels(Boolean canGenerateLabels) {
    this.canGenerateLabels = canGenerateLabels;
  }


  public LocationDto isDefaultSenderAddress(Boolean isDefaultSenderAddress) {
    this.isDefaultSenderAddress = isDefaultSenderAddress;
    return this;
  }

  /**
   * Get isDefaultSenderAddress
   * @return isDefaultSenderAddress
   */
  @javax.annotation.Nullable
  public Boolean getIsDefaultSenderAddress() {
    return isDefaultSenderAddress;
  }

  public void setIsDefaultSenderAddress(Boolean isDefaultSenderAddress) {
    this.isDefaultSenderAddress = isDefaultSenderAddress;
  }


  public LocationDto isDefaultReturnAddress(Boolean isDefaultReturnAddress) {
    this.isDefaultReturnAddress = isDefaultReturnAddress;
    return this;
  }

  /**
   * Get isDefaultReturnAddress
   * @return isDefaultReturnAddress
   */
  @javax.annotation.Nullable
  public Boolean getIsDefaultReturnAddress() {
    return isDefaultReturnAddress;
  }

  public void setIsDefaultReturnAddress(Boolean isDefaultReturnAddress) {
    this.isDefaultReturnAddress = isDefaultReturnAddress;
  }


  public LocationDto isDefaultSuppingLocation(Boolean isDefaultSuppingLocation) {
    this.isDefaultSuppingLocation = isDefaultSuppingLocation;
    return this;
  }

  /**
   * Get isDefaultSuppingLocation
   * @return isDefaultSuppingLocation
   */
  @javax.annotation.Nullable
  public Boolean getIsDefaultSuppingLocation() {
    return isDefaultSuppingLocation;
  }

  public void setIsDefaultSuppingLocation(Boolean isDefaultSuppingLocation) {
    this.isDefaultSuppingLocation = isDefaultSuppingLocation;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationDto locationDto = (LocationDto) o;
    return Objects.equals(this.id, locationDto.id) &&
        Objects.equals(this.timestamp, locationDto.timestamp) &&
        Objects.equals(this.title, locationDto.title) &&
        Objects.equals(this.business, locationDto.business) &&
        Objects.equals(this.email, locationDto.email) &&
        Objects.equals(this.phone, locationDto.phone) &&
        Objects.equals(this.fax, locationDto.fax) &&
        Objects.equals(this.address1, locationDto.address1) &&
        Objects.equals(this.address2, locationDto.address2) &&
        Objects.equals(this.address3, locationDto.address3) &&
        Objects.equals(this.unit, locationDto.unit) &&
        Objects.equals(this.cityId, locationDto.cityId) &&
        Objects.equals(this.stateId, locationDto.stateId) &&
        Objects.equals(this.postalCode, locationDto.postalCode) &&
        Objects.equals(this.countryId, locationDto.countryId) &&
        Objects.equals(this.longitude, locationDto.longitude) &&
        Objects.equals(this.latitude, locationDto.latitude) &&
        Objects.equals(this.isRoutable, locationDto.isRoutable) &&
        Objects.equals(this.isGlobalPrimary, locationDto.isGlobalPrimary) &&
        Objects.equals(this.isCountryPrimary, locationDto.isCountryPrimary) &&
        Objects.equals(this.canGenerateLabels, locationDto.canGenerateLabels) &&
        Objects.equals(this.isDefaultSenderAddress, locationDto.isDefaultSenderAddress) &&
        Objects.equals(this.isDefaultReturnAddress, locationDto.isDefaultReturnAddress) &&
        Objects.equals(this.isDefaultSuppingLocation, locationDto.isDefaultSuppingLocation);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, timestamp, title, business, email, phone, fax, address1, address2, address3, unit, cityId, stateId, postalCode, countryId, longitude, latitude, isRoutable, isGlobalPrimary, isCountryPrimary, canGenerateLabels, isDefaultSenderAddress, isDefaultReturnAddress, isDefaultSuppingLocation);
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
    sb.append("class LocationDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    business: ").append(toIndentedString(business)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    address3: ").append(toIndentedString(address3)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    cityId: ").append(toIndentedString(cityId)).append("\n");
    sb.append("    stateId: ").append(toIndentedString(stateId)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    isRoutable: ").append(toIndentedString(isRoutable)).append("\n");
    sb.append("    isGlobalPrimary: ").append(toIndentedString(isGlobalPrimary)).append("\n");
    sb.append("    isCountryPrimary: ").append(toIndentedString(isCountryPrimary)).append("\n");
    sb.append("    canGenerateLabels: ").append(toIndentedString(canGenerateLabels)).append("\n");
    sb.append("    isDefaultSenderAddress: ").append(toIndentedString(isDefaultSenderAddress)).append("\n");
    sb.append("    isDefaultReturnAddress: ").append(toIndentedString(isDefaultReturnAddress)).append("\n");
    sb.append("    isDefaultSuppingLocation: ").append(toIndentedString(isDefaultSuppingLocation)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("business");
    openapiFields.add("email");
    openapiFields.add("phone");
    openapiFields.add("fax");
    openapiFields.add("address1");
    openapiFields.add("address2");
    openapiFields.add("address3");
    openapiFields.add("unit");
    openapiFields.add("cityId");
    openapiFields.add("stateId");
    openapiFields.add("postalCode");
    openapiFields.add("countryId");
    openapiFields.add("longitude");
    openapiFields.add("latitude");
    openapiFields.add("isRoutable");
    openapiFields.add("isGlobalPrimary");
    openapiFields.add("isCountryPrimary");
    openapiFields.add("canGenerateLabels");
    openapiFields.add("isDefaultSenderAddress");
    openapiFields.add("isDefaultReturnAddress");
    openapiFields.add("isDefaultSuppingLocation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LocationDto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LocationDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LocationDto is not found in the empty JSON string", LocationDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LocationDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LocationDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("business") != null && !jsonObj.get("business").isJsonNull()) && !jsonObj.get("business").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `business` to be a primitive type in the JSON string but got `%s`", jsonObj.get("business").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if ((jsonObj.get("fax") != null && !jsonObj.get("fax").isJsonNull()) && !jsonObj.get("fax").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fax` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fax").toString()));
      }
      if ((jsonObj.get("address1") != null && !jsonObj.get("address1").isJsonNull()) && !jsonObj.get("address1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address1").toString()));
      }
      if ((jsonObj.get("address2") != null && !jsonObj.get("address2").isJsonNull()) && !jsonObj.get("address2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address2").toString()));
      }
      if ((jsonObj.get("address3") != null && !jsonObj.get("address3").isJsonNull()) && !jsonObj.get("address3").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address3` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address3").toString()));
      }
      if ((jsonObj.get("unit") != null && !jsonObj.get("unit").isJsonNull()) && !jsonObj.get("unit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unit").toString()));
      }
      if ((jsonObj.get("cityId") != null && !jsonObj.get("cityId").isJsonNull()) && !jsonObj.get("cityId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cityId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cityId").toString()));
      }
      if ((jsonObj.get("stateId") != null && !jsonObj.get("stateId").isJsonNull()) && !jsonObj.get("stateId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stateId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stateId").toString()));
      }
      if ((jsonObj.get("postalCode") != null && !jsonObj.get("postalCode").isJsonNull()) && !jsonObj.get("postalCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postalCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postalCode").toString()));
      }
      if ((jsonObj.get("countryId") != null && !jsonObj.get("countryId").isJsonNull()) && !jsonObj.get("countryId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocationDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocationDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocationDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocationDto.class));

       return (TypeAdapter<T>) new TypeAdapter<LocationDto>() {
           @Override
           public void write(JsonWriter out, LocationDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocationDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LocationDto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LocationDto
   * @throws IOException if the JSON string is invalid with respect to LocationDto
   */
  public static LocationDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocationDto.class);
  }

  /**
   * Convert an instance of LocationDto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
