# TaskTypesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTaskTypeAsync**](TaskTypesApi.md#createTaskTypeAsync) | **POST** /api/v2/ProjectsService/TaskTypes | Creates a new task type |
| [**deleteTaskTypeAsync**](TaskTypesApi.md#deleteTaskTypeAsync) | **DELETE** /api/v2/ProjectsService/TaskTypes/{taskTypeId} | Deletes a task type |
| [**getTaskTypeByIdAsync**](TaskTypesApi.md#getTaskTypeByIdAsync) | **GET** /api/v2/ProjectsService/TaskTypes/{taskTypeId} | Gets a task type by ID |
| [**updateTaskTypeAsync**](TaskTypesApi.md#updateTaskTypeAsync) | **PUT** /api/v2/ProjectsService/TaskTypes/{taskTypeId} | Updates a task type |


<a id="createTaskTypeAsync"></a>
# **createTaskTypeAsync**
> TaskTypeDto createTaskTypeAsync(tenantId, taskTypeCreateDto)

Creates a new task type

Creates a new task type for the current tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaskTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TaskTypesApi apiInstance = new TaskTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    TaskTypeCreateDto taskTypeCreateDto = new TaskTypeCreateDto(); // TaskTypeCreateDto | 
    try {
      TaskTypeDto result = apiInstance.createTaskTypeAsync(tenantId, taskTypeCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskTypesApi#createTaskTypeAsync");
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
| **taskTypeCreateDto** | [**TaskTypeCreateDto**](TaskTypeCreateDto.md)|  | [optional] |

### Return type

[**TaskTypeDto**](TaskTypeDto.md)

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

<a id="deleteTaskTypeAsync"></a>
# **deleteTaskTypeAsync**
> TaskTypeDto deleteTaskTypeAsync(taskTypeId, tenantId)

Deletes a task type

Deletes the specified task type.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaskTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TaskTypesApi apiInstance = new TaskTypesApi(defaultClient);
    UUID taskTypeId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      TaskTypeDto result = apiInstance.deleteTaskTypeAsync(taskTypeId, tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskTypesApi#deleteTaskTypeAsync");
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

### Return type

[**TaskTypeDto**](TaskTypeDto.md)

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

<a id="getTaskTypeByIdAsync"></a>
# **getTaskTypeByIdAsync**
> TaskTypeDto getTaskTypeByIdAsync(taskTypeId, tenantId)

Gets a task type by ID

Retrieves the details of a task type using its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaskTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TaskTypesApi apiInstance = new TaskTypesApi(defaultClient);
    UUID taskTypeId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      TaskTypeDto result = apiInstance.getTaskTypeByIdAsync(taskTypeId, tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskTypesApi#getTaskTypeByIdAsync");
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

### Return type

[**TaskTypeDto**](TaskTypeDto.md)

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

<a id="updateTaskTypeAsync"></a>
# **updateTaskTypeAsync**
> TaskTypeDto updateTaskTypeAsync(taskTypeId, tenantId, taskTypeUpdateDto)

Updates a task type

Updates the specified task type.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaskTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TaskTypesApi apiInstance = new TaskTypesApi(defaultClient);
    UUID taskTypeId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    TaskTypeUpdateDto taskTypeUpdateDto = new TaskTypeUpdateDto(); // TaskTypeUpdateDto | 
    try {
      TaskTypeDto result = apiInstance.updateTaskTypeAsync(taskTypeId, tenantId, taskTypeUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskTypesApi#updateTaskTypeAsync");
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
| **taskTypeUpdateDto** | [**TaskTypeUpdateDto**](TaskTypeUpdateDto.md)|  | [optional] |

### Return type

[**TaskTypeDto**](TaskTypeDto.md)

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

