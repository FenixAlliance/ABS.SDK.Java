# EmployeeTypesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEmployeeTypeAsync**](EmployeeTypesApi.md#createEmployeeTypeAsync) | **POST** /api/v2/HrmsService/EmployeeTypes | Create an employee type |
| [**deleteEmployeeTypeAsync**](EmployeeTypesApi.md#deleteEmployeeTypeAsync) | **DELETE** /api/v2/HrmsService/EmployeeTypes/{employeeTypeId} | Delete an employee type |
| [**getEmployeeTypeByIdAsync**](EmployeeTypesApi.md#getEmployeeTypeByIdAsync) | **GET** /api/v2/HrmsService/EmployeeTypes/{employeeTypeId} | Get employee type by ID |
| [**getEmployeeTypesAsync**](EmployeeTypesApi.md#getEmployeeTypesAsync) | **GET** /api/v2/HrmsService/EmployeeTypes | Get employee types |
| [**getEmployeeTypesCountAsync**](EmployeeTypesApi.md#getEmployeeTypesCountAsync) | **GET** /api/v2/HrmsService/EmployeeTypes/Count | Count employee types |
| [**updateEmployeeTypeAsync**](EmployeeTypesApi.md#updateEmployeeTypeAsync) | **PUT** /api/v2/HrmsService/EmployeeTypes/{employeeTypeId} | Update an employee type |


<a id="createEmployeeTypeAsync"></a>
# **createEmployeeTypeAsync**
> EmptyEnvelope createEmployeeTypeAsync(tenantId, apiVersion, xApiVersion, employeeTypeCreateDto)

Create an employee type

Creates a new employee type for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmployeeTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    EmployeeTypesApi apiInstance = new EmployeeTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    EmployeeTypeCreateDto employeeTypeCreateDto = new EmployeeTypeCreateDto(); // EmployeeTypeCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createEmployeeTypeAsync(tenantId, apiVersion, xApiVersion, employeeTypeCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeTypesApi#createEmployeeTypeAsync");
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
| **employeeTypeCreateDto** | [**EmployeeTypeCreateDto**](EmployeeTypeCreateDto.md)|  | [optional] |

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

<a id="deleteEmployeeTypeAsync"></a>
# **deleteEmployeeTypeAsync**
> EmptyEnvelope deleteEmployeeTypeAsync(tenantId, employeeTypeId, apiVersion, xApiVersion)

Delete an employee type

Deletes an employee type for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmployeeTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    EmployeeTypesApi apiInstance = new EmployeeTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID employeeTypeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteEmployeeTypeAsync(tenantId, employeeTypeId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeTypesApi#deleteEmployeeTypeAsync");
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
| **employeeTypeId** | **UUID**|  | |
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

<a id="getEmployeeTypeByIdAsync"></a>
# **getEmployeeTypeByIdAsync**
> EmployeeTypeDtoEnvelope getEmployeeTypeByIdAsync(tenantId, employeeTypeId, apiVersion, xApiVersion)

Get employee type by ID

Retrieves a specific employee type by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmployeeTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    EmployeeTypesApi apiInstance = new EmployeeTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID employeeTypeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmployeeTypeDtoEnvelope result = apiInstance.getEmployeeTypeByIdAsync(tenantId, employeeTypeId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeTypesApi#getEmployeeTypeByIdAsync");
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
| **employeeTypeId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**EmployeeTypeDtoEnvelope**](EmployeeTypeDtoEnvelope.md)

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

<a id="getEmployeeTypesAsync"></a>
# **getEmployeeTypesAsync**
> EmployeeTypeDtoListEnvelope getEmployeeTypesAsync(tenantId, apiVersion, xApiVersion)

Get employee types

Retrieves employee types for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmployeeTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    EmployeeTypesApi apiInstance = new EmployeeTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmployeeTypeDtoListEnvelope result = apiInstance.getEmployeeTypesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeTypesApi#getEmployeeTypesAsync");
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

[**EmployeeTypeDtoListEnvelope**](EmployeeTypeDtoListEnvelope.md)

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

<a id="getEmployeeTypesCountAsync"></a>
# **getEmployeeTypesCountAsync**
> Int32Envelope getEmployeeTypesCountAsync(tenantId, apiVersion, xApiVersion)

Count employee types

Counts employee types for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmployeeTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    EmployeeTypesApi apiInstance = new EmployeeTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getEmployeeTypesCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeTypesApi#getEmployeeTypesCountAsync");
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

<a id="updateEmployeeTypeAsync"></a>
# **updateEmployeeTypeAsync**
> EmptyEnvelope updateEmployeeTypeAsync(tenantId, employeeTypeId, apiVersion, xApiVersion, employeeTypeUpdateDto)

Update an employee type

Updates an existing employee type for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmployeeTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    EmployeeTypesApi apiInstance = new EmployeeTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID employeeTypeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    EmployeeTypeUpdateDto employeeTypeUpdateDto = new EmployeeTypeUpdateDto(); // EmployeeTypeUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateEmployeeTypeAsync(tenantId, employeeTypeId, apiVersion, xApiVersion, employeeTypeUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeTypesApi#updateEmployeeTypeAsync");
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
| **employeeTypeId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **employeeTypeUpdateDto** | [**EmployeeTypeUpdateDto**](EmployeeTypeUpdateDto.md)|  | [optional] |

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

