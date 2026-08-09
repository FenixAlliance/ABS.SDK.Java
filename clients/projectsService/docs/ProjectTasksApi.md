# ProjectTasksApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createProjectTaskAsync**](ProjectTasksApi.md#createProjectTaskAsync) | **POST** /api/v2/ProjectsService/ProjectTasks | Create a project task |
| [**deleteProjectTaskAsync**](ProjectTasksApi.md#deleteProjectTaskAsync) | **DELETE** /api/v2/ProjectsService/ProjectTasks/{projectTaskId} | Delete a project task |
| [**getProjectTaskByIdAsync**](ProjectTasksApi.md#getProjectTaskByIdAsync) | **GET** /api/v2/ProjectsService/ProjectTasks/{projectTaskId} | Get project task by ID |
| [**getProjectTasksAsync**](ProjectTasksApi.md#getProjectTasksAsync) | **GET** /api/v2/ProjectsService/ProjectTasks | Get all project tasks |
| [**getProjectTasksCountAsync**](ProjectTasksApi.md#getProjectTasksCountAsync) | **GET** /api/v2/ProjectsService/ProjectTasks/Count | Get project tasks count |
| [**patchProjectTaskAsync**](ProjectTasksApi.md#patchProjectTaskAsync) | **PATCH** /api/v2/ProjectsService/ProjectTasks/{projectTaskId} | Patch a project task |
| [**updateProjectTaskAsync**](ProjectTasksApi.md#updateProjectTaskAsync) | **PUT** /api/v2/ProjectsService/ProjectTasks/{projectTaskId} | Update a project task |


<a id="createProjectTaskAsync"></a>
# **createProjectTaskAsync**
> EmptyEnvelope createProjectTaskAsync(tenantId, apiVersion, xApiVersion, projectTaskCreateDto)

Create a project task

Creates a new project task.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectTasksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ProjectTasksApi apiInstance = new ProjectTasksApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ProjectTaskCreateDto projectTaskCreateDto = new ProjectTaskCreateDto(); // ProjectTaskCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createProjectTaskAsync(tenantId, apiVersion, xApiVersion, projectTaskCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectTasksApi#createProjectTaskAsync");
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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

<a id="deleteProjectTaskAsync"></a>
# **deleteProjectTaskAsync**
> EmptyEnvelope deleteProjectTaskAsync(tenantId, projectTaskId, apiVersion, xApiVersion)

Delete a project task

Deletes a project task.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectTasksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ProjectTasksApi apiInstance = new ProjectTasksApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID projectTaskId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteProjectTaskAsync(tenantId, projectTaskId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectTasksApi#deleteProjectTaskAsync");
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
| **projectTaskId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

<a id="getProjectTaskByIdAsync"></a>
# **getProjectTaskByIdAsync**
> ProjectTaskDtoEnvelope getProjectTaskByIdAsync(tenantId, projectTaskId, apiVersion, xApiVersion)

Get project task by ID

Retrieves a specific project task.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectTasksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ProjectTasksApi apiInstance = new ProjectTasksApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID projectTaskId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ProjectTaskDtoEnvelope result = apiInstance.getProjectTaskByIdAsync(tenantId, projectTaskId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectTasksApi#getProjectTaskByIdAsync");
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
| **projectTaskId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ProjectTaskDtoEnvelope**](ProjectTaskDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getProjectTasksAsync"></a>
# **getProjectTasksAsync**
> ProjectTaskDtoListEnvelope getProjectTasksAsync(tenantId, apiVersion, xApiVersion, projectTaskDtoCollectionQueryParameters)

Get all project tasks

Retrieves all project tasks for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectTasksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ProjectTasksApi apiInstance = new ProjectTasksApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ProjectTaskDtoCollectionQueryParameters projectTaskDtoCollectionQueryParameters = new ProjectTaskDtoCollectionQueryParameters(); // ProjectTaskDtoCollectionQueryParameters | 
    try {
      ProjectTaskDtoListEnvelope result = apiInstance.getProjectTasksAsync(tenantId, apiVersion, xApiVersion, projectTaskDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectTasksApi#getProjectTasksAsync");
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
| **projectTaskDtoCollectionQueryParameters** | [**ProjectTaskDtoCollectionQueryParameters**](ProjectTaskDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**ProjectTaskDtoListEnvelope**](ProjectTaskDtoListEnvelope.md)

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

<a id="getProjectTasksCountAsync"></a>
# **getProjectTasksCountAsync**
> Int32Envelope getProjectTasksCountAsync(tenantId, apiVersion, xApiVersion, projectTaskDtoCollectionQueryParameters)

Get project tasks count

Returns the count of project tasks for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectTasksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ProjectTasksApi apiInstance = new ProjectTasksApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ProjectTaskDtoCollectionQueryParameters projectTaskDtoCollectionQueryParameters = new ProjectTaskDtoCollectionQueryParameters(); // ProjectTaskDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getProjectTasksCountAsync(tenantId, apiVersion, xApiVersion, projectTaskDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectTasksApi#getProjectTasksCountAsync");
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
| **projectTaskDtoCollectionQueryParameters** | [**ProjectTaskDtoCollectionQueryParameters**](ProjectTaskDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="patchProjectTaskAsync"></a>
# **patchProjectTaskAsync**
> EmptyEnvelope patchProjectTaskAsync(tenantId, projectTaskId, apiVersion, xApiVersion, patchOperation)

Patch a project task

Partially updates an existing project task.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectTasksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ProjectTasksApi apiInstance = new ProjectTasksApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID projectTaskId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    List<PatchOperation> patchOperation = Arrays.asList(); // List<PatchOperation> | 
    try {
      EmptyEnvelope result = apiInstance.patchProjectTaskAsync(tenantId, projectTaskId, apiVersion, xApiVersion, patchOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectTasksApi#patchProjectTaskAsync");
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
| **projectTaskId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **patchOperation** | [**List&lt;PatchOperation&gt;**](PatchOperation.md)|  | [optional] |

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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

<a id="updateProjectTaskAsync"></a>
# **updateProjectTaskAsync**
> EmptyEnvelope updateProjectTaskAsync(tenantId, projectTaskId, apiVersion, xApiVersion, projectTaskUpdateDto)

Update a project task

Updates an existing project task.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectTasksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ProjectTasksApi apiInstance = new ProjectTasksApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID projectTaskId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ProjectTaskUpdateDto projectTaskUpdateDto = new ProjectTaskUpdateDto(); // ProjectTaskUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateProjectTaskAsync(tenantId, projectTaskId, apiVersion, xApiVersion, projectTaskUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectTasksApi#updateProjectTaskAsync");
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
| **projectTaskId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

