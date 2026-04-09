# ItemWarrantyPoliciesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**countItemWarrantyPoliciesAsync**](ItemWarrantyPoliciesApi.md#countItemWarrantyPoliciesAsync) | **GET** /api/v2/CatalogService/ItemWarrantyPolicies/Count | Count item warranty policies |
| [**getItemWarrantyPoliciesAsync**](ItemWarrantyPoliciesApi.md#getItemWarrantyPoliciesAsync) | **GET** /api/v2/CatalogService/ItemWarrantyPolicies | Get item warranty policies |
| [**getItemWarrantyPolicyByIdAsync**](ItemWarrantyPoliciesApi.md#getItemWarrantyPolicyByIdAsync) | **GET** /api/v2/CatalogService/ItemWarrantyPolicies/{itemWarrantyPolicyId} | Get item warranty policy by ID |
| [**relateItemToWarrantyPolicyAsync**](ItemWarrantyPoliciesApi.md#relateItemToWarrantyPolicyAsync) | **POST** /api/v2/CatalogService/ItemWarrantyPolicies | Relate item to warranty policy |
| [**removeWarrantyPolicyFromItemAsync**](ItemWarrantyPoliciesApi.md#removeWarrantyPolicyFromItemAsync) | **DELETE** /api/v2/CatalogService/ItemWarrantyPolicies/{itemWarrantyPolicyId} | Remove warranty policy from item |


<a id="countItemWarrantyPoliciesAsync"></a>
# **countItemWarrantyPoliciesAsync**
> Int32Envelope countItemWarrantyPoliciesAsync(itemId, apiVersion, xApiVersion)

Count item warranty policies

Counts all warranty policies for a specific item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemWarrantyPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemWarrantyPoliciesApi apiInstance = new ItemWarrantyPoliciesApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.countItemWarrantyPoliciesAsync(itemId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemWarrantyPoliciesApi#countItemWarrantyPoliciesAsync");
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

<a id="getItemWarrantyPoliciesAsync"></a>
# **getItemWarrantyPoliciesAsync**
> ItemWarrantyPolicyDtoListEnvelope getItemWarrantyPoliciesAsync(itemId, apiVersion, xApiVersion)

Get item warranty policies

Retrieves all warranty policies for a specific item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemWarrantyPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemWarrantyPoliciesApi apiInstance = new ItemWarrantyPoliciesApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemWarrantyPolicyDtoListEnvelope result = apiInstance.getItemWarrantyPoliciesAsync(itemId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemWarrantyPoliciesApi#getItemWarrantyPoliciesAsync");
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

<a id="getItemWarrantyPolicyByIdAsync"></a>
# **getItemWarrantyPolicyByIdAsync**
> ItemWarrantyPolicyDtoEnvelope getItemWarrantyPolicyByIdAsync(itemWarrantyPolicyId, itemId, apiVersion, xApiVersion)

Get item warranty policy by ID

Retrieves a specific warranty policy for an item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemWarrantyPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemWarrantyPoliciesApi apiInstance = new ItemWarrantyPoliciesApi(defaultClient);
    UUID itemWarrantyPolicyId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemWarrantyPolicyDtoEnvelope result = apiInstance.getItemWarrantyPolicyByIdAsync(itemWarrantyPolicyId, itemId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemWarrantyPoliciesApi#getItemWarrantyPolicyByIdAsync");
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
| **itemWarrantyPolicyId** | **UUID**|  | |
| **itemId** | **UUID**|  | [optional] |
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

<a id="relateItemToWarrantyPolicyAsync"></a>
# **relateItemToWarrantyPolicyAsync**
> relateItemToWarrantyPolicyAsync(tenantId, itemId, warrantyPolicyId, apiVersion, xApiVersion)

Relate item to warranty policy

Relates an item to an existing warranty policy.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemWarrantyPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemWarrantyPoliciesApi apiInstance = new ItemWarrantyPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID warrantyPolicyId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.relateItemToWarrantyPolicyAsync(tenantId, itemId, warrantyPolicyId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemWarrantyPoliciesApi#relateItemToWarrantyPolicyAsync");
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
| **warrantyPolicyId** | **UUID**|  | |
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

<a id="removeWarrantyPolicyFromItemAsync"></a>
# **removeWarrantyPolicyFromItemAsync**
> removeWarrantyPolicyFromItemAsync(tenantId, itemId, itemWarrantyPolicyId, apiVersion, xApiVersion)

Remove warranty policy from item

Removes a warranty policy from an item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemWarrantyPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemWarrantyPoliciesApi apiInstance = new ItemWarrantyPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemWarrantyPolicyId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.removeWarrantyPolicyFromItemAsync(tenantId, itemId, itemWarrantyPolicyId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemWarrantyPoliciesApi#removeWarrantyPolicyFromItemAsync");
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
| **itemWarrantyPolicyId** | **UUID**|  | |
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

