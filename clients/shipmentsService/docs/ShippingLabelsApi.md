# ShippingLabelsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createShippingLabelAsync**](ShippingLabelsApi.md#createShippingLabelAsync) | **POST** /api/v2/ShipmentsService/ShippingLabels | Create a shipping label |
| [**deleteShippingLabelAsync**](ShippingLabelsApi.md#deleteShippingLabelAsync) | **DELETE** /api/v2/ShipmentsService/ShippingLabels/{labelId} | Delete a shipping label |
| [**getShippingLabelByIdAsync**](ShippingLabelsApi.md#getShippingLabelByIdAsync) | **GET** /api/v2/ShipmentsService/ShippingLabels/{labelId} | Get shipping label by ID |
| [**getShippingLabelsAsync**](ShippingLabelsApi.md#getShippingLabelsAsync) | **GET** /api/v2/ShipmentsService/ShippingLabels | Get all shipping labels |
| [**getShippingLabelsCountAsync**](ShippingLabelsApi.md#getShippingLabelsCountAsync) | **GET** /api/v2/ShipmentsService/ShippingLabels/Count | Get shipping labels count |
| [**updateShippingLabelAsync**](ShippingLabelsApi.md#updateShippingLabelAsync) | **PUT** /api/v2/ShipmentsService/ShippingLabels/{labelId} | Update a shipping label |


<a id="createShippingLabelAsync"></a>
# **createShippingLabelAsync**
> createShippingLabelAsync(tenantId, apiVersion, xApiVersion, shippingLabelCreateDto)

Create a shipping label

Creates a new shipping label.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShippingLabelsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ShippingLabelsApi apiInstance = new ShippingLabelsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ShippingLabelCreateDto shippingLabelCreateDto = new ShippingLabelCreateDto(); // ShippingLabelCreateDto | 
    try {
      apiInstance.createShippingLabelAsync(tenantId, apiVersion, xApiVersion, shippingLabelCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingLabelsApi#createShippingLabelAsync");
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
| **shippingLabelCreateDto** | [**ShippingLabelCreateDto**](ShippingLabelCreateDto.md)|  | [optional] |

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

<a id="deleteShippingLabelAsync"></a>
# **deleteShippingLabelAsync**
> deleteShippingLabelAsync(tenantId, labelId, apiVersion, xApiVersion)

Delete a shipping label

Deletes a shipping label.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShippingLabelsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ShippingLabelsApi apiInstance = new ShippingLabelsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID labelId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteShippingLabelAsync(tenantId, labelId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingLabelsApi#deleteShippingLabelAsync");
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
| **labelId** | **UUID**|  | |
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

<a id="getShippingLabelByIdAsync"></a>
# **getShippingLabelByIdAsync**
> ShippingLabelDtoEnvelope getShippingLabelByIdAsync(tenantId, labelId, apiVersion, xApiVersion)

Get shipping label by ID

Retrieves a specific shipping label.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShippingLabelsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ShippingLabelsApi apiInstance = new ShippingLabelsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID labelId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ShippingLabelDtoEnvelope result = apiInstance.getShippingLabelByIdAsync(tenantId, labelId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingLabelsApi#getShippingLabelByIdAsync");
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
| **labelId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ShippingLabelDtoEnvelope**](ShippingLabelDtoEnvelope.md)

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

<a id="getShippingLabelsAsync"></a>
# **getShippingLabelsAsync**
> ShippingLabelDtoListEnvelope getShippingLabelsAsync(tenantId, apiVersion, xApiVersion)

Get all shipping labels

Retrieves all shipping labels for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShippingLabelsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ShippingLabelsApi apiInstance = new ShippingLabelsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ShippingLabelDtoListEnvelope result = apiInstance.getShippingLabelsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingLabelsApi#getShippingLabelsAsync");
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

[**ShippingLabelDtoListEnvelope**](ShippingLabelDtoListEnvelope.md)

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

<a id="getShippingLabelsCountAsync"></a>
# **getShippingLabelsCountAsync**
> Int32Envelope getShippingLabelsCountAsync(tenantId, apiVersion, xApiVersion)

Get shipping labels count

Returns the count of shipping labels.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShippingLabelsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ShippingLabelsApi apiInstance = new ShippingLabelsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getShippingLabelsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingLabelsApi#getShippingLabelsCountAsync");
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

<a id="updateShippingLabelAsync"></a>
# **updateShippingLabelAsync**
> updateShippingLabelAsync(tenantId, labelId, apiVersion, xApiVersion, shippingLabelUpdateDto)

Update a shipping label

Updates an existing shipping label.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShippingLabelsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ShippingLabelsApi apiInstance = new ShippingLabelsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID labelId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ShippingLabelUpdateDto shippingLabelUpdateDto = new ShippingLabelUpdateDto(); // ShippingLabelUpdateDto | 
    try {
      apiInstance.updateShippingLabelAsync(tenantId, labelId, apiVersion, xApiVersion, shippingLabelUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingLabelsApi#updateShippingLabelAsync");
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
| **labelId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **shippingLabelUpdateDto** | [**ShippingLabelUpdateDto**](ShippingLabelUpdateDto.md)|  | [optional] |

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

