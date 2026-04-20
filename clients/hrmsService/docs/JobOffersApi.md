# JobOffersApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createJobOfferAsync**](JobOffersApi.md#createJobOfferAsync) | **POST** /api/v2/HrmsService/JobOffers | Create a job offer |
| [**deleteJobOfferAsync**](JobOffersApi.md#deleteJobOfferAsync) | **DELETE** /api/v2/HrmsService/JobOffers/{jobOfferId} | Delete a job offer |
| [**getJobOfferByIdAsync**](JobOffersApi.md#getJobOfferByIdAsync) | **GET** /api/v2/HrmsService/JobOffers/{jobOfferId} | Get job offer by ID |
| [**getJobOffersAsync**](JobOffersApi.md#getJobOffersAsync) | **GET** /api/v2/HrmsService/JobOffers | Get job offers |
| [**getJobOffersCountAsync**](JobOffersApi.md#getJobOffersCountAsync) | **GET** /api/v2/HrmsService/JobOffers/Count | Count job offers |
| [**updateJobOfferAsync**](JobOffersApi.md#updateJobOfferAsync) | **PUT** /api/v2/HrmsService/JobOffers/{jobOfferId} | Update a job offer |


<a id="createJobOfferAsync"></a>
# **createJobOfferAsync**
> EmptyEnvelope createJobOfferAsync(tenantId, apiVersion, xApiVersion, jobOfferCreateDto)

Create a job offer

Creates a new job offer for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobOffersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    JobOffersApi apiInstance = new JobOffersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    JobOfferCreateDto jobOfferCreateDto = new JobOfferCreateDto(); // JobOfferCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createJobOfferAsync(tenantId, apiVersion, xApiVersion, jobOfferCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobOffersApi#createJobOfferAsync");
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
| **jobOfferCreateDto** | [**JobOfferCreateDto**](JobOfferCreateDto.md)|  | [optional] |

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

<a id="deleteJobOfferAsync"></a>
# **deleteJobOfferAsync**
> EmptyEnvelope deleteJobOfferAsync(tenantId, jobOfferId, apiVersion, xApiVersion)

Delete a job offer

Deletes a job offer for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobOffersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    JobOffersApi apiInstance = new JobOffersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID jobOfferId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteJobOfferAsync(tenantId, jobOfferId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobOffersApi#deleteJobOfferAsync");
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
| **jobOfferId** | **UUID**|  | |
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

<a id="getJobOfferByIdAsync"></a>
# **getJobOfferByIdAsync**
> JobOfferDtoEnvelope getJobOfferByIdAsync(tenantId, jobOfferId, apiVersion, xApiVersion)

Get job offer by ID

Retrieves a specific job offer by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobOffersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    JobOffersApi apiInstance = new JobOffersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID jobOfferId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      JobOfferDtoEnvelope result = apiInstance.getJobOfferByIdAsync(tenantId, jobOfferId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobOffersApi#getJobOfferByIdAsync");
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
| **jobOfferId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**JobOfferDtoEnvelope**](JobOfferDtoEnvelope.md)

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

<a id="getJobOffersAsync"></a>
# **getJobOffersAsync**
> JobOfferDtoListEnvelope getJobOffersAsync(tenantId, apiVersion, xApiVersion)

Get job offers

Retrieves job offers for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobOffersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    JobOffersApi apiInstance = new JobOffersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      JobOfferDtoListEnvelope result = apiInstance.getJobOffersAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobOffersApi#getJobOffersAsync");
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

[**JobOfferDtoListEnvelope**](JobOfferDtoListEnvelope.md)

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

<a id="getJobOffersCountAsync"></a>
# **getJobOffersCountAsync**
> Int32Envelope getJobOffersCountAsync(tenantId, apiVersion, xApiVersion)

Count job offers

Counts job offers for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobOffersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    JobOffersApi apiInstance = new JobOffersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getJobOffersCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobOffersApi#getJobOffersCountAsync");
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

<a id="updateJobOfferAsync"></a>
# **updateJobOfferAsync**
> EmptyEnvelope updateJobOfferAsync(tenantId, jobOfferId, apiVersion, xApiVersion, body)

Update a job offer

Updates an existing job offer for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobOffersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    JobOffersApi apiInstance = new JobOffersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID jobOfferId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    Object body = null; // Object | 
    try {
      EmptyEnvelope result = apiInstance.updateJobOfferAsync(tenantId, jobOfferId, apiVersion, xApiVersion, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobOffersApi#updateJobOfferAsync");
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
| **jobOfferId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **body** | **Object**|  | [optional] |

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

