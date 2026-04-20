# ApplicationsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBusinessApplicationAsync**](ApplicationsApi.md#createBusinessApplicationAsync) | **POST** /api/v2/SecurityService/Applications | Create a new business application |
| [**deleteBusinessApplicationAsync**](ApplicationsApi.md#deleteBusinessApplicationAsync) | **DELETE** /api/v2/SecurityService/Applications/{applicationId} | Delete a business application |
| [**getBusinessApplicationByIdAsync**](ApplicationsApi.md#getBusinessApplicationByIdAsync) | **GET** /api/v2/SecurityService/Applications/{applicationId} | Get business application by ID |
| [**getBusinessApplicationsAsync**](ApplicationsApi.md#getBusinessApplicationsAsync) | **GET** /api/v2/SecurityService/Applications | Get all business applications |
| [**getBusinessApplicationsCountAsync**](ApplicationsApi.md#getBusinessApplicationsCountAsync) | **GET** /api/v2/SecurityService/Applications/Count | Get business applications count |
| [**updateBusinessApplicationAsync**](ApplicationsApi.md#updateBusinessApplicationAsync) | **PUT** /api/v2/SecurityService/Applications/{applicationId} | Update an existing business application |


<a id="createBusinessApplicationAsync"></a>
# **createBusinessApplicationAsync**
> EmptyEnvelope createBusinessApplicationAsync(tenantId, businessApplicationCreateDto, apiVersion, xApiVersion)

Create a new business application

Creates a new business application for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ApplicationsApi apiInstance = new ApplicationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    BusinessApplicationCreateDto businessApplicationCreateDto = new BusinessApplicationCreateDto(); // BusinessApplicationCreateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.createBusinessApplicationAsync(tenantId, businessApplicationCreateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationsApi#createBusinessApplicationAsync");
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
| **businessApplicationCreateDto** | [**BusinessApplicationCreateDto**](BusinessApplicationCreateDto.md)|  | |
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

<a id="deleteBusinessApplicationAsync"></a>
# **deleteBusinessApplicationAsync**
> EmptyEnvelope deleteBusinessApplicationAsync(tenantId, applicationId, apiVersion, xApiVersion)

Delete a business application

Deletes an existing business application for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ApplicationsApi apiInstance = new ApplicationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String applicationId = "applicationId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteBusinessApplicationAsync(tenantId, applicationId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationsApi#deleteBusinessApplicationAsync");
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
| **applicationId** | **String**|  | |
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
| **204** | No Content |  -  |

<a id="getBusinessApplicationByIdAsync"></a>
# **getBusinessApplicationByIdAsync**
> BusinessApplicationDtoEnvelope getBusinessApplicationByIdAsync(tenantId, applicationId, apiVersion, xApiVersion)

Get business application by ID

Retrieves a specific business application by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ApplicationsApi apiInstance = new ApplicationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String applicationId = "applicationId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      BusinessApplicationDtoEnvelope result = apiInstance.getBusinessApplicationByIdAsync(tenantId, applicationId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationsApi#getBusinessApplicationByIdAsync");
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
| **applicationId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**BusinessApplicationDtoEnvelope**](BusinessApplicationDtoEnvelope.md)

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

<a id="getBusinessApplicationsAsync"></a>
# **getBusinessApplicationsAsync**
> BusinessApplicationDtoListEnvelope getBusinessApplicationsAsync(tenantId, apiVersion, xApiVersion)

Get all business applications

Retrieves all business applications for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ApplicationsApi apiInstance = new ApplicationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      BusinessApplicationDtoListEnvelope result = apiInstance.getBusinessApplicationsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationsApi#getBusinessApplicationsAsync");
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

[**BusinessApplicationDtoListEnvelope**](BusinessApplicationDtoListEnvelope.md)

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

<a id="getBusinessApplicationsCountAsync"></a>
# **getBusinessApplicationsCountAsync**
> Int32Envelope getBusinessApplicationsCountAsync(tenantId, apiVersion, xApiVersion)

Get business applications count

Retrieves the count of business applications for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ApplicationsApi apiInstance = new ApplicationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getBusinessApplicationsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationsApi#getBusinessApplicationsCountAsync");
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

<a id="updateBusinessApplicationAsync"></a>
# **updateBusinessApplicationAsync**
> EmptyEnvelope updateBusinessApplicationAsync(tenantId, applicationId, businessApplicationUpdateDto, apiVersion, xApiVersion)

Update an existing business application

Updates an existing business application for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ApplicationsApi apiInstance = new ApplicationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String applicationId = "applicationId_example"; // String | 
    BusinessApplicationUpdateDto businessApplicationUpdateDto = new BusinessApplicationUpdateDto(); // BusinessApplicationUpdateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.updateBusinessApplicationAsync(tenantId, applicationId, businessApplicationUpdateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationsApi#updateBusinessApplicationAsync");
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
| **applicationId** | **String**|  | |
| **businessApplicationUpdateDto** | [**BusinessApplicationUpdateDto**](BusinessApplicationUpdateDto.md)|  | |
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

