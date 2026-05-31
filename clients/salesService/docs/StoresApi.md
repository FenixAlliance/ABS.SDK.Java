# StoresApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**countStoresAsync**](StoresApi.md#countStoresAsync) | **GET** /api/v2/SalesService/Stores/Count | Get stores count |
| [**createStoreAsync**](StoresApi.md#createStoreAsync) | **POST** /api/v2/SalesService/Stores | Create a store |
| [**deleteStoreAsync**](StoresApi.md#deleteStoreAsync) | **DELETE** /api/v2/SalesService/Stores/{storeId} | Delete a store |
| [**getStoreAsync**](StoresApi.md#getStoreAsync) | **GET** /api/v2/SalesService/Stores/{storeId} | Get store by ID |
| [**getStoresAsync**](StoresApi.md#getStoresAsync) | **GET** /api/v2/SalesService/Stores | Get stores |
| [**updateStoreAsync**](StoresApi.md#updateStoreAsync) | **PUT** /api/v2/SalesService/Stores/{storeId} | Update a store |


<a id="countStoresAsync"></a>
# **countStoresAsync**
> Int32Envelope countStoresAsync(tenantId)

Get stores count

Returns the total count of stores for the specified tenant with OData filter support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StoresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    StoresApi apiInstance = new StoresApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.countStoresAsync(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoresApi#countStoresAsync");
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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="createStoreAsync"></a>
# **createStoreAsync**
> EmptyEnvelope createStoreAsync(tenantId, storeCreateDto)

Create a store

Creates a new store for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StoresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    StoresApi apiInstance = new StoresApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    StoreCreateDto storeCreateDto = new StoreCreateDto(); // StoreCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createStoreAsync(tenantId, storeCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoresApi#createStoreAsync");
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
| **storeCreateDto** | [**StoreCreateDto**](StoreCreateDto.md)|  | [optional] |

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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="deleteStoreAsync"></a>
# **deleteStoreAsync**
> EmptyEnvelope deleteStoreAsync(tenantId, storeId)

Delete a store

Deletes an existing store by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StoresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    StoresApi apiInstance = new StoresApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID storeId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.deleteStoreAsync(tenantId, storeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoresApi#deleteStoreAsync");
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
| **storeId** | **UUID**|  | |

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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getStoreAsync"></a>
# **getStoreAsync**
> StoreDtoEnvelope getStoreAsync(tenantId, storeId)

Get store by ID

Retrieves a single store by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StoresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    StoresApi apiInstance = new StoresApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID storeId = UUID.randomUUID(); // UUID | 
    try {
      StoreDtoEnvelope result = apiInstance.getStoreAsync(tenantId, storeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoresApi#getStoreAsync");
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
| **storeId** | **UUID**|  | |

### Return type

[**StoreDtoEnvelope**](StoreDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getStoresAsync"></a>
# **getStoresAsync**
> StoreDtoListEnvelope getStoresAsync(tenantId)

Get stores

Retrieves a list of stores for the specified tenant with OData query support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StoresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    StoresApi apiInstance = new StoresApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      StoreDtoListEnvelope result = apiInstance.getStoresAsync(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoresApi#getStoresAsync");
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

[**StoreDtoListEnvelope**](StoreDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="updateStoreAsync"></a>
# **updateStoreAsync**
> EmptyEnvelope updateStoreAsync(tenantId, storeId, storeUpdateDto)

Update a store

Updates an existing store by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StoresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    StoresApi apiInstance = new StoresApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID storeId = UUID.randomUUID(); // UUID | 
    StoreUpdateDto storeUpdateDto = new StoreUpdateDto(); // StoreUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateStoreAsync(tenantId, storeId, storeUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoresApi#updateStoreAsync");
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
| **storeId** | **UUID**|  | |
| **storeUpdateDto** | [**StoreUpdateDto**](StoreUpdateDto.md)|  | [optional] |

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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

