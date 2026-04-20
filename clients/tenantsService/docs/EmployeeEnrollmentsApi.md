# EmployeeEnrollmentsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTenantEmployeeEnrollment**](EmployeeEnrollmentsApi.md#createTenantEmployeeEnrollment) | **POST** /api/v2/TenantsService/EmployeeEnrollments | Create a new tenant employee enrollment |
| [**deleteTenantEmployeeEnrollment**](EmployeeEnrollmentsApi.md#deleteTenantEmployeeEnrollment) | **DELETE** /api/v2/TenantsService/EmployeeEnrollments/{tenantEmployeeEnrollmentId} | Delete a tenant employee enrollment |
| [**getTenantEmployeeEnrollmentById**](EmployeeEnrollmentsApi.md#getTenantEmployeeEnrollmentById) | **GET** /api/v2/TenantsService/EmployeeEnrollments/{tenantEmployeeEnrollmentId} | Retrieve a single tenant employee enrollment by its ID |
| [**getTenantEmployeeEnrollments**](EmployeeEnrollmentsApi.md#getTenantEmployeeEnrollments) | **GET** /api/v2/TenantsService/EmployeeEnrollments | Retrieve a list of tenant employee enrollments |
| [**getTenantEmployeeEnrollmentsCount**](EmployeeEnrollmentsApi.md#getTenantEmployeeEnrollmentsCount) | **GET** /api/v2/TenantsService/EmployeeEnrollments/Count | Get the count of tenant employee enrollments |
| [**updateTenantEmployeeEnrollment**](EmployeeEnrollmentsApi.md#updateTenantEmployeeEnrollment) | **PUT** /api/v2/TenantsService/EmployeeEnrollments/{tenantEmployeeEnrollmentId} | Update a tenant employee enrollment |


<a id="createTenantEmployeeEnrollment"></a>
# **createTenantEmployeeEnrollment**
> EmptyEnvelope createTenantEmployeeEnrollment(tenantId, apiVersion, xApiVersion, tenantTeamEmployeeEnrollmentCreateDto)

Create a new tenant employee enrollment

Create a new tenant employee enrollment

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmployeeEnrollmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    EmployeeEnrollmentsApi apiInstance = new EmployeeEnrollmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TenantTeamEmployeeEnrollmentCreateDto tenantTeamEmployeeEnrollmentCreateDto = new TenantTeamEmployeeEnrollmentCreateDto(); // TenantTeamEmployeeEnrollmentCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createTenantEmployeeEnrollment(tenantId, apiVersion, xApiVersion, tenantTeamEmployeeEnrollmentCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeEnrollmentsApi#createTenantEmployeeEnrollment");
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
| **tenantTeamEmployeeEnrollmentCreateDto** | [**TenantTeamEmployeeEnrollmentCreateDto**](TenantTeamEmployeeEnrollmentCreateDto.md)|  | [optional] |

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
| **201** | Created |  -  |

<a id="deleteTenantEmployeeEnrollment"></a>
# **deleteTenantEmployeeEnrollment**
> EmptyEnvelope deleteTenantEmployeeEnrollment(tenantId, tenantEmployeeEnrollmentId, apiVersion, xApiVersion)

Delete a tenant employee enrollment

Delete a tenant employee enrollment

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmployeeEnrollmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    EmployeeEnrollmentsApi apiInstance = new EmployeeEnrollmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID tenantEmployeeEnrollmentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteTenantEmployeeEnrollment(tenantId, tenantEmployeeEnrollmentId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeEnrollmentsApi#deleteTenantEmployeeEnrollment");
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
| **tenantEmployeeEnrollmentId** | **UUID**|  | |
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
| **200** | OK |  -  |

<a id="getTenantEmployeeEnrollmentById"></a>
# **getTenantEmployeeEnrollmentById**
> TenantTeamEmployeeEnrollmentDtoEnvelope getTenantEmployeeEnrollmentById(tenantId, tenantEmployeeEnrollmentId, apiVersion, xApiVersion)

Retrieve a single tenant employee enrollment by its ID

Retrieve a single tenant employee enrollment by its ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmployeeEnrollmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    EmployeeEnrollmentsApi apiInstance = new EmployeeEnrollmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID tenantEmployeeEnrollmentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TenantTeamEmployeeEnrollmentDtoEnvelope result = apiInstance.getTenantEmployeeEnrollmentById(tenantId, tenantEmployeeEnrollmentId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeEnrollmentsApi#getTenantEmployeeEnrollmentById");
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
| **tenantEmployeeEnrollmentId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**TenantTeamEmployeeEnrollmentDtoEnvelope**](TenantTeamEmployeeEnrollmentDtoEnvelope.md)

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

<a id="getTenantEmployeeEnrollments"></a>
# **getTenantEmployeeEnrollments**
> TenantTeamEmployeeEnrollmentDtoListEnvelope getTenantEmployeeEnrollments(tenantId, apiVersion, xApiVersion)

Retrieve a list of tenant employee enrollments

Retrieve a list of tenant employee enrollments

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmployeeEnrollmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    EmployeeEnrollmentsApi apiInstance = new EmployeeEnrollmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TenantTeamEmployeeEnrollmentDtoListEnvelope result = apiInstance.getTenantEmployeeEnrollments(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeEnrollmentsApi#getTenantEmployeeEnrollments");
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

[**TenantTeamEmployeeEnrollmentDtoListEnvelope**](TenantTeamEmployeeEnrollmentDtoListEnvelope.md)

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

<a id="getTenantEmployeeEnrollmentsCount"></a>
# **getTenantEmployeeEnrollmentsCount**
> Int32Envelope getTenantEmployeeEnrollmentsCount(tenantId, apiVersion, xApiVersion)

Get the count of tenant employee enrollments

Get the count of tenant employee enrollments

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmployeeEnrollmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    EmployeeEnrollmentsApi apiInstance = new EmployeeEnrollmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getTenantEmployeeEnrollmentsCount(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeEnrollmentsApi#getTenantEmployeeEnrollmentsCount");
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

<a id="updateTenantEmployeeEnrollment"></a>
# **updateTenantEmployeeEnrollment**
> EmptyEnvelope updateTenantEmployeeEnrollment(tenantId, tenantEmployeeEnrollmentId, apiVersion, xApiVersion, tenantTeamEmployeeEnrollmentUpdateDto)

Update a tenant employee enrollment

Update a tenant employee enrollment

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmployeeEnrollmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    EmployeeEnrollmentsApi apiInstance = new EmployeeEnrollmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID tenantEmployeeEnrollmentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TenantTeamEmployeeEnrollmentUpdateDto tenantTeamEmployeeEnrollmentUpdateDto = new TenantTeamEmployeeEnrollmentUpdateDto(); // TenantTeamEmployeeEnrollmentUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateTenantEmployeeEnrollment(tenantId, tenantEmployeeEnrollmentId, apiVersion, xApiVersion, tenantTeamEmployeeEnrollmentUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeEnrollmentsApi#updateTenantEmployeeEnrollment");
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
| **tenantEmployeeEnrollmentId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **tenantTeamEmployeeEnrollmentUpdateDto** | [**TenantTeamEmployeeEnrollmentUpdateDto**](TenantTeamEmployeeEnrollmentUpdateDto.md)|  | [optional] |

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
| **200** | OK |  -  |

