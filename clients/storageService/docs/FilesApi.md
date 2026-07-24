# FilesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFileAsync**](FilesApi.md#createFileAsync) | **POST** /api/v2/StorageService/Files |  |
| [**deleteFileAsync**](FilesApi.md#deleteFileAsync) | **DELETE** /api/v2/StorageService/Files/{fileId} |  |
| [**downloadFileAsync**](FilesApi.md#downloadFileAsync) | **GET** /api/v2/StorageService/Files/{fileId}/Raw |  |
| [**getFileAsync**](FilesApi.md#getFileAsync) | **GET** /api/v2/StorageService/Files/{fileId} |  |
| [**getFileThumbnailAsync**](FilesApi.md#getFileThumbnailAsync) | **GET** /api/v2/StorageService/Files/{fileId}/Thumbnail |  |
| [**getFilesAsync**](FilesApi.md#getFilesAsync) | **GET** /api/v2/StorageService/Files |  |
| [**getFilesCountAsync**](FilesApi.md#getFilesCountAsync) | **GET** /api/v2/StorageService/Files/Count |  |
| [**updateFileAsync**](FilesApi.md#updateFileAsync) | **PUT** /api/v2/StorageService/Files/{fileId} |  |


<a id="createFileAsync"></a>
# **createFileAsync**
> EmptyEnvelope createFileAsync(tenantId, apiVersion, xApiVersion, _file, notes, title, author, isFolder, fileName, _abstract, keyWords, validResponse, parentFileUploadId, filePath, publicAccessType, purpose, socialProfileIdValue, appFileContent, appFileSha256, appFileCreatedAtUtc, appFileUserIdValue, appFileTenantIdValue, appFileEnrollmentIdValue, appFileSource, appFileLength, appFileName, appFileFileName, appFileLastModified, appFileSize, appFileContentType, appFileContentDisposition, appFileHeaders, id, timestamp)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FilesApi apiInstance = new FilesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    File _file = new File("/path/to/file"); // File | 
    String notes = "notes_example"; // String | 
    String title = "title_example"; // String | 
    String author = "author_example"; // String | 
    Boolean isFolder = true; // Boolean | 
    String fileName = "fileName_example"; // String | 
    String _abstract = "_abstract_example"; // String | 
    String keyWords = "keyWords_example"; // String | 
    Boolean validResponse = true; // Boolean | 
    String parentFileUploadId = "parentFileUploadId_example"; // String | 
    String filePath = "filePath_example"; // String | 
    String publicAccessType = "false"; // String | 
    String purpose = "Unknown"; // String | 
    UUID socialProfileIdValue = UUID.randomUUID(); // UUID | 
    byte[] appFileContent = null; // byte[] | 
    String appFileSha256 = "appFileSha256_example"; // String | 
    OffsetDateTime appFileCreatedAtUtc = OffsetDateTime.now(); // OffsetDateTime | 
    UUID appFileUserIdValue = UUID.randomUUID(); // UUID | 
    UUID appFileTenantIdValue = UUID.randomUUID(); // UUID | 
    UUID appFileEnrollmentIdValue = UUID.randomUUID(); // UUID | 
    String appFileSource = "Unknown"; // String | 
    Long appFileLength = 56L; // Long | 
    String appFileName = "appFileName_example"; // String | 
    String appFileFileName = "appFileFileName_example"; // String | 
    OffsetDateTime appFileLastModified = OffsetDateTime.now(); // OffsetDateTime | 
    Long appFileSize = 56L; // Long | 
    String appFileContentType = "appFileContentType_example"; // String | 
    String appFileContentDisposition = "appFileContentDisposition_example"; // String | 
    Map<String, String> appFileHeaders = new HashMap(); // Map<String, String> | 
    UUID id = UUID.randomUUID(); // UUID | 
    OffsetDateTime timestamp = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      EmptyEnvelope result = apiInstance.createFileAsync(tenantId, apiVersion, xApiVersion, _file, notes, title, author, isFolder, fileName, _abstract, keyWords, validResponse, parentFileUploadId, filePath, publicAccessType, purpose, socialProfileIdValue, appFileContent, appFileSha256, appFileCreatedAtUtc, appFileUserIdValue, appFileTenantIdValue, appFileEnrollmentIdValue, appFileSource, appFileLength, appFileName, appFileFileName, appFileLastModified, appFileSize, appFileContentType, appFileContentDisposition, appFileHeaders, id, timestamp);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#createFileAsync");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantId** | **UUID**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **_file** | **File**|  | [optional] |
| **notes** | **String**|  | [optional] |
| **title** | **String**|  | [optional] |
| **author** | **String**|  | [optional] |
| **isFolder** | **Boolean**|  | [optional] |
| **fileName** | **String**|  | [optional] |
| **_abstract** | **String**|  | [optional] |
| **keyWords** | **String**|  | [optional] |
| **validResponse** | **Boolean**|  | [optional] |
| **parentFileUploadId** | **String**|  | [optional] |
| **filePath** | **String**|  | [optional] |
| **publicAccessType** | **String**|  | [optional] [enum: false, Container, Blob, Unknown] |
| **purpose** | **String**|  | [optional] [enum: Unknown, IdentityAvatar, IdentityBanner, ProfileAsset, EngagementInline, EngagementAttachment, MessageAttachment, SocialPost, RecordAttachment, AiGenerated, SystemArtifact, Temporary] |
| **socialProfileIdValue** | **UUID**|  | [optional] |
| **appFileContent** | **byte[]**|  | [optional] |
| **appFileSha256** | **String**|  | [optional] |
| **appFileCreatedAtUtc** | **OffsetDateTime**|  | [optional] |
| **appFileUserIdValue** | **UUID**|  | [optional] |
| **appFileTenantIdValue** | **UUID**|  | [optional] |
| **appFileEnrollmentIdValue** | **UUID**|  | [optional] |
| **appFileSource** | **String**|  | [optional] [enum: Unknown, HttpUpload, Integration, InternalProcess, ApiClient, WorkflowEngine] |
| **appFileLength** | **Long**|  | [optional] |
| **appFileName** | **String**|  | [optional] |
| **appFileFileName** | **String**|  | [optional] |
| **appFileLastModified** | **OffsetDateTime**|  | [optional] |
| **appFileSize** | **Long**|  | [optional] |
| **appFileContentType** | **String**|  | [optional] |
| **appFileContentDisposition** | **String**|  | [optional] |
| **appFileHeaders** | [**Map&lt;String, String&gt;**](Map.md)|  | [optional] |
| **id** | **UUID**|  | [optional] |
| **timestamp** | **OffsetDateTime**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, image/png

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **400** | Bad Request |  -  |

<a id="deleteFileAsync"></a>
# **deleteFileAsync**
> EmptyEnvelope deleteFileAsync(fileId, tenantId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FilesApi apiInstance = new FilesApi(defaultClient);
    UUID fileId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteFileAsync(fileId, tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#deleteFileAsync");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | **UUID**|  | |
| **tenantId** | **UUID**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, image/png

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="downloadFileAsync"></a>
# **downloadFileAsync**
> File downloadFileAsync(fileId, tenantId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FilesApi apiInstance = new FilesApi(defaultClient);
    UUID fileId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      File result = apiInstance.downloadFileAsync(fileId, tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#downloadFileAsync");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | **UUID**|  | |
| **tenantId** | **UUID**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, image/png

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **401** | Unauthorized |  -  |

<a id="getFileAsync"></a>
# **getFileAsync**
> FileUploadDtoEnvelope getFileAsync(fileId, tenantId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FilesApi apiInstance = new FilesApi(defaultClient);
    UUID fileId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      FileUploadDtoEnvelope result = apiInstance.getFileAsync(fileId, tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#getFileAsync");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | **UUID**|  | |
| **tenantId** | **UUID**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**FileUploadDtoEnvelope**](FileUploadDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, image/png

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **401** | Unauthorized |  -  |

<a id="getFileThumbnailAsync"></a>
# **getFileThumbnailAsync**
> File getFileThumbnailAsync(fileId, tenantId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FilesApi apiInstance = new FilesApi(defaultClient);
    UUID fileId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      File result = apiInstance.getFileThumbnailAsync(fileId, tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#getFileThumbnailAsync");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | **UUID**|  | |
| **tenantId** | **UUID**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, image/png

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **401** | Unauthorized |  -  |

<a id="getFilesAsync"></a>
# **getFilesAsync**
> FileUploadDtoEnvelope getFilesAsync(tenantId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FilesApi apiInstance = new FilesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      FileUploadDtoEnvelope result = apiInstance.getFilesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#getFilesAsync");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantId** | **UUID**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**FileUploadDtoEnvelope**](FileUploadDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, image/png

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="getFilesCountAsync"></a>
# **getFilesCountAsync**
> Long getFilesCountAsync(tenantId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FilesApi apiInstance = new FilesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Long result = apiInstance.getFilesCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#getFilesCountAsync");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantId** | **UUID**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

**Long**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, image/png

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="updateFileAsync"></a>
# **updateFileAsync**
> EmptyEnvelope updateFileAsync(fileId, tenantId, apiVersion, xApiVersion, _file, notes, metadata, title, author, isFolder, fileName, _abstract, keyWords, validResponse, parentFileUploadID, filePath, appFileContent, appFileSha256, appFileCreatedAtUtc, appFileUserIdValue, appFileTenantIdValue, appFileEnrollmentIdValue, appFileSource, appFileLength, appFileName, appFileFileName, appFileLastModified, appFileSize, appFileContentType, appFileContentDisposition, appFileHeaders)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FilesApi apiInstance = new FilesApi(defaultClient);
    UUID fileId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    File _file = new File("/path/to/file"); // File | 
    String notes = "notes_example"; // String | 
    String metadata = "metadata_example"; // String | 
    String title = "title_example"; // String | 
    String author = "author_example"; // String | 
    Boolean isFolder = true; // Boolean | 
    String fileName = "fileName_example"; // String | 
    String _abstract = "_abstract_example"; // String | 
    String keyWords = "keyWords_example"; // String | 
    Boolean validResponse = true; // Boolean | 
    String parentFileUploadID = "parentFileUploadID_example"; // String | 
    String filePath = "filePath_example"; // String | 
    byte[] appFileContent = null; // byte[] | 
    String appFileSha256 = "appFileSha256_example"; // String | 
    OffsetDateTime appFileCreatedAtUtc = OffsetDateTime.now(); // OffsetDateTime | 
    UUID appFileUserIdValue = UUID.randomUUID(); // UUID | 
    UUID appFileTenantIdValue = UUID.randomUUID(); // UUID | 
    UUID appFileEnrollmentIdValue = UUID.randomUUID(); // UUID | 
    String appFileSource = "Unknown"; // String | 
    Long appFileLength = 56L; // Long | 
    String appFileName = "appFileName_example"; // String | 
    String appFileFileName = "appFileFileName_example"; // String | 
    OffsetDateTime appFileLastModified = OffsetDateTime.now(); // OffsetDateTime | 
    Long appFileSize = 56L; // Long | 
    String appFileContentType = "appFileContentType_example"; // String | 
    String appFileContentDisposition = "appFileContentDisposition_example"; // String | 
    Map<String, String> appFileHeaders = new HashMap(); // Map<String, String> | 
    try {
      EmptyEnvelope result = apiInstance.updateFileAsync(fileId, tenantId, apiVersion, xApiVersion, _file, notes, metadata, title, author, isFolder, fileName, _abstract, keyWords, validResponse, parentFileUploadID, filePath, appFileContent, appFileSha256, appFileCreatedAtUtc, appFileUserIdValue, appFileTenantIdValue, appFileEnrollmentIdValue, appFileSource, appFileLength, appFileName, appFileFileName, appFileLastModified, appFileSize, appFileContentType, appFileContentDisposition, appFileHeaders);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#updateFileAsync");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | **UUID**|  | |
| **tenantId** | **UUID**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **_file** | **File**|  | [optional] |
| **notes** | **String**|  | [optional] |
| **metadata** | **String**|  | [optional] |
| **title** | **String**|  | [optional] |
| **author** | **String**|  | [optional] |
| **isFolder** | **Boolean**|  | [optional] |
| **fileName** | **String**|  | [optional] |
| **_abstract** | **String**|  | [optional] |
| **keyWords** | **String**|  | [optional] |
| **validResponse** | **Boolean**|  | [optional] |
| **parentFileUploadID** | **String**|  | [optional] |
| **filePath** | **String**|  | [optional] |
| **appFileContent** | **byte[]**|  | [optional] |
| **appFileSha256** | **String**|  | [optional] |
| **appFileCreatedAtUtc** | **OffsetDateTime**|  | [optional] |
| **appFileUserIdValue** | **UUID**|  | [optional] |
| **appFileTenantIdValue** | **UUID**|  | [optional] |
| **appFileEnrollmentIdValue** | **UUID**|  | [optional] |
| **appFileSource** | **String**|  | [optional] [enum: Unknown, HttpUpload, Integration, InternalProcess, ApiClient, WorkflowEngine] |
| **appFileLength** | **Long**|  | [optional] |
| **appFileName** | **String**|  | [optional] |
| **appFileFileName** | **String**|  | [optional] |
| **appFileLastModified** | **OffsetDateTime**|  | [optional] |
| **appFileSize** | **Long**|  | [optional] |
| **appFileContentType** | **String**|  | [optional] |
| **appFileContentDisposition** | **String**|  | [optional] |
| **appFileHeaders** | [**Map&lt;String, String&gt;**](Map.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, image/png

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **403** | Forbidden |  -  |
| **400** | Bad Request |  -  |

