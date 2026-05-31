# EmployeeAppraisalSessionsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEmployeeAppraisalSessionAsync**](EmployeeAppraisalSessionsApi.md#createEmployeeAppraisalSessionAsync) | **POST** /api/v2/HrmsService/EmployeeAppraisalSessions | Create an employee appraisal session |
| [**deleteEmployeeAppraisalSessionAsync**](EmployeeAppraisalSessionsApi.md#deleteEmployeeAppraisalSessionAsync) | **DELETE** /api/v2/HrmsService/EmployeeAppraisalSessions/{sessionId} | Delete an employee appraisal session |
| [**getEmployeeAppraisalSessionByIdAsync**](EmployeeAppraisalSessionsApi.md#getEmployeeAppraisalSessionByIdAsync) | **GET** /api/v2/HrmsService/EmployeeAppraisalSessions/{sessionId} | Get employee appraisal session by ID |
| [**getEmployeeAppraisalSessionsAsync**](EmployeeAppraisalSessionsApi.md#getEmployeeAppraisalSessionsAsync) | **GET** /api/v2/HrmsService/EmployeeAppraisalSessions | Get employee appraisal sessions |
| [**getEmployeeAppraisalSessionsCountAsync**](EmployeeAppraisalSessionsApi.md#getEmployeeAppraisalSessionsCountAsync) | **GET** /api/v2/HrmsService/EmployeeAppraisalSessions/Count | Count employee appraisal sessions |
| [**updateEmployeeAppraisalSessionAsync**](EmployeeAppraisalSessionsApi.md#updateEmployeeAppraisalSessionAsync) | **PUT** /api/v2/HrmsService/EmployeeAppraisalSessions/{sessionId} | Update an employee appraisal session |


<a id="createEmployeeAppraisalSessionAsync"></a>
# **createEmployeeAppraisalSessionAsync**
> EmptyEnvelope createEmployeeAppraisalSessionAsync(tenantId, apiVersion, xApiVersion, employeeAppraisalSessionCreateDto)

Create an employee appraisal session

Creates a new employee appraisal session for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmployeeAppraisalSessionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    EmployeeAppraisalSessionsApi apiInstance = new EmployeeAppraisalSessionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    EmployeeAppraisalSessionCreateDto employeeAppraisalSessionCreateDto = new EmployeeAppraisalSessionCreateDto(); // EmployeeAppraisalSessionCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createEmployeeAppraisalSessionAsync(tenantId, apiVersion, xApiVersion, employeeAppraisalSessionCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeAppraisalSessionsApi#createEmployeeAppraisalSessionAsync");
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
| **employeeAppraisalSessionCreateDto** | [**EmployeeAppraisalSessionCreateDto**](EmployeeAppraisalSessionCreateDto.md)|  | [optional] |

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

<a id="deleteEmployeeAppraisalSessionAsync"></a>
# **deleteEmployeeAppraisalSessionAsync**
> EmptyEnvelope deleteEmployeeAppraisalSessionAsync(tenantId, sessionId, apiVersion, xApiVersion)

Delete an employee appraisal session

Deletes an employee appraisal session for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmployeeAppraisalSessionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    EmployeeAppraisalSessionsApi apiInstance = new EmployeeAppraisalSessionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID sessionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteEmployeeAppraisalSessionAsync(tenantId, sessionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeAppraisalSessionsApi#deleteEmployeeAppraisalSessionAsync");
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
| **sessionId** | **UUID**|  | |
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

<a id="getEmployeeAppraisalSessionByIdAsync"></a>
# **getEmployeeAppraisalSessionByIdAsync**
> EmployeeAppraisalSessionDtoEnvelope getEmployeeAppraisalSessionByIdAsync(tenantId, sessionId, apiVersion, xApiVersion)

Get employee appraisal session by ID

Retrieves a specific employee appraisal session by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmployeeAppraisalSessionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    EmployeeAppraisalSessionsApi apiInstance = new EmployeeAppraisalSessionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID sessionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmployeeAppraisalSessionDtoEnvelope result = apiInstance.getEmployeeAppraisalSessionByIdAsync(tenantId, sessionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeAppraisalSessionsApi#getEmployeeAppraisalSessionByIdAsync");
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
| **sessionId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**EmployeeAppraisalSessionDtoEnvelope**](EmployeeAppraisalSessionDtoEnvelope.md)

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

<a id="getEmployeeAppraisalSessionsAsync"></a>
# **getEmployeeAppraisalSessionsAsync**
> EmployeeAppraisalSessionDtoListEnvelope getEmployeeAppraisalSessionsAsync(tenantId, apiVersion, xApiVersion)

Get employee appraisal sessions

Retrieves employee appraisal sessions for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmployeeAppraisalSessionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    EmployeeAppraisalSessionsApi apiInstance = new EmployeeAppraisalSessionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmployeeAppraisalSessionDtoListEnvelope result = apiInstance.getEmployeeAppraisalSessionsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeAppraisalSessionsApi#getEmployeeAppraisalSessionsAsync");
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

[**EmployeeAppraisalSessionDtoListEnvelope**](EmployeeAppraisalSessionDtoListEnvelope.md)

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

<a id="getEmployeeAppraisalSessionsCountAsync"></a>
# **getEmployeeAppraisalSessionsCountAsync**
> Int32Envelope getEmployeeAppraisalSessionsCountAsync(tenantId, apiVersion, xApiVersion)

Count employee appraisal sessions

Counts employee appraisal sessions for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmployeeAppraisalSessionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    EmployeeAppraisalSessionsApi apiInstance = new EmployeeAppraisalSessionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getEmployeeAppraisalSessionsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeAppraisalSessionsApi#getEmployeeAppraisalSessionsCountAsync");
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

<a id="updateEmployeeAppraisalSessionAsync"></a>
# **updateEmployeeAppraisalSessionAsync**
> EmptyEnvelope updateEmployeeAppraisalSessionAsync(tenantId, sessionId, apiVersion, xApiVersion, employeeAppraisalSessionUpdateDto)

Update an employee appraisal session

Updates an existing employee appraisal session for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmployeeAppraisalSessionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    EmployeeAppraisalSessionsApi apiInstance = new EmployeeAppraisalSessionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID sessionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    EmployeeAppraisalSessionUpdateDto employeeAppraisalSessionUpdateDto = new EmployeeAppraisalSessionUpdateDto(); // EmployeeAppraisalSessionUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateEmployeeAppraisalSessionAsync(tenantId, sessionId, apiVersion, xApiVersion, employeeAppraisalSessionUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeAppraisalSessionsApi#updateEmployeeAppraisalSessionAsync");
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
| **sessionId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **employeeAppraisalSessionUpdateDto** | [**EmployeeAppraisalSessionUpdateDto**](EmployeeAppraisalSessionUpdateDto.md)|  | [optional] |

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

