# CourseAssignmentTypesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCourseAssignmentTypeAsync**](CourseAssignmentTypesApi.md#createCourseAssignmentTypeAsync) | **POST** /api/v2/LearningService/CourseAssignmentTypes | Create a course assignment type |
| [**deleteCourseAssignmentTypeAsync**](CourseAssignmentTypesApi.md#deleteCourseAssignmentTypeAsync) | **DELETE** /api/v2/LearningService/CourseAssignmentTypes/{assignmentTypeId} | Delete a course assignment type |
| [**getCourseAssignmentTypeByIdAsync**](CourseAssignmentTypesApi.md#getCourseAssignmentTypeByIdAsync) | **GET** /api/v2/LearningService/CourseAssignmentTypes/{assignmentTypeId} | Get course assignment type by ID |
| [**getCourseAssignmentTypesAsync**](CourseAssignmentTypesApi.md#getCourseAssignmentTypesAsync) | **GET** /api/v2/LearningService/CourseAssignmentTypes | Get all course assignment types |
| [**getCourseAssignmentTypesCountAsync**](CourseAssignmentTypesApi.md#getCourseAssignmentTypesCountAsync) | **GET** /api/v2/LearningService/CourseAssignmentTypes/Count | Get course assignment types count |
| [**updateCourseAssignmentTypeAsync**](CourseAssignmentTypesApi.md#updateCourseAssignmentTypeAsync) | **PUT** /api/v2/LearningService/CourseAssignmentTypes/{assignmentTypeId} | Update a course assignment type |


<a id="createCourseAssignmentTypeAsync"></a>
# **createCourseAssignmentTypeAsync**
> createCourseAssignmentTypeAsync(tenantId, apiVersion, xApiVersion, courseAssignmentTypeCreateDto)

Create a course assignment type

Creates a new course assignment type for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseAssignmentTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseAssignmentTypesApi apiInstance = new CourseAssignmentTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CourseAssignmentTypeCreateDto courseAssignmentTypeCreateDto = new CourseAssignmentTypeCreateDto(); // CourseAssignmentTypeCreateDto | 
    try {
      apiInstance.createCourseAssignmentTypeAsync(tenantId, apiVersion, xApiVersion, courseAssignmentTypeCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseAssignmentTypesApi#createCourseAssignmentTypeAsync");
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
| **courseAssignmentTypeCreateDto** | [**CourseAssignmentTypeCreateDto**](CourseAssignmentTypeCreateDto.md)|  | [optional] |

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

<a id="deleteCourseAssignmentTypeAsync"></a>
# **deleteCourseAssignmentTypeAsync**
> deleteCourseAssignmentTypeAsync(tenantId, assignmentTypeId, apiVersion, xApiVersion)

Delete a course assignment type

Deletes a course assignment type by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseAssignmentTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseAssignmentTypesApi apiInstance = new CourseAssignmentTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String assignmentTypeId = "assignmentTypeId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteCourseAssignmentTypeAsync(tenantId, assignmentTypeId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseAssignmentTypesApi#deleteCourseAssignmentTypeAsync");
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
| **assignmentTypeId** | **String**|  | |
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

<a id="getCourseAssignmentTypeByIdAsync"></a>
# **getCourseAssignmentTypeByIdAsync**
> CourseAssignmentTypeDto getCourseAssignmentTypeByIdAsync(assignmentTypeId, apiVersion, xApiVersion)

Get course assignment type by ID

Retrieves a specific course assignment type by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseAssignmentTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseAssignmentTypesApi apiInstance = new CourseAssignmentTypesApi(defaultClient);
    String assignmentTypeId = "assignmentTypeId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CourseAssignmentTypeDto result = apiInstance.getCourseAssignmentTypeByIdAsync(assignmentTypeId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseAssignmentTypesApi#getCourseAssignmentTypeByIdAsync");
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
| **assignmentTypeId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CourseAssignmentTypeDto**](CourseAssignmentTypeDto.md)

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

<a id="getCourseAssignmentTypesAsync"></a>
# **getCourseAssignmentTypesAsync**
> List&lt;CourseAssignmentTypeDto&gt; getCourseAssignmentTypesAsync(tenantId, apiVersion, xApiVersion)

Get all course assignment types

Retrieves all course assignment types for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseAssignmentTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseAssignmentTypesApi apiInstance = new CourseAssignmentTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<CourseAssignmentTypeDto> result = apiInstance.getCourseAssignmentTypesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseAssignmentTypesApi#getCourseAssignmentTypesAsync");
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

[**List&lt;CourseAssignmentTypeDto&gt;**](CourseAssignmentTypeDto.md)

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

<a id="getCourseAssignmentTypesCountAsync"></a>
# **getCourseAssignmentTypesCountAsync**
> Integer getCourseAssignmentTypesCountAsync(tenantId, apiVersion, xApiVersion)

Get course assignment types count

Returns the count of course assignment types for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseAssignmentTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseAssignmentTypesApi apiInstance = new CourseAssignmentTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Integer result = apiInstance.getCourseAssignmentTypesCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseAssignmentTypesApi#getCourseAssignmentTypesCountAsync");
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

<a id="updateCourseAssignmentTypeAsync"></a>
# **updateCourseAssignmentTypeAsync**
> updateCourseAssignmentTypeAsync(tenantId, assignmentTypeId, apiVersion, xApiVersion, courseAssignmentTypeUpdateDto)

Update a course assignment type

Updates an existing course assignment type.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseAssignmentTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseAssignmentTypesApi apiInstance = new CourseAssignmentTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String assignmentTypeId = "assignmentTypeId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CourseAssignmentTypeUpdateDto courseAssignmentTypeUpdateDto = new CourseAssignmentTypeUpdateDto(); // CourseAssignmentTypeUpdateDto | 
    try {
      apiInstance.updateCourseAssignmentTypeAsync(tenantId, assignmentTypeId, apiVersion, xApiVersion, courseAssignmentTypeUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseAssignmentTypesApi#updateCourseAssignmentTypeAsync");
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
| **assignmentTypeId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **courseAssignmentTypeUpdateDto** | [**CourseAssignmentTypeUpdateDto**](CourseAssignmentTypeUpdateDto.md)|  | [optional] |

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

