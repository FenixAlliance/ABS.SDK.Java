# EmailSignaturesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEmailSignatureAsync**](EmailSignaturesApi.md#createEmailSignatureAsync) | **POST** /api/v2/MarketingService/EmailSignatures | Create an email signature |
| [**deleteEmailSignatureAsync**](EmailSignaturesApi.md#deleteEmailSignatureAsync) | **DELETE** /api/v2/MarketingService/EmailSignatures/{emailsignatureId} | Delete an email signature |
| [**getEmailSignatureDetailsAsync**](EmailSignaturesApi.md#getEmailSignatureDetailsAsync) | **GET** /api/v2/MarketingService/EmailSignatures/{emailsignatureId} | Get email signature by ID |
| [**getEmailSignaturesCountAsync**](EmailSignaturesApi.md#getEmailSignaturesCountAsync) | **GET** /api/v2/MarketingService/EmailSignatures/Count | Get email signatures count |
| [**getEmailSignaturesODataAsync**](EmailSignaturesApi.md#getEmailSignaturesODataAsync) | **GET** /api/v2/MarketingService/EmailSignatures | Get email signatures |
| [**updateEmailSignatureAsync**](EmailSignaturesApi.md#updateEmailSignatureAsync) | **PUT** /api/v2/MarketingService/EmailSignatures/{emailsignatureId} | Update an email signature |


<a id="createEmailSignatureAsync"></a>
# **createEmailSignatureAsync**
> EmptyEnvelope createEmailSignatureAsync(tenantId, emailSignatureCreateDto, apiVersion, xApiVersion)

Create an email signature

Creates a new email signature for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmailSignaturesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    EmailSignaturesApi apiInstance = new EmailSignaturesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    EmailSignatureCreateDto emailSignatureCreateDto = new EmailSignatureCreateDto(); // EmailSignatureCreateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.createEmailSignatureAsync(tenantId, emailSignatureCreateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailSignaturesApi#createEmailSignatureAsync");
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
| **emailSignatureCreateDto** | [**EmailSignatureCreateDto**](EmailSignatureCreateDto.md)|  | |
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

<a id="deleteEmailSignatureAsync"></a>
# **deleteEmailSignatureAsync**
> EmptyEnvelope deleteEmailSignatureAsync(tenantId, emailsignatureId, apiVersion, xApiVersion)

Delete an email signature

Deletes an email signature by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmailSignaturesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    EmailSignaturesApi apiInstance = new EmailSignaturesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID emailsignatureId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteEmailSignatureAsync(tenantId, emailsignatureId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailSignaturesApi#deleteEmailSignatureAsync");
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
| **emailsignatureId** | **UUID**|  | |
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

<a id="getEmailSignatureDetailsAsync"></a>
# **getEmailSignatureDetailsAsync**
> EmailSignatureDtoEnvelope getEmailSignatureDetailsAsync(tenantId, emailsignatureId, apiVersion, xApiVersion)

Get email signature by ID

Retrieves the details of a specific email signature by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmailSignaturesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    EmailSignaturesApi apiInstance = new EmailSignaturesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID emailsignatureId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmailSignatureDtoEnvelope result = apiInstance.getEmailSignatureDetailsAsync(tenantId, emailsignatureId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailSignaturesApi#getEmailSignatureDetailsAsync");
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
| **emailsignatureId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**EmailSignatureDtoEnvelope**](EmailSignatureDtoEnvelope.md)

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

<a id="getEmailSignaturesCountAsync"></a>
# **getEmailSignaturesCountAsync**
> Int32Envelope getEmailSignaturesCountAsync(tenantId, apiVersion, xApiVersion)

Get email signatures count

Returns the count of email signatures for the specified tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmailSignaturesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    EmailSignaturesApi apiInstance = new EmailSignaturesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getEmailSignaturesCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailSignaturesApi#getEmailSignaturesCountAsync");
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

<a id="getEmailSignaturesODataAsync"></a>
# **getEmailSignaturesODataAsync**
> EmailSignatureDtoListEnvelope getEmailSignaturesODataAsync(tenantId, apiVersion, xApiVersion)

Get email signatures

Retrieves a collection of email signatures for the specified tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmailSignaturesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    EmailSignaturesApi apiInstance = new EmailSignaturesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmailSignatureDtoListEnvelope result = apiInstance.getEmailSignaturesODataAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailSignaturesApi#getEmailSignaturesODataAsync");
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

[**EmailSignatureDtoListEnvelope**](EmailSignatureDtoListEnvelope.md)

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

<a id="updateEmailSignatureAsync"></a>
# **updateEmailSignatureAsync**
> EmptyEnvelope updateEmailSignatureAsync(tenantId, emailsignatureId, emailSignatureUpdateDto, apiVersion, xApiVersion)

Update an email signature

Updates an existing email signature by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmailSignaturesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    EmailSignaturesApi apiInstance = new EmailSignaturesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID emailsignatureId = UUID.randomUUID(); // UUID | 
    EmailSignatureUpdateDto emailSignatureUpdateDto = new EmailSignatureUpdateDto(); // EmailSignatureUpdateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.updateEmailSignatureAsync(tenantId, emailsignatureId, emailSignatureUpdateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailSignaturesApi#updateEmailSignatureAsync");
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
| **emailsignatureId** | **UUID**|  | |
| **emailSignatureUpdateDto** | [**EmailSignatureUpdateDto**](EmailSignatureUpdateDto.md)|  | |
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

