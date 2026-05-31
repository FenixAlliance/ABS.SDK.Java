# CoursePagesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCoursePageAsync**](CoursePagesApi.md#createCoursePageAsync) | **POST** /api/v2/LearningService/CoursePages | Create a new course page |
| [**deleteCoursePageAsync**](CoursePagesApi.md#deleteCoursePageAsync) | **DELETE** /api/v2/LearningService/CoursePages/{pageId} | Delete a course page |
| [**getCoursePageByIdAsync**](CoursePagesApi.md#getCoursePageByIdAsync) | **GET** /api/v2/LearningService/CoursePages/{pageId} | Get course page by ID |
| [**getCoursePagesAsync**](CoursePagesApi.md#getCoursePagesAsync) | **GET** /api/v2/LearningService/CoursePages | Get all course pages |
| [**getCoursePagesCountAsync**](CoursePagesApi.md#getCoursePagesCountAsync) | **GET** /api/v2/LearningService/CoursePages/Count | Get course pages count |
| [**updateCoursePageAsync**](CoursePagesApi.md#updateCoursePageAsync) | **PUT** /api/v2/LearningService/CoursePages/{pageId} | Update a course page |


<a id="createCoursePageAsync"></a>
# **createCoursePageAsync**
> createCoursePageAsync(tenantId, apiVersion, xApiVersion, coursePageCreateDto)

Create a new course page

Creates a new course page for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursePagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursePagesApi apiInstance = new CoursePagesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CoursePageCreateDto coursePageCreateDto = new CoursePageCreateDto(); // CoursePageCreateDto | 
    try {
      apiInstance.createCoursePageAsync(tenantId, apiVersion, xApiVersion, coursePageCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursePagesApi#createCoursePageAsync");
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
| **coursePageCreateDto** | [**CoursePageCreateDto**](CoursePageCreateDto.md)|  | [optional] |

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

<a id="deleteCoursePageAsync"></a>
# **deleteCoursePageAsync**
> deleteCoursePageAsync(tenantId, pageId, apiVersion, xApiVersion)

Delete a course page

Deletes a course page for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursePagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursePagesApi apiInstance = new CoursePagesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String pageId = "pageId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteCoursePageAsync(tenantId, pageId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursePagesApi#deleteCoursePageAsync");
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
| **pageId** | **String**|  | |
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

<a id="getCoursePageByIdAsync"></a>
# **getCoursePageByIdAsync**
> CoursePageDto getCoursePageByIdAsync(pageId, apiVersion, xApiVersion)

Get course page by ID

Retrieves a specific course page by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursePagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursePagesApi apiInstance = new CoursePagesApi(defaultClient);
    String pageId = "pageId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CoursePageDto result = apiInstance.getCoursePageByIdAsync(pageId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursePagesApi#getCoursePageByIdAsync");
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
| **pageId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CoursePageDto**](CoursePageDto.md)

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

<a id="getCoursePagesAsync"></a>
# **getCoursePagesAsync**
> List&lt;CoursePageDto&gt; getCoursePagesAsync(tenantId, apiVersion, xApiVersion)

Get all course pages

Retrieves all course pages for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursePagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursePagesApi apiInstance = new CoursePagesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<CoursePageDto> result = apiInstance.getCoursePagesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursePagesApi#getCoursePagesAsync");
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

[**List&lt;CoursePageDto&gt;**](CoursePageDto.md)

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

<a id="getCoursePagesCountAsync"></a>
# **getCoursePagesCountAsync**
> Integer getCoursePagesCountAsync(tenantId, apiVersion, xApiVersion)

Get course pages count

Returns the count of course pages for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursePagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursePagesApi apiInstance = new CoursePagesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Integer result = apiInstance.getCoursePagesCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursePagesApi#getCoursePagesCountAsync");
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

<a id="updateCoursePageAsync"></a>
# **updateCoursePageAsync**
> updateCoursePageAsync(tenantId, pageId, apiVersion, xApiVersion, coursePageUpdateDto)

Update a course page

Updates an existing course page for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursePagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursePagesApi apiInstance = new CoursePagesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String pageId = "pageId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CoursePageUpdateDto coursePageUpdateDto = new CoursePageUpdateDto(); // CoursePageUpdateDto | 
    try {
      apiInstance.updateCoursePageAsync(tenantId, pageId, apiVersion, xApiVersion, coursePageUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursePagesApi#updateCoursePageAsync");
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
| **pageId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **coursePageUpdateDto** | [**CoursePageUpdateDto**](CoursePageUpdateDto.md)|  | [optional] |

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

