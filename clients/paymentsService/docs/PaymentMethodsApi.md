# PaymentMethodsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPaymentMethodAsync**](PaymentMethodsApi.md#createPaymentMethodAsync) | **POST** /api/v2/PaymentsService/PaymentMethods | Creates a new payment method |
| [**deletePaymentMethodAsync**](PaymentMethodsApi.md#deletePaymentMethodAsync) | **DELETE** /api/v2/PaymentsService/PaymentMethods/{paymentMethodId} | Deletes a payment method |
| [**getPaymentMethodDetailsAsync**](PaymentMethodsApi.md#getPaymentMethodDetailsAsync) | **GET** /api/v2/PaymentsService/PaymentMethods/{paymentMethodId} | Gets a payment method by ID |
| [**getPaymentMethodsAsync**](PaymentMethodsApi.md#getPaymentMethodsAsync) | **GET** /api/v2/PaymentsService/PaymentMethods | Retrieves all payment methods |
| [**getPaymentMethodsCountAsync**](PaymentMethodsApi.md#getPaymentMethodsCountAsync) | **GET** /api/v2/PaymentsService/PaymentMethods/Count | Counts payment methods |
| [**updatePaymentMethodAsync**](PaymentMethodsApi.md#updatePaymentMethodAsync) | **PUT** /api/v2/PaymentsService/PaymentMethods/{paymentMethodId} | Updates a payment method |


<a id="createPaymentMethodAsync"></a>
# **createPaymentMethodAsync**
> EmptyEnvelope createPaymentMethodAsync(tenantId, apiVersion, xApiVersion, paymentMethodCreateDto)

Creates a new payment method

Creates a new payment method for the current tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentMethodsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PaymentMethodsApi apiInstance = new PaymentMethodsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    PaymentMethodCreateDto paymentMethodCreateDto = new PaymentMethodCreateDto(); // PaymentMethodCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createPaymentMethodAsync(tenantId, apiVersion, xApiVersion, paymentMethodCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentMethodsApi#createPaymentMethodAsync");
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
| **paymentMethodCreateDto** | [**PaymentMethodCreateDto**](PaymentMethodCreateDto.md)|  | [optional] |

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

<a id="deletePaymentMethodAsync"></a>
# **deletePaymentMethodAsync**
> EmptyEnvelope deletePaymentMethodAsync(tenantId, paymentMethodId, apiVersion, xApiVersion)

Deletes a payment method

Deletes the specified payment method.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentMethodsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PaymentMethodsApi apiInstance = new PaymentMethodsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID paymentMethodId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deletePaymentMethodAsync(tenantId, paymentMethodId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentMethodsApi#deletePaymentMethodAsync");
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
| **paymentMethodId** | **UUID**|  | |
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

<a id="getPaymentMethodDetailsAsync"></a>
# **getPaymentMethodDetailsAsync**
> PaymentMethodDtoEnvelope getPaymentMethodDetailsAsync(tenantId, paymentMethodId, apiVersion, xApiVersion)

Gets a payment method by ID

Retrieves the details of a payment method using its unique ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentMethodsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PaymentMethodsApi apiInstance = new PaymentMethodsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID paymentMethodId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      PaymentMethodDtoEnvelope result = apiInstance.getPaymentMethodDetailsAsync(tenantId, paymentMethodId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentMethodsApi#getPaymentMethodDetailsAsync");
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
| **paymentMethodId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**PaymentMethodDtoEnvelope**](PaymentMethodDtoEnvelope.md)

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

<a id="getPaymentMethodsAsync"></a>
# **getPaymentMethodsAsync**
> PaymentMethodDtoIReadOnlyListEnvelope getPaymentMethodsAsync(tenantId, apiVersion, xApiVersion)

Retrieves all payment methods

Gets all payment methods for the current tenant with OData support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentMethodsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PaymentMethodsApi apiInstance = new PaymentMethodsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      PaymentMethodDtoIReadOnlyListEnvelope result = apiInstance.getPaymentMethodsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentMethodsApi#getPaymentMethodsAsync");
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

[**PaymentMethodDtoIReadOnlyListEnvelope**](PaymentMethodDtoIReadOnlyListEnvelope.md)

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

<a id="getPaymentMethodsCountAsync"></a>
# **getPaymentMethodsCountAsync**
> Int32Envelope getPaymentMethodsCountAsync(tenantId, apiVersion, xApiVersion)

Counts payment methods

Gets the count of payment methods for the current tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentMethodsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PaymentMethodsApi apiInstance = new PaymentMethodsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getPaymentMethodsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentMethodsApi#getPaymentMethodsCountAsync");
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

<a id="updatePaymentMethodAsync"></a>
# **updatePaymentMethodAsync**
> EmptyEnvelope updatePaymentMethodAsync(tenantId, paymentMethodId, apiVersion, xApiVersion, paymentMethodUpdateDto)

Updates a payment method

Updates the specified payment method.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentMethodsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PaymentMethodsApi apiInstance = new PaymentMethodsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID paymentMethodId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    PaymentMethodUpdateDto paymentMethodUpdateDto = new PaymentMethodUpdateDto(); // PaymentMethodUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updatePaymentMethodAsync(tenantId, paymentMethodId, apiVersion, xApiVersion, paymentMethodUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentMethodsApi#updatePaymentMethodAsync");
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
| **paymentMethodId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **paymentMethodUpdateDto** | [**PaymentMethodUpdateDto**](PaymentMethodUpdateDto.md)|  | [optional] |

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

