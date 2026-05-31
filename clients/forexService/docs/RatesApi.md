# RatesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getHistoricalCurrencyRateAsync**](RatesApi.md#getHistoricalCurrencyRateAsync) | **GET** /api/v2/ForexService/Rates/History/{currencyId} | Get historical rate for a currency |
| [**getHistoricalCurrencyRatesAsync**](RatesApi.md#getHistoricalCurrencyRatesAsync) | **GET** /api/v2/ForexService/Rates/History | Get historical currency rates |
| [**getLatestCurrencyRateAsync**](RatesApi.md#getLatestCurrencyRateAsync) | **GET** /api/v2/ForexService/Rates/Latest/{currencyId} | Get latest rate for a currency |
| [**getLatestCurrencyRatesModelAsync**](RatesApi.md#getLatestCurrencyRatesModelAsync) | **GET** /api/v2/ForexService/Rates/Latest | Get latest currency rates |


<a id="getHistoricalCurrencyRateAsync"></a>
# **getHistoricalCurrencyRateAsync**
> ExchangeRateEnvelope getHistoricalCurrencyRateAsync(currencyId, date, apiVersion, xApiVersion)

Get historical rate for a currency

Retrieves the exchange rate for a specific currency as of a specific historical date.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RatesApi apiInstance = new RatesApi(defaultClient);
    String currencyId = "currencyId_example"; // String | 
    OffsetDateTime date = OffsetDateTime.now(); // OffsetDateTime | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ExchangeRateEnvelope result = apiInstance.getHistoricalCurrencyRateAsync(currencyId, date, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RatesApi#getHistoricalCurrencyRateAsync");
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
| **currencyId** | **String**|  | |
| **date** | **OffsetDateTime**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

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

<a id="getHistoricalCurrencyRatesAsync"></a>
# **getHistoricalCurrencyRatesAsync**
> ForexRatesDtoEnvelope getHistoricalCurrencyRatesAsync(date, apiVersion, xApiVersion)

Get historical currency rates

Retrieves exchange rates for all supported currencies as of a specific historical date.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RatesApi apiInstance = new RatesApi(defaultClient);
    OffsetDateTime date = OffsetDateTime.now(); // OffsetDateTime | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ForexRatesDtoEnvelope result = apiInstance.getHistoricalCurrencyRatesAsync(date, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RatesApi#getHistoricalCurrencyRatesAsync");
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
| **date** | **OffsetDateTime**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ForexRatesDtoEnvelope**](ForexRatesDtoEnvelope.md)

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

<a id="getLatestCurrencyRateAsync"></a>
# **getLatestCurrencyRateAsync**
> ExchangeRateEnvelope getLatestCurrencyRateAsync(currencyId, apiVersion, xApiVersion)

Get latest rate for a currency

Retrieves the latest exchange rate for a specific currency by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RatesApi apiInstance = new RatesApi(defaultClient);
    String currencyId = "currencyId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ExchangeRateEnvelope result = apiInstance.getLatestCurrencyRateAsync(currencyId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RatesApi#getLatestCurrencyRateAsync");
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
| **currencyId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

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

<a id="getLatestCurrencyRatesModelAsync"></a>
# **getLatestCurrencyRatesModelAsync**
> ForexRatesDtoEnvelope getLatestCurrencyRatesModelAsync(apiVersion, xApiVersion)

Get latest currency rates

Retrieves the latest exchange rates for all supported currencies.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RatesApi apiInstance = new RatesApi(defaultClient);
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ForexRatesDtoEnvelope result = apiInstance.getLatestCurrencyRatesModelAsync(apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RatesApi#getLatestCurrencyRatesModelAsync");
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
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ForexRatesDtoEnvelope**](ForexRatesDtoEnvelope.md)

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

