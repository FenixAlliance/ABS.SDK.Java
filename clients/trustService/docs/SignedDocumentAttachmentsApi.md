# SignedDocumentAttachmentsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSignedDocumentAttachmentAsync**](SignedDocumentAttachmentsApi.md#createSignedDocumentAttachmentAsync) | **POST** /api/v2/TrustService/SignedDocumentAttachments | Create a new signed document attachment |
| [**deleteSignedDocumentAttachmentAsync**](SignedDocumentAttachmentsApi.md#deleteSignedDocumentAttachmentAsync) | **DELETE** /api/v2/TrustService/SignedDocumentAttachments/{id} | Delete a signed document attachment |
| [**getSignedDocumentAttachmentByIdAsync**](SignedDocumentAttachmentsApi.md#getSignedDocumentAttachmentByIdAsync) | **GET** /api/v2/TrustService/SignedDocumentAttachments/{id} | Get signed document attachment by ID |
| [**getSignedDocumentAttachmentsAsync**](SignedDocumentAttachmentsApi.md#getSignedDocumentAttachmentsAsync) | **GET** /api/v2/TrustService/SignedDocumentAttachments | Get all signed document attachments |
| [**getSignedDocumentAttachmentsCountAsync**](SignedDocumentAttachmentsApi.md#getSignedDocumentAttachmentsCountAsync) | **GET** /api/v2/TrustService/SignedDocumentAttachments/Count | Get signed document attachments count |
| [**patchSignedDocumentAttachmentAsync**](SignedDocumentAttachmentsApi.md#patchSignedDocumentAttachmentAsync) | **PATCH** /api/v2/TrustService/SignedDocumentAttachments/{id} | Patch a signed document attachment |
| [**updateSignedDocumentAttachmentAsync**](SignedDocumentAttachmentsApi.md#updateSignedDocumentAttachmentAsync) | **PUT** /api/v2/TrustService/SignedDocumentAttachments/{id} | Update a signed document attachment |


<a id="createSignedDocumentAttachmentAsync"></a>
# **createSignedDocumentAttachmentAsync**
> createSignedDocumentAttachmentAsync(tenantId, apiVersion, xApiVersion, signedDocumentAttachmentCreateDto)

Create a new signed document attachment

Links an already-stored file to a SignedDocument (metadata + Storage pointer; no bytes).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SignedDocumentAttachmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SignedDocumentAttachmentsApi apiInstance = new SignedDocumentAttachmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SignedDocumentAttachmentCreateDto signedDocumentAttachmentCreateDto = new SignedDocumentAttachmentCreateDto(); // SignedDocumentAttachmentCreateDto | 
    try {
      apiInstance.createSignedDocumentAttachmentAsync(tenantId, apiVersion, xApiVersion, signedDocumentAttachmentCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling SignedDocumentAttachmentsApi#createSignedDocumentAttachmentAsync");
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
| **signedDocumentAttachmentCreateDto** | [**SignedDocumentAttachmentCreateDto**](SignedDocumentAttachmentCreateDto.md)|  | [optional] |

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

<a id="deleteSignedDocumentAttachmentAsync"></a>
# **deleteSignedDocumentAttachmentAsync**
> deleteSignedDocumentAttachmentAsync(tenantId, id, apiVersion, xApiVersion)

Delete a signed document attachment

Deletes a signed document attachment link for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SignedDocumentAttachmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SignedDocumentAttachmentsApi apiInstance = new SignedDocumentAttachmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteSignedDocumentAttachmentAsync(tenantId, id, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling SignedDocumentAttachmentsApi#deleteSignedDocumentAttachmentAsync");
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

<a id="getSignedDocumentAttachmentByIdAsync"></a>
# **getSignedDocumentAttachmentByIdAsync**
> SignedDocumentAttachmentDto getSignedDocumentAttachmentByIdAsync(tenantId, id, apiVersion, xApiVersion)

Get signed document attachment by ID

Retrieves a specific signed document attachment by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SignedDocumentAttachmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SignedDocumentAttachmentsApi apiInstance = new SignedDocumentAttachmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SignedDocumentAttachmentDto result = apiInstance.getSignedDocumentAttachmentByIdAsync(tenantId, id, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SignedDocumentAttachmentsApi#getSignedDocumentAttachmentByIdAsync");
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

[**SignedDocumentAttachmentDto**](SignedDocumentAttachmentDto.md)

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

<a id="getSignedDocumentAttachmentsAsync"></a>
# **getSignedDocumentAttachmentsAsync**
> SignedDocumentAttachmentDtoListEnvelope getSignedDocumentAttachmentsAsync(tenantId, apiVersion, xApiVersion, signedDocumentAttachmentDtoCollectionQueryParameters)

Get all signed document attachments

Retrieves all signed document attachments for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SignedDocumentAttachmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SignedDocumentAttachmentsApi apiInstance = new SignedDocumentAttachmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SignedDocumentAttachmentDtoCollectionQueryParameters signedDocumentAttachmentDtoCollectionQueryParameters = new SignedDocumentAttachmentDtoCollectionQueryParameters(); // SignedDocumentAttachmentDtoCollectionQueryParameters | 
    try {
      SignedDocumentAttachmentDtoListEnvelope result = apiInstance.getSignedDocumentAttachmentsAsync(tenantId, apiVersion, xApiVersion, signedDocumentAttachmentDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SignedDocumentAttachmentsApi#getSignedDocumentAttachmentsAsync");
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
| **signedDocumentAttachmentDtoCollectionQueryParameters** | [**SignedDocumentAttachmentDtoCollectionQueryParameters**](SignedDocumentAttachmentDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**SignedDocumentAttachmentDtoListEnvelope**](SignedDocumentAttachmentDtoListEnvelope.md)

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

<a id="getSignedDocumentAttachmentsCountAsync"></a>
# **getSignedDocumentAttachmentsCountAsync**
> Int32Envelope getSignedDocumentAttachmentsCountAsync(tenantId, apiVersion, xApiVersion, signedDocumentAttachmentDtoCollectionQueryParameters)

Get signed document attachments count

Returns the count of signed document attachments for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SignedDocumentAttachmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SignedDocumentAttachmentsApi apiInstance = new SignedDocumentAttachmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SignedDocumentAttachmentDtoCollectionQueryParameters signedDocumentAttachmentDtoCollectionQueryParameters = new SignedDocumentAttachmentDtoCollectionQueryParameters(); // SignedDocumentAttachmentDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getSignedDocumentAttachmentsCountAsync(tenantId, apiVersion, xApiVersion, signedDocumentAttachmentDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SignedDocumentAttachmentsApi#getSignedDocumentAttachmentsCountAsync");
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
| **signedDocumentAttachmentDtoCollectionQueryParameters** | [**SignedDocumentAttachmentDtoCollectionQueryParameters**](SignedDocumentAttachmentDtoCollectionQueryParameters.md)|  | [optional] |

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

<a id="patchSignedDocumentAttachmentAsync"></a>
# **patchSignedDocumentAttachmentAsync**
> EmptyEnvelope patchSignedDocumentAttachmentAsync(tenantId, id, apiVersion, xApiVersion, patchOperation)

Patch a signed document attachment

Patch a signed document attachment

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SignedDocumentAttachmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SignedDocumentAttachmentsApi apiInstance = new SignedDocumentAttachmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    List<PatchOperation> patchOperation = Arrays.asList(); // List<PatchOperation> | 
    try {
      EmptyEnvelope result = apiInstance.patchSignedDocumentAttachmentAsync(tenantId, id, apiVersion, xApiVersion, patchOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SignedDocumentAttachmentsApi#patchSignedDocumentAttachmentAsync");
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
| **patchOperation** | [**List&lt;PatchOperation&gt;**](PatchOperation.md)|  | [optional] |

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

<a id="updateSignedDocumentAttachmentAsync"></a>
# **updateSignedDocumentAttachmentAsync**
> updateSignedDocumentAttachmentAsync(tenantId, id, apiVersion, xApiVersion, signedDocumentAttachmentUpdateDto)

Update a signed document attachment

Updates signed document attachment metadata for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SignedDocumentAttachmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SignedDocumentAttachmentsApi apiInstance = new SignedDocumentAttachmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SignedDocumentAttachmentUpdateDto signedDocumentAttachmentUpdateDto = new SignedDocumentAttachmentUpdateDto(); // SignedDocumentAttachmentUpdateDto | 
    try {
      apiInstance.updateSignedDocumentAttachmentAsync(tenantId, id, apiVersion, xApiVersion, signedDocumentAttachmentUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling SignedDocumentAttachmentsApi#updateSignedDocumentAttachmentAsync");
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
| **signedDocumentAttachmentUpdateDto** | [**SignedDocumentAttachmentUpdateDto**](SignedDocumentAttachmentUpdateDto.md)|  | [optional] |

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

