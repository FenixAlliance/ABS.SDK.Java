# LocationsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createLocationAsync**](LocationsApi.md#createLocationAsync) | **POST** /api/v2/LocationsService/Locations | Create Location |
| [**createWalletLocationAsync**](LocationsApi.md#createWalletLocationAsync) | **POST** /api/v2/LocationsService/Locations/wallet/{walletId} | Create Wallet Location |
| [**deleteLocationAsync**](LocationsApi.md#deleteLocationAsync) | **DELETE** /api/v2/LocationsService/Locations/{locationId} | Delete Location |
| [**deleteWalletLocationAsync**](LocationsApi.md#deleteWalletLocationAsync) | **DELETE** /api/v2/LocationsService/Locations/wallet/{walletId}/{locationId} | Delete Wallet Location |
| [**getLocationAsync**](LocationsApi.md#getLocationAsync) | **GET** /api/v2/LocationsService/Locations/{locationId} | Get Location |
| [**getLocationsAsync**](LocationsApi.md#getLocationsAsync) | **GET** /api/v2/LocationsService/Locations | Get Locations |
| [**getLocationsCountAsync**](LocationsApi.md#getLocationsCountAsync) | **GET** /api/v2/LocationsService/Locations/count | Get Locations Count |
| [**getWalletLocationAsync**](LocationsApi.md#getWalletLocationAsync) | **GET** /api/v2/LocationsService/Locations/wallet/{walletId}/{locationId} | Get Wallet Location |
| [**getWalletLocationsAsync**](LocationsApi.md#getWalletLocationsAsync) | **GET** /api/v2/LocationsService/Locations/wallet/{walletId} | Get Wallet Locations |
| [**getWalletLocationsCountAsync**](LocationsApi.md#getWalletLocationsCountAsync) | **GET** /api/v2/LocationsService/Locations/wallet/{walletId}/count | Get Wallet Locations Count |
| [**patchLocationAsync**](LocationsApi.md#patchLocationAsync) | **PATCH** /api/v2/LocationsService/Locations/{locationId} | Patch a location |
| [**patchWalletLocationAsync**](LocationsApi.md#patchWalletLocationAsync) | **PATCH** /api/v2/LocationsService/Locations/wallet/{walletId}/{locationId} | Patch a wallet location |
| [**updateLocationAsync**](LocationsApi.md#updateLocationAsync) | **PUT** /api/v2/LocationsService/Locations/{locationId} | Update Location |
| [**updateWalletLocationAsync**](LocationsApi.md#updateWalletLocationAsync) | **PUT** /api/v2/LocationsService/Locations/wallet/{walletId}/{locationId} | Update Wallet Location |


<a id="createLocationAsync"></a>
# **createLocationAsync**
> EmptyEnvelope createLocationAsync(tenantId, locationCreateDto)

Create Location

Create a new location.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LocationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    LocationsApi apiInstance = new LocationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    LocationCreateDto locationCreateDto = new LocationCreateDto(); // LocationCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createLocationAsync(tenantId, locationCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationsApi#createLocationAsync");
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
| **locationCreateDto** | [**LocationCreateDto**](LocationCreateDto.md)|  | [optional] |

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

<a id="createWalletLocationAsync"></a>
# **createWalletLocationAsync**
> EmptyEnvelope createWalletLocationAsync(walletId, locationCreateDto)

Create Wallet Location

Create a new location for a specific wallet.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LocationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    LocationsApi apiInstance = new LocationsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    LocationCreateDto locationCreateDto = new LocationCreateDto(); // LocationCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createWalletLocationAsync(walletId, locationCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationsApi#createWalletLocationAsync");
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
| **walletId** | **UUID**|  | |
| **locationCreateDto** | [**LocationCreateDto**](LocationCreateDto.md)|  | [optional] |

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

<a id="deleteLocationAsync"></a>
# **deleteLocationAsync**
> EmptyEnvelope deleteLocationAsync(tenantId, locationId)

Delete Location

Delete a specific location by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LocationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    LocationsApi apiInstance = new LocationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID locationId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.deleteLocationAsync(tenantId, locationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationsApi#deleteLocationAsync");
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
| **locationId** | **UUID**|  | |

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
| **204** | No Content |  -  |

<a id="deleteWalletLocationAsync"></a>
# **deleteWalletLocationAsync**
> EmptyEnvelope deleteWalletLocationAsync(walletId, locationId)

Delete Wallet Location

Delete a specific location of a wallet.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LocationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    LocationsApi apiInstance = new LocationsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    UUID locationId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.deleteWalletLocationAsync(walletId, locationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationsApi#deleteWalletLocationAsync");
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
| **walletId** | **UUID**|  | |
| **locationId** | **UUID**|  | |

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
| **204** | No Content |  -  |

<a id="getLocationAsync"></a>
# **getLocationAsync**
> LocationDtoEnvelope getLocationAsync(tenantId, locationId)

Get Location

Get details of a specific location by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LocationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    LocationsApi apiInstance = new LocationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID locationId = UUID.randomUUID(); // UUID | 
    try {
      LocationDtoEnvelope result = apiInstance.getLocationAsync(tenantId, locationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationsApi#getLocationAsync");
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
| **locationId** | **UUID**|  | |

### Return type

[**LocationDtoEnvelope**](LocationDtoEnvelope.md)

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

<a id="getLocationsAsync"></a>
# **getLocationsAsync**
> LocationDtoIReadOnlyListEnvelope getLocationsAsync(tenantId, locationDtoCollectionQueryParameters)

Get Locations

Get all locations with OData query support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LocationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    LocationsApi apiInstance = new LocationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    LocationDtoCollectionQueryParameters locationDtoCollectionQueryParameters = new LocationDtoCollectionQueryParameters(); // LocationDtoCollectionQueryParameters | 
    try {
      LocationDtoIReadOnlyListEnvelope result = apiInstance.getLocationsAsync(tenantId, locationDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationsApi#getLocationsAsync");
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
| **locationDtoCollectionQueryParameters** | [**LocationDtoCollectionQueryParameters**](LocationDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**LocationDtoIReadOnlyListEnvelope**](LocationDtoIReadOnlyListEnvelope.md)

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

<a id="getLocationsCountAsync"></a>
# **getLocationsCountAsync**
> Int32Envelope getLocationsCountAsync(tenantId, locationDtoCollectionQueryParameters)

Get Locations Count

Get the count of locations with OData query support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LocationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    LocationsApi apiInstance = new LocationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    LocationDtoCollectionQueryParameters locationDtoCollectionQueryParameters = new LocationDtoCollectionQueryParameters(); // LocationDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getLocationsCountAsync(tenantId, locationDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationsApi#getLocationsCountAsync");
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
| **locationDtoCollectionQueryParameters** | [**LocationDtoCollectionQueryParameters**](LocationDtoCollectionQueryParameters.md)|  | [optional] |

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
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getWalletLocationAsync"></a>
# **getWalletLocationAsync**
> LocationDtoEnvelope getWalletLocationAsync(walletId, locationId)

Get Wallet Location

Get a specific location of a wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LocationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    LocationsApi apiInstance = new LocationsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    UUID locationId = UUID.randomUUID(); // UUID | 
    try {
      LocationDtoEnvelope result = apiInstance.getWalletLocationAsync(walletId, locationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationsApi#getWalletLocationAsync");
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
| **walletId** | **UUID**|  | |
| **locationId** | **UUID**|  | |

### Return type

[**LocationDtoEnvelope**](LocationDtoEnvelope.md)

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

<a id="getWalletLocationsAsync"></a>
# **getWalletLocationsAsync**
> LocationDtoIReadOnlyListEnvelope getWalletLocationsAsync(walletId, locationDtoCollectionQueryParameters)

Get Wallet Locations

Get locations for a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LocationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    LocationsApi apiInstance = new LocationsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    LocationDtoCollectionQueryParameters locationDtoCollectionQueryParameters = new LocationDtoCollectionQueryParameters(); // LocationDtoCollectionQueryParameters | 
    try {
      LocationDtoIReadOnlyListEnvelope result = apiInstance.getWalletLocationsAsync(walletId, locationDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationsApi#getWalletLocationsAsync");
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
| **walletId** | **UUID**|  | |
| **locationDtoCollectionQueryParameters** | [**LocationDtoCollectionQueryParameters**](LocationDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**LocationDtoIReadOnlyListEnvelope**](LocationDtoIReadOnlyListEnvelope.md)

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

<a id="getWalletLocationsCountAsync"></a>
# **getWalletLocationsCountAsync**
> Int32Envelope getWalletLocationsCountAsync(walletId, locationDtoCollectionQueryParameters)

Get Wallet Locations Count

Get the count of locations for a specific wallet by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LocationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    LocationsApi apiInstance = new LocationsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    LocationDtoCollectionQueryParameters locationDtoCollectionQueryParameters = new LocationDtoCollectionQueryParameters(); // LocationDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getWalletLocationsCountAsync(walletId, locationDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationsApi#getWalletLocationsCountAsync");
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
| **walletId** | **UUID**|  | |
| **locationDtoCollectionQueryParameters** | [**LocationDtoCollectionQueryParameters**](LocationDtoCollectionQueryParameters.md)|  | [optional] |

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
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="patchLocationAsync"></a>
# **patchLocationAsync**
> EmptyEnvelope patchLocationAsync(tenantId, locationId, patchOperation)

Patch a location

Patch a location

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LocationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    LocationsApi apiInstance = new LocationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID locationId = UUID.randomUUID(); // UUID | 
    List<PatchOperation> patchOperation = Arrays.asList(); // List<PatchOperation> | 
    try {
      EmptyEnvelope result = apiInstance.patchLocationAsync(tenantId, locationId, patchOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationsApi#patchLocationAsync");
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
| **locationId** | **UUID**|  | |
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

<a id="patchWalletLocationAsync"></a>
# **patchWalletLocationAsync**
> EmptyEnvelope patchWalletLocationAsync(walletId, locationId, patchOperation)

Patch a wallet location

Patch a wallet location

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LocationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    LocationsApi apiInstance = new LocationsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    UUID locationId = UUID.randomUUID(); // UUID | 
    List<PatchOperation> patchOperation = Arrays.asList(); // List<PatchOperation> | 
    try {
      EmptyEnvelope result = apiInstance.patchWalletLocationAsync(walletId, locationId, patchOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationsApi#patchWalletLocationAsync");
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
| **walletId** | **UUID**|  | |
| **locationId** | **UUID**|  | |
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

<a id="updateLocationAsync"></a>
# **updateLocationAsync**
> EmptyEnvelope updateLocationAsync(tenantId, locationId, locationUpdateDto)

Update Location

Update a specific location by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LocationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    LocationsApi apiInstance = new LocationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID locationId = UUID.randomUUID(); // UUID | 
    LocationUpdateDto locationUpdateDto = new LocationUpdateDto(); // LocationUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateLocationAsync(tenantId, locationId, locationUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationsApi#updateLocationAsync");
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
| **locationId** | **UUID**|  | |
| **locationUpdateDto** | [**LocationUpdateDto**](LocationUpdateDto.md)|  | [optional] |

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

<a id="updateWalletLocationAsync"></a>
# **updateWalletLocationAsync**
> EmptyEnvelope updateWalletLocationAsync(walletId, locationId, locationUpdateDto)

Update Wallet Location

Update a specific location of a wallet.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LocationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    LocationsApi apiInstance = new LocationsApi(defaultClient);
    UUID walletId = UUID.randomUUID(); // UUID | 
    UUID locationId = UUID.randomUUID(); // UUID | 
    LocationUpdateDto locationUpdateDto = new LocationUpdateDto(); // LocationUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateWalletLocationAsync(walletId, locationId, locationUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationsApi#updateWalletLocationAsync");
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
| **walletId** | **UUID**|  | |
| **locationId** | **UUID**|  | |
| **locationUpdateDto** | [**LocationUpdateDto**](LocationUpdateDto.md)|  | [optional] |

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

