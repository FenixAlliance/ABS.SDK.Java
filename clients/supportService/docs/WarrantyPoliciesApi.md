# WarrantyPoliciesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createWarrantyPolicyAsync**](WarrantyPoliciesApi.md#createWarrantyPolicyAsync) | **POST** /api/v2/SupportService/WarrantyPolicies | Create a new warranty policy |
| [**deleteWarrantyPolicyAsync**](WarrantyPoliciesApi.md#deleteWarrantyPolicyAsync) | **DELETE** /api/v2/SupportService/WarrantyPolicies/{warrantyPolicyId} | Delete a warranty policy |
| [**getWarrantyPoliciesAsync**](WarrantyPoliciesApi.md#getWarrantyPoliciesAsync) | **GET** /api/v2/SupportService/WarrantyPolicies | Retrieve a list of warranty policies |
| [**getWarrantyPoliciesCountAsync**](WarrantyPoliciesApi.md#getWarrantyPoliciesCountAsync) | **GET** /api/v2/SupportService/WarrantyPolicies/Count | Get the count of warranty policies |
| [**getWarrantyPolicyAsync**](WarrantyPoliciesApi.md#getWarrantyPolicyAsync) | **GET** /api/v2/SupportService/WarrantyPolicies/{warrantyPolicyId} | Retrieve a warranty policy by ID |
| [**updateWarrantyPolicyAsync**](WarrantyPoliciesApi.md#updateWarrantyPolicyAsync) | **PUT** /api/v2/SupportService/WarrantyPolicies/{warrantyPolicyId} | Update a warranty policy |


<a id="createWarrantyPolicyAsync"></a>
# **createWarrantyPolicyAsync**
> EmptyEnvelope createWarrantyPolicyAsync(tenantId, apiVersion, xApiVersion, itemWarrantyPolicyCreateDto)

Create a new warranty policy

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WarrantyPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WarrantyPoliciesApi apiInstance = new WarrantyPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemWarrantyPolicyCreateDto itemWarrantyPolicyCreateDto = new ItemWarrantyPolicyCreateDto(); // ItemWarrantyPolicyCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createWarrantyPolicyAsync(tenantId, apiVersion, xApiVersion, itemWarrantyPolicyCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WarrantyPoliciesApi#createWarrantyPolicyAsync");
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
| **itemWarrantyPolicyCreateDto** | [**ItemWarrantyPolicyCreateDto**](ItemWarrantyPolicyCreateDto.md)|  | [optional] |

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

<a id="deleteWarrantyPolicyAsync"></a>
# **deleteWarrantyPolicyAsync**
> EmptyEnvelope deleteWarrantyPolicyAsync(tenantId, warrantyPolicyId, apiVersion, xApiVersion)

Delete a warranty policy

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WarrantyPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WarrantyPoliciesApi apiInstance = new WarrantyPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID warrantyPolicyId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteWarrantyPolicyAsync(tenantId, warrantyPolicyId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WarrantyPoliciesApi#deleteWarrantyPolicyAsync");
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
| **warrantyPolicyId** | **UUID**|  | |
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

<a id="getWarrantyPoliciesAsync"></a>
# **getWarrantyPoliciesAsync**
> ItemWarrantyPolicyDtoListEnvelope getWarrantyPoliciesAsync(tenantId, apiVersion, xApiVersion)

Retrieve a list of warranty policies

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WarrantyPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WarrantyPoliciesApi apiInstance = new WarrantyPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemWarrantyPolicyDtoListEnvelope result = apiInstance.getWarrantyPoliciesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WarrantyPoliciesApi#getWarrantyPoliciesAsync");
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

[**ItemWarrantyPolicyDtoListEnvelope**](ItemWarrantyPolicyDtoListEnvelope.md)

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

<a id="getWarrantyPoliciesCountAsync"></a>
# **getWarrantyPoliciesCountAsync**
> Int32Envelope getWarrantyPoliciesCountAsync(tenantId, apiVersion, xApiVersion)

Get the count of warranty policies

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WarrantyPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WarrantyPoliciesApi apiInstance = new WarrantyPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getWarrantyPoliciesCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WarrantyPoliciesApi#getWarrantyPoliciesCountAsync");
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

<a id="getWarrantyPolicyAsync"></a>
# **getWarrantyPolicyAsync**
> ItemWarrantyPolicyDtoEnvelope getWarrantyPolicyAsync(tenantId, warrantyPolicyId, apiVersion, xApiVersion)

Retrieve a warranty policy by ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WarrantyPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WarrantyPoliciesApi apiInstance = new WarrantyPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID warrantyPolicyId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemWarrantyPolicyDtoEnvelope result = apiInstance.getWarrantyPolicyAsync(tenantId, warrantyPolicyId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WarrantyPoliciesApi#getWarrantyPolicyAsync");
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
| **warrantyPolicyId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemWarrantyPolicyDtoEnvelope**](ItemWarrantyPolicyDtoEnvelope.md)

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

<a id="updateWarrantyPolicyAsync"></a>
# **updateWarrantyPolicyAsync**
> EmptyEnvelope updateWarrantyPolicyAsync(tenantId, warrantyPolicyId, apiVersion, xApiVersion, itemWarrantyPolicyUpdateDto)

Update a warranty policy

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WarrantyPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WarrantyPoliciesApi apiInstance = new WarrantyPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID warrantyPolicyId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemWarrantyPolicyUpdateDto itemWarrantyPolicyUpdateDto = new ItemWarrantyPolicyUpdateDto(); // ItemWarrantyPolicyUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateWarrantyPolicyAsync(tenantId, warrantyPolicyId, apiVersion, xApiVersion, itemWarrantyPolicyUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WarrantyPoliciesApi#updateWarrantyPolicyAsync");
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
| **warrantyPolicyId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **itemWarrantyPolicyUpdateDto** | [**ItemWarrantyPolicyUpdateDto**](ItemWarrantyPolicyUpdateDto.md)|  | [optional] |

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

