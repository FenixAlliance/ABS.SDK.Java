# CourseUpdatesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCourseUpdateAsync**](CourseUpdatesApi.md#createCourseUpdateAsync) | **POST** /api/v2/LearningService/CourseUpdates | Create a new course update |
| [**deleteCourseUpdateAsync**](CourseUpdatesApi.md#deleteCourseUpdateAsync) | **DELETE** /api/v2/LearningService/CourseUpdates/{updateId} | Delete a course update |
| [**getCourseUpdateByIdAsync**](CourseUpdatesApi.md#getCourseUpdateByIdAsync) | **GET** /api/v2/LearningService/CourseUpdates/{updateId} | Get course update by ID |
| [**getCourseUpdatesAsync**](CourseUpdatesApi.md#getCourseUpdatesAsync) | **GET** /api/v2/LearningService/CourseUpdates | Get all course updates |
| [**getCourseUpdatesCountAsync**](CourseUpdatesApi.md#getCourseUpdatesCountAsync) | **GET** /api/v2/LearningService/CourseUpdates/Count | Get course updates count |
| [**updateCourseUpdateAsync**](CourseUpdatesApi.md#updateCourseUpdateAsync) | **PUT** /api/v2/LearningService/CourseUpdates/{updateId} | Update a course update |


<a id="createCourseUpdateAsync"></a>
# **createCourseUpdateAsync**
> createCourseUpdateAsync(tenantId, apiVersion, xApiVersion, courseNewsCreateDto)

Create a new course update

Creates a new course update for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseUpdatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseUpdatesApi apiInstance = new CourseUpdatesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CourseNewsCreateDto courseNewsCreateDto = new CourseNewsCreateDto(); // CourseNewsCreateDto | 
    try {
      apiInstance.createCourseUpdateAsync(tenantId, apiVersion, xApiVersion, courseNewsCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseUpdatesApi#createCourseUpdateAsync");
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
| **courseNewsCreateDto** | [**CourseNewsCreateDto**](CourseNewsCreateDto.md)|  | [optional] |

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

<a id="deleteCourseUpdateAsync"></a>
# **deleteCourseUpdateAsync**
> deleteCourseUpdateAsync(tenantId, updateId, apiVersion, xApiVersion)

Delete a course update

Deletes a course update for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseUpdatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseUpdatesApi apiInstance = new CourseUpdatesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String updateId = "updateId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteCourseUpdateAsync(tenantId, updateId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseUpdatesApi#deleteCourseUpdateAsync");
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
| **updateId** | **String**|  | |
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

<a id="getCourseUpdateByIdAsync"></a>
# **getCourseUpdateByIdAsync**
> CourseNewsDto getCourseUpdateByIdAsync(updateId, apiVersion, xApiVersion)

Get course update by ID

Retrieves a specific course update by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseUpdatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseUpdatesApi apiInstance = new CourseUpdatesApi(defaultClient);
    String updateId = "updateId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CourseNewsDto result = apiInstance.getCourseUpdateByIdAsync(updateId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseUpdatesApi#getCourseUpdateByIdAsync");
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
| **updateId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CourseNewsDto**](CourseNewsDto.md)

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

<a id="getCourseUpdatesAsync"></a>
# **getCourseUpdatesAsync**
> List&lt;CourseNewsDto&gt; getCourseUpdatesAsync(tenantId, apiVersion, xApiVersion)

Get all course updates

Retrieves all course updates for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseUpdatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseUpdatesApi apiInstance = new CourseUpdatesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<CourseNewsDto> result = apiInstance.getCourseUpdatesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseUpdatesApi#getCourseUpdatesAsync");
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

[**List&lt;CourseNewsDto&gt;**](CourseNewsDto.md)

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

<a id="getCourseUpdatesCountAsync"></a>
# **getCourseUpdatesCountAsync**
> Integer getCourseUpdatesCountAsync(tenantId, apiVersion, xApiVersion)

Get course updates count

Returns the count of course updates for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseUpdatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseUpdatesApi apiInstance = new CourseUpdatesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Integer result = apiInstance.getCourseUpdatesCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseUpdatesApi#getCourseUpdatesCountAsync");
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

<a id="updateCourseUpdateAsync"></a>
# **updateCourseUpdateAsync**
> updateCourseUpdateAsync(tenantId, updateId, apiVersion, xApiVersion, courseNewsUpdateDto)

Update a course update

Updates an existing course update for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseUpdatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseUpdatesApi apiInstance = new CourseUpdatesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String updateId = "updateId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CourseNewsUpdateDto courseNewsUpdateDto = new CourseNewsUpdateDto(); // CourseNewsUpdateDto | 
    try {
      apiInstance.updateCourseUpdateAsync(tenantId, updateId, apiVersion, xApiVersion, courseNewsUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseUpdatesApi#updateCourseUpdateAsync");
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
| **updateId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **courseNewsUpdateDto** | [**CourseNewsUpdateDto**](CourseNewsUpdateDto.md)|  | [optional] |

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

