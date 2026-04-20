# InvoiceEnumerationRangesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createInvoiceEnumerationRangeAsync**](InvoiceEnumerationRangesApi.md#createInvoiceEnumerationRangeAsync) | **POST** /api/v2/AccountingService/InvoiceEnumerationRanges | Create a new invoice enumeration range |
| [**deleteInvoiceEnumerationRangeAsync**](InvoiceEnumerationRangesApi.md#deleteInvoiceEnumerationRangeAsync) | **DELETE** /api/v2/AccountingService/InvoiceEnumerationRanges/{rangeId} | Delete an invoice enumeration range |
| [**getInvoiceEnumerationRangeDetailsAsync**](InvoiceEnumerationRangesApi.md#getInvoiceEnumerationRangeDetailsAsync) | **GET** /api/v2/AccountingService/InvoiceEnumerationRanges/{rangeId} | Get invoice enumeration range by ID |
| [**getInvoiceEnumerationRangesAsync**](InvoiceEnumerationRangesApi.md#getInvoiceEnumerationRangesAsync) | **GET** /api/v2/AccountingService/InvoiceEnumerationRanges | Get all invoice enumeration ranges |
| [**updateInvoiceEnumerationRangeAsync**](InvoiceEnumerationRangesApi.md#updateInvoiceEnumerationRangeAsync) | **PUT** /api/v2/AccountingService/InvoiceEnumerationRanges/{rangeId} | Update an invoice enumeration range |


<a id="createInvoiceEnumerationRangeAsync"></a>
# **createInvoiceEnumerationRangeAsync**
> EmptyEnvelope createInvoiceEnumerationRangeAsync(tenantId, apiVersion, xApiVersion, invoiceEnumerationRangeCreateDto)

Create a new invoice enumeration range

Creates a new invoice enumeration range for the tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoiceEnumerationRangesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoiceEnumerationRangesApi apiInstance = new InvoiceEnumerationRangesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    InvoiceEnumerationRangeCreateDto invoiceEnumerationRangeCreateDto = new InvoiceEnumerationRangeCreateDto(); // InvoiceEnumerationRangeCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createInvoiceEnumerationRangeAsync(tenantId, apiVersion, xApiVersion, invoiceEnumerationRangeCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoiceEnumerationRangesApi#createInvoiceEnumerationRangeAsync");
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
| **invoiceEnumerationRangeCreateDto** | [**InvoiceEnumerationRangeCreateDto**](InvoiceEnumerationRangeCreateDto.md)|  | [optional] |

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
| **201** | Created |  -  |

<a id="deleteInvoiceEnumerationRangeAsync"></a>
# **deleteInvoiceEnumerationRangeAsync**
> EmptyEnvelope deleteInvoiceEnumerationRangeAsync(tenantId, rangeId, apiVersion, xApiVersion)

Delete an invoice enumeration range

Deletes an invoice enumeration range by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoiceEnumerationRangesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoiceEnumerationRangesApi apiInstance = new InvoiceEnumerationRangesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID rangeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteInvoiceEnumerationRangeAsync(tenantId, rangeId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoiceEnumerationRangesApi#deleteInvoiceEnumerationRangeAsync");
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
| **rangeId** | **UUID**|  | |
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

<a id="getInvoiceEnumerationRangeDetailsAsync"></a>
# **getInvoiceEnumerationRangeDetailsAsync**
> InvoiceEnumerationRangeDtoEnvelope getInvoiceEnumerationRangeDetailsAsync(tenantId, rangeId, apiVersion, xApiVersion)

Get invoice enumeration range by ID

Retrieves the details of a specific invoice enumeration range.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoiceEnumerationRangesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoiceEnumerationRangesApi apiInstance = new InvoiceEnumerationRangesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID rangeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      InvoiceEnumerationRangeDtoEnvelope result = apiInstance.getInvoiceEnumerationRangeDetailsAsync(tenantId, rangeId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoiceEnumerationRangesApi#getInvoiceEnumerationRangeDetailsAsync");
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
| **rangeId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**InvoiceEnumerationRangeDtoEnvelope**](InvoiceEnumerationRangeDtoEnvelope.md)

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

<a id="getInvoiceEnumerationRangesAsync"></a>
# **getInvoiceEnumerationRangesAsync**
> InvoiceEnumerationRangeDtoListEnvelope getInvoiceEnumerationRangesAsync(tenantId, apiVersion, xApiVersion)

Get all invoice enumeration ranges

Retrieves all invoice enumeration ranges for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoiceEnumerationRangesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoiceEnumerationRangesApi apiInstance = new InvoiceEnumerationRangesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      InvoiceEnumerationRangeDtoListEnvelope result = apiInstance.getInvoiceEnumerationRangesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoiceEnumerationRangesApi#getInvoiceEnumerationRangesAsync");
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

[**InvoiceEnumerationRangeDtoListEnvelope**](InvoiceEnumerationRangeDtoListEnvelope.md)

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

<a id="updateInvoiceEnumerationRangeAsync"></a>
# **updateInvoiceEnumerationRangeAsync**
> EmptyEnvelope updateInvoiceEnumerationRangeAsync(tenantId, rangeId, apiVersion, xApiVersion, invoiceEnumerationRangeUpdateDto)

Update an invoice enumeration range

Updates an existing invoice enumeration range with the provided data.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoiceEnumerationRangesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoiceEnumerationRangesApi apiInstance = new InvoiceEnumerationRangesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID rangeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    InvoiceEnumerationRangeUpdateDto invoiceEnumerationRangeUpdateDto = new InvoiceEnumerationRangeUpdateDto(); // InvoiceEnumerationRangeUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateInvoiceEnumerationRangeAsync(tenantId, rangeId, apiVersion, xApiVersion, invoiceEnumerationRangeUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoiceEnumerationRangesApi#updateInvoiceEnumerationRangeAsync");
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
| **rangeId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **invoiceEnumerationRangeUpdateDto** | [**InvoiceEnumerationRangeUpdateDto**](InvoiceEnumerationRangeUpdateDto.md)|  | [optional] |

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

