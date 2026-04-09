# ItemCategoriesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**countItemCategoriesAsync**](ItemCategoriesApi.md#countItemCategoriesAsync) | **GET** /api/v2/CatalogService/ItemCategories/Count | Count item categories |
| [**createItemCategoryAsync**](ItemCategoriesApi.md#createItemCategoryAsync) | **POST** /api/v2/CatalogService/ItemCategories | Create a new item category |
| [**deleteItemCategoryAsync**](ItemCategoriesApi.md#deleteItemCategoryAsync) | **DELETE** /api/v2/CatalogService/ItemCategories/{itemCategoryId} | Delete an item category |
| [**getItemCategoriesAsync**](ItemCategoriesApi.md#getItemCategoriesAsync) | **GET** /api/v2/CatalogService/ItemCategories | Get all item categories |
| [**getItemCategoryByIdAsync**](ItemCategoriesApi.md#getItemCategoryByIdAsync) | **GET** /api/v2/CatalogService/ItemCategories/{itemCategoryId} | Get item category by ID |
| [**updateItemCategoryAsync**](ItemCategoriesApi.md#updateItemCategoryAsync) | **PUT** /api/v2/CatalogService/ItemCategories/{itemCategoryId} | Update an item category |


<a id="countItemCategoriesAsync"></a>
# **countItemCategoriesAsync**
> Int32Envelope countItemCategoriesAsync(tenantId, apiVersion, xApiVersion)

Count item categories

Counts all item categories for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemCategoriesApi apiInstance = new ItemCategoriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.countItemCategoriesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemCategoriesApi#countItemCategoriesAsync");
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

<a id="createItemCategoryAsync"></a>
# **createItemCategoryAsync**
> ItemCategoryDtoEnvelope createItemCategoryAsync(tenantId, apiVersion, xApiVersion, itemCategoryCreateDto)

Create a new item category

Creates a new item category for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemCategoriesApi apiInstance = new ItemCategoriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemCategoryCreateDto itemCategoryCreateDto = new ItemCategoryCreateDto(); // ItemCategoryCreateDto | 
    try {
      ItemCategoryDtoEnvelope result = apiInstance.createItemCategoryAsync(tenantId, apiVersion, xApiVersion, itemCategoryCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemCategoriesApi#createItemCategoryAsync");
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
| **itemCategoryCreateDto** | [**ItemCategoryCreateDto**](ItemCategoryCreateDto.md)|  | [optional] |

### Return type

[**ItemCategoryDtoEnvelope**](ItemCategoryDtoEnvelope.md)

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

<a id="deleteItemCategoryAsync"></a>
# **deleteItemCategoryAsync**
> deleteItemCategoryAsync(tenantId, itemCategoryId, apiVersion, xApiVersion)

Delete an item category

Deletes an item category for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemCategoriesApi apiInstance = new ItemCategoriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemCategoryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteItemCategoryAsync(tenantId, itemCategoryId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemCategoriesApi#deleteItemCategoryAsync");
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
| **itemCategoryId** | **UUID**|  | |
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
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getItemCategoriesAsync"></a>
# **getItemCategoriesAsync**
> ItemCategoryDtoListEnvelope getItemCategoriesAsync(tenantId, apiVersion, xApiVersion)

Get all item categories

Retrieves all item categories for the specified tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemCategoriesApi apiInstance = new ItemCategoriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemCategoryDtoListEnvelope result = apiInstance.getItemCategoriesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemCategoriesApi#getItemCategoriesAsync");
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

[**ItemCategoryDtoListEnvelope**](ItemCategoryDtoListEnvelope.md)

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

<a id="getItemCategoryByIdAsync"></a>
# **getItemCategoryByIdAsync**
> ItemCategoryDtoEnvelope getItemCategoryByIdAsync(itemCategoryId, apiVersion, xApiVersion)

Get item category by ID

Retrieves a specific item category by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemCategoriesApi apiInstance = new ItemCategoriesApi(defaultClient);
    UUID itemCategoryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemCategoryDtoEnvelope result = apiInstance.getItemCategoryByIdAsync(itemCategoryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemCategoriesApi#getItemCategoryByIdAsync");
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
| **itemCategoryId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemCategoryDtoEnvelope**](ItemCategoryDtoEnvelope.md)

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

<a id="updateItemCategoryAsync"></a>
# **updateItemCategoryAsync**
> updateItemCategoryAsync(tenantId, itemCategoryId, apiVersion, xApiVersion, itemCategoryUpdateDto)

Update an item category

Updates an existing item category for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemCategoriesApi apiInstance = new ItemCategoriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemCategoryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemCategoryUpdateDto itemCategoryUpdateDto = new ItemCategoryUpdateDto(); // ItemCategoryUpdateDto | 
    try {
      apiInstance.updateItemCategoryAsync(tenantId, itemCategoryId, apiVersion, xApiVersion, itemCategoryUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemCategoriesApi#updateItemCategoryAsync");
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
| **itemCategoryId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **itemCategoryUpdateDto** | [**ItemCategoryUpdateDto**](ItemCategoryUpdateDto.md)|  | [optional] |

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
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

