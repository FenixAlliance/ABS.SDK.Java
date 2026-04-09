# SocialPostBucketsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSocialPostBucketAsync**](SocialPostBucketsApi.md#createSocialPostBucketAsync) | **POST** /api/v2/MarketingService/SocialPostBuckets | Create a social post bucket |
| [**deleteSocialPostBucketAsync**](SocialPostBucketsApi.md#deleteSocialPostBucketAsync) | **DELETE** /api/v2/MarketingService/SocialPostBuckets/{socialpostbucketId} | Delete a social post bucket |
| [**getSocialPostBucketDetailsAsync**](SocialPostBucketsApi.md#getSocialPostBucketDetailsAsync) | **GET** /api/v2/MarketingService/SocialPostBuckets/{socialpostbucketId} | Get social post bucket by ID |
| [**getSocialPostBucketsCountAsync**](SocialPostBucketsApi.md#getSocialPostBucketsCountAsync) | **GET** /api/v2/MarketingService/SocialPostBuckets/Count | Get social post buckets count |
| [**getSocialPostBucketsODataAsync**](SocialPostBucketsApi.md#getSocialPostBucketsODataAsync) | **GET** /api/v2/MarketingService/SocialPostBuckets | Get social post buckets |
| [**updateSocialPostBucketAsync**](SocialPostBucketsApi.md#updateSocialPostBucketAsync) | **PUT** /api/v2/MarketingService/SocialPostBuckets/{socialpostbucketId} | Update a social post bucket |


<a id="createSocialPostBucketAsync"></a>
# **createSocialPostBucketAsync**
> EmptyEnvelope createSocialPostBucketAsync(tenantId, socialPostBucketCreateDto, apiVersion, xApiVersion)

Create a social post bucket

Creates a new social post bucket for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialPostBucketsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SocialPostBucketsApi apiInstance = new SocialPostBucketsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    SocialPostBucketCreateDto socialPostBucketCreateDto = new SocialPostBucketCreateDto(); // SocialPostBucketCreateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.createSocialPostBucketAsync(tenantId, socialPostBucketCreateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialPostBucketsApi#createSocialPostBucketAsync");
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
| **socialPostBucketCreateDto** | [**SocialPostBucketCreateDto**](SocialPostBucketCreateDto.md)|  | |
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

<a id="deleteSocialPostBucketAsync"></a>
# **deleteSocialPostBucketAsync**
> EmptyEnvelope deleteSocialPostBucketAsync(tenantId, socialpostbucketId, apiVersion, xApiVersion)

Delete a social post bucket

Deletes a social post bucket by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialPostBucketsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SocialPostBucketsApi apiInstance = new SocialPostBucketsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID socialpostbucketId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteSocialPostBucketAsync(tenantId, socialpostbucketId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialPostBucketsApi#deleteSocialPostBucketAsync");
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
| **socialpostbucketId** | **UUID**|  | |
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

<a id="getSocialPostBucketDetailsAsync"></a>
# **getSocialPostBucketDetailsAsync**
> SocialPostBucketDtoEnvelope getSocialPostBucketDetailsAsync(tenantId, socialpostbucketId, apiVersion, xApiVersion)

Get social post bucket by ID

Retrieves the details of a specific social post bucket by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialPostBucketsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SocialPostBucketsApi apiInstance = new SocialPostBucketsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID socialpostbucketId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SocialPostBucketDtoEnvelope result = apiInstance.getSocialPostBucketDetailsAsync(tenantId, socialpostbucketId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialPostBucketsApi#getSocialPostBucketDetailsAsync");
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
| **socialpostbucketId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**SocialPostBucketDtoEnvelope**](SocialPostBucketDtoEnvelope.md)

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

<a id="getSocialPostBucketsCountAsync"></a>
# **getSocialPostBucketsCountAsync**
> Int32Envelope getSocialPostBucketsCountAsync(tenantId, apiVersion, xApiVersion)

Get social post buckets count

Returns the count of social post buckets for the specified tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialPostBucketsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SocialPostBucketsApi apiInstance = new SocialPostBucketsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getSocialPostBucketsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialPostBucketsApi#getSocialPostBucketsCountAsync");
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

<a id="getSocialPostBucketsODataAsync"></a>
# **getSocialPostBucketsODataAsync**
> SocialPostBucketDtoListEnvelope getSocialPostBucketsODataAsync(tenantId, apiVersion, xApiVersion)

Get social post buckets

Retrieves a collection of social post buckets for the specified tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialPostBucketsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SocialPostBucketsApi apiInstance = new SocialPostBucketsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SocialPostBucketDtoListEnvelope result = apiInstance.getSocialPostBucketsODataAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialPostBucketsApi#getSocialPostBucketsODataAsync");
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

[**SocialPostBucketDtoListEnvelope**](SocialPostBucketDtoListEnvelope.md)

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

<a id="updateSocialPostBucketAsync"></a>
# **updateSocialPostBucketAsync**
> EmptyEnvelope updateSocialPostBucketAsync(tenantId, socialpostbucketId, socialPostBucketUpdateDto, apiVersion, xApiVersion)

Update a social post bucket

Updates an existing social post bucket by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialPostBucketsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SocialPostBucketsApi apiInstance = new SocialPostBucketsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID socialpostbucketId = UUID.randomUUID(); // UUID | 
    SocialPostBucketUpdateDto socialPostBucketUpdateDto = new SocialPostBucketUpdateDto(); // SocialPostBucketUpdateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.updateSocialPostBucketAsync(tenantId, socialpostbucketId, socialPostBucketUpdateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialPostBucketsApi#updateSocialPostBucketAsync");
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
| **socialpostbucketId** | **UUID**|  | |
| **socialPostBucketUpdateDto** | [**SocialPostBucketUpdateDto**](SocialPostBucketUpdateDto.md)|  | |
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

