# PaymentProviderRegistrationsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAsync**](PaymentProviderRegistrationsApi.md#createAsync) | **POST** /api/v2/PaymentsService/PaymentProviderRegistrations | Provisions a provider webhook registration |
| [**getAsync**](PaymentProviderRegistrationsApi.md#getAsync) | **GET** /api/v2/PaymentsService/PaymentProviderRegistrations | Lists the tenant&#39;s provider registrations |
| [**getCountAsync**](PaymentProviderRegistrationsApi.md#getCountAsync) | **GET** /api/v2/PaymentsService/PaymentProviderRegistrations/Count | Counts the tenant&#39;s provider registrations |
| [**rotateKeyAsync**](PaymentProviderRegistrationsApi.md#rotateKeyAsync) | **POST** /api/v2/PaymentsService/PaymentProviderRegistrations/{registrationId}/RotateKey | Rotates a registration&#39;s webhook key |


<a id="createAsync"></a>
# **createAsync**
> ProviderWebhookRegistrationCreatedDtoEnvelope createAsync(tenantId, createProviderWebhookRegistrationRequest)

Provisions a provider webhook registration

Stores the BYO signing secret in the tenant options store, creates + activates the registration, and reveals the one-time plaintext webhook key plus its fully-composed inbound URL.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentProviderRegistrationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PaymentProviderRegistrationsApi apiInstance = new PaymentProviderRegistrationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    CreateProviderWebhookRegistrationRequest createProviderWebhookRegistrationRequest = new CreateProviderWebhookRegistrationRequest(); // CreateProviderWebhookRegistrationRequest | 
    try {
      ProviderWebhookRegistrationCreatedDtoEnvelope result = apiInstance.createAsync(tenantId, createProviderWebhookRegistrationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentProviderRegistrationsApi#createAsync");
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
| **createProviderWebhookRegistrationRequest** | [**CreateProviderWebhookRegistrationRequest**](CreateProviderWebhookRegistrationRequest.md)|  | [optional] |

### Return type

[**ProviderWebhookRegistrationCreatedDtoEnvelope**](ProviderWebhookRegistrationCreatedDtoEnvelope.md)

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

<a id="getAsync"></a>
# **getAsync**
> PaymentProviderRegistrationDtoListEnvelope getAsync(tenantId, paymentProviderRegistrationDtoCollectionQueryParameters)

Lists the tenant&#39;s provider registrations

Gets all provider registrations for the current tenant with OData support (no secret is ever returned).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentProviderRegistrationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PaymentProviderRegistrationsApi apiInstance = new PaymentProviderRegistrationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    PaymentProviderRegistrationDtoCollectionQueryParameters paymentProviderRegistrationDtoCollectionQueryParameters = new PaymentProviderRegistrationDtoCollectionQueryParameters(); // PaymentProviderRegistrationDtoCollectionQueryParameters | 
    try {
      PaymentProviderRegistrationDtoListEnvelope result = apiInstance.getAsync(tenantId, paymentProviderRegistrationDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentProviderRegistrationsApi#getAsync");
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
| **paymentProviderRegistrationDtoCollectionQueryParameters** | [**PaymentProviderRegistrationDtoCollectionQueryParameters**](PaymentProviderRegistrationDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**PaymentProviderRegistrationDtoListEnvelope**](PaymentProviderRegistrationDtoListEnvelope.md)

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

<a id="getCountAsync"></a>
# **getCountAsync**
> Int32Envelope getCountAsync(tenantId, paymentProviderRegistrationDtoCollectionQueryParameters)

Counts the tenant&#39;s provider registrations

Gets the count of provider registrations for the current tenant (OData sibling of the list).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentProviderRegistrationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PaymentProviderRegistrationsApi apiInstance = new PaymentProviderRegistrationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    PaymentProviderRegistrationDtoCollectionQueryParameters paymentProviderRegistrationDtoCollectionQueryParameters = new PaymentProviderRegistrationDtoCollectionQueryParameters(); // PaymentProviderRegistrationDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getCountAsync(tenantId, paymentProviderRegistrationDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentProviderRegistrationsApi#getCountAsync");
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
| **paymentProviderRegistrationDtoCollectionQueryParameters** | [**PaymentProviderRegistrationDtoCollectionQueryParameters**](PaymentProviderRegistrationDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

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

<a id="rotateKeyAsync"></a>
# **rotateKeyAsync**
> ProviderWebhookRegistrationCreatedDtoEnvelope rotateKeyAsync(tenantId, registrationId)

Rotates a registration&#39;s webhook key

Mints a fresh webhook key (invalidating the previous one) and reveals it once, plus its composed URL.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentProviderRegistrationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PaymentProviderRegistrationsApi apiInstance = new PaymentProviderRegistrationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID registrationId = UUID.randomUUID(); // UUID | 
    try {
      ProviderWebhookRegistrationCreatedDtoEnvelope result = apiInstance.rotateKeyAsync(tenantId, registrationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentProviderRegistrationsApi#rotateKeyAsync");
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
| **registrationId** | **UUID**|  | |

### Return type

[**ProviderWebhookRegistrationCreatedDtoEnvelope**](ProviderWebhookRegistrationCreatedDtoEnvelope.md)

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

