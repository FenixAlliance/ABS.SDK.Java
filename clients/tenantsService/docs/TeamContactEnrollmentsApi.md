# TeamContactEnrollmentsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTenantTeamContactEnrollment**](TeamContactEnrollmentsApi.md#createTenantTeamContactEnrollment) | **POST** /api/v2/TenantsService/TeamContactEnrollments | Create a new tenant team contact enrollment |
| [**deleteTenantTeamContactEnrollment**](TeamContactEnrollmentsApi.md#deleteTenantTeamContactEnrollment) | **DELETE** /api/v2/TenantsService/TeamContactEnrollments/{tenantTeamContactEnrollmentId} | Delete a tenant team contact enrollment |
| [**getTenantTeamContactEnrollmentById**](TeamContactEnrollmentsApi.md#getTenantTeamContactEnrollmentById) | **GET** /api/v2/TenantsService/TeamContactEnrollments/{tenantTeamContactEnrollmentId} | Retrieve a single tenant team contact enrollment by its ID |
| [**getTenantTeamContactEnrollments**](TeamContactEnrollmentsApi.md#getTenantTeamContactEnrollments) | **GET** /api/v2/TenantsService/TeamContactEnrollments | Retrieve a list of tenant team contact enrollments |
| [**getTenantTeamContactEnrollmentsCount**](TeamContactEnrollmentsApi.md#getTenantTeamContactEnrollmentsCount) | **GET** /api/v2/TenantsService/TeamContactEnrollments/Count | Get the count of tenant team contact enrollments |
| [**updateTenantTeamContactEnrollment**](TeamContactEnrollmentsApi.md#updateTenantTeamContactEnrollment) | **PUT** /api/v2/TenantsService/TeamContactEnrollments/{tenantTeamContactEnrollmentId} | Update a tenant team contact enrollment |


<a id="createTenantTeamContactEnrollment"></a>
# **createTenantTeamContactEnrollment**
> EmptyEnvelope createTenantTeamContactEnrollment(tenantId, apiVersion, xApiVersion, tenantTeamContactEnrollmentCreateDto)

Create a new tenant team contact enrollment

Create a new tenant team contact enrollment

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamContactEnrollmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TeamContactEnrollmentsApi apiInstance = new TeamContactEnrollmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TenantTeamContactEnrollmentCreateDto tenantTeamContactEnrollmentCreateDto = new TenantTeamContactEnrollmentCreateDto(); // TenantTeamContactEnrollmentCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createTenantTeamContactEnrollment(tenantId, apiVersion, xApiVersion, tenantTeamContactEnrollmentCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamContactEnrollmentsApi#createTenantTeamContactEnrollment");
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
| **tenantTeamContactEnrollmentCreateDto** | [**TenantTeamContactEnrollmentCreateDto**](TenantTeamContactEnrollmentCreateDto.md)|  | [optional] |

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

<a id="deleteTenantTeamContactEnrollment"></a>
# **deleteTenantTeamContactEnrollment**
> EmptyEnvelope deleteTenantTeamContactEnrollment(tenantId, tenantTeamContactEnrollmentId, apiVersion, xApiVersion)

Delete a tenant team contact enrollment

Delete a tenant team contact enrollment

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamContactEnrollmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TeamContactEnrollmentsApi apiInstance = new TeamContactEnrollmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID tenantTeamContactEnrollmentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteTenantTeamContactEnrollment(tenantId, tenantTeamContactEnrollmentId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamContactEnrollmentsApi#deleteTenantTeamContactEnrollment");
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
| **tenantTeamContactEnrollmentId** | **UUID**|  | |
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

<a id="getTenantTeamContactEnrollmentById"></a>
# **getTenantTeamContactEnrollmentById**
> TenantTeamContactEnrollmentDtoEnvelope getTenantTeamContactEnrollmentById(tenantId, tenantTeamContactEnrollmentId, apiVersion, xApiVersion)

Retrieve a single tenant team contact enrollment by its ID

Retrieve a single tenant team contact enrollment by its ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamContactEnrollmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TeamContactEnrollmentsApi apiInstance = new TeamContactEnrollmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID tenantTeamContactEnrollmentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TenantTeamContactEnrollmentDtoEnvelope result = apiInstance.getTenantTeamContactEnrollmentById(tenantId, tenantTeamContactEnrollmentId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamContactEnrollmentsApi#getTenantTeamContactEnrollmentById");
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
| **tenantTeamContactEnrollmentId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**TenantTeamContactEnrollmentDtoEnvelope**](TenantTeamContactEnrollmentDtoEnvelope.md)

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

<a id="getTenantTeamContactEnrollments"></a>
# **getTenantTeamContactEnrollments**
> TenantTeamContactEnrollmentDtoListEnvelope getTenantTeamContactEnrollments(tenantId, apiVersion, xApiVersion)

Retrieve a list of tenant team contact enrollments

Retrieve a list of tenant team contact enrollments

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamContactEnrollmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TeamContactEnrollmentsApi apiInstance = new TeamContactEnrollmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TenantTeamContactEnrollmentDtoListEnvelope result = apiInstance.getTenantTeamContactEnrollments(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamContactEnrollmentsApi#getTenantTeamContactEnrollments");
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

[**TenantTeamContactEnrollmentDtoListEnvelope**](TenantTeamContactEnrollmentDtoListEnvelope.md)

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

<a id="getTenantTeamContactEnrollmentsCount"></a>
# **getTenantTeamContactEnrollmentsCount**
> Int32Envelope getTenantTeamContactEnrollmentsCount(tenantId, apiVersion, xApiVersion)

Get the count of tenant team contact enrollments

Get the count of tenant team contact enrollments

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamContactEnrollmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TeamContactEnrollmentsApi apiInstance = new TeamContactEnrollmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getTenantTeamContactEnrollmentsCount(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamContactEnrollmentsApi#getTenantTeamContactEnrollmentsCount");
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

<a id="updateTenantTeamContactEnrollment"></a>
# **updateTenantTeamContactEnrollment**
> EmptyEnvelope updateTenantTeamContactEnrollment(tenantId, tenantTeamContactEnrollmentId, apiVersion, xApiVersion, tenantTeamContactEnrollmentUpdateDto)

Update a tenant team contact enrollment

Update a tenant team contact enrollment

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamContactEnrollmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TeamContactEnrollmentsApi apiInstance = new TeamContactEnrollmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID tenantTeamContactEnrollmentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TenantTeamContactEnrollmentUpdateDto tenantTeamContactEnrollmentUpdateDto = new TenantTeamContactEnrollmentUpdateDto(); // TenantTeamContactEnrollmentUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateTenantTeamContactEnrollment(tenantId, tenantTeamContactEnrollmentId, apiVersion, xApiVersion, tenantTeamContactEnrollmentUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamContactEnrollmentsApi#updateTenantTeamContactEnrollment");
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
| **tenantTeamContactEnrollmentId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **tenantTeamContactEnrollmentUpdateDto** | [**TenantTeamContactEnrollmentUpdateDto**](TenantTeamContactEnrollmentUpdateDto.md)|  | [optional] |

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

