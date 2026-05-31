# BillableLineTaxesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBillableLineTax**](BillableLineTaxesApi.md#createBillableLineTax) | **POST** /api/v2/AccountingService/BillableLines/{billableLineId}/Taxes | Create a new tax for a billable line. |
| [**deleteBillableLineTax**](BillableLineTaxesApi.md#deleteBillableLineTax) | **DELETE** /api/v2/AccountingService/BillableLines/{billableLineId}/Taxes/{taxId} | Delete a tax from a billable line. |
| [**getBillableLineTaxes**](BillableLineTaxesApi.md#getBillableLineTaxes) | **GET** /api/v2/AccountingService/BillableLines/{billableLineId}/Taxes | Get taxes for a billable line. |
| [**getBillableLineTaxesCount**](BillableLineTaxesApi.md#getBillableLineTaxesCount) | **GET** /api/v2/AccountingService/BillableLines/{billableLineId}/Taxes/Count | Get the count of taxes for a billable line. |
| [**updateBillableLineTax**](BillableLineTaxesApi.md#updateBillableLineTax) | **PUT** /api/v2/AccountingService/BillableLines/{billableLineId}/Taxes/{taxId} | Update a tax for a billable line. |


<a id="createBillableLineTax"></a>
# **createBillableLineTax**
> EmptyEnvelope createBillableLineTax(tenantId, billableLineId, apiVersion, xApiVersion, appliedItemTaxRecordCreateDto)

Create a new tax for a billable line.

Creates a new tax entry for the specified billable line.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BillableLineTaxesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BillableLineTaxesApi apiInstance = new BillableLineTaxesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID billableLineId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    AppliedItemTaxRecordCreateDto appliedItemTaxRecordCreateDto = new AppliedItemTaxRecordCreateDto(); // AppliedItemTaxRecordCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createBillableLineTax(tenantId, billableLineId, apiVersion, xApiVersion, appliedItemTaxRecordCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillableLineTaxesApi#createBillableLineTax");
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
| **billableLineId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **appliedItemTaxRecordCreateDto** | [**AppliedItemTaxRecordCreateDto**](AppliedItemTaxRecordCreateDto.md)|  | [optional] |

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
| **200** | OK |  -  |

<a id="deleteBillableLineTax"></a>
# **deleteBillableLineTax**
> EmptyEnvelope deleteBillableLineTax(tenantId, billableLineId, taxId, apiVersion, xApiVersion)

Delete a tax from a billable line.

Deletes the specified tax entry from the billable line.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BillableLineTaxesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BillableLineTaxesApi apiInstance = new BillableLineTaxesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID billableLineId = UUID.randomUUID(); // UUID | 
    UUID taxId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteBillableLineTax(tenantId, billableLineId, taxId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillableLineTaxesApi#deleteBillableLineTax");
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
| **billableLineId** | **UUID**|  | |
| **taxId** | **UUID**|  | |
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
| **200** | OK |  -  |

<a id="getBillableLineTaxes"></a>
# **getBillableLineTaxes**
> AppliedItemTaxRecordDtoIReadOnlyListEnvelope getBillableLineTaxes(tenantId, billableLineId, apiVersion, xApiVersion)

Get taxes for a billable line.

Retrieves the taxes applied to the specified billable line.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BillableLineTaxesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BillableLineTaxesApi apiInstance = new BillableLineTaxesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID billableLineId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      AppliedItemTaxRecordDtoIReadOnlyListEnvelope result = apiInstance.getBillableLineTaxes(tenantId, billableLineId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillableLineTaxesApi#getBillableLineTaxes");
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
| **billableLineId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**AppliedItemTaxRecordDtoIReadOnlyListEnvelope**](AppliedItemTaxRecordDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getBillableLineTaxesCount"></a>
# **getBillableLineTaxesCount**
> Int32Envelope getBillableLineTaxesCount(tenantId, billableLineId, apiVersion, xApiVersion)

Get the count of taxes for a billable line.

Retrieves the total count of taxes applied to the specified billable line.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BillableLineTaxesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BillableLineTaxesApi apiInstance = new BillableLineTaxesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID billableLineId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getBillableLineTaxesCount(tenantId, billableLineId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillableLineTaxesApi#getBillableLineTaxesCount");
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
| **billableLineId** | **UUID**|  | |
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

<a id="updateBillableLineTax"></a>
# **updateBillableLineTax**
> EmptyEnvelope updateBillableLineTax(tenantId, billableLineId, taxId, apiVersion, xApiVersion, appliedItemTaxRecordUpdateDto)

Update a tax for a billable line.

Updates the specified tax entry for the billable line.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BillableLineTaxesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BillableLineTaxesApi apiInstance = new BillableLineTaxesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID billableLineId = UUID.randomUUID(); // UUID | 
    UUID taxId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    AppliedItemTaxRecordUpdateDto appliedItemTaxRecordUpdateDto = new AppliedItemTaxRecordUpdateDto(); // AppliedItemTaxRecordUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateBillableLineTax(tenantId, billableLineId, taxId, apiVersion, xApiVersion, appliedItemTaxRecordUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillableLineTaxesApi#updateBillableLineTax");
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
| **billableLineId** | **UUID**|  | |
| **taxId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **appliedItemTaxRecordUpdateDto** | [**AppliedItemTaxRecordUpdateDto**](AppliedItemTaxRecordUpdateDto.md)|  | [optional] |

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
| **200** | OK |  -  |

