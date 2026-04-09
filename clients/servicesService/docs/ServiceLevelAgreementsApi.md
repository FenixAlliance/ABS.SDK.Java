# ServiceLevelAgreementsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createServiceLevelAgreementAsync**](ServiceLevelAgreementsApi.md#createServiceLevelAgreementAsync) | **POST** /api/v2/ServicesService/ServiceLevelAgreements | Create a service level agreement |
| [**deleteServiceLevelAgreementAsync**](ServiceLevelAgreementsApi.md#deleteServiceLevelAgreementAsync) | **DELETE** /api/v2/ServicesService/ServiceLevelAgreements/{serviceLevelAgreementId} | Delete a service level agreement |
| [**getServiceLevelAgreementByIdAsync**](ServiceLevelAgreementsApi.md#getServiceLevelAgreementByIdAsync) | **GET** /api/v2/ServicesService/ServiceLevelAgreements/{serviceLevelAgreementId} | Get a service level agreement by ID |
| [**getServiceLevelAgreementsAsync**](ServiceLevelAgreementsApi.md#getServiceLevelAgreementsAsync) | **GET** /api/v2/ServicesService/ServiceLevelAgreements | Get all service level agreements |
| [**getServiceLevelAgreementsCountAsync**](ServiceLevelAgreementsApi.md#getServiceLevelAgreementsCountAsync) | **GET** /api/v2/ServicesService/ServiceLevelAgreements/Count | Get service level agreements count |
| [**updateServiceLevelAgreementAsync**](ServiceLevelAgreementsApi.md#updateServiceLevelAgreementAsync) | **PUT** /api/v2/ServicesService/ServiceLevelAgreements/{serviceLevelAgreementId} | Update a service level agreement |


<a id="createServiceLevelAgreementAsync"></a>
# **createServiceLevelAgreementAsync**
> Envelope createServiceLevelAgreementAsync(tenantId, apiVersion, xApiVersion, serviceLevelAgreementCreateDto)

Create a service level agreement

Creates a new service level agreement for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceLevelAgreementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ServiceLevelAgreementsApi apiInstance = new ServiceLevelAgreementsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ServiceLevelAgreementCreateDto serviceLevelAgreementCreateDto = new ServiceLevelAgreementCreateDto(); // ServiceLevelAgreementCreateDto | 
    try {
      Envelope result = apiInstance.createServiceLevelAgreementAsync(tenantId, apiVersion, xApiVersion, serviceLevelAgreementCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceLevelAgreementsApi#createServiceLevelAgreementAsync");
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
| **serviceLevelAgreementCreateDto** | [**ServiceLevelAgreementCreateDto**](ServiceLevelAgreementCreateDto.md)|  | [optional] |

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

<a id="deleteServiceLevelAgreementAsync"></a>
# **deleteServiceLevelAgreementAsync**
> Envelope deleteServiceLevelAgreementAsync(tenantId, serviceLevelAgreementId, apiVersion, xApiVersion)

Delete a service level agreement

Deletes a service level agreement by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceLevelAgreementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ServiceLevelAgreementsApi apiInstance = new ServiceLevelAgreementsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID serviceLevelAgreementId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Envelope result = apiInstance.deleteServiceLevelAgreementAsync(tenantId, serviceLevelAgreementId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceLevelAgreementsApi#deleteServiceLevelAgreementAsync");
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
| **serviceLevelAgreementId** | **UUID**|  | |
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

<a id="getServiceLevelAgreementByIdAsync"></a>
# **getServiceLevelAgreementByIdAsync**
> ServiceLevelAgreementDtoEnvelope getServiceLevelAgreementByIdAsync(tenantId, serviceLevelAgreementId, apiVersion, xApiVersion)

Get a service level agreement by ID

Retrieves a service level agreement by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceLevelAgreementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ServiceLevelAgreementsApi apiInstance = new ServiceLevelAgreementsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID serviceLevelAgreementId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ServiceLevelAgreementDtoEnvelope result = apiInstance.getServiceLevelAgreementByIdAsync(tenantId, serviceLevelAgreementId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceLevelAgreementsApi#getServiceLevelAgreementByIdAsync");
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
| **serviceLevelAgreementId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ServiceLevelAgreementDtoEnvelope**](ServiceLevelAgreementDtoEnvelope.md)

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

<a id="getServiceLevelAgreementsAsync"></a>
# **getServiceLevelAgreementsAsync**
> ServiceLevelAgreementDtoIReadOnlyListEnvelope getServiceLevelAgreementsAsync(tenantId, apiVersion, xApiVersion)

Get all service level agreements

Retrieves all service level agreements for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceLevelAgreementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ServiceLevelAgreementsApi apiInstance = new ServiceLevelAgreementsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ServiceLevelAgreementDtoIReadOnlyListEnvelope result = apiInstance.getServiceLevelAgreementsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceLevelAgreementsApi#getServiceLevelAgreementsAsync");
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

[**ServiceLevelAgreementDtoIReadOnlyListEnvelope**](ServiceLevelAgreementDtoIReadOnlyListEnvelope.md)

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

<a id="getServiceLevelAgreementsCountAsync"></a>
# **getServiceLevelAgreementsCountAsync**
> Int32Envelope getServiceLevelAgreementsCountAsync(tenantId, apiVersion, xApiVersion)

Get service level agreements count

Returns the count of service level agreements for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceLevelAgreementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ServiceLevelAgreementsApi apiInstance = new ServiceLevelAgreementsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getServiceLevelAgreementsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceLevelAgreementsApi#getServiceLevelAgreementsCountAsync");
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

<a id="updateServiceLevelAgreementAsync"></a>
# **updateServiceLevelAgreementAsync**
> Envelope updateServiceLevelAgreementAsync(tenantId, serviceLevelAgreementId, apiVersion, xApiVersion, serviceLevelAgreementUpdateDto)

Update a service level agreement

Updates an existing service level agreement.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceLevelAgreementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ServiceLevelAgreementsApi apiInstance = new ServiceLevelAgreementsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID serviceLevelAgreementId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ServiceLevelAgreementUpdateDto serviceLevelAgreementUpdateDto = new ServiceLevelAgreementUpdateDto(); // ServiceLevelAgreementUpdateDto | 
    try {
      Envelope result = apiInstance.updateServiceLevelAgreementAsync(tenantId, serviceLevelAgreementId, apiVersion, xApiVersion, serviceLevelAgreementUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceLevelAgreementsApi#updateServiceLevelAgreementAsync");
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
| **serviceLevelAgreementId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **serviceLevelAgreementUpdateDto** | [**ServiceLevelAgreementUpdateDto**](ServiceLevelAgreementUpdateDto.md)|  | [optional] |

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

