# ExchangeApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**exchangeAmountAsync**](ExchangeApi.md#exchangeAmountAsync) | **GET** /api/v2/ForexService/Exchange/Latest | Exchange currency at latest rates |
| [**exchangeAmountHistoricalAsync**](ExchangeApi.md#exchangeAmountHistoricalAsync) | **GET** /api/v2/ForexService/Exchange/History | Exchange currency at historical rates |


<a id="exchangeAmountAsync"></a>
# **exchangeAmountAsync**
> MoneyEnvelope exchangeAmountAsync(amount, sourceCurrencyId, targetCurrencyId)

Exchange currency at latest rates

Exchange an amount of money from one currency to another using the latest available exchange rates.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ExchangeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ExchangeApi apiInstance = new ExchangeApi(defaultClient);
    Double amount = 3.4D; // Double | 
    String sourceCurrencyId = "sourceCurrencyId_example"; // String | 
    String targetCurrencyId = "targetCurrencyId_example"; // String | 
    try {
      MoneyEnvelope result = apiInstance.exchangeAmountAsync(amount, sourceCurrencyId, targetCurrencyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExchangeApi#exchangeAmountAsync");
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

[**MoneyEnvelope**](MoneyEnvelope.md)

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

<a id="exchangeAmountHistoricalAsync"></a>
# **exchangeAmountHistoricalAsync**
> MoneyEnvelope exchangeAmountHistoricalAsync(amount, sourceCurrencyId, targetCurrencyId, date)

Exchange currency at historical rates

Exchange an amount of money from one currency to another using exchange rates from a specific historical date.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ExchangeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ExchangeApi apiInstance = new ExchangeApi(defaultClient);
    Double amount = 3.4D; // Double | 
    String sourceCurrencyId = "sourceCurrencyId_example"; // String | 
    String targetCurrencyId = "targetCurrencyId_example"; // String | 
    LocalDate date = LocalDate.now(); // LocalDate | 
    try {
      MoneyEnvelope result = apiInstance.exchangeAmountHistoricalAsync(amount, sourceCurrencyId, targetCurrencyId, date);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExchangeApi#exchangeAmountHistoricalAsync");
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

[**MoneyEnvelope**](MoneyEnvelope.md)

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

