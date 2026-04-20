# ItemTaxPoliciesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**countItemTaxPoliciesAsync**](ItemTaxPoliciesApi.md#countItemTaxPoliciesAsync) | **GET** /api/v2/CatalogService/ItemTaxPolicies/Count | Count item tax policies |
| [**getItemTaxPoliciesAsync**](ItemTaxPoliciesApi.md#getItemTaxPoliciesAsync) | **GET** /api/v2/CatalogService/ItemTaxPolicies | Get item tax policies |
| [**getItemTaxPolicyByIdAsync**](ItemTaxPoliciesApi.md#getItemTaxPolicyByIdAsync) | **GET** /api/v2/CatalogService/ItemTaxPolicies/{itemTaxPolicyId} | Get item tax policy by ID |
| [**relateItemToTaxPolicyAsync**](ItemTaxPoliciesApi.md#relateItemToTaxPolicyAsync) | **POST** /api/v2/CatalogService/ItemTaxPolicies | Relate item to tax policy |
| [**removeTaxPolicyFromItemAsync**](ItemTaxPoliciesApi.md#removeTaxPolicyFromItemAsync) | **DELETE** /api/v2/CatalogService/ItemTaxPolicies/{itemTaxPolicyId} | Remove tax policy from item |


<a id="countItemTaxPoliciesAsync"></a>
# **countItemTaxPoliciesAsync**
> Int32Envelope countItemTaxPoliciesAsync(itemId, apiVersion, xApiVersion)

Count item tax policies

Counts all tax policies for a specific item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemTaxPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ItemTaxPoliciesApi apiInstance = new ItemTaxPoliciesApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.countItemTaxPoliciesAsync(itemId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemTaxPoliciesApi#countItemTaxPoliciesAsync");
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

<a id="getItemTaxPoliciesAsync"></a>
# **getItemTaxPoliciesAsync**
> ItemTaxPolicyDtoListEnvelope getItemTaxPoliciesAsync(itemId, apiVersion, xApiVersion)

Get item tax policies

Retrieves all tax policies for a specific item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemTaxPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ItemTaxPoliciesApi apiInstance = new ItemTaxPoliciesApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemTaxPolicyDtoListEnvelope result = apiInstance.getItemTaxPoliciesAsync(itemId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemTaxPoliciesApi#getItemTaxPoliciesAsync");
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

[**ItemTaxPolicyDtoListEnvelope**](ItemTaxPolicyDtoListEnvelope.md)

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

<a id="getItemTaxPolicyByIdAsync"></a>
# **getItemTaxPolicyByIdAsync**
> ItemTaxPolicyDtoEnvelope getItemTaxPolicyByIdAsync(itemTaxPolicyId, itemId, apiVersion, xApiVersion)

Get item tax policy by ID

Retrieves a specific tax policy for an item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemTaxPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ItemTaxPoliciesApi apiInstance = new ItemTaxPoliciesApi(defaultClient);
    UUID itemTaxPolicyId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemTaxPolicyDtoEnvelope result = apiInstance.getItemTaxPolicyByIdAsync(itemTaxPolicyId, itemId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemTaxPoliciesApi#getItemTaxPolicyByIdAsync");
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
| **itemTaxPolicyId** | **UUID**|  | |
| **itemId** | **UUID**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemTaxPolicyDtoEnvelope**](ItemTaxPolicyDtoEnvelope.md)

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

<a id="relateItemToTaxPolicyAsync"></a>
# **relateItemToTaxPolicyAsync**
> relateItemToTaxPolicyAsync(tenantId, itemId, taxPolicyId, apiVersion, xApiVersion)

Relate item to tax policy

Relates an item to an existing tax policy.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemTaxPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ItemTaxPoliciesApi apiInstance = new ItemTaxPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID taxPolicyId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.relateItemToTaxPolicyAsync(tenantId, itemId, taxPolicyId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemTaxPoliciesApi#relateItemToTaxPolicyAsync");
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
| **taxPolicyId** | **UUID**|  | |
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

<a id="removeTaxPolicyFromItemAsync"></a>
# **removeTaxPolicyFromItemAsync**
> removeTaxPolicyFromItemAsync(tenantId, itemId, itemTaxPolicyId, apiVersion, xApiVersion)

Remove tax policy from item

Removes a tax policy from an item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemTaxPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ItemTaxPoliciesApi apiInstance = new ItemTaxPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemTaxPolicyId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.removeTaxPolicyFromItemAsync(tenantId, itemId, itemTaxPolicyId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemTaxPoliciesApi#removeTaxPolicyFromItemAsync");
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
| **itemTaxPolicyId** | **UUID**|  | |
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

