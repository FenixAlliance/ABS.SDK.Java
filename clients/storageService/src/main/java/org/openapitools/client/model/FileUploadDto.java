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
 * FileUploadDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T15:37:47.477903500-05:00[America/Bogota]", comments = "Generator version: 7.9.0")
public class FileUploadDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

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

  public static final String SERIALIZED_NAME_HASH = "hash";
  @SerializedName(SERIALIZED_NAME_HASH)
  private String hash;

  public static final String SERIALIZED_NAME_FILE_URL = "fileUrl";
  @SerializedName(SERIALIZED_NAME_FILE_URL)
  private String fileUrl;

  public static final String SERIALIZED_NAME_FILE_PATH = "filePath";
  @SerializedName(SERIALIZED_NAME_FILE_PATH)
  private String filePath;

  public static final String SERIALIZED_NAME_FILE_NAME = "fileName";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName;

  public static final String SERIALIZED_NAME_ABSTRACT = "abstract";
  @SerializedName(SERIALIZED_NAME_ABSTRACT)
  private String _abstract;

  public static final String SERIALIZED_NAME_KEY_WORDS = "keyWords";
  @SerializedName(SERIALIZED_NAME_KEY_WORDS)
  private String keyWords;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private String metadata;

  public static final String SERIALIZED_NAME_FILE_LENGTH = "fileLength";
  @SerializedName(SERIALIZED_NAME_FILE_LENGTH)
  private Long fileLength;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "contentType";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private String contentType;

  public static final String SERIALIZED_NAME_PARENT_FILE_ID = "parentFileId";
  @SerializedName(SERIALIZED_NAME_PARENT_FILE_ID)
  private String parentFileId;

  public static final String SERIALIZED_NAME_VALID_RESPONSE = "validResponse";
  @SerializedName(SERIALIZED_NAME_VALID_RESPONSE)
  private Boolean validResponse;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_ENROLLMENT_ID = "enrollmentId";
  @SerializedName(SERIALIZED_NAME_ENROLLMENT_ID)
  private String enrollmentId;

  public static final String SERIALIZED_NAME_SOCIAL_PROFILE_ID = "socialProfileId";
  @SerializedName(SERIALIZED_NAME_SOCIAL_PROFILE_ID)
  private String socialProfileId;

  public static final String SERIALIZED_NAME_FOLDER_PATH = "folderPath";
  @SerializedName(SERIALIZED_NAME_FOLDER_PATH)
  private String folderPath;

  public FileUploadDto() {
  }

  public FileUploadDto id(String id) {
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


  public FileUploadDto timestamp(OffsetDateTime timestamp) {
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


  public FileUploadDto notes(String notes) {
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


  public FileUploadDto title(String title) {
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


  public FileUploadDto author(String author) {
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


  public FileUploadDto isFolder(Boolean isFolder) {
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


  public FileUploadDto hash(String hash) {
    this.hash = hash;
    return this;
  }

  /**
   * Get hash
   * @return hash
   */
  @javax.annotation.Nullable
  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }


  public FileUploadDto fileUrl(String fileUrl) {
    this.fileUrl = fileUrl;
    return this;
  }

  /**
   * Get fileUrl
   * @return fileUrl
   */
  @javax.annotation.Nullable
  public String getFileUrl() {
    return fileUrl;
  }

  public void setFileUrl(String fileUrl) {
    this.fileUrl = fileUrl;
  }


  public FileUploadDto filePath(String filePath) {
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


  public FileUploadDto fileName(String fileName) {
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


  public FileUploadDto _abstract(String _abstract) {
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


  public FileUploadDto keyWords(String keyWords) {
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


  public FileUploadDto metadata(String metadata) {
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


  public FileUploadDto fileLength(Long fileLength) {
    this.fileLength = fileLength;
    return this;
  }

  /**
   * Get fileLength
   * @return fileLength
   */
  @javax.annotation.Nullable
  public Long getFileLength() {
    return fileLength;
  }

  public void setFileLength(Long fileLength) {
    this.fileLength = fileLength;
  }


  public FileUploadDto contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * Get contentType
   * @return contentType
   */
  @javax.annotation.Nullable
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  public FileUploadDto parentFileId(String parentFileId) {
    this.parentFileId = parentFileId;
    return this;
  }

  /**
   * Get parentFileId
   * @return parentFileId
   */
  @javax.annotation.Nullable
  public String getParentFileId() {
    return parentFileId;
  }

  public void setParentFileId(String parentFileId) {
    this.parentFileId = parentFileId;
  }


  public FileUploadDto validResponse(Boolean validResponse) {
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


  public FileUploadDto userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   */
  @javax.annotation.Nullable
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public FileUploadDto tenantId(String tenantId) {
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


  public FileUploadDto enrollmentId(String enrollmentId) {
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


  public FileUploadDto socialProfileId(String socialProfileId) {
    this.socialProfileId = socialProfileId;
    return this;
  }

  /**
   * Get socialProfileId
   * @return socialProfileId
   */
  @javax.annotation.Nullable
  public String getSocialProfileId() {
    return socialProfileId;
  }

  public void setSocialProfileId(String socialProfileId) {
    this.socialProfileId = socialProfileId;
  }


  public FileUploadDto folderPath(String folderPath) {
    this.folderPath = folderPath;
    return this;
  }

  /**
   * Get folderPath
   * @return folderPath
   */
  @javax.annotation.Nullable
  public String getFolderPath() {
    return folderPath;
  }

  public void setFolderPath(String folderPath) {
    this.folderPath = folderPath;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileUploadDto fileUploadDto = (FileUploadDto) o;
    return Objects.equals(this.id, fileUploadDto.id) &&
        Objects.equals(this.timestamp, fileUploadDto.timestamp) &&
        Objects.equals(this.notes, fileUploadDto.notes) &&
        Objects.equals(this.title, fileUploadDto.title) &&
        Objects.equals(this.author, fileUploadDto.author) &&
        Objects.equals(this.isFolder, fileUploadDto.isFolder) &&
        Objects.equals(this.hash, fileUploadDto.hash) &&
        Objects.equals(this.fileUrl, fileUploadDto.fileUrl) &&
        Objects.equals(this.filePath, fileUploadDto.filePath) &&
        Objects.equals(this.fileName, fileUploadDto.fileName) &&
        Objects.equals(this._abstract, fileUploadDto._abstract) &&
        Objects.equals(this.keyWords, fileUploadDto.keyWords) &&
        Objects.equals(this.metadata, fileUploadDto.metadata) &&
        Objects.equals(this.fileLength, fileUploadDto.fileLength) &&
        Objects.equals(this.contentType, fileUploadDto.contentType) &&
        Objects.equals(this.parentFileId, fileUploadDto.parentFileId) &&
        Objects.equals(this.validResponse, fileUploadDto.validResponse) &&
        Objects.equals(this.userId, fileUploadDto.userId) &&
        Objects.equals(this.tenantId, fileUploadDto.tenantId) &&
        Objects.equals(this.enrollmentId, fileUploadDto.enrollmentId) &&
        Objects.equals(this.socialProfileId, fileUploadDto.socialProfileId) &&
        Objects.equals(this.folderPath, fileUploadDto.folderPath);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, timestamp, notes, title, author, isFolder, hash, fileUrl, filePath, fileName, _abstract, keyWords, metadata, fileLength, contentType, parentFileId, validResponse, userId, tenantId, enrollmentId, socialProfileId, folderPath);
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
    sb.append("class FileUploadDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    isFolder: ").append(toIndentedString(isFolder)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    fileUrl: ").append(toIndentedString(fileUrl)).append("\n");
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    _abstract: ").append(toIndentedString(_abstract)).append("\n");
    sb.append("    keyWords: ").append(toIndentedString(keyWords)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    fileLength: ").append(toIndentedString(fileLength)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    parentFileId: ").append(toIndentedString(parentFileId)).append("\n");
    sb.append("    validResponse: ").append(toIndentedString(validResponse)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    enrollmentId: ").append(toIndentedString(enrollmentId)).append("\n");
    sb.append("    socialProfileId: ").append(toIndentedString(socialProfileId)).append("\n");
    sb.append("    folderPath: ").append(toIndentedString(folderPath)).append("\n");
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
    openapiFields.add("hash");
    openapiFields.add("fileUrl");
    openapiFields.add("filePath");
    openapiFields.add("fileName");
    openapiFields.add("abstract");
    openapiFields.add("keyWords");
    openapiFields.add("metadata");
    openapiFields.add("fileLength");
    openapiFields.add("contentType");
    openapiFields.add("parentFileId");
    openapiFields.add("validResponse");
    openapiFields.add("userId");
    openapiFields.add("tenantId");
    openapiFields.add("enrollmentId");
    openapiFields.add("socialProfileId");
    openapiFields.add("folderPath");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FileUploadDto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FileUploadDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FileUploadDto is not found in the empty JSON string", FileUploadDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FileUploadDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FileUploadDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      if ((jsonObj.get("hash") != null && !jsonObj.get("hash").isJsonNull()) && !jsonObj.get("hash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hash").toString()));
      }
      if ((jsonObj.get("fileUrl") != null && !jsonObj.get("fileUrl").isJsonNull()) && !jsonObj.get("fileUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fileUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fileUrl").toString()));
      }
      if ((jsonObj.get("filePath") != null && !jsonObj.get("filePath").isJsonNull()) && !jsonObj.get("filePath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filePath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filePath").toString()));
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
      if ((jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) && !jsonObj.get("metadata").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metadata` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metadata").toString()));
      }
      if ((jsonObj.get("contentType") != null && !jsonObj.get("contentType").isJsonNull()) && !jsonObj.get("contentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contentType").toString()));
      }
      if ((jsonObj.get("parentFileId") != null && !jsonObj.get("parentFileId").isJsonNull()) && !jsonObj.get("parentFileId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentFileId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentFileId").toString()));
      }
      if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull()) && !jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      if ((jsonObj.get("tenantId") != null && !jsonObj.get("tenantId").isJsonNull()) && !jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      if ((jsonObj.get("enrollmentId") != null && !jsonObj.get("enrollmentId").isJsonNull()) && !jsonObj.get("enrollmentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enrollmentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enrollmentId").toString()));
      }
      if ((jsonObj.get("socialProfileId") != null && !jsonObj.get("socialProfileId").isJsonNull()) && !jsonObj.get("socialProfileId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `socialProfileId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("socialProfileId").toString()));
      }
      if ((jsonObj.get("folderPath") != null && !jsonObj.get("folderPath").isJsonNull()) && !jsonObj.get("folderPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `folderPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("folderPath").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileUploadDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileUploadDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileUploadDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileUploadDto.class));

       return (TypeAdapter<T>) new TypeAdapter<FileUploadDto>() {
           @Override
           public void write(JsonWriter out, FileUploadDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileUploadDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FileUploadDto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FileUploadDto
   * @throws IOException if the JSON string is invalid with respect to FileUploadDto
   */
  public static FileUploadDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileUploadDto.class);
  }

  /**
   * Convert an instance of FileUploadDto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

