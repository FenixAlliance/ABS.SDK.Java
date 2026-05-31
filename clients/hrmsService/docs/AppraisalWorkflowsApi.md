# AppraisalWorkflowsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAppraisalWorkflowAsync**](AppraisalWorkflowsApi.md#createAppraisalWorkflowAsync) | **POST** /api/v2/HrmsService/AppraisalWorkflows | Create an appraisal workflow |
| [**deleteAppraisalWorkflowAsync**](AppraisalWorkflowsApi.md#deleteAppraisalWorkflowAsync) | **DELETE** /api/v2/HrmsService/AppraisalWorkflows/{workflowId} | Delete an appraisal workflow |
| [**getAppraisalWorkflowByIdAsync**](AppraisalWorkflowsApi.md#getAppraisalWorkflowByIdAsync) | **GET** /api/v2/HrmsService/AppraisalWorkflows/{workflowId} | Get appraisal workflow by ID |
| [**getAppraisalWorkflowsAsync**](AppraisalWorkflowsApi.md#getAppraisalWorkflowsAsync) | **GET** /api/v2/HrmsService/AppraisalWorkflows | Get appraisal workflows |
| [**getAppraisalWorkflowsCountAsync**](AppraisalWorkflowsApi.md#getAppraisalWorkflowsCountAsync) | **GET** /api/v2/HrmsService/AppraisalWorkflows/Count | Count appraisal workflows |
| [**updateAppraisalWorkflowAsync**](AppraisalWorkflowsApi.md#updateAppraisalWorkflowAsync) | **PUT** /api/v2/HrmsService/AppraisalWorkflows/{workflowId} | Update an appraisal workflow |


<a id="createAppraisalWorkflowAsync"></a>
# **createAppraisalWorkflowAsync**
> EmptyEnvelope createAppraisalWorkflowAsync(tenantId, apiVersion, xApiVersion, appraisalWorkflowCreateDto)

Create an appraisal workflow

Creates a new appraisal workflow for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppraisalWorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AppraisalWorkflowsApi apiInstance = new AppraisalWorkflowsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    AppraisalWorkflowCreateDto appraisalWorkflowCreateDto = new AppraisalWorkflowCreateDto(); // AppraisalWorkflowCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createAppraisalWorkflowAsync(tenantId, apiVersion, xApiVersion, appraisalWorkflowCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppraisalWorkflowsApi#createAppraisalWorkflowAsync");
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
| **appraisalWorkflowCreateDto** | [**AppraisalWorkflowCreateDto**](AppraisalWorkflowCreateDto.md)|  | [optional] |

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

<a id="deleteAppraisalWorkflowAsync"></a>
# **deleteAppraisalWorkflowAsync**
> EmptyEnvelope deleteAppraisalWorkflowAsync(tenantId, workflowId, apiVersion, xApiVersion)

Delete an appraisal workflow

Deletes an appraisal workflow for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppraisalWorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AppraisalWorkflowsApi apiInstance = new AppraisalWorkflowsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID workflowId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteAppraisalWorkflowAsync(tenantId, workflowId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppraisalWorkflowsApi#deleteAppraisalWorkflowAsync");
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
| **workflowId** | **UUID**|  | |
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

<a id="getAppraisalWorkflowByIdAsync"></a>
# **getAppraisalWorkflowByIdAsync**
> AppraisalWorkflowDtoEnvelope getAppraisalWorkflowByIdAsync(tenantId, workflowId, apiVersion, xApiVersion)

Get appraisal workflow by ID

Retrieves a specific appraisal workflow by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppraisalWorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AppraisalWorkflowsApi apiInstance = new AppraisalWorkflowsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID workflowId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      AppraisalWorkflowDtoEnvelope result = apiInstance.getAppraisalWorkflowByIdAsync(tenantId, workflowId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppraisalWorkflowsApi#getAppraisalWorkflowByIdAsync");
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
| **workflowId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**AppraisalWorkflowDtoEnvelope**](AppraisalWorkflowDtoEnvelope.md)

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

<a id="getAppraisalWorkflowsAsync"></a>
# **getAppraisalWorkflowsAsync**
> AppraisalWorkflowDtoListEnvelope getAppraisalWorkflowsAsync(tenantId, apiVersion, xApiVersion)

Get appraisal workflows

Retrieves appraisal workflows for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppraisalWorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AppraisalWorkflowsApi apiInstance = new AppraisalWorkflowsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      AppraisalWorkflowDtoListEnvelope result = apiInstance.getAppraisalWorkflowsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppraisalWorkflowsApi#getAppraisalWorkflowsAsync");
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

[**AppraisalWorkflowDtoListEnvelope**](AppraisalWorkflowDtoListEnvelope.md)

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

<a id="getAppraisalWorkflowsCountAsync"></a>
# **getAppraisalWorkflowsCountAsync**
> Int32Envelope getAppraisalWorkflowsCountAsync(tenantId, apiVersion, xApiVersion)

Count appraisal workflows

Counts appraisal workflows for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppraisalWorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AppraisalWorkflowsApi apiInstance = new AppraisalWorkflowsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getAppraisalWorkflowsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppraisalWorkflowsApi#getAppraisalWorkflowsCountAsync");
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

<a id="updateAppraisalWorkflowAsync"></a>
# **updateAppraisalWorkflowAsync**
> EmptyEnvelope updateAppraisalWorkflowAsync(tenantId, workflowId, apiVersion, xApiVersion, appraisalWorkflowUpdateDto)

Update an appraisal workflow

Updates an existing appraisal workflow for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppraisalWorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AppraisalWorkflowsApi apiInstance = new AppraisalWorkflowsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID workflowId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    AppraisalWorkflowUpdateDto appraisalWorkflowUpdateDto = new AppraisalWorkflowUpdateDto(); // AppraisalWorkflowUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateAppraisalWorkflowAsync(tenantId, workflowId, apiVersion, xApiVersion, appraisalWorkflowUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppraisalWorkflowsApi#updateAppraisalWorkflowAsync");
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
| **workflowId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **appraisalWorkflowUpdateDto** | [**AppraisalWorkflowUpdateDto**](AppraisalWorkflowUpdateDto.md)|  | [optional] |

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

