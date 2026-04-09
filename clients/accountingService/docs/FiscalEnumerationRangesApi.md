# FiscalEnumerationRangesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createInvoiceEnumerationRange**](FiscalEnumerationRangesApi.md#createInvoiceEnumerationRange) | **POST** /api/v2/AccountingService/Fiscals/Authorities/EnumerationRanges | Create an invoice enumeration range |
| [**deleteInvoiceEnumerationRange**](FiscalEnumerationRangesApi.md#deleteInvoiceEnumerationRange) | **DELETE** /api/v2/AccountingService/Fiscals/Authorities/EnumerationRanges/{enumerationRangeId} | Delete an invoice enumeration range |
| [**getInvoiceEnumerationRange**](FiscalEnumerationRangesApi.md#getInvoiceEnumerationRange) | **GET** /api/v2/AccountingService/Fiscals/Authorities/{fiscalAuthorityId}/EnumerationRanges/{enumerationRangeId} | Get invoice enumeration range by ID |
| [**getInvoiceEnumerationRanges**](FiscalEnumerationRangesApi.md#getInvoiceEnumerationRanges) | **GET** /api/v2/AccountingService/Fiscals/Authorities/{authorityId}/EnumerationRanges | Get invoice enumeration ranges for an authority |
| [**getInvoiceEnumerationRangesCount**](FiscalEnumerationRangesApi.md#getInvoiceEnumerationRangesCount) | **GET** /api/v2/AccountingService/Fiscals/Authorities/{fiscalAuthorityId}/EnumerationRanges/Count | Get invoice enumeration ranges count |
| [**updateInvoiceEnumerationRange**](FiscalEnumerationRangesApi.md#updateInvoiceEnumerationRange) | **PUT** /api/v2/AccountingService/Fiscals/Authorities/EnumerationRanges/{enumerationRangeId} | Update an invoice enumeration range |


<a id="createInvoiceEnumerationRange"></a>
# **createInvoiceEnumerationRange**
> EmptyEnvelope createInvoiceEnumerationRange(tenantId, apiVersion, xApiVersion, invoiceEnumerationRangeCreateDto)

Create an invoice enumeration range

Creates a new invoice enumeration range for a fiscal authority.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalEnumerationRangesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FiscalEnumerationRangesApi apiInstance = new FiscalEnumerationRangesApi(defaultClient);
    Object tenantId = null; // Object | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    InvoiceEnumerationRangeCreateDto invoiceEnumerationRangeCreateDto = new InvoiceEnumerationRangeCreateDto(); // InvoiceEnumerationRangeCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createInvoiceEnumerationRange(tenantId, apiVersion, xApiVersion, invoiceEnumerationRangeCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalEnumerationRangesApi#createInvoiceEnumerationRange");
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
| **tenantId** | [**Object**](.md)|  | |
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
| **201** | Created |  -  |

<a id="deleteInvoiceEnumerationRange"></a>
# **deleteInvoiceEnumerationRange**
> EmptyEnvelope deleteInvoiceEnumerationRange(tenantId, enumerationRangeId, apiVersion, xApiVersion)

Delete an invoice enumeration range

Deletes an invoice enumeration range identified by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalEnumerationRangesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FiscalEnumerationRangesApi apiInstance = new FiscalEnumerationRangesApi(defaultClient);
    Object tenantId = null; // Object | 
    UUID enumerationRangeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteInvoiceEnumerationRange(tenantId, enumerationRangeId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalEnumerationRangesApi#deleteInvoiceEnumerationRange");
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
| **tenantId** | [**Object**](.md)|  | |
| **enumerationRangeId** | **UUID**|  | |
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
| **204** | No Content |  -  |

<a id="getInvoiceEnumerationRange"></a>
# **getInvoiceEnumerationRange**
> InvoiceEnumerationRangeDtoEnvelope getInvoiceEnumerationRange(tenantId, fiscalAuthorityId, enumerationRangeId, apiVersion, xApiVersion)

Get invoice enumeration range by ID

Retrieves a specific invoice enumeration range by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalEnumerationRangesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FiscalEnumerationRangesApi apiInstance = new FiscalEnumerationRangesApi(defaultClient);
    Object tenantId = null; // Object | 
    UUID fiscalAuthorityId = UUID.randomUUID(); // UUID | 
    UUID enumerationRangeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      InvoiceEnumerationRangeDtoEnvelope result = apiInstance.getInvoiceEnumerationRange(tenantId, fiscalAuthorityId, enumerationRangeId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalEnumerationRangesApi#getInvoiceEnumerationRange");
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
| **tenantId** | [**Object**](.md)|  | |
| **fiscalAuthorityId** | **UUID**|  | |
| **enumerationRangeId** | **UUID**|  | |
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
| **200** | OK |  -  |

<a id="getInvoiceEnumerationRanges"></a>
# **getInvoiceEnumerationRanges**
> InvoiceEnumerationRangeDtoListEnvelope getInvoiceEnumerationRanges(fiscalAuthorityId, authorityId, apiVersion, xApiVersion)

Get invoice enumeration ranges for an authority

Retrieves all invoice enumeration ranges for the specified fiscal authority.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalEnumerationRangesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FiscalEnumerationRangesApi apiInstance = new FiscalEnumerationRangesApi(defaultClient);
    UUID fiscalAuthorityId = UUID.randomUUID(); // UUID | 
    String authorityId = "authorityId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      InvoiceEnumerationRangeDtoListEnvelope result = apiInstance.getInvoiceEnumerationRanges(fiscalAuthorityId, authorityId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalEnumerationRangesApi#getInvoiceEnumerationRanges");
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
| **fiscalAuthorityId** | **UUID**|  | |
| **authorityId** | **String**|  | |
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
| **200** | OK |  -  |

<a id="getInvoiceEnumerationRangesCount"></a>
# **getInvoiceEnumerationRangesCount**
> Int32Envelope getInvoiceEnumerationRangesCount(fiscalAuthorityId, apiVersion, xApiVersion)

Get invoice enumeration ranges count

Returns the total count of invoice enumeration ranges for the specified fiscal authority.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalEnumerationRangesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FiscalEnumerationRangesApi apiInstance = new FiscalEnumerationRangesApi(defaultClient);
    UUID fiscalAuthorityId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getInvoiceEnumerationRangesCount(fiscalAuthorityId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalEnumerationRangesApi#getInvoiceEnumerationRangesCount");
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
| **fiscalAuthorityId** | **UUID**|  | |
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

<a id="updateInvoiceEnumerationRange"></a>
# **updateInvoiceEnumerationRange**
> EmptyEnvelope updateInvoiceEnumerationRange(tenantId, enumerationRangeId, apiVersion, xApiVersion, invoiceEnumerationRangeUpdateDto)

Update an invoice enumeration range

Updates an existing invoice enumeration range identified by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalEnumerationRangesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FiscalEnumerationRangesApi apiInstance = new FiscalEnumerationRangesApi(defaultClient);
    Object tenantId = null; // Object | 
    UUID enumerationRangeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    InvoiceEnumerationRangeUpdateDto invoiceEnumerationRangeUpdateDto = new InvoiceEnumerationRangeUpdateDto(); // InvoiceEnumerationRangeUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateInvoiceEnumerationRange(tenantId, enumerationRangeId, apiVersion, xApiVersion, invoiceEnumerationRangeUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalEnumerationRangesApi#updateInvoiceEnumerationRange");
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
| **tenantId** | [**Object**](.md)|  | |
| **enumerationRangeId** | **UUID**|  | |
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
| **200** | OK |  -  |

