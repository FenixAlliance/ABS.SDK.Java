# ProjectTimeLogsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2TimeTrackerServiceProjectTimeLogsByResponsibleContactGet**](ProjectTimeLogsApi.md#apiV2TimeTrackerServiceProjectTimeLogsByResponsibleContactGet) | **GET** /api/v2/TimeTrackerService/ProjectTimeLogs/ByResponsibleContact |  |
| [**apiV2TimeTrackerServiceProjectTimeLogsCreatedByContactGet**](ProjectTimeLogsApi.md#apiV2TimeTrackerServiceProjectTimeLogsCreatedByContactGet) | **GET** /api/v2/TimeTrackerService/ProjectTimeLogs/CreatedByContact |  |
| [**apiV2TimeTrackerServiceProjectTimeLogsForProjectProjectIdGet**](ProjectTimeLogsApi.md#apiV2TimeTrackerServiceProjectTimeLogsForProjectProjectIdGet) | **GET** /api/v2/TimeTrackerService/ProjectTimeLogs/ForProject/{projectId} |  |
| [**apiV2TimeTrackerServiceProjectTimeLogsGet**](ProjectTimeLogsApi.md#apiV2TimeTrackerServiceProjectTimeLogsGet) | **GET** /api/v2/TimeTrackerService/ProjectTimeLogs |  |
| [**apiV2TimeTrackerServiceProjectTimeLogsPost**](ProjectTimeLogsApi.md#apiV2TimeTrackerServiceProjectTimeLogsPost) | **POST** /api/v2/TimeTrackerService/ProjectTimeLogs |  |
| [**apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdDelete**](ProjectTimeLogsApi.md#apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdDelete) | **DELETE** /api/v2/TimeTrackerService/ProjectTimeLogs/{timeLogId} |  |
| [**apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdGet**](ProjectTimeLogsApi.md#apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdGet) | **GET** /api/v2/TimeTrackerService/ProjectTimeLogs/{timeLogId} |  |
| [**apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdPut**](ProjectTimeLogsApi.md#apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdPut) | **PUT** /api/v2/TimeTrackerService/ProjectTimeLogs/{timeLogId} |  |


<a id="apiV2TimeTrackerServiceProjectTimeLogsByResponsibleContactGet"></a>
# **apiV2TimeTrackerServiceProjectTimeLogsByResponsibleContactGet**
> ProjectTimeLogDtoListEnvelope apiV2TimeTrackerServiceProjectTimeLogsByResponsibleContactGet(contactId, tenantId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectTimeLogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProjectTimeLogsApi apiInstance = new ProjectTimeLogsApi(defaultClient);
    UUID contactId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ProjectTimeLogDtoListEnvelope result = apiInstance.apiV2TimeTrackerServiceProjectTimeLogsByResponsibleContactGet(contactId, tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectTimeLogsApi#apiV2TimeTrackerServiceProjectTimeLogsByResponsibleContactGet");
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
| **contactId** | **UUID**|  | |
| **tenantId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ProjectTimeLogDtoListEnvelope**](ProjectTimeLogDtoListEnvelope.md)

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

<a id="apiV2TimeTrackerServiceProjectTimeLogsCreatedByContactGet"></a>
# **apiV2TimeTrackerServiceProjectTimeLogsCreatedByContactGet**
> ProjectTimeLogDtoListEnvelope apiV2TimeTrackerServiceProjectTimeLogsCreatedByContactGet(contactId, tenantId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectTimeLogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProjectTimeLogsApi apiInstance = new ProjectTimeLogsApi(defaultClient);
    UUID contactId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ProjectTimeLogDtoListEnvelope result = apiInstance.apiV2TimeTrackerServiceProjectTimeLogsCreatedByContactGet(contactId, tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectTimeLogsApi#apiV2TimeTrackerServiceProjectTimeLogsCreatedByContactGet");
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
| **contactId** | **UUID**|  | |
| **tenantId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ProjectTimeLogDtoListEnvelope**](ProjectTimeLogDtoListEnvelope.md)

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

<a id="apiV2TimeTrackerServiceProjectTimeLogsForProjectProjectIdGet"></a>
# **apiV2TimeTrackerServiceProjectTimeLogsForProjectProjectIdGet**
> ProjectTimeLogDtoListEnvelope apiV2TimeTrackerServiceProjectTimeLogsForProjectProjectIdGet(projectId, tenantId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectTimeLogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProjectTimeLogsApi apiInstance = new ProjectTimeLogsApi(defaultClient);
    UUID projectId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ProjectTimeLogDtoListEnvelope result = apiInstance.apiV2TimeTrackerServiceProjectTimeLogsForProjectProjectIdGet(projectId, tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectTimeLogsApi#apiV2TimeTrackerServiceProjectTimeLogsForProjectProjectIdGet");
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
| **projectId** | **UUID**|  | |
| **tenantId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ProjectTimeLogDtoListEnvelope**](ProjectTimeLogDtoListEnvelope.md)

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

<a id="apiV2TimeTrackerServiceProjectTimeLogsGet"></a>
# **apiV2TimeTrackerServiceProjectTimeLogsGet**
> ProjectTimeLogDtoListEnvelope apiV2TimeTrackerServiceProjectTimeLogsGet(tenantId, projectPeriodId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectTimeLogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProjectTimeLogsApi apiInstance = new ProjectTimeLogsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID projectPeriodId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ProjectTimeLogDtoListEnvelope result = apiInstance.apiV2TimeTrackerServiceProjectTimeLogsGet(tenantId, projectPeriodId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectTimeLogsApi#apiV2TimeTrackerServiceProjectTimeLogsGet");
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
| **projectPeriodId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ProjectTimeLogDtoListEnvelope**](ProjectTimeLogDtoListEnvelope.md)

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

<a id="apiV2TimeTrackerServiceProjectTimeLogsPost"></a>
# **apiV2TimeTrackerServiceProjectTimeLogsPost**
> apiV2TimeTrackerServiceProjectTimeLogsPost(tenantId, apiVersion, xApiVersion, projectTimeLogCreateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectTimeLogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProjectTimeLogsApi apiInstance = new ProjectTimeLogsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ProjectTimeLogCreateDto projectTimeLogCreateDto = new ProjectTimeLogCreateDto(); // ProjectTimeLogCreateDto | 
    try {
      apiInstance.apiV2TimeTrackerServiceProjectTimeLogsPost(tenantId, apiVersion, xApiVersion, projectTimeLogCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectTimeLogsApi#apiV2TimeTrackerServiceProjectTimeLogsPost");
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
| **projectTimeLogCreateDto** | [**ProjectTimeLogCreateDto**](ProjectTimeLogCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdDelete"></a>
# **apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdDelete**
> apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdDelete(tenantId, timeLogId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectTimeLogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProjectTimeLogsApi apiInstance = new ProjectTimeLogsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID timeLogId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdDelete(tenantId, timeLogId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectTimeLogsApi#apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdDelete");
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
| **timeLogId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdGet"></a>
# **apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdGet**
> ProjectTimeLogDtoEnvelope apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdGet(timeLogId, tenantId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectTimeLogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProjectTimeLogsApi apiInstance = new ProjectTimeLogsApi(defaultClient);
    UUID timeLogId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ProjectTimeLogDtoEnvelope result = apiInstance.apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdGet(timeLogId, tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectTimeLogsApi#apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdGet");
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
| **timeLogId** | **UUID**|  | |
| **tenantId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ProjectTimeLogDtoEnvelope**](ProjectTimeLogDtoEnvelope.md)

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

<a id="apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdPut"></a>
# **apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdPut**
> apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdPut(timeLogId, tenantId, apiVersion, xApiVersion, projectTimeLogUpdateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectTimeLogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProjectTimeLogsApi apiInstance = new ProjectTimeLogsApi(defaultClient);
    UUID timeLogId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ProjectTimeLogUpdateDto projectTimeLogUpdateDto = new ProjectTimeLogUpdateDto(); // ProjectTimeLogUpdateDto | 
    try {
      apiInstance.apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdPut(timeLogId, tenantId, apiVersion, xApiVersion, projectTimeLogUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectTimeLogsApi#apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdPut");
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
| **timeLogId** | **UUID**|  | |
| **tenantId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **projectTimeLogUpdateDto** | [**ProjectTimeLogUpdateDto**](ProjectTimeLogUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

