# ItemTypesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**countItemTypesAsync**](ItemTypesApi.md#countItemTypesAsync) | **GET** /api/v2/CatalogService/ItemTypes/Count | Count item types |
| [**createItemTypeAsync**](ItemTypesApi.md#createItemTypeAsync) | **POST** /api/v2/CatalogService/ItemTypes | Create a new item type |
| [**deleteItemTypeAsync**](ItemTypesApi.md#deleteItemTypeAsync) | **DELETE** /api/v2/CatalogService/ItemTypes/{itemTypeID} | Delete an item type |
| [**getItemTypeByIdAsync**](ItemTypesApi.md#getItemTypeByIdAsync) | **GET** /api/v2/CatalogService/ItemTypes/{itemTypeID} | Get item type by ID |
| [**getItemTypesAsync**](ItemTypesApi.md#getItemTypesAsync) | **GET** /api/v2/CatalogService/ItemTypes | Get all item types |
| [**updateItemTypeAsync**](ItemTypesApi.md#updateItemTypeAsync) | **PUT** /api/v2/CatalogService/ItemTypes/{itemTypeID} | Update an item type |


<a id="countItemTypesAsync"></a>
# **countItemTypesAsync**
> Int32Envelope countItemTypesAsync(tenantId, apiVersion, xApiVersion)

Count item types

Counts all item types for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ItemTypesApi apiInstance = new ItemTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.countItemTypesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemTypesApi#countItemTypesAsync");
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

<a id="createItemTypeAsync"></a>
# **createItemTypeAsync**
> ItemTypeDtoEnvelope createItemTypeAsync(tenantId, apiVersion, xApiVersion, itemTypeCreateDto)

Create a new item type

Creates a new item type for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ItemTypesApi apiInstance = new ItemTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemTypeCreateDto itemTypeCreateDto = new ItemTypeCreateDto(); // ItemTypeCreateDto | 
    try {
      ItemTypeDtoEnvelope result = apiInstance.createItemTypeAsync(tenantId, apiVersion, xApiVersion, itemTypeCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemTypesApi#createItemTypeAsync");
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
| **itemTypeCreateDto** | [**ItemTypeCreateDto**](ItemTypeCreateDto.md)|  | [optional] |

### Return type

[**ItemTypeDtoEnvelope**](ItemTypeDtoEnvelope.md)

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

<a id="deleteItemTypeAsync"></a>
# **deleteItemTypeAsync**
> ItemTypeDtoEnvelope deleteItemTypeAsync(tenantId, itemTypeID, apiVersion, xApiVersion)

Delete an item type

Deletes an item type for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ItemTypesApi apiInstance = new ItemTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemTypeID = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemTypeDtoEnvelope result = apiInstance.deleteItemTypeAsync(tenantId, itemTypeID, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemTypesApi#deleteItemTypeAsync");
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
| **itemTypeID** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemTypeDtoEnvelope**](ItemTypeDtoEnvelope.md)

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

<a id="getItemTypeByIdAsync"></a>
# **getItemTypeByIdAsync**
> ItemTypeDtoEnvelope getItemTypeByIdAsync(itemTypeID, apiVersion, xApiVersion)

Get item type by ID

Retrieves a specific item type by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ItemTypesApi apiInstance = new ItemTypesApi(defaultClient);
    UUID itemTypeID = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemTypeDtoEnvelope result = apiInstance.getItemTypeByIdAsync(itemTypeID, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemTypesApi#getItemTypeByIdAsync");
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
| **itemTypeID** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemTypeDtoEnvelope**](ItemTypeDtoEnvelope.md)

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

<a id="getItemTypesAsync"></a>
# **getItemTypesAsync**
> ItemTypeDtoListEnvelope getItemTypesAsync(tenantId, apiVersion, xApiVersion)

Get all item types

Retrieves all item types for the specified tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ItemTypesApi apiInstance = new ItemTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemTypeDtoListEnvelope result = apiInstance.getItemTypesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemTypesApi#getItemTypesAsync");
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

[**ItemTypeDtoListEnvelope**](ItemTypeDtoListEnvelope.md)

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

<a id="updateItemTypeAsync"></a>
# **updateItemTypeAsync**
> updateItemTypeAsync(tenantId, itemTypeID, apiVersion, xApiVersion, itemTypeUpdateDto)

Update an item type

Updates an existing item type for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ItemTypesApi apiInstance = new ItemTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemTypeID = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemTypeUpdateDto itemTypeUpdateDto = new ItemTypeUpdateDto(); // ItemTypeUpdateDto | 
    try {
      apiInstance.updateItemTypeAsync(tenantId, itemTypeID, apiVersion, xApiVersion, itemTypeUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemTypesApi#updateItemTypeAsync");
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
| **itemTypeID** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **itemTypeUpdateDto** | [**ItemTypeUpdateDto**](ItemTypeUpdateDto.md)|  | [optional] |

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

