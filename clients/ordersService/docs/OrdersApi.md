# OrdersApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**calculateOrder**](OrdersApi.md#calculateOrder) | **PUT** /api/v2/OrdersService/Orders/{orderId}/Calculate | Calculates totals for an order. |
| [**calculateOrderLine**](OrdersApi.md#calculateOrderLine) | **PUT** /api/v2/OrdersService/Orders/{orderId}/Lines/{orderLineId}/Calculate | Calculates totals for an order line. |
| [**createOrder**](OrdersApi.md#createOrder) | **POST** /api/v2/OrdersService/Orders | Creates a new order. |
| [**createOrderLine**](OrdersApi.md#createOrderLine) | **POST** /api/v2/OrdersService/Orders/{orderId}/Lines | Creates a new order line. |
| [**deleteOrder**](OrdersApi.md#deleteOrder) | **DELETE** /api/v2/OrdersService/Orders/{orderId} | Deletes an order. |
| [**deleteOrderLine**](OrdersApi.md#deleteOrderLine) | **DELETE** /api/v2/OrdersService/Orders/{orderId}/Lines/{orderLineId} | Deletes an order line. |
| [**getExtendedOrders**](OrdersApi.md#getExtendedOrders) | **GET** /api/v2/OrdersService/Orders/Extended | Gets a list of extended orders for a tenant. |
| [**getOrder**](OrdersApi.md#getOrder) | **GET** /api/v2/OrdersService/Orders/{orderId} | Gets a specific order by ID. |
| [**getOrderLine**](OrdersApi.md#getOrderLine) | **GET** /api/v2/OrdersService/Orders/{orderId}/Lines/{orderLineId} | Gets a specific order line. |
| [**getOrderLines**](OrdersApi.md#getOrderLines) | **GET** /api/v2/OrdersService/Orders/{orderId}/Lines | Gets order lines for an order. |
| [**getOrderLinesCount**](OrdersApi.md#getOrderLinesCount) | **GET** /api/v2/OrdersService/Orders/{orderId}/Lines/Count | Gets the count of order lines for an order. |
| [**getOrders**](OrdersApi.md#getOrders) | **GET** /api/v2/OrdersService/Orders | Gets a list of orders for a tenant. |
| [**getOrdersCount**](OrdersApi.md#getOrdersCount) | **GET** /api/v2/OrdersService/Orders/Count | Gets the count of orders for a tenant. |
| [**previewOrderEmailTemplate**](OrdersApi.md#previewOrderEmailTemplate) | **POST** /api/v2/OrdersService/Orders/{orderId}/Emails/Preview | Preview the rendered email for an Order. |
| [**sendOrderEmail**](OrdersApi.md#sendOrderEmail) | **POST** /api/v2/OrdersService/Orders/{orderId}/Emails/Send | Send a transactional email for an order. |
| [**submitCart**](OrdersApi.md#submitCart) | **POST** /api/v2/OrdersService/Orders/SubmitCart | Submits a cart and creates an order. |
| [**updateOrder**](OrdersApi.md#updateOrder) | **PUT** /api/v2/OrdersService/Orders/{orderId} | Updates an existing order. |
| [**updateOrderLine**](OrdersApi.md#updateOrderLine) | **PUT** /api/v2/OrdersService/Orders/{orderId}/Lines/{orderLineId} | Updates an order line. |


<a id="calculateOrder"></a>
# **calculateOrder**
> EmptyEnvelope calculateOrder(tenantId, orderId)

Calculates totals for an order.

Performs calculation of totals and taxes for the specified order.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID orderId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.calculateOrder(tenantId, orderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#calculateOrder");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="calculateOrderLine"></a>
# **calculateOrderLine**
> EmptyEnvelope calculateOrderLine(tenantId, orderId, orderLineId)

Calculates totals for an order line.

Performs calculation of totals and taxes for the specified order line.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID orderId = UUID.randomUUID(); // UUID | 
    UUID orderLineId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.calculateOrderLine(tenantId, orderId, orderLineId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#calculateOrderLine");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="createOrder"></a>
# **createOrder**
> EmptyEnvelope createOrder(tenantId, orderCreateDto)

Creates a new order.

Creates a new order for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    OrderCreateDto orderCreateDto = new OrderCreateDto(); // OrderCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createOrder(tenantId, orderCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#createOrder");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="createOrderLine"></a>
# **createOrderLine**
> EmptyEnvelope createOrderLine(tenantId, orderId, orderLineCreateDto)

Creates a new order line.

Creates a new line (item) for the specified order.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID orderId = UUID.randomUUID(); // UUID | 
    OrderLineCreateDto orderLineCreateDto = new OrderLineCreateDto(); // OrderLineCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createOrderLine(tenantId, orderId, orderLineCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#createOrderLine");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="deleteOrder"></a>
# **deleteOrder**
> EmptyEnvelope deleteOrder(tenantId, orderId)

Deletes an order.

Deletes the specified order.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID orderId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.deleteOrder(tenantId, orderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#deleteOrder");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="deleteOrderLine"></a>
# **deleteOrderLine**
> EmptyEnvelope deleteOrderLine(tenantId, orderId, orderLineId)

Deletes an order line.

Deletes the specified order line.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID orderId = UUID.randomUUID(); // UUID | 
    UUID orderLineId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.deleteOrderLine(tenantId, orderId, orderLineId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#deleteOrderLine");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getExtendedOrders"></a>
# **getExtendedOrders**
> ExtendedOrderDtoListEnvelope getExtendedOrders(tenantId)

Gets a list of extended orders for a tenant.

Retrieves a list of extended order details for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      ExtendedOrderDtoListEnvelope result = apiInstance.getExtendedOrders(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#getExtendedOrders");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getOrder"></a>
# **getOrder**
> OrderDtoEnvelope getOrder(tenantId, orderId)

Gets a specific order by ID.

Retrieves the details of a specific order by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID orderId = UUID.randomUUID(); // UUID | 
    try {
      OrderDtoEnvelope result = apiInstance.getOrder(tenantId, orderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#getOrder");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getOrderLine"></a>
# **getOrderLine**
> OrderLineDtoEnvelope getOrderLine(tenantId, orderId, orderLineId)

Gets a specific order line.

Retrieves the details of a specific order line by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID orderId = UUID.randomUUID(); // UUID | 
    UUID orderLineId = UUID.randomUUID(); // UUID | 
    try {
      OrderLineDtoEnvelope result = apiInstance.getOrderLine(tenantId, orderId, orderLineId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#getOrderLine");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getOrderLines"></a>
# **getOrderLines**
> OrderLineDtoListEnvelope getOrderLines(tenantId, orderId, itemId)

Gets order lines for an order.

Retrieves the lines (items) for the specified order.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID orderId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    try {
      OrderLineDtoListEnvelope result = apiInstance.getOrderLines(tenantId, orderId, itemId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#getOrderLines");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getOrderLinesCount"></a>
# **getOrderLinesCount**
> Int32Envelope getOrderLinesCount(tenantId, orderId)

Gets the count of order lines for an order.

Retrieves the total number of lines for the specified order.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID orderId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.getOrderLinesCount(tenantId, orderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#getOrderLinesCount");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getOrders"></a>
# **getOrders**
> OrderDtoListEnvelope getOrders(tenantId)

Gets a list of orders for a tenant.

Retrieves a list of orders for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      OrderDtoListEnvelope result = apiInstance.getOrders(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#getOrders");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getOrdersCount"></a>
# **getOrdersCount**
> Int32Envelope getOrdersCount(tenantId)

Gets the count of orders for a tenant.

Retrieves the total number of orders for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.getOrdersCount(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#getOrdersCount");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="previewOrderEmailTemplate"></a>
# **previewOrderEmailTemplate**
> previewOrderEmailTemplate(orderId, tenantId, emailDispatchRequest)

Preview the rendered email for an Order.

Previews the rendered email template for the specified order. Only users with the &#39;send_email&#39; permission are permitted.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID orderId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    EmailDispatchRequest emailDispatchRequest = new EmailDispatchRequest(); // EmailDispatchRequest | 
    try {
      apiInstance.previewOrderEmailTemplate(orderId, tenantId, emailDispatchRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#previewOrderEmailTemplate");
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
| **orderId** | **UUID**|  | |
| **tenantId** | **UUID**|  | |
| **emailDispatchRequest** | [**EmailDispatchRequest**](EmailDispatchRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="sendOrderEmail"></a>
# **sendOrderEmail**
> EmptyEnvelope sendOrderEmail(tenantId, orderId, emailDispatchRequest)

Send a transactional email for an order.

Sends a transactional email for the specified order. Only users with the &#39;send_email&#39; permission are permitted.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID orderId = UUID.randomUUID(); // UUID | 
    EmailDispatchRequest emailDispatchRequest = new EmailDispatchRequest(); // EmailDispatchRequest | 
    try {
      EmptyEnvelope result = apiInstance.sendOrderEmail(tenantId, orderId, emailDispatchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#sendOrderEmail");
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
| **emailDispatchRequest** | [**EmailDispatchRequest**](EmailDispatchRequest.md)|  | [optional] |

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

<a id="submitCart"></a>
# **submitCart**
> OrderDtoEnvelope submitCart(cartId)

Submits a cart and creates an order.

Submits the specified cart and creates an order for the authenticated user.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID cartId = UUID.randomUUID(); // UUID | 
    try {
      OrderDtoEnvelope result = apiInstance.submitCart(cartId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#submitCart");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="updateOrder"></a>
# **updateOrder**
> EmptyEnvelope updateOrder(tenantId, orderId, orderUpdateDto)

Updates an existing order.

Updates the details of an existing order.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID orderId = UUID.randomUUID(); // UUID | 
    OrderUpdateDto orderUpdateDto = new OrderUpdateDto(); // OrderUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateOrder(tenantId, orderId, orderUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#updateOrder");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="updateOrderLine"></a>
# **updateOrderLine**
> EmptyEnvelope updateOrderLine(tenantId, orderId, orderLineId, orderLineUpdateDto)

Updates an order line.

Updates the details of a specific order line.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID orderId = UUID.randomUUID(); // UUID | 
    UUID orderLineId = UUID.randomUUID(); // UUID | 
    OrderLineUpdateDto orderLineUpdateDto = new OrderLineUpdateDto(); // OrderLineUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateOrderLine(tenantId, orderId, orderLineId, orderLineUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#updateOrderLine");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

