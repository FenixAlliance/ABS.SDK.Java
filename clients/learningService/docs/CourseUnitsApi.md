# CourseUnitsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCourseUnitAsync**](CourseUnitsApi.md#createCourseUnitAsync) | **POST** /api/v2/LearningService/CourseUnits | Create a new course unit |
| [**deleteCourseUnitAsync**](CourseUnitsApi.md#deleteCourseUnitAsync) | **DELETE** /api/v2/LearningService/CourseUnits/{unitId} | Delete a course unit |
| [**getCourseUnitByIdAsync**](CourseUnitsApi.md#getCourseUnitByIdAsync) | **GET** /api/v2/LearningService/CourseUnits/{unitId} | Get course unit by ID |
| [**getCourseUnitsAsync**](CourseUnitsApi.md#getCourseUnitsAsync) | **GET** /api/v2/LearningService/CourseUnits | Get all course units |
| [**getCourseUnitsCountAsync**](CourseUnitsApi.md#getCourseUnitsCountAsync) | **GET** /api/v2/LearningService/CourseUnits/Count | Get course units count |
| [**updateCourseUnitAsync**](CourseUnitsApi.md#updateCourseUnitAsync) | **PUT** /api/v2/LearningService/CourseUnits/{unitId} | Update a course unit |


<a id="createCourseUnitAsync"></a>
# **createCourseUnitAsync**
> createCourseUnitAsync(tenantId, apiVersion, xApiVersion, courseUnitCreateDto)

Create a new course unit

Creates a new course unit for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseUnitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseUnitsApi apiInstance = new CourseUnitsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CourseUnitCreateDto courseUnitCreateDto = new CourseUnitCreateDto(); // CourseUnitCreateDto | 
    try {
      apiInstance.createCourseUnitAsync(tenantId, apiVersion, xApiVersion, courseUnitCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseUnitsApi#createCourseUnitAsync");
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
| **courseUnitCreateDto** | [**CourseUnitCreateDto**](CourseUnitCreateDto.md)|  | [optional] |

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

<a id="deleteCourseUnitAsync"></a>
# **deleteCourseUnitAsync**
> deleteCourseUnitAsync(tenantId, unitId, apiVersion, xApiVersion)

Delete a course unit

Deletes a course unit for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseUnitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseUnitsApi apiInstance = new CourseUnitsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String unitId = "unitId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteCourseUnitAsync(tenantId, unitId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseUnitsApi#deleteCourseUnitAsync");
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
| **unitId** | **String**|  | |
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

<a id="getCourseUnitByIdAsync"></a>
# **getCourseUnitByIdAsync**
> CourseUnitDto getCourseUnitByIdAsync(unitId, apiVersion, xApiVersion)

Get course unit by ID

Retrieves a specific course unit by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseUnitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseUnitsApi apiInstance = new CourseUnitsApi(defaultClient);
    String unitId = "unitId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CourseUnitDto result = apiInstance.getCourseUnitByIdAsync(unitId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseUnitsApi#getCourseUnitByIdAsync");
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
| **unitId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CourseUnitDto**](CourseUnitDto.md)

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

<a id="getCourseUnitsAsync"></a>
# **getCourseUnitsAsync**
> List&lt;CourseUnitDto&gt; getCourseUnitsAsync(tenantId, apiVersion, xApiVersion)

Get all course units

Retrieves all course units for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseUnitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseUnitsApi apiInstance = new CourseUnitsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<CourseUnitDto> result = apiInstance.getCourseUnitsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseUnitsApi#getCourseUnitsAsync");
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

[**List&lt;CourseUnitDto&gt;**](CourseUnitDto.md)

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

<a id="getCourseUnitsCountAsync"></a>
# **getCourseUnitsCountAsync**
> Integer getCourseUnitsCountAsync(tenantId, apiVersion, xApiVersion)

Get course units count

Returns the count of course units for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseUnitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseUnitsApi apiInstance = new CourseUnitsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Integer result = apiInstance.getCourseUnitsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseUnitsApi#getCourseUnitsCountAsync");
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

<a id="updateCourseUnitAsync"></a>
# **updateCourseUnitAsync**
> updateCourseUnitAsync(tenantId, unitId, apiVersion, xApiVersion, courseUnitUpdateDto)

Update a course unit

Updates an existing course unit for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseUnitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseUnitsApi apiInstance = new CourseUnitsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String unitId = "unitId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CourseUnitUpdateDto courseUnitUpdateDto = new CourseUnitUpdateDto(); // CourseUnitUpdateDto | 
    try {
      apiInstance.updateCourseUnitAsync(tenantId, unitId, apiVersion, xApiVersion, courseUnitUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseUnitsApi#updateCourseUnitAsync");
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
| **unitId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **courseUnitUpdateDto** | [**CourseUnitUpdateDto**](CourseUnitUpdateDto.md)|  | [optional] |

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

