# RefundRequestsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRefundRequestAsync**](RefundRequestsApi.md#createRefundRequestAsync) | **POST** /api/v2/SupportService/RefundRequests | Create a refund request |
| [**deleteRefundRequestAsync**](RefundRequestsApi.md#deleteRefundRequestAsync) | **DELETE** /api/v2/SupportService/RefundRequests/{refundRequestId} | Delete a refund request |
| [**getRefundRequestAsync**](RefundRequestsApi.md#getRefundRequestAsync) | **GET** /api/v2/SupportService/RefundRequests/{refundRequestId} | Retrieve a refund request by ID |
| [**getRefundRequestsAsync**](RefundRequestsApi.md#getRefundRequestsAsync) | **GET** /api/v2/SupportService/RefundRequests | Retrieve refund requests |
| [**getRefundRequestsCountAsync**](RefundRequestsApi.md#getRefundRequestsCountAsync) | **GET** /api/v2/SupportService/RefundRequests/Count | Get refund requests count |
| [**updateRefundRequestAsync**](RefundRequestsApi.md#updateRefundRequestAsync) | **PUT** /api/v2/SupportService/RefundRequests/{refundRequestId} | Update a refund request |


<a id="createRefundRequestAsync"></a>
# **createRefundRequestAsync**
> EmptyEnvelope createRefundRequestAsync(tenantId, apiVersion, xApiVersion, refundRequestCreateDto)

Create a refund request

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RefundRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RefundRequestsApi apiInstance = new RefundRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    RefundRequestCreateDto refundRequestCreateDto = new RefundRequestCreateDto(); // RefundRequestCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createRefundRequestAsync(tenantId, apiVersion, xApiVersion, refundRequestCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RefundRequestsApi#createRefundRequestAsync");
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
| **refundRequestCreateDto** | [**RefundRequestCreateDto**](RefundRequestCreateDto.md)|  | [optional] |

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

<a id="deleteRefundRequestAsync"></a>
# **deleteRefundRequestAsync**
> EmptyEnvelope deleteRefundRequestAsync(tenantId, refundRequestId, apiVersion, xApiVersion)

Delete a refund request

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RefundRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RefundRequestsApi apiInstance = new RefundRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID refundRequestId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteRefundRequestAsync(tenantId, refundRequestId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RefundRequestsApi#deleteRefundRequestAsync");
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
| **refundRequestId** | **UUID**|  | |
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

<a id="getRefundRequestAsync"></a>
# **getRefundRequestAsync**
> RefundRequestDtoEnvelope getRefundRequestAsync(tenantId, refundRequestId, apiVersion, xApiVersion)

Retrieve a refund request by ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RefundRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RefundRequestsApi apiInstance = new RefundRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID refundRequestId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      RefundRequestDtoEnvelope result = apiInstance.getRefundRequestAsync(tenantId, refundRequestId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RefundRequestsApi#getRefundRequestAsync");
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
| **refundRequestId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**RefundRequestDtoEnvelope**](RefundRequestDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getRefundRequestsAsync"></a>
# **getRefundRequestsAsync**
> RefundRequestDtoListEnvelope getRefundRequestsAsync(tenantId, apiVersion, xApiVersion)

Retrieve refund requests

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RefundRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RefundRequestsApi apiInstance = new RefundRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      RefundRequestDtoListEnvelope result = apiInstance.getRefundRequestsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RefundRequestsApi#getRefundRequestsAsync");
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

[**RefundRequestDtoListEnvelope**](RefundRequestDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getRefundRequestsCountAsync"></a>
# **getRefundRequestsCountAsync**
> Int32Envelope getRefundRequestsCountAsync(tenantId, apiVersion, xApiVersion)

Get refund requests count

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RefundRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RefundRequestsApi apiInstance = new RefundRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getRefundRequestsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RefundRequestsApi#getRefundRequestsCountAsync");
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

<a id="updateRefundRequestAsync"></a>
# **updateRefundRequestAsync**
> EmptyEnvelope updateRefundRequestAsync(tenantId, refundRequestId, apiVersion, xApiVersion, refundRequestUpdateDto)

Update a refund request

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RefundRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RefundRequestsApi apiInstance = new RefundRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID refundRequestId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    RefundRequestUpdateDto refundRequestUpdateDto = new RefundRequestUpdateDto(); // RefundRequestUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateRefundRequestAsync(tenantId, refundRequestId, apiVersion, xApiVersion, refundRequestUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RefundRequestsApi#updateRefundRequestAsync");
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
| **refundRequestId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **refundRequestUpdateDto** | [**RefundRequestUpdateDto**](RefundRequestUpdateDto.md)|  | [optional] |

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

