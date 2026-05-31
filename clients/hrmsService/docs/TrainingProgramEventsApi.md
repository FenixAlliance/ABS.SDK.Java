# TrainingProgramEventsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTrainingProgramEventAsync**](TrainingProgramEventsApi.md#createTrainingProgramEventAsync) | **POST** /api/v2/HrmsService/TrainingProgramEvents | Create a training program event |
| [**deleteTrainingProgramEventAsync**](TrainingProgramEventsApi.md#deleteTrainingProgramEventAsync) | **DELETE** /api/v2/HrmsService/TrainingProgramEvents/{eventId} | Delete a training program event |
| [**getTrainingProgramEventByIdAsync**](TrainingProgramEventsApi.md#getTrainingProgramEventByIdAsync) | **GET** /api/v2/HrmsService/TrainingProgramEvents/{eventId} | Get training program event by ID |
| [**getTrainingProgramEventsAsync**](TrainingProgramEventsApi.md#getTrainingProgramEventsAsync) | **GET** /api/v2/HrmsService/TrainingProgramEvents | Get training program events |
| [**getTrainingProgramEventsCountAsync**](TrainingProgramEventsApi.md#getTrainingProgramEventsCountAsync) | **GET** /api/v2/HrmsService/TrainingProgramEvents/Count | Count training program events |
| [**updateTrainingProgramEventAsync**](TrainingProgramEventsApi.md#updateTrainingProgramEventAsync) | **PUT** /api/v2/HrmsService/TrainingProgramEvents/{eventId} | Update a training program event |


<a id="createTrainingProgramEventAsync"></a>
# **createTrainingProgramEventAsync**
> EmptyEnvelope createTrainingProgramEventAsync(tenantId, apiVersion, xApiVersion, trainingProgramEventCreateDto)

Create a training program event

Creates a new training program event for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TrainingProgramEventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TrainingProgramEventsApi apiInstance = new TrainingProgramEventsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TrainingProgramEventCreateDto trainingProgramEventCreateDto = new TrainingProgramEventCreateDto(); // TrainingProgramEventCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createTrainingProgramEventAsync(tenantId, apiVersion, xApiVersion, trainingProgramEventCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingProgramEventsApi#createTrainingProgramEventAsync");
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
| **trainingProgramEventCreateDto** | [**TrainingProgramEventCreateDto**](TrainingProgramEventCreateDto.md)|  | [optional] |

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

<a id="deleteTrainingProgramEventAsync"></a>
# **deleteTrainingProgramEventAsync**
> EmptyEnvelope deleteTrainingProgramEventAsync(tenantId, eventId, apiVersion, xApiVersion)

Delete a training program event

Deletes a training program event for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TrainingProgramEventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TrainingProgramEventsApi apiInstance = new TrainingProgramEventsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID eventId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteTrainingProgramEventAsync(tenantId, eventId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingProgramEventsApi#deleteTrainingProgramEventAsync");
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
| **eventId** | **UUID**|  | |
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

<a id="getTrainingProgramEventByIdAsync"></a>
# **getTrainingProgramEventByIdAsync**
> TrainingProgramEventDtoEnvelope getTrainingProgramEventByIdAsync(tenantId, eventId, apiVersion, xApiVersion)

Get training program event by ID

Retrieves a specific training program event by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TrainingProgramEventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TrainingProgramEventsApi apiInstance = new TrainingProgramEventsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID eventId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TrainingProgramEventDtoEnvelope result = apiInstance.getTrainingProgramEventByIdAsync(tenantId, eventId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingProgramEventsApi#getTrainingProgramEventByIdAsync");
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
| **eventId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**TrainingProgramEventDtoEnvelope**](TrainingProgramEventDtoEnvelope.md)

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

<a id="getTrainingProgramEventsAsync"></a>
# **getTrainingProgramEventsAsync**
> TrainingProgramEventDtoListEnvelope getTrainingProgramEventsAsync(tenantId, apiVersion, xApiVersion)

Get training program events

Retrieves training program events for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TrainingProgramEventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TrainingProgramEventsApi apiInstance = new TrainingProgramEventsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TrainingProgramEventDtoListEnvelope result = apiInstance.getTrainingProgramEventsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingProgramEventsApi#getTrainingProgramEventsAsync");
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

[**TrainingProgramEventDtoListEnvelope**](TrainingProgramEventDtoListEnvelope.md)

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

<a id="getTrainingProgramEventsCountAsync"></a>
# **getTrainingProgramEventsCountAsync**
> Int32Envelope getTrainingProgramEventsCountAsync(tenantId, apiVersion, xApiVersion)

Count training program events

Counts training program events for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TrainingProgramEventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TrainingProgramEventsApi apiInstance = new TrainingProgramEventsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getTrainingProgramEventsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingProgramEventsApi#getTrainingProgramEventsCountAsync");
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

<a id="updateTrainingProgramEventAsync"></a>
# **updateTrainingProgramEventAsync**
> EmptyEnvelope updateTrainingProgramEventAsync(tenantId, eventId, apiVersion, xApiVersion, trainingProgramEventUpdateDto)

Update a training program event

Updates an existing training program event for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TrainingProgramEventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TrainingProgramEventsApi apiInstance = new TrainingProgramEventsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID eventId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TrainingProgramEventUpdateDto trainingProgramEventUpdateDto = new TrainingProgramEventUpdateDto(); // TrainingProgramEventUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateTrainingProgramEventAsync(tenantId, eventId, apiVersion, xApiVersion, trainingProgramEventUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingProgramEventsApi#updateTrainingProgramEventAsync");
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
| **eventId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **trainingProgramEventUpdateDto** | [**TrainingProgramEventUpdateDto**](TrainingProgramEventUpdateDto.md)|  | [optional] |

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

