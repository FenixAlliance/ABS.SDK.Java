# InvoicesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2InvoicingServiceInvoicesCountGet**](InvoicesApi.md#apiV2InvoicingServiceInvoicesCountGet) | **GET** /api/v2/InvoicingService/Invoices/Count |  |
| [**apiV2InvoicingServiceInvoicesDiscountsAggregatePost**](InvoicesApi.md#apiV2InvoicingServiceInvoicesDiscountsAggregatePost) | **POST** /api/v2/InvoicingService/Invoices/DiscountsAggregate |  |
| [**apiV2InvoicingServiceInvoicesExtendedCountGet**](InvoicesApi.md#apiV2InvoicingServiceInvoicesExtendedCountGet) | **GET** /api/v2/InvoicingService/Invoices/Extended/Count |  |
| [**apiV2InvoicingServiceInvoicesExtendedGet**](InvoicesApi.md#apiV2InvoicingServiceInvoicesExtendedGet) | **GET** /api/v2/InvoicingService/Invoices/Extended |  |
| [**apiV2InvoicingServiceInvoicesGet**](InvoicesApi.md#apiV2InvoicingServiceInvoicesGet) | **GET** /api/v2/InvoicingService/Invoices |  |
| [**apiV2InvoicingServiceInvoicesGlobalSurchargesAggregatePost**](InvoicesApi.md#apiV2InvoicingServiceInvoicesGlobalSurchargesAggregatePost) | **POST** /api/v2/InvoicingService/Invoices/GlobalSurchargesAggregate |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsCountGet**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsCountGet) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/Adjustments/Count |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsGet**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsGet) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/Adjustments |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdDelete**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdDelete) | **DELETE** /api/v2/InvoicingService/Invoices/{invoiceId}/Adjustments/{invoiceAdjustmentId} |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdGet**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdGet) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/Adjustments/{invoiceAdjustmentId} |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdPut**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdPut) | **PUT** /api/v2/InvoicingService/Invoices/{invoiceId}/Adjustments/{invoiceAdjustmentId} |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsPost**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsPost) | **POST** /api/v2/InvoicingService/Invoices/{invoiceId}/Adjustments |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdCalculatePut**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdCalculatePut) | **PUT** /api/v2/InvoicingService/Invoices/{invoiceId}/Calculate |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdDelete**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdDelete) | **DELETE** /api/v2/InvoicingService/Invoices/{invoiceId} |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdExtendedGet**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdExtendedGet) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/Extended |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdLinesCountGet**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdLinesCountGet) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines/Count |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdLinesGet**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdLinesGet) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdCalculatePut**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdCalculatePut) | **PUT** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines/{invoiceLineId}/Calculate |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdDelete**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdDelete) | **DELETE** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines/{invoiceLineId} |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdGet**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdGet) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines/{invoiceLineId} |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdPut**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdPut) | **PUT** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines/{invoiceLineId} |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesCountGet**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesCountGet) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines/{invoiceLineId}/Taxes/Count |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesGet**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesGet) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines/{invoiceLineId}/Taxes |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesInvoiceLineTaxIdDelete**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesInvoiceLineTaxIdDelete) | **DELETE** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines/{invoiceLineId}/Taxes/{invoiceLineTaxId} |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesInvoiceLineTaxIdPut**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesInvoiceLineTaxIdPut) | **PUT** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines/{invoiceLineId}/Taxes/{invoiceLineTaxId} |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesPost**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesPost) | **POST** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines/{invoiceLineId}/Taxes |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdLinesPost**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdLinesPost) | **POST** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdPaymentsCountGet**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdPaymentsCountGet) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/Payments/Count |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdPaymentsGet**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdPaymentsGet) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/Payments |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdPut**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdPut) | **PUT** /api/v2/InvoicingService/Invoices/{invoiceId} |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdReferencesCountGet**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdReferencesCountGet) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/References/Count |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdReferencesGet**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdReferencesGet) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/References |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdDelete**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdDelete) | **DELETE** /api/v2/InvoicingService/Invoices/{invoiceId}/References/{invoiceReferenceId} |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdGet**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdGet) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/References/{invoiceReferenceId} |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdPut**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdPut) | **PUT** /api/v2/InvoicingService/Invoices/{invoiceId}/References/{invoiceReferenceId} |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdReferencesPost**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdReferencesPost) | **POST** /api/v2/InvoicingService/Invoices/{invoiceId}/References |  |
| [**apiV2InvoicingServiceInvoicesPost**](InvoicesApi.md#apiV2InvoicingServiceInvoicesPost) | **POST** /api/v2/InvoicingService/Invoices |  |
| [**apiV2InvoicingServiceInvoicesTaxBasesAggregatePost**](InvoicesApi.md#apiV2InvoicingServiceInvoicesTaxBasesAggregatePost) | **POST** /api/v2/InvoicingService/Invoices/TaxBasesAggregate |  |
| [**apiV2InvoicingServiceInvoicesTaxesAggregatePost**](InvoicesApi.md#apiV2InvoicingServiceInvoicesTaxesAggregatePost) | **POST** /api/v2/InvoicingService/Invoices/TaxesAggregate |  |
| [**apiV2InvoicingServiceInvoicesTotalsAggregatePost**](InvoicesApi.md#apiV2InvoicingServiceInvoicesTotalsAggregatePost) | **POST** /api/v2/InvoicingService/Invoices/TotalsAggregate |  |
| [**getInvoiceAsync**](InvoicesApi.md#getInvoiceAsync) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId} |  |


<a id="apiV2InvoicingServiceInvoicesCountGet"></a>
# **apiV2InvoicingServiceInvoicesCountGet**
> Int32Envelope apiV2InvoicingServiceInvoicesCountGet(tenantId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.apiV2InvoicingServiceInvoicesCountGet(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#apiV2InvoicingServiceInvoicesCountGet");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2InvoicingServiceInvoicesDiscountsAggregatePost"></a>
# **apiV2InvoicingServiceInvoicesDiscountsAggregatePost**
> MoneyEnvelope apiV2InvoicingServiceInvoicesDiscountsAggregatePost(UUID, currencyId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    List<UUID> UUID = Arrays.asList(); // List<UUID> | 
    String currencyId = "currencyId_example"; // String | 
    try {
      MoneyEnvelope result = apiInstance.apiV2InvoicingServiceInvoicesDiscountsAggregatePost(UUID, currencyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#apiV2InvoicingServiceInvoicesDiscountsAggregatePost");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="apiV2InvoicingServiceInvoicesExtendedCountGet"></a>
# **apiV2InvoicingServiceInvoicesExtendedCountGet**
> Int32Envelope apiV2InvoicingServiceInvoicesExtendedCountGet(tenantId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.apiV2InvoicingServiceInvoicesExtendedCountGet(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#apiV2InvoicingServiceInvoicesExtendedCountGet");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2InvoicingServiceInvoicesExtendedGet"></a>
# **apiV2InvoicingServiceInvoicesExtendedGet**
> ExtendedInvoiceDtoListEnvelope apiV2InvoicingServiceInvoicesExtendedGet(tenantId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      ExtendedInvoiceDtoListEnvelope result = apiInstance.apiV2InvoicingServiceInvoicesExtendedGet(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#apiV2InvoicingServiceInvoicesExtendedGet");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2InvoicingServiceInvoicesGet"></a>
# **apiV2InvoicingServiceInvoicesGet**
> InvoiceDtoListEnvelope apiV2InvoicingServiceInvoicesGet(tenantId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      InvoiceDtoListEnvelope result = apiInstance.apiV2InvoicingServiceInvoicesGet(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#apiV2InvoicingServiceInvoicesGet");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2InvoicingServiceInvoicesGlobalSurchargesAggregatePost"></a>
# **apiV2InvoicingServiceInvoicesGlobalSurchargesAggregatePost**
> MoneyEnvelope apiV2InvoicingServiceInvoicesGlobalSurchargesAggregatePost(UUID, currencyId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    List<UUID> UUID = Arrays.asList(); // List<UUID> | 
    String currencyId = "currencyId_example"; // String | 
    try {
      MoneyEnvelope result = apiInstance.apiV2InvoicingServiceInvoicesGlobalSurchargesAggregatePost(UUID, currencyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#apiV2InvoicingServiceInvoicesGlobalSurchargesAggregatePost");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsCountGet"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsCountGet**
> Int32Envelope apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsCountGet(tenantId, invoiceId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsCountGet(tenantId, invoiceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsCountGet");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsGet"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsGet**
> InvoiceAdjustmentDtoListEnvelope apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsGet(tenantId, invoiceId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    try {
      InvoiceAdjustmentDtoListEnvelope result = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsGet(tenantId, invoiceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsGet");
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

[**InvoiceAdjustmentDtoListEnvelope**](InvoiceAdjustmentDtoListEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdDelete"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdDelete**
> EmptyEnvelope apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdDelete(tenantId, invoiceId, invoiceAdjustmentId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    UUID invoiceAdjustmentId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdDelete(tenantId, invoiceId, invoiceAdjustmentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdDelete");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdGet"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdGet**
> InvoiceAdjustmentDtoEnvelope apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdGet(tenantId, invoiceId, invoiceAdjustmentId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    UUID invoiceAdjustmentId = UUID.randomUUID(); // UUID | 
    try {
      InvoiceAdjustmentDtoEnvelope result = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdGet(tenantId, invoiceId, invoiceAdjustmentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdGet");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdPut"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdPut**
> EmptyEnvelope apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdPut(tenantId, invoiceId, invoiceAdjustmentId, invoiceAdjustmentUpdateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    UUID invoiceAdjustmentId = UUID.randomUUID(); // UUID | 
    InvoiceAdjustmentUpdateDto invoiceAdjustmentUpdateDto = new InvoiceAdjustmentUpdateDto(); // InvoiceAdjustmentUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdPut(tenantId, invoiceId, invoiceAdjustmentId, invoiceAdjustmentUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdPut");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsPost"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsPost**
> EmptyEnvelope apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsPost(tenantId, invoiceId, invoiceAdjustmentCreateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    InvoiceAdjustmentCreateDto invoiceAdjustmentCreateDto = new InvoiceAdjustmentCreateDto(); // InvoiceAdjustmentCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsPost(tenantId, invoiceId, invoiceAdjustmentCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsPost");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2InvoicingServiceInvoicesInvoiceIdCalculatePut"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdCalculatePut**
> EmptyEnvelope apiV2InvoicingServiceInvoicesInvoiceIdCalculatePut(tenantId, invoiceId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdCalculatePut(tenantId, invoiceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdCalculatePut");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2InvoicingServiceInvoicesInvoiceIdDelete"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdDelete**
> EmptyEnvelope apiV2InvoicingServiceInvoicesInvoiceIdDelete(tenantId, invoiceId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdDelete(tenantId, invoiceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdDelete");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2InvoicingServiceInvoicesInvoiceIdExtendedGet"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdExtendedGet**
> InvoiceDtoEnvelope apiV2InvoicingServiceInvoicesInvoiceIdExtendedGet(tenantId, invoiceId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    try {
      InvoiceDtoEnvelope result = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdExtendedGet(tenantId, invoiceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdExtendedGet");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2InvoicingServiceInvoicesInvoiceIdLinesCountGet"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdLinesCountGet**
> Int32Envelope apiV2InvoicingServiceInvoicesInvoiceIdLinesCountGet(tenantId, invoiceId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdLinesCountGet(tenantId, invoiceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdLinesCountGet");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2InvoicingServiceInvoicesInvoiceIdLinesGet"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdLinesGet**
> InvoiceLineDtoListEnvelope apiV2InvoicingServiceInvoicesInvoiceIdLinesGet(tenantId, invoiceId, itemId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    try {
      InvoiceLineDtoListEnvelope result = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdLinesGet(tenantId, invoiceId, itemId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdLinesGet");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdCalculatePut"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdCalculatePut**
> EmptyEnvelope apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdCalculatePut(tenantId, invoiceId, invoiceLineId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    UUID invoiceLineId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdCalculatePut(tenantId, invoiceId, invoiceLineId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdCalculatePut");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdDelete"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdDelete**
> EmptyEnvelope apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdDelete(tenantId, invoiceId, invoiceLineId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    UUID invoiceLineId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdDelete(tenantId, invoiceId, invoiceLineId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdDelete");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdGet"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdGet**
> InvoiceLineDtoEnvelope apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdGet(tenantId, invoiceId, invoiceLineId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    UUID invoiceLineId = UUID.randomUUID(); // UUID | 
    try {
      InvoiceLineDtoEnvelope result = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdGet(tenantId, invoiceId, invoiceLineId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdGet");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdPut"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdPut**
> EmptyEnvelope apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdPut(tenantId, invoiceId, invoiceLineId, invoiceLineUpdateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    UUID invoiceLineId = UUID.randomUUID(); // UUID | 
    InvoiceLineUpdateDto invoiceLineUpdateDto = new InvoiceLineUpdateDto(); // InvoiceLineUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdPut(tenantId, invoiceId, invoiceLineId, invoiceLineUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdPut");
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

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesCountGet"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesCountGet**
> Int32Envelope apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesCountGet(tenantId, invoiceId, invoiceLineId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    UUID invoiceLineId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesCountGet(tenantId, invoiceId, invoiceLineId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesCountGet");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesGet"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesGet**
> InvoiceLineAppliedTaxDtoListEnvelope apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesGet(tenantId, invoiceId, invoiceLineId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    UUID invoiceLineId = UUID.randomUUID(); // UUID | 
    try {
      InvoiceLineAppliedTaxDtoListEnvelope result = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesGet(tenantId, invoiceId, invoiceLineId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesGet");
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

[**InvoiceLineAppliedTaxDtoListEnvelope**](InvoiceLineAppliedTaxDtoListEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesInvoiceLineTaxIdDelete"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesInvoiceLineTaxIdDelete**
> EmptyEnvelope apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesInvoiceLineTaxIdDelete(tenantId, invoiceId, invoiceLineId, invoiceLineTaxId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    UUID invoiceLineId = UUID.randomUUID(); // UUID | 
    UUID invoiceLineTaxId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesInvoiceLineTaxIdDelete(tenantId, invoiceId, invoiceLineId, invoiceLineTaxId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesInvoiceLineTaxIdDelete");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesInvoiceLineTaxIdPut"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesInvoiceLineTaxIdPut**
> EmptyEnvelope apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesInvoiceLineTaxIdPut(tenantId, invoiceId, invoiceLineId, invoiceLineTaxId, invoiceLineAppliedTaxUpdateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    UUID invoiceLineId = UUID.randomUUID(); // UUID | 
    UUID invoiceLineTaxId = UUID.randomUUID(); // UUID | 
    InvoiceLineAppliedTaxUpdateDto invoiceLineAppliedTaxUpdateDto = new InvoiceLineAppliedTaxUpdateDto(); // InvoiceLineAppliedTaxUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesInvoiceLineTaxIdPut(tenantId, invoiceId, invoiceLineId, invoiceLineTaxId, invoiceLineAppliedTaxUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesInvoiceLineTaxIdPut");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesPost"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesPost**
> EmptyEnvelope apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesPost(tenantId, invoiceId, invoiceLineId, invoiceLineAppliedTaxCreateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    UUID invoiceLineId = UUID.randomUUID(); // UUID | 
    InvoiceLineAppliedTaxCreateDto invoiceLineAppliedTaxCreateDto = new InvoiceLineAppliedTaxCreateDto(); // InvoiceLineAppliedTaxCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesPost(tenantId, invoiceId, invoiceLineId, invoiceLineAppliedTaxCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesPost");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2InvoicingServiceInvoicesInvoiceIdLinesPost"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdLinesPost**
> EmptyEnvelope apiV2InvoicingServiceInvoicesInvoiceIdLinesPost(tenantId, invoiceId, invoiceLineCreateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    InvoiceLineCreateDto invoiceLineCreateDto = new InvoiceLineCreateDto(); // InvoiceLineCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdLinesPost(tenantId, invoiceId, invoiceLineCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdLinesPost");
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

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2InvoicingServiceInvoicesInvoiceIdPaymentsCountGet"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdPaymentsCountGet**
> Int32Envelope apiV2InvoicingServiceInvoicesInvoiceIdPaymentsCountGet(invoiceId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdPaymentsCountGet(invoiceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdPaymentsCountGet");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="apiV2InvoicingServiceInvoicesInvoiceIdPaymentsGet"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdPaymentsGet**
> InvoiceDtoListEnvelope apiV2InvoicingServiceInvoicesInvoiceIdPaymentsGet(invoiceId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    try {
      InvoiceDtoListEnvelope result = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdPaymentsGet(invoiceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdPaymentsGet");
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

[**InvoiceDtoListEnvelope**](InvoiceDtoListEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="apiV2InvoicingServiceInvoicesInvoiceIdPut"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdPut**
> EmptyEnvelope apiV2InvoicingServiceInvoicesInvoiceIdPut(tenantId, invoiceId, invoiceUpdateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    InvoiceUpdateDto invoiceUpdateDto = new InvoiceUpdateDto(); // InvoiceUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdPut(tenantId, invoiceId, invoiceUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdPut");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2InvoicingServiceInvoicesInvoiceIdReferencesCountGet"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdReferencesCountGet**
> Int32Envelope apiV2InvoicingServiceInvoicesInvoiceIdReferencesCountGet(tenantId, invoiceId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdReferencesCountGet(tenantId, invoiceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdReferencesCountGet");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2InvoicingServiceInvoicesInvoiceIdReferencesGet"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdReferencesGet**
> InvoiceReferenceDtoListEnvelope apiV2InvoicingServiceInvoicesInvoiceIdReferencesGet(tenantId, invoiceId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    try {
      InvoiceReferenceDtoListEnvelope result = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdReferencesGet(tenantId, invoiceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdReferencesGet");
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

[**InvoiceReferenceDtoListEnvelope**](InvoiceReferenceDtoListEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdDelete"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdDelete**
> EmptyEnvelope apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdDelete(tenantId, invoiceId, invoiceReferenceId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    UUID invoiceReferenceId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdDelete(tenantId, invoiceId, invoiceReferenceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdDelete");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdGet"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdGet**
> InvoiceReferenceDtoEnvelope apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdGet(tenantId, invoiceId, invoiceReferenceId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    UUID invoiceReferenceId = UUID.randomUUID(); // UUID | 
    try {
      InvoiceReferenceDtoEnvelope result = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdGet(tenantId, invoiceId, invoiceReferenceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdGet");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdPut"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdPut**
> EmptyEnvelope apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdPut(tenantId, invoiceId, invoiceReferenceId, invoiceReferenceUpdateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    UUID invoiceReferenceId = UUID.randomUUID(); // UUID | 
    InvoiceReferenceUpdateDto invoiceReferenceUpdateDto = new InvoiceReferenceUpdateDto(); // InvoiceReferenceUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdPut(tenantId, invoiceId, invoiceReferenceId, invoiceReferenceUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdPut");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2InvoicingServiceInvoicesInvoiceIdReferencesPost"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdReferencesPost**
> EmptyEnvelope apiV2InvoicingServiceInvoicesInvoiceIdReferencesPost(tenantId, invoiceId, invoiceReferenceCreateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    InvoiceReferenceCreateDto invoiceReferenceCreateDto = new InvoiceReferenceCreateDto(); // InvoiceReferenceCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdReferencesPost(tenantId, invoiceId, invoiceReferenceCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdReferencesPost");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2InvoicingServiceInvoicesPost"></a>
# **apiV2InvoicingServiceInvoicesPost**
> EmptyEnvelope apiV2InvoicingServiceInvoicesPost(tenantId, invoiceCreateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    InvoiceCreateDto invoiceCreateDto = new InvoiceCreateDto(); // InvoiceCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.apiV2InvoicingServiceInvoicesPost(tenantId, invoiceCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#apiV2InvoicingServiceInvoicesPost");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2InvoicingServiceInvoicesTaxBasesAggregatePost"></a>
# **apiV2InvoicingServiceInvoicesTaxBasesAggregatePost**
> MoneyEnvelope apiV2InvoicingServiceInvoicesTaxBasesAggregatePost(UUID, currencyId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    List<UUID> UUID = Arrays.asList(); // List<UUID> | 
    String currencyId = "currencyId_example"; // String | 
    try {
      MoneyEnvelope result = apiInstance.apiV2InvoicingServiceInvoicesTaxBasesAggregatePost(UUID, currencyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#apiV2InvoicingServiceInvoicesTaxBasesAggregatePost");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="apiV2InvoicingServiceInvoicesTaxesAggregatePost"></a>
# **apiV2InvoicingServiceInvoicesTaxesAggregatePost**
> MoneyEnvelope apiV2InvoicingServiceInvoicesTaxesAggregatePost(UUID, currencyId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    List<UUID> UUID = Arrays.asList(); // List<UUID> | 
    String currencyId = "currencyId_example"; // String | 
    try {
      MoneyEnvelope result = apiInstance.apiV2InvoicingServiceInvoicesTaxesAggregatePost(UUID, currencyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#apiV2InvoicingServiceInvoicesTaxesAggregatePost");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="apiV2InvoicingServiceInvoicesTotalsAggregatePost"></a>
# **apiV2InvoicingServiceInvoicesTotalsAggregatePost**
> MoneyEnvelope apiV2InvoicingServiceInvoicesTotalsAggregatePost(UUID, currencyId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    List<UUID> UUID = Arrays.asList(); // List<UUID> | 
    String currencyId = "currencyId_example"; // String | 
    try {
      MoneyEnvelope result = apiInstance.apiV2InvoicingServiceInvoicesTotalsAggregatePost(UUID, currencyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#apiV2InvoicingServiceInvoicesTotalsAggregatePost");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getInvoiceAsync"></a>
# **getInvoiceAsync**
> InvoiceDtoEnvelope getInvoiceAsync(tenantId, invoiceId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    try {
      InvoiceDtoEnvelope result = apiInstance.getInvoiceAsync(tenantId, invoiceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#getInvoiceAsync");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

