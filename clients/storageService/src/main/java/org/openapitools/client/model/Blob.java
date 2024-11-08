/*
 * StorageService
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
import java.util.HashMap;
import java.util.Map;
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
 * Blob
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T15:37:47.477903500-05:00[America/Bogota]", comments = "Generator version: 7.9.0")
public class Blob {
  /**
   * Gets or Sets kind
   */
  @JsonAdapter(KindEnum.Adapter.class)
  public enum KindEnum {
    NUMBER_0(0),
    
    NUMBER_1(1);

    private Integer value;

    KindEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static KindEnum fromValue(Integer value) {
      for (KindEnum b : KindEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<KindEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final KindEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public KindEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return KindEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      Integer value = jsonElement.getAsInt();
      KindEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private KindEnum kind;

  public static final String SERIALIZED_NAME_IS_FOLDER = "isFolder";
  @SerializedName(SERIALIZED_NAME_IS_FOLDER)
  private Boolean isFolder;

  public static final String SERIALIZED_NAME_IS_FILE = "isFile";
  @SerializedName(SERIALIZED_NAME_IS_FILE)
  private Boolean isFile;

  public static final String SERIALIZED_NAME_FOLDER_PATH = "folderPath";
  @SerializedName(SERIALIZED_NAME_FOLDER_PATH)
  private String folderPath;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_MD5 = "md5";
  @SerializedName(SERIALIZED_NAME_MD5)
  private String md5;

  public static final String SERIALIZED_NAME_CREATED_TIME = "createdTime";
  @SerializedName(SERIALIZED_NAME_CREATED_TIME)
  private OffsetDateTime createdTime;

  public static final String SERIALIZED_NAME_LAST_MODIFICATION_TIME = "lastModificationTime";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFICATION_TIME)
  private OffsetDateTime lastModificationTime;

  public static final String SERIALIZED_NAME_FULL_PATH = "fullPath";
  @SerializedName(SERIALIZED_NAME_FULL_PATH)
  private String fullPath;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, Object> properties;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata;

  public static final String SERIALIZED_NAME_IS_ROOT_FOLDER = "isRootFolder";
  @SerializedName(SERIALIZED_NAME_IS_ROOT_FOLDER)
  private Boolean isRootFolder;

  public Blob() {
  }

  public Blob(
     Boolean isFolder, 
     Boolean isFile, 
     String folderPath, 
     String name, 
     Map<String, Object> properties, 
     Map<String, String> metadata, 
     Boolean isRootFolder
  ) {
    this();
    this.isFolder = isFolder;
    this.isFile = isFile;
    this.folderPath = folderPath;
    this.name = name;
    this.properties = properties;
    this.metadata = metadata;
    this.isRootFolder = isRootFolder;
  }

  public Blob kind(KindEnum kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Get kind
   * @return kind
   */
  @javax.annotation.Nullable
  public KindEnum getKind() {
    return kind;
  }

  public void setKind(KindEnum kind) {
    this.kind = kind;
  }


  /**
   * Get isFolder
   * @return isFolder
   */
  @javax.annotation.Nullable
  public Boolean getIsFolder() {
    return isFolder;
  }



  /**
   * Get isFile
   * @return isFile
   */
  @javax.annotation.Nullable
  public Boolean getIsFile() {
    return isFile;
  }



  /**
   * Get folderPath
   * @return folderPath
   */
  @javax.annotation.Nullable
  public String getFolderPath() {
    return folderPath;
  }



  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }



  public Blob size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
   */
  @javax.annotation.Nullable
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }


  public Blob md5(String md5) {
    this.md5 = md5;
    return this;
  }

  /**
   * Get md5
   * @return md5
   */
  @javax.annotation.Nullable
  public String getMd5() {
    return md5;
  }

  public void setMd5(String md5) {
    this.md5 = md5;
  }


  public Blob createdTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Get createdTime
   * @return createdTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
  }


  public Blob lastModificationTime(OffsetDateTime lastModificationTime) {
    this.lastModificationTime = lastModificationTime;
    return this;
  }

  /**
   * Get lastModificationTime
   * @return lastModificationTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getLastModificationTime() {
    return lastModificationTime;
  }

  public void setLastModificationTime(OffsetDateTime lastModificationTime) {
    this.lastModificationTime = lastModificationTime;
  }


  public Blob fullPath(String fullPath) {
    this.fullPath = fullPath;
    return this;
  }

  /**
   * Get fullPath
   * @return fullPath
   */
  @javax.annotation.Nullable
  public String getFullPath() {
    return fullPath;
  }

  public void setFullPath(String fullPath) {
    this.fullPath = fullPath;
  }


  /**
   * Get properties
   * @return properties
   */
  @javax.annotation.Nullable
  public Map<String, Object> getProperties() {
    return properties;
  }



  /**
   * Get metadata
   * @return metadata
   */
  @javax.annotation.Nullable
  public Map<String, String> getMetadata() {
    return metadata;
  }



  /**
   * Get isRootFolder
   * @return isRootFolder
   */
  @javax.annotation.Nullable
  public Boolean getIsRootFolder() {
    return isRootFolder;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Blob blob = (Blob) o;
    return Objects.equals(this.kind, blob.kind) &&
        Objects.equals(this.isFolder, blob.isFolder) &&
        Objects.equals(this.isFile, blob.isFile) &&
        Objects.equals(this.folderPath, blob.folderPath) &&
        Objects.equals(this.name, blob.name) &&
        Objects.equals(this.size, blob.size) &&
        Objects.equals(this.md5, blob.md5) &&
        Objects.equals(this.createdTime, blob.createdTime) &&
        Objects.equals(this.lastModificationTime, blob.lastModificationTime) &&
        Objects.equals(this.fullPath, blob.fullPath) &&
        Objects.equals(this.properties, blob.properties) &&
        Objects.equals(this.metadata, blob.metadata) &&
        Objects.equals(this.isRootFolder, blob.isRootFolder);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, isFolder, isFile, folderPath, name, size, md5, createdTime, lastModificationTime, fullPath, properties, metadata, isRootFolder);
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
    sb.append("class Blob {\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    isFolder: ").append(toIndentedString(isFolder)).append("\n");
    sb.append("    isFile: ").append(toIndentedString(isFile)).append("\n");
    sb.append("    folderPath: ").append(toIndentedString(folderPath)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    lastModificationTime: ").append(toIndentedString(lastModificationTime)).append("\n");
    sb.append("    fullPath: ").append(toIndentedString(fullPath)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    isRootFolder: ").append(toIndentedString(isRootFolder)).append("\n");
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
    openapiFields.add("kind");
    openapiFields.add("isFolder");
    openapiFields.add("isFile");
    openapiFields.add("folderPath");
    openapiFields.add("name");
    openapiFields.add("size");
    openapiFields.add("md5");
    openapiFields.add("createdTime");
    openapiFields.add("lastModificationTime");
    openapiFields.add("fullPath");
    openapiFields.add("properties");
    openapiFields.add("metadata");
    openapiFields.add("isRootFolder");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Blob
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Blob.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Blob is not found in the empty JSON string", Blob.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Blob.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Blob` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `kind`
      if (jsonObj.get("kind") != null && !jsonObj.get("kind").isJsonNull()) {
        KindEnum.validateJsonElement(jsonObj.get("kind"));
      }
      if ((jsonObj.get("folderPath") != null && !jsonObj.get("folderPath").isJsonNull()) && !jsonObj.get("folderPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `folderPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("folderPath").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("md5") != null && !jsonObj.get("md5").isJsonNull()) && !jsonObj.get("md5").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `md5` to be a primitive type in the JSON string but got `%s`", jsonObj.get("md5").toString()));
      }
      if ((jsonObj.get("fullPath") != null && !jsonObj.get("fullPath").isJsonNull()) && !jsonObj.get("fullPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fullPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fullPath").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Blob.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Blob' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Blob> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Blob.class));

       return (TypeAdapter<T>) new TypeAdapter<Blob>() {
           @Override
           public void write(JsonWriter out, Blob value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Blob read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Blob given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Blob
   * @throws IOException if the JSON string is invalid with respect to Blob
   */
  public static Blob fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Blob.class);
  }

  /**
   * Convert an instance of Blob to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

