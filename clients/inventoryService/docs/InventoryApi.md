# InventoryApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getInventoryDetailsAsync**](InventoryApi.md#getInventoryDetailsAsync) | **GET** /api/v2/InventoryService/Inventory/{stockItemId}/Details | Get inventory details for a stock item |


<a id="getInventoryDetailsAsync"></a>
# **getInventoryDetailsAsync**
> getInventoryDetailsAsync(stockItemId, apiVersion, xApiVersion)

Get inventory details for a stock item

Retrieves the inventory details for a specific stock item by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InventoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    InventoryApi apiInstance = new InventoryApi(defaultClient);
    UUID stockItemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.getInventoryDetailsAsync(stockItemId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryApi#getInventoryDetailsAsync");
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
| **stockItemId** | **UUID**|  | |
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

