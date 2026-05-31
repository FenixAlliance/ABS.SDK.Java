# CourseForumsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCourseForumAsync**](CourseForumsApi.md#createCourseForumAsync) | **POST** /api/v2/LearningService/CourseForums | Create a course forum |
| [**deleteCourseForumAsync**](CourseForumsApi.md#deleteCourseForumAsync) | **DELETE** /api/v2/LearningService/CourseForums/{forumId} | Delete a course forum |
| [**getCourseForumByIdAsync**](CourseForumsApi.md#getCourseForumByIdAsync) | **GET** /api/v2/LearningService/CourseForums/{forumId} | Get course forum by ID |
| [**getCourseForumsAsync**](CourseForumsApi.md#getCourseForumsAsync) | **GET** /api/v2/LearningService/CourseForums | Get all course forums |
| [**getCourseForumsCountAsync**](CourseForumsApi.md#getCourseForumsCountAsync) | **GET** /api/v2/LearningService/CourseForums/Count | Get course forums count |
| [**updateCourseForumAsync**](CourseForumsApi.md#updateCourseForumAsync) | **PUT** /api/v2/LearningService/CourseForums/{forumId} | Update a course forum |


<a id="createCourseForumAsync"></a>
# **createCourseForumAsync**
> CourseForumDto createCourseForumAsync(tenantId, apiVersion, xApiVersion, courseForumCreateDto)

Create a course forum

Creates a new course forum for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseForumsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseForumsApi apiInstance = new CourseForumsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CourseForumCreateDto courseForumCreateDto = new CourseForumCreateDto(); // CourseForumCreateDto | 
    try {
      CourseForumDto result = apiInstance.createCourseForumAsync(tenantId, apiVersion, xApiVersion, courseForumCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseForumsApi#createCourseForumAsync");
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
| **courseForumCreateDto** | [**CourseForumCreateDto**](CourseForumCreateDto.md)|  | [optional] |

### Return type

[**CourseForumDto**](CourseForumDto.md)

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

<a id="deleteCourseForumAsync"></a>
# **deleteCourseForumAsync**
> deleteCourseForumAsync(tenantId, forumId, apiVersion, xApiVersion)

Delete a course forum

Deletes a course forum by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseForumsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseForumsApi apiInstance = new CourseForumsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String forumId = "forumId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteCourseForumAsync(tenantId, forumId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseForumsApi#deleteCourseForumAsync");
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
| **forumId** | **String**|  | |
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

<a id="getCourseForumByIdAsync"></a>
# **getCourseForumByIdAsync**
> CourseForumDto getCourseForumByIdAsync(forumId, apiVersion, xApiVersion)

Get course forum by ID

Retrieves a specific course forum by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseForumsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseForumsApi apiInstance = new CourseForumsApi(defaultClient);
    String forumId = "forumId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CourseForumDto result = apiInstance.getCourseForumByIdAsync(forumId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseForumsApi#getCourseForumByIdAsync");
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
| **forumId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CourseForumDto**](CourseForumDto.md)

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

<a id="getCourseForumsAsync"></a>
# **getCourseForumsAsync**
> List&lt;CourseForumDto&gt; getCourseForumsAsync(tenantId, apiVersion, xApiVersion)

Get all course forums

Retrieves all course forums for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseForumsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseForumsApi apiInstance = new CourseForumsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<CourseForumDto> result = apiInstance.getCourseForumsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseForumsApi#getCourseForumsAsync");
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

[**List&lt;CourseForumDto&gt;**](CourseForumDto.md)

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

<a id="getCourseForumsCountAsync"></a>
# **getCourseForumsCountAsync**
> Integer getCourseForumsCountAsync(tenantId, apiVersion, xApiVersion)

Get course forums count

Returns the count of course forums for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseForumsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseForumsApi apiInstance = new CourseForumsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Integer result = apiInstance.getCourseForumsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseForumsApi#getCourseForumsCountAsync");
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

<a id="updateCourseForumAsync"></a>
# **updateCourseForumAsync**
> CourseForumDto updateCourseForumAsync(tenantId, forumId, apiVersion, xApiVersion, courseForumUpdateDto)

Update a course forum

Updates an existing course forum.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseForumsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseForumsApi apiInstance = new CourseForumsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String forumId = "forumId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CourseForumUpdateDto courseForumUpdateDto = new CourseForumUpdateDto(); // CourseForumUpdateDto | 
    try {
      CourseForumDto result = apiInstance.updateCourseForumAsync(tenantId, forumId, apiVersion, xApiVersion, courseForumUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseForumsApi#updateCourseForumAsync");
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
| **forumId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **courseForumUpdateDto** | [**CourseForumUpdateDto**](CourseForumUpdateDto.md)|  | [optional] |

### Return type

[**CourseForumDto**](CourseForumDto.md)

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

