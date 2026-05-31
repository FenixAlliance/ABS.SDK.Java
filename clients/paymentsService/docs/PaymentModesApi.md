# PaymentModesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPaymentModeAsync**](PaymentModesApi.md#createPaymentModeAsync) | **POST** /api/v2/PaymentsService/PaymentModes | Creates a new payment mode |
| [**deletePaymentModeAsync**](PaymentModesApi.md#deletePaymentModeAsync) | **DELETE** /api/v2/PaymentsService/PaymentModes/{paymentModeId} | Deletes a payment mode |
| [**getPaymentModeDetailsAsync**](PaymentModesApi.md#getPaymentModeDetailsAsync) | **GET** /api/v2/PaymentsService/PaymentModes/{paymentModeId} | Gets a payment mode by ID |
| [**getPaymentModesAsync**](PaymentModesApi.md#getPaymentModesAsync) | **GET** /api/v2/PaymentsService/PaymentModes | Retrieves all payment modes |
| [**getPaymentModesCountAsync**](PaymentModesApi.md#getPaymentModesCountAsync) | **GET** /api/v2/PaymentsService/PaymentModes/Count | Counts payment modes |
| [**updatePaymentModeAsync**](PaymentModesApi.md#updatePaymentModeAsync) | **PUT** /api/v2/PaymentsService/PaymentModes/{paymentModeId} | Updates a payment mode |


<a id="createPaymentModeAsync"></a>
# **createPaymentModeAsync**
> EmptyEnvelope createPaymentModeAsync(tenantId, apiVersion, xApiVersion, paymentModeCreateDto)

Creates a new payment mode

Creates a new payment mode for the current tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentModesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PaymentModesApi apiInstance = new PaymentModesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    PaymentModeCreateDto paymentModeCreateDto = new PaymentModeCreateDto(); // PaymentModeCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createPaymentModeAsync(tenantId, apiVersion, xApiVersion, paymentModeCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentModesApi#createPaymentModeAsync");
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
| **paymentModeCreateDto** | [**PaymentModeCreateDto**](PaymentModeCreateDto.md)|  | [optional] |

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

<a id="deletePaymentModeAsync"></a>
# **deletePaymentModeAsync**
> EmptyEnvelope deletePaymentModeAsync(tenantId, paymentModeId, apiVersion, xApiVersion)

Deletes a payment mode

Deletes the specified payment mode.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentModesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PaymentModesApi apiInstance = new PaymentModesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID paymentModeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deletePaymentModeAsync(tenantId, paymentModeId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentModesApi#deletePaymentModeAsync");
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
| **paymentModeId** | **UUID**|  | |
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

<a id="getPaymentModeDetailsAsync"></a>
# **getPaymentModeDetailsAsync**
> PaymentModeDtoEnvelope getPaymentModeDetailsAsync(tenantId, paymentModeId, apiVersion, xApiVersion)

Gets a payment mode by ID

Retrieves the details of a payment mode using its unique ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentModesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PaymentModesApi apiInstance = new PaymentModesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID paymentModeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      PaymentModeDtoEnvelope result = apiInstance.getPaymentModeDetailsAsync(tenantId, paymentModeId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentModesApi#getPaymentModeDetailsAsync");
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
| **paymentModeId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**PaymentModeDtoEnvelope**](PaymentModeDtoEnvelope.md)

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

<a id="getPaymentModesAsync"></a>
# **getPaymentModesAsync**
> PaymentModeDtoIReadOnlyListEnvelope getPaymentModesAsync(tenantId, apiVersion, xApiVersion)

Retrieves all payment modes

Gets all payment modes for the current tenant with OData support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentModesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PaymentModesApi apiInstance = new PaymentModesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      PaymentModeDtoIReadOnlyListEnvelope result = apiInstance.getPaymentModesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentModesApi#getPaymentModesAsync");
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

[**PaymentModeDtoIReadOnlyListEnvelope**](PaymentModeDtoIReadOnlyListEnvelope.md)

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

<a id="getPaymentModesCountAsync"></a>
# **getPaymentModesCountAsync**
> Int32Envelope getPaymentModesCountAsync(tenantId, apiVersion, xApiVersion)

Counts payment modes

Gets the count of payment modes for the current tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentModesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PaymentModesApi apiInstance = new PaymentModesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getPaymentModesCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentModesApi#getPaymentModesCountAsync");
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

<a id="updatePaymentModeAsync"></a>
# **updatePaymentModeAsync**
> EmptyEnvelope updatePaymentModeAsync(tenantId, paymentModeId, apiVersion, xApiVersion, paymentModeUpdateDto)

Updates a payment mode

Updates the specified payment mode.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentModesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PaymentModesApi apiInstance = new PaymentModesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID paymentModeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    PaymentModeUpdateDto paymentModeUpdateDto = new PaymentModeUpdateDto(); // PaymentModeUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updatePaymentModeAsync(tenantId, paymentModeId, apiVersion, xApiVersion, paymentModeUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentModesApi#updatePaymentModeAsync");
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
| **paymentModeId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **paymentModeUpdateDto** | [**PaymentModeUpdateDto**](PaymentModeUpdateDto.md)|  | [optional] |

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

