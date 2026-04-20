# AssetCategoriesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAssetCategory**](AssetCategoriesApi.md#createAssetCategory) | **POST** /api/v2/AssetsService/AssetCategories | Creates a new asset category |
| [**deleteAssetCategory**](AssetCategoriesApi.md#deleteAssetCategory) | **DELETE** /api/v2/AssetsService/AssetCategories/{categoryId} | Deletes an asset category |
| [**getAssetCategories**](AssetCategoriesApi.md#getAssetCategories) | **GET** /api/v2/AssetsService/AssetCategories | Gets all asset categories for the current tenant |
| [**getAssetCategoriesCount**](AssetCategoriesApi.md#getAssetCategoriesCount) | **GET** /api/v2/AssetsService/AssetCategories/count | Gets the count of asset categories |
| [**getAssetCategory**](AssetCategoriesApi.md#getAssetCategory) | **GET** /api/v2/AssetsService/AssetCategories/{categoryId} | Gets a specific asset category |
| [**updateAssetCategory**](AssetCategoriesApi.md#updateAssetCategory) | **PUT** /api/v2/AssetsService/AssetCategories/{categoryId} | Updates an existing asset category |


<a id="createAssetCategory"></a>
# **createAssetCategory**
> AssetCategoryDtoEnvelope createAssetCategory(tenantId, assetCategoryCreateDto)

Creates a new asset category

Creates a new asset category for the authenticated tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetCategoriesApi apiInstance = new AssetCategoriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    AssetCategoryCreateDto assetCategoryCreateDto = new AssetCategoryCreateDto(); // AssetCategoryCreateDto | 
    try {
      AssetCategoryDtoEnvelope result = apiInstance.createAssetCategory(tenantId, assetCategoryCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetCategoriesApi#createAssetCategory");
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
| **assetCategoryCreateDto** | [**AssetCategoryCreateDto**](AssetCategoryCreateDto.md)|  | [optional] |

### Return type

[**AssetCategoryDtoEnvelope**](AssetCategoryDtoEnvelope.md)

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

<a id="deleteAssetCategory"></a>
# **deleteAssetCategory**
> deleteAssetCategory(tenantId, categoryId)

Deletes an asset category

Deletes an asset category for the authenticated tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetCategoriesApi apiInstance = new AssetCategoriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID categoryId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteAssetCategory(tenantId, categoryId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetCategoriesApi#deleteAssetCategory");
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
| **categoryId** | **UUID**|  | |

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

<a id="getAssetCategories"></a>
# **getAssetCategories**
> AssetCategoryDtoListEnvelope getAssetCategories(tenantId)

Gets all asset categories for the current tenant

Retrieves all asset categories for the authenticated tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetCategoriesApi apiInstance = new AssetCategoriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      AssetCategoryDtoListEnvelope result = apiInstance.getAssetCategories(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetCategoriesApi#getAssetCategories");
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

[**AssetCategoryDtoListEnvelope**](AssetCategoryDtoListEnvelope.md)

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

<a id="getAssetCategoriesCount"></a>
# **getAssetCategoriesCount**
> Int32Envelope getAssetCategoriesCount(tenantId)

Gets the count of asset categories

Returns the total number of asset categories for the authenticated tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetCategoriesApi apiInstance = new AssetCategoriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.getAssetCategoriesCount(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetCategoriesApi#getAssetCategoriesCount");
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

<a id="getAssetCategory"></a>
# **getAssetCategory**
> AssetCategoryDtoEnvelope getAssetCategory(tenantId, categoryId)

Gets a specific asset category

Retrieves a specific asset category by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetCategoriesApi apiInstance = new AssetCategoriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID categoryId = UUID.randomUUID(); // UUID | 
    try {
      AssetCategoryDtoEnvelope result = apiInstance.getAssetCategory(tenantId, categoryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetCategoriesApi#getAssetCategory");
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
| **categoryId** | **UUID**|  | |

### Return type

[**AssetCategoryDtoEnvelope**](AssetCategoryDtoEnvelope.md)

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

<a id="updateAssetCategory"></a>
# **updateAssetCategory**
> EmptyEnvelope updateAssetCategory(tenantId, categoryId, assetCategoryUpdateDto)

Updates an existing asset category

Updates an existing asset category for the authenticated tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetCategoriesApi apiInstance = new AssetCategoriesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID categoryId = UUID.randomUUID(); // UUID | 
    AssetCategoryUpdateDto assetCategoryUpdateDto = new AssetCategoryUpdateDto(); // AssetCategoryUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateAssetCategory(tenantId, categoryId, assetCategoryUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetCategoriesApi#updateAssetCategory");
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
| **categoryId** | **UUID**|  | |
| **assetCategoryUpdateDto** | [**AssetCategoryUpdateDto**](AssetCategoryUpdateDto.md)|  | [optional] |

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

