# ReceiptsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createReceiptAsync**](ReceiptsApi.md#createReceiptAsync) | **POST** /api/v2/AccountingService/Receipts | Creates a new receipt |
| [**deleteReceiptAsync**](ReceiptsApi.md#deleteReceiptAsync) | **DELETE** /api/v2/AccountingService/Receipts/{receiptId} | Deletes a receipt |
| [**getReceiptDetailsAsync**](ReceiptsApi.md#getReceiptDetailsAsync) | **GET** /api/v2/AccountingService/Receipts/{receiptId} | Gets details of a receipt |
| [**getReceiptsAsync**](ReceiptsApi.md#getReceiptsAsync) | **GET** /api/v2/AccountingService/Receipts | Retrieves tenant receipts |
| [**getReceiptsCountAsync**](ReceiptsApi.md#getReceiptsCountAsync) | **GET** /api/v2/AccountingService/Receipts/Count | Gets count of tenant receipts |
| [**updateReceiptAsync**](ReceiptsApi.md#updateReceiptAsync) | **PUT** /api/v2/AccountingService/Receipts/{receiptId} | Updates a receipt |


<a id="createReceiptAsync"></a>
# **createReceiptAsync**
> EmptyEnvelope createReceiptAsync(tenantId, receiptCreateDto)

Creates a new receipt

Adds a new receipt record under the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReceiptsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ReceiptsApi apiInstance = new ReceiptsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    ReceiptCreateDto receiptCreateDto = new ReceiptCreateDto(); // ReceiptCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createReceiptAsync(tenantId, receiptCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceiptsApi#createReceiptAsync");
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
| **receiptCreateDto** | [**ReceiptCreateDto**](ReceiptCreateDto.md)|  | |

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

<a id="deleteReceiptAsync"></a>
# **deleteReceiptAsync**
> EmptyEnvelope deleteReceiptAsync(tenantId, receiptId)

Deletes a receipt

Removes an existing receipt from the tenant’s records.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReceiptsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ReceiptsApi apiInstance = new ReceiptsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID receiptId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.deleteReceiptAsync(tenantId, receiptId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceiptsApi#deleteReceiptAsync");
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
| **receiptId** | **UUID**|  | |

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

<a id="getReceiptDetailsAsync"></a>
# **getReceiptDetailsAsync**
> ReceiptDtoEnvelope getReceiptDetailsAsync(tenantId, receiptId)

Gets details of a receipt

Retrieves a specific receipt by its ID for the given tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReceiptsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ReceiptsApi apiInstance = new ReceiptsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID receiptId = UUID.randomUUID(); // UUID | 
    try {
      ReceiptDtoEnvelope result = apiInstance.getReceiptDetailsAsync(tenantId, receiptId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceiptsApi#getReceiptDetailsAsync");
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
| **receiptId** | **UUID**|  | |

### Return type

[**ReceiptDtoEnvelope**](ReceiptDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getReceiptsAsync"></a>
# **getReceiptsAsync**
> ReceiptDtoIReadOnlyListEnvelope getReceiptsAsync(tenantId)

Retrieves tenant receipts

Fetches all receipts for a given tenant with OData support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReceiptsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ReceiptsApi apiInstance = new ReceiptsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      ReceiptDtoIReadOnlyListEnvelope result = apiInstance.getReceiptsAsync(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceiptsApi#getReceiptsAsync");
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

### Return type

[**ReceiptDtoIReadOnlyListEnvelope**](ReceiptDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getReceiptsCountAsync"></a>
# **getReceiptsCountAsync**
> Int32Envelope getReceiptsCountAsync(tenantId)

Gets count of tenant receipts

Returns total number of receipts for the tenant with OData filter support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReceiptsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ReceiptsApi apiInstance = new ReceiptsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.getReceiptsCountAsync(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceiptsApi#getReceiptsCountAsync");
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

<a id="updateReceiptAsync"></a>
# **updateReceiptAsync**
> EmptyEnvelope updateReceiptAsync(tenantId, receiptId, receiptUpdateDto)

Updates a receipt

Modifies the data of an existing receipt for the given tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReceiptsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ReceiptsApi apiInstance = new ReceiptsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID receiptId = UUID.randomUUID(); // UUID | 
    ReceiptUpdateDto receiptUpdateDto = new ReceiptUpdateDto(); // ReceiptUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateReceiptAsync(tenantId, receiptId, receiptUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceiptsApi#updateReceiptAsync");
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
| **receiptId** | **UUID**|  | |
| **receiptUpdateDto** | [**ReceiptUpdateDto**](ReceiptUpdateDto.md)|  | |

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

