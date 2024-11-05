# TaskTypesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2ProjectsServiceTaskTypesPost**](TaskTypesApi.md#apiV2ProjectsServiceTaskTypesPost) | **POST** /api/v2/ProjectsService/TaskTypes |  |
| [**apiV2ProjectsServiceTaskTypesTaskTypeIdDelete**](TaskTypesApi.md#apiV2ProjectsServiceTaskTypesTaskTypeIdDelete) | **DELETE** /api/v2/ProjectsService/TaskTypes/{taskTypeId} |  |
| [**apiV2ProjectsServiceTaskTypesTaskTypeIdGet**](TaskTypesApi.md#apiV2ProjectsServiceTaskTypesTaskTypeIdGet) | **GET** /api/v2/ProjectsService/TaskTypes/{taskTypeId} |  |
| [**apiV2ProjectsServiceTaskTypesTaskTypeIdPut**](TaskTypesApi.md#apiV2ProjectsServiceTaskTypesTaskTypeIdPut) | **PUT** /api/v2/ProjectsService/TaskTypes/{taskTypeId} |  |


<a id="apiV2ProjectsServiceTaskTypesPost"></a>
# **apiV2ProjectsServiceTaskTypesPost**
> TaskTypeDto apiV2ProjectsServiceTaskTypesPost(tenantId, apiVersion, xApiVersion, taskTypeCreateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaskTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    TaskTypesApi apiInstance = new TaskTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TaskTypeCreateDto taskTypeCreateDto = new TaskTypeCreateDto(); // TaskTypeCreateDto | 
    try {
      TaskTypeDto result = apiInstance.apiV2ProjectsServiceTaskTypesPost(tenantId, apiVersion, xApiVersion, taskTypeCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskTypesApi#apiV2ProjectsServiceTaskTypesPost");
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
| **taskTypeCreateDto** | [**TaskTypeCreateDto**](TaskTypeCreateDto.md)|  | [optional] |

### Return type

[**TaskTypeDto**](TaskTypeDto.md)

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

<a id="apiV2ProjectsServiceTaskTypesTaskTypeIdDelete"></a>
# **apiV2ProjectsServiceTaskTypesTaskTypeIdDelete**
> TaskTypeDto apiV2ProjectsServiceTaskTypesTaskTypeIdDelete(taskTypeId, tenantId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaskTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    TaskTypesApi apiInstance = new TaskTypesApi(defaultClient);
    UUID taskTypeId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TaskTypeDto result = apiInstance.apiV2ProjectsServiceTaskTypesTaskTypeIdDelete(taskTypeId, tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskTypesApi#apiV2ProjectsServiceTaskTypesTaskTypeIdDelete");
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
| **taskTypeId** | **UUID**|  | |
| **tenantId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**TaskTypeDto**](TaskTypeDto.md)

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

<a id="apiV2ProjectsServiceTaskTypesTaskTypeIdGet"></a>
# **apiV2ProjectsServiceTaskTypesTaskTypeIdGet**
> TaskTypeDto apiV2ProjectsServiceTaskTypesTaskTypeIdGet(taskTypeId, tenantId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaskTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    TaskTypesApi apiInstance = new TaskTypesApi(defaultClient);
    UUID taskTypeId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TaskTypeDto result = apiInstance.apiV2ProjectsServiceTaskTypesTaskTypeIdGet(taskTypeId, tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskTypesApi#apiV2ProjectsServiceTaskTypesTaskTypeIdGet");
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
| **taskTypeId** | **UUID**|  | |
| **tenantId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**TaskTypeDto**](TaskTypeDto.md)

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

<a id="apiV2ProjectsServiceTaskTypesTaskTypeIdPut"></a>
# **apiV2ProjectsServiceTaskTypesTaskTypeIdPut**
> TaskTypeDto apiV2ProjectsServiceTaskTypesTaskTypeIdPut(taskTypeId, tenantId, apiVersion, xApiVersion, taskTypeUpdateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaskTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    TaskTypesApi apiInstance = new TaskTypesApi(defaultClient);
    UUID taskTypeId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TaskTypeUpdateDto taskTypeUpdateDto = new TaskTypeUpdateDto(); // TaskTypeUpdateDto | 
    try {
      TaskTypeDto result = apiInstance.apiV2ProjectsServiceTaskTypesTaskTypeIdPut(taskTypeId, tenantId, apiVersion, xApiVersion, taskTypeUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskTypesApi#apiV2ProjectsServiceTaskTypesTaskTypeIdPut");
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
| **taskTypeId** | **UUID**|  | |
| **tenantId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **taskTypeUpdateDto** | [**TaskTypeUpdateDto**](TaskTypeUpdateDto.md)|  | [optional] |

### Return type

[**TaskTypeDto**](TaskTypeDto.md)

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

