# RailWaybillsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addRailWaybillLineAsync**](RailWaybillsApi.md#addRailWaybillLineAsync) | **POST** /api/v2/LogisticsService/RailWaybills/{waybillId}/Lines | Add a line to rail waybill |
| [**cancelRailWaybillAsync**](RailWaybillsApi.md#cancelRailWaybillAsync) | **POST** /api/v2/LogisticsService/RailWaybills/{waybillId}/Cancel | Cancel a rail waybill |
| [**createRailWaybillAsync**](RailWaybillsApi.md#createRailWaybillAsync) | **POST** /api/v2/LogisticsService/RailWaybills | Create a rail waybill |
| [**deleteRailWaybillAsync**](RailWaybillsApi.md#deleteRailWaybillAsync) | **DELETE** /api/v2/LogisticsService/RailWaybills/{waybillId} | Delete a rail waybill |
| [**getRailWaybillByIdAsync**](RailWaybillsApi.md#getRailWaybillByIdAsync) | **GET** /api/v2/LogisticsService/RailWaybills/{waybillId} | Get rail waybill by ID |
| [**getRailWaybillLinesAsync**](RailWaybillsApi.md#getRailWaybillLinesAsync) | **GET** /api/v2/LogisticsService/RailWaybills/{waybillId}/Lines | Get rail waybill lines |
| [**getRailWaybillLinesCountAsync**](RailWaybillsApi.md#getRailWaybillLinesCountAsync) | **GET** /api/v2/LogisticsService/RailWaybills/{waybillId}/Lines/Count | Get rail waybill lines count |
| [**getRailWaybillsAsync**](RailWaybillsApi.md#getRailWaybillsAsync) | **GET** /api/v2/LogisticsService/RailWaybills | Get all rail waybills |
| [**getRailWaybillsCountAsync**](RailWaybillsApi.md#getRailWaybillsCountAsync) | **GET** /api/v2/LogisticsService/RailWaybills/Count | Get rail waybills count |
| [**issueRailWaybillAsync**](RailWaybillsApi.md#issueRailWaybillAsync) | **POST** /api/v2/LogisticsService/RailWaybills/{waybillId}/Issue | Issue a rail waybill |
| [**markRailWaybillDeliveredAsync**](RailWaybillsApi.md#markRailWaybillDeliveredAsync) | **POST** /api/v2/LogisticsService/RailWaybills/{waybillId}/MarkDelivered | Mark rail waybill delivered |
| [**markRailWaybillInTransitAsync**](RailWaybillsApi.md#markRailWaybillInTransitAsync) | **POST** /api/v2/LogisticsService/RailWaybills/{waybillId}/MarkInTransit | Mark rail waybill in transit |
| [**removeRailWaybillLineAsync**](RailWaybillsApi.md#removeRailWaybillLineAsync) | **DELETE** /api/v2/LogisticsService/RailWaybills/{waybillId}/Lines/{lineId} | Remove a rail waybill line |
| [**updateRailWaybillAsync**](RailWaybillsApi.md#updateRailWaybillAsync) | **PUT** /api/v2/LogisticsService/RailWaybills/{waybillId} | Update a rail waybill |
| [**updateRailWaybillLineAsync**](RailWaybillsApi.md#updateRailWaybillLineAsync) | **PUT** /api/v2/LogisticsService/RailWaybills/{waybillId}/Lines/{lineId} | Update a rail waybill line |


<a id="addRailWaybillLineAsync"></a>
# **addRailWaybillLineAsync**
> EmptyEnvelope addRailWaybillLineAsync(tenantId, waybillId, apiVersion, xApiVersion, waybillLineCreateDto)

Add a line to rail waybill

Adds a new line to a rail waybill.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RailWaybillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RailWaybillsApi apiInstance = new RailWaybillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID waybillId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    WaybillLineCreateDto waybillLineCreateDto = new WaybillLineCreateDto(); // WaybillLineCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.addRailWaybillLineAsync(tenantId, waybillId, apiVersion, xApiVersion, waybillLineCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RailWaybillsApi#addRailWaybillLineAsync");
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

<a id="cancelRailWaybillAsync"></a>
# **cancelRailWaybillAsync**
> EmptyEnvelope cancelRailWaybillAsync(tenantId, waybillId, apiVersion, xApiVersion)

Cancel a rail waybill

Cancels a rail waybill.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RailWaybillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RailWaybillsApi apiInstance = new RailWaybillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID waybillId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.cancelRailWaybillAsync(tenantId, waybillId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RailWaybillsApi#cancelRailWaybillAsync");
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

<a id="createRailWaybillAsync"></a>
# **createRailWaybillAsync**
> EmptyEnvelope createRailWaybillAsync(tenantId, apiVersion, xApiVersion, railWaybillCreateDto)

Create a rail waybill

Creates a new rail waybill for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RailWaybillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RailWaybillsApi apiInstance = new RailWaybillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    RailWaybillCreateDto railWaybillCreateDto = new RailWaybillCreateDto(); // RailWaybillCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createRailWaybillAsync(tenantId, apiVersion, xApiVersion, railWaybillCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RailWaybillsApi#createRailWaybillAsync");
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
| **railWaybillCreateDto** | [**RailWaybillCreateDto**](RailWaybillCreateDto.md)|  | [optional] |

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

<a id="deleteRailWaybillAsync"></a>
# **deleteRailWaybillAsync**
> EmptyEnvelope deleteRailWaybillAsync(tenantId, waybillId, apiVersion, xApiVersion)

Delete a rail waybill

Deletes a rail waybill.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RailWaybillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RailWaybillsApi apiInstance = new RailWaybillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID waybillId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteRailWaybillAsync(tenantId, waybillId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RailWaybillsApi#deleteRailWaybillAsync");
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

<a id="getRailWaybillByIdAsync"></a>
# **getRailWaybillByIdAsync**
> RailWaybillDtoEnvelope getRailWaybillByIdAsync(tenantId, waybillId, apiVersion, xApiVersion)

Get rail waybill by ID

Retrieves a specific rail waybill by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RailWaybillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RailWaybillsApi apiInstance = new RailWaybillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID waybillId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      RailWaybillDtoEnvelope result = apiInstance.getRailWaybillByIdAsync(tenantId, waybillId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RailWaybillsApi#getRailWaybillByIdAsync");
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

[**RailWaybillDtoEnvelope**](RailWaybillDtoEnvelope.md)

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

<a id="getRailWaybillLinesAsync"></a>
# **getRailWaybillLinesAsync**
> WaybillLineDtoListEnvelope getRailWaybillLinesAsync(tenantId, waybillId, apiVersion, xApiVersion)

Get rail waybill lines

Retrieves all lines for a specific rail waybill.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RailWaybillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RailWaybillsApi apiInstance = new RailWaybillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID waybillId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      WaybillLineDtoListEnvelope result = apiInstance.getRailWaybillLinesAsync(tenantId, waybillId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RailWaybillsApi#getRailWaybillLinesAsync");
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

<a id="getRailWaybillLinesCountAsync"></a>
# **getRailWaybillLinesCountAsync**
> Int32Envelope getRailWaybillLinesCountAsync(tenantId, waybillId, apiVersion, xApiVersion)

Get rail waybill lines count

Returns the count of lines for a specific rail waybill.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RailWaybillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RailWaybillsApi apiInstance = new RailWaybillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID waybillId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getRailWaybillLinesCountAsync(tenantId, waybillId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RailWaybillsApi#getRailWaybillLinesCountAsync");
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

<a id="getRailWaybillsAsync"></a>
# **getRailWaybillsAsync**
> RailWaybillDtoListEnvelope getRailWaybillsAsync(tenantId, apiVersion, xApiVersion)

Get all rail waybills

Retrieves all rail waybills for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RailWaybillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RailWaybillsApi apiInstance = new RailWaybillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      RailWaybillDtoListEnvelope result = apiInstance.getRailWaybillsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RailWaybillsApi#getRailWaybillsAsync");
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

[**RailWaybillDtoListEnvelope**](RailWaybillDtoListEnvelope.md)

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

<a id="getRailWaybillsCountAsync"></a>
# **getRailWaybillsCountAsync**
> Int32Envelope getRailWaybillsCountAsync(tenantId, apiVersion, xApiVersion)

Get rail waybills count

Returns the count of rail waybills for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RailWaybillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RailWaybillsApi apiInstance = new RailWaybillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getRailWaybillsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RailWaybillsApi#getRailWaybillsCountAsync");
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

<a id="issueRailWaybillAsync"></a>
# **issueRailWaybillAsync**
> EmptyEnvelope issueRailWaybillAsync(tenantId, waybillId, apiVersion, xApiVersion)

Issue a rail waybill

Issues a rail waybill.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RailWaybillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RailWaybillsApi apiInstance = new RailWaybillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID waybillId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.issueRailWaybillAsync(tenantId, waybillId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RailWaybillsApi#issueRailWaybillAsync");
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

<a id="markRailWaybillDeliveredAsync"></a>
# **markRailWaybillDeliveredAsync**
> EmptyEnvelope markRailWaybillDeliveredAsync(tenantId, waybillId, apiVersion, xApiVersion)

Mark rail waybill delivered

Marks a rail waybill as delivered.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RailWaybillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RailWaybillsApi apiInstance = new RailWaybillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID waybillId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.markRailWaybillDeliveredAsync(tenantId, waybillId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RailWaybillsApi#markRailWaybillDeliveredAsync");
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

<a id="markRailWaybillInTransitAsync"></a>
# **markRailWaybillInTransitAsync**
> EmptyEnvelope markRailWaybillInTransitAsync(tenantId, waybillId, apiVersion, xApiVersion)

Mark rail waybill in transit

Marks a rail waybill as in transit.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RailWaybillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RailWaybillsApi apiInstance = new RailWaybillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID waybillId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.markRailWaybillInTransitAsync(tenantId, waybillId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RailWaybillsApi#markRailWaybillInTransitAsync");
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

<a id="removeRailWaybillLineAsync"></a>
# **removeRailWaybillLineAsync**
> EmptyEnvelope removeRailWaybillLineAsync(tenantId, waybillId, lineId, apiVersion, xApiVersion)

Remove a rail waybill line

Removes a line from a rail waybill.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RailWaybillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RailWaybillsApi apiInstance = new RailWaybillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID waybillId = UUID.randomUUID(); // UUID | 
    UUID lineId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.removeRailWaybillLineAsync(tenantId, waybillId, lineId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RailWaybillsApi#removeRailWaybillLineAsync");
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

<a id="updateRailWaybillAsync"></a>
# **updateRailWaybillAsync**
> EmptyEnvelope updateRailWaybillAsync(tenantId, waybillId, apiVersion, xApiVersion, railWaybillUpdateDto)

Update a rail waybill

Updates an existing rail waybill.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RailWaybillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RailWaybillsApi apiInstance = new RailWaybillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID waybillId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    RailWaybillUpdateDto railWaybillUpdateDto = new RailWaybillUpdateDto(); // RailWaybillUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateRailWaybillAsync(tenantId, waybillId, apiVersion, xApiVersion, railWaybillUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RailWaybillsApi#updateRailWaybillAsync");
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
| **railWaybillUpdateDto** | [**RailWaybillUpdateDto**](RailWaybillUpdateDto.md)|  | [optional] |

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

<a id="updateRailWaybillLineAsync"></a>
# **updateRailWaybillLineAsync**
> EmptyEnvelope updateRailWaybillLineAsync(tenantId, waybillId, lineId, apiVersion, xApiVersion, waybillLineUpdateDto)

Update a rail waybill line

Updates an existing line on a rail waybill.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RailWaybillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RailWaybillsApi apiInstance = new RailWaybillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID waybillId = UUID.randomUUID(); // UUID | 
    UUID lineId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    WaybillLineUpdateDto waybillLineUpdateDto = new WaybillLineUpdateDto(); // WaybillLineUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateRailWaybillLineAsync(tenantId, waybillId, lineId, apiVersion, xApiVersion, waybillLineUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RailWaybillsApi#updateRailWaybillLineAsync");
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

