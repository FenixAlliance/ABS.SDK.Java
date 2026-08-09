# JobApplicantsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createJobApplicantAsync**](JobApplicantsApi.md#createJobApplicantAsync) | **POST** /api/v2/HrmsService/JobApplicants | Create a job applicant |
| [**deleteJobApplicantAsync**](JobApplicantsApi.md#deleteJobApplicantAsync) | **DELETE** /api/v2/HrmsService/JobApplicants/{jobApplicantId} | Delete a job applicant |
| [**getJobApplicantByIdAsync**](JobApplicantsApi.md#getJobApplicantByIdAsync) | **GET** /api/v2/HrmsService/JobApplicants/{jobApplicantId} | Get job applicant by ID |
| [**getJobApplicantsAsync**](JobApplicantsApi.md#getJobApplicantsAsync) | **GET** /api/v2/HrmsService/JobApplicants | Get job applicants |
| [**getJobApplicantsCountAsync**](JobApplicantsApi.md#getJobApplicantsCountAsync) | **GET** /api/v2/HrmsService/JobApplicants/Count | Count job applicants |
| [**patchJobApplicantAsync**](JobApplicantsApi.md#patchJobApplicantAsync) | **PATCH** /api/v2/HrmsService/JobApplicants/{jobApplicantId} | Patch a job applicant |
| [**updateJobApplicantAsync**](JobApplicantsApi.md#updateJobApplicantAsync) | **PUT** /api/v2/HrmsService/JobApplicants/{jobApplicantId} | Update a job applicant |


<a id="createJobApplicantAsync"></a>
# **createJobApplicantAsync**
> EmptyEnvelope createJobApplicantAsync(tenantId, apiVersion, xApiVersion, jobApplicantProfileCreateDto)

Create a job applicant

Creates a new job applicant (candidate) profile for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobApplicantsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    JobApplicantsApi apiInstance = new JobApplicantsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    JobApplicantProfileCreateDto jobApplicantProfileCreateDto = new JobApplicantProfileCreateDto(); // JobApplicantProfileCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createJobApplicantAsync(tenantId, apiVersion, xApiVersion, jobApplicantProfileCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApplicantsApi#createJobApplicantAsync");
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
| **jobApplicantProfileCreateDto** | [**JobApplicantProfileCreateDto**](JobApplicantProfileCreateDto.md)|  | [optional] |

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

<a id="deleteJobApplicantAsync"></a>
# **deleteJobApplicantAsync**
> EmptyEnvelope deleteJobApplicantAsync(tenantId, jobApplicantId, apiVersion, xApiVersion)

Delete a job applicant

Deletes a job applicant (candidate) profile for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobApplicantsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    JobApplicantsApi apiInstance = new JobApplicantsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID jobApplicantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteJobApplicantAsync(tenantId, jobApplicantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApplicantsApi#deleteJobApplicantAsync");
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
| **jobApplicantId** | **UUID**|  | |
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

<a id="getJobApplicantByIdAsync"></a>
# **getJobApplicantByIdAsync**
> JobApplicantProfileDtoEnvelope getJobApplicantByIdAsync(tenantId, jobApplicantId, apiVersion, xApiVersion)

Get job applicant by ID

Retrieves a specific job applicant (candidate) profile by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobApplicantsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    JobApplicantsApi apiInstance = new JobApplicantsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID jobApplicantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      JobApplicantProfileDtoEnvelope result = apiInstance.getJobApplicantByIdAsync(tenantId, jobApplicantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApplicantsApi#getJobApplicantByIdAsync");
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
| **jobApplicantId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**JobApplicantProfileDtoEnvelope**](JobApplicantProfileDtoEnvelope.md)

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

<a id="getJobApplicantsAsync"></a>
# **getJobApplicantsAsync**
> JobApplicantProfileDtoListEnvelope getJobApplicantsAsync(tenantId, apiVersion, xApiVersion, jobApplicantProfileDtoCollectionQueryParameters)

Get job applicants

Retrieves job applicant (candidate) profiles for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobApplicantsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    JobApplicantsApi apiInstance = new JobApplicantsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    JobApplicantProfileDtoCollectionQueryParameters jobApplicantProfileDtoCollectionQueryParameters = new JobApplicantProfileDtoCollectionQueryParameters(); // JobApplicantProfileDtoCollectionQueryParameters | 
    try {
      JobApplicantProfileDtoListEnvelope result = apiInstance.getJobApplicantsAsync(tenantId, apiVersion, xApiVersion, jobApplicantProfileDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApplicantsApi#getJobApplicantsAsync");
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
| **jobApplicantProfileDtoCollectionQueryParameters** | [**JobApplicantProfileDtoCollectionQueryParameters**](JobApplicantProfileDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**JobApplicantProfileDtoListEnvelope**](JobApplicantProfileDtoListEnvelope.md)

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

<a id="getJobApplicantsCountAsync"></a>
# **getJobApplicantsCountAsync**
> Int32Envelope getJobApplicantsCountAsync(tenantId, apiVersion, xApiVersion, jobApplicantProfileDtoCollectionQueryParameters)

Count job applicants

Counts job applicant profiles for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobApplicantsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    JobApplicantsApi apiInstance = new JobApplicantsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    JobApplicantProfileDtoCollectionQueryParameters jobApplicantProfileDtoCollectionQueryParameters = new JobApplicantProfileDtoCollectionQueryParameters(); // JobApplicantProfileDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getJobApplicantsCountAsync(tenantId, apiVersion, xApiVersion, jobApplicantProfileDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApplicantsApi#getJobApplicantsCountAsync");
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
| **jobApplicantProfileDtoCollectionQueryParameters** | [**JobApplicantProfileDtoCollectionQueryParameters**](JobApplicantProfileDtoCollectionQueryParameters.md)|  | [optional] |

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

<a id="patchJobApplicantAsync"></a>
# **patchJobApplicantAsync**
> EmptyEnvelope patchJobApplicantAsync(tenantId, jobApplicantId, apiVersion, xApiVersion, patchOperation)

Patch a job applicant

Partially updates an existing job applicant (candidate) profile for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobApplicantsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    JobApplicantsApi apiInstance = new JobApplicantsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID jobApplicantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    List<PatchOperation> patchOperation = Arrays.asList(); // List<PatchOperation> | 
    try {
      EmptyEnvelope result = apiInstance.patchJobApplicantAsync(tenantId, jobApplicantId, apiVersion, xApiVersion, patchOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApplicantsApi#patchJobApplicantAsync");
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
| **jobApplicantId** | **UUID**|  | |
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

<a id="updateJobApplicantAsync"></a>
# **updateJobApplicantAsync**
> EmptyEnvelope updateJobApplicantAsync(tenantId, jobApplicantId, apiVersion, xApiVersion, jobApplicantProfileUpdateDto)

Update a job applicant

Updates an existing job applicant (candidate) profile for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobApplicantsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    JobApplicantsApi apiInstance = new JobApplicantsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID jobApplicantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    JobApplicantProfileUpdateDto jobApplicantProfileUpdateDto = new JobApplicantProfileUpdateDto(); // JobApplicantProfileUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateJobApplicantAsync(tenantId, jobApplicantId, apiVersion, xApiVersion, jobApplicantProfileUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApplicantsApi#updateJobApplicantAsync");
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
| **jobApplicantId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **jobApplicantProfileUpdateDto** | [**JobApplicantProfileUpdateDto**](JobApplicantProfileUpdateDto.md)|  | [optional] |

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

