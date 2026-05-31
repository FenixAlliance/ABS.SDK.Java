# CourseGradingRubricsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCourseGradingRubricAsync**](CourseGradingRubricsApi.md#createCourseGradingRubricAsync) | **POST** /api/v2/LearningService/CourseGradingRubrics | Create a course grading rubric |
| [**deleteCourseGradingRubricAsync**](CourseGradingRubricsApi.md#deleteCourseGradingRubricAsync) | **DELETE** /api/v2/LearningService/CourseGradingRubrics/{rubricId} | Delete a course grading rubric |
| [**getCourseGradingRubricByIdAsync**](CourseGradingRubricsApi.md#getCourseGradingRubricByIdAsync) | **GET** /api/v2/LearningService/CourseGradingRubrics/{rubricId} | Get course grading rubric by ID |
| [**getCourseGradingRubricsAsync**](CourseGradingRubricsApi.md#getCourseGradingRubricsAsync) | **GET** /api/v2/LearningService/CourseGradingRubrics | Get all course grading rubrics |
| [**getCourseGradingRubricsCountAsync**](CourseGradingRubricsApi.md#getCourseGradingRubricsCountAsync) | **GET** /api/v2/LearningService/CourseGradingRubrics/Count | Get course grading rubrics count |
| [**updateCourseGradingRubricAsync**](CourseGradingRubricsApi.md#updateCourseGradingRubricAsync) | **PUT** /api/v2/LearningService/CourseGradingRubrics/{rubricId} | Update a course grading rubric |


<a id="createCourseGradingRubricAsync"></a>
# **createCourseGradingRubricAsync**
> createCourseGradingRubricAsync(tenantId, apiVersion, xApiVersion, courseGradingRubricCreateDto)

Create a course grading rubric

Creates a new course grading rubric for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseGradingRubricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseGradingRubricsApi apiInstance = new CourseGradingRubricsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CourseGradingRubricCreateDto courseGradingRubricCreateDto = new CourseGradingRubricCreateDto(); // CourseGradingRubricCreateDto | 
    try {
      apiInstance.createCourseGradingRubricAsync(tenantId, apiVersion, xApiVersion, courseGradingRubricCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseGradingRubricsApi#createCourseGradingRubricAsync");
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
| **courseGradingRubricCreateDto** | [**CourseGradingRubricCreateDto**](CourseGradingRubricCreateDto.md)|  | [optional] |

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

<a id="deleteCourseGradingRubricAsync"></a>
# **deleteCourseGradingRubricAsync**
> deleteCourseGradingRubricAsync(tenantId, rubricId, apiVersion, xApiVersion)

Delete a course grading rubric

Deletes a course grading rubric by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseGradingRubricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseGradingRubricsApi apiInstance = new CourseGradingRubricsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String rubricId = "rubricId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteCourseGradingRubricAsync(tenantId, rubricId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseGradingRubricsApi#deleteCourseGradingRubricAsync");
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
| **rubricId** | **String**|  | |
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

<a id="getCourseGradingRubricByIdAsync"></a>
# **getCourseGradingRubricByIdAsync**
> CourseGradingRubricDto getCourseGradingRubricByIdAsync(rubricId, apiVersion, xApiVersion)

Get course grading rubric by ID

Retrieves a specific course grading rubric by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseGradingRubricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseGradingRubricsApi apiInstance = new CourseGradingRubricsApi(defaultClient);
    String rubricId = "rubricId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CourseGradingRubricDto result = apiInstance.getCourseGradingRubricByIdAsync(rubricId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseGradingRubricsApi#getCourseGradingRubricByIdAsync");
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
| **rubricId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CourseGradingRubricDto**](CourseGradingRubricDto.md)

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

<a id="getCourseGradingRubricsAsync"></a>
# **getCourseGradingRubricsAsync**
> List&lt;CourseGradingRubricDto&gt; getCourseGradingRubricsAsync(tenantId, apiVersion, xApiVersion)

Get all course grading rubrics

Retrieves all course grading rubrics for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseGradingRubricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseGradingRubricsApi apiInstance = new CourseGradingRubricsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<CourseGradingRubricDto> result = apiInstance.getCourseGradingRubricsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseGradingRubricsApi#getCourseGradingRubricsAsync");
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

[**List&lt;CourseGradingRubricDto&gt;**](CourseGradingRubricDto.md)

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

<a id="getCourseGradingRubricsCountAsync"></a>
# **getCourseGradingRubricsCountAsync**
> Integer getCourseGradingRubricsCountAsync(tenantId, apiVersion, xApiVersion)

Get course grading rubrics count

Returns the count of course grading rubrics for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseGradingRubricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseGradingRubricsApi apiInstance = new CourseGradingRubricsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Integer result = apiInstance.getCourseGradingRubricsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseGradingRubricsApi#getCourseGradingRubricsCountAsync");
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

<a id="updateCourseGradingRubricAsync"></a>
# **updateCourseGradingRubricAsync**
> updateCourseGradingRubricAsync(tenantId, rubricId, apiVersion, xApiVersion, courseGradingRubricUpdateDto)

Update a course grading rubric

Updates an existing course grading rubric.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseGradingRubricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseGradingRubricsApi apiInstance = new CourseGradingRubricsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String rubricId = "rubricId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CourseGradingRubricUpdateDto courseGradingRubricUpdateDto = new CourseGradingRubricUpdateDto(); // CourseGradingRubricUpdateDto | 
    try {
      apiInstance.updateCourseGradingRubricAsync(tenantId, rubricId, apiVersion, xApiVersion, courseGradingRubricUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseGradingRubricsApi#updateCourseGradingRubricAsync");
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
| **rubricId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **courseGradingRubricUpdateDto** | [**CourseGradingRubricUpdateDto**](CourseGradingRubricUpdateDto.md)|  | [optional] |

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

