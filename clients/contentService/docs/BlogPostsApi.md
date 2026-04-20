# BlogPostsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBlogPostAsync**](BlogPostsApi.md#createBlogPostAsync) | **POST** /api/v2/ContentService/BlogPosts | Create a new blog post |
| [**createCategoryForBlogPostAsync**](BlogPostsApi.md#createCategoryForBlogPostAsync) | **POST** /api/v2/ContentService/BlogPosts/{blogPostId}/Categories | Create a category for a blog post |
| [**createCommentForBlogPostAsync**](BlogPostsApi.md#createCommentForBlogPostAsync) | **POST** /api/v2/ContentService/BlogPosts/{blogPostId}/Comments | Create a comment for a blog post |
| [**createTagForBlogPostAsync**](BlogPostsApi.md#createTagForBlogPostAsync) | **POST** /api/v2/ContentService/BlogPosts/{blogPostId}/Tags | Create a tag for a blog post |
| [**deleteBlogPostAsync**](BlogPostsApi.md#deleteBlogPostAsync) | **DELETE** /api/v2/ContentService/BlogPosts/{blogPostId} | Delete a blog post |
| [**deleteCommentFromBlogPostAsync**](BlogPostsApi.md#deleteCommentFromBlogPostAsync) | **DELETE** /api/v2/ContentService/BlogPosts/{blogPostId}/Comments/{commentId} | Delete a blog post comment |
| [**getBlogPostByIdAsync**](BlogPostsApi.md#getBlogPostByIdAsync) | **GET** /api/v2/ContentService/BlogPosts/{blogPostId} | Get a blog post by ID |
| [**getBlogPostsAsync**](BlogPostsApi.md#getBlogPostsAsync) | **GET** /api/v2/ContentService/BlogPosts | Retrieve a list of blog posts |
| [**getBlogPostsCountAsync**](BlogPostsApi.md#getBlogPostsCountAsync) | **GET** /api/v2/ContentService/BlogPosts/Count | Get the count of blog posts |
| [**getCategoriesForBlogPostAsync**](BlogPostsApi.md#getCategoriesForBlogPostAsync) | **GET** /api/v2/ContentService/BlogPosts/{blogPostId}/Categories | Get categories for a blog post |
| [**getCommentsForBlogPostAsync**](BlogPostsApi.md#getCommentsForBlogPostAsync) | **GET** /api/v2/ContentService/BlogPosts/{blogPostId}/Comments | Get comments for a blog post |
| [**getRepliesForCommentAsync**](BlogPostsApi.md#getRepliesForCommentAsync) | **GET** /api/v2/ContentService/BlogPosts/{blogPostId}/Comments/{commentId}/Replies | Get replies for a comment |
| [**getTagsForBlogPostAsync**](BlogPostsApi.md#getTagsForBlogPostAsync) | **GET** /api/v2/ContentService/BlogPosts/{blogPostId}/Tags | Get tags for a blog post |
| [**relateCategoryToBlogPostAsync**](BlogPostsApi.md#relateCategoryToBlogPostAsync) | **POST** /api/v2/ContentService/BlogPosts/{blogPostId}/Categories/{categoryId} | Relate an existing category to a blog post |
| [**relateTagToBlogPostAsync**](BlogPostsApi.md#relateTagToBlogPostAsync) | **POST** /api/v2/ContentService/BlogPosts/{blogPostId}/Tags/{tagId} | Relate an existing tag to a blog post |
| [**replyToCommentAsync**](BlogPostsApi.md#replyToCommentAsync) | **POST** /api/v2/ContentService/BlogPosts/{blogPostId}/Comments/{commentId}/Reply | Reply to a blog post comment |
| [**unrelateCategoryFromBlogPostAsync**](BlogPostsApi.md#unrelateCategoryFromBlogPostAsync) | **DELETE** /api/v2/ContentService/BlogPosts/{blogPostId}/Categories/{categoryId} | Remove a category from a blog post |
| [**unrelateTagFromBlogPostAsync**](BlogPostsApi.md#unrelateTagFromBlogPostAsync) | **DELETE** /api/v2/ContentService/BlogPosts/{blogPostId}/Tags/{tagId} | Remove a tag from a blog post |
| [**updateBlogPostAsync**](BlogPostsApi.md#updateBlogPostAsync) | **PUT** /api/v2/ContentService/BlogPosts/{blogPostId} | Update a blog post |


<a id="createBlogPostAsync"></a>
# **createBlogPostAsync**
> EmptyEnvelope createBlogPostAsync(tenantId, blogPostCreateDto)

Create a new blog post

Creates a new blog post for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlogPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BlogPostsApi apiInstance = new BlogPostsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    BlogPostCreateDto blogPostCreateDto = new BlogPostCreateDto(); // BlogPostCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createBlogPostAsync(tenantId, blogPostCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlogPostsApi#createBlogPostAsync");
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
| **blogPostCreateDto** | [**BlogPostCreateDto**](BlogPostCreateDto.md)|  | [optional] |

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

<a id="createCategoryForBlogPostAsync"></a>
# **createCategoryForBlogPostAsync**
> EmptyEnvelope createCategoryForBlogPostAsync(tenantId, blogPostId, blogPostCategoryCreateDto)

Create a category for a blog post

Creates a new category and relates it to a specific blog post.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlogPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BlogPostsApi apiInstance = new BlogPostsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID blogPostId = UUID.randomUUID(); // UUID | 
    BlogPostCategoryCreateDto blogPostCategoryCreateDto = new BlogPostCategoryCreateDto(); // BlogPostCategoryCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createCategoryForBlogPostAsync(tenantId, blogPostId, blogPostCategoryCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlogPostsApi#createCategoryForBlogPostAsync");
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
| **blogPostId** | **UUID**|  | |
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

<a id="createCommentForBlogPostAsync"></a>
# **createCommentForBlogPostAsync**
> EmptyEnvelope createCommentForBlogPostAsync(tenantId, blogPostId, blogPostCommentCreateDto)

Create a comment for a blog post

Creates a new comment on a specific blog post.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlogPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BlogPostsApi apiInstance = new BlogPostsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID blogPostId = UUID.randomUUID(); // UUID | 
    BlogPostCommentCreateDto blogPostCommentCreateDto = new BlogPostCommentCreateDto(); // BlogPostCommentCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createCommentForBlogPostAsync(tenantId, blogPostId, blogPostCommentCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlogPostsApi#createCommentForBlogPostAsync");
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
| **blogPostId** | **UUID**|  | |
| **blogPostCommentCreateDto** | [**BlogPostCommentCreateDto**](BlogPostCommentCreateDto.md)|  | [optional] |

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

<a id="createTagForBlogPostAsync"></a>
# **createTagForBlogPostAsync**
> EmptyEnvelope createTagForBlogPostAsync(tenantId, blogPostId, blogPostTagCreateDto)

Create a tag for a blog post

Creates a new tag and relates it to a specific blog post.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlogPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BlogPostsApi apiInstance = new BlogPostsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID blogPostId = UUID.randomUUID(); // UUID | 
    BlogPostTagCreateDto blogPostTagCreateDto = new BlogPostTagCreateDto(); // BlogPostTagCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createTagForBlogPostAsync(tenantId, blogPostId, blogPostTagCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlogPostsApi#createTagForBlogPostAsync");
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
| **blogPostId** | **UUID**|  | |
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

<a id="deleteBlogPostAsync"></a>
# **deleteBlogPostAsync**
> EmptyEnvelope deleteBlogPostAsync(tenantId, blogPostId)

Delete a blog post

Deletes a blog post for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlogPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BlogPostsApi apiInstance = new BlogPostsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID blogPostId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.deleteBlogPostAsync(tenantId, blogPostId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlogPostsApi#deleteBlogPostAsync");
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
| **blogPostId** | **UUID**|  | |

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

<a id="deleteCommentFromBlogPostAsync"></a>
# **deleteCommentFromBlogPostAsync**
> EmptyEnvelope deleteCommentFromBlogPostAsync(tenantId, blogPostId, commentId)

Delete a blog post comment

Deletes a comment from a specific blog post.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlogPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BlogPostsApi apiInstance = new BlogPostsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID blogPostId = UUID.randomUUID(); // UUID | 
    UUID commentId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.deleteCommentFromBlogPostAsync(tenantId, blogPostId, commentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlogPostsApi#deleteCommentFromBlogPostAsync");
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
| **blogPostId** | **UUID**|  | |
| **commentId** | **UUID**|  | |

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

<a id="getBlogPostByIdAsync"></a>
# **getBlogPostByIdAsync**
> BlogPostDtoEnvelope getBlogPostByIdAsync(blogPostId)

Get a blog post by ID

Retrieves a single blog post by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlogPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BlogPostsApi apiInstance = new BlogPostsApi(defaultClient);
    UUID blogPostId = UUID.randomUUID(); // UUID | 
    try {
      BlogPostDtoEnvelope result = apiInstance.getBlogPostByIdAsync(blogPostId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlogPostsApi#getBlogPostByIdAsync");
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
| **blogPostId** | **UUID**|  | |

### Return type

[**BlogPostDtoEnvelope**](BlogPostDtoEnvelope.md)

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

<a id="getBlogPostsAsync"></a>
# **getBlogPostsAsync**
> BlogPostDtoListEnvelope getBlogPostsAsync(tenantId)

Retrieve a list of blog posts

Retrieves all blog posts, optionally filtered by tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlogPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BlogPostsApi apiInstance = new BlogPostsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      BlogPostDtoListEnvelope result = apiInstance.getBlogPostsAsync(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlogPostsApi#getBlogPostsAsync");
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
| **tenantId** | **UUID**|  | [optional] |

### Return type

[**BlogPostDtoListEnvelope**](BlogPostDtoListEnvelope.md)

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

<a id="getBlogPostsCountAsync"></a>
# **getBlogPostsCountAsync**
> Int32Envelope getBlogPostsCountAsync(tenantId)

Get the count of blog posts

Returns the total count of blog posts, optionally filtered by tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlogPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BlogPostsApi apiInstance = new BlogPostsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.getBlogPostsCountAsync(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlogPostsApi#getBlogPostsCountAsync");
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
| **tenantId** | **UUID**|  | [optional] |

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

<a id="getCategoriesForBlogPostAsync"></a>
# **getCategoriesForBlogPostAsync**
> BlogPostCategoryDtoListEnvelope getCategoriesForBlogPostAsync(blogPostId)

Get categories for a blog post

Retrieves all categories related to a specific blog post.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlogPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BlogPostsApi apiInstance = new BlogPostsApi(defaultClient);
    UUID blogPostId = UUID.randomUUID(); // UUID | 
    try {
      BlogPostCategoryDtoListEnvelope result = apiInstance.getCategoriesForBlogPostAsync(blogPostId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlogPostsApi#getCategoriesForBlogPostAsync");
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
| **blogPostId** | **UUID**|  | |

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

<a id="getCommentsForBlogPostAsync"></a>
# **getCommentsForBlogPostAsync**
> BlogPostCommentDtoListEnvelope getCommentsForBlogPostAsync(blogPostId)

Get comments for a blog post

Retrieves all comments for a specific blog post.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlogPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BlogPostsApi apiInstance = new BlogPostsApi(defaultClient);
    UUID blogPostId = UUID.randomUUID(); // UUID | 
    try {
      BlogPostCommentDtoListEnvelope result = apiInstance.getCommentsForBlogPostAsync(blogPostId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlogPostsApi#getCommentsForBlogPostAsync");
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
| **blogPostId** | **UUID**|  | |

### Return type

[**BlogPostCommentDtoListEnvelope**](BlogPostCommentDtoListEnvelope.md)

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

<a id="getRepliesForCommentAsync"></a>
# **getRepliesForCommentAsync**
> BlogPostCommentDtoListEnvelope getRepliesForCommentAsync(commentId, blogPostId)

Get replies for a comment

Retrieves all replies for a specific blog post comment.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlogPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BlogPostsApi apiInstance = new BlogPostsApi(defaultClient);
    UUID commentId = UUID.randomUUID(); // UUID | 
    String blogPostId = "blogPostId_example"; // String | 
    try {
      BlogPostCommentDtoListEnvelope result = apiInstance.getRepliesForCommentAsync(commentId, blogPostId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlogPostsApi#getRepliesForCommentAsync");
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
| **commentId** | **UUID**|  | |
| **blogPostId** | **String**|  | |

### Return type

[**BlogPostCommentDtoListEnvelope**](BlogPostCommentDtoListEnvelope.md)

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

<a id="getTagsForBlogPostAsync"></a>
# **getTagsForBlogPostAsync**
> BlogPostTagDtoListEnvelope getTagsForBlogPostAsync(blogPostId)

Get tags for a blog post

Retrieves all tags related to a specific blog post.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlogPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BlogPostsApi apiInstance = new BlogPostsApi(defaultClient);
    UUID blogPostId = UUID.randomUUID(); // UUID | 
    try {
      BlogPostTagDtoListEnvelope result = apiInstance.getTagsForBlogPostAsync(blogPostId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlogPostsApi#getTagsForBlogPostAsync");
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
| **blogPostId** | **UUID**|  | |

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

<a id="relateCategoryToBlogPostAsync"></a>
# **relateCategoryToBlogPostAsync**
> EmptyEnvelope relateCategoryToBlogPostAsync(tenantId, blogPostId, categoryId)

Relate an existing category to a blog post

Creates a relationship between an existing category and a blog post.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlogPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BlogPostsApi apiInstance = new BlogPostsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID blogPostId = UUID.randomUUID(); // UUID | 
    UUID categoryId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.relateCategoryToBlogPostAsync(tenantId, blogPostId, categoryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlogPostsApi#relateCategoryToBlogPostAsync");
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
| **blogPostId** | **UUID**|  | |
| **categoryId** | **UUID**|  | |

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
| **201** | Created |  -  |

<a id="relateTagToBlogPostAsync"></a>
# **relateTagToBlogPostAsync**
> EmptyEnvelope relateTagToBlogPostAsync(tenantId, blogPostId, tagId)

Relate an existing tag to a blog post

Creates a relationship between an existing tag and a blog post.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlogPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BlogPostsApi apiInstance = new BlogPostsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID blogPostId = UUID.randomUUID(); // UUID | 
    UUID tagId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.relateTagToBlogPostAsync(tenantId, blogPostId, tagId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlogPostsApi#relateTagToBlogPostAsync");
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
| **blogPostId** | **UUID**|  | |
| **tagId** | **UUID**|  | |

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
| **201** | Created |  -  |

<a id="replyToCommentAsync"></a>
# **replyToCommentAsync**
> EmptyEnvelope replyToCommentAsync(tenantId, blogPostId, commentId, blogPostCommentCreateDto)

Reply to a blog post comment

Creates a reply to an existing comment on a blog post.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlogPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BlogPostsApi apiInstance = new BlogPostsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID blogPostId = UUID.randomUUID(); // UUID | 
    UUID commentId = UUID.randomUUID(); // UUID | 
    BlogPostCommentCreateDto blogPostCommentCreateDto = new BlogPostCommentCreateDto(); // BlogPostCommentCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.replyToCommentAsync(tenantId, blogPostId, commentId, blogPostCommentCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlogPostsApi#replyToCommentAsync");
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
| **blogPostId** | **UUID**|  | |
| **commentId** | **UUID**|  | |
| **blogPostCommentCreateDto** | [**BlogPostCommentCreateDto**](BlogPostCommentCreateDto.md)|  | [optional] |

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

<a id="unrelateCategoryFromBlogPostAsync"></a>
# **unrelateCategoryFromBlogPostAsync**
> EmptyEnvelope unrelateCategoryFromBlogPostAsync(tenantId, blogPostId, categoryId)

Remove a category from a blog post

Removes the relationship between a category and a blog post.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlogPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BlogPostsApi apiInstance = new BlogPostsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID blogPostId = UUID.randomUUID(); // UUID | 
    UUID categoryId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.unrelateCategoryFromBlogPostAsync(tenantId, blogPostId, categoryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlogPostsApi#unrelateCategoryFromBlogPostAsync");
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
| **blogPostId** | **UUID**|  | |
| **categoryId** | **UUID**|  | |

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

<a id="unrelateTagFromBlogPostAsync"></a>
# **unrelateTagFromBlogPostAsync**
> EmptyEnvelope unrelateTagFromBlogPostAsync(tenantId, blogPostId, tagId)

Remove a tag from a blog post

Removes the relationship between a tag and a blog post.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlogPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BlogPostsApi apiInstance = new BlogPostsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID blogPostId = UUID.randomUUID(); // UUID | 
    UUID tagId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.unrelateTagFromBlogPostAsync(tenantId, blogPostId, tagId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlogPostsApi#unrelateTagFromBlogPostAsync");
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
| **blogPostId** | **UUID**|  | |
| **tagId** | **UUID**|  | |

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

<a id="updateBlogPostAsync"></a>
# **updateBlogPostAsync**
> EmptyEnvelope updateBlogPostAsync(tenantId, blogPostId, blogPostUpdateDto)

Update a blog post

Updates an existing blog post for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlogPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BlogPostsApi apiInstance = new BlogPostsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID blogPostId = UUID.randomUUID(); // UUID | 
    BlogPostUpdateDto blogPostUpdateDto = new BlogPostUpdateDto(); // BlogPostUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateBlogPostAsync(tenantId, blogPostId, blogPostUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlogPostsApi#updateBlogPostAsync");
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
| **blogPostId** | **UUID**|  | |
| **blogPostUpdateDto** | [**BlogPostUpdateDto**](BlogPostUpdateDto.md)|  | [optional] |

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

