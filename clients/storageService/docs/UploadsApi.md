# UploadsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**saveFileAsync**](UploadsApi.md#saveFileAsync) | **POST** /api/v2/StorageService/Uploads | Upload a file |


<a id="saveFileAsync"></a>
# **saveFileAsync**
> EmptyEnvelope saveFileAsync(tenantId, apiVersion, xApiVersion, notes, title, author, isFolder, fileName, _abstract, keyWords, validResponse, parentFileUploadId, filePath, appFileContent, appFileSha256, appFileCreatedAtUtc, appFileUserIdValue, appFileTenantIdValue, appFileEnrollmentIdValue, appFileSource, appFileLength, appFileName, appFileFileName, appFileLastModified, appFileSize, appFileContentType, appFileContentDisposition, appFileHeaders, id, timestamp)

Upload a file

Uploads a file to tenant or user storage.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UploadsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    UploadsApi apiInstance = new UploadsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
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
      EmptyEnvelope result = apiInstance.saveFileAsync(tenantId, apiVersion, xApiVersion, notes, title, author, isFolder, fileName, _abstract, keyWords, validResponse, parentFileUploadId, filePath, appFileContent, appFileSha256, appFileCreatedAtUtc, appFileUserIdValue, appFileTenantIdValue, appFileEnrollmentIdValue, appFileSource, appFileLength, appFileName, appFileFileName, appFileLastModified, appFileSize, appFileContentType, appFileContentDisposition, appFileHeaders, id, timestamp);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#saveFileAsync");
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
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

