# ItemReturnPoliciesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**countItemReturnPoliciesAsync**](ItemReturnPoliciesApi.md#countItemReturnPoliciesAsync) | **GET** /api/v2/CatalogService/ItemReturnPolicies/Count | Count item return policies |
| [**getItemReturnPoliciesAsync**](ItemReturnPoliciesApi.md#getItemReturnPoliciesAsync) | **GET** /api/v2/CatalogService/ItemReturnPolicies | Get item return policies |
| [**getItemReturnPolicyByIdAsync**](ItemReturnPoliciesApi.md#getItemReturnPolicyByIdAsync) | **GET** /api/v2/CatalogService/ItemReturnPolicies/{itemReturnPolicyId} | Get item return policy by ID |
| [**relateItemToReturnPolicyAsync**](ItemReturnPoliciesApi.md#relateItemToReturnPolicyAsync) | **POST** /api/v2/CatalogService/ItemReturnPolicies | Relate item to return policy |
| [**removeReturnPolicyFromItemAsync**](ItemReturnPoliciesApi.md#removeReturnPolicyFromItemAsync) | **DELETE** /api/v2/CatalogService/ItemReturnPolicies/{itemReturnPolicyId} | Remove return policy from item |


<a id="countItemReturnPoliciesAsync"></a>
# **countItemReturnPoliciesAsync**
> Int32Envelope countItemReturnPoliciesAsync(itemId, apiVersion, xApiVersion)

Count item return policies

Counts all return policies for a specific item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemReturnPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ItemReturnPoliciesApi apiInstance = new ItemReturnPoliciesApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.countItemReturnPoliciesAsync(itemId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemReturnPoliciesApi#countItemReturnPoliciesAsync");
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
| **itemId** | **UUID**|  | [optional] |
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

<a id="getItemReturnPoliciesAsync"></a>
# **getItemReturnPoliciesAsync**
> ItemReturnPolicyDtoListEnvelope getItemReturnPoliciesAsync(itemId, apiVersion, xApiVersion)

Get item return policies

Retrieves all return policies for a specific item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemReturnPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ItemReturnPoliciesApi apiInstance = new ItemReturnPoliciesApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemReturnPolicyDtoListEnvelope result = apiInstance.getItemReturnPoliciesAsync(itemId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemReturnPoliciesApi#getItemReturnPoliciesAsync");
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
| **itemId** | **UUID**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemReturnPolicyDtoListEnvelope**](ItemReturnPolicyDtoListEnvelope.md)

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

<a id="getItemReturnPolicyByIdAsync"></a>
# **getItemReturnPolicyByIdAsync**
> ItemReturnPolicyDtoEnvelope getItemReturnPolicyByIdAsync(itemReturnPolicyId, itemId, apiVersion, xApiVersion)

Get item return policy by ID

Retrieves a specific return policy for an item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemReturnPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ItemReturnPoliciesApi apiInstance = new ItemReturnPoliciesApi(defaultClient);
    UUID itemReturnPolicyId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemReturnPolicyDtoEnvelope result = apiInstance.getItemReturnPolicyByIdAsync(itemReturnPolicyId, itemId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemReturnPoliciesApi#getItemReturnPolicyByIdAsync");
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
| **itemReturnPolicyId** | **UUID**|  | |
| **itemId** | **UUID**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemReturnPolicyDtoEnvelope**](ItemReturnPolicyDtoEnvelope.md)

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

<a id="relateItemToReturnPolicyAsync"></a>
# **relateItemToReturnPolicyAsync**
> relateItemToReturnPolicyAsync(tenantId, itemId, returnPolicyId, apiVersion, xApiVersion)

Relate item to return policy

Relates an item to an existing return policy.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemReturnPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ItemReturnPoliciesApi apiInstance = new ItemReturnPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID returnPolicyId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.relateItemToReturnPolicyAsync(tenantId, itemId, returnPolicyId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemReturnPoliciesApi#relateItemToReturnPolicyAsync");
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
| **returnPolicyId** | **UUID**|  | |
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

<a id="removeReturnPolicyFromItemAsync"></a>
# **removeReturnPolicyFromItemAsync**
> removeReturnPolicyFromItemAsync(tenantId, itemId, itemReturnPolicyId, apiVersion, xApiVersion)

Remove return policy from item

Removes a return policy from an item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemReturnPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ItemReturnPoliciesApi apiInstance = new ItemReturnPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemReturnPolicyId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.removeReturnPolicyFromItemAsync(tenantId, itemId, itemReturnPolicyId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemReturnPoliciesApi#removeReturnPolicyFromItemAsync");
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
| **itemReturnPolicyId** | **UUID**|  | |
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

