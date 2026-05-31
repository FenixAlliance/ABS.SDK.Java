# BillsOfLadingApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBillOfLadingAsync**](BillsOfLadingApi.md#createBillOfLadingAsync) | **POST** /api/v2/ShipmentsService/BillsOfLading | Create a bill of lading |
| [**createBillOfLadingLineAsync**](BillsOfLadingApi.md#createBillOfLadingLineAsync) | **POST** /api/v2/ShipmentsService/BillsOfLading/{billOfLadingId}/Lines | Create a bill of lading line |
| [**deleteBillOfLadingAsync**](BillsOfLadingApi.md#deleteBillOfLadingAsync) | **DELETE** /api/v2/ShipmentsService/BillsOfLading/{billOfLadingId} | Delete a bill of lading |
| [**deleteBillOfLadingLineAsync**](BillsOfLadingApi.md#deleteBillOfLadingLineAsync) | **DELETE** /api/v2/ShipmentsService/BillsOfLading/{billOfLadingId}/Lines/{lineId} | Delete a bill of lading line |
| [**getBillOfLadingByIdAsync**](BillsOfLadingApi.md#getBillOfLadingByIdAsync) | **GET** /api/v2/ShipmentsService/BillsOfLading/{billOfLadingId} | Get bill of lading by ID |
| [**getBillOfLadingLineByIdAsync**](BillsOfLadingApi.md#getBillOfLadingLineByIdAsync) | **GET** /api/v2/ShipmentsService/BillsOfLading/{billOfLadingId}/Lines/{lineId} | Get bill of lading line by ID |
| [**getBillOfLadingLinesAsync**](BillsOfLadingApi.md#getBillOfLadingLinesAsync) | **GET** /api/v2/ShipmentsService/BillsOfLading/{billOfLadingId}/Lines | Get bill of lading lines |
| [**getBillOfLadingLinesCountAsync**](BillsOfLadingApi.md#getBillOfLadingLinesCountAsync) | **GET** /api/v2/ShipmentsService/BillsOfLading/{billOfLadingId}/Lines/Count | Get bill of lading lines count |
| [**getBillsOfLadingAsync**](BillsOfLadingApi.md#getBillsOfLadingAsync) | **GET** /api/v2/ShipmentsService/BillsOfLading | Get all bills of lading |
| [**getBillsOfLadingCountAsync**](BillsOfLadingApi.md#getBillsOfLadingCountAsync) | **GET** /api/v2/ShipmentsService/BillsOfLading/Count | Get bills of lading count |
| [**updateBillOfLadingAsync**](BillsOfLadingApi.md#updateBillOfLadingAsync) | **PUT** /api/v2/ShipmentsService/BillsOfLading/{billOfLadingId} | Update a bill of lading |
| [**updateBillOfLadingLineAsync**](BillsOfLadingApi.md#updateBillOfLadingLineAsync) | **PUT** /api/v2/ShipmentsService/BillsOfLading/{billOfLadingId}/Lines/{lineId} | Update a bill of lading line |


<a id="createBillOfLadingAsync"></a>
# **createBillOfLadingAsync**
> EmptyEnvelope createBillOfLadingAsync(tenantId, apiVersion, xApiVersion, billOfLadingCreateDto)

Create a bill of lading

Creates a new bill of lading for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BillsOfLadingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BillsOfLadingApi apiInstance = new BillsOfLadingApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    BillOfLadingCreateDto billOfLadingCreateDto = new BillOfLadingCreateDto(); // BillOfLadingCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createBillOfLadingAsync(tenantId, apiVersion, xApiVersion, billOfLadingCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillsOfLadingApi#createBillOfLadingAsync");
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
| **billOfLadingCreateDto** | [**BillOfLadingCreateDto**](BillOfLadingCreateDto.md)|  | [optional] |

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

<a id="createBillOfLadingLineAsync"></a>
# **createBillOfLadingLineAsync**
> EmptyEnvelope createBillOfLadingLineAsync(tenantId, billOfLadingId, apiVersion, xApiVersion, billOfLadingLineCreateDto)

Create a bill of lading line

Creates a new line for a bill of lading.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BillsOfLadingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BillsOfLadingApi apiInstance = new BillsOfLadingApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID billOfLadingId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    BillOfLadingLineCreateDto billOfLadingLineCreateDto = new BillOfLadingLineCreateDto(); // BillOfLadingLineCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createBillOfLadingLineAsync(tenantId, billOfLadingId, apiVersion, xApiVersion, billOfLadingLineCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillsOfLadingApi#createBillOfLadingLineAsync");
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
| **billOfLadingId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **billOfLadingLineCreateDto** | [**BillOfLadingLineCreateDto**](BillOfLadingLineCreateDto.md)|  | [optional] |

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

<a id="deleteBillOfLadingAsync"></a>
# **deleteBillOfLadingAsync**
> EmptyEnvelope deleteBillOfLadingAsync(tenantId, billOfLadingId, apiVersion, xApiVersion)

Delete a bill of lading

Deletes a bill of lading.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BillsOfLadingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BillsOfLadingApi apiInstance = new BillsOfLadingApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID billOfLadingId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteBillOfLadingAsync(tenantId, billOfLadingId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillsOfLadingApi#deleteBillOfLadingAsync");
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
| **billOfLadingId** | **UUID**|  | |
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

<a id="deleteBillOfLadingLineAsync"></a>
# **deleteBillOfLadingLineAsync**
> EmptyEnvelope deleteBillOfLadingLineAsync(tenantId, billOfLadingId, lineId, apiVersion, xApiVersion)

Delete a bill of lading line

Deletes a line from a bill of lading.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BillsOfLadingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BillsOfLadingApi apiInstance = new BillsOfLadingApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID billOfLadingId = UUID.randomUUID(); // UUID | 
    UUID lineId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteBillOfLadingLineAsync(tenantId, billOfLadingId, lineId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillsOfLadingApi#deleteBillOfLadingLineAsync");
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
| **billOfLadingId** | **UUID**|  | |
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

<a id="getBillOfLadingByIdAsync"></a>
# **getBillOfLadingByIdAsync**
> BillOfLadingDtoEnvelope getBillOfLadingByIdAsync(tenantId, billOfLadingId, apiVersion, xApiVersion)

Get bill of lading by ID

Retrieves a specific bill of lading by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BillsOfLadingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BillsOfLadingApi apiInstance = new BillsOfLadingApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID billOfLadingId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      BillOfLadingDtoEnvelope result = apiInstance.getBillOfLadingByIdAsync(tenantId, billOfLadingId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillsOfLadingApi#getBillOfLadingByIdAsync");
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
| **billOfLadingId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**BillOfLadingDtoEnvelope**](BillOfLadingDtoEnvelope.md)

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

<a id="getBillOfLadingLineByIdAsync"></a>
# **getBillOfLadingLineByIdAsync**
> BillOfLadingLineDtoEnvelope getBillOfLadingLineByIdAsync(tenantId, billOfLadingId, lineId, apiVersion, xApiVersion)

Get bill of lading line by ID

Retrieves a specific line from a bill of lading.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BillsOfLadingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BillsOfLadingApi apiInstance = new BillsOfLadingApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID billOfLadingId = UUID.randomUUID(); // UUID | 
    UUID lineId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      BillOfLadingLineDtoEnvelope result = apiInstance.getBillOfLadingLineByIdAsync(tenantId, billOfLadingId, lineId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillsOfLadingApi#getBillOfLadingLineByIdAsync");
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
| **billOfLadingId** | **UUID**|  | |
| **lineId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**BillOfLadingLineDtoEnvelope**](BillOfLadingLineDtoEnvelope.md)

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

<a id="getBillOfLadingLinesAsync"></a>
# **getBillOfLadingLinesAsync**
> BillOfLadingLineDtoListEnvelope getBillOfLadingLinesAsync(tenantId, billOfLadingId, apiVersion, xApiVersion)

Get bill of lading lines

Retrieves all lines for a specific bill of lading.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BillsOfLadingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BillsOfLadingApi apiInstance = new BillsOfLadingApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID billOfLadingId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      BillOfLadingLineDtoListEnvelope result = apiInstance.getBillOfLadingLinesAsync(tenantId, billOfLadingId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillsOfLadingApi#getBillOfLadingLinesAsync");
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
| **billOfLadingId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**BillOfLadingLineDtoListEnvelope**](BillOfLadingLineDtoListEnvelope.md)

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

<a id="getBillOfLadingLinesCountAsync"></a>
# **getBillOfLadingLinesCountAsync**
> Int32Envelope getBillOfLadingLinesCountAsync(tenantId, billOfLadingId, apiVersion, xApiVersion)

Get bill of lading lines count

Returns the count of lines for a specific bill of lading.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BillsOfLadingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BillsOfLadingApi apiInstance = new BillsOfLadingApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID billOfLadingId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getBillOfLadingLinesCountAsync(tenantId, billOfLadingId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillsOfLadingApi#getBillOfLadingLinesCountAsync");
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
| **billOfLadingId** | **UUID**|  | |
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

<a id="getBillsOfLadingAsync"></a>
# **getBillsOfLadingAsync**
> BillOfLadingDtoListEnvelope getBillsOfLadingAsync(tenantId, apiVersion, xApiVersion)

Get all bills of lading

Retrieves all bills of lading for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BillsOfLadingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BillsOfLadingApi apiInstance = new BillsOfLadingApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      BillOfLadingDtoListEnvelope result = apiInstance.getBillsOfLadingAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillsOfLadingApi#getBillsOfLadingAsync");
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

[**BillOfLadingDtoListEnvelope**](BillOfLadingDtoListEnvelope.md)

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

<a id="getBillsOfLadingCountAsync"></a>
# **getBillsOfLadingCountAsync**
> Int32Envelope getBillsOfLadingCountAsync(tenantId, apiVersion, xApiVersion)

Get bills of lading count

Returns the count of bills of lading for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BillsOfLadingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BillsOfLadingApi apiInstance = new BillsOfLadingApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getBillsOfLadingCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillsOfLadingApi#getBillsOfLadingCountAsync");
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

<a id="updateBillOfLadingAsync"></a>
# **updateBillOfLadingAsync**
> EmptyEnvelope updateBillOfLadingAsync(tenantId, billOfLadingId, apiVersion, xApiVersion, billOfLadingUpdateDto)

Update a bill of lading

Updates an existing bill of lading.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BillsOfLadingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BillsOfLadingApi apiInstance = new BillsOfLadingApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID billOfLadingId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    BillOfLadingUpdateDto billOfLadingUpdateDto = new BillOfLadingUpdateDto(); // BillOfLadingUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateBillOfLadingAsync(tenantId, billOfLadingId, apiVersion, xApiVersion, billOfLadingUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillsOfLadingApi#updateBillOfLadingAsync");
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
| **billOfLadingId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **billOfLadingUpdateDto** | [**BillOfLadingUpdateDto**](BillOfLadingUpdateDto.md)|  | [optional] |

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

<a id="updateBillOfLadingLineAsync"></a>
# **updateBillOfLadingLineAsync**
> EmptyEnvelope updateBillOfLadingLineAsync(tenantId, billOfLadingId, lineId, apiVersion, xApiVersion, billOfLadingLineUpdateDto)

Update a bill of lading line

Updates an existing line on a bill of lading.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BillsOfLadingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BillsOfLadingApi apiInstance = new BillsOfLadingApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID billOfLadingId = UUID.randomUUID(); // UUID | 
    UUID lineId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    BillOfLadingLineUpdateDto billOfLadingLineUpdateDto = new BillOfLadingLineUpdateDto(); // BillOfLadingLineUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateBillOfLadingLineAsync(tenantId, billOfLadingId, lineId, apiVersion, xApiVersion, billOfLadingLineUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillsOfLadingApi#updateBillOfLadingLineAsync");
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
| **billOfLadingId** | **UUID**|  | |
| **lineId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **billOfLadingLineUpdateDto** | [**BillOfLadingLineUpdateDto**](BillOfLadingLineUpdateDto.md)|  | [optional] |

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

