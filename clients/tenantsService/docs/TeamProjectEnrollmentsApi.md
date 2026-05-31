# TeamProjectEnrollmentsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTenantTeamProjectEnrollment**](TeamProjectEnrollmentsApi.md#createTenantTeamProjectEnrollment) | **POST** /api/v2/TenantsService/TeamProjectEnrollments | Create a new tenant team project enrollment |
| [**deleteTenantTeamProjectEnrollment**](TeamProjectEnrollmentsApi.md#deleteTenantTeamProjectEnrollment) | **DELETE** /api/v2/TenantsService/TeamProjectEnrollments/{tenantTeamProjectEnrollmentId} | Delete a tenant team project enrollment |
| [**getTenantTeamProjectEnrollmentById**](TeamProjectEnrollmentsApi.md#getTenantTeamProjectEnrollmentById) | **GET** /api/v2/TenantsService/TeamProjectEnrollments/{tenantTeamProjectEnrollmentId} | Retrieve a single tenant team project enrollment by its ID |
| [**getTenantTeamProjectEnrollments**](TeamProjectEnrollmentsApi.md#getTenantTeamProjectEnrollments) | **GET** /api/v2/TenantsService/TeamProjectEnrollments | Retrieve a list of tenant team project enrollments |
| [**getTenantTeamProjectEnrollmentsCount**](TeamProjectEnrollmentsApi.md#getTenantTeamProjectEnrollmentsCount) | **GET** /api/v2/TenantsService/TeamProjectEnrollments/Count | Get the count of tenant team project enrollments |
| [**updateTenantTeamProjectEnrollment**](TeamProjectEnrollmentsApi.md#updateTenantTeamProjectEnrollment) | **PUT** /api/v2/TenantsService/TeamProjectEnrollments/{tenantTeamProjectEnrollmentId} | Update a tenant team project enrollment |


<a id="createTenantTeamProjectEnrollment"></a>
# **createTenantTeamProjectEnrollment**
> EmptyEnvelope createTenantTeamProjectEnrollment(tenantId, apiVersion, xApiVersion, tenantTeamProjectEnrollmentCreateDto)

Create a new tenant team project enrollment

Create a new tenant team project enrollment

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamProjectEnrollmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TeamProjectEnrollmentsApi apiInstance = new TeamProjectEnrollmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TenantTeamProjectEnrollmentCreateDto tenantTeamProjectEnrollmentCreateDto = new TenantTeamProjectEnrollmentCreateDto(); // TenantTeamProjectEnrollmentCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createTenantTeamProjectEnrollment(tenantId, apiVersion, xApiVersion, tenantTeamProjectEnrollmentCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamProjectEnrollmentsApi#createTenantTeamProjectEnrollment");
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
| **tenantTeamProjectEnrollmentCreateDto** | [**TenantTeamProjectEnrollmentCreateDto**](TenantTeamProjectEnrollmentCreateDto.md)|  | [optional] |

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

<a id="deleteTenantTeamProjectEnrollment"></a>
# **deleteTenantTeamProjectEnrollment**
> EmptyEnvelope deleteTenantTeamProjectEnrollment(tenantId, tenantTeamProjectEnrollmentId, apiVersion, xApiVersion)

Delete a tenant team project enrollment

Delete a tenant team project enrollment

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamProjectEnrollmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TeamProjectEnrollmentsApi apiInstance = new TeamProjectEnrollmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID tenantTeamProjectEnrollmentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteTenantTeamProjectEnrollment(tenantId, tenantTeamProjectEnrollmentId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamProjectEnrollmentsApi#deleteTenantTeamProjectEnrollment");
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
| **tenantTeamProjectEnrollmentId** | **UUID**|  | |
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

<a id="getTenantTeamProjectEnrollmentById"></a>
# **getTenantTeamProjectEnrollmentById**
> TenantTeamProjectEnrollmentDtoEnvelope getTenantTeamProjectEnrollmentById(tenantId, tenantTeamProjectEnrollmentId, apiVersion, xApiVersion)

Retrieve a single tenant team project enrollment by its ID

Retrieve a single tenant team project enrollment by its ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamProjectEnrollmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TeamProjectEnrollmentsApi apiInstance = new TeamProjectEnrollmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID tenantTeamProjectEnrollmentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TenantTeamProjectEnrollmentDtoEnvelope result = apiInstance.getTenantTeamProjectEnrollmentById(tenantId, tenantTeamProjectEnrollmentId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamProjectEnrollmentsApi#getTenantTeamProjectEnrollmentById");
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
| **tenantTeamProjectEnrollmentId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**TenantTeamProjectEnrollmentDtoEnvelope**](TenantTeamProjectEnrollmentDtoEnvelope.md)

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

<a id="getTenantTeamProjectEnrollments"></a>
# **getTenantTeamProjectEnrollments**
> TenantTeamProjectEnrollmentDtoListEnvelope getTenantTeamProjectEnrollments(tenantId, apiVersion, xApiVersion)

Retrieve a list of tenant team project enrollments

Retrieve a list of tenant team project enrollments

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamProjectEnrollmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TeamProjectEnrollmentsApi apiInstance = new TeamProjectEnrollmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TenantTeamProjectEnrollmentDtoListEnvelope result = apiInstance.getTenantTeamProjectEnrollments(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamProjectEnrollmentsApi#getTenantTeamProjectEnrollments");
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

[**TenantTeamProjectEnrollmentDtoListEnvelope**](TenantTeamProjectEnrollmentDtoListEnvelope.md)

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

<a id="getTenantTeamProjectEnrollmentsCount"></a>
# **getTenantTeamProjectEnrollmentsCount**
> Int32Envelope getTenantTeamProjectEnrollmentsCount(tenantId, apiVersion, xApiVersion)

Get the count of tenant team project enrollments

Get the count of tenant team project enrollments

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamProjectEnrollmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TeamProjectEnrollmentsApi apiInstance = new TeamProjectEnrollmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getTenantTeamProjectEnrollmentsCount(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamProjectEnrollmentsApi#getTenantTeamProjectEnrollmentsCount");
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

<a id="updateTenantTeamProjectEnrollment"></a>
# **updateTenantTeamProjectEnrollment**
> EmptyEnvelope updateTenantTeamProjectEnrollment(tenantId, tenantTeamProjectEnrollmentId, apiVersion, xApiVersion, tenantTeamProjectEnrollmentUpdateDto)

Update a tenant team project enrollment

Update a tenant team project enrollment

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamProjectEnrollmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TeamProjectEnrollmentsApi apiInstance = new TeamProjectEnrollmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID tenantTeamProjectEnrollmentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TenantTeamProjectEnrollmentUpdateDto tenantTeamProjectEnrollmentUpdateDto = new TenantTeamProjectEnrollmentUpdateDto(); // TenantTeamProjectEnrollmentUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateTenantTeamProjectEnrollment(tenantId, tenantTeamProjectEnrollmentId, apiVersion, xApiVersion, tenantTeamProjectEnrollmentUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamProjectEnrollmentsApi#updateTenantTeamProjectEnrollment");
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
| **tenantTeamProjectEnrollmentId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **tenantTeamProjectEnrollmentUpdateDto** | [**TenantTeamProjectEnrollmentUpdateDto**](TenantTeamProjectEnrollmentUpdateDto.md)|  | [optional] |

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

