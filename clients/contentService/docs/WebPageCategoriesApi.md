# WebPageCategoriesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**countWebPageCategoriesAsync**](WebPageCategoriesApi.md#countWebPageCategoriesAsync) | **GET** /api/v2/ContentService/WebPageCategories/Count | Count web page categories |
| [**createWebPageCategoryAsync**](WebPageCategoriesApi.md#createWebPageCategoryAsync) | **POST** /api/v2/ContentService/WebPageCategories | Create a web page category |
| [**deleteWebPageCategoryAsync**](WebPageCategoriesApi.md#deleteWebPageCategoryAsync) | **DELETE** /api/v2/ContentService/WebPageCategories/{webPageCategoryId} | Delete a web page category |
| [**getWebPageCategoriesAsync**](WebPageCategoriesApi.md#getWebPageCategoriesAsync) | **GET** /api/v2/ContentService/WebPageCategories | Get web page categories |
| [**getWebPageCategoryByIdAsync**](WebPageCategoriesApi.md#getWebPageCategoryByIdAsync) | **GET** /api/v2/ContentService/WebPageCategories/{webPageCategoryId} | Get web page category by ID |
| [**updateWebPageCategoryAsync**](WebPageCategoriesApi.md#updateWebPageCategoryAsync) | **PUT** /api/v2/ContentService/WebPageCategories/{webPageCategoryId} | Update a web page category |


<a id="countWebPageCategoriesAsync"></a>
# **countWebPageCategoriesAsync**
> Int32Envelope countWebPageCategoriesAsync(tenantId, apiVersion, xApiVersion)

Count web page categories

Counts all web page categories for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebPageCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebPageCategoriesApi apiInstance = new WebPageCategoriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.countWebPageCategoriesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebPageCategoriesApi#countWebPageCategoriesAsync");
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
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="createWebPageCategoryAsync"></a>
# **createWebPageCategoryAsync**
> EmptyEnvelope createWebPageCategoryAsync(tenantId, apiVersion, xApiVersion, webPageCategoryCreateDto)

Create a web page category

Creates a new web page category for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebPageCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebPageCategoriesApi apiInstance = new WebPageCategoriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    WebPageCategoryCreateDto webPageCategoryCreateDto = new WebPageCategoryCreateDto(); // WebPageCategoryCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createWebPageCategoryAsync(tenantId, apiVersion, xApiVersion, webPageCategoryCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebPageCategoriesApi#createWebPageCategoryAsync");
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
| **webPageCategoryCreateDto** | [**WebPageCategoryCreateDto**](WebPageCategoryCreateDto.md)|  | [optional] |

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
| **201** | Created |  -  |

<a id="deleteWebPageCategoryAsync"></a>
# **deleteWebPageCategoryAsync**
> EmptyEnvelope deleteWebPageCategoryAsync(tenantId, webPageCategoryId, apiVersion, xApiVersion)

Delete a web page category

Deletes a web page category for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebPageCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebPageCategoriesApi apiInstance = new WebPageCategoriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID webPageCategoryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteWebPageCategoryAsync(tenantId, webPageCategoryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebPageCategoriesApi#deleteWebPageCategoryAsync");
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
| **webPageCategoryId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

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
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getWebPageCategoriesAsync"></a>
# **getWebPageCategoriesAsync**
> WebPageCategoryDtoListEnvelope getWebPageCategoriesAsync(tenantId, apiVersion, xApiVersion)

Get web page categories

Retrieves all web page categories for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebPageCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebPageCategoriesApi apiInstance = new WebPageCategoriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      WebPageCategoryDtoListEnvelope result = apiInstance.getWebPageCategoriesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebPageCategoriesApi#getWebPageCategoriesAsync");
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
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getWebPageCategoryByIdAsync"></a>
# **getWebPageCategoryByIdAsync**
> WebPageCategoryDtoEnvelope getWebPageCategoryByIdAsync(tenantId, webPageCategoryId, apiVersion, xApiVersion)

Get web page category by ID

Retrieves a specific web page category by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebPageCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebPageCategoriesApi apiInstance = new WebPageCategoriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID webPageCategoryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      WebPageCategoryDtoEnvelope result = apiInstance.getWebPageCategoryByIdAsync(tenantId, webPageCategoryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebPageCategoriesApi#getWebPageCategoryByIdAsync");
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
| **webPageCategoryId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**WebPageCategoryDtoEnvelope**](WebPageCategoryDtoEnvelope.md)

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

<a id="updateWebPageCategoryAsync"></a>
# **updateWebPageCategoryAsync**
> EmptyEnvelope updateWebPageCategoryAsync(tenantId, webPageCategoryId, apiVersion, xApiVersion, webPageCategoryUpdateDto)

Update a web page category

Updates an existing web page category for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebPageCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebPageCategoriesApi apiInstance = new WebPageCategoriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID webPageCategoryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    WebPageCategoryUpdateDto webPageCategoryUpdateDto = new WebPageCategoryUpdateDto(); // WebPageCategoryUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateWebPageCategoryAsync(tenantId, webPageCategoryId, apiVersion, xApiVersion, webPageCategoryUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebPageCategoriesApi#updateWebPageCategoryAsync");
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
| **webPageCategoryId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **webPageCategoryUpdateDto** | [**WebPageCategoryUpdateDto**](WebPageCategoryUpdateDto.md)|  | [optional] |

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

