# RoadWaybillsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addRoadWaybillLineAsync**](RoadWaybillsApi.md#addRoadWaybillLineAsync) | **POST** /api/v2/LogisticsService/RoadWaybills/{waybillId}/Lines | Add a line to road waybill |
| [**cancelRoadWaybillAsync**](RoadWaybillsApi.md#cancelRoadWaybillAsync) | **POST** /api/v2/LogisticsService/RoadWaybills/{waybillId}/Cancel | Cancel a road waybill |
| [**createRoadWaybillAsync**](RoadWaybillsApi.md#createRoadWaybillAsync) | **POST** /api/v2/LogisticsService/RoadWaybills | Create a road waybill |
| [**deleteRoadWaybillAsync**](RoadWaybillsApi.md#deleteRoadWaybillAsync) | **DELETE** /api/v2/LogisticsService/RoadWaybills/{waybillId} | Delete a road waybill |
| [**disputeRoadWaybillAsync**](RoadWaybillsApi.md#disputeRoadWaybillAsync) | **POST** /api/v2/LogisticsService/RoadWaybills/{waybillId}/Dispute | Dispute a road waybill |
| [**getRoadWaybillByIdAsync**](RoadWaybillsApi.md#getRoadWaybillByIdAsync) | **GET** /api/v2/LogisticsService/RoadWaybills/{waybillId} | Get road waybill by ID |
| [**getRoadWaybillLinesAsync**](RoadWaybillsApi.md#getRoadWaybillLinesAsync) | **GET** /api/v2/LogisticsService/RoadWaybills/{waybillId}/Lines | Get road waybill lines |
| [**getRoadWaybillLinesCountAsync**](RoadWaybillsApi.md#getRoadWaybillLinesCountAsync) | **GET** /api/v2/LogisticsService/RoadWaybills/{waybillId}/Lines/Count | Get road waybill lines count |
| [**getRoadWaybillsAsync**](RoadWaybillsApi.md#getRoadWaybillsAsync) | **GET** /api/v2/LogisticsService/RoadWaybills | Get all road waybills |
| [**getRoadWaybillsCountAsync**](RoadWaybillsApi.md#getRoadWaybillsCountAsync) | **GET** /api/v2/LogisticsService/RoadWaybills/Count | Get road waybills count |
| [**issueRoadWaybillAsync**](RoadWaybillsApi.md#issueRoadWaybillAsync) | **POST** /api/v2/LogisticsService/RoadWaybills/{waybillId}/Issue | Issue a road waybill |
| [**markRoadWaybillDeliveredAsync**](RoadWaybillsApi.md#markRoadWaybillDeliveredAsync) | **POST** /api/v2/LogisticsService/RoadWaybills/{waybillId}/MarkDelivered | Mark road waybill delivered |
| [**markRoadWaybillInTransitAsync**](RoadWaybillsApi.md#markRoadWaybillInTransitAsync) | **POST** /api/v2/LogisticsService/RoadWaybills/{waybillId}/MarkInTransit | Mark road waybill in transit |
| [**removeRoadWaybillLineAsync**](RoadWaybillsApi.md#removeRoadWaybillLineAsync) | **DELETE** /api/v2/LogisticsService/RoadWaybills/{waybillId}/Lines/{lineId} | Remove a road waybill line |
| [**updateRoadWaybillAsync**](RoadWaybillsApi.md#updateRoadWaybillAsync) | **PUT** /api/v2/LogisticsService/RoadWaybills/{waybillId} | Update a road waybill |
| [**updateRoadWaybillLineAsync**](RoadWaybillsApi.md#updateRoadWaybillLineAsync) | **PUT** /api/v2/LogisticsService/RoadWaybills/{waybillId}/Lines/{lineId} | Update a road waybill line |


<a id="addRoadWaybillLineAsync"></a>
# **addRoadWaybillLineAsync**
> EmptyEnvelope addRoadWaybillLineAsync(tenantId, waybillId, apiVersion, xApiVersion, waybillLineCreateDto)

Add a line to road waybill

Adds a new line to a road waybill.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoadWaybillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RoadWaybillsApi apiInstance = new RoadWaybillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID waybillId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    WaybillLineCreateDto waybillLineCreateDto = new WaybillLineCreateDto(); // WaybillLineCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.addRoadWaybillLineAsync(tenantId, waybillId, apiVersion, xApiVersion, waybillLineCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoadWaybillsApi#addRoadWaybillLineAsync");
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
| **waybillId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **waybillLineCreateDto** | [**WaybillLineCreateDto**](WaybillLineCreateDto.md)|  | [optional] |

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

<a id="cancelRoadWaybillAsync"></a>
# **cancelRoadWaybillAsync**
> EmptyEnvelope cancelRoadWaybillAsync(tenantId, waybillId, apiVersion, xApiVersion)

Cancel a road waybill

Cancels a road waybill.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoadWaybillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RoadWaybillsApi apiInstance = new RoadWaybillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID waybillId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.cancelRoadWaybillAsync(tenantId, waybillId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoadWaybillsApi#cancelRoadWaybillAsync");
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
| **waybillId** | **UUID**|  | |
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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

<a id="createRoadWaybillAsync"></a>
# **createRoadWaybillAsync**
> EmptyEnvelope createRoadWaybillAsync(tenantId, apiVersion, xApiVersion, roadWaybillCreateDto)

Create a road waybill

Creates a new road waybill for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoadWaybillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RoadWaybillsApi apiInstance = new RoadWaybillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    RoadWaybillCreateDto roadWaybillCreateDto = new RoadWaybillCreateDto(); // RoadWaybillCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createRoadWaybillAsync(tenantId, apiVersion, xApiVersion, roadWaybillCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoadWaybillsApi#createRoadWaybillAsync");
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
| **roadWaybillCreateDto** | [**RoadWaybillCreateDto**](RoadWaybillCreateDto.md)|  | [optional] |

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

<a id="deleteRoadWaybillAsync"></a>
# **deleteRoadWaybillAsync**
> EmptyEnvelope deleteRoadWaybillAsync(tenantId, waybillId, apiVersion, xApiVersion)

Delete a road waybill

Deletes a road waybill.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoadWaybillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RoadWaybillsApi apiInstance = new RoadWaybillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID waybillId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteRoadWaybillAsync(tenantId, waybillId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoadWaybillsApi#deleteRoadWaybillAsync");
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
| **waybillId** | **UUID**|  | |
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

<a id="disputeRoadWaybillAsync"></a>
# **disputeRoadWaybillAsync**
> EmptyEnvelope disputeRoadWaybillAsync(tenantId, waybillId, apiVersion, xApiVersion)

Dispute a road waybill

Disputes a road waybill.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoadWaybillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RoadWaybillsApi apiInstance = new RoadWaybillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID waybillId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.disputeRoadWaybillAsync(tenantId, waybillId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoadWaybillsApi#disputeRoadWaybillAsync");
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
| **waybillId** | **UUID**|  | |
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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

<a id="getRoadWaybillByIdAsync"></a>
# **getRoadWaybillByIdAsync**
> RoadWaybillDtoEnvelope getRoadWaybillByIdAsync(tenantId, waybillId, apiVersion, xApiVersion)

Get road waybill by ID

Retrieves a specific road waybill by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoadWaybillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RoadWaybillsApi apiInstance = new RoadWaybillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID waybillId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      RoadWaybillDtoEnvelope result = apiInstance.getRoadWaybillByIdAsync(tenantId, waybillId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoadWaybillsApi#getRoadWaybillByIdAsync");
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
| **waybillId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**RoadWaybillDtoEnvelope**](RoadWaybillDtoEnvelope.md)

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

<a id="getRoadWaybillLinesAsync"></a>
# **getRoadWaybillLinesAsync**
> WaybillLineDtoListEnvelope getRoadWaybillLinesAsync(tenantId, waybillId, apiVersion, xApiVersion)

Get road waybill lines

Retrieves all lines for a specific road waybill.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoadWaybillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RoadWaybillsApi apiInstance = new RoadWaybillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID waybillId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      WaybillLineDtoListEnvelope result = apiInstance.getRoadWaybillLinesAsync(tenantId, waybillId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoadWaybillsApi#getRoadWaybillLinesAsync");
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
| **waybillId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**WaybillLineDtoListEnvelope**](WaybillLineDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **200** | OK |  -  |

<a id="getRoadWaybillLinesCountAsync"></a>
# **getRoadWaybillLinesCountAsync**
> Int32Envelope getRoadWaybillLinesCountAsync(tenantId, waybillId, apiVersion, xApiVersion)

Get road waybill lines count

Returns the count of lines for a specific road waybill.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoadWaybillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RoadWaybillsApi apiInstance = new RoadWaybillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID waybillId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getRoadWaybillLinesCountAsync(tenantId, waybillId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoadWaybillsApi#getRoadWaybillLinesCountAsync");
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
| **waybillId** | **UUID**|  | |
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
| **200** | OK |  -  |

<a id="getRoadWaybillsAsync"></a>
# **getRoadWaybillsAsync**
> RoadWaybillDtoListEnvelope getRoadWaybillsAsync(tenantId, apiVersion, xApiVersion)

Get all road waybills

Retrieves all road waybills for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoadWaybillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RoadWaybillsApi apiInstance = new RoadWaybillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      RoadWaybillDtoListEnvelope result = apiInstance.getRoadWaybillsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoadWaybillsApi#getRoadWaybillsAsync");
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

[**RoadWaybillDtoListEnvelope**](RoadWaybillDtoListEnvelope.md)

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

<a id="getRoadWaybillsCountAsync"></a>
# **getRoadWaybillsCountAsync**
> Int32Envelope getRoadWaybillsCountAsync(tenantId, apiVersion, xApiVersion)

Get road waybills count

Returns the count of road waybills for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoadWaybillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RoadWaybillsApi apiInstance = new RoadWaybillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getRoadWaybillsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoadWaybillsApi#getRoadWaybillsCountAsync");
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
| **200** | OK |  -  |

<a id="issueRoadWaybillAsync"></a>
# **issueRoadWaybillAsync**
> EmptyEnvelope issueRoadWaybillAsync(tenantId, waybillId, apiVersion, xApiVersion)

Issue a road waybill

Issues a road waybill.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoadWaybillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RoadWaybillsApi apiInstance = new RoadWaybillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID waybillId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.issueRoadWaybillAsync(tenantId, waybillId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoadWaybillsApi#issueRoadWaybillAsync");
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
| **waybillId** | **UUID**|  | |
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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

<a id="markRoadWaybillDeliveredAsync"></a>
# **markRoadWaybillDeliveredAsync**
> EmptyEnvelope markRoadWaybillDeliveredAsync(tenantId, waybillId, apiVersion, xApiVersion)

Mark road waybill delivered

Marks a road waybill as delivered.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoadWaybillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RoadWaybillsApi apiInstance = new RoadWaybillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID waybillId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.markRoadWaybillDeliveredAsync(tenantId, waybillId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoadWaybillsApi#markRoadWaybillDeliveredAsync");
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
| **waybillId** | **UUID**|  | |
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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

<a id="markRoadWaybillInTransitAsync"></a>
# **markRoadWaybillInTransitAsync**
> EmptyEnvelope markRoadWaybillInTransitAsync(tenantId, waybillId, apiVersion, xApiVersion)

Mark road waybill in transit

Marks a road waybill as in transit.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoadWaybillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RoadWaybillsApi apiInstance = new RoadWaybillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID waybillId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.markRoadWaybillInTransitAsync(tenantId, waybillId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoadWaybillsApi#markRoadWaybillInTransitAsync");
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
| **waybillId** | **UUID**|  | |
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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

<a id="removeRoadWaybillLineAsync"></a>
# **removeRoadWaybillLineAsync**
> EmptyEnvelope removeRoadWaybillLineAsync(tenantId, waybillId, lineId, apiVersion, xApiVersion)

Remove a road waybill line

Removes a line from a road waybill.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoadWaybillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RoadWaybillsApi apiInstance = new RoadWaybillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID waybillId = UUID.randomUUID(); // UUID | 
    UUID lineId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.removeRoadWaybillLineAsync(tenantId, waybillId, lineId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoadWaybillsApi#removeRoadWaybillLineAsync");
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
| **waybillId** | **UUID**|  | |
| **lineId** | **UUID**|  | |
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

<a id="updateRoadWaybillAsync"></a>
# **updateRoadWaybillAsync**
> EmptyEnvelope updateRoadWaybillAsync(tenantId, waybillId, apiVersion, xApiVersion, roadWaybillUpdateDto)

Update a road waybill

Updates an existing road waybill.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoadWaybillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RoadWaybillsApi apiInstance = new RoadWaybillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID waybillId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    RoadWaybillUpdateDto roadWaybillUpdateDto = new RoadWaybillUpdateDto(); // RoadWaybillUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateRoadWaybillAsync(tenantId, waybillId, apiVersion, xApiVersion, roadWaybillUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoadWaybillsApi#updateRoadWaybillAsync");
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
| **waybillId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **roadWaybillUpdateDto** | [**RoadWaybillUpdateDto**](RoadWaybillUpdateDto.md)|  | [optional] |

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

<a id="updateRoadWaybillLineAsync"></a>
# **updateRoadWaybillLineAsync**
> EmptyEnvelope updateRoadWaybillLineAsync(tenantId, waybillId, lineId, apiVersion, xApiVersion, waybillLineUpdateDto)

Update a road waybill line

Updates an existing line on a road waybill.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoadWaybillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RoadWaybillsApi apiInstance = new RoadWaybillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID waybillId = UUID.randomUUID(); // UUID | 
    UUID lineId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    WaybillLineUpdateDto waybillLineUpdateDto = new WaybillLineUpdateDto(); // WaybillLineUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateRoadWaybillLineAsync(tenantId, waybillId, lineId, apiVersion, xApiVersion, waybillLineUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoadWaybillsApi#updateRoadWaybillLineAsync");
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
| **waybillId** | **UUID**|  | |
| **lineId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **waybillLineUpdateDto** | [**WaybillLineUpdateDto**](WaybillLineUpdateDto.md)|  | [optional] |

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

