# FiscalResponsibilitiesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFiscalResponsibility**](FiscalResponsibilitiesApi.md#createFiscalResponsibility) | **POST** /api/v2/AccountingService/Fiscals/Authorities/FiscalResponsibilities | Create a fiscal responsibility |
| [**deleteFiscalResponsibility**](FiscalResponsibilitiesApi.md#deleteFiscalResponsibility) | **DELETE** /api/v2/AccountingService/Fiscals/Authorities/FiscalResponsibilities/{fiscalResponsibilityId} | Delete a fiscal responsibility |
| [**getFiscalResponsibilities**](FiscalResponsibilitiesApi.md#getFiscalResponsibilities) | **GET** /api/v2/AccountingService/Fiscals/Authorities/{authorityId}/FiscalResponsibilities | Get fiscal responsibilities for an authority |
| [**getFiscalResponsibilitiesCount**](FiscalResponsibilitiesApi.md#getFiscalResponsibilitiesCount) | **GET** /api/v2/AccountingService/Fiscals/Authorities/{fiscalAuthorityId}/FiscalResponsibilities/Count | Get fiscal responsibilities count |
| [**getFiscalResponsibility**](FiscalResponsibilitiesApi.md#getFiscalResponsibility) | **GET** /api/v2/AccountingService/Fiscals/Authorities/{fiscalAuthorityId}/FiscalResponsibilities/{fiscalResponsibilityId} | Get fiscal responsibility by ID |
| [**updateFiscalResponsibility**](FiscalResponsibilitiesApi.md#updateFiscalResponsibility) | **PUT** /api/v2/AccountingService/Fiscals/Authorities/FiscalResponsibilities/{fiscalResponsibilityId} | Update a fiscal responsibility |


<a id="createFiscalResponsibility"></a>
# **createFiscalResponsibility**
> EmptyEnvelope createFiscalResponsibility(tenantId, apiVersion, xApiVersion, fiscalResponsibilityCreateDto)

Create a fiscal responsibility

Creates a new fiscal responsibility for a fiscal authority.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalResponsibilitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FiscalResponsibilitiesApi apiInstance = new FiscalResponsibilitiesApi(defaultClient);
    Object tenantId = null; // Object | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    FiscalResponsibilityCreateDto fiscalResponsibilityCreateDto = new FiscalResponsibilityCreateDto(); // FiscalResponsibilityCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createFiscalResponsibility(tenantId, apiVersion, xApiVersion, fiscalResponsibilityCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalResponsibilitiesApi#createFiscalResponsibility");
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
| **fiscalResponsibilityCreateDto** | [**FiscalResponsibilityCreateDto**](FiscalResponsibilityCreateDto.md)|  | [optional] |

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

<a id="deleteFiscalResponsibility"></a>
# **deleteFiscalResponsibility**
> EmptyEnvelope deleteFiscalResponsibility(tenantId, fiscalResponsibilityId, apiVersion, xApiVersion)

Delete a fiscal responsibility

Deletes a fiscal responsibility identified by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalResponsibilitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FiscalResponsibilitiesApi apiInstance = new FiscalResponsibilitiesApi(defaultClient);
    Object tenantId = null; // Object | 
    UUID fiscalResponsibilityId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteFiscalResponsibility(tenantId, fiscalResponsibilityId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalResponsibilitiesApi#deleteFiscalResponsibility");
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
| **fiscalResponsibilityId** | **UUID**|  | |
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

<a id="getFiscalResponsibilities"></a>
# **getFiscalResponsibilities**
> FiscalResponsibilityDtoListEnvelope getFiscalResponsibilities(fiscalAuthorityId, authorityId, apiVersion, xApiVersion)

Get fiscal responsibilities for an authority

Retrieves all fiscal responsibilities for the specified fiscal authority.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalResponsibilitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FiscalResponsibilitiesApi apiInstance = new FiscalResponsibilitiesApi(defaultClient);
    UUID fiscalAuthorityId = UUID.randomUUID(); // UUID | 
    String authorityId = "authorityId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      FiscalResponsibilityDtoListEnvelope result = apiInstance.getFiscalResponsibilities(fiscalAuthorityId, authorityId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalResponsibilitiesApi#getFiscalResponsibilities");
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

[**FiscalResponsibilityDtoListEnvelope**](FiscalResponsibilityDtoListEnvelope.md)

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

<a id="getFiscalResponsibilitiesCount"></a>
# **getFiscalResponsibilitiesCount**
> Int32Envelope getFiscalResponsibilitiesCount(fiscalAuthorityId, apiVersion, xApiVersion)

Get fiscal responsibilities count

Returns the total count of fiscal responsibilities for the specified fiscal authority.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalResponsibilitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FiscalResponsibilitiesApi apiInstance = new FiscalResponsibilitiesApi(defaultClient);
    UUID fiscalAuthorityId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getFiscalResponsibilitiesCount(fiscalAuthorityId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalResponsibilitiesApi#getFiscalResponsibilitiesCount");
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

<a id="getFiscalResponsibility"></a>
# **getFiscalResponsibility**
> FiscalResponsibilityDtoEnvelope getFiscalResponsibility(tenantId, fiscalAuthorityId, fiscalResponsibilityId, apiVersion, xApiVersion)

Get fiscal responsibility by ID

Retrieves a specific fiscal responsibility by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalResponsibilitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FiscalResponsibilitiesApi apiInstance = new FiscalResponsibilitiesApi(defaultClient);
    Object tenantId = null; // Object | 
    UUID fiscalAuthorityId = UUID.randomUUID(); // UUID | 
    UUID fiscalResponsibilityId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      FiscalResponsibilityDtoEnvelope result = apiInstance.getFiscalResponsibility(tenantId, fiscalAuthorityId, fiscalResponsibilityId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalResponsibilitiesApi#getFiscalResponsibility");
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

[**FiscalResponsibilityDtoEnvelope**](FiscalResponsibilityDtoEnvelope.md)

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

<a id="updateFiscalResponsibility"></a>
# **updateFiscalResponsibility**
> EmptyEnvelope updateFiscalResponsibility(tenantId, fiscalResponsibilityId, apiVersion, xApiVersion, fiscalResponsibilityUpdateDto)

Update a fiscal responsibility

Updates an existing fiscal responsibility identified by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalResponsibilitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FiscalResponsibilitiesApi apiInstance = new FiscalResponsibilitiesApi(defaultClient);
    Object tenantId = null; // Object | 
    UUID fiscalResponsibilityId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    FiscalResponsibilityUpdateDto fiscalResponsibilityUpdateDto = new FiscalResponsibilityUpdateDto(); // FiscalResponsibilityUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateFiscalResponsibility(tenantId, fiscalResponsibilityId, apiVersion, xApiVersion, fiscalResponsibilityUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalResponsibilitiesApi#updateFiscalResponsibility");
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
| **fiscalResponsibilityId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **fiscalResponsibilityUpdateDto** | [**FiscalResponsibilityUpdateDto**](FiscalResponsibilityUpdateDto.md)|  | [optional] |

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

