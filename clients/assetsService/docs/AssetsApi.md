# AssetsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAsset**](AssetsApi.md#createAsset) | **POST** /api/v2/AssetsService/Assets | Creates a new asset |
| [**createAssetAssetCategory**](AssetsApi.md#createAssetAssetCategory) | **POST** /api/v2/AssetsService/Assets/Categories | Creates a new asset category |
| [**createAssetDepreciationRecord**](AssetsApi.md#createAssetDepreciationRecord) | **POST** /api/v2/AssetsService/Assets/{assetId}/DepreciationRecords | Creates a new depreciation record for an asset |
| [**createAssetRepair**](AssetsApi.md#createAssetRepair) | **POST** /api/v2/AssetsService/Assets/{assetId}/Repairs | Creates a new repair for an asset |
| [**createAssetTransfer**](AssetsApi.md#createAssetTransfer) | **POST** /api/v2/AssetsService/Assets/{assetId}/Transfers | Creates a new transfer for an asset |
| [**createAssetValueAmend**](AssetsApi.md#createAssetValueAmend) | **POST** /api/v2/AssetsService/Assets/{assetId}/ValueAmends | Creates a new value amendment for an asset |
| [**deleteAsset**](AssetsApi.md#deleteAsset) | **DELETE** /api/v2/AssetsService/Assets/{assetId} | Deletes an existing asset |
| [**deleteAssetAssetCategory**](AssetsApi.md#deleteAssetAssetCategory) | **DELETE** /api/v2/AssetsService/Assets/Categories/{categoryId} | Deletes an existing asset category |
| [**deleteAssetDepreciationRecord**](AssetsApi.md#deleteAssetDepreciationRecord) | **DELETE** /api/v2/AssetsService/Assets/{assetId}/DepreciationRecords/{recordId} | Deletes a depreciation record for an asset |
| [**deleteAssetRepair**](AssetsApi.md#deleteAssetRepair) | **DELETE** /api/v2/AssetsService/Assets/{assetId}/Repairs/{repairId} | Deletes a repair for an asset |
| [**deleteAssetTransfer**](AssetsApi.md#deleteAssetTransfer) | **DELETE** /api/v2/AssetsService/Assets/{assetId}/Transfers/{transferId} | Deletes a transfer for an asset |
| [**deleteAssetValueAmend**](AssetsApi.md#deleteAssetValueAmend) | **DELETE** /api/v2/AssetsService/Assets/{assetId}/ValueAmends/{amendId} | Deletes a value amendment for an asset |
| [**getAsset**](AssetsApi.md#getAsset) | **GET** /api/v2/AssetsService/Assets/{assetId} | Gets a specific asset by ID |
| [**getAssetAssetCategories**](AssetsApi.md#getAssetAssetCategories) | **GET** /api/v2/AssetsService/Assets/Categories | Gets all asset categories |
| [**getAssetAssetCategoriesCount**](AssetsApi.md#getAssetAssetCategoriesCount) | **GET** /api/v2/AssetsService/Assets/Categories/count | Gets the count of asset categories |
| [**getAssetAssetCategory**](AssetsApi.md#getAssetAssetCategory) | **GET** /api/v2/AssetsService/Assets/Categories/{categoryId} | Gets a specific asset category |
| [**getAssetDepreciationRecord**](AssetsApi.md#getAssetDepreciationRecord) | **GET** /api/v2/AssetsService/Assets/{assetId}/DepreciationRecords/{recordId} | Gets a specific depreciation record for an asset |
| [**getAssetDepreciationRecords**](AssetsApi.md#getAssetDepreciationRecords) | **GET** /api/v2/AssetsService/Assets/{assetId}/DepreciationRecords | Gets depreciation records for a specific asset |
| [**getAssetDepreciationRecordsCount**](AssetsApi.md#getAssetDepreciationRecordsCount) | **GET** /api/v2/AssetsService/Assets/{assetId}/DepreciationRecords/Count | Gets count of depreciation records for a specific asset |
| [**getAssetRepair**](AssetsApi.md#getAssetRepair) | **GET** /api/v2/AssetsService/Assets/{assetId}/Repairs/{repairId} | Gets a specific repair for an asset |
| [**getAssetRepairs**](AssetsApi.md#getAssetRepairs) | **GET** /api/v2/AssetsService/Assets/{assetId}/Repairs | Gets repairs for a specific asset |
| [**getAssetRepairsCount**](AssetsApi.md#getAssetRepairsCount) | **GET** /api/v2/AssetsService/Assets/{assetId}/Repairs/Count | Gets count of repairs for a specific asset |
| [**getAssetTransfer**](AssetsApi.md#getAssetTransfer) | **GET** /api/v2/AssetsService/Assets/{assetId}/Transfers/{transferId} | Gets a specific transfer for an asset |
| [**getAssetTransfers**](AssetsApi.md#getAssetTransfers) | **GET** /api/v2/AssetsService/Assets/{assetId}/Transfers | Gets transfers for a specific asset |
| [**getAssetTransfersCount**](AssetsApi.md#getAssetTransfersCount) | **GET** /api/v2/AssetsService/Assets/{assetId}/Transfers/Count | Gets count of transfers for a specific asset |
| [**getAssetValueAmend**](AssetsApi.md#getAssetValueAmend) | **GET** /api/v2/AssetsService/Assets/{assetId}/ValueAmends/{amendId} | Gets a specific value amendment for an asset |
| [**getAssetValueAmends**](AssetsApi.md#getAssetValueAmends) | **GET** /api/v2/AssetsService/Assets/{assetId}/ValueAmends | Gets value amendments for a specific asset |
| [**getAssetValueAmendsCount**](AssetsApi.md#getAssetValueAmendsCount) | **GET** /api/v2/AssetsService/Assets/{assetId}/ValueAmends/Count | Gets count of value amendments for a specific asset |
| [**getAssets**](AssetsApi.md#getAssets) | **GET** /api/v2/AssetsService/Assets | Gets all assets for the current tenant |
| [**getAssetsCount**](AssetsApi.md#getAssetsCount) | **GET** /api/v2/AssetsService/Assets/count | Gets the count of assets |
| [**updateAsset**](AssetsApi.md#updateAsset) | **PUT** /api/v2/AssetsService/Assets/{assetId} | Updates an existing asset |
| [**updateAssetAssetCategory**](AssetsApi.md#updateAssetAssetCategory) | **PUT** /api/v2/AssetsService/Assets/Categories/{categoryId} | Updates an existing asset category |
| [**updateAssetDepreciationRecord**](AssetsApi.md#updateAssetDepreciationRecord) | **PUT** /api/v2/AssetsService/Assets/{assetId}/DepreciationRecords/{recordId} | Updates a depreciation record for an asset |
| [**updateAssetRepair**](AssetsApi.md#updateAssetRepair) | **PUT** /api/v2/AssetsService/Assets/{assetId}/Repairs/{repairId} | Updates a repair for an asset |
| [**updateAssetTransfer**](AssetsApi.md#updateAssetTransfer) | **PUT** /api/v2/AssetsService/Assets/{assetId}/Transfers/{transferId} | Updates a transfer for an asset |
| [**updateAssetValueAmend**](AssetsApi.md#updateAssetValueAmend) | **PUT** /api/v2/AssetsService/Assets/{assetId}/ValueAmends/{amendId} | Updates a value amendment for an asset |


<a id="createAsset"></a>
# **createAsset**
> AssetDtoEnvelope createAsset(tenantId, assetCreateDto)

Creates a new asset

Creates a new asset for the authenticated tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    AssetCreateDto assetCreateDto = new AssetCreateDto(); // AssetCreateDto | 
    try {
      AssetDtoEnvelope result = apiInstance.createAsset(tenantId, assetCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#createAsset");
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
| **assetCreateDto** | [**AssetCreateDto**](AssetCreateDto.md)|  | [optional] |

### Return type

[**AssetDtoEnvelope**](AssetDtoEnvelope.md)

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

<a id="createAssetAssetCategory"></a>
# **createAssetAssetCategory**
> AssetCategoryDtoEnvelope createAssetAssetCategory(tenantId, assetCategoryCreateDto)

Creates a new asset category

Creates a new asset category for the authenticated tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    AssetCategoryCreateDto assetCategoryCreateDto = new AssetCategoryCreateDto(); // AssetCategoryCreateDto | 
    try {
      AssetCategoryDtoEnvelope result = apiInstance.createAssetAssetCategory(tenantId, assetCategoryCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#createAssetAssetCategory");
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
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **400** | Bad Request |  -  |
| **201** | Created |  -  |

<a id="createAssetDepreciationRecord"></a>
# **createAssetDepreciationRecord**
> EmptyEnvelope createAssetDepreciationRecord(tenantId, assetId, assetDepreciationRecordCreateDto)

Creates a new depreciation record for an asset

Creates a new depreciation record for the specified asset.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID assetId = UUID.randomUUID(); // UUID | 
    AssetDepreciationRecordCreateDto assetDepreciationRecordCreateDto = new AssetDepreciationRecordCreateDto(); // AssetDepreciationRecordCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createAssetDepreciationRecord(tenantId, assetId, assetDepreciationRecordCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#createAssetDepreciationRecord");
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
| **assetId** | **UUID**|  | |
| **assetDepreciationRecordCreateDto** | [**AssetDepreciationRecordCreateDto**](AssetDepreciationRecordCreateDto.md)|  | [optional] |

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

<a id="createAssetRepair"></a>
# **createAssetRepair**
> EmptyEnvelope createAssetRepair(tenantId, assetId, assetRepairCreateDto)

Creates a new repair for an asset

Creates a new repair record for the specified asset.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID assetId = UUID.randomUUID(); // UUID | 
    AssetRepairCreateDto assetRepairCreateDto = new AssetRepairCreateDto(); // AssetRepairCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createAssetRepair(tenantId, assetId, assetRepairCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#createAssetRepair");
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
| **assetId** | **UUID**|  | |
| **assetRepairCreateDto** | [**AssetRepairCreateDto**](AssetRepairCreateDto.md)|  | [optional] |

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

<a id="createAssetTransfer"></a>
# **createAssetTransfer**
> EmptyEnvelope createAssetTransfer(tenantId, assetId, assetTransferCreateDto)

Creates a new transfer for an asset

Creates a new transfer record for the specified asset.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID assetId = UUID.randomUUID(); // UUID | 
    AssetTransferCreateDto assetTransferCreateDto = new AssetTransferCreateDto(); // AssetTransferCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createAssetTransfer(tenantId, assetId, assetTransferCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#createAssetTransfer");
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
| **assetId** | **UUID**|  | |
| **assetTransferCreateDto** | [**AssetTransferCreateDto**](AssetTransferCreateDto.md)|  | [optional] |

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

<a id="createAssetValueAmend"></a>
# **createAssetValueAmend**
> EmptyEnvelope createAssetValueAmend(tenantId, assetId, assetValueAmendCreateDto)

Creates a new value amendment for an asset

Creates a new value amendment record for the specified asset.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID assetId = UUID.randomUUID(); // UUID | 
    AssetValueAmendCreateDto assetValueAmendCreateDto = new AssetValueAmendCreateDto(); // AssetValueAmendCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createAssetValueAmend(tenantId, assetId, assetValueAmendCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#createAssetValueAmend");
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
| **assetId** | **UUID**|  | |
| **assetValueAmendCreateDto** | [**AssetValueAmendCreateDto**](AssetValueAmendCreateDto.md)|  | [optional] |

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

<a id="deleteAsset"></a>
# **deleteAsset**
> deleteAsset(tenantId, assetId)

Deletes an existing asset

Deletes an existing asset for the authenticated tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID assetId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteAsset(tenantId, assetId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#deleteAsset");
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
| **assetId** | **UUID**|  | |

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
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |
| **204** | No Content |  -  |

<a id="deleteAssetAssetCategory"></a>
# **deleteAssetAssetCategory**
> deleteAssetAssetCategory(tenantId, categoryId)

Deletes an existing asset category

Deletes an existing asset category for the authenticated tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID categoryId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteAssetAssetCategory(tenantId, categoryId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#deleteAssetAssetCategory");
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
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |
| **204** | No Content |  -  |

<a id="deleteAssetDepreciationRecord"></a>
# **deleteAssetDepreciationRecord**
> EmptyEnvelope deleteAssetDepreciationRecord(tenantId, assetId, recordId)

Deletes a depreciation record for an asset

Deletes a depreciation record for the specified asset.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID assetId = UUID.randomUUID(); // UUID | 
    UUID recordId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.deleteAssetDepreciationRecord(tenantId, assetId, recordId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#deleteAssetDepreciationRecord");
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
| **assetId** | **UUID**|  | |
| **recordId** | **UUID**|  | |

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

<a id="deleteAssetRepair"></a>
# **deleteAssetRepair**
> EmptyEnvelope deleteAssetRepair(tenantId, assetId, repairId)

Deletes a repair for an asset

Deletes a repair record for the specified asset.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID assetId = UUID.randomUUID(); // UUID | 
    UUID repairId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.deleteAssetRepair(tenantId, assetId, repairId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#deleteAssetRepair");
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
| **assetId** | **UUID**|  | |
| **repairId** | **UUID**|  | |

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

<a id="deleteAssetTransfer"></a>
# **deleteAssetTransfer**
> EmptyEnvelope deleteAssetTransfer(tenantId, assetId, transferId)

Deletes a transfer for an asset

Deletes a transfer record for the specified asset.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID assetId = UUID.randomUUID(); // UUID | 
    UUID transferId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.deleteAssetTransfer(tenantId, assetId, transferId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#deleteAssetTransfer");
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
| **assetId** | **UUID**|  | |
| **transferId** | **UUID**|  | |

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

<a id="deleteAssetValueAmend"></a>
# **deleteAssetValueAmend**
> EmptyEnvelope deleteAssetValueAmend(tenantId, assetId, amendId)

Deletes a value amendment for an asset

Deletes a value amendment record for the specified asset.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID assetId = UUID.randomUUID(); // UUID | 
    UUID amendId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.deleteAssetValueAmend(tenantId, assetId, amendId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#deleteAssetValueAmend");
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
| **assetId** | **UUID**|  | |
| **amendId** | **UUID**|  | |

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

<a id="getAsset"></a>
# **getAsset**
> AssetDtoEnvelope getAsset(tenantId, assetId)

Gets a specific asset by ID

Retrieves a specific asset for the authenticated tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID assetId = UUID.randomUUID(); // UUID | 
    try {
      AssetDtoEnvelope result = apiInstance.getAsset(tenantId, assetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#getAsset");
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
| **assetId** | **UUID**|  | |

### Return type

[**AssetDtoEnvelope**](AssetDtoEnvelope.md)

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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getAssetAssetCategories"></a>
# **getAssetAssetCategories**
> AssetCategoryDtoListEnvelope getAssetAssetCategories(tenantId)

Gets all asset categories

Retrieves all asset categories for the authenticated tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      AssetCategoryDtoListEnvelope result = apiInstance.getAssetAssetCategories(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#getAssetAssetCategories");
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

<a id="getAssetAssetCategoriesCount"></a>
# **getAssetAssetCategoriesCount**
> Int32Envelope getAssetAssetCategoriesCount(tenantId)

Gets the count of asset categories

Returns the total number of asset categories for the authenticated tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.getAssetAssetCategoriesCount(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#getAssetAssetCategoriesCount");
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

<a id="getAssetAssetCategory"></a>
# **getAssetAssetCategory**
> AssetCategoryDtoEnvelope getAssetAssetCategory(tenantId, categoryId)

Gets a specific asset category

Retrieves a specific asset category for the authenticated tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID categoryId = UUID.randomUUID(); // UUID | 
    try {
      AssetCategoryDtoEnvelope result = apiInstance.getAssetAssetCategory(tenantId, categoryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#getAssetAssetCategory");
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
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getAssetDepreciationRecord"></a>
# **getAssetDepreciationRecord**
> AssetDepreciationRecordDtoEnvelope getAssetDepreciationRecord(tenantId, assetId, recordId)

Gets a specific depreciation record for an asset

Retrieves a specific depreciation record by ID for the specified asset.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID assetId = UUID.randomUUID(); // UUID | 
    UUID recordId = UUID.randomUUID(); // UUID | 
    try {
      AssetDepreciationRecordDtoEnvelope result = apiInstance.getAssetDepreciationRecord(tenantId, assetId, recordId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#getAssetDepreciationRecord");
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
| **assetId** | **UUID**|  | |
| **recordId** | **UUID**|  | |

### Return type

[**AssetDepreciationRecordDtoEnvelope**](AssetDepreciationRecordDtoEnvelope.md)

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

<a id="getAssetDepreciationRecords"></a>
# **getAssetDepreciationRecords**
> AssetDepreciationRecordDtoListEnvelope getAssetDepreciationRecords(tenantId, assetId)

Gets depreciation records for a specific asset

Retrieves all depreciation records for the specified asset.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID assetId = UUID.randomUUID(); // UUID | 
    try {
      AssetDepreciationRecordDtoListEnvelope result = apiInstance.getAssetDepreciationRecords(tenantId, assetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#getAssetDepreciationRecords");
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
| **assetId** | **UUID**|  | |

### Return type

[**AssetDepreciationRecordDtoListEnvelope**](AssetDepreciationRecordDtoListEnvelope.md)

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

<a id="getAssetDepreciationRecordsCount"></a>
# **getAssetDepreciationRecordsCount**
> Int32Envelope getAssetDepreciationRecordsCount(tenantId, assetId)

Gets count of depreciation records for a specific asset

Returns the total number of depreciation records for the specified asset.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID assetId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.getAssetDepreciationRecordsCount(tenantId, assetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#getAssetDepreciationRecordsCount");
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
| **assetId** | **UUID**|  | |

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

<a id="getAssetRepair"></a>
# **getAssetRepair**
> AssetRepairDtoEnvelope getAssetRepair(tenantId, assetId, repairId)

Gets a specific repair for an asset

Retrieves a specific repair record by ID for the specified asset.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID assetId = UUID.randomUUID(); // UUID | 
    UUID repairId = UUID.randomUUID(); // UUID | 
    try {
      AssetRepairDtoEnvelope result = apiInstance.getAssetRepair(tenantId, assetId, repairId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#getAssetRepair");
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
| **assetId** | **UUID**|  | |
| **repairId** | **UUID**|  | |

### Return type

[**AssetRepairDtoEnvelope**](AssetRepairDtoEnvelope.md)

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

<a id="getAssetRepairs"></a>
# **getAssetRepairs**
> AssetRepairDtoListEnvelope getAssetRepairs(tenantId, assetId)

Gets repairs for a specific asset

Retrieves all repair records for the specified asset.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID assetId = UUID.randomUUID(); // UUID | 
    try {
      AssetRepairDtoListEnvelope result = apiInstance.getAssetRepairs(tenantId, assetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#getAssetRepairs");
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
| **assetId** | **UUID**|  | |

### Return type

[**AssetRepairDtoListEnvelope**](AssetRepairDtoListEnvelope.md)

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

<a id="getAssetRepairsCount"></a>
# **getAssetRepairsCount**
> Int32Envelope getAssetRepairsCount(tenantId, assetId)

Gets count of repairs for a specific asset

Returns the total number of repair records for the specified asset.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID assetId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.getAssetRepairsCount(tenantId, assetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#getAssetRepairsCount");
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
| **assetId** | **UUID**|  | |

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

<a id="getAssetTransfer"></a>
# **getAssetTransfer**
> AssetTransferDtoEnvelope getAssetTransfer(tenantId, assetId, transferId)

Gets a specific transfer for an asset

Retrieves a specific transfer record by ID for the specified asset.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID assetId = UUID.randomUUID(); // UUID | 
    UUID transferId = UUID.randomUUID(); // UUID | 
    try {
      AssetTransferDtoEnvelope result = apiInstance.getAssetTransfer(tenantId, assetId, transferId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#getAssetTransfer");
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
| **assetId** | **UUID**|  | |
| **transferId** | **UUID**|  | |

### Return type

[**AssetTransferDtoEnvelope**](AssetTransferDtoEnvelope.md)

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

<a id="getAssetTransfers"></a>
# **getAssetTransfers**
> AssetTransferDtoListEnvelope getAssetTransfers(tenantId, assetId)

Gets transfers for a specific asset

Retrieves all transfer records for the specified asset.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID assetId = UUID.randomUUID(); // UUID | 
    try {
      AssetTransferDtoListEnvelope result = apiInstance.getAssetTransfers(tenantId, assetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#getAssetTransfers");
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
| **assetId** | **UUID**|  | |

### Return type

[**AssetTransferDtoListEnvelope**](AssetTransferDtoListEnvelope.md)

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

<a id="getAssetTransfersCount"></a>
# **getAssetTransfersCount**
> Int32Envelope getAssetTransfersCount(tenantId, assetId)

Gets count of transfers for a specific asset

Returns the total number of transfer records for the specified asset.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID assetId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.getAssetTransfersCount(tenantId, assetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#getAssetTransfersCount");
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
| **assetId** | **UUID**|  | |

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

<a id="getAssetValueAmend"></a>
# **getAssetValueAmend**
> AssetValueAmendDtoEnvelope getAssetValueAmend(tenantId, assetId, amendId)

Gets a specific value amendment for an asset

Retrieves a specific value amendment record by ID for the specified asset.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID assetId = UUID.randomUUID(); // UUID | 
    UUID amendId = UUID.randomUUID(); // UUID | 
    try {
      AssetValueAmendDtoEnvelope result = apiInstance.getAssetValueAmend(tenantId, assetId, amendId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#getAssetValueAmend");
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
| **assetId** | **UUID**|  | |
| **amendId** | **UUID**|  | |

### Return type

[**AssetValueAmendDtoEnvelope**](AssetValueAmendDtoEnvelope.md)

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

<a id="getAssetValueAmends"></a>
# **getAssetValueAmends**
> AssetValueAmendDtoListEnvelope getAssetValueAmends(tenantId, assetId)

Gets value amendments for a specific asset

Retrieves all value amendment records for the specified asset.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID assetId = UUID.randomUUID(); // UUID | 
    try {
      AssetValueAmendDtoListEnvelope result = apiInstance.getAssetValueAmends(tenantId, assetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#getAssetValueAmends");
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
| **assetId** | **UUID**|  | |

### Return type

[**AssetValueAmendDtoListEnvelope**](AssetValueAmendDtoListEnvelope.md)

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

<a id="getAssetValueAmendsCount"></a>
# **getAssetValueAmendsCount**
> Int32Envelope getAssetValueAmendsCount(tenantId, assetId)

Gets count of value amendments for a specific asset

Returns the total number of value amendment records for the specified asset.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID assetId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.getAssetValueAmendsCount(tenantId, assetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#getAssetValueAmendsCount");
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
| **assetId** | **UUID**|  | |

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

<a id="getAssets"></a>
# **getAssets**
> AssetDtoListEnvelope getAssets(tenantId)

Gets all assets for the current tenant

Retrieves all assets for the authenticated tenant with optional filtering.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      AssetDtoListEnvelope result = apiInstance.getAssets(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#getAssets");
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

[**AssetDtoListEnvelope**](AssetDtoListEnvelope.md)

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

<a id="getAssetsCount"></a>
# **getAssetsCount**
> Int32Envelope getAssetsCount(tenantId)

Gets the count of assets

Returns the total number of assets for the authenticated tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.getAssetsCount(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#getAssetsCount");
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

<a id="updateAsset"></a>
# **updateAsset**
> AssetDtoEnvelope updateAsset(tenantId, assetId, assetUpdateDto)

Updates an existing asset

Updates an existing asset for the authenticated tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID assetId = UUID.randomUUID(); // UUID | 
    AssetUpdateDto assetUpdateDto = new AssetUpdateDto(); // AssetUpdateDto | 
    try {
      AssetDtoEnvelope result = apiInstance.updateAsset(tenantId, assetId, assetUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#updateAsset");
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
| **assetId** | **UUID**|  | |
| **assetUpdateDto** | [**AssetUpdateDto**](AssetUpdateDto.md)|  | [optional] |

### Return type

[**AssetDtoEnvelope**](AssetDtoEnvelope.md)

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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="updateAssetAssetCategory"></a>
# **updateAssetAssetCategory**
> AssetCategoryDtoEnvelope updateAssetAssetCategory(tenantId, categoryId, assetCategoryUpdateDto)

Updates an existing asset category

Updates an existing asset category for the authenticated tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID categoryId = UUID.randomUUID(); // UUID | 
    AssetCategoryUpdateDto assetCategoryUpdateDto = new AssetCategoryUpdateDto(); // AssetCategoryUpdateDto | 
    try {
      AssetCategoryDtoEnvelope result = apiInstance.updateAssetAssetCategory(tenantId, categoryId, assetCategoryUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#updateAssetAssetCategory");
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

[**AssetCategoryDtoEnvelope**](AssetCategoryDtoEnvelope.md)

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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="updateAssetDepreciationRecord"></a>
# **updateAssetDepreciationRecord**
> EmptyEnvelope updateAssetDepreciationRecord(tenantId, assetId, recordId, assetDepreciationRecordUpdateDto)

Updates a depreciation record for an asset

Updates an existing depreciation record for the specified asset.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID assetId = UUID.randomUUID(); // UUID | 
    UUID recordId = UUID.randomUUID(); // UUID | 
    AssetDepreciationRecordUpdateDto assetDepreciationRecordUpdateDto = new AssetDepreciationRecordUpdateDto(); // AssetDepreciationRecordUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateAssetDepreciationRecord(tenantId, assetId, recordId, assetDepreciationRecordUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#updateAssetDepreciationRecord");
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
| **assetId** | **UUID**|  | |
| **recordId** | **UUID**|  | |
| **assetDepreciationRecordUpdateDto** | [**AssetDepreciationRecordUpdateDto**](AssetDepreciationRecordUpdateDto.md)|  | [optional] |

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

<a id="updateAssetRepair"></a>
# **updateAssetRepair**
> EmptyEnvelope updateAssetRepair(tenantId, assetId, repairId, assetRepairUpdateDto)

Updates a repair for an asset

Updates an existing repair record for the specified asset.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID assetId = UUID.randomUUID(); // UUID | 
    UUID repairId = UUID.randomUUID(); // UUID | 
    AssetRepairUpdateDto assetRepairUpdateDto = new AssetRepairUpdateDto(); // AssetRepairUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateAssetRepair(tenantId, assetId, repairId, assetRepairUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#updateAssetRepair");
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
| **assetId** | **UUID**|  | |
| **repairId** | **UUID**|  | |
| **assetRepairUpdateDto** | [**AssetRepairUpdateDto**](AssetRepairUpdateDto.md)|  | [optional] |

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

<a id="updateAssetTransfer"></a>
# **updateAssetTransfer**
> EmptyEnvelope updateAssetTransfer(tenantId, assetId, transferId, assetTransferUpdateDto)

Updates a transfer for an asset

Updates an existing transfer record for the specified asset.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID assetId = UUID.randomUUID(); // UUID | 
    UUID transferId = UUID.randomUUID(); // UUID | 
    AssetTransferUpdateDto assetTransferUpdateDto = new AssetTransferUpdateDto(); // AssetTransferUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateAssetTransfer(tenantId, assetId, transferId, assetTransferUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#updateAssetTransfer");
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
| **assetId** | **UUID**|  | |
| **transferId** | **UUID**|  | |
| **assetTransferUpdateDto** | [**AssetTransferUpdateDto**](AssetTransferUpdateDto.md)|  | [optional] |

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

<a id="updateAssetValueAmend"></a>
# **updateAssetValueAmend**
> EmptyEnvelope updateAssetValueAmend(tenantId, assetId, amendId, assetValueAmendUpdateDto)

Updates a value amendment for an asset

Updates an existing value amendment record for the specified asset.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID assetId = UUID.randomUUID(); // UUID | 
    UUID amendId = UUID.randomUUID(); // UUID | 
    AssetValueAmendUpdateDto assetValueAmendUpdateDto = new AssetValueAmendUpdateDto(); // AssetValueAmendUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateAssetValueAmend(tenantId, assetId, amendId, assetValueAmendUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#updateAssetValueAmend");
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
| **assetId** | **UUID**|  | |
| **amendId** | **UUID**|  | |
| **assetValueAmendUpdateDto** | [**AssetValueAmendUpdateDto**](AssetValueAmendUpdateDto.md)|  | [optional] |

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

