# ServiceLevelsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**countAllServiceLevelsAsync**](ServiceLevelsApi.md#countAllServiceLevelsAsync) | **GET** /api/v2/ServicesService/ServiceLevels/Count | Get all service levels count |
| [**createServiceLevelAsync**](ServiceLevelsApi.md#createServiceLevelAsync) | **POST** /api/v2/ServicesService/Services/{serviceId}/ServiceLevels | Create a service level |
| [**deleteServiceLevelAsync**](ServiceLevelsApi.md#deleteServiceLevelAsync) | **DELETE** /api/v2/ServicesService/Services/{serviceId}/ServiceLevels/{serviceLevelId} | Delete a service level |
| [**getAllServiceLevelsAsync**](ServiceLevelsApi.md#getAllServiceLevelsAsync) | **GET** /api/v2/ServicesService/ServiceLevels | Get all service levels |
| [**getServiceLevelByIdAsync**](ServiceLevelsApi.md#getServiceLevelByIdAsync) | **GET** /api/v2/ServicesService/Services/{serviceId}/ServiceLevels/{serviceLevelId} | Get a service level by ID |
| [**getServiceLevelsAsync**](ServiceLevelsApi.md#getServiceLevelsAsync) | **GET** /api/v2/ServicesService/Services/{serviceId}/ServiceLevels | Get all service levels |
| [**getServiceLevelsCountAsync**](ServiceLevelsApi.md#getServiceLevelsCountAsync) | **GET** /api/v2/ServicesService/Services/{serviceId}/ServiceLevels/Count | Get service levels count |
| [**updateServiceLevelAsync**](ServiceLevelsApi.md#updateServiceLevelAsync) | **PUT** /api/v2/ServicesService/Services/{serviceId}/ServiceLevels/{serviceLevelId} | Update a service level |


<a id="countAllServiceLevelsAsync"></a>
# **countAllServiceLevelsAsync**
> Int32Envelope countAllServiceLevelsAsync(tenantId, apiVersion, xApiVersion)

Get all service levels count

Returns the count of all service levels for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceLevelsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ServiceLevelsApi apiInstance = new ServiceLevelsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.countAllServiceLevelsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceLevelsApi#countAllServiceLevelsAsync");
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

<a id="createServiceLevelAsync"></a>
# **createServiceLevelAsync**
> Envelope createServiceLevelAsync(tenantId, serviceId, apiVersion, xApiVersion, serviceLevelCreateDto)

Create a service level

Creates a new service level for the specified service.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceLevelsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ServiceLevelsApi apiInstance = new ServiceLevelsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID serviceId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ServiceLevelCreateDto serviceLevelCreateDto = new ServiceLevelCreateDto(); // ServiceLevelCreateDto | 
    try {
      Envelope result = apiInstance.createServiceLevelAsync(tenantId, serviceId, apiVersion, xApiVersion, serviceLevelCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceLevelsApi#createServiceLevelAsync");
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
| **serviceId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **serviceLevelCreateDto** | [**ServiceLevelCreateDto**](ServiceLevelCreateDto.md)|  | [optional] |

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

<a id="deleteServiceLevelAsync"></a>
# **deleteServiceLevelAsync**
> Envelope deleteServiceLevelAsync(tenantId, serviceId, serviceLevelId, apiVersion, xApiVersion)

Delete a service level

Deletes a service level by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceLevelsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ServiceLevelsApi apiInstance = new ServiceLevelsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID serviceId = UUID.randomUUID(); // UUID | 
    UUID serviceLevelId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Envelope result = apiInstance.deleteServiceLevelAsync(tenantId, serviceId, serviceLevelId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceLevelsApi#deleteServiceLevelAsync");
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
| **serviceId** | **UUID**|  | |
| **serviceLevelId** | **UUID**|  | |
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

<a id="getAllServiceLevelsAsync"></a>
# **getAllServiceLevelsAsync**
> ServiceLevelDtoIReadOnlyListEnvelope getAllServiceLevelsAsync(tenantId, apiVersion, xApiVersion)

Get all service levels

Retrieves all service levels for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceLevelsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ServiceLevelsApi apiInstance = new ServiceLevelsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ServiceLevelDtoIReadOnlyListEnvelope result = apiInstance.getAllServiceLevelsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceLevelsApi#getAllServiceLevelsAsync");
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

[**ServiceLevelDtoIReadOnlyListEnvelope**](ServiceLevelDtoIReadOnlyListEnvelope.md)

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

<a id="getServiceLevelByIdAsync"></a>
# **getServiceLevelByIdAsync**
> ServiceLevelDtoEnvelope getServiceLevelByIdAsync(tenantId, serviceId, serviceLevelId, apiVersion, xApiVersion)

Get a service level by ID

Retrieves a service level by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceLevelsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ServiceLevelsApi apiInstance = new ServiceLevelsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID serviceId = UUID.randomUUID(); // UUID | 
    UUID serviceLevelId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ServiceLevelDtoEnvelope result = apiInstance.getServiceLevelByIdAsync(tenantId, serviceId, serviceLevelId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceLevelsApi#getServiceLevelByIdAsync");
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
| **serviceId** | **UUID**|  | |
| **serviceLevelId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ServiceLevelDtoEnvelope**](ServiceLevelDtoEnvelope.md)

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

<a id="getServiceLevelsAsync"></a>
# **getServiceLevelsAsync**
> ServiceLevelDtoIReadOnlyListEnvelope getServiceLevelsAsync(tenantId, serviceId, apiVersion, xApiVersion)

Get all service levels

Retrieves all service levels for the specified service.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceLevelsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ServiceLevelsApi apiInstance = new ServiceLevelsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID serviceId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ServiceLevelDtoIReadOnlyListEnvelope result = apiInstance.getServiceLevelsAsync(tenantId, serviceId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceLevelsApi#getServiceLevelsAsync");
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
| **serviceId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ServiceLevelDtoIReadOnlyListEnvelope**](ServiceLevelDtoIReadOnlyListEnvelope.md)

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

<a id="getServiceLevelsCountAsync"></a>
# **getServiceLevelsCountAsync**
> Int32Envelope getServiceLevelsCountAsync(tenantId, serviceId, apiVersion, xApiVersion)

Get service levels count

Returns the count of service levels for the specified service.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceLevelsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ServiceLevelsApi apiInstance = new ServiceLevelsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID serviceId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getServiceLevelsCountAsync(tenantId, serviceId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceLevelsApi#getServiceLevelsCountAsync");
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
| **serviceId** | **UUID**|  | |
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

<a id="updateServiceLevelAsync"></a>
# **updateServiceLevelAsync**
> Envelope updateServiceLevelAsync(tenantId, serviceId, serviceLevelId, apiVersion, xApiVersion, serviceLevelUpdateDto)

Update a service level

Updates an existing service level.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceLevelsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ServiceLevelsApi apiInstance = new ServiceLevelsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID serviceId = UUID.randomUUID(); // UUID | 
    UUID serviceLevelId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ServiceLevelUpdateDto serviceLevelUpdateDto = new ServiceLevelUpdateDto(); // ServiceLevelUpdateDto | 
    try {
      Envelope result = apiInstance.updateServiceLevelAsync(tenantId, serviceId, serviceLevelId, apiVersion, xApiVersion, serviceLevelUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceLevelsApi#updateServiceLevelAsync");
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
| **serviceId** | **UUID**|  | |
| **serviceLevelId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **serviceLevelUpdateDto** | [**ServiceLevelUpdateDto**](ServiceLevelUpdateDto.md)|  | [optional] |

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

