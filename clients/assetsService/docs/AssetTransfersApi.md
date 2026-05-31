# AssetTransfersApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAssetTransferAsync**](AssetTransfersApi.md#createAssetTransferAsync) | **POST** /api/v2/AssetsService/AssetTransfers | Creates a new asset transfer |
| [**deleteAssetTransferAsync**](AssetTransfersApi.md#deleteAssetTransferAsync) | **DELETE** /api/v2/AssetsService/AssetTransfers/{transferId} | Deletes an asset transfer |
| [**getAssetTransferAsync**](AssetTransfersApi.md#getAssetTransferAsync) | **GET** /api/v2/AssetsService/AssetTransfers/{transferId} | Gets a single asset transfer by ID |
| [**getAssetTransfersAsync**](AssetTransfersApi.md#getAssetTransfersAsync) | **GET** /api/v2/AssetsService/AssetTransfers | Gets a list of asset transfers |
| [**getAssetTransfersCountAsync**](AssetTransfersApi.md#getAssetTransfersCountAsync) | **GET** /api/v2/AssetsService/AssetTransfers/Count | Gets the count of asset transfers |
| [**updateAssetTransferAsync**](AssetTransfersApi.md#updateAssetTransferAsync) | **PUT** /api/v2/AssetsService/AssetTransfers/{transferId} | Updates an existing asset transfer |


<a id="createAssetTransferAsync"></a>
# **createAssetTransferAsync**
> EmptyEnvelope createAssetTransferAsync(tenantId, assetTransferCreateDto)

Creates a new asset transfer

Creates a new asset transfer for the authenticated tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetTransfersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AssetTransfersApi apiInstance = new AssetTransfersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    AssetTransferCreateDto assetTransferCreateDto = new AssetTransferCreateDto(); // AssetTransferCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createAssetTransferAsync(tenantId, assetTransferCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetTransfersApi#createAssetTransferAsync");
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

<a id="deleteAssetTransferAsync"></a>
# **deleteAssetTransferAsync**
> EmptyEnvelope deleteAssetTransferAsync(tenantId, transferId)

Deletes an asset transfer

Deletes an asset transfer for the authenticated tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetTransfersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AssetTransfersApi apiInstance = new AssetTransfersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID transferId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.deleteAssetTransferAsync(tenantId, transferId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetTransfersApi#deleteAssetTransferAsync");
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

<a id="getAssetTransferAsync"></a>
# **getAssetTransferAsync**
> AssetTransferDtoEnvelope getAssetTransferAsync(tenantId, transferId)

Gets a single asset transfer by ID

Retrieves a specific asset transfer by its ID for the authenticated tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetTransfersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AssetTransfersApi apiInstance = new AssetTransfersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID transferId = UUID.randomUUID(); // UUID | 
    try {
      AssetTransferDtoEnvelope result = apiInstance.getAssetTransferAsync(tenantId, transferId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetTransfersApi#getAssetTransferAsync");
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

<a id="getAssetTransfersAsync"></a>
# **getAssetTransfersAsync**
> AssetTransferDtoListEnvelope getAssetTransfersAsync(tenantId)

Gets a list of asset transfers

Retrieves all asset transfers for the authenticated tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetTransfersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AssetTransfersApi apiInstance = new AssetTransfersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      AssetTransferDtoListEnvelope result = apiInstance.getAssetTransfersAsync(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetTransfersApi#getAssetTransfersAsync");
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

<a id="getAssetTransfersCountAsync"></a>
# **getAssetTransfersCountAsync**
> Int32Envelope getAssetTransfersCountAsync(tenantId)

Gets the count of asset transfers

Returns the total number of asset transfers for the authenticated tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetTransfersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AssetTransfersApi apiInstance = new AssetTransfersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.getAssetTransfersCountAsync(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetTransfersApi#getAssetTransfersCountAsync");
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
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="updateAssetTransferAsync"></a>
# **updateAssetTransferAsync**
> EmptyEnvelope updateAssetTransferAsync(tenantId, transferId, assetTransferUpdateDto)

Updates an existing asset transfer

Updates an existing asset transfer for the authenticated tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetTransfersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AssetTransfersApi apiInstance = new AssetTransfersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID transferId = UUID.randomUUID(); // UUID | 
    AssetTransferUpdateDto assetTransferUpdateDto = new AssetTransferUpdateDto(); // AssetTransferUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateAssetTransferAsync(tenantId, transferId, assetTransferUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetTransfersApi#updateAssetTransferAsync");
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

