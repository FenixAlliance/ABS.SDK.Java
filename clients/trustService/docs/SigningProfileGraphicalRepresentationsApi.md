# SigningProfileGraphicalRepresentationsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSigningProfileGraphicalRepresentationAsync**](SigningProfileGraphicalRepresentationsApi.md#createSigningProfileGraphicalRepresentationAsync) | **POST** /api/v2/TrustService/SigningProfileGraphicalRepresentations | Create a new signature representation |
| [**deleteSigningProfileGraphicalRepresentationAsync**](SigningProfileGraphicalRepresentationsApi.md#deleteSigningProfileGraphicalRepresentationAsync) | **DELETE** /api/v2/TrustService/SigningProfileGraphicalRepresentations/{id} | Delete a signature representation |
| [**getSigningProfileGraphicalRepresentationByIdAsync**](SigningProfileGraphicalRepresentationsApi.md#getSigningProfileGraphicalRepresentationByIdAsync) | **GET** /api/v2/TrustService/SigningProfileGraphicalRepresentations/{id} | Get signature representation by ID |
| [**getSigningProfileGraphicalRepresentationsAsync**](SigningProfileGraphicalRepresentationsApi.md#getSigningProfileGraphicalRepresentationsAsync) | **GET** /api/v2/TrustService/SigningProfileGraphicalRepresentations | Get all signature representations |
| [**getSigningProfileGraphicalRepresentationsCountAsync**](SigningProfileGraphicalRepresentationsApi.md#getSigningProfileGraphicalRepresentationsCountAsync) | **GET** /api/v2/TrustService/SigningProfileGraphicalRepresentations/Count | Get signature representations count |
| [**patchSigningProfileGraphicalRepresentationAsync**](SigningProfileGraphicalRepresentationsApi.md#patchSigningProfileGraphicalRepresentationAsync) | **PATCH** /api/v2/TrustService/SigningProfileGraphicalRepresentations/{id} | Patch a signature representation |
| [**updateSigningProfileGraphicalRepresentationAsync**](SigningProfileGraphicalRepresentationsApi.md#updateSigningProfileGraphicalRepresentationAsync) | **PUT** /api/v2/TrustService/SigningProfileGraphicalRepresentations/{id} | Update a signature representation |


<a id="createSigningProfileGraphicalRepresentationAsync"></a>
# **createSigningProfileGraphicalRepresentationAsync**
> createSigningProfileGraphicalRepresentationAsync(tenantId, apiVersion, xApiVersion, signingProfileGraphicalRepresentationCreateDto)

Create a new signature representation

Creates a new reusable signature representation for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SigningProfileGraphicalRepresentationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SigningProfileGraphicalRepresentationsApi apiInstance = new SigningProfileGraphicalRepresentationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SigningProfileGraphicalRepresentationCreateDto signingProfileGraphicalRepresentationCreateDto = new SigningProfileGraphicalRepresentationCreateDto(); // SigningProfileGraphicalRepresentationCreateDto | 
    try {
      apiInstance.createSigningProfileGraphicalRepresentationAsync(tenantId, apiVersion, xApiVersion, signingProfileGraphicalRepresentationCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling SigningProfileGraphicalRepresentationsApi#createSigningProfileGraphicalRepresentationAsync");
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
| **signingProfileGraphicalRepresentationCreateDto** | [**SigningProfileGraphicalRepresentationCreateDto**](SigningProfileGraphicalRepresentationCreateDto.md)|  | [optional] |

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

<a id="deleteSigningProfileGraphicalRepresentationAsync"></a>
# **deleteSigningProfileGraphicalRepresentationAsync**
> deleteSigningProfileGraphicalRepresentationAsync(tenantId, id, apiVersion, xApiVersion)

Delete a signature representation

Deletes a signature representation for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SigningProfileGraphicalRepresentationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SigningProfileGraphicalRepresentationsApi apiInstance = new SigningProfileGraphicalRepresentationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteSigningProfileGraphicalRepresentationAsync(tenantId, id, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling SigningProfileGraphicalRepresentationsApi#deleteSigningProfileGraphicalRepresentationAsync");
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

<a id="getSigningProfileGraphicalRepresentationByIdAsync"></a>
# **getSigningProfileGraphicalRepresentationByIdAsync**
> SigningProfileGraphicalRepresentationDto getSigningProfileGraphicalRepresentationByIdAsync(tenantId, id, apiVersion, xApiVersion)

Get signature representation by ID

Retrieves a specific signature representation by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SigningProfileGraphicalRepresentationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SigningProfileGraphicalRepresentationsApi apiInstance = new SigningProfileGraphicalRepresentationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SigningProfileGraphicalRepresentationDto result = apiInstance.getSigningProfileGraphicalRepresentationByIdAsync(tenantId, id, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SigningProfileGraphicalRepresentationsApi#getSigningProfileGraphicalRepresentationByIdAsync");
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

[**SigningProfileGraphicalRepresentationDto**](SigningProfileGraphicalRepresentationDto.md)

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

<a id="getSigningProfileGraphicalRepresentationsAsync"></a>
# **getSigningProfileGraphicalRepresentationsAsync**
> SigningProfileGraphicalRepresentationDtoListEnvelope getSigningProfileGraphicalRepresentationsAsync(tenantId, apiVersion, xApiVersion)

Get all signature representations

Retrieves all reusable signature representations for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SigningProfileGraphicalRepresentationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SigningProfileGraphicalRepresentationsApi apiInstance = new SigningProfileGraphicalRepresentationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SigningProfileGraphicalRepresentationDtoListEnvelope result = apiInstance.getSigningProfileGraphicalRepresentationsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SigningProfileGraphicalRepresentationsApi#getSigningProfileGraphicalRepresentationsAsync");
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

[**SigningProfileGraphicalRepresentationDtoListEnvelope**](SigningProfileGraphicalRepresentationDtoListEnvelope.md)

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

<a id="getSigningProfileGraphicalRepresentationsCountAsync"></a>
# **getSigningProfileGraphicalRepresentationsCountAsync**
> Int32Envelope getSigningProfileGraphicalRepresentationsCountAsync(tenantId, apiVersion, xApiVersion)

Get signature representations count

Returns the count of signature representations for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SigningProfileGraphicalRepresentationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SigningProfileGraphicalRepresentationsApi apiInstance = new SigningProfileGraphicalRepresentationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getSigningProfileGraphicalRepresentationsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SigningProfileGraphicalRepresentationsApi#getSigningProfileGraphicalRepresentationsCountAsync");
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

<a id="patchSigningProfileGraphicalRepresentationAsync"></a>
# **patchSigningProfileGraphicalRepresentationAsync**
> EmptyEnvelope patchSigningProfileGraphicalRepresentationAsync(tenantId, id, apiVersion, xApiVersion, operation)

Patch a signature representation

Patch a signature representation

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SigningProfileGraphicalRepresentationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SigningProfileGraphicalRepresentationsApi apiInstance = new SigningProfileGraphicalRepresentationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    List<Operation> operation = Arrays.asList(); // List<Operation> | 
    try {
      EmptyEnvelope result = apiInstance.patchSigningProfileGraphicalRepresentationAsync(tenantId, id, apiVersion, xApiVersion, operation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SigningProfileGraphicalRepresentationsApi#patchSigningProfileGraphicalRepresentationAsync");
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

<a id="updateSigningProfileGraphicalRepresentationAsync"></a>
# **updateSigningProfileGraphicalRepresentationAsync**
> updateSigningProfileGraphicalRepresentationAsync(tenantId, id, apiVersion, xApiVersion, signingProfileGraphicalRepresentationUpdateDto)

Update a signature representation

Updates an existing signature representation for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SigningProfileGraphicalRepresentationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SigningProfileGraphicalRepresentationsApi apiInstance = new SigningProfileGraphicalRepresentationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SigningProfileGraphicalRepresentationUpdateDto signingProfileGraphicalRepresentationUpdateDto = new SigningProfileGraphicalRepresentationUpdateDto(); // SigningProfileGraphicalRepresentationUpdateDto | 
    try {
      apiInstance.updateSigningProfileGraphicalRepresentationAsync(tenantId, id, apiVersion, xApiVersion, signingProfileGraphicalRepresentationUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling SigningProfileGraphicalRepresentationsApi#updateSigningProfileGraphicalRepresentationAsync");
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
| **signingProfileGraphicalRepresentationUpdateDto** | [**SigningProfileGraphicalRepresentationUpdateDto**](SigningProfileGraphicalRepresentationUpdateDto.md)|  | [optional] |

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

