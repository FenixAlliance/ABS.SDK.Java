# ExpenseClaimsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createExpenseClaim**](ExpenseClaimsApi.md#createExpenseClaim) | **POST** /api/v2/AccountingService/ExpenseClaims | Create an expense claim |
| [**deleteExpenseClaim**](ExpenseClaimsApi.md#deleteExpenseClaim) | **DELETE** /api/v2/AccountingService/ExpenseClaims/{expenseClaimId} | Delete an expense claim |
| [**getExpenseClaim**](ExpenseClaimsApi.md#getExpenseClaim) | **GET** /api/v2/AccountingService/ExpenseClaims/{expenseClaimId} | Get an expense claim by id |
| [**getExpenseClaims**](ExpenseClaimsApi.md#getExpenseClaims) | **GET** /api/v2/AccountingService/ExpenseClaims | Get all expense claims for a tenant |
| [**getExpenseClaimsCount**](ExpenseClaimsApi.md#getExpenseClaimsCount) | **GET** /api/v2/AccountingService/ExpenseClaims/Count | Get the count of expense claims for a tenant |
| [**updateExpenseClaim**](ExpenseClaimsApi.md#updateExpenseClaim) | **PUT** /api/v2/AccountingService/ExpenseClaims/{expenseClaimId} | Update an expense claim |


<a id="createExpenseClaim"></a>
# **createExpenseClaim**
> EmptyEnvelope createExpenseClaim(tenantId, expenseClaimCreateDto, apiVersion, xApiVersion)

Create an expense claim

Creates a new expense claim.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ExpenseClaimsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ExpenseClaimsApi apiInstance = new ExpenseClaimsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    ExpenseClaimCreateDto expenseClaimCreateDto = new ExpenseClaimCreateDto(); // ExpenseClaimCreateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.createExpenseClaim(tenantId, expenseClaimCreateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseClaimsApi#createExpenseClaim");
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
| **expenseClaimCreateDto** | [**ExpenseClaimCreateDto**](ExpenseClaimCreateDto.md)|  | |
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
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **201** | Created |  -  |

<a id="deleteExpenseClaim"></a>
# **deleteExpenseClaim**
> EmptyEnvelope deleteExpenseClaim(tenantId, expenseClaimId, apiVersion, xApiVersion)

Delete an expense claim

Deletes an expense claim.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ExpenseClaimsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ExpenseClaimsApi apiInstance = new ExpenseClaimsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID expenseClaimId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteExpenseClaim(tenantId, expenseClaimId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseClaimsApi#deleteExpenseClaim");
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
| **expenseClaimId** | **UUID**|  | |
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

<a id="getExpenseClaim"></a>
# **getExpenseClaim**
> ExpenseClaimDtoEnvelope getExpenseClaim(tenantId, expenseClaimId, apiVersion, xApiVersion)

Get an expense claim by id

Retrieves an expense claim by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ExpenseClaimsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ExpenseClaimsApi apiInstance = new ExpenseClaimsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID expenseClaimId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ExpenseClaimDtoEnvelope result = apiInstance.getExpenseClaim(tenantId, expenseClaimId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseClaimsApi#getExpenseClaim");
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
| **expenseClaimId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ExpenseClaimDtoEnvelope**](ExpenseClaimDtoEnvelope.md)

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

<a id="getExpenseClaims"></a>
# **getExpenseClaims**
> ExpenseClaimDtoListEnvelope getExpenseClaims(tenantId, apiVersion, xApiVersion)

Get all expense claims for a tenant

Retrieves all expense claims for the specified tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ExpenseClaimsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ExpenseClaimsApi apiInstance = new ExpenseClaimsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ExpenseClaimDtoListEnvelope result = apiInstance.getExpenseClaims(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseClaimsApi#getExpenseClaims");
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

[**ExpenseClaimDtoListEnvelope**](ExpenseClaimDtoListEnvelope.md)

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

<a id="getExpenseClaimsCount"></a>
# **getExpenseClaimsCount**
> Int32Envelope getExpenseClaimsCount(tenantId, apiVersion, xApiVersion)

Get the count of expense claims for a tenant

Retrieves the count of expense claims for the specified tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ExpenseClaimsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ExpenseClaimsApi apiInstance = new ExpenseClaimsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getExpenseClaimsCount(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseClaimsApi#getExpenseClaimsCount");
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

<a id="updateExpenseClaim"></a>
# **updateExpenseClaim**
> EmptyEnvelope updateExpenseClaim(tenantId, expenseClaimId, expenseClaimUpdateDto, apiVersion, xApiVersion)

Update an expense claim

Updates an existing expense claim.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ExpenseClaimsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ExpenseClaimsApi apiInstance = new ExpenseClaimsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID expenseClaimId = UUID.randomUUID(); // UUID | 
    ExpenseClaimUpdateDto expenseClaimUpdateDto = new ExpenseClaimUpdateDto(); // ExpenseClaimUpdateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.updateExpenseClaim(tenantId, expenseClaimId, expenseClaimUpdateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseClaimsApi#updateExpenseClaim");
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
| **expenseClaimId** | **UUID**|  | |
| **expenseClaimUpdateDto** | [**ExpenseClaimUpdateDto**](ExpenseClaimUpdateDto.md)|  | |
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
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

