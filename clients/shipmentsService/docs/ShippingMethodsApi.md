# ShippingMethodsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createShippingMethodAsync**](ShippingMethodsApi.md#createShippingMethodAsync) | **POST** /api/v2/ShipmentsService/ShippingMethods | Create a shipping method |
| [**deleteShippingMethodAsync**](ShippingMethodsApi.md#deleteShippingMethodAsync) | **DELETE** /api/v2/ShipmentsService/ShippingMethods/{methodId} | Delete a shipping method |
| [**getShippingMethodByIdAsync**](ShippingMethodsApi.md#getShippingMethodByIdAsync) | **GET** /api/v2/ShipmentsService/ShippingMethods/{methodId} | Get shipping method by ID |
| [**getShippingMethodsAsync**](ShippingMethodsApi.md#getShippingMethodsAsync) | **GET** /api/v2/ShipmentsService/ShippingMethods | Get all shipping methods |
| [**getShippingMethodsCountAsync**](ShippingMethodsApi.md#getShippingMethodsCountAsync) | **GET** /api/v2/ShipmentsService/ShippingMethods/Count | Get shipping methods count |
| [**updateShippingMethodAsync**](ShippingMethodsApi.md#updateShippingMethodAsync) | **PUT** /api/v2/ShipmentsService/ShippingMethods/{methodId} | Update a shipping method |


<a id="createShippingMethodAsync"></a>
# **createShippingMethodAsync**
> createShippingMethodAsync(tenantId, apiVersion, xApiVersion, shippingMethodCreateDto)

Create a shipping method

Creates a new shipping method.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShippingMethodsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ShippingMethodsApi apiInstance = new ShippingMethodsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ShippingMethodCreateDto shippingMethodCreateDto = new ShippingMethodCreateDto(); // ShippingMethodCreateDto | 
    try {
      apiInstance.createShippingMethodAsync(tenantId, apiVersion, xApiVersion, shippingMethodCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingMethodsApi#createShippingMethodAsync");
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
| **shippingMethodCreateDto** | [**ShippingMethodCreateDto**](ShippingMethodCreateDto.md)|  | [optional] |

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

<a id="deleteShippingMethodAsync"></a>
# **deleteShippingMethodAsync**
> deleteShippingMethodAsync(tenantId, methodId, apiVersion, xApiVersion)

Delete a shipping method

Deletes a shipping method.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShippingMethodsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ShippingMethodsApi apiInstance = new ShippingMethodsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID methodId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteShippingMethodAsync(tenantId, methodId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingMethodsApi#deleteShippingMethodAsync");
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
| **methodId** | **UUID**|  | |
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

<a id="getShippingMethodByIdAsync"></a>
# **getShippingMethodByIdAsync**
> ShippingMethodDtoEnvelope getShippingMethodByIdAsync(tenantId, methodId, apiVersion, xApiVersion)

Get shipping method by ID

Retrieves a specific shipping method.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShippingMethodsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ShippingMethodsApi apiInstance = new ShippingMethodsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID methodId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ShippingMethodDtoEnvelope result = apiInstance.getShippingMethodByIdAsync(tenantId, methodId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingMethodsApi#getShippingMethodByIdAsync");
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
| **methodId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ShippingMethodDtoEnvelope**](ShippingMethodDtoEnvelope.md)

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

<a id="getShippingMethodsAsync"></a>
# **getShippingMethodsAsync**
> ShippingMethodDtoListEnvelope getShippingMethodsAsync(tenantId, apiVersion, xApiVersion)

Get all shipping methods

Retrieves all shipping methods for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShippingMethodsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ShippingMethodsApi apiInstance = new ShippingMethodsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ShippingMethodDtoListEnvelope result = apiInstance.getShippingMethodsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingMethodsApi#getShippingMethodsAsync");
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

[**ShippingMethodDtoListEnvelope**](ShippingMethodDtoListEnvelope.md)

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

<a id="getShippingMethodsCountAsync"></a>
# **getShippingMethodsCountAsync**
> Int32Envelope getShippingMethodsCountAsync(tenantId, apiVersion, xApiVersion)

Get shipping methods count

Returns the count of shipping methods.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShippingMethodsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ShippingMethodsApi apiInstance = new ShippingMethodsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getShippingMethodsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingMethodsApi#getShippingMethodsCountAsync");
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
| **200** | OK |  -  |

<a id="updateShippingMethodAsync"></a>
# **updateShippingMethodAsync**
> updateShippingMethodAsync(tenantId, methodId, apiVersion, xApiVersion, shippingMethodUpdateDto)

Update a shipping method

Updates an existing shipping method.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShippingMethodsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ShippingMethodsApi apiInstance = new ShippingMethodsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID methodId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ShippingMethodUpdateDto shippingMethodUpdateDto = new ShippingMethodUpdateDto(); // ShippingMethodUpdateDto | 
    try {
      apiInstance.updateShippingMethodAsync(tenantId, methodId, apiVersion, xApiVersion, shippingMethodUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingMethodsApi#updateShippingMethodAsync");
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
| **methodId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **shippingMethodUpdateDto** | [**ShippingMethodUpdateDto**](ShippingMethodUpdateDto.md)|  | [optional] |

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

