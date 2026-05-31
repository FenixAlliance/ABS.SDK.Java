# LeaveTypesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createLeaveTypeAsync**](LeaveTypesApi.md#createLeaveTypeAsync) | **POST** /api/v2/HrmsService/LeaveTypes | Create a leave type |
| [**deleteLeaveTypeAsync**](LeaveTypesApi.md#deleteLeaveTypeAsync) | **DELETE** /api/v2/HrmsService/LeaveTypes/{leaveTypeId} | Delete a leave type |
| [**getLeaveTypeByIdAsync**](LeaveTypesApi.md#getLeaveTypeByIdAsync) | **GET** /api/v2/HrmsService/LeaveTypes/{leaveTypeId} | Get leave type by ID |
| [**getLeaveTypesAsync**](LeaveTypesApi.md#getLeaveTypesAsync) | **GET** /api/v2/HrmsService/LeaveTypes | Get leave types |
| [**getLeaveTypesCountAsync**](LeaveTypesApi.md#getLeaveTypesCountAsync) | **GET** /api/v2/HrmsService/LeaveTypes/Count | Count leave types |
| [**updateLeaveTypeAsync**](LeaveTypesApi.md#updateLeaveTypeAsync) | **PUT** /api/v2/HrmsService/LeaveTypes/{leaveTypeId} | Update a leave type |


<a id="createLeaveTypeAsync"></a>
# **createLeaveTypeAsync**
> EmptyEnvelope createLeaveTypeAsync(tenantId, apiVersion, xApiVersion, leaveTypeCreateDto)

Create a leave type

Creates a new leave type for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LeaveTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    LeaveTypesApi apiInstance = new LeaveTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    LeaveTypeCreateDto leaveTypeCreateDto = new LeaveTypeCreateDto(); // LeaveTypeCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createLeaveTypeAsync(tenantId, apiVersion, xApiVersion, leaveTypeCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveTypesApi#createLeaveTypeAsync");
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
| **leaveTypeCreateDto** | [**LeaveTypeCreateDto**](LeaveTypeCreateDto.md)|  | [optional] |

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

<a id="deleteLeaveTypeAsync"></a>
# **deleteLeaveTypeAsync**
> EmptyEnvelope deleteLeaveTypeAsync(tenantId, leaveTypeId, apiVersion, xApiVersion)

Delete a leave type

Deletes a leave type for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LeaveTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    LeaveTypesApi apiInstance = new LeaveTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID leaveTypeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteLeaveTypeAsync(tenantId, leaveTypeId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveTypesApi#deleteLeaveTypeAsync");
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
| **leaveTypeId** | **UUID**|  | |
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

<a id="getLeaveTypeByIdAsync"></a>
# **getLeaveTypeByIdAsync**
> LeaveTypeDtoEnvelope getLeaveTypeByIdAsync(tenantId, leaveTypeId, apiVersion, xApiVersion)

Get leave type by ID

Retrieves a specific leave type by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LeaveTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    LeaveTypesApi apiInstance = new LeaveTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID leaveTypeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      LeaveTypeDtoEnvelope result = apiInstance.getLeaveTypeByIdAsync(tenantId, leaveTypeId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveTypesApi#getLeaveTypeByIdAsync");
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
| **leaveTypeId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**LeaveTypeDtoEnvelope**](LeaveTypeDtoEnvelope.md)

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

<a id="getLeaveTypesAsync"></a>
# **getLeaveTypesAsync**
> LeaveTypeDtoListEnvelope getLeaveTypesAsync(tenantId, apiVersion, xApiVersion)

Get leave types

Retrieves leave types for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LeaveTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    LeaveTypesApi apiInstance = new LeaveTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      LeaveTypeDtoListEnvelope result = apiInstance.getLeaveTypesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveTypesApi#getLeaveTypesAsync");
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

[**LeaveTypeDtoListEnvelope**](LeaveTypeDtoListEnvelope.md)

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

<a id="getLeaveTypesCountAsync"></a>
# **getLeaveTypesCountAsync**
> Int32Envelope getLeaveTypesCountAsync(tenantId, apiVersion, xApiVersion)

Count leave types

Counts leave types for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LeaveTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    LeaveTypesApi apiInstance = new LeaveTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getLeaveTypesCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveTypesApi#getLeaveTypesCountAsync");
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

<a id="updateLeaveTypeAsync"></a>
# **updateLeaveTypeAsync**
> EmptyEnvelope updateLeaveTypeAsync(tenantId, leaveTypeId, apiVersion, xApiVersion, leaveTypeUpdateDto)

Update a leave type

Updates an existing leave type for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LeaveTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    LeaveTypesApi apiInstance = new LeaveTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID leaveTypeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    LeaveTypeUpdateDto leaveTypeUpdateDto = new LeaveTypeUpdateDto(); // LeaveTypeUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateLeaveTypeAsync(tenantId, leaveTypeId, apiVersion, xApiVersion, leaveTypeUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveTypesApi#updateLeaveTypeAsync");
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
| **leaveTypeId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **leaveTypeUpdateDto** | [**LeaveTypeUpdateDto**](LeaveTypeUpdateDto.md)|  | [optional] |

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

