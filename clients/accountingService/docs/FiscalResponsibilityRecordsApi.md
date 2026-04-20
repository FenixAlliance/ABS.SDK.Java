# FiscalResponsibilityRecordsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFiscalResponsibilityRecord**](FiscalResponsibilityRecordsApi.md#createFiscalResponsibilityRecord) | **POST** /api/v2/AccountingService/Fiscals/Authorities/FiscalResponsibilityRecords | Create a fiscal responsibility record |
| [**deleteFiscalResponsibilityRecord**](FiscalResponsibilityRecordsApi.md#deleteFiscalResponsibilityRecord) | **DELETE** /api/v2/AccountingService/Fiscals/Authorities/FiscalResponsibilityRecords/{fiscalResponsibilityRecordId} | Delete a fiscal responsibility record |
| [**getFiscalResponsibilityRecord**](FiscalResponsibilityRecordsApi.md#getFiscalResponsibilityRecord) | **GET** /api/v2/AccountingService/Fiscals/Authorities/{fiscalAuthorityId}/FiscalResponsibilities/{fiscalResponsibilityId}/FiscalResponsibilityRecords/{fiscalResponsibilityRecordId} | Get fiscal responsibility record by ID |
| [**getFiscalResponsibilityRecords**](FiscalResponsibilityRecordsApi.md#getFiscalResponsibilityRecords) | **GET** /api/v2/AccountingService/Fiscals/Authorities/{fiscalAuthorityId}/FiscalResponsibilities/{fiscalResponsibilityId}/FiscalResponsibilityRecords | Get fiscal responsibility records |
| [**getFiscalResponsibilityRecordsCount**](FiscalResponsibilityRecordsApi.md#getFiscalResponsibilityRecordsCount) | **GET** /api/v2/AccountingService/Fiscals/Authorities/{fiscalAuthorityId}/FiscalResponsibilities/{fiscalResponsibilityId}/FiscalResponsibilityRecords/Count | Get fiscal responsibility records count |
| [**updateFiscalResponsibilityRecord**](FiscalResponsibilityRecordsApi.md#updateFiscalResponsibilityRecord) | **PUT** /api/v2/AccountingService/Fiscals/Authorities/FiscalResponsibilityRecords/{fiscalResponsibilityRecordId} | Update a fiscal responsibility record |


<a id="createFiscalResponsibilityRecord"></a>
# **createFiscalResponsibilityRecord**
> EmptyEnvelope createFiscalResponsibilityRecord(tenantId, apiVersion, xApiVersion, fiscalResponsibilityRecordCreateDto)

Create a fiscal responsibility record

Creates a new fiscal responsibility record for a fiscal responsibility.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalResponsibilityRecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FiscalResponsibilityRecordsApi apiInstance = new FiscalResponsibilityRecordsApi(defaultClient);
    Object tenantId = null; // Object | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    FiscalResponsibilityRecordCreateDto fiscalResponsibilityRecordCreateDto = new FiscalResponsibilityRecordCreateDto(); // FiscalResponsibilityRecordCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createFiscalResponsibilityRecord(tenantId, apiVersion, xApiVersion, fiscalResponsibilityRecordCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalResponsibilityRecordsApi#createFiscalResponsibilityRecord");
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
| **fiscalResponsibilityRecordCreateDto** | [**FiscalResponsibilityRecordCreateDto**](FiscalResponsibilityRecordCreateDto.md)|  | [optional] |

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

<a id="deleteFiscalResponsibilityRecord"></a>
# **deleteFiscalResponsibilityRecord**
> EmptyEnvelope deleteFiscalResponsibilityRecord(tenantId, fiscalResponsibilityRecordId, apiVersion, xApiVersion)

Delete a fiscal responsibility record

Deletes a fiscal responsibility record identified by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalResponsibilityRecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FiscalResponsibilityRecordsApi apiInstance = new FiscalResponsibilityRecordsApi(defaultClient);
    Object tenantId = null; // Object | 
    UUID fiscalResponsibilityRecordId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteFiscalResponsibilityRecord(tenantId, fiscalResponsibilityRecordId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalResponsibilityRecordsApi#deleteFiscalResponsibilityRecord");
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
| **fiscalResponsibilityRecordId** | **UUID**|  | |
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

<a id="getFiscalResponsibilityRecord"></a>
# **getFiscalResponsibilityRecord**
> FiscalResponsibilityRecordDtoEnvelope getFiscalResponsibilityRecord(tenantId, fiscalAuthorityId, fiscalResponsibilityId, fiscalResponsibilityRecordId, apiVersion, xApiVersion)

Get fiscal responsibility record by ID

Retrieves a specific fiscal responsibility record by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalResponsibilityRecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FiscalResponsibilityRecordsApi apiInstance = new FiscalResponsibilityRecordsApi(defaultClient);
    Object tenantId = null; // Object | 
    UUID fiscalAuthorityId = UUID.randomUUID(); // UUID | 
    UUID fiscalResponsibilityId = UUID.randomUUID(); // UUID | 
    UUID fiscalResponsibilityRecordId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      FiscalResponsibilityRecordDtoEnvelope result = apiInstance.getFiscalResponsibilityRecord(tenantId, fiscalAuthorityId, fiscalResponsibilityId, fiscalResponsibilityRecordId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalResponsibilityRecordsApi#getFiscalResponsibilityRecord");
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
| **fiscalResponsibilityId** | **UUID**|  | |
| **fiscalResponsibilityRecordId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**FiscalResponsibilityRecordDtoEnvelope**](FiscalResponsibilityRecordDtoEnvelope.md)

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

<a id="getFiscalResponsibilityRecords"></a>
# **getFiscalResponsibilityRecords**
> FiscalResponsibilityRecordDtoListEnvelope getFiscalResponsibilityRecords(tenantId, fiscalAuthorityId, fiscalResponsibilityId, apiVersion, xApiVersion)

Get fiscal responsibility records

Retrieves all fiscal responsibility records for the specified fiscal responsibility.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalResponsibilityRecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FiscalResponsibilityRecordsApi apiInstance = new FiscalResponsibilityRecordsApi(defaultClient);
    Object tenantId = null; // Object | 
    UUID fiscalAuthorityId = UUID.randomUUID(); // UUID | 
    UUID fiscalResponsibilityId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      FiscalResponsibilityRecordDtoListEnvelope result = apiInstance.getFiscalResponsibilityRecords(tenantId, fiscalAuthorityId, fiscalResponsibilityId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalResponsibilityRecordsApi#getFiscalResponsibilityRecords");
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
| **fiscalResponsibilityId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**FiscalResponsibilityRecordDtoListEnvelope**](FiscalResponsibilityRecordDtoListEnvelope.md)

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

<a id="getFiscalResponsibilityRecordsCount"></a>
# **getFiscalResponsibilityRecordsCount**
> Int32Envelope getFiscalResponsibilityRecordsCount(tenantId, fiscalAuthorityId, fiscalResponsibilityId, apiVersion, xApiVersion)

Get fiscal responsibility records count

Returns the total count of fiscal responsibility records for the specified fiscal responsibility.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalResponsibilityRecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FiscalResponsibilityRecordsApi apiInstance = new FiscalResponsibilityRecordsApi(defaultClient);
    Object tenantId = null; // Object | 
    UUID fiscalAuthorityId = UUID.randomUUID(); // UUID | 
    UUID fiscalResponsibilityId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getFiscalResponsibilityRecordsCount(tenantId, fiscalAuthorityId, fiscalResponsibilityId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalResponsibilityRecordsApi#getFiscalResponsibilityRecordsCount");
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
| **fiscalResponsibilityId** | **UUID**|  | |
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

<a id="updateFiscalResponsibilityRecord"></a>
# **updateFiscalResponsibilityRecord**
> EmptyEnvelope updateFiscalResponsibilityRecord(tenantId, fiscalResponsibilityRecordId, apiVersion, xApiVersion, fiscalResponsibilityRecordUpdateDto)

Update a fiscal responsibility record

Updates an existing fiscal responsibility record identified by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalResponsibilityRecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FiscalResponsibilityRecordsApi apiInstance = new FiscalResponsibilityRecordsApi(defaultClient);
    Object tenantId = null; // Object | 
    UUID fiscalResponsibilityRecordId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    FiscalResponsibilityRecordUpdateDto fiscalResponsibilityRecordUpdateDto = new FiscalResponsibilityRecordUpdateDto(); // FiscalResponsibilityRecordUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateFiscalResponsibilityRecord(tenantId, fiscalResponsibilityRecordId, apiVersion, xApiVersion, fiscalResponsibilityRecordUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalResponsibilityRecordsApi#updateFiscalResponsibilityRecord");
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
| **fiscalResponsibilityRecordId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **fiscalResponsibilityRecordUpdateDto** | [**FiscalResponsibilityRecordUpdateDto**](FiscalResponsibilityRecordUpdateDto.md)|  | [optional] |

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

