# EmployeesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEmployeeAsync**](EmployeesApi.md#createEmployeeAsync) | **POST** /api/v2/HrmsService/Employees | Create an employee |
| [**deleteEmployeeAsync**](EmployeesApi.md#deleteEmployeeAsync) | **DELETE** /api/v2/HrmsService/Employees/{employeeId} | Delete an employee |
| [**getEmployeeByIdAsync**](EmployeesApi.md#getEmployeeByIdAsync) | **GET** /api/v2/HrmsService/Employees/{employeeId} | Get employee by ID |
| [**getEmployeesAsync**](EmployeesApi.md#getEmployeesAsync) | **GET** /api/v2/HrmsService/Employees | Get employees |
| [**getEmployeesCountAsync**](EmployeesApi.md#getEmployeesCountAsync) | **GET** /api/v2/HrmsService/Employees/Count | Count employees |
| [**updateEmployeeAsync**](EmployeesApi.md#updateEmployeeAsync) | **PUT** /api/v2/HrmsService/Employees/{employeeId} | Update an employee |


<a id="createEmployeeAsync"></a>
# **createEmployeeAsync**
> EmptyEnvelope createEmployeeAsync(tenantId, apiVersion, xApiVersion, employeeProfileCreateDto)

Create an employee

Creates a new employee for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmployeesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    EmployeesApi apiInstance = new EmployeesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    EmployeeProfileCreateDto employeeProfileCreateDto = new EmployeeProfileCreateDto(); // EmployeeProfileCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createEmployeeAsync(tenantId, apiVersion, xApiVersion, employeeProfileCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#createEmployeeAsync");
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
| **employeeProfileCreateDto** | [**EmployeeProfileCreateDto**](EmployeeProfileCreateDto.md)|  | [optional] |

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

<a id="deleteEmployeeAsync"></a>
# **deleteEmployeeAsync**
> EmptyEnvelope deleteEmployeeAsync(tenantId, employeeId, apiVersion, xApiVersion)

Delete an employee

Deletes an employee for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmployeesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    EmployeesApi apiInstance = new EmployeesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID employeeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteEmployeeAsync(tenantId, employeeId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#deleteEmployeeAsync");
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
| **employeeId** | **UUID**|  | |
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

<a id="getEmployeeByIdAsync"></a>
# **getEmployeeByIdAsync**
> EmployeeProfileDtoEnvelope getEmployeeByIdAsync(tenantId, employeeId, apiVersion, xApiVersion)

Get employee by ID

Retrieves a specific employee by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmployeesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    EmployeesApi apiInstance = new EmployeesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID employeeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmployeeProfileDtoEnvelope result = apiInstance.getEmployeeByIdAsync(tenantId, employeeId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#getEmployeeByIdAsync");
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
| **employeeId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**EmployeeProfileDtoEnvelope**](EmployeeProfileDtoEnvelope.md)

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

<a id="getEmployeesAsync"></a>
# **getEmployeesAsync**
> EmployeeProfileDtoListEnvelope getEmployeesAsync(tenantId, apiVersion, xApiVersion)

Get employees

Retrieves employees for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmployeesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    EmployeesApi apiInstance = new EmployeesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmployeeProfileDtoListEnvelope result = apiInstance.getEmployeesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#getEmployeesAsync");
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

[**EmployeeProfileDtoListEnvelope**](EmployeeProfileDtoListEnvelope.md)

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

<a id="getEmployeesCountAsync"></a>
# **getEmployeesCountAsync**
> Int32Envelope getEmployeesCountAsync(tenantId, apiVersion, xApiVersion)

Count employees

Counts employees for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmployeesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    EmployeesApi apiInstance = new EmployeesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getEmployeesCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#getEmployeesCountAsync");
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

<a id="updateEmployeeAsync"></a>
# **updateEmployeeAsync**
> EmptyEnvelope updateEmployeeAsync(tenantId, employeeId, apiVersion, xApiVersion, body)

Update an employee

Updates an existing employee for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmployeesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    EmployeesApi apiInstance = new EmployeesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID employeeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    Object body = null; // Object | 
    try {
      EmptyEnvelope result = apiInstance.updateEmployeeAsync(tenantId, employeeId, apiVersion, xApiVersion, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#updateEmployeeAsync");
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
| **employeeId** | **UUID**|  | |
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

