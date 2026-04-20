# TerritoriesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTenantTerritory**](TerritoriesApi.md#createTenantTerritory) | **POST** /api/v2/TenantsService/Territories | Create a new tenant territory |
| [**deleteTenantTerritory**](TerritoriesApi.md#deleteTenantTerritory) | **DELETE** /api/v2/TenantsService/Territories/{tenantTerritoryId} | Delete a tenant territory |
| [**getTenantTerritories**](TerritoriesApi.md#getTenantTerritories) | **GET** /api/v2/TenantsService/Territories | Retrieve a list of tenant territories |
| [**getTenantTerritoriesCount**](TerritoriesApi.md#getTenantTerritoriesCount) | **GET** /api/v2/TenantsService/Territories/Count | Get the count of tenant territories |
| [**getTenantTerritoryById**](TerritoriesApi.md#getTenantTerritoryById) | **GET** /api/v2/TenantsService/Territories/{tenantTerritoryId} | Retrieve a single tenant territory by its ID |
| [**updateTenantTerritory**](TerritoriesApi.md#updateTenantTerritory) | **PUT** /api/v2/TenantsService/Territories/{tenantTerritoryId} | Update a tenant territory |


<a id="createTenantTerritory"></a>
# **createTenantTerritory**
> EmptyEnvelope createTenantTerritory(tenantId, apiVersion, xApiVersion, tenantTerritoryCreateDto)

Create a new tenant territory

Create a new tenant territory

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TerritoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TerritoriesApi apiInstance = new TerritoriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TenantTerritoryCreateDto tenantTerritoryCreateDto = new TenantTerritoryCreateDto(); // TenantTerritoryCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createTenantTerritory(tenantId, apiVersion, xApiVersion, tenantTerritoryCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TerritoriesApi#createTenantTerritory");
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
| **tenantTerritoryCreateDto** | [**TenantTerritoryCreateDto**](TenantTerritoryCreateDto.md)|  | [optional] |

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

<a id="deleteTenantTerritory"></a>
# **deleteTenantTerritory**
> EmptyEnvelope deleteTenantTerritory(tenantId, tenantTerritoryId, apiVersion, xApiVersion)

Delete a tenant territory

Delete a tenant territory

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TerritoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TerritoriesApi apiInstance = new TerritoriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID tenantTerritoryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteTenantTerritory(tenantId, tenantTerritoryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TerritoriesApi#deleteTenantTerritory");
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
| **tenantTerritoryId** | **UUID**|  | |
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

<a id="getTenantTerritories"></a>
# **getTenantTerritories**
> TenantTerritoryDtoListEnvelope getTenantTerritories(tenantId, apiVersion, xApiVersion)

Retrieve a list of tenant territories

Retrieve a list of tenant territories

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TerritoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TerritoriesApi apiInstance = new TerritoriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TenantTerritoryDtoListEnvelope result = apiInstance.getTenantTerritories(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TerritoriesApi#getTenantTerritories");
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

[**TenantTerritoryDtoListEnvelope**](TenantTerritoryDtoListEnvelope.md)

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

<a id="getTenantTerritoriesCount"></a>
# **getTenantTerritoriesCount**
> Int32Envelope getTenantTerritoriesCount(tenantId, apiVersion, xApiVersion)

Get the count of tenant territories

Get the count of tenant territories

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TerritoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TerritoriesApi apiInstance = new TerritoriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getTenantTerritoriesCount(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TerritoriesApi#getTenantTerritoriesCount");
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

<a id="getTenantTerritoryById"></a>
# **getTenantTerritoryById**
> TenantTerritoryDtoEnvelope getTenantTerritoryById(tenantId, tenantTerritoryId, apiVersion, xApiVersion)

Retrieve a single tenant territory by its ID

Retrieve a single tenant territory by its ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TerritoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TerritoriesApi apiInstance = new TerritoriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID tenantTerritoryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TenantTerritoryDtoEnvelope result = apiInstance.getTenantTerritoryById(tenantId, tenantTerritoryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TerritoriesApi#getTenantTerritoryById");
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
| **tenantTerritoryId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**TenantTerritoryDtoEnvelope**](TenantTerritoryDtoEnvelope.md)

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

<a id="updateTenantTerritory"></a>
# **updateTenantTerritory**
> EmptyEnvelope updateTenantTerritory(tenantId, tenantTerritoryId, apiVersion, xApiVersion, tenantTerritoryUpdateDto)

Update a tenant territory

Update a tenant territory

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TerritoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TerritoriesApi apiInstance = new TerritoriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID tenantTerritoryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TenantTerritoryUpdateDto tenantTerritoryUpdateDto = new TenantTerritoryUpdateDto(); // TenantTerritoryUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateTenantTerritory(tenantId, tenantTerritoryId, apiVersion, xApiVersion, tenantTerritoryUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TerritoriesApi#updateTenantTerritory");
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
| **tenantTerritoryId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **tenantTerritoryUpdateDto** | [**TenantTerritoryUpdateDto**](TenantTerritoryUpdateDto.md)|  | [optional] |

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

