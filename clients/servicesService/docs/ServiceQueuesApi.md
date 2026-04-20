# ServiceQueuesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createServiceQueueAsync**](ServiceQueuesApi.md#createServiceQueueAsync) | **POST** /api/v2/ServicesService/ServiceQueues | Create a service queue |
| [**deleteServiceQueueAsync**](ServiceQueuesApi.md#deleteServiceQueueAsync) | **DELETE** /api/v2/ServicesService/ServiceQueues/{serviceQueueId} | Delete a service queue |
| [**getServiceQueueByIdAsync**](ServiceQueuesApi.md#getServiceQueueByIdAsync) | **GET** /api/v2/ServicesService/ServiceQueues/{serviceQueueId} | Get a service queue by ID |
| [**getServiceQueuesAsync**](ServiceQueuesApi.md#getServiceQueuesAsync) | **GET** /api/v2/ServicesService/ServiceQueues | Get all service queues |
| [**getServiceQueuesCountAsync**](ServiceQueuesApi.md#getServiceQueuesCountAsync) | **GET** /api/v2/ServicesService/ServiceQueues/Count | Get service queues count |
| [**updateServiceQueueAsync**](ServiceQueuesApi.md#updateServiceQueueAsync) | **PUT** /api/v2/ServicesService/ServiceQueues/{serviceQueueId} | Update a service queue |


<a id="createServiceQueueAsync"></a>
# **createServiceQueueAsync**
> Envelope createServiceQueueAsync(tenantId, apiVersion, xApiVersion, serviceQueueCreateDto)

Create a service queue

Creates a new service queue for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceQueuesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ServiceQueuesApi apiInstance = new ServiceQueuesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ServiceQueueCreateDto serviceQueueCreateDto = new ServiceQueueCreateDto(); // ServiceQueueCreateDto | 
    try {
      Envelope result = apiInstance.createServiceQueueAsync(tenantId, apiVersion, xApiVersion, serviceQueueCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceQueuesApi#createServiceQueueAsync");
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
| **serviceQueueCreateDto** | [**ServiceQueueCreateDto**](ServiceQueueCreateDto.md)|  | [optional] |

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

<a id="deleteServiceQueueAsync"></a>
# **deleteServiceQueueAsync**
> Envelope deleteServiceQueueAsync(tenantId, serviceQueueId, apiVersion, xApiVersion)

Delete a service queue

Deletes a service queue by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceQueuesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ServiceQueuesApi apiInstance = new ServiceQueuesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID serviceQueueId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Envelope result = apiInstance.deleteServiceQueueAsync(tenantId, serviceQueueId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceQueuesApi#deleteServiceQueueAsync");
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
| **serviceQueueId** | **UUID**|  | |
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

<a id="getServiceQueueByIdAsync"></a>
# **getServiceQueueByIdAsync**
> ServiceQueueDtoEnvelope getServiceQueueByIdAsync(tenantId, serviceQueueId, apiVersion, xApiVersion)

Get a service queue by ID

Retrieves a service queue by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceQueuesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ServiceQueuesApi apiInstance = new ServiceQueuesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID serviceQueueId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ServiceQueueDtoEnvelope result = apiInstance.getServiceQueueByIdAsync(tenantId, serviceQueueId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceQueuesApi#getServiceQueueByIdAsync");
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
| **serviceQueueId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ServiceQueueDtoEnvelope**](ServiceQueueDtoEnvelope.md)

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

<a id="getServiceQueuesAsync"></a>
# **getServiceQueuesAsync**
> ServiceQueueDtoIReadOnlyListEnvelope getServiceQueuesAsync(tenantId, apiVersion, xApiVersion)

Get all service queues

Retrieves all service queues for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceQueuesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ServiceQueuesApi apiInstance = new ServiceQueuesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ServiceQueueDtoIReadOnlyListEnvelope result = apiInstance.getServiceQueuesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceQueuesApi#getServiceQueuesAsync");
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

[**ServiceQueueDtoIReadOnlyListEnvelope**](ServiceQueueDtoIReadOnlyListEnvelope.md)

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

<a id="getServiceQueuesCountAsync"></a>
# **getServiceQueuesCountAsync**
> Int32Envelope getServiceQueuesCountAsync(tenantId, apiVersion, xApiVersion)

Get service queues count

Returns the count of service queues for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceQueuesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ServiceQueuesApi apiInstance = new ServiceQueuesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getServiceQueuesCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceQueuesApi#getServiceQueuesCountAsync");
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

<a id="updateServiceQueueAsync"></a>
# **updateServiceQueueAsync**
> Envelope updateServiceQueueAsync(tenantId, serviceQueueId, apiVersion, xApiVersion, serviceQueueUpdateDto)

Update a service queue

Updates an existing service queue.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceQueuesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ServiceQueuesApi apiInstance = new ServiceQueuesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID serviceQueueId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ServiceQueueUpdateDto serviceQueueUpdateDto = new ServiceQueueUpdateDto(); // ServiceQueueUpdateDto | 
    try {
      Envelope result = apiInstance.updateServiceQueueAsync(tenantId, serviceQueueId, apiVersion, xApiVersion, serviceQueueUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceQueuesApi#updateServiceQueueAsync");
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
| **serviceQueueId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **serviceQueueUpdateDto** | [**ServiceQueueUpdateDto**](ServiceQueueUpdateDto.md)|  | [optional] |

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

