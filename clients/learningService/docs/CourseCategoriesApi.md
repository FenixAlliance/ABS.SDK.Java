# CourseCategoriesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCourseCategoryAsync**](CourseCategoriesApi.md#createCourseCategoryAsync) | **POST** /api/v2/LearningService/CourseCategories | Create a new course category |
| [**deleteCourseCategoryAsync**](CourseCategoriesApi.md#deleteCourseCategoryAsync) | **DELETE** /api/v2/LearningService/CourseCategories/{categoryId} | Delete a course category |
| [**getCourseCategoriesAsync**](CourseCategoriesApi.md#getCourseCategoriesAsync) | **GET** /api/v2/LearningService/CourseCategories | Get all course categories |
| [**getCourseCategoriesCountAsync**](CourseCategoriesApi.md#getCourseCategoriesCountAsync) | **GET** /api/v2/LearningService/CourseCategories/Count | Get course categories count |
| [**getCourseCategoryByIdAsync**](CourseCategoriesApi.md#getCourseCategoryByIdAsync) | **GET** /api/v2/LearningService/CourseCategories/{categoryId} | Get course category by ID |
| [**updateCourseCategoryAsync**](CourseCategoriesApi.md#updateCourseCategoryAsync) | **PUT** /api/v2/LearningService/CourseCategories/{categoryId} | Update a course category |


<a id="createCourseCategoryAsync"></a>
# **createCourseCategoryAsync**
> createCourseCategoryAsync(tenantId, apiVersion, xApiVersion, courseCategoryCreateDto)

Create a new course category

Creates a new course category for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseCategoriesApi apiInstance = new CourseCategoriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CourseCategoryCreateDto courseCategoryCreateDto = new CourseCategoryCreateDto(); // CourseCategoryCreateDto | 
    try {
      apiInstance.createCourseCategoryAsync(tenantId, apiVersion, xApiVersion, courseCategoryCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseCategoriesApi#createCourseCategoryAsync");
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
| **courseCategoryCreateDto** | [**CourseCategoryCreateDto**](CourseCategoryCreateDto.md)|  | [optional] |

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

<a id="deleteCourseCategoryAsync"></a>
# **deleteCourseCategoryAsync**
> deleteCourseCategoryAsync(tenantId, categoryId, apiVersion, xApiVersion)

Delete a course category

Deletes a course category for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseCategoriesApi apiInstance = new CourseCategoriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String categoryId = "categoryId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteCourseCategoryAsync(tenantId, categoryId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseCategoriesApi#deleteCourseCategoryAsync");
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
| **categoryId** | **String**|  | |
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

<a id="getCourseCategoriesAsync"></a>
# **getCourseCategoriesAsync**
> List&lt;CourseCategoryDto&gt; getCourseCategoriesAsync(tenantId, apiVersion, xApiVersion)

Get all course categories

Retrieves all course categories for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseCategoriesApi apiInstance = new CourseCategoriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<CourseCategoryDto> result = apiInstance.getCourseCategoriesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseCategoriesApi#getCourseCategoriesAsync");
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

[**List&lt;CourseCategoryDto&gt;**](CourseCategoryDto.md)

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

<a id="getCourseCategoriesCountAsync"></a>
# **getCourseCategoriesCountAsync**
> Integer getCourseCategoriesCountAsync(tenantId, apiVersion, xApiVersion)

Get course categories count

Returns the count of course categories for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseCategoriesApi apiInstance = new CourseCategoriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Integer result = apiInstance.getCourseCategoriesCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseCategoriesApi#getCourseCategoriesCountAsync");
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

<a id="getCourseCategoryByIdAsync"></a>
# **getCourseCategoryByIdAsync**
> CourseCategoryDto getCourseCategoryByIdAsync(categoryId, apiVersion, xApiVersion)

Get course category by ID

Retrieves a specific course category by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseCategoriesApi apiInstance = new CourseCategoriesApi(defaultClient);
    String categoryId = "categoryId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CourseCategoryDto result = apiInstance.getCourseCategoryByIdAsync(categoryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseCategoriesApi#getCourseCategoryByIdAsync");
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
| **categoryId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CourseCategoryDto**](CourseCategoryDto.md)

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

<a id="updateCourseCategoryAsync"></a>
# **updateCourseCategoryAsync**
> updateCourseCategoryAsync(tenantId, categoryId, apiVersion, xApiVersion, courseCategoryUpdateDto)

Update a course category

Updates an existing course category for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseCategoriesApi apiInstance = new CourseCategoriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String categoryId = "categoryId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CourseCategoryUpdateDto courseCategoryUpdateDto = new CourseCategoryUpdateDto(); // CourseCategoryUpdateDto | 
    try {
      apiInstance.updateCourseCategoryAsync(tenantId, categoryId, apiVersion, xApiVersion, courseCategoryUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseCategoriesApi#updateCourseCategoryAsync");
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
| **categoryId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **courseCategoryUpdateDto** | [**CourseCategoryUpdateDto**](CourseCategoryUpdateDto.md)|  | [optional] |

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

