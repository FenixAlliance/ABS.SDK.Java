# JobTitlesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createJobTitleAsync**](JobTitlesApi.md#createJobTitleAsync) | **POST** /api/v2/HrmsService/JobTitles | Create a job title |
| [**deleteJobTitleAsync**](JobTitlesApi.md#deleteJobTitleAsync) | **DELETE** /api/v2/HrmsService/JobTitles/{jobTitleId} | Delete a job title |
| [**getJobTitleByIdAsync**](JobTitlesApi.md#getJobTitleByIdAsync) | **GET** /api/v2/HrmsService/JobTitles/{jobTitleId} | Get job title by ID |
| [**getJobTitlesAsync**](JobTitlesApi.md#getJobTitlesAsync) | **GET** /api/v2/HrmsService/JobTitles | Get job titles |
| [**getJobTitlesCountAsync**](JobTitlesApi.md#getJobTitlesCountAsync) | **GET** /api/v2/HrmsService/JobTitles/Count | Count job titles |
| [**updateJobTitleAsync**](JobTitlesApi.md#updateJobTitleAsync) | **PUT** /api/v2/HrmsService/JobTitles/{jobTitleId} | Update a job title |


<a id="createJobTitleAsync"></a>
# **createJobTitleAsync**
> EmptyEnvelope createJobTitleAsync(tenantId, apiVersion, xApiVersion, jobTitleCreateDto)

Create a job title

Creates a new job title for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobTitlesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    JobTitlesApi apiInstance = new JobTitlesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    JobTitleCreateDto jobTitleCreateDto = new JobTitleCreateDto(); // JobTitleCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createJobTitleAsync(tenantId, apiVersion, xApiVersion, jobTitleCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobTitlesApi#createJobTitleAsync");
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
| **jobTitleCreateDto** | [**JobTitleCreateDto**](JobTitleCreateDto.md)|  | [optional] |

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

<a id="deleteJobTitleAsync"></a>
# **deleteJobTitleAsync**
> EmptyEnvelope deleteJobTitleAsync(tenantId, jobTitleId, apiVersion, xApiVersion)

Delete a job title

Deletes a job title for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobTitlesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    JobTitlesApi apiInstance = new JobTitlesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID jobTitleId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteJobTitleAsync(tenantId, jobTitleId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobTitlesApi#deleteJobTitleAsync");
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
| **jobTitleId** | **UUID**|  | |
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

<a id="getJobTitleByIdAsync"></a>
# **getJobTitleByIdAsync**
> JobTitleDtoEnvelope getJobTitleByIdAsync(tenantId, jobTitleId, apiVersion, xApiVersion)

Get job title by ID

Retrieves a specific job title by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobTitlesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    JobTitlesApi apiInstance = new JobTitlesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID jobTitleId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      JobTitleDtoEnvelope result = apiInstance.getJobTitleByIdAsync(tenantId, jobTitleId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobTitlesApi#getJobTitleByIdAsync");
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
| **jobTitleId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**JobTitleDtoEnvelope**](JobTitleDtoEnvelope.md)

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

<a id="getJobTitlesAsync"></a>
# **getJobTitlesAsync**
> JobTitleDtoListEnvelope getJobTitlesAsync(tenantId, apiVersion, xApiVersion)

Get job titles

Retrieves job titles for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobTitlesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    JobTitlesApi apiInstance = new JobTitlesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      JobTitleDtoListEnvelope result = apiInstance.getJobTitlesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobTitlesApi#getJobTitlesAsync");
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

[**JobTitleDtoListEnvelope**](JobTitleDtoListEnvelope.md)

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

<a id="getJobTitlesCountAsync"></a>
# **getJobTitlesCountAsync**
> Int32Envelope getJobTitlesCountAsync(tenantId, apiVersion, xApiVersion)

Count job titles

Counts job titles for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobTitlesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    JobTitlesApi apiInstance = new JobTitlesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getJobTitlesCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobTitlesApi#getJobTitlesCountAsync");
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

<a id="updateJobTitleAsync"></a>
# **updateJobTitleAsync**
> EmptyEnvelope updateJobTitleAsync(tenantId, jobTitleId, apiVersion, xApiVersion, jobTitleUpdateDto)

Update a job title

Updates an existing job title for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobTitlesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    JobTitlesApi apiInstance = new JobTitlesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID jobTitleId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    JobTitleUpdateDto jobTitleUpdateDto = new JobTitleUpdateDto(); // JobTitleUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateJobTitleAsync(tenantId, jobTitleId, apiVersion, xApiVersion, jobTitleUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobTitlesApi#updateJobTitleAsync");
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
| **jobTitleId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **jobTitleUpdateDto** | [**JobTitleUpdateDto**](JobTitleUpdateDto.md)|  | [optional] |

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

