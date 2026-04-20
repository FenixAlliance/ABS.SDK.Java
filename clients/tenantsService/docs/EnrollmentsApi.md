# EnrollmentsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTenantEnrollment**](EnrollmentsApi.md#createTenantEnrollment) | **POST** /api/v2/TenantsService/Enrollments | Create a new tenant enrollment |
| [**deleteTenantEnrollment**](EnrollmentsApi.md#deleteTenantEnrollment) | **DELETE** /api/v2/TenantsService/Enrollments/{enrollmentId} | Delete a tenant enrollment |
| [**getExtendedTenantEnrollments**](EnrollmentsApi.md#getExtendedTenantEnrollments) | **GET** /api/v2/TenantsService/Enrollments/Extended | Retrieve a list of tenant enrollments |
| [**getExtendedTenantEnrollmentsCount**](EnrollmentsApi.md#getExtendedTenantEnrollmentsCount) | **GET** /api/v2/TenantsService/Enrollments/Extended/Count | Get the count of tenant enrollments |
| [**getTenantEnrollmentById**](EnrollmentsApi.md#getTenantEnrollmentById) | **GET** /api/v2/TenantsService/Enrollments/{enrollmentId} | Retrieve a single tenant enrollment by its ID |
| [**getTenantEnrollments**](EnrollmentsApi.md#getTenantEnrollments) | **GET** /api/v2/TenantsService/Enrollments | Retrieve a list of tenant enrollments |
| [**getTenantEnrollmentsCount**](EnrollmentsApi.md#getTenantEnrollmentsCount) | **GET** /api/v2/TenantsService/Enrollments/Count | Get the count of tenant enrollments |
| [**updateTenantEnrollment**](EnrollmentsApi.md#updateTenantEnrollment) | **PUT** /api/v2/TenantsService/Enrollments/{enrollmentId} | Update a tenant enrollment |


<a id="createTenantEnrollment"></a>
# **createTenantEnrollment**
> EmptyEnvelope createTenantEnrollment(tenantId, apiVersion, xApiVersion, tenantEnrollmentCreateDto)

Create a new tenant enrollment

Create a new tenant enrollment

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EnrollmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    EnrollmentsApi apiInstance = new EnrollmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TenantEnrollmentCreateDto tenantEnrollmentCreateDto = new TenantEnrollmentCreateDto(); // TenantEnrollmentCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createTenantEnrollment(tenantId, apiVersion, xApiVersion, tenantEnrollmentCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrollmentsApi#createTenantEnrollment");
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
| **tenantEnrollmentCreateDto** | [**TenantEnrollmentCreateDto**](TenantEnrollmentCreateDto.md)|  | [optional] |

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

<a id="deleteTenantEnrollment"></a>
# **deleteTenantEnrollment**
> EmptyEnvelope deleteTenantEnrollment(tenantId, enrollmentId, apiVersion, xApiVersion)

Delete a tenant enrollment

Delete a tenant enrollment

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EnrollmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    EnrollmentsApi apiInstance = new EnrollmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID enrollmentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteTenantEnrollment(tenantId, enrollmentId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrollmentsApi#deleteTenantEnrollment");
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
| **enrollmentId** | **UUID**|  | |
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

<a id="getExtendedTenantEnrollments"></a>
# **getExtendedTenantEnrollments**
> TenantEnrollmentDtoListEnvelope getExtendedTenantEnrollments(tenantId, apiVersion, xApiVersion)

Retrieve a list of tenant enrollments

Retrieve a list of tenant enrollments

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EnrollmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    EnrollmentsApi apiInstance = new EnrollmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TenantEnrollmentDtoListEnvelope result = apiInstance.getExtendedTenantEnrollments(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrollmentsApi#getExtendedTenantEnrollments");
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

[**TenantEnrollmentDtoListEnvelope**](TenantEnrollmentDtoListEnvelope.md)

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

<a id="getExtendedTenantEnrollmentsCount"></a>
# **getExtendedTenantEnrollmentsCount**
> Int32Envelope getExtendedTenantEnrollmentsCount(tenantId, apiVersion, xApiVersion)

Get the count of tenant enrollments

Get the count of tenant enrollments

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EnrollmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    EnrollmentsApi apiInstance = new EnrollmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getExtendedTenantEnrollmentsCount(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrollmentsApi#getExtendedTenantEnrollmentsCount");
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

<a id="getTenantEnrollmentById"></a>
# **getTenantEnrollmentById**
> TenantEnrollmentDtoEnvelope getTenantEnrollmentById(tenantId, enrollmentId, userId, apiVersion, xApiVersion)

Retrieve a single tenant enrollment by its ID

Retrieve a single tenant enrollment by its ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EnrollmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    EnrollmentsApi apiInstance = new EnrollmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID enrollmentId = UUID.randomUUID(); // UUID | 
    UUID userId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TenantEnrollmentDtoEnvelope result = apiInstance.getTenantEnrollmentById(tenantId, enrollmentId, userId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrollmentsApi#getTenantEnrollmentById");
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
| **enrollmentId** | **UUID**|  | |
| **userId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**TenantEnrollmentDtoEnvelope**](TenantEnrollmentDtoEnvelope.md)

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

<a id="getTenantEnrollments"></a>
# **getTenantEnrollments**
> TenantEnrollmentDtoListEnvelope getTenantEnrollments(tenantId, apiVersion, xApiVersion)

Retrieve a list of tenant enrollments

Retrieve a list of tenant enrollments

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EnrollmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    EnrollmentsApi apiInstance = new EnrollmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TenantEnrollmentDtoListEnvelope result = apiInstance.getTenantEnrollments(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrollmentsApi#getTenantEnrollments");
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

[**TenantEnrollmentDtoListEnvelope**](TenantEnrollmentDtoListEnvelope.md)

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

<a id="getTenantEnrollmentsCount"></a>
# **getTenantEnrollmentsCount**
> Int32Envelope getTenantEnrollmentsCount(tenantId, apiVersion, xApiVersion)

Get the count of tenant enrollments

Get the count of tenant enrollments

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EnrollmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    EnrollmentsApi apiInstance = new EnrollmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getTenantEnrollmentsCount(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrollmentsApi#getTenantEnrollmentsCount");
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

<a id="updateTenantEnrollment"></a>
# **updateTenantEnrollment**
> EmptyEnvelope updateTenantEnrollment(tenantId, enrollmentId, apiVersion, xApiVersion, tenantEnrollmentUpdateDto)

Update a tenant enrollment

Update a tenant enrollment

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EnrollmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    EnrollmentsApi apiInstance = new EnrollmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID enrollmentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TenantEnrollmentUpdateDto tenantEnrollmentUpdateDto = new TenantEnrollmentUpdateDto(); // TenantEnrollmentUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateTenantEnrollment(tenantId, enrollmentId, apiVersion, xApiVersion, tenantEnrollmentUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrollmentsApi#updateTenantEnrollment");
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
| **enrollmentId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **tenantEnrollmentUpdateDto** | [**TenantEnrollmentUpdateDto**](TenantEnrollmentUpdateDto.md)|  | [optional] |

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

