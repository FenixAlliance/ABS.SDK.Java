# CourseAssignmentComponentsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCourseAssignmentComponentAsync**](CourseAssignmentComponentsApi.md#createCourseAssignmentComponentAsync) | **POST** /api/v2/LearningService/CourseAssignmentComponents | Create a course assignment component |
| [**deleteCourseAssignmentComponentAsync**](CourseAssignmentComponentsApi.md#deleteCourseAssignmentComponentAsync) | **DELETE** /api/v2/LearningService/CourseAssignmentComponents/{componentId} | Delete a course assignment component |
| [**getCourseAssignmentComponentByIdAsync**](CourseAssignmentComponentsApi.md#getCourseAssignmentComponentByIdAsync) | **GET** /api/v2/LearningService/CourseAssignmentComponents/{componentId} | Get course assignment component by ID |
| [**getCourseAssignmentComponentsAsync**](CourseAssignmentComponentsApi.md#getCourseAssignmentComponentsAsync) | **GET** /api/v2/LearningService/CourseAssignmentComponents | Get all course assignment components |
| [**getCourseAssignmentComponentsCountAsync**](CourseAssignmentComponentsApi.md#getCourseAssignmentComponentsCountAsync) | **GET** /api/v2/LearningService/CourseAssignmentComponents/Count | Get course assignment components count |
| [**updateCourseAssignmentComponentAsync**](CourseAssignmentComponentsApi.md#updateCourseAssignmentComponentAsync) | **PUT** /api/v2/LearningService/CourseAssignmentComponents/{componentId} | Update a course assignment component |


<a id="createCourseAssignmentComponentAsync"></a>
# **createCourseAssignmentComponentAsync**
> createCourseAssignmentComponentAsync(tenantId, apiVersion, xApiVersion, courseAssignmentComponentCreateDto)

Create a course assignment component

Creates a new course assignment component for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseAssignmentComponentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseAssignmentComponentsApi apiInstance = new CourseAssignmentComponentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CourseAssignmentComponentCreateDto courseAssignmentComponentCreateDto = new CourseAssignmentComponentCreateDto(); // CourseAssignmentComponentCreateDto | 
    try {
      apiInstance.createCourseAssignmentComponentAsync(tenantId, apiVersion, xApiVersion, courseAssignmentComponentCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseAssignmentComponentsApi#createCourseAssignmentComponentAsync");
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
| **courseAssignmentComponentCreateDto** | [**CourseAssignmentComponentCreateDto**](CourseAssignmentComponentCreateDto.md)|  | [optional] |

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

<a id="deleteCourseAssignmentComponentAsync"></a>
# **deleteCourseAssignmentComponentAsync**
> deleteCourseAssignmentComponentAsync(tenantId, componentId, apiVersion, xApiVersion)

Delete a course assignment component

Deletes a course assignment component by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseAssignmentComponentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseAssignmentComponentsApi apiInstance = new CourseAssignmentComponentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String componentId = "componentId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteCourseAssignmentComponentAsync(tenantId, componentId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseAssignmentComponentsApi#deleteCourseAssignmentComponentAsync");
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
| **componentId** | **String**|  | |
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

<a id="getCourseAssignmentComponentByIdAsync"></a>
# **getCourseAssignmentComponentByIdAsync**
> CourseAssignmentComponentDto getCourseAssignmentComponentByIdAsync(componentId, apiVersion, xApiVersion)

Get course assignment component by ID

Retrieves a specific course assignment component by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseAssignmentComponentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseAssignmentComponentsApi apiInstance = new CourseAssignmentComponentsApi(defaultClient);
    String componentId = "componentId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CourseAssignmentComponentDto result = apiInstance.getCourseAssignmentComponentByIdAsync(componentId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseAssignmentComponentsApi#getCourseAssignmentComponentByIdAsync");
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
| **componentId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CourseAssignmentComponentDto**](CourseAssignmentComponentDto.md)

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

<a id="getCourseAssignmentComponentsAsync"></a>
# **getCourseAssignmentComponentsAsync**
> List&lt;CourseAssignmentComponentDto&gt; getCourseAssignmentComponentsAsync(tenantId, apiVersion, xApiVersion)

Get all course assignment components

Retrieves all course assignment components for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseAssignmentComponentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseAssignmentComponentsApi apiInstance = new CourseAssignmentComponentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<CourseAssignmentComponentDto> result = apiInstance.getCourseAssignmentComponentsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseAssignmentComponentsApi#getCourseAssignmentComponentsAsync");
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

[**List&lt;CourseAssignmentComponentDto&gt;**](CourseAssignmentComponentDto.md)

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

<a id="getCourseAssignmentComponentsCountAsync"></a>
# **getCourseAssignmentComponentsCountAsync**
> Integer getCourseAssignmentComponentsCountAsync(tenantId, apiVersion, xApiVersion)

Get course assignment components count

Returns the count of course assignment components for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseAssignmentComponentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseAssignmentComponentsApi apiInstance = new CourseAssignmentComponentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Integer result = apiInstance.getCourseAssignmentComponentsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseAssignmentComponentsApi#getCourseAssignmentComponentsCountAsync");
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

<a id="updateCourseAssignmentComponentAsync"></a>
# **updateCourseAssignmentComponentAsync**
> updateCourseAssignmentComponentAsync(tenantId, componentId, apiVersion, xApiVersion, courseAssignmentComponentUpdateDto)

Update a course assignment component

Updates an existing course assignment component.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseAssignmentComponentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseAssignmentComponentsApi apiInstance = new CourseAssignmentComponentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String componentId = "componentId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CourseAssignmentComponentUpdateDto courseAssignmentComponentUpdateDto = new CourseAssignmentComponentUpdateDto(); // CourseAssignmentComponentUpdateDto | 
    try {
      apiInstance.updateCourseAssignmentComponentAsync(tenantId, componentId, apiVersion, xApiVersion, courseAssignmentComponentUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseAssignmentComponentsApi#updateCourseAssignmentComponentAsync");
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
| **componentId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **courseAssignmentComponentUpdateDto** | [**CourseAssignmentComponentUpdateDto**](CourseAssignmentComponentUpdateDto.md)|  | [optional] |

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

