# BlobsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBlobAsync**](BlobsApi.md#getBlobAsync) | **GET** /api/v2/StorageService/Blobs/Single |  |
| [**getBlobsAsync**](BlobsApi.md#getBlobsAsync) | **GET** /api/v2/StorageService/Blobs |  |


<a id="getBlobAsync"></a>
# **getBlobAsync**
> BlobEnvelope getBlobAsync(tenantId, filePath, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    BlobsApi apiInstance = new BlobsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String filePath = "filePath_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      BlobEnvelope result = apiInstance.getBlobAsync(tenantId, filePath, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlobsApi#getBlobAsync");
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
| **filePath** | **String**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**BlobEnvelope**](BlobEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, image/png

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="getBlobsAsync"></a>
# **getBlobsAsync**
> BlobEnvelope getBlobsAsync(tenantId, folderPath, browseFilter, filePrefix, recurse, maxResults, includeAttributes, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    BlobsApi apiInstance = new BlobsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String folderPath = "folderPath_example"; // String | 
    String browseFilter = "browseFilter_example"; // String | 
    String filePrefix = "filePrefix_example"; // String | 
    Boolean recurse = true; // Boolean | 
    Integer maxResults = 56; // Integer | 
    Boolean includeAttributes = true; // Boolean | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      BlobEnvelope result = apiInstance.getBlobsAsync(tenantId, folderPath, browseFilter, filePrefix, recurse, maxResults, includeAttributes, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlobsApi#getBlobsAsync");
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
| **folderPath** | **String**|  | [optional] |
| **browseFilter** | **String**|  | [optional] |
| **filePrefix** | **String**|  | [optional] |
| **recurse** | **Boolean**|  | [optional] |
| **maxResults** | **Integer**|  | [optional] |
| **includeAttributes** | **Boolean**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**BlobEnvelope**](BlobEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, image/png

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

