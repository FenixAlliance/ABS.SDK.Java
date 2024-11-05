# SalesLiteraturesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2DealsServiceSalesLiteraturesExtendedGet**](SalesLiteraturesApi.md#apiV2DealsServiceSalesLiteraturesExtendedGet) | **GET** /api/v2/DealsService/SalesLiteratures/Extended |  |
| [**apiV2DealsServiceSalesLiteraturesGet**](SalesLiteraturesApi.md#apiV2DealsServiceSalesLiteraturesGet) | **GET** /api/v2/DealsService/SalesLiteratures |  |
| [**apiV2DealsServiceSalesLiteraturesPost**](SalesLiteraturesApi.md#apiV2DealsServiceSalesLiteraturesPost) | **POST** /api/v2/DealsService/SalesLiteratures |  |
| [**apiV2DealsServiceSalesLiteraturesSalesLiteratureIdDelete**](SalesLiteraturesApi.md#apiV2DealsServiceSalesLiteraturesSalesLiteratureIdDelete) | **DELETE** /api/v2/DealsService/SalesLiteratures/{salesLiteratureId} |  |
| [**apiV2DealsServiceSalesLiteraturesSalesLiteratureIdGet**](SalesLiteraturesApi.md#apiV2DealsServiceSalesLiteraturesSalesLiteratureIdGet) | **GET** /api/v2/DealsService/SalesLiteratures/{salesLiteratureId} |  |
| [**apiV2DealsServiceSalesLiteraturesSalesLiteratureIdPut**](SalesLiteraturesApi.md#apiV2DealsServiceSalesLiteraturesSalesLiteratureIdPut) | **PUT** /api/v2/DealsService/SalesLiteratures/{salesLiteratureId} |  |


<a id="apiV2DealsServiceSalesLiteraturesExtendedGet"></a>
# **apiV2DealsServiceSalesLiteraturesExtendedGet**
> ExtendedSalesLiteratureDtoListEnvelope apiV2DealsServiceSalesLiteraturesExtendedGet(tenantId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SalesLiteraturesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    SalesLiteraturesApi apiInstance = new SalesLiteraturesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ExtendedSalesLiteratureDtoListEnvelope result = apiInstance.apiV2DealsServiceSalesLiteraturesExtendedGet(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SalesLiteraturesApi#apiV2DealsServiceSalesLiteraturesExtendedGet");
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

[**ExtendedSalesLiteratureDtoListEnvelope**](ExtendedSalesLiteratureDtoListEnvelope.md)

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

<a id="apiV2DealsServiceSalesLiteraturesGet"></a>
# **apiV2DealsServiceSalesLiteraturesGet**
> SalesLiteratureDtoListEnvelope apiV2DealsServiceSalesLiteraturesGet(tenantId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SalesLiteraturesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    SalesLiteraturesApi apiInstance = new SalesLiteraturesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SalesLiteratureDtoListEnvelope result = apiInstance.apiV2DealsServiceSalesLiteraturesGet(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SalesLiteraturesApi#apiV2DealsServiceSalesLiteraturesGet");
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

[**SalesLiteratureDtoListEnvelope**](SalesLiteratureDtoListEnvelope.md)

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

<a id="apiV2DealsServiceSalesLiteraturesPost"></a>
# **apiV2DealsServiceSalesLiteraturesPost**
> EmptyEnvelope apiV2DealsServiceSalesLiteraturesPost(tenantId, apiVersion, xApiVersion, salesLiteratureCreateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SalesLiteraturesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    SalesLiteraturesApi apiInstance = new SalesLiteraturesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SalesLiteratureCreateDto salesLiteratureCreateDto = new SalesLiteratureCreateDto(); // SalesLiteratureCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.apiV2DealsServiceSalesLiteraturesPost(tenantId, apiVersion, xApiVersion, salesLiteratureCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SalesLiteraturesApi#apiV2DealsServiceSalesLiteraturesPost");
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
| **salesLiteratureCreateDto** | [**SalesLiteratureCreateDto**](SalesLiteratureCreateDto.md)|  | [optional] |

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

<a id="apiV2DealsServiceSalesLiteraturesSalesLiteratureIdDelete"></a>
# **apiV2DealsServiceSalesLiteraturesSalesLiteratureIdDelete**
> EmptyEnvelope apiV2DealsServiceSalesLiteraturesSalesLiteratureIdDelete(tenantId, salesLiteratureId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SalesLiteraturesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    SalesLiteraturesApi apiInstance = new SalesLiteraturesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID salesLiteratureId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.apiV2DealsServiceSalesLiteraturesSalesLiteratureIdDelete(tenantId, salesLiteratureId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SalesLiteraturesApi#apiV2DealsServiceSalesLiteraturesSalesLiteratureIdDelete");
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
| **salesLiteratureId** | **UUID**|  | |
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

<a id="apiV2DealsServiceSalesLiteraturesSalesLiteratureIdGet"></a>
# **apiV2DealsServiceSalesLiteraturesSalesLiteratureIdGet**
> SalesLiteratureDtoEnvelope apiV2DealsServiceSalesLiteraturesSalesLiteratureIdGet(salesLiteratureId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SalesLiteraturesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    SalesLiteraturesApi apiInstance = new SalesLiteraturesApi(defaultClient);
    UUID salesLiteratureId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SalesLiteratureDtoEnvelope result = apiInstance.apiV2DealsServiceSalesLiteraturesSalesLiteratureIdGet(salesLiteratureId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SalesLiteraturesApi#apiV2DealsServiceSalesLiteraturesSalesLiteratureIdGet");
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
| **salesLiteratureId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**SalesLiteratureDtoEnvelope**](SalesLiteratureDtoEnvelope.md)

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

<a id="apiV2DealsServiceSalesLiteraturesSalesLiteratureIdPut"></a>
# **apiV2DealsServiceSalesLiteraturesSalesLiteratureIdPut**
> EmptyEnvelope apiV2DealsServiceSalesLiteraturesSalesLiteratureIdPut(tenantId, salesLiteratureId, apiVersion, xApiVersion, salesLiteratureUpdateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SalesLiteraturesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    SalesLiteraturesApi apiInstance = new SalesLiteraturesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID salesLiteratureId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SalesLiteratureUpdateDto salesLiteratureUpdateDto = new SalesLiteratureUpdateDto(); // SalesLiteratureUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.apiV2DealsServiceSalesLiteraturesSalesLiteratureIdPut(tenantId, salesLiteratureId, apiVersion, xApiVersion, salesLiteratureUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SalesLiteraturesApi#apiV2DealsServiceSalesLiteraturesSalesLiteratureIdPut");
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
| **salesLiteratureId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **salesLiteratureUpdateDto** | [**SalesLiteratureUpdateDto**](SalesLiteratureUpdateDto.md)|  | [optional] |

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

