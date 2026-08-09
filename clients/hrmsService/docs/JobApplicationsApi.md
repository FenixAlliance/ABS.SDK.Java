# JobApplicationsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**changeJobApplicationStatusAsync**](JobApplicationsApi.md#changeJobApplicationStatusAsync) | **POST** /api/v2/HrmsService/JobApplications/{jobApplicationId}/Status | Change job application status |
| [**createJobApplicationAsync**](JobApplicationsApi.md#createJobApplicationAsync) | **POST** /api/v2/HrmsService/JobApplications | Create a job application |
| [**deleteJobApplicationAsync**](JobApplicationsApi.md#deleteJobApplicationAsync) | **DELETE** /api/v2/HrmsService/JobApplications/{jobApplicationId} | Delete a job application |
| [**getJobApplicationByIdAsync**](JobApplicationsApi.md#getJobApplicationByIdAsync) | **GET** /api/v2/HrmsService/JobApplications/{jobApplicationId} | Get job application by ID |
| [**getJobApplicationsAsync**](JobApplicationsApi.md#getJobApplicationsAsync) | **GET** /api/v2/HrmsService/JobApplications | Get job applications |
| [**getJobApplicationsCountAsync**](JobApplicationsApi.md#getJobApplicationsCountAsync) | **GET** /api/v2/HrmsService/JobApplications/Count | Count job applications |
| [**patchJobApplicationAsync**](JobApplicationsApi.md#patchJobApplicationAsync) | **PATCH** /api/v2/HrmsService/JobApplications/{jobApplicationId} | Patch a job application |
| [**updateJobApplicationAsync**](JobApplicationsApi.md#updateJobApplicationAsync) | **PUT** /api/v2/HrmsService/JobApplications/{jobApplicationId} | Update a job application |


<a id="changeJobApplicationStatusAsync"></a>
# **changeJobApplicationStatusAsync**
> EmptyEnvelope changeJobApplicationStatusAsync(tenantId, jobApplicationId, status, apiVersion, xApiVersion)

Change job application status

Transitions the application to a new funnel status (e.g. UnderReview, Interviewing, Offered, Hired, Rejected). Raises JobApplicationStatusChanged; terminal statuses are immutable.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    JobApplicationsApi apiInstance = new JobApplicationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID jobApplicationId = UUID.randomUUID(); // UUID | 
    String status = "Submitted"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.changeJobApplicationStatusAsync(tenantId, jobApplicationId, status, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApplicationsApi#changeJobApplicationStatusAsync");
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
| **jobApplicationId** | **UUID**|  | |
| **status** | **String**|  | [enum: Submitted, UnderReview, Interviewing, Offered, Hired, Rejected, Withdrawn] |
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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

<a id="createJobApplicationAsync"></a>
# **createJobApplicationAsync**
> EmptyEnvelope createJobApplicationAsync(tenantId, apiVersion, xApiVersion, jobOfferApplicationCreateDto)

Create a job application

Records a candidate&#39;s application against one of the tenant&#39;s job offers. The targeted job offer must belong to the tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    JobApplicationsApi apiInstance = new JobApplicationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    JobOfferApplicationCreateDto jobOfferApplicationCreateDto = new JobOfferApplicationCreateDto(); // JobOfferApplicationCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createJobApplicationAsync(tenantId, apiVersion, xApiVersion, jobOfferApplicationCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApplicationsApi#createJobApplicationAsync");
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
| **jobOfferApplicationCreateDto** | [**JobOfferApplicationCreateDto**](JobOfferApplicationCreateDto.md)|  | [optional] |

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

<a id="deleteJobApplicationAsync"></a>
# **deleteJobApplicationAsync**
> EmptyEnvelope deleteJobApplicationAsync(tenantId, jobApplicationId, apiVersion, xApiVersion)

Delete a job application

Removes an application submitted against one of the tenant&#39;s job offers.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    JobApplicationsApi apiInstance = new JobApplicationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID jobApplicationId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteJobApplicationAsync(tenantId, jobApplicationId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApplicationsApi#deleteJobApplicationAsync");
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
| **jobApplicationId** | **UUID**|  | |
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

<a id="getJobApplicationByIdAsync"></a>
# **getJobApplicationByIdAsync**
> JobOfferApplicationDtoEnvelope getJobApplicationByIdAsync(tenantId, jobApplicationId, apiVersion, xApiVersion)

Get job application by ID

Retrieves a specific application submitted against one of the tenant&#39;s job offers.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    JobApplicationsApi apiInstance = new JobApplicationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID jobApplicationId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      JobOfferApplicationDtoEnvelope result = apiInstance.getJobApplicationByIdAsync(tenantId, jobApplicationId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApplicationsApi#getJobApplicationByIdAsync");
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
| **jobApplicationId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**JobOfferApplicationDtoEnvelope**](JobOfferApplicationDtoEnvelope.md)

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

<a id="getJobApplicationsAsync"></a>
# **getJobApplicationsAsync**
> JobOfferApplicationDtoListEnvelope getJobApplicationsAsync(tenantId, apiVersion, xApiVersion, jobOfferApplicationDtoCollectionQueryParameters)

Get job applications

Retrieves applications submitted against the tenant&#39;s job offers. Filter with &#x60;$filter&#x3D;JobOfferId eq &#39;...&#39;&#x60; or &#x60;JobApplicantProfileId eq &#39;...&#39;&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    JobApplicationsApi apiInstance = new JobApplicationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    JobOfferApplicationDtoCollectionQueryParameters jobOfferApplicationDtoCollectionQueryParameters = new JobOfferApplicationDtoCollectionQueryParameters(); // JobOfferApplicationDtoCollectionQueryParameters | 
    try {
      JobOfferApplicationDtoListEnvelope result = apiInstance.getJobApplicationsAsync(tenantId, apiVersion, xApiVersion, jobOfferApplicationDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApplicationsApi#getJobApplicationsAsync");
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
| **jobOfferApplicationDtoCollectionQueryParameters** | [**JobOfferApplicationDtoCollectionQueryParameters**](JobOfferApplicationDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**JobOfferApplicationDtoListEnvelope**](JobOfferApplicationDtoListEnvelope.md)

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

<a id="getJobApplicationsCountAsync"></a>
# **getJobApplicationsCountAsync**
> Int32Envelope getJobApplicationsCountAsync(tenantId, apiVersion, xApiVersion, jobOfferApplicationDtoCollectionQueryParameters)

Count job applications

Counts applications submitted against the tenant&#39;s job offers.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    JobApplicationsApi apiInstance = new JobApplicationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    JobOfferApplicationDtoCollectionQueryParameters jobOfferApplicationDtoCollectionQueryParameters = new JobOfferApplicationDtoCollectionQueryParameters(); // JobOfferApplicationDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getJobApplicationsCountAsync(tenantId, apiVersion, xApiVersion, jobOfferApplicationDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApplicationsApi#getJobApplicationsCountAsync");
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
| **jobOfferApplicationDtoCollectionQueryParameters** | [**JobOfferApplicationDtoCollectionQueryParameters**](JobOfferApplicationDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

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

<a id="patchJobApplicationAsync"></a>
# **patchJobApplicationAsync**
> EmptyEnvelope patchJobApplicationAsync(tenantId, jobApplicationId, apiVersion, xApiVersion, patchOperation)

Patch a job application

Partially updates an existing application submitted against one of the tenant&#39;s job offers.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    JobApplicationsApi apiInstance = new JobApplicationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID jobApplicationId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    List<PatchOperation> patchOperation = Arrays.asList(); // List<PatchOperation> | 
    try {
      EmptyEnvelope result = apiInstance.patchJobApplicationAsync(tenantId, jobApplicationId, apiVersion, xApiVersion, patchOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApplicationsApi#patchJobApplicationAsync");
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
| **jobApplicationId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **patchOperation** | [**List&lt;PatchOperation&gt;**](PatchOperation.md)|  | [optional] |

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

<a id="updateJobApplicationAsync"></a>
# **updateJobApplicationAsync**
> EmptyEnvelope updateJobApplicationAsync(tenantId, jobApplicationId, apiVersion, xApiVersion, jobOfferApplicationUpdateDto)

Update a job application

Updates an existing application submitted against one of the tenant&#39;s job offers.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    JobApplicationsApi apiInstance = new JobApplicationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID jobApplicationId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    JobOfferApplicationUpdateDto jobOfferApplicationUpdateDto = new JobOfferApplicationUpdateDto(); // JobOfferApplicationUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateJobApplicationAsync(tenantId, jobApplicationId, apiVersion, xApiVersion, jobOfferApplicationUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApplicationsApi#updateJobApplicationAsync");
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
| **jobApplicationId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **jobOfferApplicationUpdateDto** | [**JobOfferApplicationUpdateDto**](JobOfferApplicationUpdateDto.md)|  | [optional] |

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

