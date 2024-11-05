# SupportRequestAttachmentsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2SupportServiceSupportRequestAttachmentsCountGet**](SupportRequestAttachmentsApi.md#apiV2SupportServiceSupportRequestAttachmentsCountGet) | **GET** /api/v2/SupportService/SupportRequestAttachments/Count |  |
| [**apiV2SupportServiceSupportRequestAttachmentsGet**](SupportRequestAttachmentsApi.md#apiV2SupportServiceSupportRequestAttachmentsGet) | **GET** /api/v2/SupportService/SupportRequestAttachments |  |
| [**apiV2SupportServiceSupportRequestAttachmentsPost**](SupportRequestAttachmentsApi.md#apiV2SupportServiceSupportRequestAttachmentsPost) | **POST** /api/v2/SupportService/SupportRequestAttachments |  |
| [**apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdDelete**](SupportRequestAttachmentsApi.md#apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdDelete) | **DELETE** /api/v2/SupportService/SupportRequestAttachments/{supportRequestAttachmentId} |  |
| [**apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdGet**](SupportRequestAttachmentsApi.md#apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdGet) | **GET** /api/v2/SupportService/SupportRequestAttachments/{supportRequestAttachmentId} |  |
| [**apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdPut**](SupportRequestAttachmentsApi.md#apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdPut) | **PUT** /api/v2/SupportService/SupportRequestAttachments/{supportRequestAttachmentId} |  |


<a id="apiV2SupportServiceSupportRequestAttachmentsCountGet"></a>
# **apiV2SupportServiceSupportRequestAttachmentsCountGet**
> Int32Envelope apiV2SupportServiceSupportRequestAttachmentsCountGet(tenantId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportRequestAttachmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    SupportRequestAttachmentsApi apiInstance = new SupportRequestAttachmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.apiV2SupportServiceSupportRequestAttachmentsCountGet(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportRequestAttachmentsApi#apiV2SupportServiceSupportRequestAttachmentsCountGet");
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
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="apiV2SupportServiceSupportRequestAttachmentsGet"></a>
# **apiV2SupportServiceSupportRequestAttachmentsGet**
> SupportRequestAttachmentDtoListEnvelope apiV2SupportServiceSupportRequestAttachmentsGet(tenantId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportRequestAttachmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    SupportRequestAttachmentsApi apiInstance = new SupportRequestAttachmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SupportRequestAttachmentDtoListEnvelope result = apiInstance.apiV2SupportServiceSupportRequestAttachmentsGet(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportRequestAttachmentsApi#apiV2SupportServiceSupportRequestAttachmentsGet");
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
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**SupportRequestAttachmentDtoListEnvelope**](SupportRequestAttachmentDtoListEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="apiV2SupportServiceSupportRequestAttachmentsPost"></a>
# **apiV2SupportServiceSupportRequestAttachmentsPost**
> EmptyEnvelope apiV2SupportServiceSupportRequestAttachmentsPost(supportRequestAttachmentCreateDto, tenantId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportRequestAttachmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    SupportRequestAttachmentsApi apiInstance = new SupportRequestAttachmentsApi(defaultClient);
    SupportRequestAttachmentCreateDto supportRequestAttachmentCreateDto = new SupportRequestAttachmentCreateDto(); // SupportRequestAttachmentCreateDto | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.apiV2SupportServiceSupportRequestAttachmentsPost(supportRequestAttachmentCreateDto, tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportRequestAttachmentsApi#apiV2SupportServiceSupportRequestAttachmentsPost");
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
| **supportRequestAttachmentCreateDto** | [**SupportRequestAttachmentCreateDto**](SupportRequestAttachmentCreateDto.md)|  | |
| **tenantId** | **UUID**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

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
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **201** | Created |  -  |

<a id="apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdDelete"></a>
# **apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdDelete**
> EmptyEnvelope apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdDelete(supportRequestAttachmentId, tenantId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportRequestAttachmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    SupportRequestAttachmentsApi apiInstance = new SupportRequestAttachmentsApi(defaultClient);
    UUID supportRequestAttachmentId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdDelete(supportRequestAttachmentId, tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportRequestAttachmentsApi#apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdDelete");
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
| **supportRequestAttachmentId** | **UUID**|  | |
| **tenantId** | **UUID**|  | [optional] |
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
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdGet"></a>
# **apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdGet**
> SupportRequestAttachmentDtoEnvelope apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdGet(supportRequestAttachmentId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportRequestAttachmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    SupportRequestAttachmentsApi apiInstance = new SupportRequestAttachmentsApi(defaultClient);
    UUID supportRequestAttachmentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SupportRequestAttachmentDtoEnvelope result = apiInstance.apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdGet(supportRequestAttachmentId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportRequestAttachmentsApi#apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdGet");
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
| **supportRequestAttachmentId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**SupportRequestAttachmentDtoEnvelope**](SupportRequestAttachmentDtoEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdPut"></a>
# **apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdPut**
> EmptyEnvelope apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdPut(supportRequestAttachmentId, supportRequestAttachmentUpdateDto, tenantId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportRequestAttachmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    SupportRequestAttachmentsApi apiInstance = new SupportRequestAttachmentsApi(defaultClient);
    UUID supportRequestAttachmentId = UUID.randomUUID(); // UUID | 
    SupportRequestAttachmentUpdateDto supportRequestAttachmentUpdateDto = new SupportRequestAttachmentUpdateDto(); // SupportRequestAttachmentUpdateDto | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdPut(supportRequestAttachmentId, supportRequestAttachmentUpdateDto, tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportRequestAttachmentsApi#apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdPut");
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
| **supportRequestAttachmentId** | **UUID**|  | |
| **supportRequestAttachmentUpdateDto** | [**SupportRequestAttachmentUpdateDto**](SupportRequestAttachmentUpdateDto.md)|  | |
| **tenantId** | **UUID**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

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
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

