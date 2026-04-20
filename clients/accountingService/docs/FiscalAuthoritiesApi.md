# FiscalAuthoritiesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFiscalAuthority**](FiscalAuthoritiesApi.md#createFiscalAuthority) | **POST** /api/v2/AccountingService/Fiscals/Authorities | Create a fiscal authority |
| [**deleteFiscalAuthority**](FiscalAuthoritiesApi.md#deleteFiscalAuthority) | **DELETE** /api/v2/AccountingService/Fiscals/Authorities/{authorityId} | Delete a fiscal authority |
| [**getFiscalAuthorities**](FiscalAuthoritiesApi.md#getFiscalAuthorities) | **GET** /api/v2/AccountingService/Fiscals/Authorities | Get fiscal authorities |
| [**getFiscalAuthoritiesCount**](FiscalAuthoritiesApi.md#getFiscalAuthoritiesCount) | **GET** /api/v2/AccountingService/Fiscals/Authorities/Count | Get fiscal authorities count |
| [**getFiscalAuthority**](FiscalAuthoritiesApi.md#getFiscalAuthority) | **GET** /api/v2/AccountingService/Fiscals/Authorities/{authorityId} | Get fiscal authority by ID |
| [**updateFiscalAuthority**](FiscalAuthoritiesApi.md#updateFiscalAuthority) | **PUT** /api/v2/AccountingService/Fiscals/Authorities/{authorityId} | Update a fiscal authority |


<a id="createFiscalAuthority"></a>
# **createFiscalAuthority**
> EmptyEnvelope createFiscalAuthority(tenantId, apiVersion, xApiVersion, fiscalAuthorityCreateDto)

Create a fiscal authority

Creates a new fiscal authority for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalAuthoritiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FiscalAuthoritiesApi apiInstance = new FiscalAuthoritiesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    FiscalAuthorityCreateDto fiscalAuthorityCreateDto = new FiscalAuthorityCreateDto(); // FiscalAuthorityCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createFiscalAuthority(tenantId, apiVersion, xApiVersion, fiscalAuthorityCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalAuthoritiesApi#createFiscalAuthority");
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
| **fiscalAuthorityCreateDto** | [**FiscalAuthorityCreateDto**](FiscalAuthorityCreateDto.md)|  | [optional] |

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
| **201** | Created |  -  |

<a id="deleteFiscalAuthority"></a>
# **deleteFiscalAuthority**
> EmptyEnvelope deleteFiscalAuthority(tenantId, authorityId, apiVersion, xApiVersion)

Delete a fiscal authority

Deletes a fiscal authority identified by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalAuthoritiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FiscalAuthoritiesApi apiInstance = new FiscalAuthoritiesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID authorityId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteFiscalAuthority(tenantId, authorityId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalAuthoritiesApi#deleteFiscalAuthority");
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
| **authorityId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **204** | No Content |  -  |

<a id="getFiscalAuthorities"></a>
# **getFiscalAuthorities**
> FiscalAuthorityDtoListEnvelope getFiscalAuthorities(tenantId, apiVersion, xApiVersion)

Get fiscal authorities

Retrieves all fiscal authorities for the specified tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalAuthoritiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FiscalAuthoritiesApi apiInstance = new FiscalAuthoritiesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      FiscalAuthorityDtoListEnvelope result = apiInstance.getFiscalAuthorities(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalAuthoritiesApi#getFiscalAuthorities");
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

[**FiscalAuthorityDtoListEnvelope**](FiscalAuthorityDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getFiscalAuthoritiesCount"></a>
# **getFiscalAuthoritiesCount**
> Int32Envelope getFiscalAuthoritiesCount(tenantId, apiVersion, xApiVersion)

Get fiscal authorities count

Returns the total count of fiscal authorities for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalAuthoritiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FiscalAuthoritiesApi apiInstance = new FiscalAuthoritiesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getFiscalAuthoritiesCount(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalAuthoritiesApi#getFiscalAuthoritiesCount");
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
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getFiscalAuthority"></a>
# **getFiscalAuthority**
> FiscalAuthorityDtoEnvelope getFiscalAuthority(tenantId, authorityId, apiVersion, xApiVersion)

Get fiscal authority by ID

Retrieves a specific fiscal authority by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalAuthoritiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FiscalAuthoritiesApi apiInstance = new FiscalAuthoritiesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID authorityId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      FiscalAuthorityDtoEnvelope result = apiInstance.getFiscalAuthority(tenantId, authorityId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalAuthoritiesApi#getFiscalAuthority");
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
| **authorityId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**FiscalAuthorityDtoEnvelope**](FiscalAuthorityDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="updateFiscalAuthority"></a>
# **updateFiscalAuthority**
> EmptyEnvelope updateFiscalAuthority(tenantId, authorityId, apiVersion, xApiVersion, fiscalAuthorityUpdateDto)

Update a fiscal authority

Updates an existing fiscal authority identified by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalAuthoritiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FiscalAuthoritiesApi apiInstance = new FiscalAuthoritiesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID authorityId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    FiscalAuthorityUpdateDto fiscalAuthorityUpdateDto = new FiscalAuthorityUpdateDto(); // FiscalAuthorityUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateFiscalAuthority(tenantId, authorityId, apiVersion, xApiVersion, fiscalAuthorityUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalAuthoritiesApi#updateFiscalAuthority");
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
| **authorityId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **fiscalAuthorityUpdateDto** | [**FiscalAuthorityUpdateDto**](FiscalAuthorityUpdateDto.md)|  | [optional] |

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

