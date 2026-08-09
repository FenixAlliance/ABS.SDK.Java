# SigningProfilesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSigningProfileAsync**](SigningProfilesApi.md#createSigningProfileAsync) | **POST** /api/v2/TrustService/SigningProfiles | Create a new signing profile |
| [**deleteSigningProfileAsync**](SigningProfilesApi.md#deleteSigningProfileAsync) | **DELETE** /api/v2/TrustService/SigningProfiles/{id} | Delete a signing profile |
| [**getSigningProfileByIdAsync**](SigningProfilesApi.md#getSigningProfileByIdAsync) | **GET** /api/v2/TrustService/SigningProfiles/{id} | Get signing profile by ID |
| [**getSigningProfilesAsync**](SigningProfilesApi.md#getSigningProfilesAsync) | **GET** /api/v2/TrustService/SigningProfiles | Get all signing profiles |
| [**getSigningProfilesCountAsync**](SigningProfilesApi.md#getSigningProfilesCountAsync) | **GET** /api/v2/TrustService/SigningProfiles/Count | Get signing profiles count |
| [**patchSigningProfileAsync**](SigningProfilesApi.md#patchSigningProfileAsync) | **PATCH** /api/v2/TrustService/SigningProfiles/{id} | Patch a signing profile |
| [**updateSigningProfileAsync**](SigningProfilesApi.md#updateSigningProfileAsync) | **PUT** /api/v2/TrustService/SigningProfiles/{id} | Update a signing profile |


<a id="createSigningProfileAsync"></a>
# **createSigningProfileAsync**
> createSigningProfileAsync(tenantId, apiVersion, xApiVersion, signingProfileCreateDto)

Create a new signing profile

Creates a new signing profile for the specified tenant (supports inline contact creation).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SigningProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SigningProfilesApi apiInstance = new SigningProfilesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SigningProfileCreateDto signingProfileCreateDto = new SigningProfileCreateDto(); // SigningProfileCreateDto | 
    try {
      apiInstance.createSigningProfileAsync(tenantId, apiVersion, xApiVersion, signingProfileCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling SigningProfilesApi#createSigningProfileAsync");
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
| **signingProfileCreateDto** | [**SigningProfileCreateDto**](SigningProfileCreateDto.md)|  | [optional] |

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

<a id="deleteSigningProfileAsync"></a>
# **deleteSigningProfileAsync**
> deleteSigningProfileAsync(tenantId, id, apiVersion, xApiVersion)

Delete a signing profile

Deletes a signing profile for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SigningProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SigningProfilesApi apiInstance = new SigningProfilesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteSigningProfileAsync(tenantId, id, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling SigningProfilesApi#deleteSigningProfileAsync");
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

<a id="getSigningProfileByIdAsync"></a>
# **getSigningProfileByIdAsync**
> SigningProfileDto getSigningProfileByIdAsync(tenantId, id, apiVersion, xApiVersion)

Get signing profile by ID

Retrieves a specific signing profile by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SigningProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SigningProfilesApi apiInstance = new SigningProfilesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SigningProfileDto result = apiInstance.getSigningProfileByIdAsync(tenantId, id, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SigningProfilesApi#getSigningProfileByIdAsync");
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

[**SigningProfileDto**](SigningProfileDto.md)

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

<a id="getSigningProfilesAsync"></a>
# **getSigningProfilesAsync**
> SigningProfileDtoListEnvelope getSigningProfilesAsync(tenantId, apiVersion, xApiVersion, signingProfileDtoCollectionQueryParameters)

Get all signing profiles

Retrieves all signing profiles for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SigningProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SigningProfilesApi apiInstance = new SigningProfilesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SigningProfileDtoCollectionQueryParameters signingProfileDtoCollectionQueryParameters = new SigningProfileDtoCollectionQueryParameters(); // SigningProfileDtoCollectionQueryParameters | 
    try {
      SigningProfileDtoListEnvelope result = apiInstance.getSigningProfilesAsync(tenantId, apiVersion, xApiVersion, signingProfileDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SigningProfilesApi#getSigningProfilesAsync");
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
| **signingProfileDtoCollectionQueryParameters** | [**SigningProfileDtoCollectionQueryParameters**](SigningProfileDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**SigningProfileDtoListEnvelope**](SigningProfileDtoListEnvelope.md)

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

<a id="getSigningProfilesCountAsync"></a>
# **getSigningProfilesCountAsync**
> Int32Envelope getSigningProfilesCountAsync(tenantId, apiVersion, xApiVersion, signingProfileDtoCollectionQueryParameters)

Get signing profiles count

Returns the count of signing profiles for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SigningProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SigningProfilesApi apiInstance = new SigningProfilesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SigningProfileDtoCollectionQueryParameters signingProfileDtoCollectionQueryParameters = new SigningProfileDtoCollectionQueryParameters(); // SigningProfileDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getSigningProfilesCountAsync(tenantId, apiVersion, xApiVersion, signingProfileDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SigningProfilesApi#getSigningProfilesCountAsync");
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
| **signingProfileDtoCollectionQueryParameters** | [**SigningProfileDtoCollectionQueryParameters**](SigningProfileDtoCollectionQueryParameters.md)|  | [optional] |

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

<a id="patchSigningProfileAsync"></a>
# **patchSigningProfileAsync**
> EmptyEnvelope patchSigningProfileAsync(tenantId, id, apiVersion, xApiVersion, patchOperation)

Patch a signing profile

Patch a signing profile

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SigningProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SigningProfilesApi apiInstance = new SigningProfilesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    List<PatchOperation> patchOperation = Arrays.asList(); // List<PatchOperation> | 
    try {
      EmptyEnvelope result = apiInstance.patchSigningProfileAsync(tenantId, id, apiVersion, xApiVersion, patchOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SigningProfilesApi#patchSigningProfileAsync");
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

<a id="updateSigningProfileAsync"></a>
# **updateSigningProfileAsync**
> updateSigningProfileAsync(tenantId, id, apiVersion, xApiVersion, signingProfileUpdateDto)

Update a signing profile

Updates an existing signing profile for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SigningProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SigningProfilesApi apiInstance = new SigningProfilesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SigningProfileUpdateDto signingProfileUpdateDto = new SigningProfileUpdateDto(); // SigningProfileUpdateDto | 
    try {
      apiInstance.updateSigningProfileAsync(tenantId, id, apiVersion, xApiVersion, signingProfileUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling SigningProfilesApi#updateSigningProfileAsync");
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
| **signingProfileUpdateDto** | [**SigningProfileUpdateDto**](SigningProfileUpdateDto.md)|  | [optional] |

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

