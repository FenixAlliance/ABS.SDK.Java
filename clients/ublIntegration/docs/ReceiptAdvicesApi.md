# ReceiptAdvicesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2UblServiceReceiptAdvicesItemRestockIdGet**](ReceiptAdvicesApi.md#apiV2UblServiceReceiptAdvicesItemRestockIdGet) | **GET** /api/v2/UblService/ReceiptAdvices/{itemRestockId} |  |
| [**apiV2UblServiceReceiptAdvicesItemRestockIdPartitionsGet**](ReceiptAdvicesApi.md#apiV2UblServiceReceiptAdvicesItemRestockIdPartitionsGet) | **GET** /api/v2/UblService/ReceiptAdvices/{itemRestockId}/partitions |  |


<a id="apiV2UblServiceReceiptAdvicesItemRestockIdGet"></a>
# **apiV2UblServiceReceiptAdvicesItemRestockIdGet**
> apiV2UblServiceReceiptAdvicesItemRestockIdGet(tenantId, itemRestockId, profile, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReceiptAdvicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ReceiptAdvicesApi apiInstance = new ReceiptAdvicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemRestockId = UUID.randomUUID(); // UUID | 
    String profile = "Generic"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.apiV2UblServiceReceiptAdvicesItemRestockIdGet(tenantId, itemRestockId, profile, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceiptAdvicesApi#apiV2UblServiceReceiptAdvicesItemRestockIdGet");
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
| **itemRestockId** | **UUID**|  | |
| **profile** | **String**|  | [optional] [default to Generic] [enum: Generic, Dian] |
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

<a id="apiV2UblServiceReceiptAdvicesItemRestockIdPartitionsGet"></a>
# **apiV2UblServiceReceiptAdvicesItemRestockIdPartitionsGet**
> apiV2UblServiceReceiptAdvicesItemRestockIdPartitionsGet(tenantId, itemRestockId, profile, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReceiptAdvicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ReceiptAdvicesApi apiInstance = new ReceiptAdvicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemRestockId = UUID.randomUUID(); // UUID | 
    String profile = "Generic"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.apiV2UblServiceReceiptAdvicesItemRestockIdPartitionsGet(tenantId, itemRestockId, profile, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceiptAdvicesApi#apiV2UblServiceReceiptAdvicesItemRestockIdPartitionsGet");
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
| **itemRestockId** | **UUID**|  | |
| **profile** | **String**|  | [optional] [default to Generic] [enum: Generic, Dian] |
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

