# ItemFamiliesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createItemFamilyAsync**](ItemFamiliesApi.md#createItemFamilyAsync) | **POST** /api/v2/CatalogService/ItemFamilies | Create a new item family |
| [**deleteItemFamilyAsync**](ItemFamiliesApi.md#deleteItemFamilyAsync) | **DELETE** /api/v2/CatalogService/ItemFamilies/{itemFamilyId} | Delete an item family |
| [**getItemFamiliesAsync**](ItemFamiliesApi.md#getItemFamiliesAsync) | **GET** /api/v2/CatalogService/ItemFamilies | Get all item families |
| [**getItemFamiliesCountAsync**](ItemFamiliesApi.md#getItemFamiliesCountAsync) | **GET** /api/v2/CatalogService/ItemFamilies/Count | Get item families count |
| [**getItemFamilyByIdAsync**](ItemFamiliesApi.md#getItemFamilyByIdAsync) | **GET** /api/v2/CatalogService/ItemFamilies/{itemFamilyId} | Get item family by ID |
| [**updateItemFamilyAsync**](ItemFamiliesApi.md#updateItemFamilyAsync) | **PUT** /api/v2/CatalogService/ItemFamilies/{itemFamilyId} | Update an item family |


<a id="createItemFamilyAsync"></a>
# **createItemFamilyAsync**
> ItemFamilyDtoEnvelope createItemFamilyAsync(tenantId, apiVersion, xApiVersion, itemFamilyCreateDto)

Create a new item family

Creates a new item family for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemFamiliesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemFamiliesApi apiInstance = new ItemFamiliesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemFamilyCreateDto itemFamilyCreateDto = new ItemFamilyCreateDto(); // ItemFamilyCreateDto | 
    try {
      ItemFamilyDtoEnvelope result = apiInstance.createItemFamilyAsync(tenantId, apiVersion, xApiVersion, itemFamilyCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemFamiliesApi#createItemFamilyAsync");
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
| **itemFamilyCreateDto** | [**ItemFamilyCreateDto**](ItemFamilyCreateDto.md)|  | [optional] |

### Return type

[**ItemFamilyDtoEnvelope**](ItemFamilyDtoEnvelope.md)

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

<a id="deleteItemFamilyAsync"></a>
# **deleteItemFamilyAsync**
> deleteItemFamilyAsync(tenantId, itemFamilyId, apiVersion, xApiVersion)

Delete an item family

Deletes an item family for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemFamiliesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemFamiliesApi apiInstance = new ItemFamiliesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemFamilyId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteItemFamilyAsync(tenantId, itemFamilyId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemFamiliesApi#deleteItemFamilyAsync");
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
| **itemFamilyId** | **UUID**|  | |
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

<a id="getItemFamiliesAsync"></a>
# **getItemFamiliesAsync**
> ItemFamilyDtoListEnvelope getItemFamiliesAsync(tenantId, apiVersion, xApiVersion)

Get all item families

Retrieves all item families for the specified tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemFamiliesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemFamiliesApi apiInstance = new ItemFamiliesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemFamilyDtoListEnvelope result = apiInstance.getItemFamiliesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemFamiliesApi#getItemFamiliesAsync");
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
| **tenantId** | **UUID**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemFamilyDtoListEnvelope**](ItemFamilyDtoListEnvelope.md)

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

<a id="getItemFamiliesCountAsync"></a>
# **getItemFamiliesCountAsync**
> Int32Envelope getItemFamiliesCountAsync(tenantId, apiVersion, xApiVersion)

Get item families count

Returns the count of item families for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemFamiliesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemFamiliesApi apiInstance = new ItemFamiliesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getItemFamiliesCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemFamiliesApi#getItemFamiliesCountAsync");
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
| **tenantId** | **UUID**|  | [optional] |
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

<a id="getItemFamilyByIdAsync"></a>
# **getItemFamilyByIdAsync**
> ItemFamilyDtoEnvelope getItemFamilyByIdAsync(itemFamilyId, tenantId, apiVersion, xApiVersion)

Get item family by ID

Retrieves a specific item family by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemFamiliesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemFamiliesApi apiInstance = new ItemFamiliesApi(defaultClient);
    UUID itemFamilyId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemFamilyDtoEnvelope result = apiInstance.getItemFamilyByIdAsync(itemFamilyId, tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemFamiliesApi#getItemFamilyByIdAsync");
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
| **itemFamilyId** | **UUID**|  | |
| **tenantId** | **UUID**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemFamilyDtoEnvelope**](ItemFamilyDtoEnvelope.md)

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

<a id="updateItemFamilyAsync"></a>
# **updateItemFamilyAsync**
> ItemFamilyDtoEnvelope updateItemFamilyAsync(tenantId, itemFamilyId, apiVersion, xApiVersion, itemFamilyUpdateDto)

Update an item family

Updates an existing item family for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemFamiliesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemFamiliesApi apiInstance = new ItemFamiliesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemFamilyId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemFamilyUpdateDto itemFamilyUpdateDto = new ItemFamilyUpdateDto(); // ItemFamilyUpdateDto | 
    try {
      ItemFamilyDtoEnvelope result = apiInstance.updateItemFamilyAsync(tenantId, itemFamilyId, apiVersion, xApiVersion, itemFamilyUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemFamiliesApi#updateItemFamilyAsync");
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
| **itemFamilyId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **itemFamilyUpdateDto** | [**ItemFamilyUpdateDto**](ItemFamilyUpdateDto.md)|  | [optional] |

### Return type

[**ItemFamilyDtoEnvelope**](ItemFamilyDtoEnvelope.md)

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

