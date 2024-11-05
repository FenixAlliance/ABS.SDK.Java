# TaskCategoriesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2ProjectsServiceTaskCategoriesGet**](TaskCategoriesApi.md#apiV2ProjectsServiceTaskCategoriesGet) | **GET** /api/v2/ProjectsService/TaskCategories |  |
| [**apiV2ProjectsServiceTaskCategoriesPost**](TaskCategoriesApi.md#apiV2ProjectsServiceTaskCategoriesPost) | **POST** /api/v2/ProjectsService/TaskCategories |  |
| [**apiV2ProjectsServiceTaskCategoriesTaskCategoryIdDelete**](TaskCategoriesApi.md#apiV2ProjectsServiceTaskCategoriesTaskCategoryIdDelete) | **DELETE** /api/v2/ProjectsService/TaskCategories/{taskCategoryId} |  |
| [**apiV2ProjectsServiceTaskCategoriesTaskCategoryIdGet**](TaskCategoriesApi.md#apiV2ProjectsServiceTaskCategoriesTaskCategoryIdGet) | **GET** /api/v2/ProjectsService/TaskCategories/{taskCategoryId} |  |
| [**apiV2ProjectsServiceTaskCategoriesTaskCategoryIdPut**](TaskCategoriesApi.md#apiV2ProjectsServiceTaskCategoriesTaskCategoryIdPut) | **PUT** /api/v2/ProjectsService/TaskCategories/{taskCategoryId} |  |
| [**apiV2ProjectsServiceTaskCategoriesTaskCategoryIdTypesGet**](TaskCategoriesApi.md#apiV2ProjectsServiceTaskCategoriesTaskCategoryIdTypesGet) | **GET** /api/v2/ProjectsService/TaskCategories/{taskCategoryId}/Types |  |


<a id="apiV2ProjectsServiceTaskCategoriesGet"></a>
# **apiV2ProjectsServiceTaskCategoriesGet**
> TaskCategoryDtoListEnvelope apiV2ProjectsServiceTaskCategoriesGet(tenantId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaskCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    TaskCategoriesApi apiInstance = new TaskCategoriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TaskCategoryDtoListEnvelope result = apiInstance.apiV2ProjectsServiceTaskCategoriesGet(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskCategoriesApi#apiV2ProjectsServiceTaskCategoriesGet");
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

[**TaskCategoryDtoListEnvelope**](TaskCategoryDtoListEnvelope.md)

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

<a id="apiV2ProjectsServiceTaskCategoriesPost"></a>
# **apiV2ProjectsServiceTaskCategoriesPost**
> TaskCategoryDto apiV2ProjectsServiceTaskCategoriesPost(tenantId, apiVersion, xApiVersion, taskCategoryCreateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaskCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    TaskCategoriesApi apiInstance = new TaskCategoriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TaskCategoryCreateDto taskCategoryCreateDto = new TaskCategoryCreateDto(); // TaskCategoryCreateDto | 
    try {
      TaskCategoryDto result = apiInstance.apiV2ProjectsServiceTaskCategoriesPost(tenantId, apiVersion, xApiVersion, taskCategoryCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskCategoriesApi#apiV2ProjectsServiceTaskCategoriesPost");
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
| **taskCategoryCreateDto** | [**TaskCategoryCreateDto**](TaskCategoryCreateDto.md)|  | [optional] |

### Return type

[**TaskCategoryDto**](TaskCategoryDto.md)

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

<a id="apiV2ProjectsServiceTaskCategoriesTaskCategoryIdDelete"></a>
# **apiV2ProjectsServiceTaskCategoriesTaskCategoryIdDelete**
> TaskCategoryDto apiV2ProjectsServiceTaskCategoriesTaskCategoryIdDelete(taskCategoryId, tenantId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaskCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    TaskCategoriesApi apiInstance = new TaskCategoriesApi(defaultClient);
    UUID taskCategoryId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TaskCategoryDto result = apiInstance.apiV2ProjectsServiceTaskCategoriesTaskCategoryIdDelete(taskCategoryId, tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskCategoriesApi#apiV2ProjectsServiceTaskCategoriesTaskCategoryIdDelete");
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
| **taskCategoryId** | **UUID**|  | |
| **tenantId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**TaskCategoryDto**](TaskCategoryDto.md)

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

<a id="apiV2ProjectsServiceTaskCategoriesTaskCategoryIdGet"></a>
# **apiV2ProjectsServiceTaskCategoriesTaskCategoryIdGet**
> TaskCategoryDto apiV2ProjectsServiceTaskCategoriesTaskCategoryIdGet(taskCategoryId, tenantId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaskCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    TaskCategoriesApi apiInstance = new TaskCategoriesApi(defaultClient);
    UUID taskCategoryId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TaskCategoryDto result = apiInstance.apiV2ProjectsServiceTaskCategoriesTaskCategoryIdGet(taskCategoryId, tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskCategoriesApi#apiV2ProjectsServiceTaskCategoriesTaskCategoryIdGet");
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
| **taskCategoryId** | **UUID**|  | |
| **tenantId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**TaskCategoryDto**](TaskCategoryDto.md)

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

<a id="apiV2ProjectsServiceTaskCategoriesTaskCategoryIdPut"></a>
# **apiV2ProjectsServiceTaskCategoriesTaskCategoryIdPut**
> TaskCategoryDto apiV2ProjectsServiceTaskCategoriesTaskCategoryIdPut(taskCategoryId, tenantId, apiVersion, xApiVersion, taskCategoryUpdateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaskCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    TaskCategoriesApi apiInstance = new TaskCategoriesApi(defaultClient);
    UUID taskCategoryId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TaskCategoryUpdateDto taskCategoryUpdateDto = new TaskCategoryUpdateDto(); // TaskCategoryUpdateDto | 
    try {
      TaskCategoryDto result = apiInstance.apiV2ProjectsServiceTaskCategoriesTaskCategoryIdPut(taskCategoryId, tenantId, apiVersion, xApiVersion, taskCategoryUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskCategoriesApi#apiV2ProjectsServiceTaskCategoriesTaskCategoryIdPut");
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
| **taskCategoryId** | **UUID**|  | |
| **tenantId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **taskCategoryUpdateDto** | [**TaskCategoryUpdateDto**](TaskCategoryUpdateDto.md)|  | [optional] |

### Return type

[**TaskCategoryDto**](TaskCategoryDto.md)

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

<a id="apiV2ProjectsServiceTaskCategoriesTaskCategoryIdTypesGet"></a>
# **apiV2ProjectsServiceTaskCategoriesTaskCategoryIdTypesGet**
> TaskCategoryDto apiV2ProjectsServiceTaskCategoriesTaskCategoryIdTypesGet(taskCategoryId, tenantId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaskCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    TaskCategoriesApi apiInstance = new TaskCategoriesApi(defaultClient);
    UUID taskCategoryId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TaskCategoryDto result = apiInstance.apiV2ProjectsServiceTaskCategoriesTaskCategoryIdTypesGet(taskCategoryId, tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskCategoriesApi#apiV2ProjectsServiceTaskCategoriesTaskCategoryIdTypesGet");
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
| **taskCategoryId** | **UUID**|  | |
| **tenantId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**TaskCategoryDto**](TaskCategoryDto.md)

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

