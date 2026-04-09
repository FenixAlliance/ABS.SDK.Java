# ItemImagesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createItemImageAsync**](ItemImagesApi.md#createItemImageAsync) | **POST** /api/v2/CatalogService/ItemImages | Create a new item image |
| [**deleteItemImageAsync**](ItemImagesApi.md#deleteItemImageAsync) | **DELETE** /api/v2/CatalogService/ItemImages/{itemImageId} | Delete an item image |
| [**getItemImageByIdAsync**](ItemImagesApi.md#getItemImageByIdAsync) | **GET** /api/v2/CatalogService/ItemImages/{itemImageId} | Get item image by ID |
| [**getItemImagesAsync**](ItemImagesApi.md#getItemImagesAsync) | **GET** /api/v2/CatalogService/ItemImages | Get all item images |
| [**updateItemImageAsync**](ItemImagesApi.md#updateItemImageAsync) | **PUT** /api/v2/CatalogService/ItemImages/{itemImageId} | Update an item image |


<a id="createItemImageAsync"></a>
# **createItemImageAsync**
> ItemImageDtoEnvelope createItemImageAsync(tenantId, apiVersion, xApiVersion, itemImageCreateDto)

Create a new item image

Creates a new item image for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemImagesApi apiInstance = new ItemImagesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemImageCreateDto itemImageCreateDto = new ItemImageCreateDto(); // ItemImageCreateDto | 
    try {
      ItemImageDtoEnvelope result = apiInstance.createItemImageAsync(tenantId, apiVersion, xApiVersion, itemImageCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemImagesApi#createItemImageAsync");
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
| **itemImageCreateDto** | [**ItemImageCreateDto**](ItemImageCreateDto.md)|  | [optional] |

### Return type

[**ItemImageDtoEnvelope**](ItemImageDtoEnvelope.md)

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

<a id="deleteItemImageAsync"></a>
# **deleteItemImageAsync**
> deleteItemImageAsync(tenantId, itemImageId, apiVersion, xApiVersion)

Delete an item image

Deletes an item image for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemImagesApi apiInstance = new ItemImagesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemImageId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteItemImageAsync(tenantId, itemImageId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemImagesApi#deleteItemImageAsync");
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
| **itemImageId** | **UUID**|  | |
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

<a id="getItemImageByIdAsync"></a>
# **getItemImageByIdAsync**
> ItemImageDtoEnvelope getItemImageByIdAsync(itemImageId, apiVersion, xApiVersion)

Get item image by ID

Retrieves a specific item image by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemImagesApi apiInstance = new ItemImagesApi(defaultClient);
    UUID itemImageId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemImageDtoEnvelope result = apiInstance.getItemImageByIdAsync(itemImageId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemImagesApi#getItemImageByIdAsync");
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
| **itemImageId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemImageDtoEnvelope**](ItemImageDtoEnvelope.md)

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

<a id="getItemImagesAsync"></a>
# **getItemImagesAsync**
> ItemImageDtoListEnvelope getItemImagesAsync(tenantId, apiVersion, xApiVersion)

Get all item images

Retrieves all item images for the specified tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemImagesApi apiInstance = new ItemImagesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemImageDtoListEnvelope result = apiInstance.getItemImagesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemImagesApi#getItemImagesAsync");
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

[**ItemImageDtoListEnvelope**](ItemImageDtoListEnvelope.md)

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

<a id="updateItemImageAsync"></a>
# **updateItemImageAsync**
> updateItemImageAsync(tenantId, itemImageId, apiVersion, xApiVersion, itemImageUpdateDto)

Update an item image

Updates an existing item image for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemImagesApi apiInstance = new ItemImagesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemImageId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemImageUpdateDto itemImageUpdateDto = new ItemImageUpdateDto(); // ItemImageUpdateDto | 
    try {
      apiInstance.updateItemImageAsync(tenantId, itemImageId, apiVersion, xApiVersion, itemImageUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemImagesApi#updateItemImageAsync");
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
| **itemImageId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **itemImageUpdateDto** | [**ItemImageUpdateDto**](ItemImageUpdateDto.md)|  | [optional] |

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

