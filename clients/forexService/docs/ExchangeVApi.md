# ExchangeVApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV3ForexServiceExchangeHistoryGet**](ExchangeVApi.md#apiV3ForexServiceExchangeHistoryGet) | **GET** /api/v3/ForexService/Exchange/History |  |
| [**apiV3ForexServiceExchangeLatestGet**](ExchangeVApi.md#apiV3ForexServiceExchangeLatestGet) | **GET** /api/v3/ForexService/Exchange/Latest |  |


<a id="apiV3ForexServiceExchangeHistoryGet"></a>
# **apiV3ForexServiceExchangeHistoryGet**
> ExchangeRateEnvelope apiV3ForexServiceExchangeHistoryGet(amount, sourceCurrencyId, targetCurrencyId, date)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ExchangeVApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ExchangeVApi apiInstance = new ExchangeVApi(defaultClient);
    Double amount = 3.4D; // Double | 
    String sourceCurrencyId = "sourceCurrencyId_example"; // String | 
    String targetCurrencyId = "targetCurrencyId_example"; // String | 
    LocalDate date = LocalDate.now(); // LocalDate | 
    try {
      ExchangeRateEnvelope result = apiInstance.apiV3ForexServiceExchangeHistoryGet(amount, sourceCurrencyId, targetCurrencyId, date);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExchangeVApi#apiV3ForexServiceExchangeHistoryGet");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="apiV3ForexServiceExchangeLatestGet"></a>
# **apiV3ForexServiceExchangeLatestGet**
> ExchangeRateEnvelope apiV3ForexServiceExchangeLatestGet(amount, sourceCurrencyId, targetCurrencyId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ExchangeVApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ExchangeVApi apiInstance = new ExchangeVApi(defaultClient);
    Double amount = 3.4D; // Double | 
    String sourceCurrencyId = "sourceCurrencyId_example"; // String | 
    String targetCurrencyId = "targetCurrencyId_example"; // String | 
    try {
      ExchangeRateEnvelope result = apiInstance.apiV3ForexServiceExchangeLatestGet(amount, sourceCurrencyId, targetCurrencyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExchangeVApi#apiV3ForexServiceExchangeLatestGet");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

