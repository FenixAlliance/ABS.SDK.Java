# ReportsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTrialBalanceAsync**](ReportsApi.md#getTrialBalanceAsync) | **GET** /api/v2/AccountingService/Reports/TrialBalance | Trial balance for a fiscal period |


<a id="getTrialBalanceAsync"></a>
# **getTrialBalanceAsync**
> TrialBalanceDtoEnvelope getTrialBalanceAsync(tenantId, fiscalPeriodId, financialBookId, currencyId, apiVersion, xApiVersion)

Trial balance for a fiscal period

Returns the per-account posted debit/credit totals for the given fiscal period (optionally scoped to a single financial book), plus grand totals and the Σdebits &#x3D;&#x3D; Σcredits balanced flag. Amounts are normalized to the target currency (default USD) from the stored USD reporting amounts.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID fiscalPeriodId = UUID.randomUUID(); // UUID | 
    UUID financialBookId = UUID.randomUUID(); // UUID | 
    String currencyId = "USD.USA"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TrialBalanceDtoEnvelope result = apiInstance.getTrialBalanceAsync(tenantId, fiscalPeriodId, financialBookId, currencyId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getTrialBalanceAsync");
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
| **fiscalPeriodId** | **UUID**|  | |
| **financialBookId** | **UUID**|  | [optional] |
| **currencyId** | **String**|  | [optional] [default to USD.USA] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**TrialBalanceDtoEnvelope**](TrialBalanceDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

