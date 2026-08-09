# AccountingSummaryApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCreditsSumAsync**](AccountingSummaryApi.md#getCreditsSumAsync) | **GET** /api/v2/AccountingService/Summary/Credits/Sum | Sum tenant accounting-entry credits |
| [**getDebitsSumAsync**](AccountingSummaryApi.md#getDebitsSumAsync) | **GET** /api/v2/AccountingService/Summary/Debits/Sum | Sum tenant accounting-entry debits |
| [**getExpensesSumAsync**](AccountingSummaryApi.md#getExpensesSumAsync) | **GET** /api/v2/AccountingService/Summary/Expenses/Sum | Sum tenant expenses |
| [**getIncomesSumAsync**](AccountingSummaryApi.md#getIncomesSumAsync) | **GET** /api/v2/AccountingService/Summary/Incomes/Sum | Sum tenant incomes |


<a id="getCreditsSumAsync"></a>
# **getCreditsSumAsync**
> DecimalEnvelope getCreditsSumAsync(tenantId, apiVersion, xApiVersion, accountingEntryDtoCollectionQueryParameters)

Sum tenant accounting-entry credits

Returns SUM(AccountingEntry.Credit) for the tenant, filtered by the supplied OData date range.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountingSummaryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AccountingSummaryApi apiInstance = new AccountingSummaryApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    AccountingEntryDtoCollectionQueryParameters accountingEntryDtoCollectionQueryParameters = new AccountingEntryDtoCollectionQueryParameters(); // AccountingEntryDtoCollectionQueryParameters | 
    try {
      DecimalEnvelope result = apiInstance.getCreditsSumAsync(tenantId, apiVersion, xApiVersion, accountingEntryDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountingSummaryApi#getCreditsSumAsync");
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
| **accountingEntryDtoCollectionQueryParameters** | [**AccountingEntryDtoCollectionQueryParameters**](AccountingEntryDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**DecimalEnvelope**](DecimalEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="getDebitsSumAsync"></a>
# **getDebitsSumAsync**
> DecimalEnvelope getDebitsSumAsync(tenantId, apiVersion, xApiVersion, accountingEntryDtoCollectionQueryParameters)

Sum tenant accounting-entry debits

Returns SUM(AccountingEntry.Debit) for the tenant, filtered by the supplied OData date range.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountingSummaryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AccountingSummaryApi apiInstance = new AccountingSummaryApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    AccountingEntryDtoCollectionQueryParameters accountingEntryDtoCollectionQueryParameters = new AccountingEntryDtoCollectionQueryParameters(); // AccountingEntryDtoCollectionQueryParameters | 
    try {
      DecimalEnvelope result = apiInstance.getDebitsSumAsync(tenantId, apiVersion, xApiVersion, accountingEntryDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountingSummaryApi#getDebitsSumAsync");
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
| **accountingEntryDtoCollectionQueryParameters** | [**AccountingEntryDtoCollectionQueryParameters**](AccountingEntryDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**DecimalEnvelope**](DecimalEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="getExpensesSumAsync"></a>
# **getExpensesSumAsync**
> MoneyEnvelope getExpensesSumAsync(tenantId, apiVersion, xApiVersion, journalEntryDtoCollectionQueryParameters)

Sum tenant expenses

Returns SUM(JournalEntry.Debit) for Debit-direction journal entries in the tenant, filtered by the supplied OData date range.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountingSummaryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AccountingSummaryApi apiInstance = new AccountingSummaryApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    JournalEntryDtoCollectionQueryParameters journalEntryDtoCollectionQueryParameters = new JournalEntryDtoCollectionQueryParameters(); // JournalEntryDtoCollectionQueryParameters | 
    try {
      MoneyEnvelope result = apiInstance.getExpensesSumAsync(tenantId, apiVersion, xApiVersion, journalEntryDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountingSummaryApi#getExpensesSumAsync");
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
| **journalEntryDtoCollectionQueryParameters** | [**JournalEntryDtoCollectionQueryParameters**](JournalEntryDtoCollectionQueryParameters.md)|  | [optional] |

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="getIncomesSumAsync"></a>
# **getIncomesSumAsync**
> MoneyEnvelope getIncomesSumAsync(tenantId, apiVersion, xApiVersion, journalEntryDtoCollectionQueryParameters)

Sum tenant incomes

Returns SUM(JournalEntry.Credit) for Credit-direction journal entries in the tenant, filtered by the supplied OData date range.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountingSummaryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AccountingSummaryApi apiInstance = new AccountingSummaryApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    JournalEntryDtoCollectionQueryParameters journalEntryDtoCollectionQueryParameters = new JournalEntryDtoCollectionQueryParameters(); // JournalEntryDtoCollectionQueryParameters | 
    try {
      MoneyEnvelope result = apiInstance.getIncomesSumAsync(tenantId, apiVersion, xApiVersion, journalEntryDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountingSummaryApi#getIncomesSumAsync");
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
| **journalEntryDtoCollectionQueryParameters** | [**JournalEntryDtoCollectionQueryParameters**](JournalEntryDtoCollectionQueryParameters.md)|  | [optional] |

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

