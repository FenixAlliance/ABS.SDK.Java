# QuotesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2QuotesServiceQuotesCountGet**](QuotesApi.md#apiV2QuotesServiceQuotesCountGet) | **GET** /api/v2/QuotesService/Quotes/Count |  |
| [**apiV2QuotesServiceQuotesExtendedGet**](QuotesApi.md#apiV2QuotesServiceQuotesExtendedGet) | **GET** /api/v2/QuotesService/Quotes/Extended |  |
| [**apiV2QuotesServiceQuotesGet**](QuotesApi.md#apiV2QuotesServiceQuotesGet) | **GET** /api/v2/QuotesService/Quotes |  |
| [**apiV2QuotesServiceQuotesPost**](QuotesApi.md#apiV2QuotesServiceQuotesPost) | **POST** /api/v2/QuotesService/Quotes |  |
| [**apiV2QuotesServiceQuotesQuoteIdCalculatePut**](QuotesApi.md#apiV2QuotesServiceQuotesQuoteIdCalculatePut) | **PUT** /api/v2/QuotesService/Quotes/{quoteId}/Calculate |  |
| [**apiV2QuotesServiceQuotesQuoteIdDelete**](QuotesApi.md#apiV2QuotesServiceQuotesQuoteIdDelete) | **DELETE** /api/v2/QuotesService/Quotes/{quoteId} |  |
| [**apiV2QuotesServiceQuotesQuoteIdLinesCountGet**](QuotesApi.md#apiV2QuotesServiceQuotesQuoteIdLinesCountGet) | **GET** /api/v2/QuotesService/Quotes/{quoteId}/Lines/Count |  |
| [**apiV2QuotesServiceQuotesQuoteIdLinesGet**](QuotesApi.md#apiV2QuotesServiceQuotesQuoteIdLinesGet) | **GET** /api/v2/QuotesService/Quotes/{quoteId}/Lines |  |
| [**apiV2QuotesServiceQuotesQuoteIdLinesPost**](QuotesApi.md#apiV2QuotesServiceQuotesQuoteIdLinesPost) | **POST** /api/v2/QuotesService/Quotes/{quoteId}/Lines |  |
| [**apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdCalculatePut**](QuotesApi.md#apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdCalculatePut) | **PUT** /api/v2/QuotesService/Quotes/{quoteId}/Lines/{quoteLineId}/Calculate |  |
| [**apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdDelete**](QuotesApi.md#apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdDelete) | **DELETE** /api/v2/QuotesService/Quotes/{quoteId}/Lines/{quoteLineId} |  |
| [**apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdGet**](QuotesApi.md#apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdGet) | **GET** /api/v2/QuotesService/Quotes/{quoteId}/Lines/{quoteLineId} |  |
| [**apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdPut**](QuotesApi.md#apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdPut) | **PUT** /api/v2/QuotesService/Quotes/{quoteId}/Lines/{quoteLineId} |  |
| [**apiV2QuotesServiceQuotesQuoteIdPut**](QuotesApi.md#apiV2QuotesServiceQuotesQuoteIdPut) | **PUT** /api/v2/QuotesService/Quotes/{quoteId} |  |
| [**getQuoteAsync**](QuotesApi.md#getQuoteAsync) | **GET** /api/v2/QuotesService/Quotes/{quoteId} |  |


<a id="apiV2QuotesServiceQuotesCountGet"></a>
# **apiV2QuotesServiceQuotesCountGet**
> Int32Envelope apiV2QuotesServiceQuotesCountGet(tenantId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.apiV2QuotesServiceQuotesCountGet(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#apiV2QuotesServiceQuotesCountGet");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2QuotesServiceQuotesExtendedGet"></a>
# **apiV2QuotesServiceQuotesExtendedGet**
> ExtendedQuoteDtoListEnvelope apiV2QuotesServiceQuotesExtendedGet(tenantId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      ExtendedQuoteDtoListEnvelope result = apiInstance.apiV2QuotesServiceQuotesExtendedGet(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#apiV2QuotesServiceQuotesExtendedGet");
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

[**ExtendedQuoteDtoListEnvelope**](ExtendedQuoteDtoListEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2QuotesServiceQuotesGet"></a>
# **apiV2QuotesServiceQuotesGet**
> QuoteDtoListEnvelope apiV2QuotesServiceQuotesGet(tenantId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      QuoteDtoListEnvelope result = apiInstance.apiV2QuotesServiceQuotesGet(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#apiV2QuotesServiceQuotesGet");
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

[**QuoteDtoListEnvelope**](QuoteDtoListEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2QuotesServiceQuotesPost"></a>
# **apiV2QuotesServiceQuotesPost**
> EmptyEnvelope apiV2QuotesServiceQuotesPost(tenantId, quoteCreateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    QuoteCreateDto quoteCreateDto = new QuoteCreateDto(); // QuoteCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.apiV2QuotesServiceQuotesPost(tenantId, quoteCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#apiV2QuotesServiceQuotesPost");
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
| **quoteCreateDto** | [**QuoteCreateDto**](QuoteCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2QuotesServiceQuotesQuoteIdCalculatePut"></a>
# **apiV2QuotesServiceQuotesQuoteIdCalculatePut**
> EmptyEnvelope apiV2QuotesServiceQuotesQuoteIdCalculatePut(tenantId, quoteId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID quoteId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.apiV2QuotesServiceQuotesQuoteIdCalculatePut(tenantId, quoteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#apiV2QuotesServiceQuotesQuoteIdCalculatePut");
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
| **quoteId** | **UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2QuotesServiceQuotesQuoteIdDelete"></a>
# **apiV2QuotesServiceQuotesQuoteIdDelete**
> EmptyEnvelope apiV2QuotesServiceQuotesQuoteIdDelete(quoteId, tenantId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    UUID quoteId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.apiV2QuotesServiceQuotesQuoteIdDelete(quoteId, tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#apiV2QuotesServiceQuotesQuoteIdDelete");
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
| **quoteId** | **UUID**|  | |
| **tenantId** | **UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2QuotesServiceQuotesQuoteIdLinesCountGet"></a>
# **apiV2QuotesServiceQuotesQuoteIdLinesCountGet**
> Int32Envelope apiV2QuotesServiceQuotesQuoteIdLinesCountGet(tenantId, quoteId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID quoteId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.apiV2QuotesServiceQuotesQuoteIdLinesCountGet(tenantId, quoteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#apiV2QuotesServiceQuotesQuoteIdLinesCountGet");
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
| **quoteId** | **UUID**|  | |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2QuotesServiceQuotesQuoteIdLinesGet"></a>
# **apiV2QuotesServiceQuotesQuoteIdLinesGet**
> QuoteLineDtoListEnvelope apiV2QuotesServiceQuotesQuoteIdLinesGet(tenantId, quoteId, itemId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID quoteId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    try {
      QuoteLineDtoListEnvelope result = apiInstance.apiV2QuotesServiceQuotesQuoteIdLinesGet(tenantId, quoteId, itemId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#apiV2QuotesServiceQuotesQuoteIdLinesGet");
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
| **quoteId** | **UUID**|  | |
| **itemId** | **UUID**|  | [optional] |

### Return type

[**QuoteLineDtoListEnvelope**](QuoteLineDtoListEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2QuotesServiceQuotesQuoteIdLinesPost"></a>
# **apiV2QuotesServiceQuotesQuoteIdLinesPost**
> EmptyEnvelope apiV2QuotesServiceQuotesQuoteIdLinesPost(tenantId, quoteId, quoteLineCreateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID quoteId = UUID.randomUUID(); // UUID | 
    QuoteLineCreateDto quoteLineCreateDto = new QuoteLineCreateDto(); // QuoteLineCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.apiV2QuotesServiceQuotesQuoteIdLinesPost(tenantId, quoteId, quoteLineCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#apiV2QuotesServiceQuotesQuoteIdLinesPost");
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
| **quoteId** | **UUID**|  | |
| **quoteLineCreateDto** | [**QuoteLineCreateDto**](QuoteLineCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdCalculatePut"></a>
# **apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdCalculatePut**
> EmptyEnvelope apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdCalculatePut(tenantId, quoteId, quoteLineId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID quoteId = UUID.randomUUID(); // UUID | 
    UUID quoteLineId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdCalculatePut(tenantId, quoteId, quoteLineId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdCalculatePut");
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
| **quoteId** | **UUID**|  | |
| **quoteLineId** | **UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdDelete"></a>
# **apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdDelete**
> EmptyEnvelope apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdDelete(tenantId, quoteId, quoteLineId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID quoteId = UUID.randomUUID(); // UUID | 
    UUID quoteLineId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdDelete(tenantId, quoteId, quoteLineId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdDelete");
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
| **quoteId** | **UUID**|  | |
| **quoteLineId** | **UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdGet"></a>
# **apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdGet**
> QuoteLineDtoEnvelope apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdGet(tenantId, quoteId, quoteLineId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID quoteId = UUID.randomUUID(); // UUID | 
    UUID quoteLineId = UUID.randomUUID(); // UUID | 
    try {
      QuoteLineDtoEnvelope result = apiInstance.apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdGet(tenantId, quoteId, quoteLineId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdGet");
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
| **quoteId** | **UUID**|  | |
| **quoteLineId** | **UUID**|  | |

### Return type

[**QuoteLineDtoEnvelope**](QuoteLineDtoEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdPut"></a>
# **apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdPut**
> EmptyEnvelope apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdPut(tenantId, quoteId, quoteLineId, quoteLineUpdateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID quoteId = UUID.randomUUID(); // UUID | 
    UUID quoteLineId = UUID.randomUUID(); // UUID | 
    QuoteLineUpdateDto quoteLineUpdateDto = new QuoteLineUpdateDto(); // QuoteLineUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdPut(tenantId, quoteId, quoteLineId, quoteLineUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdPut");
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
| **quoteId** | **UUID**|  | |
| **quoteLineId** | **UUID**|  | |
| **quoteLineUpdateDto** | [**QuoteLineUpdateDto**](QuoteLineUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2QuotesServiceQuotesQuoteIdPut"></a>
# **apiV2QuotesServiceQuotesQuoteIdPut**
> EmptyEnvelope apiV2QuotesServiceQuotesQuoteIdPut(tenantId, quoteId, quoteUpdateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID quoteId = UUID.randomUUID(); // UUID | 
    QuoteUpdateDto quoteUpdateDto = new QuoteUpdateDto(); // QuoteUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.apiV2QuotesServiceQuotesQuoteIdPut(tenantId, quoteId, quoteUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#apiV2QuotesServiceQuotesQuoteIdPut");
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
| **quoteId** | **UUID**|  | |
| **quoteUpdateDto** | [**QuoteUpdateDto**](QuoteUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getQuoteAsync"></a>
# **getQuoteAsync**
> QuoteDtoEnvelope getQuoteAsync(tenantId, quoteId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID quoteId = UUID.randomUUID(); // UUID | 
    try {
      QuoteDtoEnvelope result = apiInstance.getQuoteAsync(tenantId, quoteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#getQuoteAsync");
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
| **quoteId** | **UUID**|  | |

### Return type

[**QuoteDtoEnvelope**](QuoteDtoEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

