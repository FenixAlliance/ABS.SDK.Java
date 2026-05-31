# TenantOptionsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSystemTenantOption**](TenantOptionsApi.md#createSystemTenantOption) | **POST** /api/v2/SystemService/Tenants/{tenantId}/Options | Create a new tenant option (admin) |
| [**deleteSystemTenantOption**](TenantOptionsApi.md#deleteSystemTenantOption) | **DELETE** /api/v2/SystemService/Tenants/{tenantId}/Options/{optionId} | Delete a tenant option (admin) |
| [**getSystemTenantOptionById**](TenantOptionsApi.md#getSystemTenantOptionById) | **GET** /api/v2/SystemService/Tenants/{tenantId}/Options/{optionId} | Retrieve a single tenant option by its ID (admin) |
| [**getSystemTenantOptions**](TenantOptionsApi.md#getSystemTenantOptions) | **GET** /api/v2/SystemService/Tenants/{tenantId}/Options | Retrieve a list of tenant options (admin) |
| [**getSystemTenantOptionsCount**](TenantOptionsApi.md#getSystemTenantOptionsCount) | **GET** /api/v2/SystemService/Tenants/{tenantId}/Options/Count | Get the count of tenant options (admin) |
| [**updateSystemTenantOption**](TenantOptionsApi.md#updateSystemTenantOption) | **PUT** /api/v2/SystemService/Tenants/{tenantId}/Options/{optionId} | Update a tenant option (admin) |


<a id="createSystemTenantOption"></a>
# **createSystemTenantOption**
> EmptyEnvelope createSystemTenantOption(tenantId, key, portalId, apiVersion, xApiVersion, optionCreateDto)

Create a new tenant option (admin)

Admin endpoint to create an option for any tenant

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TenantOptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TenantOptionsApi apiInstance = new TenantOptionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String key = "key_example"; // String | 
    UUID portalId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    OptionCreateDto optionCreateDto = new OptionCreateDto(); // OptionCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createSystemTenantOption(tenantId, key, portalId, apiVersion, xApiVersion, optionCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantOptionsApi#createSystemTenantOption");
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
| **key** | **String**|  | |
| **portalId** | **UUID**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **optionCreateDto** | [**OptionCreateDto**](OptionCreateDto.md)|  | [optional] |

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

<a id="deleteSystemTenantOption"></a>
# **deleteSystemTenantOption**
> EmptyEnvelope deleteSystemTenantOption(tenantId, optionId, apiVersion, xApiVersion)

Delete a tenant option (admin)

Admin endpoint to delete an option for any tenant

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TenantOptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TenantOptionsApi apiInstance = new TenantOptionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID optionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteSystemTenantOption(tenantId, optionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantOptionsApi#deleteSystemTenantOption");
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
| **optionId** | **UUID**|  | |
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

<a id="getSystemTenantOptionById"></a>
# **getSystemTenantOptionById**
> OptionDtoEnvelope getSystemTenantOptionById(tenantId, optionId, apiVersion, xApiVersion)

Retrieve a single tenant option by its ID (admin)

Admin endpoint to retrieve a single option for any tenant

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TenantOptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TenantOptionsApi apiInstance = new TenantOptionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID optionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      OptionDtoEnvelope result = apiInstance.getSystemTenantOptionById(tenantId, optionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantOptionsApi#getSystemTenantOptionById");
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
| **optionId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**OptionDtoEnvelope**](OptionDtoEnvelope.md)

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

<a id="getSystemTenantOptions"></a>
# **getSystemTenantOptions**
> OptionDtoListEnvelope getSystemTenantOptions(tenantId, portalId, apiVersion, xApiVersion)

Retrieve a list of tenant options (admin)

Admin endpoint to retrieve options for any tenant

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TenantOptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TenantOptionsApi apiInstance = new TenantOptionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID portalId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      OptionDtoListEnvelope result = apiInstance.getSystemTenantOptions(tenantId, portalId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantOptionsApi#getSystemTenantOptions");
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
| **portalId** | **UUID**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**OptionDtoListEnvelope**](OptionDtoListEnvelope.md)

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

<a id="getSystemTenantOptionsCount"></a>
# **getSystemTenantOptionsCount**
> Int32Envelope getSystemTenantOptionsCount(tenantId, portalId, apiVersion, xApiVersion)

Get the count of tenant options (admin)

Admin endpoint to get the count of options for any tenant

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TenantOptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TenantOptionsApi apiInstance = new TenantOptionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID portalId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getSystemTenantOptionsCount(tenantId, portalId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantOptionsApi#getSystemTenantOptionsCount");
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
| **portalId** | **UUID**|  | [optional] |
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

<a id="updateSystemTenantOption"></a>
# **updateSystemTenantOption**
> EmptyEnvelope updateSystemTenantOption(tenantId, optionId, apiVersion, xApiVersion, optionUpdateDto)

Update a tenant option (admin)

Admin endpoint to update an option for any tenant

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TenantOptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TenantOptionsApi apiInstance = new TenantOptionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID optionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    OptionUpdateDto optionUpdateDto = new OptionUpdateDto(); // OptionUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateSystemTenantOption(tenantId, optionId, apiVersion, xApiVersion, optionUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantOptionsApi#updateSystemTenantOption");
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
| **optionId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **optionUpdateDto** | [**OptionUpdateDto**](OptionUpdateDto.md)|  | [optional] |

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

