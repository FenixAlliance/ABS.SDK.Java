# AntiforgeryApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAndStoreTokens**](AntiforgeryApi.md#getAndStoreTokens) | **GET** /api/v2/SystemService/Antiforgery/GetAndStoreTokens | Get and store antiforgery tokens |
| [**isRequestValidAsync**](AntiforgeryApi.md#isRequestValidAsync) | **GET** /api/v2/SystemService/Antiforgery/IsRequestValid | Validate antiforgery request |


<a id="getAndStoreTokens"></a>
# **getAndStoreTokens**
> getAndStoreTokens(apiVersion, xApiVersion)

Get and store antiforgery tokens

Generates antiforgery tokens and stores them in the current HTTP context.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AntiforgeryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AntiforgeryApi apiInstance = new AntiforgeryApi(defaultClient);
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.getAndStoreTokens(apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling AntiforgeryApi#getAndStoreTokens");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="isRequestValidAsync"></a>
# **isRequestValidAsync**
> isRequestValidAsync(apiVersion, xApiVersion)

Validate antiforgery request

Validates whether the current HTTP request contains a valid antiforgery token.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AntiforgeryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AntiforgeryApi apiInstance = new AntiforgeryApi(defaultClient);
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.isRequestValidAsync(apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling AntiforgeryApi#isRequestValidAsync");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

