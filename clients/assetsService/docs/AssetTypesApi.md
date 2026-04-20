# AssetTypesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAssetType**](AssetTypesApi.md#createAssetType) | **POST** /api/v2/AssetsService/AssetTypes | Creates a new asset type |
| [**deleteAssetType**](AssetTypesApi.md#deleteAssetType) | **DELETE** /api/v2/AssetsService/AssetTypes/{typeId} | Deletes an asset type |
| [**getAssetType**](AssetTypesApi.md#getAssetType) | **GET** /api/v2/AssetsService/AssetTypes/{typeId} | Gets a specific asset type |
| [**getAssetTypes**](AssetTypesApi.md#getAssetTypes) | **GET** /api/v2/AssetsService/AssetTypes | Gets all asset types for the current tenant |
| [**getAssetTypesCount**](AssetTypesApi.md#getAssetTypesCount) | **GET** /api/v2/AssetsService/AssetTypes/count | Gets the count of asset types |
| [**updateAssetType**](AssetTypesApi.md#updateAssetType) | **PUT** /api/v2/AssetsService/AssetTypes/{typeId} | Updates an existing asset type |


<a id="createAssetType"></a>
# **createAssetType**
> AssetTypeDtoEnvelope createAssetType(tenantId, assetTypeCreateDto)

Creates a new asset type

Creates a new asset type for the authenticated tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetTypesApi apiInstance = new AssetTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    AssetTypeCreateDto assetTypeCreateDto = new AssetTypeCreateDto(); // AssetTypeCreateDto | 
    try {
      AssetTypeDtoEnvelope result = apiInstance.createAssetType(tenantId, assetTypeCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetTypesApi#createAssetType");
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
| **assetTypeCreateDto** | [**AssetTypeCreateDto**](AssetTypeCreateDto.md)|  | [optional] |

### Return type

[**AssetTypeDtoEnvelope**](AssetTypeDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **201** | Created |  -  |

<a id="deleteAssetType"></a>
# **deleteAssetType**
> deleteAssetType(tenantId, typeId)

Deletes an asset type

Deletes an asset type for the authenticated tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetTypesApi apiInstance = new AssetTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID typeId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteAssetType(tenantId, typeId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetTypesApi#deleteAssetType");
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
| **typeId** | **UUID**|  | |

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **204** | No Content |  -  |

<a id="getAssetType"></a>
# **getAssetType**
> AssetTypeDtoEnvelope getAssetType(tenantId, typeId)

Gets a specific asset type

Retrieves a specific asset type by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetTypesApi apiInstance = new AssetTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID typeId = UUID.randomUUID(); // UUID | 
    try {
      AssetTypeDtoEnvelope result = apiInstance.getAssetType(tenantId, typeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetTypesApi#getAssetType");
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
| **typeId** | **UUID**|  | |

### Return type

[**AssetTypeDtoEnvelope**](AssetTypeDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getAssetTypes"></a>
# **getAssetTypes**
> AssetTypeDtoListEnvelope getAssetTypes(tenantId)

Gets all asset types for the current tenant

Retrieves all asset types for the authenticated tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetTypesApi apiInstance = new AssetTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      AssetTypeDtoListEnvelope result = apiInstance.getAssetTypes(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetTypesApi#getAssetTypes");
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

### Return type

[**AssetTypeDtoListEnvelope**](AssetTypeDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **200** | OK |  -  |

<a id="getAssetTypesCount"></a>
# **getAssetTypesCount**
> Int32Envelope getAssetTypesCount(tenantId)

Gets the count of asset types

Returns the total number of asset types for the authenticated tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetTypesApi apiInstance = new AssetTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.getAssetTypesCount(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetTypesApi#getAssetTypesCount");
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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **200** | OK |  -  |

<a id="updateAssetType"></a>
# **updateAssetType**
> EmptyEnvelope updateAssetType(tenantId, typeId, assetTypeUpdateDto)

Updates an existing asset type

Updates an existing asset type for the authenticated tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetTypesApi apiInstance = new AssetTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID typeId = UUID.randomUUID(); // UUID | 
    AssetTypeUpdateDto assetTypeUpdateDto = new AssetTypeUpdateDto(); // AssetTypeUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateAssetType(tenantId, typeId, assetTypeUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetTypesApi#updateAssetType");
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
| **typeId** | **UUID**|  | |
| **assetTypeUpdateDto** | [**AssetTypeUpdateDto**](AssetTypeUpdateDto.md)|  | [optional] |

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **200** | OK |  -  |

