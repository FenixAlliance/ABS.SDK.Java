# TrainingProgramsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTrainingProgramAsync**](TrainingProgramsApi.md#createTrainingProgramAsync) | **POST** /api/v2/HrmsService/TrainingPrograms | Create a training program |
| [**deleteTrainingProgramAsync**](TrainingProgramsApi.md#deleteTrainingProgramAsync) | **DELETE** /api/v2/HrmsService/TrainingPrograms/{programId} | Delete a training program |
| [**getTrainingProgramByIdAsync**](TrainingProgramsApi.md#getTrainingProgramByIdAsync) | **GET** /api/v2/HrmsService/TrainingPrograms/{programId} | Get training program by ID |
| [**getTrainingProgramsAsync**](TrainingProgramsApi.md#getTrainingProgramsAsync) | **GET** /api/v2/HrmsService/TrainingPrograms | Get training programs |
| [**getTrainingProgramsCountAsync**](TrainingProgramsApi.md#getTrainingProgramsCountAsync) | **GET** /api/v2/HrmsService/TrainingPrograms/Count | Count training programs |
| [**updateTrainingProgramAsync**](TrainingProgramsApi.md#updateTrainingProgramAsync) | **PUT** /api/v2/HrmsService/TrainingPrograms/{programId} | Update a training program |


<a id="createTrainingProgramAsync"></a>
# **createTrainingProgramAsync**
> EmptyEnvelope createTrainingProgramAsync(tenantId, apiVersion, xApiVersion, trainingProgramCreateDto)

Create a training program

Creates a new training program for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TrainingProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TrainingProgramsApi apiInstance = new TrainingProgramsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TrainingProgramCreateDto trainingProgramCreateDto = new TrainingProgramCreateDto(); // TrainingProgramCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createTrainingProgramAsync(tenantId, apiVersion, xApiVersion, trainingProgramCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingProgramsApi#createTrainingProgramAsync");
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
| **trainingProgramCreateDto** | [**TrainingProgramCreateDto**](TrainingProgramCreateDto.md)|  | [optional] |

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

<a id="deleteTrainingProgramAsync"></a>
# **deleteTrainingProgramAsync**
> EmptyEnvelope deleteTrainingProgramAsync(tenantId, programId, apiVersion, xApiVersion)

Delete a training program

Deletes a training program for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TrainingProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TrainingProgramsApi apiInstance = new TrainingProgramsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID programId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteTrainingProgramAsync(tenantId, programId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingProgramsApi#deleteTrainingProgramAsync");
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
| **programId** | **UUID**|  | |
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

<a id="getTrainingProgramByIdAsync"></a>
# **getTrainingProgramByIdAsync**
> TrainingProgramDtoEnvelope getTrainingProgramByIdAsync(tenantId, programId, apiVersion, xApiVersion)

Get training program by ID

Retrieves a specific training program by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TrainingProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TrainingProgramsApi apiInstance = new TrainingProgramsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID programId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TrainingProgramDtoEnvelope result = apiInstance.getTrainingProgramByIdAsync(tenantId, programId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingProgramsApi#getTrainingProgramByIdAsync");
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
| **programId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**TrainingProgramDtoEnvelope**](TrainingProgramDtoEnvelope.md)

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

<a id="getTrainingProgramsAsync"></a>
# **getTrainingProgramsAsync**
> TrainingProgramDtoListEnvelope getTrainingProgramsAsync(tenantId, apiVersion, xApiVersion)

Get training programs

Retrieves training programs for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TrainingProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TrainingProgramsApi apiInstance = new TrainingProgramsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TrainingProgramDtoListEnvelope result = apiInstance.getTrainingProgramsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingProgramsApi#getTrainingProgramsAsync");
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

[**TrainingProgramDtoListEnvelope**](TrainingProgramDtoListEnvelope.md)

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

<a id="getTrainingProgramsCountAsync"></a>
# **getTrainingProgramsCountAsync**
> Int32Envelope getTrainingProgramsCountAsync(tenantId, apiVersion, xApiVersion)

Count training programs

Counts training programs for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TrainingProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TrainingProgramsApi apiInstance = new TrainingProgramsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getTrainingProgramsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingProgramsApi#getTrainingProgramsCountAsync");
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

<a id="updateTrainingProgramAsync"></a>
# **updateTrainingProgramAsync**
> EmptyEnvelope updateTrainingProgramAsync(tenantId, programId, apiVersion, xApiVersion, trainingProgramUpdateDto)

Update a training program

Updates an existing training program for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TrainingProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TrainingProgramsApi apiInstance = new TrainingProgramsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID programId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TrainingProgramUpdateDto trainingProgramUpdateDto = new TrainingProgramUpdateDto(); // TrainingProgramUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateTrainingProgramAsync(tenantId, programId, apiVersion, xApiVersion, trainingProgramUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingProgramsApi#updateTrainingProgramAsync");
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
| **programId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **trainingProgramUpdateDto** | [**TrainingProgramUpdateDto**](TrainingProgramUpdateDto.md)|  | [optional] |

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

