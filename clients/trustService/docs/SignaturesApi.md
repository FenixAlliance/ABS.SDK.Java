# SignaturesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSignatureByIdAsync**](SignaturesApi.md#getSignatureByIdAsync) | **GET** /api/v2/TrustService/Signatures/{id} | Get signature by ID |
| [**getSignaturesAsync**](SignaturesApi.md#getSignaturesAsync) | **GET** /api/v2/TrustService/Signatures | Get all signatures |
| [**getSignaturesCountAsync**](SignaturesApi.md#getSignaturesCountAsync) | **GET** /api/v2/TrustService/Signatures/Count | Get signatures count |


<a id="getSignatureByIdAsync"></a>
# **getSignatureByIdAsync**
> SignatureDto getSignatureByIdAsync(tenantId, id, apiVersion, xApiVersion)

Get signature by ID

Retrieves a specific signature by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SignaturesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SignaturesApi apiInstance = new SignaturesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SignatureDto result = apiInstance.getSignatureByIdAsync(tenantId, id, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SignaturesApi#getSignatureByIdAsync");
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
| **id** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**SignatureDto**](SignatureDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getSignaturesAsync"></a>
# **getSignaturesAsync**
> SignatureDtoListEnvelope getSignaturesAsync(tenantId, apiVersion, xApiVersion, signatureDtoCollectionQueryParameters)

Get all signatures

Retrieves all signatures for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SignaturesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SignaturesApi apiInstance = new SignaturesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SignatureDtoCollectionQueryParameters signatureDtoCollectionQueryParameters = new SignatureDtoCollectionQueryParameters(); // SignatureDtoCollectionQueryParameters | 
    try {
      SignatureDtoListEnvelope result = apiInstance.getSignaturesAsync(tenantId, apiVersion, xApiVersion, signatureDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SignaturesApi#getSignaturesAsync");
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
| **signatureDtoCollectionQueryParameters** | [**SignatureDtoCollectionQueryParameters**](SignatureDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**SignatureDtoListEnvelope**](SignatureDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **200** | OK |  -  |

<a id="getSignaturesCountAsync"></a>
# **getSignaturesCountAsync**
> Int32Envelope getSignaturesCountAsync(tenantId, apiVersion, xApiVersion, signatureDtoCollectionQueryParameters)

Get signatures count

Returns the count of signatures for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SignaturesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SignaturesApi apiInstance = new SignaturesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SignatureDtoCollectionQueryParameters signatureDtoCollectionQueryParameters = new SignatureDtoCollectionQueryParameters(); // SignatureDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getSignaturesCountAsync(tenantId, apiVersion, xApiVersion, signatureDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SignaturesApi#getSignaturesCountAsync");
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
| **signatureDtoCollectionQueryParameters** | [**SignatureDtoCollectionQueryParameters**](SignatureDtoCollectionQueryParameters.md)|  | [optional] |

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
| **200** | OK |  -  |

