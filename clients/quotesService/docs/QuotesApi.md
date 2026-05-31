# QuotesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**calculateQuote**](QuotesApi.md#calculateQuote) | **PUT** /api/v2/QuotesService/Quotes/{quoteId}/Calculate | Calculate a quote. |
| [**calculateQuoteLine**](QuotesApi.md#calculateQuoteLine) | **PUT** /api/v2/QuotesService/Quotes/{quoteId}/Lines/{quoteLineId}/Calculate | Calculate a quote line. |
| [**closeQuote**](QuotesApi.md#closeQuote) | **PUT** /api/v2/QuotesService/Quotes/{quoteId}/Close | Close a quote. |
| [**createOrderFromQuote**](QuotesApi.md#createOrderFromQuote) | **POST** /api/v2/QuotesService/Quotes/{quoteId}/Orders | Create an order from a quote. |
| [**createQuote**](QuotesApi.md#createQuote) | **POST** /api/v2/QuotesService/Quotes | Create a new quote. |
| [**createQuoteLine**](QuotesApi.md#createQuoteLine) | **POST** /api/v2/QuotesService/Quotes/{quoteId}/Lines | Create a new quote line. |
| [**deleteQuote**](QuotesApi.md#deleteQuote) | **DELETE** /api/v2/QuotesService/Quotes/{quoteId} | Delete a quote. |
| [**deleteQuoteLine**](QuotesApi.md#deleteQuoteLine) | **DELETE** /api/v2/QuotesService/Quotes/{quoteId}/Lines/{quoteLineId} | Delete a quote line. |
| [**getExtendedQuotes**](QuotesApi.md#getExtendedQuotes) | **GET** /api/v2/QuotesService/Quotes/Extended | Get a list of extended quotes. |
| [**getQuote**](QuotesApi.md#getQuote) | **GET** /api/v2/QuotesService/Quotes/{quoteId} | Get a quote by ID. |
| [**getQuoteLine**](QuotesApi.md#getQuoteLine) | **GET** /api/v2/QuotesService/Quotes/{quoteId}/Lines/{quoteLineId} | Get a quote line by ID. |
| [**getQuoteLines**](QuotesApi.md#getQuoteLines) | **GET** /api/v2/QuotesService/Quotes/{quoteId}/Lines | Get quote lines for a quote. |
| [**getQuoteLinesCount**](QuotesApi.md#getQuoteLinesCount) | **GET** /api/v2/QuotesService/Quotes/{quoteId}/Lines/Count | Get the count of quote lines. |
| [**getQuotes**](QuotesApi.md#getQuotes) | **GET** /api/v2/QuotesService/Quotes | Get a list of quotes. |
| [**getQuotesCount**](QuotesApi.md#getQuotesCount) | **GET** /api/v2/QuotesService/Quotes/Count | Get the count of quotes. |
| [**previewQuoteEmailTemplate**](QuotesApi.md#previewQuoteEmailTemplate) | **POST** /api/v2/QuotesService/Quotes/{quoteId}/Emails/Preview | Preview the rendered email for an invoice. |
| [**quoteLineExists**](QuotesApi.md#quoteLineExists) | **GET** /api/v2/QuotesService/Quotes/{quoteId}/Lines/Exists | Check if a quote line exists. |
| [**reopenQuote**](QuotesApi.md#reopenQuote) | **PUT** /api/v2/QuotesService/Quotes/{quoteId}/Reopen | Reopen a closed quote. |
| [**sendQuoteEmail**](QuotesApi.md#sendQuoteEmail) | **POST** /api/v2/QuotesService/Quotes/{quoteId}/Emails/Send | Send a quote transactional email to recipients. |
| [**updateQuote**](QuotesApi.md#updateQuote) | **PUT** /api/v2/QuotesService/Quotes/{quoteId} | Update an existing quote. |
| [**updateQuoteLine**](QuotesApi.md#updateQuoteLine) | **PUT** /api/v2/QuotesService/Quotes/{quoteId}/Lines/{quoteLineId} | Update a quote line. |
| [**upsertQuoteLine**](QuotesApi.md#upsertQuoteLine) | **PUT** /api/v2/QuotesService/Quotes/{quoteId}/Lines/{quoteLineId}/Upsert | Upsert a quote line. |


<a id="calculateQuote"></a>
# **calculateQuote**
> EmptyEnvelope calculateQuote(tenantId, quoteId)

Calculate a quote.

Performs calculation logic for the specified quote.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID quoteId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.calculateQuote(tenantId, quoteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#calculateQuote");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="calculateQuoteLine"></a>
# **calculateQuoteLine**
> EmptyEnvelope calculateQuoteLine(tenantId, quoteId, quoteLineId)

Calculate a quote line.

Performs calculation logic for the specified quote line.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID quoteId = UUID.randomUUID(); // UUID | 
    UUID quoteLineId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.calculateQuoteLine(tenantId, quoteId, quoteLineId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#calculateQuoteLine");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="closeQuote"></a>
# **closeQuote**
> EmptyEnvelope closeQuote(tenantId, quoteId)

Close a quote.

Closes the specified quote for the tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID quoteId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.closeQuote(tenantId, quoteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#closeQuote");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="createOrderFromQuote"></a>
# **createOrderFromQuote**
> EmptyEnvelope createOrderFromQuote(tenantId, quoteId)

Create an order from a quote.

Creates an order based on the specified quote for the tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID quoteId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.createOrderFromQuote(tenantId, quoteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#createOrderFromQuote");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="createQuote"></a>
# **createQuote**
> EmptyEnvelope createQuote(tenantId, quoteCreateDto)

Create a new quote.

Creates a new quote for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    QuoteCreateDto quoteCreateDto = new QuoteCreateDto(); // QuoteCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createQuote(tenantId, quoteCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#createQuote");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="createQuoteLine"></a>
# **createQuoteLine**
> EmptyEnvelope createQuoteLine(tenantId, quoteId, quoteLineCreateDto)

Create a new quote line.

Creates a new quote line for the specified quote and tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID quoteId = UUID.randomUUID(); // UUID | 
    QuoteLineCreateDto quoteLineCreateDto = new QuoteLineCreateDto(); // QuoteLineCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createQuoteLine(tenantId, quoteId, quoteLineCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#createQuoteLine");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="deleteQuote"></a>
# **deleteQuote**
> EmptyEnvelope deleteQuote(quoteId, tenantId)

Delete a quote.

Deletes the specified quote for the tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    UUID quoteId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.deleteQuote(quoteId, tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#deleteQuote");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="deleteQuoteLine"></a>
# **deleteQuoteLine**
> EmptyEnvelope deleteQuoteLine(tenantId, quoteId, quoteLineId)

Delete a quote line.

Deletes the specified quote line for the quote and tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID quoteId = UUID.randomUUID(); // UUID | 
    UUID quoteLineId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.deleteQuoteLine(tenantId, quoteId, quoteLineId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#deleteQuoteLine");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getExtendedQuotes"></a>
# **getExtendedQuotes**
> ExtendedQuoteDtoListEnvelope getExtendedQuotes(tenantId)

Get a list of extended quotes.

Retrieves a list of extended quotes for the specified tenant, supporting OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      ExtendedQuoteDtoListEnvelope result = apiInstance.getExtendedQuotes(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#getExtendedQuotes");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getQuote"></a>
# **getQuote**
> QuoteDtoEnvelope getQuote(tenantId, quoteId)

Get a quote by ID.

Retrieves a single quote by its unique identifier for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID quoteId = UUID.randomUUID(); // UUID | 
    try {
      QuoteDtoEnvelope result = apiInstance.getQuote(tenantId, quoteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#getQuote");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getQuoteLine"></a>
# **getQuoteLine**
> QuoteLineDtoEnvelope getQuoteLine(tenantId, quoteId, quoteLineId)

Get a quote line by ID.

Retrieves a single quote line by its unique identifier for the specified quote and tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID quoteId = UUID.randomUUID(); // UUID | 
    UUID quoteLineId = UUID.randomUUID(); // UUID | 
    try {
      QuoteLineDtoEnvelope result = apiInstance.getQuoteLine(tenantId, quoteId, quoteLineId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#getQuoteLine");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getQuoteLines"></a>
# **getQuoteLines**
> QuoteLineDtoListEnvelope getQuoteLines(tenantId, quoteId, itemId)

Get quote lines for a quote.

Retrieves all quote lines for the specified quote and tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID quoteId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    try {
      QuoteLineDtoListEnvelope result = apiInstance.getQuoteLines(tenantId, quoteId, itemId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#getQuoteLines");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getQuoteLinesCount"></a>
# **getQuoteLinesCount**
> Int32Envelope getQuoteLinesCount(tenantId, quoteId)

Get the count of quote lines.

Retrieves the total count of quote lines for the specified quote and tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID quoteId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.getQuoteLinesCount(tenantId, quoteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#getQuoteLinesCount");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getQuotes"></a>
# **getQuotes**
> QuoteDtoListEnvelope getQuotes(tenantId)

Get a list of quotes.

Retrieves a list of quotes for the specified tenant, supporting OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      QuoteDtoListEnvelope result = apiInstance.getQuotes(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#getQuotes");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getQuotesCount"></a>
# **getQuotesCount**
> Int32Envelope getQuotesCount(tenantId)

Get the count of quotes.

Retrieves the total count of quotes for the specified tenant, supporting OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.getQuotesCount(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#getQuotesCount");
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

<a id="previewQuoteEmailTemplate"></a>
# **previewQuoteEmailTemplate**
> previewQuoteEmailTemplate(quoteId, tenantId, emailDispatchRequest)

Preview the rendered email for an invoice.

This action is only available for users with the &#39;send_email&#39; permission.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    UUID quoteId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    EmailDispatchRequest emailDispatchRequest = new EmailDispatchRequest(); // EmailDispatchRequest | 
    try {
      apiInstance.previewQuoteEmailTemplate(quoteId, tenantId, emailDispatchRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#previewQuoteEmailTemplate");
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
| **emailDispatchRequest** | [**EmailDispatchRequest**](EmailDispatchRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="quoteLineExists"></a>
# **quoteLineExists**
> BooleanEnvelope quoteLineExists(tenantId, quoteId, quoteLineId, itemId)

Check if a quote line exists.

Checks if a quote line exists for the specified quote and tenant, by quote line ID or item ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID quoteId = UUID.randomUUID(); // UUID | 
    UUID quoteLineId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    try {
      BooleanEnvelope result = apiInstance.quoteLineExists(tenantId, quoteId, quoteLineId, itemId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#quoteLineExists");
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
| **quoteLineId** | **UUID**|  | [optional] |
| **itemId** | **UUID**|  | [optional] |

### Return type

[**BooleanEnvelope**](BooleanEnvelope.md)

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

<a id="reopenQuote"></a>
# **reopenQuote**
> EmptyEnvelope reopenQuote(tenantId, quoteId)

Reopen a closed quote.

Reopens a previously closed quote for the tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID quoteId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.reopenQuote(tenantId, quoteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#reopenQuote");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="sendQuoteEmail"></a>
# **sendQuoteEmail**
> EmptyEnvelope sendQuoteEmail(tenantId, quoteId, emailDispatchRequest)

Send a quote transactional email to recipients.

This action is only available for users with the &#39;send_email&#39; permission.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID quoteId = UUID.randomUUID(); // UUID | 
    EmailDispatchRequest emailDispatchRequest = new EmailDispatchRequest(); // EmailDispatchRequest | 
    try {
      EmptyEnvelope result = apiInstance.sendQuoteEmail(tenantId, quoteId, emailDispatchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#sendQuoteEmail");
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
| **emailDispatchRequest** | [**EmailDispatchRequest**](EmailDispatchRequest.md)|  | [optional] |

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
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="updateQuote"></a>
# **updateQuote**
> EmptyEnvelope updateQuote(tenantId, quoteId, quoteUpdateDto)

Update an existing quote.

Updates an existing quote for the specified tenant and quote ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID quoteId = UUID.randomUUID(); // UUID | 
    QuoteUpdateDto quoteUpdateDto = new QuoteUpdateDto(); // QuoteUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateQuote(tenantId, quoteId, quoteUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#updateQuote");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="updateQuoteLine"></a>
# **updateQuoteLine**
> EmptyEnvelope updateQuoteLine(tenantId, quoteId, quoteLineId, quoteLineUpdateDto)

Update a quote line.

Updates an existing quote line for the specified quote and tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID quoteId = UUID.randomUUID(); // UUID | 
    UUID quoteLineId = UUID.randomUUID(); // UUID | 
    QuoteLineUpdateDto quoteLineUpdateDto = new QuoteLineUpdateDto(); // QuoteLineUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateQuoteLine(tenantId, quoteId, quoteLineId, quoteLineUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#updateQuoteLine");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="upsertQuoteLine"></a>
# **upsertQuoteLine**
> EmptyEnvelope upsertQuoteLine(tenantId, quoteId, quoteLineId, quoteLineUpsertDto)

Upsert a quote line.

Creates or updates a quote line for the specified quote and tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID quoteId = UUID.randomUUID(); // UUID | 
    UUID quoteLineId = UUID.randomUUID(); // UUID | 
    QuoteLineUpsertDto quoteLineUpsertDto = new QuoteLineUpsertDto(); // QuoteLineUpsertDto | 
    try {
      EmptyEnvelope result = apiInstance.upsertQuoteLine(tenantId, quoteId, quoteLineId, quoteLineUpsertDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#upsertQuoteLine");
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
| **quoteLineUpsertDto** | [**QuoteLineUpsertDto**](QuoteLineUpsertDto.md)|  | [optional] |

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

