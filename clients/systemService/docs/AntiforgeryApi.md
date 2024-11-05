# AntiforgeryApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2SystemServiceAntiforgeryGetAndStoreTokensGet**](AntiforgeryApi.md#apiV2SystemServiceAntiforgeryGetAndStoreTokensGet) | **GET** /api/v2/SystemService/Antiforgery/GetAndStoreTokens |  |
| [**apiV2SystemServiceAntiforgeryIsRequestValidGet**](AntiforgeryApi.md#apiV2SystemServiceAntiforgeryIsRequestValidGet) | **GET** /api/v2/SystemService/Antiforgery/IsRequestValid |  |


<a id="apiV2SystemServiceAntiforgeryGetAndStoreTokensGet"></a>
# **apiV2SystemServiceAntiforgeryGetAndStoreTokensGet**
> apiV2SystemServiceAntiforgeryGetAndStoreTokensGet(apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AntiforgeryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    AntiforgeryApi apiInstance = new AntiforgeryApi(defaultClient);
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.apiV2SystemServiceAntiforgeryGetAndStoreTokensGet(apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling AntiforgeryApi#apiV2SystemServiceAntiforgeryGetAndStoreTokensGet");
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
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="apiV2SystemServiceAntiforgeryIsRequestValidGet"></a>
# **apiV2SystemServiceAntiforgeryIsRequestValidGet**
> apiV2SystemServiceAntiforgeryIsRequestValidGet(apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AntiforgeryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    AntiforgeryApi apiInstance = new AntiforgeryApi(defaultClient);
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.apiV2SystemServiceAntiforgeryIsRequestValidGet(apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling AntiforgeryApi#apiV2SystemServiceAntiforgeryIsRequestValidGet");
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
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

