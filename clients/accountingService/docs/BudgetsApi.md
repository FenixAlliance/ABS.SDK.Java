# BudgetsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBudgetAccountEntryAsync**](BudgetsApi.md#createBudgetAccountEntryAsync) | **POST** /api/v2/AccountingService/Budgets/{budgetId}/AccountEntries | Creates a budget account entry |
| [**createBudgetAsync**](BudgetsApi.md#createBudgetAsync) | **POST** /api/v2/AccountingService/Budgets | Creates a budget |
| [**deleteBudgetAccountEntryAsync**](BudgetsApi.md#deleteBudgetAccountEntryAsync) | **DELETE** /api/v2/AccountingService/Budgets/{budgetId}/AccountEntries/{entryId} | Deletes a budget account entry |
| [**deleteBudgetAsync**](BudgetsApi.md#deleteBudgetAsync) | **DELETE** /api/v2/AccountingService/Budgets/{budgetId} | Deletes a budget |
| [**getBudgetAccountEntriesCollectionAsync**](BudgetsApi.md#getBudgetAccountEntriesCollectionAsync) | **GET** /api/v2/AccountingService/Budgets/{budgetId}/AccountEntries | Gets all budget account entries |
| [**getBudgetAccountEntryAsync**](BudgetsApi.md#getBudgetAccountEntryAsync) | **GET** /api/v2/AccountingService/Budgets/{budgetId}/AccountEntries/{entryId} | Gets a budget account entry by id |
| [**getBudgetDetailsAsync**](BudgetsApi.md#getBudgetDetailsAsync) | **GET** /api/v2/AccountingService/Budgets/{budgetId} | Gets a budget by id |
| [**getBudgetsAsync**](BudgetsApi.md#getBudgetsAsync) | **GET** /api/v2/AccountingService/Budgets | Gets all budgets |
| [**updateBudgetAccountEntryAsync**](BudgetsApi.md#updateBudgetAccountEntryAsync) | **PUT** /api/v2/AccountingService/Budgets/{budgetId}/AccountEntries/{entryId} | Updates a budget account entry |
| [**updateBudgetAsync**](BudgetsApi.md#updateBudgetAsync) | **PUT** /api/v2/AccountingService/Budgets/{budgetId} | Updates a budget |


<a id="createBudgetAccountEntryAsync"></a>
# **createBudgetAccountEntryAsync**
> EmptyEnvelope createBudgetAccountEntryAsync(tenantId, budgetId, budgetAccountEntryCreateDto, apiVersion, xApiVersion)

Creates a budget account entry

Create a budget account entry

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BudgetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BudgetsApi apiInstance = new BudgetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID budgetId = UUID.randomUUID(); // UUID | 
    BudgetAccountEntryCreateDto budgetAccountEntryCreateDto = new BudgetAccountEntryCreateDto(); // BudgetAccountEntryCreateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.createBudgetAccountEntryAsync(tenantId, budgetId, budgetAccountEntryCreateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetsApi#createBudgetAccountEntryAsync");
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
| **budgetId** | **UUID**|  | |
| **budgetAccountEntryCreateDto** | [**BudgetAccountEntryCreateDto**](BudgetAccountEntryCreateDto.md)|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

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

<a id="createBudgetAsync"></a>
# **createBudgetAsync**
> EmptyEnvelope createBudgetAsync(tenantId, budgetCreateDto, apiVersion, xApiVersion)

Creates a budget

Create a budget

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BudgetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BudgetsApi apiInstance = new BudgetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    BudgetCreateDto budgetCreateDto = new BudgetCreateDto(); // BudgetCreateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.createBudgetAsync(tenantId, budgetCreateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetsApi#createBudgetAsync");
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
| **budgetCreateDto** | [**BudgetCreateDto**](BudgetCreateDto.md)|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

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

<a id="deleteBudgetAccountEntryAsync"></a>
# **deleteBudgetAccountEntryAsync**
> EmptyEnvelope deleteBudgetAccountEntryAsync(tenantId, budgetId, entryId, apiVersion, xApiVersion)

Deletes a budget account entry

Delete a budget account entry

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BudgetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BudgetsApi apiInstance = new BudgetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID budgetId = UUID.randomUUID(); // UUID | 
    UUID entryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteBudgetAccountEntryAsync(tenantId, budgetId, entryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetsApi#deleteBudgetAccountEntryAsync");
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
| **budgetId** | **UUID**|  | |
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

<a id="deleteBudgetAsync"></a>
# **deleteBudgetAsync**
> EmptyEnvelope deleteBudgetAsync(tenantId, budgetId, apiVersion, xApiVersion)

Deletes a budget

Delete a budget

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BudgetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BudgetsApi apiInstance = new BudgetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID budgetId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteBudgetAsync(tenantId, budgetId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetsApi#deleteBudgetAsync");
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
| **budgetId** | **UUID**|  | |
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

<a id="getBudgetAccountEntriesCollectionAsync"></a>
# **getBudgetAccountEntriesCollectionAsync**
> BudgetAccountEntryDtoIReadOnlyListEnvelope getBudgetAccountEntriesCollectionAsync(tenantId, budgetId, apiVersion, xApiVersion)

Gets all budget account entries

Get all budget account entries

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BudgetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BudgetsApi apiInstance = new BudgetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID budgetId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      BudgetAccountEntryDtoIReadOnlyListEnvelope result = apiInstance.getBudgetAccountEntriesCollectionAsync(tenantId, budgetId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetsApi#getBudgetAccountEntriesCollectionAsync");
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
| **budgetId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**BudgetAccountEntryDtoIReadOnlyListEnvelope**](BudgetAccountEntryDtoIReadOnlyListEnvelope.md)

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

<a id="getBudgetAccountEntryAsync"></a>
# **getBudgetAccountEntryAsync**
> BudgetAccountEntryDtoEnvelope getBudgetAccountEntryAsync(tenantId, budgetId, entryId, apiVersion, xApiVersion)

Gets a budget account entry by id

Get a budget account entry by id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BudgetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BudgetsApi apiInstance = new BudgetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID budgetId = UUID.randomUUID(); // UUID | 
    UUID entryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      BudgetAccountEntryDtoEnvelope result = apiInstance.getBudgetAccountEntryAsync(tenantId, budgetId, entryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetsApi#getBudgetAccountEntryAsync");
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
| **budgetId** | **UUID**|  | |
| **entryId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**BudgetAccountEntryDtoEnvelope**](BudgetAccountEntryDtoEnvelope.md)

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

<a id="getBudgetDetailsAsync"></a>
# **getBudgetDetailsAsync**
> BudgetDtoEnvelope getBudgetDetailsAsync(tenantId, budgetId, apiVersion, xApiVersion)

Gets a budget by id

Get a budget by id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BudgetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BudgetsApi apiInstance = new BudgetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID budgetId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      BudgetDtoEnvelope result = apiInstance.getBudgetDetailsAsync(tenantId, budgetId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetsApi#getBudgetDetailsAsync");
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
| **budgetId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**BudgetDtoEnvelope**](BudgetDtoEnvelope.md)

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

<a id="getBudgetsAsync"></a>
# **getBudgetsAsync**
> BudgetDtoIReadOnlyListEnvelope getBudgetsAsync(tenantId, apiVersion, xApiVersion)

Gets all budgets

Get all budgets

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BudgetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BudgetsApi apiInstance = new BudgetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      BudgetDtoIReadOnlyListEnvelope result = apiInstance.getBudgetsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetsApi#getBudgetsAsync");
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

[**BudgetDtoIReadOnlyListEnvelope**](BudgetDtoIReadOnlyListEnvelope.md)

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

<a id="updateBudgetAccountEntryAsync"></a>
# **updateBudgetAccountEntryAsync**
> EmptyEnvelope updateBudgetAccountEntryAsync(tenantId, budgetId, entryId, budgetAccountEntryUpdateDto, apiVersion, xApiVersion)

Updates a budget account entry

Update a budget account entry

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BudgetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BudgetsApi apiInstance = new BudgetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID budgetId = UUID.randomUUID(); // UUID | 
    UUID entryId = UUID.randomUUID(); // UUID | 
    BudgetAccountEntryUpdateDto budgetAccountEntryUpdateDto = new BudgetAccountEntryUpdateDto(); // BudgetAccountEntryUpdateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.updateBudgetAccountEntryAsync(tenantId, budgetId, entryId, budgetAccountEntryUpdateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetsApi#updateBudgetAccountEntryAsync");
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
| **budgetId** | **UUID**|  | |
| **entryId** | **UUID**|  | |
| **budgetAccountEntryUpdateDto** | [**BudgetAccountEntryUpdateDto**](BudgetAccountEntryUpdateDto.md)|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

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

<a id="updateBudgetAsync"></a>
# **updateBudgetAsync**
> EmptyEnvelope updateBudgetAsync(tenantId, budgetId, budgetUpdateDto, apiVersion, xApiVersion)

Updates a budget

Update a budget

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BudgetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BudgetsApi apiInstance = new BudgetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID budgetId = UUID.randomUUID(); // UUID | 
    BudgetUpdateDto budgetUpdateDto = new BudgetUpdateDto(); // BudgetUpdateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.updateBudgetAsync(tenantId, budgetId, budgetUpdateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetsApi#updateBudgetAsync");
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
| **budgetId** | **UUID**|  | |
| **budgetUpdateDto** | [**BudgetUpdateDto**](BudgetUpdateDto.md)|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

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

