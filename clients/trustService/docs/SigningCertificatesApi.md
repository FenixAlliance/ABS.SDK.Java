# SigningCertificatesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSigningCertificateAsync**](SigningCertificatesApi.md#createSigningCertificateAsync) | **POST** /api/v2/TrustService/SigningCertificates | Create a new signing certificate |
| [**deleteSigningCertificateAsync**](SigningCertificatesApi.md#deleteSigningCertificateAsync) | **DELETE** /api/v2/TrustService/SigningCertificates/{id} | Delete a signing certificate |
| [**getSigningCertificateByIdAsync**](SigningCertificatesApi.md#getSigningCertificateByIdAsync) | **GET** /api/v2/TrustService/SigningCertificates/{id} | Get signing certificate by ID |
| [**getSigningCertificatesAsync**](SigningCertificatesApi.md#getSigningCertificatesAsync) | **GET** /api/v2/TrustService/SigningCertificates | Get all signing certificates |
| [**getSigningCertificatesCountAsync**](SigningCertificatesApi.md#getSigningCertificatesCountAsync) | **GET** /api/v2/TrustService/SigningCertificates/Count | Get signing certificates count |
| [**importSigningCertificateAsync**](SigningCertificatesApi.md#importSigningCertificateAsync) | **POST** /api/v2/TrustService/SigningCertificates/Import | Import a PFX/P12 signing certificate into custody |
| [**patchSigningCertificateAsync**](SigningCertificatesApi.md#patchSigningCertificateAsync) | **PATCH** /api/v2/TrustService/SigningCertificates/{id} | Patch a signing certificate |
| [**updateSigningCertificateAsync**](SigningCertificatesApi.md#updateSigningCertificateAsync) | **PUT** /api/v2/TrustService/SigningCertificates/{id} | Update a signing certificate |


<a id="createSigningCertificateAsync"></a>
# **createSigningCertificateAsync**
> createSigningCertificateAsync(tenantId, apiVersion, xApiVersion, signingCertificateCreateDto)

Create a new signing certificate

Creates a new signing certificate for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SigningCertificatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SigningCertificatesApi apiInstance = new SigningCertificatesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SigningCertificateCreateDto signingCertificateCreateDto = new SigningCertificateCreateDto(); // SigningCertificateCreateDto | 
    try {
      apiInstance.createSigningCertificateAsync(tenantId, apiVersion, xApiVersion, signingCertificateCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling SigningCertificatesApi#createSigningCertificateAsync");
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
| **signingCertificateCreateDto** | [**SigningCertificateCreateDto**](SigningCertificateCreateDto.md)|  | [optional] |

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

<a id="deleteSigningCertificateAsync"></a>
# **deleteSigningCertificateAsync**
> deleteSigningCertificateAsync(tenantId, id, apiVersion, xApiVersion)

Delete a signing certificate

Deletes a signing certificate for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SigningCertificatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SigningCertificatesApi apiInstance = new SigningCertificatesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteSigningCertificateAsync(tenantId, id, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling SigningCertificatesApi#deleteSigningCertificateAsync");
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

<a id="getSigningCertificateByIdAsync"></a>
# **getSigningCertificateByIdAsync**
> SigningCertificateDto getSigningCertificateByIdAsync(tenantId, id, apiVersion, xApiVersion)

Get signing certificate by ID

Retrieves a specific signing certificate by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SigningCertificatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SigningCertificatesApi apiInstance = new SigningCertificatesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SigningCertificateDto result = apiInstance.getSigningCertificateByIdAsync(tenantId, id, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SigningCertificatesApi#getSigningCertificateByIdAsync");
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

[**SigningCertificateDto**](SigningCertificateDto.md)

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

<a id="getSigningCertificatesAsync"></a>
# **getSigningCertificatesAsync**
> SigningCertificateDtoListEnvelope getSigningCertificatesAsync(tenantId, apiVersion, xApiVersion, signingCertificateDtoCollectionQueryParameters)

Get all signing certificates

Retrieves all signing certificates for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SigningCertificatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SigningCertificatesApi apiInstance = new SigningCertificatesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SigningCertificateDtoCollectionQueryParameters signingCertificateDtoCollectionQueryParameters = new SigningCertificateDtoCollectionQueryParameters(); // SigningCertificateDtoCollectionQueryParameters | 
    try {
      SigningCertificateDtoListEnvelope result = apiInstance.getSigningCertificatesAsync(tenantId, apiVersion, xApiVersion, signingCertificateDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SigningCertificatesApi#getSigningCertificatesAsync");
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
| **signingCertificateDtoCollectionQueryParameters** | [**SigningCertificateDtoCollectionQueryParameters**](SigningCertificateDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**SigningCertificateDtoListEnvelope**](SigningCertificateDtoListEnvelope.md)

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

<a id="getSigningCertificatesCountAsync"></a>
# **getSigningCertificatesCountAsync**
> Int32Envelope getSigningCertificatesCountAsync(tenantId, apiVersion, xApiVersion, signingCertificateDtoCollectionQueryParameters)

Get signing certificates count

Returns the count of signing certificates for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SigningCertificatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SigningCertificatesApi apiInstance = new SigningCertificatesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SigningCertificateDtoCollectionQueryParameters signingCertificateDtoCollectionQueryParameters = new SigningCertificateDtoCollectionQueryParameters(); // SigningCertificateDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getSigningCertificatesCountAsync(tenantId, apiVersion, xApiVersion, signingCertificateDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SigningCertificatesApi#getSigningCertificatesCountAsync");
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
| **signingCertificateDtoCollectionQueryParameters** | [**SigningCertificateDtoCollectionQueryParameters**](SigningCertificateDtoCollectionQueryParameters.md)|  | [optional] |

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

<a id="importSigningCertificateAsync"></a>
# **importSigningCertificateAsync**
> importSigningCertificateAsync(tenantId, apiVersion, xApiVersion, id, _file, password, title, contactId)

Import a PFX/P12 signing certificate into custody

Parses the uploaded PFX/P12, imports the private material into the configured signing custody, and creates the certificate metadata record. The PFX and password are used only for the request — never returned or stored.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SigningCertificatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SigningCertificatesApi apiInstance = new SigningCertificatesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    UUID id = UUID.randomUUID(); // UUID | 
    File _file = new File("/path/to/file"); // File | 
    String password = "password_example"; // String | 
    String title = "title_example"; // String | 
    String contactId = "contactId_example"; // String | 
    try {
      apiInstance.importSigningCertificateAsync(tenantId, apiVersion, xApiVersion, id, _file, password, title, contactId);
    } catch (ApiException e) {
      System.err.println("Exception when calling SigningCertificatesApi#importSigningCertificateAsync");
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
| **password** | **String**|  | [optional] |
| **title** | **String**|  | [optional] |
| **contactId** | **String**|  | [optional] |

### Return type

null (empty response body)

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
| **200** | OK |  -  |

<a id="patchSigningCertificateAsync"></a>
# **patchSigningCertificateAsync**
> EmptyEnvelope patchSigningCertificateAsync(tenantId, id, apiVersion, xApiVersion, patchOperation)

Patch a signing certificate

Patch a signing certificate

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SigningCertificatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SigningCertificatesApi apiInstance = new SigningCertificatesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    List<PatchOperation> patchOperation = Arrays.asList(); // List<PatchOperation> | 
    try {
      EmptyEnvelope result = apiInstance.patchSigningCertificateAsync(tenantId, id, apiVersion, xApiVersion, patchOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SigningCertificatesApi#patchSigningCertificateAsync");
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

<a id="updateSigningCertificateAsync"></a>
# **updateSigningCertificateAsync**
> updateSigningCertificateAsync(tenantId, id, apiVersion, xApiVersion, signingCertificateUpdateDto)

Update a signing certificate

Updates an existing signing certificate for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SigningCertificatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SigningCertificatesApi apiInstance = new SigningCertificatesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SigningCertificateUpdateDto signingCertificateUpdateDto = new SigningCertificateUpdateDto(); // SigningCertificateUpdateDto | 
    try {
      apiInstance.updateSigningCertificateAsync(tenantId, id, apiVersion, xApiVersion, signingCertificateUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling SigningCertificatesApi#updateSigningCertificateAsync");
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
| **signingCertificateUpdateDto** | [**SigningCertificateUpdateDto**](SigningCertificateUpdateDto.md)|  | [optional] |

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

