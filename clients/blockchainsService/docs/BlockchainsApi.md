# BlockchainsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBlockchainAsync**](BlockchainsApi.md#createBlockchainAsync) | **POST** /api/v2/BlockchainsService/Blockchains | Create a new blockchain |
| [**createBlockchainBlockAsync**](BlockchainsApi.md#createBlockchainBlockAsync) | **POST** /api/v2/BlockchainsService/Blockchains/{blockchainId}/Blocks | Add a block to a blockchain |
| [**deleteBlockchainAsync**](BlockchainsApi.md#deleteBlockchainAsync) | **DELETE** /api/v2/BlockchainsService/Blockchains/{id} | Delete a blockchain |
| [**deleteBlockchainBlockAsync**](BlockchainsApi.md#deleteBlockchainBlockAsync) | **DELETE** /api/v2/BlockchainsService/Blockchains/{blockchainId}/Blocks/{blockId} | Delete a blockchain block |
| [**getBlockchainBlockByIdAsync**](BlockchainsApi.md#getBlockchainBlockByIdAsync) | **GET** /api/v2/BlockchainsService/Blockchains/{blockchainId}/Blocks/{blockId} | Get a specific block |
| [**getBlockchainBlocksAsync**](BlockchainsApi.md#getBlockchainBlocksAsync) | **GET** /api/v2/BlockchainsService/Blockchains/{blockchainId}/Blocks | Get blocks for a blockchain |
| [**getBlockchainBlocksCountAsync**](BlockchainsApi.md#getBlockchainBlocksCountAsync) | **GET** /api/v2/BlockchainsService/Blockchains/{blockchainId}/Blocks/Count | Get block count for a blockchain |
| [**getBlockchainByIdAsync**](BlockchainsApi.md#getBlockchainByIdAsync) | **GET** /api/v2/BlockchainsService/Blockchains/{id} | Get blockchain by ID |
| [**getBlockchainsAsync**](BlockchainsApi.md#getBlockchainsAsync) | **GET** /api/v2/BlockchainsService/Blockchains | Get all blockchains |
| [**getBlockchainsCountAsync**](BlockchainsApi.md#getBlockchainsCountAsync) | **GET** /api/v2/BlockchainsService/Blockchains/Count | Get blockchains count |
| [**patchBlockchainAsync**](BlockchainsApi.md#patchBlockchainAsync) | **PATCH** /api/v2/BlockchainsService/Blockchains/{id} | Patch a blockchain |
| [**patchBlockchainBlockAsync**](BlockchainsApi.md#patchBlockchainBlockAsync) | **PATCH** /api/v2/BlockchainsService/Blockchains/{blockchainId}/Blocks/{blockId} | Patch a blockchain block |
| [**updateBlockchainAsync**](BlockchainsApi.md#updateBlockchainAsync) | **PUT** /api/v2/BlockchainsService/Blockchains/{id} | Update a blockchain |
| [**updateBlockchainBlockAsync**](BlockchainsApi.md#updateBlockchainBlockAsync) | **PUT** /api/v2/BlockchainsService/Blockchains/{blockchainId}/Blocks/{blockId} | Update a blockchain block |


<a id="createBlockchainAsync"></a>
# **createBlockchainAsync**
> createBlockchainAsync(tenantId, apiVersion, xApiVersion, blockchainCreateDto)

Create a new blockchain

Creates a new blockchain for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlockchainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BlockchainsApi apiInstance = new BlockchainsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    BlockchainCreateDto blockchainCreateDto = new BlockchainCreateDto(); // BlockchainCreateDto | 
    try {
      apiInstance.createBlockchainAsync(tenantId, apiVersion, xApiVersion, blockchainCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockchainsApi#createBlockchainAsync");
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
| **blockchainCreateDto** | [**BlockchainCreateDto**](BlockchainCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

<a id="createBlockchainBlockAsync"></a>
# **createBlockchainBlockAsync**
> createBlockchainBlockAsync(tenantId, blockchainId, apiVersion, xApiVersion, blockchainBlockCreateDto)

Add a block to a blockchain

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlockchainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BlockchainsApi apiInstance = new BlockchainsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID blockchainId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    BlockchainBlockCreateDto blockchainBlockCreateDto = new BlockchainBlockCreateDto(); // BlockchainBlockCreateDto | 
    try {
      apiInstance.createBlockchainBlockAsync(tenantId, blockchainId, apiVersion, xApiVersion, blockchainBlockCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockchainsApi#createBlockchainBlockAsync");
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
| **blockchainId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **blockchainBlockCreateDto** | [**BlockchainBlockCreateDto**](BlockchainBlockCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteBlockchainAsync"></a>
# **deleteBlockchainAsync**
> deleteBlockchainAsync(tenantId, id, apiVersion, xApiVersion)

Delete a blockchain

Deletes a blockchain for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlockchainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BlockchainsApi apiInstance = new BlockchainsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteBlockchainAsync(tenantId, id, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockchainsApi#deleteBlockchainAsync");
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
| **id** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="deleteBlockchainBlockAsync"></a>
# **deleteBlockchainBlockAsync**
> deleteBlockchainBlockAsync(tenantId, blockchainId, blockId, apiVersion, xApiVersion)

Delete a blockchain block

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlockchainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BlockchainsApi apiInstance = new BlockchainsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID blockchainId = UUID.randomUUID(); // UUID | 
    UUID blockId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteBlockchainBlockAsync(tenantId, blockchainId, blockId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockchainsApi#deleteBlockchainBlockAsync");
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
| **blockchainId** | **UUID**|  | |
| **blockId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getBlockchainBlockByIdAsync"></a>
# **getBlockchainBlockByIdAsync**
> BlockchainBlockDto getBlockchainBlockByIdAsync(tenantId, blockchainId, blockId, apiVersion, xApiVersion)

Get a specific block

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlockchainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BlockchainsApi apiInstance = new BlockchainsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID blockchainId = UUID.randomUUID(); // UUID | 
    UUID blockId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      BlockchainBlockDto result = apiInstance.getBlockchainBlockByIdAsync(tenantId, blockchainId, blockId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockchainsApi#getBlockchainBlockByIdAsync");
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
| **blockchainId** | **UUID**|  | |
| **blockId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**BlockchainBlockDto**](BlockchainBlockDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getBlockchainBlocksAsync"></a>
# **getBlockchainBlocksAsync**
> BlockchainBlockDtoListEnvelope getBlockchainBlocksAsync(tenantId, blockchainId, apiVersion, xApiVersion, blockchainBlockDtoCollectionQueryParameters)

Get blocks for a blockchain

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlockchainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BlockchainsApi apiInstance = new BlockchainsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID blockchainId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    BlockchainBlockDtoCollectionQueryParameters blockchainBlockDtoCollectionQueryParameters = new BlockchainBlockDtoCollectionQueryParameters(); // BlockchainBlockDtoCollectionQueryParameters | 
    try {
      BlockchainBlockDtoListEnvelope result = apiInstance.getBlockchainBlocksAsync(tenantId, blockchainId, apiVersion, xApiVersion, blockchainBlockDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockchainsApi#getBlockchainBlocksAsync");
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
| **blockchainId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **blockchainBlockDtoCollectionQueryParameters** | [**BlockchainBlockDtoCollectionQueryParameters**](BlockchainBlockDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**BlockchainBlockDtoListEnvelope**](BlockchainBlockDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getBlockchainBlocksCountAsync"></a>
# **getBlockchainBlocksCountAsync**
> Int32Envelope getBlockchainBlocksCountAsync(tenantId, blockchainId, apiVersion, xApiVersion, blockchainBlockDtoCollectionQueryParameters)

Get block count for a blockchain

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlockchainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BlockchainsApi apiInstance = new BlockchainsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID blockchainId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    BlockchainBlockDtoCollectionQueryParameters blockchainBlockDtoCollectionQueryParameters = new BlockchainBlockDtoCollectionQueryParameters(); // BlockchainBlockDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getBlockchainBlocksCountAsync(tenantId, blockchainId, apiVersion, xApiVersion, blockchainBlockDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockchainsApi#getBlockchainBlocksCountAsync");
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
| **blockchainId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **blockchainBlockDtoCollectionQueryParameters** | [**BlockchainBlockDtoCollectionQueryParameters**](BlockchainBlockDtoCollectionQueryParameters.md)|  | [optional] |

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
| **200** | OK |  -  |

<a id="getBlockchainByIdAsync"></a>
# **getBlockchainByIdAsync**
> BlockchainDto getBlockchainByIdAsync(tenantId, id, apiVersion, xApiVersion)

Get blockchain by ID

Retrieves a specific blockchain by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlockchainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BlockchainsApi apiInstance = new BlockchainsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      BlockchainDto result = apiInstance.getBlockchainByIdAsync(tenantId, id, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockchainsApi#getBlockchainByIdAsync");
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
| **id** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**BlockchainDto**](BlockchainDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getBlockchainsAsync"></a>
# **getBlockchainsAsync**
> BlockchainDtoListEnvelope getBlockchainsAsync(tenantId, apiVersion, xApiVersion, blockchainDtoCollectionQueryParameters)

Get all blockchains

Retrieves all blockchains for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlockchainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BlockchainsApi apiInstance = new BlockchainsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    BlockchainDtoCollectionQueryParameters blockchainDtoCollectionQueryParameters = new BlockchainDtoCollectionQueryParameters(); // BlockchainDtoCollectionQueryParameters | 
    try {
      BlockchainDtoListEnvelope result = apiInstance.getBlockchainsAsync(tenantId, apiVersion, xApiVersion, blockchainDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockchainsApi#getBlockchainsAsync");
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
| **blockchainDtoCollectionQueryParameters** | [**BlockchainDtoCollectionQueryParameters**](BlockchainDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**BlockchainDtoListEnvelope**](BlockchainDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **200** | OK |  -  |

<a id="getBlockchainsCountAsync"></a>
# **getBlockchainsCountAsync**
> Int32Envelope getBlockchainsCountAsync(tenantId, apiVersion, xApiVersion, blockchainDtoCollectionQueryParameters)

Get blockchains count

Returns the count of blockchains for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlockchainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BlockchainsApi apiInstance = new BlockchainsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    BlockchainDtoCollectionQueryParameters blockchainDtoCollectionQueryParameters = new BlockchainDtoCollectionQueryParameters(); // BlockchainDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getBlockchainsCountAsync(tenantId, apiVersion, xApiVersion, blockchainDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockchainsApi#getBlockchainsCountAsync");
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
| **blockchainDtoCollectionQueryParameters** | [**BlockchainDtoCollectionQueryParameters**](BlockchainDtoCollectionQueryParameters.md)|  | [optional] |

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
| **200** | OK |  -  |

<a id="patchBlockchainAsync"></a>
# **patchBlockchainAsync**
> EmptyEnvelope patchBlockchainAsync(tenantId, id, apiVersion, xApiVersion, patchOperation)

Patch a blockchain

Patch a blockchain

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlockchainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BlockchainsApi apiInstance = new BlockchainsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    List<PatchOperation> patchOperation = Arrays.asList(); // List<PatchOperation> | 
    try {
      EmptyEnvelope result = apiInstance.patchBlockchainAsync(tenantId, id, apiVersion, xApiVersion, patchOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockchainsApi#patchBlockchainAsync");
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
| **id** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **patchOperation** | [**List&lt;PatchOperation&gt;**](PatchOperation.md)|  | [optional] |

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

<a id="patchBlockchainBlockAsync"></a>
# **patchBlockchainBlockAsync**
> EmptyEnvelope patchBlockchainBlockAsync(tenantId, blockchainId, blockId, apiVersion, xApiVersion, patchOperation)

Patch a blockchain block

Patch a blockchain block

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlockchainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BlockchainsApi apiInstance = new BlockchainsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID blockchainId = UUID.randomUUID(); // UUID | 
    UUID blockId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    List<PatchOperation> patchOperation = Arrays.asList(); // List<PatchOperation> | 
    try {
      EmptyEnvelope result = apiInstance.patchBlockchainBlockAsync(tenantId, blockchainId, blockId, apiVersion, xApiVersion, patchOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockchainsApi#patchBlockchainBlockAsync");
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
| **blockchainId** | **UUID**|  | |
| **blockId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **patchOperation** | [**List&lt;PatchOperation&gt;**](PatchOperation.md)|  | [optional] |

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

<a id="updateBlockchainAsync"></a>
# **updateBlockchainAsync**
> updateBlockchainAsync(tenantId, id, apiVersion, xApiVersion, blockchainUpdateDto)

Update a blockchain

Updates an existing blockchain for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlockchainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BlockchainsApi apiInstance = new BlockchainsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    BlockchainUpdateDto blockchainUpdateDto = new BlockchainUpdateDto(); // BlockchainUpdateDto | 
    try {
      apiInstance.updateBlockchainAsync(tenantId, id, apiVersion, xApiVersion, blockchainUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockchainsApi#updateBlockchainAsync");
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
| **id** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **blockchainUpdateDto** | [**BlockchainUpdateDto**](BlockchainUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="updateBlockchainBlockAsync"></a>
# **updateBlockchainBlockAsync**
> updateBlockchainBlockAsync(tenantId, blockchainId, blockId, apiVersion, xApiVersion, blockchainBlockUpdateDto)

Update a blockchain block

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlockchainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BlockchainsApi apiInstance = new BlockchainsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID blockchainId = UUID.randomUUID(); // UUID | 
    UUID blockId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    BlockchainBlockUpdateDto blockchainBlockUpdateDto = new BlockchainBlockUpdateDto(); // BlockchainBlockUpdateDto | 
    try {
      apiInstance.updateBlockchainBlockAsync(tenantId, blockchainId, blockId, apiVersion, xApiVersion, blockchainBlockUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockchainsApi#updateBlockchainBlockAsync");
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
| **blockchainId** | **UUID**|  | |
| **blockId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **blockchainBlockUpdateDto** | [**BlockchainBlockUpdateDto**](BlockchainBlockUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

