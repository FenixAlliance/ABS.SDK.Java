/*
 * SupportService
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
import java.io.File;
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
 * SupportRequestAttachmentCreateDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T15:38:00.025935400-05:00[America/Bogota]", comments = "Generator version: 7.9.0")
public class SupportRequestAttachmentCreateDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_AUTHOR = "author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  private String author;

  public static final String SERIALIZED_NAME_IS_FOLDER = "isFolder";
  @SerializedName(SERIALIZED_NAME_IS_FOLDER)
  private Boolean isFolder;

  public static final String SERIALIZED_NAME_FILE_NAME = "fileName";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName;

  public static final String SERIALIZED_NAME_ABSTRACT = "abstract";
  @SerializedName(SERIALIZED_NAME_ABSTRACT)
  private String _abstract;

  public static final String SERIALIZED_NAME_KEY_WORDS = "keyWords";
  @SerializedName(SERIALIZED_NAME_KEY_WORDS)
  private String keyWords;

  public static final String SERIALIZED_NAME_VALID_RESPONSE = "validResponse";
  @SerializedName(SERIALIZED_NAME_VALID_RESPONSE)
  private Boolean validResponse;

  public static final String SERIALIZED_NAME_PARENT_FILE_UPLOAD_ID = "parentFileUploadId";
  @SerializedName(SERIALIZED_NAME_PARENT_FILE_UPLOAD_ID)
  private String parentFileUploadId;

  public static final String SERIALIZED_NAME_FILE_PATH = "filePath";
  @SerializedName(SERIALIZED_NAME_FILE_PATH)
  private String filePath;

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private File _file;

  public static final String SERIALIZED_NAME_BUSINESS_I_D = "businessID";
  @SerializedName(SERIALIZED_NAME_BUSINESS_I_D)
  private String businessID;

  public static final String SERIALIZED_NAME_BUSINESS_PROFILE_RECORD_I_D = "businessProfileRecordID";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PROFILE_RECORD_I_D)
  private String businessProfileRecordID;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private String metadata;

  public static final String SERIALIZED_NAME_SUPPORT_REQUEST_I_D = "supportRequestID";
  @SerializedName(SERIALIZED_NAME_SUPPORT_REQUEST_I_D)
  private String supportRequestID;

  public SupportRequestAttachmentCreateDto() {
  }

  public SupportRequestAttachmentCreateDto(
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



  public SupportRequestAttachmentCreateDto notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Get notes
   * @return notes
   */
  @javax.annotation.Nullable
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }


  public SupportRequestAttachmentCreateDto title(String title) {
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


  public SupportRequestAttachmentCreateDto author(String author) {
    this.author = author;
    return this;
  }

  /**
   * Get author
   * @return author
   */
  @javax.annotation.Nullable
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }


  public SupportRequestAttachmentCreateDto isFolder(Boolean isFolder) {
    this.isFolder = isFolder;
    return this;
  }

  /**
   * Get isFolder
   * @return isFolder
   */
  @javax.annotation.Nullable
  public Boolean getIsFolder() {
    return isFolder;
  }

  public void setIsFolder(Boolean isFolder) {
    this.isFolder = isFolder;
  }


  public SupportRequestAttachmentCreateDto fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * Get fileName
   * @return fileName
   */
  @javax.annotation.Nullable
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public SupportRequestAttachmentCreateDto _abstract(String _abstract) {
    this._abstract = _abstract;
    return this;
  }

  /**
   * Get _abstract
   * @return _abstract
   */
  @javax.annotation.Nullable
  public String getAbstract() {
    return _abstract;
  }

  public void setAbstract(String _abstract) {
    this._abstract = _abstract;
  }


  public SupportRequestAttachmentCreateDto keyWords(String keyWords) {
    this.keyWords = keyWords;
    return this;
  }

  /**
   * Get keyWords
   * @return keyWords
   */
  @javax.annotation.Nullable
  public String getKeyWords() {
    return keyWords;
  }

  public void setKeyWords(String keyWords) {
    this.keyWords = keyWords;
  }


  public SupportRequestAttachmentCreateDto validResponse(Boolean validResponse) {
    this.validResponse = validResponse;
    return this;
  }

  /**
   * Get validResponse
   * @return validResponse
   */
  @javax.annotation.Nullable
  public Boolean getValidResponse() {
    return validResponse;
  }

  public void setValidResponse(Boolean validResponse) {
    this.validResponse = validResponse;
  }


  public SupportRequestAttachmentCreateDto parentFileUploadId(String parentFileUploadId) {
    this.parentFileUploadId = parentFileUploadId;
    return this;
  }

  /**
   * Get parentFileUploadId
   * @return parentFileUploadId
   */
  @javax.annotation.Nullable
  public String getParentFileUploadId() {
    return parentFileUploadId;
  }

  public void setParentFileUploadId(String parentFileUploadId) {
    this.parentFileUploadId = parentFileUploadId;
  }


  public SupportRequestAttachmentCreateDto filePath(String filePath) {
    this.filePath = filePath;
    return this;
  }

  /**
   * Get filePath
   * @return filePath
   */
  @javax.annotation.Nullable
  public String getFilePath() {
    return filePath;
  }

  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }


  public SupportRequestAttachmentCreateDto _file(File _file) {
    this._file = _file;
    return this;
  }

  /**
   * Get _file
   * @return _file
   */
  @javax.annotation.Nullable
  public File getFile() {
    return _file;
  }

  public void setFile(File _file) {
    this._file = _file;
  }


  public SupportRequestAttachmentCreateDto businessID(String businessID) {
    this.businessID = businessID;
    return this;
  }

  /**
   * Get businessID
   * @return businessID
   */
  @javax.annotation.Nullable
  public String getBusinessID() {
    return businessID;
  }

  public void setBusinessID(String businessID) {
    this.businessID = businessID;
  }


  public SupportRequestAttachmentCreateDto businessProfileRecordID(String businessProfileRecordID) {
    this.businessProfileRecordID = businessProfileRecordID;
    return this;
  }

  /**
   * Get businessProfileRecordID
   * @return businessProfileRecordID
   */
  @javax.annotation.Nullable
  public String getBusinessProfileRecordID() {
    return businessProfileRecordID;
  }

  public void setBusinessProfileRecordID(String businessProfileRecordID) {
    this.businessProfileRecordID = businessProfileRecordID;
  }


  public SupportRequestAttachmentCreateDto metadata(String metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
   */
  @javax.annotation.Nullable
  public String getMetadata() {
    return metadata;
  }

  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }


  public SupportRequestAttachmentCreateDto supportRequestID(String supportRequestID) {
    this.supportRequestID = supportRequestID;
    return this;
  }

  /**
   * Get supportRequestID
   * @return supportRequestID
   */
  @javax.annotation.Nullable
  public String getSupportRequestID() {
    return supportRequestID;
  }

  public void setSupportRequestID(String supportRequestID) {
    this.supportRequestID = supportRequestID;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportRequestAttachmentCreateDto supportRequestAttachmentCreateDto = (SupportRequestAttachmentCreateDto) o;
    return Objects.equals(this.id, supportRequestAttachmentCreateDto.id) &&
        Objects.equals(this.timestamp, supportRequestAttachmentCreateDto.timestamp) &&
        Objects.equals(this.notes, supportRequestAttachmentCreateDto.notes) &&
        Objects.equals(this.title, supportRequestAttachmentCreateDto.title) &&
        Objects.equals(this.author, supportRequestAttachmentCreateDto.author) &&
        Objects.equals(this.isFolder, supportRequestAttachmentCreateDto.isFolder) &&
        Objects.equals(this.fileName, supportRequestAttachmentCreateDto.fileName) &&
        Objects.equals(this._abstract, supportRequestAttachmentCreateDto._abstract) &&
        Objects.equals(this.keyWords, supportRequestAttachmentCreateDto.keyWords) &&
        Objects.equals(this.validResponse, supportRequestAttachmentCreateDto.validResponse) &&
        Objects.equals(this.parentFileUploadId, supportRequestAttachmentCreateDto.parentFileUploadId) &&
        Objects.equals(this.filePath, supportRequestAttachmentCreateDto.filePath) &&
        Objects.equals(this._file, supportRequestAttachmentCreateDto._file) &&
        Objects.equals(this.businessID, supportRequestAttachmentCreateDto.businessID) &&
        Objects.equals(this.businessProfileRecordID, supportRequestAttachmentCreateDto.businessProfileRecordID) &&
        Objects.equals(this.metadata, supportRequestAttachmentCreateDto.metadata) &&
        Objects.equals(this.supportRequestID, supportRequestAttachmentCreateDto.supportRequestID);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, timestamp, notes, title, author, isFolder, fileName, _abstract, keyWords, validResponse, parentFileUploadId, filePath, _file, businessID, businessProfileRecordID, metadata, supportRequestID);
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
    sb.append("class SupportRequestAttachmentCreateDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    isFolder: ").append(toIndentedString(isFolder)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    _abstract: ").append(toIndentedString(_abstract)).append("\n");
    sb.append("    keyWords: ").append(toIndentedString(keyWords)).append("\n");
    sb.append("    validResponse: ").append(toIndentedString(validResponse)).append("\n");
    sb.append("    parentFileUploadId: ").append(toIndentedString(parentFileUploadId)).append("\n");
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    businessID: ").append(toIndentedString(businessID)).append("\n");
    sb.append("    businessProfileRecordID: ").append(toIndentedString(businessProfileRecordID)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    supportRequestID: ").append(toIndentedString(supportRequestID)).append("\n");
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
    openapiFields.add("notes");
    openapiFields.add("title");
    openapiFields.add("author");
    openapiFields.add("isFolder");
    openapiFields.add("fileName");
    openapiFields.add("abstract");
    openapiFields.add("keyWords");
    openapiFields.add("validResponse");
    openapiFields.add("parentFileUploadId");
    openapiFields.add("filePath");
    openapiFields.add("file");
    openapiFields.add("businessID");
    openapiFields.add("businessProfileRecordID");
    openapiFields.add("metadata");
    openapiFields.add("supportRequestID");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SupportRequestAttachmentCreateDto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SupportRequestAttachmentCreateDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SupportRequestAttachmentCreateDto is not found in the empty JSON string", SupportRequestAttachmentCreateDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SupportRequestAttachmentCreateDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SupportRequestAttachmentCreateDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("notes") != null && !jsonObj.get("notes").isJsonNull()) && !jsonObj.get("notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notes").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("author") != null && !jsonObj.get("author").isJsonNull()) && !jsonObj.get("author").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `author` to be a primitive type in the JSON string but got `%s`", jsonObj.get("author").toString()));
      }
      if ((jsonObj.get("fileName") != null && !jsonObj.get("fileName").isJsonNull()) && !jsonObj.get("fileName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fileName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fileName").toString()));
      }
      if ((jsonObj.get("abstract") != null && !jsonObj.get("abstract").isJsonNull()) && !jsonObj.get("abstract").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `abstract` to be a primitive type in the JSON string but got `%s`", jsonObj.get("abstract").toString()));
      }
      if ((jsonObj.get("keyWords") != null && !jsonObj.get("keyWords").isJsonNull()) && !jsonObj.get("keyWords").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keyWords` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keyWords").toString()));
      }
      if ((jsonObj.get("parentFileUploadId") != null && !jsonObj.get("parentFileUploadId").isJsonNull()) && !jsonObj.get("parentFileUploadId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentFileUploadId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentFileUploadId").toString()));
      }
      if ((jsonObj.get("filePath") != null && !jsonObj.get("filePath").isJsonNull()) && !jsonObj.get("filePath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filePath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filePath").toString()));
      }
      if ((jsonObj.get("businessID") != null && !jsonObj.get("businessID").isJsonNull()) && !jsonObj.get("businessID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `businessID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("businessID").toString()));
      }
      if ((jsonObj.get("businessProfileRecordID") != null && !jsonObj.get("businessProfileRecordID").isJsonNull()) && !jsonObj.get("businessProfileRecordID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `businessProfileRecordID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("businessProfileRecordID").toString()));
      }
      if ((jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) && !jsonObj.get("metadata").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metadata` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metadata").toString()));
      }
      if ((jsonObj.get("supportRequestID") != null && !jsonObj.get("supportRequestID").isJsonNull()) && !jsonObj.get("supportRequestID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `supportRequestID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("supportRequestID").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SupportRequestAttachmentCreateDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SupportRequestAttachmentCreateDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SupportRequestAttachmentCreateDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SupportRequestAttachmentCreateDto.class));

       return (TypeAdapter<T>) new TypeAdapter<SupportRequestAttachmentCreateDto>() {
           @Override
           public void write(JsonWriter out, SupportRequestAttachmentCreateDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SupportRequestAttachmentCreateDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SupportRequestAttachmentCreateDto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SupportRequestAttachmentCreateDto
   * @throws IOException if the JSON string is invalid with respect to SupportRequestAttachmentCreateDto
   */
  public static SupportRequestAttachmentCreateDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SupportRequestAttachmentCreateDto.class);
  }

  /**
   * Convert an instance of SupportRequestAttachmentCreateDto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

