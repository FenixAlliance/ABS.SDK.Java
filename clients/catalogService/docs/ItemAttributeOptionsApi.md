# ItemAttributeOptionsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createItemAttributeOptionAsync**](ItemAttributeOptionsApi.md#createItemAttributeOptionAsync) | **POST** /api/v2/CatalogService/ItemAttributeOptions | Create a new item attribute option |
| [**deleteItemAttributeOptionAsync**](ItemAttributeOptionsApi.md#deleteItemAttributeOptionAsync) | **DELETE** /api/v2/CatalogService/ItemAttributeOptions/{itemAttributeOptionId} | Delete an item attribute option |
| [**getItemAttributeOptionByIdAsync**](ItemAttributeOptionsApi.md#getItemAttributeOptionByIdAsync) | **GET** /api/v2/CatalogService/ItemAttributeOptions/{itemAttributeOptionId} | Get item attribute option by ID |
| [**getItemAttributeOptionsAsync**](ItemAttributeOptionsApi.md#getItemAttributeOptionsAsync) | **GET** /api/v2/CatalogService/ItemAttributeOptions | Get all item attribute options |
| [**getItemAttributeOptionsCountAsync**](ItemAttributeOptionsApi.md#getItemAttributeOptionsCountAsync) | **GET** /api/v2/CatalogService/ItemAttributeOptions/Count | Get item attribute options count |
| [**updateItemAttributeOptionAsync**](ItemAttributeOptionsApi.md#updateItemAttributeOptionAsync) | **PUT** /api/v2/CatalogService/ItemAttributeOptions/{itemAttributeOptionId} | Update an item attribute option |


<a id="createItemAttributeOptionAsync"></a>
# **createItemAttributeOptionAsync**
> ItemAttributeOptionDtoEnvelope createItemAttributeOptionAsync(tenantId, apiVersion, xApiVersion, itemAttributeOptionCreateDto)

Create a new item attribute option

Creates a new item attribute option for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemAttributeOptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemAttributeOptionsApi apiInstance = new ItemAttributeOptionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemAttributeOptionCreateDto itemAttributeOptionCreateDto = new ItemAttributeOptionCreateDto(); // ItemAttributeOptionCreateDto | 
    try {
      ItemAttributeOptionDtoEnvelope result = apiInstance.createItemAttributeOptionAsync(tenantId, apiVersion, xApiVersion, itemAttributeOptionCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemAttributeOptionsApi#createItemAttributeOptionAsync");
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
| **itemAttributeOptionCreateDto** | [**ItemAttributeOptionCreateDto**](ItemAttributeOptionCreateDto.md)|  | [optional] |

### Return type

[**ItemAttributeOptionDtoEnvelope**](ItemAttributeOptionDtoEnvelope.md)

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

<a id="deleteItemAttributeOptionAsync"></a>
# **deleteItemAttributeOptionAsync**
> deleteItemAttributeOptionAsync(tenantId, itemAttributeOptionId, apiVersion, xApiVersion)

Delete an item attribute option

Deletes an item attribute option for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemAttributeOptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemAttributeOptionsApi apiInstance = new ItemAttributeOptionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemAttributeOptionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteItemAttributeOptionAsync(tenantId, itemAttributeOptionId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemAttributeOptionsApi#deleteItemAttributeOptionAsync");
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
| **itemAttributeOptionId** | **UUID**|  | |
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

<a id="getItemAttributeOptionByIdAsync"></a>
# **getItemAttributeOptionByIdAsync**
> ItemAttributeOptionDtoEnvelope getItemAttributeOptionByIdAsync(itemAttributeOptionId, tenantId, apiVersion, xApiVersion)

Get item attribute option by ID

Retrieves a specific item attribute option by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemAttributeOptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemAttributeOptionsApi apiInstance = new ItemAttributeOptionsApi(defaultClient);
    UUID itemAttributeOptionId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemAttributeOptionDtoEnvelope result = apiInstance.getItemAttributeOptionByIdAsync(itemAttributeOptionId, tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemAttributeOptionsApi#getItemAttributeOptionByIdAsync");
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
| **itemAttributeOptionId** | **UUID**|  | |
| **tenantId** | **UUID**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemAttributeOptionDtoEnvelope**](ItemAttributeOptionDtoEnvelope.md)

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

<a id="getItemAttributeOptionsAsync"></a>
# **getItemAttributeOptionsAsync**
> ItemAttributeOptionDtoListEnvelope getItemAttributeOptionsAsync(tenantId, apiVersion, xApiVersion)

Get all item attribute options

Retrieves all item attribute options for the specified tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemAttributeOptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemAttributeOptionsApi apiInstance = new ItemAttributeOptionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemAttributeOptionDtoListEnvelope result = apiInstance.getItemAttributeOptionsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemAttributeOptionsApi#getItemAttributeOptionsAsync");
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

[**ItemAttributeOptionDtoListEnvelope**](ItemAttributeOptionDtoListEnvelope.md)

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

<a id="getItemAttributeOptionsCountAsync"></a>
# **getItemAttributeOptionsCountAsync**
> Int32Envelope getItemAttributeOptionsCountAsync(tenantId, apiVersion, xApiVersion)

Get item attribute options count

Returns the count of item attribute options for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemAttributeOptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemAttributeOptionsApi apiInstance = new ItemAttributeOptionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getItemAttributeOptionsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemAttributeOptionsApi#getItemAttributeOptionsCountAsync");
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

<a id="updateItemAttributeOptionAsync"></a>
# **updateItemAttributeOptionAsync**
> ItemAttributeOptionDtoEnvelope updateItemAttributeOptionAsync(tenantId, itemAttributeOptionId, apiVersion, xApiVersion, itemAttributeOptionUpdateDto)

Update an item attribute option

Updates an existing item attribute option for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemAttributeOptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemAttributeOptionsApi apiInstance = new ItemAttributeOptionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemAttributeOptionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemAttributeOptionUpdateDto itemAttributeOptionUpdateDto = new ItemAttributeOptionUpdateDto(); // ItemAttributeOptionUpdateDto | 
    try {
      ItemAttributeOptionDtoEnvelope result = apiInstance.updateItemAttributeOptionAsync(tenantId, itemAttributeOptionId, apiVersion, xApiVersion, itemAttributeOptionUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemAttributeOptionsApi#updateItemAttributeOptionAsync");
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
| **itemAttributeOptionId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **itemAttributeOptionUpdateDto** | [**ItemAttributeOptionUpdateDto**](ItemAttributeOptionUpdateDto.md)|  | [optional] |

### Return type

[**ItemAttributeOptionDtoEnvelope**](ItemAttributeOptionDtoEnvelope.md)

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

