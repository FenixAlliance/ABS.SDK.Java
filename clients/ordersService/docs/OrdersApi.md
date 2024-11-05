# OrdersApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2OrdersServiceOrdersCountGet**](OrdersApi.md#apiV2OrdersServiceOrdersCountGet) | **GET** /api/v2/OrdersService/Orders/Count |  |
| [**apiV2OrdersServiceOrdersExtendedGet**](OrdersApi.md#apiV2OrdersServiceOrdersExtendedGet) | **GET** /api/v2/OrdersService/Orders/Extended |  |
| [**apiV2OrdersServiceOrdersOrderIdCalculatePut**](OrdersApi.md#apiV2OrdersServiceOrdersOrderIdCalculatePut) | **PUT** /api/v2/OrdersService/Orders/{orderId}/Calculate |  |
| [**apiV2OrdersServiceOrdersOrderIdDelete**](OrdersApi.md#apiV2OrdersServiceOrdersOrderIdDelete) | **DELETE** /api/v2/OrdersService/Orders/{orderId} |  |
| [**apiV2OrdersServiceOrdersOrderIdLinesCountGet**](OrdersApi.md#apiV2OrdersServiceOrdersOrderIdLinesCountGet) | **GET** /api/v2/OrdersService/Orders/{orderId}/Lines/Count |  |
| [**apiV2OrdersServiceOrdersOrderIdLinesGet**](OrdersApi.md#apiV2OrdersServiceOrdersOrderIdLinesGet) | **GET** /api/v2/OrdersService/Orders/{orderId}/Lines |  |
| [**apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdCalculatePut**](OrdersApi.md#apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdCalculatePut) | **PUT** /api/v2/OrdersService/Orders/{orderId}/Lines/{orderLineId}/Calculate |  |
| [**apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdDelete**](OrdersApi.md#apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdDelete) | **DELETE** /api/v2/OrdersService/Orders/{orderId}/Lines/{orderLineId} |  |
| [**apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdGet**](OrdersApi.md#apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdGet) | **GET** /api/v2/OrdersService/Orders/{orderId}/Lines/{orderLineId} |  |
| [**apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdPut**](OrdersApi.md#apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdPut) | **PUT** /api/v2/OrdersService/Orders/{orderId}/Lines/{orderLineId} |  |
| [**apiV2OrdersServiceOrdersOrderIdLinesPost**](OrdersApi.md#apiV2OrdersServiceOrdersOrderIdLinesPost) | **POST** /api/v2/OrdersService/Orders/{orderId}/Lines |  |
| [**apiV2OrdersServiceOrdersOrderIdPut**](OrdersApi.md#apiV2OrdersServiceOrdersOrderIdPut) | **PUT** /api/v2/OrdersService/Orders/{orderId} |  |
| [**apiV2OrdersServiceOrdersPost**](OrdersApi.md#apiV2OrdersServiceOrdersPost) | **POST** /api/v2/OrdersService/Orders |  |
| [**apiV2OrdersServiceOrdersSubmitCartPost**](OrdersApi.md#apiV2OrdersServiceOrdersSubmitCartPost) | **POST** /api/v2/OrdersService/Orders/SubmitCart |  |
| [**getOrderAsync**](OrdersApi.md#getOrderAsync) | **GET** /api/v2/OrdersService/Orders/{orderId} |  |
| [**getOrdersAsync**](OrdersApi.md#getOrdersAsync) | **GET** /api/v2/OrdersService/Orders |  |


<a id="apiV2OrdersServiceOrdersCountGet"></a>
# **apiV2OrdersServiceOrdersCountGet**
> Int32Envelope apiV2OrdersServiceOrdersCountGet(tenantId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.apiV2OrdersServiceOrdersCountGet(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#apiV2OrdersServiceOrdersCountGet");
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

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2OrdersServiceOrdersExtendedGet"></a>
# **apiV2OrdersServiceOrdersExtendedGet**
> ExtendedOrderDtoListEnvelope apiV2OrdersServiceOrdersExtendedGet(tenantId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      ExtendedOrderDtoListEnvelope result = apiInstance.apiV2OrdersServiceOrdersExtendedGet(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#apiV2OrdersServiceOrdersExtendedGet");
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

### Return type

[**ExtendedOrderDtoListEnvelope**](ExtendedOrderDtoListEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2OrdersServiceOrdersOrderIdCalculatePut"></a>
# **apiV2OrdersServiceOrdersOrderIdCalculatePut**
> EmptyEnvelope apiV2OrdersServiceOrdersOrderIdCalculatePut(tenantId, orderId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID orderId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.apiV2OrdersServiceOrdersOrderIdCalculatePut(tenantId, orderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#apiV2OrdersServiceOrdersOrderIdCalculatePut");
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
| **orderId** | **UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2OrdersServiceOrdersOrderIdDelete"></a>
# **apiV2OrdersServiceOrdersOrderIdDelete**
> EmptyEnvelope apiV2OrdersServiceOrdersOrderIdDelete(tenantId, orderId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID orderId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.apiV2OrdersServiceOrdersOrderIdDelete(tenantId, orderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#apiV2OrdersServiceOrdersOrderIdDelete");
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
| **orderId** | **UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2OrdersServiceOrdersOrderIdLinesCountGet"></a>
# **apiV2OrdersServiceOrdersOrderIdLinesCountGet**
> Int32Envelope apiV2OrdersServiceOrdersOrderIdLinesCountGet(tenantId, orderId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID orderId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.apiV2OrdersServiceOrdersOrderIdLinesCountGet(tenantId, orderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#apiV2OrdersServiceOrdersOrderIdLinesCountGet");
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
| **orderId** | **UUID**|  | |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2OrdersServiceOrdersOrderIdLinesGet"></a>
# **apiV2OrdersServiceOrdersOrderIdLinesGet**
> OrderLineDtoListEnvelope apiV2OrdersServiceOrdersOrderIdLinesGet(tenantId, orderId, itemId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID orderId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    try {
      OrderLineDtoListEnvelope result = apiInstance.apiV2OrdersServiceOrdersOrderIdLinesGet(tenantId, orderId, itemId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#apiV2OrdersServiceOrdersOrderIdLinesGet");
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
| **orderId** | **UUID**|  | |
| **itemId** | **UUID**|  | [optional] |

### Return type

[**OrderLineDtoListEnvelope**](OrderLineDtoListEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdCalculatePut"></a>
# **apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdCalculatePut**
> EmptyEnvelope apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdCalculatePut(tenantId, orderId, orderLineId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID orderId = UUID.randomUUID(); // UUID | 
    UUID orderLineId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdCalculatePut(tenantId, orderId, orderLineId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdCalculatePut");
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
| **orderId** | **UUID**|  | |
| **orderLineId** | **UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdDelete"></a>
# **apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdDelete**
> EmptyEnvelope apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdDelete(tenantId, orderId, orderLineId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID orderId = UUID.randomUUID(); // UUID | 
    UUID orderLineId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdDelete(tenantId, orderId, orderLineId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdDelete");
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
| **orderId** | **UUID**|  | |
| **orderLineId** | **UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdGet"></a>
# **apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdGet**
> OrderLineDtoEnvelope apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdGet(tenantId, orderId, orderLineId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID orderId = UUID.randomUUID(); // UUID | 
    UUID orderLineId = UUID.randomUUID(); // UUID | 
    try {
      OrderLineDtoEnvelope result = apiInstance.apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdGet(tenantId, orderId, orderLineId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdGet");
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
| **orderId** | **UUID**|  | |
| **orderLineId** | **UUID**|  | |

### Return type

[**OrderLineDtoEnvelope**](OrderLineDtoEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdPut"></a>
# **apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdPut**
> EmptyEnvelope apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdPut(tenantId, orderId, orderLineId, orderLineUpdateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID orderId = UUID.randomUUID(); // UUID | 
    UUID orderLineId = UUID.randomUUID(); // UUID | 
    OrderLineUpdateDto orderLineUpdateDto = new OrderLineUpdateDto(); // OrderLineUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdPut(tenantId, orderId, orderLineId, orderLineUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdPut");
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
| **orderId** | **UUID**|  | |
| **orderLineId** | **UUID**|  | |
| **orderLineUpdateDto** | [**OrderLineUpdateDto**](OrderLineUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2OrdersServiceOrdersOrderIdLinesPost"></a>
# **apiV2OrdersServiceOrdersOrderIdLinesPost**
> EmptyEnvelope apiV2OrdersServiceOrdersOrderIdLinesPost(tenantId, orderId, orderLineCreateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID orderId = UUID.randomUUID(); // UUID | 
    OrderLineCreateDto orderLineCreateDto = new OrderLineCreateDto(); // OrderLineCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.apiV2OrdersServiceOrdersOrderIdLinesPost(tenantId, orderId, orderLineCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#apiV2OrdersServiceOrdersOrderIdLinesPost");
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
| **orderId** | **UUID**|  | |
| **orderLineCreateDto** | [**OrderLineCreateDto**](OrderLineCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2OrdersServiceOrdersOrderIdPut"></a>
# **apiV2OrdersServiceOrdersOrderIdPut**
> EmptyEnvelope apiV2OrdersServiceOrdersOrderIdPut(tenantId, orderId, orderUpdateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID orderId = UUID.randomUUID(); // UUID | 
    OrderUpdateDto orderUpdateDto = new OrderUpdateDto(); // OrderUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.apiV2OrdersServiceOrdersOrderIdPut(tenantId, orderId, orderUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#apiV2OrdersServiceOrdersOrderIdPut");
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
| **orderId** | **UUID**|  | |
| **orderUpdateDto** | [**OrderUpdateDto**](OrderUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2OrdersServiceOrdersPost"></a>
# **apiV2OrdersServiceOrdersPost**
> EmptyEnvelope apiV2OrdersServiceOrdersPost(tenantId, orderCreateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    OrderCreateDto orderCreateDto = new OrderCreateDto(); // OrderCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.apiV2OrdersServiceOrdersPost(tenantId, orderCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#apiV2OrdersServiceOrdersPost");
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
| **orderCreateDto** | [**OrderCreateDto**](OrderCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2OrdersServiceOrdersSubmitCartPost"></a>
# **apiV2OrdersServiceOrdersSubmitCartPost**
> OrderDtoEnvelope apiV2OrdersServiceOrdersSubmitCartPost(cartId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID cartId = UUID.randomUUID(); // UUID | 
    try {
      OrderDtoEnvelope result = apiInstance.apiV2OrdersServiceOrdersSubmitCartPost(cartId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#apiV2OrdersServiceOrdersSubmitCartPost");
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
| **cartId** | **UUID**|  | |

### Return type

[**OrderDtoEnvelope**](OrderDtoEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getOrderAsync"></a>
# **getOrderAsync**
> OrderDtoEnvelope getOrderAsync(tenantId, orderId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID orderId = UUID.randomUUID(); // UUID | 
    try {
      OrderDtoEnvelope result = apiInstance.getOrderAsync(tenantId, orderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#getOrderAsync");
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
| **orderId** | **UUID**|  | |

### Return type

[**OrderDtoEnvelope**](OrderDtoEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getOrdersAsync"></a>
# **getOrdersAsync**
> OrderDtoListEnvelope getOrdersAsync(tenantId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      OrderDtoListEnvelope result = apiInstance.getOrdersAsync(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#getOrdersAsync");
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

### Return type

[**OrderDtoListEnvelope**](OrderDtoListEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

