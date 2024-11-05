# UploadsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2StorageServiceUploadsPost**](UploadsApi.md#apiV2StorageServiceUploadsPost) | **POST** /api/v2/StorageService/Uploads |  |


<a id="apiV2StorageServiceUploadsPost"></a>
# **apiV2StorageServiceUploadsPost**
> EmptyEnvelope apiV2StorageServiceUploadsPost(tenantId, apiVersion, xApiVersion, notes, title, author, isFolder, fileName, _abstract, keyWords, validResponse, parentFileUploadId, filePath, _file, iD, timestamp)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UploadsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

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
    File _file = new File("/path/to/file"); // File | 
    UUID iD = UUID.randomUUID(); // UUID | 
    OffsetDateTime timestamp = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      EmptyEnvelope result = apiInstance.apiV2StorageServiceUploadsPost(tenantId, apiVersion, xApiVersion, notes, title, author, isFolder, fileName, _abstract, keyWords, validResponse, parentFileUploadId, filePath, _file, iD, timestamp);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#apiV2StorageServiceUploadsPost");
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
| **_file** | **File**|  | [optional] |
| **iD** | **UUID**|  | [optional] |
| **timestamp** | **OffsetDateTime**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

