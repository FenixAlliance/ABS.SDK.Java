# LicensingCertificatesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createLicensingCertificateAsync**](LicensingCertificatesApi.md#createLicensingCertificateAsync) | **POST** /api/v2/LicensingService/LicensingCertificates | Create a new licensing certificate |
| [**deleteLicensingCertificateAsync**](LicensingCertificatesApi.md#deleteLicensingCertificateAsync) | **DELETE** /api/v2/LicensingService/LicensingCertificates/{id} | Delete a licensing certificate |
| [**getLicensingCertificateByIdAsync**](LicensingCertificatesApi.md#getLicensingCertificateByIdAsync) | **GET** /api/v2/LicensingService/LicensingCertificates/{id} | Get licensing certificate by ID |
| [**getLicensingCertificatesAsync**](LicensingCertificatesApi.md#getLicensingCertificatesAsync) | **GET** /api/v2/LicensingService/LicensingCertificates | Get all licensing certificates |
| [**getLicensingCertificatesCountAsync**](LicensingCertificatesApi.md#getLicensingCertificatesCountAsync) | **GET** /api/v2/LicensingService/LicensingCertificates/Count | Get licensing certificates count |
| [**patchLicensingCertificateAsync**](LicensingCertificatesApi.md#patchLicensingCertificateAsync) | **PATCH** /api/v2/LicensingService/LicensingCertificates/{id} | Patch a licensing certificate |
| [**updateLicensingCertificateAsync**](LicensingCertificatesApi.md#updateLicensingCertificateAsync) | **PUT** /api/v2/LicensingService/LicensingCertificates/{id} | Update a licensing certificate |


<a id="createLicensingCertificateAsync"></a>
# **createLicensingCertificateAsync**
> createLicensingCertificateAsync(tenantId, apiVersion, xApiVersion, licensingCertificateCreateDto)

Create a new licensing certificate

Creates a new licensing certificate for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LicensingCertificatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    LicensingCertificatesApi apiInstance = new LicensingCertificatesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    LicensingCertificateCreateDto licensingCertificateCreateDto = new LicensingCertificateCreateDto(); // LicensingCertificateCreateDto | 
    try {
      apiInstance.createLicensingCertificateAsync(tenantId, apiVersion, xApiVersion, licensingCertificateCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling LicensingCertificatesApi#createLicensingCertificateAsync");
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
| **licensingCertificateCreateDto** | [**LicensingCertificateCreateDto**](LicensingCertificateCreateDto.md)|  | [optional] |

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

<a id="deleteLicensingCertificateAsync"></a>
# **deleteLicensingCertificateAsync**
> deleteLicensingCertificateAsync(tenantId, id, apiVersion, xApiVersion)

Delete a licensing certificate

Deletes a licensing certificate for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LicensingCertificatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    LicensingCertificatesApi apiInstance = new LicensingCertificatesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteLicensingCertificateAsync(tenantId, id, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling LicensingCertificatesApi#deleteLicensingCertificateAsync");
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

<a id="getLicensingCertificateByIdAsync"></a>
# **getLicensingCertificateByIdAsync**
> LicensingCertificateDto getLicensingCertificateByIdAsync(tenantId, id, apiVersion, xApiVersion)

Get licensing certificate by ID

Retrieves a specific licensing certificate by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LicensingCertificatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    LicensingCertificatesApi apiInstance = new LicensingCertificatesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      LicensingCertificateDto result = apiInstance.getLicensingCertificateByIdAsync(tenantId, id, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LicensingCertificatesApi#getLicensingCertificateByIdAsync");
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

[**LicensingCertificateDto**](LicensingCertificateDto.md)

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

<a id="getLicensingCertificatesAsync"></a>
# **getLicensingCertificatesAsync**
> LicensingCertificateDtoListEnvelope getLicensingCertificatesAsync(tenantId, apiVersion, xApiVersion)

Get all licensing certificates

Retrieves all licensing certificates for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LicensingCertificatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    LicensingCertificatesApi apiInstance = new LicensingCertificatesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      LicensingCertificateDtoListEnvelope result = apiInstance.getLicensingCertificatesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LicensingCertificatesApi#getLicensingCertificatesAsync");
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

[**LicensingCertificateDtoListEnvelope**](LicensingCertificateDtoListEnvelope.md)

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

<a id="getLicensingCertificatesCountAsync"></a>
# **getLicensingCertificatesCountAsync**
> Int32Envelope getLicensingCertificatesCountAsync(tenantId, apiVersion, xApiVersion)

Get licensing certificates count

Returns the count of licensing certificates for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LicensingCertificatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    LicensingCertificatesApi apiInstance = new LicensingCertificatesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getLicensingCertificatesCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LicensingCertificatesApi#getLicensingCertificatesCountAsync");
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

<a id="patchLicensingCertificateAsync"></a>
# **patchLicensingCertificateAsync**
> EmptyEnvelope patchLicensingCertificateAsync(tenantId, id, apiVersion, xApiVersion, operation)

Patch a licensing certificate

Patch a licensing certificate for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LicensingCertificatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    LicensingCertificatesApi apiInstance = new LicensingCertificatesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    List<Operation> operation = Arrays.asList(); // List<Operation> | 
    try {
      EmptyEnvelope result = apiInstance.patchLicensingCertificateAsync(tenantId, id, apiVersion, xApiVersion, operation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LicensingCertificatesApi#patchLicensingCertificateAsync");
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

<a id="updateLicensingCertificateAsync"></a>
# **updateLicensingCertificateAsync**
> updateLicensingCertificateAsync(tenantId, id, apiVersion, xApiVersion, licensingCertificateUpdateDto)

Update a licensing certificate

Updates an existing licensing certificate for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LicensingCertificatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    LicensingCertificatesApi apiInstance = new LicensingCertificatesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    LicensingCertificateUpdateDto licensingCertificateUpdateDto = new LicensingCertificateUpdateDto(); // LicensingCertificateUpdateDto | 
    try {
      apiInstance.updateLicensingCertificateAsync(tenantId, id, apiVersion, xApiVersion, licensingCertificateUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling LicensingCertificatesApi#updateLicensingCertificateAsync");
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
| **licensingCertificateUpdateDto** | [**LicensingCertificateUpdateDto**](LicensingCertificateUpdateDto.md)|  | [optional] |

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

