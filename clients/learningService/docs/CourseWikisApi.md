# CourseWikisApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCourseWikiAsync**](CourseWikisApi.md#createCourseWikiAsync) | **POST** /api/v2/LearningService/CourseWikis | Create a new course wiki |
| [**deleteCourseWikiAsync**](CourseWikisApi.md#deleteCourseWikiAsync) | **DELETE** /api/v2/LearningService/CourseWikis/{wikiId} | Delete a course wiki |
| [**getCourseWikiByIdAsync**](CourseWikisApi.md#getCourseWikiByIdAsync) | **GET** /api/v2/LearningService/CourseWikis/{wikiId} | Get course wiki by ID |
| [**getCourseWikisAsync**](CourseWikisApi.md#getCourseWikisAsync) | **GET** /api/v2/LearningService/CourseWikis | Get all course wikis |
| [**getCourseWikisCountAsync**](CourseWikisApi.md#getCourseWikisCountAsync) | **GET** /api/v2/LearningService/CourseWikis/Count | Get course wikis count |
| [**updateCourseWikiAsync**](CourseWikisApi.md#updateCourseWikiAsync) | **PUT** /api/v2/LearningService/CourseWikis/{wikiId} | Update a course wiki |


<a id="createCourseWikiAsync"></a>
# **createCourseWikiAsync**
> createCourseWikiAsync(tenantId, apiVersion, xApiVersion, courseWikiCreateDto)

Create a new course wiki

Creates a new course wiki for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseWikisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseWikisApi apiInstance = new CourseWikisApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CourseWikiCreateDto courseWikiCreateDto = new CourseWikiCreateDto(); // CourseWikiCreateDto | 
    try {
      apiInstance.createCourseWikiAsync(tenantId, apiVersion, xApiVersion, courseWikiCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseWikisApi#createCourseWikiAsync");
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
| **courseWikiCreateDto** | [**CourseWikiCreateDto**](CourseWikiCreateDto.md)|  | [optional] |

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

<a id="deleteCourseWikiAsync"></a>
# **deleteCourseWikiAsync**
> deleteCourseWikiAsync(tenantId, wikiId, apiVersion, xApiVersion)

Delete a course wiki

Deletes a course wiki for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseWikisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseWikisApi apiInstance = new CourseWikisApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String wikiId = "wikiId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteCourseWikiAsync(tenantId, wikiId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseWikisApi#deleteCourseWikiAsync");
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
| **wikiId** | **String**|  | |
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

<a id="getCourseWikiByIdAsync"></a>
# **getCourseWikiByIdAsync**
> CourseWikiDto getCourseWikiByIdAsync(wikiId, apiVersion, xApiVersion)

Get course wiki by ID

Retrieves a specific course wiki by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseWikisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseWikisApi apiInstance = new CourseWikisApi(defaultClient);
    String wikiId = "wikiId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CourseWikiDto result = apiInstance.getCourseWikiByIdAsync(wikiId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseWikisApi#getCourseWikiByIdAsync");
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
| **wikiId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CourseWikiDto**](CourseWikiDto.md)

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

<a id="getCourseWikisAsync"></a>
# **getCourseWikisAsync**
> List&lt;CourseWikiDto&gt; getCourseWikisAsync(tenantId, apiVersion, xApiVersion)

Get all course wikis

Retrieves all course wikis for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseWikisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseWikisApi apiInstance = new CourseWikisApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<CourseWikiDto> result = apiInstance.getCourseWikisAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseWikisApi#getCourseWikisAsync");
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

[**List&lt;CourseWikiDto&gt;**](CourseWikiDto.md)

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

<a id="getCourseWikisCountAsync"></a>
# **getCourseWikisCountAsync**
> Integer getCourseWikisCountAsync(tenantId, apiVersion, xApiVersion)

Get course wikis count

Returns the count of course wikis for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseWikisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseWikisApi apiInstance = new CourseWikisApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Integer result = apiInstance.getCourseWikisCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseWikisApi#getCourseWikisCountAsync");
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

<a id="updateCourseWikiAsync"></a>
# **updateCourseWikiAsync**
> updateCourseWikiAsync(tenantId, wikiId, apiVersion, xApiVersion, courseWikiUpdateDto)

Update a course wiki

Updates an existing course wiki for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseWikisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseWikisApi apiInstance = new CourseWikisApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String wikiId = "wikiId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CourseWikiUpdateDto courseWikiUpdateDto = new CourseWikiUpdateDto(); // CourseWikiUpdateDto | 
    try {
      apiInstance.updateCourseWikiAsync(tenantId, wikiId, apiVersion, xApiVersion, courseWikiUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseWikisApi#updateCourseWikiAsync");
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
| **wikiId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **courseWikiUpdateDto** | [**CourseWikiUpdateDto**](CourseWikiUpdateDto.md)|  | [optional] |

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

