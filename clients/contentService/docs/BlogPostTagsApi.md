# BlogPostTagsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**countBlogPostTagsAsync**](BlogPostTagsApi.md#countBlogPostTagsAsync) | **GET** /api/v2/ContentService/BlogPostTags/Count | Count blog post tags |
| [**createBlogPostTagAsync**](BlogPostTagsApi.md#createBlogPostTagAsync) | **POST** /api/v2/ContentService/BlogPostTags | Create a blog post tag |
| [**deleteBlogPostTagAsync**](BlogPostTagsApi.md#deleteBlogPostTagAsync) | **DELETE** /api/v2/ContentService/BlogPostTags/{blogPostTagId} | Delete a blog post tag |
| [**getBlogPostTagByIdAsync**](BlogPostTagsApi.md#getBlogPostTagByIdAsync) | **GET** /api/v2/ContentService/BlogPostTags/{blogPostTagId} | Get blog post tag by ID |
| [**getBlogPostTagsAsync**](BlogPostTagsApi.md#getBlogPostTagsAsync) | **GET** /api/v2/ContentService/BlogPostTags | Get blog post tags |
| [**updateBlogPostTagAsync**](BlogPostTagsApi.md#updateBlogPostTagAsync) | **PUT** /api/v2/ContentService/BlogPostTags/{blogPostTagId} | Update a blog post tag |


<a id="countBlogPostTagsAsync"></a>
# **countBlogPostTagsAsync**
> Int32Envelope countBlogPostTagsAsync(tenantId, apiVersion, xApiVersion)

Count blog post tags

Counts all blog post tags for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlogPostTagsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BlogPostTagsApi apiInstance = new BlogPostTagsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.countBlogPostTagsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlogPostTagsApi#countBlogPostTagsAsync");
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

<a id="createBlogPostTagAsync"></a>
# **createBlogPostTagAsync**
> EmptyEnvelope createBlogPostTagAsync(tenantId, apiVersion, xApiVersion, blogPostTagCreateDto)

Create a blog post tag

Creates a new blog post tag for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlogPostTagsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BlogPostTagsApi apiInstance = new BlogPostTagsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    BlogPostTagCreateDto blogPostTagCreateDto = new BlogPostTagCreateDto(); // BlogPostTagCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createBlogPostTagAsync(tenantId, apiVersion, xApiVersion, blogPostTagCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlogPostTagsApi#createBlogPostTagAsync");
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
| **blogPostTagCreateDto** | [**BlogPostTagCreateDto**](BlogPostTagCreateDto.md)|  | [optional] |

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

<a id="deleteBlogPostTagAsync"></a>
# **deleteBlogPostTagAsync**
> EmptyEnvelope deleteBlogPostTagAsync(tenantId, blogPostTagId, apiVersion, xApiVersion)

Delete a blog post tag

Deletes a blog post tag for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlogPostTagsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BlogPostTagsApi apiInstance = new BlogPostTagsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID blogPostTagId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteBlogPostTagAsync(tenantId, blogPostTagId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlogPostTagsApi#deleteBlogPostTagAsync");
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
| **blogPostTagId** | **UUID**|  | |
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

<a id="getBlogPostTagByIdAsync"></a>
# **getBlogPostTagByIdAsync**
> BlogPostTagDtoEnvelope getBlogPostTagByIdAsync(tenantId, blogPostTagId, apiVersion, xApiVersion)

Get blog post tag by ID

Retrieves a specific blog post tag by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlogPostTagsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BlogPostTagsApi apiInstance = new BlogPostTagsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID blogPostTagId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      BlogPostTagDtoEnvelope result = apiInstance.getBlogPostTagByIdAsync(tenantId, blogPostTagId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlogPostTagsApi#getBlogPostTagByIdAsync");
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
| **blogPostTagId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**BlogPostTagDtoEnvelope**](BlogPostTagDtoEnvelope.md)

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

<a id="getBlogPostTagsAsync"></a>
# **getBlogPostTagsAsync**
> BlogPostTagDtoListEnvelope getBlogPostTagsAsync(tenantId, apiVersion, xApiVersion)

Get blog post tags

Retrieves all blog post tags for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlogPostTagsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BlogPostTagsApi apiInstance = new BlogPostTagsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      BlogPostTagDtoListEnvelope result = apiInstance.getBlogPostTagsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlogPostTagsApi#getBlogPostTagsAsync");
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

[**BlogPostTagDtoListEnvelope**](BlogPostTagDtoListEnvelope.md)

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

<a id="updateBlogPostTagAsync"></a>
# **updateBlogPostTagAsync**
> EmptyEnvelope updateBlogPostTagAsync(tenantId, blogPostTagId, apiVersion, xApiVersion, blogPostTagUpdateDto)

Update a blog post tag

Updates an existing blog post tag for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlogPostTagsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BlogPostTagsApi apiInstance = new BlogPostTagsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID blogPostTagId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    BlogPostTagUpdateDto blogPostTagUpdateDto = new BlogPostTagUpdateDto(); // BlogPostTagUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateBlogPostTagAsync(tenantId, blogPostTagId, apiVersion, xApiVersion, blogPostTagUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlogPostTagsApi#updateBlogPostTagAsync");
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
| **blogPostTagId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **blogPostTagUpdateDto** | [**BlogPostTagUpdateDto**](BlogPostTagUpdateDto.md)|  | [optional] |

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

