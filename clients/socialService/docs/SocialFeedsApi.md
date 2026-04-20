# SocialFeedsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFeedPostAsync**](SocialFeedsApi.md#createFeedPostAsync) | **POST** /api/v2/SocialService/SocialFeeds/{socialFeedId}/Posts | Create a social feed post |
| [**deleteFeedPostAsync**](SocialFeedsApi.md#deleteFeedPostAsync) | **DELETE** /api/v2/SocialService/SocialFeeds/{socialFeedId}/Posts/{feedPostId} | Delete a social feed post |
| [**getFeedNotifications**](SocialFeedsApi.md#getFeedNotifications) | **GET** /api/v2/SocialService/SocialFeeds | Get social feeds |
| [**getFeedPostAsync**](SocialFeedsApi.md#getFeedPostAsync) | **GET** /api/v2/SocialService/SocialFeeds/{socialFeedId}/Posts/{feedPostId} | Get social feed post by ID |
| [**getFeedPostsAsync**](SocialFeedsApi.md#getFeedPostsAsync) | **GET** /api/v2/SocialService/SocialFeeds/{socialFeedId}/Posts | Get social feed posts |
| [**getFeedPostsCountAsync**](SocialFeedsApi.md#getFeedPostsCountAsync) | **GET** /api/v2/SocialService/SocialFeeds/{socialFeedId}/Posts/Count | Count social feed posts |
| [**getNotificationAsync**](SocialFeedsApi.md#getNotificationAsync) | **GET** /api/v2/SocialService/SocialFeeds/{socialFeedId} | Get social feed by ID |
| [**getNotificationsCountAsync**](SocialFeedsApi.md#getNotificationsCountAsync) | **GET** /api/v2/SocialService/SocialFeeds/Count | Count social feeds |
| [**updateFeedPostAsync**](SocialFeedsApi.md#updateFeedPostAsync) | **PUT** /api/v2/SocialService/SocialFeeds/{socialFeedId}/Posts/{feedPostId} | Update a social feed post |


<a id="createFeedPostAsync"></a>
# **createFeedPostAsync**
> SocialFeedPostDtoEnvelope createFeedPostAsync(socialProfileId, socialFeedId, apiVersion, xApiVersion, socialFeedPostCreateDto)

Create a social feed post

Creates a new post in a specific social feed.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialFeedsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SocialFeedsApi apiInstance = new SocialFeedsApi(defaultClient);
    UUID socialProfileId = UUID.randomUUID(); // UUID | 
    UUID socialFeedId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SocialFeedPostCreateDto socialFeedPostCreateDto = new SocialFeedPostCreateDto(); // SocialFeedPostCreateDto | 
    try {
      SocialFeedPostDtoEnvelope result = apiInstance.createFeedPostAsync(socialProfileId, socialFeedId, apiVersion, xApiVersion, socialFeedPostCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialFeedsApi#createFeedPostAsync");
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
| **socialFeedId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **socialFeedPostCreateDto** | [**SocialFeedPostCreateDto**](SocialFeedPostCreateDto.md)|  | [optional] |

### Return type

[**SocialFeedPostDtoEnvelope**](SocialFeedPostDtoEnvelope.md)

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

<a id="deleteFeedPostAsync"></a>
# **deleteFeedPostAsync**
> EmptyEnvelope deleteFeedPostAsync(socialProfileId, socialFeedId, feedPostId, apiVersion, xApiVersion)

Delete a social feed post

Deletes a post from a specific social feed.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialFeedsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SocialFeedsApi apiInstance = new SocialFeedsApi(defaultClient);
    UUID socialProfileId = UUID.randomUUID(); // UUID | 
    UUID socialFeedId = UUID.randomUUID(); // UUID | 
    UUID feedPostId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteFeedPostAsync(socialProfileId, socialFeedId, feedPostId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialFeedsApi#deleteFeedPostAsync");
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
| **socialFeedId** | **UUID**|  | |
| **feedPostId** | **UUID**|  | |
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
| **204** | No Content |  -  |

<a id="getFeedNotifications"></a>
# **getFeedNotifications**
> SocialFeedDtoListEnvelope getFeedNotifications(socialProfileId, apiVersion, xApiVersion)

Get social feeds

Retrieves a list of social feeds for the specified social profile.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialFeedsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SocialFeedsApi apiInstance = new SocialFeedsApi(defaultClient);
    UUID socialProfileId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SocialFeedDtoListEnvelope result = apiInstance.getFeedNotifications(socialProfileId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialFeedsApi#getFeedNotifications");
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

[**SocialFeedDtoListEnvelope**](SocialFeedDtoListEnvelope.md)

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

<a id="getFeedPostAsync"></a>
# **getFeedPostAsync**
> SocialFeedPostDtoEnvelope getFeedPostAsync(socialProfileId, socialFeedId, feedPostId, apiVersion, xApiVersion)

Get social feed post by ID

Retrieves a specific post from a social feed by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialFeedsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SocialFeedsApi apiInstance = new SocialFeedsApi(defaultClient);
    UUID socialProfileId = UUID.randomUUID(); // UUID | 
    UUID socialFeedId = UUID.randomUUID(); // UUID | 
    UUID feedPostId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SocialFeedPostDtoEnvelope result = apiInstance.getFeedPostAsync(socialProfileId, socialFeedId, feedPostId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialFeedsApi#getFeedPostAsync");
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
| **socialFeedId** | **UUID**|  | |
| **feedPostId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**SocialFeedPostDtoEnvelope**](SocialFeedPostDtoEnvelope.md)

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

<a id="getFeedPostsAsync"></a>
# **getFeedPostsAsync**
> SocialFeedPostDtoListEnvelope getFeedPostsAsync(socialProfileId, socialFeedId, apiVersion, xApiVersion)

Get social feed posts

Retrieves a list of posts for a specific social feed.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialFeedsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SocialFeedsApi apiInstance = new SocialFeedsApi(defaultClient);
    UUID socialProfileId = UUID.randomUUID(); // UUID | 
    UUID socialFeedId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SocialFeedPostDtoListEnvelope result = apiInstance.getFeedPostsAsync(socialProfileId, socialFeedId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialFeedsApi#getFeedPostsAsync");
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
| **socialFeedId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**SocialFeedPostDtoListEnvelope**](SocialFeedPostDtoListEnvelope.md)

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

<a id="getFeedPostsCountAsync"></a>
# **getFeedPostsCountAsync**
> Int32Envelope getFeedPostsCountAsync(socialProfileId, socialFeedId, apiVersion, xApiVersion)

Count social feed posts

Returns the count of posts for a specific social feed.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialFeedsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SocialFeedsApi apiInstance = new SocialFeedsApi(defaultClient);
    UUID socialProfileId = UUID.randomUUID(); // UUID | 
    UUID socialFeedId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getFeedPostsCountAsync(socialProfileId, socialFeedId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialFeedsApi#getFeedPostsCountAsync");
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
| **socialFeedId** | **UUID**|  | |
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

<a id="getNotificationAsync"></a>
# **getNotificationAsync**
> SocialFeedDtoEnvelope getNotificationAsync(socialProfileId, socialFeedId, apiVersion, xApiVersion)

Get social feed by ID

Retrieves a specific social feed by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialFeedsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SocialFeedsApi apiInstance = new SocialFeedsApi(defaultClient);
    UUID socialProfileId = UUID.randomUUID(); // UUID | 
    UUID socialFeedId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SocialFeedDtoEnvelope result = apiInstance.getNotificationAsync(socialProfileId, socialFeedId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialFeedsApi#getNotificationAsync");
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
| **socialFeedId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**SocialFeedDtoEnvelope**](SocialFeedDtoEnvelope.md)

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

<a id="getNotificationsCountAsync"></a>
# **getNotificationsCountAsync**
> Int32Envelope getNotificationsCountAsync(socialProfileId, apiVersion, xApiVersion)

Count social feeds

Returns the count of social feeds for the specified social profile.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialFeedsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SocialFeedsApi apiInstance = new SocialFeedsApi(defaultClient);
    UUID socialProfileId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getNotificationsCountAsync(socialProfileId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialFeedsApi#getNotificationsCountAsync");
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

<a id="updateFeedPostAsync"></a>
# **updateFeedPostAsync**
> SocialFeedPostDtoEnvelope updateFeedPostAsync(socialProfileId, socialFeedId, feedPostId, apiVersion, xApiVersion, socialFeedPostUpdateDto)

Update a social feed post

Updates an existing post in a specific social feed.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialFeedsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SocialFeedsApi apiInstance = new SocialFeedsApi(defaultClient);
    UUID socialProfileId = UUID.randomUUID(); // UUID | 
    UUID socialFeedId = UUID.randomUUID(); // UUID | 
    UUID feedPostId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SocialFeedPostUpdateDto socialFeedPostUpdateDto = new SocialFeedPostUpdateDto(); // SocialFeedPostUpdateDto | 
    try {
      SocialFeedPostDtoEnvelope result = apiInstance.updateFeedPostAsync(socialProfileId, socialFeedId, feedPostId, apiVersion, xApiVersion, socialFeedPostUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialFeedsApi#updateFeedPostAsync");
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
| **socialFeedId** | **UUID**|  | |
| **feedPostId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **socialFeedPostUpdateDto** | [**SocialFeedPostUpdateDto**](SocialFeedPostUpdateDto.md)|  | [optional] |

### Return type

[**SocialFeedPostDtoEnvelope**](SocialFeedPostDtoEnvelope.md)

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

