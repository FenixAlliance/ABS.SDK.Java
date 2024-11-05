# PricesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2PricingServicePricesItemIdFinalPriceGet**](PricesApi.md#apiV2PricingServicePricesItemIdFinalPriceGet) | **GET** /api/v2/PricingService/Prices/{itemId}/FinalPrice |  |
| [**apiV2PricingServicePricesItemIdPriceGet**](PricesApi.md#apiV2PricingServicePricesItemIdPriceGet) | **GET** /api/v2/PricingService/Prices/{itemId}/Price |  |
| [**apiV2PricingServicePricesItemIdTotalSavingsGet**](PricesApi.md#apiV2PricingServicePricesItemIdTotalSavingsGet) | **GET** /api/v2/PricingService/Prices/{itemId}/TotalSavings |  |
| [**apiV2PricingServicePricesItemIdTotalTaxesGet**](PricesApi.md#apiV2PricingServicePricesItemIdTotalTaxesGet) | **GET** /api/v2/PricingService/Prices/{itemId}/TotalTaxes |  |


<a id="apiV2PricingServicePricesItemIdFinalPriceGet"></a>
# **apiV2PricingServicePricesItemIdFinalPriceGet**
> MoneyEnvelope apiV2PricingServicePricesItemIdFinalPriceGet(itemId, currencyId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PricesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    PricesApi apiInstance = new PricesApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    String currencyId = "USD.USA"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      MoneyEnvelope result = apiInstance.apiV2PricingServicePricesItemIdFinalPriceGet(itemId, currencyId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PricesApi#apiV2PricingServicePricesItemIdFinalPriceGet");
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
| **itemId** | **UUID**|  | |
| **currencyId** | **String**|  | [optional] [default to USD.USA] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

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
| **200** | OK |  -  |
| **404** | Not Found |  -  |

<a id="apiV2PricingServicePricesItemIdPriceGet"></a>
# **apiV2PricingServicePricesItemIdPriceGet**
> PriceCalculationDtoEnvelope apiV2PricingServicePricesItemIdPriceGet(itemId, priceListId, discountsListId, currencyId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PricesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    PricesApi apiInstance = new PricesApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID priceListId = UUID.randomUUID(); // UUID | 
    UUID discountsListId = UUID.randomUUID(); // UUID | 
    String currencyId = "USD.USA"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      PriceCalculationDtoEnvelope result = apiInstance.apiV2PricingServicePricesItemIdPriceGet(itemId, priceListId, discountsListId, currencyId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PricesApi#apiV2PricingServicePricesItemIdPriceGet");
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
| **itemId** | **UUID**|  | |
| **priceListId** | **UUID**|  | [optional] |
| **discountsListId** | **UUID**|  | [optional] |
| **currencyId** | **String**|  | [optional] [default to USD.USA] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**PriceCalculationDtoEnvelope**](PriceCalculationDtoEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |

<a id="apiV2PricingServicePricesItemIdTotalSavingsGet"></a>
# **apiV2PricingServicePricesItemIdTotalSavingsGet**
> MoneyEnvelope apiV2PricingServicePricesItemIdTotalSavingsGet(itemId, currencyId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PricesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    PricesApi apiInstance = new PricesApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    String currencyId = "USD.USA"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      MoneyEnvelope result = apiInstance.apiV2PricingServicePricesItemIdTotalSavingsGet(itemId, currencyId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PricesApi#apiV2PricingServicePricesItemIdTotalSavingsGet");
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
| **itemId** | **UUID**|  | |
| **currencyId** | **String**|  | [optional] [default to USD.USA] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

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
| **200** | OK |  -  |
| **404** | Not Found |  -  |

<a id="apiV2PricingServicePricesItemIdTotalTaxesGet"></a>
# **apiV2PricingServicePricesItemIdTotalTaxesGet**
> MoneyEnvelope apiV2PricingServicePricesItemIdTotalTaxesGet(itemId, currencyId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PricesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    PricesApi apiInstance = new PricesApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    String currencyId = "USD.USA"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      MoneyEnvelope result = apiInstance.apiV2PricingServicePricesItemIdTotalTaxesGet(itemId, currencyId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PricesApi#apiV2PricingServicePricesItemIdTotalTaxesGet");
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
| **itemId** | **UUID**|  | |
| **currencyId** | **String**|  | [optional] [default to USD.USA] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

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
| **200** | OK |  -  |
| **404** | Not Found |  -  |

