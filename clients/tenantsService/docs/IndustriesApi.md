# IndustriesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTenantIndustry**](IndustriesApi.md#createTenantIndustry) | **POST** /api/v2/TenantsService/Industries | Create a new tenant industry |
| [**deleteTenantIndustry**](IndustriesApi.md#deleteTenantIndustry) | **DELETE** /api/v2/TenantsService/Industries/{tenantIndustryId} | Delete a tenant industry |
| [**getTenantIndustries**](IndustriesApi.md#getTenantIndustries) | **GET** /api/v2/TenantsService/Industries | Retrieve a list of tenant industries |
| [**getTenantIndustriesCount**](IndustriesApi.md#getTenantIndustriesCount) | **GET** /api/v2/TenantsService/Industries/Count | Get the count of tenant industries |
| [**getTenantIndustryById**](IndustriesApi.md#getTenantIndustryById) | **GET** /api/v2/TenantsService/Industries/{tenantIndustryId} | Retrieve a single tenant industry by its ID |
| [**updateTenantIndustry**](IndustriesApi.md#updateTenantIndustry) | **PUT** /api/v2/TenantsService/Industries/{tenantIndustryId} | Update a tenant industry |


<a id="createTenantIndustry"></a>
# **createTenantIndustry**
> EmptyEnvelope createTenantIndustry(tenantId, apiVersion, xApiVersion, tenantIndustryCreateDto)

Create a new tenant industry

Create a new tenant industry

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IndustriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    IndustriesApi apiInstance = new IndustriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TenantIndustryCreateDto tenantIndustryCreateDto = new TenantIndustryCreateDto(); // TenantIndustryCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createTenantIndustry(tenantId, apiVersion, xApiVersion, tenantIndustryCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IndustriesApi#createTenantIndustry");
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
| **tenantIndustryCreateDto** | [**TenantIndustryCreateDto**](TenantIndustryCreateDto.md)|  | [optional] |

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

<a id="deleteTenantIndustry"></a>
# **deleteTenantIndustry**
> EmptyEnvelope deleteTenantIndustry(tenantId, tenantIndustryId, apiVersion, xApiVersion)

Delete a tenant industry

Delete a tenant industry

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IndustriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    IndustriesApi apiInstance = new IndustriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID tenantIndustryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteTenantIndustry(tenantId, tenantIndustryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IndustriesApi#deleteTenantIndustry");
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
| **tenantIndustryId** | **UUID**|  | |
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

<a id="getTenantIndustries"></a>
# **getTenantIndustries**
> TenantIndustryDtoListEnvelope getTenantIndustries(tenantId, apiVersion, xApiVersion)

Retrieve a list of tenant industries

Retrieve a list of tenant industries

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IndustriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    IndustriesApi apiInstance = new IndustriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TenantIndustryDtoListEnvelope result = apiInstance.getTenantIndustries(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IndustriesApi#getTenantIndustries");
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

[**TenantIndustryDtoListEnvelope**](TenantIndustryDtoListEnvelope.md)

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

<a id="getTenantIndustriesCount"></a>
# **getTenantIndustriesCount**
> Int32Envelope getTenantIndustriesCount(tenantId, apiVersion, xApiVersion)

Get the count of tenant industries

Get the count of tenant industries

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IndustriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    IndustriesApi apiInstance = new IndustriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getTenantIndustriesCount(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IndustriesApi#getTenantIndustriesCount");
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
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getTenantIndustryById"></a>
# **getTenantIndustryById**
> TenantIndustryDtoEnvelope getTenantIndustryById(tenantId, tenantIndustryId, apiVersion, xApiVersion)

Retrieve a single tenant industry by its ID

Retrieve a single tenant industry by its ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IndustriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    IndustriesApi apiInstance = new IndustriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID tenantIndustryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TenantIndustryDtoEnvelope result = apiInstance.getTenantIndustryById(tenantId, tenantIndustryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IndustriesApi#getTenantIndustryById");
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
| **tenantIndustryId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**TenantIndustryDtoEnvelope**](TenantIndustryDtoEnvelope.md)

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

<a id="updateTenantIndustry"></a>
# **updateTenantIndustry**
> EmptyEnvelope updateTenantIndustry(tenantId, tenantIndustryId, apiVersion, xApiVersion, tenantIndustryUpdateDto)

Update a tenant industry

Update a tenant industry

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IndustriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    IndustriesApi apiInstance = new IndustriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID tenantIndustryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TenantIndustryUpdateDto tenantIndustryUpdateDto = new TenantIndustryUpdateDto(); // TenantIndustryUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateTenantIndustry(tenantId, tenantIndustryId, apiVersion, xApiVersion, tenantIndustryUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IndustriesApi#updateTenantIndustry");
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
| **tenantIndustryId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **tenantIndustryUpdateDto** | [**TenantIndustryUpdateDto**](TenantIndustryUpdateDto.md)|  | [optional] |

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

