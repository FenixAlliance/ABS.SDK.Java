# NonFungibleTokensApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNonFungibleTokenAsync**](NonFungibleTokensApi.md#createNonFungibleTokenAsync) | **POST** /api/v2/BlockchainsService/NonFungibleTokens | Create a new NFT |
| [**deleteNonFungibleTokenAsync**](NonFungibleTokensApi.md#deleteNonFungibleTokenAsync) | **DELETE** /api/v2/BlockchainsService/NonFungibleTokens/{id} | Delete an NFT |
| [**getNonFungibleTokenByIdAsync**](NonFungibleTokensApi.md#getNonFungibleTokenByIdAsync) | **GET** /api/v2/BlockchainsService/NonFungibleTokens/{id} | Get NFT by ID |
| [**getNonFungibleTokensAsync**](NonFungibleTokensApi.md#getNonFungibleTokensAsync) | **GET** /api/v2/BlockchainsService/NonFungibleTokens | Get all non-fungible tokens |
| [**getNonFungibleTokensCountAsync**](NonFungibleTokensApi.md#getNonFungibleTokensCountAsync) | **GET** /api/v2/BlockchainsService/NonFungibleTokens/Count | Get NFTs count |
| [**patchNonFungibleTokenAsync**](NonFungibleTokensApi.md#patchNonFungibleTokenAsync) | **PATCH** /api/v2/BlockchainsService/NonFungibleTokens/{id} | Patch a non-fungible token |
| [**updateNonFungibleTokenAsync**](NonFungibleTokensApi.md#updateNonFungibleTokenAsync) | **PUT** /api/v2/BlockchainsService/NonFungibleTokens/{id} | Update an NFT |


<a id="createNonFungibleTokenAsync"></a>
# **createNonFungibleTokenAsync**
> createNonFungibleTokenAsync(tenantId, apiVersion, xApiVersion, nonFungibleTokenCreateDto)

Create a new NFT

Creates a new non-fungible token for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NonFungibleTokensApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    NonFungibleTokensApi apiInstance = new NonFungibleTokensApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    NonFungibleTokenCreateDto nonFungibleTokenCreateDto = new NonFungibleTokenCreateDto(); // NonFungibleTokenCreateDto | 
    try {
      apiInstance.createNonFungibleTokenAsync(tenantId, apiVersion, xApiVersion, nonFungibleTokenCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling NonFungibleTokensApi#createNonFungibleTokenAsync");
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
| **nonFungibleTokenCreateDto** | [**NonFungibleTokenCreateDto**](NonFungibleTokenCreateDto.md)|  | [optional] |

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

<a id="deleteNonFungibleTokenAsync"></a>
# **deleteNonFungibleTokenAsync**
> deleteNonFungibleTokenAsync(tenantId, id, apiVersion, xApiVersion)

Delete an NFT

Deletes a non-fungible token for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NonFungibleTokensApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    NonFungibleTokensApi apiInstance = new NonFungibleTokensApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteNonFungibleTokenAsync(tenantId, id, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling NonFungibleTokensApi#deleteNonFungibleTokenAsync");
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

<a id="getNonFungibleTokenByIdAsync"></a>
# **getNonFungibleTokenByIdAsync**
> NonFungibleTokenDto getNonFungibleTokenByIdAsync(tenantId, id, apiVersion, xApiVersion)

Get NFT by ID

Retrieves a specific non-fungible token by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NonFungibleTokensApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    NonFungibleTokensApi apiInstance = new NonFungibleTokensApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      NonFungibleTokenDto result = apiInstance.getNonFungibleTokenByIdAsync(tenantId, id, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NonFungibleTokensApi#getNonFungibleTokenByIdAsync");
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

[**NonFungibleTokenDto**](NonFungibleTokenDto.md)

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

<a id="getNonFungibleTokensAsync"></a>
# **getNonFungibleTokensAsync**
> NonFungibleTokenDtoListEnvelope getNonFungibleTokensAsync(tenantId, oDataQueryOptions, apiVersion, xApiVersion)

Get all non-fungible tokens

Retrieves all NFTs for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NonFungibleTokensApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    NonFungibleTokensApi apiInstance = new NonFungibleTokensApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    NonFungibleTokenDtoODataQueryOptions oDataQueryOptions = new NonFungibleTokenDtoODataQueryOptions(); // NonFungibleTokenDtoODataQueryOptions | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      NonFungibleTokenDtoListEnvelope result = apiInstance.getNonFungibleTokensAsync(tenantId, oDataQueryOptions, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NonFungibleTokensApi#getNonFungibleTokensAsync");
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
| **oDataQueryOptions** | [**NonFungibleTokenDtoODataQueryOptions**](.md)|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**NonFungibleTokenDtoListEnvelope**](NonFungibleTokenDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **200** | OK |  -  |

<a id="getNonFungibleTokensCountAsync"></a>
# **getNonFungibleTokensCountAsync**
> Int32Envelope getNonFungibleTokensCountAsync(tenantId, oDataQueryOptions, apiVersion, xApiVersion)

Get NFTs count

Returns the count of NFTs for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NonFungibleTokensApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    NonFungibleTokensApi apiInstance = new NonFungibleTokensApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    NonFungibleTokenDtoODataQueryOptions oDataQueryOptions = new NonFungibleTokenDtoODataQueryOptions(); // NonFungibleTokenDtoODataQueryOptions | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getNonFungibleTokensCountAsync(tenantId, oDataQueryOptions, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NonFungibleTokensApi#getNonFungibleTokensCountAsync");
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
| **oDataQueryOptions** | [**NonFungibleTokenDtoODataQueryOptions**](.md)|  | [optional] |
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
| **200** | OK |  -  |

<a id="patchNonFungibleTokenAsync"></a>
# **patchNonFungibleTokenAsync**
> EmptyEnvelope patchNonFungibleTokenAsync(tenantId, id, apiVersion, xApiVersion, operation)

Patch a non-fungible token

Patch a non-fungible token

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NonFungibleTokensApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    NonFungibleTokensApi apiInstance = new NonFungibleTokensApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    List<Operation> operation = Arrays.asList(); // List<Operation> | 
    try {
      EmptyEnvelope result = apiInstance.patchNonFungibleTokenAsync(tenantId, id, apiVersion, xApiVersion, operation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NonFungibleTokensApi#patchNonFungibleTokenAsync");
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
| **operation** | [**List&lt;Operation&gt;**](Operation.md)|  | [optional] |

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

<a id="updateNonFungibleTokenAsync"></a>
# **updateNonFungibleTokenAsync**
> updateNonFungibleTokenAsync(tenantId, id, apiVersion, xApiVersion, nonFungibleTokenUpdateDto)

Update an NFT

Updates an existing non-fungible token for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NonFungibleTokensApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    NonFungibleTokensApi apiInstance = new NonFungibleTokensApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    NonFungibleTokenUpdateDto nonFungibleTokenUpdateDto = new NonFungibleTokenUpdateDto(); // NonFungibleTokenUpdateDto | 
    try {
      apiInstance.updateNonFungibleTokenAsync(tenantId, id, apiVersion, xApiVersion, nonFungibleTokenUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling NonFungibleTokensApi#updateNonFungibleTokenAsync");
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
| **nonFungibleTokenUpdateDto** | [**NonFungibleTokenUpdateDto**](NonFungibleTokenUpdateDto.md)|  | [optional] |

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

