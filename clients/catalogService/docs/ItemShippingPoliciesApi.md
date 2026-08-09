# ItemShippingPoliciesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**countItemShippingPoliciesAsync**](ItemShippingPoliciesApi.md#countItemShippingPoliciesAsync) | **GET** /api/v2/CatalogService/ItemShippingPolicies/Count | Count item shipping policies |
| [**getCatalogItemShippingPoliciesAsync**](ItemShippingPoliciesApi.md#getCatalogItemShippingPoliciesAsync) | **GET** /api/v2/CatalogService/ItemShippingPolicies | Get item shipping policies |
| [**getCatalogItemShippingPolicyByIdAsync**](ItemShippingPoliciesApi.md#getCatalogItemShippingPolicyByIdAsync) | **GET** /api/v2/CatalogService/ItemShippingPolicies/{itemShippingPolicyId} | Get item shipping policy by ID |
| [**relateItemToShippingPolicyAsync**](ItemShippingPoliciesApi.md#relateItemToShippingPolicyAsync) | **POST** /api/v2/CatalogService/ItemShippingPolicies | Relate item to shipping policy |
| [**removeShippingPolicyFromItemAsync**](ItemShippingPoliciesApi.md#removeShippingPolicyFromItemAsync) | **DELETE** /api/v2/CatalogService/ItemShippingPolicies/{itemShippingPolicyId} | Remove shipping policy from item |


<a id="countItemShippingPoliciesAsync"></a>
# **countItemShippingPoliciesAsync**
> Int32Envelope countItemShippingPoliciesAsync(tenantId, itemId, apiVersion, xApiVersion, itemShippingPolicyDtoCollectionQueryParameters)

Count item shipping policies

Counts all shipping policies for a specific item.

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
    defaultClient.setBasePath("https://absuite.net");

    ItemShippingPoliciesApi apiInstance = new ItemShippingPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemShippingPolicyDtoCollectionQueryParameters itemShippingPolicyDtoCollectionQueryParameters = new ItemShippingPolicyDtoCollectionQueryParameters(); // ItemShippingPolicyDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.countItemShippingPoliciesAsync(tenantId, itemId, apiVersion, xApiVersion, itemShippingPolicyDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemShippingPoliciesApi#countItemShippingPoliciesAsync");
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
| **tenantId** | **UUID**|  | [optional] |
| **itemId** | **UUID**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **itemShippingPolicyDtoCollectionQueryParameters** | [**ItemShippingPolicyDtoCollectionQueryParameters**](ItemShippingPolicyDtoCollectionQueryParameters.md)|  | [optional] |

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

<a id="getCatalogItemShippingPoliciesAsync"></a>
# **getCatalogItemShippingPoliciesAsync**
> ItemShippingPolicyDtoListEnvelope getCatalogItemShippingPoliciesAsync(tenantId, itemId, apiVersion, xApiVersion, itemShippingPolicyDtoCollectionQueryParameters)

Get item shipping policies

Retrieves all shipping policies for a specific item.

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
    defaultClient.setBasePath("https://absuite.net");

    ItemShippingPoliciesApi apiInstance = new ItemShippingPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemShippingPolicyDtoCollectionQueryParameters itemShippingPolicyDtoCollectionQueryParameters = new ItemShippingPolicyDtoCollectionQueryParameters(); // ItemShippingPolicyDtoCollectionQueryParameters | 
    try {
      ItemShippingPolicyDtoListEnvelope result = apiInstance.getCatalogItemShippingPoliciesAsync(tenantId, itemId, apiVersion, xApiVersion, itemShippingPolicyDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemShippingPoliciesApi#getCatalogItemShippingPoliciesAsync");
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
| **tenantId** | **UUID**|  | [optional] |
| **itemId** | **UUID**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **itemShippingPolicyDtoCollectionQueryParameters** | [**ItemShippingPolicyDtoCollectionQueryParameters**](ItemShippingPolicyDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**ItemShippingPolicyDtoListEnvelope**](ItemShippingPolicyDtoListEnvelope.md)

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

<a id="getCatalogItemShippingPolicyByIdAsync"></a>
# **getCatalogItemShippingPolicyByIdAsync**
> ItemShippingPolicyDtoEnvelope getCatalogItemShippingPolicyByIdAsync(itemShippingPolicyId, tenantId, itemId, apiVersion, xApiVersion)

Get item shipping policy by ID

Retrieves a specific shipping policy for an item.

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
    defaultClient.setBasePath("https://absuite.net");

    ItemShippingPoliciesApi apiInstance = new ItemShippingPoliciesApi(defaultClient);
    UUID itemShippingPolicyId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemShippingPolicyDtoEnvelope result = apiInstance.getCatalogItemShippingPolicyByIdAsync(itemShippingPolicyId, tenantId, itemId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemShippingPoliciesApi#getCatalogItemShippingPolicyByIdAsync");
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
| **itemShippingPolicyId** | **UUID**|  | |
| **tenantId** | **UUID**|  | [optional] |
| **itemId** | **UUID**|  | [optional] |
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
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="relateItemToShippingPolicyAsync"></a>
# **relateItemToShippingPolicyAsync**
> relateItemToShippingPolicyAsync(tenantId, itemId, shippingPolicyId, apiVersion, xApiVersion)

Relate item to shipping policy

Relates an item to an existing shipping policy.

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
    defaultClient.setBasePath("https://absuite.net");

    ItemShippingPoliciesApi apiInstance = new ItemShippingPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID shippingPolicyId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.relateItemToShippingPolicyAsync(tenantId, itemId, shippingPolicyId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemShippingPoliciesApi#relateItemToShippingPolicyAsync");
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
| **itemId** | **UUID**|  | |
| **shippingPolicyId** | **UUID**|  | |
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
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="removeShippingPolicyFromItemAsync"></a>
# **removeShippingPolicyFromItemAsync**
> removeShippingPolicyFromItemAsync(tenantId, itemId, itemShippingPolicyId, apiVersion, xApiVersion)

Remove shipping policy from item

Removes a shipping policy from an item.

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
    defaultClient.setBasePath("https://absuite.net");

    ItemShippingPoliciesApi apiInstance = new ItemShippingPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemShippingPolicyId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.removeShippingPolicyFromItemAsync(tenantId, itemId, itemShippingPolicyId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemShippingPoliciesApi#removeShippingPolicyFromItemAsync");
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
| **itemId** | **UUID**|  | |
| **itemShippingPolicyId** | **UUID**|  | |
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
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

