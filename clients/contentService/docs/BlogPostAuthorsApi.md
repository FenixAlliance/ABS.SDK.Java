# BlogPostAuthorsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**countBlogPostsByAuthorAsync**](BlogPostAuthorsApi.md#countBlogPostsByAuthorAsync) | **GET** /api/v2/ContentService/BlogPostAuthors/{authorId}/BlogPosts/Count | Count blog posts by author |
| [**getBlogAuthorByIdAsync**](BlogPostAuthorsApi.md#getBlogAuthorByIdAsync) | **GET** /api/v2/ContentService/BlogPostAuthors/{authorId} | Get blog author by ID |
| [**getBlogAuthorsAsync**](BlogPostAuthorsApi.md#getBlogAuthorsAsync) | **GET** /api/v2/ContentService/BlogPostAuthors | Get blog authors |
| [**getBlogPostsByAuthorAsync**](BlogPostAuthorsApi.md#getBlogPostsByAuthorAsync) | **GET** /api/v2/ContentService/BlogPostAuthors/{authorId}/BlogPosts | Get blog posts by author |


<a id="countBlogPostsByAuthorAsync"></a>
# **countBlogPostsByAuthorAsync**
> Int32Envelope countBlogPostsByAuthorAsync(authorId, apiVersion, xApiVersion)

Count blog posts by author

Returns the count of blog posts written by a specific author.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlogPostAuthorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BlogPostAuthorsApi apiInstance = new BlogPostAuthorsApi(defaultClient);
    UUID authorId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.countBlogPostsByAuthorAsync(authorId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlogPostAuthorsApi#countBlogPostsByAuthorAsync");
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
| **authorId** | **UUID**|  | |
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
| **200** | OK |  -  |

<a id="getBlogAuthorByIdAsync"></a>
# **getBlogAuthorByIdAsync**
> BlogAuthorDtoEnvelope getBlogAuthorByIdAsync(authorId, apiVersion, xApiVersion)

Get blog author by ID

Retrieves a specific blog author by their identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlogPostAuthorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BlogPostAuthorsApi apiInstance = new BlogPostAuthorsApi(defaultClient);
    UUID authorId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      BlogAuthorDtoEnvelope result = apiInstance.getBlogAuthorByIdAsync(authorId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlogPostAuthorsApi#getBlogAuthorByIdAsync");
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
| **authorId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**BlogAuthorDtoEnvelope**](BlogAuthorDtoEnvelope.md)

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

<a id="getBlogAuthorsAsync"></a>
# **getBlogAuthorsAsync**
> BlogAuthorDtoListEnvelope getBlogAuthorsAsync(tenantId, apiVersion, xApiVersion)

Get blog authors

Retrieves all blog authors, optionally filtered by tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlogPostAuthorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BlogPostAuthorsApi apiInstance = new BlogPostAuthorsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      BlogAuthorDtoListEnvelope result = apiInstance.getBlogAuthorsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlogPostAuthorsApi#getBlogAuthorsAsync");
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
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**BlogAuthorDtoListEnvelope**](BlogAuthorDtoListEnvelope.md)

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

<a id="getBlogPostsByAuthorAsync"></a>
# **getBlogPostsByAuthorAsync**
> BlogPostDtoListEnvelope getBlogPostsByAuthorAsync(authorId, apiVersion, xApiVersion)

Get blog posts by author

Retrieves all blog posts written by a specific author.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlogPostAuthorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BlogPostAuthorsApi apiInstance = new BlogPostAuthorsApi(defaultClient);
    UUID authorId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      BlogPostDtoListEnvelope result = apiInstance.getBlogPostsByAuthorAsync(authorId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlogPostAuthorsApi#getBlogPostsByAuthorAsync");
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
| **authorId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

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
| **200** | OK |  -  |

