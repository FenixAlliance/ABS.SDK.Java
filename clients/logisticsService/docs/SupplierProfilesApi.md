# SupplierProfilesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSupplierProfileAsync**](SupplierProfilesApi.md#createSupplierProfileAsync) | **POST** /api/v2/LogisticsService/SupplierProfiles | Create a supplier profile |
| [**deleteSupplierProfileAsync**](SupplierProfilesApi.md#deleteSupplierProfileAsync) | **DELETE** /api/v2/LogisticsService/SupplierProfiles/{supplierProfileId} | Delete a supplier profile |
| [**getSupplierProfileByIdAsync**](SupplierProfilesApi.md#getSupplierProfileByIdAsync) | **GET** /api/v2/LogisticsService/SupplierProfiles/{supplierProfileId} | Get supplier profile by ID |
| [**getSupplierProfilesAsync**](SupplierProfilesApi.md#getSupplierProfilesAsync) | **GET** /api/v2/LogisticsService/SupplierProfiles | Get all supplier profiles |
| [**getSupplierProfilesCountAsync**](SupplierProfilesApi.md#getSupplierProfilesCountAsync) | **GET** /api/v2/LogisticsService/SupplierProfiles/Count | Get supplier profiles count |
| [**updateSupplierProfileAsync**](SupplierProfilesApi.md#updateSupplierProfileAsync) | **PUT** /api/v2/LogisticsService/SupplierProfiles/{supplierProfileId} | Update a supplier profile |


<a id="createSupplierProfileAsync"></a>
# **createSupplierProfileAsync**
> EmptyEnvelope createSupplierProfileAsync(tenantId, apiVersion, xApiVersion, supplierProfileCreateDto)

Create a supplier profile

Creates a new supplier profile for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupplierProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SupplierProfilesApi apiInstance = new SupplierProfilesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SupplierProfileCreateDto supplierProfileCreateDto = new SupplierProfileCreateDto(); // SupplierProfileCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createSupplierProfileAsync(tenantId, apiVersion, xApiVersion, supplierProfileCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupplierProfilesApi#createSupplierProfileAsync");
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
| **supplierProfileCreateDto** | [**SupplierProfileCreateDto**](SupplierProfileCreateDto.md)|  | [optional] |

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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

<a id="deleteSupplierProfileAsync"></a>
# **deleteSupplierProfileAsync**
> EmptyEnvelope deleteSupplierProfileAsync(tenantId, supplierProfileId, apiVersion, xApiVersion)

Delete a supplier profile

Deletes a supplier profile.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupplierProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SupplierProfilesApi apiInstance = new SupplierProfilesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID supplierProfileId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteSupplierProfileAsync(tenantId, supplierProfileId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupplierProfilesApi#deleteSupplierProfileAsync");
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
| **supplierProfileId** | **UUID**|  | |
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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getSupplierProfileByIdAsync"></a>
# **getSupplierProfileByIdAsync**
> SupplierProfileDtoEnvelope getSupplierProfileByIdAsync(tenantId, supplierProfileId, apiVersion, xApiVersion)

Get supplier profile by ID

Retrieves a specific supplier profile by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupplierProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SupplierProfilesApi apiInstance = new SupplierProfilesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID supplierProfileId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SupplierProfileDtoEnvelope result = apiInstance.getSupplierProfileByIdAsync(tenantId, supplierProfileId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupplierProfilesApi#getSupplierProfileByIdAsync");
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
| **supplierProfileId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**SupplierProfileDtoEnvelope**](SupplierProfileDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getSupplierProfilesAsync"></a>
# **getSupplierProfilesAsync**
> SupplierProfileDtoListEnvelope getSupplierProfilesAsync(tenantId, apiVersion, xApiVersion)

Get all supplier profiles

Retrieves all supplier profiles for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupplierProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SupplierProfilesApi apiInstance = new SupplierProfilesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SupplierProfileDtoListEnvelope result = apiInstance.getSupplierProfilesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupplierProfilesApi#getSupplierProfilesAsync");
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

[**SupplierProfileDtoListEnvelope**](SupplierProfileDtoListEnvelope.md)

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

<a id="getSupplierProfilesCountAsync"></a>
# **getSupplierProfilesCountAsync**
> Int32Envelope getSupplierProfilesCountAsync(tenantId, apiVersion, xApiVersion)

Get supplier profiles count

Returns the count of supplier profiles for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupplierProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SupplierProfilesApi apiInstance = new SupplierProfilesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getSupplierProfilesCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupplierProfilesApi#getSupplierProfilesCountAsync");
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

<a id="updateSupplierProfileAsync"></a>
# **updateSupplierProfileAsync**
> EmptyEnvelope updateSupplierProfileAsync(tenantId, supplierProfileId, apiVersion, xApiVersion, supplierProfileUpdateDto)

Update a supplier profile

Updates an existing supplier profile.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupplierProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SupplierProfilesApi apiInstance = new SupplierProfilesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID supplierProfileId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SupplierProfileUpdateDto supplierProfileUpdateDto = new SupplierProfileUpdateDto(); // SupplierProfileUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateSupplierProfileAsync(tenantId, supplierProfileId, apiVersion, xApiVersion, supplierProfileUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupplierProfilesApi#updateSupplierProfileAsync");
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
| **supplierProfileId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **supplierProfileUpdateDto** | [**SupplierProfileUpdateDto**](SupplierProfileUpdateDto.md)|  | [optional] |

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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

