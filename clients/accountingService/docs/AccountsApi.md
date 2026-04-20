# AccountsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**balanceAccountAsync**](AccountsApi.md#balanceAccountAsync) | **POST** /api/v2/AccountingService/Accounts/{accountId}/Balance | Balance account |
| [**balanceRootAccountAsync**](AccountsApi.md#balanceRootAccountAsync) | **POST** /api/v2/AccountingService/Accounts/Root/Balance | Balance root account |
| [**createAccountAsync**](AccountsApi.md#createAccountAsync) | **POST** /api/v2/AccountingService/Accounts | Get root accounts |
| [**createAccountCreditAsync**](AccountsApi.md#createAccountCreditAsync) | **POST** /api/v2/AccountingService/Accounts/{accountId}/Credits | Create account credit |
| [**createAccountDebitAsync**](AccountsApi.md#createAccountDebitAsync) | **POST** /api/v2/AccountingService/Accounts/{accountId}/Debits | Create account debit |
| [**createAccountEntryAsync**](AccountsApi.md#createAccountEntryAsync) | **POST** /api/v2/AccountingService/Accounts/{accountId}/Entries | Create account entry |
| [**createAccountRelationAsync**](AccountsApi.md#createAccountRelationAsync) | **POST** /api/v2/AccountingService/Accounts/Relations | Create account relation |
| [**createAccountTypeAsync**](AccountsApi.md#createAccountTypeAsync) | **POST** /api/v2/AccountingService/Accounts/Types | Create account type |
| [**deleteAccountAsync**](AccountsApi.md#deleteAccountAsync) | **DELETE** /api/v2/AccountingService/Accounts/{accountId} | Delete an account |
| [**deleteAccountEntryAsync**](AccountsApi.md#deleteAccountEntryAsync) | **DELETE** /api/v2/AccountingService/Accounts/{accountId}/Entries/{entryId} | Delete account entry |
| [**deleteAccountRelationAsync**](AccountsApi.md#deleteAccountRelationAsync) | **DELETE** /api/v2/AccountingService/Accounts/Relations/{accountRelationId} | Delete account relation |
| [**deleteAccountTypeAsync**](AccountsApi.md#deleteAccountTypeAsync) | **DELETE** /api/v2/AccountingService/Accounts/Types/{accountTypeId} | Delete account type |
| [**getAccountAggregateAsync**](AccountsApi.md#getAccountAggregateAsync) | **POST** /api/v2/AccountingService/Accounts/Aggregate | Get account aggregate |
| [**getAccountCreditsAsync**](AccountsApi.md#getAccountCreditsAsync) | **GET** /api/v2/AccountingService/Accounts/{accountId}/Credits | Get account credits |
| [**getAccountCreditsCountAsync**](AccountsApi.md#getAccountCreditsCountAsync) | **GET** /api/v2/AccountingService/Accounts/{accountId}/Credits/Count | Get account credits count |
| [**getAccountDebitsAsync**](AccountsApi.md#getAccountDebitsAsync) | **GET** /api/v2/AccountingService/Accounts/{accountId}/Debits | Get account debits |
| [**getAccountDebitsCountAsync**](AccountsApi.md#getAccountDebitsCountAsync) | **GET** /api/v2/AccountingService/Accounts/{accountId}/Debits/Count | Get account debits count |
| [**getAccountDetailsAsync**](AccountsApi.md#getAccountDetailsAsync) | **GET** /api/v2/AccountingService/Accounts/{accountId} | Get account details |
| [**getAccountEntriesAsync**](AccountsApi.md#getAccountEntriesAsync) | **GET** /api/v2/AccountingService/Accounts/{accountId}/Entries | Get account entries |
| [**getAccountEntryAsync**](AccountsApi.md#getAccountEntryAsync) | **GET** /api/v2/AccountingService/Accounts/{accountId}/Entries/{entryId} | Get account entry |
| [**getAccountRelationsAsync**](AccountsApi.md#getAccountRelationsAsync) | **GET** /api/v2/AccountingService/Accounts/Relations | Get account relations |
| [**getAccountRelationsCountAsync**](AccountsApi.md#getAccountRelationsCountAsync) | **GET** /api/v2/AccountingService/Accounts/Relations/Count | Get account relations count |
| [**getAccountTypesAsync**](AccountsApi.md#getAccountTypesAsync) | **GET** /api/v2/AccountingService/Accounts/Types | Get account types |
| [**getAccountTypesCountAsync**](AccountsApi.md#getAccountTypesCountAsync) | **GET** /api/v2/AccountingService/Accounts/Types/Count | Get account types count |
| [**getAccountsAsync**](AccountsApi.md#getAccountsAsync) | **GET** /api/v2/AccountingService/Accounts | Creates a new account |
| [**getAccountsCountAsync**](AccountsApi.md#getAccountsCountAsync) | **GET** /api/v2/AccountingService/Accounts/Count | Get the number of accounts |
| [**getChildAccountsAsync**](AccountsApi.md#getChildAccountsAsync) | **GET** /api/v2/AccountingService/Accounts/{accountId}/Children | Get child accounts |
| [**getCreditAccountEntriesAsync**](AccountsApi.md#getCreditAccountEntriesAsync) | **GET** /api/v2/AccountingService/Accounts/{accountId}/Entries/Credit | Get credit account entries |
| [**getDebitAccountEntriesAsync**](AccountsApi.md#getDebitAccountEntriesAsync) | **GET** /api/v2/AccountingService/Accounts/{accountId}/Entries/Debit | Get debit account entries |
| [**getRootAccountsAsync**](AccountsApi.md#getRootAccountsAsync) | **GET** /api/v2/AccountingService/Accounts/Root | Get root accounts |
| [**patchAccountAsync**](AccountsApi.md#patchAccountAsync) | **PATCH** /api/v2/AccountingService/Accounts/{accountId} | Patch an account |
| [**updateAccountAsync**](AccountsApi.md#updateAccountAsync) | **PUT** /api/v2/AccountingService/Accounts/{accountId} | Update an account |
| [**updateAccountEntryAsync**](AccountsApi.md#updateAccountEntryAsync) | **PUT** /api/v2/AccountingService/Accounts/{accountId}/Entries/{entryId} | Update account entry |
| [**updateAccountRelationAsync**](AccountsApi.md#updateAccountRelationAsync) | **PUT** /api/v2/AccountingService/Accounts/Relations/{accountRelationId} | Update account relation |
| [**updateAccountTypeAsync**](AccountsApi.md#updateAccountTypeAsync) | **PUT** /api/v2/AccountingService/Accounts/Types/{accountTypeId} | Update account type |


<a id="balanceAccountAsync"></a>
# **balanceAccountAsync**
> AccountDtoEnvelope balanceAccountAsync(tenantId, accountId, apiVersion, xApiVersion)

Balance account

Balance account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      AccountDtoEnvelope result = apiInstance.balanceAccountAsync(tenantId, accountId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#balanceAccountAsync");
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
| **accountId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**AccountDtoEnvelope**](AccountDtoEnvelope.md)

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

<a id="balanceRootAccountAsync"></a>
# **balanceRootAccountAsync**
> AccountDtoListEnvelope balanceRootAccountAsync(tenantId, apiVersion, xApiVersion)

Balance root account

Balance root account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      AccountDtoListEnvelope result = apiInstance.balanceRootAccountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#balanceRootAccountAsync");
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

[**AccountDtoListEnvelope**](AccountDtoListEnvelope.md)

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

<a id="createAccountAsync"></a>
# **createAccountAsync**
> AccountDtoListEnvelope createAccountAsync(tenantId, apiVersion, xApiVersion, accountCreateDto)

Get root accounts

Get root accounts.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    AccountCreateDto accountCreateDto = new AccountCreateDto(); // AccountCreateDto | 
    try {
      AccountDtoListEnvelope result = apiInstance.createAccountAsync(tenantId, apiVersion, xApiVersion, accountCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#createAccountAsync");
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
| **accountCreateDto** | [**AccountCreateDto**](AccountCreateDto.md)|  | [optional] |

### Return type

[**AccountDtoListEnvelope**](AccountDtoListEnvelope.md)

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

<a id="createAccountCreditAsync"></a>
# **createAccountCreditAsync**
> AccountingEntryDtoListEnvelope createAccountCreditAsync(tenantId, accountId, apiVersion, xApiVersion, accountingEntryCreateDto)

Create account credit

Create account credit.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    AccountingEntryCreateDto accountingEntryCreateDto = new AccountingEntryCreateDto(); // AccountingEntryCreateDto | 
    try {
      AccountingEntryDtoListEnvelope result = apiInstance.createAccountCreditAsync(tenantId, accountId, apiVersion, xApiVersion, accountingEntryCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#createAccountCreditAsync");
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
| **accountId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **accountingEntryCreateDto** | [**AccountingEntryCreateDto**](AccountingEntryCreateDto.md)|  | [optional] |

### Return type

[**AccountingEntryDtoListEnvelope**](AccountingEntryDtoListEnvelope.md)

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

<a id="createAccountDebitAsync"></a>
# **createAccountDebitAsync**
> AccountingEntryDtoListEnvelope createAccountDebitAsync(tenantId, accountId, apiVersion, xApiVersion, accountingEntryCreateDto)

Create account debit

Create account debit.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    AccountingEntryCreateDto accountingEntryCreateDto = new AccountingEntryCreateDto(); // AccountingEntryCreateDto | 
    try {
      AccountingEntryDtoListEnvelope result = apiInstance.createAccountDebitAsync(tenantId, accountId, apiVersion, xApiVersion, accountingEntryCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#createAccountDebitAsync");
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
| **accountId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **accountingEntryCreateDto** | [**AccountingEntryCreateDto**](AccountingEntryCreateDto.md)|  | [optional] |

### Return type

[**AccountingEntryDtoListEnvelope**](AccountingEntryDtoListEnvelope.md)

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

<a id="createAccountEntryAsync"></a>
# **createAccountEntryAsync**
> AccountingEntryDtoEnvelope createAccountEntryAsync(tenantId, accountId, apiVersion, xApiVersion, accountingEntryCreateDto)

Create account entry

Create account entry.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    AccountingEntryCreateDto accountingEntryCreateDto = new AccountingEntryCreateDto(); // AccountingEntryCreateDto | 
    try {
      AccountingEntryDtoEnvelope result = apiInstance.createAccountEntryAsync(tenantId, accountId, apiVersion, xApiVersion, accountingEntryCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#createAccountEntryAsync");
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
| **accountId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **accountingEntryCreateDto** | [**AccountingEntryCreateDto**](AccountingEntryCreateDto.md)|  | [optional] |

### Return type

[**AccountingEntryDtoEnvelope**](AccountingEntryDtoEnvelope.md)

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

<a id="createAccountRelationAsync"></a>
# **createAccountRelationAsync**
> EmptyEnvelope createAccountRelationAsync(tenantId, accountId, apiVersion, xApiVersion, accountRelationCreateDto)

Create account relation

Create account relation.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    AccountRelationCreateDto accountRelationCreateDto = new AccountRelationCreateDto(); // AccountRelationCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createAccountRelationAsync(tenantId, accountId, apiVersion, xApiVersion, accountRelationCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#createAccountRelationAsync");
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
| **accountId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **accountRelationCreateDto** | [**AccountRelationCreateDto**](AccountRelationCreateDto.md)|  | [optional] |

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

<a id="createAccountTypeAsync"></a>
# **createAccountTypeAsync**
> EmptyEnvelope createAccountTypeAsync(tenantId, accountId, apiVersion, xApiVersion, accountTypeCreateDto)

Create account type

Create account type.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    AccountTypeCreateDto accountTypeCreateDto = new AccountTypeCreateDto(); // AccountTypeCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createAccountTypeAsync(tenantId, accountId, apiVersion, xApiVersion, accountTypeCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#createAccountTypeAsync");
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
| **accountId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **accountTypeCreateDto** | [**AccountTypeCreateDto**](AccountTypeCreateDto.md)|  | [optional] |

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

<a id="deleteAccountAsync"></a>
# **deleteAccountAsync**
> EmptyEnvelope deleteAccountAsync(tenantId, accountId, apiVersion, xApiVersion)

Delete an account

Delete an account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteAccountAsync(tenantId, accountId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#deleteAccountAsync");
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
| **accountId** | **UUID**|  | |
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
| **200** | OK |  -  |

<a id="deleteAccountEntryAsync"></a>
# **deleteAccountEntryAsync**
> EmptyEnvelope deleteAccountEntryAsync(tenantId, accountId, entryId, apiVersion, xApiVersion)

Delete account entry

Delete account entry.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    UUID entryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteAccountEntryAsync(tenantId, accountId, entryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#deleteAccountEntryAsync");
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
| **accountId** | **UUID**|  | |
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
| **403** | Forbidden |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |

<a id="deleteAccountRelationAsync"></a>
# **deleteAccountRelationAsync**
> EmptyEnvelope deleteAccountRelationAsync(tenantId, accountRelationId, accountId, apiVersion, xApiVersion)

Delete account relation

Delete account relation.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID accountRelationId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteAccountRelationAsync(tenantId, accountRelationId, accountId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#deleteAccountRelationAsync");
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
| **accountRelationId** | **UUID**|  | |
| **accountId** | **UUID**|  | |
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
| **200** | OK |  -  |

<a id="deleteAccountTypeAsync"></a>
# **deleteAccountTypeAsync**
> EmptyEnvelope deleteAccountTypeAsync(tenantId, accountTypeId, accountId, apiVersion, xApiVersion)

Delete account type

Delete account type.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID accountTypeId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteAccountTypeAsync(tenantId, accountTypeId, accountId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#deleteAccountTypeAsync");
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
| **accountTypeId** | **UUID**|  | |
| **accountId** | **UUID**|  | |
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
| **200** | OK |  -  |

<a id="getAccountAggregateAsync"></a>
# **getAccountAggregateAsync**
> AccountingEntryDtoListEnvelope getAccountAggregateAsync(tenantId, currencyId, apiVersion, xApiVersion, accountDto)

Get account aggregate

Get account aggregate.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String currencyId = "currencyId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    List<AccountDto> accountDto = Arrays.asList(); // List<AccountDto> | 
    try {
      AccountingEntryDtoListEnvelope result = apiInstance.getAccountAggregateAsync(tenantId, currencyId, apiVersion, xApiVersion, accountDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getAccountAggregateAsync");
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
| **currencyId** | **String**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **accountDto** | [**List&lt;AccountDto&gt;**](AccountDto.md)|  | [optional] |

### Return type

[**AccountingEntryDtoListEnvelope**](AccountingEntryDtoListEnvelope.md)

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

<a id="getAccountCreditsAsync"></a>
# **getAccountCreditsAsync**
> AccountingEntryDtoListEnvelope getAccountCreditsAsync(tenantId, accountId, apiVersion, xApiVersion)

Get account credits

Get account credits.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      AccountingEntryDtoListEnvelope result = apiInstance.getAccountCreditsAsync(tenantId, accountId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getAccountCreditsAsync");
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
| **accountId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**AccountingEntryDtoListEnvelope**](AccountingEntryDtoListEnvelope.md)

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

<a id="getAccountCreditsCountAsync"></a>
# **getAccountCreditsCountAsync**
> Int32Envelope getAccountCreditsCountAsync(tenantId, accountId, apiVersion, xApiVersion)

Get account credits count

Get account credits count.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getAccountCreditsCountAsync(tenantId, accountId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getAccountCreditsCountAsync");
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
| **accountId** | **UUID**|  | |
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

<a id="getAccountDebitsAsync"></a>
# **getAccountDebitsAsync**
> AccountingEntryDtoListEnvelope getAccountDebitsAsync(tenantId, accountId, apiVersion, xApiVersion)

Get account debits

Get account debits.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      AccountingEntryDtoListEnvelope result = apiInstance.getAccountDebitsAsync(tenantId, accountId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getAccountDebitsAsync");
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
| **accountId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**AccountingEntryDtoListEnvelope**](AccountingEntryDtoListEnvelope.md)

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

<a id="getAccountDebitsCountAsync"></a>
# **getAccountDebitsCountAsync**
> Int32Envelope getAccountDebitsCountAsync(tenantId, accountId, apiVersion, xApiVersion)

Get account debits count

Get account debits count.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getAccountDebitsCountAsync(tenantId, accountId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getAccountDebitsCountAsync");
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
| **accountId** | **UUID**|  | |
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

<a id="getAccountDetailsAsync"></a>
# **getAccountDetailsAsync**
> AccountDtoEnvelope getAccountDetailsAsync(tenantId, accountId, apiVersion, xApiVersion)

Get account details

Get account details.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      AccountDtoEnvelope result = apiInstance.getAccountDetailsAsync(tenantId, accountId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getAccountDetailsAsync");
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
| **accountId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**AccountDtoEnvelope**](AccountDtoEnvelope.md)

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

<a id="getAccountEntriesAsync"></a>
# **getAccountEntriesAsync**
> AccountingEntryDtoListEnvelope getAccountEntriesAsync(tenantId, accountId, apiVersion, xApiVersion)

Get account entries

Get account entries.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      AccountingEntryDtoListEnvelope result = apiInstance.getAccountEntriesAsync(tenantId, accountId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getAccountEntriesAsync");
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
| **accountId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**AccountingEntryDtoListEnvelope**](AccountingEntryDtoListEnvelope.md)

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

<a id="getAccountEntryAsync"></a>
# **getAccountEntryAsync**
> AccountingEntryDtoEnvelope getAccountEntryAsync(tenantId, accountId, entryId, apiVersion, xApiVersion)

Get account entry

Get account entry.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    UUID entryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      AccountingEntryDtoEnvelope result = apiInstance.getAccountEntryAsync(tenantId, accountId, entryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getAccountEntryAsync");
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
| **accountId** | **UUID**|  | |
| **entryId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**AccountingEntryDtoEnvelope**](AccountingEntryDtoEnvelope.md)

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

<a id="getAccountRelationsAsync"></a>
# **getAccountRelationsAsync**
> AccountRelationDtoListEnvelope getAccountRelationsAsync(tenantId, accountId, apiVersion, xApiVersion)

Get account relations

Get account relations.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      AccountRelationDtoListEnvelope result = apiInstance.getAccountRelationsAsync(tenantId, accountId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getAccountRelationsAsync");
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
| **accountId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**AccountRelationDtoListEnvelope**](AccountRelationDtoListEnvelope.md)

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

<a id="getAccountRelationsCountAsync"></a>
# **getAccountRelationsCountAsync**
> Int32Envelope getAccountRelationsCountAsync(tenantId, accountId, apiVersion, xApiVersion)

Get account relations count

Get account relations count.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getAccountRelationsCountAsync(tenantId, accountId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getAccountRelationsCountAsync");
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
| **accountId** | **UUID**|  | |
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

<a id="getAccountTypesAsync"></a>
# **getAccountTypesAsync**
> AccountTypeDtoListEnvelope getAccountTypesAsync(tenantId, accountTypeId, apiVersion, xApiVersion)

Get account types

Get account types.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID accountTypeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      AccountTypeDtoListEnvelope result = apiInstance.getAccountTypesAsync(tenantId, accountTypeId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getAccountTypesAsync");
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
| **accountTypeId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**AccountTypeDtoListEnvelope**](AccountTypeDtoListEnvelope.md)

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

<a id="getAccountTypesCountAsync"></a>
# **getAccountTypesCountAsync**
> Int32Envelope getAccountTypesCountAsync(tenantId, accountTypeId, apiVersion, xApiVersion)

Get account types count

Get account types count.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID accountTypeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getAccountTypesCountAsync(tenantId, accountTypeId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getAccountTypesCountAsync");
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
| **accountTypeId** | **UUID**|  | |
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

<a id="getAccountsAsync"></a>
# **getAccountsAsync**
> AccountDtoListEnvelope getAccountsAsync(tenantId, apiVersion, xApiVersion)

Creates a new account

Creates a new account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      AccountDtoListEnvelope result = apiInstance.getAccountsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getAccountsAsync");
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

[**AccountDtoListEnvelope**](AccountDtoListEnvelope.md)

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

<a id="getAccountsCountAsync"></a>
# **getAccountsCountAsync**
> Int32Envelope getAccountsCountAsync(tenantId, apiVersion, xApiVersion)

Get the number of accounts

Get the number of accounts.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getAccountsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getAccountsCountAsync");
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
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getChildAccountsAsync"></a>
# **getChildAccountsAsync**
> AccountDtoListEnvelope getChildAccountsAsync(tenantId, accountId, apiVersion, xApiVersion)

Get child accounts

Get child accounts.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      AccountDtoListEnvelope result = apiInstance.getChildAccountsAsync(tenantId, accountId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getChildAccountsAsync");
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
| **accountId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**AccountDtoListEnvelope**](AccountDtoListEnvelope.md)

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

<a id="getCreditAccountEntriesAsync"></a>
# **getCreditAccountEntriesAsync**
> AccountingEntryDtoListEnvelope getCreditAccountEntriesAsync(tenantId, accountId, apiVersion, xApiVersion)

Get credit account entries

Get credit account entries.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      AccountingEntryDtoListEnvelope result = apiInstance.getCreditAccountEntriesAsync(tenantId, accountId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getCreditAccountEntriesAsync");
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
| **accountId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**AccountingEntryDtoListEnvelope**](AccountingEntryDtoListEnvelope.md)

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

<a id="getDebitAccountEntriesAsync"></a>
# **getDebitAccountEntriesAsync**
> AccountingEntryDtoListEnvelope getDebitAccountEntriesAsync(tenantId, accountId, apiVersion, xApiVersion)

Get debit account entries

Get debit account entries.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      AccountingEntryDtoListEnvelope result = apiInstance.getDebitAccountEntriesAsync(tenantId, accountId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getDebitAccountEntriesAsync");
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
| **accountId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**AccountingEntryDtoListEnvelope**](AccountingEntryDtoListEnvelope.md)

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

<a id="getRootAccountsAsync"></a>
# **getRootAccountsAsync**
> AccountDtoListEnvelope getRootAccountsAsync(tenantId, apiVersion, xApiVersion)

Get root accounts

Get root accounts.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      AccountDtoListEnvelope result = apiInstance.getRootAccountsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getRootAccountsAsync");
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

[**AccountDtoListEnvelope**](AccountDtoListEnvelope.md)

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

<a id="patchAccountAsync"></a>
# **patchAccountAsync**
> EmptyEnvelope patchAccountAsync(tenantId, accountId, apiVersion, xApiVersion, operation)

Patch an account

Patch an account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    List<Operation> operation = Arrays.asList(); // List<Operation> | 
    try {
      EmptyEnvelope result = apiInstance.patchAccountAsync(tenantId, accountId, apiVersion, xApiVersion, operation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#patchAccountAsync");
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
| **accountId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **operation** | [**List&lt;Operation&gt;**](Operation.md)|  | [optional] |

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

<a id="updateAccountAsync"></a>
# **updateAccountAsync**
> AccountDtoEnvelope updateAccountAsync(tenantId, accountId, apiVersion, xApiVersion, accountUpdateDto)

Update an account

Update an account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    AccountUpdateDto accountUpdateDto = new AccountUpdateDto(); // AccountUpdateDto | 
    try {
      AccountDtoEnvelope result = apiInstance.updateAccountAsync(tenantId, accountId, apiVersion, xApiVersion, accountUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#updateAccountAsync");
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
| **accountId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **accountUpdateDto** | [**AccountUpdateDto**](AccountUpdateDto.md)|  | [optional] |

### Return type

[**AccountDtoEnvelope**](AccountDtoEnvelope.md)

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

<a id="updateAccountEntryAsync"></a>
# **updateAccountEntryAsync**
> EmptyEnvelope updateAccountEntryAsync(tenantId, accountId, entryId, apiVersion, xApiVersion, accountingEntryUpdateDto)

Update account entry

Update account entry.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    UUID entryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    AccountingEntryUpdateDto accountingEntryUpdateDto = new AccountingEntryUpdateDto(); // AccountingEntryUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateAccountEntryAsync(tenantId, accountId, entryId, apiVersion, xApiVersion, accountingEntryUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#updateAccountEntryAsync");
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
| **accountId** | **UUID**|  | |
| **entryId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **accountingEntryUpdateDto** | [**AccountingEntryUpdateDto**](AccountingEntryUpdateDto.md)|  | [optional] |

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

<a id="updateAccountRelationAsync"></a>
# **updateAccountRelationAsync**
> EmptyEnvelope updateAccountRelationAsync(tenantId, accountRelationId, accountId, apiVersion, xApiVersion, accountRelationUpdateDto)

Update account relation

Update account relation.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID accountRelationId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    AccountRelationUpdateDto accountRelationUpdateDto = new AccountRelationUpdateDto(); // AccountRelationUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateAccountRelationAsync(tenantId, accountRelationId, accountId, apiVersion, xApiVersion, accountRelationUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#updateAccountRelationAsync");
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
| **accountRelationId** | **UUID**|  | |
| **accountId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **accountRelationUpdateDto** | [**AccountRelationUpdateDto**](AccountRelationUpdateDto.md)|  | [optional] |

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

<a id="updateAccountTypeAsync"></a>
# **updateAccountTypeAsync**
> EmptyEnvelope updateAccountTypeAsync(tenantId, accountTypeId, accountId, apiVersion, xApiVersion, accountTypeUpdateDto)

Update account type

Update account type.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID accountTypeId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    AccountTypeUpdateDto accountTypeUpdateDto = new AccountTypeUpdateDto(); // AccountTypeUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateAccountTypeAsync(tenantId, accountTypeId, accountId, apiVersion, xApiVersion, accountTypeUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#updateAccountTypeAsync");
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
| **accountTypeId** | **UUID**|  | |
| **accountId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **accountTypeUpdateDto** | [**AccountTypeUpdateDto**](AccountTypeUpdateDto.md)|  | [optional] |

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

