# WebPagesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**countWebPagesAsync**](WebPagesApi.md#countWebPagesAsync) | **GET** /api/v2/ContentService/WebPages/Count | Count web pages |
| [**createWebPageAsync**](WebPagesApi.md#createWebPageAsync) | **POST** /api/v2/ContentService/WebPages | Create a web page |
| [**createWebPageCategoryRelationAsync**](WebPagesApi.md#createWebPageCategoryRelationAsync) | **POST** /api/v2/ContentService/WebPages/{webPageId}/Categories | Create a web page category relation |
| [**createWebPageTagRelationAsync**](WebPagesApi.md#createWebPageTagRelationAsync) | **POST** /api/v2/ContentService/WebPages/{webPageId}/Tags | Create a web page tag relation |
| [**deleteWebPageAsync**](WebPagesApi.md#deleteWebPageAsync) | **DELETE** /api/v2/ContentService/WebPages/{webPageId} | Delete a web page |
| [**getCategoriesByWebPageAsync**](WebPagesApi.md#getCategoriesByWebPageAsync) | **GET** /api/v2/ContentService/WebPages/{webPageId}/Categories | Get categories by web page |
| [**getTagsByWebPageAsync**](WebPagesApi.md#getTagsByWebPageAsync) | **GET** /api/v2/ContentService/WebPages/{webPageId}/Tags | Get tags by web page |
| [**getWebPageByIdAsync**](WebPagesApi.md#getWebPageByIdAsync) | **GET** /api/v2/ContentService/WebPages/{webPageId} | Get web page by ID |
| [**getWebPagesAsync**](WebPagesApi.md#getWebPagesAsync) | **GET** /api/v2/ContentService/WebPages | Get web pages |
| [**relateWebPageToCategoryAsync**](WebPagesApi.md#relateWebPageToCategoryAsync) | **POST** /api/v2/ContentService/WebPages/{webPageId}/Categories/{categoryId} | Relate web page to category |
| [**relateWebPageToTagAsync**](WebPagesApi.md#relateWebPageToTagAsync) | **POST** /api/v2/ContentService/WebPages/{webPageId}/Tags/{tagId} | Relate web page to tag |
| [**unrelateWebPageCategoryAsync**](WebPagesApi.md#unrelateWebPageCategoryAsync) | **DELETE** /api/v2/ContentService/WebPages/{webPageId}/Categories/{categoryId} | Unrelate web page from category |
| [**unrelateWebPageTagAsync**](WebPagesApi.md#unrelateWebPageTagAsync) | **DELETE** /api/v2/ContentService/WebPages/{webPageId}/Tags/{tagId} | Unrelate web page from tag |
| [**updateWebPageAsync**](WebPagesApi.md#updateWebPageAsync) | **PUT** /api/v2/ContentService/WebPages/{webPageId} | Update a web page |


<a id="countWebPagesAsync"></a>
# **countWebPagesAsync**
> Int32Envelope countWebPagesAsync(tenantId, apiVersion, xApiVersion)

Count web pages

Counts all web pages for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebPagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebPagesApi apiInstance = new WebPagesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.countWebPagesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebPagesApi#countWebPagesAsync");
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
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

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
| **403** | Forbidden |  -  |
| **200** | OK |  -  |

<a id="createWebPageAsync"></a>
# **createWebPageAsync**
> createWebPageAsync(tenantId, apiVersion, xApiVersion, webPageCreateDto)

Create a web page

Creates a new web page for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebPagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebPagesApi apiInstance = new WebPagesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    WebPageCreateDto webPageCreateDto = new WebPageCreateDto(); // WebPageCreateDto | 
    try {
      apiInstance.createWebPageAsync(tenantId, apiVersion, xApiVersion, webPageCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebPagesApi#createWebPageAsync");
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
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **webPageCreateDto** | [**WebPageCreateDto**](WebPageCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **200** | OK |  -  |

<a id="createWebPageCategoryRelationAsync"></a>
# **createWebPageCategoryRelationAsync**
> createWebPageCategoryRelationAsync(tenantId, webPageId, apiVersion, xApiVersion, webPageCategoryCreateDto)

Create a web page category relation

Creates a new category and relates it to a web page.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebPagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebPagesApi apiInstance = new WebPagesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID webPageId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    WebPageCategoryCreateDto webPageCategoryCreateDto = new WebPageCategoryCreateDto(); // WebPageCategoryCreateDto | 
    try {
      apiInstance.createWebPageCategoryRelationAsync(tenantId, webPageId, apiVersion, xApiVersion, webPageCategoryCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebPagesApi#createWebPageCategoryRelationAsync");
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
| **webPageId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **webPageCategoryCreateDto** | [**WebPageCategoryCreateDto**](WebPageCategoryCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **200** | OK |  -  |

<a id="createWebPageTagRelationAsync"></a>
# **createWebPageTagRelationAsync**
> createWebPageTagRelationAsync(tenantId, webPageId, apiVersion, xApiVersion, webPageTagCreateDto)

Create a web page tag relation

Creates a new tag and relates it to a web page.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebPagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebPagesApi apiInstance = new WebPagesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID webPageId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    WebPageTagCreateDto webPageTagCreateDto = new WebPageTagCreateDto(); // WebPageTagCreateDto | 
    try {
      apiInstance.createWebPageTagRelationAsync(tenantId, webPageId, apiVersion, xApiVersion, webPageTagCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebPagesApi#createWebPageTagRelationAsync");
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
| **webPageId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **webPageTagCreateDto** | [**WebPageTagCreateDto**](WebPageTagCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **200** | OK |  -  |

<a id="deleteWebPageAsync"></a>
# **deleteWebPageAsync**
> deleteWebPageAsync(tenantId, webPageId, apiVersion, xApiVersion)

Delete a web page

Deletes a web page for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebPagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebPagesApi apiInstance = new WebPagesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID webPageId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteWebPageAsync(tenantId, webPageId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebPagesApi#deleteWebPageAsync");
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
| **webPageId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **200** | OK |  -  |

<a id="getCategoriesByWebPageAsync"></a>
# **getCategoriesByWebPageAsync**
> WebPageCategoryDtoListEnvelope getCategoriesByWebPageAsync(webPageId, apiVersion, xApiVersion)

Get categories by web page

Retrieves all categories related to a specific web page.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebPagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebPagesApi apiInstance = new WebPagesApi(defaultClient);
    UUID webPageId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      WebPageCategoryDtoListEnvelope result = apiInstance.getCategoriesByWebPageAsync(webPageId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebPagesApi#getCategoriesByWebPageAsync");
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
| **webPageId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**WebPageCategoryDtoListEnvelope**](WebPageCategoryDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **200** | OK |  -  |

<a id="getTagsByWebPageAsync"></a>
# **getTagsByWebPageAsync**
> WebPageTagDtoListEnvelope getTagsByWebPageAsync(webPageId, apiVersion, xApiVersion)

Get tags by web page

Retrieves all tags related to a specific web page.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebPagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebPagesApi apiInstance = new WebPagesApi(defaultClient);
    UUID webPageId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      WebPageTagDtoListEnvelope result = apiInstance.getTagsByWebPageAsync(webPageId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebPagesApi#getTagsByWebPageAsync");
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
| **webPageId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**WebPageTagDtoListEnvelope**](WebPageTagDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **200** | OK |  -  |

<a id="getWebPageByIdAsync"></a>
# **getWebPageByIdAsync**
> WebPageDtoEnvelope getWebPageByIdAsync(tenantId, webPageId, apiVersion, xApiVersion)

Get web page by ID

Retrieves a specific web page by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebPagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebPagesApi apiInstance = new WebPagesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID webPageId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      WebPageDtoEnvelope result = apiInstance.getWebPageByIdAsync(tenantId, webPageId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebPagesApi#getWebPageByIdAsync");
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
| **webPageId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**WebPageDtoEnvelope**](WebPageDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **200** | OK |  -  |

<a id="getWebPagesAsync"></a>
# **getWebPagesAsync**
> WebPageDtoListEnvelope getWebPagesAsync(tenantId, apiVersion, xApiVersion)

Get web pages

Retrieves all web pages for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebPagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebPagesApi apiInstance = new WebPagesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      WebPageDtoListEnvelope result = apiInstance.getWebPagesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebPagesApi#getWebPagesAsync");
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
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**WebPageDtoListEnvelope**](WebPageDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **200** | OK |  -  |

<a id="relateWebPageToCategoryAsync"></a>
# **relateWebPageToCategoryAsync**
> relateWebPageToCategoryAsync(tenantId, webPageId, categoryId, apiVersion, xApiVersion)

Relate web page to category

Relates an existing category to a web page.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebPagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebPagesApi apiInstance = new WebPagesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID webPageId = UUID.randomUUID(); // UUID | 
    UUID categoryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.relateWebPageToCategoryAsync(tenantId, webPageId, categoryId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebPagesApi#relateWebPageToCategoryAsync");
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
| **webPageId** | **UUID**|  | |
| **categoryId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **200** | OK |  -  |

<a id="relateWebPageToTagAsync"></a>
# **relateWebPageToTagAsync**
> relateWebPageToTagAsync(tenantId, webPageId, tagId, apiVersion, xApiVersion)

Relate web page to tag

Relates an existing tag to a web page.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebPagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebPagesApi apiInstance = new WebPagesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID webPageId = UUID.randomUUID(); // UUID | 
    UUID tagId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.relateWebPageToTagAsync(tenantId, webPageId, tagId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebPagesApi#relateWebPageToTagAsync");
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
| **webPageId** | **UUID**|  | |
| **tagId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **200** | OK |  -  |

<a id="unrelateWebPageCategoryAsync"></a>
# **unrelateWebPageCategoryAsync**
> unrelateWebPageCategoryAsync(tenantId, webPageId, categoryId, apiVersion, xApiVersion)

Unrelate web page from category

Removes the relationship between a web page and a category.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebPagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebPagesApi apiInstance = new WebPagesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID webPageId = UUID.randomUUID(); // UUID | 
    UUID categoryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.unrelateWebPageCategoryAsync(tenantId, webPageId, categoryId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebPagesApi#unrelateWebPageCategoryAsync");
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
| **webPageId** | **UUID**|  | |
| **categoryId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **200** | OK |  -  |

<a id="unrelateWebPageTagAsync"></a>
# **unrelateWebPageTagAsync**
> unrelateWebPageTagAsync(tenantId, webPageId, tagId, apiVersion, xApiVersion)

Unrelate web page from tag

Removes the relationship between a web page and a tag.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebPagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebPagesApi apiInstance = new WebPagesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID webPageId = UUID.randomUUID(); // UUID | 
    UUID tagId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.unrelateWebPageTagAsync(tenantId, webPageId, tagId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebPagesApi#unrelateWebPageTagAsync");
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
| **webPageId** | **UUID**|  | |
| **tagId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **200** | OK |  -  |

<a id="updateWebPageAsync"></a>
# **updateWebPageAsync**
> updateWebPageAsync(tenantId, webPageId, apiVersion, xApiVersion, webPageUpdateDto)

Update a web page

Updates an existing web page for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebPagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebPagesApi apiInstance = new WebPagesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID webPageId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    WebPageUpdateDto webPageUpdateDto = new WebPageUpdateDto(); // WebPageUpdateDto | 
    try {
      apiInstance.updateWebPageAsync(tenantId, webPageId, apiVersion, xApiVersion, webPageUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebPagesApi#updateWebPageAsync");
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
| **webPageId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **webPageUpdateDto** | [**WebPageUpdateDto**](WebPageUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **200** | OK |  -  |

