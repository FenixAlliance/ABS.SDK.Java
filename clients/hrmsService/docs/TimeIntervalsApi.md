# TimeIntervalsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTimeIntervalAsync**](TimeIntervalsApi.md#createTimeIntervalAsync) | **POST** /api/v2/HrmsService/TimeIntervals | Create a time interval |
| [**deleteTimeIntervalAsync**](TimeIntervalsApi.md#deleteTimeIntervalAsync) | **DELETE** /api/v2/HrmsService/TimeIntervals/{timeIntervalId} | Delete a time interval |
| [**getTimeIntervalByIdAsync**](TimeIntervalsApi.md#getTimeIntervalByIdAsync) | **GET** /api/v2/HrmsService/TimeIntervals/{timeIntervalId} | Get time interval by ID |
| [**getTimeIntervalsAsync**](TimeIntervalsApi.md#getTimeIntervalsAsync) | **GET** /api/v2/HrmsService/TimeIntervals | Get time intervals |
| [**getTimeIntervalsCountAsync**](TimeIntervalsApi.md#getTimeIntervalsCountAsync) | **GET** /api/v2/HrmsService/TimeIntervals/Count | Count time intervals |
| [**patchTimeIntervalAsync**](TimeIntervalsApi.md#patchTimeIntervalAsync) | **PATCH** /api/v2/HrmsService/TimeIntervals/{timeIntervalId} | Patch a time interval |
| [**updateTimeIntervalAsync**](TimeIntervalsApi.md#updateTimeIntervalAsync) | **PUT** /api/v2/HrmsService/TimeIntervals/{timeIntervalId} | Update a time interval |


<a id="createTimeIntervalAsync"></a>
# **createTimeIntervalAsync**
> EmptyEnvelope createTimeIntervalAsync(tenantId, apiVersion, xApiVersion, timeIntervalCreateDto)

Create a time interval

Creates a new time interval for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimeIntervalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TimeIntervalsApi apiInstance = new TimeIntervalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TimeIntervalCreateDto timeIntervalCreateDto = new TimeIntervalCreateDto(); // TimeIntervalCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createTimeIntervalAsync(tenantId, apiVersion, xApiVersion, timeIntervalCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeIntervalsApi#createTimeIntervalAsync");
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
| **timeIntervalCreateDto** | [**TimeIntervalCreateDto**](TimeIntervalCreateDto.md)|  | [optional] |

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

<a id="deleteTimeIntervalAsync"></a>
# **deleteTimeIntervalAsync**
> EmptyEnvelope deleteTimeIntervalAsync(tenantId, timeIntervalId, apiVersion, xApiVersion)

Delete a time interval

Deletes a time interval for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimeIntervalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TimeIntervalsApi apiInstance = new TimeIntervalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID timeIntervalId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteTimeIntervalAsync(tenantId, timeIntervalId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeIntervalsApi#deleteTimeIntervalAsync");
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
| **timeIntervalId** | **UUID**|  | |
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

<a id="getTimeIntervalByIdAsync"></a>
# **getTimeIntervalByIdAsync**
> TimeIntervalDtoEnvelope getTimeIntervalByIdAsync(tenantId, timeIntervalId, apiVersion, xApiVersion)

Get time interval by ID

Retrieves a specific time interval by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimeIntervalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TimeIntervalsApi apiInstance = new TimeIntervalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID timeIntervalId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TimeIntervalDtoEnvelope result = apiInstance.getTimeIntervalByIdAsync(tenantId, timeIntervalId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeIntervalsApi#getTimeIntervalByIdAsync");
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
| **timeIntervalId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**TimeIntervalDtoEnvelope**](TimeIntervalDtoEnvelope.md)

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

<a id="getTimeIntervalsAsync"></a>
# **getTimeIntervalsAsync**
> TimeIntervalDtoListEnvelope getTimeIntervalsAsync(tenantId, apiVersion, xApiVersion, timeIntervalDtoCollectionQueryParameters)

Get time intervals

Retrieves time intervals for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimeIntervalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TimeIntervalsApi apiInstance = new TimeIntervalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TimeIntervalDtoCollectionQueryParameters timeIntervalDtoCollectionQueryParameters = new TimeIntervalDtoCollectionQueryParameters(); // TimeIntervalDtoCollectionQueryParameters | 
    try {
      TimeIntervalDtoListEnvelope result = apiInstance.getTimeIntervalsAsync(tenantId, apiVersion, xApiVersion, timeIntervalDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeIntervalsApi#getTimeIntervalsAsync");
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
| **timeIntervalDtoCollectionQueryParameters** | [**TimeIntervalDtoCollectionQueryParameters**](TimeIntervalDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**TimeIntervalDtoListEnvelope**](TimeIntervalDtoListEnvelope.md)

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

<a id="getTimeIntervalsCountAsync"></a>
# **getTimeIntervalsCountAsync**
> Int32Envelope getTimeIntervalsCountAsync(tenantId, apiVersion, xApiVersion, timeIntervalDtoCollectionQueryParameters)

Count time intervals

Counts time intervals for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimeIntervalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TimeIntervalsApi apiInstance = new TimeIntervalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TimeIntervalDtoCollectionQueryParameters timeIntervalDtoCollectionQueryParameters = new TimeIntervalDtoCollectionQueryParameters(); // TimeIntervalDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getTimeIntervalsCountAsync(tenantId, apiVersion, xApiVersion, timeIntervalDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeIntervalsApi#getTimeIntervalsCountAsync");
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
| **timeIntervalDtoCollectionQueryParameters** | [**TimeIntervalDtoCollectionQueryParameters**](TimeIntervalDtoCollectionQueryParameters.md)|  | [optional] |

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

<a id="patchTimeIntervalAsync"></a>
# **patchTimeIntervalAsync**
> EmptyEnvelope patchTimeIntervalAsync(tenantId, timeIntervalId, apiVersion, xApiVersion, patchOperation)

Patch a time interval

Partially updates an existing time interval for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimeIntervalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TimeIntervalsApi apiInstance = new TimeIntervalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID timeIntervalId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    List<PatchOperation> patchOperation = Arrays.asList(); // List<PatchOperation> | 
    try {
      EmptyEnvelope result = apiInstance.patchTimeIntervalAsync(tenantId, timeIntervalId, apiVersion, xApiVersion, patchOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeIntervalsApi#patchTimeIntervalAsync");
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
| **timeIntervalId** | **UUID**|  | |
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

<a id="updateTimeIntervalAsync"></a>
# **updateTimeIntervalAsync**
> EmptyEnvelope updateTimeIntervalAsync(tenantId, timeIntervalId, apiVersion, xApiVersion, timeIntervalUpdateDto)

Update a time interval

Updates an existing time interval for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimeIntervalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TimeIntervalsApi apiInstance = new TimeIntervalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID timeIntervalId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TimeIntervalUpdateDto timeIntervalUpdateDto = new TimeIntervalUpdateDto(); // TimeIntervalUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateTimeIntervalAsync(tenantId, timeIntervalId, apiVersion, xApiVersion, timeIntervalUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeIntervalsApi#updateTimeIntervalAsync");
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
| **timeIntervalId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **timeIntervalUpdateDto** | [**TimeIntervalUpdateDto**](TimeIntervalUpdateDto.md)|  | [optional] |

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

