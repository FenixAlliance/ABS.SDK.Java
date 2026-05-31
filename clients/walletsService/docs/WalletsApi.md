# WalletsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createWalletBankAccountAsync**](WalletsApi.md#createWalletBankAccountAsync) | **POST** /api/v2/WalletsService/Wallets/{walletId}/BankAccounts | Create Wallet Bank Account |
| [**createWalletLocationAsync**](WalletsApi.md#createWalletLocationAsync) | **POST** /api/v2/WalletsService/Wallets/{walletId}/Locations | Create Wallet Location |
| [**createWalletPaymentAsync**](WalletsApi.md#createWalletPaymentAsync) | **POST** /api/v2/WalletsService/Wallets/{walletId}/Payments | Create Wallet Payment |
| [**createWalletTokenAsync**](WalletsApi.md#createWalletTokenAsync) | **POST** /api/v2/WalletsService/Wallets/{walletId}/Tokens | Create Wallet Token |
| [**createWalletWithdrawRequestAsync**](WalletsApi.md#createWalletWithdrawRequestAsync) | **POST** /api/v2/WalletsService/Wallets/{walletId}/Withdraws | Create Wallet Withdraw Request |
| [**deleteWalletBankAccountAsync**](WalletsApi.md#deleteWalletBankAccountAsync) | **DELETE** /api/v2/WalletsService/Wallets/{walletId}/BankAccounts/{bankAccountId} | Delete Wallet Bank Account |
| [**deleteWalletLocationAsync**](WalletsApi.md#deleteWalletLocationAsync) | **DELETE** /api/v2/WalletsService/Wallets/{walletId}/Locations/{locationId} | Delete Wallet Location |
| [**deleteWalletTokenAsync**](WalletsApi.md#deleteWalletTokenAsync) | **DELETE** /api/v2/WalletsService/Wallets/{walletId}/Tokens/{tokenId} | Delete Wallet Token |
| [**getIncomingPaymentsAsync**](WalletsApi.md#getIncomingPaymentsAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Payments/Incoming | Get Incoming Payments |
| [**getIncomingPaymentsCountAsync**](WalletsApi.md#getIncomingPaymentsCountAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Payments/Incoming/Count | Get Incoming Payments Count |
| [**getIncomingWalletInvoicesAsync**](WalletsApi.md#getIncomingWalletInvoicesAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Invoices/Incoming | Get Incoming Wallet Invoices |
| [**getIncomingWalletInvoicesCountAsync**](WalletsApi.md#getIncomingWalletInvoicesCountAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Invoices/Incoming/Count | Get Incoming Wallet Invoices Count |
| [**getOutgoingPaymentsAsync**](WalletsApi.md#getOutgoingPaymentsAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Payments/Outgoing | Get Outgoing Payments |
| [**getOutgoingPaymentsCountAsync**](WalletsApi.md#getOutgoingPaymentsCountAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Payments/Outgoing/Count | Get Outgoing Payments Count |
| [**getOutgoingWalletInvoicesAsync**](WalletsApi.md#getOutgoingWalletInvoicesAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Invoices/Outgoing | Get Outgoing Wallet Invoices |
| [**getOutgoingWalletInvoicesCountAsync**](WalletsApi.md#getOutgoingWalletInvoicesCountAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Invoices/Outgoing/Count | Get Outgoing Wallet Invoices Count |
| [**getWalletBankAccountAsync**](WalletsApi.md#getWalletBankAccountAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/BankAccounts/{bankAccountId} | Get Wallet Bank Account |
| [**getWalletBankAccountsAsync**](WalletsApi.md#getWalletBankAccountsAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/BankAccounts | Get Wallet Bank Accounts |
| [**getWalletBankAccountsCountAsync**](WalletsApi.md#getWalletBankAccountsCountAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/BankAccounts/Count | Get Wallet Bank Accounts Count |
| [**getWalletChargebacksAsync**](WalletsApi.md#getWalletChargebacksAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Chargebacks | Get Wallet Chargebacks |
| [**getWalletChargebacksCountAsync**](WalletsApi.md#getWalletChargebacksCountAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Chargebacks/Count | Get Wallet Chargebacks Count |
| [**getWalletDetailsAsync**](WalletsApi.md#getWalletDetailsAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId} | Get Wallet Details |
| [**getWalletExtendedOrdersAsync**](WalletsApi.md#getWalletExtendedOrdersAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Orders/Extended | Get Wallet Extended Orders |
| [**getWalletInvoicesAsync**](WalletsApi.md#getWalletInvoicesAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Invoices | Get Wallet Invoices |
| [**getWalletInvoicesCountAsync**](WalletsApi.md#getWalletInvoicesCountAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Invoices/Count | Get Wallet Invoices Count |
| [**getWalletLocationAsync**](WalletsApi.md#getWalletLocationAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Locations/{locationId} | Get Wallet Location |
| [**getWalletLocationsAsync**](WalletsApi.md#getWalletLocationsAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Locations | Get Wallet Locations |
| [**getWalletLocationsCountAsync**](WalletsApi.md#getWalletLocationsCountAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Locations/Count | Get Wallet Locations Count |
| [**getWalletOrdersAsync**](WalletsApi.md#getWalletOrdersAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Orders | Get Wallet Orders |
| [**getWalletOrdersCountAsync**](WalletsApi.md#getWalletOrdersCountAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Orders/Count | Get Wallet Orders Count |
| [**getWalletPaymentsAsync**](WalletsApi.md#getWalletPaymentsAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Payments | Get Wallet Payments |
| [**getWalletPaymentsCountAsync**](WalletsApi.md#getWalletPaymentsCountAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Payments/Count | Get Wallet Payments Count |
| [**getWalletQuotesAsync**](WalletsApi.md#getWalletQuotesAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Quotes | Get Wallet Quotes |
| [**getWalletQuotesCountAsync**](WalletsApi.md#getWalletQuotesCountAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Quotes/Count | Get Wallet Quotes Count |
| [**getWalletRefundsAsync**](WalletsApi.md#getWalletRefundsAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Refunds | Get Wallet Refunds |
| [**getWalletRefundsCountAsync**](WalletsApi.md#getWalletRefundsCountAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Refunds/Count | Get Wallet Refunds Count |
| [**getWalletTokenAsync**](WalletsApi.md#getWalletTokenAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Tokens/{tokenId} | Get Wallet Token |
| [**getWalletTokensAsync**](WalletsApi.md#getWalletTokensAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Tokens | Get Wallet Tokens |
| [**getWalletTokensCountAsync**](WalletsApi.md#getWalletTokensCountAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Tokens/Count | Get Wallet Tokens Count |
| [**getWalletWithdrawRequestsAsync**](WalletsApi.md#getWalletWithdrawRequestsAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/WithdrawRequests | Get Wallet Withdraw Requests |
| [**getWalletWithdrawRequestsCountAsync**](WalletsApi.md#getWalletWithdrawRequestsCountAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/WithdrawRequests/Count | Get Wallet Withdraw Requests Count |
| [**getWalletWithdrawsAsync**](WalletsApi.md#getWalletWithdrawsAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Withdraws | Get Wallet Withdraws |
| [**getWalletWithdrawsCountAsync**](WalletsApi.md#getWalletWithdrawsCountAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Withdraws/Count | Get Wallet Withdraws Count |
| [**updateWalletBankAccountAsync**](WalletsApi.md#updateWalletBankAccountAsync) | **PUT** /api/v2/WalletsService/Wallets/{walletId}/BankAccounts/{bankAccountId} | Update Wallet Bank Account |
| [**updateWalletLocationAsync**](WalletsApi.md#updateWalletLocationAsync) | **PUT** /api/v2/WalletsService/Wallets/{walletId}/Locations/{locationId} | Update Wallet Location |
| [**updateWalletTokenAsync**](WalletsApi.md#updateWalletTokenAsync) | **PUT** /api/v2/WalletsService/Wallets/{walletId}/Tokens/{tokenId} | Update Wallet Token |


<a id="createWalletBankAccountAsync"></a>
# **createWalletBankAccountAsync**
> EmptyEnvelope createWalletBankAccountAsync(walletId, apiVersion, xApiVersion, bankAccountCreateDto)

Create Wallet Bank Account

Create a new bank account for a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    BankAccountCreateDto bankAccountCreateDto = new BankAccountCreateDto(); // BankAccountCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createWalletBankAccountAsync(walletId, apiVersion, xApiVersion, bankAccountCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#createWalletBankAccountAsync");
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
| **walletId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **bankAccountCreateDto** | [**BankAccountCreateDto**](BankAccountCreateDto.md)|  | [optional] |

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

<a id="createWalletLocationAsync"></a>
# **createWalletLocationAsync**
> EmptyEnvelope createWalletLocationAsync(walletId, apiVersion, xApiVersion, locationCreateDto)

Create Wallet Location

Create a new location for a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    LocationCreateDto locationCreateDto = new LocationCreateDto(); // LocationCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createWalletLocationAsync(walletId, apiVersion, xApiVersion, locationCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#createWalletLocationAsync");
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
| **walletId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **locationCreateDto** | [**LocationCreateDto**](LocationCreateDto.md)|  | [optional] |

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

<a id="createWalletPaymentAsync"></a>
# **createWalletPaymentAsync**
> EmptyEnvelope createWalletPaymentAsync(walletId, apiVersion, xApiVersion, paymentCreateDto)

Create Wallet Payment

Create a new payment for a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    PaymentCreateDto paymentCreateDto = new PaymentCreateDto(); // PaymentCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createWalletPaymentAsync(walletId, apiVersion, xApiVersion, paymentCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#createWalletPaymentAsync");
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
| **walletId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **paymentCreateDto** | [**PaymentCreateDto**](PaymentCreateDto.md)|  | [optional] |

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

<a id="createWalletTokenAsync"></a>
# **createWalletTokenAsync**
> EmptyEnvelope createWalletTokenAsync(walletId, apiVersion, xApiVersion, paymentTokenCreateDto)

Create Wallet Token

Create a new payment token for a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    PaymentTokenCreateDto paymentTokenCreateDto = new PaymentTokenCreateDto(); // PaymentTokenCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createWalletTokenAsync(walletId, apiVersion, xApiVersion, paymentTokenCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#createWalletTokenAsync");
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
| **walletId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **paymentTokenCreateDto** | [**PaymentTokenCreateDto**](PaymentTokenCreateDto.md)|  | [optional] |

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

<a id="createWalletWithdrawRequestAsync"></a>
# **createWalletWithdrawRequestAsync**
> EmptyEnvelope createWalletWithdrawRequestAsync(walletId, apiVersion, xApiVersion, walletWithdrawRequestCreateDto)

Create Wallet Withdraw Request

Create a new withdraw request for a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    WalletWithdrawRequestCreateDto walletWithdrawRequestCreateDto = new WalletWithdrawRequestCreateDto(); // WalletWithdrawRequestCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createWalletWithdrawRequestAsync(walletId, apiVersion, xApiVersion, walletWithdrawRequestCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#createWalletWithdrawRequestAsync");
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
| **walletId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **walletWithdrawRequestCreateDto** | [**WalletWithdrawRequestCreateDto**](WalletWithdrawRequestCreateDto.md)|  | [optional] |

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

<a id="deleteWalletBankAccountAsync"></a>
# **deleteWalletBankAccountAsync**
> EmptyEnvelope deleteWalletBankAccountAsync(walletId, bankAccountId, apiVersion, xApiVersion)

Delete Wallet Bank Account

Delete a specific bank account of a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    UUID bankAccountId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteWalletBankAccountAsync(walletId, bankAccountId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#deleteWalletBankAccountAsync");
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
| **walletId** | **UUID**|  | |
| **bankAccountId** | **UUID**|  | |
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

<a id="deleteWalletLocationAsync"></a>
# **deleteWalletLocationAsync**
> EmptyEnvelope deleteWalletLocationAsync(walletId, locationId, apiVersion, xApiVersion)

Delete Wallet Location

Delete a specific location of a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    UUID locationId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteWalletLocationAsync(walletId, locationId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#deleteWalletLocationAsync");
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
| **walletId** | **UUID**|  | |
| **locationId** | **UUID**|  | |
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

<a id="deleteWalletTokenAsync"></a>
# **deleteWalletTokenAsync**
> EmptyEnvelope deleteWalletTokenAsync(walletId, tokenId, apiVersion, xApiVersion)

Delete Wallet Token

Delete a specific payment token of a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    UUID tokenId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteWalletTokenAsync(walletId, tokenId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#deleteWalletTokenAsync");
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
| **walletId** | **UUID**|  | |
| **tokenId** | **UUID**|  | |
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

<a id="getIncomingPaymentsAsync"></a>
# **getIncomingPaymentsAsync**
> PaymentDtoListEnvelope getIncomingPaymentsAsync(walletId, apiVersion, xApiVersion)

Get Incoming Payments

Get incoming payments of a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      PaymentDtoListEnvelope result = apiInstance.getIncomingPaymentsAsync(walletId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#getIncomingPaymentsAsync");
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
| **walletId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**PaymentDtoListEnvelope**](PaymentDtoListEnvelope.md)

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

<a id="getIncomingPaymentsCountAsync"></a>
# **getIncomingPaymentsCountAsync**
> Int32Envelope getIncomingPaymentsCountAsync(walletId, apiVersion, xApiVersion)

Get Incoming Payments Count

Get incoming payments count of a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getIncomingPaymentsCountAsync(walletId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#getIncomingPaymentsCountAsync");
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
| **walletId** | **UUID**|  | |
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

<a id="getIncomingWalletInvoicesAsync"></a>
# **getIncomingWalletInvoicesAsync**
> InvoiceDtoListEnvelope getIncomingWalletInvoicesAsync(walletId, apiVersion, xApiVersion)

Get Incoming Wallet Invoices

Get incoming invoices of a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      InvoiceDtoListEnvelope result = apiInstance.getIncomingWalletInvoicesAsync(walletId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#getIncomingWalletInvoicesAsync");
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
| **walletId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

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
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getIncomingWalletInvoicesCountAsync"></a>
# **getIncomingWalletInvoicesCountAsync**
> Int32Envelope getIncomingWalletInvoicesCountAsync(walletId, apiVersion, xApiVersion)

Get Incoming Wallet Invoices Count

Get incoming invoices count of a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getIncomingWalletInvoicesCountAsync(walletId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#getIncomingWalletInvoicesCountAsync");
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
| **walletId** | **UUID**|  | |
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

<a id="getOutgoingPaymentsAsync"></a>
# **getOutgoingPaymentsAsync**
> PaymentDtoListEnvelope getOutgoingPaymentsAsync(walletId, apiVersion, xApiVersion)

Get Outgoing Payments

Get outgoing payments of a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      PaymentDtoListEnvelope result = apiInstance.getOutgoingPaymentsAsync(walletId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#getOutgoingPaymentsAsync");
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
| **walletId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**PaymentDtoListEnvelope**](PaymentDtoListEnvelope.md)

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

<a id="getOutgoingPaymentsCountAsync"></a>
# **getOutgoingPaymentsCountAsync**
> Int32Envelope getOutgoingPaymentsCountAsync(walletId, apiVersion, xApiVersion)

Get Outgoing Payments Count

Get outgoing payments count of a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getOutgoingPaymentsCountAsync(walletId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#getOutgoingPaymentsCountAsync");
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
| **walletId** | **UUID**|  | |
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

<a id="getOutgoingWalletInvoicesAsync"></a>
# **getOutgoingWalletInvoicesAsync**
> InvoiceDtoListEnvelope getOutgoingWalletInvoicesAsync(walletId, apiVersion, xApiVersion)

Get Outgoing Wallet Invoices

Get outgoing invoices of a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      InvoiceDtoListEnvelope result = apiInstance.getOutgoingWalletInvoicesAsync(walletId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#getOutgoingWalletInvoicesAsync");
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
| **walletId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

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
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getOutgoingWalletInvoicesCountAsync"></a>
# **getOutgoingWalletInvoicesCountAsync**
> Int32Envelope getOutgoingWalletInvoicesCountAsync(walletId, apiVersion, xApiVersion)

Get Outgoing Wallet Invoices Count

Get outgoing invoices count of a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getOutgoingWalletInvoicesCountAsync(walletId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#getOutgoingWalletInvoicesCountAsync");
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
| **walletId** | **UUID**|  | |
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

<a id="getWalletBankAccountAsync"></a>
# **getWalletBankAccountAsync**
> BankAccountDtoEnvelope getWalletBankAccountAsync(walletId, bankAccountId, apiVersion, xApiVersion)

Get Wallet Bank Account

Get a specific bank account of a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    UUID bankAccountId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      BankAccountDtoEnvelope result = apiInstance.getWalletBankAccountAsync(walletId, bankAccountId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#getWalletBankAccountAsync");
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
| **walletId** | **UUID**|  | |
| **bankAccountId** | **UUID**|  | |
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
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getWalletBankAccountsAsync"></a>
# **getWalletBankAccountsAsync**
> BankAccountDtoListEnvelope getWalletBankAccountsAsync(walletId, apiVersion, xApiVersion)

Get Wallet Bank Accounts

Get bank accounts of a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      BankAccountDtoListEnvelope result = apiInstance.getWalletBankAccountsAsync(walletId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#getWalletBankAccountsAsync");
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
| **walletId** | **UUID**|  | |
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

<a id="getWalletBankAccountsCountAsync"></a>
# **getWalletBankAccountsCountAsync**
> Int32Envelope getWalletBankAccountsCountAsync(walletId, apiVersion, xApiVersion)

Get Wallet Bank Accounts Count

Get bank accounts count of a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getWalletBankAccountsCountAsync(walletId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#getWalletBankAccountsCountAsync");
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
| **walletId** | **UUID**|  | |
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

<a id="getWalletChargebacksAsync"></a>
# **getWalletChargebacksAsync**
> PaymentChargebackDtoListEnvelope getWalletChargebacksAsync(walletId, apiVersion, xApiVersion)

Get Wallet Chargebacks

Get chargebacks of a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      PaymentChargebackDtoListEnvelope result = apiInstance.getWalletChargebacksAsync(walletId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#getWalletChargebacksAsync");
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
| **walletId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**PaymentChargebackDtoListEnvelope**](PaymentChargebackDtoListEnvelope.md)

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

<a id="getWalletChargebacksCountAsync"></a>
# **getWalletChargebacksCountAsync**
> Int32Envelope getWalletChargebacksCountAsync(walletId, apiVersion, xApiVersion)

Get Wallet Chargebacks Count

Get chargebacks count of a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getWalletChargebacksCountAsync(walletId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#getWalletChargebacksCountAsync");
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
| **walletId** | **UUID**|  | |
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

<a id="getWalletDetailsAsync"></a>
# **getWalletDetailsAsync**
> WalletDtoEnvelope getWalletDetailsAsync(walletId, apiVersion, xApiVersion)

Get Wallet Details

Get details of a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      WalletDtoEnvelope result = apiInstance.getWalletDetailsAsync(walletId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#getWalletDetailsAsync");
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
| **walletId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**WalletDtoEnvelope**](WalletDtoEnvelope.md)

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

<a id="getWalletExtendedOrdersAsync"></a>
# **getWalletExtendedOrdersAsync**
> ExtendedOrderDtoListEnvelope getWalletExtendedOrdersAsync(walletId, apiVersion, xApiVersion)

Get Wallet Extended Orders

Get extended orders of a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ExtendedOrderDtoListEnvelope result = apiInstance.getWalletExtendedOrdersAsync(walletId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#getWalletExtendedOrdersAsync");
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
| **walletId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ExtendedOrderDtoListEnvelope**](ExtendedOrderDtoListEnvelope.md)

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

<a id="getWalletInvoicesAsync"></a>
# **getWalletInvoicesAsync**
> InvoiceDtoListEnvelope getWalletInvoicesAsync(walletId, apiVersion, xApiVersion)

Get Wallet Invoices

Get invoices of a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      InvoiceDtoListEnvelope result = apiInstance.getWalletInvoicesAsync(walletId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#getWalletInvoicesAsync");
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
| **walletId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

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
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getWalletInvoicesCountAsync"></a>
# **getWalletInvoicesCountAsync**
> Int32Envelope getWalletInvoicesCountAsync(walletId, apiVersion, xApiVersion)

Get Wallet Invoices Count

Get invoices count of a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getWalletInvoicesCountAsync(walletId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#getWalletInvoicesCountAsync");
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
| **walletId** | **UUID**|  | |
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

<a id="getWalletLocationAsync"></a>
# **getWalletLocationAsync**
> LocationDtoEnvelope getWalletLocationAsync(walletId, locationId, apiVersion, xApiVersion)

Get Wallet Location

Get a specific location of a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    UUID locationId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      LocationDtoEnvelope result = apiInstance.getWalletLocationAsync(walletId, locationId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#getWalletLocationAsync");
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
| **walletId** | **UUID**|  | |
| **locationId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**LocationDtoEnvelope**](LocationDtoEnvelope.md)

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

<a id="getWalletLocationsAsync"></a>
# **getWalletLocationsAsync**
> LocationDtoListEnvelope getWalletLocationsAsync(walletId, apiVersion, xApiVersion)

Get Wallet Locations

Get locations of a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      LocationDtoListEnvelope result = apiInstance.getWalletLocationsAsync(walletId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#getWalletLocationsAsync");
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
| **walletId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**LocationDtoListEnvelope**](LocationDtoListEnvelope.md)

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

<a id="getWalletLocationsCountAsync"></a>
# **getWalletLocationsCountAsync**
> Int32Envelope getWalletLocationsCountAsync(walletId, apiVersion, xApiVersion)

Get Wallet Locations Count

Get locations count of a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getWalletLocationsCountAsync(walletId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#getWalletLocationsCountAsync");
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
| **walletId** | **UUID**|  | |
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

<a id="getWalletOrdersAsync"></a>
# **getWalletOrdersAsync**
> OrderDtoListEnvelope getWalletOrdersAsync(walletId, apiVersion, xApiVersion)

Get Wallet Orders

Get orders of a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      OrderDtoListEnvelope result = apiInstance.getWalletOrdersAsync(walletId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#getWalletOrdersAsync");
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
| **walletId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**OrderDtoListEnvelope**](OrderDtoListEnvelope.md)

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

<a id="getWalletOrdersCountAsync"></a>
# **getWalletOrdersCountAsync**
> Int32Envelope getWalletOrdersCountAsync(walletId, apiVersion, xApiVersion)

Get Wallet Orders Count

Get orders count of a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getWalletOrdersCountAsync(walletId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#getWalletOrdersCountAsync");
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
| **walletId** | **UUID**|  | |
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

<a id="getWalletPaymentsAsync"></a>
# **getWalletPaymentsAsync**
> PaymentDtoListEnvelope getWalletPaymentsAsync(walletId, apiVersion, xApiVersion)

Get Wallet Payments

Get payments of a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      PaymentDtoListEnvelope result = apiInstance.getWalletPaymentsAsync(walletId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#getWalletPaymentsAsync");
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
| **walletId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**PaymentDtoListEnvelope**](PaymentDtoListEnvelope.md)

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

<a id="getWalletPaymentsCountAsync"></a>
# **getWalletPaymentsCountAsync**
> Int32Envelope getWalletPaymentsCountAsync(walletId, apiVersion, xApiVersion)

Get Wallet Payments Count

Get payments count of a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getWalletPaymentsCountAsync(walletId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#getWalletPaymentsCountAsync");
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
| **walletId** | **UUID**|  | |
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

<a id="getWalletQuotesAsync"></a>
# **getWalletQuotesAsync**
> QuoteDtoListEnvelope getWalletQuotesAsync(walletId, apiVersion, xApiVersion)

Get Wallet Quotes

Get quotes of a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      QuoteDtoListEnvelope result = apiInstance.getWalletQuotesAsync(walletId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#getWalletQuotesAsync");
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
| **walletId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**QuoteDtoListEnvelope**](QuoteDtoListEnvelope.md)

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

<a id="getWalletQuotesCountAsync"></a>
# **getWalletQuotesCountAsync**
> Int32Envelope getWalletQuotesCountAsync(walletId, apiVersion, xApiVersion)

Get Wallet Quotes Count

Get quotes count of a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getWalletQuotesCountAsync(walletId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#getWalletQuotesCountAsync");
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
| **walletId** | **UUID**|  | |
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

<a id="getWalletRefundsAsync"></a>
# **getWalletRefundsAsync**
> PaymentRefundDtoListEnvelope getWalletRefundsAsync(walletId, apiVersion, xApiVersion)

Get Wallet Refunds

Get refunds of a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      PaymentRefundDtoListEnvelope result = apiInstance.getWalletRefundsAsync(walletId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#getWalletRefundsAsync");
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
| **walletId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**PaymentRefundDtoListEnvelope**](PaymentRefundDtoListEnvelope.md)

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

<a id="getWalletRefundsCountAsync"></a>
# **getWalletRefundsCountAsync**
> Int32Envelope getWalletRefundsCountAsync(walletId, apiVersion, xApiVersion)

Get Wallet Refunds Count

Get refunds count of a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getWalletRefundsCountAsync(walletId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#getWalletRefundsCountAsync");
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
| **walletId** | **UUID**|  | |
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

<a id="getWalletTokenAsync"></a>
# **getWalletTokenAsync**
> PaymentTokenDtoEnvelope getWalletTokenAsync(walletId, tokenId, apiVersion, xApiVersion)

Get Wallet Token

Get a specific payment token of a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    UUID tokenId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      PaymentTokenDtoEnvelope result = apiInstance.getWalletTokenAsync(walletId, tokenId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#getWalletTokenAsync");
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
| **walletId** | **UUID**|  | |
| **tokenId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**PaymentTokenDtoEnvelope**](PaymentTokenDtoEnvelope.md)

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

<a id="getWalletTokensAsync"></a>
# **getWalletTokensAsync**
> PaymentTokenDtoListEnvelope getWalletTokensAsync(walletId, apiVersion, xApiVersion)

Get Wallet Tokens

Get payment tokens of a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      PaymentTokenDtoListEnvelope result = apiInstance.getWalletTokensAsync(walletId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#getWalletTokensAsync");
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
| **walletId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**PaymentTokenDtoListEnvelope**](PaymentTokenDtoListEnvelope.md)

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

<a id="getWalletTokensCountAsync"></a>
# **getWalletTokensCountAsync**
> Int32Envelope getWalletTokensCountAsync(walletId, apiVersion, xApiVersion)

Get Wallet Tokens Count

Get payment tokens count of a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getWalletTokensCountAsync(walletId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#getWalletTokensCountAsync");
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
| **walletId** | **UUID**|  | |
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

<a id="getWalletWithdrawRequestsAsync"></a>
# **getWalletWithdrawRequestsAsync**
> WalletWithdrawRequestDtoListEnvelope getWalletWithdrawRequestsAsync(walletId, apiVersion, xApiVersion)

Get Wallet Withdraw Requests

Get withdraw requests of a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      WalletWithdrawRequestDtoListEnvelope result = apiInstance.getWalletWithdrawRequestsAsync(walletId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#getWalletWithdrawRequestsAsync");
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
| **walletId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**WalletWithdrawRequestDtoListEnvelope**](WalletWithdrawRequestDtoListEnvelope.md)

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

<a id="getWalletWithdrawRequestsCountAsync"></a>
# **getWalletWithdrawRequestsCountAsync**
> Int32Envelope getWalletWithdrawRequestsCountAsync(walletId, apiVersion, xApiVersion)

Get Wallet Withdraw Requests Count

Get withdraw requests count of a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getWalletWithdrawRequestsCountAsync(walletId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#getWalletWithdrawRequestsCountAsync");
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
| **walletId** | **UUID**|  | |
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

<a id="getWalletWithdrawsAsync"></a>
# **getWalletWithdrawsAsync**
> WalletWithdrawDtoListEnvelope getWalletWithdrawsAsync(walletId, apiVersion, xApiVersion)

Get Wallet Withdraws

Get withdraws of a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      WalletWithdrawDtoListEnvelope result = apiInstance.getWalletWithdrawsAsync(walletId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#getWalletWithdrawsAsync");
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
| **walletId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**WalletWithdrawDtoListEnvelope**](WalletWithdrawDtoListEnvelope.md)

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

<a id="getWalletWithdrawsCountAsync"></a>
# **getWalletWithdrawsCountAsync**
> Int32Envelope getWalletWithdrawsCountAsync(walletId, apiVersion, xApiVersion)

Get Wallet Withdraws Count

Get withdraws count of a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getWalletWithdrawsCountAsync(walletId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#getWalletWithdrawsCountAsync");
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
| **walletId** | **UUID**|  | |
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

<a id="updateWalletBankAccountAsync"></a>
# **updateWalletBankAccountAsync**
> EmptyEnvelope updateWalletBankAccountAsync(walletId, bankAccountId, apiVersion, xApiVersion, bankAccountUpdateDto)

Update Wallet Bank Account

Update a specific bank account of a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    UUID bankAccountId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    BankAccountUpdateDto bankAccountUpdateDto = new BankAccountUpdateDto(); // BankAccountUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateWalletBankAccountAsync(walletId, bankAccountId, apiVersion, xApiVersion, bankAccountUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#updateWalletBankAccountAsync");
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
| **walletId** | **UUID**|  | |
| **bankAccountId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **bankAccountUpdateDto** | [**BankAccountUpdateDto**](BankAccountUpdateDto.md)|  | [optional] |

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

<a id="updateWalletLocationAsync"></a>
# **updateWalletLocationAsync**
> EmptyEnvelope updateWalletLocationAsync(walletId, locationId, apiVersion, xApiVersion, locationUpdateDto)

Update Wallet Location

Update a specific location of a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    UUID locationId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    LocationUpdateDto locationUpdateDto = new LocationUpdateDto(); // LocationUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateWalletLocationAsync(walletId, locationId, apiVersion, xApiVersion, locationUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#updateWalletLocationAsync");
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
| **walletId** | **UUID**|  | |
| **locationId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **locationUpdateDto** | [**LocationUpdateDto**](LocationUpdateDto.md)|  | [optional] |

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

<a id="updateWalletTokenAsync"></a>
# **updateWalletTokenAsync**
> EmptyEnvelope updateWalletTokenAsync(walletId, tokenId, apiVersion, xApiVersion, paymentTokenUpdateDto)

Update Wallet Token

Update a specific payment token of a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    UUID tokenId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    PaymentTokenUpdateDto paymentTokenUpdateDto = new PaymentTokenUpdateDto(); // PaymentTokenUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateWalletTokenAsync(walletId, tokenId, apiVersion, xApiVersion, paymentTokenUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#updateWalletTokenAsync");
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
| **walletId** | **UUID**|  | |
| **tokenId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **paymentTokenUpdateDto** | [**PaymentTokenUpdateDto**](PaymentTokenUpdateDto.md)|  | [optional] |

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

