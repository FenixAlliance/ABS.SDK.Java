# ItemBrandsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createItemBrandAsync**](ItemBrandsApi.md#createItemBrandAsync) | **POST** /api/v2/CatalogService/ItemBrands | Create a new item brand |
| [**deleteItemBrandAsync**](ItemBrandsApi.md#deleteItemBrandAsync) | **DELETE** /api/v2/CatalogService/ItemBrands/{itemBrandId} | Delete an item brand |
| [**getItemBrandByIdAsync**](ItemBrandsApi.md#getItemBrandByIdAsync) | **GET** /api/v2/CatalogService/ItemBrands/{itemBrandId} | Get item brand by ID |
| [**getItemBrandsAsync**](ItemBrandsApi.md#getItemBrandsAsync) | **GET** /api/v2/CatalogService/ItemBrands | Get all item brands |
| [**updateItemBrandAsync**](ItemBrandsApi.md#updateItemBrandAsync) | **PUT** /api/v2/CatalogService/ItemBrands/{itemBrandId} | Update an item brand |


<a id="createItemBrandAsync"></a>
# **createItemBrandAsync**
> ItemBrandDtoEnvelope createItemBrandAsync(tenantId, apiVersion, xApiVersion, itemBrandCreateDto)

Create a new item brand

Creates a new item brand for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemBrandsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ItemBrandsApi apiInstance = new ItemBrandsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemBrandCreateDto itemBrandCreateDto = new ItemBrandCreateDto(); // ItemBrandCreateDto | 
    try {
      ItemBrandDtoEnvelope result = apiInstance.createItemBrandAsync(tenantId, apiVersion, xApiVersion, itemBrandCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemBrandsApi#createItemBrandAsync");
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
| **itemBrandCreateDto** | [**ItemBrandCreateDto**](ItemBrandCreateDto.md)|  | [optional] |

### Return type

[**ItemBrandDtoEnvelope**](ItemBrandDtoEnvelope.md)

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

<a id="deleteItemBrandAsync"></a>
# **deleteItemBrandAsync**
> deleteItemBrandAsync(tenantId, itemBrandId, apiVersion, xApiVersion)

Delete an item brand

Deletes an item brand for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemBrandsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ItemBrandsApi apiInstance = new ItemBrandsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemBrandId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteItemBrandAsync(tenantId, itemBrandId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemBrandsApi#deleteItemBrandAsync");
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
| **itemBrandId** | **UUID**|  | |
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

<a id="getItemBrandByIdAsync"></a>
# **getItemBrandByIdAsync**
> ItemBrandDtoEnvelope getItemBrandByIdAsync(itemBrandId, apiVersion, xApiVersion)

Get item brand by ID

Retrieves a specific item brand by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemBrandsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ItemBrandsApi apiInstance = new ItemBrandsApi(defaultClient);
    UUID itemBrandId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemBrandDtoEnvelope result = apiInstance.getItemBrandByIdAsync(itemBrandId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemBrandsApi#getItemBrandByIdAsync");
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
| **itemBrandId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemBrandDtoEnvelope**](ItemBrandDtoEnvelope.md)

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

<a id="getItemBrandsAsync"></a>
# **getItemBrandsAsync**
> ItemBrandDtoListEnvelope getItemBrandsAsync(tenantId, apiVersion, xApiVersion)

Get all item brands

Retrieves all item brands for the specified tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemBrandsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ItemBrandsApi apiInstance = new ItemBrandsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemBrandDtoListEnvelope result = apiInstance.getItemBrandsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemBrandsApi#getItemBrandsAsync");
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

[**ItemBrandDtoListEnvelope**](ItemBrandDtoListEnvelope.md)

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

<a id="updateItemBrandAsync"></a>
# **updateItemBrandAsync**
> ItemBrandDtoEnvelope updateItemBrandAsync(tenantId, itemBrandId, apiVersion, xApiVersion, itemBrandUpdateDto)

Update an item brand

Updates an existing item brand for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemBrandsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ItemBrandsApi apiInstance = new ItemBrandsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemBrandId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemBrandUpdateDto itemBrandUpdateDto = new ItemBrandUpdateDto(); // ItemBrandUpdateDto | 
    try {
      ItemBrandDtoEnvelope result = apiInstance.updateItemBrandAsync(tenantId, itemBrandId, apiVersion, xApiVersion, itemBrandUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemBrandsApi#updateItemBrandAsync");
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
| **itemBrandId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **itemBrandUpdateDto** | [**ItemBrandUpdateDto**](ItemBrandUpdateDto.md)|  | [optional] |

### Return type

[**ItemBrandDtoEnvelope**](ItemBrandDtoEnvelope.md)

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

