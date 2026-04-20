# CourseAssignmentsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCourseAssignmentAsync**](CourseAssignmentsApi.md#createCourseAssignmentAsync) | **POST** /api/v2/LearningService/CourseAssignments | Create a new course assignment |
| [**deleteCourseAssignmentAsync**](CourseAssignmentsApi.md#deleteCourseAssignmentAsync) | **DELETE** /api/v2/LearningService/CourseAssignments/{assignmentId} | Delete a course assignment |
| [**getCourseAssignmentByIdAsync**](CourseAssignmentsApi.md#getCourseAssignmentByIdAsync) | **GET** /api/v2/LearningService/CourseAssignments/{assignmentId} | Get course assignment by ID |
| [**getCourseAssignmentsAsync**](CourseAssignmentsApi.md#getCourseAssignmentsAsync) | **GET** /api/v2/LearningService/CourseAssignments | Get all course assignments |
| [**getCourseAssignmentsCountAsync**](CourseAssignmentsApi.md#getCourseAssignmentsCountAsync) | **GET** /api/v2/LearningService/CourseAssignments/Count | Get course assignments count |
| [**updateCourseAssignmentAsync**](CourseAssignmentsApi.md#updateCourseAssignmentAsync) | **PUT** /api/v2/LearningService/CourseAssignments/{assignmentId} | Update a course assignment |


<a id="createCourseAssignmentAsync"></a>
# **createCourseAssignmentAsync**
> createCourseAssignmentAsync(tenantId, apiVersion, xApiVersion, courseAssignmentCreateDto)

Create a new course assignment

Creates a new course assignment for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseAssignmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseAssignmentsApi apiInstance = new CourseAssignmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CourseAssignmentCreateDto courseAssignmentCreateDto = new CourseAssignmentCreateDto(); // CourseAssignmentCreateDto | 
    try {
      apiInstance.createCourseAssignmentAsync(tenantId, apiVersion, xApiVersion, courseAssignmentCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseAssignmentsApi#createCourseAssignmentAsync");
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
| **courseAssignmentCreateDto** | [**CourseAssignmentCreateDto**](CourseAssignmentCreateDto.md)|  | [optional] |

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

<a id="deleteCourseAssignmentAsync"></a>
# **deleteCourseAssignmentAsync**
> deleteCourseAssignmentAsync(tenantId, assignmentId, apiVersion, xApiVersion)

Delete a course assignment

Deletes a course assignment for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseAssignmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseAssignmentsApi apiInstance = new CourseAssignmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String assignmentId = "assignmentId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteCourseAssignmentAsync(tenantId, assignmentId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseAssignmentsApi#deleteCourseAssignmentAsync");
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
| **assignmentId** | **String**|  | |
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

<a id="getCourseAssignmentByIdAsync"></a>
# **getCourseAssignmentByIdAsync**
> CourseAssignmentDto getCourseAssignmentByIdAsync(assignmentId, apiVersion, xApiVersion)

Get course assignment by ID

Retrieves a specific course assignment by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseAssignmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseAssignmentsApi apiInstance = new CourseAssignmentsApi(defaultClient);
    String assignmentId = "assignmentId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CourseAssignmentDto result = apiInstance.getCourseAssignmentByIdAsync(assignmentId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseAssignmentsApi#getCourseAssignmentByIdAsync");
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
| **assignmentId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CourseAssignmentDto**](CourseAssignmentDto.md)

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

<a id="getCourseAssignmentsAsync"></a>
# **getCourseAssignmentsAsync**
> List&lt;CourseAssignmentDto&gt; getCourseAssignmentsAsync(tenantId, apiVersion, xApiVersion)

Get all course assignments

Retrieves all course assignments for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseAssignmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseAssignmentsApi apiInstance = new CourseAssignmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<CourseAssignmentDto> result = apiInstance.getCourseAssignmentsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseAssignmentsApi#getCourseAssignmentsAsync");
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

[**List&lt;CourseAssignmentDto&gt;**](CourseAssignmentDto.md)

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

<a id="getCourseAssignmentsCountAsync"></a>
# **getCourseAssignmentsCountAsync**
> Integer getCourseAssignmentsCountAsync(tenantId, apiVersion, xApiVersion)

Get course assignments count

Returns the count of course assignments for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseAssignmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseAssignmentsApi apiInstance = new CourseAssignmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Integer result = apiInstance.getCourseAssignmentsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseAssignmentsApi#getCourseAssignmentsCountAsync");
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

<a id="updateCourseAssignmentAsync"></a>
# **updateCourseAssignmentAsync**
> updateCourseAssignmentAsync(tenantId, assignmentId, apiVersion, xApiVersion, courseAssignmentUpdateDto)

Update a course assignment

Updates an existing course assignment for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseAssignmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseAssignmentsApi apiInstance = new CourseAssignmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String assignmentId = "assignmentId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CourseAssignmentUpdateDto courseAssignmentUpdateDto = new CourseAssignmentUpdateDto(); // CourseAssignmentUpdateDto | 
    try {
      apiInstance.updateCourseAssignmentAsync(tenantId, assignmentId, apiVersion, xApiVersion, courseAssignmentUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseAssignmentsApi#updateCourseAssignmentAsync");
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
| **assignmentId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **courseAssignmentUpdateDto** | [**CourseAssignmentUpdateDto**](CourseAssignmentUpdateDto.md)|  | [optional] |

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

