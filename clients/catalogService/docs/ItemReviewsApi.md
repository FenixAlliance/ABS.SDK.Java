# ItemReviewsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createItemReviewAsync**](ItemReviewsApi.md#createItemReviewAsync) | **POST** /api/v2/CatalogService/ItemReviews | Create a new item review |
| [**deleteItemReviewAsync**](ItemReviewsApi.md#deleteItemReviewAsync) | **DELETE** /api/v2/CatalogService/ItemReviews/{itemReviewId} | Delete an item review |
| [**getItemReviewByIdAsync**](ItemReviewsApi.md#getItemReviewByIdAsync) | **GET** /api/v2/CatalogService/ItemReviews/{itemReviewId} | Get item review by ID |
| [**getItemReviewsAsync**](ItemReviewsApi.md#getItemReviewsAsync) | **GET** /api/v2/CatalogService/ItemReviews | Get all item reviews |
| [**updateItemReviewAsync**](ItemReviewsApi.md#updateItemReviewAsync) | **PUT** /api/v2/CatalogService/ItemReviews/{itemReviewId} | Update an item review |


<a id="createItemReviewAsync"></a>
# **createItemReviewAsync**
> ItemReviewDtoEnvelope createItemReviewAsync(tenantId, apiVersion, xApiVersion, itemReviewCreateDto)

Create a new item review

Creates a new item review for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemReviewsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ItemReviewsApi apiInstance = new ItemReviewsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemReviewCreateDto itemReviewCreateDto = new ItemReviewCreateDto(); // ItemReviewCreateDto | 
    try {
      ItemReviewDtoEnvelope result = apiInstance.createItemReviewAsync(tenantId, apiVersion, xApiVersion, itemReviewCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemReviewsApi#createItemReviewAsync");
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
| **itemReviewCreateDto** | [**ItemReviewCreateDto**](ItemReviewCreateDto.md)|  | [optional] |

### Return type

[**ItemReviewDtoEnvelope**](ItemReviewDtoEnvelope.md)

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

<a id="deleteItemReviewAsync"></a>
# **deleteItemReviewAsync**
> deleteItemReviewAsync(tenantId, itemReviewId, apiVersion, xApiVersion)

Delete an item review

Deletes an item review for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemReviewsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ItemReviewsApi apiInstance = new ItemReviewsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemReviewId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteItemReviewAsync(tenantId, itemReviewId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemReviewsApi#deleteItemReviewAsync");
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
| **itemReviewId** | **UUID**|  | |
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

<a id="getItemReviewByIdAsync"></a>
# **getItemReviewByIdAsync**
> ItemReviewDtoEnvelope getItemReviewByIdAsync(itemReviewId, apiVersion, xApiVersion)

Get item review by ID

Retrieves a specific item review by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemReviewsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ItemReviewsApi apiInstance = new ItemReviewsApi(defaultClient);
    UUID itemReviewId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemReviewDtoEnvelope result = apiInstance.getItemReviewByIdAsync(itemReviewId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemReviewsApi#getItemReviewByIdAsync");
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
| **itemReviewId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemReviewDtoEnvelope**](ItemReviewDtoEnvelope.md)

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

<a id="getItemReviewsAsync"></a>
# **getItemReviewsAsync**
> ItemReviewDtoListEnvelope getItemReviewsAsync(itemId, apiVersion, xApiVersion)

Get all item reviews

Retrieves all item reviews for the specified item using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemReviewsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ItemReviewsApi apiInstance = new ItemReviewsApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemReviewDtoListEnvelope result = apiInstance.getItemReviewsAsync(itemId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemReviewsApi#getItemReviewsAsync");
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
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemReviewDtoListEnvelope**](ItemReviewDtoListEnvelope.md)

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

<a id="updateItemReviewAsync"></a>
# **updateItemReviewAsync**
> updateItemReviewAsync(tenantId, itemReviewId, apiVersion, xApiVersion, itemReviewUpdateDto)

Update an item review

Updates an existing item review for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemReviewsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ItemReviewsApi apiInstance = new ItemReviewsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemReviewId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemReviewUpdateDto itemReviewUpdateDto = new ItemReviewUpdateDto(); // ItemReviewUpdateDto | 
    try {
      apiInstance.updateItemReviewAsync(tenantId, itemReviewId, apiVersion, xApiVersion, itemReviewUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemReviewsApi#updateItemReviewAsync");
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
| **itemReviewId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **itemReviewUpdateDto** | [**ItemReviewUpdateDto**](ItemReviewUpdateDto.md)|  | [optional] |

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

