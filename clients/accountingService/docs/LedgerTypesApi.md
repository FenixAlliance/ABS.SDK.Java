# LedgerTypesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createLedgerTypeAsync**](LedgerTypesApi.md#createLedgerTypeAsync) | **POST** /api/v2/AccountingService/LedgerTypes | Creates a new ledger type |
| [**deleteLedgerTypeAsync**](LedgerTypesApi.md#deleteLedgerTypeAsync) | **DELETE** /api/v2/AccountingService/LedgerTypes/{ledgerTypeId} | Deletes a ledger type |
| [**getLedgerTypeDetailsAsync**](LedgerTypesApi.md#getLedgerTypeDetailsAsync) | **GET** /api/v2/AccountingService/LedgerTypes/{ledgerTypeId} | Gets a ledger type by ID |
| [**getLedgerTypesAsync**](LedgerTypesApi.md#getLedgerTypesAsync) | **GET** /api/v2/AccountingService/LedgerTypes | Retrieves all ledger types |
| [**getLedgerTypesCountAsync**](LedgerTypesApi.md#getLedgerTypesCountAsync) | **GET** /api/v2/AccountingService/LedgerTypes/Count | Counts ledger types |
| [**updateLedgerTypeAsync**](LedgerTypesApi.md#updateLedgerTypeAsync) | **PUT** /api/v2/AccountingService/LedgerTypes/{ledgerTypeId} | Updates a ledger type |


<a id="createLedgerTypeAsync"></a>
# **createLedgerTypeAsync**
> EmptyEnvelope createLedgerTypeAsync(tenantId, apiVersion, xApiVersion, ledgerTypeCreateDto)

Creates a new ledger type

Creates a new ledger type for the current tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LedgerTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    LedgerTypesApi apiInstance = new LedgerTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    LedgerTypeCreateDto ledgerTypeCreateDto = new LedgerTypeCreateDto(); // LedgerTypeCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createLedgerTypeAsync(tenantId, apiVersion, xApiVersion, ledgerTypeCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LedgerTypesApi#createLedgerTypeAsync");
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
| **ledgerTypeCreateDto** | [**LedgerTypeCreateDto**](LedgerTypeCreateDto.md)|  | [optional] |

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

<a id="deleteLedgerTypeAsync"></a>
# **deleteLedgerTypeAsync**
> EmptyEnvelope deleteLedgerTypeAsync(tenantId, ledgerTypeId, apiVersion, xApiVersion)

Deletes a ledger type

Deletes the specified ledger type.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LedgerTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    LedgerTypesApi apiInstance = new LedgerTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID ledgerTypeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteLedgerTypeAsync(tenantId, ledgerTypeId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LedgerTypesApi#deleteLedgerTypeAsync");
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
| **ledgerTypeId** | **UUID**|  | |
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

<a id="getLedgerTypeDetailsAsync"></a>
# **getLedgerTypeDetailsAsync**
> LedgerTypeDtoEnvelope getLedgerTypeDetailsAsync(tenantId, ledgerTypeId, apiVersion, xApiVersion)

Gets a ledger type by ID

Retrieves the details of a ledger type using its unique ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LedgerTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    LedgerTypesApi apiInstance = new LedgerTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID ledgerTypeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      LedgerTypeDtoEnvelope result = apiInstance.getLedgerTypeDetailsAsync(tenantId, ledgerTypeId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LedgerTypesApi#getLedgerTypeDetailsAsync");
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
| **ledgerTypeId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**LedgerTypeDtoEnvelope**](LedgerTypeDtoEnvelope.md)

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

<a id="getLedgerTypesAsync"></a>
# **getLedgerTypesAsync**
> LedgerTypeDtoIReadOnlyListEnvelope getLedgerTypesAsync(tenantId, apiVersion, xApiVersion)

Retrieves all ledger types

Gets all ledger types for the current tenant with OData support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LedgerTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    LedgerTypesApi apiInstance = new LedgerTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      LedgerTypeDtoIReadOnlyListEnvelope result = apiInstance.getLedgerTypesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LedgerTypesApi#getLedgerTypesAsync");
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

[**LedgerTypeDtoIReadOnlyListEnvelope**](LedgerTypeDtoIReadOnlyListEnvelope.md)

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

<a id="getLedgerTypesCountAsync"></a>
# **getLedgerTypesCountAsync**
> Int32Envelope getLedgerTypesCountAsync(tenantId, apiVersion, xApiVersion)

Counts ledger types

Gets the count of ledger types for the current tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LedgerTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    LedgerTypesApi apiInstance = new LedgerTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getLedgerTypesCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LedgerTypesApi#getLedgerTypesCountAsync");
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

<a id="updateLedgerTypeAsync"></a>
# **updateLedgerTypeAsync**
> EmptyEnvelope updateLedgerTypeAsync(tenantId, ledgerTypeId, apiVersion, xApiVersion, ledgerTypeUpdateDto)

Updates a ledger type

Updates the specified ledger type.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LedgerTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    LedgerTypesApi apiInstance = new LedgerTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID ledgerTypeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    LedgerTypeUpdateDto ledgerTypeUpdateDto = new LedgerTypeUpdateDto(); // LedgerTypeUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateLedgerTypeAsync(tenantId, ledgerTypeId, apiVersion, xApiVersion, ledgerTypeUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LedgerTypesApi#updateLedgerTypeAsync");
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
| **ledgerTypeId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **ledgerTypeUpdateDto** | [**LedgerTypeUpdateDto**](LedgerTypeUpdateDto.md)|  | [optional] |

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

