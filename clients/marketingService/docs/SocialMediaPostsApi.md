# SocialMediaPostsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSocialMediaPostAsync**](SocialMediaPostsApi.md#createSocialMediaPostAsync) | **POST** /api/v2/MarketingService/SocialMediaPosts | Create a social media post |
| [**deleteSocialMediaPostAsync**](SocialMediaPostsApi.md#deleteSocialMediaPostAsync) | **DELETE** /api/v2/MarketingService/SocialMediaPosts/{socialmediapostId} | Delete a social media post |
| [**getSocialMediaPostDetailsAsync**](SocialMediaPostsApi.md#getSocialMediaPostDetailsAsync) | **GET** /api/v2/MarketingService/SocialMediaPosts/{socialmediapostId} | Get social media post by ID |
| [**getSocialMediaPostsCountAsync**](SocialMediaPostsApi.md#getSocialMediaPostsCountAsync) | **GET** /api/v2/MarketingService/SocialMediaPosts/Count | Get social media posts count |
| [**getSocialMediaPostsODataAsync**](SocialMediaPostsApi.md#getSocialMediaPostsODataAsync) | **GET** /api/v2/MarketingService/SocialMediaPosts | Get social media posts |
| [**updateSocialMediaPostAsync**](SocialMediaPostsApi.md#updateSocialMediaPostAsync) | **PUT** /api/v2/MarketingService/SocialMediaPosts/{socialmediapostId} | Update a social media post |


<a id="createSocialMediaPostAsync"></a>
# **createSocialMediaPostAsync**
> EmptyEnvelope createSocialMediaPostAsync(tenantId, socialMediaPostCreateDto, apiVersion, xApiVersion)

Create a social media post

Creates a new social media post for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialMediaPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SocialMediaPostsApi apiInstance = new SocialMediaPostsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    SocialMediaPostCreateDto socialMediaPostCreateDto = new SocialMediaPostCreateDto(); // SocialMediaPostCreateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.createSocialMediaPostAsync(tenantId, socialMediaPostCreateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialMediaPostsApi#createSocialMediaPostAsync");
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
| **socialMediaPostCreateDto** | [**SocialMediaPostCreateDto**](SocialMediaPostCreateDto.md)|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

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
| **400** | Bad Request |  -  |
| **201** | Created |  -  |

<a id="deleteSocialMediaPostAsync"></a>
# **deleteSocialMediaPostAsync**
> EmptyEnvelope deleteSocialMediaPostAsync(tenantId, socialmediapostId, apiVersion, xApiVersion)

Delete a social media post

Deletes a social media post by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialMediaPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SocialMediaPostsApi apiInstance = new SocialMediaPostsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID socialmediapostId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteSocialMediaPostAsync(tenantId, socialmediapostId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialMediaPostsApi#deleteSocialMediaPostAsync");
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
| **socialmediapostId** | **UUID**|  | |
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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

<a id="getSocialMediaPostDetailsAsync"></a>
# **getSocialMediaPostDetailsAsync**
> SocialMediaPostDtoEnvelope getSocialMediaPostDetailsAsync(tenantId, socialmediapostId, apiVersion, xApiVersion)

Get social media post by ID

Retrieves the details of a specific social media post by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialMediaPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SocialMediaPostsApi apiInstance = new SocialMediaPostsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID socialmediapostId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SocialMediaPostDtoEnvelope result = apiInstance.getSocialMediaPostDetailsAsync(tenantId, socialmediapostId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialMediaPostsApi#getSocialMediaPostDetailsAsync");
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
| **socialmediapostId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**SocialMediaPostDtoEnvelope**](SocialMediaPostDtoEnvelope.md)

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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

<a id="getSocialMediaPostsCountAsync"></a>
# **getSocialMediaPostsCountAsync**
> Int32Envelope getSocialMediaPostsCountAsync(tenantId, apiVersion, xApiVersion)

Get social media posts count

Returns the count of social media posts for the specified tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialMediaPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SocialMediaPostsApi apiInstance = new SocialMediaPostsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getSocialMediaPostsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialMediaPostsApi#getSocialMediaPostsCountAsync");
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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

<a id="getSocialMediaPostsODataAsync"></a>
# **getSocialMediaPostsODataAsync**
> SocialMediaPostDtoListEnvelope getSocialMediaPostsODataAsync(tenantId, apiVersion, xApiVersion)

Get social media posts

Retrieves a collection of social media posts for the specified tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialMediaPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SocialMediaPostsApi apiInstance = new SocialMediaPostsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SocialMediaPostDtoListEnvelope result = apiInstance.getSocialMediaPostsODataAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialMediaPostsApi#getSocialMediaPostsODataAsync");
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

[**SocialMediaPostDtoListEnvelope**](SocialMediaPostDtoListEnvelope.md)

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

<a id="updateSocialMediaPostAsync"></a>
# **updateSocialMediaPostAsync**
> EmptyEnvelope updateSocialMediaPostAsync(tenantId, socialmediapostId, socialMediaPostUpdateDto, apiVersion, xApiVersion)

Update a social media post

Updates an existing social media post by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialMediaPostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SocialMediaPostsApi apiInstance = new SocialMediaPostsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID socialmediapostId = UUID.randomUUID(); // UUID | 
    SocialMediaPostUpdateDto socialMediaPostUpdateDto = new SocialMediaPostUpdateDto(); // SocialMediaPostUpdateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.updateSocialMediaPostAsync(tenantId, socialmediapostId, socialMediaPostUpdateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialMediaPostsApi#updateSocialMediaPostAsync");
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
| **socialmediapostId** | **UUID**|  | |
| **socialMediaPostUpdateDto** | [**SocialMediaPostUpdateDto**](SocialMediaPostUpdateDto.md)|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

