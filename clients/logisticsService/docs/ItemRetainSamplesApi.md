# ItemRetainSamplesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createItemRetainSampleAsync**](ItemRetainSamplesApi.md#createItemRetainSampleAsync) | **POST** /api/v2/LogisticsService/ItemRetainSamples | Create an item retain sample |
| [**deleteItemRetainSampleAsync**](ItemRetainSamplesApi.md#deleteItemRetainSampleAsync) | **DELETE** /api/v2/LogisticsService/ItemRetainSamples/{retainSampleId} | Delete an item retain sample |
| [**getItemRetainSampleByIdAsync**](ItemRetainSamplesApi.md#getItemRetainSampleByIdAsync) | **GET** /api/v2/LogisticsService/ItemRetainSamples/{retainSampleId} | Get item retain sample by ID |
| [**getItemRetainSamplesAsync**](ItemRetainSamplesApi.md#getItemRetainSamplesAsync) | **GET** /api/v2/LogisticsService/ItemRetainSamples | Get all item retain samples |
| [**getItemRetainSamplesCountAsync**](ItemRetainSamplesApi.md#getItemRetainSamplesCountAsync) | **GET** /api/v2/LogisticsService/ItemRetainSamples/Count | Get item retain samples count |
| [**updateItemRetainSampleAsync**](ItemRetainSamplesApi.md#updateItemRetainSampleAsync) | **PUT** /api/v2/LogisticsService/ItemRetainSamples/{retainSampleId} | Update an item retain sample |


<a id="createItemRetainSampleAsync"></a>
# **createItemRetainSampleAsync**
> EmptyEnvelope createItemRetainSampleAsync(tenantId, apiVersion, xApiVersion, itemRetainSampleCreateDto)

Create an item retain sample

Creates a new item retain sample.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemRetainSamplesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemRetainSamplesApi apiInstance = new ItemRetainSamplesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemRetainSampleCreateDto itemRetainSampleCreateDto = new ItemRetainSampleCreateDto(); // ItemRetainSampleCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createItemRetainSampleAsync(tenantId, apiVersion, xApiVersion, itemRetainSampleCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemRetainSamplesApi#createItemRetainSampleAsync");
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
| **itemRetainSampleCreateDto** | [**ItemRetainSampleCreateDto**](ItemRetainSampleCreateDto.md)|  | [optional] |

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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

<a id="deleteItemRetainSampleAsync"></a>
# **deleteItemRetainSampleAsync**
> EmptyEnvelope deleteItemRetainSampleAsync(tenantId, retainSampleId, apiVersion, xApiVersion)

Delete an item retain sample

Deletes an item retain sample.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemRetainSamplesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemRetainSamplesApi apiInstance = new ItemRetainSamplesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID retainSampleId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteItemRetainSampleAsync(tenantId, retainSampleId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemRetainSamplesApi#deleteItemRetainSampleAsync");
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
| **retainSampleId** | **UUID**|  | |
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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getItemRetainSampleByIdAsync"></a>
# **getItemRetainSampleByIdAsync**
> ItemRetainSampleDtoEnvelope getItemRetainSampleByIdAsync(tenantId, retainSampleId, apiVersion, xApiVersion)

Get item retain sample by ID

Retrieves a specific item retain sample.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemRetainSamplesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemRetainSamplesApi apiInstance = new ItemRetainSamplesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID retainSampleId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemRetainSampleDtoEnvelope result = apiInstance.getItemRetainSampleByIdAsync(tenantId, retainSampleId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemRetainSamplesApi#getItemRetainSampleByIdAsync");
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
| **retainSampleId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemRetainSampleDtoEnvelope**](ItemRetainSampleDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getItemRetainSamplesAsync"></a>
# **getItemRetainSamplesAsync**
> ItemRetainSampleDtoListEnvelope getItemRetainSamplesAsync(tenantId, apiVersion, xApiVersion)

Get all item retain samples

Retrieves all item retain samples for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemRetainSamplesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemRetainSamplesApi apiInstance = new ItemRetainSamplesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemRetainSampleDtoListEnvelope result = apiInstance.getItemRetainSamplesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemRetainSamplesApi#getItemRetainSamplesAsync");
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

[**ItemRetainSampleDtoListEnvelope**](ItemRetainSampleDtoListEnvelope.md)

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

<a id="getItemRetainSamplesCountAsync"></a>
# **getItemRetainSamplesCountAsync**
> Int32Envelope getItemRetainSamplesCountAsync(tenantId, apiVersion, xApiVersion)

Get item retain samples count

Returns the count of item retain samples.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemRetainSamplesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemRetainSamplesApi apiInstance = new ItemRetainSamplesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getItemRetainSamplesCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemRetainSamplesApi#getItemRetainSamplesCountAsync");
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
| **200** | OK |  -  |

<a id="updateItemRetainSampleAsync"></a>
# **updateItemRetainSampleAsync**
> EmptyEnvelope updateItemRetainSampleAsync(tenantId, retainSampleId, apiVersion, xApiVersion, itemRetainSampleUpdateDto)

Update an item retain sample

Updates an existing item retain sample.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemRetainSamplesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemRetainSamplesApi apiInstance = new ItemRetainSamplesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID retainSampleId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemRetainSampleUpdateDto itemRetainSampleUpdateDto = new ItemRetainSampleUpdateDto(); // ItemRetainSampleUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateItemRetainSampleAsync(tenantId, retainSampleId, apiVersion, xApiVersion, itemRetainSampleUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemRetainSamplesApi#updateItemRetainSampleAsync");
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
| **retainSampleId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **itemRetainSampleUpdateDto** | [**ItemRetainSampleUpdateDto**](ItemRetainSampleUpdateDto.md)|  | [optional] |

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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

