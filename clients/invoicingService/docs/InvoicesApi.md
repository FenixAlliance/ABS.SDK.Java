# InvoicesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**aggregateInvoiceDiscounts**](InvoicesApi.md#aggregateInvoiceDiscounts) | **POST** /api/v2/InvoicingService/Invoices/DiscountsAggregate | Aggregate invoice discounts. |
| [**aggregateInvoiceGlobalSurcharges**](InvoicesApi.md#aggregateInvoiceGlobalSurcharges) | **POST** /api/v2/InvoicingService/Invoices/GlobalSurchargesAggregate | Aggregate invoice global surcharges. |
| [**aggregateInvoiceTaxBases**](InvoicesApi.md#aggregateInvoiceTaxBases) | **POST** /api/v2/InvoicingService/Invoices/TaxBasesAggregate | Aggregate invoice tax bases. |
| [**aggregateInvoiceTaxes**](InvoicesApi.md#aggregateInvoiceTaxes) | **POST** /api/v2/InvoicingService/Invoices/TaxesAggregate | Aggregate invoice taxes. |
| [**aggregateInvoiceTotals**](InvoicesApi.md#aggregateInvoiceTotals) | **POST** /api/v2/InvoicingService/Invoices/TotalsAggregate | Aggregate invoice totals. |
| [**calculateInvoice**](InvoicesApi.md#calculateInvoice) | **PUT** /api/v2/InvoicingService/Invoices/{invoiceId}/Calculate | Calculate an invoice. |
| [**calculateInvoiceLine**](InvoicesApi.md#calculateInvoiceLine) | **PUT** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines/{invoiceLineId}/Calculate | Calculate an invoice line. |
| [**createInvoice**](InvoicesApi.md#createInvoice) | **POST** /api/v2/InvoicingService/Invoices | Create a new invoice. |
| [**createInvoiceAdjustment**](InvoicesApi.md#createInvoiceAdjustment) | **POST** /api/v2/InvoicingService/Invoices/{invoiceId}/Adjustments | Create a new invoice adjustment. |
| [**createInvoiceLine**](InvoicesApi.md#createInvoiceLine) | **POST** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines | Create a new invoice line. |
| [**createInvoiceLineTax**](InvoicesApi.md#createInvoiceLineTax) | **POST** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines/{invoiceLineId}/Taxes | Create a new tax for an invoice line. |
| [**createInvoiceReference**](InvoicesApi.md#createInvoiceReference) | **POST** /api/v2/InvoicingService/Invoices/{invoiceId}/References | Create a new invoice reference. |
| [**deleteInvoice**](InvoicesApi.md#deleteInvoice) | **DELETE** /api/v2/InvoicingService/Invoices/{invoiceId} | Delete an invoice. |
| [**deleteInvoiceAdjustment**](InvoicesApi.md#deleteInvoiceAdjustment) | **DELETE** /api/v2/InvoicingService/Invoices/{invoiceId}/Adjustments/{invoiceAdjustmentId} | Delete an invoice adjustment. |
| [**deleteInvoiceLine**](InvoicesApi.md#deleteInvoiceLine) | **DELETE** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines/{invoiceLineId} | Delete an invoice line. |
| [**deleteInvoiceLineTax**](InvoicesApi.md#deleteInvoiceLineTax) | **DELETE** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines/{invoiceLineId}/Taxes/{invoiceLineTaxId} | Delete a tax from an invoice line. |
| [**deleteInvoiceReference**](InvoicesApi.md#deleteInvoiceReference) | **DELETE** /api/v2/InvoicingService/Invoices/{invoiceId}/References/{invoiceReferenceId} | Delete an invoice reference. |
| [**getExtendedInvoice**](InvoicesApi.md#getExtendedInvoice) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/Extended | Get an extended invoice by ID. |
| [**getExtendedInvoices**](InvoicesApi.md#getExtendedInvoices) | **GET** /api/v2/InvoicingService/Invoices/Extended | Get a list of extended invoices. |
| [**getExtendedInvoicesCount**](InvoicesApi.md#getExtendedInvoicesCount) | **GET** /api/v2/InvoicingService/Invoices/Extended/Count | Get the count of extended invoices. |
| [**getInvoice**](InvoicesApi.md#getInvoice) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId} | Get an invoice by ID. |
| [**getInvoiceAdjustment**](InvoicesApi.md#getInvoiceAdjustment) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/Adjustments/{invoiceAdjustmentId} | Get an invoice adjustment by ID. |
| [**getInvoiceAdjustments**](InvoicesApi.md#getInvoiceAdjustments) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/Adjustments | Get invoice adjustments. |
| [**getInvoiceAdjustmentsCount**](InvoicesApi.md#getInvoiceAdjustmentsCount) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/Adjustments/Count | Get the count of invoice adjustments. |
| [**getInvoiceLine**](InvoicesApi.md#getInvoiceLine) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines/{invoiceLineId} | Get an invoice line by ID. |
| [**getInvoiceLineTaxes**](InvoicesApi.md#getInvoiceLineTaxes) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines/{invoiceLineId}/Taxes | Get taxes for an invoice line. |
| [**getInvoiceLineTaxesCount**](InvoicesApi.md#getInvoiceLineTaxesCount) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines/{invoiceLineId}/Taxes/Count | Get the count of taxes for an invoice line. |
| [**getInvoiceLines**](InvoicesApi.md#getInvoiceLines) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines | Get invoice lines. |
| [**getInvoiceLinesCount**](InvoicesApi.md#getInvoiceLinesCount) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines/Count | Get the count of invoice lines. |
| [**getInvoicePayments**](InvoicesApi.md#getInvoicePayments) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/Payments | Get payments for an invoice. |
| [**getInvoicePaymentsCount**](InvoicesApi.md#getInvoicePaymentsCount) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/Payments/Count | Get the count of payments for an invoice. |
| [**getInvoiceReference**](InvoicesApi.md#getInvoiceReference) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/References/{invoiceReferenceId} | Get an invoice reference by ID. |
| [**getInvoiceReferences**](InvoicesApi.md#getInvoiceReferences) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/References | Get invoice references. |
| [**getInvoiceReferencesCount**](InvoicesApi.md#getInvoiceReferencesCount) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/References/Count | Get the count of invoice references. |
| [**getInvoices**](InvoicesApi.md#getInvoices) | **GET** /api/v2/InvoicingService/Invoices | Get a list of invoices. |
| [**getInvoicesCount**](InvoicesApi.md#getInvoicesCount) | **GET** /api/v2/InvoicingService/Invoices/Count | Get the count of invoices. |
| [**previewInvoiceEmail**](InvoicesApi.md#previewInvoiceEmail) | **POST** /api/v2/InvoicingService/Invoices/{invoiceId}/Emails/Preview | Preview the rendered email for an invoice. |
| [**sendInvoiceEmail**](InvoicesApi.md#sendInvoiceEmail) | **POST** /api/v2/InvoicingService/Invoices/{invoiceId}/Emails/Send | Send an invoice transactional email to recipients. |
| [**updateInvoice**](InvoicesApi.md#updateInvoice) | **PUT** /api/v2/InvoicingService/Invoices/{invoiceId} | Update an invoice. |
| [**updateInvoiceAdjustment**](InvoicesApi.md#updateInvoiceAdjustment) | **PUT** /api/v2/InvoicingService/Invoices/{invoiceId}/Adjustments/{invoiceAdjustmentId} | Update an invoice adjustment. |
| [**updateInvoiceLine**](InvoicesApi.md#updateInvoiceLine) | **PUT** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines/{invoiceLineId} | Update an invoice line. |
| [**updateInvoiceLineTax**](InvoicesApi.md#updateInvoiceLineTax) | **PUT** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines/{invoiceLineId}/Taxes/{invoiceLineTaxId} | Update a tax for an invoice line. |
| [**updateInvoiceReference**](InvoicesApi.md#updateInvoiceReference) | **PUT** /api/v2/InvoicingService/Invoices/{invoiceId}/References/{invoiceReferenceId} | Update an invoice reference. |


<a id="aggregateInvoiceDiscounts"></a>
# **aggregateInvoiceDiscounts**
> MoneyEnvelope aggregateInvoiceDiscounts(UUID, currencyId)

Aggregate invoice discounts.

Aggregates the discounts for the specified invoices.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    List<UUID> UUID = Arrays.asList(); // List<UUID> | 
    String currencyId = "currencyId_example"; // String | 
    try {
      MoneyEnvelope result = apiInstance.aggregateInvoiceDiscounts(UUID, currencyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#aggregateInvoiceDiscounts");
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
| **UUID** | [**List&lt;UUID&gt;**](UUID.md)|  | |
| **currencyId** | **String**|  | [optional] |

### Return type

[**MoneyEnvelope**](MoneyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="aggregateInvoiceGlobalSurcharges"></a>
# **aggregateInvoiceGlobalSurcharges**
> MoneyEnvelope aggregateInvoiceGlobalSurcharges(UUID, currencyId)

Aggregate invoice global surcharges.

Aggregates the global surcharges for the specified invoices.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    List<UUID> UUID = Arrays.asList(); // List<UUID> | 
    String currencyId = "currencyId_example"; // String | 
    try {
      MoneyEnvelope result = apiInstance.aggregateInvoiceGlobalSurcharges(UUID, currencyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#aggregateInvoiceGlobalSurcharges");
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
| **UUID** | [**List&lt;UUID&gt;**](UUID.md)|  | |
| **currencyId** | **String**|  | [optional] |

### Return type

[**MoneyEnvelope**](MoneyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="aggregateInvoiceTaxBases"></a>
# **aggregateInvoiceTaxBases**
> MoneyEnvelope aggregateInvoiceTaxBases(UUID, currencyId)

Aggregate invoice tax bases.

Aggregates the tax bases for the specified invoices.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    List<UUID> UUID = Arrays.asList(); // List<UUID> | 
    String currencyId = "currencyId_example"; // String | 
    try {
      MoneyEnvelope result = apiInstance.aggregateInvoiceTaxBases(UUID, currencyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#aggregateInvoiceTaxBases");
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
| **UUID** | [**List&lt;UUID&gt;**](UUID.md)|  | |
| **currencyId** | **String**|  | [optional] |

### Return type

[**MoneyEnvelope**](MoneyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="aggregateInvoiceTaxes"></a>
# **aggregateInvoiceTaxes**
> MoneyEnvelope aggregateInvoiceTaxes(UUID, currencyId)

Aggregate invoice taxes.

Aggregates the taxes for the specified invoices.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    List<UUID> UUID = Arrays.asList(); // List<UUID> | 
    String currencyId = "currencyId_example"; // String | 
    try {
      MoneyEnvelope result = apiInstance.aggregateInvoiceTaxes(UUID, currencyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#aggregateInvoiceTaxes");
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
| **UUID** | [**List&lt;UUID&gt;**](UUID.md)|  | |
| **currencyId** | **String**|  | [optional] |

### Return type

[**MoneyEnvelope**](MoneyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="aggregateInvoiceTotals"></a>
# **aggregateInvoiceTotals**
> MoneyEnvelope aggregateInvoiceTotals(UUID, currencyId)

Aggregate invoice totals.

Aggregates the totals for the specified invoices.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    List<UUID> UUID = Arrays.asList(); // List<UUID> | 
    String currencyId = "currencyId_example"; // String | 
    try {
      MoneyEnvelope result = apiInstance.aggregateInvoiceTotals(UUID, currencyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#aggregateInvoiceTotals");
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
| **UUID** | [**List&lt;UUID&gt;**](UUID.md)|  | |
| **currencyId** | **String**|  | [optional] |

### Return type

[**MoneyEnvelope**](MoneyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="calculateInvoice"></a>
# **calculateInvoice**
> EmptyEnvelope calculateInvoice(tenantId, invoiceId)

Calculate an invoice.

Calculates the totals and taxes for the specified invoice.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.calculateInvoice(tenantId, invoiceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#calculateInvoice");
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
| **invoiceId** | **UUID**|  | |

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

<a id="calculateInvoiceLine"></a>
# **calculateInvoiceLine**
> EmptyEnvelope calculateInvoiceLine(tenantId, invoiceId, invoiceLineId)

Calculate an invoice line.

Calculates the totals and taxes for the specified invoice line.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    UUID invoiceLineId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.calculateInvoiceLine(tenantId, invoiceId, invoiceLineId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#calculateInvoiceLine");
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
| **invoiceId** | **UUID**|  | |
| **invoiceLineId** | **UUID**|  | |

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

<a id="createInvoice"></a>
# **createInvoice**
> EmptyEnvelope createInvoice(tenantId, invoiceCreateDto)

Create a new invoice.

Creates a new invoice for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    InvoiceCreateDto invoiceCreateDto = new InvoiceCreateDto(); // InvoiceCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createInvoice(tenantId, invoiceCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#createInvoice");
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
| **invoiceCreateDto** | [**InvoiceCreateDto**](InvoiceCreateDto.md)|  | [optional] |

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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="createInvoiceAdjustment"></a>
# **createInvoiceAdjustment**
> EmptyEnvelope createInvoiceAdjustment(tenantId, invoiceId, invoiceAdjustmentCreateDto)

Create a new invoice adjustment.

Creates a new adjustment for the specified invoice.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    InvoiceAdjustmentCreateDto invoiceAdjustmentCreateDto = new InvoiceAdjustmentCreateDto(); // InvoiceAdjustmentCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createInvoiceAdjustment(tenantId, invoiceId, invoiceAdjustmentCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#createInvoiceAdjustment");
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
| **invoiceId** | **UUID**|  | |
| **invoiceAdjustmentCreateDto** | [**InvoiceAdjustmentCreateDto**](InvoiceAdjustmentCreateDto.md)|  | [optional] |

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

<a id="createInvoiceLine"></a>
# **createInvoiceLine**
> InvoiceLineDtoIReadOnlyListEnvelope createInvoiceLine(tenantId, invoiceId, invoiceLineCreateDto)

Create a new invoice line.

Creates a new invoice line for the specified invoice.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    InvoiceLineCreateDto invoiceLineCreateDto = new InvoiceLineCreateDto(); // InvoiceLineCreateDto | 
    try {
      InvoiceLineDtoIReadOnlyListEnvelope result = apiInstance.createInvoiceLine(tenantId, invoiceId, invoiceLineCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#createInvoiceLine");
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
| **invoiceId** | **UUID**|  | |
| **invoiceLineCreateDto** | [**InvoiceLineCreateDto**](InvoiceLineCreateDto.md)|  | [optional] |

### Return type

[**InvoiceLineDtoIReadOnlyListEnvelope**](InvoiceLineDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createInvoiceLineTax"></a>
# **createInvoiceLineTax**
> EmptyEnvelope createInvoiceLineTax(tenantId, invoiceId, invoiceLineId, invoiceLineAppliedTaxCreateDto)

Create a new tax for an invoice line.

Creates a new tax entry for the specified invoice line.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    UUID invoiceLineId = UUID.randomUUID(); // UUID | 
    InvoiceLineAppliedTaxCreateDto invoiceLineAppliedTaxCreateDto = new InvoiceLineAppliedTaxCreateDto(); // InvoiceLineAppliedTaxCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createInvoiceLineTax(tenantId, invoiceId, invoiceLineId, invoiceLineAppliedTaxCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#createInvoiceLineTax");
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
| **invoiceId** | **UUID**|  | |
| **invoiceLineId** | **UUID**|  | |
| **invoiceLineAppliedTaxCreateDto** | [**InvoiceLineAppliedTaxCreateDto**](InvoiceLineAppliedTaxCreateDto.md)|  | [optional] |

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

<a id="createInvoiceReference"></a>
# **createInvoiceReference**
> EmptyEnvelope createInvoiceReference(tenantId, invoiceId, invoiceReferenceCreateDto)

Create a new invoice reference.

Creates a new reference for the specified invoice.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    InvoiceReferenceCreateDto invoiceReferenceCreateDto = new InvoiceReferenceCreateDto(); // InvoiceReferenceCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createInvoiceReference(tenantId, invoiceId, invoiceReferenceCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#createInvoiceReference");
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
| **invoiceId** | **UUID**|  | |
| **invoiceReferenceCreateDto** | [**InvoiceReferenceCreateDto**](InvoiceReferenceCreateDto.md)|  | [optional] |

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

<a id="deleteInvoice"></a>
# **deleteInvoice**
> EmptyEnvelope deleteInvoice(tenantId, invoiceId)

Delete an invoice.

Deletes the specified invoice for the tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.deleteInvoice(tenantId, invoiceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#deleteInvoice");
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
| **invoiceId** | **UUID**|  | |

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

<a id="deleteInvoiceAdjustment"></a>
# **deleteInvoiceAdjustment**
> EmptyEnvelope deleteInvoiceAdjustment(tenantId, invoiceId, invoiceAdjustmentId)

Delete an invoice adjustment.

Deletes the specified adjustment from the invoice.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    UUID invoiceAdjustmentId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.deleteInvoiceAdjustment(tenantId, invoiceId, invoiceAdjustmentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#deleteInvoiceAdjustment");
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
| **invoiceId** | **UUID**|  | |
| **invoiceAdjustmentId** | **UUID**|  | |

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

<a id="deleteInvoiceLine"></a>
# **deleteInvoiceLine**
> EmptyEnvelope deleteInvoiceLine(tenantId, invoiceId, invoiceLineId)

Delete an invoice line.

Deletes the specified invoice line.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    UUID invoiceLineId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.deleteInvoiceLine(tenantId, invoiceId, invoiceLineId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#deleteInvoiceLine");
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
| **invoiceId** | **UUID**|  | |
| **invoiceLineId** | **UUID**|  | |

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

<a id="deleteInvoiceLineTax"></a>
# **deleteInvoiceLineTax**
> EmptyEnvelope deleteInvoiceLineTax(tenantId, invoiceId, invoiceLineId, invoiceLineTaxId)

Delete a tax from an invoice line.

Deletes the specified tax entry from the invoice line.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    UUID invoiceLineId = UUID.randomUUID(); // UUID | 
    UUID invoiceLineTaxId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.deleteInvoiceLineTax(tenantId, invoiceId, invoiceLineId, invoiceLineTaxId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#deleteInvoiceLineTax");
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
| **invoiceId** | **UUID**|  | |
| **invoiceLineId** | **UUID**|  | |
| **invoiceLineTaxId** | **UUID**|  | |

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

<a id="deleteInvoiceReference"></a>
# **deleteInvoiceReference**
> EmptyEnvelope deleteInvoiceReference(tenantId, invoiceId, invoiceReferenceId)

Delete an invoice reference.

Deletes the specified reference from the invoice.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    UUID invoiceReferenceId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.deleteInvoiceReference(tenantId, invoiceId, invoiceReferenceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#deleteInvoiceReference");
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
| **invoiceId** | **UUID**|  | |
| **invoiceReferenceId** | **UUID**|  | |

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

<a id="getExtendedInvoice"></a>
# **getExtendedInvoice**
> InvoiceDtoEnvelope getExtendedInvoice(tenantId, invoiceId)

Get an extended invoice by ID.

Retrieves the extended invoice details for the specified invoice ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    try {
      InvoiceDtoEnvelope result = apiInstance.getExtendedInvoice(tenantId, invoiceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#getExtendedInvoice");
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
| **invoiceId** | **UUID**|  | |

### Return type

[**InvoiceDtoEnvelope**](InvoiceDtoEnvelope.md)

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

<a id="getExtendedInvoices"></a>
# **getExtendedInvoices**
> ExtendedInvoiceDtoListEnvelope getExtendedInvoices(tenantId)

Get a list of extended invoices.

Retrieves a list of extended invoice details for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      ExtendedInvoiceDtoListEnvelope result = apiInstance.getExtendedInvoices(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#getExtendedInvoices");
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

### Return type

[**ExtendedInvoiceDtoListEnvelope**](ExtendedInvoiceDtoListEnvelope.md)

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

<a id="getExtendedInvoicesCount"></a>
# **getExtendedInvoicesCount**
> Int32Envelope getExtendedInvoicesCount(tenantId)

Get the count of extended invoices.

Retrieves the total count of extended invoices for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.getExtendedInvoicesCount(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#getExtendedInvoicesCount");
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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getInvoice"></a>
# **getInvoice**
> InvoiceDtoEnvelope getInvoice(tenantId, invoiceId)

Get an invoice by ID.

Retrieves the invoice details for the specified invoice ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    try {
      InvoiceDtoEnvelope result = apiInstance.getInvoice(tenantId, invoiceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#getInvoice");
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
| **invoiceId** | **UUID**|  | |

### Return type

[**InvoiceDtoEnvelope**](InvoiceDtoEnvelope.md)

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

<a id="getInvoiceAdjustment"></a>
# **getInvoiceAdjustment**
> InvoiceAdjustmentDtoEnvelope getInvoiceAdjustment(tenantId, invoiceId, invoiceAdjustmentId)

Get an invoice adjustment by ID.

Retrieves the adjustment details for the specified invoice adjustment ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    UUID invoiceAdjustmentId = UUID.randomUUID(); // UUID | 
    try {
      InvoiceAdjustmentDtoEnvelope result = apiInstance.getInvoiceAdjustment(tenantId, invoiceId, invoiceAdjustmentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#getInvoiceAdjustment");
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
| **invoiceId** | **UUID**|  | |
| **invoiceAdjustmentId** | **UUID**|  | |

### Return type

[**InvoiceAdjustmentDtoEnvelope**](InvoiceAdjustmentDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getInvoiceAdjustments"></a>
# **getInvoiceAdjustments**
> InvoiceAdjustmentDtoIReadOnlyListEnvelope getInvoiceAdjustments(tenantId, invoiceId)

Get invoice adjustments.

Retrieves the adjustments for the specified invoice.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    try {
      InvoiceAdjustmentDtoIReadOnlyListEnvelope result = apiInstance.getInvoiceAdjustments(tenantId, invoiceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#getInvoiceAdjustments");
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
| **invoiceId** | **UUID**|  | |

### Return type

[**InvoiceAdjustmentDtoIReadOnlyListEnvelope**](InvoiceAdjustmentDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getInvoiceAdjustmentsCount"></a>
# **getInvoiceAdjustmentsCount**
> Int32Envelope getInvoiceAdjustmentsCount(tenantId, invoiceId)

Get the count of invoice adjustments.

Retrieves the total count of adjustments for the specified invoice.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.getInvoiceAdjustmentsCount(tenantId, invoiceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#getInvoiceAdjustmentsCount");
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
| **invoiceId** | **UUID**|  | |

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

<a id="getInvoiceLine"></a>
# **getInvoiceLine**
> InvoiceLineDtoEnvelope getInvoiceLine(tenantId, invoiceId, invoiceLineId)

Get an invoice line by ID.

Retrieves the invoice line details for the specified invoice line ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    UUID invoiceLineId = UUID.randomUUID(); // UUID | 
    try {
      InvoiceLineDtoEnvelope result = apiInstance.getInvoiceLine(tenantId, invoiceId, invoiceLineId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#getInvoiceLine");
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
| **invoiceId** | **UUID**|  | |
| **invoiceLineId** | **UUID**|  | |

### Return type

[**InvoiceLineDtoEnvelope**](InvoiceLineDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getInvoiceLineTaxes"></a>
# **getInvoiceLineTaxes**
> InvoiceLineAppliedTaxDtoIReadOnlyListEnvelope getInvoiceLineTaxes(tenantId, invoiceId, invoiceLineId)

Get taxes for an invoice line.

Retrieves the taxes applied to the specified invoice line.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    UUID invoiceLineId = UUID.randomUUID(); // UUID | 
    try {
      InvoiceLineAppliedTaxDtoIReadOnlyListEnvelope result = apiInstance.getInvoiceLineTaxes(tenantId, invoiceId, invoiceLineId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#getInvoiceLineTaxes");
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
| **invoiceId** | **UUID**|  | |
| **invoiceLineId** | **UUID**|  | |

### Return type

[**InvoiceLineAppliedTaxDtoIReadOnlyListEnvelope**](InvoiceLineAppliedTaxDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getInvoiceLineTaxesCount"></a>
# **getInvoiceLineTaxesCount**
> Int32Envelope getInvoiceLineTaxesCount(tenantId, invoiceId, invoiceLineId)

Get the count of taxes for an invoice line.

Retrieves the total count of taxes applied to the specified invoice line.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    UUID invoiceLineId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.getInvoiceLineTaxesCount(tenantId, invoiceId, invoiceLineId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#getInvoiceLineTaxesCount");
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
| **invoiceId** | **UUID**|  | |
| **invoiceLineId** | **UUID**|  | |

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

<a id="getInvoiceLines"></a>
# **getInvoiceLines**
> InvoiceLineDtoListEnvelope getInvoiceLines(tenantId, invoiceId, itemId)

Get invoice lines.

Retrieves the invoice lines for the specified invoice.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    try {
      InvoiceLineDtoListEnvelope result = apiInstance.getInvoiceLines(tenantId, invoiceId, itemId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#getInvoiceLines");
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
| **invoiceId** | **UUID**|  | |
| **itemId** | **UUID**|  | [optional] |

### Return type

[**InvoiceLineDtoListEnvelope**](InvoiceLineDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getInvoiceLinesCount"></a>
# **getInvoiceLinesCount**
> Int32Envelope getInvoiceLinesCount(tenantId, invoiceId)

Get the count of invoice lines.

Retrieves the total count of invoice lines for the specified invoice.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.getInvoiceLinesCount(tenantId, invoiceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#getInvoiceLinesCount");
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
| **invoiceId** | **UUID**|  | |

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

<a id="getInvoicePayments"></a>
# **getInvoicePayments**
> PaymentDtoIReadOnlyListEnvelope getInvoicePayments(invoiceId)

Get payments for an invoice.

Retrieves the list of payments related to the specified invoice.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    try {
      PaymentDtoIReadOnlyListEnvelope result = apiInstance.getInvoicePayments(invoiceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#getInvoicePayments");
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
| **invoiceId** | **UUID**|  | |

### Return type

[**PaymentDtoIReadOnlyListEnvelope**](PaymentDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getInvoicePaymentsCount"></a>
# **getInvoicePaymentsCount**
> Int32Envelope getInvoicePaymentsCount(invoiceId)

Get the count of payments for an invoice.

Retrieves the total count of payments for the specified invoice.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.getInvoicePaymentsCount(invoiceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#getInvoicePaymentsCount");
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
| **invoiceId** | **UUID**|  | |

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

<a id="getInvoiceReference"></a>
# **getInvoiceReference**
> InvoiceReferenceDtoEnvelope getInvoiceReference(tenantId, invoiceId, invoiceReferenceId)

Get an invoice reference by ID.

Retrieves the reference details for the specified invoice reference ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    UUID invoiceReferenceId = UUID.randomUUID(); // UUID | 
    try {
      InvoiceReferenceDtoEnvelope result = apiInstance.getInvoiceReference(tenantId, invoiceId, invoiceReferenceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#getInvoiceReference");
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
| **invoiceId** | **UUID**|  | |
| **invoiceReferenceId** | **UUID**|  | |

### Return type

[**InvoiceReferenceDtoEnvelope**](InvoiceReferenceDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getInvoiceReferences"></a>
# **getInvoiceReferences**
> InvoiceReferenceDtoIReadOnlyListEnvelope getInvoiceReferences(tenantId, invoiceId)

Get invoice references.

Retrieves the references for the specified invoice.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    try {
      InvoiceReferenceDtoIReadOnlyListEnvelope result = apiInstance.getInvoiceReferences(tenantId, invoiceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#getInvoiceReferences");
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
| **invoiceId** | **UUID**|  | |

### Return type

[**InvoiceReferenceDtoIReadOnlyListEnvelope**](InvoiceReferenceDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getInvoiceReferencesCount"></a>
# **getInvoiceReferencesCount**
> Int32Envelope getInvoiceReferencesCount(tenantId, invoiceId)

Get the count of invoice references.

Retrieves the total count of references for the specified invoice.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.getInvoiceReferencesCount(tenantId, invoiceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#getInvoiceReferencesCount");
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
| **invoiceId** | **UUID**|  | |

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

<a id="getInvoices"></a>
# **getInvoices**
> InvoiceDtoListEnvelope getInvoices(tenantId)

Get a list of invoices.

Retrieves a list of invoices for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      InvoiceDtoListEnvelope result = apiInstance.getInvoices(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#getInvoices");
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

### Return type

[**InvoiceDtoListEnvelope**](InvoiceDtoListEnvelope.md)

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

<a id="getInvoicesCount"></a>
# **getInvoicesCount**
> Int32Envelope getInvoicesCount(tenantId)

Get the count of invoices.

Retrieves the total count of invoices for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.getInvoicesCount(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#getInvoicesCount");
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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="previewInvoiceEmail"></a>
# **previewInvoiceEmail**
> previewInvoiceEmail(invoiceId, tenantId, emailDispatchRequest)

Preview the rendered email for an invoice.

This action is only available for users with the &#39;send_email&#39; permission.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    EmailDispatchRequest emailDispatchRequest = new EmailDispatchRequest(); // EmailDispatchRequest | 
    try {
      apiInstance.previewInvoiceEmail(invoiceId, tenantId, emailDispatchRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#previewInvoiceEmail");
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
| **invoiceId** | **UUID**|  | |
| **tenantId** | **UUID**|  | |
| **emailDispatchRequest** | [**EmailDispatchRequest**](EmailDispatchRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="sendInvoiceEmail"></a>
# **sendInvoiceEmail**
> Envelope sendInvoiceEmail(tenantId, invoiceId, emailDispatchRequest)

Send an invoice transactional email to recipients.

This action is only available for users with the &#39;send_email&#39; permission.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    EmailDispatchRequest emailDispatchRequest = new EmailDispatchRequest(); // EmailDispatchRequest | 
    try {
      Envelope result = apiInstance.sendInvoiceEmail(tenantId, invoiceId, emailDispatchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#sendInvoiceEmail");
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
| **invoiceId** | **UUID**|  | |
| **emailDispatchRequest** | [**EmailDispatchRequest**](EmailDispatchRequest.md)|  | [optional] |

### Return type

[**Envelope**](Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateInvoice"></a>
# **updateInvoice**
> EmptyEnvelope updateInvoice(tenantId, invoiceId, invoiceUpdateDto)

Update an invoice.

Updates the specified invoice for the tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    InvoiceUpdateDto invoiceUpdateDto = new InvoiceUpdateDto(); // InvoiceUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateInvoice(tenantId, invoiceId, invoiceUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#updateInvoice");
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
| **invoiceId** | **UUID**|  | |
| **invoiceUpdateDto** | [**InvoiceUpdateDto**](InvoiceUpdateDto.md)|  | [optional] |

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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="updateInvoiceAdjustment"></a>
# **updateInvoiceAdjustment**
> EmptyEnvelope updateInvoiceAdjustment(tenantId, invoiceId, invoiceAdjustmentId, invoiceAdjustmentUpdateDto)

Update an invoice adjustment.

Updates the specified adjustment for the invoice.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    UUID invoiceAdjustmentId = UUID.randomUUID(); // UUID | 
    InvoiceAdjustmentUpdateDto invoiceAdjustmentUpdateDto = new InvoiceAdjustmentUpdateDto(); // InvoiceAdjustmentUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateInvoiceAdjustment(tenantId, invoiceId, invoiceAdjustmentId, invoiceAdjustmentUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#updateInvoiceAdjustment");
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
| **invoiceId** | **UUID**|  | |
| **invoiceAdjustmentId** | **UUID**|  | |
| **invoiceAdjustmentUpdateDto** | [**InvoiceAdjustmentUpdateDto**](InvoiceAdjustmentUpdateDto.md)|  | [optional] |

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

<a id="updateInvoiceLine"></a>
# **updateInvoiceLine**
> InvoiceLineDtoEnvelope updateInvoiceLine(tenantId, invoiceId, invoiceLineId, invoiceLineUpdateDto)

Update an invoice line.

Updates the specified invoice line.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    UUID invoiceLineId = UUID.randomUUID(); // UUID | 
    InvoiceLineUpdateDto invoiceLineUpdateDto = new InvoiceLineUpdateDto(); // InvoiceLineUpdateDto | 
    try {
      InvoiceLineDtoEnvelope result = apiInstance.updateInvoiceLine(tenantId, invoiceId, invoiceLineId, invoiceLineUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#updateInvoiceLine");
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
| **invoiceId** | **UUID**|  | |
| **invoiceLineId** | **UUID**|  | |
| **invoiceLineUpdateDto** | [**InvoiceLineUpdateDto**](InvoiceLineUpdateDto.md)|  | [optional] |

### Return type

[**InvoiceLineDtoEnvelope**](InvoiceLineDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateInvoiceLineTax"></a>
# **updateInvoiceLineTax**
> EmptyEnvelope updateInvoiceLineTax(tenantId, invoiceId, invoiceLineId, invoiceLineTaxId, invoiceLineAppliedTaxUpdateDto)

Update a tax for an invoice line.

Updates the specified tax entry for the invoice line.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    UUID invoiceLineId = UUID.randomUUID(); // UUID | 
    UUID invoiceLineTaxId = UUID.randomUUID(); // UUID | 
    InvoiceLineAppliedTaxUpdateDto invoiceLineAppliedTaxUpdateDto = new InvoiceLineAppliedTaxUpdateDto(); // InvoiceLineAppliedTaxUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateInvoiceLineTax(tenantId, invoiceId, invoiceLineId, invoiceLineTaxId, invoiceLineAppliedTaxUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#updateInvoiceLineTax");
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
| **invoiceId** | **UUID**|  | |
| **invoiceLineId** | **UUID**|  | |
| **invoiceLineTaxId** | **UUID**|  | |
| **invoiceLineAppliedTaxUpdateDto** | [**InvoiceLineAppliedTaxUpdateDto**](InvoiceLineAppliedTaxUpdateDto.md)|  | [optional] |

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

<a id="updateInvoiceReference"></a>
# **updateInvoiceReference**
> EmptyEnvelope updateInvoiceReference(tenantId, invoiceId, invoiceReferenceId, invoiceReferenceUpdateDto)

Update an invoice reference.

Updates the specified reference for the invoice.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    UUID invoiceReferenceId = UUID.randomUUID(); // UUID | 
    InvoiceReferenceUpdateDto invoiceReferenceUpdateDto = new InvoiceReferenceUpdateDto(); // InvoiceReferenceUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateInvoiceReference(tenantId, invoiceId, invoiceReferenceId, invoiceReferenceUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#updateInvoiceReference");
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
| **invoiceId** | **UUID**|  | |
| **invoiceReferenceId** | **UUID**|  | |
| **invoiceReferenceUpdateDto** | [**InvoiceReferenceUpdateDto**](InvoiceReferenceUpdateDto.md)|  | [optional] |

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

