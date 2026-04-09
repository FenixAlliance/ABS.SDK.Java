# CoursesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCourseAsync**](CoursesApi.md#createCourseAsync) | **POST** /api/v2/LearningService/Courses | Create a new course |
| [**deleteCourseAsync**](CoursesApi.md#deleteCourseAsync) | **DELETE** /api/v2/LearningService/Courses/{courseId} | Delete a course |
| [**getCourseArticlesByCourseWikiAsync**](CoursesApi.md#getCourseArticlesByCourseWikiAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Articles/{wikiId} | Get course articles by course wiki |
| [**getCourseArticlesByCourseWikiCountAsync**](CoursesApi.md#getCourseArticlesByCourseWikiCountAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Articles/{wikiId}/Count | Get course articles by course wiki count |
| [**getCourseAssignmentsByCourseAsync**](CoursesApi.md#getCourseAssignmentsByCourseAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Assignments | Get course assignments by course |
| [**getCourseAssignmentsByCourseCountAsync**](CoursesApi.md#getCourseAssignmentsByCourseCountAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Assignments/Count | Get course assignments by course count |
| [**getCourseByIdAsync**](CoursesApi.md#getCourseByIdAsync) | **GET** /api/v2/LearningService/Courses/{courseId} | Get course by ID |
| [**getCourseCategoriesByCourseAsync**](CoursesApi.md#getCourseCategoriesByCourseAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Categories | Get course categories by course |
| [**getCourseCategoriesByCourseCountAsync**](CoursesApi.md#getCourseCategoriesByCourseCountAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Categories/Count | Get course categories by course count |
| [**getCourseCohortsByCourseAsync**](CoursesApi.md#getCourseCohortsByCourseAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Cohorts | Get course cohorts by course |
| [**getCourseCohortsByCourseCountAsync**](CoursesApi.md#getCourseCohortsByCourseCountAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Cohorts/Count | Get course cohorts by course count |
| [**getCourseEnrollmentsByCourseAsync**](CoursesApi.md#getCourseEnrollmentsByCourseAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Enrollments | Get enrollments by course |
| [**getCourseFilesByCourseAsync**](CoursesApi.md#getCourseFilesByCourseAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Files | Get course files by course |
| [**getCourseFilesByCourseCountAsync**](CoursesApi.md#getCourseFilesByCourseCountAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Files/Count | Get course files by course count |
| [**getCourseForumsByCourseAsync**](CoursesApi.md#getCourseForumsByCourseAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Forums | Get course forums by course |
| [**getCourseForumsByCourseCountAsync**](CoursesApi.md#getCourseForumsByCourseCountAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Forums/Count | Get course forums by course count |
| [**getCourseHandoutsByCourseAsync**](CoursesApi.md#getCourseHandoutsByCourseAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Handouts | Get course handouts by course |
| [**getCourseHandoutsByCourseCountAsync**](CoursesApi.md#getCourseHandoutsByCourseCountAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Handouts/Count | Get course handouts by course count |
| [**getCourseLibrariesByCourseAsync**](CoursesApi.md#getCourseLibrariesByCourseAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Libraries | Get course libraries by course |
| [**getCourseLibrariesByCourseCountAsync**](CoursesApi.md#getCourseLibrariesByCourseCountAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Libraries/Count | Get course libraries by course count |
| [**getCoursePagesByCourseAsync**](CoursesApi.md#getCoursePagesByCourseAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Pages | Get course pages by course |
| [**getCoursePagesByCourseCountAsync**](CoursesApi.md#getCoursePagesByCourseCountAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Pages/Count | Get course pages by course count |
| [**getCourseProblemSetsByCourseAsync**](CoursesApi.md#getCourseProblemSetsByCourseAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/ProblemSets | Get course problem sets by course |
| [**getCourseProblemSetsByCourseCountAsync**](CoursesApi.md#getCourseProblemSetsByCourseCountAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/ProblemSets/Count | Get course problem sets by course count |
| [**getCourseSectionsByCourseAsync**](CoursesApi.md#getCourseSectionsByCourseAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Sections | Get course sections by course |
| [**getCourseSectionsByCourseCountAsync**](CoursesApi.md#getCourseSectionsByCourseCountAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Sections/Count | Get course sections by course count |
| [**getCourseUnitComponentsByCourseAsync**](CoursesApi.md#getCourseUnitComponentsByCourseAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/UnitComponents | Get course unit components by course |
| [**getCourseUnitComponentsByCourseCountAsync**](CoursesApi.md#getCourseUnitComponentsByCourseCountAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/UnitComponents/Count | Get course unit components by course count |
| [**getCourseUnitsBySectionAsync**](CoursesApi.md#getCourseUnitsBySectionAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Units/{sectionId} | Get course units by section |
| [**getCourseUnitsBySectionCountAsync**](CoursesApi.md#getCourseUnitsBySectionCountAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Units/{sectionId}/Count | Get course units by section count |
| [**getCourseUpdatesByCourseAsync**](CoursesApi.md#getCourseUpdatesByCourseAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Updates | Get course updates by course |
| [**getCourseUpdatesByCourseCountAsync**](CoursesApi.md#getCourseUpdatesByCourseCountAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Updates/Count | Get course updates by course count |
| [**getCourseWikisByCourseAsync**](CoursesApi.md#getCourseWikisByCourseAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Wikis | Get course wikis by course |
| [**getCourseWikisByCourseCountAsync**](CoursesApi.md#getCourseWikisByCourseCountAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Wikis/Count | Get course wikis by course count |
| [**getCoursesAsync**](CoursesApi.md#getCoursesAsync) | **GET** /api/v2/LearningService/Courses | Get courses |
| [**getCoursesCountAsync**](CoursesApi.md#getCoursesCountAsync) | **GET** /api/v2/LearningService/Courses/Count | Get courses count |
| [**getInstructorProfilesByCourseAsync**](CoursesApi.md#getInstructorProfilesByCourseAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Instructors | Get instructor profiles by course |
| [**getInstructorProfilesByCourseCountAsync**](CoursesApi.md#getInstructorProfilesByCourseCountAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Instructors/Count | Get instructor profiles by course count |
| [**getStudentProfilesByCourseAsync**](CoursesApi.md#getStudentProfilesByCourseAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Students | Get student profiles by course |
| [**getStudentProfilesByCourseCountAsync**](CoursesApi.md#getStudentProfilesByCourseCountAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Students/Count | Get student profiles by course count |
| [**updateCourseAsync**](CoursesApi.md#updateCourseAsync) | **PUT** /api/v2/LearningService/Courses/{courseId} | Update a course |


<a id="createCourseAsync"></a>
# **createCourseAsync**
> createCourseAsync(tenantId, apiVersion, xApiVersion, courseCreateDto)

Create a new course

Creates a new course for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursesApi apiInstance = new CoursesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CourseCreateDto courseCreateDto = new CourseCreateDto(); // CourseCreateDto | 
    try {
      apiInstance.createCourseAsync(tenantId, apiVersion, xApiVersion, courseCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursesApi#createCourseAsync");
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
| **courseCreateDto** | [**CourseCreateDto**](CourseCreateDto.md)|  | [optional] |

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

<a id="deleteCourseAsync"></a>
# **deleteCourseAsync**
> deleteCourseAsync(tenantId, courseId, apiVersion, xApiVersion)

Delete a course

Deletes a course for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursesApi apiInstance = new CoursesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID courseId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteCourseAsync(tenantId, courseId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursesApi#deleteCourseAsync");
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
| **courseId** | **UUID**|  | |
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

<a id="getCourseArticlesByCourseWikiAsync"></a>
# **getCourseArticlesByCourseWikiAsync**
> List&lt;CourseArticleDto&gt; getCourseArticlesByCourseWikiAsync(courseId, wikiId, apiVersion, xApiVersion)

Get course articles by course wiki

Retrieves all course articles for a specific course wiki.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursesApi apiInstance = new CoursesApi(defaultClient);
    String courseId = "courseId_example"; // String | 
    String wikiId = "wikiId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<CourseArticleDto> result = apiInstance.getCourseArticlesByCourseWikiAsync(courseId, wikiId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursesApi#getCourseArticlesByCourseWikiAsync");
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
| **wikiId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**List&lt;CourseArticleDto&gt;**](CourseArticleDto.md)

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

<a id="getCourseArticlesByCourseWikiCountAsync"></a>
# **getCourseArticlesByCourseWikiCountAsync**
> Integer getCourseArticlesByCourseWikiCountAsync(courseId, wikiId, apiVersion, xApiVersion)

Get course articles by course wiki count

Returns the count of course articles for a specific course wiki.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursesApi apiInstance = new CoursesApi(defaultClient);
    String courseId = "courseId_example"; // String | 
    String wikiId = "wikiId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Integer result = apiInstance.getCourseArticlesByCourseWikiCountAsync(courseId, wikiId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursesApi#getCourseArticlesByCourseWikiCountAsync");
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
| **wikiId** | **String**|  | |
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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getCourseAssignmentsByCourseAsync"></a>
# **getCourseAssignmentsByCourseAsync**
> List&lt;CourseAssignmentDto&gt; getCourseAssignmentsByCourseAsync(courseId, apiVersion, xApiVersion)

Get course assignments by course

Retrieves all course assignments for a specific course.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursesApi apiInstance = new CoursesApi(defaultClient);
    String courseId = "courseId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<CourseAssignmentDto> result = apiInstance.getCourseAssignmentsByCourseAsync(courseId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursesApi#getCourseAssignmentsByCourseAsync");
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

[**List&lt;CourseAssignmentDto&gt;**](CourseAssignmentDto.md)

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

<a id="getCourseAssignmentsByCourseCountAsync"></a>
# **getCourseAssignmentsByCourseCountAsync**
> Integer getCourseAssignmentsByCourseCountAsync(courseId, apiVersion, xApiVersion)

Get course assignments by course count

Returns the count of course assignments for a specific course.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursesApi apiInstance = new CoursesApi(defaultClient);
    String courseId = "courseId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Integer result = apiInstance.getCourseAssignmentsByCourseCountAsync(courseId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursesApi#getCourseAssignmentsByCourseCountAsync");
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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getCourseByIdAsync"></a>
# **getCourseByIdAsync**
> CourseDto getCourseByIdAsync(tenantId, courseId, apiVersion, xApiVersion)

Get course by ID

Retrieves a specific course by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursesApi apiInstance = new CoursesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID courseId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CourseDto result = apiInstance.getCourseByIdAsync(tenantId, courseId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursesApi#getCourseByIdAsync");
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
| **courseId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CourseDto**](CourseDto.md)

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

<a id="getCourseCategoriesByCourseAsync"></a>
# **getCourseCategoriesByCourseAsync**
> List&lt;CourseCategoryDto&gt; getCourseCategoriesByCourseAsync(courseId, apiVersion, xApiVersion)

Get course categories by course

Retrieves all course categories for a specific course.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursesApi apiInstance = new CoursesApi(defaultClient);
    String courseId = "courseId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<CourseCategoryDto> result = apiInstance.getCourseCategoriesByCourseAsync(courseId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursesApi#getCourseCategoriesByCourseAsync");
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

[**List&lt;CourseCategoryDto&gt;**](CourseCategoryDto.md)

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

<a id="getCourseCategoriesByCourseCountAsync"></a>
# **getCourseCategoriesByCourseCountAsync**
> Integer getCourseCategoriesByCourseCountAsync(courseId, apiVersion, xApiVersion)

Get course categories by course count

Returns the count of course categories for a specific course.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursesApi apiInstance = new CoursesApi(defaultClient);
    String courseId = "courseId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Integer result = apiInstance.getCourseCategoriesByCourseCountAsync(courseId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursesApi#getCourseCategoriesByCourseCountAsync");
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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getCourseCohortsByCourseAsync"></a>
# **getCourseCohortsByCourseAsync**
> List&lt;CourseCohortDto&gt; getCourseCohortsByCourseAsync(courseId, apiVersion, xApiVersion)

Get course cohorts by course

Retrieves all course cohorts for a specific course.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursesApi apiInstance = new CoursesApi(defaultClient);
    String courseId = "courseId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<CourseCohortDto> result = apiInstance.getCourseCohortsByCourseAsync(courseId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursesApi#getCourseCohortsByCourseAsync");
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

[**List&lt;CourseCohortDto&gt;**](CourseCohortDto.md)

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

<a id="getCourseCohortsByCourseCountAsync"></a>
# **getCourseCohortsByCourseCountAsync**
> Integer getCourseCohortsByCourseCountAsync(courseId, apiVersion, xApiVersion)

Get course cohorts by course count

Returns the count of course cohorts for a specific course.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursesApi apiInstance = new CoursesApi(defaultClient);
    String courseId = "courseId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Integer result = apiInstance.getCourseCohortsByCourseCountAsync(courseId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursesApi#getCourseCohortsByCourseCountAsync");
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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getCourseEnrollmentsByCourseAsync"></a>
# **getCourseEnrollmentsByCourseAsync**
> List&lt;CourseEnrollmentDto&gt; getCourseEnrollmentsByCourseAsync(tenantId, courseId, apiVersion, xApiVersion)

Get enrollments by course

Retrieves all enrollments for a specific course.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursesApi apiInstance = new CoursesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID courseId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<CourseEnrollmentDto> result = apiInstance.getCourseEnrollmentsByCourseAsync(tenantId, courseId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursesApi#getCourseEnrollmentsByCourseAsync");
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
| **courseId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**List&lt;CourseEnrollmentDto&gt;**](CourseEnrollmentDto.md)

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

<a id="getCourseFilesByCourseAsync"></a>
# **getCourseFilesByCourseAsync**
> List&lt;CourseFileDto&gt; getCourseFilesByCourseAsync(courseId, apiVersion, xApiVersion)

Get course files by course

Retrieves all course files for a specific course.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursesApi apiInstance = new CoursesApi(defaultClient);
    String courseId = "courseId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<CourseFileDto> result = apiInstance.getCourseFilesByCourseAsync(courseId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursesApi#getCourseFilesByCourseAsync");
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

[**List&lt;CourseFileDto&gt;**](CourseFileDto.md)

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

<a id="getCourseFilesByCourseCountAsync"></a>
# **getCourseFilesByCourseCountAsync**
> Integer getCourseFilesByCourseCountAsync(courseId, apiVersion, xApiVersion)

Get course files by course count

Returns the count of course files for a specific course.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursesApi apiInstance = new CoursesApi(defaultClient);
    String courseId = "courseId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Integer result = apiInstance.getCourseFilesByCourseCountAsync(courseId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursesApi#getCourseFilesByCourseCountAsync");
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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getCourseForumsByCourseAsync"></a>
# **getCourseForumsByCourseAsync**
> List&lt;CourseForumDto&gt; getCourseForumsByCourseAsync(courseId, apiVersion, xApiVersion)

Get course forums by course

Retrieves all course forums for a specific course.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursesApi apiInstance = new CoursesApi(defaultClient);
    String courseId = "courseId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<CourseForumDto> result = apiInstance.getCourseForumsByCourseAsync(courseId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursesApi#getCourseForumsByCourseAsync");
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

[**List&lt;CourseForumDto&gt;**](CourseForumDto.md)

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

<a id="getCourseForumsByCourseCountAsync"></a>
# **getCourseForumsByCourseCountAsync**
> Integer getCourseForumsByCourseCountAsync(courseId, apiVersion, xApiVersion)

Get course forums by course count

Returns the count of course forums for a specific course.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursesApi apiInstance = new CoursesApi(defaultClient);
    String courseId = "courseId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Integer result = apiInstance.getCourseForumsByCourseCountAsync(courseId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursesApi#getCourseForumsByCourseCountAsync");
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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getCourseHandoutsByCourseAsync"></a>
# **getCourseHandoutsByCourseAsync**
> List&lt;CourseHandoutDto&gt; getCourseHandoutsByCourseAsync(courseId, apiVersion, xApiVersion)

Get course handouts by course

Retrieves all course handouts for a specific course.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursesApi apiInstance = new CoursesApi(defaultClient);
    String courseId = "courseId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<CourseHandoutDto> result = apiInstance.getCourseHandoutsByCourseAsync(courseId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursesApi#getCourseHandoutsByCourseAsync");
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

[**List&lt;CourseHandoutDto&gt;**](CourseHandoutDto.md)

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

<a id="getCourseHandoutsByCourseCountAsync"></a>
# **getCourseHandoutsByCourseCountAsync**
> Integer getCourseHandoutsByCourseCountAsync(courseId, apiVersion, xApiVersion)

Get course handouts by course count

Returns the count of course handouts for a specific course.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursesApi apiInstance = new CoursesApi(defaultClient);
    String courseId = "courseId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Integer result = apiInstance.getCourseHandoutsByCourseCountAsync(courseId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursesApi#getCourseHandoutsByCourseCountAsync");
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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getCourseLibrariesByCourseAsync"></a>
# **getCourseLibrariesByCourseAsync**
> List&lt;CourseLibraryDto&gt; getCourseLibrariesByCourseAsync(courseId, apiVersion, xApiVersion)

Get course libraries by course

Retrieves all course libraries for a specific course.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursesApi apiInstance = new CoursesApi(defaultClient);
    String courseId = "courseId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<CourseLibraryDto> result = apiInstance.getCourseLibrariesByCourseAsync(courseId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursesApi#getCourseLibrariesByCourseAsync");
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

[**List&lt;CourseLibraryDto&gt;**](CourseLibraryDto.md)

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

<a id="getCourseLibrariesByCourseCountAsync"></a>
# **getCourseLibrariesByCourseCountAsync**
> Integer getCourseLibrariesByCourseCountAsync(courseId, apiVersion, xApiVersion)

Get course libraries by course count

Returns the count of course libraries for a specific course.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursesApi apiInstance = new CoursesApi(defaultClient);
    String courseId = "courseId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Integer result = apiInstance.getCourseLibrariesByCourseCountAsync(courseId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursesApi#getCourseLibrariesByCourseCountAsync");
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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getCoursePagesByCourseAsync"></a>
# **getCoursePagesByCourseAsync**
> List&lt;CoursePageDto&gt; getCoursePagesByCourseAsync(courseId, apiVersion, xApiVersion)

Get course pages by course

Retrieves all course pages for a specific course.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursesApi apiInstance = new CoursesApi(defaultClient);
    String courseId = "courseId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<CoursePageDto> result = apiInstance.getCoursePagesByCourseAsync(courseId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursesApi#getCoursePagesByCourseAsync");
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

[**List&lt;CoursePageDto&gt;**](CoursePageDto.md)

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

<a id="getCoursePagesByCourseCountAsync"></a>
# **getCoursePagesByCourseCountAsync**
> Integer getCoursePagesByCourseCountAsync(courseId, apiVersion, xApiVersion)

Get course pages by course count

Returns the count of course pages for a specific course.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursesApi apiInstance = new CoursesApi(defaultClient);
    String courseId = "courseId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Integer result = apiInstance.getCoursePagesByCourseCountAsync(courseId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursesApi#getCoursePagesByCourseCountAsync");
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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getCourseProblemSetsByCourseAsync"></a>
# **getCourseProblemSetsByCourseAsync**
> List&lt;CourseProblemSetDto&gt; getCourseProblemSetsByCourseAsync(courseId, apiVersion, xApiVersion)

Get course problem sets by course

Retrieves all course problem sets for a specific course.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursesApi apiInstance = new CoursesApi(defaultClient);
    String courseId = "courseId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<CourseProblemSetDto> result = apiInstance.getCourseProblemSetsByCourseAsync(courseId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursesApi#getCourseProblemSetsByCourseAsync");
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

[**List&lt;CourseProblemSetDto&gt;**](CourseProblemSetDto.md)

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

<a id="getCourseProblemSetsByCourseCountAsync"></a>
# **getCourseProblemSetsByCourseCountAsync**
> Integer getCourseProblemSetsByCourseCountAsync(courseId, apiVersion, xApiVersion)

Get course problem sets by course count

Returns the count of course problem sets for a specific course.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursesApi apiInstance = new CoursesApi(defaultClient);
    String courseId = "courseId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Integer result = apiInstance.getCourseProblemSetsByCourseCountAsync(courseId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursesApi#getCourseProblemSetsByCourseCountAsync");
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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getCourseSectionsByCourseAsync"></a>
# **getCourseSectionsByCourseAsync**
> List&lt;CourseSectionDto&gt; getCourseSectionsByCourseAsync(courseId, apiVersion, xApiVersion)

Get course sections by course

Retrieves all course sections for a specific course.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursesApi apiInstance = new CoursesApi(defaultClient);
    String courseId = "courseId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<CourseSectionDto> result = apiInstance.getCourseSectionsByCourseAsync(courseId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursesApi#getCourseSectionsByCourseAsync");
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

[**List&lt;CourseSectionDto&gt;**](CourseSectionDto.md)

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

<a id="getCourseSectionsByCourseCountAsync"></a>
# **getCourseSectionsByCourseCountAsync**
> Integer getCourseSectionsByCourseCountAsync(courseId, apiVersion, xApiVersion)

Get course sections by course count

Returns the count of course sections for a specific course.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursesApi apiInstance = new CoursesApi(defaultClient);
    String courseId = "courseId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Integer result = apiInstance.getCourseSectionsByCourseCountAsync(courseId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursesApi#getCourseSectionsByCourseCountAsync");
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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getCourseUnitComponentsByCourseAsync"></a>
# **getCourseUnitComponentsByCourseAsync**
> List&lt;CourseUnitComponentDto&gt; getCourseUnitComponentsByCourseAsync(courseId, apiVersion, xApiVersion)

Get course unit components by course

Retrieves all course unit components for a specific course.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursesApi apiInstance = new CoursesApi(defaultClient);
    String courseId = "courseId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<CourseUnitComponentDto> result = apiInstance.getCourseUnitComponentsByCourseAsync(courseId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursesApi#getCourseUnitComponentsByCourseAsync");
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

[**List&lt;CourseUnitComponentDto&gt;**](CourseUnitComponentDto.md)

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

<a id="getCourseUnitComponentsByCourseCountAsync"></a>
# **getCourseUnitComponentsByCourseCountAsync**
> Integer getCourseUnitComponentsByCourseCountAsync(courseId, apiVersion, xApiVersion)

Get course unit components by course count

Returns the count of course unit components for a specific course.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursesApi apiInstance = new CoursesApi(defaultClient);
    String courseId = "courseId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Integer result = apiInstance.getCourseUnitComponentsByCourseCountAsync(courseId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursesApi#getCourseUnitComponentsByCourseCountAsync");
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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getCourseUnitsBySectionAsync"></a>
# **getCourseUnitsBySectionAsync**
> List&lt;CourseUnitDto&gt; getCourseUnitsBySectionAsync(courseId, sectionId, apiVersion, xApiVersion)

Get course units by section

Retrieves all course units for a specific course section.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursesApi apiInstance = new CoursesApi(defaultClient);
    String courseId = "courseId_example"; // String | 
    String sectionId = "sectionId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<CourseUnitDto> result = apiInstance.getCourseUnitsBySectionAsync(courseId, sectionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursesApi#getCourseUnitsBySectionAsync");
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
| **sectionId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**List&lt;CourseUnitDto&gt;**](CourseUnitDto.md)

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

<a id="getCourseUnitsBySectionCountAsync"></a>
# **getCourseUnitsBySectionCountAsync**
> Integer getCourseUnitsBySectionCountAsync(courseId, sectionId, apiVersion, xApiVersion)

Get course units by section count

Returns the count of course units for a specific course section.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursesApi apiInstance = new CoursesApi(defaultClient);
    String courseId = "courseId_example"; // String | 
    String sectionId = "sectionId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Integer result = apiInstance.getCourseUnitsBySectionCountAsync(courseId, sectionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursesApi#getCourseUnitsBySectionCountAsync");
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
| **sectionId** | **String**|  | |
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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getCourseUpdatesByCourseAsync"></a>
# **getCourseUpdatesByCourseAsync**
> List&lt;CourseNewsDto&gt; getCourseUpdatesByCourseAsync(courseId, apiVersion, xApiVersion)

Get course updates by course

Retrieves all course updates for a specific course.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursesApi apiInstance = new CoursesApi(defaultClient);
    String courseId = "courseId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<CourseNewsDto> result = apiInstance.getCourseUpdatesByCourseAsync(courseId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursesApi#getCourseUpdatesByCourseAsync");
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

[**List&lt;CourseNewsDto&gt;**](CourseNewsDto.md)

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

<a id="getCourseUpdatesByCourseCountAsync"></a>
# **getCourseUpdatesByCourseCountAsync**
> Integer getCourseUpdatesByCourseCountAsync(courseId, apiVersion, xApiVersion)

Get course updates by course count

Returns the count of course updates for a specific course.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursesApi apiInstance = new CoursesApi(defaultClient);
    String courseId = "courseId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Integer result = apiInstance.getCourseUpdatesByCourseCountAsync(courseId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursesApi#getCourseUpdatesByCourseCountAsync");
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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getCourseWikisByCourseAsync"></a>
# **getCourseWikisByCourseAsync**
> List&lt;CourseWikiDto&gt; getCourseWikisByCourseAsync(courseId, apiVersion, xApiVersion)

Get course wikis by course

Retrieves all course wikis for a specific course.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursesApi apiInstance = new CoursesApi(defaultClient);
    String courseId = "courseId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<CourseWikiDto> result = apiInstance.getCourseWikisByCourseAsync(courseId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursesApi#getCourseWikisByCourseAsync");
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

[**List&lt;CourseWikiDto&gt;**](CourseWikiDto.md)

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

<a id="getCourseWikisByCourseCountAsync"></a>
# **getCourseWikisByCourseCountAsync**
> Integer getCourseWikisByCourseCountAsync(courseId, apiVersion, xApiVersion)

Get course wikis by course count

Returns the count of course wikis for a specific course.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursesApi apiInstance = new CoursesApi(defaultClient);
    String courseId = "courseId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Integer result = apiInstance.getCourseWikisByCourseCountAsync(courseId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursesApi#getCourseWikisByCourseCountAsync");
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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getCoursesAsync"></a>
# **getCoursesAsync**
> List&lt;CourseDto&gt; getCoursesAsync(tenantId, apiVersion, xApiVersion)

Get courses

Retrieves courses. When tenantId is provided, returns tenant-scoped courses; otherwise returns all courses.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursesApi apiInstance = new CoursesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<CourseDto> result = apiInstance.getCoursesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursesApi#getCoursesAsync");
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

[**List&lt;CourseDto&gt;**](CourseDto.md)

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

<a id="getCoursesCountAsync"></a>
# **getCoursesCountAsync**
> Integer getCoursesCountAsync(tenantId, apiVersion, xApiVersion)

Get courses count

Returns the count of courses. When tenantId is provided, returns tenant-scoped count; otherwise returns global count.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursesApi apiInstance = new CoursesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Integer result = apiInstance.getCoursesCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursesApi#getCoursesCountAsync");
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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getInstructorProfilesByCourseAsync"></a>
# **getInstructorProfilesByCourseAsync**
> List&lt;InstructorProfileDto&gt; getInstructorProfilesByCourseAsync(courseId, apiVersion, xApiVersion)

Get instructor profiles by course

Retrieves all instructor profiles teaching a specific course.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursesApi apiInstance = new CoursesApi(defaultClient);
    String courseId = "courseId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<InstructorProfileDto> result = apiInstance.getInstructorProfilesByCourseAsync(courseId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursesApi#getInstructorProfilesByCourseAsync");
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

[**List&lt;InstructorProfileDto&gt;**](InstructorProfileDto.md)

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

<a id="getInstructorProfilesByCourseCountAsync"></a>
# **getInstructorProfilesByCourseCountAsync**
> Integer getInstructorProfilesByCourseCountAsync(courseId, apiVersion, xApiVersion)

Get instructor profiles by course count

Returns the count of instructor profiles teaching a specific course.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursesApi apiInstance = new CoursesApi(defaultClient);
    String courseId = "courseId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Integer result = apiInstance.getInstructorProfilesByCourseCountAsync(courseId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursesApi#getInstructorProfilesByCourseCountAsync");
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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getStudentProfilesByCourseAsync"></a>
# **getStudentProfilesByCourseAsync**
> List&lt;StudentProfileDto&gt; getStudentProfilesByCourseAsync(courseId, apiVersion, xApiVersion)

Get student profiles by course

Retrieves all student profiles enrolled in a specific course.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursesApi apiInstance = new CoursesApi(defaultClient);
    String courseId = "courseId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<StudentProfileDto> result = apiInstance.getStudentProfilesByCourseAsync(courseId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursesApi#getStudentProfilesByCourseAsync");
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

[**List&lt;StudentProfileDto&gt;**](StudentProfileDto.md)

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

<a id="getStudentProfilesByCourseCountAsync"></a>
# **getStudentProfilesByCourseCountAsync**
> Integer getStudentProfilesByCourseCountAsync(courseId, apiVersion, xApiVersion)

Get student profiles by course count

Returns the count of student profiles enrolled in a specific course.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursesApi apiInstance = new CoursesApi(defaultClient);
    String courseId = "courseId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Integer result = apiInstance.getStudentProfilesByCourseCountAsync(courseId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursesApi#getStudentProfilesByCourseCountAsync");
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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="updateCourseAsync"></a>
# **updateCourseAsync**
> updateCourseAsync(tenantId, courseId, apiVersion, xApiVersion, courseUpdateDto)

Update a course

Updates an existing course for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoursesApi apiInstance = new CoursesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID courseId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CourseUpdateDto courseUpdateDto = new CourseUpdateDto(); // CourseUpdateDto | 
    try {
      apiInstance.updateCourseAsync(tenantId, courseId, apiVersion, xApiVersion, courseUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursesApi#updateCourseAsync");
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
| **courseId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **courseUpdateDto** | [**CourseUpdateDto**](CourseUpdateDto.md)|  | [optional] |

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

