# SigningRequestsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addParticipantAsync**](SigningRequestsApi.md#addParticipantAsync) | **POST** /api/v2/TrustService/SigningRequests/{id}/participants | Add a participant to a signing request |
| [**createFromDocumentAsync**](SigningRequestsApi.md#createFromDocumentAsync) | **POST** /api/v2/TrustService/SigningRequests/from-document/{signedDocumentId} | Create a signing request from a frozen document |
| [**executeProviderAsync**](SigningRequestsApi.md#executeProviderAsync) | **POST** /api/v2/TrustService/SigningRequests/{id}/execute-provider | Run a signing provider to produce + finalize the signed artifact |
| [**expireAsync**](SigningRequestsApi.md#expireAsync) | **POST** /api/v2/TrustService/SigningRequests/{id}/expire | Expire a signing request |
| [**finalizeAsync**](SigningRequestsApi.md#finalizeAsync) | **POST** /api/v2/TrustService/SigningRequests/{id}/finalize | Finalize a completed request into a signed artifact |
| [**getSigningRequestByIdAsync**](SigningRequestsApi.md#getSigningRequestByIdAsync) | **GET** /api/v2/TrustService/SigningRequests/{id} | Get signing request by ID |
| [**getSigningRequestParticipantsAsync**](SigningRequestsApi.md#getSigningRequestParticipantsAsync) | **GET** /api/v2/TrustService/SigningRequests/{id}/Participants | Get participants of a signing request |
| [**getSigningRequestsAsync**](SigningRequestsApi.md#getSigningRequestsAsync) | **GET** /api/v2/TrustService/SigningRequests | Get all signing requests |
| [**getSigningRequestsCountAsync**](SigningRequestsApi.md#getSigningRequestsCountAsync) | **GET** /api/v2/TrustService/SigningRequests/Count | Get signing requests count |
| [**prepareAndCreateAsync**](SigningRequestsApi.md#prepareAndCreateAsync) | **POST** /api/v2/TrustService/SigningRequests/prepare-and-create | Create, store, freeze a document and open a signing request in one call |
| [**sendAsync**](SigningRequestsApi.md#sendAsync) | **POST** /api/v2/TrustService/SigningRequests/{id}/send | Send a signing request |
| [**voidAsync**](SigningRequestsApi.md#voidAsync) | **POST** /api/v2/TrustService/SigningRequests/{id}/void | Void a signing request |


<a id="addParticipantAsync"></a>
# **addParticipantAsync**
> SigningParticipantDto addParticipantAsync(tenantId, id, apiVersion, xApiVersion, createSigningParticipantDto)

Add a participant to a signing request

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SigningRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SigningRequestsApi apiInstance = new SigningRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String id = "id_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CreateSigningParticipantDto createSigningParticipantDto = new CreateSigningParticipantDto(); // CreateSigningParticipantDto | 
    try {
      SigningParticipantDto result = apiInstance.addParticipantAsync(tenantId, id, apiVersion, xApiVersion, createSigningParticipantDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SigningRequestsApi#addParticipantAsync");
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
| **createSigningParticipantDto** | [**CreateSigningParticipantDto**](CreateSigningParticipantDto.md)|  | [optional] |

### Return type

[**SigningParticipantDto**](SigningParticipantDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createFromDocumentAsync"></a>
# **createFromDocumentAsync**
> SigningRequestDto createFromDocumentAsync(tenantId, signedDocumentId, apiVersion, xApiVersion, createSigningRequestDto)

Create a signing request from a frozen document

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SigningRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SigningRequestsApi apiInstance = new SigningRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String signedDocumentId = "signedDocumentId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CreateSigningRequestDto createSigningRequestDto = new CreateSigningRequestDto(); // CreateSigningRequestDto | 
    try {
      SigningRequestDto result = apiInstance.createFromDocumentAsync(tenantId, signedDocumentId, apiVersion, xApiVersion, createSigningRequestDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SigningRequestsApi#createFromDocumentAsync");
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
| **signedDocumentId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **createSigningRequestDto** | [**CreateSigningRequestDto**](CreateSigningRequestDto.md)|  | [optional] |

### Return type

[**SigningRequestDto**](SigningRequestDto.md)

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

<a id="executeProviderAsync"></a>
# **executeProviderAsync**
> executeProviderAsync(tenantId, id, apiVersion, xApiVersion, executeSigningRequestDto)

Run a signing provider to produce + finalize the signed artifact

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SigningRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SigningRequestsApi apiInstance = new SigningRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String id = "id_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ExecuteSigningRequestDto executeSigningRequestDto = new ExecuteSigningRequestDto(); // ExecuteSigningRequestDto | 
    try {
      apiInstance.executeProviderAsync(tenantId, id, apiVersion, xApiVersion, executeSigningRequestDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling SigningRequestsApi#executeProviderAsync");
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
| **executeSigningRequestDto** | [**ExecuteSigningRequestDto**](ExecuteSigningRequestDto.md)|  | [optional] |

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

<a id="expireAsync"></a>
# **expireAsync**
> expireAsync(tenantId, id, apiVersion, xApiVersion)

Expire a signing request

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SigningRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SigningRequestsApi apiInstance = new SigningRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String id = "id_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.expireAsync(tenantId, id, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling SigningRequestsApi#expireAsync");
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

<a id="finalizeAsync"></a>
# **finalizeAsync**
> finalizeAsync(tenantId, id, apiVersion, xApiVersion, finalizeSigningRequestDto)

Finalize a completed request into a signed artifact

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SigningRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SigningRequestsApi apiInstance = new SigningRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String id = "id_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    FinalizeSigningRequestDto finalizeSigningRequestDto = new FinalizeSigningRequestDto(); // FinalizeSigningRequestDto | 
    try {
      apiInstance.finalizeAsync(tenantId, id, apiVersion, xApiVersion, finalizeSigningRequestDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling SigningRequestsApi#finalizeAsync");
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
| **finalizeSigningRequestDto** | [**FinalizeSigningRequestDto**](FinalizeSigningRequestDto.md)|  | [optional] |

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

<a id="getSigningRequestByIdAsync"></a>
# **getSigningRequestByIdAsync**
> SigningRequestDto getSigningRequestByIdAsync(tenantId, id, apiVersion, xApiVersion)

Get signing request by ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SigningRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SigningRequestsApi apiInstance = new SigningRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String id = "id_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SigningRequestDto result = apiInstance.getSigningRequestByIdAsync(tenantId, id, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SigningRequestsApi#getSigningRequestByIdAsync");
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

[**SigningRequestDto**](SigningRequestDto.md)

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

<a id="getSigningRequestParticipantsAsync"></a>
# **getSigningRequestParticipantsAsync**
> SigningParticipantDtoListEnvelope getSigningRequestParticipantsAsync(tenantId, id, apiVersion, xApiVersion)

Get participants of a signing request

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SigningRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SigningRequestsApi apiInstance = new SigningRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String id = "id_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SigningParticipantDtoListEnvelope result = apiInstance.getSigningRequestParticipantsAsync(tenantId, id, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SigningRequestsApi#getSigningRequestParticipantsAsync");
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

[**SigningParticipantDtoListEnvelope**](SigningParticipantDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getSigningRequestsAsync"></a>
# **getSigningRequestsAsync**
> SigningRequestDtoListEnvelope getSigningRequestsAsync(tenantId, apiVersion, xApiVersion)

Get all signing requests

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SigningRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SigningRequestsApi apiInstance = new SigningRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SigningRequestDtoListEnvelope result = apiInstance.getSigningRequestsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SigningRequestsApi#getSigningRequestsAsync");
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

[**SigningRequestDtoListEnvelope**](SigningRequestDtoListEnvelope.md)

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

<a id="getSigningRequestsCountAsync"></a>
# **getSigningRequestsCountAsync**
> Int32Envelope getSigningRequestsCountAsync(tenantId, apiVersion, xApiVersion)

Get signing requests count

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SigningRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SigningRequestsApi apiInstance = new SigningRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getSigningRequestsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SigningRequestsApi#getSigningRequestsCountAsync");
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

<a id="prepareAndCreateAsync"></a>
# **prepareAndCreateAsync**
> SigningRequestDto prepareAndCreateAsync(tenantId, apiVersion, xApiVersion, _file, title, contactId, routingMode, expiresAtUtc, message, correlationId, externalReference, signers)

Create, store, freeze a document and open a signing request in one call

Server-owned flow (T-UX4): creates a SignedDocument from the uploaded source, stores it, freezes it, then creates a signing request over the frozen artifact and attaches its signers — all in one unit of work. Evidence truth (status/hashes/ids/tokens) is server-produced; the caller supplies intent only. The server generates the new document id.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SigningRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SigningRequestsApi apiInstance = new SigningRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    File _file = new File("/path/to/file"); // File | 
    String title = "title_example"; // String | 
    String contactId = "contactId_example"; // String | 
    String routingMode = "Parallel"; // String | 
    OffsetDateTime expiresAtUtc = OffsetDateTime.now(); // OffsetDateTime | 
    String message = "message_example"; // String | 
    String correlationId = "correlationId_example"; // String | 
    String externalReference = "externalReference_example"; // String | 
    String signers = "signers_example"; // String | 
    try {
      SigningRequestDto result = apiInstance.prepareAndCreateAsync(tenantId, apiVersion, xApiVersion, _file, title, contactId, routingMode, expiresAtUtc, message, correlationId, externalReference, signers);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SigningRequestsApi#prepareAndCreateAsync");
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
| **_file** | **File**|  | [optional] |
| **title** | **String**|  | [optional] |
| **contactId** | **String**|  | [optional] |
| **routingMode** | **String**|  | [optional] [enum: Parallel, Sequential] |
| **expiresAtUtc** | **OffsetDateTime**|  | [optional] |
| **message** | **String**|  | [optional] |
| **correlationId** | **String**|  | [optional] |
| **externalReference** | **String**|  | [optional] |
| **signers** | **String**|  | [optional] |

### Return type

[**SigningRequestDto**](SigningRequestDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data, application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **400** | Bad Request |  -  |
| **409** | Conflict |  -  |
| **200** | OK |  -  |

<a id="sendAsync"></a>
# **sendAsync**
> sendAsync(tenantId, id, apiVersion, xApiVersion)

Send a signing request

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SigningRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SigningRequestsApi apiInstance = new SigningRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String id = "id_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.sendAsync(tenantId, id, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling SigningRequestsApi#sendAsync");
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

<a id="voidAsync"></a>
# **voidAsync**
> voidAsync(tenantId, id, apiVersion, xApiVersion, voidSigningRequestDto)

Void a signing request

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SigningRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SigningRequestsApi apiInstance = new SigningRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String id = "id_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    VoidSigningRequestDto voidSigningRequestDto = new VoidSigningRequestDto(); // VoidSigningRequestDto | 
    try {
      apiInstance.voidAsync(tenantId, id, apiVersion, xApiVersion, voidSigningRequestDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling SigningRequestsApi#voidAsync");
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
| **voidSigningRequestDto** | [**VoidSigningRequestDto**](VoidSigningRequestDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

