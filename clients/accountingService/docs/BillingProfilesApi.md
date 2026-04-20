# BillingProfilesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBillingProfileAsync**](BillingProfilesApi.md#createBillingProfileAsync) | **POST** /api/v2/AccountingService/BillingProfiles | Creates a new billing profile |
| [**deleteBillingProfileAsync**](BillingProfilesApi.md#deleteBillingProfileAsync) | **DELETE** /api/v2/AccountingService/BillingProfiles/{billingProfileId} | Deletes a billing profile |
| [**getBillingProfileByIdAsync**](BillingProfilesApi.md#getBillingProfileByIdAsync) | **GET** /api/v2/AccountingService/BillingProfiles/{billingProfileId} | Gets a billing profile by id |
| [**getBillingProfilesAsync**](BillingProfilesApi.md#getBillingProfilesAsync) | **GET** /api/v2/AccountingService/BillingProfiles | Gets all billing profiles |
| [**getBillingProfilesCountAsync**](BillingProfilesApi.md#getBillingProfilesCountAsync) | **GET** /api/v2/AccountingService/BillingProfiles/Count | Gets the count of billing profiles |
| [**updateBillingProfileAsync**](BillingProfilesApi.md#updateBillingProfileAsync) | **PUT** /api/v2/AccountingService/BillingProfiles/{billingProfileId} | Updates an existing billing profile |


<a id="createBillingProfileAsync"></a>
# **createBillingProfileAsync**
> EmptyEnvelope createBillingProfileAsync(tenantId, billingProfileCreateDto, apiVersion, xApiVersion)

Creates a new billing profile

Adds a new billing profile record for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BillingProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BillingProfilesApi apiInstance = new BillingProfilesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    BillingProfileCreateDto billingProfileCreateDto = new BillingProfileCreateDto(); // BillingProfileCreateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.createBillingProfileAsync(tenantId, billingProfileCreateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingProfilesApi#createBillingProfileAsync");
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
| **billingProfileCreateDto** | [**BillingProfileCreateDto**](BillingProfileCreateDto.md)|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

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

<a id="deleteBillingProfileAsync"></a>
# **deleteBillingProfileAsync**
> EmptyEnvelope deleteBillingProfileAsync(tenantId, billingProfileId, apiVersion, xApiVersion)

Deletes a billing profile

Removes a billing profile from the system using its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BillingProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BillingProfilesApi apiInstance = new BillingProfilesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID billingProfileId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteBillingProfileAsync(tenantId, billingProfileId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingProfilesApi#deleteBillingProfileAsync");
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
| **billingProfileId** | **UUID**|  | |
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

<a id="getBillingProfileByIdAsync"></a>
# **getBillingProfileByIdAsync**
> BillingProfileDtoEnvelope getBillingProfileByIdAsync(tenantId, billingProfileId, apiVersion, xApiVersion)

Gets a billing profile by id

Retrieves a specific billing profile using its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BillingProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BillingProfilesApi apiInstance = new BillingProfilesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID billingProfileId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      BillingProfileDtoEnvelope result = apiInstance.getBillingProfileByIdAsync(tenantId, billingProfileId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingProfilesApi#getBillingProfileByIdAsync");
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
| **billingProfileId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**BillingProfileDtoEnvelope**](BillingProfileDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getBillingProfilesAsync"></a>
# **getBillingProfilesAsync**
> BillingProfileDtoIReadOnlyListEnvelope getBillingProfilesAsync(tenantId, apiVersion, xApiVersion)

Gets all billing profiles

Fetches all billing profiles for a tenant with support for OData queries.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BillingProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BillingProfilesApi apiInstance = new BillingProfilesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      BillingProfileDtoIReadOnlyListEnvelope result = apiInstance.getBillingProfilesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingProfilesApi#getBillingProfilesAsync");
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

[**BillingProfileDtoIReadOnlyListEnvelope**](BillingProfileDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getBillingProfilesCountAsync"></a>
# **getBillingProfilesCountAsync**
> Int32Envelope getBillingProfilesCountAsync(tenantId, apiVersion, xApiVersion)

Gets the count of billing profiles

Returns the number of billing profiles for a tenant, supporting OData filtering.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BillingProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BillingProfilesApi apiInstance = new BillingProfilesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getBillingProfilesCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingProfilesApi#getBillingProfilesCountAsync");
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

<a id="updateBillingProfileAsync"></a>
# **updateBillingProfileAsync**
> EmptyEnvelope updateBillingProfileAsync(tenantId, billingProfileId, billingProfileUpdateDto, apiVersion, xApiVersion)

Updates an existing billing profile

Modifies an existing billing profile using the provided data.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BillingProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BillingProfilesApi apiInstance = new BillingProfilesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID billingProfileId = UUID.randomUUID(); // UUID | 
    BillingProfileUpdateDto billingProfileUpdateDto = new BillingProfileUpdateDto(); // BillingProfileUpdateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.updateBillingProfileAsync(tenantId, billingProfileId, billingProfileUpdateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingProfilesApi#updateBillingProfileAsync");
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
| **billingProfileId** | **UUID**|  | |
| **billingProfileUpdateDto** | [**BillingProfileUpdateDto**](BillingProfileUpdateDto.md)|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

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

