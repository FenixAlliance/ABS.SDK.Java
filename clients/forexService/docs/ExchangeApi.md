# ExchangeApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2ForexServiceExchangeHistoryGet**](ExchangeApi.md#apiV2ForexServiceExchangeHistoryGet) | **GET** /api/v2/ForexService/Exchange/History |  |
| [**apiV2ForexServiceExchangeLatestGet**](ExchangeApi.md#apiV2ForexServiceExchangeLatestGet) | **GET** /api/v2/ForexService/Exchange/Latest |  |


<a id="apiV2ForexServiceExchangeHistoryGet"></a>
# **apiV2ForexServiceExchangeHistoryGet**
> MoneyEnvelope apiV2ForexServiceExchangeHistoryGet(amount, sourceCurrencyId, targetCurrencyId, date)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ExchangeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ExchangeApi apiInstance = new ExchangeApi(defaultClient);
    Double amount = 3.4D; // Double | 
    String sourceCurrencyId = "sourceCurrencyId_example"; // String | 
    String targetCurrencyId = "targetCurrencyId_example"; // String | 
    LocalDate date = LocalDate.now(); // LocalDate | 
    try {
      MoneyEnvelope result = apiInstance.apiV2ForexServiceExchangeHistoryGet(amount, sourceCurrencyId, targetCurrencyId, date);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExchangeApi#apiV2ForexServiceExchangeHistoryGet");
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

<a id="apiV2ForexServiceExchangeLatestGet"></a>
# **apiV2ForexServiceExchangeLatestGet**
> MoneyEnvelope apiV2ForexServiceExchangeLatestGet(amount, sourceCurrencyId, targetCurrencyId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ExchangeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ExchangeApi apiInstance = new ExchangeApi(defaultClient);
    Double amount = 3.4D; // Double | 
    String sourceCurrencyId = "sourceCurrencyId_example"; // String | 
    String targetCurrencyId = "targetCurrencyId_example"; // String | 
    try {
      MoneyEnvelope result = apiInstance.apiV2ForexServiceExchangeLatestGet(amount, sourceCurrencyId, targetCurrencyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExchangeApi#apiV2ForexServiceExchangeLatestGet");
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

