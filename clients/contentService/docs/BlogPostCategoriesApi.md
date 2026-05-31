# BlogPostCategoriesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**countBlogPostCategoriesAsync**](BlogPostCategoriesApi.md#countBlogPostCategoriesAsync) | **GET** /api/v2/ContentService/BlogPostCategories/Count | Count blog post categories |
| [**createBlogPostCategoryAsync**](BlogPostCategoriesApi.md#createBlogPostCategoryAsync) | **POST** /api/v2/ContentService/BlogPostCategories | Create a blog post category |
| [**deleteBlogPostCategoryAsync**](BlogPostCategoriesApi.md#deleteBlogPostCategoryAsync) | **DELETE** /api/v2/ContentService/BlogPostCategories/{blogPostCategoryId} | Delete a blog post category |
| [**getBlogPostCategoriesAsync**](BlogPostCategoriesApi.md#getBlogPostCategoriesAsync) | **GET** /api/v2/ContentService/BlogPostCategories | Get blog post categories |
| [**getBlogPostCategoryByIdAsync**](BlogPostCategoriesApi.md#getBlogPostCategoryByIdAsync) | **GET** /api/v2/ContentService/BlogPostCategories/{blogPostCategoryId} | Get blog post category by ID |
| [**updateBlogPostCategoryAsync**](BlogPostCategoriesApi.md#updateBlogPostCategoryAsync) | **PUT** /api/v2/ContentService/BlogPostCategories/{blogPostCategoryId} | Update a blog post category |


<a id="countBlogPostCategoriesAsync"></a>
# **countBlogPostCategoriesAsync**
> Int32Envelope countBlogPostCategoriesAsync(tenantId, apiVersion, xApiVersion)

Count blog post categories

Counts all blog post categories for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlogPostCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BlogPostCategoriesApi apiInstance = new BlogPostCategoriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.countBlogPostCategoriesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlogPostCategoriesApi#countBlogPostCategoriesAsync");
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

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="createBlogPostCategoryAsync"></a>
# **createBlogPostCategoryAsync**
> EmptyEnvelope createBlogPostCategoryAsync(tenantId, apiVersion, xApiVersion, blogPostCategoryCreateDto)

Create a blog post category

Creates a new blog post category for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlogPostCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BlogPostCategoriesApi apiInstance = new BlogPostCategoriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    BlogPostCategoryCreateDto blogPostCategoryCreateDto = new BlogPostCategoryCreateDto(); // BlogPostCategoryCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createBlogPostCategoryAsync(tenantId, apiVersion, xApiVersion, blogPostCategoryCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlogPostCategoriesApi#createBlogPostCategoryAsync");
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
| **blogPostCategoryCreateDto** | [**BlogPostCategoryCreateDto**](BlogPostCategoryCreateDto.md)|  | [optional] |

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
| **401** | Unauthorized |  -  |
| **201** | Created |  -  |

<a id="deleteBlogPostCategoryAsync"></a>
# **deleteBlogPostCategoryAsync**
> EmptyEnvelope deleteBlogPostCategoryAsync(tenantId, blogPostCategoryId, apiVersion, xApiVersion)

Delete a blog post category

Deletes a blog post category for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlogPostCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BlogPostCategoriesApi apiInstance = new BlogPostCategoriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID blogPostCategoryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteBlogPostCategoryAsync(tenantId, blogPostCategoryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlogPostCategoriesApi#deleteBlogPostCategoryAsync");
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
| **blogPostCategoryId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getBlogPostCategoriesAsync"></a>
# **getBlogPostCategoriesAsync**
> BlogPostCategoryDtoListEnvelope getBlogPostCategoriesAsync(tenantId, apiVersion, xApiVersion)

Get blog post categories

Retrieves all blog post categories for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlogPostCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BlogPostCategoriesApi apiInstance = new BlogPostCategoriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      BlogPostCategoryDtoListEnvelope result = apiInstance.getBlogPostCategoriesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlogPostCategoriesApi#getBlogPostCategoriesAsync");
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

[**BlogPostCategoryDtoListEnvelope**](BlogPostCategoryDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getBlogPostCategoryByIdAsync"></a>
# **getBlogPostCategoryByIdAsync**
> BlogPostCategoryDtoEnvelope getBlogPostCategoryByIdAsync(tenantId, blogPostCategoryId, apiVersion, xApiVersion)

Get blog post category by ID

Retrieves a specific blog post category by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlogPostCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BlogPostCategoriesApi apiInstance = new BlogPostCategoriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID blogPostCategoryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      BlogPostCategoryDtoEnvelope result = apiInstance.getBlogPostCategoryByIdAsync(tenantId, blogPostCategoryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlogPostCategoriesApi#getBlogPostCategoryByIdAsync");
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
| **blogPostCategoryId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**BlogPostCategoryDtoEnvelope**](BlogPostCategoryDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="updateBlogPostCategoryAsync"></a>
# **updateBlogPostCategoryAsync**
> EmptyEnvelope updateBlogPostCategoryAsync(tenantId, blogPostCategoryId, apiVersion, xApiVersion, blogPostCategoryUpdateDto)

Update a blog post category

Updates an existing blog post category for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlogPostCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BlogPostCategoriesApi apiInstance = new BlogPostCategoriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID blogPostCategoryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    BlogPostCategoryUpdateDto blogPostCategoryUpdateDto = new BlogPostCategoryUpdateDto(); // BlogPostCategoryUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateBlogPostCategoryAsync(tenantId, blogPostCategoryId, apiVersion, xApiVersion, blogPostCategoryUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlogPostCategoriesApi#updateBlogPostCategoryAsync");
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
| **blogPostCategoryId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **blogPostCategoryUpdateDto** | [**BlogPostCategoryUpdateDto**](BlogPostCategoryUpdateDto.md)|  | [optional] |

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
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

