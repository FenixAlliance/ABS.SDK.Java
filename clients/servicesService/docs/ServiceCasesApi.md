# ServiceCasesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createServiceCaseAsync**](ServiceCasesApi.md#createServiceCaseAsync) | **POST** /api/v2/ServicesService/ServiceCases | Create a service case |
| [**deleteServiceCaseAsync**](ServiceCasesApi.md#deleteServiceCaseAsync) | **DELETE** /api/v2/ServicesService/ServiceCases/{serviceCaseId} | Delete a service case |
| [**getServiceCaseByIdAsync**](ServiceCasesApi.md#getServiceCaseByIdAsync) | **GET** /api/v2/ServicesService/ServiceCases/{serviceCaseId} | Get a service case by ID |
| [**getServiceCasesAsync**](ServiceCasesApi.md#getServiceCasesAsync) | **GET** /api/v2/ServicesService/ServiceCases | Get all service cases |
| [**getServiceCasesCountAsync**](ServiceCasesApi.md#getServiceCasesCountAsync) | **GET** /api/v2/ServicesService/ServiceCases/Count | Get service cases count |
| [**updateServiceCaseAsync**](ServiceCasesApi.md#updateServiceCaseAsync) | **PUT** /api/v2/ServicesService/ServiceCases/{serviceCaseId} | Update a service case |


<a id="createServiceCaseAsync"></a>
# **createServiceCaseAsync**
> Envelope createServiceCaseAsync(tenantId, apiVersion, xApiVersion, serviceCaseCreateDto)

Create a service case

Creates a new service case for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceCasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ServiceCasesApi apiInstance = new ServiceCasesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ServiceCaseCreateDto serviceCaseCreateDto = new ServiceCaseCreateDto(); // ServiceCaseCreateDto | 
    try {
      Envelope result = apiInstance.createServiceCaseAsync(tenantId, apiVersion, xApiVersion, serviceCaseCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceCasesApi#createServiceCaseAsync");
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
| **serviceCaseCreateDto** | [**ServiceCaseCreateDto**](ServiceCaseCreateDto.md)|  | [optional] |

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

<a id="deleteServiceCaseAsync"></a>
# **deleteServiceCaseAsync**
> Envelope deleteServiceCaseAsync(tenantId, serviceCaseId, apiVersion, xApiVersion)

Delete a service case

Deletes a service case by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceCasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ServiceCasesApi apiInstance = new ServiceCasesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID serviceCaseId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Envelope result = apiInstance.deleteServiceCaseAsync(tenantId, serviceCaseId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceCasesApi#deleteServiceCaseAsync");
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
| **serviceCaseId** | **UUID**|  | |
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

<a id="getServiceCaseByIdAsync"></a>
# **getServiceCaseByIdAsync**
> ServiceCaseDtoEnvelope getServiceCaseByIdAsync(tenantId, serviceCaseId, apiVersion, xApiVersion)

Get a service case by ID

Retrieves a service case by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceCasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ServiceCasesApi apiInstance = new ServiceCasesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID serviceCaseId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ServiceCaseDtoEnvelope result = apiInstance.getServiceCaseByIdAsync(tenantId, serviceCaseId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceCasesApi#getServiceCaseByIdAsync");
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
| **serviceCaseId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ServiceCaseDtoEnvelope**](ServiceCaseDtoEnvelope.md)

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

<a id="getServiceCasesAsync"></a>
# **getServiceCasesAsync**
> ServiceCaseDtoIReadOnlyListEnvelope getServiceCasesAsync(tenantId, apiVersion, xApiVersion)

Get all service cases

Retrieves all service cases for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceCasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ServiceCasesApi apiInstance = new ServiceCasesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ServiceCaseDtoIReadOnlyListEnvelope result = apiInstance.getServiceCasesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceCasesApi#getServiceCasesAsync");
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

[**ServiceCaseDtoIReadOnlyListEnvelope**](ServiceCaseDtoIReadOnlyListEnvelope.md)

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

<a id="getServiceCasesCountAsync"></a>
# **getServiceCasesCountAsync**
> Int32Envelope getServiceCasesCountAsync(tenantId, apiVersion, xApiVersion)

Get service cases count

Returns the count of service cases for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceCasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ServiceCasesApi apiInstance = new ServiceCasesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getServiceCasesCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceCasesApi#getServiceCasesCountAsync");
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

<a id="updateServiceCaseAsync"></a>
# **updateServiceCaseAsync**
> Envelope updateServiceCaseAsync(tenantId, serviceCaseId, apiVersion, xApiVersion, serviceCaseUpdateDto)

Update a service case

Updates an existing service case.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceCasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ServiceCasesApi apiInstance = new ServiceCasesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID serviceCaseId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ServiceCaseUpdateDto serviceCaseUpdateDto = new ServiceCaseUpdateDto(); // ServiceCaseUpdateDto | 
    try {
      Envelope result = apiInstance.updateServiceCaseAsync(tenantId, serviceCaseId, apiVersion, xApiVersion, serviceCaseUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceCasesApi#updateServiceCaseAsync");
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
| **serviceCaseId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **serviceCaseUpdateDto** | [**ServiceCaseUpdateDto**](ServiceCaseUpdateDto.md)|  | [optional] |

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

