# AccountingPeriodsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAccountingPeriod**](AccountingPeriodsApi.md#createAccountingPeriod) | **POST** /api/v2/AccountingService/AccountingPeriods | Creates a new accounting period |
| [**deleteAccountingPeriod**](AccountingPeriodsApi.md#deleteAccountingPeriod) | **DELETE** /api/v2/AccountingService/AccountingPeriods/{accountingPeriodId} | Deletes an existing accounting period |
| [**getAccountingPeriod**](AccountingPeriodsApi.md#getAccountingPeriod) | **GET** /api/v2/AccountingService/AccountingPeriods/{accountingPeriodId} | Gets the current tenant accounting period |
| [**getAccountingPeriods**](AccountingPeriodsApi.md#getAccountingPeriods) | **GET** /api/v2/AccountingService/AccountingPeriods | Get all accounting periods for a tenant |
| [**getAccountingPeriodsCountAsync**](AccountingPeriodsApi.md#getAccountingPeriodsCountAsync) | **GET** /api/v2/AccountingService/AccountingPeriods/Count | Gets the current tenant accounting periods count |
| [**updateAccountingPeriod**](AccountingPeriodsApi.md#updateAccountingPeriod) | **PUT** /api/v2/AccountingService/AccountingPeriods/{accountingPeriodId} | Updates an existing accounting period |


<a id="createAccountingPeriod"></a>
# **createAccountingPeriod**
> EmptyEnvelope createAccountingPeriod(tenantId, apiVersion, xApiVersion, accountingPeriodCreateDto)

Creates a new accounting period

Creates a new accounting period.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountingPeriodsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountingPeriodsApi apiInstance = new AccountingPeriodsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    AccountingPeriodCreateDto accountingPeriodCreateDto = new AccountingPeriodCreateDto(); // AccountingPeriodCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createAccountingPeriod(tenantId, apiVersion, xApiVersion, accountingPeriodCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountingPeriodsApi#createAccountingPeriod");
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
| **accountingPeriodCreateDto** | [**AccountingPeriodCreateDto**](AccountingPeriodCreateDto.md)|  | [optional] |

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
| **201** | Created |  -  |

<a id="deleteAccountingPeriod"></a>
# **deleteAccountingPeriod**
> EmptyEnvelope deleteAccountingPeriod(tenantId, accountingPeriodId, apiVersion, xApiVersion)

Deletes an existing accounting period

Deletes an existing accounting period.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountingPeriodsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountingPeriodsApi apiInstance = new AccountingPeriodsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID accountingPeriodId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteAccountingPeriod(tenantId, accountingPeriodId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountingPeriodsApi#deleteAccountingPeriod");
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
| **accountingPeriodId** | **UUID**|  | |
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

<a id="getAccountingPeriod"></a>
# **getAccountingPeriod**
> AccountingPeriodDtoEnvelope getAccountingPeriod(tenantId, accountingPeriodId, apiVersion, xApiVersion)

Gets the current tenant accounting period

Get the currently acting tenant accounting period.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountingPeriodsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountingPeriodsApi apiInstance = new AccountingPeriodsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID accountingPeriodId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      AccountingPeriodDtoEnvelope result = apiInstance.getAccountingPeriod(tenantId, accountingPeriodId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountingPeriodsApi#getAccountingPeriod");
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
| **accountingPeriodId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**AccountingPeriodDtoEnvelope**](AccountingPeriodDtoEnvelope.md)

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

<a id="getAccountingPeriods"></a>
# **getAccountingPeriods**
> AccountingPeriodDtoListEnvelope getAccountingPeriods(tenantId, apiVersion, xApiVersion)

Get all accounting periods for a tenant

Retrieves all accounting periods for the specified tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountingPeriodsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountingPeriodsApi apiInstance = new AccountingPeriodsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      AccountingPeriodDtoListEnvelope result = apiInstance.getAccountingPeriods(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountingPeriodsApi#getAccountingPeriods");
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

[**AccountingPeriodDtoListEnvelope**](AccountingPeriodDtoListEnvelope.md)

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

<a id="getAccountingPeriodsCountAsync"></a>
# **getAccountingPeriodsCountAsync**
> Int32Envelope getAccountingPeriodsCountAsync(tenantId, apiVersion, xApiVersion)

Gets the current tenant accounting periods count

Get the currently acting tenant accounting periods count.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountingPeriodsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountingPeriodsApi apiInstance = new AccountingPeriodsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getAccountingPeriodsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountingPeriodsApi#getAccountingPeriodsCountAsync");
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

<a id="updateAccountingPeriod"></a>
# **updateAccountingPeriod**
> EmptyEnvelope updateAccountingPeriod(tenantId, accountingPeriodId, apiVersion, xApiVersion, accountingPeriodUpdateDto)

Updates an existing accounting period

Updates an existing accounting period.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountingPeriodsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountingPeriodsApi apiInstance = new AccountingPeriodsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID accountingPeriodId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    AccountingPeriodUpdateDto accountingPeriodUpdateDto = new AccountingPeriodUpdateDto(); // AccountingPeriodUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateAccountingPeriod(tenantId, accountingPeriodId, apiVersion, xApiVersion, accountingPeriodUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountingPeriodsApi#updateAccountingPeriod");
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
| **accountingPeriodId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **accountingPeriodUpdateDto** | [**AccountingPeriodUpdateDto**](AccountingPeriodUpdateDto.md)|  | [optional] |

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

