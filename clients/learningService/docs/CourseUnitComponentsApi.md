# CourseUnitComponentsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCourseUnitComponentAsync**](CourseUnitComponentsApi.md#createCourseUnitComponentAsync) | **POST** /api/v2/LearningService/CourseUnitComponents | Create a new course unit component |
| [**deleteCourseUnitComponentAsync**](CourseUnitComponentsApi.md#deleteCourseUnitComponentAsync) | **DELETE** /api/v2/LearningService/CourseUnitComponents/{componentId} | Delete a course unit component |
| [**getCourseUnitComponentByIdAsync**](CourseUnitComponentsApi.md#getCourseUnitComponentByIdAsync) | **GET** /api/v2/LearningService/CourseUnitComponents/{componentId} | Get course unit component by ID |
| [**getCourseUnitComponentsAsync**](CourseUnitComponentsApi.md#getCourseUnitComponentsAsync) | **GET** /api/v2/LearningService/CourseUnitComponents | Get all course unit components |
| [**getCourseUnitComponentsCountAsync**](CourseUnitComponentsApi.md#getCourseUnitComponentsCountAsync) | **GET** /api/v2/LearningService/CourseUnitComponents/Count | Get course unit components count |
| [**updateCourseUnitComponentAsync**](CourseUnitComponentsApi.md#updateCourseUnitComponentAsync) | **PUT** /api/v2/LearningService/CourseUnitComponents/{componentId} | Update a course unit component |


<a id="createCourseUnitComponentAsync"></a>
# **createCourseUnitComponentAsync**
> createCourseUnitComponentAsync(tenantId, apiVersion, xApiVersion, courseUnitComponentCreateDto)

Create a new course unit component

Creates a new course unit component for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseUnitComponentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseUnitComponentsApi apiInstance = new CourseUnitComponentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CourseUnitComponentCreateDto courseUnitComponentCreateDto = new CourseUnitComponentCreateDto(); // CourseUnitComponentCreateDto | 
    try {
      apiInstance.createCourseUnitComponentAsync(tenantId, apiVersion, xApiVersion, courseUnitComponentCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseUnitComponentsApi#createCourseUnitComponentAsync");
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
| **courseUnitComponentCreateDto** | [**CourseUnitComponentCreateDto**](CourseUnitComponentCreateDto.md)|  | [optional] |

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

<a id="deleteCourseUnitComponentAsync"></a>
# **deleteCourseUnitComponentAsync**
> deleteCourseUnitComponentAsync(tenantId, componentId, apiVersion, xApiVersion)

Delete a course unit component

Deletes a course unit component for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseUnitComponentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseUnitComponentsApi apiInstance = new CourseUnitComponentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String componentId = "componentId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteCourseUnitComponentAsync(tenantId, componentId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseUnitComponentsApi#deleteCourseUnitComponentAsync");
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

<a id="getCourseUnitComponentByIdAsync"></a>
# **getCourseUnitComponentByIdAsync**
> CourseUnitComponentDto getCourseUnitComponentByIdAsync(componentId, apiVersion, xApiVersion)

Get course unit component by ID

Retrieves a specific course unit component by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseUnitComponentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseUnitComponentsApi apiInstance = new CourseUnitComponentsApi(defaultClient);
    String componentId = "componentId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CourseUnitComponentDto result = apiInstance.getCourseUnitComponentByIdAsync(componentId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseUnitComponentsApi#getCourseUnitComponentByIdAsync");
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

[**CourseUnitComponentDto**](CourseUnitComponentDto.md)

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

<a id="getCourseUnitComponentsAsync"></a>
# **getCourseUnitComponentsAsync**
> List&lt;CourseUnitComponentDto&gt; getCourseUnitComponentsAsync(tenantId, apiVersion, xApiVersion)

Get all course unit components

Retrieves all course unit components for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseUnitComponentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseUnitComponentsApi apiInstance = new CourseUnitComponentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<CourseUnitComponentDto> result = apiInstance.getCourseUnitComponentsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseUnitComponentsApi#getCourseUnitComponentsAsync");
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

[**List&lt;CourseUnitComponentDto&gt;**](CourseUnitComponentDto.md)

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

<a id="getCourseUnitComponentsCountAsync"></a>
# **getCourseUnitComponentsCountAsync**
> Integer getCourseUnitComponentsCountAsync(tenantId, apiVersion, xApiVersion)

Get course unit components count

Returns the count of course unit components for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseUnitComponentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseUnitComponentsApi apiInstance = new CourseUnitComponentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Integer result = apiInstance.getCourseUnitComponentsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseUnitComponentsApi#getCourseUnitComponentsCountAsync");
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

<a id="updateCourseUnitComponentAsync"></a>
# **updateCourseUnitComponentAsync**
> updateCourseUnitComponentAsync(tenantId, componentId, apiVersion, xApiVersion, courseUnitComponentUpdateDto)

Update a course unit component

Updates an existing course unit component for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseUnitComponentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseUnitComponentsApi apiInstance = new CourseUnitComponentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String componentId = "componentId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CourseUnitComponentUpdateDto courseUnitComponentUpdateDto = new CourseUnitComponentUpdateDto(); // CourseUnitComponentUpdateDto | 
    try {
      apiInstance.updateCourseUnitComponentAsync(tenantId, componentId, apiVersion, xApiVersion, courseUnitComponentUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseUnitComponentsApi#updateCourseUnitComponentAsync");
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
| **courseUnitComponentUpdateDto** | [**CourseUnitComponentUpdateDto**](CourseUnitComponentUpdateDto.md)|  | [optional] |

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

