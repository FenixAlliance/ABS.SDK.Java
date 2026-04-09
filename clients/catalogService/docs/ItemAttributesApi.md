# ItemAttributesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**countItemAttributesAsync**](ItemAttributesApi.md#countItemAttributesAsync) | **GET** /api/v2/CatalogService/ItemAttributes/Count | Count item attributes |
| [**createItemAttributeAsync**](ItemAttributesApi.md#createItemAttributeAsync) | **POST** /api/v2/CatalogService/ItemAttributes | Create a new item attribute |
| [**deleteItemAttributeAsync**](ItemAttributesApi.md#deleteItemAttributeAsync) | **DELETE** /api/v2/CatalogService/ItemAttributes/{itemAttributeId} | Delete an item attribute |
| [**getItemAttributeByIdAsync**](ItemAttributesApi.md#getItemAttributeByIdAsync) | **GET** /api/v2/CatalogService/ItemAttributes/{itemAttributeId} | Get item attribute by ID |
| [**getItemAttributesAsync**](ItemAttributesApi.md#getItemAttributesAsync) | **GET** /api/v2/CatalogService/ItemAttributes | Get all item attributes |
| [**updateItemAttributeAsync**](ItemAttributesApi.md#updateItemAttributeAsync) | **PUT** /api/v2/CatalogService/ItemAttributes/{itemAttributeId} | Update an item attribute |


<a id="countItemAttributesAsync"></a>
# **countItemAttributesAsync**
> Int32Envelope countItemAttributesAsync(tenantId, apiVersion, xApiVersion)

Count item attributes

Counts all item attributes for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemAttributesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemAttributesApi apiInstance = new ItemAttributesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.countItemAttributesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemAttributesApi#countItemAttributesAsync");
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

<a id="createItemAttributeAsync"></a>
# **createItemAttributeAsync**
> ItemAttributeDtoEnvelope createItemAttributeAsync(tenantId, apiVersion, xApiVersion, itemAttributeCreateDto)

Create a new item attribute

Creates a new item attribute for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemAttributesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemAttributesApi apiInstance = new ItemAttributesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemAttributeCreateDto itemAttributeCreateDto = new ItemAttributeCreateDto(); // ItemAttributeCreateDto | 
    try {
      ItemAttributeDtoEnvelope result = apiInstance.createItemAttributeAsync(tenantId, apiVersion, xApiVersion, itemAttributeCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemAttributesApi#createItemAttributeAsync");
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
| **itemAttributeCreateDto** | [**ItemAttributeCreateDto**](ItemAttributeCreateDto.md)|  | [optional] |

### Return type

[**ItemAttributeDtoEnvelope**](ItemAttributeDtoEnvelope.md)

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

<a id="deleteItemAttributeAsync"></a>
# **deleteItemAttributeAsync**
> deleteItemAttributeAsync(tenantId, itemAttributeId, apiVersion, xApiVersion)

Delete an item attribute

Deletes an item attribute for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemAttributesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemAttributesApi apiInstance = new ItemAttributesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemAttributeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteItemAttributeAsync(tenantId, itemAttributeId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemAttributesApi#deleteItemAttributeAsync");
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
| **itemAttributeId** | **UUID**|  | |
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

<a id="getItemAttributeByIdAsync"></a>
# **getItemAttributeByIdAsync**
> ItemAttributeDtoEnvelope getItemAttributeByIdAsync(itemAttributeId, apiVersion, xApiVersion)

Get item attribute by ID

Retrieves a specific item attribute by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemAttributesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemAttributesApi apiInstance = new ItemAttributesApi(defaultClient);
    UUID itemAttributeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemAttributeDtoEnvelope result = apiInstance.getItemAttributeByIdAsync(itemAttributeId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemAttributesApi#getItemAttributeByIdAsync");
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
| **itemAttributeId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemAttributeDtoEnvelope**](ItemAttributeDtoEnvelope.md)

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

<a id="getItemAttributesAsync"></a>
# **getItemAttributesAsync**
> ItemAttributeDtoListEnvelope getItemAttributesAsync(tenantId, apiVersion, xApiVersion)

Get all item attributes

Retrieves all item attributes for the specified tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemAttributesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemAttributesApi apiInstance = new ItemAttributesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemAttributeDtoListEnvelope result = apiInstance.getItemAttributesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemAttributesApi#getItemAttributesAsync");
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

[**ItemAttributeDtoListEnvelope**](ItemAttributeDtoListEnvelope.md)

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

<a id="updateItemAttributeAsync"></a>
# **updateItemAttributeAsync**
> updateItemAttributeAsync(tenantId, itemAttributeId, apiVersion, xApiVersion, itemAttributeUpdateDto)

Update an item attribute

Updates an existing item attribute for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemAttributesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemAttributesApi apiInstance = new ItemAttributesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemAttributeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemAttributeUpdateDto itemAttributeUpdateDto = new ItemAttributeUpdateDto(); // ItemAttributeUpdateDto | 
    try {
      apiInstance.updateItemAttributeAsync(tenantId, itemAttributeId, apiVersion, xApiVersion, itemAttributeUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemAttributesApi#updateItemAttributeAsync");
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
| **itemAttributeId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **itemAttributeUpdateDto** | [**ItemAttributeUpdateDto**](ItemAttributeUpdateDto.md)|  | [optional] |

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

