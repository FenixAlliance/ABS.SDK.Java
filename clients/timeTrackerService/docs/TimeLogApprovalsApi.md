# TimeLogApprovalsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdApproverPut**](TimeLogApprovalsApi.md#apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdApproverPut) | **PUT** /api/v2/TimeTrackerService/TimeLogApprovals/{approvalId}/Approver |  |
| [**apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdStatusPut**](TimeLogApprovalsApi.md#apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdStatusPut) | **PUT** /api/v2/TimeTrackerService/TimeLogApprovals/{approvalId}/Status |  |
| [**apiV2TimeTrackerServiceTimeLogApprovalsPost**](TimeLogApprovalsApi.md#apiV2TimeTrackerServiceTimeLogApprovalsPost) | **POST** /api/v2/TimeTrackerService/TimeLogApprovals |  |


<a id="apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdApproverPut"></a>
# **apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdApproverPut**
> apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdApproverPut(approvalId, tenantId, apiVersion, xApiVersion, projectHoursApprovalApproverUpdateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimeLogApprovalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    TimeLogApprovalsApi apiInstance = new TimeLogApprovalsApi(defaultClient);
    UUID approvalId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ProjectHoursApprovalApproverUpdateDto projectHoursApprovalApproverUpdateDto = new ProjectHoursApprovalApproverUpdateDto(); // ProjectHoursApprovalApproverUpdateDto | 
    try {
      apiInstance.apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdApproverPut(approvalId, tenantId, apiVersion, xApiVersion, projectHoursApprovalApproverUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeLogApprovalsApi#apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdApproverPut");
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
| **approvalId** | **UUID**|  | |
| **tenantId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **projectHoursApprovalApproverUpdateDto** | [**ProjectHoursApprovalApproverUpdateDto**](ProjectHoursApprovalApproverUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdStatusPut"></a>
# **apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdStatusPut**
> apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdStatusPut(tenantId, approvalId, apiVersion, xApiVersion, projectHoursApprovalStatusUpdateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimeLogApprovalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    TimeLogApprovalsApi apiInstance = new TimeLogApprovalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID approvalId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ProjectHoursApprovalStatusUpdateDto projectHoursApprovalStatusUpdateDto = new ProjectHoursApprovalStatusUpdateDto(); // ProjectHoursApprovalStatusUpdateDto | 
    try {
      apiInstance.apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdStatusPut(tenantId, approvalId, apiVersion, xApiVersion, projectHoursApprovalStatusUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeLogApprovalsApi#apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdStatusPut");
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
| **approvalId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **projectHoursApprovalStatusUpdateDto** | [**ProjectHoursApprovalStatusUpdateDto**](ProjectHoursApprovalStatusUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="apiV2TimeTrackerServiceTimeLogApprovalsPost"></a>
# **apiV2TimeTrackerServiceTimeLogApprovalsPost**
> apiV2TimeTrackerServiceTimeLogApprovalsPost(tenantId, apiVersion, xApiVersion, projectHoursApprovalCreateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimeLogApprovalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    TimeLogApprovalsApi apiInstance = new TimeLogApprovalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ProjectHoursApprovalCreateDto projectHoursApprovalCreateDto = new ProjectHoursApprovalCreateDto(); // ProjectHoursApprovalCreateDto | 
    try {
      apiInstance.apiV2TimeTrackerServiceTimeLogApprovalsPost(tenantId, apiVersion, xApiVersion, projectHoursApprovalCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeLogApprovalsApi#apiV2TimeTrackerServiceTimeLogApprovalsPost");
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
| **projectHoursApprovalCreateDto** | [**ProjectHoursApprovalCreateDto**](ProjectHoursApprovalCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

