# TimeLogsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**countProjectPeriodTimeLogsAsync**](TimeLogsApi.md#countProjectPeriodTimeLogsAsync) | **GET** /api/v2/ProjectsService/TimeLogs/Count | Get the count of project period time logs |
| [**createProjectTimeLogAsync**](TimeLogsApi.md#createProjectTimeLogAsync) | **POST** /api/v2/ProjectsService/TimeLogs | Create a new project time log |
| [**deleteProjectTimeLogAsync**](TimeLogsApi.md#deleteProjectTimeLogAsync) | **DELETE** /api/v2/ProjectsService/TimeLogs/{timeLogId} | Delete a project time log |
| [**getProjectPeriodTimeLogsAsync**](TimeLogsApi.md#getProjectPeriodTimeLogsAsync) | **GET** /api/v2/ProjectsService/TimeLogs | Retrieve project period time logs |
| [**getProjectTimeLogByIdAsync**](TimeLogsApi.md#getProjectTimeLogByIdAsync) | **GET** /api/v2/ProjectsService/TimeLogs/{timeLogId} | Retrieve a project time log by ID |
| [**getProjectTimeLogsAsync**](TimeLogsApi.md#getProjectTimeLogsAsync) | **GET** /api/v2/ProjectsService/TimeLogs/ForProject/{projectId} | Retrieve time logs for a project |
| [**getProjectTimeLogsByResponsibleContactAsync**](TimeLogsApi.md#getProjectTimeLogsByResponsibleContactAsync) | **GET** /api/v2/ProjectsService/TimeLogs/ByResponsibleContact | Retrieve time logs by responsible contact |
| [**getProjectTimeLogsCreatedByContactAsync**](TimeLogsApi.md#getProjectTimeLogsCreatedByContactAsync) | **GET** /api/v2/ProjectsService/TimeLogs/CreatedByContact | Retrieve time logs created by a contact |
| [**patchProjectTimeLogAsync**](TimeLogsApi.md#patchProjectTimeLogAsync) | **PATCH** /api/v2/ProjectsService/TimeLogs/{timeLogId} | Patch a project time log |
| [**updateProjectTimeLogAsync**](TimeLogsApi.md#updateProjectTimeLogAsync) | **PUT** /api/v2/ProjectsService/TimeLogs/{timeLogId} | Update a project time log |


<a id="countProjectPeriodTimeLogsAsync"></a>
# **countProjectPeriodTimeLogsAsync**
> Int32Envelope countProjectPeriodTimeLogsAsync(tenantId, projectPeriodId, apiVersion, xApiVersion)

Get the count of project period time logs

Returns the total count of time logs for a specific project period with OData query support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimeLogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TimeLogsApi apiInstance = new TimeLogsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID projectPeriodId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.countProjectPeriodTimeLogsAsync(tenantId, projectPeriodId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeLogsApi#countProjectPeriodTimeLogsAsync");
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

<a id="createProjectTimeLogAsync"></a>
# **createProjectTimeLogAsync**
> createProjectTimeLogAsync(tenantId, apiVersion, xApiVersion, projectTimeLogCreateDto)

Create a new project time log

Creates a new project time log entry.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimeLogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TimeLogsApi apiInstance = new TimeLogsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ProjectTimeLogCreateDto projectTimeLogCreateDto = new ProjectTimeLogCreateDto(); // ProjectTimeLogCreateDto | 
    try {
      apiInstance.createProjectTimeLogAsync(tenantId, apiVersion, xApiVersion, projectTimeLogCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeLogsApi#createProjectTimeLogAsync");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="deleteProjectTimeLogAsync"></a>
# **deleteProjectTimeLogAsync**
> deleteProjectTimeLogAsync(tenantId, timeLogId, apiVersion, xApiVersion)

Delete a project time log

Deletes a project time log entry.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimeLogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TimeLogsApi apiInstance = new TimeLogsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID timeLogId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteProjectTimeLogAsync(tenantId, timeLogId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeLogsApi#deleteProjectTimeLogAsync");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="getProjectPeriodTimeLogsAsync"></a>
# **getProjectPeriodTimeLogsAsync**
> ProjectTimeLogDtoListEnvelope getProjectPeriodTimeLogsAsync(tenantId, projectPeriodId, apiVersion, xApiVersion)

Retrieve project period time logs

Retrieves a list of time logs for a specific project period with OData query support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimeLogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TimeLogsApi apiInstance = new TimeLogsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID projectPeriodId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ProjectTimeLogDtoListEnvelope result = apiInstance.getProjectPeriodTimeLogsAsync(tenantId, projectPeriodId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeLogsApi#getProjectPeriodTimeLogsAsync");
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

<a id="getProjectTimeLogByIdAsync"></a>
# **getProjectTimeLogByIdAsync**
> ProjectTimeLogDtoEnvelope getProjectTimeLogByIdAsync(timeLogId, tenantId, apiVersion, xApiVersion)

Retrieve a project time log by ID

Retrieves a single project time log by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimeLogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TimeLogsApi apiInstance = new TimeLogsApi(defaultClient);
    UUID timeLogId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ProjectTimeLogDtoEnvelope result = apiInstance.getProjectTimeLogByIdAsync(timeLogId, tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeLogsApi#getProjectTimeLogByIdAsync");
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
> ProjectTimeLogDtoListEnvelope getProjectTimeLogsAsync(projectId, tenantId, apiVersion, xApiVersion)

Retrieve time logs for a project

Retrieves all time logs associated with the specified project.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimeLogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TimeLogsApi apiInstance = new TimeLogsApi(defaultClient);
    UUID projectId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ProjectTimeLogDtoListEnvelope result = apiInstance.getProjectTimeLogsAsync(projectId, tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeLogsApi#getProjectTimeLogsAsync");
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

<a id="getProjectTimeLogsByResponsibleContactAsync"></a>
# **getProjectTimeLogsByResponsibleContactAsync**
> ProjectTimeLogDtoListEnvelope getProjectTimeLogsByResponsibleContactAsync(contactId, tenantId, apiVersion, xApiVersion)

Retrieve time logs by responsible contact

Retrieves time logs where the specified contact is the responsible party.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimeLogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TimeLogsApi apiInstance = new TimeLogsApi(defaultClient);
    UUID contactId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ProjectTimeLogDtoListEnvelope result = apiInstance.getProjectTimeLogsByResponsibleContactAsync(contactId, tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeLogsApi#getProjectTimeLogsByResponsibleContactAsync");
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

<a id="getProjectTimeLogsCreatedByContactAsync"></a>
# **getProjectTimeLogsCreatedByContactAsync**
> ProjectTimeLogDtoListEnvelope getProjectTimeLogsCreatedByContactAsync(contactId, tenantId, apiVersion, xApiVersion)

Retrieve time logs created by a contact

Retrieves time logs that were created by the specified contact.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimeLogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TimeLogsApi apiInstance = new TimeLogsApi(defaultClient);
    UUID contactId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ProjectTimeLogDtoListEnvelope result = apiInstance.getProjectTimeLogsCreatedByContactAsync(contactId, tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeLogsApi#getProjectTimeLogsCreatedByContactAsync");
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

<a id="patchProjectTimeLogAsync"></a>
# **patchProjectTimeLogAsync**
> patchProjectTimeLogAsync(timeLogId, tenantId, apiVersion, xApiVersion, operation)

Patch a project time log

Partially updates an existing project time log entry.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimeLogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TimeLogsApi apiInstance = new TimeLogsApi(defaultClient);
    UUID timeLogId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    List<Operation> operation = Arrays.asList(); // List<Operation> | 
    try {
      apiInstance.patchProjectTimeLogAsync(timeLogId, tenantId, apiVersion, xApiVersion, operation);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeLogsApi#patchProjectTimeLogAsync");
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
| **operation** | [**List&lt;Operation&gt;**](Operation.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="updateProjectTimeLogAsync"></a>
# **updateProjectTimeLogAsync**
> updateProjectTimeLogAsync(timeLogId, tenantId, apiVersion, xApiVersion, projectTimeLogUpdateDto)

Update a project time log

Updates an existing project time log entry.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimeLogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TimeLogsApi apiInstance = new TimeLogsApi(defaultClient);
    UUID timeLogId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ProjectTimeLogUpdateDto projectTimeLogUpdateDto = new ProjectTimeLogUpdateDto(); // ProjectTimeLogUpdateDto | 
    try {
      apiInstance.updateProjectTimeLogAsync(timeLogId, tenantId, apiVersion, xApiVersion, projectTimeLogUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeLogsApi#updateProjectTimeLogAsync");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

