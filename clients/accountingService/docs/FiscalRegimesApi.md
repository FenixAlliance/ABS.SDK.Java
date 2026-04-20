# FiscalRegimesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFiscalRegime**](FiscalRegimesApi.md#createFiscalRegime) | **POST** /api/v2/AccountingService/Fiscals/Authorities/FiscalRegimes | Create a fiscal regime |
| [**deleteFiscalRegime**](FiscalRegimesApi.md#deleteFiscalRegime) | **DELETE** /api/v2/AccountingService/Fiscals/Authorities/FiscalRegimes/{regimeId} | Delete a fiscal regime |
| [**getFiscalRegime**](FiscalRegimesApi.md#getFiscalRegime) | **GET** /api/v2/AccountingService/Fiscals/Authorities/{fiscalAuthorityId}/FiscalRegimes/{regimeId} | Get fiscal regime by ID |
| [**getFiscalRegimes**](FiscalRegimesApi.md#getFiscalRegimes) | **GET** /api/v2/AccountingService/Fiscals/Authorities/{authorityId}/FiscalRegimes | Get fiscal regimes for an authority |
| [**getFiscalRegimesCount**](FiscalRegimesApi.md#getFiscalRegimesCount) | **GET** /api/v2/AccountingService/Fiscals/Authorities/{fiscalAuthorityId}/FiscalRegimes/Count | Get fiscal regimes count |
| [**updateFiscalRegime**](FiscalRegimesApi.md#updateFiscalRegime) | **PUT** /api/v2/AccountingService/Fiscals/Authorities/FiscalRegimes/{regimeId} | Update a fiscal regime |


<a id="createFiscalRegime"></a>
# **createFiscalRegime**
> EmptyEnvelope createFiscalRegime(tenantId, apiVersion, xApiVersion, fiscalRegimeCreateDto)

Create a fiscal regime

Creates a new fiscal regime for a fiscal authority.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalRegimesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FiscalRegimesApi apiInstance = new FiscalRegimesApi(defaultClient);
    Object tenantId = null; // Object | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    FiscalRegimeCreateDto fiscalRegimeCreateDto = new FiscalRegimeCreateDto(); // FiscalRegimeCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createFiscalRegime(tenantId, apiVersion, xApiVersion, fiscalRegimeCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalRegimesApi#createFiscalRegime");
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
| **tenantId** | [**Object**](.md)|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **fiscalRegimeCreateDto** | [**FiscalRegimeCreateDto**](FiscalRegimeCreateDto.md)|  | [optional] |

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

<a id="deleteFiscalRegime"></a>
# **deleteFiscalRegime**
> EmptyEnvelope deleteFiscalRegime(tenantId, regimeId, apiVersion, xApiVersion)

Delete a fiscal regime

Deletes a fiscal regime identified by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalRegimesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FiscalRegimesApi apiInstance = new FiscalRegimesApi(defaultClient);
    Object tenantId = null; // Object | 
    UUID regimeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteFiscalRegime(tenantId, regimeId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalRegimesApi#deleteFiscalRegime");
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
| **tenantId** | [**Object**](.md)|  | |
| **regimeId** | **UUID**|  | |
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

<a id="getFiscalRegime"></a>
# **getFiscalRegime**
> FiscalRegimeDtoEnvelope getFiscalRegime(tenantId, fiscalAuthorityId, regimeId, apiVersion, xApiVersion)

Get fiscal regime by ID

Retrieves a specific fiscal regime by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalRegimesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FiscalRegimesApi apiInstance = new FiscalRegimesApi(defaultClient);
    Object tenantId = null; // Object | 
    UUID fiscalAuthorityId = UUID.randomUUID(); // UUID | 
    UUID regimeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      FiscalRegimeDtoEnvelope result = apiInstance.getFiscalRegime(tenantId, fiscalAuthorityId, regimeId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalRegimesApi#getFiscalRegime");
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
| **tenantId** | [**Object**](.md)|  | |
| **fiscalAuthorityId** | **UUID**|  | |
| **regimeId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**FiscalRegimeDtoEnvelope**](FiscalRegimeDtoEnvelope.md)

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

<a id="getFiscalRegimes"></a>
# **getFiscalRegimes**
> FiscalRegimeDtoListEnvelope getFiscalRegimes(fiscalAuthorityId, authorityId, apiVersion, xApiVersion)

Get fiscal regimes for an authority

Retrieves all fiscal regimes for the specified fiscal authority.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalRegimesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FiscalRegimesApi apiInstance = new FiscalRegimesApi(defaultClient);
    UUID fiscalAuthorityId = UUID.randomUUID(); // UUID | 
    String authorityId = "authorityId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      FiscalRegimeDtoListEnvelope result = apiInstance.getFiscalRegimes(fiscalAuthorityId, authorityId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalRegimesApi#getFiscalRegimes");
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
| **fiscalAuthorityId** | **UUID**|  | |
| **authorityId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**FiscalRegimeDtoListEnvelope**](FiscalRegimeDtoListEnvelope.md)

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

<a id="getFiscalRegimesCount"></a>
# **getFiscalRegimesCount**
> Int32Envelope getFiscalRegimesCount(fiscalAuthorityId, apiVersion, xApiVersion)

Get fiscal regimes count

Returns the total count of fiscal regimes for the specified fiscal authority.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalRegimesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FiscalRegimesApi apiInstance = new FiscalRegimesApi(defaultClient);
    UUID fiscalAuthorityId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getFiscalRegimesCount(fiscalAuthorityId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalRegimesApi#getFiscalRegimesCount");
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
| **fiscalAuthorityId** | **UUID**|  | |
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

<a id="updateFiscalRegime"></a>
# **updateFiscalRegime**
> EmptyEnvelope updateFiscalRegime(tenantId, regimeId, apiVersion, xApiVersion, fiscalRegimeUpdateDto)

Update a fiscal regime

Updates an existing fiscal regime identified by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalRegimesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FiscalRegimesApi apiInstance = new FiscalRegimesApi(defaultClient);
    Object tenantId = null; // Object | 
    UUID regimeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    FiscalRegimeUpdateDto fiscalRegimeUpdateDto = new FiscalRegimeUpdateDto(); // FiscalRegimeUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateFiscalRegime(tenantId, regimeId, apiVersion, xApiVersion, fiscalRegimeUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalRegimesApi#updateFiscalRegime");
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
| **tenantId** | [**Object**](.md)|  | |
| **regimeId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **fiscalRegimeUpdateDto** | [**FiscalRegimeUpdateDto**](FiscalRegimeUpdateDto.md)|  | [optional] |

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

