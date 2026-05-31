# ShippingClassesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createShippingClassAsync**](ShippingClassesApi.md#createShippingClassAsync) | **POST** /api/v2/ShipmentsService/ShippingClasses | Create a shipping class |
| [**deleteShippingClassAsync**](ShippingClassesApi.md#deleteShippingClassAsync) | **DELETE** /api/v2/ShipmentsService/ShippingClasses/{classId} | Delete a shipping class |
| [**getShippingClassByIdAsync**](ShippingClassesApi.md#getShippingClassByIdAsync) | **GET** /api/v2/ShipmentsService/ShippingClasses/{classId} | Get shipping class by ID |
| [**getShippingClassesAsync**](ShippingClassesApi.md#getShippingClassesAsync) | **GET** /api/v2/ShipmentsService/ShippingClasses | Get all shipping classes |
| [**getShippingClassesCountAsync**](ShippingClassesApi.md#getShippingClassesCountAsync) | **GET** /api/v2/ShipmentsService/ShippingClasses/Count | Get shipping classes count |
| [**updateShippingClassAsync**](ShippingClassesApi.md#updateShippingClassAsync) | **PUT** /api/v2/ShipmentsService/ShippingClasses/{classId} | Update a shipping class |


<a id="createShippingClassAsync"></a>
# **createShippingClassAsync**
> createShippingClassAsync(tenantId, apiVersion, xApiVersion, shippingClassCreateDto)

Create a shipping class

Creates a new shipping class.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShippingClassesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ShippingClassesApi apiInstance = new ShippingClassesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ShippingClassCreateDto shippingClassCreateDto = new ShippingClassCreateDto(); // ShippingClassCreateDto | 
    try {
      apiInstance.createShippingClassAsync(tenantId, apiVersion, xApiVersion, shippingClassCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingClassesApi#createShippingClassAsync");
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
| **shippingClassCreateDto** | [**ShippingClassCreateDto**](ShippingClassCreateDto.md)|  | [optional] |

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

<a id="deleteShippingClassAsync"></a>
# **deleteShippingClassAsync**
> deleteShippingClassAsync(tenantId, classId, apiVersion, xApiVersion)

Delete a shipping class

Deletes a shipping class.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShippingClassesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ShippingClassesApi apiInstance = new ShippingClassesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID classId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteShippingClassAsync(tenantId, classId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingClassesApi#deleteShippingClassAsync");
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
| **classId** | **UUID**|  | |
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

<a id="getShippingClassByIdAsync"></a>
# **getShippingClassByIdAsync**
> ShippingClassDtoEnvelope getShippingClassByIdAsync(tenantId, classId, apiVersion, xApiVersion)

Get shipping class by ID

Retrieves a specific shipping class.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShippingClassesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ShippingClassesApi apiInstance = new ShippingClassesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID classId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ShippingClassDtoEnvelope result = apiInstance.getShippingClassByIdAsync(tenantId, classId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingClassesApi#getShippingClassByIdAsync");
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
| **classId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ShippingClassDtoEnvelope**](ShippingClassDtoEnvelope.md)

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

<a id="getShippingClassesAsync"></a>
# **getShippingClassesAsync**
> ShippingClassDtoListEnvelope getShippingClassesAsync(tenantId, apiVersion, xApiVersion)

Get all shipping classes

Retrieves all shipping classes for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShippingClassesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ShippingClassesApi apiInstance = new ShippingClassesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ShippingClassDtoListEnvelope result = apiInstance.getShippingClassesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingClassesApi#getShippingClassesAsync");
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

[**ShippingClassDtoListEnvelope**](ShippingClassDtoListEnvelope.md)

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

<a id="getShippingClassesCountAsync"></a>
# **getShippingClassesCountAsync**
> Int32Envelope getShippingClassesCountAsync(tenantId, apiVersion, xApiVersion)

Get shipping classes count

Returns the count of shipping classes.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShippingClassesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ShippingClassesApi apiInstance = new ShippingClassesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getShippingClassesCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingClassesApi#getShippingClassesCountAsync");
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

<a id="updateShippingClassAsync"></a>
# **updateShippingClassAsync**
> updateShippingClassAsync(tenantId, classId, apiVersion, xApiVersion, shippingClassUpdateDto)

Update a shipping class

Updates an existing shipping class.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShippingClassesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ShippingClassesApi apiInstance = new ShippingClassesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID classId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ShippingClassUpdateDto shippingClassUpdateDto = new ShippingClassUpdateDto(); // ShippingClassUpdateDto | 
    try {
      apiInstance.updateShippingClassAsync(tenantId, classId, apiVersion, xApiVersion, shippingClassUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingClassesApi#updateShippingClassAsync");
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
| **classId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **shippingClassUpdateDto** | [**ShippingClassUpdateDto**](ShippingClassUpdateDto.md)|  | [optional] |

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

