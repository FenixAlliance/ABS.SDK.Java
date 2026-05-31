# InquiryRequestsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createInquiryRequestAsync**](InquiryRequestsApi.md#createInquiryRequestAsync) | **POST** /api/v2/SupportService/InquiryRequests | Create an inquiry request |
| [**deleteInquiryRequestAsync**](InquiryRequestsApi.md#deleteInquiryRequestAsync) | **DELETE** /api/v2/SupportService/InquiryRequests/{inquiryRequestId} | Delete an inquiry request |
| [**getInquiryRequestAsync**](InquiryRequestsApi.md#getInquiryRequestAsync) | **GET** /api/v2/SupportService/InquiryRequests/{inquiryRequestId} | Retrieve an inquiry request by ID |
| [**getInquiryRequestsAsync**](InquiryRequestsApi.md#getInquiryRequestsAsync) | **GET** /api/v2/SupportService/InquiryRequests | Retrieve inquiry requests |
| [**getInquiryRequestsCountAsync**](InquiryRequestsApi.md#getInquiryRequestsCountAsync) | **GET** /api/v2/SupportService/InquiryRequests/Count | Get inquiry requests count |
| [**updateInquiryRequestAsync**](InquiryRequestsApi.md#updateInquiryRequestAsync) | **PUT** /api/v2/SupportService/InquiryRequests/{inquiryRequestId} | Update an inquiry request |


<a id="createInquiryRequestAsync"></a>
# **createInquiryRequestAsync**
> EmptyEnvelope createInquiryRequestAsync(tenantId, apiVersion, xApiVersion, inquiryRequestCreateDto)

Create an inquiry request

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InquiryRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    InquiryRequestsApi apiInstance = new InquiryRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    InquiryRequestCreateDto inquiryRequestCreateDto = new InquiryRequestCreateDto(); // InquiryRequestCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createInquiryRequestAsync(tenantId, apiVersion, xApiVersion, inquiryRequestCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InquiryRequestsApi#createInquiryRequestAsync");
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
| **inquiryRequestCreateDto** | [**InquiryRequestCreateDto**](InquiryRequestCreateDto.md)|  | [optional] |

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

<a id="deleteInquiryRequestAsync"></a>
# **deleteInquiryRequestAsync**
> EmptyEnvelope deleteInquiryRequestAsync(tenantId, inquiryRequestId, apiVersion, xApiVersion)

Delete an inquiry request

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InquiryRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    InquiryRequestsApi apiInstance = new InquiryRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID inquiryRequestId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteInquiryRequestAsync(tenantId, inquiryRequestId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InquiryRequestsApi#deleteInquiryRequestAsync");
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
| **inquiryRequestId** | **UUID**|  | |
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

<a id="getInquiryRequestAsync"></a>
# **getInquiryRequestAsync**
> InquiryRequestDtoEnvelope getInquiryRequestAsync(tenantId, inquiryRequestId, apiVersion, xApiVersion)

Retrieve an inquiry request by ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InquiryRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    InquiryRequestsApi apiInstance = new InquiryRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID inquiryRequestId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      InquiryRequestDtoEnvelope result = apiInstance.getInquiryRequestAsync(tenantId, inquiryRequestId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InquiryRequestsApi#getInquiryRequestAsync");
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
| **inquiryRequestId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**InquiryRequestDtoEnvelope**](InquiryRequestDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getInquiryRequestsAsync"></a>
# **getInquiryRequestsAsync**
> InquiryRequestDtoListEnvelope getInquiryRequestsAsync(tenantId, apiVersion, xApiVersion)

Retrieve inquiry requests

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InquiryRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    InquiryRequestsApi apiInstance = new InquiryRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      InquiryRequestDtoListEnvelope result = apiInstance.getInquiryRequestsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InquiryRequestsApi#getInquiryRequestsAsync");
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

[**InquiryRequestDtoListEnvelope**](InquiryRequestDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getInquiryRequestsCountAsync"></a>
# **getInquiryRequestsCountAsync**
> Int32Envelope getInquiryRequestsCountAsync(tenantId, apiVersion, xApiVersion)

Get inquiry requests count

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InquiryRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    InquiryRequestsApi apiInstance = new InquiryRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getInquiryRequestsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InquiryRequestsApi#getInquiryRequestsCountAsync");
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

<a id="updateInquiryRequestAsync"></a>
# **updateInquiryRequestAsync**
> EmptyEnvelope updateInquiryRequestAsync(tenantId, inquiryRequestId, apiVersion, xApiVersion, inquiryRequestUpdateDto)

Update an inquiry request

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InquiryRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    InquiryRequestsApi apiInstance = new InquiryRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID inquiryRequestId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    InquiryRequestUpdateDto inquiryRequestUpdateDto = new InquiryRequestUpdateDto(); // InquiryRequestUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateInquiryRequestAsync(tenantId, inquiryRequestId, apiVersion, xApiVersion, inquiryRequestUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InquiryRequestsApi#updateInquiryRequestAsync");
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
| **inquiryRequestId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **inquiryRequestUpdateDto** | [**InquiryRequestUpdateDto**](InquiryRequestUpdateDto.md)|  | [optional] |

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

