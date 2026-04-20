# FiscalPeriodsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFiscalPeriod**](FiscalPeriodsApi.md#createFiscalPeriod) | **POST** /api/v2/AccountingService/Fiscals/Authorities/FiscalPeriods | Create a fiscal period |
| [**deleteFiscalPeriod**](FiscalPeriodsApi.md#deleteFiscalPeriod) | **DELETE** /api/v2/AccountingService/Fiscals/Authorities/FiscalPeriods/{fiscalPeriodId} | Delete a fiscal period |
| [**getFiscalPeriod**](FiscalPeriodsApi.md#getFiscalPeriod) | **GET** /api/v2/AccountingService/Fiscals/Authorities/{fiscalAuthorityId}/FiscalYears/{fiscalYearId}/FiscalPeriods/{fiscalPeriodId} | Get fiscal period by ID |
| [**getFiscalPeriods**](FiscalPeriodsApi.md#getFiscalPeriods) | **GET** /api/v2/AccountingService/Fiscals/Authorities/{authorityId}/FiscalYears/{fiscalYearId}/FiscalPeriods | Get fiscal periods for a fiscal year |
| [**getFiscalPeriodsCount**](FiscalPeriodsApi.md#getFiscalPeriodsCount) | **GET** /api/v2/AccountingService/Fiscals/Authorities/{fiscalAuthorityId}/FiscalYears/{fiscalYearId}/FiscalPeriods/Count | Get fiscal periods count |
| [**updateFiscalPeriod**](FiscalPeriodsApi.md#updateFiscalPeriod) | **PUT** /api/v2/AccountingService/Fiscals/Authorities/FiscalPeriods/{fiscalPeriodId} | Update a fiscal period |


<a id="createFiscalPeriod"></a>
# **createFiscalPeriod**
> EmptyEnvelope createFiscalPeriod(tenantId, apiVersion, xApiVersion, fiscalPeriodCreateDto)

Create a fiscal period

Creates a new fiscal period associated with a fiscal year.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalPeriodsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FiscalPeriodsApi apiInstance = new FiscalPeriodsApi(defaultClient);
    Object tenantId = null; // Object | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    FiscalPeriodCreateDto fiscalPeriodCreateDto = new FiscalPeriodCreateDto(); // FiscalPeriodCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createFiscalPeriod(tenantId, apiVersion, xApiVersion, fiscalPeriodCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalPeriodsApi#createFiscalPeriod");
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
| **fiscalPeriodCreateDto** | [**FiscalPeriodCreateDto**](FiscalPeriodCreateDto.md)|  | [optional] |

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

<a id="deleteFiscalPeriod"></a>
# **deleteFiscalPeriod**
> EmptyEnvelope deleteFiscalPeriod(tenantId, fiscalPeriodId, apiVersion, xApiVersion)

Delete a fiscal period

Deletes a fiscal period identified by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalPeriodsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FiscalPeriodsApi apiInstance = new FiscalPeriodsApi(defaultClient);
    Object tenantId = null; // Object | 
    UUID fiscalPeriodId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteFiscalPeriod(tenantId, fiscalPeriodId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalPeriodsApi#deleteFiscalPeriod");
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
| **fiscalPeriodId** | **UUID**|  | |
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

<a id="getFiscalPeriod"></a>
# **getFiscalPeriod**
> FiscalPeriodDtoEnvelope getFiscalPeriod(tenantId, fiscalAuthorityId, fiscalYearId, fiscalPeriodId, apiVersion, xApiVersion)

Get fiscal period by ID

Retrieves a specific fiscal period by its unique identifier within a fiscal year.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalPeriodsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FiscalPeriodsApi apiInstance = new FiscalPeriodsApi(defaultClient);
    Object tenantId = null; // Object | 
    UUID fiscalAuthorityId = UUID.randomUUID(); // UUID | 
    UUID fiscalYearId = UUID.randomUUID(); // UUID | 
    UUID fiscalPeriodId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      FiscalPeriodDtoEnvelope result = apiInstance.getFiscalPeriod(tenantId, fiscalAuthorityId, fiscalYearId, fiscalPeriodId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalPeriodsApi#getFiscalPeriod");
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
| **fiscalPeriodId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**FiscalPeriodDtoEnvelope**](FiscalPeriodDtoEnvelope.md)

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

<a id="getFiscalPeriods"></a>
# **getFiscalPeriods**
> FiscalPeriodDtoListEnvelope getFiscalPeriods(tenantId, fiscalAuthorityId, fiscalYearId, authorityId, apiVersion, xApiVersion)

Get fiscal periods for a fiscal year

Retrieves all fiscal periods for the specified fiscal year within a fiscal authority.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalPeriodsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FiscalPeriodsApi apiInstance = new FiscalPeriodsApi(defaultClient);
    Object tenantId = null; // Object | 
    UUID fiscalAuthorityId = UUID.randomUUID(); // UUID | 
    UUID fiscalYearId = UUID.randomUUID(); // UUID | 
    String authorityId = "authorityId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      FiscalPeriodDtoListEnvelope result = apiInstance.getFiscalPeriods(tenantId, fiscalAuthorityId, fiscalYearId, authorityId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalPeriodsApi#getFiscalPeriods");
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
| **authorityId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**FiscalPeriodDtoListEnvelope**](FiscalPeriodDtoListEnvelope.md)

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

<a id="getFiscalPeriodsCount"></a>
# **getFiscalPeriodsCount**
> Int32Envelope getFiscalPeriodsCount(tenantId, fiscalAuthorityId, fiscalYearId, apiVersion, xApiVersion)

Get fiscal periods count

Returns the total count of fiscal periods for the specified fiscal year.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalPeriodsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FiscalPeriodsApi apiInstance = new FiscalPeriodsApi(defaultClient);
    Object tenantId = null; // Object | 
    UUID fiscalAuthorityId = UUID.randomUUID(); // UUID | 
    UUID fiscalYearId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getFiscalPeriodsCount(tenantId, fiscalAuthorityId, fiscalYearId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalPeriodsApi#getFiscalPeriodsCount");
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

<a id="updateFiscalPeriod"></a>
# **updateFiscalPeriod**
> EmptyEnvelope updateFiscalPeriod(tenantId, fiscalPeriodId, apiVersion, xApiVersion, fiscalPeriodUpdateDto)

Update a fiscal period

Updates an existing fiscal period identified by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalPeriodsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FiscalPeriodsApi apiInstance = new FiscalPeriodsApi(defaultClient);
    Object tenantId = null; // Object | 
    UUID fiscalPeriodId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    FiscalPeriodUpdateDto fiscalPeriodUpdateDto = new FiscalPeriodUpdateDto(); // FiscalPeriodUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateFiscalPeriod(tenantId, fiscalPeriodId, apiVersion, xApiVersion, fiscalPeriodUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalPeriodsApi#updateFiscalPeriod");
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
| **fiscalPeriodId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **fiscalPeriodUpdateDto** | [**FiscalPeriodUpdateDto**](FiscalPeriodUpdateDto.md)|  | [optional] |

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

