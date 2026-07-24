# InvoicesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2UblServiceInvoicesInvoiceIdGet**](InvoicesApi.md#apiV2UblServiceInvoicesInvoiceIdGet) | **GET** /api/v2/UblService/Invoices/{invoiceId} |  |


<a id="apiV2UblServiceInvoicesInvoiceIdGet"></a>
# **apiV2UblServiceInvoicesInvoiceIdGet**
> apiV2UblServiceInvoicesInvoiceIdGet(tenantId, invoiceId, profile, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    String profile = "Generic"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.apiV2UblServiceInvoicesInvoiceIdGet(tenantId, invoiceId, profile, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#apiV2UblServiceInvoicesInvoiceIdGet");
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
| **invoiceId** | **UUID**|  | |
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

