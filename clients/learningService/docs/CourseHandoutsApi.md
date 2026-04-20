# CourseHandoutsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCourseHandoutAsync**](CourseHandoutsApi.md#createCourseHandoutAsync) | **POST** /api/v2/LearningService/CourseHandouts | Create a course handout |
| [**deleteCourseHandoutAsync**](CourseHandoutsApi.md#deleteCourseHandoutAsync) | **DELETE** /api/v2/LearningService/CourseHandouts/{handoutId} | Delete a course handout |
| [**getCourseHandoutByIdAsync**](CourseHandoutsApi.md#getCourseHandoutByIdAsync) | **GET** /api/v2/LearningService/CourseHandouts/{handoutId} | Get course handout by ID |
| [**getCourseHandoutsAsync**](CourseHandoutsApi.md#getCourseHandoutsAsync) | **GET** /api/v2/LearningService/CourseHandouts | Get all course handouts |
| [**getCourseHandoutsCountAsync**](CourseHandoutsApi.md#getCourseHandoutsCountAsync) | **GET** /api/v2/LearningService/CourseHandouts/Count | Get course handouts count |
| [**updateCourseHandoutAsync**](CourseHandoutsApi.md#updateCourseHandoutAsync) | **PUT** /api/v2/LearningService/CourseHandouts/{handoutId} | Update a course handout |


<a id="createCourseHandoutAsync"></a>
# **createCourseHandoutAsync**
> CourseHandoutDto createCourseHandoutAsync(tenantId, apiVersion, xApiVersion, courseHandoutCreateDto)

Create a course handout

Creates a new course handout for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseHandoutsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseHandoutsApi apiInstance = new CourseHandoutsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CourseHandoutCreateDto courseHandoutCreateDto = new CourseHandoutCreateDto(); // CourseHandoutCreateDto | 
    try {
      CourseHandoutDto result = apiInstance.createCourseHandoutAsync(tenantId, apiVersion, xApiVersion, courseHandoutCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseHandoutsApi#createCourseHandoutAsync");
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
| **courseHandoutCreateDto** | [**CourseHandoutCreateDto**](CourseHandoutCreateDto.md)|  | [optional] |

### Return type

[**CourseHandoutDto**](CourseHandoutDto.md)

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

<a id="deleteCourseHandoutAsync"></a>
# **deleteCourseHandoutAsync**
> deleteCourseHandoutAsync(tenantId, handoutId, apiVersion, xApiVersion)

Delete a course handout

Deletes a course handout by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseHandoutsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseHandoutsApi apiInstance = new CourseHandoutsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String handoutId = "handoutId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteCourseHandoutAsync(tenantId, handoutId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseHandoutsApi#deleteCourseHandoutAsync");
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
| **handoutId** | **String**|  | |
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

<a id="getCourseHandoutByIdAsync"></a>
# **getCourseHandoutByIdAsync**
> CourseHandoutDto getCourseHandoutByIdAsync(handoutId, apiVersion, xApiVersion)

Get course handout by ID

Retrieves a specific course handout by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseHandoutsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseHandoutsApi apiInstance = new CourseHandoutsApi(defaultClient);
    String handoutId = "handoutId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CourseHandoutDto result = apiInstance.getCourseHandoutByIdAsync(handoutId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseHandoutsApi#getCourseHandoutByIdAsync");
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
| **handoutId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CourseHandoutDto**](CourseHandoutDto.md)

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

<a id="getCourseHandoutsAsync"></a>
# **getCourseHandoutsAsync**
> List&lt;CourseHandoutDto&gt; getCourseHandoutsAsync(tenantId, apiVersion, xApiVersion)

Get all course handouts

Retrieves all course handouts for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseHandoutsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseHandoutsApi apiInstance = new CourseHandoutsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<CourseHandoutDto> result = apiInstance.getCourseHandoutsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseHandoutsApi#getCourseHandoutsAsync");
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

[**List&lt;CourseHandoutDto&gt;**](CourseHandoutDto.md)

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

<a id="getCourseHandoutsCountAsync"></a>
# **getCourseHandoutsCountAsync**
> Integer getCourseHandoutsCountAsync(tenantId, apiVersion, xApiVersion)

Get course handouts count

Returns the count of course handouts for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseHandoutsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseHandoutsApi apiInstance = new CourseHandoutsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Integer result = apiInstance.getCourseHandoutsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseHandoutsApi#getCourseHandoutsCountAsync");
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

<a id="updateCourseHandoutAsync"></a>
# **updateCourseHandoutAsync**
> CourseHandoutDto updateCourseHandoutAsync(tenantId, handoutId, apiVersion, xApiVersion, courseHandoutUpdateDto)

Update a course handout

Updates an existing course handout.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseHandoutsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseHandoutsApi apiInstance = new CourseHandoutsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String handoutId = "handoutId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CourseHandoutUpdateDto courseHandoutUpdateDto = new CourseHandoutUpdateDto(); // CourseHandoutUpdateDto | 
    try {
      CourseHandoutDto result = apiInstance.updateCourseHandoutAsync(tenantId, handoutId, apiVersion, xApiVersion, courseHandoutUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseHandoutsApi#updateCourseHandoutAsync");
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
| **handoutId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **courseHandoutUpdateDto** | [**CourseHandoutUpdateDto**](CourseHandoutUpdateDto.md)|  | [optional] |

### Return type

[**CourseHandoutDto**](CourseHandoutDto.md)

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

