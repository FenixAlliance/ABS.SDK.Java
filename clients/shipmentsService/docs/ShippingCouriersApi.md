# ShippingCouriersApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createShippingCourierAsync**](ShippingCouriersApi.md#createShippingCourierAsync) | **POST** /api/v2/ShipmentsService/ShippingCouriers | Create a shipping courier |
| [**deleteShippingCourierAsync**](ShippingCouriersApi.md#deleteShippingCourierAsync) | **DELETE** /api/v2/ShipmentsService/ShippingCouriers/{courierId} | Delete a shipping courier |
| [**getShippingCourierByIdAsync**](ShippingCouriersApi.md#getShippingCourierByIdAsync) | **GET** /api/v2/ShipmentsService/ShippingCouriers/{courierId} | Get shipping courier by ID |
| [**getShippingCouriersAsync**](ShippingCouriersApi.md#getShippingCouriersAsync) | **GET** /api/v2/ShipmentsService/ShippingCouriers | Get all shipping couriers |
| [**getShippingCouriersCountAsync**](ShippingCouriersApi.md#getShippingCouriersCountAsync) | **GET** /api/v2/ShipmentsService/ShippingCouriers/Count | Get shipping couriers count |
| [**updateShippingCourierAsync**](ShippingCouriersApi.md#updateShippingCourierAsync) | **PUT** /api/v2/ShipmentsService/ShippingCouriers/{courierId} | Update a shipping courier |


<a id="createShippingCourierAsync"></a>
# **createShippingCourierAsync**
> createShippingCourierAsync(tenantId, apiVersion, xApiVersion, shippingCourierCreateDto)

Create a shipping courier

Creates a new shipping courier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShippingCouriersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ShippingCouriersApi apiInstance = new ShippingCouriersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ShippingCourierCreateDto shippingCourierCreateDto = new ShippingCourierCreateDto(); // ShippingCourierCreateDto | 
    try {
      apiInstance.createShippingCourierAsync(tenantId, apiVersion, xApiVersion, shippingCourierCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingCouriersApi#createShippingCourierAsync");
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
| **shippingCourierCreateDto** | [**ShippingCourierCreateDto**](ShippingCourierCreateDto.md)|  | [optional] |

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
| **400** | Bad Request |  -  |
| **201** | Created |  -  |

<a id="deleteShippingCourierAsync"></a>
# **deleteShippingCourierAsync**
> deleteShippingCourierAsync(tenantId, courierId, apiVersion, xApiVersion)

Delete a shipping courier

Deletes a shipping courier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShippingCouriersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ShippingCouriersApi apiInstance = new ShippingCouriersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID courierId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteShippingCourierAsync(tenantId, courierId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingCouriersApi#deleteShippingCourierAsync");
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
| **courierId** | **UUID**|  | |
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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getShippingCourierByIdAsync"></a>
# **getShippingCourierByIdAsync**
> ShippingCourierDtoEnvelope getShippingCourierByIdAsync(tenantId, courierId, apiVersion, xApiVersion)

Get shipping courier by ID

Retrieves a specific shipping courier by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShippingCouriersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ShippingCouriersApi apiInstance = new ShippingCouriersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID courierId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ShippingCourierDtoEnvelope result = apiInstance.getShippingCourierByIdAsync(tenantId, courierId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingCouriersApi#getShippingCourierByIdAsync");
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
| **courierId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ShippingCourierDtoEnvelope**](ShippingCourierDtoEnvelope.md)

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

<a id="getShippingCouriersAsync"></a>
# **getShippingCouriersAsync**
> ShippingCourierDtoListEnvelope getShippingCouriersAsync(tenantId, apiVersion, xApiVersion)

Get all shipping couriers

Retrieves all shipping couriers for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShippingCouriersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ShippingCouriersApi apiInstance = new ShippingCouriersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ShippingCourierDtoListEnvelope result = apiInstance.getShippingCouriersAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingCouriersApi#getShippingCouriersAsync");
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

[**ShippingCourierDtoListEnvelope**](ShippingCourierDtoListEnvelope.md)

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

<a id="getShippingCouriersCountAsync"></a>
# **getShippingCouriersCountAsync**
> Int32Envelope getShippingCouriersCountAsync(tenantId, apiVersion, xApiVersion)

Get shipping couriers count

Returns the count of shipping couriers for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShippingCouriersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ShippingCouriersApi apiInstance = new ShippingCouriersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getShippingCouriersCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingCouriersApi#getShippingCouriersCountAsync");
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
| **200** | OK |  -  |

<a id="updateShippingCourierAsync"></a>
# **updateShippingCourierAsync**
> updateShippingCourierAsync(tenantId, courierId, apiVersion, xApiVersion, shippingCourierUpdateDto)

Update a shipping courier

Updates an existing shipping courier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShippingCouriersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ShippingCouriersApi apiInstance = new ShippingCouriersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID courierId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ShippingCourierUpdateDto shippingCourierUpdateDto = new ShippingCourierUpdateDto(); // ShippingCourierUpdateDto | 
    try {
      apiInstance.updateShippingCourierAsync(tenantId, courierId, apiVersion, xApiVersion, shippingCourierUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingCouriersApi#updateShippingCourierAsync");
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
| **courierId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **shippingCourierUpdateDto** | [**ShippingCourierUpdateDto**](ShippingCourierUpdateDto.md)|  | [optional] |

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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

