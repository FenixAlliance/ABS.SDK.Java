# CourseArticlesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCourseArticleAsync**](CourseArticlesApi.md#createCourseArticleAsync) | **POST** /api/v2/LearningService/CourseArticles | Create a new course article |
| [**deleteCourseArticleAsync**](CourseArticlesApi.md#deleteCourseArticleAsync) | **DELETE** /api/v2/LearningService/CourseArticles/{articleId} | Delete a course article |
| [**getCourseArticleByIdAsync**](CourseArticlesApi.md#getCourseArticleByIdAsync) | **GET** /api/v2/LearningService/CourseArticles/{articleId} | Get course article by ID |
| [**getCourseArticlesAsync**](CourseArticlesApi.md#getCourseArticlesAsync) | **GET** /api/v2/LearningService/CourseArticles | Get all course articles |
| [**getCourseArticlesCountAsync**](CourseArticlesApi.md#getCourseArticlesCountAsync) | **GET** /api/v2/LearningService/CourseArticles/Count | Get course articles count |
| [**patchCourseArticleAsync**](CourseArticlesApi.md#patchCourseArticleAsync) | **PATCH** /api/v2/LearningService/CourseArticles/{articleId} | Patch a course article |
| [**updateCourseArticleAsync**](CourseArticlesApi.md#updateCourseArticleAsync) | **PUT** /api/v2/LearningService/CourseArticles/{articleId} | Update a course article |


<a id="createCourseArticleAsync"></a>
# **createCourseArticleAsync**
> createCourseArticleAsync(tenantId, apiVersion, xApiVersion, courseArticleCreateDto)

Create a new course article

Creates a new course article for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseArticlesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseArticlesApi apiInstance = new CourseArticlesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CourseArticleCreateDto courseArticleCreateDto = new CourseArticleCreateDto(); // CourseArticleCreateDto | 
    try {
      apiInstance.createCourseArticleAsync(tenantId, apiVersion, xApiVersion, courseArticleCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseArticlesApi#createCourseArticleAsync");
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
| **courseArticleCreateDto** | [**CourseArticleCreateDto**](CourseArticleCreateDto.md)|  | [optional] |

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

<a id="deleteCourseArticleAsync"></a>
# **deleteCourseArticleAsync**
> deleteCourseArticleAsync(tenantId, articleId, apiVersion, xApiVersion)

Delete a course article

Deletes a course article for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseArticlesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseArticlesApi apiInstance = new CourseArticlesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String articleId = "articleId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteCourseArticleAsync(tenantId, articleId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseArticlesApi#deleteCourseArticleAsync");
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
| **articleId** | **String**|  | |
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

<a id="getCourseArticleByIdAsync"></a>
# **getCourseArticleByIdAsync**
> CourseArticleDto getCourseArticleByIdAsync(articleId, apiVersion, xApiVersion)

Get course article by ID

Retrieves a specific course article by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseArticlesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseArticlesApi apiInstance = new CourseArticlesApi(defaultClient);
    String articleId = "articleId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CourseArticleDto result = apiInstance.getCourseArticleByIdAsync(articleId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseArticlesApi#getCourseArticleByIdAsync");
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
| **articleId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CourseArticleDto**](CourseArticleDto.md)

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

<a id="getCourseArticlesAsync"></a>
# **getCourseArticlesAsync**
> List&lt;CourseArticleDto&gt; getCourseArticlesAsync(tenantId, apiVersion, xApiVersion, courseArticleDtoCollectionQueryParameters)

Get all course articles

Retrieves all course articles for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseArticlesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseArticlesApi apiInstance = new CourseArticlesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CourseArticleDtoCollectionQueryParameters courseArticleDtoCollectionQueryParameters = new CourseArticleDtoCollectionQueryParameters(); // CourseArticleDtoCollectionQueryParameters | 
    try {
      List<CourseArticleDto> result = apiInstance.getCourseArticlesAsync(tenantId, apiVersion, xApiVersion, courseArticleDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseArticlesApi#getCourseArticlesAsync");
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
| **courseArticleDtoCollectionQueryParameters** | [**CourseArticleDtoCollectionQueryParameters**](CourseArticleDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**List&lt;CourseArticleDto&gt;**](CourseArticleDto.md)

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

<a id="getCourseArticlesCountAsync"></a>
# **getCourseArticlesCountAsync**
> Integer getCourseArticlesCountAsync(tenantId, apiVersion, xApiVersion, courseArticleDtoCollectionQueryParameters)

Get course articles count

Returns the count of course articles for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseArticlesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseArticlesApi apiInstance = new CourseArticlesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CourseArticleDtoCollectionQueryParameters courseArticleDtoCollectionQueryParameters = new CourseArticleDtoCollectionQueryParameters(); // CourseArticleDtoCollectionQueryParameters | 
    try {
      Integer result = apiInstance.getCourseArticlesCountAsync(tenantId, apiVersion, xApiVersion, courseArticleDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseArticlesApi#getCourseArticlesCountAsync");
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
| **courseArticleDtoCollectionQueryParameters** | [**CourseArticleDtoCollectionQueryParameters**](CourseArticleDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

**Integer**

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

<a id="patchCourseArticleAsync"></a>
# **patchCourseArticleAsync**
> EmptyEnvelope patchCourseArticleAsync(tenantId, articleId, apiVersion, xApiVersion, patchOperation)

Patch a course article

Partially updates a course article for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseArticlesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseArticlesApi apiInstance = new CourseArticlesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String articleId = "articleId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    List<PatchOperation> patchOperation = Arrays.asList(); // List<PatchOperation> | 
    try {
      EmptyEnvelope result = apiInstance.patchCourseArticleAsync(tenantId, articleId, apiVersion, xApiVersion, patchOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseArticlesApi#patchCourseArticleAsync");
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
| **articleId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **patchOperation** | [**List&lt;PatchOperation&gt;**](PatchOperation.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

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

<a id="updateCourseArticleAsync"></a>
# **updateCourseArticleAsync**
> updateCourseArticleAsync(tenantId, articleId, apiVersion, xApiVersion, courseArticleUpdateDto)

Update a course article

Updates an existing course article for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseArticlesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseArticlesApi apiInstance = new CourseArticlesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String articleId = "articleId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CourseArticleUpdateDto courseArticleUpdateDto = new CourseArticleUpdateDto(); // CourseArticleUpdateDto | 
    try {
      apiInstance.updateCourseArticleAsync(tenantId, articleId, apiVersion, xApiVersion, courseArticleUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseArticlesApi#updateCourseArticleAsync");
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
| **articleId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **courseArticleUpdateDto** | [**CourseArticleUpdateDto**](CourseArticleUpdateDto.md)|  | [optional] |

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

