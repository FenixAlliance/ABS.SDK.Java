# TypesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTenantType**](TypesApi.md#createTenantType) | **POST** /api/v2/TenantsService/Types | Create a new tenant type |
| [**deleteTenantType**](TypesApi.md#deleteTenantType) | **DELETE** /api/v2/TenantsService/Types/{tenantTypeId} | Delete a tenant type |
| [**getTenantTypeById**](TypesApi.md#getTenantTypeById) | **GET** /api/v2/TenantsService/Types/{tenantTypeId} | Retrieve a single tenant type by its ID |
| [**getTenantTypes**](TypesApi.md#getTenantTypes) | **GET** /api/v2/TenantsService/Types | Retrieve a list of tenant types |
| [**getTenantTypesCount**](TypesApi.md#getTenantTypesCount) | **GET** /api/v2/TenantsService/Types/Count | Get the count of tenant types |
| [**updateTenantType**](TypesApi.md#updateTenantType) | **PUT** /api/v2/TenantsService/Types/{tenantTypeId} | Update a tenant type |


<a id="createTenantType"></a>
# **createTenantType**
> EmptyEnvelope createTenantType(tenantId, apiVersion, xApiVersion, tenantTypeCreateDto)

Create a new tenant type

Create a new tenant type

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TypesApi apiInstance = new TypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TenantTypeCreateDto tenantTypeCreateDto = new TenantTypeCreateDto(); // TenantTypeCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createTenantType(tenantId, apiVersion, xApiVersion, tenantTypeCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TypesApi#createTenantType");
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
| **tenantTypeCreateDto** | [**TenantTypeCreateDto**](TenantTypeCreateDto.md)|  | [optional] |

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

<a id="deleteTenantType"></a>
# **deleteTenantType**
> EmptyEnvelope deleteTenantType(tenantId, tenantTypeId, apiVersion, xApiVersion)

Delete a tenant type

Delete a tenant type

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TypesApi apiInstance = new TypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID tenantTypeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteTenantType(tenantId, tenantTypeId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TypesApi#deleteTenantType");
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
| **tenantTypeId** | **UUID**|  | |
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

<a id="getTenantTypeById"></a>
# **getTenantTypeById**
> TenantTypeDtoEnvelope getTenantTypeById(tenantId, tenantTypeId, apiVersion, xApiVersion)

Retrieve a single tenant type by its ID

Retrieve a single tenant type by its ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TypesApi apiInstance = new TypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID tenantTypeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TenantTypeDtoEnvelope result = apiInstance.getTenantTypeById(tenantId, tenantTypeId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TypesApi#getTenantTypeById");
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
| **tenantTypeId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**TenantTypeDtoEnvelope**](TenantTypeDtoEnvelope.md)

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

<a id="getTenantTypes"></a>
# **getTenantTypes**
> TenantTypeDtoListEnvelope getTenantTypes(tenantId, apiVersion, xApiVersion)

Retrieve a list of tenant types

Retrieve a list of tenant types

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TypesApi apiInstance = new TypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TenantTypeDtoListEnvelope result = apiInstance.getTenantTypes(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TypesApi#getTenantTypes");
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

[**TenantTypeDtoListEnvelope**](TenantTypeDtoListEnvelope.md)

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

<a id="getTenantTypesCount"></a>
# **getTenantTypesCount**
> Int32Envelope getTenantTypesCount(tenantId, apiVersion, xApiVersion)

Get the count of tenant types

Get the count of tenant types

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TypesApi apiInstance = new TypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getTenantTypesCount(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TypesApi#getTenantTypesCount");
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

<a id="updateTenantType"></a>
# **updateTenantType**
> EmptyEnvelope updateTenantType(tenantId, tenantTypeId, apiVersion, xApiVersion, tenantTypeUpdateDto)

Update a tenant type

Update a tenant type

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TypesApi apiInstance = new TypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID tenantTypeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TenantTypeUpdateDto tenantTypeUpdateDto = new TenantTypeUpdateDto(); // TenantTypeUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateTenantType(tenantId, tenantTypeId, apiVersion, xApiVersion, tenantTypeUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TypesApi#updateTenantType");
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
| **tenantTypeId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **tenantTypeUpdateDto** | [**TenantTypeUpdateDto**](TenantTypeUpdateDto.md)|  | [optional] |

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

