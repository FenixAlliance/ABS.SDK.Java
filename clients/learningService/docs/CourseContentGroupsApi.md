# CourseContentGroupsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCourseContentGroupAsync**](CourseContentGroupsApi.md#createCourseContentGroupAsync) | **POST** /api/v2/LearningService/CourseContentGroups | Create a new course content group |
| [**deleteCourseContentGroupAsync**](CourseContentGroupsApi.md#deleteCourseContentGroupAsync) | **DELETE** /api/v2/LearningService/CourseContentGroups/{groupId} | Delete a course content group |
| [**getCourseContentGroupByIdAsync**](CourseContentGroupsApi.md#getCourseContentGroupByIdAsync) | **GET** /api/v2/LearningService/CourseContentGroups/{groupId} | Get course content group by ID |
| [**getCourseContentGroupsAsync**](CourseContentGroupsApi.md#getCourseContentGroupsAsync) | **GET** /api/v2/LearningService/CourseContentGroups | Get all course content groups |
| [**getCourseContentGroupsByCourseAsync**](CourseContentGroupsApi.md#getCourseContentGroupsByCourseAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/ContentGroups | Get course content groups by course |
| [**getCourseContentGroupsByCourseCountAsync**](CourseContentGroupsApi.md#getCourseContentGroupsByCourseCountAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/ContentGroups/Count | Get course content groups count by course |
| [**getCourseContentGroupsCountAsync**](CourseContentGroupsApi.md#getCourseContentGroupsCountAsync) | **GET** /api/v2/LearningService/CourseContentGroups/Count | Get course content groups count |
| [**updateCourseContentGroupAsync**](CourseContentGroupsApi.md#updateCourseContentGroupAsync) | **PUT** /api/v2/LearningService/CourseContentGroups/{groupId} | Update a course content group |


<a id="createCourseContentGroupAsync"></a>
# **createCourseContentGroupAsync**
> createCourseContentGroupAsync(tenantId, apiVersion, xApiVersion, courseContentGroupCreateDto)

Create a new course content group

Creates a new course content group for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseContentGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseContentGroupsApi apiInstance = new CourseContentGroupsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CourseContentGroupCreateDto courseContentGroupCreateDto = new CourseContentGroupCreateDto(); // CourseContentGroupCreateDto | 
    try {
      apiInstance.createCourseContentGroupAsync(tenantId, apiVersion, xApiVersion, courseContentGroupCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseContentGroupsApi#createCourseContentGroupAsync");
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
| **courseContentGroupCreateDto** | [**CourseContentGroupCreateDto**](CourseContentGroupCreateDto.md)|  | [optional] |

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
| **403** | Forbidden |  -  |
| **201** | Created |  -  |

<a id="deleteCourseContentGroupAsync"></a>
# **deleteCourseContentGroupAsync**
> deleteCourseContentGroupAsync(tenantId, groupId, apiVersion, xApiVersion)

Delete a course content group

Deletes a course content group for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseContentGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseContentGroupsApi apiInstance = new CourseContentGroupsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String groupId = "groupId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteCourseContentGroupAsync(tenantId, groupId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseContentGroupsApi#deleteCourseContentGroupAsync");
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
| **groupId** | **String**|  | |
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
| **403** | Forbidden |  -  |
| **200** | OK |  -  |

<a id="getCourseContentGroupByIdAsync"></a>
# **getCourseContentGroupByIdAsync**
> CourseContentGroupDto getCourseContentGroupByIdAsync(groupId, apiVersion, xApiVersion)

Get course content group by ID

Retrieves a specific course content group by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseContentGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseContentGroupsApi apiInstance = new CourseContentGroupsApi(defaultClient);
    String groupId = "groupId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CourseContentGroupDto result = apiInstance.getCourseContentGroupByIdAsync(groupId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseContentGroupsApi#getCourseContentGroupByIdAsync");
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
| **groupId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CourseContentGroupDto**](CourseContentGroupDto.md)

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

<a id="getCourseContentGroupsAsync"></a>
# **getCourseContentGroupsAsync**
> List&lt;CourseContentGroupDto&gt; getCourseContentGroupsAsync(tenantId, apiVersion, xApiVersion)

Get all course content groups

Retrieves all course content groups for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseContentGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseContentGroupsApi apiInstance = new CourseContentGroupsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<CourseContentGroupDto> result = apiInstance.getCourseContentGroupsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseContentGroupsApi#getCourseContentGroupsAsync");
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

[**List&lt;CourseContentGroupDto&gt;**](CourseContentGroupDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **200** | OK |  -  |

<a id="getCourseContentGroupsByCourseAsync"></a>
# **getCourseContentGroupsByCourseAsync**
> List&lt;CourseContentGroupDto&gt; getCourseContentGroupsByCourseAsync(courseId, apiVersion, xApiVersion)

Get course content groups by course

Retrieves all course content groups for a specific course.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseContentGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseContentGroupsApi apiInstance = new CourseContentGroupsApi(defaultClient);
    String courseId = "courseId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<CourseContentGroupDto> result = apiInstance.getCourseContentGroupsByCourseAsync(courseId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseContentGroupsApi#getCourseContentGroupsByCourseAsync");
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
| **courseId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**List&lt;CourseContentGroupDto&gt;**](CourseContentGroupDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **200** | OK |  -  |

<a id="getCourseContentGroupsByCourseCountAsync"></a>
# **getCourseContentGroupsByCourseCountAsync**
> Integer getCourseContentGroupsByCourseCountAsync(courseId, apiVersion, xApiVersion)

Get course content groups count by course

Returns the count of course content groups for a specific course.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseContentGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseContentGroupsApi apiInstance = new CourseContentGroupsApi(defaultClient);
    String courseId = "courseId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Integer result = apiInstance.getCourseContentGroupsByCourseCountAsync(courseId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseContentGroupsApi#getCourseContentGroupsByCourseCountAsync");
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
| **courseId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **200** | OK |  -  |

<a id="getCourseContentGroupsCountAsync"></a>
# **getCourseContentGroupsCountAsync**
> Integer getCourseContentGroupsCountAsync(tenantId, apiVersion, xApiVersion)

Get course content groups count

Returns the count of course content groups for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseContentGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseContentGroupsApi apiInstance = new CourseContentGroupsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Integer result = apiInstance.getCourseContentGroupsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseContentGroupsApi#getCourseContentGroupsCountAsync");
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

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **200** | OK |  -  |

<a id="updateCourseContentGroupAsync"></a>
# **updateCourseContentGroupAsync**
> updateCourseContentGroupAsync(tenantId, groupId, apiVersion, xApiVersion, courseContentGroupUpdateDto)

Update a course content group

Updates an existing course content group for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseContentGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseContentGroupsApi apiInstance = new CourseContentGroupsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String groupId = "groupId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CourseContentGroupUpdateDto courseContentGroupUpdateDto = new CourseContentGroupUpdateDto(); // CourseContentGroupUpdateDto | 
    try {
      apiInstance.updateCourseContentGroupAsync(tenantId, groupId, apiVersion, xApiVersion, courseContentGroupUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseContentGroupsApi#updateCourseContentGroupAsync");
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
| **groupId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **courseContentGroupUpdateDto** | [**CourseContentGroupUpdateDto**](CourseContentGroupUpdateDto.md)|  | [optional] |

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
| **403** | Forbidden |  -  |
| **200** | OK |  -  |

