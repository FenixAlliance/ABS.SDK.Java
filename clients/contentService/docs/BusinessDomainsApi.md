# BusinessDomainsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBusinessDomainAsync**](BusinessDomainsApi.md#createBusinessDomainAsync) | **POST** /api/v2/ContentService/BusinessDomains | Register a business domain |
| [**deleteBusinessDomainAsync**](BusinessDomainsApi.md#deleteBusinessDomainAsync) | **DELETE** /api/v2/ContentService/BusinessDomains/{businessDomainId} | Delete a business domain |
| [**getBusinessDomainByIdAsync**](BusinessDomainsApi.md#getBusinessDomainByIdAsync) | **GET** /api/v2/ContentService/BusinessDomains/{businessDomainId} | Get business domain by ID |
| [**getBusinessDomainsAsync**](BusinessDomainsApi.md#getBusinessDomainsAsync) | **GET** /api/v2/ContentService/BusinessDomains | Get business domains |
| [**getBusinessDomainsCountAsync**](BusinessDomainsApi.md#getBusinessDomainsCountAsync) | **GET** /api/v2/ContentService/BusinessDomains/Count | Get business domains count |
| [**updateBusinessDomainAsync**](BusinessDomainsApi.md#updateBusinessDomainAsync) | **PUT** /api/v2/ContentService/BusinessDomains/{businessDomainId} | Update a business domain |
| [**verifyBusinessDomainAsync**](BusinessDomainsApi.md#verifyBusinessDomainAsync) | **POST** /api/v2/ContentService/BusinessDomains/{businessDomainId}/Verify | Verify a business domain |


<a id="createBusinessDomainAsync"></a>
# **createBusinessDomainAsync**
> EmptyEnvelope createBusinessDomainAsync(tenantId, businessDomainCreateDto, apiVersion, xApiVersion)

Register a business domain

Registers a new (unverified) business domain for the tenant and issues a DNS TXT verification token.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BusinessDomainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BusinessDomainsApi apiInstance = new BusinessDomainsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    BusinessDomainCreateDto businessDomainCreateDto = new BusinessDomainCreateDto(); // BusinessDomainCreateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.createBusinessDomainAsync(tenantId, businessDomainCreateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDomainsApi#createBusinessDomainAsync");
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
| **businessDomainCreateDto** | [**BusinessDomainCreateDto**](BusinessDomainCreateDto.md)|  | |
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
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **400** | Bad Request |  -  |
| **201** | Created |  -  |

<a id="deleteBusinessDomainAsync"></a>
# **deleteBusinessDomainAsync**
> EmptyEnvelope deleteBusinessDomainAsync(tenantId, businessDomainId, apiVersion, xApiVersion)

Delete a business domain

Removes a business domain from the tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BusinessDomainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BusinessDomainsApi apiInstance = new BusinessDomainsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID businessDomainId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteBusinessDomainAsync(tenantId, businessDomainId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDomainsApi#deleteBusinessDomainAsync");
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
| **businessDomainId** | **UUID**|  | |
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
| **200** | OK |  -  |

<a id="getBusinessDomainByIdAsync"></a>
# **getBusinessDomainByIdAsync**
> BusinessDomainDtoEnvelope getBusinessDomainByIdAsync(tenantId, businessDomainId, apiVersion, xApiVersion)

Get business domain by ID

Retrieves a specific business domain.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BusinessDomainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BusinessDomainsApi apiInstance = new BusinessDomainsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID businessDomainId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      BusinessDomainDtoEnvelope result = apiInstance.getBusinessDomainByIdAsync(tenantId, businessDomainId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDomainsApi#getBusinessDomainByIdAsync");
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
| **businessDomainId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**BusinessDomainDtoEnvelope**](BusinessDomainDtoEnvelope.md)

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

<a id="getBusinessDomainsAsync"></a>
# **getBusinessDomainsAsync**
> BusinessDomainDtoListEnvelope getBusinessDomainsAsync(tenantId, apiVersion, xApiVersion, businessDomainDtoCollectionQueryParameters)

Get business domains

Retrieves business domains for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BusinessDomainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BusinessDomainsApi apiInstance = new BusinessDomainsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    BusinessDomainDtoCollectionQueryParameters businessDomainDtoCollectionQueryParameters = new BusinessDomainDtoCollectionQueryParameters(); // BusinessDomainDtoCollectionQueryParameters | 
    try {
      BusinessDomainDtoListEnvelope result = apiInstance.getBusinessDomainsAsync(tenantId, apiVersion, xApiVersion, businessDomainDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDomainsApi#getBusinessDomainsAsync");
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
| **businessDomainDtoCollectionQueryParameters** | [**BusinessDomainDtoCollectionQueryParameters**](BusinessDomainDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**BusinessDomainDtoListEnvelope**](BusinessDomainDtoListEnvelope.md)

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

<a id="getBusinessDomainsCountAsync"></a>
# **getBusinessDomainsCountAsync**
> Int32Envelope getBusinessDomainsCountAsync(tenantId, apiVersion, xApiVersion, businessDomainDtoCollectionQueryParameters)

Get business domains count

Retrieves the count of business domains for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BusinessDomainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BusinessDomainsApi apiInstance = new BusinessDomainsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    BusinessDomainDtoCollectionQueryParameters businessDomainDtoCollectionQueryParameters = new BusinessDomainDtoCollectionQueryParameters(); // BusinessDomainDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getBusinessDomainsCountAsync(tenantId, apiVersion, xApiVersion, businessDomainDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDomainsApi#getBusinessDomainsCountAsync");
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
| **businessDomainDtoCollectionQueryParameters** | [**BusinessDomainDtoCollectionQueryParameters**](BusinessDomainDtoCollectionQueryParameters.md)|  | [optional] |

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
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="updateBusinessDomainAsync"></a>
# **updateBusinessDomainAsync**
> EmptyEnvelope updateBusinessDomainAsync(tenantId, businessDomainId, businessDomainUpdateDto, apiVersion, xApiVersion)

Update a business domain

Updates a business domain. Changing the host re-issues the verification token and clears verification.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BusinessDomainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BusinessDomainsApi apiInstance = new BusinessDomainsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID businessDomainId = UUID.randomUUID(); // UUID | 
    BusinessDomainUpdateDto businessDomainUpdateDto = new BusinessDomainUpdateDto(); // BusinessDomainUpdateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.updateBusinessDomainAsync(tenantId, businessDomainId, businessDomainUpdateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDomainsApi#updateBusinessDomainAsync");
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
| **businessDomainId** | **UUID**|  | |
| **businessDomainUpdateDto** | [**BusinessDomainUpdateDto**](BusinessDomainUpdateDto.md)|  | |
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
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="verifyBusinessDomainAsync"></a>
# **verifyBusinessDomainAsync**
> EmptyEnvelope verifyBusinessDomainAsync(tenantId, businessDomainId, apiVersion, xApiVersion)

Verify a business domain

Checks the domain&#39;s DNS TXT records for the verification token and marks the domain verified.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BusinessDomainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BusinessDomainsApi apiInstance = new BusinessDomainsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID businessDomainId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.verifyBusinessDomainAsync(tenantId, businessDomainId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDomainsApi#verifyBusinessDomainAsync");
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
| **businessDomainId** | **UUID**|  | |
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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

