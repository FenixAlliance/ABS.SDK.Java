# BankingApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBank**](BankingApi.md#createBank) | **POST** /api/v2/AccountingService/Banking | Creates a new bank |
| [**createBankAccount**](BankingApi.md#createBankAccount) | **POST** /api/v2/AccountingService/Banking/{bankId}/Accounts | Creates a new bank account |
| [**createBankGuarantee**](BankingApi.md#createBankGuarantee) | **POST** /api/v2/AccountingService/Banking/{bankId}/Guarantees | Creates a new bank guarantee |
| [**createBankTransaction**](BankingApi.md#createBankTransaction) | **POST** /api/v2/AccountingService/Banking/{bankId}/Transactions | Creates a new bank transaction |
| [**deleteBank**](BankingApi.md#deleteBank) | **DELETE** /api/v2/AccountingService/Banking/{bankId} | Deletes a bank |
| [**deleteBankAccount**](BankingApi.md#deleteBankAccount) | **DELETE** /api/v2/AccountingService/Banking/{bankId}/Accounts/{accountId} | Deletes a bank account |
| [**deleteBankGuarantee**](BankingApi.md#deleteBankGuarantee) | **DELETE** /api/v2/AccountingService/Banking/{bankId}/Guarantees/{guaranteeId} | Deletes a bank guarantee |
| [**deleteBankTransaction**](BankingApi.md#deleteBankTransaction) | **DELETE** /api/v2/AccountingService/Banking/{bankId}/Transactions/{transactionId} | Deletes a bank transaction |
| [**getBank**](BankingApi.md#getBank) | **GET** /api/v2/AccountingService/Banking/{bankId} | Gets the current tenant bank |
| [**getBankAccount**](BankingApi.md#getBankAccount) | **GET** /api/v2/AccountingService/Banking/{bankId}/Accounts/{accountId} | Gets the current tenant bank account |
| [**getBankAccounts**](BankingApi.md#getBankAccounts) | **GET** /api/v2/AccountingService/Banking/{bankId}/Accounts | Gets the current tenant bank accounts |
| [**getBankAccountsCount**](BankingApi.md#getBankAccountsCount) | **GET** /api/v2/AccountingService/Banking/{bankId}/Accounts/Count | Gets the current tenant bank accounts count |
| [**getBankGuarantee**](BankingApi.md#getBankGuarantee) | **GET** /api/v2/AccountingService/Banking/{bankId}/Guarantees/{guaranteeId} | Gets the current tenant bank guarantee |
| [**getBankGuarantees**](BankingApi.md#getBankGuarantees) | **GET** /api/v2/AccountingService/Banking/{bankId}/Guarantees | Gets the current tenant bank guarantees |
| [**getBankGuaranteesCount**](BankingApi.md#getBankGuaranteesCount) | **GET** /api/v2/AccountingService/Banking/{bankId}/Guarantees/Count | Gets the current tenant bank guarantees count |
| [**getBankTransaction**](BankingApi.md#getBankTransaction) | **GET** /api/v2/AccountingService/Banking/{bankId}/Transactions/{transactionId} | Gets the current tenant bank transaction |
| [**getBankTransactions**](BankingApi.md#getBankTransactions) | **GET** /api/v2/AccountingService/Banking/{bankId}/Transactions | Gets the current tenant bank transactions |
| [**getBankTransactionsCount**](BankingApi.md#getBankTransactionsCount) | **GET** /api/v2/AccountingService/Banking/{bankId}/Transactions/Count | Gets the current tenant bank transactions count |
| [**getBanks**](BankingApi.md#getBanks) | **GET** /api/v2/AccountingService/Banking | Gets the current tenant banks |
| [**getBanksCount**](BankingApi.md#getBanksCount) | **GET** /api/v2/AccountingService/Banking/Count | Gets the current tenant banks count |
| [**updateBank**](BankingApi.md#updateBank) | **PUT** /api/v2/AccountingService/Banking/{bankId} | Updates a bank |
| [**updateBankAccount**](BankingApi.md#updateBankAccount) | **PUT** /api/v2/AccountingService/Banking/{bankId}/Accounts/{accountId} | Updates a bank account |
| [**updateBankGuarantee**](BankingApi.md#updateBankGuarantee) | **PUT** /api/v2/AccountingService/Banking/{bankId}/Guarantees/{guaranteeId} | Updates a bank guarantee |
| [**updateBankTransaction**](BankingApi.md#updateBankTransaction) | **PUT** /api/v2/AccountingService/Banking/{bankId}/Transactions/{transactionId} | Updates a bank transaction |


<a id="createBank"></a>
# **createBank**
> BankDtoEnvelope createBank(tenantId, apiVersion, xApiVersion, bankCreateDto)

Creates a new bank

Create a new bank.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BankingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BankingApi apiInstance = new BankingApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    BankCreateDto bankCreateDto = new BankCreateDto(); // BankCreateDto | 
    try {
      BankDtoEnvelope result = apiInstance.createBank(tenantId, apiVersion, xApiVersion, bankCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BankingApi#createBank");
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
| **bankCreateDto** | [**BankCreateDto**](BankCreateDto.md)|  | [optional] |

### Return type

[**BankDtoEnvelope**](BankDtoEnvelope.md)

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

<a id="createBankAccount"></a>
# **createBankAccount**
> BankAccountDtoEnvelope createBankAccount(tenantId, bankId, apiVersion, xApiVersion, bankAccountCreateDto)

Creates a new bank account

Create a new bank account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BankingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BankingApi apiInstance = new BankingApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID bankId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    BankAccountCreateDto bankAccountCreateDto = new BankAccountCreateDto(); // BankAccountCreateDto | 
    try {
      BankAccountDtoEnvelope result = apiInstance.createBankAccount(tenantId, bankId, apiVersion, xApiVersion, bankAccountCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BankingApi#createBankAccount");
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
| **bankId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **bankAccountCreateDto** | [**BankAccountCreateDto**](BankAccountCreateDto.md)|  | [optional] |

### Return type

[**BankAccountDtoEnvelope**](BankAccountDtoEnvelope.md)

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

<a id="createBankGuarantee"></a>
# **createBankGuarantee**
> BankGuaranteeDtoEnvelope createBankGuarantee(tenantId, bankId, apiVersion, xApiVersion, bankGuaranteeCreateDto)

Creates a new bank guarantee

Create a new bank guarantee.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BankingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BankingApi apiInstance = new BankingApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID bankId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    BankGuaranteeCreateDto bankGuaranteeCreateDto = new BankGuaranteeCreateDto(); // BankGuaranteeCreateDto | 
    try {
      BankGuaranteeDtoEnvelope result = apiInstance.createBankGuarantee(tenantId, bankId, apiVersion, xApiVersion, bankGuaranteeCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BankingApi#createBankGuarantee");
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
| **bankId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **bankGuaranteeCreateDto** | [**BankGuaranteeCreateDto**](BankGuaranteeCreateDto.md)|  | [optional] |

### Return type

[**BankGuaranteeDtoEnvelope**](BankGuaranteeDtoEnvelope.md)

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

<a id="createBankTransaction"></a>
# **createBankTransaction**
> BankTransactionDtoEnvelope createBankTransaction(tenantId, bankId, apiVersion, xApiVersion, bankTransactionCreateDto)

Creates a new bank transaction

Create a new bank transaction.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BankingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BankingApi apiInstance = new BankingApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID bankId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    BankTransactionCreateDto bankTransactionCreateDto = new BankTransactionCreateDto(); // BankTransactionCreateDto | 
    try {
      BankTransactionDtoEnvelope result = apiInstance.createBankTransaction(tenantId, bankId, apiVersion, xApiVersion, bankTransactionCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BankingApi#createBankTransaction");
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
| **bankId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **bankTransactionCreateDto** | [**BankTransactionCreateDto**](BankTransactionCreateDto.md)|  | [optional] |

### Return type

[**BankTransactionDtoEnvelope**](BankTransactionDtoEnvelope.md)

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

<a id="deleteBank"></a>
# **deleteBank**
> deleteBank(tenantId, bankId, apiVersion, xApiVersion)

Deletes a bank

Delete a bank.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BankingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BankingApi apiInstance = new BankingApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID bankId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteBank(tenantId, bankId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling BankingApi#deleteBank");
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
| **bankId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

null (empty response body)

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
| **404** | Not Found |  -  |

<a id="deleteBankAccount"></a>
# **deleteBankAccount**
> deleteBankAccount(tenantId, bankId, accountId, apiVersion, xApiVersion)

Deletes a bank account

Delete a bank account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BankingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BankingApi apiInstance = new BankingApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID bankId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteBankAccount(tenantId, bankId, accountId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling BankingApi#deleteBankAccount");
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
| **bankId** | **UUID**|  | |
| **accountId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

null (empty response body)

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
| **404** | Not Found |  -  |

<a id="deleteBankGuarantee"></a>
# **deleteBankGuarantee**
> deleteBankGuarantee(tenantId, bankId, guaranteeId, apiVersion, xApiVersion)

Deletes a bank guarantee

Delete a bank guarantee.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BankingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BankingApi apiInstance = new BankingApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID bankId = UUID.randomUUID(); // UUID | 
    UUID guaranteeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteBankGuarantee(tenantId, bankId, guaranteeId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling BankingApi#deleteBankGuarantee");
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
| **bankId** | **UUID**|  | |
| **guaranteeId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

null (empty response body)

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
| **404** | Not Found |  -  |

<a id="deleteBankTransaction"></a>
# **deleteBankTransaction**
> deleteBankTransaction(tenantId, bankId, transactionId, apiVersion, xApiVersion)

Deletes a bank transaction

Delete a bank transaction.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BankingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BankingApi apiInstance = new BankingApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID bankId = UUID.randomUUID(); // UUID | 
    UUID transactionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteBankTransaction(tenantId, bankId, transactionId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling BankingApi#deleteBankTransaction");
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
| **bankId** | **UUID**|  | |
| **transactionId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

null (empty response body)

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
| **404** | Not Found |  -  |

<a id="getBank"></a>
# **getBank**
> BankDtoEnvelope getBank(tenantId, bankId, apiVersion, xApiVersion)

Gets the current tenant bank

Get the currently acting tenant bank.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BankingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BankingApi apiInstance = new BankingApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID bankId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      BankDtoEnvelope result = apiInstance.getBank(tenantId, bankId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BankingApi#getBank");
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
| **bankId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**BankDtoEnvelope**](BankDtoEnvelope.md)

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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getBankAccount"></a>
# **getBankAccount**
> BankAccountDtoEnvelope getBankAccount(tenantId, bankId, accountId, apiVersion, xApiVersion)

Gets the current tenant bank account

Get the currently acting tenant bank account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BankingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BankingApi apiInstance = new BankingApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID bankId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      BankAccountDtoEnvelope result = apiInstance.getBankAccount(tenantId, bankId, accountId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BankingApi#getBankAccount");
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
| **bankId** | **UUID**|  | |
| **accountId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**BankAccountDtoEnvelope**](BankAccountDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getBankAccounts"></a>
# **getBankAccounts**
> BankAccountDtoListEnvelope getBankAccounts(tenantId, bankId, apiVersion, xApiVersion)

Gets the current tenant bank accounts

Get the currently acting tenant bank accounts.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BankingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BankingApi apiInstance = new BankingApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID bankId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      BankAccountDtoListEnvelope result = apiInstance.getBankAccounts(tenantId, bankId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BankingApi#getBankAccounts");
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
| **bankId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**BankAccountDtoListEnvelope**](BankAccountDtoListEnvelope.md)

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

<a id="getBankAccountsCount"></a>
# **getBankAccountsCount**
> Int32Envelope getBankAccountsCount(tenantId, bankId, apiVersion, xApiVersion)

Gets the current tenant bank accounts count

Get the currently acting tenant bank accounts count.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BankingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BankingApi apiInstance = new BankingApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID bankId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getBankAccountsCount(tenantId, bankId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BankingApi#getBankAccountsCount");
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
| **bankId** | **UUID**|  | |
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

<a id="getBankGuarantee"></a>
# **getBankGuarantee**
> BankGuaranteeDtoEnvelope getBankGuarantee(tenantId, bankId, guaranteeId, apiVersion, xApiVersion)

Gets the current tenant bank guarantee

Get the currently acting tenant bank guarantee.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BankingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BankingApi apiInstance = new BankingApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID bankId = UUID.randomUUID(); // UUID | 
    UUID guaranteeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      BankGuaranteeDtoEnvelope result = apiInstance.getBankGuarantee(tenantId, bankId, guaranteeId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BankingApi#getBankGuarantee");
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
| **bankId** | **UUID**|  | |
| **guaranteeId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**BankGuaranteeDtoEnvelope**](BankGuaranteeDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getBankGuarantees"></a>
# **getBankGuarantees**
> BankGuaranteeDtoListEnvelope getBankGuarantees(tenantId, bankId, apiVersion, xApiVersion)

Gets the current tenant bank guarantees

Get the currently acting tenant bank guarantees.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BankingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BankingApi apiInstance = new BankingApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID bankId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      BankGuaranteeDtoListEnvelope result = apiInstance.getBankGuarantees(tenantId, bankId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BankingApi#getBankGuarantees");
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
| **bankId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**BankGuaranteeDtoListEnvelope**](BankGuaranteeDtoListEnvelope.md)

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

<a id="getBankGuaranteesCount"></a>
# **getBankGuaranteesCount**
> Int32Envelope getBankGuaranteesCount(tenantId, bankId, apiVersion, xApiVersion)

Gets the current tenant bank guarantees count

Get the currently acting tenant bank guarantees count.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BankingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BankingApi apiInstance = new BankingApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID bankId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getBankGuaranteesCount(tenantId, bankId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BankingApi#getBankGuaranteesCount");
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
| **bankId** | **UUID**|  | |
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

<a id="getBankTransaction"></a>
# **getBankTransaction**
> BankTransactionDtoEnvelope getBankTransaction(tenantId, bankId, transactionId, apiVersion, xApiVersion)

Gets the current tenant bank transaction

Get the currently acting tenant bank transaction.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BankingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BankingApi apiInstance = new BankingApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID bankId = UUID.randomUUID(); // UUID | 
    UUID transactionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      BankTransactionDtoEnvelope result = apiInstance.getBankTransaction(tenantId, bankId, transactionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BankingApi#getBankTransaction");
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
| **bankId** | **UUID**|  | |
| **transactionId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**BankTransactionDtoEnvelope**](BankTransactionDtoEnvelope.md)

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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getBankTransactions"></a>
# **getBankTransactions**
> BankTransactionDtoListEnvelope getBankTransactions(tenantId, bankId, apiVersion, xApiVersion)

Gets the current tenant bank transactions

Get the currently acting tenant bank transactions.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BankingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BankingApi apiInstance = new BankingApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID bankId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      BankTransactionDtoListEnvelope result = apiInstance.getBankTransactions(tenantId, bankId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BankingApi#getBankTransactions");
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
| **bankId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**BankTransactionDtoListEnvelope**](BankTransactionDtoListEnvelope.md)

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

<a id="getBankTransactionsCount"></a>
# **getBankTransactionsCount**
> Int32Envelope getBankTransactionsCount(tenantId, bankId, apiVersion, xApiVersion)

Gets the current tenant bank transactions count

Get the currently acting tenant bank transactions count.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BankingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BankingApi apiInstance = new BankingApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID bankId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getBankTransactionsCount(tenantId, bankId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BankingApi#getBankTransactionsCount");
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
| **bankId** | **UUID**|  | |
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

<a id="getBanks"></a>
# **getBanks**
> BankDtoListEnvelope getBanks(tenantId, apiVersion, xApiVersion)

Gets the current tenant banks

Get the currently acting tenant banks.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BankingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BankingApi apiInstance = new BankingApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      BankDtoListEnvelope result = apiInstance.getBanks(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BankingApi#getBanks");
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

[**BankDtoListEnvelope**](BankDtoListEnvelope.md)

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

<a id="getBanksCount"></a>
# **getBanksCount**
> Int32Envelope getBanksCount(tenantId, apiVersion, xApiVersion)

Gets the current tenant banks count

Get the currently acting tenant banks count.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BankingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BankingApi apiInstance = new BankingApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getBanksCount(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BankingApi#getBanksCount");
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

<a id="updateBank"></a>
# **updateBank**
> BankDtoEnvelope updateBank(tenantId, bankId, apiVersion, xApiVersion, bankUpdateDto)

Updates a bank

Update a bank.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BankingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BankingApi apiInstance = new BankingApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID bankId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    BankUpdateDto bankUpdateDto = new BankUpdateDto(); // BankUpdateDto | 
    try {
      BankDtoEnvelope result = apiInstance.updateBank(tenantId, bankId, apiVersion, xApiVersion, bankUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BankingApi#updateBank");
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
| **bankId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **bankUpdateDto** | [**BankUpdateDto**](BankUpdateDto.md)|  | [optional] |

### Return type

[**BankDtoEnvelope**](BankDtoEnvelope.md)

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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="updateBankAccount"></a>
# **updateBankAccount**
> BankAccountDtoEnvelope updateBankAccount(tenantId, bankId, accountId, apiVersion, xApiVersion, bankAccountUpdateDto)

Updates a bank account

Update a bank account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BankingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BankingApi apiInstance = new BankingApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID bankId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    BankAccountUpdateDto bankAccountUpdateDto = new BankAccountUpdateDto(); // BankAccountUpdateDto | 
    try {
      BankAccountDtoEnvelope result = apiInstance.updateBankAccount(tenantId, bankId, accountId, apiVersion, xApiVersion, bankAccountUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BankingApi#updateBankAccount");
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
| **bankId** | **UUID**|  | |
| **accountId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **bankAccountUpdateDto** | [**BankAccountUpdateDto**](BankAccountUpdateDto.md)|  | [optional] |

### Return type

[**BankAccountDtoEnvelope**](BankAccountDtoEnvelope.md)

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

<a id="updateBankGuarantee"></a>
# **updateBankGuarantee**
> BankGuaranteeDtoEnvelope updateBankGuarantee(tenantId, bankId, guaranteeId, apiVersion, xApiVersion, bankGuaranteeUpdateDto)

Updates a bank guarantee

Update a bank guarantee.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BankingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BankingApi apiInstance = new BankingApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID bankId = UUID.randomUUID(); // UUID | 
    UUID guaranteeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    BankGuaranteeUpdateDto bankGuaranteeUpdateDto = new BankGuaranteeUpdateDto(); // BankGuaranteeUpdateDto | 
    try {
      BankGuaranteeDtoEnvelope result = apiInstance.updateBankGuarantee(tenantId, bankId, guaranteeId, apiVersion, xApiVersion, bankGuaranteeUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BankingApi#updateBankGuarantee");
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
| **bankId** | **UUID**|  | |
| **guaranteeId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **bankGuaranteeUpdateDto** | [**BankGuaranteeUpdateDto**](BankGuaranteeUpdateDto.md)|  | [optional] |

### Return type

[**BankGuaranteeDtoEnvelope**](BankGuaranteeDtoEnvelope.md)

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

<a id="updateBankTransaction"></a>
# **updateBankTransaction**
> BankTransactionDtoEnvelope updateBankTransaction(tenantId, bankId, transactionId, apiVersion, xApiVersion, bankTransactionUpdateDto)

Updates a bank transaction

Update a bank transaction.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BankingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BankingApi apiInstance = new BankingApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID bankId = UUID.randomUUID(); // UUID | 
    UUID transactionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    BankTransactionUpdateDto bankTransactionUpdateDto = new BankTransactionUpdateDto(); // BankTransactionUpdateDto | 
    try {
      BankTransactionDtoEnvelope result = apiInstance.updateBankTransaction(tenantId, bankId, transactionId, apiVersion, xApiVersion, bankTransactionUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BankingApi#updateBankTransaction");
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
| **bankId** | **UUID**|  | |
| **transactionId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **bankTransactionUpdateDto** | [**BankTransactionUpdateDto**](BankTransactionUpdateDto.md)|  | [optional] |

### Return type

[**BankTransactionDtoEnvelope**](BankTransactionDtoEnvelope.md)

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

