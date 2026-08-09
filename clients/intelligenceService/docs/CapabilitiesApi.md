# CapabilitiesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCapabilitiesAsync**](CapabilitiesApi.md#getCapabilitiesAsync) | **GET** /api/v2/IntelligenceService/Capabilities | Get the annotated capability catalog |
| [**getCapabilitiesCountAsync**](CapabilitiesApi.md#getCapabilitiesCountAsync) | **GET** /api/v2/IntelligenceService/Capabilities/Count | Get the capability catalog count |
| [**getCapabilityByKeyAsync**](CapabilitiesApi.md#getCapabilityByKeyAsync) | **GET** /api/v2/IntelligenceService/Capabilities/{key} | Get a capability by key |


<a id="getCapabilitiesAsync"></a>
# **getCapabilitiesAsync**
> CapabilityDtoListEnvelope getCapabilitiesAsync(tenantId, surface, apiVersion, xApiVersion)

Get the annotated capability catalog

Retrieves the full governed-capability catalog for the specified tenant, optionally narrowed to a single execution surface. Every capability is returned with an Available flag (and a DeniedReason when not available) so callers render disabled-with-reason instead of hiding; entitlement is computed server-side.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CapabilitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CapabilitiesApi apiInstance = new CapabilitiesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String surface = "None"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CapabilityDtoListEnvelope result = apiInstance.getCapabilitiesAsync(tenantId, surface, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CapabilitiesApi#getCapabilitiesAsync");
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
| **surface** | **String**|  | [optional] [enum: None, Workflow, AI, Mcp, Job, Integration, Webhook, Admin] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CapabilityDtoListEnvelope**](CapabilityDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **200** | OK |  -  |

<a id="getCapabilitiesCountAsync"></a>
# **getCapabilitiesCountAsync**
> Int32Envelope getCapabilitiesCountAsync(tenantId, surface, apiVersion, xApiVersion)

Get the capability catalog count

Returns the number of governed capabilities in the catalog for the specified tenant — the surface-matching total that mirrors the list route&#39;s returned-set size (entitled or not), honouring the same optional surface narrowing.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CapabilitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CapabilitiesApi apiInstance = new CapabilitiesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String surface = "None"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getCapabilitiesCountAsync(tenantId, surface, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CapabilitiesApi#getCapabilitiesCountAsync");
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
| **surface** | **String**|  | [optional] [enum: None, Workflow, AI, Mcp, Job, Integration, Webhook, Admin] |
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
| **200** | OK |  -  |

<a id="getCapabilityByKeyAsync"></a>
# **getCapabilityByKeyAsync**
> CapabilityDtoEnvelope getCapabilityByKeyAsync(tenantId, key, apiVersion, xApiVersion)

Get a capability by key

Retrieves a single governed capability by its stable, dotted key, stamped with the Available / DeniedReason entitlement flag. Returns 404 only when the capability does not exist; an existing capability the actor is not entitled to run is returned annotated as unavailable, not hidden.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CapabilitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CapabilitiesApi apiInstance = new CapabilitiesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String key = "key_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CapabilityDtoEnvelope result = apiInstance.getCapabilityByKeyAsync(tenantId, key, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CapabilitiesApi#getCapabilityByKeyAsync");
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
| **key** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CapabilityDtoEnvelope**](CapabilityDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **200** | OK |  -  |

