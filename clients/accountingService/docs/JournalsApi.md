# JournalsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**aggregateJournalEntryCreditsAsync**](JournalsApi.md#aggregateJournalEntryCreditsAsync) | **GET** /api/v2/AccountingService/Journals/{journalId}/Entries/Aggregate/Credits | Aggregate journal entry credits |
| [**aggregateJournalEntryDebitsAsync**](JournalsApi.md#aggregateJournalEntryDebitsAsync) | **GET** /api/v2/AccountingService/Journals/{journalId}/Entries/Aggregate/Debits | Aggregate journal entry debits |
| [**assignJournalToBookAsync**](JournalsApi.md#assignJournalToBookAsync) | **POST** /api/v2/AccountingService/Journals/{journalId}/AssignToBook | Bind a journal to a financial book |
| [**countJournalsAsync**](JournalsApi.md#countJournalsAsync) | **GET** /api/v2/AccountingService/Journals/Count | Count journals |
| [**createJournalAsync**](JournalsApi.md#createJournalAsync) | **POST** /api/v2/AccountingService/Journals | Create journal |
| [**createJournalEntryAsync**](JournalsApi.md#createJournalEntryAsync) | **POST** /api/v2/AccountingService/Journals/{journalId}/Entries | Create journal entry |
| [**deleteJournalAsync**](JournalsApi.md#deleteJournalAsync) | **DELETE** /api/v2/AccountingService/Journals/{journalId} | Delete journal |
| [**deleteJournalEntryAsync**](JournalsApi.md#deleteJournalEntryAsync) | **DELETE** /api/v2/AccountingService/Journals/{journalId}/Entries/{entryId} | Delete journal entry |
| [**getJournalDetailsAsync**](JournalsApi.md#getJournalDetailsAsync) | **GET** /api/v2/AccountingService/Journals/{journalId} | Get journal by ID |
| [**getJournalEntriesAsync**](JournalsApi.md#getJournalEntriesAsync) | **GET** /api/v2/AccountingService/Journals/{journalId}/Entries | Get journal entries |
| [**getJournalEntriesCountAsync**](JournalsApi.md#getJournalEntriesCountAsync) | **GET** /api/v2/AccountingService/Journals/{journalId}/Entries/Count | Count journal entries |
| [**getJournalEntryDetailsAsync**](JournalsApi.md#getJournalEntryDetailsAsync) | **GET** /api/v2/AccountingService/Journals/{journalId}/Entries/{entryId} | Get journal entry by ID |
| [**getJournalsAsync**](JournalsApi.md#getJournalsAsync) | **GET** /api/v2/AccountingService/Journals | Get all journals |
| [**patchJournalAsync**](JournalsApi.md#patchJournalAsync) | **PATCH** /api/v2/AccountingService/Journals/{journalId} | Patch a journal |
| [**patchJournalEntryAsync**](JournalsApi.md#patchJournalEntryAsync) | **PATCH** /api/v2/AccountingService/Journals/{journalId}/Entries/{entryId} | Patch a journal entry |
| [**postJournalEntryAsync**](JournalsApi.md#postJournalEntryAsync) | **POST** /api/v2/AccountingService/Journals/{journalId}/Entries/{entryId}/Post | Post a draft journal entry |
| [**reverseJournalEntryAsync**](JournalsApi.md#reverseJournalEntryAsync) | **POST** /api/v2/AccountingService/Journals/{journalId}/Entries/{entryId}/Reverse | Reverse a posted journal entry |
| [**updateJournalAsync**](JournalsApi.md#updateJournalAsync) | **PUT** /api/v2/AccountingService/Journals/{journalId} | Update journal |
| [**updateJournalEntryAsync**](JournalsApi.md#updateJournalEntryAsync) | **PUT** /api/v2/AccountingService/Journals/{journalId}/Entries/{entryId} | Update journal entry |


<a id="aggregateJournalEntryCreditsAsync"></a>
# **aggregateJournalEntryCreditsAsync**
> MoneyEnvelope aggregateJournalEntryCreditsAsync(tenantId, journalId, currencyId, apiVersion, xApiVersion, journalEntryDtoCollectionQueryParameters)

Aggregate journal entry credits

Returns the sum of all credit amounts for entries in the specified journal, normalized to the target currency.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JournalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    JournalsApi apiInstance = new JournalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID journalId = UUID.randomUUID(); // UUID | 
    String currencyId = "USD.USA"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    JournalEntryDtoCollectionQueryParameters journalEntryDtoCollectionQueryParameters = new JournalEntryDtoCollectionQueryParameters(); // JournalEntryDtoCollectionQueryParameters | 
    try {
      MoneyEnvelope result = apiInstance.aggregateJournalEntryCreditsAsync(tenantId, journalId, currencyId, apiVersion, xApiVersion, journalEntryDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JournalsApi#aggregateJournalEntryCreditsAsync");
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
| **journalId** | **UUID**|  | |
| **currencyId** | **String**|  | [optional] [default to USD.USA] |
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

<a id="aggregateJournalEntryDebitsAsync"></a>
# **aggregateJournalEntryDebitsAsync**
> MoneyEnvelope aggregateJournalEntryDebitsAsync(tenantId, journalId, currencyId, apiVersion, xApiVersion, journalEntryDtoCollectionQueryParameters)

Aggregate journal entry debits

Returns the sum of all debit amounts for entries in the specified journal, normalized to the target currency.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JournalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    JournalsApi apiInstance = new JournalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID journalId = UUID.randomUUID(); // UUID | 
    String currencyId = "USD.USA"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    JournalEntryDtoCollectionQueryParameters journalEntryDtoCollectionQueryParameters = new JournalEntryDtoCollectionQueryParameters(); // JournalEntryDtoCollectionQueryParameters | 
    try {
      MoneyEnvelope result = apiInstance.aggregateJournalEntryDebitsAsync(tenantId, journalId, currencyId, apiVersion, xApiVersion, journalEntryDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JournalsApi#aggregateJournalEntryDebitsAsync");
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
| **journalId** | **UUID**|  | |
| **currencyId** | **String**|  | [optional] [default to USD.USA] |
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

<a id="assignJournalToBookAsync"></a>
# **assignJournalToBookAsync**
> EmptyEnvelope assignJournalToBookAsync(tenantId, journalId, apiVersion, xApiVersion, assignJournalToBookRequest)

Bind a journal to a financial book

Establishes the one-way Journal↔FinancialBook binding (finish-line #5): binds an unbound journal to the supplied book and sets its book-scoped code, enforcing (Tenant, Book, Code) uniqueness. Binding an unbound journal or re-affirming the same book succeeds; a duplicate code in the book is rejected (400), and re-homing an already-bound journal to a DIFFERENT book is rejected by the aggregate. Requires the journals_update permission.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JournalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    JournalsApi apiInstance = new JournalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID journalId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    AssignJournalToBookRequest assignJournalToBookRequest = new AssignJournalToBookRequest(); // AssignJournalToBookRequest | 
    try {
      EmptyEnvelope result = apiInstance.assignJournalToBookAsync(tenantId, journalId, apiVersion, xApiVersion, assignJournalToBookRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JournalsApi#assignJournalToBookAsync");
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
| **journalId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **assignJournalToBookRequest** | [**AssignJournalToBookRequest**](AssignJournalToBookRequest.md)|  | [optional] |

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
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="countJournalsAsync"></a>
# **countJournalsAsync**
> Int32Envelope countJournalsAsync(tenantId, apiVersion, xApiVersion, journalDtoCollectionQueryParameters)

Count journals

Returns the count of journals for the tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JournalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    JournalsApi apiInstance = new JournalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    JournalDtoCollectionQueryParameters journalDtoCollectionQueryParameters = new JournalDtoCollectionQueryParameters(); // JournalDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.countJournalsAsync(tenantId, apiVersion, xApiVersion, journalDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JournalsApi#countJournalsAsync");
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
| **journalDtoCollectionQueryParameters** | [**JournalDtoCollectionQueryParameters**](JournalDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

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

<a id="createJournalAsync"></a>
# **createJournalAsync**
> EmptyEnvelope createJournalAsync(tenantId, apiVersion, xApiVersion, journalCreateDto)

Create journal

Creates a new journal for the tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JournalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    JournalsApi apiInstance = new JournalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    JournalCreateDto journalCreateDto = new JournalCreateDto(); // JournalCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createJournalAsync(tenantId, apiVersion, xApiVersion, journalCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JournalsApi#createJournalAsync");
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
| **journalCreateDto** | [**JournalCreateDto**](JournalCreateDto.md)|  | [optional] |

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
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="createJournalEntryAsync"></a>
# **createJournalEntryAsync**
> EmptyEnvelope createJournalEntryAsync(tenantId, journalId, apiVersion, xApiVersion, journalEntryCreateDto)

Create journal entry

Creates a new journal entry for a given journal.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JournalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    JournalsApi apiInstance = new JournalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID journalId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    JournalEntryCreateDto journalEntryCreateDto = new JournalEntryCreateDto(); // JournalEntryCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createJournalEntryAsync(tenantId, journalId, apiVersion, xApiVersion, journalEntryCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JournalsApi#createJournalEntryAsync");
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
| **journalId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **journalEntryCreateDto** | [**JournalEntryCreateDto**](JournalEntryCreateDto.md)|  | [optional] |

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
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="deleteJournalAsync"></a>
# **deleteJournalAsync**
> EmptyEnvelope deleteJournalAsync(tenantId, journalId, apiVersion, xApiVersion)

Delete journal

Deletes a journal by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JournalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    JournalsApi apiInstance = new JournalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID journalId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteJournalAsync(tenantId, journalId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JournalsApi#deleteJournalAsync");
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
| **journalId** | **UUID**|  | |
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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="deleteJournalEntryAsync"></a>
# **deleteJournalEntryAsync**
> EmptyEnvelope deleteJournalEntryAsync(tenantId, journalId, entryId, apiVersion, xApiVersion)

Delete journal entry

Deletes a specific journal entry.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JournalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    JournalsApi apiInstance = new JournalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID journalId = UUID.randomUUID(); // UUID | 
    UUID entryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteJournalEntryAsync(tenantId, journalId, entryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JournalsApi#deleteJournalEntryAsync");
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
| **journalId** | **UUID**|  | |
| **entryId** | **UUID**|  | |
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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="getJournalDetailsAsync"></a>
# **getJournalDetailsAsync**
> JournalDtoEnvelope getJournalDetailsAsync(tenantId, journalId, apiVersion, xApiVersion)

Get journal by ID

Retrieves the details of a journal.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JournalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    JournalsApi apiInstance = new JournalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID journalId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      JournalDtoEnvelope result = apiInstance.getJournalDetailsAsync(tenantId, journalId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JournalsApi#getJournalDetailsAsync");
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
| **journalId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**JournalDtoEnvelope**](JournalDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="getJournalEntriesAsync"></a>
# **getJournalEntriesAsync**
> JournalEntryDtoIReadOnlyListEnvelope getJournalEntriesAsync(tenantId, journalId, apiVersion, xApiVersion, journalEntryDtoCollectionQueryParameters)

Get journal entries

Gets entries for the specified journal.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JournalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    JournalsApi apiInstance = new JournalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID journalId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    JournalEntryDtoCollectionQueryParameters journalEntryDtoCollectionQueryParameters = new JournalEntryDtoCollectionQueryParameters(); // JournalEntryDtoCollectionQueryParameters | 
    try {
      JournalEntryDtoIReadOnlyListEnvelope result = apiInstance.getJournalEntriesAsync(tenantId, journalId, apiVersion, xApiVersion, journalEntryDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JournalsApi#getJournalEntriesAsync");
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
| **journalId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **journalEntryDtoCollectionQueryParameters** | [**JournalEntryDtoCollectionQueryParameters**](JournalEntryDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**JournalEntryDtoIReadOnlyListEnvelope**](JournalEntryDtoIReadOnlyListEnvelope.md)

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

<a id="getJournalEntriesCountAsync"></a>
# **getJournalEntriesCountAsync**
> Int32Envelope getJournalEntriesCountAsync(tenantId, journalId, apiVersion, xApiVersion, journalEntryDtoCollectionQueryParameters)

Count journal entries

Returns the number of entries in the specified journal.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JournalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    JournalsApi apiInstance = new JournalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID journalId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    JournalEntryDtoCollectionQueryParameters journalEntryDtoCollectionQueryParameters = new JournalEntryDtoCollectionQueryParameters(); // JournalEntryDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getJournalEntriesCountAsync(tenantId, journalId, apiVersion, xApiVersion, journalEntryDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JournalsApi#getJournalEntriesCountAsync");
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
| **journalId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **journalEntryDtoCollectionQueryParameters** | [**JournalEntryDtoCollectionQueryParameters**](JournalEntryDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

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

<a id="getJournalEntryDetailsAsync"></a>
# **getJournalEntryDetailsAsync**
> JournalEntryDtoEnvelope getJournalEntryDetailsAsync(tenantId, journalId, entryId, apiVersion, xApiVersion)

Get journal entry by ID

Retrieves a single journal entry WITH its hydrated posting lines — each line&#39;s account, direction, description and currency facets (transaction / functional / account / USD).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JournalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    JournalsApi apiInstance = new JournalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID journalId = UUID.randomUUID(); // UUID | 
    UUID entryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      JournalEntryDtoEnvelope result = apiInstance.getJournalEntryDetailsAsync(tenantId, journalId, entryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JournalsApi#getJournalEntryDetailsAsync");
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
| **journalId** | **UUID**|  | |
| **entryId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**JournalEntryDtoEnvelope**](JournalEntryDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="getJournalsAsync"></a>
# **getJournalsAsync**
> JournalDtoIReadOnlyListEnvelope getJournalsAsync(tenantId, apiVersion, xApiVersion, journalDtoCollectionQueryParameters)

Get all journals

Retrieves all journals for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JournalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    JournalsApi apiInstance = new JournalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    JournalDtoCollectionQueryParameters journalDtoCollectionQueryParameters = new JournalDtoCollectionQueryParameters(); // JournalDtoCollectionQueryParameters | 
    try {
      JournalDtoIReadOnlyListEnvelope result = apiInstance.getJournalsAsync(tenantId, apiVersion, xApiVersion, journalDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JournalsApi#getJournalsAsync");
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
| **journalDtoCollectionQueryParameters** | [**JournalDtoCollectionQueryParameters**](JournalDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**JournalDtoIReadOnlyListEnvelope**](JournalDtoIReadOnlyListEnvelope.md)

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

<a id="patchJournalAsync"></a>
# **patchJournalAsync**
> EmptyEnvelope patchJournalAsync(tenantId, journalId, apiVersion, xApiVersion, patchOperation)

Patch a journal

Partially updates a journal.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JournalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    JournalsApi apiInstance = new JournalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID journalId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    List<PatchOperation> patchOperation = Arrays.asList(); // List<PatchOperation> | 
    try {
      EmptyEnvelope result = apiInstance.patchJournalAsync(tenantId, journalId, apiVersion, xApiVersion, patchOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JournalsApi#patchJournalAsync");
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
| **journalId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **patchOperation** | [**List&lt;PatchOperation&gt;**](PatchOperation.md)|  | [optional] |

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

<a id="patchJournalEntryAsync"></a>
# **patchJournalEntryAsync**
> EmptyEnvelope patchJournalEntryAsync(tenantId, journalId, entryId, apiVersion, xApiVersion, patchOperation)

Patch a journal entry

Partially updates a journal entry.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JournalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    JournalsApi apiInstance = new JournalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID journalId = UUID.randomUUID(); // UUID | 
    UUID entryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    List<PatchOperation> patchOperation = Arrays.asList(); // List<PatchOperation> | 
    try {
      EmptyEnvelope result = apiInstance.patchJournalEntryAsync(tenantId, journalId, entryId, apiVersion, xApiVersion, patchOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JournalsApi#patchJournalEntryAsync");
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
| **journalId** | **UUID**|  | |
| **entryId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **patchOperation** | [**List&lt;PatchOperation&gt;**](PatchOperation.md)|  | [optional] |

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

<a id="postJournalEntryAsync"></a>
# **postJournalEntryAsync**
> EmptyEnvelope postJournalEntryAsync(tenantId, journalId, entryId, apiVersion, xApiVersion)

Post a draft journal entry

Posts a DRAFT journal entry into its own open fiscal period. Enforces the balanced-entry invariant and the open-period gate, then seals the entry (immutable — correct via reversal, never edit/delete). An unbalanced draft or a closed period is rejected. Requires the journals_post permission.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JournalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    JournalsApi apiInstance = new JournalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID journalId = UUID.randomUUID(); // UUID | 
    UUID entryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.postJournalEntryAsync(tenantId, journalId, entryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JournalsApi#postJournalEntryAsync");
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
| **journalId** | **UUID**|  | |
| **entryId** | **UUID**|  | |
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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **422** | Unprocessable Content |  -  |

<a id="reverseJournalEntryAsync"></a>
# **reverseJournalEntryAsync**
> EmptyEnvelope reverseJournalEntryAsync(tenantId, journalId, entryId, apiVersion, xApiVersion, reverseJournalEntryRequest)

Reverse a posted journal entry

Reverses a POSTED journal entry by writing a balanced compensating counter-entry into the supplied open fiscal period and marking the original Reversed — one atomic operation (append-only audit trail). Requires the journals_reverse permission.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JournalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    JournalsApi apiInstance = new JournalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID journalId = UUID.randomUUID(); // UUID | 
    UUID entryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ReverseJournalEntryRequest reverseJournalEntryRequest = new ReverseJournalEntryRequest(); // ReverseJournalEntryRequest | 
    try {
      EmptyEnvelope result = apiInstance.reverseJournalEntryAsync(tenantId, journalId, entryId, apiVersion, xApiVersion, reverseJournalEntryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JournalsApi#reverseJournalEntryAsync");
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
| **journalId** | **UUID**|  | |
| **entryId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **reverseJournalEntryRequest** | [**ReverseJournalEntryRequest**](ReverseJournalEntryRequest.md)|  | [optional] |

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
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **422** | Unprocessable Content |  -  |

<a id="updateJournalAsync"></a>
# **updateJournalAsync**
> EmptyEnvelope updateJournalAsync(tenantId, journalId, apiVersion, xApiVersion, journalUpdateDto)

Update journal

Updates an existing journal.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JournalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    JournalsApi apiInstance = new JournalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID journalId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    JournalUpdateDto journalUpdateDto = new JournalUpdateDto(); // JournalUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateJournalAsync(tenantId, journalId, apiVersion, xApiVersion, journalUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JournalsApi#updateJournalAsync");
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
| **journalId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **journalUpdateDto** | [**JournalUpdateDto**](JournalUpdateDto.md)|  | [optional] |

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="updateJournalEntryAsync"></a>
# **updateJournalEntryAsync**
> EmptyEnvelope updateJournalEntryAsync(tenantId, journalId, entryId, apiVersion, xApiVersion, journalEntryUpdateDto)

Update journal entry

Updates a specific journal entry.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JournalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    JournalsApi apiInstance = new JournalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID journalId = UUID.randomUUID(); // UUID | 
    UUID entryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    JournalEntryUpdateDto journalEntryUpdateDto = new JournalEntryUpdateDto(); // JournalEntryUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateJournalEntryAsync(tenantId, journalId, entryId, apiVersion, xApiVersion, journalEntryUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JournalsApi#updateJournalEntryAsync");
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
| **journalId** | **UUID**|  | |
| **entryId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **journalEntryUpdateDto** | [**JournalEntryUpdateDto**](JournalEntryUpdateDto.md)|  | [optional] |

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

