# RoundingPoliciesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRoundingPolicyAsync**](RoundingPoliciesApi.md#createRoundingPolicyAsync) | **POST** /api/v2/PricingService/RoundingPolicies | Creates a rounding policy |
| [**deleteRoundingPolicyAsync**](RoundingPoliciesApi.md#deleteRoundingPolicyAsync) | **DELETE** /api/v2/PricingService/RoundingPolicies/{roundingPolicyId} | Deletes a rounding policy |
| [**getRoundingPoliciesAsync**](RoundingPoliciesApi.md#getRoundingPoliciesAsync) | **GET** /api/v2/PricingService/RoundingPolicies | Gets all rounding policies |
| [**getRoundingPoliciesCountAsync**](RoundingPoliciesApi.md#getRoundingPoliciesCountAsync) | **GET** /api/v2/PricingService/RoundingPolicies/Count | Counts rounding policies |
| [**getRoundingPolicyByIdAsync**](RoundingPoliciesApi.md#getRoundingPolicyByIdAsync) | **GET** /api/v2/PricingService/RoundingPolicies/{roundingPolicyId} | Gets a rounding policy by ID |
| [**updateRoundingPolicyAsync**](RoundingPoliciesApi.md#updateRoundingPolicyAsync) | **PUT** /api/v2/PricingService/RoundingPolicies/{roundingPolicyId} | Updates a rounding policy |


<a id="createRoundingPolicyAsync"></a>
# **createRoundingPolicyAsync**
> EmptyEnvelope createRoundingPolicyAsync(tenantId, roundingPolicyCreateDto, apiVersion, xApiVersion)

Creates a rounding policy

Creates a new rounding policy for the current tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoundingPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RoundingPoliciesApi apiInstance = new RoundingPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    RoundingPolicyCreateDto roundingPolicyCreateDto = new RoundingPolicyCreateDto(); // RoundingPolicyCreateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.createRoundingPolicyAsync(tenantId, roundingPolicyCreateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoundingPoliciesApi#createRoundingPolicyAsync");
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
| **roundingPolicyCreateDto** | [**RoundingPolicyCreateDto**](RoundingPolicyCreateDto.md)|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

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
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="deleteRoundingPolicyAsync"></a>
# **deleteRoundingPolicyAsync**
> EmptyEnvelope deleteRoundingPolicyAsync(tenantId, roundingPolicyId, apiVersion, xApiVersion)

Deletes a rounding policy

Deletes the specified rounding policy.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoundingPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RoundingPoliciesApi apiInstance = new RoundingPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID roundingPolicyId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteRoundingPolicyAsync(tenantId, roundingPolicyId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoundingPoliciesApi#deleteRoundingPolicyAsync");
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
| **roundingPolicyId** | **UUID**|  | |
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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="getRoundingPoliciesAsync"></a>
# **getRoundingPoliciesAsync**
> RoundingPolicyDtoListEnvelope getRoundingPoliciesAsync(tenantId, apiVersion, xApiVersion)

Gets all rounding policies

Retrieves all rounding policies for the current tenant with OData support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoundingPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RoundingPoliciesApi apiInstance = new RoundingPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      RoundingPolicyDtoListEnvelope result = apiInstance.getRoundingPoliciesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoundingPoliciesApi#getRoundingPoliciesAsync");
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

[**RoundingPolicyDtoListEnvelope**](RoundingPolicyDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="getRoundingPoliciesCountAsync"></a>
# **getRoundingPoliciesCountAsync**
> Int32Envelope getRoundingPoliciesCountAsync(tenantId, apiVersion, xApiVersion)

Counts rounding policies

Gets the count of rounding policies for the current tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoundingPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RoundingPoliciesApi apiInstance = new RoundingPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getRoundingPoliciesCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoundingPoliciesApi#getRoundingPoliciesCountAsync");
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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="getRoundingPolicyByIdAsync"></a>
# **getRoundingPolicyByIdAsync**
> RoundingPolicyDtoEnvelope getRoundingPolicyByIdAsync(tenantId, roundingPolicyId, apiVersion, xApiVersion)

Gets a rounding policy by ID

Retrieves the details of a rounding policy using its unique ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoundingPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RoundingPoliciesApi apiInstance = new RoundingPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID roundingPolicyId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      RoundingPolicyDtoEnvelope result = apiInstance.getRoundingPolicyByIdAsync(tenantId, roundingPolicyId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoundingPoliciesApi#getRoundingPolicyByIdAsync");
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
| **roundingPolicyId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**RoundingPolicyDtoEnvelope**](RoundingPolicyDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="updateRoundingPolicyAsync"></a>
# **updateRoundingPolicyAsync**
> EmptyEnvelope updateRoundingPolicyAsync(tenantId, roundingPolicyId, roundingPolicyUpdateDto, apiVersion, xApiVersion)

Updates a rounding policy

Updates the specified rounding policy.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoundingPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RoundingPoliciesApi apiInstance = new RoundingPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID roundingPolicyId = UUID.randomUUID(); // UUID | 
    RoundingPolicyUpdateDto roundingPolicyUpdateDto = new RoundingPolicyUpdateDto(); // RoundingPolicyUpdateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.updateRoundingPolicyAsync(tenantId, roundingPolicyId, roundingPolicyUpdateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoundingPoliciesApi#updateRoundingPolicyAsync");
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
| **roundingPolicyId** | **UUID**|  | |
| **roundingPolicyUpdateDto** | [**RoundingPolicyUpdateDto**](RoundingPolicyUpdateDto.md)|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

