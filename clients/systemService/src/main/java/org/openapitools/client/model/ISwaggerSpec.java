/*
 * SystemService
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
import org.openapitools.client.model.ISwaggerContact;
import org.openapitools.client.model.ISwaggerEndpoint;
import org.openapitools.client.model.ISwaggerLicense;
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
 * ISwaggerSpec
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T15:38:08.171450100-05:00[America/Bogota]", comments = "Generator version: 7.9.0")
public class ISwaggerSpec {
  public static final String SERIALIZED_NAME_ENABLE = "enable";
  @SerializedName(SERIALIZED_NAME_ENABLE)
  private Boolean enable;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_TERMS_OF_SERVICE = "termsOfService";
  @SerializedName(SERIALIZED_NAME_TERMS_OF_SERVICE)
  private String termsOfService;

  public static final String SERIALIZED_NAME_SWAGGER_ENDPOINT = "swaggerEndpoint";
  @SerializedName(SERIALIZED_NAME_SWAGGER_ENDPOINT)
  private ISwaggerEndpoint swaggerEndpoint;

  public static final String SERIALIZED_NAME_OPEN_API_CONTACT = "openApiContact";
  @SerializedName(SERIALIZED_NAME_OPEN_API_CONTACT)
  private ISwaggerContact openApiContact;

  public static final String SERIALIZED_NAME_LICENSE = "license";
  @SerializedName(SERIALIZED_NAME_LICENSE)
  private ISwaggerLicense license;

  public ISwaggerSpec() {
  }

  public ISwaggerSpec enable(Boolean enable) {
    this.enable = enable;
    return this;
  }

  /**
   * Get enable
   * @return enable
   */
  @javax.annotation.Nullable
  public Boolean getEnable() {
    return enable;
  }

  public void setEnable(Boolean enable) {
    this.enable = enable;
  }


  public ISwaggerSpec name(String name) {
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


  public ISwaggerSpec title(String title) {
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


  public ISwaggerSpec version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  public ISwaggerSpec description(String description) {
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


  public ISwaggerSpec termsOfService(String termsOfService) {
    this.termsOfService = termsOfService;
    return this;
  }

  /**
   * Get termsOfService
   * @return termsOfService
   */
  @javax.annotation.Nullable
  public String getTermsOfService() {
    return termsOfService;
  }

  public void setTermsOfService(String termsOfService) {
    this.termsOfService = termsOfService;
  }


  public ISwaggerSpec swaggerEndpoint(ISwaggerEndpoint swaggerEndpoint) {
    this.swaggerEndpoint = swaggerEndpoint;
    return this;
  }

  /**
   * Get swaggerEndpoint
   * @return swaggerEndpoint
   */
  @javax.annotation.Nullable
  public ISwaggerEndpoint getSwaggerEndpoint() {
    return swaggerEndpoint;
  }

  public void setSwaggerEndpoint(ISwaggerEndpoint swaggerEndpoint) {
    this.swaggerEndpoint = swaggerEndpoint;
  }


  public ISwaggerSpec openApiContact(ISwaggerContact openApiContact) {
    this.openApiContact = openApiContact;
    return this;
  }

  /**
   * Get openApiContact
   * @return openApiContact
   */
  @javax.annotation.Nullable
  public ISwaggerContact getOpenApiContact() {
    return openApiContact;
  }

  public void setOpenApiContact(ISwaggerContact openApiContact) {
    this.openApiContact = openApiContact;
  }


  public ISwaggerSpec license(ISwaggerLicense license) {
    this.license = license;
    return this;
  }

  /**
   * Get license
   * @return license
   */
  @javax.annotation.Nullable
  public ISwaggerLicense getLicense() {
    return license;
  }

  public void setLicense(ISwaggerLicense license) {
    this.license = license;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ISwaggerSpec iswaggerSpec = (ISwaggerSpec) o;
    return Objects.equals(this.enable, iswaggerSpec.enable) &&
        Objects.equals(this.name, iswaggerSpec.name) &&
        Objects.equals(this.title, iswaggerSpec.title) &&
        Objects.equals(this.version, iswaggerSpec.version) &&
        Objects.equals(this.description, iswaggerSpec.description) &&
        Objects.equals(this.termsOfService, iswaggerSpec.termsOfService) &&
        Objects.equals(this.swaggerEndpoint, iswaggerSpec.swaggerEndpoint) &&
        Objects.equals(this.openApiContact, iswaggerSpec.openApiContact) &&
        Objects.equals(this.license, iswaggerSpec.license);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, name, title, version, description, termsOfService, swaggerEndpoint, openApiContact, license);
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
    sb.append("class ISwaggerSpec {\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    termsOfService: ").append(toIndentedString(termsOfService)).append("\n");
    sb.append("    swaggerEndpoint: ").append(toIndentedString(swaggerEndpoint)).append("\n");
    sb.append("    openApiContact: ").append(toIndentedString(openApiContact)).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
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
    openapiFields.add("enable");
    openapiFields.add("name");
    openapiFields.add("title");
    openapiFields.add("version");
    openapiFields.add("description");
    openapiFields.add("termsOfService");
    openapiFields.add("swaggerEndpoint");
    openapiFields.add("openApiContact");
    openapiFields.add("license");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ISwaggerSpec
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ISwaggerSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ISwaggerSpec is not found in the empty JSON string", ISwaggerSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ISwaggerSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ISwaggerSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("termsOfService") != null && !jsonObj.get("termsOfService").isJsonNull()) && !jsonObj.get("termsOfService").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `termsOfService` to be a primitive type in the JSON string but got `%s`", jsonObj.get("termsOfService").toString()));
      }
      // validate the optional field `swaggerEndpoint`
      if (jsonObj.get("swaggerEndpoint") != null && !jsonObj.get("swaggerEndpoint").isJsonNull()) {
        ISwaggerEndpoint.validateJsonElement(jsonObj.get("swaggerEndpoint"));
      }
      // validate the optional field `openApiContact`
      if (jsonObj.get("openApiContact") != null && !jsonObj.get("openApiContact").isJsonNull()) {
        ISwaggerContact.validateJsonElement(jsonObj.get("openApiContact"));
      }
      // validate the optional field `license`
      if (jsonObj.get("license") != null && !jsonObj.get("license").isJsonNull()) {
        ISwaggerLicense.validateJsonElement(jsonObj.get("license"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ISwaggerSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ISwaggerSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ISwaggerSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ISwaggerSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<ISwaggerSpec>() {
           @Override
           public void write(JsonWriter out, ISwaggerSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ISwaggerSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ISwaggerSpec given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ISwaggerSpec
   * @throws IOException if the JSON string is invalid with respect to ISwaggerSpec
   */
  public static ISwaggerSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ISwaggerSpec.class);
  }

  /**
   * Convert an instance of ISwaggerSpec to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

