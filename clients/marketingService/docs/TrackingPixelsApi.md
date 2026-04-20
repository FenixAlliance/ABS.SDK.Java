# TrackingPixelsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTrackingPixelAsync**](TrackingPixelsApi.md#getTrackingPixelAsync) | **GET** /api/v2/MarketingService/TrackingPixels/{pixelId} | Get a tracking pixel |


<a id="getTrackingPixelAsync"></a>
# **getTrackingPixelAsync**
> OrderDtoEnvelope getTrackingPixelAsync(pixelId, apiVersion, xApiVersion)

Get a tracking pixel

Retrieves a tracking pixel by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TrackingPixelsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TrackingPixelsApi apiInstance = new TrackingPixelsApi(defaultClient);
    UUID pixelId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      OrderDtoEnvelope result = apiInstance.getTrackingPixelAsync(pixelId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackingPixelsApi#getTrackingPixelAsync");
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
| **pixelId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**OrderDtoEnvelope**](OrderDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

