# ExchangeVApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**exchangeAmountHistoricalV3Async**](ExchangeVApi.md#exchangeAmountHistoricalV3Async) | **GET** /api/v3/ForexService/Exchange/History | Exchange currency at historical rates (v3) |
| [**exchangeAmountV3Async**](ExchangeVApi.md#exchangeAmountV3Async) | **GET** /api/v3/ForexService/Exchange/Latest | Exchange currency at latest rates (v3) |


<a id="exchangeAmountHistoricalV3Async"></a>
# **exchangeAmountHistoricalV3Async**
> ExchangeRateEnvelope exchangeAmountHistoricalV3Async(amount, sourceCurrencyId, targetCurrencyId, date)

Exchange currency at historical rates (v3)

Exchange an amount of money from one currency to another using exchange rates from a specific historical date. Returns the full ExchangeRate details.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ExchangeVApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ExchangeVApi apiInstance = new ExchangeVApi(defaultClient);
    Double amount = 3.4D; // Double | 
    String sourceCurrencyId = "sourceCurrencyId_example"; // String | 
    String targetCurrencyId = "targetCurrencyId_example"; // String | 
    LocalDate date = LocalDate.now(); // LocalDate | 
    try {
      ExchangeRateEnvelope result = apiInstance.exchangeAmountHistoricalV3Async(amount, sourceCurrencyId, targetCurrencyId, date);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExchangeVApi#exchangeAmountHistoricalV3Async");
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
| **amount** | **Double**|  | |
| **sourceCurrencyId** | **String**|  | |
| **targetCurrencyId** | **String**|  | |
| **date** | **LocalDate**|  | |

### Return type

[**ExchangeRateEnvelope**](ExchangeRateEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="exchangeAmountV3Async"></a>
# **exchangeAmountV3Async**
> ExchangeRateEnvelope exchangeAmountV3Async(amount, sourceCurrencyId, targetCurrencyId)

Exchange currency at latest rates (v3)

Exchange an amount of money from one currency to another using the latest available exchange rates. Returns the full ExchangeRate details.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ExchangeVApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ExchangeVApi apiInstance = new ExchangeVApi(defaultClient);
    Double amount = 3.4D; // Double | 
    String sourceCurrencyId = "sourceCurrencyId_example"; // String | 
    String targetCurrencyId = "targetCurrencyId_example"; // String | 
    try {
      ExchangeRateEnvelope result = apiInstance.exchangeAmountV3Async(amount, sourceCurrencyId, targetCurrencyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExchangeVApi#exchangeAmountV3Async");
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
| **amount** | **Double**|  | |
| **sourceCurrencyId** | **String**|  | |
| **targetCurrencyId** | **String**|  | |

### Return type

[**ExchangeRateEnvelope**](ExchangeRateEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

