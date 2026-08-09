# SubscriptionPlansApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSubscriptionPlanAsync**](SubscriptionPlansApi.md#createSubscriptionPlanAsync) | **POST** /api/v2/SubscriptionsService/SubscriptionPlans | Create a subscription plan |
| [**deleteSubscriptionPlanAsync**](SubscriptionPlansApi.md#deleteSubscriptionPlanAsync) | **DELETE** /api/v2/SubscriptionsService/SubscriptionPlans/{planId} | Delete a subscription plan |
| [**getSubscriptionPlanByIdAsync**](SubscriptionPlansApi.md#getSubscriptionPlanByIdAsync) | **GET** /api/v2/SubscriptionsService/SubscriptionPlans/{planId} | Get a subscription plan by ID |
| [**getSubscriptionPlansAsync**](SubscriptionPlansApi.md#getSubscriptionPlansAsync) | **GET** /api/v2/SubscriptionsService/SubscriptionPlans | Get all subscription plans |
| [**getSubscriptionPlansCountAsync**](SubscriptionPlansApi.md#getSubscriptionPlansCountAsync) | **GET** /api/v2/SubscriptionsService/SubscriptionPlans/Count | Get subscription plans count |
| [**patchSubscriptionPlanAsync**](SubscriptionPlansApi.md#patchSubscriptionPlanAsync) | **PATCH** /api/v2/SubscriptionsService/SubscriptionPlans/{planId} | Patch a subscription plan |
| [**updateSubscriptionPlanAsync**](SubscriptionPlansApi.md#updateSubscriptionPlanAsync) | **PUT** /api/v2/SubscriptionsService/SubscriptionPlans/{planId} | Update a subscription plan |


<a id="createSubscriptionPlanAsync"></a>
# **createSubscriptionPlanAsync**
> Envelope createSubscriptionPlanAsync(tenantId, apiVersion, xApiVersion, subscriptionPlanCreateDto)

Create a subscription plan

Creates a new subscription plan for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubscriptionPlansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SubscriptionPlansApi apiInstance = new SubscriptionPlansApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SubscriptionPlanCreateDto subscriptionPlanCreateDto = new SubscriptionPlanCreateDto(); // SubscriptionPlanCreateDto | 
    try {
      Envelope result = apiInstance.createSubscriptionPlanAsync(tenantId, apiVersion, xApiVersion, subscriptionPlanCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionPlansApi#createSubscriptionPlanAsync");
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
| **subscriptionPlanCreateDto** | [**SubscriptionPlanCreateDto**](SubscriptionPlanCreateDto.md)|  | [optional] |

### Return type

[**Envelope**](Envelope.md)

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

<a id="deleteSubscriptionPlanAsync"></a>
# **deleteSubscriptionPlanAsync**
> Envelope deleteSubscriptionPlanAsync(tenantId, planId, apiVersion, xApiVersion)

Delete a subscription plan

Deletes a subscription plan by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubscriptionPlansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SubscriptionPlansApi apiInstance = new SubscriptionPlansApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID planId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Envelope result = apiInstance.deleteSubscriptionPlanAsync(tenantId, planId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionPlansApi#deleteSubscriptionPlanAsync");
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
| **planId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**Envelope**](Envelope.md)

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

<a id="getSubscriptionPlanByIdAsync"></a>
# **getSubscriptionPlanByIdAsync**
> SubscriptionPlanDtoEnvelope getSubscriptionPlanByIdAsync(tenantId, planId, apiVersion, xApiVersion)

Get a subscription plan by ID

Retrieves a subscription plan by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubscriptionPlansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SubscriptionPlansApi apiInstance = new SubscriptionPlansApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID planId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SubscriptionPlanDtoEnvelope result = apiInstance.getSubscriptionPlanByIdAsync(tenantId, planId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionPlansApi#getSubscriptionPlanByIdAsync");
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
| **planId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**SubscriptionPlanDtoEnvelope**](SubscriptionPlanDtoEnvelope.md)

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

<a id="getSubscriptionPlansAsync"></a>
# **getSubscriptionPlansAsync**
> SubscriptionPlanDtoIReadOnlyListEnvelope getSubscriptionPlansAsync(tenantId, apiVersion, xApiVersion, subscriptionDtoCollectionQueryParameters)

Get all subscription plans

Retrieves all subscription plans for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubscriptionPlansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SubscriptionPlansApi apiInstance = new SubscriptionPlansApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SubscriptionDtoCollectionQueryParameters subscriptionDtoCollectionQueryParameters = new SubscriptionDtoCollectionQueryParameters(); // SubscriptionDtoCollectionQueryParameters | 
    try {
      SubscriptionPlanDtoIReadOnlyListEnvelope result = apiInstance.getSubscriptionPlansAsync(tenantId, apiVersion, xApiVersion, subscriptionDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionPlansApi#getSubscriptionPlansAsync");
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
| **subscriptionDtoCollectionQueryParameters** | [**SubscriptionDtoCollectionQueryParameters**](SubscriptionDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**SubscriptionPlanDtoIReadOnlyListEnvelope**](SubscriptionPlanDtoIReadOnlyListEnvelope.md)

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

<a id="getSubscriptionPlansCountAsync"></a>
# **getSubscriptionPlansCountAsync**
> Int32Envelope getSubscriptionPlansCountAsync(tenantId, apiVersion, xApiVersion, subscriptionDtoCollectionQueryParameters)

Get subscription plans count

Returns the count of subscription plans for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubscriptionPlansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SubscriptionPlansApi apiInstance = new SubscriptionPlansApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SubscriptionDtoCollectionQueryParameters subscriptionDtoCollectionQueryParameters = new SubscriptionDtoCollectionQueryParameters(); // SubscriptionDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getSubscriptionPlansCountAsync(tenantId, apiVersion, xApiVersion, subscriptionDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionPlansApi#getSubscriptionPlansCountAsync");
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
| **subscriptionDtoCollectionQueryParameters** | [**SubscriptionDtoCollectionQueryParameters**](SubscriptionDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

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

<a id="patchSubscriptionPlanAsync"></a>
# **patchSubscriptionPlanAsync**
> EmptyEnvelope patchSubscriptionPlanAsync(tenantId, planId, apiVersion, xApiVersion, patchOperation)

Patch a subscription plan

Patch a subscription plan

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubscriptionPlansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SubscriptionPlansApi apiInstance = new SubscriptionPlansApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID planId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    List<PatchOperation> patchOperation = Arrays.asList(); // List<PatchOperation> | 
    try {
      EmptyEnvelope result = apiInstance.patchSubscriptionPlanAsync(tenantId, planId, apiVersion, xApiVersion, patchOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionPlansApi#patchSubscriptionPlanAsync");
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
| **planId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **patchOperation** | [**List&lt;PatchOperation&gt;**](PatchOperation.md)|  | [optional] |

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

<a id="updateSubscriptionPlanAsync"></a>
# **updateSubscriptionPlanAsync**
> Envelope updateSubscriptionPlanAsync(tenantId, planId, apiVersion, xApiVersion, subscriptionPlanUpdateDto)

Update a subscription plan

Updates an existing subscription plan.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubscriptionPlansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SubscriptionPlansApi apiInstance = new SubscriptionPlansApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID planId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SubscriptionPlanUpdateDto subscriptionPlanUpdateDto = new SubscriptionPlanUpdateDto(); // SubscriptionPlanUpdateDto | 
    try {
      Envelope result = apiInstance.updateSubscriptionPlanAsync(tenantId, planId, apiVersion, xApiVersion, subscriptionPlanUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionPlansApi#updateSubscriptionPlanAsync");
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
| **planId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **subscriptionPlanUpdateDto** | [**SubscriptionPlanUpdateDto**](SubscriptionPlanUpdateDto.md)|  | [optional] |

### Return type

[**Envelope**](Envelope.md)

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

