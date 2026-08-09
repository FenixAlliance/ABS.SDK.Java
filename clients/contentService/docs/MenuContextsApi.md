# MenuContextsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**countMenuContextsAsync**](MenuContextsApi.md#countMenuContextsAsync) | **GET** /api/v2/ContentService/MenuContexts/Count | Count menu contexts |
| [**createMenuContextAsync**](MenuContextsApi.md#createMenuContextAsync) | **POST** /api/v2/ContentService/MenuContexts | Create a menu context |
| [**deleteMenuContextAsync**](MenuContextsApi.md#deleteMenuContextAsync) | **DELETE** /api/v2/ContentService/MenuContexts/{menuContextId} | Delete a menu context |
| [**getMenuContextByIdAsync**](MenuContextsApi.md#getMenuContextByIdAsync) | **GET** /api/v2/ContentService/MenuContexts/{menuContextId} | Get menu context by ID |
| [**getMenuContextsAsync**](MenuContextsApi.md#getMenuContextsAsync) | **GET** /api/v2/ContentService/MenuContexts | Get menu contexts |
| [**updateMenuContextAsync**](MenuContextsApi.md#updateMenuContextAsync) | **PUT** /api/v2/ContentService/MenuContexts/{menuContextId} | Update a menu context |


<a id="countMenuContextsAsync"></a>
# **countMenuContextsAsync**
> Int32Envelope countMenuContextsAsync(tenantId, apiVersion, xApiVersion, menuContextDtoCollectionQueryParameters)

Count menu contexts

Counts all menu contexts for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MenuContextsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    MenuContextsApi apiInstance = new MenuContextsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    MenuContextDtoCollectionQueryParameters menuContextDtoCollectionQueryParameters = new MenuContextDtoCollectionQueryParameters(); // MenuContextDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.countMenuContextsAsync(tenantId, apiVersion, xApiVersion, menuContextDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MenuContextsApi#countMenuContextsAsync");
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
| **menuContextDtoCollectionQueryParameters** | [**MenuContextDtoCollectionQueryParameters**](MenuContextDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

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

<a id="createMenuContextAsync"></a>
# **createMenuContextAsync**
> EmptyEnvelope createMenuContextAsync(tenantId, menuContextCreateDto, apiVersion, xApiVersion)

Create a menu context

Creates a new menu context for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MenuContextsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    MenuContextsApi apiInstance = new MenuContextsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    MenuContextCreateDto menuContextCreateDto = new MenuContextCreateDto(); // MenuContextCreateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.createMenuContextAsync(tenantId, menuContextCreateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MenuContextsApi#createMenuContextAsync");
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
| **menuContextCreateDto** | [**MenuContextCreateDto**](MenuContextCreateDto.md)|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

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
| **201** | Created |  -  |

<a id="deleteMenuContextAsync"></a>
# **deleteMenuContextAsync**
> EmptyEnvelope deleteMenuContextAsync(tenantId, menuContextId, apiVersion, xApiVersion)

Delete a menu context

Deletes a menu context for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MenuContextsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    MenuContextsApi apiInstance = new MenuContextsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID menuContextId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteMenuContextAsync(tenantId, menuContextId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MenuContextsApi#deleteMenuContextAsync");
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
| **menuContextId** | **UUID**|  | |
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

<a id="getMenuContextByIdAsync"></a>
# **getMenuContextByIdAsync**
> MenuContextDtoEnvelope getMenuContextByIdAsync(tenantId, menuContextId, apiVersion, xApiVersion)

Get menu context by ID

Retrieves a specific menu context by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MenuContextsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    MenuContextsApi apiInstance = new MenuContextsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID menuContextId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      MenuContextDtoEnvelope result = apiInstance.getMenuContextByIdAsync(tenantId, menuContextId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MenuContextsApi#getMenuContextByIdAsync");
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
| **menuContextId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**MenuContextDtoEnvelope**](MenuContextDtoEnvelope.md)

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

<a id="getMenuContextsAsync"></a>
# **getMenuContextsAsync**
> MenuContextDtoListEnvelope getMenuContextsAsync(tenantId, apiVersion, xApiVersion, menuContextDtoCollectionQueryParameters)

Get menu contexts

Retrieves all menu contexts for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MenuContextsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    MenuContextsApi apiInstance = new MenuContextsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    MenuContextDtoCollectionQueryParameters menuContextDtoCollectionQueryParameters = new MenuContextDtoCollectionQueryParameters(); // MenuContextDtoCollectionQueryParameters | 
    try {
      MenuContextDtoListEnvelope result = apiInstance.getMenuContextsAsync(tenantId, apiVersion, xApiVersion, menuContextDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MenuContextsApi#getMenuContextsAsync");
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
| **menuContextDtoCollectionQueryParameters** | [**MenuContextDtoCollectionQueryParameters**](MenuContextDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**MenuContextDtoListEnvelope**](MenuContextDtoListEnvelope.md)

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

<a id="updateMenuContextAsync"></a>
# **updateMenuContextAsync**
> EmptyEnvelope updateMenuContextAsync(tenantId, menuContextId, menuContextUpdateDto, apiVersion, xApiVersion)

Update a menu context

Updates an existing menu context for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MenuContextsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    MenuContextsApi apiInstance = new MenuContextsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID menuContextId = UUID.randomUUID(); // UUID | 
    MenuContextUpdateDto menuContextUpdateDto = new MenuContextUpdateDto(); // MenuContextUpdateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.updateMenuContextAsync(tenantId, menuContextId, menuContextUpdateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MenuContextsApi#updateMenuContextAsync");
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
| **menuContextId** | **UUID**|  | |
| **menuContextUpdateDto** | [**MenuContextUpdateDto**](MenuContextUpdateDto.md)|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

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

