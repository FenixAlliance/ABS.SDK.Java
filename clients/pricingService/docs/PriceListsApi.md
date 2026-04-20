# PriceListsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPriceListAsync**](PriceListsApi.md#createPriceListAsync) | **POST** /api/v2/PricingService/PriceLists | Creates a new price list |
| [**createPriceListPricesAsync**](PriceListsApi.md#createPriceListPricesAsync) | **POST** /api/v2/PricingService/PriceLists/{priceListId}/Prices | Creates a price list entry |
| [**deletePriceListAsync**](PriceListsApi.md#deletePriceListAsync) | **DELETE** /api/v2/PricingService/PriceLists/{priceListId} | Deletes a price list |
| [**deletePriceListPriceAsync**](PriceListsApi.md#deletePriceListPriceAsync) | **DELETE** /api/v2/PricingService/PriceLists/{priceListId}/Prices/{priceId} | Deletes a price list entry |
| [**getPriceListAsync**](PriceListsApi.md#getPriceListAsync) | **GET** /api/v2/PricingService/PriceLists/{priceListId} | Gets a price list by ID |
| [**getPriceListPriceAsync**](PriceListsApi.md#getPriceListPriceAsync) | **GET** /api/v2/PricingService/PriceLists/{priceListId}/Prices/{priceId} | Gets a price list entry by ID |
| [**getPriceListPricesAsync**](PriceListsApi.md#getPriceListPricesAsync) | **GET** /api/v2/PricingService/PriceLists/{priceListId}/Prices | Retrieves prices in a price list |
| [**getPriceListsAsync**](PriceListsApi.md#getPriceListsAsync) | **GET** /api/v2/PricingService/PriceLists | Retrieves all price lists |
| [**getPriceListsCountAsync**](PriceListsApi.md#getPriceListsCountAsync) | **GET** /api/v2/PricingService/PriceLists/Count | Counts price lists |
| [**updatePriceListAsync**](PriceListsApi.md#updatePriceListAsync) | **PUT** /api/v2/PricingService/PriceLists/{priceListId} | Updates a price list |
| [**updatePriceListPriceAsync**](PriceListsApi.md#updatePriceListPriceAsync) | **PUT** /api/v2/PricingService/PriceLists/{priceListId}/Prices/{priceId} | Updates a price list entry |


<a id="createPriceListAsync"></a>
# **createPriceListAsync**
> EmptyEnvelope createPriceListAsync(tenantId, priceListCreateDto)

Creates a new price list

Creates a new price list for the current tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PriceListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PriceListsApi apiInstance = new PriceListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    PriceListCreateDto priceListCreateDto = new PriceListCreateDto(); // PriceListCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createPriceListAsync(tenantId, priceListCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListsApi#createPriceListAsync");
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
| **priceListCreateDto** | [**PriceListCreateDto**](PriceListCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="createPriceListPricesAsync"></a>
# **createPriceListPricesAsync**
> EmptyEnvelope createPriceListPricesAsync(tenantId, priceListId, itemPriceCreateDto)

Creates a price list entry

Creates a new price entry in the specified price list.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PriceListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PriceListsApi apiInstance = new PriceListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID priceListId = UUID.randomUUID(); // UUID | 
    ItemPriceCreateDto itemPriceCreateDto = new ItemPriceCreateDto(); // ItemPriceCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createPriceListPricesAsync(tenantId, priceListId, itemPriceCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListsApi#createPriceListPricesAsync");
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
| **priceListId** | **UUID**|  | |
| **itemPriceCreateDto** | [**ItemPriceCreateDto**](ItemPriceCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="deletePriceListAsync"></a>
# **deletePriceListAsync**
> EmptyEnvelope deletePriceListAsync(tenantId, priceListId)

Deletes a price list

Deletes the specified price list.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PriceListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PriceListsApi apiInstance = new PriceListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID priceListId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.deletePriceListAsync(tenantId, priceListId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListsApi#deletePriceListAsync");
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
| **priceListId** | **UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="deletePriceListPriceAsync"></a>
# **deletePriceListPriceAsync**
> EmptyEnvelope deletePriceListPriceAsync(tenantId, priceListId, priceId)

Deletes a price list entry

Deletes the specified price entry from a price list.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PriceListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PriceListsApi apiInstance = new PriceListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID priceListId = UUID.randomUUID(); // UUID | 
    UUID priceId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.deletePriceListPriceAsync(tenantId, priceListId, priceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListsApi#deletePriceListPriceAsync");
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
| **priceListId** | **UUID**|  | |
| **priceId** | **UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getPriceListAsync"></a>
# **getPriceListAsync**
> PriceListDtoEnvelope getPriceListAsync(tenantId, priceListId)

Gets a price list by ID

Retrieves the details of a price list using its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PriceListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PriceListsApi apiInstance = new PriceListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID priceListId = UUID.randomUUID(); // UUID | 
    try {
      PriceListDtoEnvelope result = apiInstance.getPriceListAsync(tenantId, priceListId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListsApi#getPriceListAsync");
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
| **priceListId** | **UUID**|  | |

### Return type

[**PriceListDtoEnvelope**](PriceListDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getPriceListPriceAsync"></a>
# **getPriceListPriceAsync**
> ItemPriceDtoEnvelope getPriceListPriceAsync(tenantId, priceListId, priceId)

Gets a price list entry by ID

Retrieves a specific price entry from a price list.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PriceListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PriceListsApi apiInstance = new PriceListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID priceListId = UUID.randomUUID(); // UUID | 
    UUID priceId = UUID.randomUUID(); // UUID | 
    try {
      ItemPriceDtoEnvelope result = apiInstance.getPriceListPriceAsync(tenantId, priceListId, priceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListsApi#getPriceListPriceAsync");
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
| **priceListId** | **UUID**|  | |
| **priceId** | **UUID**|  | |

### Return type

[**ItemPriceDtoEnvelope**](ItemPriceDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getPriceListPricesAsync"></a>
# **getPriceListPricesAsync**
> ItemPriceDtoListEnvelope getPriceListPricesAsync(tenantId, priceListId, itemId)

Retrieves prices in a price list

Gets all price entries for a specific price list with OData support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PriceListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PriceListsApi apiInstance = new PriceListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID priceListId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    try {
      ItemPriceDtoListEnvelope result = apiInstance.getPriceListPricesAsync(tenantId, priceListId, itemId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListsApi#getPriceListPricesAsync");
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
| **priceListId** | **UUID**|  | |
| **itemId** | **UUID**|  | [optional] |

### Return type

[**ItemPriceDtoListEnvelope**](ItemPriceDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getPriceListsAsync"></a>
# **getPriceListsAsync**
> PriceListDtoListEnvelope getPriceListsAsync(tenantId)

Retrieves all price lists

Gets all price lists for the current tenant with OData support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PriceListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PriceListsApi apiInstance = new PriceListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      PriceListDtoListEnvelope result = apiInstance.getPriceListsAsync(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListsApi#getPriceListsAsync");
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

### Return type

[**PriceListDtoListEnvelope**](PriceListDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getPriceListsCountAsync"></a>
# **getPriceListsCountAsync**
> Int32Envelope getPriceListsCountAsync(tenantId)

Counts price lists

Gets the count of price lists for the current tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PriceListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PriceListsApi apiInstance = new PriceListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.getPriceListsCountAsync(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListsApi#getPriceListsCountAsync");
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

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="updatePriceListAsync"></a>
# **updatePriceListAsync**
> EmptyEnvelope updatePriceListAsync(tenantId, priceListId, priceListUpdateDto)

Updates a price list

Updates the specified price list.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PriceListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PriceListsApi apiInstance = new PriceListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID priceListId = UUID.randomUUID(); // UUID | 
    PriceListUpdateDto priceListUpdateDto = new PriceListUpdateDto(); // PriceListUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updatePriceListAsync(tenantId, priceListId, priceListUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListsApi#updatePriceListAsync");
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
| **priceListId** | **UUID**|  | |
| **priceListUpdateDto** | [**PriceListUpdateDto**](PriceListUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="updatePriceListPriceAsync"></a>
# **updatePriceListPriceAsync**
> EmptyEnvelope updatePriceListPriceAsync(tenantId, priceListId, priceId, itemPriceUpdateDto)

Updates a price list entry

Updates the specified price entry in a price list.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PriceListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PriceListsApi apiInstance = new PriceListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID priceListId = UUID.randomUUID(); // UUID | 
    UUID priceId = UUID.randomUUID(); // UUID | 
    ItemPriceUpdateDto itemPriceUpdateDto = new ItemPriceUpdateDto(); // ItemPriceUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updatePriceListPriceAsync(tenantId, priceListId, priceId, itemPriceUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListsApi#updatePriceListPriceAsync");
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
| **priceListId** | **UUID**|  | |
| **priceId** | **UUID**|  | |
| **itemPriceUpdateDto** | [**ItemPriceUpdateDto**](ItemPriceUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

