# WarrantyRequestsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createWarrantyRequestAsync**](WarrantyRequestsApi.md#createWarrantyRequestAsync) | **POST** /api/v2/SupportService/WarrantyRequests | Create a warranty request |
| [**deleteWarrantyRequestAsync**](WarrantyRequestsApi.md#deleteWarrantyRequestAsync) | **DELETE** /api/v2/SupportService/WarrantyRequests/{warrantyRequestId} | Delete a warranty request |
| [**getWarrantyRequestAsync**](WarrantyRequestsApi.md#getWarrantyRequestAsync) | **GET** /api/v2/SupportService/WarrantyRequests/{warrantyRequestId} | Retrieve a warranty request by ID |
| [**getWarrantyRequestsAsync**](WarrantyRequestsApi.md#getWarrantyRequestsAsync) | **GET** /api/v2/SupportService/WarrantyRequests | Retrieve warranty requests |
| [**getWarrantyRequestsCountAsync**](WarrantyRequestsApi.md#getWarrantyRequestsCountAsync) | **GET** /api/v2/SupportService/WarrantyRequests/Count | Get warranty requests count |
| [**updateWarrantyRequestAsync**](WarrantyRequestsApi.md#updateWarrantyRequestAsync) | **PUT** /api/v2/SupportService/WarrantyRequests/{warrantyRequestId} | Update a warranty request |


<a id="createWarrantyRequestAsync"></a>
# **createWarrantyRequestAsync**
> EmptyEnvelope createWarrantyRequestAsync(tenantId, apiVersion, xApiVersion, warrantyRequestCreateDto)

Create a warranty request

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WarrantyRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WarrantyRequestsApi apiInstance = new WarrantyRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    WarrantyRequestCreateDto warrantyRequestCreateDto = new WarrantyRequestCreateDto(); // WarrantyRequestCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createWarrantyRequestAsync(tenantId, apiVersion, xApiVersion, warrantyRequestCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WarrantyRequestsApi#createWarrantyRequestAsync");
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
| **warrantyRequestCreateDto** | [**WarrantyRequestCreateDto**](WarrantyRequestCreateDto.md)|  | [optional] |

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

<a id="deleteWarrantyRequestAsync"></a>
# **deleteWarrantyRequestAsync**
> EmptyEnvelope deleteWarrantyRequestAsync(tenantId, warrantyRequestId, apiVersion, xApiVersion)

Delete a warranty request

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WarrantyRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WarrantyRequestsApi apiInstance = new WarrantyRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID warrantyRequestId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteWarrantyRequestAsync(tenantId, warrantyRequestId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WarrantyRequestsApi#deleteWarrantyRequestAsync");
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
| **warrantyRequestId** | **UUID**|  | |
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

<a id="getWarrantyRequestAsync"></a>
# **getWarrantyRequestAsync**
> WarrantyRequestDtoEnvelope getWarrantyRequestAsync(tenantId, warrantyRequestId, apiVersion, xApiVersion)

Retrieve a warranty request by ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WarrantyRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WarrantyRequestsApi apiInstance = new WarrantyRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID warrantyRequestId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      WarrantyRequestDtoEnvelope result = apiInstance.getWarrantyRequestAsync(tenantId, warrantyRequestId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WarrantyRequestsApi#getWarrantyRequestAsync");
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
| **warrantyRequestId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**WarrantyRequestDtoEnvelope**](WarrantyRequestDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getWarrantyRequestsAsync"></a>
# **getWarrantyRequestsAsync**
> WarrantyRequestDtoListEnvelope getWarrantyRequestsAsync(tenantId, apiVersion, xApiVersion)

Retrieve warranty requests

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WarrantyRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WarrantyRequestsApi apiInstance = new WarrantyRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      WarrantyRequestDtoListEnvelope result = apiInstance.getWarrantyRequestsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WarrantyRequestsApi#getWarrantyRequestsAsync");
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

[**WarrantyRequestDtoListEnvelope**](WarrantyRequestDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getWarrantyRequestsCountAsync"></a>
# **getWarrantyRequestsCountAsync**
> Int32Envelope getWarrantyRequestsCountAsync(tenantId, apiVersion, xApiVersion)

Get warranty requests count

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WarrantyRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WarrantyRequestsApi apiInstance = new WarrantyRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getWarrantyRequestsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WarrantyRequestsApi#getWarrantyRequestsCountAsync");
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

<a id="updateWarrantyRequestAsync"></a>
# **updateWarrantyRequestAsync**
> EmptyEnvelope updateWarrantyRequestAsync(tenantId, warrantyRequestId, apiVersion, xApiVersion, warrantyRequestUpdateDto)

Update a warranty request

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WarrantyRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WarrantyRequestsApi apiInstance = new WarrantyRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID warrantyRequestId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    WarrantyRequestUpdateDto warrantyRequestUpdateDto = new WarrantyRequestUpdateDto(); // WarrantyRequestUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateWarrantyRequestAsync(tenantId, warrantyRequestId, apiVersion, xApiVersion, warrantyRequestUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WarrantyRequestsApi#updateWarrantyRequestAsync");
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
| **warrantyRequestId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **warrantyRequestUpdateDto** | [**WarrantyRequestUpdateDto**](WarrantyRequestUpdateDto.md)|  | [optional] |

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

