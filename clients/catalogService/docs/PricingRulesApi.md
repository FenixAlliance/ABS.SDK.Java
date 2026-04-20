# PricingRulesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPricingRule**](PricingRulesApi.md#createPricingRule) | **POST** /api/v2/CatalogService/PricingRules | Create a new pricing rule |
| [**deletePricingRule**](PricingRulesApi.md#deletePricingRule) | **DELETE** /api/v2/CatalogService/PricingRules/{pricingRuleId} | Delete a pricing rule |
| [**getPricingRuleById**](PricingRulesApi.md#getPricingRuleById) | **GET** /api/v2/CatalogService/PricingRules/{pricingRuleId} | Get pricing rule by ID |
| [**getPricingRules**](PricingRulesApi.md#getPricingRules) | **GET** /api/v2/CatalogService/PricingRules | Get all pricing rules |
| [**updatePricingRule**](PricingRulesApi.md#updatePricingRule) | **PUT** /api/v2/CatalogService/PricingRules/Update | Update a pricing rule |


<a id="createPricingRule"></a>
# **createPricingRule**
> PricingRuleDtoEnvelope createPricingRule(tenantId, apiVersion, xApiVersion, pricingRuleCreateDto)

Create a new pricing rule

Creates a new pricing rule for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PricingRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PricingRulesApi apiInstance = new PricingRulesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    PricingRuleCreateDto pricingRuleCreateDto = new PricingRuleCreateDto(); // PricingRuleCreateDto | 
    try {
      PricingRuleDtoEnvelope result = apiInstance.createPricingRule(tenantId, apiVersion, xApiVersion, pricingRuleCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PricingRulesApi#createPricingRule");
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
| **pricingRuleCreateDto** | [**PricingRuleCreateDto**](PricingRuleCreateDto.md)|  | [optional] |

### Return type

[**PricingRuleDtoEnvelope**](PricingRuleDtoEnvelope.md)

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
| **201** | Created |  -  |

<a id="deletePricingRule"></a>
# **deletePricingRule**
> deletePricingRule(tenantId, pricingRuleId, apiVersion, xApiVersion)

Delete a pricing rule

Deletes a pricing rule for the specified tenant and rule ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PricingRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PricingRulesApi apiInstance = new PricingRulesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID pricingRuleId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deletePricingRule(tenantId, pricingRuleId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling PricingRulesApi#deletePricingRule");
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
| **pricingRuleId** | **UUID**|  | |
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

<a id="getPricingRuleById"></a>
# **getPricingRuleById**
> PricingRuleDtoEnvelope getPricingRuleById(pricingRuleId, apiVersion, xApiVersion)

Get pricing rule by ID

Retrieves a pricing rule by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PricingRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PricingRulesApi apiInstance = new PricingRulesApi(defaultClient);
    UUID pricingRuleId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      PricingRuleDtoEnvelope result = apiInstance.getPricingRuleById(pricingRuleId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PricingRulesApi#getPricingRuleById");
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
| **pricingRuleId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**PricingRuleDtoEnvelope**](PricingRuleDtoEnvelope.md)

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

<a id="getPricingRules"></a>
# **getPricingRules**
> PricingRuleDtoListEnvelope getPricingRules(tenantId, apiVersion, xApiVersion)

Get all pricing rules

Retrieves all pricing rules for the specified tenant, with optional OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PricingRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PricingRulesApi apiInstance = new PricingRulesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      PricingRuleDtoListEnvelope result = apiInstance.getPricingRules(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PricingRulesApi#getPricingRules");
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

[**PricingRuleDtoListEnvelope**](PricingRuleDtoListEnvelope.md)

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

<a id="updatePricingRule"></a>
# **updatePricingRule**
> updatePricingRule(tenantId, pricingRuleId, apiVersion, xApiVersion, pricingRuleUpdateDto)

Update a pricing rule

Updates an existing pricing rule for the specified tenant and rule ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PricingRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PricingRulesApi apiInstance = new PricingRulesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID pricingRuleId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    PricingRuleUpdateDto pricingRuleUpdateDto = new PricingRuleUpdateDto(); // PricingRuleUpdateDto | 
    try {
      apiInstance.updatePricingRule(tenantId, pricingRuleId, apiVersion, xApiVersion, pricingRuleUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling PricingRulesApi#updatePricingRule");
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
| **pricingRuleId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **pricingRuleUpdateDto** | [**PricingRuleUpdateDto**](PricingRuleUpdateDto.md)|  | [optional] |

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
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

