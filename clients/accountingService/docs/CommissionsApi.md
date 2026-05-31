# CommissionsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCommissionAsync**](CommissionsApi.md#createCommissionAsync) | **POST** /api/v2/AccountingService/Commissions/Commissions | Create a commission |
| [**createPaymentCommissionAsync**](CommissionsApi.md#createPaymentCommissionAsync) | **POST** /api/v2/AccountingService/Commissions/PaymentCommissions | Create a payment commission |
| [**deleteCommissionAsync**](CommissionsApi.md#deleteCommissionAsync) | **DELETE** /api/v2/AccountingService/Commissions/Commissions/{commissionId} | Delete a commission |
| [**deletePaymentCommissionAsync**](CommissionsApi.md#deletePaymentCommissionAsync) | **DELETE** /api/v2/AccountingService/Commissions/PaymentCommissions/{paymentCommissionId} | Delete a payment commission |
| [**getCommissionAsync**](CommissionsApi.md#getCommissionAsync) | **GET** /api/v2/AccountingService/Commissions/Commissions/{commissionId} | Get a commission by id |
| [**getCommissionsAsync**](CommissionsApi.md#getCommissionsAsync) | **GET** /api/v2/AccountingService/Commissions/Commissions | Get all commissions for a tenant |
| [**getCommissionsCountAsync**](CommissionsApi.md#getCommissionsCountAsync) | **GET** /api/v2/AccountingService/Commissions/Commissions/Count | Get the count of commissions for a tenant |
| [**getPaymentCommissionAsync**](CommissionsApi.md#getPaymentCommissionAsync) | **GET** /api/v2/AccountingService/Commissions/PaymentCommissions/{paymentCommissionId} | Get a payment commission by id |
| [**getPaymentCommissionsAsync**](CommissionsApi.md#getPaymentCommissionsAsync) | **GET** /api/v2/AccountingService/Commissions/PaymentCommissions | Get all payment commissions for a tenant |
| [**getPaymentCommissionsCountAsync**](CommissionsApi.md#getPaymentCommissionsCountAsync) | **GET** /api/v2/AccountingService/Commissions/PaymentCommissions/Count | Get the count of payment commissions for a tenant |
| [**updateCommissionAsync**](CommissionsApi.md#updateCommissionAsync) | **PUT** /api/v2/AccountingService/Commissions/Commissions/{commissionId} | Update a commission |
| [**updatePaymentCommissionAsync**](CommissionsApi.md#updatePaymentCommissionAsync) | **PUT** /api/v2/AccountingService/Commissions/PaymentCommissions/{paymentCommissionId} | Update a payment commission |


<a id="createCommissionAsync"></a>
# **createCommissionAsync**
> EmptyEnvelope createCommissionAsync(tenantId, commissionCreateDto, apiVersion, xApiVersion)

Create a commission

Creates a new commission.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CommissionsApi apiInstance = new CommissionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    CommissionCreateDto commissionCreateDto = new CommissionCreateDto(); // CommissionCreateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.createCommissionAsync(tenantId, commissionCreateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommissionsApi#createCommissionAsync");
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
| **commissionCreateDto** | [**CommissionCreateDto**](CommissionCreateDto.md)|  | |
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

<a id="createPaymentCommissionAsync"></a>
# **createPaymentCommissionAsync**
> EmptyEnvelope createPaymentCommissionAsync(tenantId, paymentCommissionCreateDto, apiVersion, xApiVersion)

Create a payment commission

Creates a new payment commission.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CommissionsApi apiInstance = new CommissionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    PaymentCommissionCreateDto paymentCommissionCreateDto = new PaymentCommissionCreateDto(); // PaymentCommissionCreateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.createPaymentCommissionAsync(tenantId, paymentCommissionCreateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommissionsApi#createPaymentCommissionAsync");
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
| **paymentCommissionCreateDto** | [**PaymentCommissionCreateDto**](PaymentCommissionCreateDto.md)|  | |
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

<a id="deleteCommissionAsync"></a>
# **deleteCommissionAsync**
> EmptyEnvelope deleteCommissionAsync(tenantId, commissionId, apiVersion, xApiVersion)

Delete a commission

Deletes a commission.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CommissionsApi apiInstance = new CommissionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID commissionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteCommissionAsync(tenantId, commissionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommissionsApi#deleteCommissionAsync");
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
| **commissionId** | **UUID**|  | |
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

<a id="deletePaymentCommissionAsync"></a>
# **deletePaymentCommissionAsync**
> EmptyEnvelope deletePaymentCommissionAsync(tenantId, paymentCommissionId, apiVersion, xApiVersion)

Delete a payment commission

Deletes a payment commission.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CommissionsApi apiInstance = new CommissionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID paymentCommissionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deletePaymentCommissionAsync(tenantId, paymentCommissionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommissionsApi#deletePaymentCommissionAsync");
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
| **paymentCommissionId** | **UUID**|  | |
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

<a id="getCommissionAsync"></a>
# **getCommissionAsync**
> CommissionDtoEnvelope getCommissionAsync(tenantId, commissionId, apiVersion, xApiVersion)

Get a commission by id

Retrieves a commission by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CommissionsApi apiInstance = new CommissionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID commissionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CommissionDtoEnvelope result = apiInstance.getCommissionAsync(tenantId, commissionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommissionsApi#getCommissionAsync");
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
| **commissionId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CommissionDtoEnvelope**](CommissionDtoEnvelope.md)

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

<a id="getCommissionsAsync"></a>
# **getCommissionsAsync**
> CommissionDtoListEnvelope getCommissionsAsync(tenantId, apiVersion, xApiVersion)

Get all commissions for a tenant

Retrieves all commissions for the specified tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CommissionsApi apiInstance = new CommissionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CommissionDtoListEnvelope result = apiInstance.getCommissionsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommissionsApi#getCommissionsAsync");
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

[**CommissionDtoListEnvelope**](CommissionDtoListEnvelope.md)

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

<a id="getCommissionsCountAsync"></a>
# **getCommissionsCountAsync**
> Int32Envelope getCommissionsCountAsync(tenantId, apiVersion, xApiVersion)

Get the count of commissions for a tenant

Retrieves the count of commissions for the specified tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CommissionsApi apiInstance = new CommissionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getCommissionsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommissionsApi#getCommissionsCountAsync");
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

<a id="getPaymentCommissionAsync"></a>
# **getPaymentCommissionAsync**
> PaymentCommissionDtoEnvelope getPaymentCommissionAsync(tenantId, paymentCommissionId, apiVersion, xApiVersion)

Get a payment commission by id

Retrieves a payment commission by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CommissionsApi apiInstance = new CommissionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID paymentCommissionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      PaymentCommissionDtoEnvelope result = apiInstance.getPaymentCommissionAsync(tenantId, paymentCommissionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommissionsApi#getPaymentCommissionAsync");
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
| **paymentCommissionId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**PaymentCommissionDtoEnvelope**](PaymentCommissionDtoEnvelope.md)

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

<a id="getPaymentCommissionsAsync"></a>
# **getPaymentCommissionsAsync**
> PaymentCommissionDtoListEnvelope getPaymentCommissionsAsync(tenantId, apiVersion, xApiVersion)

Get all payment commissions for a tenant

Retrieves all payment commissions for the specified tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CommissionsApi apiInstance = new CommissionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      PaymentCommissionDtoListEnvelope result = apiInstance.getPaymentCommissionsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommissionsApi#getPaymentCommissionsAsync");
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

[**PaymentCommissionDtoListEnvelope**](PaymentCommissionDtoListEnvelope.md)

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

<a id="getPaymentCommissionsCountAsync"></a>
# **getPaymentCommissionsCountAsync**
> Int32Envelope getPaymentCommissionsCountAsync(tenantId, apiVersion, xApiVersion)

Get the count of payment commissions for a tenant

Retrieves the count of payment commissions for the specified tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CommissionsApi apiInstance = new CommissionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getPaymentCommissionsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommissionsApi#getPaymentCommissionsCountAsync");
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

<a id="updateCommissionAsync"></a>
# **updateCommissionAsync**
> EmptyEnvelope updateCommissionAsync(tenantId, commissionId, commissionUpdateDto, apiVersion, xApiVersion)

Update a commission

Updates an existing commission.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CommissionsApi apiInstance = new CommissionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID commissionId = UUID.randomUUID(); // UUID | 
    CommissionUpdateDto commissionUpdateDto = new CommissionUpdateDto(); // CommissionUpdateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.updateCommissionAsync(tenantId, commissionId, commissionUpdateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommissionsApi#updateCommissionAsync");
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
| **commissionId** | **UUID**|  | |
| **commissionUpdateDto** | [**CommissionUpdateDto**](CommissionUpdateDto.md)|  | |
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

<a id="updatePaymentCommissionAsync"></a>
# **updatePaymentCommissionAsync**
> EmptyEnvelope updatePaymentCommissionAsync(tenantId, paymentCommissionId, paymentCommissionUpdateDto, apiVersion, xApiVersion)

Update a payment commission

Updates an existing payment commission.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CommissionsApi apiInstance = new CommissionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID paymentCommissionId = UUID.randomUUID(); // UUID | 
    PaymentCommissionUpdateDto paymentCommissionUpdateDto = new PaymentCommissionUpdateDto(); // PaymentCommissionUpdateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.updatePaymentCommissionAsync(tenantId, paymentCommissionId, paymentCommissionUpdateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommissionsApi#updatePaymentCommissionAsync");
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
| **paymentCommissionId** | **UUID**|  | |
| **paymentCommissionUpdateDto** | [**PaymentCommissionUpdateDto**](PaymentCommissionUpdateDto.md)|  | |
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

