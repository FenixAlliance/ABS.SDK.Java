# DealUnitsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2DealsServiceDealUnitsCountGet**](DealUnitsApi.md#apiV2DealsServiceDealUnitsCountGet) | **GET** /api/v2/DealsService/DealUnits/Count |  |
| [**apiV2DealsServiceDealUnitsDealUnitIdCalculatePut**](DealUnitsApi.md#apiV2DealsServiceDealUnitsDealUnitIdCalculatePut) | **PUT** /api/v2/DealsService/DealUnits/{dealUnitId}/Calculate |  |
| [**apiV2DealsServiceDealUnitsDealUnitIdDelete**](DealUnitsApi.md#apiV2DealsServiceDealUnitsDealUnitIdDelete) | **DELETE** /api/v2/DealsService/DealUnits/{dealUnitId} |  |
| [**apiV2DealsServiceDealUnitsDealUnitIdExtendedGet**](DealUnitsApi.md#apiV2DealsServiceDealUnitsDealUnitIdExtendedGet) | **GET** /api/v2/DealsService/DealUnits/{dealUnitId}/Extended |  |
| [**apiV2DealsServiceDealUnitsDealUnitIdLinesCountGet**](DealUnitsApi.md#apiV2DealsServiceDealUnitsDealUnitIdLinesCountGet) | **GET** /api/v2/DealsService/DealUnits/{dealUnitId}/Lines/Count |  |
| [**apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdCalculatePut**](DealUnitsApi.md#apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdCalculatePut) | **PUT** /api/v2/DealsService/DealUnits/{dealUnitId}/Lines/{dealUnitLineId}/Calculate |  |
| [**apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdDelete**](DealUnitsApi.md#apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdDelete) | **DELETE** /api/v2/DealsService/DealUnits/{dealUnitId}/Lines/{dealUnitLineId} |  |
| [**apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdGet**](DealUnitsApi.md#apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdGet) | **GET** /api/v2/DealsService/DealUnits/{dealUnitId}/Lines/{dealUnitLineId} |  |
| [**apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdPut**](DealUnitsApi.md#apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdPut) | **PUT** /api/v2/DealsService/DealUnits/{dealUnitId}/Lines/{dealUnitLineId} |  |
| [**apiV2DealsServiceDealUnitsDealUnitIdLinesGet**](DealUnitsApi.md#apiV2DealsServiceDealUnitsDealUnitIdLinesGet) | **GET** /api/v2/DealsService/DealUnits/{dealUnitId}/Lines |  |
| [**apiV2DealsServiceDealUnitsDealUnitIdLinesPost**](DealUnitsApi.md#apiV2DealsServiceDealUnitsDealUnitIdLinesPost) | **POST** /api/v2/DealsService/DealUnits/{dealUnitId}/Lines |  |
| [**apiV2DealsServiceDealUnitsDealUnitIdPut**](DealUnitsApi.md#apiV2DealsServiceDealUnitsDealUnitIdPut) | **PUT** /api/v2/DealsService/DealUnits/{dealUnitId} |  |
| [**apiV2DealsServiceDealUnitsExtendedGet**](DealUnitsApi.md#apiV2DealsServiceDealUnitsExtendedGet) | **GET** /api/v2/DealsService/DealUnits/Extended |  |
| [**apiV2DealsServiceDealUnitsGet**](DealUnitsApi.md#apiV2DealsServiceDealUnitsGet) | **GET** /api/v2/DealsService/DealUnits |  |
| [**apiV2DealsServiceDealUnitsPost**](DealUnitsApi.md#apiV2DealsServiceDealUnitsPost) | **POST** /api/v2/DealsService/DealUnits |  |
| [**getDealUnitAsync**](DealUnitsApi.md#getDealUnitAsync) | **GET** /api/v2/DealsService/DealUnits/{dealUnitId} |  |


<a id="apiV2DealsServiceDealUnitsCountGet"></a>
# **apiV2DealsServiceDealUnitsCountGet**
> Int32Envelope apiV2DealsServiceDealUnitsCountGet(tenantId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DealUnitsApi apiInstance = new DealUnitsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.apiV2DealsServiceDealUnitsCountGet(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitsApi#apiV2DealsServiceDealUnitsCountGet");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2DealsServiceDealUnitsDealUnitIdCalculatePut"></a>
# **apiV2DealsServiceDealUnitsDealUnitIdCalculatePut**
> EmptyEnvelope apiV2DealsServiceDealUnitsDealUnitIdCalculatePut(tenantId, dealUnitId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DealUnitsApi apiInstance = new DealUnitsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID dealUnitId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.apiV2DealsServiceDealUnitsDealUnitIdCalculatePut(tenantId, dealUnitId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitsApi#apiV2DealsServiceDealUnitsDealUnitIdCalculatePut");
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
| **dealUnitId** | **UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2DealsServiceDealUnitsDealUnitIdDelete"></a>
# **apiV2DealsServiceDealUnitsDealUnitIdDelete**
> EmptyEnvelope apiV2DealsServiceDealUnitsDealUnitIdDelete(tenantId, dealUnitId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DealUnitsApi apiInstance = new DealUnitsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID dealUnitId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.apiV2DealsServiceDealUnitsDealUnitIdDelete(tenantId, dealUnitId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitsApi#apiV2DealsServiceDealUnitsDealUnitIdDelete");
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
| **dealUnitId** | **UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2DealsServiceDealUnitsDealUnitIdExtendedGet"></a>
# **apiV2DealsServiceDealUnitsDealUnitIdExtendedGet**
> ExtendedDealUnitDtoEnvelope apiV2DealsServiceDealUnitsDealUnitIdExtendedGet(tenantId, dealUnitId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DealUnitsApi apiInstance = new DealUnitsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID dealUnitId = UUID.randomUUID(); // UUID | 
    try {
      ExtendedDealUnitDtoEnvelope result = apiInstance.apiV2DealsServiceDealUnitsDealUnitIdExtendedGet(tenantId, dealUnitId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitsApi#apiV2DealsServiceDealUnitsDealUnitIdExtendedGet");
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
| **dealUnitId** | **UUID**|  | |

### Return type

[**ExtendedDealUnitDtoEnvelope**](ExtendedDealUnitDtoEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2DealsServiceDealUnitsDealUnitIdLinesCountGet"></a>
# **apiV2DealsServiceDealUnitsDealUnitIdLinesCountGet**
> Int32Envelope apiV2DealsServiceDealUnitsDealUnitIdLinesCountGet(tenantId, dealUnitId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DealUnitsApi apiInstance = new DealUnitsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID dealUnitId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.apiV2DealsServiceDealUnitsDealUnitIdLinesCountGet(tenantId, dealUnitId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitsApi#apiV2DealsServiceDealUnitsDealUnitIdLinesCountGet");
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
| **dealUnitId** | **UUID**|  | |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdCalculatePut"></a>
# **apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdCalculatePut**
> EmptyEnvelope apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdCalculatePut(tenantId, dealUnitId, dealUnitLineId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DealUnitsApi apiInstance = new DealUnitsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID dealUnitId = UUID.randomUUID(); // UUID | 
    UUID dealUnitLineId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdCalculatePut(tenantId, dealUnitId, dealUnitLineId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitsApi#apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdCalculatePut");
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
| **dealUnitId** | **UUID**|  | |
| **dealUnitLineId** | **UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdDelete"></a>
# **apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdDelete**
> EmptyEnvelope apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdDelete(tenantId, dealUnitId, dealUnitLineId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DealUnitsApi apiInstance = new DealUnitsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID dealUnitId = UUID.randomUUID(); // UUID | 
    UUID dealUnitLineId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdDelete(tenantId, dealUnitId, dealUnitLineId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitsApi#apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdDelete");
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
| **dealUnitId** | **UUID**|  | |
| **dealUnitLineId** | **UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdGet"></a>
# **apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdGet**
> DealUnitLineDtoEnvelope apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdGet(tenantId, dealUnitId, dealUnitLineId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DealUnitsApi apiInstance = new DealUnitsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID dealUnitId = UUID.randomUUID(); // UUID | 
    UUID dealUnitLineId = UUID.randomUUID(); // UUID | 
    try {
      DealUnitLineDtoEnvelope result = apiInstance.apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdGet(tenantId, dealUnitId, dealUnitLineId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitsApi#apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdGet");
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
| **dealUnitId** | **UUID**|  | |
| **dealUnitLineId** | **UUID**|  | |

### Return type

[**DealUnitLineDtoEnvelope**](DealUnitLineDtoEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdPut"></a>
# **apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdPut**
> EmptyEnvelope apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdPut(tenantId, dealUnitId, dealUnitLineId, dealUnitLineUpdateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DealUnitsApi apiInstance = new DealUnitsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID dealUnitId = UUID.randomUUID(); // UUID | 
    UUID dealUnitLineId = UUID.randomUUID(); // UUID | 
    DealUnitLineUpdateDto dealUnitLineUpdateDto = new DealUnitLineUpdateDto(); // DealUnitLineUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdPut(tenantId, dealUnitId, dealUnitLineId, dealUnitLineUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitsApi#apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdPut");
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
| **dealUnitId** | **UUID**|  | |
| **dealUnitLineId** | **UUID**|  | |
| **dealUnitLineUpdateDto** | [**DealUnitLineUpdateDto**](DealUnitLineUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2DealsServiceDealUnitsDealUnitIdLinesGet"></a>
# **apiV2DealsServiceDealUnitsDealUnitIdLinesGet**
> DealUnitLineDtoListEnvelope apiV2DealsServiceDealUnitsDealUnitIdLinesGet(tenantId, dealUnitId, itemId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DealUnitsApi apiInstance = new DealUnitsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID dealUnitId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    try {
      DealUnitLineDtoListEnvelope result = apiInstance.apiV2DealsServiceDealUnitsDealUnitIdLinesGet(tenantId, dealUnitId, itemId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitsApi#apiV2DealsServiceDealUnitsDealUnitIdLinesGet");
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
| **dealUnitId** | **UUID**|  | |
| **itemId** | **UUID**|  | [optional] |

### Return type

[**DealUnitLineDtoListEnvelope**](DealUnitLineDtoListEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2DealsServiceDealUnitsDealUnitIdLinesPost"></a>
# **apiV2DealsServiceDealUnitsDealUnitIdLinesPost**
> EmptyEnvelope apiV2DealsServiceDealUnitsDealUnitIdLinesPost(tenantId, dealUnitId, dealUnitLineCreateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DealUnitsApi apiInstance = new DealUnitsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID dealUnitId = UUID.randomUUID(); // UUID | 
    DealUnitLineCreateDto dealUnitLineCreateDto = new DealUnitLineCreateDto(); // DealUnitLineCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.apiV2DealsServiceDealUnitsDealUnitIdLinesPost(tenantId, dealUnitId, dealUnitLineCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitsApi#apiV2DealsServiceDealUnitsDealUnitIdLinesPost");
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
| **dealUnitId** | **UUID**|  | |
| **dealUnitLineCreateDto** | [**DealUnitLineCreateDto**](DealUnitLineCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2DealsServiceDealUnitsDealUnitIdPut"></a>
# **apiV2DealsServiceDealUnitsDealUnitIdPut**
> EmptyEnvelope apiV2DealsServiceDealUnitsDealUnitIdPut(tenantId, dealUnitId, dealUnitUpdateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DealUnitsApi apiInstance = new DealUnitsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID dealUnitId = UUID.randomUUID(); // UUID | 
    DealUnitUpdateDto dealUnitUpdateDto = new DealUnitUpdateDto(); // DealUnitUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.apiV2DealsServiceDealUnitsDealUnitIdPut(tenantId, dealUnitId, dealUnitUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitsApi#apiV2DealsServiceDealUnitsDealUnitIdPut");
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
| **dealUnitId** | **UUID**|  | |
| **dealUnitUpdateDto** | [**DealUnitUpdateDto**](DealUnitUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2DealsServiceDealUnitsExtendedGet"></a>
# **apiV2DealsServiceDealUnitsExtendedGet**
> ExtendedDealUnitDtoListEnvelope apiV2DealsServiceDealUnitsExtendedGet(tenantId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DealUnitsApi apiInstance = new DealUnitsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      ExtendedDealUnitDtoListEnvelope result = apiInstance.apiV2DealsServiceDealUnitsExtendedGet(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitsApi#apiV2DealsServiceDealUnitsExtendedGet");
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

[**ExtendedDealUnitDtoListEnvelope**](ExtendedDealUnitDtoListEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2DealsServiceDealUnitsGet"></a>
# **apiV2DealsServiceDealUnitsGet**
> DealUnitDtoListEnvelope apiV2DealsServiceDealUnitsGet(tenantId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DealUnitsApi apiInstance = new DealUnitsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      DealUnitDtoListEnvelope result = apiInstance.apiV2DealsServiceDealUnitsGet(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitsApi#apiV2DealsServiceDealUnitsGet");
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

[**DealUnitDtoListEnvelope**](DealUnitDtoListEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="apiV2DealsServiceDealUnitsPost"></a>
# **apiV2DealsServiceDealUnitsPost**
> EmptyEnvelope apiV2DealsServiceDealUnitsPost(tenantId, dealUnitCreateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DealUnitsApi apiInstance = new DealUnitsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    DealUnitCreateDto dealUnitCreateDto = new DealUnitCreateDto(); // DealUnitCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.apiV2DealsServiceDealUnitsPost(tenantId, dealUnitCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitsApi#apiV2DealsServiceDealUnitsPost");
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
| **dealUnitCreateDto** | [**DealUnitCreateDto**](DealUnitCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getDealUnitAsync"></a>
# **getDealUnitAsync**
> DealUnitDtoEnvelope getDealUnitAsync(tenantId, dealUnitId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DealUnitsApi apiInstance = new DealUnitsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID dealUnitId = UUID.randomUUID(); // UUID | 
    try {
      DealUnitDtoEnvelope result = apiInstance.getDealUnitAsync(tenantId, dealUnitId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitsApi#getDealUnitAsync");
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
| **dealUnitId** | **UUID**|  | |

### Return type

[**DealUnitDtoEnvelope**](DealUnitDtoEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

