# TimeLogApprovalsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**requestProjectHoursApprovalAsync**](TimeLogApprovalsApi.md#requestProjectHoursApprovalAsync) | **POST** /api/v2/TimeTrackerService/TimeLogApprovals | Request project hours approval |
| [**updateProjectHoursApprovalApproverAsync**](TimeLogApprovalsApi.md#updateProjectHoursApprovalApproverAsync) | **PUT** /api/v2/TimeTrackerService/TimeLogApprovals/{approvalId}/Approver | Update approval approver |
| [**updateProjectHoursApprovalStatusAsync**](TimeLogApprovalsApi.md#updateProjectHoursApprovalStatusAsync) | **PUT** /api/v2/TimeTrackerService/TimeLogApprovals/{approvalId}/Status | Update approval status |


<a id="requestProjectHoursApprovalAsync"></a>
# **requestProjectHoursApprovalAsync**
> requestProjectHoursApprovalAsync(tenantId, apiVersion, xApiVersion, projectHoursApprovalCreateDto)

Request project hours approval

Creates a new project hours approval request.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimeLogApprovalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TimeLogApprovalsApi apiInstance = new TimeLogApprovalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ProjectHoursApprovalCreateDto projectHoursApprovalCreateDto = new ProjectHoursApprovalCreateDto(); // ProjectHoursApprovalCreateDto | 
    try {
      apiInstance.requestProjectHoursApprovalAsync(tenantId, apiVersion, xApiVersion, projectHoursApprovalCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeLogApprovalsApi#requestProjectHoursApprovalAsync");
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

<a id="updateProjectHoursApprovalApproverAsync"></a>
# **updateProjectHoursApprovalApproverAsync**
> updateProjectHoursApprovalApproverAsync(approvalId, tenantId, apiVersion, xApiVersion, projectHoursApprovalApproverUpdateDto)

Update approval approver

Updates the approver of an existing project hours approval.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimeLogApprovalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TimeLogApprovalsApi apiInstance = new TimeLogApprovalsApi(defaultClient);
    UUID approvalId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ProjectHoursApprovalApproverUpdateDto projectHoursApprovalApproverUpdateDto = new ProjectHoursApprovalApproverUpdateDto(); // ProjectHoursApprovalApproverUpdateDto | 
    try {
      apiInstance.updateProjectHoursApprovalApproverAsync(approvalId, tenantId, apiVersion, xApiVersion, projectHoursApprovalApproverUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeLogApprovalsApi#updateProjectHoursApprovalApproverAsync");
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

<a id="updateProjectHoursApprovalStatusAsync"></a>
# **updateProjectHoursApprovalStatusAsync**
> updateProjectHoursApprovalStatusAsync(tenantId, approvalId, apiVersion, xApiVersion, projectHoursApprovalStatusUpdateDto)

Update approval status

Updates the status of an existing project hours approval.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimeLogApprovalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TimeLogApprovalsApi apiInstance = new TimeLogApprovalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID approvalId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ProjectHoursApprovalStatusUpdateDto projectHoursApprovalStatusUpdateDto = new ProjectHoursApprovalStatusUpdateDto(); // ProjectHoursApprovalStatusUpdateDto | 
    try {
      apiInstance.updateProjectHoursApprovalStatusAsync(tenantId, approvalId, apiVersion, xApiVersion, projectHoursApprovalStatusUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeLogApprovalsApi#updateProjectHoursApprovalStatusAsync");
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

