# ItemTagsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createItemTagAsync**](ItemTagsApi.md#createItemTagAsync) | **POST** /api/v2/CatalogService/ItemTags | Create a new item tag |
| [**deleteItemTagAsync**](ItemTagsApi.md#deleteItemTagAsync) | **DELETE** /api/v2/CatalogService/ItemTags/{itemTagId} | Delete an item tag |
| [**getItemTagByIdAsync**](ItemTagsApi.md#getItemTagByIdAsync) | **GET** /api/v2/CatalogService/ItemTags/{itemTagId} | Get item tag by ID |
| [**getItemTagsAsync**](ItemTagsApi.md#getItemTagsAsync) | **GET** /api/v2/CatalogService/ItemTags | Get all item tags |
| [**updateItemTagAsync**](ItemTagsApi.md#updateItemTagAsync) | **PUT** /api/v2/CatalogService/ItemTags/{itemTagId} | Update an item tag |


<a id="createItemTagAsync"></a>
# **createItemTagAsync**
> ItemTagDtoEnvelope createItemTagAsync(tenantId, apiVersion, xApiVersion, itemTagCreateDto)

Create a new item tag

Creates a new item tag for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemTagsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ItemTagsApi apiInstance = new ItemTagsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemTagCreateDto itemTagCreateDto = new ItemTagCreateDto(); // ItemTagCreateDto | 
    try {
      ItemTagDtoEnvelope result = apiInstance.createItemTagAsync(tenantId, apiVersion, xApiVersion, itemTagCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemTagsApi#createItemTagAsync");
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
| **itemTagCreateDto** | [**ItemTagCreateDto**](ItemTagCreateDto.md)|  | [optional] |

### Return type

[**ItemTagDtoEnvelope**](ItemTagDtoEnvelope.md)

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

<a id="deleteItemTagAsync"></a>
# **deleteItemTagAsync**
> deleteItemTagAsync(tenantId, itemTagId, apiVersion, xApiVersion)

Delete an item tag

Deletes an item tag for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemTagsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ItemTagsApi apiInstance = new ItemTagsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemTagId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteItemTagAsync(tenantId, itemTagId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemTagsApi#deleteItemTagAsync");
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
| **itemTagId** | **UUID**|  | |
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

<a id="getItemTagByIdAsync"></a>
# **getItemTagByIdAsync**
> ItemTagDtoEnvelope getItemTagByIdAsync(itemTagId, apiVersion, xApiVersion)

Get item tag by ID

Retrieves a specific item tag by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemTagsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ItemTagsApi apiInstance = new ItemTagsApi(defaultClient);
    UUID itemTagId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemTagDtoEnvelope result = apiInstance.getItemTagByIdAsync(itemTagId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemTagsApi#getItemTagByIdAsync");
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
| **itemTagId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemTagDtoEnvelope**](ItemTagDtoEnvelope.md)

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

<a id="getItemTagsAsync"></a>
# **getItemTagsAsync**
> ItemTagDtoListEnvelope getItemTagsAsync(tenantId, apiVersion, xApiVersion)

Get all item tags

Retrieves all item tags for the specified tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemTagsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ItemTagsApi apiInstance = new ItemTagsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemTagDtoListEnvelope result = apiInstance.getItemTagsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemTagsApi#getItemTagsAsync");
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

[**ItemTagDtoListEnvelope**](ItemTagDtoListEnvelope.md)

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

<a id="updateItemTagAsync"></a>
# **updateItemTagAsync**
> updateItemTagAsync(tenantId, itemTagId, apiVersion, xApiVersion, itemTagUpdateDto)

Update an item tag

Updates an existing item tag for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemTagsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ItemTagsApi apiInstance = new ItemTagsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemTagId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemTagUpdateDto itemTagUpdateDto = new ItemTagUpdateDto(); // ItemTagUpdateDto | 
    try {
      apiInstance.updateItemTagAsync(tenantId, itemTagId, apiVersion, xApiVersion, itemTagUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemTagsApi#updateItemTagAsync");
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
| **itemTagId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **itemTagUpdateDto** | [**ItemTagUpdateDto**](ItemTagUpdateDto.md)|  | [optional] |

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

