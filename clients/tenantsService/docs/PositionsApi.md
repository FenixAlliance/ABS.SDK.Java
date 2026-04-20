# PositionsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTenantPosition**](PositionsApi.md#createTenantPosition) | **POST** /api/v2/TenantsService/Positions | Create a new tenant position |
| [**deleteTenantPosition**](PositionsApi.md#deleteTenantPosition) | **DELETE** /api/v2/TenantsService/Positions/{tenantPositionId} | Delete a tenant position |
| [**getTenantPositionById**](PositionsApi.md#getTenantPositionById) | **GET** /api/v2/TenantsService/Positions/{tenantPositionId} | Retrieve a single tenant position by its ID |
| [**getTenantPositions**](PositionsApi.md#getTenantPositions) | **GET** /api/v2/TenantsService/Positions | Retrieve a list of tenant positions |
| [**getTenantPositionsCount**](PositionsApi.md#getTenantPositionsCount) | **GET** /api/v2/TenantsService/Positions/Count | Get the count of tenant positions |
| [**updateTenantPosition**](PositionsApi.md#updateTenantPosition) | **PUT** /api/v2/TenantsService/Positions/{tenantPositionId} | Update a tenant position |


<a id="createTenantPosition"></a>
# **createTenantPosition**
> EmptyEnvelope createTenantPosition(tenantId, apiVersion, xApiVersion, tenantPositionCreateDto)

Create a new tenant position

Create a new tenant position

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PositionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PositionsApi apiInstance = new PositionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TenantPositionCreateDto tenantPositionCreateDto = new TenantPositionCreateDto(); // TenantPositionCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createTenantPosition(tenantId, apiVersion, xApiVersion, tenantPositionCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PositionsApi#createTenantPosition");
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
| **tenantPositionCreateDto** | [**TenantPositionCreateDto**](TenantPositionCreateDto.md)|  | [optional] |

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

<a id="deleteTenantPosition"></a>
# **deleteTenantPosition**
> EmptyEnvelope deleteTenantPosition(tenantId, tenantPositionId, apiVersion, xApiVersion)

Delete a tenant position

Delete a tenant position

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PositionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PositionsApi apiInstance = new PositionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID tenantPositionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteTenantPosition(tenantId, tenantPositionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PositionsApi#deleteTenantPosition");
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
| **tenantPositionId** | **UUID**|  | |
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

<a id="getTenantPositionById"></a>
# **getTenantPositionById**
> TenantPositionDtoEnvelope getTenantPositionById(tenantId, tenantPositionId, apiVersion, xApiVersion)

Retrieve a single tenant position by its ID

Retrieve a single tenant position by its ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PositionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PositionsApi apiInstance = new PositionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID tenantPositionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TenantPositionDtoEnvelope result = apiInstance.getTenantPositionById(tenantId, tenantPositionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PositionsApi#getTenantPositionById");
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
| **tenantPositionId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**TenantPositionDtoEnvelope**](TenantPositionDtoEnvelope.md)

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

<a id="getTenantPositions"></a>
# **getTenantPositions**
> TenantPositionDtoListEnvelope getTenantPositions(tenantId, apiVersion, xApiVersion)

Retrieve a list of tenant positions

Retrieve a list of tenant positions

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PositionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PositionsApi apiInstance = new PositionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TenantPositionDtoListEnvelope result = apiInstance.getTenantPositions(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PositionsApi#getTenantPositions");
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

[**TenantPositionDtoListEnvelope**](TenantPositionDtoListEnvelope.md)

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

<a id="getTenantPositionsCount"></a>
# **getTenantPositionsCount**
> Int32Envelope getTenantPositionsCount(tenantId, apiVersion, xApiVersion)

Get the count of tenant positions

Get the count of tenant positions

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PositionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PositionsApi apiInstance = new PositionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getTenantPositionsCount(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PositionsApi#getTenantPositionsCount");
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

<a id="updateTenantPosition"></a>
# **updateTenantPosition**
> EmptyEnvelope updateTenantPosition(tenantId, tenantPositionId, apiVersion, xApiVersion, tenantPositionUpdateDto)

Update a tenant position

Update a tenant position

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PositionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PositionsApi apiInstance = new PositionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID tenantPositionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TenantPositionUpdateDto tenantPositionUpdateDto = new TenantPositionUpdateDto(); // TenantPositionUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateTenantPosition(tenantId, tenantPositionId, apiVersion, xApiVersion, tenantPositionUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PositionsApi#updateTenantPosition");
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
| **tenantPositionId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **tenantPositionUpdateDto** | [**TenantPositionUpdateDto**](TenantPositionUpdateDto.md)|  | [optional] |

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

