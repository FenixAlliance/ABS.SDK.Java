# LedgersApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createLedgerAsync**](LedgersApi.md#createLedgerAsync) | **POST** /api/v2/AccountingService/Ledgers | Creates a new ledger |
| [**deleteLedgerAsync**](LedgersApi.md#deleteLedgerAsync) | **DELETE** /api/v2/AccountingService/Ledgers/{ledgerId} | Deletes a ledger |
| [**getLedgerDetailsAsync**](LedgersApi.md#getLedgerDetailsAsync) | **GET** /api/v2/AccountingService/Ledgers/{ledgerId} | Gets a ledger by ID |
| [**getLedgersAsync**](LedgersApi.md#getLedgersAsync) | **GET** /api/v2/AccountingService/Ledgers | Retrieves all ledgers |
| [**getLedgersCountAsync**](LedgersApi.md#getLedgersCountAsync) | **GET** /api/v2/AccountingService/Ledgers/Count | Counts ledgers |
| [**updateLedgerAsync**](LedgersApi.md#updateLedgerAsync) | **PUT** /api/v2/AccountingService/Ledgers/{ledgerId} | Updates a ledger |


<a id="createLedgerAsync"></a>
# **createLedgerAsync**
> EmptyEnvelope createLedgerAsync(tenantId, apiVersion, xApiVersion, createLedgerDto)

Creates a new ledger

Creates a new ledger for the current tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LedgersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    LedgersApi apiInstance = new LedgersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CreateLedgerDto createLedgerDto = new CreateLedgerDto(); // CreateLedgerDto | 
    try {
      EmptyEnvelope result = apiInstance.createLedgerAsync(tenantId, apiVersion, xApiVersion, createLedgerDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LedgersApi#createLedgerAsync");
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
| **createLedgerDto** | [**CreateLedgerDto**](CreateLedgerDto.md)|  | [optional] |

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

<a id="deleteLedgerAsync"></a>
# **deleteLedgerAsync**
> EmptyEnvelope deleteLedgerAsync(tenantId, ledgerId, apiVersion, xApiVersion)

Deletes a ledger

Deletes the specified ledger.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LedgersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    LedgersApi apiInstance = new LedgersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID ledgerId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteLedgerAsync(tenantId, ledgerId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LedgersApi#deleteLedgerAsync");
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
| **ledgerId** | **UUID**|  | |
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

<a id="getLedgerDetailsAsync"></a>
# **getLedgerDetailsAsync**
> LedgerDtoEnvelope getLedgerDetailsAsync(tenantId, ledgerId, apiVersion, xApiVersion)

Gets a ledger by ID

Retrieves the details of a ledger using its unique ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LedgersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    LedgersApi apiInstance = new LedgersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID ledgerId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      LedgerDtoEnvelope result = apiInstance.getLedgerDetailsAsync(tenantId, ledgerId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LedgersApi#getLedgerDetailsAsync");
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
| **ledgerId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**LedgerDtoEnvelope**](LedgerDtoEnvelope.md)

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

<a id="getLedgersAsync"></a>
# **getLedgersAsync**
> LedgerDtoIReadOnlyListEnvelope getLedgersAsync(tenantId, apiVersion, xApiVersion)

Retrieves all ledgers

Gets all ledgers for the current tenant with OData support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LedgersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    LedgersApi apiInstance = new LedgersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      LedgerDtoIReadOnlyListEnvelope result = apiInstance.getLedgersAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LedgersApi#getLedgersAsync");
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

[**LedgerDtoIReadOnlyListEnvelope**](LedgerDtoIReadOnlyListEnvelope.md)

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

<a id="getLedgersCountAsync"></a>
# **getLedgersCountAsync**
> Int32Envelope getLedgersCountAsync(tenantId, apiVersion, xApiVersion)

Counts ledgers

Gets the count of ledgers for the current tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LedgersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    LedgersApi apiInstance = new LedgersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getLedgersCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LedgersApi#getLedgersCountAsync");
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
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="updateLedgerAsync"></a>
# **updateLedgerAsync**
> EmptyEnvelope updateLedgerAsync(tenantId, ledgerId, apiVersion, xApiVersion, updateLedgerDto)

Updates a ledger

Updates the specified ledger.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LedgersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    LedgersApi apiInstance = new LedgersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID ledgerId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    UpdateLedgerDto updateLedgerDto = new UpdateLedgerDto(); // UpdateLedgerDto | 
    try {
      EmptyEnvelope result = apiInstance.updateLedgerAsync(tenantId, ledgerId, apiVersion, xApiVersion, updateLedgerDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LedgersApi#updateLedgerAsync");
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
| **ledgerId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **updateLedgerDto** | [**UpdateLedgerDto**](UpdateLedgerDto.md)|  | [optional] |

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

