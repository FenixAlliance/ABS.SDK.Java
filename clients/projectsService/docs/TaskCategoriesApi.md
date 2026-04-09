# TaskCategoriesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**countTenantTaskCategoriesAsync**](TaskCategoriesApi.md#countTenantTaskCategoriesAsync) | **GET** /api/v2/ProjectsService/TaskCategories/Count | Counts task categories |
| [**createTaskCategoryAsync**](TaskCategoriesApi.md#createTaskCategoryAsync) | **POST** /api/v2/ProjectsService/TaskCategories | Creates a new task category |
| [**deleteTaskCategoryAsync**](TaskCategoriesApi.md#deleteTaskCategoryAsync) | **DELETE** /api/v2/ProjectsService/TaskCategories/{taskCategoryId} | Deletes a task category |
| [**getTaskCategoryByIdAsync**](TaskCategoriesApi.md#getTaskCategoryByIdAsync) | **GET** /api/v2/ProjectsService/TaskCategories/{taskCategoryId} | Gets a task category by ID |
| [**getTaskCategoryTaskTypesAsync**](TaskCategoriesApi.md#getTaskCategoryTaskTypesAsync) | **GET** /api/v2/ProjectsService/TaskCategories/{taskCategoryId}/Types | Retrieves task types for a category |
| [**getTenantTaskCategoriesAsync**](TaskCategoriesApi.md#getTenantTaskCategoriesAsync) | **GET** /api/v2/ProjectsService/TaskCategories | Retrieves all task categories |
| [**updateTaskCategoryAsync**](TaskCategoriesApi.md#updateTaskCategoryAsync) | **PUT** /api/v2/ProjectsService/TaskCategories/{taskCategoryId} | Updates a task category |


<a id="countTenantTaskCategoriesAsync"></a>
# **countTenantTaskCategoriesAsync**
> Int32Envelope countTenantTaskCategoriesAsync(tenantId)

Counts task categories

Gets the count of task categories for the current tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaskCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TaskCategoriesApi apiInstance = new TaskCategoriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.countTenantTaskCategoriesAsync(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskCategoriesApi#countTenantTaskCategoriesAsync");
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

<a id="createTaskCategoryAsync"></a>
# **createTaskCategoryAsync**
> TaskCategoryDto createTaskCategoryAsync(tenantId, taskCategoryCreateDto)

Creates a new task category

Creates a new task category for the current tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaskCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TaskCategoriesApi apiInstance = new TaskCategoriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    TaskCategoryCreateDto taskCategoryCreateDto = new TaskCategoryCreateDto(); // TaskCategoryCreateDto | 
    try {
      TaskCategoryDto result = apiInstance.createTaskCategoryAsync(tenantId, taskCategoryCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskCategoriesApi#createTaskCategoryAsync");
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
| **taskCategoryCreateDto** | [**TaskCategoryCreateDto**](TaskCategoryCreateDto.md)|  | [optional] |

### Return type

[**TaskCategoryDto**](TaskCategoryDto.md)

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

<a id="deleteTaskCategoryAsync"></a>
# **deleteTaskCategoryAsync**
> TaskCategoryDto deleteTaskCategoryAsync(taskCategoryId, tenantId)

Deletes a task category

Deletes the specified task category.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaskCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TaskCategoriesApi apiInstance = new TaskCategoriesApi(defaultClient);
    UUID taskCategoryId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      TaskCategoryDto result = apiInstance.deleteTaskCategoryAsync(taskCategoryId, tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskCategoriesApi#deleteTaskCategoryAsync");
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

### Return type

[**TaskCategoryDto**](TaskCategoryDto.md)

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

<a id="getTaskCategoryByIdAsync"></a>
# **getTaskCategoryByIdAsync**
> TaskCategoryDto getTaskCategoryByIdAsync(taskCategoryId, tenantId)

Gets a task category by ID

Retrieves the details of a task category using its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaskCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TaskCategoriesApi apiInstance = new TaskCategoriesApi(defaultClient);
    UUID taskCategoryId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      TaskCategoryDto result = apiInstance.getTaskCategoryByIdAsync(taskCategoryId, tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskCategoriesApi#getTaskCategoryByIdAsync");
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

### Return type

[**TaskCategoryDto**](TaskCategoryDto.md)

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

<a id="getTaskCategoryTaskTypesAsync"></a>
# **getTaskCategoryTaskTypesAsync**
> TaskCategoryDto getTaskCategoryTaskTypesAsync(taskCategoryId, tenantId)

Retrieves task types for a category

Gets all task types belonging to the specified task category.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaskCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TaskCategoriesApi apiInstance = new TaskCategoriesApi(defaultClient);
    UUID taskCategoryId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      TaskCategoryDto result = apiInstance.getTaskCategoryTaskTypesAsync(taskCategoryId, tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskCategoriesApi#getTaskCategoryTaskTypesAsync");
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

### Return type

[**TaskCategoryDto**](TaskCategoryDto.md)

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

<a id="getTenantTaskCategoriesAsync"></a>
# **getTenantTaskCategoriesAsync**
> TaskCategoryDtoListEnvelope getTenantTaskCategoriesAsync(tenantId)

Retrieves all task categories

Gets all task categories for the current tenant with OData support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaskCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TaskCategoriesApi apiInstance = new TaskCategoriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      TaskCategoryDtoListEnvelope result = apiInstance.getTenantTaskCategoriesAsync(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskCategoriesApi#getTenantTaskCategoriesAsync");
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

### Return type

[**TaskCategoryDtoListEnvelope**](TaskCategoryDtoListEnvelope.md)

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

<a id="updateTaskCategoryAsync"></a>
# **updateTaskCategoryAsync**
> TaskCategoryDto updateTaskCategoryAsync(taskCategoryId, tenantId, taskCategoryUpdateDto)

Updates a task category

Updates the specified task category.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaskCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TaskCategoriesApi apiInstance = new TaskCategoriesApi(defaultClient);
    UUID taskCategoryId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    TaskCategoryUpdateDto taskCategoryUpdateDto = new TaskCategoryUpdateDto(); // TaskCategoryUpdateDto | 
    try {
      TaskCategoryDto result = apiInstance.updateTaskCategoryAsync(taskCategoryId, tenantId, taskCategoryUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskCategoriesApi#updateTaskCategoryAsync");
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
| **taskCategoryUpdateDto** | [**TaskCategoryUpdateDto**](TaskCategoryUpdateDto.md)|  | [optional] |

### Return type

[**TaskCategoryDto**](TaskCategoryDto.md)

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

