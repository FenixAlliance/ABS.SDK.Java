# ServiceCaseTypesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createServiceCaseTypeAsync**](ServiceCaseTypesApi.md#createServiceCaseTypeAsync) | **POST** /api/v2/ServicesService/ServiceCaseTypes | Create a service case type |
| [**deleteServiceCaseTypeAsync**](ServiceCaseTypesApi.md#deleteServiceCaseTypeAsync) | **DELETE** /api/v2/ServicesService/ServiceCaseTypes/{serviceCaseTypeId} | Delete a service case type |
| [**getServiceCaseTypeByIdAsync**](ServiceCaseTypesApi.md#getServiceCaseTypeByIdAsync) | **GET** /api/v2/ServicesService/ServiceCaseTypes/{serviceCaseTypeId} | Get a service case type by ID |
| [**getServiceCaseTypesAsync**](ServiceCaseTypesApi.md#getServiceCaseTypesAsync) | **GET** /api/v2/ServicesService/ServiceCaseTypes | Get all service case types |
| [**getServiceCaseTypesCountAsync**](ServiceCaseTypesApi.md#getServiceCaseTypesCountAsync) | **GET** /api/v2/ServicesService/ServiceCaseTypes/Count | Get service case types count |
| [**updateServiceCaseTypeAsync**](ServiceCaseTypesApi.md#updateServiceCaseTypeAsync) | **PUT** /api/v2/ServicesService/ServiceCaseTypes/{serviceCaseTypeId} | Update a service case type |


<a id="createServiceCaseTypeAsync"></a>
# **createServiceCaseTypeAsync**
> Envelope createServiceCaseTypeAsync(tenantId, apiVersion, xApiVersion, serviceCaseTypeCreateDto)

Create a service case type

Creates a new service case type for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceCaseTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ServiceCaseTypesApi apiInstance = new ServiceCaseTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ServiceCaseTypeCreateDto serviceCaseTypeCreateDto = new ServiceCaseTypeCreateDto(); // ServiceCaseTypeCreateDto | 
    try {
      Envelope result = apiInstance.createServiceCaseTypeAsync(tenantId, apiVersion, xApiVersion, serviceCaseTypeCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceCaseTypesApi#createServiceCaseTypeAsync");
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
| **serviceCaseTypeCreateDto** | [**ServiceCaseTypeCreateDto**](ServiceCaseTypeCreateDto.md)|  | [optional] |

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

<a id="deleteServiceCaseTypeAsync"></a>
# **deleteServiceCaseTypeAsync**
> Envelope deleteServiceCaseTypeAsync(tenantId, serviceCaseTypeId, apiVersion, xApiVersion)

Delete a service case type

Deletes a service case type by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceCaseTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ServiceCaseTypesApi apiInstance = new ServiceCaseTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID serviceCaseTypeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Envelope result = apiInstance.deleteServiceCaseTypeAsync(tenantId, serviceCaseTypeId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceCaseTypesApi#deleteServiceCaseTypeAsync");
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
| **serviceCaseTypeId** | **UUID**|  | |
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

<a id="getServiceCaseTypeByIdAsync"></a>
# **getServiceCaseTypeByIdAsync**
> ServiceCaseTypeDtoEnvelope getServiceCaseTypeByIdAsync(tenantId, serviceCaseTypeId, apiVersion, xApiVersion)

Get a service case type by ID

Retrieves a service case type by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceCaseTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ServiceCaseTypesApi apiInstance = new ServiceCaseTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID serviceCaseTypeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ServiceCaseTypeDtoEnvelope result = apiInstance.getServiceCaseTypeByIdAsync(tenantId, serviceCaseTypeId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceCaseTypesApi#getServiceCaseTypeByIdAsync");
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
| **serviceCaseTypeId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ServiceCaseTypeDtoEnvelope**](ServiceCaseTypeDtoEnvelope.md)

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

<a id="getServiceCaseTypesAsync"></a>
# **getServiceCaseTypesAsync**
> ServiceCaseTypeDtoIReadOnlyListEnvelope getServiceCaseTypesAsync(tenantId, apiVersion, xApiVersion)

Get all service case types

Retrieves all service case types for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceCaseTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ServiceCaseTypesApi apiInstance = new ServiceCaseTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ServiceCaseTypeDtoIReadOnlyListEnvelope result = apiInstance.getServiceCaseTypesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceCaseTypesApi#getServiceCaseTypesAsync");
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

[**ServiceCaseTypeDtoIReadOnlyListEnvelope**](ServiceCaseTypeDtoIReadOnlyListEnvelope.md)

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

<a id="getServiceCaseTypesCountAsync"></a>
# **getServiceCaseTypesCountAsync**
> Int32Envelope getServiceCaseTypesCountAsync(tenantId, apiVersion, xApiVersion)

Get service case types count

Returns the count of service case types for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceCaseTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ServiceCaseTypesApi apiInstance = new ServiceCaseTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getServiceCaseTypesCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceCaseTypesApi#getServiceCaseTypesCountAsync");
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

<a id="updateServiceCaseTypeAsync"></a>
# **updateServiceCaseTypeAsync**
> Envelope updateServiceCaseTypeAsync(tenantId, serviceCaseTypeId, apiVersion, xApiVersion, serviceCaseTypeUpdateDto)

Update a service case type

Updates an existing service case type.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceCaseTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ServiceCaseTypesApi apiInstance = new ServiceCaseTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID serviceCaseTypeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ServiceCaseTypeUpdateDto serviceCaseTypeUpdateDto = new ServiceCaseTypeUpdateDto(); // ServiceCaseTypeUpdateDto | 
    try {
      Envelope result = apiInstance.updateServiceCaseTypeAsync(tenantId, serviceCaseTypeId, apiVersion, xApiVersion, serviceCaseTypeUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceCaseTypesApi#updateServiceCaseTypeAsync");
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
| **serviceCaseTypeId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **serviceCaseTypeUpdateDto** | [**ServiceCaseTypeUpdateDto**](ServiceCaseTypeUpdateDto.md)|  | [optional] |

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

