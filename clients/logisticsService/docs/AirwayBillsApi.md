# AirwayBillsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addAirwayBillLineAsync**](AirwayBillsApi.md#addAirwayBillLineAsync) | **POST** /api/v2/LogisticsService/AirwayBills/{billId}/Lines | Add a line to airway bill |
| [**cancelAirwayBillAsync**](AirwayBillsApi.md#cancelAirwayBillAsync) | **POST** /api/v2/LogisticsService/AirwayBills/{billId}/Cancel | Cancel an airway bill |
| [**createAirwayBillAsync**](AirwayBillsApi.md#createAirwayBillAsync) | **POST** /api/v2/LogisticsService/AirwayBills | Create an airway bill |
| [**deleteAirwayBillAsync**](AirwayBillsApi.md#deleteAirwayBillAsync) | **DELETE** /api/v2/LogisticsService/AirwayBills/{billId} | Delete an airway bill |
| [**getAirwayBillByIdAsync**](AirwayBillsApi.md#getAirwayBillByIdAsync) | **GET** /api/v2/LogisticsService/AirwayBills/{billId} | Get airway bill by ID |
| [**getAirwayBillLinesAsync**](AirwayBillsApi.md#getAirwayBillLinesAsync) | **GET** /api/v2/LogisticsService/AirwayBills/{billId}/Lines | Get airway bill lines |
| [**getAirwayBillLinesCountAsync**](AirwayBillsApi.md#getAirwayBillLinesCountAsync) | **GET** /api/v2/LogisticsService/AirwayBills/{billId}/Lines/Count | Get airway bill lines count |
| [**getAirwayBillsAsync**](AirwayBillsApi.md#getAirwayBillsAsync) | **GET** /api/v2/LogisticsService/AirwayBills | Get all airway bills |
| [**getAirwayBillsCountAsync**](AirwayBillsApi.md#getAirwayBillsCountAsync) | **GET** /api/v2/LogisticsService/AirwayBills/Count | Get airway bills count |
| [**issueAirwayBillAsync**](AirwayBillsApi.md#issueAirwayBillAsync) | **POST** /api/v2/LogisticsService/AirwayBills/{billId}/Issue | Issue an airway bill |
| [**markAirwayBillArrivedAsync**](AirwayBillsApi.md#markAirwayBillArrivedAsync) | **POST** /api/v2/LogisticsService/AirwayBills/{billId}/MarkArrived | Mark airway bill arrived |
| [**markAirwayBillDeliveredAsync**](AirwayBillsApi.md#markAirwayBillDeliveredAsync) | **POST** /api/v2/LogisticsService/AirwayBills/{billId}/MarkDelivered | Mark airway bill delivered |
| [**markAirwayBillInTransitAsync**](AirwayBillsApi.md#markAirwayBillInTransitAsync) | **POST** /api/v2/LogisticsService/AirwayBills/{billId}/MarkInTransit | Mark airway bill in transit |
| [**removeAirwayBillLineAsync**](AirwayBillsApi.md#removeAirwayBillLineAsync) | **DELETE** /api/v2/LogisticsService/AirwayBills/{billId}/Lines/{lineId} | Remove an airway bill line |
| [**updateAirwayBillAsync**](AirwayBillsApi.md#updateAirwayBillAsync) | **PUT** /api/v2/LogisticsService/AirwayBills/{billId} | Update an airway bill |
| [**updateAirwayBillLineAsync**](AirwayBillsApi.md#updateAirwayBillLineAsync) | **PUT** /api/v2/LogisticsService/AirwayBills/{billId}/Lines/{lineId} | Update an airway bill line |


<a id="addAirwayBillLineAsync"></a>
# **addAirwayBillLineAsync**
> EmptyEnvelope addAirwayBillLineAsync(tenantId, billId, apiVersion, xApiVersion, waybillLineCreateDto)

Add a line to airway bill

Adds a new line to an airway bill.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AirwayBillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AirwayBillsApi apiInstance = new AirwayBillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID billId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    WaybillLineCreateDto waybillLineCreateDto = new WaybillLineCreateDto(); // WaybillLineCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.addAirwayBillLineAsync(tenantId, billId, apiVersion, xApiVersion, waybillLineCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AirwayBillsApi#addAirwayBillLineAsync");
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

<a id="cancelAirwayBillAsync"></a>
# **cancelAirwayBillAsync**
> EmptyEnvelope cancelAirwayBillAsync(tenantId, billId, apiVersion, xApiVersion)

Cancel an airway bill

Cancels an airway bill.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AirwayBillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AirwayBillsApi apiInstance = new AirwayBillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID billId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.cancelAirwayBillAsync(tenantId, billId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AirwayBillsApi#cancelAirwayBillAsync");
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

<a id="createAirwayBillAsync"></a>
# **createAirwayBillAsync**
> EmptyEnvelope createAirwayBillAsync(tenantId, apiVersion, xApiVersion, airwayBillCreateDto)

Create an airway bill

Creates a new airway bill for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AirwayBillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AirwayBillsApi apiInstance = new AirwayBillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    AirwayBillCreateDto airwayBillCreateDto = new AirwayBillCreateDto(); // AirwayBillCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createAirwayBillAsync(tenantId, apiVersion, xApiVersion, airwayBillCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AirwayBillsApi#createAirwayBillAsync");
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
| **airwayBillCreateDto** | [**AirwayBillCreateDto**](AirwayBillCreateDto.md)|  | [optional] |

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

<a id="deleteAirwayBillAsync"></a>
# **deleteAirwayBillAsync**
> EmptyEnvelope deleteAirwayBillAsync(tenantId, billId, apiVersion, xApiVersion)

Delete an airway bill

Deletes an airway bill.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AirwayBillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AirwayBillsApi apiInstance = new AirwayBillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID billId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteAirwayBillAsync(tenantId, billId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AirwayBillsApi#deleteAirwayBillAsync");
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

<a id="getAirwayBillByIdAsync"></a>
# **getAirwayBillByIdAsync**
> AirwayBillDtoEnvelope getAirwayBillByIdAsync(tenantId, billId, apiVersion, xApiVersion)

Get airway bill by ID

Retrieves a specific airway bill by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AirwayBillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AirwayBillsApi apiInstance = new AirwayBillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID billId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      AirwayBillDtoEnvelope result = apiInstance.getAirwayBillByIdAsync(tenantId, billId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AirwayBillsApi#getAirwayBillByIdAsync");
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

[**AirwayBillDtoEnvelope**](AirwayBillDtoEnvelope.md)

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

<a id="getAirwayBillLinesAsync"></a>
# **getAirwayBillLinesAsync**
> WaybillLineDtoListEnvelope getAirwayBillLinesAsync(tenantId, billId, apiVersion, xApiVersion)

Get airway bill lines

Retrieves all lines for a specific airway bill.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AirwayBillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AirwayBillsApi apiInstance = new AirwayBillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID billId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      WaybillLineDtoListEnvelope result = apiInstance.getAirwayBillLinesAsync(tenantId, billId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AirwayBillsApi#getAirwayBillLinesAsync");
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

<a id="getAirwayBillLinesCountAsync"></a>
# **getAirwayBillLinesCountAsync**
> Int32Envelope getAirwayBillLinesCountAsync(tenantId, billId, apiVersion, xApiVersion)

Get airway bill lines count

Returns the count of lines for a specific airway bill.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AirwayBillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AirwayBillsApi apiInstance = new AirwayBillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID billId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getAirwayBillLinesCountAsync(tenantId, billId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AirwayBillsApi#getAirwayBillLinesCountAsync");
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

<a id="getAirwayBillsAsync"></a>
# **getAirwayBillsAsync**
> AirwayBillDtoListEnvelope getAirwayBillsAsync(tenantId, apiVersion, xApiVersion)

Get all airway bills

Retrieves all airway bills for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AirwayBillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AirwayBillsApi apiInstance = new AirwayBillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      AirwayBillDtoListEnvelope result = apiInstance.getAirwayBillsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AirwayBillsApi#getAirwayBillsAsync");
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

[**AirwayBillDtoListEnvelope**](AirwayBillDtoListEnvelope.md)

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

<a id="getAirwayBillsCountAsync"></a>
# **getAirwayBillsCountAsync**
> Int32Envelope getAirwayBillsCountAsync(tenantId, apiVersion, xApiVersion)

Get airway bills count

Returns the count of airway bills for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AirwayBillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AirwayBillsApi apiInstance = new AirwayBillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getAirwayBillsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AirwayBillsApi#getAirwayBillsCountAsync");
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

<a id="issueAirwayBillAsync"></a>
# **issueAirwayBillAsync**
> EmptyEnvelope issueAirwayBillAsync(tenantId, billId, apiVersion, xApiVersion)

Issue an airway bill

Issues an airway bill.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AirwayBillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AirwayBillsApi apiInstance = new AirwayBillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID billId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.issueAirwayBillAsync(tenantId, billId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AirwayBillsApi#issueAirwayBillAsync");
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

<a id="markAirwayBillArrivedAsync"></a>
# **markAirwayBillArrivedAsync**
> EmptyEnvelope markAirwayBillArrivedAsync(tenantId, billId, apiVersion, xApiVersion)

Mark airway bill arrived

Marks an airway bill as arrived.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AirwayBillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AirwayBillsApi apiInstance = new AirwayBillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID billId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.markAirwayBillArrivedAsync(tenantId, billId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AirwayBillsApi#markAirwayBillArrivedAsync");
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

<a id="markAirwayBillDeliveredAsync"></a>
# **markAirwayBillDeliveredAsync**
> EmptyEnvelope markAirwayBillDeliveredAsync(tenantId, billId, apiVersion, xApiVersion)

Mark airway bill delivered

Marks an airway bill as delivered.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AirwayBillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AirwayBillsApi apiInstance = new AirwayBillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID billId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.markAirwayBillDeliveredAsync(tenantId, billId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AirwayBillsApi#markAirwayBillDeliveredAsync");
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

<a id="markAirwayBillInTransitAsync"></a>
# **markAirwayBillInTransitAsync**
> EmptyEnvelope markAirwayBillInTransitAsync(tenantId, billId, apiVersion, xApiVersion)

Mark airway bill in transit

Marks an airway bill as in transit.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AirwayBillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AirwayBillsApi apiInstance = new AirwayBillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID billId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.markAirwayBillInTransitAsync(tenantId, billId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AirwayBillsApi#markAirwayBillInTransitAsync");
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

<a id="removeAirwayBillLineAsync"></a>
# **removeAirwayBillLineAsync**
> EmptyEnvelope removeAirwayBillLineAsync(tenantId, billId, lineId, apiVersion, xApiVersion)

Remove an airway bill line

Removes a line from an airway bill.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AirwayBillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AirwayBillsApi apiInstance = new AirwayBillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID billId = UUID.randomUUID(); // UUID | 
    UUID lineId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.removeAirwayBillLineAsync(tenantId, billId, lineId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AirwayBillsApi#removeAirwayBillLineAsync");
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

<a id="updateAirwayBillAsync"></a>
# **updateAirwayBillAsync**
> EmptyEnvelope updateAirwayBillAsync(tenantId, billId, apiVersion, xApiVersion, airwayBillUpdateDto)

Update an airway bill

Updates an existing airway bill.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AirwayBillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AirwayBillsApi apiInstance = new AirwayBillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID billId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    AirwayBillUpdateDto airwayBillUpdateDto = new AirwayBillUpdateDto(); // AirwayBillUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateAirwayBillAsync(tenantId, billId, apiVersion, xApiVersion, airwayBillUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AirwayBillsApi#updateAirwayBillAsync");
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
| **airwayBillUpdateDto** | [**AirwayBillUpdateDto**](AirwayBillUpdateDto.md)|  | [optional] |

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

<a id="updateAirwayBillLineAsync"></a>
# **updateAirwayBillLineAsync**
> EmptyEnvelope updateAirwayBillLineAsync(tenantId, billId, lineId, apiVersion, xApiVersion, waybillLineUpdateDto)

Update an airway bill line

Updates an existing line on an airway bill.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AirwayBillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AirwayBillsApi apiInstance = new AirwayBillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID billId = UUID.randomUUID(); // UUID | 
    UUID lineId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    WaybillLineUpdateDto waybillLineUpdateDto = new WaybillLineUpdateDto(); // WaybillLineUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateAirwayBillLineAsync(tenantId, billId, lineId, apiVersion, xApiVersion, waybillLineUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AirwayBillsApi#updateAirwayBillLineAsync");
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

