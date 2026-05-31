# ReturnRequestsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createReturnRequestAsync**](ReturnRequestsApi.md#createReturnRequestAsync) | **POST** /api/v2/SupportService/ReturnRequests | Create a return request |
| [**deleteReturnRequestAsync**](ReturnRequestsApi.md#deleteReturnRequestAsync) | **DELETE** /api/v2/SupportService/ReturnRequests/{returnRequestId} | Delete a return request |
| [**getReturnRequestAsync**](ReturnRequestsApi.md#getReturnRequestAsync) | **GET** /api/v2/SupportService/ReturnRequests/{returnRequestId} | Retrieve a return request by ID |
| [**getReturnRequestsAsync**](ReturnRequestsApi.md#getReturnRequestsAsync) | **GET** /api/v2/SupportService/ReturnRequests | Retrieve return requests |
| [**getReturnRequestsCountAsync**](ReturnRequestsApi.md#getReturnRequestsCountAsync) | **GET** /api/v2/SupportService/ReturnRequests/Count | Get return requests count |
| [**updateReturnRequestAsync**](ReturnRequestsApi.md#updateReturnRequestAsync) | **PUT** /api/v2/SupportService/ReturnRequests/{returnRequestId} | Update a return request |


<a id="createReturnRequestAsync"></a>
# **createReturnRequestAsync**
> EmptyEnvelope createReturnRequestAsync(tenantId, apiVersion, xApiVersion, returnRequestCreateDto)

Create a return request

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReturnRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ReturnRequestsApi apiInstance = new ReturnRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ReturnRequestCreateDto returnRequestCreateDto = new ReturnRequestCreateDto(); // ReturnRequestCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createReturnRequestAsync(tenantId, apiVersion, xApiVersion, returnRequestCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnRequestsApi#createReturnRequestAsync");
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
| **returnRequestCreateDto** | [**ReturnRequestCreateDto**](ReturnRequestCreateDto.md)|  | [optional] |

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
| **200** | OK |  -  |

<a id="deleteReturnRequestAsync"></a>
# **deleteReturnRequestAsync**
> EmptyEnvelope deleteReturnRequestAsync(tenantId, returnRequestId, apiVersion, xApiVersion)

Delete a return request

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReturnRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ReturnRequestsApi apiInstance = new ReturnRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID returnRequestId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteReturnRequestAsync(tenantId, returnRequestId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnRequestsApi#deleteReturnRequestAsync");
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
| **returnRequestId** | **UUID**|  | |
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
| **200** | OK |  -  |

<a id="getReturnRequestAsync"></a>
# **getReturnRequestAsync**
> ReturnRequestDtoEnvelope getReturnRequestAsync(tenantId, returnRequestId, apiVersion, xApiVersion)

Retrieve a return request by ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReturnRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ReturnRequestsApi apiInstance = new ReturnRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID returnRequestId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ReturnRequestDtoEnvelope result = apiInstance.getReturnRequestAsync(tenantId, returnRequestId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnRequestsApi#getReturnRequestAsync");
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
| **returnRequestId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ReturnRequestDtoEnvelope**](ReturnRequestDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getReturnRequestsAsync"></a>
# **getReturnRequestsAsync**
> ReturnRequestDtoListEnvelope getReturnRequestsAsync(tenantId, apiVersion, xApiVersion)

Retrieve return requests

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReturnRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ReturnRequestsApi apiInstance = new ReturnRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ReturnRequestDtoListEnvelope result = apiInstance.getReturnRequestsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnRequestsApi#getReturnRequestsAsync");
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

[**ReturnRequestDtoListEnvelope**](ReturnRequestDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getReturnRequestsCountAsync"></a>
# **getReturnRequestsCountAsync**
> Int32Envelope getReturnRequestsCountAsync(tenantId, apiVersion, xApiVersion)

Get return requests count

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReturnRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ReturnRequestsApi apiInstance = new ReturnRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getReturnRequestsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnRequestsApi#getReturnRequestsCountAsync");
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

<a id="updateReturnRequestAsync"></a>
# **updateReturnRequestAsync**
> EmptyEnvelope updateReturnRequestAsync(tenantId, returnRequestId, apiVersion, xApiVersion, returnRequestUpdateDto)

Update a return request

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReturnRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ReturnRequestsApi apiInstance = new ReturnRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID returnRequestId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ReturnRequestUpdateDto returnRequestUpdateDto = new ReturnRequestUpdateDto(); // ReturnRequestUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateReturnRequestAsync(tenantId, returnRequestId, apiVersion, xApiVersion, returnRequestUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnRequestsApi#updateReturnRequestAsync");
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
| **returnRequestId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **returnRequestUpdateDto** | [**ReturnRequestUpdateDto**](ReturnRequestUpdateDto.md)|  | [optional] |

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
| **200** | OK |  -  |

