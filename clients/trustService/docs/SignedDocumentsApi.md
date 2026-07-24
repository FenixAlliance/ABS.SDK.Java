# SignedDocumentsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSignedDocumentAsync**](SignedDocumentsApi.md#createSignedDocumentAsync) | **POST** /api/v2/TrustService/SignedDocuments | Create a new signed document |
| [**deleteSignedDocumentAsync**](SignedDocumentsApi.md#deleteSignedDocumentAsync) | **DELETE** /api/v2/TrustService/SignedDocuments/{id} | Delete a signed document |
| [**getSignedDocumentByIdAsync**](SignedDocumentsApi.md#getSignedDocumentByIdAsync) | **GET** /api/v2/TrustService/SignedDocuments/{id} | Get signed document by ID |
| [**getSignedDocumentsAsync**](SignedDocumentsApi.md#getSignedDocumentsAsync) | **GET** /api/v2/TrustService/SignedDocuments | Get all signed documents |
| [**getSignedDocumentsCountAsync**](SignedDocumentsApi.md#getSignedDocumentsCountAsync) | **GET** /api/v2/TrustService/SignedDocuments/Count | Get signed documents count |
| [**patchSignedDocumentAsync**](SignedDocumentsApi.md#patchSignedDocumentAsync) | **PATCH** /api/v2/TrustService/SignedDocuments/{id} | Patch a signed document |
| [**prepareAndQuickSignAsync**](SignedDocumentsApi.md#prepareAndQuickSignAsync) | **POST** /api/v2/TrustService/SignedDocuments/prepare-and-quick-sign | Create, freeze, and quick-sign a document in one call |
| [**quickSignSignedDocumentAsync**](SignedDocumentsApi.md#quickSignSignedDocumentAsync) | **POST** /api/v2/TrustService/SignedDocuments/{id}/quick-sign | Quick-sign a frozen document |
| [**updateSignedDocumentAsync**](SignedDocumentsApi.md#updateSignedDocumentAsync) | **PUT** /api/v2/TrustService/SignedDocuments/{id} | Update a signed document |
| [**verifySignedDocumentSignatureAsync**](SignedDocumentsApi.md#verifySignedDocumentSignatureAsync) | **GET** /api/v2/TrustService/SignedDocuments/{id}/verify-signature | Verify a signed document&#39;s signature |


<a id="createSignedDocumentAsync"></a>
# **createSignedDocumentAsync**
> createSignedDocumentAsync(tenantId, apiVersion, xApiVersion, signedDocumentCreateDto)

Create a new signed document

Creates a new signed document for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SignedDocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SignedDocumentsApi apiInstance = new SignedDocumentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SignedDocumentCreateDto signedDocumentCreateDto = new SignedDocumentCreateDto(); // SignedDocumentCreateDto | 
    try {
      apiInstance.createSignedDocumentAsync(tenantId, apiVersion, xApiVersion, signedDocumentCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling SignedDocumentsApi#createSignedDocumentAsync");
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
| **signedDocumentCreateDto** | [**SignedDocumentCreateDto**](SignedDocumentCreateDto.md)|  | [optional] |

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
| **403** | Forbidden |  -  |
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

<a id="deleteSignedDocumentAsync"></a>
# **deleteSignedDocumentAsync**
> deleteSignedDocumentAsync(tenantId, id, apiVersion, xApiVersion)

Delete a signed document

Deletes a signed document for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SignedDocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SignedDocumentsApi apiInstance = new SignedDocumentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteSignedDocumentAsync(tenantId, id, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling SignedDocumentsApi#deleteSignedDocumentAsync");
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

null (empty response body)

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

<a id="getSignedDocumentByIdAsync"></a>
# **getSignedDocumentByIdAsync**
> SignedDocumentDto getSignedDocumentByIdAsync(tenantId, id, apiVersion, xApiVersion)

Get signed document by ID

Retrieves a specific signed document by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SignedDocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SignedDocumentsApi apiInstance = new SignedDocumentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SignedDocumentDto result = apiInstance.getSignedDocumentByIdAsync(tenantId, id, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SignedDocumentsApi#getSignedDocumentByIdAsync");
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

[**SignedDocumentDto**](SignedDocumentDto.md)

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

<a id="getSignedDocumentsAsync"></a>
# **getSignedDocumentsAsync**
> SignedDocumentDtoListEnvelope getSignedDocumentsAsync(tenantId, apiVersion, xApiVersion)

Get all signed documents

Retrieves all signed documents for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SignedDocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SignedDocumentsApi apiInstance = new SignedDocumentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SignedDocumentDtoListEnvelope result = apiInstance.getSignedDocumentsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SignedDocumentsApi#getSignedDocumentsAsync");
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

[**SignedDocumentDtoListEnvelope**](SignedDocumentDtoListEnvelope.md)

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

<a id="getSignedDocumentsCountAsync"></a>
# **getSignedDocumentsCountAsync**
> Int32Envelope getSignedDocumentsCountAsync(tenantId, apiVersion, xApiVersion)

Get signed documents count

Returns the count of signed documents for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SignedDocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SignedDocumentsApi apiInstance = new SignedDocumentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getSignedDocumentsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SignedDocumentsApi#getSignedDocumentsCountAsync");
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

<a id="patchSignedDocumentAsync"></a>
# **patchSignedDocumentAsync**
> EmptyEnvelope patchSignedDocumentAsync(tenantId, id, apiVersion, xApiVersion, operation)

Patch a signed document

Patch a signed document

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SignedDocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SignedDocumentsApi apiInstance = new SignedDocumentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    List<Operation> operation = Arrays.asList(); // List<Operation> | 
    try {
      EmptyEnvelope result = apiInstance.patchSignedDocumentAsync(tenantId, id, apiVersion, xApiVersion, operation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SignedDocumentsApi#patchSignedDocumentAsync");
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
| **operation** | [**List&lt;Operation&gt;**](Operation.md)|  | [optional] |

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

<a id="prepareAndQuickSignAsync"></a>
# **prepareAndQuickSignAsync**
> SignedDocumentDto prepareAndQuickSignAsync(tenantId, apiVersion, xApiVersion, id, _file, title, contactId, signingCertificateId, signingProfileId, providerName)

Create, freeze, and quick-sign a document in one call

Server-side single-signer flow: creates a SignedDocument from the uploaded source, stores it, freezes it, signs it with the chosen certificate + provider, and seals it — all in one unit of work. Returns the sealed document. Evidence truth (signed/status/hashes/artifact ids) is server-produced and cannot be supplied by the caller.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SignedDocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SignedDocumentsApi apiInstance = new SignedDocumentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    UUID id = UUID.randomUUID(); // UUID | 
    File _file = new File("/path/to/file"); // File | 
    String title = "title_example"; // String | 
    String contactId = "contactId_example"; // String | 
    String signingCertificateId = "signingCertificateId_example"; // String | 
    String signingProfileId = "signingProfileId_example"; // String | 
    String providerName = "providerName_example"; // String | 
    try {
      SignedDocumentDto result = apiInstance.prepareAndQuickSignAsync(tenantId, apiVersion, xApiVersion, id, _file, title, contactId, signingCertificateId, signingProfileId, providerName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SignedDocumentsApi#prepareAndQuickSignAsync");
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
| **id** | **UUID**|  | [optional] |
| **_file** | **File**|  | [optional] |
| **title** | **String**|  | [optional] |
| **contactId** | **String**|  | [optional] |
| **signingCertificateId** | **String**|  | [optional] |
| **signingProfileId** | **String**|  | [optional] |
| **providerName** | **String**|  | [optional] |

### Return type

[**SignedDocumentDto**](SignedDocumentDto.md)

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

<a id="quickSignSignedDocumentAsync"></a>
# **quickSignSignedDocumentAsync**
> quickSignSignedDocumentAsync(tenantId, id, apiVersion, xApiVersion, quickSignSignedDocumentDto)

Quick-sign a frozen document

Signs a frozen signed document directly with a chosen certificate + provider (no signing-request workflow) and seals it. Returns the sealed document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SignedDocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SignedDocumentsApi apiInstance = new SignedDocumentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    QuickSignSignedDocumentDto quickSignSignedDocumentDto = new QuickSignSignedDocumentDto(); // QuickSignSignedDocumentDto | 
    try {
      apiInstance.quickSignSignedDocumentAsync(tenantId, id, apiVersion, xApiVersion, quickSignSignedDocumentDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling SignedDocumentsApi#quickSignSignedDocumentAsync");
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
| **quickSignSignedDocumentDto** | [**QuickSignSignedDocumentDto**](QuickSignSignedDocumentDto.md)|  | [optional] |

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
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **200** | OK |  -  |

<a id="updateSignedDocumentAsync"></a>
# **updateSignedDocumentAsync**
> updateSignedDocumentAsync(tenantId, id, apiVersion, xApiVersion, signedDocumentUpdateDto)

Update a signed document

Updates an existing signed document for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SignedDocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SignedDocumentsApi apiInstance = new SignedDocumentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SignedDocumentUpdateDto signedDocumentUpdateDto = new SignedDocumentUpdateDto(); // SignedDocumentUpdateDto | 
    try {
      apiInstance.updateSignedDocumentAsync(tenantId, id, apiVersion, xApiVersion, signedDocumentUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling SignedDocumentsApi#updateSignedDocumentAsync");
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
| **signedDocumentUpdateDto** | [**SignedDocumentUpdateDto**](SignedDocumentUpdateDto.md)|  | [optional] |

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
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="verifySignedDocumentSignatureAsync"></a>
# **verifySignedDocumentSignatureAsync**
> SignatureVerificationDto verifySignedDocumentSignatureAsync(tenantId, id, apiVersion, xApiVersion)

Verify a signed document&#39;s signature

Re-verifies the document&#39;s signature against its stored signed artifact (bytes intact + signed by the embedded certificate; certificate trust is a separate concern).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SignedDocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SignedDocumentsApi apiInstance = new SignedDocumentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SignatureVerificationDto result = apiInstance.verifySignedDocumentSignatureAsync(tenantId, id, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SignedDocumentsApi#verifySignedDocumentSignatureAsync");
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

[**SignatureVerificationDto**](SignatureVerificationDto.md)

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

