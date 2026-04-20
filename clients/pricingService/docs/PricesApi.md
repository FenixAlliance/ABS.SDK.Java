# PricesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getFinalPrice**](PricesApi.md#getFinalPrice) | **GET** /api/v2/PricingService/Prices/{itemId}/FinalPrice | Gets the final price for an item |
| [**getPrice**](PricesApi.md#getPrice) | **GET** /api/v2/PricingService/Prices/{itemId}/Price | Gets the calculated price for an item |
| [**getTotalSavingsInUsd**](PricesApi.md#getTotalSavingsInUsd) | **GET** /api/v2/PricingService/Prices/{itemId}/TotalSavings | Gets total savings for an item |
| [**getTotalTaxesInUsd**](PricesApi.md#getTotalTaxesInUsd) | **GET** /api/v2/PricingService/Prices/{itemId}/TotalTaxes | Gets total taxes for an item |


<a id="getFinalPrice"></a>
# **getFinalPrice**
> MoneyEnvelope getFinalPrice(itemId, currencyId, apiVersion, xApiVersion)

Gets the final price for an item

Gets the final price for an item after all discounts and taxes in the specified currency.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PricesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PricesApi apiInstance = new PricesApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    String currencyId = "USD.USA"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      MoneyEnvelope result = apiInstance.getFinalPrice(itemId, currencyId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PricesApi#getFinalPrice");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |

<a id="getPrice"></a>
# **getPrice**
> ItemPriceCalculationEnvelope getPrice(itemId, priceListId, discountsListId, quantity, currencyId, apiVersion, xApiVersion)

Gets the calculated price for an item

Calculates the price for an item considering price list, discount list, quantity, and currency.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PricesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PricesApi apiInstance = new PricesApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID priceListId = UUID.randomUUID(); // UUID | 
    UUID discountsListId = UUID.randomUUID(); // UUID | 
    Double quantity = 1D; // Double | 
    String currencyId = "USD.USA"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemPriceCalculationEnvelope result = apiInstance.getPrice(itemId, priceListId, discountsListId, quantity, currencyId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PricesApi#getPrice");
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
| **quantity** | **Double**|  | [optional] [default to 1] |
| **currencyId** | **String**|  | [optional] [default to USD.USA] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemPriceCalculationEnvelope**](ItemPriceCalculationEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |

<a id="getTotalSavingsInUsd"></a>
# **getTotalSavingsInUsd**
> MoneyEnvelope getTotalSavingsInUsd(itemId, currencyId, apiVersion, xApiVersion)

Gets total savings for an item

Gets the total savings amount for an item in the specified currency.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PricesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PricesApi apiInstance = new PricesApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    String currencyId = "USD.USA"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      MoneyEnvelope result = apiInstance.getTotalSavingsInUsd(itemId, currencyId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PricesApi#getTotalSavingsInUsd");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |

<a id="getTotalTaxesInUsd"></a>
# **getTotalTaxesInUsd**
> MoneyEnvelope getTotalTaxesInUsd(itemId, currencyId, apiVersion, xApiVersion)

Gets total taxes for an item

Gets the total tax amount for an item in the specified currency.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PricesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PricesApi apiInstance = new PricesApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    String currencyId = "USD.USA"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      MoneyEnvelope result = apiInstance.getTotalTaxesInUsd(itemId, currencyId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PricesApi#getTotalTaxesInUsd");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |

