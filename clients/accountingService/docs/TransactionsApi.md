# TransactionsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTransaction**](TransactionsApi.md#createTransaction) | **POST** /api/v2/AccountingService/Transactions | Create a transaction |
| [**createTransactionCategory**](TransactionsApi.md#createTransactionCategory) | **POST** /api/v2/AccountingService/Transactions/Categories | Create a transaction category |
| [**deleteTransaction**](TransactionsApi.md#deleteTransaction) | **DELETE** /api/v2/AccountingService/Transactions/{transactionId} | Delete a transaction |
| [**deleteTransactionCategory**](TransactionsApi.md#deleteTransactionCategory) | **DELETE** /api/v2/AccountingService/Transactions/Categories/{categoryId} | Delete a transaction category |
| [**getTransaction**](TransactionsApi.md#getTransaction) | **GET** /api/v2/AccountingService/Transactions/{transactionId} | Get transaction by ID |
| [**getTransactionCategories**](TransactionsApi.md#getTransactionCategories) | **GET** /api/v2/AccountingService/Transactions/Categories | Get all transaction categories |
| [**getTransactionCategoriesCount**](TransactionsApi.md#getTransactionCategoriesCount) | **GET** /api/v2/AccountingService/Transactions/Categories/Count | Get transaction categories count |
| [**getTransactionCategory**](TransactionsApi.md#getTransactionCategory) | **GET** /api/v2/AccountingService/Transactions/Categories/{categoryId} | Get transaction category by ID |
| [**getTransactions**](TransactionsApi.md#getTransactions) | **GET** /api/v2/AccountingService/Transactions | Get all transactions for a tenant |
| [**getTransactionsCount**](TransactionsApi.md#getTransactionsCount) | **GET** /api/v2/AccountingService/Transactions/Count | Get transactions count |
| [**updateTransaction**](TransactionsApi.md#updateTransaction) | **PUT** /api/v2/AccountingService/Transactions/{transactionId} | Update a transaction |
| [**updateTransactionCategory**](TransactionsApi.md#updateTransactionCategory) | **PUT** /api/v2/AccountingService/Transactions/Categories/{categoryId} | Update a transaction category |


<a id="createTransaction"></a>
# **createTransaction**
> TransactionDtoEnvelope createTransaction(tenantId, apiVersion, xApiVersion, transactionCreateDto)

Create a transaction

Creates a new transaction for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TransactionsApi apiInstance = new TransactionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TransactionCreateDto transactionCreateDto = new TransactionCreateDto(); // TransactionCreateDto | 
    try {
      TransactionDtoEnvelope result = apiInstance.createTransaction(tenantId, apiVersion, xApiVersion, transactionCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#createTransaction");
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
| **transactionCreateDto** | [**TransactionCreateDto**](TransactionCreateDto.md)|  | [optional] |

### Return type

[**TransactionDtoEnvelope**](TransactionDtoEnvelope.md)

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

<a id="createTransactionCategory"></a>
# **createTransactionCategory**
> TransactionCategoryDtoEnvelope createTransactionCategory(tenantId, apiVersion, xApiVersion, transactionCategoryCreateDto)

Create a transaction category

Creates a new transaction category for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TransactionsApi apiInstance = new TransactionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TransactionCategoryCreateDto transactionCategoryCreateDto = new TransactionCategoryCreateDto(); // TransactionCategoryCreateDto | 
    try {
      TransactionCategoryDtoEnvelope result = apiInstance.createTransactionCategory(tenantId, apiVersion, xApiVersion, transactionCategoryCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#createTransactionCategory");
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
| **transactionCategoryCreateDto** | [**TransactionCategoryCreateDto**](TransactionCategoryCreateDto.md)|  | [optional] |

### Return type

[**TransactionCategoryDtoEnvelope**](TransactionCategoryDtoEnvelope.md)

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

<a id="deleteTransaction"></a>
# **deleteTransaction**
> TransactionDtoEnvelope deleteTransaction(tenantId, transactionId, apiVersion, xApiVersion)

Delete a transaction

Deletes a transaction by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TransactionsApi apiInstance = new TransactionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID transactionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TransactionDtoEnvelope result = apiInstance.deleteTransaction(tenantId, transactionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#deleteTransaction");
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
| **transactionId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**TransactionDtoEnvelope**](TransactionDtoEnvelope.md)

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
| **204** | No Content |  -  |

<a id="deleteTransactionCategory"></a>
# **deleteTransactionCategory**
> TransactionCategoryDtoEnvelope deleteTransactionCategory(tenantId, categoryId, apiVersion, xApiVersion)

Delete a transaction category

Deletes a transaction category by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TransactionsApi apiInstance = new TransactionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID categoryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TransactionCategoryDtoEnvelope result = apiInstance.deleteTransactionCategory(tenantId, categoryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#deleteTransactionCategory");
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
| **categoryId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**TransactionCategoryDtoEnvelope**](TransactionCategoryDtoEnvelope.md)

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
| **204** | No Content |  -  |

<a id="getTransaction"></a>
# **getTransaction**
> TransactionDtoEnvelope getTransaction(tenantId, transactionId, apiVersion, xApiVersion)

Get transaction by ID

Retrieves a specific transaction by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TransactionsApi apiInstance = new TransactionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID transactionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TransactionDtoEnvelope result = apiInstance.getTransaction(tenantId, transactionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#getTransaction");
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
| **transactionId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**TransactionDtoEnvelope**](TransactionDtoEnvelope.md)

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

<a id="getTransactionCategories"></a>
# **getTransactionCategories**
> TransactionCategoryDtoListEnvelope getTransactionCategories(tenantId, apiVersion, xApiVersion)

Get all transaction categories

Retrieves all transaction categories for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TransactionsApi apiInstance = new TransactionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TransactionCategoryDtoListEnvelope result = apiInstance.getTransactionCategories(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#getTransactionCategories");
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

[**TransactionCategoryDtoListEnvelope**](TransactionCategoryDtoListEnvelope.md)

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

<a id="getTransactionCategoriesCount"></a>
# **getTransactionCategoriesCount**
> Int32Envelope getTransactionCategoriesCount(tenantId, apiVersion, xApiVersion)

Get transaction categories count

Returns total number of transaction categories for the tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TransactionsApi apiInstance = new TransactionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getTransactionCategoriesCount(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#getTransactionCategoriesCount");
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

<a id="getTransactionCategory"></a>
# **getTransactionCategory**
> TransactionCategoryDtoEnvelope getTransactionCategory(tenantId, categoryId, apiVersion, xApiVersion)

Get transaction category by ID

Retrieves a specific transaction category by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TransactionsApi apiInstance = new TransactionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID categoryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TransactionCategoryDtoEnvelope result = apiInstance.getTransactionCategory(tenantId, categoryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#getTransactionCategory");
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
| **categoryId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**TransactionCategoryDtoEnvelope**](TransactionCategoryDtoEnvelope.md)

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

<a id="getTransactions"></a>
# **getTransactions**
> TransactionDtoListEnvelope getTransactions(tenantId, apiVersion, xApiVersion)

Get all transactions for a tenant

Retrieves all transactions for the specified tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TransactionsApi apiInstance = new TransactionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TransactionDtoListEnvelope result = apiInstance.getTransactions(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#getTransactions");
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

[**TransactionDtoListEnvelope**](TransactionDtoListEnvelope.md)

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

<a id="getTransactionsCount"></a>
# **getTransactionsCount**
> Int32Envelope getTransactionsCount(tenantId, apiVersion, xApiVersion)

Get transactions count

Returns total number of transactions for the tenant with OData filter support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TransactionsApi apiInstance = new TransactionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getTransactionsCount(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#getTransactionsCount");
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

<a id="updateTransaction"></a>
# **updateTransaction**
> TransactionDtoEnvelope updateTransaction(tenantId, transactionId, apiVersion, xApiVersion, transactionUpdateDto)

Update a transaction

Updates an existing transaction with the provided data.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TransactionsApi apiInstance = new TransactionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID transactionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TransactionUpdateDto transactionUpdateDto = new TransactionUpdateDto(); // TransactionUpdateDto | 
    try {
      TransactionDtoEnvelope result = apiInstance.updateTransaction(tenantId, transactionId, apiVersion, xApiVersion, transactionUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#updateTransaction");
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
| **transactionId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **transactionUpdateDto** | [**TransactionUpdateDto**](TransactionUpdateDto.md)|  | [optional] |

### Return type

[**TransactionDtoEnvelope**](TransactionDtoEnvelope.md)

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

<a id="updateTransactionCategory"></a>
# **updateTransactionCategory**
> TransactionCategoryDtoEnvelope updateTransactionCategory(tenantId, categoryId, apiVersion, xApiVersion, transactionCategoryUpdateDto)

Update a transaction category

Updates an existing transaction category with the provided data.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TransactionsApi apiInstance = new TransactionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID categoryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TransactionCategoryUpdateDto transactionCategoryUpdateDto = new TransactionCategoryUpdateDto(); // TransactionCategoryUpdateDto | 
    try {
      TransactionCategoryDtoEnvelope result = apiInstance.updateTransactionCategory(tenantId, categoryId, apiVersion, xApiVersion, transactionCategoryUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#updateTransactionCategory");
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
| **categoryId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **transactionCategoryUpdateDto** | [**TransactionCategoryUpdateDto**](TransactionCategoryUpdateDto.md)|  | [optional] |

### Return type

[**TransactionCategoryDtoEnvelope**](TransactionCategoryDtoEnvelope.md)

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

