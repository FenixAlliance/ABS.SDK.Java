# FiscalAuthorityYearsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFiscalYear**](FiscalAuthorityYearsApi.md#createFiscalYear) | **POST** /api/v2/AccountingService/Fiscals/Authorities/FiscalYears | Create a fiscal year |
| [**deleteFiscalYear**](FiscalAuthorityYearsApi.md#deleteFiscalYear) | **DELETE** /api/v2/AccountingService/Fiscals/Authorities/FiscalYears/{fiscalYearId} | Delete a fiscal year |
| [**getFiscalYear**](FiscalAuthorityYearsApi.md#getFiscalYear) | **GET** /api/v2/AccountingService/Fiscals/Authorities/{fiscalAuthorityId}/FiscalYears/{fiscalYearId} | Get fiscal year by ID for an authority |
| [**getFiscalYears**](FiscalAuthorityYearsApi.md#getFiscalYears) | **GET** /api/v2/AccountingService/Fiscals/Authorities/{authorityId}/FiscalYears | Get fiscal years for an authority |
| [**getFiscalYearsCount**](FiscalAuthorityYearsApi.md#getFiscalYearsCount) | **GET** /api/v2/AccountingService/Fiscals/Authorities/{fiscalAuthorityId}/FiscalYears/Count | Get fiscal years count for an authority |
| [**updateFiscalYear**](FiscalAuthorityYearsApi.md#updateFiscalYear) | **PUT** /api/v2/AccountingService/Fiscals/Authorities/FiscalYears/{fiscalYearId} | Update a fiscal year |


<a id="createFiscalYear"></a>
# **createFiscalYear**
> EmptyEnvelope createFiscalYear(tenantId, apiVersion, xApiVersion, fiscalYearCreateDto)

Create a fiscal year

Creates a new fiscal year associated with a fiscal authority.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalAuthorityYearsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FiscalAuthorityYearsApi apiInstance = new FiscalAuthorityYearsApi(defaultClient);
    Object tenantId = null; // Object | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    FiscalYearCreateDto fiscalYearCreateDto = new FiscalYearCreateDto(); // FiscalYearCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createFiscalYear(tenantId, apiVersion, xApiVersion, fiscalYearCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalAuthorityYearsApi#createFiscalYear");
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
| **fiscalYearCreateDto** | [**FiscalYearCreateDto**](FiscalYearCreateDto.md)|  | [optional] |

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

<a id="deleteFiscalYear"></a>
# **deleteFiscalYear**
> EmptyEnvelope deleteFiscalYear(tenantId, fiscalYearId, apiVersion, xApiVersion)

Delete a fiscal year

Deletes a fiscal year identified by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalAuthorityYearsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FiscalAuthorityYearsApi apiInstance = new FiscalAuthorityYearsApi(defaultClient);
    Object tenantId = null; // Object | 
    UUID fiscalYearId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteFiscalYear(tenantId, fiscalYearId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalAuthorityYearsApi#deleteFiscalYear");
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
| **fiscalYearId** | **UUID**|  | |
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

<a id="getFiscalYear"></a>
# **getFiscalYear**
> FiscalYearDtoEnvelope getFiscalYear(tenantId, fiscalAuthorityId, fiscalYearId, apiVersion, xApiVersion)

Get fiscal year by ID for an authority

Retrieves a specific fiscal year by its unique identifier within a fiscal authority.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalAuthorityYearsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FiscalAuthorityYearsApi apiInstance = new FiscalAuthorityYearsApi(defaultClient);
    Object tenantId = null; // Object | 
    UUID fiscalAuthorityId = UUID.randomUUID(); // UUID | 
    UUID fiscalYearId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      FiscalYearDtoEnvelope result = apiInstance.getFiscalYear(tenantId, fiscalAuthorityId, fiscalYearId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalAuthorityYearsApi#getFiscalYear");
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
| **fiscalYearId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**FiscalYearDtoEnvelope**](FiscalYearDtoEnvelope.md)

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

<a id="getFiscalYears"></a>
# **getFiscalYears**
> FiscalYearDtoListEnvelope getFiscalYears(tenantId, fiscalAuthorityId, authorityId, apiVersion, xApiVersion)

Get fiscal years for an authority

Retrieves all fiscal years associated with the specified fiscal authority.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalAuthorityYearsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FiscalAuthorityYearsApi apiInstance = new FiscalAuthorityYearsApi(defaultClient);
    Object tenantId = null; // Object | 
    UUID fiscalAuthorityId = UUID.randomUUID(); // UUID | 
    String authorityId = "authorityId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      FiscalYearDtoListEnvelope result = apiInstance.getFiscalYears(tenantId, fiscalAuthorityId, authorityId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalAuthorityYearsApi#getFiscalYears");
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
| **authorityId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**FiscalYearDtoListEnvelope**](FiscalYearDtoListEnvelope.md)

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

<a id="getFiscalYearsCount"></a>
# **getFiscalYearsCount**
> Int32Envelope getFiscalYearsCount(tenantId, fiscalAuthorityId, apiVersion, xApiVersion)

Get fiscal years count for an authority

Returns the total count of fiscal years for the specified fiscal authority.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalAuthorityYearsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FiscalAuthorityYearsApi apiInstance = new FiscalAuthorityYearsApi(defaultClient);
    Object tenantId = null; // Object | 
    UUID fiscalAuthorityId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getFiscalYearsCount(tenantId, fiscalAuthorityId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalAuthorityYearsApi#getFiscalYearsCount");
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

<a id="updateFiscalYear"></a>
# **updateFiscalYear**
> EmptyEnvelope updateFiscalYear(tenantId, fiscalYearId, apiVersion, xApiVersion, fiscalYearUpdateDto)

Update a fiscal year

Updates an existing fiscal year identified by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalAuthorityYearsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FiscalAuthorityYearsApi apiInstance = new FiscalAuthorityYearsApi(defaultClient);
    Object tenantId = null; // Object | 
    UUID fiscalYearId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    FiscalYearUpdateDto fiscalYearUpdateDto = new FiscalYearUpdateDto(); // FiscalYearUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateFiscalYear(tenantId, fiscalYearId, apiVersion, xApiVersion, fiscalYearUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalAuthorityYearsApi#updateFiscalYear");
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
| **fiscalYearId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **fiscalYearUpdateDto** | [**FiscalYearUpdateDto**](FiscalYearUpdateDto.md)|  | [optional] |

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

