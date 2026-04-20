# FiscalIdentificationTypesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFiscalIdentificationType**](FiscalIdentificationTypesApi.md#createFiscalIdentificationType) | **POST** /api/v2/AccountingService/Fiscals/Authorities/IdentificationTypes | Create a fiscal identification type |
| [**deleteFiscalIdentificationType**](FiscalIdentificationTypesApi.md#deleteFiscalIdentificationType) | **DELETE** /api/v2/AccountingService/Fiscals/Authorities/IdentificationTypes/{identificationTypeId} | Delete a fiscal identification type |
| [**getFiscalIdentificationType**](FiscalIdentificationTypesApi.md#getFiscalIdentificationType) | **GET** /api/v2/AccountingService/Fiscals/Authorities/{fiscalAuthorityId}/IdentificationTypes/{identificationTypeId} | Get fiscal identification type by ID |
| [**getFiscalIdentificationTypes**](FiscalIdentificationTypesApi.md#getFiscalIdentificationTypes) | **GET** /api/v2/AccountingService/Fiscals/Authorities/{authorityId}/IdentificationTypes | Get fiscal identification types for an authority |
| [**getFiscalIdentificationTypesCount**](FiscalIdentificationTypesApi.md#getFiscalIdentificationTypesCount) | **GET** /api/v2/AccountingService/Fiscals/Authorities/{authorityId}/IdentificationTypes/Count | Get fiscal identification types count |
| [**updateFiscalIdentificationType**](FiscalIdentificationTypesApi.md#updateFiscalIdentificationType) | **PUT** /api/v2/AccountingService/Fiscals/Authorities/IdentificationTypes/{identificationTypeId} | Update a fiscal identification type |


<a id="createFiscalIdentificationType"></a>
# **createFiscalIdentificationType**
> EmptyEnvelope createFiscalIdentificationType(tenantId, apiVersion, xApiVersion, fiscalIdentificationTypeCreateDto)

Create a fiscal identification type

Creates a new fiscal identification type for a fiscal authority.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalIdentificationTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FiscalIdentificationTypesApi apiInstance = new FiscalIdentificationTypesApi(defaultClient);
    Object tenantId = null; // Object | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    FiscalIdentificationTypeCreateDto fiscalIdentificationTypeCreateDto = new FiscalIdentificationTypeCreateDto(); // FiscalIdentificationTypeCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createFiscalIdentificationType(tenantId, apiVersion, xApiVersion, fiscalIdentificationTypeCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalIdentificationTypesApi#createFiscalIdentificationType");
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
| **fiscalIdentificationTypeCreateDto** | [**FiscalIdentificationTypeCreateDto**](FiscalIdentificationTypeCreateDto.md)|  | [optional] |

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

<a id="deleteFiscalIdentificationType"></a>
# **deleteFiscalIdentificationType**
> EmptyEnvelope deleteFiscalIdentificationType(tenantId, identificationTypeId, apiVersion, xApiVersion)

Delete a fiscal identification type

Deletes a fiscal identification type identified by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalIdentificationTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FiscalIdentificationTypesApi apiInstance = new FiscalIdentificationTypesApi(defaultClient);
    Object tenantId = null; // Object | 
    UUID identificationTypeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteFiscalIdentificationType(tenantId, identificationTypeId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalIdentificationTypesApi#deleteFiscalIdentificationType");
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
| **identificationTypeId** | **UUID**|  | |
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

<a id="getFiscalIdentificationType"></a>
# **getFiscalIdentificationType**
> FiscalIdentificationTypeDtoEnvelope getFiscalIdentificationType(tenantId, fiscalAuthorityId, identificationTypeId, apiVersion, xApiVersion)

Get fiscal identification type by ID

Retrieves a specific fiscal identification type by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalIdentificationTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FiscalIdentificationTypesApi apiInstance = new FiscalIdentificationTypesApi(defaultClient);
    Object tenantId = null; // Object | 
    UUID fiscalAuthorityId = UUID.randomUUID(); // UUID | 
    UUID identificationTypeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      FiscalIdentificationTypeDtoEnvelope result = apiInstance.getFiscalIdentificationType(tenantId, fiscalAuthorityId, identificationTypeId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalIdentificationTypesApi#getFiscalIdentificationType");
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
| **identificationTypeId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**FiscalIdentificationTypeDtoEnvelope**](FiscalIdentificationTypeDtoEnvelope.md)

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

<a id="getFiscalIdentificationTypes"></a>
# **getFiscalIdentificationTypes**
> FiscalIdentificationTypeDtoListEnvelope getFiscalIdentificationTypes(authorityId, apiVersion, xApiVersion)

Get fiscal identification types for an authority

Retrieves all fiscal identification types for the specified fiscal authority.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalIdentificationTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FiscalIdentificationTypesApi apiInstance = new FiscalIdentificationTypesApi(defaultClient);
    UUID authorityId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      FiscalIdentificationTypeDtoListEnvelope result = apiInstance.getFiscalIdentificationTypes(authorityId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalIdentificationTypesApi#getFiscalIdentificationTypes");
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
| **authorityId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**FiscalIdentificationTypeDtoListEnvelope**](FiscalIdentificationTypeDtoListEnvelope.md)

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

<a id="getFiscalIdentificationTypesCount"></a>
# **getFiscalIdentificationTypesCount**
> Int32Envelope getFiscalIdentificationTypesCount(authorityId, apiVersion, xApiVersion)

Get fiscal identification types count

Returns the total count of fiscal identification types for the specified fiscal authority.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalIdentificationTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FiscalIdentificationTypesApi apiInstance = new FiscalIdentificationTypesApi(defaultClient);
    UUID authorityId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getFiscalIdentificationTypesCount(authorityId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalIdentificationTypesApi#getFiscalIdentificationTypesCount");
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
| **authorityId** | **UUID**|  | |
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

<a id="updateFiscalIdentificationType"></a>
# **updateFiscalIdentificationType**
> EmptyEnvelope updateFiscalIdentificationType(tenantId, identificationTypeId, apiVersion, xApiVersion, fiscalIdentificationTypeUpdateDto)

Update a fiscal identification type

Updates an existing fiscal identification type identified by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalIdentificationTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FiscalIdentificationTypesApi apiInstance = new FiscalIdentificationTypesApi(defaultClient);
    Object tenantId = null; // Object | 
    UUID identificationTypeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    FiscalIdentificationTypeUpdateDto fiscalIdentificationTypeUpdateDto = new FiscalIdentificationTypeUpdateDto(); // FiscalIdentificationTypeUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateFiscalIdentificationType(tenantId, identificationTypeId, apiVersion, xApiVersion, fiscalIdentificationTypeUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalIdentificationTypesApi#updateFiscalIdentificationType");
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
| **identificationTypeId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **fiscalIdentificationTypeUpdateDto** | [**FiscalIdentificationTypeUpdateDto**](FiscalIdentificationTypeUpdateDto.md)|  | [optional] |

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

