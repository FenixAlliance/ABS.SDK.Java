# AppraisalStagesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAppraisalStageAsync**](AppraisalStagesApi.md#createAppraisalStageAsync) | **POST** /api/v2/HrmsService/AppraisalStages | Create an appraisal stage |
| [**deleteAppraisalStageAsync**](AppraisalStagesApi.md#deleteAppraisalStageAsync) | **DELETE** /api/v2/HrmsService/AppraisalStages/{stageId} | Delete an appraisal stage |
| [**getAppraisalStageByIdAsync**](AppraisalStagesApi.md#getAppraisalStageByIdAsync) | **GET** /api/v2/HrmsService/AppraisalStages/{stageId} | Get appraisal stage by ID |
| [**getAppraisalStagesAsync**](AppraisalStagesApi.md#getAppraisalStagesAsync) | **GET** /api/v2/HrmsService/AppraisalStages | Get appraisal stages |
| [**getAppraisalStagesCountAsync**](AppraisalStagesApi.md#getAppraisalStagesCountAsync) | **GET** /api/v2/HrmsService/AppraisalStages/Count | Count appraisal stages |
| [**updateAppraisalStageAsync**](AppraisalStagesApi.md#updateAppraisalStageAsync) | **PUT** /api/v2/HrmsService/AppraisalStages/{stageId} | Update an appraisal stage |


<a id="createAppraisalStageAsync"></a>
# **createAppraisalStageAsync**
> EmptyEnvelope createAppraisalStageAsync(tenantId, apiVersion, xApiVersion, appraisalStageCreateDto)

Create an appraisal stage

Creates a new appraisal stage for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppraisalStagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AppraisalStagesApi apiInstance = new AppraisalStagesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    AppraisalStageCreateDto appraisalStageCreateDto = new AppraisalStageCreateDto(); // AppraisalStageCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createAppraisalStageAsync(tenantId, apiVersion, xApiVersion, appraisalStageCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppraisalStagesApi#createAppraisalStageAsync");
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
| **appraisalStageCreateDto** | [**AppraisalStageCreateDto**](AppraisalStageCreateDto.md)|  | [optional] |

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

<a id="deleteAppraisalStageAsync"></a>
# **deleteAppraisalStageAsync**
> EmptyEnvelope deleteAppraisalStageAsync(tenantId, stageId, apiVersion, xApiVersion)

Delete an appraisal stage

Deletes an appraisal stage for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppraisalStagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AppraisalStagesApi apiInstance = new AppraisalStagesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID stageId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteAppraisalStageAsync(tenantId, stageId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppraisalStagesApi#deleteAppraisalStageAsync");
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
| **stageId** | **UUID**|  | |
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

<a id="getAppraisalStageByIdAsync"></a>
# **getAppraisalStageByIdAsync**
> AppraisalStageDtoEnvelope getAppraisalStageByIdAsync(tenantId, stageId, apiVersion, xApiVersion)

Get appraisal stage by ID

Retrieves a specific appraisal stage by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppraisalStagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AppraisalStagesApi apiInstance = new AppraisalStagesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID stageId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      AppraisalStageDtoEnvelope result = apiInstance.getAppraisalStageByIdAsync(tenantId, stageId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppraisalStagesApi#getAppraisalStageByIdAsync");
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
| **stageId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**AppraisalStageDtoEnvelope**](AppraisalStageDtoEnvelope.md)

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

<a id="getAppraisalStagesAsync"></a>
# **getAppraisalStagesAsync**
> AppraisalStageDtoListEnvelope getAppraisalStagesAsync(tenantId, apiVersion, xApiVersion)

Get appraisal stages

Retrieves appraisal stages for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppraisalStagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AppraisalStagesApi apiInstance = new AppraisalStagesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      AppraisalStageDtoListEnvelope result = apiInstance.getAppraisalStagesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppraisalStagesApi#getAppraisalStagesAsync");
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

[**AppraisalStageDtoListEnvelope**](AppraisalStageDtoListEnvelope.md)

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

<a id="getAppraisalStagesCountAsync"></a>
# **getAppraisalStagesCountAsync**
> Int32Envelope getAppraisalStagesCountAsync(tenantId, apiVersion, xApiVersion)

Count appraisal stages

Counts appraisal stages for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppraisalStagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AppraisalStagesApi apiInstance = new AppraisalStagesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getAppraisalStagesCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppraisalStagesApi#getAppraisalStagesCountAsync");
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

<a id="updateAppraisalStageAsync"></a>
# **updateAppraisalStageAsync**
> EmptyEnvelope updateAppraisalStageAsync(tenantId, stageId, apiVersion, xApiVersion, appraisalStageUpdateDto)

Update an appraisal stage

Updates an existing appraisal stage for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppraisalStagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AppraisalStagesApi apiInstance = new AppraisalStagesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID stageId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    AppraisalStageUpdateDto appraisalStageUpdateDto = new AppraisalStageUpdateDto(); // AppraisalStageUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateAppraisalStageAsync(tenantId, stageId, apiVersion, xApiVersion, appraisalStageUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppraisalStagesApi#updateAppraisalStageAsync");
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
| **stageId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **appraisalStageUpdateDto** | [**AppraisalStageUpdateDto**](AppraisalStageUpdateDto.md)|  | [optional] |

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

