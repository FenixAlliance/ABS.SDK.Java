# SigningParticipantsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSigningParticipantByIdAsync**](SigningParticipantsApi.md#getSigningParticipantByIdAsync) | **GET** /api/v2/TrustService/SigningParticipants/{id} | Get signing participant by ID |
| [**getSigningParticipantsAsync**](SigningParticipantsApi.md#getSigningParticipantsAsync) | **GET** /api/v2/TrustService/SigningParticipants | Get all signing participants |
| [**getSigningParticipantsCountAsync**](SigningParticipantsApi.md#getSigningParticipantsCountAsync) | **GET** /api/v2/TrustService/SigningParticipants/Count | Get signing participants count |
| [**markViewedAsync**](SigningParticipantsApi.md#markViewedAsync) | **POST** /api/v2/TrustService/SigningParticipants/{id}/viewed | Mark a participant as having viewed the request |
| [**recordOutcomeAsync**](SigningParticipantsApi.md#recordOutcomeAsync) | **POST** /api/v2/TrustService/SigningParticipants/{id}/outcome | Record a manual/external participant outcome |


<a id="getSigningParticipantByIdAsync"></a>
# **getSigningParticipantByIdAsync**
> SigningParticipantDto getSigningParticipantByIdAsync(tenantId, id, apiVersion, xApiVersion)

Get signing participant by ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SigningParticipantsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SigningParticipantsApi apiInstance = new SigningParticipantsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String id = "id_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SigningParticipantDto result = apiInstance.getSigningParticipantByIdAsync(tenantId, id, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SigningParticipantsApi#getSigningParticipantByIdAsync");
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
| **id** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**SigningParticipantDto**](SigningParticipantDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getSigningParticipantsAsync"></a>
# **getSigningParticipantsAsync**
> SigningParticipantDtoListEnvelope getSigningParticipantsAsync(tenantId, apiVersion, xApiVersion)

Get all signing participants

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SigningParticipantsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SigningParticipantsApi apiInstance = new SigningParticipantsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SigningParticipantDtoListEnvelope result = apiInstance.getSigningParticipantsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SigningParticipantsApi#getSigningParticipantsAsync");
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

[**SigningParticipantDtoListEnvelope**](SigningParticipantDtoListEnvelope.md)

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

<a id="getSigningParticipantsCountAsync"></a>
# **getSigningParticipantsCountAsync**
> Int32Envelope getSigningParticipantsCountAsync(tenantId, apiVersion, xApiVersion)

Get signing participants count

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SigningParticipantsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SigningParticipantsApi apiInstance = new SigningParticipantsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getSigningParticipantsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SigningParticipantsApi#getSigningParticipantsCountAsync");
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

<a id="markViewedAsync"></a>
# **markViewedAsync**
> markViewedAsync(tenantId, id, apiVersion, xApiVersion)

Mark a participant as having viewed the request

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SigningParticipantsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SigningParticipantsApi apiInstance = new SigningParticipantsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String id = "id_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.markViewedAsync(tenantId, id, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling SigningParticipantsApi#markViewedAsync");
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
| **id** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="recordOutcomeAsync"></a>
# **recordOutcomeAsync**
> recordOutcomeAsync(tenantId, id, apiVersion, xApiVersion, recordSigningParticipantOutcomeDto)

Record a manual/external participant outcome

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SigningParticipantsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SigningParticipantsApi apiInstance = new SigningParticipantsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String id = "id_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    RecordSigningParticipantOutcomeDto recordSigningParticipantOutcomeDto = new RecordSigningParticipantOutcomeDto(); // RecordSigningParticipantOutcomeDto | 
    try {
      apiInstance.recordOutcomeAsync(tenantId, id, apiVersion, xApiVersion, recordSigningParticipantOutcomeDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling SigningParticipantsApi#recordOutcomeAsync");
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
| **id** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **recordSigningParticipantOutcomeDto** | [**RecordSigningParticipantOutcomeDto**](RecordSigningParticipantOutcomeDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

