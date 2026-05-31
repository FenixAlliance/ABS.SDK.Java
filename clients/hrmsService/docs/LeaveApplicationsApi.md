# LeaveApplicationsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createLeaveApplicationAsync**](LeaveApplicationsApi.md#createLeaveApplicationAsync) | **POST** /api/v2/HrmsService/LeaveApplications | Create a leave application |
| [**deleteLeaveApplicationAsync**](LeaveApplicationsApi.md#deleteLeaveApplicationAsync) | **DELETE** /api/v2/HrmsService/LeaveApplications/{leaveApplicationId} | Delete a leave application |
| [**getLeaveApplicationByIdAsync**](LeaveApplicationsApi.md#getLeaveApplicationByIdAsync) | **GET** /api/v2/HrmsService/LeaveApplications/{leaveApplicationId} | Get leave application by ID |
| [**getLeaveApplicationsAsync**](LeaveApplicationsApi.md#getLeaveApplicationsAsync) | **GET** /api/v2/HrmsService/LeaveApplications | Get leave applications |
| [**getLeaveApplicationsCountAsync**](LeaveApplicationsApi.md#getLeaveApplicationsCountAsync) | **GET** /api/v2/HrmsService/LeaveApplications/Count | Count leave applications |
| [**updateLeaveApplicationAsync**](LeaveApplicationsApi.md#updateLeaveApplicationAsync) | **PUT** /api/v2/HrmsService/LeaveApplications/{leaveApplicationId} | Update a leave application |


<a id="createLeaveApplicationAsync"></a>
# **createLeaveApplicationAsync**
> EmptyEnvelope createLeaveApplicationAsync(tenantId, apiVersion, xApiVersion, leaveApplicationCreateDto)

Create a leave application

Creates a new leave application for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LeaveApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    LeaveApplicationsApi apiInstance = new LeaveApplicationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    LeaveApplicationCreateDto leaveApplicationCreateDto = new LeaveApplicationCreateDto(); // LeaveApplicationCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createLeaveApplicationAsync(tenantId, apiVersion, xApiVersion, leaveApplicationCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveApplicationsApi#createLeaveApplicationAsync");
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
| **leaveApplicationCreateDto** | [**LeaveApplicationCreateDto**](LeaveApplicationCreateDto.md)|  | [optional] |

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

<a id="deleteLeaveApplicationAsync"></a>
# **deleteLeaveApplicationAsync**
> EmptyEnvelope deleteLeaveApplicationAsync(tenantId, leaveApplicationId, apiVersion, xApiVersion)

Delete a leave application

Deletes a leave application for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LeaveApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    LeaveApplicationsApi apiInstance = new LeaveApplicationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID leaveApplicationId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteLeaveApplicationAsync(tenantId, leaveApplicationId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveApplicationsApi#deleteLeaveApplicationAsync");
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
| **leaveApplicationId** | **UUID**|  | |
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

<a id="getLeaveApplicationByIdAsync"></a>
# **getLeaveApplicationByIdAsync**
> LeaveApplicationDtoEnvelope getLeaveApplicationByIdAsync(tenantId, leaveApplicationId, apiVersion, xApiVersion)

Get leave application by ID

Retrieves a specific leave application by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LeaveApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    LeaveApplicationsApi apiInstance = new LeaveApplicationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID leaveApplicationId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      LeaveApplicationDtoEnvelope result = apiInstance.getLeaveApplicationByIdAsync(tenantId, leaveApplicationId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveApplicationsApi#getLeaveApplicationByIdAsync");
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
| **leaveApplicationId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**LeaveApplicationDtoEnvelope**](LeaveApplicationDtoEnvelope.md)

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

<a id="getLeaveApplicationsAsync"></a>
# **getLeaveApplicationsAsync**
> LeaveApplicationDtoListEnvelope getLeaveApplicationsAsync(tenantId, apiVersion, xApiVersion)

Get leave applications

Retrieves leave applications for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LeaveApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    LeaveApplicationsApi apiInstance = new LeaveApplicationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      LeaveApplicationDtoListEnvelope result = apiInstance.getLeaveApplicationsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveApplicationsApi#getLeaveApplicationsAsync");
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

[**LeaveApplicationDtoListEnvelope**](LeaveApplicationDtoListEnvelope.md)

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

<a id="getLeaveApplicationsCountAsync"></a>
# **getLeaveApplicationsCountAsync**
> Int32Envelope getLeaveApplicationsCountAsync(tenantId, apiVersion, xApiVersion)

Count leave applications

Counts leave applications for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LeaveApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    LeaveApplicationsApi apiInstance = new LeaveApplicationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getLeaveApplicationsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveApplicationsApi#getLeaveApplicationsCountAsync");
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

<a id="updateLeaveApplicationAsync"></a>
# **updateLeaveApplicationAsync**
> EmptyEnvelope updateLeaveApplicationAsync(tenantId, leaveApplicationId, apiVersion, xApiVersion, leaveApplicationUpdateDto)

Update a leave application

Updates an existing leave application for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LeaveApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    LeaveApplicationsApi apiInstance = new LeaveApplicationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID leaveApplicationId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    LeaveApplicationUpdateDto leaveApplicationUpdateDto = new LeaveApplicationUpdateDto(); // LeaveApplicationUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateLeaveApplicationAsync(tenantId, leaveApplicationId, apiVersion, xApiVersion, leaveApplicationUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveApplicationsApi#updateLeaveApplicationAsync");
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
| **leaveApplicationId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **leaveApplicationUpdateDto** | [**LeaveApplicationUpdateDto**](LeaveApplicationUpdateDto.md)|  | [optional] |

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

