# TrainingProgramCoursesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTrainingProgramCourseAsync**](TrainingProgramCoursesApi.md#createTrainingProgramCourseAsync) | **POST** /api/v2/HrmsService/TrainingProgramCourses | Create a training program course |
| [**deleteTrainingProgramCourseAsync**](TrainingProgramCoursesApi.md#deleteTrainingProgramCourseAsync) | **DELETE** /api/v2/HrmsService/TrainingProgramCourses/{courseId} | Delete a training program course |
| [**getTrainingProgramCourseByIdAsync**](TrainingProgramCoursesApi.md#getTrainingProgramCourseByIdAsync) | **GET** /api/v2/HrmsService/TrainingProgramCourses/{courseId} | Get training program course by ID |
| [**getTrainingProgramCoursesAsync**](TrainingProgramCoursesApi.md#getTrainingProgramCoursesAsync) | **GET** /api/v2/HrmsService/TrainingProgramCourses | Get training program courses |
| [**getTrainingProgramCoursesCountAsync**](TrainingProgramCoursesApi.md#getTrainingProgramCoursesCountAsync) | **GET** /api/v2/HrmsService/TrainingProgramCourses/Count | Count training program courses |
| [**updateTrainingProgramCourseAsync**](TrainingProgramCoursesApi.md#updateTrainingProgramCourseAsync) | **PUT** /api/v2/HrmsService/TrainingProgramCourses/{courseId} | Update a training program course |


<a id="createTrainingProgramCourseAsync"></a>
# **createTrainingProgramCourseAsync**
> EmptyEnvelope createTrainingProgramCourseAsync(tenantId, apiVersion, xApiVersion, trainingProgramCourseCreateDto)

Create a training program course

Creates a new training program course for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TrainingProgramCoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TrainingProgramCoursesApi apiInstance = new TrainingProgramCoursesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TrainingProgramCourseCreateDto trainingProgramCourseCreateDto = new TrainingProgramCourseCreateDto(); // TrainingProgramCourseCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createTrainingProgramCourseAsync(tenantId, apiVersion, xApiVersion, trainingProgramCourseCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingProgramCoursesApi#createTrainingProgramCourseAsync");
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
| **trainingProgramCourseCreateDto** | [**TrainingProgramCourseCreateDto**](TrainingProgramCourseCreateDto.md)|  | [optional] |

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

<a id="deleteTrainingProgramCourseAsync"></a>
# **deleteTrainingProgramCourseAsync**
> EmptyEnvelope deleteTrainingProgramCourseAsync(tenantId, courseId, apiVersion, xApiVersion)

Delete a training program course

Deletes a training program course for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TrainingProgramCoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TrainingProgramCoursesApi apiInstance = new TrainingProgramCoursesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID courseId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteTrainingProgramCourseAsync(tenantId, courseId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingProgramCoursesApi#deleteTrainingProgramCourseAsync");
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
| **courseId** | **UUID**|  | |
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

<a id="getTrainingProgramCourseByIdAsync"></a>
# **getTrainingProgramCourseByIdAsync**
> TrainingProgramCourseDtoEnvelope getTrainingProgramCourseByIdAsync(tenantId, courseId, apiVersion, xApiVersion)

Get training program course by ID

Retrieves a specific training program course by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TrainingProgramCoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TrainingProgramCoursesApi apiInstance = new TrainingProgramCoursesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID courseId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TrainingProgramCourseDtoEnvelope result = apiInstance.getTrainingProgramCourseByIdAsync(tenantId, courseId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingProgramCoursesApi#getTrainingProgramCourseByIdAsync");
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
| **courseId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**TrainingProgramCourseDtoEnvelope**](TrainingProgramCourseDtoEnvelope.md)

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

<a id="getTrainingProgramCoursesAsync"></a>
# **getTrainingProgramCoursesAsync**
> TrainingProgramCourseDtoListEnvelope getTrainingProgramCoursesAsync(tenantId, apiVersion, xApiVersion)

Get training program courses

Retrieves training program courses for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TrainingProgramCoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TrainingProgramCoursesApi apiInstance = new TrainingProgramCoursesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TrainingProgramCourseDtoListEnvelope result = apiInstance.getTrainingProgramCoursesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingProgramCoursesApi#getTrainingProgramCoursesAsync");
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

[**TrainingProgramCourseDtoListEnvelope**](TrainingProgramCourseDtoListEnvelope.md)

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

<a id="getTrainingProgramCoursesCountAsync"></a>
# **getTrainingProgramCoursesCountAsync**
> Int32Envelope getTrainingProgramCoursesCountAsync(tenantId, apiVersion, xApiVersion)

Count training program courses

Counts training program courses for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TrainingProgramCoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TrainingProgramCoursesApi apiInstance = new TrainingProgramCoursesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getTrainingProgramCoursesCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingProgramCoursesApi#getTrainingProgramCoursesCountAsync");
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

<a id="updateTrainingProgramCourseAsync"></a>
# **updateTrainingProgramCourseAsync**
> EmptyEnvelope updateTrainingProgramCourseAsync(tenantId, courseId, apiVersion, xApiVersion, trainingProgramCourseUpdateDto)

Update a training program course

Updates an existing training program course for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TrainingProgramCoursesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TrainingProgramCoursesApi apiInstance = new TrainingProgramCoursesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID courseId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TrainingProgramCourseUpdateDto trainingProgramCourseUpdateDto = new TrainingProgramCourseUpdateDto(); // TrainingProgramCourseUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateTrainingProgramCourseAsync(tenantId, courseId, apiVersion, xApiVersion, trainingProgramCourseUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingProgramCoursesApi#updateTrainingProgramCourseAsync");
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
| **courseId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **trainingProgramCourseUpdateDto** | [**TrainingProgramCourseUpdateDto**](TrainingProgramCourseUpdateDto.md)|  | [optional] |

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

