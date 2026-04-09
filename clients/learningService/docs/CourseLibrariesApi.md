# CourseLibrariesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCourseLibraryAsync**](CourseLibrariesApi.md#createCourseLibraryAsync) | **POST** /api/v2/LearningService/CourseLibraries | Create a course library |
| [**deleteCourseLibraryAsync**](CourseLibrariesApi.md#deleteCourseLibraryAsync) | **DELETE** /api/v2/LearningService/CourseLibraries/{libraryId} | Delete a course library |
| [**getCourseLibrariesAsync**](CourseLibrariesApi.md#getCourseLibrariesAsync) | **GET** /api/v2/LearningService/CourseLibraries | Get all course libraries |
| [**getCourseLibrariesCountAsync**](CourseLibrariesApi.md#getCourseLibrariesCountAsync) | **GET** /api/v2/LearningService/CourseLibraries/Count | Get course libraries count |
| [**getCourseLibraryByIdAsync**](CourseLibrariesApi.md#getCourseLibraryByIdAsync) | **GET** /api/v2/LearningService/CourseLibraries/{libraryId} | Get course library by ID |
| [**updateCourseLibraryAsync**](CourseLibrariesApi.md#updateCourseLibraryAsync) | **PUT** /api/v2/LearningService/CourseLibraries/{libraryId} | Update a course library |


<a id="createCourseLibraryAsync"></a>
# **createCourseLibraryAsync**
> CourseLibraryDto createCourseLibraryAsync(tenantId, apiVersion, xApiVersion, courseLibraryCreateDto)

Create a course library

Creates a new course library for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseLibrariesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseLibrariesApi apiInstance = new CourseLibrariesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CourseLibraryCreateDto courseLibraryCreateDto = new CourseLibraryCreateDto(); // CourseLibraryCreateDto | 
    try {
      CourseLibraryDto result = apiInstance.createCourseLibraryAsync(tenantId, apiVersion, xApiVersion, courseLibraryCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseLibrariesApi#createCourseLibraryAsync");
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
| **courseLibraryCreateDto** | [**CourseLibraryCreateDto**](CourseLibraryCreateDto.md)|  | [optional] |

### Return type

[**CourseLibraryDto**](CourseLibraryDto.md)

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

<a id="deleteCourseLibraryAsync"></a>
# **deleteCourseLibraryAsync**
> deleteCourseLibraryAsync(tenantId, libraryId, apiVersion, xApiVersion)

Delete a course library

Deletes a course library by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseLibrariesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseLibrariesApi apiInstance = new CourseLibrariesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String libraryId = "libraryId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteCourseLibraryAsync(tenantId, libraryId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseLibrariesApi#deleteCourseLibraryAsync");
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
| **libraryId** | **String**|  | |
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

<a id="getCourseLibrariesAsync"></a>
# **getCourseLibrariesAsync**
> List&lt;CourseLibraryDto&gt; getCourseLibrariesAsync(tenantId, apiVersion, xApiVersion)

Get all course libraries

Retrieves all course libraries for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseLibrariesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseLibrariesApi apiInstance = new CourseLibrariesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<CourseLibraryDto> result = apiInstance.getCourseLibrariesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseLibrariesApi#getCourseLibrariesAsync");
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

[**List&lt;CourseLibraryDto&gt;**](CourseLibraryDto.md)

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

<a id="getCourseLibrariesCountAsync"></a>
# **getCourseLibrariesCountAsync**
> Integer getCourseLibrariesCountAsync(tenantId, apiVersion, xApiVersion)

Get course libraries count

Returns the count of course libraries for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseLibrariesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseLibrariesApi apiInstance = new CourseLibrariesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Integer result = apiInstance.getCourseLibrariesCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseLibrariesApi#getCourseLibrariesCountAsync");
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

<a id="getCourseLibraryByIdAsync"></a>
# **getCourseLibraryByIdAsync**
> CourseLibraryDto getCourseLibraryByIdAsync(libraryId, apiVersion, xApiVersion)

Get course library by ID

Retrieves a specific course library by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseLibrariesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseLibrariesApi apiInstance = new CourseLibrariesApi(defaultClient);
    String libraryId = "libraryId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CourseLibraryDto result = apiInstance.getCourseLibraryByIdAsync(libraryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseLibrariesApi#getCourseLibraryByIdAsync");
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
| **libraryId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CourseLibraryDto**](CourseLibraryDto.md)

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

<a id="updateCourseLibraryAsync"></a>
# **updateCourseLibraryAsync**
> CourseLibraryDto updateCourseLibraryAsync(tenantId, libraryId, apiVersion, xApiVersion, courseLibraryUpdateDto)

Update a course library

Updates an existing course library.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseLibrariesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseLibrariesApi apiInstance = new CourseLibrariesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String libraryId = "libraryId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CourseLibraryUpdateDto courseLibraryUpdateDto = new CourseLibraryUpdateDto(); // CourseLibraryUpdateDto | 
    try {
      CourseLibraryDto result = apiInstance.updateCourseLibraryAsync(tenantId, libraryId, apiVersion, xApiVersion, courseLibraryUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseLibrariesApi#updateCourseLibraryAsync");
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
| **libraryId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **courseLibraryUpdateDto** | [**CourseLibraryUpdateDto**](CourseLibraryUpdateDto.md)|  | [optional] |

### Return type

[**CourseLibraryDto**](CourseLibraryDto.md)

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

