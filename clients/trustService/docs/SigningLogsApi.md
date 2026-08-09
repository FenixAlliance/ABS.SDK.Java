# SigningLogsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSigningLogByIdAsync**](SigningLogsApi.md#getSigningLogByIdAsync) | **GET** /api/v2/TrustService/SigningLogs/{id} | Get signing log by ID |
| [**getSigningLogsAsync**](SigningLogsApi.md#getSigningLogsAsync) | **GET** /api/v2/TrustService/SigningLogs | Get all signing logs |
| [**getSigningLogsCountAsync**](SigningLogsApi.md#getSigningLogsCountAsync) | **GET** /api/v2/TrustService/SigningLogs/Count | Get signing logs count |


<a id="getSigningLogByIdAsync"></a>
# **getSigningLogByIdAsync**
> SigningLogDto getSigningLogByIdAsync(tenantId, id, apiVersion, xApiVersion)

Get signing log by ID

Retrieves a specific signing log by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SigningLogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SigningLogsApi apiInstance = new SigningLogsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SigningLogDto result = apiInstance.getSigningLogByIdAsync(tenantId, id, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SigningLogsApi#getSigningLogByIdAsync");
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
| **tenantId** | **UUID**|  | |
| **id** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**SigningLogDto**](SigningLogDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getSigningLogsAsync"></a>
# **getSigningLogsAsync**
> SigningLogDtoListEnvelope getSigningLogsAsync(tenantId, apiVersion, xApiVersion, signingLogDtoCollectionQueryParameters)

Get all signing logs

Retrieves all signing logs for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SigningLogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SigningLogsApi apiInstance = new SigningLogsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SigningLogDtoCollectionQueryParameters signingLogDtoCollectionQueryParameters = new SigningLogDtoCollectionQueryParameters(); // SigningLogDtoCollectionQueryParameters | 
    try {
      SigningLogDtoListEnvelope result = apiInstance.getSigningLogsAsync(tenantId, apiVersion, xApiVersion, signingLogDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SigningLogsApi#getSigningLogsAsync");
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
| **tenantId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **signingLogDtoCollectionQueryParameters** | [**SigningLogDtoCollectionQueryParameters**](SigningLogDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**SigningLogDtoListEnvelope**](SigningLogDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **200** | OK |  -  |

<a id="getSigningLogsCountAsync"></a>
# **getSigningLogsCountAsync**
> Int32Envelope getSigningLogsCountAsync(tenantId, apiVersion, xApiVersion, signingLogDtoCollectionQueryParameters)

Get signing logs count

Returns the count of signing logs for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SigningLogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SigningLogsApi apiInstance = new SigningLogsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SigningLogDtoCollectionQueryParameters signingLogDtoCollectionQueryParameters = new SigningLogDtoCollectionQueryParameters(); // SigningLogDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getSigningLogsCountAsync(tenantId, apiVersion, xApiVersion, signingLogDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SigningLogsApi#getSigningLogsCountAsync");
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
| **tenantId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **signingLogDtoCollectionQueryParameters** | [**SigningLogDtoCollectionQueryParameters**](SigningLogDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **200** | OK |  -  |

