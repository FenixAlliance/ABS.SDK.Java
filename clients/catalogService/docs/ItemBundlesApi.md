# ItemBundlesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createItemBundleAsync**](ItemBundlesApi.md#createItemBundleAsync) | **POST** /api/v2/CatalogService/ItemBundles | Create a new item bundle |
| [**deleteItemBundleAsync**](ItemBundlesApi.md#deleteItemBundleAsync) | **DELETE** /api/v2/CatalogService/ItemBundles/{itemBundleId} | Delete an item bundle |
| [**getItemBundleByIdAsync**](ItemBundlesApi.md#getItemBundleByIdAsync) | **GET** /api/v2/CatalogService/ItemBundles/{itemBundleId} | Get item bundle by ID |
| [**getItemBundlesAsync**](ItemBundlesApi.md#getItemBundlesAsync) | **GET** /api/v2/CatalogService/ItemBundles | Get all item bundles |
| [**getItemBundlesCountAsync**](ItemBundlesApi.md#getItemBundlesCountAsync) | **GET** /api/v2/CatalogService/ItemBundles/Count | Get item bundles count |
| [**updateItemBundleAsync**](ItemBundlesApi.md#updateItemBundleAsync) | **PUT** /api/v2/CatalogService/ItemBundles/{itemBundleId} | Update an item bundle |


<a id="createItemBundleAsync"></a>
# **createItemBundleAsync**
> ItemBundleDtoEnvelope createItemBundleAsync(tenantId, apiVersion, xApiVersion, itemBundleCreateDto)

Create a new item bundle

Creates a new item bundle for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemBundlesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemBundlesApi apiInstance = new ItemBundlesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemBundleCreateDto itemBundleCreateDto = new ItemBundleCreateDto(); // ItemBundleCreateDto | 
    try {
      ItemBundleDtoEnvelope result = apiInstance.createItemBundleAsync(tenantId, apiVersion, xApiVersion, itemBundleCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemBundlesApi#createItemBundleAsync");
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
| **itemBundleCreateDto** | [**ItemBundleCreateDto**](ItemBundleCreateDto.md)|  | [optional] |

### Return type

[**ItemBundleDtoEnvelope**](ItemBundleDtoEnvelope.md)

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

<a id="deleteItemBundleAsync"></a>
# **deleteItemBundleAsync**
> deleteItemBundleAsync(tenantId, itemBundleId, apiVersion, xApiVersion)

Delete an item bundle

Deletes an item bundle for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemBundlesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemBundlesApi apiInstance = new ItemBundlesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemBundleId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteItemBundleAsync(tenantId, itemBundleId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemBundlesApi#deleteItemBundleAsync");
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
| **itemBundleId** | **UUID**|  | |
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

<a id="getItemBundleByIdAsync"></a>
# **getItemBundleByIdAsync**
> ItemBundleDtoEnvelope getItemBundleByIdAsync(itemBundleId, tenantId, apiVersion, xApiVersion)

Get item bundle by ID

Retrieves a specific item bundle by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemBundlesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemBundlesApi apiInstance = new ItemBundlesApi(defaultClient);
    UUID itemBundleId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemBundleDtoEnvelope result = apiInstance.getItemBundleByIdAsync(itemBundleId, tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemBundlesApi#getItemBundleByIdAsync");
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
| **itemBundleId** | **UUID**|  | |
| **tenantId** | **UUID**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemBundleDtoEnvelope**](ItemBundleDtoEnvelope.md)

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

<a id="getItemBundlesAsync"></a>
# **getItemBundlesAsync**
> ItemBundleDtoListEnvelope getItemBundlesAsync(tenantId, apiVersion, xApiVersion)

Get all item bundles

Retrieves all item bundles for the specified tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemBundlesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemBundlesApi apiInstance = new ItemBundlesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemBundleDtoListEnvelope result = apiInstance.getItemBundlesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemBundlesApi#getItemBundlesAsync");
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

[**ItemBundleDtoListEnvelope**](ItemBundleDtoListEnvelope.md)

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

<a id="getItemBundlesCountAsync"></a>
# **getItemBundlesCountAsync**
> Int32Envelope getItemBundlesCountAsync(tenantId, apiVersion, xApiVersion)

Get item bundles count

Returns the count of item bundles for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemBundlesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemBundlesApi apiInstance = new ItemBundlesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getItemBundlesCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemBundlesApi#getItemBundlesCountAsync");
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

<a id="updateItemBundleAsync"></a>
# **updateItemBundleAsync**
> ItemBundleDtoEnvelope updateItemBundleAsync(tenantId, itemBundleId, apiVersion, xApiVersion, itemBundleUpdateDto)

Update an item bundle

Updates an existing item bundle for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemBundlesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemBundlesApi apiInstance = new ItemBundlesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemBundleId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemBundleUpdateDto itemBundleUpdateDto = new ItemBundleUpdateDto(); // ItemBundleUpdateDto | 
    try {
      ItemBundleDtoEnvelope result = apiInstance.updateItemBundleAsync(tenantId, itemBundleId, apiVersion, xApiVersion, itemBundleUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemBundlesApi#updateItemBundleAsync");
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
| **itemBundleId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **itemBundleUpdateDto** | [**ItemBundleUpdateDto**](ItemBundleUpdateDto.md)|  | [optional] |

### Return type

[**ItemBundleDtoEnvelope**](ItemBundleDtoEnvelope.md)

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

