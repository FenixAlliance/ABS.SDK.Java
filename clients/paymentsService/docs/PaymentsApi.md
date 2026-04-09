# PaymentsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPaymentAsync**](PaymentsApi.md#createPaymentAsync) | **POST** /api/v2/PaymentsService/Payments | Creates a new payment |
| [**deletePaymentAsync**](PaymentsApi.md#deletePaymentAsync) | **DELETE** /api/v2/PaymentsService/Payments/{paymentId} | Deletes a payment |
| [**getPaymentAsync**](PaymentsApi.md#getPaymentAsync) | **GET** /api/v2/PaymentsService/Payments/{paymentId}/Details | Gets a payment by ID (deprecated) |
| [**getPaymentAsyncV2**](PaymentsApi.md#getPaymentAsyncV2) | **GET** /api/v2/PaymentsService/Payments/{paymentId} | Gets a payment by ID |
| [**getPaymentsAsync**](PaymentsApi.md#getPaymentsAsync) | **GET** /api/v2/PaymentsService/Payments | Retrieves all payments |
| [**updatePaymentAsync**](PaymentsApi.md#updatePaymentAsync) | **PUT** /api/v2/PaymentsService/Payments/{paymentId} | Updates a payment |


<a id="createPaymentAsync"></a>
# **createPaymentAsync**
> EmptyEnvelope createPaymentAsync(tenantId, paymentCreateDto)

Creates a new payment

Creates a new payment for the current tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    PaymentCreateDto paymentCreateDto = new PaymentCreateDto(); // PaymentCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createPaymentAsync(tenantId, paymentCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#createPaymentAsync");
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
| **400** | Bad Request |  -  |
| **201** | Created |  -  |

<a id="deletePaymentAsync"></a>
# **deletePaymentAsync**
> EmptyEnvelope deletePaymentAsync(tenantId, paymentId)

Deletes a payment

Deletes the specified payment.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID paymentId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.deletePaymentAsync(tenantId, paymentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#deletePaymentAsync");
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
| **paymentId** | **UUID**|  | |

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

<a id="getPaymentAsync"></a>
# **getPaymentAsync**
> PaymentDtoListEnvelope getPaymentAsync(paymentId)

Gets a payment by ID (deprecated)

Retrieves a payment using the deprecated /Details route. Use GET {paymentId} instead.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    UUID paymentId = UUID.randomUUID(); // UUID | 
    try {
      PaymentDtoListEnvelope result = apiInstance.getPaymentAsync(paymentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#getPaymentAsync");
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
| **paymentId** | **UUID**|  | |

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

<a id="getPaymentAsyncV2"></a>
# **getPaymentAsyncV2**
> PaymentDtoListEnvelope getPaymentAsyncV2(paymentId)

Gets a payment by ID

Retrieves the details of a payment using its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    UUID paymentId = UUID.randomUUID(); // UUID | 
    try {
      PaymentDtoListEnvelope result = apiInstance.getPaymentAsyncV2(paymentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#getPaymentAsyncV2");
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
| **paymentId** | **UUID**|  | |

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

<a id="getPaymentsAsync"></a>
# **getPaymentsAsync**
> PaymentDtoListEnvelope getPaymentsAsync(tenantId)

Retrieves all payments

Gets all payments for the current tenant with OData support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      PaymentDtoListEnvelope result = apiInstance.getPaymentsAsync(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#getPaymentsAsync");
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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

<a id="updatePaymentAsync"></a>
# **updatePaymentAsync**
> EmptyEnvelope updatePaymentAsync(tenantId, paymentId, paymentUpdateDto)

Updates a payment

Updates the specified payment.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID paymentId = UUID.randomUUID(); // UUID | 
    PaymentUpdateDto paymentUpdateDto = new PaymentUpdateDto(); // PaymentUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updatePaymentAsync(tenantId, paymentId, paymentUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#updatePaymentAsync");
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
| **paymentId** | **UUID**|  | |
| **paymentUpdateDto** | [**PaymentUpdateDto**](PaymentUpdateDto.md)|  | [optional] |

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

