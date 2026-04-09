# PaymentTermsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPaymentTermAsync**](PaymentTermsApi.md#createPaymentTermAsync) | **POST** /api/v2/PaymentsService/PaymentTerms | Creates a new payment term |
| [**deletePaymentTermAsync**](PaymentTermsApi.md#deletePaymentTermAsync) | **DELETE** /api/v2/PaymentsService/PaymentTerms/{paymentTermId} | Deletes a payment term |
| [**getPaymentTermDetailsAsync**](PaymentTermsApi.md#getPaymentTermDetailsAsync) | **GET** /api/v2/PaymentsService/PaymentTerms/{paymentTermId} | Gets a payment term by ID |
| [**getPaymentTermsAsync**](PaymentTermsApi.md#getPaymentTermsAsync) | **GET** /api/v2/PaymentsService/PaymentTerms | Retrieves all payment terms |
| [**getPaymentTermsCountAsync**](PaymentTermsApi.md#getPaymentTermsCountAsync) | **GET** /api/v2/PaymentsService/PaymentTerms/Count | Counts payment terms |
| [**updatePaymentTermAsync**](PaymentTermsApi.md#updatePaymentTermAsync) | **PUT** /api/v2/PaymentsService/PaymentTerms/{paymentTermId} | Updates a payment term |


<a id="createPaymentTermAsync"></a>
# **createPaymentTermAsync**
> EmptyEnvelope createPaymentTermAsync(tenantId, apiVersion, xApiVersion, paymentTermCreateDto)

Creates a new payment term

Creates a new payment term for the current tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentTermsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PaymentTermsApi apiInstance = new PaymentTermsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    PaymentTermCreateDto paymentTermCreateDto = new PaymentTermCreateDto(); // PaymentTermCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createPaymentTermAsync(tenantId, apiVersion, xApiVersion, paymentTermCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentTermsApi#createPaymentTermAsync");
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
| **paymentTermCreateDto** | [**PaymentTermCreateDto**](PaymentTermCreateDto.md)|  | [optional] |

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

<a id="deletePaymentTermAsync"></a>
# **deletePaymentTermAsync**
> EmptyEnvelope deletePaymentTermAsync(tenantId, paymentTermId, apiVersion, xApiVersion)

Deletes a payment term

Deletes the specified payment term.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentTermsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PaymentTermsApi apiInstance = new PaymentTermsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID paymentTermId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deletePaymentTermAsync(tenantId, paymentTermId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentTermsApi#deletePaymentTermAsync");
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
| **paymentTermId** | **UUID**|  | |
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

<a id="getPaymentTermDetailsAsync"></a>
# **getPaymentTermDetailsAsync**
> PaymentTermDtoEnvelope getPaymentTermDetailsAsync(tenantId, paymentTermId, apiVersion, xApiVersion)

Gets a payment term by ID

Retrieves the details of a payment term using its unique ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentTermsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PaymentTermsApi apiInstance = new PaymentTermsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID paymentTermId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      PaymentTermDtoEnvelope result = apiInstance.getPaymentTermDetailsAsync(tenantId, paymentTermId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentTermsApi#getPaymentTermDetailsAsync");
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
| **paymentTermId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**PaymentTermDtoEnvelope**](PaymentTermDtoEnvelope.md)

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

<a id="getPaymentTermsAsync"></a>
# **getPaymentTermsAsync**
> PaymentTermDtoIReadOnlyListEnvelope getPaymentTermsAsync(tenantId, apiVersion, xApiVersion)

Retrieves all payment terms

Gets all payment terms for the current tenant with OData support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentTermsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PaymentTermsApi apiInstance = new PaymentTermsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      PaymentTermDtoIReadOnlyListEnvelope result = apiInstance.getPaymentTermsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentTermsApi#getPaymentTermsAsync");
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

[**PaymentTermDtoIReadOnlyListEnvelope**](PaymentTermDtoIReadOnlyListEnvelope.md)

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

<a id="getPaymentTermsCountAsync"></a>
# **getPaymentTermsCountAsync**
> Int32Envelope getPaymentTermsCountAsync(tenantId, apiVersion, xApiVersion)

Counts payment terms

Gets the count of payment terms for the current tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentTermsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PaymentTermsApi apiInstance = new PaymentTermsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getPaymentTermsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentTermsApi#getPaymentTermsCountAsync");
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

<a id="updatePaymentTermAsync"></a>
# **updatePaymentTermAsync**
> EmptyEnvelope updatePaymentTermAsync(tenantId, paymentTermId, apiVersion, xApiVersion, paymentTermUpdateDto)

Updates a payment term

Updates the specified payment term.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentTermsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PaymentTermsApi apiInstance = new PaymentTermsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID paymentTermId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    PaymentTermUpdateDto paymentTermUpdateDto = new PaymentTermUpdateDto(); // PaymentTermUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updatePaymentTermAsync(tenantId, paymentTermId, apiVersion, xApiVersion, paymentTermUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentTermsApi#updatePaymentTermAsync");
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
| **paymentTermId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **paymentTermUpdateDto** | [**PaymentTermUpdateDto**](PaymentTermUpdateDto.md)|  | [optional] |

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

