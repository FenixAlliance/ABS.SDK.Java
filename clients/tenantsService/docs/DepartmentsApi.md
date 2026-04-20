# DepartmentsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTenantDepartment**](DepartmentsApi.md#createTenantDepartment) | **POST** /api/v2/TenantsService/Departments | Create a new tenant department |
| [**deleteTenantDepartment**](DepartmentsApi.md#deleteTenantDepartment) | **DELETE** /api/v2/TenantsService/Departments/{tenantDepartmentId} | Delete a tenant department |
| [**getTenantDepartmentById**](DepartmentsApi.md#getTenantDepartmentById) | **GET** /api/v2/TenantsService/Departments/{tenantDepartmentId} | Retrieve a single tenant department by its ID |
| [**getTenantDepartments**](DepartmentsApi.md#getTenantDepartments) | **GET** /api/v2/TenantsService/Departments | Retrieve a list of tenant departments |
| [**getTenantDepartmentsCount**](DepartmentsApi.md#getTenantDepartmentsCount) | **GET** /api/v2/TenantsService/Departments/Count | Get the count of tenant departments |
| [**updateTenantDepartment**](DepartmentsApi.md#updateTenantDepartment) | **PUT** /api/v2/TenantsService/Departments/{tenantDepartmentId} | Update a tenant department |


<a id="createTenantDepartment"></a>
# **createTenantDepartment**
> EmptyEnvelope createTenantDepartment(tenantId, apiVersion, xApiVersion, tenantDepartmentCreateDto)

Create a new tenant department

Create a new tenant department

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DepartmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    DepartmentsApi apiInstance = new DepartmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TenantDepartmentCreateDto tenantDepartmentCreateDto = new TenantDepartmentCreateDto(); // TenantDepartmentCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createTenantDepartment(tenantId, apiVersion, xApiVersion, tenantDepartmentCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DepartmentsApi#createTenantDepartment");
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
| **tenantDepartmentCreateDto** | [**TenantDepartmentCreateDto**](TenantDepartmentCreateDto.md)|  | [optional] |

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

<a id="deleteTenantDepartment"></a>
# **deleteTenantDepartment**
> EmptyEnvelope deleteTenantDepartment(tenantId, tenantDepartmentId, apiVersion, xApiVersion)

Delete a tenant department

Delete a tenant department

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DepartmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    DepartmentsApi apiInstance = new DepartmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID tenantDepartmentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteTenantDepartment(tenantId, tenantDepartmentId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DepartmentsApi#deleteTenantDepartment");
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
| **tenantDepartmentId** | **UUID**|  | |
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

<a id="getTenantDepartmentById"></a>
# **getTenantDepartmentById**
> TenantDepartmentDtoEnvelope getTenantDepartmentById(tenantId, tenantDepartmentId, apiVersion, xApiVersion)

Retrieve a single tenant department by its ID

Retrieve a single tenant department by its ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DepartmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    DepartmentsApi apiInstance = new DepartmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID tenantDepartmentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TenantDepartmentDtoEnvelope result = apiInstance.getTenantDepartmentById(tenantId, tenantDepartmentId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DepartmentsApi#getTenantDepartmentById");
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
| **tenantDepartmentId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**TenantDepartmentDtoEnvelope**](TenantDepartmentDtoEnvelope.md)

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

<a id="getTenantDepartments"></a>
# **getTenantDepartments**
> TenantDepartmentDtoListEnvelope getTenantDepartments(tenantId, apiVersion, xApiVersion)

Retrieve a list of tenant departments

Retrieve a list of tenant departments

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DepartmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    DepartmentsApi apiInstance = new DepartmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TenantDepartmentDtoListEnvelope result = apiInstance.getTenantDepartments(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DepartmentsApi#getTenantDepartments");
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

[**TenantDepartmentDtoListEnvelope**](TenantDepartmentDtoListEnvelope.md)

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

<a id="getTenantDepartmentsCount"></a>
# **getTenantDepartmentsCount**
> Int32Envelope getTenantDepartmentsCount(tenantId, apiVersion, xApiVersion)

Get the count of tenant departments

Get the count of tenant departments

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DepartmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    DepartmentsApi apiInstance = new DepartmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getTenantDepartmentsCount(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DepartmentsApi#getTenantDepartmentsCount");
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

<a id="updateTenantDepartment"></a>
# **updateTenantDepartment**
> EmptyEnvelope updateTenantDepartment(tenantId, tenantDepartmentId, apiVersion, xApiVersion, tenantDepartmentUpdateDto)

Update a tenant department

Update a tenant department

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DepartmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    DepartmentsApi apiInstance = new DepartmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID tenantDepartmentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TenantDepartmentUpdateDto tenantDepartmentUpdateDto = new TenantDepartmentUpdateDto(); // TenantDepartmentUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateTenantDepartment(tenantId, tenantDepartmentId, apiVersion, xApiVersion, tenantDepartmentUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DepartmentsApi#updateTenantDepartment");
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
| **tenantDepartmentId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **tenantDepartmentUpdateDto** | [**TenantDepartmentUpdateDto**](TenantDepartmentUpdateDto.md)|  | [optional] |

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

