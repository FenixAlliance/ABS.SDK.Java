# PayrollPeriodsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPayrollPeriodAsync**](PayrollPeriodsApi.md#createPayrollPeriodAsync) | **POST** /api/v2/HrmsService/PayrollPeriods | Create a payroll period |
| [**deletePayrollPeriodAsync**](PayrollPeriodsApi.md#deletePayrollPeriodAsync) | **DELETE** /api/v2/HrmsService/PayrollPeriods/{periodId} | Delete a payroll period |
| [**getPayrollPeriodByIdAsync**](PayrollPeriodsApi.md#getPayrollPeriodByIdAsync) | **GET** /api/v2/HrmsService/PayrollPeriods/{periodId} | Get payroll period by ID |
| [**getPayrollPeriodsAsync**](PayrollPeriodsApi.md#getPayrollPeriodsAsync) | **GET** /api/v2/HrmsService/PayrollPeriods | Get payroll periods |
| [**getPayrollPeriodsCountAsync**](PayrollPeriodsApi.md#getPayrollPeriodsCountAsync) | **GET** /api/v2/HrmsService/PayrollPeriods/Count | Count payroll periods |
| [**updatePayrollPeriodAsync**](PayrollPeriodsApi.md#updatePayrollPeriodAsync) | **PUT** /api/v2/HrmsService/PayrollPeriods/{periodId} | Update a payroll period |


<a id="createPayrollPeriodAsync"></a>
# **createPayrollPeriodAsync**
> EmptyEnvelope createPayrollPeriodAsync(tenantId, apiVersion, xApiVersion, payrollPeriodCreateDto)

Create a payroll period

Creates a new payroll period for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PayrollPeriodsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PayrollPeriodsApi apiInstance = new PayrollPeriodsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    PayrollPeriodCreateDto payrollPeriodCreateDto = new PayrollPeriodCreateDto(); // PayrollPeriodCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createPayrollPeriodAsync(tenantId, apiVersion, xApiVersion, payrollPeriodCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollPeriodsApi#createPayrollPeriodAsync");
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
| **payrollPeriodCreateDto** | [**PayrollPeriodCreateDto**](PayrollPeriodCreateDto.md)|  | [optional] |

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

<a id="deletePayrollPeriodAsync"></a>
# **deletePayrollPeriodAsync**
> EmptyEnvelope deletePayrollPeriodAsync(tenantId, periodId, apiVersion, xApiVersion)

Delete a payroll period

Deletes a payroll period for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PayrollPeriodsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PayrollPeriodsApi apiInstance = new PayrollPeriodsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID periodId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deletePayrollPeriodAsync(tenantId, periodId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollPeriodsApi#deletePayrollPeriodAsync");
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
| **periodId** | **UUID**|  | |
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

<a id="getPayrollPeriodByIdAsync"></a>
# **getPayrollPeriodByIdAsync**
> PayrollPeriodDtoEnvelope getPayrollPeriodByIdAsync(tenantId, periodId, apiVersion, xApiVersion)

Get payroll period by ID

Retrieves a specific payroll period by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PayrollPeriodsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PayrollPeriodsApi apiInstance = new PayrollPeriodsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID periodId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      PayrollPeriodDtoEnvelope result = apiInstance.getPayrollPeriodByIdAsync(tenantId, periodId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollPeriodsApi#getPayrollPeriodByIdAsync");
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
| **periodId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**PayrollPeriodDtoEnvelope**](PayrollPeriodDtoEnvelope.md)

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

<a id="getPayrollPeriodsAsync"></a>
# **getPayrollPeriodsAsync**
> PayrollPeriodDtoListEnvelope getPayrollPeriodsAsync(tenantId, apiVersion, xApiVersion)

Get payroll periods

Retrieves payroll periods for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PayrollPeriodsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PayrollPeriodsApi apiInstance = new PayrollPeriodsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      PayrollPeriodDtoListEnvelope result = apiInstance.getPayrollPeriodsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollPeriodsApi#getPayrollPeriodsAsync");
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

[**PayrollPeriodDtoListEnvelope**](PayrollPeriodDtoListEnvelope.md)

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

<a id="getPayrollPeriodsCountAsync"></a>
# **getPayrollPeriodsCountAsync**
> Int32Envelope getPayrollPeriodsCountAsync(tenantId, apiVersion, xApiVersion)

Count payroll periods

Counts payroll periods for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PayrollPeriodsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PayrollPeriodsApi apiInstance = new PayrollPeriodsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getPayrollPeriodsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollPeriodsApi#getPayrollPeriodsCountAsync");
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

<a id="updatePayrollPeriodAsync"></a>
# **updatePayrollPeriodAsync**
> EmptyEnvelope updatePayrollPeriodAsync(tenantId, periodId, apiVersion, xApiVersion, payrollPeriodUpdateDto)

Update a payroll period

Updates an existing payroll period for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PayrollPeriodsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PayrollPeriodsApi apiInstance = new PayrollPeriodsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID periodId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    PayrollPeriodUpdateDto payrollPeriodUpdateDto = new PayrollPeriodUpdateDto(); // PayrollPeriodUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updatePayrollPeriodAsync(tenantId, periodId, apiVersion, xApiVersion, payrollPeriodUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollPeriodsApi#updatePayrollPeriodAsync");
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
| **periodId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **payrollPeriodUpdateDto** | [**PayrollPeriodUpdateDto**](PayrollPeriodUpdateDto.md)|  | [optional] |

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

