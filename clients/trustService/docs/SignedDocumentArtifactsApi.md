# SignedDocumentArtifactsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**freezeAsync**](SignedDocumentArtifactsApi.md#freezeAsync) | **POST** /api/v2/TrustService/SignedDocumentArtifacts/{signedDocumentId}/freeze | Freeze the source for signature |
| [**getReferenceAsync**](SignedDocumentArtifactsApi.md#getReferenceAsync) | **GET** /api/v2/TrustService/SignedDocumentArtifacts/reference/{fileUploadId} | Get an artifact reference |
| [**setPrimaryAuthoringFileAsync**](SignedDocumentArtifactsApi.md#setPrimaryAuthoringFileAsync) | **PUT** /api/v2/TrustService/SignedDocumentArtifacts/{signedDocumentId}/primary-file/{fileUploadId} | Set the primary authoring file |
| [**verifyAsync**](SignedDocumentArtifactsApi.md#verifyAsync) | **GET** /api/v2/TrustService/SignedDocumentArtifacts/reference/{fileUploadId}/verify | Verify an artifact hash |


<a id="freezeAsync"></a>
# **freezeAsync**
> TrustArtifactReferenceDtoEnvelope freezeAsync(tenantId, signedDocumentId, apiVersion, xApiVersion)

Freeze the source for signature

Copies the primary authoring artifact into a new Sealed frozen-source artifact, hashes it, and binds it to the document (LockState &#x3D; FrozenForSignature).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SignedDocumentArtifactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SignedDocumentArtifactsApi apiInstance = new SignedDocumentArtifactsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String signedDocumentId = "signedDocumentId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TrustArtifactReferenceDtoEnvelope result = apiInstance.freezeAsync(tenantId, signedDocumentId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SignedDocumentArtifactsApi#freezeAsync");
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

### Return type

[**TrustArtifactReferenceDtoEnvelope**](TrustArtifactReferenceDtoEnvelope.md)

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
| **409** | Conflict |  -  |
| **200** | OK |  -  |

<a id="getReferenceAsync"></a>
# **getReferenceAsync**
> TrustArtifactReferenceDtoEnvelope getReferenceAsync(tenantId, fileUploadId, apiVersion, xApiVersion)

Get an artifact reference

Resolves a stored artifact&#39;s reference (FileUpload id + key + hash + media hints).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SignedDocumentArtifactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SignedDocumentArtifactsApi apiInstance = new SignedDocumentArtifactsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String fileUploadId = "fileUploadId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TrustArtifactReferenceDtoEnvelope result = apiInstance.getReferenceAsync(tenantId, fileUploadId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SignedDocumentArtifactsApi#getReferenceAsync");
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
| **fileUploadId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**TrustArtifactReferenceDtoEnvelope**](TrustArtifactReferenceDtoEnvelope.md)

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

<a id="setPrimaryAuthoringFileAsync"></a>
# **setPrimaryAuthoringFileAsync**
> setPrimaryAuthoringFileAsync(tenantId, signedDocumentId, fileUploadId, apiVersion, xApiVersion)

Set the primary authoring file

Links an existing scan-gated FileUpload as the document&#39;s mutable authoring artifact (only while editable).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SignedDocumentArtifactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SignedDocumentArtifactsApi apiInstance = new SignedDocumentArtifactsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String signedDocumentId = "signedDocumentId_example"; // String | 
    String fileUploadId = "fileUploadId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.setPrimaryAuthoringFileAsync(tenantId, signedDocumentId, fileUploadId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling SignedDocumentArtifactsApi#setPrimaryAuthoringFileAsync");
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
| **fileUploadId** | **String**|  | |
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

<a id="verifyAsync"></a>
# **verifyAsync**
> BooleanEnvelope verifyAsync(tenantId, fileUploadId, apiVersion, xApiVersion)

Verify an artifact hash

Re-reads the artifact bytes and verifies them against the recorded SHA-256. Returns true on match.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SignedDocumentArtifactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SignedDocumentArtifactsApi apiInstance = new SignedDocumentArtifactsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String fileUploadId = "fileUploadId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      BooleanEnvelope result = apiInstance.verifyAsync(tenantId, fileUploadId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SignedDocumentArtifactsApi#verifyAsync");
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
| **fileUploadId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**BooleanEnvelope**](BooleanEnvelope.md)

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

