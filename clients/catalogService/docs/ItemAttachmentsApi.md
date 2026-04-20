# ItemAttachmentsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createItemAttachmentAsync**](ItemAttachmentsApi.md#createItemAttachmentAsync) | **POST** /api/v2/CatalogService/ItemAttachments | Create a new item attachment |
| [**deleteItemAttachmentAsync**](ItemAttachmentsApi.md#deleteItemAttachmentAsync) | **DELETE** /api/v2/CatalogService/ItemAttachments/{itemAttachmentId} | Delete an item attachment |
| [**getItemAttachmentByIdAsync**](ItemAttachmentsApi.md#getItemAttachmentByIdAsync) | **GET** /api/v2/CatalogService/ItemAttachments/{itemAttachmentId} | Get item attachment by ID |
| [**getItemAttachmentsAsync**](ItemAttachmentsApi.md#getItemAttachmentsAsync) | **GET** /api/v2/CatalogService/ItemAttachments | Get all item attachments |
| [**updateItemAttachmentAsync**](ItemAttachmentsApi.md#updateItemAttachmentAsync) | **PUT** /api/v2/CatalogService/ItemAttachments/{itemAttachmentId} | Update an item attachment |


<a id="createItemAttachmentAsync"></a>
# **createItemAttachmentAsync**
> ItemAttachmentDtoEnvelope createItemAttachmentAsync(tenantId, apiVersion, xApiVersion, itemAttachmentCreateDto)

Create a new item attachment

Creates a new item attachment for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemAttachmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ItemAttachmentsApi apiInstance = new ItemAttachmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemAttachmentCreateDto itemAttachmentCreateDto = new ItemAttachmentCreateDto(); // ItemAttachmentCreateDto | 
    try {
      ItemAttachmentDtoEnvelope result = apiInstance.createItemAttachmentAsync(tenantId, apiVersion, xApiVersion, itemAttachmentCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemAttachmentsApi#createItemAttachmentAsync");
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
| **itemAttachmentCreateDto** | [**ItemAttachmentCreateDto**](ItemAttachmentCreateDto.md)|  | [optional] |

### Return type

[**ItemAttachmentDtoEnvelope**](ItemAttachmentDtoEnvelope.md)

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

<a id="deleteItemAttachmentAsync"></a>
# **deleteItemAttachmentAsync**
> EmptyEnvelope deleteItemAttachmentAsync(tenantId, itemAttachmentId, apiVersion, xApiVersion)

Delete an item attachment

Deletes an item attachment for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemAttachmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ItemAttachmentsApi apiInstance = new ItemAttachmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemAttachmentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteItemAttachmentAsync(tenantId, itemAttachmentId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemAttachmentsApi#deleteItemAttachmentAsync");
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
| **itemAttachmentId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

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

<a id="getItemAttachmentByIdAsync"></a>
# **getItemAttachmentByIdAsync**
> ItemAttachmentDtoEnvelope getItemAttachmentByIdAsync(itemAttachmentId, apiVersion, xApiVersion)

Get item attachment by ID

Retrieves a specific item attachment by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemAttachmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ItemAttachmentsApi apiInstance = new ItemAttachmentsApi(defaultClient);
    UUID itemAttachmentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemAttachmentDtoEnvelope result = apiInstance.getItemAttachmentByIdAsync(itemAttachmentId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemAttachmentsApi#getItemAttachmentByIdAsync");
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
| **itemAttachmentId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemAttachmentDtoEnvelope**](ItemAttachmentDtoEnvelope.md)

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

<a id="getItemAttachmentsAsync"></a>
# **getItemAttachmentsAsync**
> ItemAttachmentDtoListEnvelope getItemAttachmentsAsync(tenantId, apiVersion, xApiVersion)

Get all item attachments

Retrieves all item attachments for the specified tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemAttachmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ItemAttachmentsApi apiInstance = new ItemAttachmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemAttachmentDtoListEnvelope result = apiInstance.getItemAttachmentsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemAttachmentsApi#getItemAttachmentsAsync");
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

[**ItemAttachmentDtoListEnvelope**](ItemAttachmentDtoListEnvelope.md)

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

<a id="updateItemAttachmentAsync"></a>
# **updateItemAttachmentAsync**
> EmptyEnvelope updateItemAttachmentAsync(tenantId, itemAttachmentId, apiVersion, xApiVersion, itemAttachmentUpdateDto)

Update an item attachment

Updates an existing item attachment for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemAttachmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ItemAttachmentsApi apiInstance = new ItemAttachmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemAttachmentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemAttachmentUpdateDto itemAttachmentUpdateDto = new ItemAttachmentUpdateDto(); // ItemAttachmentUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateItemAttachmentAsync(tenantId, itemAttachmentId, apiVersion, xApiVersion, itemAttachmentUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemAttachmentsApi#updateItemAttachmentAsync");
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
| **itemAttachmentId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **itemAttachmentUpdateDto** | [**ItemAttachmentUpdateDto**](ItemAttachmentUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

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

