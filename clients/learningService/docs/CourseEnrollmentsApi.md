# CourseEnrollmentsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCourseEnrollmentAsync**](CourseEnrollmentsApi.md#createCourseEnrollmentAsync) | **POST** /api/v2/LearningService/CourseEnrollments | Create a new course enrollment |
| [**deleteCourseEnrollmentAsync**](CourseEnrollmentsApi.md#deleteCourseEnrollmentAsync) | **DELETE** /api/v2/LearningService/CourseEnrollments/{courseEnrollmentId} | Delete a course enrollment |
| [**getCourseEnrollmentAsync**](CourseEnrollmentsApi.md#getCourseEnrollmentAsync) | **GET** /api/v2/LearningService/CourseEnrollments/{courseEnrollmentId} | Get course enrollment by ID |
| [**getEnrollmentsAsync**](CourseEnrollmentsApi.md#getEnrollmentsAsync) | **GET** /api/v2/LearningService/CourseEnrollments | Get all course enrollments |
| [**getEnrollmentsCountAsync**](CourseEnrollmentsApi.md#getEnrollmentsCountAsync) | **GET** /api/v2/LearningService/CourseEnrollments/Count | Get course enrollments count |
| [**getStudentCourseEnrollmentsAsync**](CourseEnrollmentsApi.md#getStudentCourseEnrollmentsAsync) | **GET** /api/v2/LearningService/CourseEnrollments/Student/{studentProfileId} | Get enrollments by student |
| [**updateCourseEnrollmentAsync**](CourseEnrollmentsApi.md#updateCourseEnrollmentAsync) | **PUT** /api/v2/LearningService/CourseEnrollments/{courseEnrollmentId} | Update a course enrollment |


<a id="createCourseEnrollmentAsync"></a>
# **createCourseEnrollmentAsync**
> createCourseEnrollmentAsync(tenantId, apiVersion, xApiVersion, courseEnrollmentCreateDto)

Create a new course enrollment

Creates a new course enrollment for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseEnrollmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseEnrollmentsApi apiInstance = new CourseEnrollmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CourseEnrollmentCreateDto courseEnrollmentCreateDto = new CourseEnrollmentCreateDto(); // CourseEnrollmentCreateDto | 
    try {
      apiInstance.createCourseEnrollmentAsync(tenantId, apiVersion, xApiVersion, courseEnrollmentCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseEnrollmentsApi#createCourseEnrollmentAsync");
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
| **courseEnrollmentCreateDto** | [**CourseEnrollmentCreateDto**](CourseEnrollmentCreateDto.md)|  | [optional] |

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

<a id="deleteCourseEnrollmentAsync"></a>
# **deleteCourseEnrollmentAsync**
> deleteCourseEnrollmentAsync(tenantId, courseEnrollmentId, apiVersion, xApiVersion)

Delete a course enrollment

Deletes a course enrollment for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseEnrollmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseEnrollmentsApi apiInstance = new CourseEnrollmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID courseEnrollmentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteCourseEnrollmentAsync(tenantId, courseEnrollmentId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseEnrollmentsApi#deleteCourseEnrollmentAsync");
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
| **courseEnrollmentId** | **UUID**|  | |
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

<a id="getCourseEnrollmentAsync"></a>
# **getCourseEnrollmentAsync**
> CourseEnrollmentDto getCourseEnrollmentAsync(tenantId, courseEnrollmentId, apiVersion, xApiVersion)

Get course enrollment by ID

Retrieves a specific course enrollment by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseEnrollmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseEnrollmentsApi apiInstance = new CourseEnrollmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID courseEnrollmentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CourseEnrollmentDto result = apiInstance.getCourseEnrollmentAsync(tenantId, courseEnrollmentId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseEnrollmentsApi#getCourseEnrollmentAsync");
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
| **courseEnrollmentId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CourseEnrollmentDto**](CourseEnrollmentDto.md)

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

<a id="getEnrollmentsAsync"></a>
# **getEnrollmentsAsync**
> List&lt;CourseEnrollmentDto&gt; getEnrollmentsAsync(tenantId, apiVersion, xApiVersion)

Get all course enrollments

Retrieves all course enrollments for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseEnrollmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseEnrollmentsApi apiInstance = new CourseEnrollmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<CourseEnrollmentDto> result = apiInstance.getEnrollmentsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseEnrollmentsApi#getEnrollmentsAsync");
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

<a id="getEnrollmentsCountAsync"></a>
# **getEnrollmentsCountAsync**
> Integer getEnrollmentsCountAsync(tenantId, apiVersion, xApiVersion)

Get course enrollments count

Returns the count of course enrollments for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseEnrollmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseEnrollmentsApi apiInstance = new CourseEnrollmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Integer result = apiInstance.getEnrollmentsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseEnrollmentsApi#getEnrollmentsCountAsync");
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

<a id="getStudentCourseEnrollmentsAsync"></a>
# **getStudentCourseEnrollmentsAsync**
> List&lt;CourseEnrollmentDto&gt; getStudentCourseEnrollmentsAsync(tenantId, studentProfileId, apiVersion, xApiVersion)

Get enrollments by student

Retrieves all enrollments for a specific student.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseEnrollmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseEnrollmentsApi apiInstance = new CourseEnrollmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID studentProfileId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<CourseEnrollmentDto> result = apiInstance.getStudentCourseEnrollmentsAsync(tenantId, studentProfileId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseEnrollmentsApi#getStudentCourseEnrollmentsAsync");
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
| **studentProfileId** | **UUID**|  | |
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

<a id="updateCourseEnrollmentAsync"></a>
# **updateCourseEnrollmentAsync**
> updateCourseEnrollmentAsync(tenantId, courseEnrollmentId, apiVersion, xApiVersion, courseEnrollmentUpdateDto)

Update a course enrollment

Updates an existing course enrollment for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseEnrollmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseEnrollmentsApi apiInstance = new CourseEnrollmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID courseEnrollmentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CourseEnrollmentUpdateDto courseEnrollmentUpdateDto = new CourseEnrollmentUpdateDto(); // CourseEnrollmentUpdateDto | 
    try {
      apiInstance.updateCourseEnrollmentAsync(tenantId, courseEnrollmentId, apiVersion, xApiVersion, courseEnrollmentUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseEnrollmentsApi#updateCourseEnrollmentAsync");
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
| **courseEnrollmentId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **courseEnrollmentUpdateDto** | [**CourseEnrollmentUpdateDto**](CourseEnrollmentUpdateDto.md)|  | [optional] |

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

