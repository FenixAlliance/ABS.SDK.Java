# RadzenEditorApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2StorageServiceRadzenEditorUploadsIdPost**](RadzenEditorApi.md#apiV2StorageServiceRadzenEditorUploadsIdPost) | **POST** /api/v2/StorageService/RadzenEditor/Uploads/{id} |  |
| [**apiV2StorageServiceRadzenEditorUploadsImagePost**](RadzenEditorApi.md#apiV2StorageServiceRadzenEditorUploadsImagePost) | **POST** /api/v2/StorageService/RadzenEditor/Uploads/Image |  |
| [**apiV2StorageServiceRadzenEditorUploadsMultiplePost**](RadzenEditorApi.md#apiV2StorageServiceRadzenEditorUploadsMultiplePost) | **POST** /api/v2/StorageService/RadzenEditor/Uploads/Multiple |  |
| [**apiV2StorageServiceRadzenEditorUploadsSinglePost**](RadzenEditorApi.md#apiV2StorageServiceRadzenEditorUploadsSinglePost) | **POST** /api/v2/StorageService/RadzenEditor/Uploads/Single |  |
| [**apiV2StorageServiceRadzenEditorUploadsSpecificPost**](RadzenEditorApi.md#apiV2StorageServiceRadzenEditorUploadsSpecificPost) | **POST** /api/v2/StorageService/RadzenEditor/Uploads/Specific |  |


<a id="apiV2StorageServiceRadzenEditorUploadsIdPost"></a>
# **apiV2StorageServiceRadzenEditorUploadsIdPost**
> apiV2StorageServiceRadzenEditorUploadsIdPost(id, tenantId, apiVersion, xApiVersion, files)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadzenEditorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    RadzenEditorApi apiInstance = new RadzenEditorApi(defaultClient);
    Integer id = 56; // Integer | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    List<File> files = Arrays.asList(); // List<File> | 
    try {
      apiInstance.apiV2StorageServiceRadzenEditorUploadsIdPost(id, tenantId, apiVersion, xApiVersion, files);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadzenEditorApi#apiV2StorageServiceRadzenEditorUploadsIdPost");
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
| **id** | **Integer**|  | |
| **tenantId** | **UUID**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **files** | **List&lt;File&gt;**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="apiV2StorageServiceRadzenEditorUploadsImagePost"></a>
# **apiV2StorageServiceRadzenEditorUploadsImagePost**
> apiV2StorageServiceRadzenEditorUploadsImagePost(tenantId, apiVersion, xApiVersion, _file)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadzenEditorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    RadzenEditorApi apiInstance = new RadzenEditorApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    File _file = new File("/path/to/file"); // File | 
    try {
      apiInstance.apiV2StorageServiceRadzenEditorUploadsImagePost(tenantId, apiVersion, xApiVersion, _file);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadzenEditorApi#apiV2StorageServiceRadzenEditorUploadsImagePost");
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

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="apiV2StorageServiceRadzenEditorUploadsMultiplePost"></a>
# **apiV2StorageServiceRadzenEditorUploadsMultiplePost**
> apiV2StorageServiceRadzenEditorUploadsMultiplePost(tenantId, apiVersion, xApiVersion, files)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadzenEditorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    RadzenEditorApi apiInstance = new RadzenEditorApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    List<File> files = Arrays.asList(); // List<File> | 
    try {
      apiInstance.apiV2StorageServiceRadzenEditorUploadsMultiplePost(tenantId, apiVersion, xApiVersion, files);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadzenEditorApi#apiV2StorageServiceRadzenEditorUploadsMultiplePost");
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
| **files** | **List&lt;File&gt;**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="apiV2StorageServiceRadzenEditorUploadsSinglePost"></a>
# **apiV2StorageServiceRadzenEditorUploadsSinglePost**
> apiV2StorageServiceRadzenEditorUploadsSinglePost(tenantId, apiVersion, xApiVersion, _file)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadzenEditorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    RadzenEditorApi apiInstance = new RadzenEditorApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    File _file = new File("/path/to/file"); // File | 
    try {
      apiInstance.apiV2StorageServiceRadzenEditorUploadsSinglePost(tenantId, apiVersion, xApiVersion, _file);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadzenEditorApi#apiV2StorageServiceRadzenEditorUploadsSinglePost");
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

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="apiV2StorageServiceRadzenEditorUploadsSpecificPost"></a>
# **apiV2StorageServiceRadzenEditorUploadsSpecificPost**
> apiV2StorageServiceRadzenEditorUploadsSpecificPost(tenantId, apiVersion, xApiVersion, _file)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadzenEditorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    RadzenEditorApi apiInstance = new RadzenEditorApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    File _file = new File("/path/to/file"); // File | 
    try {
      apiInstance.apiV2StorageServiceRadzenEditorUploadsSpecificPost(tenantId, apiVersion, xApiVersion, _file);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadzenEditorApi#apiV2StorageServiceRadzenEditorUploadsSpecificPost");
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

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

