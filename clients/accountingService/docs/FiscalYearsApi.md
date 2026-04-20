# FiscalYearsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFiscalYearAsync**](FiscalYearsApi.md#createFiscalYearAsync) | **POST** /api/v2/AccountingService/FiscalYears | Create fiscal year |
| [**deleteFiscalYearAsync**](FiscalYearsApi.md#deleteFiscalYearAsync) | **DELETE** /api/v2/AccountingService/FiscalYears/{fiscalYearId} | Delete fiscal year |
| [**getFiscalYearDetailsAsync**](FiscalYearsApi.md#getFiscalYearDetailsAsync) | **GET** /api/v2/AccountingService/FiscalYears/{fiscalYearId} | Get fiscal year by ID |
| [**getFiscalYearsAsync**](FiscalYearsApi.md#getFiscalYearsAsync) | **GET** /api/v2/AccountingService/FiscalYears | Get all fiscal years |
| [**getFiscalYearsCountAsync**](FiscalYearsApi.md#getFiscalYearsCountAsync) | **GET** /api/v2/AccountingService/FiscalYears/Count | Count fiscal years |
| [**updateFiscalYearAsync**](FiscalYearsApi.md#updateFiscalYearAsync) | **PUT** /api/v2/AccountingService/FiscalYears/{fiscalYearId} | Update fiscal year |


<a id="createFiscalYearAsync"></a>
# **createFiscalYearAsync**
> EmptyEnvelope createFiscalYearAsync(tenantId, apiVersion, xApiVersion, fiscalYearCreateDto)

Create fiscal year

Creates a new fiscal year entry for a tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalYearsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FiscalYearsApi apiInstance = new FiscalYearsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    FiscalYearCreateDto fiscalYearCreateDto = new FiscalYearCreateDto(); // FiscalYearCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createFiscalYearAsync(tenantId, apiVersion, xApiVersion, fiscalYearCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalYearsApi#createFiscalYearAsync");
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
| **200** | OK |  -  |

<a id="deleteFiscalYearAsync"></a>
# **deleteFiscalYearAsync**
> EmptyEnvelope deleteFiscalYearAsync(tenantId, fiscalYearId, apiVersion, xApiVersion)

Delete fiscal year

Deletes a fiscal year identified by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalYearsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FiscalYearsApi apiInstance = new FiscalYearsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID fiscalYearId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteFiscalYearAsync(tenantId, fiscalYearId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalYearsApi#deleteFiscalYearAsync");
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
| **200** | OK |  -  |

<a id="getFiscalYearDetailsAsync"></a>
# **getFiscalYearDetailsAsync**
> FiscalYearDtoEnvelope getFiscalYearDetailsAsync(tenantId, fiscalYearId, apiVersion, xApiVersion)

Get fiscal year by ID

Gets details for a specific fiscal year.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalYearsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FiscalYearsApi apiInstance = new FiscalYearsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID fiscalYearId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      FiscalYearDtoEnvelope result = apiInstance.getFiscalYearDetailsAsync(tenantId, fiscalYearId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalYearsApi#getFiscalYearDetailsAsync");
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
| **200** | OK |  -  |

<a id="getFiscalYearsAsync"></a>
# **getFiscalYearsAsync**
> FiscalYearDtoIReadOnlyListEnvelope getFiscalYearsAsync(tenantId, apiVersion, xApiVersion)

Get all fiscal years

Retrieves a list of fiscal years for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalYearsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FiscalYearsApi apiInstance = new FiscalYearsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      FiscalYearDtoIReadOnlyListEnvelope result = apiInstance.getFiscalYearsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalYearsApi#getFiscalYearsAsync");
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

[**FiscalYearDtoIReadOnlyListEnvelope**](FiscalYearDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getFiscalYearsCountAsync"></a>
# **getFiscalYearsCountAsync**
> Int32Envelope getFiscalYearsCountAsync(tenantId, apiVersion, xApiVersion)

Count fiscal years

Returns the number of fiscal years for a tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalYearsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FiscalYearsApi apiInstance = new FiscalYearsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getFiscalYearsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalYearsApi#getFiscalYearsCountAsync");
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
| **200** | OK |  -  |

<a id="updateFiscalYearAsync"></a>
# **updateFiscalYearAsync**
> EmptyEnvelope updateFiscalYearAsync(tenantId, fiscalYearId, apiVersion, xApiVersion, fiscalYearUpdateDto)

Update fiscal year

Updates an existing fiscal year identified by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FiscalYearsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    FiscalYearsApi apiInstance = new FiscalYearsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID fiscalYearId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    FiscalYearUpdateDto fiscalYearUpdateDto = new FiscalYearUpdateDto(); // FiscalYearUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateFiscalYearAsync(tenantId, fiscalYearId, apiVersion, xApiVersion, fiscalYearUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiscalYearsApi#updateFiscalYearAsync");
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
| **200** | OK |  -  |

