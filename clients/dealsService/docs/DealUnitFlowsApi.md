# DealUnitFlowsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2DealsServiceDealUnitFlowsCountGet**](DealUnitFlowsApi.md#apiV2DealsServiceDealUnitFlowsCountGet) | **GET** /api/v2/DealsService/DealUnitFlows/Count |  |
| [**apiV2DealsServiceDealUnitFlowsDealUnitFlowIdDelete**](DealUnitFlowsApi.md#apiV2DealsServiceDealUnitFlowsDealUnitFlowIdDelete) | **DELETE** /api/v2/DealsService/DealUnitFlows/{dealUnitFlowId} |  |
| [**apiV2DealsServiceDealUnitFlowsDealUnitFlowIdGet**](DealUnitFlowsApi.md#apiV2DealsServiceDealUnitFlowsDealUnitFlowIdGet) | **GET** /api/v2/DealsService/DealUnitFlows/{dealUnitFlowId} |  |
| [**apiV2DealsServiceDealUnitFlowsDealUnitFlowIdPut**](DealUnitFlowsApi.md#apiV2DealsServiceDealUnitFlowsDealUnitFlowIdPut) | **PUT** /api/v2/DealsService/DealUnitFlows/{dealUnitFlowId} |  |
| [**apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesCountGet**](DealUnitFlowsApi.md#apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesCountGet) | **GET** /api/v2/DealsService/DealUnitFlows/{dealUnitFlowId}/Stages/Count |  |
| [**apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdDelete**](DealUnitFlowsApi.md#apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdDelete) | **DELETE** /api/v2/DealsService/DealUnitFlows/{dealUnitFlowId}/Stages/{dealUnitFlowStageId} |  |
| [**apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdGet**](DealUnitFlowsApi.md#apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdGet) | **GET** /api/v2/DealsService/DealUnitFlows/{dealUnitFlowId}/Stages/{dealUnitFlowStageId} |  |
| [**apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdPut**](DealUnitFlowsApi.md#apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdPut) | **PUT** /api/v2/DealsService/DealUnitFlows/{dealUnitFlowId}/Stages/{dealUnitFlowStageId} |  |
| [**apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesGet**](DealUnitFlowsApi.md#apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesGet) | **GET** /api/v2/DealsService/DealUnitFlows/{dealUnitFlowId}/Stages |  |
| [**apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesPost**](DealUnitFlowsApi.md#apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesPost) | **POST** /api/v2/DealsService/DealUnitFlows/{dealUnitFlowId}/Stages |  |
| [**apiV2DealsServiceDealUnitFlowsGet**](DealUnitFlowsApi.md#apiV2DealsServiceDealUnitFlowsGet) | **GET** /api/v2/DealsService/DealUnitFlows |  |
| [**apiV2DealsServiceDealUnitFlowsPost**](DealUnitFlowsApi.md#apiV2DealsServiceDealUnitFlowsPost) | **POST** /api/v2/DealsService/DealUnitFlows |  |


<a id="apiV2DealsServiceDealUnitFlowsCountGet"></a>
# **apiV2DealsServiceDealUnitFlowsCountGet**
> Int32Envelope apiV2DealsServiceDealUnitFlowsCountGet(tenantId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitFlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DealUnitFlowsApi apiInstance = new DealUnitFlowsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.apiV2DealsServiceDealUnitFlowsCountGet(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitFlowsApi#apiV2DealsServiceDealUnitFlowsCountGet");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2DealsServiceDealUnitFlowsDealUnitFlowIdDelete"></a>
# **apiV2DealsServiceDealUnitFlowsDealUnitFlowIdDelete**
> EmptyEnvelope apiV2DealsServiceDealUnitFlowsDealUnitFlowIdDelete(tenantId, dealUnitFlowId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitFlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DealUnitFlowsApi apiInstance = new DealUnitFlowsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID dealUnitFlowId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.apiV2DealsServiceDealUnitFlowsDealUnitFlowIdDelete(tenantId, dealUnitFlowId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitFlowsApi#apiV2DealsServiceDealUnitFlowsDealUnitFlowIdDelete");
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
| **dealUnitFlowId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2DealsServiceDealUnitFlowsDealUnitFlowIdGet"></a>
# **apiV2DealsServiceDealUnitFlowsDealUnitFlowIdGet**
> DealUnitFlowDtoEnvelope apiV2DealsServiceDealUnitFlowsDealUnitFlowIdGet(tenantId, dealUnitFlowId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitFlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DealUnitFlowsApi apiInstance = new DealUnitFlowsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID dealUnitFlowId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      DealUnitFlowDtoEnvelope result = apiInstance.apiV2DealsServiceDealUnitFlowsDealUnitFlowIdGet(tenantId, dealUnitFlowId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitFlowsApi#apiV2DealsServiceDealUnitFlowsDealUnitFlowIdGet");
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
| **dealUnitFlowId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**DealUnitFlowDtoEnvelope**](DealUnitFlowDtoEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2DealsServiceDealUnitFlowsDealUnitFlowIdPut"></a>
# **apiV2DealsServiceDealUnitFlowsDealUnitFlowIdPut**
> EmptyEnvelope apiV2DealsServiceDealUnitFlowsDealUnitFlowIdPut(tenantId, dealUnitFlowId, apiVersion, xApiVersion, dealUnitFlowUpdateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitFlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DealUnitFlowsApi apiInstance = new DealUnitFlowsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID dealUnitFlowId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    DealUnitFlowUpdateDto dealUnitFlowUpdateDto = new DealUnitFlowUpdateDto(); // DealUnitFlowUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.apiV2DealsServiceDealUnitFlowsDealUnitFlowIdPut(tenantId, dealUnitFlowId, apiVersion, xApiVersion, dealUnitFlowUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitFlowsApi#apiV2DealsServiceDealUnitFlowsDealUnitFlowIdPut");
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
| **dealUnitFlowId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **dealUnitFlowUpdateDto** | [**DealUnitFlowUpdateDto**](DealUnitFlowUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesCountGet"></a>
# **apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesCountGet**
> Int32Envelope apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesCountGet(tenantId, dealUnitFlowId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitFlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DealUnitFlowsApi apiInstance = new DealUnitFlowsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID dealUnitFlowId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesCountGet(tenantId, dealUnitFlowId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitFlowsApi#apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesCountGet");
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
| **dealUnitFlowId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdDelete"></a>
# **apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdDelete**
> EmptyEnvelope apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdDelete(tenantId, dealUnitFlowId, dealUnitFlowStageId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitFlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DealUnitFlowsApi apiInstance = new DealUnitFlowsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID dealUnitFlowId = UUID.randomUUID(); // UUID | 
    UUID dealUnitFlowStageId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdDelete(tenantId, dealUnitFlowId, dealUnitFlowStageId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitFlowsApi#apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdDelete");
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
| **dealUnitFlowId** | **UUID**|  | |
| **dealUnitFlowStageId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdGet"></a>
# **apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdGet**
> DealUnitFlowStageDtoEnvelope apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdGet(tenantId, dealUnitFlowId, dealUnitFlowStageId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitFlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DealUnitFlowsApi apiInstance = new DealUnitFlowsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID dealUnitFlowId = UUID.randomUUID(); // UUID | 
    UUID dealUnitFlowStageId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      DealUnitFlowStageDtoEnvelope result = apiInstance.apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdGet(tenantId, dealUnitFlowId, dealUnitFlowStageId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitFlowsApi#apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdGet");
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
| **dealUnitFlowId** | **UUID**|  | |
| **dealUnitFlowStageId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**DealUnitFlowStageDtoEnvelope**](DealUnitFlowStageDtoEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdPut"></a>
# **apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdPut**
> EmptyEnvelope apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdPut(tenantId, dealUnitFlowId, dealUnitFlowStageId, apiVersion, xApiVersion, dealUnitFlowStageUpdateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitFlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DealUnitFlowsApi apiInstance = new DealUnitFlowsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID dealUnitFlowId = UUID.randomUUID(); // UUID | 
    UUID dealUnitFlowStageId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    DealUnitFlowStageUpdateDto dealUnitFlowStageUpdateDto = new DealUnitFlowStageUpdateDto(); // DealUnitFlowStageUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdPut(tenantId, dealUnitFlowId, dealUnitFlowStageId, apiVersion, xApiVersion, dealUnitFlowStageUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitFlowsApi#apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdPut");
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
| **dealUnitFlowId** | **UUID**|  | |
| **dealUnitFlowStageId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **dealUnitFlowStageUpdateDto** | [**DealUnitFlowStageUpdateDto**](DealUnitFlowStageUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesGet"></a>
# **apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesGet**
> DealUnitFlowStageDtoListEnvelope apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesGet(tenantId, dealUnitFlowId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitFlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DealUnitFlowsApi apiInstance = new DealUnitFlowsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID dealUnitFlowId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      DealUnitFlowStageDtoListEnvelope result = apiInstance.apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesGet(tenantId, dealUnitFlowId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitFlowsApi#apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesGet");
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
| **dealUnitFlowId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**DealUnitFlowStageDtoListEnvelope**](DealUnitFlowStageDtoListEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesPost"></a>
# **apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesPost**
> EmptyEnvelope apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesPost(tenantId, dealUnitFlowId, apiVersion, xApiVersion, dealUnitFlowStageCreateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitFlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DealUnitFlowsApi apiInstance = new DealUnitFlowsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID dealUnitFlowId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    DealUnitFlowStageCreateDto dealUnitFlowStageCreateDto = new DealUnitFlowStageCreateDto(); // DealUnitFlowStageCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesPost(tenantId, dealUnitFlowId, apiVersion, xApiVersion, dealUnitFlowStageCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitFlowsApi#apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesPost");
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
| **dealUnitFlowId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **dealUnitFlowStageCreateDto** | [**DealUnitFlowStageCreateDto**](DealUnitFlowStageCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2DealsServiceDealUnitFlowsGet"></a>
# **apiV2DealsServiceDealUnitFlowsGet**
> DealUnitFlowDtoListEnvelope apiV2DealsServiceDealUnitFlowsGet(tenantId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitFlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DealUnitFlowsApi apiInstance = new DealUnitFlowsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      DealUnitFlowDtoListEnvelope result = apiInstance.apiV2DealsServiceDealUnitFlowsGet(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitFlowsApi#apiV2DealsServiceDealUnitFlowsGet");
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

[**DealUnitFlowDtoListEnvelope**](DealUnitFlowDtoListEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2DealsServiceDealUnitFlowsPost"></a>
# **apiV2DealsServiceDealUnitFlowsPost**
> EmptyEnvelope apiV2DealsServiceDealUnitFlowsPost(tenantId, apiVersion, xApiVersion, dealUnitFlowCreateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitFlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DealUnitFlowsApi apiInstance = new DealUnitFlowsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    DealUnitFlowCreateDto dealUnitFlowCreateDto = new DealUnitFlowCreateDto(); // DealUnitFlowCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.apiV2DealsServiceDealUnitFlowsPost(tenantId, apiVersion, xApiVersion, dealUnitFlowCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitFlowsApi#apiV2DealsServiceDealUnitFlowsPost");
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
| **dealUnitFlowCreateDto** | [**DealUnitFlowCreateDto**](DealUnitFlowCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

