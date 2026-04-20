# SubscriptionsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSubscriptionAsync**](SubscriptionsApi.md#createSubscriptionAsync) | **POST** /api/v2/SubscriptionsService/Subscriptions | Create a subscription |
| [**deleteSubscriptionAsync**](SubscriptionsApi.md#deleteSubscriptionAsync) | **DELETE** /api/v2/SubscriptionsService/Subscriptions/{subscriptionId} | Delete a subscription |
| [**getSubscriptionByIdAsync**](SubscriptionsApi.md#getSubscriptionByIdAsync) | **GET** /api/v2/SubscriptionsService/Subscriptions/{subscriptionId} | Get a subscription by ID |
| [**getSubscriptionsAsync**](SubscriptionsApi.md#getSubscriptionsAsync) | **GET** /api/v2/SubscriptionsService/Subscriptions | Get all subscriptions |
| [**getSubscriptionsCountAsync**](SubscriptionsApi.md#getSubscriptionsCountAsync) | **GET** /api/v2/SubscriptionsService/Subscriptions/Count | Get subscriptions count |
| [**updateSubscriptionAsync**](SubscriptionsApi.md#updateSubscriptionAsync) | **PUT** /api/v2/SubscriptionsService/Subscriptions/{subscriptionId} | Update a subscription |


<a id="createSubscriptionAsync"></a>
# **createSubscriptionAsync**
> Envelope createSubscriptionAsync(tenantId, apiVersion, xApiVersion, subscriptionCreateDto)

Create a subscription

Creates a new subscription for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubscriptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SubscriptionCreateDto subscriptionCreateDto = new SubscriptionCreateDto(); // SubscriptionCreateDto | 
    try {
      Envelope result = apiInstance.createSubscriptionAsync(tenantId, apiVersion, xApiVersion, subscriptionCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#createSubscriptionAsync");
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
| **subscriptionCreateDto** | [**SubscriptionCreateDto**](SubscriptionCreateDto.md)|  | [optional] |

### Return type

[**Envelope**](Envelope.md)

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

<a id="deleteSubscriptionAsync"></a>
# **deleteSubscriptionAsync**
> Envelope deleteSubscriptionAsync(tenantId, subscriptionId, apiVersion, xApiVersion)

Delete a subscription

Deletes a subscription by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubscriptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID subscriptionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Envelope result = apiInstance.deleteSubscriptionAsync(tenantId, subscriptionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#deleteSubscriptionAsync");
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
| **subscriptionId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**Envelope**](Envelope.md)

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

<a id="getSubscriptionByIdAsync"></a>
# **getSubscriptionByIdAsync**
> SubscriptionDtoEnvelope getSubscriptionByIdAsync(tenantId, subscriptionId, apiVersion, xApiVersion)

Get a subscription by ID

Retrieves a subscription by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubscriptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID subscriptionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SubscriptionDtoEnvelope result = apiInstance.getSubscriptionByIdAsync(tenantId, subscriptionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#getSubscriptionByIdAsync");
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
| **subscriptionId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**SubscriptionDtoEnvelope**](SubscriptionDtoEnvelope.md)

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

<a id="getSubscriptionsAsync"></a>
# **getSubscriptionsAsync**
> SubscriptionDtoIReadOnlyListEnvelope getSubscriptionsAsync(tenantId, apiVersion, xApiVersion)

Get all subscriptions

Retrieves all subscriptions for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubscriptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SubscriptionDtoIReadOnlyListEnvelope result = apiInstance.getSubscriptionsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#getSubscriptionsAsync");
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

[**SubscriptionDtoIReadOnlyListEnvelope**](SubscriptionDtoIReadOnlyListEnvelope.md)

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

<a id="getSubscriptionsCountAsync"></a>
# **getSubscriptionsCountAsync**
> Int32Envelope getSubscriptionsCountAsync(tenantId, apiVersion, xApiVersion)

Get subscriptions count

Returns the count of subscriptions for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubscriptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getSubscriptionsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#getSubscriptionsCountAsync");
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

<a id="updateSubscriptionAsync"></a>
# **updateSubscriptionAsync**
> Envelope updateSubscriptionAsync(tenantId, subscriptionId, apiVersion, xApiVersion, subscriptionUpdateDto)

Update a subscription

Updates an existing subscription.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubscriptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID subscriptionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SubscriptionUpdateDto subscriptionUpdateDto = new SubscriptionUpdateDto(); // SubscriptionUpdateDto | 
    try {
      Envelope result = apiInstance.updateSubscriptionAsync(tenantId, subscriptionId, apiVersion, xApiVersion, subscriptionUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#updateSubscriptionAsync");
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
| **subscriptionId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **subscriptionUpdateDto** | [**SubscriptionUpdateDto**](SubscriptionUpdateDto.md)|  | [optional] |

### Return type

[**Envelope**](Envelope.md)

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

