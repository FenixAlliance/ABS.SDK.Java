# ItemShippingPoliciesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createItemShippingPolicyAsync**](ItemShippingPoliciesApi.md#createItemShippingPolicyAsync) | **POST** /api/v2/ShipmentsService/ItemShippingPolicies | Create an item shipping policy |
| [**deleteItemShippingPolicyAsync**](ItemShippingPoliciesApi.md#deleteItemShippingPolicyAsync) | **DELETE** /api/v2/ShipmentsService/ItemShippingPolicies/{policyId} | Delete an item shipping policy |
| [**getItemShippingPoliciesAsync**](ItemShippingPoliciesApi.md#getItemShippingPoliciesAsync) | **GET** /api/v2/ShipmentsService/ItemShippingPolicies | Get all item shipping policies |
| [**getItemShippingPoliciesCountAsync**](ItemShippingPoliciesApi.md#getItemShippingPoliciesCountAsync) | **GET** /api/v2/ShipmentsService/ItemShippingPolicies/Count | Get item shipping policies count |
| [**getItemShippingPolicyByIdAsync**](ItemShippingPoliciesApi.md#getItemShippingPolicyByIdAsync) | **GET** /api/v2/ShipmentsService/ItemShippingPolicies/{policyId} | Get item shipping policy by ID |
| [**updateItemShippingPolicyAsync**](ItemShippingPoliciesApi.md#updateItemShippingPolicyAsync) | **PUT** /api/v2/ShipmentsService/ItemShippingPolicies/{policyId} | Update an item shipping policy |


<a id="createItemShippingPolicyAsync"></a>
# **createItemShippingPolicyAsync**
> createItemShippingPolicyAsync(tenantId, apiVersion, xApiVersion, itemShippingPolicyCreateDto)

Create an item shipping policy

Creates a new item shipping policy.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemShippingPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemShippingPoliciesApi apiInstance = new ItemShippingPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemShippingPolicyCreateDto itemShippingPolicyCreateDto = new ItemShippingPolicyCreateDto(); // ItemShippingPolicyCreateDto | 
    try {
      apiInstance.createItemShippingPolicyAsync(tenantId, apiVersion, xApiVersion, itemShippingPolicyCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemShippingPoliciesApi#createItemShippingPolicyAsync");
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
| **itemShippingPolicyCreateDto** | [**ItemShippingPolicyCreateDto**](ItemShippingPolicyCreateDto.md)|  | [optional] |

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

<a id="deleteItemShippingPolicyAsync"></a>
# **deleteItemShippingPolicyAsync**
> deleteItemShippingPolicyAsync(tenantId, policyId, apiVersion, xApiVersion)

Delete an item shipping policy

Deletes an item shipping policy.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemShippingPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemShippingPoliciesApi apiInstance = new ItemShippingPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID policyId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteItemShippingPolicyAsync(tenantId, policyId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemShippingPoliciesApi#deleteItemShippingPolicyAsync");
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
| **policyId** | **UUID**|  | |
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

<a id="getItemShippingPoliciesAsync"></a>
# **getItemShippingPoliciesAsync**
> ItemShippingPolicyDtoListEnvelope getItemShippingPoliciesAsync(tenantId, apiVersion, xApiVersion)

Get all item shipping policies

Retrieves all item shipping policies for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemShippingPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemShippingPoliciesApi apiInstance = new ItemShippingPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemShippingPolicyDtoListEnvelope result = apiInstance.getItemShippingPoliciesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemShippingPoliciesApi#getItemShippingPoliciesAsync");
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

[**ItemShippingPolicyDtoListEnvelope**](ItemShippingPolicyDtoListEnvelope.md)

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

<a id="getItemShippingPoliciesCountAsync"></a>
# **getItemShippingPoliciesCountAsync**
> Int32Envelope getItemShippingPoliciesCountAsync(tenantId, apiVersion, xApiVersion)

Get item shipping policies count

Returns the count of item shipping policies.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemShippingPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemShippingPoliciesApi apiInstance = new ItemShippingPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getItemShippingPoliciesCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemShippingPoliciesApi#getItemShippingPoliciesCountAsync");
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

<a id="getItemShippingPolicyByIdAsync"></a>
# **getItemShippingPolicyByIdAsync**
> ItemShippingPolicyDtoEnvelope getItemShippingPolicyByIdAsync(tenantId, policyId, apiVersion, xApiVersion)

Get item shipping policy by ID

Retrieves a specific item shipping policy.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemShippingPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemShippingPoliciesApi apiInstance = new ItemShippingPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID policyId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemShippingPolicyDtoEnvelope result = apiInstance.getItemShippingPolicyByIdAsync(tenantId, policyId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemShippingPoliciesApi#getItemShippingPolicyByIdAsync");
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
| **policyId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemShippingPolicyDtoEnvelope**](ItemShippingPolicyDtoEnvelope.md)

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

<a id="updateItemShippingPolicyAsync"></a>
# **updateItemShippingPolicyAsync**
> updateItemShippingPolicyAsync(tenantId, policyId, apiVersion, xApiVersion, itemShippingPolicyUpdateDto)

Update an item shipping policy

Updates an existing item shipping policy.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemShippingPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemShippingPoliciesApi apiInstance = new ItemShippingPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID policyId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemShippingPolicyUpdateDto itemShippingPolicyUpdateDto = new ItemShippingPolicyUpdateDto(); // ItemShippingPolicyUpdateDto | 
    try {
      apiInstance.updateItemShippingPolicyAsync(tenantId, policyId, apiVersion, xApiVersion, itemShippingPolicyUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemShippingPoliciesApi#updateItemShippingPolicyAsync");
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
| **policyId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **itemShippingPolicyUpdateDto** | [**ItemShippingPolicyUpdateDto**](ItemShippingPolicyUpdateDto.md)|  | [optional] |

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

