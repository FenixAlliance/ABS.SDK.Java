# DespatchAdvicesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2UblServiceDespatchAdvicesShipmentIdGet**](DespatchAdvicesApi.md#apiV2UblServiceDespatchAdvicesShipmentIdGet) | **GET** /api/v2/UblService/DespatchAdvices/{shipmentId} |  |


<a id="apiV2UblServiceDespatchAdvicesShipmentIdGet"></a>
# **apiV2UblServiceDespatchAdvicesShipmentIdGet**
> apiV2UblServiceDespatchAdvicesShipmentIdGet(tenantId, shipmentId, profile, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DespatchAdvicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    DespatchAdvicesApi apiInstance = new DespatchAdvicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID shipmentId = UUID.randomUUID(); // UUID | 
    String profile = "Generic"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.apiV2UblServiceDespatchAdvicesShipmentIdGet(tenantId, shipmentId, profile, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling DespatchAdvicesApi#apiV2UblServiceDespatchAdvicesShipmentIdGet");
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
| **shipmentId** | **UUID**|  | |
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

