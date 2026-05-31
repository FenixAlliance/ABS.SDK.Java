# RefundPoliciesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRefundPolicyAsync**](RefundPoliciesApi.md#createRefundPolicyAsync) | **POST** /api/v2/SupportService/RefundPolicies | Create a new refund policy |
| [**deleteRefundPolicyAsync**](RefundPoliciesApi.md#deleteRefundPolicyAsync) | **DELETE** /api/v2/SupportService/RefundPolicies/{refundPolicyId} | Delete a refund policy |
| [**getRefundPoliciesAsync**](RefundPoliciesApi.md#getRefundPoliciesAsync) | **GET** /api/v2/SupportService/RefundPolicies | Retrieve a list of refund policies |
| [**getRefundPoliciesCountAsync**](RefundPoliciesApi.md#getRefundPoliciesCountAsync) | **GET** /api/v2/SupportService/RefundPolicies/Count | Get the count of refund policies |
| [**getRefundPolicyAsync**](RefundPoliciesApi.md#getRefundPolicyAsync) | **GET** /api/v2/SupportService/RefundPolicies/{refundPolicyId} | Retrieve a refund policy by ID |
| [**updateRefundPolicyAsync**](RefundPoliciesApi.md#updateRefundPolicyAsync) | **PUT** /api/v2/SupportService/RefundPolicies/{refundPolicyId} | Update a refund policy |


<a id="createRefundPolicyAsync"></a>
# **createRefundPolicyAsync**
> EmptyEnvelope createRefundPolicyAsync(tenantId, apiVersion, xApiVersion, itemRefundPolicyCreateDto)

Create a new refund policy

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RefundPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RefundPoliciesApi apiInstance = new RefundPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemRefundPolicyCreateDto itemRefundPolicyCreateDto = new ItemRefundPolicyCreateDto(); // ItemRefundPolicyCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createRefundPolicyAsync(tenantId, apiVersion, xApiVersion, itemRefundPolicyCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RefundPoliciesApi#createRefundPolicyAsync");
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
| **itemRefundPolicyCreateDto** | [**ItemRefundPolicyCreateDto**](ItemRefundPolicyCreateDto.md)|  | [optional] |

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

<a id="deleteRefundPolicyAsync"></a>
# **deleteRefundPolicyAsync**
> EmptyEnvelope deleteRefundPolicyAsync(tenantId, refundPolicyId, apiVersion, xApiVersion)

Delete a refund policy

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RefundPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RefundPoliciesApi apiInstance = new RefundPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID refundPolicyId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteRefundPolicyAsync(tenantId, refundPolicyId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RefundPoliciesApi#deleteRefundPolicyAsync");
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
| **refundPolicyId** | **UUID**|  | |
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
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getRefundPoliciesAsync"></a>
# **getRefundPoliciesAsync**
> ItemRefundPolicyDtoListEnvelope getRefundPoliciesAsync(tenantId, apiVersion, xApiVersion)

Retrieve a list of refund policies

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RefundPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RefundPoliciesApi apiInstance = new RefundPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemRefundPolicyDtoListEnvelope result = apiInstance.getRefundPoliciesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RefundPoliciesApi#getRefundPoliciesAsync");
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

[**ItemRefundPolicyDtoListEnvelope**](ItemRefundPolicyDtoListEnvelope.md)

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

<a id="getRefundPoliciesCountAsync"></a>
# **getRefundPoliciesCountAsync**
> Int32Envelope getRefundPoliciesCountAsync(tenantId, apiVersion, xApiVersion)

Get the count of refund policies

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RefundPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RefundPoliciesApi apiInstance = new RefundPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getRefundPoliciesCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RefundPoliciesApi#getRefundPoliciesCountAsync");
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
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getRefundPolicyAsync"></a>
# **getRefundPolicyAsync**
> ItemRefundPolicyDtoEnvelope getRefundPolicyAsync(tenantId, refundPolicyId, apiVersion, xApiVersion)

Retrieve a refund policy by ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RefundPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RefundPoliciesApi apiInstance = new RefundPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID refundPolicyId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemRefundPolicyDtoEnvelope result = apiInstance.getRefundPolicyAsync(tenantId, refundPolicyId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RefundPoliciesApi#getRefundPolicyAsync");
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
| **refundPolicyId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemRefundPolicyDtoEnvelope**](ItemRefundPolicyDtoEnvelope.md)

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

<a id="updateRefundPolicyAsync"></a>
# **updateRefundPolicyAsync**
> EmptyEnvelope updateRefundPolicyAsync(tenantId, refundPolicyId, apiVersion, xApiVersion, itemRefundPolicyUpdateDto)

Update a refund policy

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RefundPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RefundPoliciesApi apiInstance = new RefundPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID refundPolicyId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemRefundPolicyUpdateDto itemRefundPolicyUpdateDto = new ItemRefundPolicyUpdateDto(); // ItemRefundPolicyUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateRefundPolicyAsync(tenantId, refundPolicyId, apiVersion, xApiVersion, itemRefundPolicyUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RefundPoliciesApi#updateRefundPolicyAsync");
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
| **refundPolicyId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **itemRefundPolicyUpdateDto** | [**ItemRefundPolicyUpdateDto**](ItemRefundPolicyUpdateDto.md)|  | [optional] |

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

