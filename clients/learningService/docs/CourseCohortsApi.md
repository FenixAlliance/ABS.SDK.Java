# CourseCohortsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCourseCohortAsync**](CourseCohortsApi.md#createCourseCohortAsync) | **POST** /api/v2/LearningService/CourseCohorts | Create a new course cohort |
| [**deleteCourseCohortAsync**](CourseCohortsApi.md#deleteCourseCohortAsync) | **DELETE** /api/v2/LearningService/CourseCohorts/{cohortId} | Delete a course cohort |
| [**getCourseCohortByIdAsync**](CourseCohortsApi.md#getCourseCohortByIdAsync) | **GET** /api/v2/LearningService/CourseCohorts/{cohortId} | Get course cohort by ID |
| [**getCourseCohortsAsync**](CourseCohortsApi.md#getCourseCohortsAsync) | **GET** /api/v2/LearningService/CourseCohorts | Get all course cohorts |
| [**getCourseCohortsCountAsync**](CourseCohortsApi.md#getCourseCohortsCountAsync) | **GET** /api/v2/LearningService/CourseCohorts/Count | Get course cohorts count |
| [**updateCourseCohortAsync**](CourseCohortsApi.md#updateCourseCohortAsync) | **PUT** /api/v2/LearningService/CourseCohorts/{cohortId} | Update a course cohort |


<a id="createCourseCohortAsync"></a>
# **createCourseCohortAsync**
> createCourseCohortAsync(tenantId, apiVersion, xApiVersion, courseCohortCreateDto)

Create a new course cohort

Creates a new course cohort for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseCohortsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseCohortsApi apiInstance = new CourseCohortsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CourseCohortCreateDto courseCohortCreateDto = new CourseCohortCreateDto(); // CourseCohortCreateDto | 
    try {
      apiInstance.createCourseCohortAsync(tenantId, apiVersion, xApiVersion, courseCohortCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseCohortsApi#createCourseCohortAsync");
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
| **courseCohortCreateDto** | [**CourseCohortCreateDto**](CourseCohortCreateDto.md)|  | [optional] |

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

<a id="deleteCourseCohortAsync"></a>
# **deleteCourseCohortAsync**
> deleteCourseCohortAsync(tenantId, cohortId, apiVersion, xApiVersion)

Delete a course cohort

Deletes a course cohort for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseCohortsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseCohortsApi apiInstance = new CourseCohortsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String cohortId = "cohortId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteCourseCohortAsync(tenantId, cohortId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseCohortsApi#deleteCourseCohortAsync");
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
| **cohortId** | **String**|  | |
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

<a id="getCourseCohortByIdAsync"></a>
# **getCourseCohortByIdAsync**
> CourseCohortDto getCourseCohortByIdAsync(cohortId, apiVersion, xApiVersion)

Get course cohort by ID

Retrieves a specific course cohort by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseCohortsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseCohortsApi apiInstance = new CourseCohortsApi(defaultClient);
    String cohortId = "cohortId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CourseCohortDto result = apiInstance.getCourseCohortByIdAsync(cohortId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseCohortsApi#getCourseCohortByIdAsync");
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
| **cohortId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CourseCohortDto**](CourseCohortDto.md)

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

<a id="getCourseCohortsAsync"></a>
# **getCourseCohortsAsync**
> List&lt;CourseCohortDto&gt; getCourseCohortsAsync(tenantId, apiVersion, xApiVersion)

Get all course cohorts

Retrieves all course cohorts for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseCohortsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseCohortsApi apiInstance = new CourseCohortsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<CourseCohortDto> result = apiInstance.getCourseCohortsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseCohortsApi#getCourseCohortsAsync");
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

[**List&lt;CourseCohortDto&gt;**](CourseCohortDto.md)

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

<a id="getCourseCohortsCountAsync"></a>
# **getCourseCohortsCountAsync**
> Integer getCourseCohortsCountAsync(tenantId, apiVersion, xApiVersion)

Get course cohorts count

Returns the count of course cohorts for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseCohortsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseCohortsApi apiInstance = new CourseCohortsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Integer result = apiInstance.getCourseCohortsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseCohortsApi#getCourseCohortsCountAsync");
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

<a id="updateCourseCohortAsync"></a>
# **updateCourseCohortAsync**
> updateCourseCohortAsync(tenantId, cohortId, apiVersion, xApiVersion, courseCohortUpdateDto)

Update a course cohort

Updates an existing course cohort for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseCohortsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseCohortsApi apiInstance = new CourseCohortsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String cohortId = "cohortId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CourseCohortUpdateDto courseCohortUpdateDto = new CourseCohortUpdateDto(); // CourseCohortUpdateDto | 
    try {
      apiInstance.updateCourseCohortAsync(tenantId, cohortId, apiVersion, xApiVersion, courseCohortUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseCohortsApi#updateCourseCohortAsync");
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
| **cohortId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **courseCohortUpdateDto** | [**CourseCohortUpdateDto**](CourseCohortUpdateDto.md)|  | [optional] |

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

