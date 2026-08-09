# LicensesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createLicenseAsync**](LicensesApi.md#createLicenseAsync) | **POST** /api/v2/LicensingService/Licenses | Create a new license |
| [**deleteLicenseAsync**](LicensesApi.md#deleteLicenseAsync) | **DELETE** /api/v2/LicensingService/Licenses/{licenseId} | Delete a license |
| [**getLicenseByIdAsync**](LicensesApi.md#getLicenseByIdAsync) | **GET** /api/v2/LicensingService/Licenses/{licenseId} | Get license by ID |
| [**getLicensesAsync**](LicensesApi.md#getLicensesAsync) | **GET** /api/v2/LicensingService/Licenses | Get licenses |
| [**getLicensesCountAsync**](LicensesApi.md#getLicensesCountAsync) | **GET** /api/v2/LicensingService/Licenses/Count | Get licenses count |
| [**updateLicenseAsync**](LicensesApi.md#updateLicenseAsync) | **PUT** /api/v2/LicensingService/Licenses/{licenseId} | Update a license |


<a id="createLicenseAsync"></a>
# **createLicenseAsync**
> createLicenseAsync(tenantId, apiVersion, xApiVersion, licenseCreateDto)

Create a new license

Creates a new license instance for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LicensesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    LicensesApi apiInstance = new LicensesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    LicenseCreateDto licenseCreateDto = new LicenseCreateDto(); // LicenseCreateDto | 
    try {
      apiInstance.createLicenseAsync(tenantId, apiVersion, xApiVersion, licenseCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling LicensesApi#createLicenseAsync");
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
| **licenseCreateDto** | [**LicenseCreateDto**](LicenseCreateDto.md)|  | [optional] |

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
| **201** | Created |  -  |

<a id="deleteLicenseAsync"></a>
# **deleteLicenseAsync**
> deleteLicenseAsync(tenantId, licenseId, apiVersion, xApiVersion)

Delete a license

Deletes a license instance for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LicensesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    LicensesApi apiInstance = new LicensesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID licenseId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteLicenseAsync(tenantId, licenseId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling LicensesApi#deleteLicenseAsync");
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
| **licenseId** | **UUID**|  | |
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

<a id="getLicenseByIdAsync"></a>
# **getLicenseByIdAsync**
> LicenseDto getLicenseByIdAsync(tenantId, licenseId, apiVersion, xApiVersion)

Get license by ID

Retrieves a specific license instance by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LicensesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    LicensesApi apiInstance = new LicensesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID licenseId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      LicenseDto result = apiInstance.getLicenseByIdAsync(tenantId, licenseId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LicensesApi#getLicenseByIdAsync");
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
| **licenseId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**LicenseDto**](LicenseDto.md)

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

<a id="getLicensesAsync"></a>
# **getLicensesAsync**
> LicenseDtoListEnvelope getLicensesAsync(tenantId, apiVersion, xApiVersion, licenseDtoCollectionQueryParameters)

Get licenses

Retrieves the license instances owned by the specified tenant, filtered via OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LicensesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    LicensesApi apiInstance = new LicensesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    LicenseDtoCollectionQueryParameters licenseDtoCollectionQueryParameters = new LicenseDtoCollectionQueryParameters(); // LicenseDtoCollectionQueryParameters | 
    try {
      LicenseDtoListEnvelope result = apiInstance.getLicensesAsync(tenantId, apiVersion, xApiVersion, licenseDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LicensesApi#getLicensesAsync");
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
| **licenseDtoCollectionQueryParameters** | [**LicenseDtoCollectionQueryParameters**](LicenseDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**LicenseDtoListEnvelope**](LicenseDtoListEnvelope.md)

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

<a id="getLicensesCountAsync"></a>
# **getLicensesCountAsync**
> Int32Envelope getLicensesCountAsync(tenantId, apiVersion, xApiVersion, licenseDtoCollectionQueryParameters)

Get licenses count

Returns the count of license instances owned by the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LicensesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    LicensesApi apiInstance = new LicensesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    LicenseDtoCollectionQueryParameters licenseDtoCollectionQueryParameters = new LicenseDtoCollectionQueryParameters(); // LicenseDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getLicensesCountAsync(tenantId, apiVersion, xApiVersion, licenseDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LicensesApi#getLicensesCountAsync");
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
| **licenseDtoCollectionQueryParameters** | [**LicenseDtoCollectionQueryParameters**](LicenseDtoCollectionQueryParameters.md)|  | [optional] |

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

<a id="updateLicenseAsync"></a>
# **updateLicenseAsync**
> updateLicenseAsync(tenantId, licenseId, apiVersion, xApiVersion, licenseUpdateDto)

Update a license

Updates an existing license instance for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LicensesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    LicensesApi apiInstance = new LicensesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID licenseId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    LicenseUpdateDto licenseUpdateDto = new LicenseUpdateDto(); // LicenseUpdateDto | 
    try {
      apiInstance.updateLicenseAsync(tenantId, licenseId, apiVersion, xApiVersion, licenseUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling LicensesApi#updateLicenseAsync");
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
| **licenseId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **licenseUpdateDto** | [**LicenseUpdateDto**](LicenseUpdateDto.md)|  | [optional] |

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

