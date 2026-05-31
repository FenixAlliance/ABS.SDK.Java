# ItemGoogleCategoriesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllItemGoogleCategoriesAsync**](ItemGoogleCategoriesApi.md#getAllItemGoogleCategoriesAsync) | **GET** /api/v2/CatalogService/ItemGoogleCategories/All | Get all Google item categories (all) |
| [**getChildrenItemGoogleCategoriesByIdAsync**](ItemGoogleCategoriesApi.md#getChildrenItemGoogleCategoriesByIdAsync) | **GET** /api/v2/CatalogService/ItemGoogleCategories/{itemCategoryId}/Children | Get children Google item categories by ID |
| [**getItemGoogleCategoriesAsync**](ItemGoogleCategoriesApi.md#getItemGoogleCategoriesAsync) | **GET** /api/v2/CatalogService/ItemGoogleCategories | Get all Google item categories |
| [**getItemGoogleCategoriesCountAsync**](ItemGoogleCategoriesApi.md#getItemGoogleCategoriesCountAsync) | **GET** /api/v2/CatalogService/ItemGoogleCategories/Count | Get Google item categories count |
| [**getItemGoogleCategoriesTreeAsync**](ItemGoogleCategoriesApi.md#getItemGoogleCategoriesTreeAsync) | **GET** /api/v2/CatalogService/ItemGoogleCategories/tree | Get Google item categories tree |
| [**getItemGoogleCategoryByIdAsync**](ItemGoogleCategoriesApi.md#getItemGoogleCategoryByIdAsync) | **GET** /api/v2/CatalogService/ItemGoogleCategories/{itemCategoryId} | Get Google item category by ID |
| [**getRootItemGoogleCategoriesAsync**](ItemGoogleCategoriesApi.md#getRootItemGoogleCategoriesAsync) | **GET** /api/v2/CatalogService/ItemGoogleCategories/Primary | Get root Google item categories |
| [**mapItemGoogleCategoriesTreeAsync**](ItemGoogleCategoriesApi.md#mapItemGoogleCategoriesTreeAsync) | **POST** /api/v2/CatalogService/ItemGoogleCategories/tree | Map Google item categories tree |


<a id="getAllItemGoogleCategoriesAsync"></a>
# **getAllItemGoogleCategoriesAsync**
> ItemGoogleCategoryDtoListEnvelope getAllItemGoogleCategoriesAsync(apiVersion, xApiVersion)

Get all Google item categories (all)

Retrieves all Google item categories (all) without OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemGoogleCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemGoogleCategoriesApi apiInstance = new ItemGoogleCategoriesApi(defaultClient);
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemGoogleCategoryDtoListEnvelope result = apiInstance.getAllItemGoogleCategoriesAsync(apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemGoogleCategoriesApi#getAllItemGoogleCategoriesAsync");
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

[**ItemGoogleCategoryDtoListEnvelope**](ItemGoogleCategoryDtoListEnvelope.md)

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

<a id="getChildrenItemGoogleCategoriesByIdAsync"></a>
# **getChildrenItemGoogleCategoriesByIdAsync**
> ItemGoogleCategoryDtoListEnvelope getChildrenItemGoogleCategoriesByIdAsync(itemCategoryId, apiVersion, xApiVersion)

Get children Google item categories by ID

Retrieves children Google item categories for a given ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemGoogleCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemGoogleCategoriesApi apiInstance = new ItemGoogleCategoriesApi(defaultClient);
    String itemCategoryId = "itemCategoryId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemGoogleCategoryDtoListEnvelope result = apiInstance.getChildrenItemGoogleCategoriesByIdAsync(itemCategoryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemGoogleCategoriesApi#getChildrenItemGoogleCategoriesByIdAsync");
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
| **itemCategoryId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemGoogleCategoryDtoListEnvelope**](ItemGoogleCategoryDtoListEnvelope.md)

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

<a id="getItemGoogleCategoriesAsync"></a>
# **getItemGoogleCategoriesAsync**
> ItemGoogleCategoryDtoListEnvelope getItemGoogleCategoriesAsync(apiVersion, xApiVersion)

Get all Google item categories

Retrieves all Google item categories using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemGoogleCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemGoogleCategoriesApi apiInstance = new ItemGoogleCategoriesApi(defaultClient);
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemGoogleCategoryDtoListEnvelope result = apiInstance.getItemGoogleCategoriesAsync(apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemGoogleCategoriesApi#getItemGoogleCategoriesAsync");
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

[**ItemGoogleCategoryDtoListEnvelope**](ItemGoogleCategoryDtoListEnvelope.md)

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

<a id="getItemGoogleCategoriesCountAsync"></a>
# **getItemGoogleCategoriesCountAsync**
> Int32Envelope getItemGoogleCategoriesCountAsync(apiVersion, xApiVersion)

Get Google item categories count

Retrieves the count of Google item categories using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemGoogleCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemGoogleCategoriesApi apiInstance = new ItemGoogleCategoriesApi(defaultClient);
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getItemGoogleCategoriesCountAsync(apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemGoogleCategoriesApi#getItemGoogleCategoriesCountAsync");
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

<a id="getItemGoogleCategoriesTreeAsync"></a>
# **getItemGoogleCategoriesTreeAsync**
> ItemGoogleCategoryDtoListEnvelope getItemGoogleCategoriesTreeAsync(apiVersion, xApiVersion)

Get Google item categories tree

Retrieves the Google item categories tree.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemGoogleCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemGoogleCategoriesApi apiInstance = new ItemGoogleCategoriesApi(defaultClient);
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemGoogleCategoryDtoListEnvelope result = apiInstance.getItemGoogleCategoriesTreeAsync(apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemGoogleCategoriesApi#getItemGoogleCategoriesTreeAsync");
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

[**ItemGoogleCategoryDtoListEnvelope**](ItemGoogleCategoryDtoListEnvelope.md)

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

<a id="getItemGoogleCategoryByIdAsync"></a>
# **getItemGoogleCategoryByIdAsync**
> ItemGoogleCategoryDtoEnvelope getItemGoogleCategoryByIdAsync(itemCategoryId, apiVersion, xApiVersion)

Get Google item category by ID

Retrieves a specific Google item category by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemGoogleCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemGoogleCategoriesApi apiInstance = new ItemGoogleCategoriesApi(defaultClient);
    String itemCategoryId = "itemCategoryId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemGoogleCategoryDtoEnvelope result = apiInstance.getItemGoogleCategoryByIdAsync(itemCategoryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemGoogleCategoriesApi#getItemGoogleCategoryByIdAsync");
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
| **itemCategoryId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemGoogleCategoryDtoEnvelope**](ItemGoogleCategoryDtoEnvelope.md)

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

<a id="getRootItemGoogleCategoriesAsync"></a>
# **getRootItemGoogleCategoriesAsync**
> ItemGoogleCategoryDtoListEnvelope getRootItemGoogleCategoriesAsync(apiVersion, xApiVersion)

Get root Google item categories

Retrieves root Google item categories.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemGoogleCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemGoogleCategoriesApi apiInstance = new ItemGoogleCategoriesApi(defaultClient);
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemGoogleCategoryDtoListEnvelope result = apiInstance.getRootItemGoogleCategoriesAsync(apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemGoogleCategoriesApi#getRootItemGoogleCategoriesAsync");
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

[**ItemGoogleCategoryDtoListEnvelope**](ItemGoogleCategoryDtoListEnvelope.md)

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

<a id="mapItemGoogleCategoriesTreeAsync"></a>
# **mapItemGoogleCategoriesTreeAsync**
> ItemGoogleCategoryDtoListEnvelope mapItemGoogleCategoriesTreeAsync(tenantId, apiVersion, xApiVersion)

Map Google item categories tree

Maps the Google item categories tree.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemGoogleCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemGoogleCategoriesApi apiInstance = new ItemGoogleCategoriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemGoogleCategoryDtoListEnvelope result = apiInstance.mapItemGoogleCategoriesTreeAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemGoogleCategoriesApi#mapItemGoogleCategoriesTreeAsync");
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

[**ItemGoogleCategoryDtoListEnvelope**](ItemGoogleCategoryDtoListEnvelope.md)

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

