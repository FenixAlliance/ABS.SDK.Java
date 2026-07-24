# DebitNotesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2UblServiceDebitNotesInvoiceIdGet**](DebitNotesApi.md#apiV2UblServiceDebitNotesInvoiceIdGet) | **GET** /api/v2/UblService/DebitNotes/{invoiceId} |  |


<a id="apiV2UblServiceDebitNotesInvoiceIdGet"></a>
# **apiV2UblServiceDebitNotesInvoiceIdGet**
> apiV2UblServiceDebitNotesInvoiceIdGet(tenantId, invoiceId, profile, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DebitNotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    DebitNotesApi apiInstance = new DebitNotesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    String profile = "Generic"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.apiV2UblServiceDebitNotesInvoiceIdGet(tenantId, invoiceId, profile, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling DebitNotesApi#apiV2UblServiceDebitNotesInvoiceIdGet");
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

