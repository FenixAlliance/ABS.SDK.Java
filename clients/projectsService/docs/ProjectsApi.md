# ProjectsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createProjectAsync**](ProjectsApi.md#createProjectAsync) | **POST** /api/v2/ProjectsService/Projects | Creates a new project |
| [**createProjectPeriodAsync**](ProjectsApi.md#createProjectPeriodAsync) | **POST** /api/v2/ProjectsService/Projects/{projectId}/Periods | Creates a project period |
| [**createProjectTaskAsync**](ProjectsApi.md#createProjectTaskAsync) | **POST** /api/v2/ProjectsService/Projects/{projectId}/Tasks | Creates a project task |
| [**deleteProjectAsync**](ProjectsApi.md#deleteProjectAsync) | **DELETE** /api/v2/ProjectsService/Projects/{projectId} | Deletes a project |
| [**deleteProjectPeriodAsync**](ProjectsApi.md#deleteProjectPeriodAsync) | **DELETE** /api/v2/ProjectsService/Projects/{projectId}/Periods/{projectPeriodId} | Deletes a project period |
| [**deleteProjectTaskAsync**](ProjectsApi.md#deleteProjectTaskAsync) | **DELETE** /api/v2/ProjectsService/Projects/{projectId}/Tasks/{projectTaskId} | Deletes a project task |
| [**getProjectByIdAsync**](ProjectsApi.md#getProjectByIdAsync) | **GET** /api/v2/ProjectsService/Projects/{projectId} | Gets a project by ID |
| [**getProjectPeriodsAsync**](ProjectsApi.md#getProjectPeriodsAsync) | **GET** /api/v2/ProjectsService/Projects/{projectId}/Periods | Retrieves project periods |
| [**getProjectTaskCategoriesAsync**](ProjectsApi.md#getProjectTaskCategoriesAsync) | **GET** /api/v2/ProjectsService/Projects/{projectId}/TaskCategories | Retrieves project task categories |
| [**getProjectTaskCategoriesCountAsync**](ProjectsApi.md#getProjectTaskCategoriesCountAsync) | **GET** /api/v2/ProjectsService/Projects/{projectId}/TaskCategories/Count | Counts project task categories |
| [**getProjectTasksAsync**](ProjectsApi.md#getProjectTasksAsync) | **GET** /api/v2/ProjectsService/Projects/{projectId}/Tasks | Retrieves project tasks |
| [**getProjectTasksCountAsync**](ProjectsApi.md#getProjectTasksCountAsync) | **GET** /api/v2/ProjectsService/Projects/{projectId}/Tasks/Count | Counts project tasks |
| [**getProjectTimeLogsAsync**](ProjectsApi.md#getProjectTimeLogsAsync) | **GET** /api/v2/ProjectsService/Projects/{projectId}/TimeLogs | Retrieves project time logs |
| [**getProjectTimeLogsCountAsync**](ProjectsApi.md#getProjectTimeLogsCountAsync) | **GET** /api/v2/ProjectsService/Projects/{projectId}/TimeLogs/Count | Counts project time logs |
| [**getProjectsByTenantIdAsync**](ProjectsApi.md#getProjectsByTenantIdAsync) | **GET** /api/v2/ProjectsService/Projects | Retrieves all projects |
| [**getProjectsCountByTenantIdAsync**](ProjectsApi.md#getProjectsCountByTenantIdAsync) | **GET** /api/v2/ProjectsService/Projects/Count | Counts projects |
| [**updateProjectAsync**](ProjectsApi.md#updateProjectAsync) | **PUT** /api/v2/ProjectsService/Projects/{projectId} | Updates a project |
| [**updateProjectPeriodAsync**](ProjectsApi.md#updateProjectPeriodAsync) | **PUT** /api/v2/ProjectsService/Projects/{projectId}/Periods/{projectPeriodId} | Updates a project period |
| [**updateProjectTaskAsync**](ProjectsApi.md#updateProjectTaskAsync) | **PUT** /api/v2/ProjectsService/Projects/{projectId}/Tasks/{projectTaskId} | Updates a project task |


<a id="createProjectAsync"></a>
# **createProjectAsync**
> EmptyEnvelope createProjectAsync(tenantId, projectCreateDto)

Creates a new project

Creates a new project for the current tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    ProjectCreateDto projectCreateDto = new ProjectCreateDto(); // ProjectCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createProjectAsync(tenantId, projectCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#createProjectAsync");
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
| **projectCreateDto** | [**ProjectCreateDto**](ProjectCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

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

<a id="createProjectPeriodAsync"></a>
# **createProjectPeriodAsync**
> EmptyEnvelope createProjectPeriodAsync(projectId, tenantId, projectPeriodCreateDto)

Creates a project period

Creates a new period for the specified project.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    UUID projectId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    ProjectPeriodCreateDto projectPeriodCreateDto = new ProjectPeriodCreateDto(); // ProjectPeriodCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createProjectPeriodAsync(projectId, tenantId, projectPeriodCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#createProjectPeriodAsync");
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
| **projectPeriodCreateDto** | [**ProjectPeriodCreateDto**](ProjectPeriodCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

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

<a id="createProjectTaskAsync"></a>
# **createProjectTaskAsync**
> EmptyEnvelope createProjectTaskAsync(projectId, tenantId, projectTaskCreateDto)

Creates a project task

Creates a new task for the specified project.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    UUID projectId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    ProjectTaskCreateDto projectTaskCreateDto = new ProjectTaskCreateDto(); // ProjectTaskCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createProjectTaskAsync(projectId, tenantId, projectTaskCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#createProjectTaskAsync");
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
| **projectTaskCreateDto** | [**ProjectTaskCreateDto**](ProjectTaskCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

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

<a id="deleteProjectAsync"></a>
# **deleteProjectAsync**
> EmptyEnvelope deleteProjectAsync(projectId, tenantId)

Deletes a project

Deletes the specified project.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    UUID projectId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.deleteProjectAsync(projectId, tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#deleteProjectAsync");
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

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

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

<a id="deleteProjectPeriodAsync"></a>
# **deleteProjectPeriodAsync**
> EmptyEnvelope deleteProjectPeriodAsync(projectId, projectPeriodId, tenantId)

Deletes a project period

Deletes the specified period from a project.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    UUID projectId = UUID.randomUUID(); // UUID | 
    UUID projectPeriodId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.deleteProjectPeriodAsync(projectId, projectPeriodId, tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#deleteProjectPeriodAsync");
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
| **projectPeriodId** | **UUID**|  | |
| **tenantId** | **UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

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

<a id="deleteProjectTaskAsync"></a>
# **deleteProjectTaskAsync**
> EmptyEnvelope deleteProjectTaskAsync(tenantId, projectId, projectTaskId)

Deletes a project task

Deletes the specified task from a project.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID projectId = UUID.randomUUID(); // UUID | 
    UUID projectTaskId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.deleteProjectTaskAsync(tenantId, projectId, projectTaskId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#deleteProjectTaskAsync");
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
| **projectId** | **UUID**|  | |
| **projectTaskId** | **UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

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

<a id="getProjectByIdAsync"></a>
# **getProjectByIdAsync**
> ProjectDtoEnvelope getProjectByIdAsync(projectId, tenantId)

Gets a project by ID

Retrieves the details of a project using its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    UUID projectId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      ProjectDtoEnvelope result = apiInstance.getProjectByIdAsync(projectId, tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getProjectByIdAsync");
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

### Return type

[**ProjectDtoEnvelope**](ProjectDtoEnvelope.md)

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

<a id="getProjectPeriodsAsync"></a>
# **getProjectPeriodsAsync**
> ProjectPeriodDtoListEnvelope getProjectPeriodsAsync(projectId, tenantId)

Retrieves project periods

Gets all periods for a specific project.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    UUID projectId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      ProjectPeriodDtoListEnvelope result = apiInstance.getProjectPeriodsAsync(projectId, tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getProjectPeriodsAsync");
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

### Return type

[**ProjectPeriodDtoListEnvelope**](ProjectPeriodDtoListEnvelope.md)

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

<a id="getProjectTaskCategoriesAsync"></a>
# **getProjectTaskCategoriesAsync**
> TaskCategoryDtoListEnvelope getProjectTaskCategoriesAsync(projectId, tenantId)

Retrieves project task categories

Gets all task categories for a specific project with OData support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    UUID projectId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      TaskCategoryDtoListEnvelope result = apiInstance.getProjectTaskCategoriesAsync(projectId, tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getProjectTaskCategoriesAsync");
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

<a id="getProjectTaskCategoriesCountAsync"></a>
# **getProjectTaskCategoriesCountAsync**
> Int32Envelope getProjectTaskCategoriesCountAsync(projectId, tenantId)

Counts project task categories

Gets the count of task categories for a specific project.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    UUID projectId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.getProjectTaskCategoriesCountAsync(projectId, tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getProjectTaskCategoriesCountAsync");
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

<a id="getProjectTasksAsync"></a>
# **getProjectTasksAsync**
> ProjectTaskDtoListEnvelope getProjectTasksAsync(projectId, tenantId)

Retrieves project tasks

Gets all tasks for a specific project with OData support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    UUID projectId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      ProjectTaskDtoListEnvelope result = apiInstance.getProjectTasksAsync(projectId, tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getProjectTasksAsync");
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

### Return type

[**ProjectTaskDtoListEnvelope**](ProjectTaskDtoListEnvelope.md)

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

<a id="getProjectTasksCountAsync"></a>
# **getProjectTasksCountAsync**
> Int32Envelope getProjectTasksCountAsync(projectId, tenantId)

Counts project tasks

Gets the count of tasks for a specific project.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    UUID projectId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.getProjectTasksCountAsync(projectId, tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getProjectTasksCountAsync");
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

<a id="getProjectTimeLogsAsync"></a>
# **getProjectTimeLogsAsync**
> ProjectTimeLogDtoListEnvelope getProjectTimeLogsAsync(projectId, tenantId)

Retrieves project time logs

Gets all time log entries for a specific project with OData support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    UUID projectId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      ProjectTimeLogDtoListEnvelope result = apiInstance.getProjectTimeLogsAsync(projectId, tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getProjectTimeLogsAsync");
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

### Return type

[**ProjectTimeLogDtoListEnvelope**](ProjectTimeLogDtoListEnvelope.md)

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

<a id="getProjectTimeLogsCountAsync"></a>
# **getProjectTimeLogsCountAsync**
> Int32Envelope getProjectTimeLogsCountAsync(projectId, tenantId)

Counts project time logs

Gets the count of time log entries for a specific project.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    UUID projectId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.getProjectTimeLogsCountAsync(projectId, tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getProjectTimeLogsCountAsync");
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

<a id="getProjectsByTenantIdAsync"></a>
# **getProjectsByTenantIdAsync**
> ProjectDtoListEnvelope getProjectsByTenantIdAsync(tenantId)

Retrieves all projects

Gets all projects for the current tenant with OData support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      ProjectDtoListEnvelope result = apiInstance.getProjectsByTenantIdAsync(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getProjectsByTenantIdAsync");
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

[**ProjectDtoListEnvelope**](ProjectDtoListEnvelope.md)

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

<a id="getProjectsCountByTenantIdAsync"></a>
# **getProjectsCountByTenantIdAsync**
> Int32Envelope getProjectsCountByTenantIdAsync(tenantId)

Counts projects

Gets the count of projects for the current tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.getProjectsCountByTenantIdAsync(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getProjectsCountByTenantIdAsync");
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

<a id="updateProjectAsync"></a>
# **updateProjectAsync**
> EmptyEnvelope updateProjectAsync(projectId, tenantId, projectUpdateDto)

Updates a project

Updates the specified project.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    UUID projectId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    ProjectUpdateDto projectUpdateDto = new ProjectUpdateDto(); // ProjectUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateProjectAsync(projectId, tenantId, projectUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#updateProjectAsync");
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
| **projectUpdateDto** | [**ProjectUpdateDto**](ProjectUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

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

<a id="updateProjectPeriodAsync"></a>
# **updateProjectPeriodAsync**
> EmptyEnvelope updateProjectPeriodAsync(projectId, projectPeriodId, tenantId, projectPeriodUpdateDto)

Updates a project period

Updates the specified period for a project.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    UUID projectId = UUID.randomUUID(); // UUID | 
    UUID projectPeriodId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    ProjectPeriodUpdateDto projectPeriodUpdateDto = new ProjectPeriodUpdateDto(); // ProjectPeriodUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateProjectPeriodAsync(projectId, projectPeriodId, tenantId, projectPeriodUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#updateProjectPeriodAsync");
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
| **projectPeriodId** | **UUID**|  | |
| **tenantId** | **UUID**|  | |
| **projectPeriodUpdateDto** | [**ProjectPeriodUpdateDto**](ProjectPeriodUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

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

<a id="updateProjectTaskAsync"></a>
# **updateProjectTaskAsync**
> EmptyEnvelope updateProjectTaskAsync(projectId, projectTaskId, tenantId, projectTaskUpdateDto)

Updates a project task

Updates the specified task in a project.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    UUID projectId = UUID.randomUUID(); // UUID | 
    UUID projectTaskId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    ProjectTaskUpdateDto projectTaskUpdateDto = new ProjectTaskUpdateDto(); // ProjectTaskUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateProjectTaskAsync(projectId, projectTaskId, tenantId, projectTaskUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#updateProjectTaskAsync");
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
| **projectTaskId** | **UUID**|  | |
| **tenantId** | **UUID**|  | |
| **projectTaskUpdateDto** | [**ProjectTaskUpdateDto**](ProjectTaskUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

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

