# FinancialBooksApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFinancialBookAsync**](FinancialBooksApi.md#createFinancialBookAsync) | **POST** /api/v2/AccountingService/FinancialBooks | Creates a new financial book |
| [**deleteFinancialBookAsync**](FinancialBooksApi.md#deleteFinancialBookAsync) | **DELETE** /api/v2/AccountingService/FinancialBooks/{financialBookId} | Deletes an existing financial book |
| [**getFinancialBookDetailsAsync**](FinancialBooksApi.md#getFinancialBookDetailsAsync) | **GET** /api/v2/AccountingService/FinancialBooks/{financialBookId} | Gets the details of a specific financial book |
| [**getFinancialBooksAsync**](FinancialBooksApi.md#getFinancialBooksAsync) | **GET** /api/v2/AccountingService/FinancialBooks | Get all financial books for a tenant |
| [**getFinancialBooksCountAsync**](FinancialBooksApi.md#getFinancialBooksCountAsync) | **GET** /api/v2/AccountingService/FinancialBooks/Count | Get the count of financial books |
| [**updateFinancialBookAsync**](FinancialBooksApi.md#updateFinancialBookAsync) | **PUT** /api/v2/AccountingService/FinancialBooks/{financialBookId} | Updates an existing financial book |


<a id="createFinancialBookAsync"></a>
# **createFinancialBookAsync**
> EmptyEnvelope createFinancialBookAsync(tenantId, financialBookCreateDto, apiVersion, xApiVersion)

Creates a new financial book

Creates a new financial book.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FinancialBooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FinancialBooksApi apiInstance = new FinancialBooksApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    FinancialBookCreateDto financialBookCreateDto = new FinancialBookCreateDto(); // FinancialBookCreateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.createFinancialBookAsync(tenantId, financialBookCreateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FinancialBooksApi#createFinancialBookAsync");
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
| **financialBookCreateDto** | [**FinancialBookCreateDto**](FinancialBookCreateDto.md)|  | |
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
| **400** | Bad Request |  -  |
| **201** | Created |  -  |

<a id="deleteFinancialBookAsync"></a>
# **deleteFinancialBookAsync**
> EmptyEnvelope deleteFinancialBookAsync(tenantId, financialBookId, apiVersion, xApiVersion)

Deletes an existing financial book

Deletes an existing financial book.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FinancialBooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FinancialBooksApi apiInstance = new FinancialBooksApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID financialBookId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteFinancialBookAsync(tenantId, financialBookId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FinancialBooksApi#deleteFinancialBookAsync");
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
| **financialBookId** | **UUID**|  | |
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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

<a id="getFinancialBookDetailsAsync"></a>
# **getFinancialBookDetailsAsync**
> FinancialBookDtoEnvelope getFinancialBookDetailsAsync(tenantId, financialBookId, apiVersion, xApiVersion)

Gets the details of a specific financial book

Gets the details of a specific financial book.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FinancialBooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FinancialBooksApi apiInstance = new FinancialBooksApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID financialBookId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      FinancialBookDtoEnvelope result = apiInstance.getFinancialBookDetailsAsync(tenantId, financialBookId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FinancialBooksApi#getFinancialBookDetailsAsync");
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
| **financialBookId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**FinancialBookDtoEnvelope**](FinancialBookDtoEnvelope.md)

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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

<a id="getFinancialBooksAsync"></a>
# **getFinancialBooksAsync**
> FinancialBookDtoListEnvelope getFinancialBooksAsync(tenantId, apiVersion, xApiVersion)

Get all financial books for a tenant

Retrieves all financial books for the specified tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FinancialBooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FinancialBooksApi apiInstance = new FinancialBooksApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      FinancialBookDtoListEnvelope result = apiInstance.getFinancialBooksAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FinancialBooksApi#getFinancialBooksAsync");
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

[**FinancialBookDtoListEnvelope**](FinancialBookDtoListEnvelope.md)

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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

<a id="getFinancialBooksCountAsync"></a>
# **getFinancialBooksCountAsync**
> Int32Envelope getFinancialBooksCountAsync(tenantId, apiVersion, xApiVersion)

Get the count of financial books

Get the count of financial books.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FinancialBooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FinancialBooksApi apiInstance = new FinancialBooksApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getFinancialBooksCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FinancialBooksApi#getFinancialBooksCountAsync");
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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

<a id="updateFinancialBookAsync"></a>
# **updateFinancialBookAsync**
> EmptyEnvelope updateFinancialBookAsync(tenantId, financialBookId, financialBookUpdateDto, apiVersion, xApiVersion)

Updates an existing financial book

Updates an existing financial book.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FinancialBooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FinancialBooksApi apiInstance = new FinancialBooksApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID financialBookId = UUID.randomUUID(); // UUID | 
    FinancialBookUpdateDto financialBookUpdateDto = new FinancialBookUpdateDto(); // FinancialBookUpdateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.updateFinancialBookAsync(tenantId, financialBookId, financialBookUpdateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FinancialBooksApi#updateFinancialBookAsync");
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
| **financialBookId** | **UUID**|  | |
| **financialBookUpdateDto** | [**FinancialBookUpdateDto**](FinancialBookUpdateDto.md)|  | |
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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

