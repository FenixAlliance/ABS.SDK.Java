# SigningEngineApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getProvidersAsync**](SigningEngineApi.md#getProvidersAsync) | **GET** /api/v2/TrustService/SigningEngine/Providers | List signing providers |
| [**getProvidersCountAsync**](SigningEngineApi.md#getProvidersCountAsync) | **GET** /api/v2/TrustService/SigningEngine/Providers/Count | Count signing providers |
| [**previewAsync**](SigningEngineApi.md#previewAsync) | **POST** /api/v2/TrustService/SigningEngine/Preview | Preview signing readiness |


<a id="getProvidersAsync"></a>
# **getProvidersAsync**
> TrustSigningProviderDescriptorDtoListEnvelope getProvidersAsync(tenantId, apiVersion, xApiVersion)

List signing providers

Returns the registered alpha signing providers (Noop / Manual / External). OData-queryable.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SigningEngineApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SigningEngineApi apiInstance = new SigningEngineApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TrustSigningProviderDescriptorDtoListEnvelope result = apiInstance.getProvidersAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SigningEngineApi#getProvidersAsync");
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

[**TrustSigningProviderDescriptorDtoListEnvelope**](TrustSigningProviderDescriptorDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **200** | OK |  -  |

<a id="getProvidersCountAsync"></a>
# **getProvidersCountAsync**
> Int32Envelope getProvidersCountAsync(tenantId, apiVersion, xApiVersion)

Count signing providers

Returns the count of registered alpha signing providers. OData-queryable.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SigningEngineApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SigningEngineApi apiInstance = new SigningEngineApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getProvidersCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SigningEngineApi#getProvidersCountAsync");
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
| **200** | OK |  -  |

<a id="previewAsync"></a>
# **previewAsync**
> TrustSigningReadinessDtoEnvelope previewAsync(tenantId, apiVersion, xApiVersion, trustSigningRequestDto)

Preview signing readiness

Side-effect-free: validates a signing request and reports whether it can proceed and with what policy.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SigningEngineApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SigningEngineApi apiInstance = new SigningEngineApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TrustSigningRequestDto trustSigningRequestDto = new TrustSigningRequestDto(); // TrustSigningRequestDto | 
    try {
      TrustSigningReadinessDtoEnvelope result = apiInstance.previewAsync(tenantId, apiVersion, xApiVersion, trustSigningRequestDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SigningEngineApi#previewAsync");
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
| **trustSigningRequestDto** | [**TrustSigningRequestDto**](TrustSigningRequestDto.md)|  | [optional] |

### Return type

[**TrustSigningReadinessDtoEnvelope**](TrustSigningReadinessDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

