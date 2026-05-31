# SocialPostsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSocialPostAsync**](SocialPostsApi.md#createSocialPostAsync) | **POST** /api/v2/SocialService/SocialPosts | Create a social post |
| [**createSocialPostAttachmentAsync**](SocialPostsApi.md#createSocialPostAttachmentAsync) | **POST** /api/v2/SocialService/SocialPosts/{socialPostId}/Attachments | Create a social post attachment |
| [**createSocialPostCommentAsync**](SocialPostsApi.md#createSocialPostCommentAsync) | **POST** /api/v2/SocialService/SocialPosts/{socialPostId}/Comments | Create a social post comment |
| [**createSocialPostReactionAsync**](SocialPostsApi.md#createSocialPostReactionAsync) | **POST** /api/v2/SocialService/SocialPosts/{socialPostId}/Reactions | Create a social post reaction |
| [**deleteSocialPostAsync**](SocialPostsApi.md#deleteSocialPostAsync) | **DELETE** /api/v2/SocialService/SocialPosts/{socialPostId} | Delete a social post |
| [**deleteSocialPostAttachmentAsync**](SocialPostsApi.md#deleteSocialPostAttachmentAsync) | **DELETE** /api/v2/SocialService/SocialPosts/{socialPostId}/Attachments/{attachmentId} | Delete a social post attachment |
| [**deleteSocialPostCommentAsync**](SocialPostsApi.md#deleteSocialPostCommentAsync) | **DELETE** /api/v2/SocialService/SocialPosts/{socialPostId}/Comments/{commentId} | Delete a social post comment |
| [**deleteSocialPostReactionAsync**](SocialPostsApi.md#deleteSocialPostReactionAsync) | **DELETE** /api/v2/SocialService/SocialPosts/{socialPostId}/Reactions/{reactionId} | Delete a social post reaction |
| [**getSocialPostAsync**](SocialPostsApi.md#getSocialPostAsync) | **GET** /api/v2/SocialService/SocialPosts/{socialPostId} | Get social post by ID |
| [**getSocialPostAttachmentAsync**](SocialPostsApi.md#getSocialPostAttachmentAsync) | **GET** /api/v2/SocialService/SocialPosts/{socialPostId}/Attachments/{attachmentId} | Get social post attachment by ID |
| [**getSocialPostAttachmentsAsync**](SocialPostsApi.md#getSocialPostAttachmentsAsync) | **GET** /api/v2/SocialService/SocialPosts/{socialPostId}/Attachments | Get social post attachments |
| [**getSocialPostAttachmentsCountAsync**](SocialPostsApi.md#getSocialPostAttachmentsCountAsync) | **GET** /api/v2/SocialService/SocialPosts/{socialPostId}/Attachments/Count | Count social post attachments |
| [**getSocialPostCommentAsync**](SocialPostsApi.md#getSocialPostCommentAsync) | **GET** /api/v2/SocialService/SocialPosts/{socialPostId}/Comments/{commentId} | Get social post comment by ID |
| [**getSocialPostCommentsAsync**](SocialPostsApi.md#getSocialPostCommentsAsync) | **GET** /api/v2/SocialService/SocialPosts/{socialPostId}/Comments | Get social post comments |
| [**getSocialPostCommentsCountAsync**](SocialPostsApi.md#getSocialPostCommentsCountAsync) | **GET** /api/v2/SocialService/SocialPosts/{socialPostId}/Comments/Count | Count social post comments |
| [**getSocialPostReactionAsync**](SocialPostsApi.md#getSocialPostReactionAsync) | **GET** /api/v2/SocialService/SocialPosts/{socialPostId}/Reactions/{reactionId} | Get social post reaction by ID |
| [**getSocialPostReactionsAsync**](SocialPostsApi.md#getSocialPostReactionsAsync) | **GET** /api/v2/SocialService/SocialPosts/{socialPostId}/Reactions | Get social post reactions |
| [**getSocialPostReactionsCountAsync**](SocialPostsApi.md#getSocialPostReactionsCountAsync) | **GET** /api/v2/SocialService/SocialPosts/{socialPostId}/Reactions/Count | Count social post reactions |
| [**getSocialPostsAsync**](SocialPostsApi.md#getSocialPostsAsync) | **GET** /api/v2/SocialService/SocialPosts | Get social posts |
| [**getSocialPostsCountAsync**](SocialPostsApi.md#getSocialPostsCountAsync) | **GET** /api/v2/SocialService/SocialPosts/Count | Count social posts |
| [**updateSocialPostAsync**](SocialPostsApi.md#updateSocialPostAsync) | **PUT** /api/v2/SocialService/SocialPosts/{socialPostId} | Update a social post |
| [**updateSocialPostAttachmentAsync**](SocialPostsApi.md#updateSocialPostAttachmentAsync) | **PUT** /api/v2/SocialService/SocialPosts/{socialPostId}/Attachments/{attachmentId} | Update a social post attachment |
| [**updateSocialPostCommentAsync**](SocialPostsApi.md#updateSocialPostCommentAsync) | **PUT** /api/v2/SocialService/SocialPosts/{socialPostId}/Comments/{commentId} | Update a social post comment |
| [**updateSocialPostReactionAsync**](SocialPostsApi.md#updateSocialPostReactionAsync) | **PUT** /api/v2/SocialService/SocialPosts/{socialPostId}/Reactions/{reactionId} | Update a social post reaction |


<a id="createSocialPostAsync"></a>
# **createSocialPostAsync**
> SocialPostDtoEnvelope createSocialPostAsync(socialProfileId, apiVersion, xApiVersion, socialPostCreateDto)

Create a social post

Creates a new social post for the specified social profile.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SocialPostsApi apiInstance = new SocialPostsApi(defaultClient);
    UUID socialProfileId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SocialPostCreateDto socialPostCreateDto = new SocialPostCreateDto(); // SocialPostCreateDto | 
    try {
      SocialPostDtoEnvelope result = apiInstance.createSocialPostAsync(socialProfileId, apiVersion, xApiVersion, socialPostCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialPostsApi#createSocialPostAsync");
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
| **socialProfileId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **socialPostCreateDto** | [**SocialPostCreateDto**](SocialPostCreateDto.md)|  | [optional] |

### Return type

[**SocialPostDtoEnvelope**](SocialPostDtoEnvelope.md)

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

<a id="createSocialPostAttachmentAsync"></a>
# **createSocialPostAttachmentAsync**
> SocialPostAttachmentDtoEnvelope createSocialPostAttachmentAsync(socialPostId, socialProfileId, apiVersion, xApiVersion, socialPostAttachmentCreateDto)

Create a social post attachment

Creates a new attachment for a specific social post.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SocialPostsApi apiInstance = new SocialPostsApi(defaultClient);
    UUID socialPostId = UUID.randomUUID(); // UUID | 
    UUID socialProfileId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SocialPostAttachmentCreateDto socialPostAttachmentCreateDto = new SocialPostAttachmentCreateDto(); // SocialPostAttachmentCreateDto | 
    try {
      SocialPostAttachmentDtoEnvelope result = apiInstance.createSocialPostAttachmentAsync(socialPostId, socialProfileId, apiVersion, xApiVersion, socialPostAttachmentCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialPostsApi#createSocialPostAttachmentAsync");
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
| **socialPostId** | **UUID**|  | |
| **socialProfileId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **socialPostAttachmentCreateDto** | [**SocialPostAttachmentCreateDto**](SocialPostAttachmentCreateDto.md)|  | [optional] |

### Return type

[**SocialPostAttachmentDtoEnvelope**](SocialPostAttachmentDtoEnvelope.md)

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

<a id="createSocialPostCommentAsync"></a>
# **createSocialPostCommentAsync**
> EmptyEnvelope createSocialPostCommentAsync(socialProfileId, socialPostId, apiVersion, xApiVersion, socialPostCommentCreateDto)

Create a social post comment

Creates a new comment on a specific social post.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SocialPostsApi apiInstance = new SocialPostsApi(defaultClient);
    UUID socialProfileId = UUID.randomUUID(); // UUID | 
    UUID socialPostId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SocialPostCommentCreateDto socialPostCommentCreateDto = new SocialPostCommentCreateDto(); // SocialPostCommentCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createSocialPostCommentAsync(socialProfileId, socialPostId, apiVersion, xApiVersion, socialPostCommentCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialPostsApi#createSocialPostCommentAsync");
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
| **socialProfileId** | **UUID**|  | |
| **socialPostId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **socialPostCommentCreateDto** | [**SocialPostCommentCreateDto**](SocialPostCommentCreateDto.md)|  | [optional] |

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

<a id="createSocialPostReactionAsync"></a>
# **createSocialPostReactionAsync**
> SocialReactionDtoEnvelope createSocialPostReactionAsync(socialPostId, socialProfileId, apiVersion, xApiVersion, socialReactionCreateDto)

Create a social post reaction

Creates a new reaction on a specific social post.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SocialPostsApi apiInstance = new SocialPostsApi(defaultClient);
    UUID socialPostId = UUID.randomUUID(); // UUID | 
    UUID socialProfileId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SocialReactionCreateDto socialReactionCreateDto = new SocialReactionCreateDto(); // SocialReactionCreateDto | 
    try {
      SocialReactionDtoEnvelope result = apiInstance.createSocialPostReactionAsync(socialPostId, socialProfileId, apiVersion, xApiVersion, socialReactionCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialPostsApi#createSocialPostReactionAsync");
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
| **socialPostId** | **UUID**|  | |
| **socialProfileId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **socialReactionCreateDto** | [**SocialReactionCreateDto**](SocialReactionCreateDto.md)|  | [optional] |

### Return type

[**SocialReactionDtoEnvelope**](SocialReactionDtoEnvelope.md)

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

<a id="deleteSocialPostAsync"></a>
# **deleteSocialPostAsync**
> EmptyEnvelope deleteSocialPostAsync(socialProfileId, socialPostId, apiVersion, xApiVersion)

Delete a social post

Deletes a social post by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SocialPostsApi apiInstance = new SocialPostsApi(defaultClient);
    UUID socialProfileId = UUID.randomUUID(); // UUID | 
    UUID socialPostId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteSocialPostAsync(socialProfileId, socialPostId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialPostsApi#deleteSocialPostAsync");
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
| **socialProfileId** | **UUID**|  | |
| **socialPostId** | **UUID**|  | |
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

<a id="deleteSocialPostAttachmentAsync"></a>
# **deleteSocialPostAttachmentAsync**
> EmptyEnvelope deleteSocialPostAttachmentAsync(socialProfileId, socialPostId, attachmentId, apiVersion, xApiVersion)

Delete a social post attachment

Deletes an attachment from a specific social post.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SocialPostsApi apiInstance = new SocialPostsApi(defaultClient);
    UUID socialProfileId = UUID.randomUUID(); // UUID | 
    UUID socialPostId = UUID.randomUUID(); // UUID | 
    UUID attachmentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteSocialPostAttachmentAsync(socialProfileId, socialPostId, attachmentId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialPostsApi#deleteSocialPostAttachmentAsync");
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
| **socialProfileId** | **UUID**|  | |
| **socialPostId** | **UUID**|  | |
| **attachmentId** | **UUID**|  | |
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

<a id="deleteSocialPostCommentAsync"></a>
# **deleteSocialPostCommentAsync**
> EmptyEnvelope deleteSocialPostCommentAsync(socialProfileId, socialPostId, commentId, apiVersion, xApiVersion)

Delete a social post comment

Deletes a comment from a specific social post.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SocialPostsApi apiInstance = new SocialPostsApi(defaultClient);
    UUID socialProfileId = UUID.randomUUID(); // UUID | 
    UUID socialPostId = UUID.randomUUID(); // UUID | 
    UUID commentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteSocialPostCommentAsync(socialProfileId, socialPostId, commentId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialPostsApi#deleteSocialPostCommentAsync");
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
| **socialProfileId** | **UUID**|  | |
| **socialPostId** | **UUID**|  | |
| **commentId** | **UUID**|  | |
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

<a id="deleteSocialPostReactionAsync"></a>
# **deleteSocialPostReactionAsync**
> EmptyEnvelope deleteSocialPostReactionAsync(socialProfileId, socialPostId, reactionId, apiVersion, xApiVersion)

Delete a social post reaction

Deletes a reaction from a specific social post.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SocialPostsApi apiInstance = new SocialPostsApi(defaultClient);
    UUID socialProfileId = UUID.randomUUID(); // UUID | 
    UUID socialPostId = UUID.randomUUID(); // UUID | 
    UUID reactionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteSocialPostReactionAsync(socialProfileId, socialPostId, reactionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialPostsApi#deleteSocialPostReactionAsync");
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
| **socialProfileId** | **UUID**|  | |
| **socialPostId** | **UUID**|  | |
| **reactionId** | **UUID**|  | |
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

<a id="getSocialPostAsync"></a>
# **getSocialPostAsync**
> SocialPostDtoEnvelope getSocialPostAsync(socialProfileId, socialPostId, apiVersion, xApiVersion)

Get social post by ID

Retrieves a specific social post by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SocialPostsApi apiInstance = new SocialPostsApi(defaultClient);
    UUID socialProfileId = UUID.randomUUID(); // UUID | 
    UUID socialPostId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SocialPostDtoEnvelope result = apiInstance.getSocialPostAsync(socialProfileId, socialPostId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialPostsApi#getSocialPostAsync");
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
| **socialProfileId** | **UUID**|  | |
| **socialPostId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**SocialPostDtoEnvelope**](SocialPostDtoEnvelope.md)

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

<a id="getSocialPostAttachmentAsync"></a>
# **getSocialPostAttachmentAsync**
> EmptyEnvelope getSocialPostAttachmentAsync(socialPostId, attachmentId, apiVersion, xApiVersion)

Get social post attachment by ID

Retrieves a specific attachment from a social post by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SocialPostsApi apiInstance = new SocialPostsApi(defaultClient);
    UUID socialPostId = UUID.randomUUID(); // UUID | 
    UUID attachmentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.getSocialPostAttachmentAsync(socialPostId, attachmentId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialPostsApi#getSocialPostAttachmentAsync");
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
| **socialPostId** | **UUID**|  | |
| **attachmentId** | **UUID**|  | |
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

<a id="getSocialPostAttachmentsAsync"></a>
# **getSocialPostAttachmentsAsync**
> SocialPostAttachmentDtoListEnvelope getSocialPostAttachmentsAsync(socialPostId, apiVersion, xApiVersion)

Get social post attachments

Retrieves a list of attachments for a specific social post.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SocialPostsApi apiInstance = new SocialPostsApi(defaultClient);
    UUID socialPostId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SocialPostAttachmentDtoListEnvelope result = apiInstance.getSocialPostAttachmentsAsync(socialPostId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialPostsApi#getSocialPostAttachmentsAsync");
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
| **socialPostId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**SocialPostAttachmentDtoListEnvelope**](SocialPostAttachmentDtoListEnvelope.md)

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

<a id="getSocialPostAttachmentsCountAsync"></a>
# **getSocialPostAttachmentsCountAsync**
> Int32Envelope getSocialPostAttachmentsCountAsync(socialPostId, apiVersion, xApiVersion)

Count social post attachments

Returns the count of attachments for a specific social post.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SocialPostsApi apiInstance = new SocialPostsApi(defaultClient);
    UUID socialPostId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getSocialPostAttachmentsCountAsync(socialPostId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialPostsApi#getSocialPostAttachmentsCountAsync");
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
| **socialPostId** | **UUID**|  | |
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

<a id="getSocialPostCommentAsync"></a>
# **getSocialPostCommentAsync**
> SocialPostCommentDtoEnvelope getSocialPostCommentAsync(socialProfileId, socialPostId, commentId, apiVersion, xApiVersion)

Get social post comment by ID

Retrieves a specific comment from a social post by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SocialPostsApi apiInstance = new SocialPostsApi(defaultClient);
    UUID socialProfileId = UUID.randomUUID(); // UUID | 
    UUID socialPostId = UUID.randomUUID(); // UUID | 
    UUID commentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SocialPostCommentDtoEnvelope result = apiInstance.getSocialPostCommentAsync(socialProfileId, socialPostId, commentId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialPostsApi#getSocialPostCommentAsync");
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
| **socialProfileId** | **UUID**|  | |
| **socialPostId** | **UUID**|  | |
| **commentId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**SocialPostCommentDtoEnvelope**](SocialPostCommentDtoEnvelope.md)

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

<a id="getSocialPostCommentsAsync"></a>
# **getSocialPostCommentsAsync**
> SocialPostCommentDtoListEnvelope getSocialPostCommentsAsync(socialProfileId, socialPostId, apiVersion, xApiVersion)

Get social post comments

Retrieves a list of comments for a specific social post.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SocialPostsApi apiInstance = new SocialPostsApi(defaultClient);
    UUID socialProfileId = UUID.randomUUID(); // UUID | 
    UUID socialPostId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SocialPostCommentDtoListEnvelope result = apiInstance.getSocialPostCommentsAsync(socialProfileId, socialPostId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialPostsApi#getSocialPostCommentsAsync");
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
| **socialProfileId** | **UUID**|  | |
| **socialPostId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**SocialPostCommentDtoListEnvelope**](SocialPostCommentDtoListEnvelope.md)

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

<a id="getSocialPostCommentsCountAsync"></a>
# **getSocialPostCommentsCountAsync**
> Int32Envelope getSocialPostCommentsCountAsync(socialProfileId, socialPostId, apiVersion, xApiVersion)

Count social post comments

Returns the count of comments for a specific social post.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SocialPostsApi apiInstance = new SocialPostsApi(defaultClient);
    UUID socialProfileId = UUID.randomUUID(); // UUID | 
    UUID socialPostId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getSocialPostCommentsCountAsync(socialProfileId, socialPostId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialPostsApi#getSocialPostCommentsCountAsync");
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
| **socialProfileId** | **UUID**|  | |
| **socialPostId** | **UUID**|  | |
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

<a id="getSocialPostReactionAsync"></a>
# **getSocialPostReactionAsync**
> SocialReactionDtoEnvelope getSocialPostReactionAsync(socialPostId, reactionId, apiVersion, xApiVersion)

Get social post reaction by ID

Retrieves a specific reaction from a social post by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SocialPostsApi apiInstance = new SocialPostsApi(defaultClient);
    UUID socialPostId = UUID.randomUUID(); // UUID | 
    UUID reactionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SocialReactionDtoEnvelope result = apiInstance.getSocialPostReactionAsync(socialPostId, reactionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialPostsApi#getSocialPostReactionAsync");
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
| **socialPostId** | **UUID**|  | |
| **reactionId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**SocialReactionDtoEnvelope**](SocialReactionDtoEnvelope.md)

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

<a id="getSocialPostReactionsAsync"></a>
# **getSocialPostReactionsAsync**
> SocialReactionDtoListEnvelope getSocialPostReactionsAsync(socialPostId, socialProfileId, apiVersion, xApiVersion)

Get social post reactions

Retrieves a list of reactions for a specific social post.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SocialPostsApi apiInstance = new SocialPostsApi(defaultClient);
    UUID socialPostId = UUID.randomUUID(); // UUID | 
    UUID socialProfileId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SocialReactionDtoListEnvelope result = apiInstance.getSocialPostReactionsAsync(socialPostId, socialProfileId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialPostsApi#getSocialPostReactionsAsync");
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
| **socialPostId** | **UUID**|  | |
| **socialProfileId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**SocialReactionDtoListEnvelope**](SocialReactionDtoListEnvelope.md)

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

<a id="getSocialPostReactionsCountAsync"></a>
# **getSocialPostReactionsCountAsync**
> Int32Envelope getSocialPostReactionsCountAsync(socialPostId, socialProfileId, apiVersion, xApiVersion)

Count social post reactions

Returns the count of reactions for a specific social post.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SocialPostsApi apiInstance = new SocialPostsApi(defaultClient);
    UUID socialPostId = UUID.randomUUID(); // UUID | 
    UUID socialProfileId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getSocialPostReactionsCountAsync(socialPostId, socialProfileId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialPostsApi#getSocialPostReactionsCountAsync");
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
| **socialPostId** | **UUID**|  | |
| **socialProfileId** | **UUID**|  | |
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

<a id="getSocialPostsAsync"></a>
# **getSocialPostsAsync**
> SocialPostDtoListEnvelope getSocialPostsAsync(socialProfileId, apiVersion, xApiVersion)

Get social posts

Retrieves a list of social posts for the specified social profile.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SocialPostsApi apiInstance = new SocialPostsApi(defaultClient);
    UUID socialProfileId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SocialPostDtoListEnvelope result = apiInstance.getSocialPostsAsync(socialProfileId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialPostsApi#getSocialPostsAsync");
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
| **socialProfileId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**SocialPostDtoListEnvelope**](SocialPostDtoListEnvelope.md)

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

<a id="getSocialPostsCountAsync"></a>
# **getSocialPostsCountAsync**
> Int32Envelope getSocialPostsCountAsync(socialProfileId, apiVersion, xApiVersion)

Count social posts

Returns the count of social posts for the specified social profile.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SocialPostsApi apiInstance = new SocialPostsApi(defaultClient);
    UUID socialProfileId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getSocialPostsCountAsync(socialProfileId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialPostsApi#getSocialPostsCountAsync");
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
| **socialProfileId** | **UUID**|  | |
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

<a id="updateSocialPostAsync"></a>
# **updateSocialPostAsync**
> EmptyEnvelope updateSocialPostAsync(socialProfileId, socialPostId, apiVersion, xApiVersion, socialPostUpdateDto)

Update a social post

Updates an existing social post by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SocialPostsApi apiInstance = new SocialPostsApi(defaultClient);
    UUID socialProfileId = UUID.randomUUID(); // UUID | 
    UUID socialPostId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SocialPostUpdateDto socialPostUpdateDto = new SocialPostUpdateDto(); // SocialPostUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateSocialPostAsync(socialProfileId, socialPostId, apiVersion, xApiVersion, socialPostUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialPostsApi#updateSocialPostAsync");
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
| **socialProfileId** | **UUID**|  | |
| **socialPostId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **socialPostUpdateDto** | [**SocialPostUpdateDto**](SocialPostUpdateDto.md)|  | [optional] |

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

<a id="updateSocialPostAttachmentAsync"></a>
# **updateSocialPostAttachmentAsync**
> EmptyEnvelope updateSocialPostAttachmentAsync(socialProfileId, socialPostId, attachmentId, apiVersion, xApiVersion, socialPostAttachmentUpdateDto)

Update a social post attachment

Updates an existing attachment on a specific social post.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SocialPostsApi apiInstance = new SocialPostsApi(defaultClient);
    UUID socialProfileId = UUID.randomUUID(); // UUID | 
    UUID socialPostId = UUID.randomUUID(); // UUID | 
    UUID attachmentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SocialPostAttachmentUpdateDto socialPostAttachmentUpdateDto = new SocialPostAttachmentUpdateDto(); // SocialPostAttachmentUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateSocialPostAttachmentAsync(socialProfileId, socialPostId, attachmentId, apiVersion, xApiVersion, socialPostAttachmentUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialPostsApi#updateSocialPostAttachmentAsync");
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
| **socialProfileId** | **UUID**|  | |
| **socialPostId** | **UUID**|  | |
| **attachmentId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **socialPostAttachmentUpdateDto** | [**SocialPostAttachmentUpdateDto**](SocialPostAttachmentUpdateDto.md)|  | [optional] |

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

<a id="updateSocialPostCommentAsync"></a>
# **updateSocialPostCommentAsync**
> EmptyEnvelope updateSocialPostCommentAsync(socialProfileId, socialPostId, commentId, apiVersion, xApiVersion, socialPostCommentUpdateDto)

Update a social post comment

Updates an existing comment on a specific social post.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SocialPostsApi apiInstance = new SocialPostsApi(defaultClient);
    UUID socialProfileId = UUID.randomUUID(); // UUID | 
    UUID socialPostId = UUID.randomUUID(); // UUID | 
    UUID commentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SocialPostCommentUpdateDto socialPostCommentUpdateDto = new SocialPostCommentUpdateDto(); // SocialPostCommentUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateSocialPostCommentAsync(socialProfileId, socialPostId, commentId, apiVersion, xApiVersion, socialPostCommentUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialPostsApi#updateSocialPostCommentAsync");
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
| **socialProfileId** | **UUID**|  | |
| **socialPostId** | **UUID**|  | |
| **commentId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **socialPostCommentUpdateDto** | [**SocialPostCommentUpdateDto**](SocialPostCommentUpdateDto.md)|  | [optional] |

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

<a id="updateSocialPostReactionAsync"></a>
# **updateSocialPostReactionAsync**
> EmptyEnvelope updateSocialPostReactionAsync(socialProfileId, socialPostId, reactionId, apiVersion, xApiVersion, socialReactionUpdateDto)

Update a social post reaction

Updates an existing reaction on a specific social post.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SocialPostsApi apiInstance = new SocialPostsApi(defaultClient);
    UUID socialProfileId = UUID.randomUUID(); // UUID | 
    UUID socialPostId = UUID.randomUUID(); // UUID | 
    UUID reactionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SocialReactionUpdateDto socialReactionUpdateDto = new SocialReactionUpdateDto(); // SocialReactionUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateSocialPostReactionAsync(socialProfileId, socialPostId, reactionId, apiVersion, xApiVersion, socialReactionUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialPostsApi#updateSocialPostReactionAsync");
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
| **socialProfileId** | **UUID**|  | |
| **socialPostId** | **UUID**|  | |
| **reactionId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **socialReactionUpdateDto** | [**SocialReactionUpdateDto**](SocialReactionUpdateDto.md)|  | [optional] |

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

