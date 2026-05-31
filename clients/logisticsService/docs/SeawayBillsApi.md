# SeawayBillsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addSeawayBillLineAsync**](SeawayBillsApi.md#addSeawayBillLineAsync) | **POST** /api/v2/LogisticsService/SeawayBills/{billId}/Lines | Add a line to seaway bill |
| [**cancelSeawayBillAsync**](SeawayBillsApi.md#cancelSeawayBillAsync) | **POST** /api/v2/LogisticsService/SeawayBills/{billId}/Cancel | Cancel a seaway bill |
| [**createSeawayBillAsync**](SeawayBillsApi.md#createSeawayBillAsync) | **POST** /api/v2/LogisticsService/SeawayBills | Create a seaway bill |
| [**deleteSeawayBillAsync**](SeawayBillsApi.md#deleteSeawayBillAsync) | **DELETE** /api/v2/LogisticsService/SeawayBills/{billId} | Delete a seaway bill |
| [**getSeawayBillByIdAsync**](SeawayBillsApi.md#getSeawayBillByIdAsync) | **GET** /api/v2/LogisticsService/SeawayBills/{billId} | Get seaway bill by ID |
| [**getSeawayBillLinesAsync**](SeawayBillsApi.md#getSeawayBillLinesAsync) | **GET** /api/v2/LogisticsService/SeawayBills/{billId}/Lines | Get seaway bill lines |
| [**getSeawayBillLinesCountAsync**](SeawayBillsApi.md#getSeawayBillLinesCountAsync) | **GET** /api/v2/LogisticsService/SeawayBills/{billId}/Lines/Count | Get seaway bill lines count |
| [**getSeawayBillsAsync**](SeawayBillsApi.md#getSeawayBillsAsync) | **GET** /api/v2/LogisticsService/SeawayBills | Get all seaway bills |
| [**getSeawayBillsCountAsync**](SeawayBillsApi.md#getSeawayBillsCountAsync) | **GET** /api/v2/LogisticsService/SeawayBills/Count | Get seaway bills count |
| [**issueSeawayBillAsync**](SeawayBillsApi.md#issueSeawayBillAsync) | **POST** /api/v2/LogisticsService/SeawayBills/{billId}/Issue | Issue a seaway bill |
| [**markSeawayBillArrivedAsync**](SeawayBillsApi.md#markSeawayBillArrivedAsync) | **POST** /api/v2/LogisticsService/SeawayBills/{billId}/MarkArrived | Mark seaway bill arrived |
| [**markSeawayBillInTransitAsync**](SeawayBillsApi.md#markSeawayBillInTransitAsync) | **POST** /api/v2/LogisticsService/SeawayBills/{billId}/MarkInTransit | Mark seaway bill in transit |
| [**releaseSeawayBillAsync**](SeawayBillsApi.md#releaseSeawayBillAsync) | **POST** /api/v2/LogisticsService/SeawayBills/{billId}/Release | Release a seaway bill |
| [**removeSeawayBillLineAsync**](SeawayBillsApi.md#removeSeawayBillLineAsync) | **DELETE** /api/v2/LogisticsService/SeawayBills/{billId}/Lines/{lineId} | Remove a seaway bill line |
| [**updateSeawayBillAsync**](SeawayBillsApi.md#updateSeawayBillAsync) | **PUT** /api/v2/LogisticsService/SeawayBills/{billId} | Update a seaway bill |
| [**updateSeawayBillLineAsync**](SeawayBillsApi.md#updateSeawayBillLineAsync) | **PUT** /api/v2/LogisticsService/SeawayBills/{billId}/Lines/{lineId} | Update a seaway bill line |


<a id="addSeawayBillLineAsync"></a>
# **addSeawayBillLineAsync**
> EmptyEnvelope addSeawayBillLineAsync(tenantId, billId, apiVersion, xApiVersion, waybillLineCreateDto)

Add a line to seaway bill

Adds a new line to a seaway bill.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SeawayBillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SeawayBillsApi apiInstance = new SeawayBillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID billId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    WaybillLineCreateDto waybillLineCreateDto = new WaybillLineCreateDto(); // WaybillLineCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.addSeawayBillLineAsync(tenantId, billId, apiVersion, xApiVersion, waybillLineCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SeawayBillsApi#addSeawayBillLineAsync");
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
| **billId** | **UUID**|  | |
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

<a id="cancelSeawayBillAsync"></a>
# **cancelSeawayBillAsync**
> EmptyEnvelope cancelSeawayBillAsync(tenantId, billId, apiVersion, xApiVersion)

Cancel a seaway bill

Cancels a seaway bill.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SeawayBillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SeawayBillsApi apiInstance = new SeawayBillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID billId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.cancelSeawayBillAsync(tenantId, billId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SeawayBillsApi#cancelSeawayBillAsync");
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
| **billId** | **UUID**|  | |
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

<a id="createSeawayBillAsync"></a>
# **createSeawayBillAsync**
> EmptyEnvelope createSeawayBillAsync(tenantId, apiVersion, xApiVersion, seawayBillCreateDto)

Create a seaway bill

Creates a new seaway bill for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SeawayBillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SeawayBillsApi apiInstance = new SeawayBillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SeawayBillCreateDto seawayBillCreateDto = new SeawayBillCreateDto(); // SeawayBillCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createSeawayBillAsync(tenantId, apiVersion, xApiVersion, seawayBillCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SeawayBillsApi#createSeawayBillAsync");
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
| **seawayBillCreateDto** | [**SeawayBillCreateDto**](SeawayBillCreateDto.md)|  | [optional] |

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

<a id="deleteSeawayBillAsync"></a>
# **deleteSeawayBillAsync**
> EmptyEnvelope deleteSeawayBillAsync(tenantId, billId, apiVersion, xApiVersion)

Delete a seaway bill

Deletes a seaway bill.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SeawayBillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SeawayBillsApi apiInstance = new SeawayBillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID billId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteSeawayBillAsync(tenantId, billId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SeawayBillsApi#deleteSeawayBillAsync");
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
| **billId** | **UUID**|  | |
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

<a id="getSeawayBillByIdAsync"></a>
# **getSeawayBillByIdAsync**
> SeawayBillDtoEnvelope getSeawayBillByIdAsync(tenantId, billId, apiVersion, xApiVersion)

Get seaway bill by ID

Retrieves a specific seaway bill by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SeawayBillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SeawayBillsApi apiInstance = new SeawayBillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID billId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SeawayBillDtoEnvelope result = apiInstance.getSeawayBillByIdAsync(tenantId, billId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SeawayBillsApi#getSeawayBillByIdAsync");
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
| **billId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**SeawayBillDtoEnvelope**](SeawayBillDtoEnvelope.md)

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

<a id="getSeawayBillLinesAsync"></a>
# **getSeawayBillLinesAsync**
> WaybillLineDtoListEnvelope getSeawayBillLinesAsync(tenantId, billId, apiVersion, xApiVersion)

Get seaway bill lines

Retrieves all lines for a specific seaway bill.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SeawayBillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SeawayBillsApi apiInstance = new SeawayBillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID billId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      WaybillLineDtoListEnvelope result = apiInstance.getSeawayBillLinesAsync(tenantId, billId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SeawayBillsApi#getSeawayBillLinesAsync");
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
| **billId** | **UUID**|  | |
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

<a id="getSeawayBillLinesCountAsync"></a>
# **getSeawayBillLinesCountAsync**
> Int32Envelope getSeawayBillLinesCountAsync(tenantId, billId, apiVersion, xApiVersion)

Get seaway bill lines count

Returns the count of lines for a specific seaway bill.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SeawayBillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SeawayBillsApi apiInstance = new SeawayBillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID billId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getSeawayBillLinesCountAsync(tenantId, billId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SeawayBillsApi#getSeawayBillLinesCountAsync");
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
| **billId** | **UUID**|  | |
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

<a id="getSeawayBillsAsync"></a>
# **getSeawayBillsAsync**
> SeawayBillDtoListEnvelope getSeawayBillsAsync(tenantId, apiVersion, xApiVersion)

Get all seaway bills

Retrieves all seaway bills for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SeawayBillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SeawayBillsApi apiInstance = new SeawayBillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SeawayBillDtoListEnvelope result = apiInstance.getSeawayBillsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SeawayBillsApi#getSeawayBillsAsync");
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

[**SeawayBillDtoListEnvelope**](SeawayBillDtoListEnvelope.md)

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

<a id="getSeawayBillsCountAsync"></a>
# **getSeawayBillsCountAsync**
> Int32Envelope getSeawayBillsCountAsync(tenantId, apiVersion, xApiVersion)

Get seaway bills count

Returns the count of seaway bills for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SeawayBillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SeawayBillsApi apiInstance = new SeawayBillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getSeawayBillsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SeawayBillsApi#getSeawayBillsCountAsync");
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

<a id="issueSeawayBillAsync"></a>
# **issueSeawayBillAsync**
> EmptyEnvelope issueSeawayBillAsync(tenantId, billId, apiVersion, xApiVersion)

Issue a seaway bill

Issues a seaway bill.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SeawayBillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SeawayBillsApi apiInstance = new SeawayBillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID billId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.issueSeawayBillAsync(tenantId, billId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SeawayBillsApi#issueSeawayBillAsync");
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
| **billId** | **UUID**|  | |
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

<a id="markSeawayBillArrivedAsync"></a>
# **markSeawayBillArrivedAsync**
> EmptyEnvelope markSeawayBillArrivedAsync(tenantId, billId, apiVersion, xApiVersion)

Mark seaway bill arrived

Marks a seaway bill as arrived.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SeawayBillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SeawayBillsApi apiInstance = new SeawayBillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID billId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.markSeawayBillArrivedAsync(tenantId, billId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SeawayBillsApi#markSeawayBillArrivedAsync");
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
| **billId** | **UUID**|  | |
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

<a id="markSeawayBillInTransitAsync"></a>
# **markSeawayBillInTransitAsync**
> EmptyEnvelope markSeawayBillInTransitAsync(tenantId, billId, apiVersion, xApiVersion)

Mark seaway bill in transit

Marks a seaway bill as in transit.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SeawayBillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SeawayBillsApi apiInstance = new SeawayBillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID billId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.markSeawayBillInTransitAsync(tenantId, billId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SeawayBillsApi#markSeawayBillInTransitAsync");
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
| **billId** | **UUID**|  | |
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

<a id="releaseSeawayBillAsync"></a>
# **releaseSeawayBillAsync**
> EmptyEnvelope releaseSeawayBillAsync(tenantId, billId, apiVersion, xApiVersion)

Release a seaway bill

Releases a seaway bill.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SeawayBillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SeawayBillsApi apiInstance = new SeawayBillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID billId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.releaseSeawayBillAsync(tenantId, billId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SeawayBillsApi#releaseSeawayBillAsync");
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
| **billId** | **UUID**|  | |
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

<a id="removeSeawayBillLineAsync"></a>
# **removeSeawayBillLineAsync**
> EmptyEnvelope removeSeawayBillLineAsync(tenantId, billId, lineId, apiVersion, xApiVersion)

Remove a seaway bill line

Removes a line from a seaway bill.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SeawayBillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SeawayBillsApi apiInstance = new SeawayBillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID billId = UUID.randomUUID(); // UUID | 
    UUID lineId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.removeSeawayBillLineAsync(tenantId, billId, lineId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SeawayBillsApi#removeSeawayBillLineAsync");
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
| **billId** | **UUID**|  | |
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

<a id="updateSeawayBillAsync"></a>
# **updateSeawayBillAsync**
> EmptyEnvelope updateSeawayBillAsync(tenantId, billId, apiVersion, xApiVersion, seawayBillUpdateDto)

Update a seaway bill

Updates an existing seaway bill.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SeawayBillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SeawayBillsApi apiInstance = new SeawayBillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID billId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SeawayBillUpdateDto seawayBillUpdateDto = new SeawayBillUpdateDto(); // SeawayBillUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateSeawayBillAsync(tenantId, billId, apiVersion, xApiVersion, seawayBillUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SeawayBillsApi#updateSeawayBillAsync");
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
| **billId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **seawayBillUpdateDto** | [**SeawayBillUpdateDto**](SeawayBillUpdateDto.md)|  | [optional] |

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

<a id="updateSeawayBillLineAsync"></a>
# **updateSeawayBillLineAsync**
> EmptyEnvelope updateSeawayBillLineAsync(tenantId, billId, lineId, apiVersion, xApiVersion, waybillLineUpdateDto)

Update a seaway bill line

Updates an existing line on a seaway bill.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SeawayBillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SeawayBillsApi apiInstance = new SeawayBillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID billId = UUID.randomUUID(); // UUID | 
    UUID lineId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    WaybillLineUpdateDto waybillLineUpdateDto = new WaybillLineUpdateDto(); // WaybillLineUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateSeawayBillLineAsync(tenantId, billId, lineId, apiVersion, xApiVersion, waybillLineUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SeawayBillsApi#updateSeawayBillLineAsync");
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
| **billId** | **UUID**|  | |
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

