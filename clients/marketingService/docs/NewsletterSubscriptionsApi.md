# NewsletterSubscriptionsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewsletterSubscriptionAsync**](NewsletterSubscriptionsApi.md#createNewsletterSubscriptionAsync) | **POST** /api/v2/MarketingService/NewsletterSubscriptions | Create a newsletter subscription |
| [**deleteNewsletterSubscriptionAsync**](NewsletterSubscriptionsApi.md#deleteNewsletterSubscriptionAsync) | **DELETE** /api/v2/MarketingService/NewsletterSubscriptions/{newsletterSubscriptionId} | Delete a newsletter subscription |
| [**getNewsletterSubscriptionByIdAsync**](NewsletterSubscriptionsApi.md#getNewsletterSubscriptionByIdAsync) | **GET** /api/v2/MarketingService/NewsletterSubscriptions/{newsletterSubscriptionId} | Get newsletter subscription by ID |
| [**getNewsletterSubscriptionsAsync**](NewsletterSubscriptionsApi.md#getNewsletterSubscriptionsAsync) | **GET** /api/v2/MarketingService/NewsletterSubscriptions | Get newsletter subscriptions |
| [**getNewsletterSubscriptionsCountAsync**](NewsletterSubscriptionsApi.md#getNewsletterSubscriptionsCountAsync) | **GET** /api/v2/MarketingService/NewsletterSubscriptions/Count | Get newsletter subscriptions count |
| [**updateNewsletterSubscriptionAsync**](NewsletterSubscriptionsApi.md#updateNewsletterSubscriptionAsync) | **PUT** /api/v2/MarketingService/NewsletterSubscriptions/{newsletterSubscriptionId} | Update a newsletter subscription |


<a id="createNewsletterSubscriptionAsync"></a>
# **createNewsletterSubscriptionAsync**
> EmptyEnvelope createNewsletterSubscriptionAsync(tenantId, newsletterSubscriptionCreateDto, apiVersion, xApiVersion)

Create a newsletter subscription

Creates a new newsletter subscription for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NewsletterSubscriptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    NewsletterSubscriptionsApi apiInstance = new NewsletterSubscriptionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    NewsletterSubscriptionCreateDto newsletterSubscriptionCreateDto = new NewsletterSubscriptionCreateDto(); // NewsletterSubscriptionCreateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.createNewsletterSubscriptionAsync(tenantId, newsletterSubscriptionCreateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NewsletterSubscriptionsApi#createNewsletterSubscriptionAsync");
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
| **newsletterSubscriptionCreateDto** | [**NewsletterSubscriptionCreateDto**](NewsletterSubscriptionCreateDto.md)|  | |
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

<a id="deleteNewsletterSubscriptionAsync"></a>
# **deleteNewsletterSubscriptionAsync**
> EmptyEnvelope deleteNewsletterSubscriptionAsync(tenantId, newsletterSubscriptionId, apiVersion, xApiVersion)

Delete a newsletter subscription

Deletes a newsletter subscription by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NewsletterSubscriptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    NewsletterSubscriptionsApi apiInstance = new NewsletterSubscriptionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID newsletterSubscriptionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteNewsletterSubscriptionAsync(tenantId, newsletterSubscriptionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NewsletterSubscriptionsApi#deleteNewsletterSubscriptionAsync");
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
| **newsletterSubscriptionId** | **UUID**|  | |
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

<a id="getNewsletterSubscriptionByIdAsync"></a>
# **getNewsletterSubscriptionByIdAsync**
> NewsletterSubscriptionDtoEnvelope getNewsletterSubscriptionByIdAsync(tenantId, newsletterSubscriptionId, apiVersion, xApiVersion)

Get newsletter subscription by ID

Retrieves the details of a specific newsletter subscription by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NewsletterSubscriptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    NewsletterSubscriptionsApi apiInstance = new NewsletterSubscriptionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID newsletterSubscriptionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      NewsletterSubscriptionDtoEnvelope result = apiInstance.getNewsletterSubscriptionByIdAsync(tenantId, newsletterSubscriptionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NewsletterSubscriptionsApi#getNewsletterSubscriptionByIdAsync");
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
| **newsletterSubscriptionId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**NewsletterSubscriptionDtoEnvelope**](NewsletterSubscriptionDtoEnvelope.md)

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

<a id="getNewsletterSubscriptionsAsync"></a>
# **getNewsletterSubscriptionsAsync**
> NewsletterSubscriptionDtoListEnvelope getNewsletterSubscriptionsAsync(tenantId, apiVersion, xApiVersion)

Get newsletter subscriptions

Retrieves a collection of newsletter subscriptions for the specified tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NewsletterSubscriptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    NewsletterSubscriptionsApi apiInstance = new NewsletterSubscriptionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      NewsletterSubscriptionDtoListEnvelope result = apiInstance.getNewsletterSubscriptionsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NewsletterSubscriptionsApi#getNewsletterSubscriptionsAsync");
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

[**NewsletterSubscriptionDtoListEnvelope**](NewsletterSubscriptionDtoListEnvelope.md)

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

<a id="getNewsletterSubscriptionsCountAsync"></a>
# **getNewsletterSubscriptionsCountAsync**
> Int32Envelope getNewsletterSubscriptionsCountAsync(tenantId, apiVersion, xApiVersion)

Get newsletter subscriptions count

Returns the count of newsletter subscriptions for the specified tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NewsletterSubscriptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    NewsletterSubscriptionsApi apiInstance = new NewsletterSubscriptionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getNewsletterSubscriptionsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NewsletterSubscriptionsApi#getNewsletterSubscriptionsCountAsync");
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

<a id="updateNewsletterSubscriptionAsync"></a>
# **updateNewsletterSubscriptionAsync**
> EmptyEnvelope updateNewsletterSubscriptionAsync(tenantId, newsletterSubscriptionId, newsletterSubscriptionUpdateDto, apiVersion, xApiVersion)

Update a newsletter subscription

Updates an existing newsletter subscription by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NewsletterSubscriptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    NewsletterSubscriptionsApi apiInstance = new NewsletterSubscriptionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID newsletterSubscriptionId = UUID.randomUUID(); // UUID | 
    NewsletterSubscriptionUpdateDto newsletterSubscriptionUpdateDto = new NewsletterSubscriptionUpdateDto(); // NewsletterSubscriptionUpdateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.updateNewsletterSubscriptionAsync(tenantId, newsletterSubscriptionId, newsletterSubscriptionUpdateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NewsletterSubscriptionsApi#updateNewsletterSubscriptionAsync");
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
| **newsletterSubscriptionId** | **UUID**|  | |
| **newsletterSubscriptionUpdateDto** | [**NewsletterSubscriptionUpdateDto**](NewsletterSubscriptionUpdateDto.md)|  | |
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

