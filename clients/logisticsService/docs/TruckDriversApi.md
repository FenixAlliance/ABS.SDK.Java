# TruckDriversApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateTruckDriverAsync**](TruckDriversApi.md#activateTruckDriverAsync) | **POST** /api/v2/LogisticsService/TruckDrivers/{driverId}/Activate | Activate a truck driver |
| [**createTruckDriverAsync**](TruckDriversApi.md#createTruckDriverAsync) | **POST** /api/v2/LogisticsService/TruckDrivers | Create a truck driver |
| [**deactivateTruckDriverAsync**](TruckDriversApi.md#deactivateTruckDriverAsync) | **POST** /api/v2/LogisticsService/TruckDrivers/{driverId}/Deactivate | Deactivate a truck driver |
| [**deleteTruckDriverAsync**](TruckDriversApi.md#deleteTruckDriverAsync) | **DELETE** /api/v2/LogisticsService/TruckDrivers/{driverId} | Delete a truck driver |
| [**getTruckDriverByIdAsync**](TruckDriversApi.md#getTruckDriverByIdAsync) | **GET** /api/v2/LogisticsService/TruckDrivers/{driverId} | Get truck driver by ID |
| [**getTruckDriversAsync**](TruckDriversApi.md#getTruckDriversAsync) | **GET** /api/v2/LogisticsService/TruckDrivers | Get all truck drivers |
| [**getTruckDriversCountAsync**](TruckDriversApi.md#getTruckDriversCountAsync) | **GET** /api/v2/LogisticsService/TruckDrivers/Count | Get truck drivers count |
| [**updateTruckDriverAsync**](TruckDriversApi.md#updateTruckDriverAsync) | **PUT** /api/v2/LogisticsService/TruckDrivers/{driverId} | Update a truck driver |


<a id="activateTruckDriverAsync"></a>
# **activateTruckDriverAsync**
> EmptyEnvelope activateTruckDriverAsync(tenantId, driverId, apiVersion, xApiVersion)

Activate a truck driver

Activates a truck driver.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TruckDriversApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TruckDriversApi apiInstance = new TruckDriversApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID driverId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.activateTruckDriverAsync(tenantId, driverId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TruckDriversApi#activateTruckDriverAsync");
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
| **driverId** | **UUID**|  | |
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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

<a id="createTruckDriverAsync"></a>
# **createTruckDriverAsync**
> EmptyEnvelope createTruckDriverAsync(tenantId, apiVersion, xApiVersion, truckDriverCreateDto)

Create a truck driver

Creates a new truck driver for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TruckDriversApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TruckDriversApi apiInstance = new TruckDriversApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TruckDriverCreateDto truckDriverCreateDto = new TruckDriverCreateDto(); // TruckDriverCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createTruckDriverAsync(tenantId, apiVersion, xApiVersion, truckDriverCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TruckDriversApi#createTruckDriverAsync");
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
| **truckDriverCreateDto** | [**TruckDriverCreateDto**](TruckDriverCreateDto.md)|  | [optional] |

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
| **200** | OK |  -  |

<a id="deactivateTruckDriverAsync"></a>
# **deactivateTruckDriverAsync**
> EmptyEnvelope deactivateTruckDriverAsync(tenantId, driverId, apiVersion, xApiVersion)

Deactivate a truck driver

Deactivates a truck driver.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TruckDriversApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TruckDriversApi apiInstance = new TruckDriversApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID driverId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deactivateTruckDriverAsync(tenantId, driverId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TruckDriversApi#deactivateTruckDriverAsync");
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
| **driverId** | **UUID**|  | |
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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

<a id="deleteTruckDriverAsync"></a>
# **deleteTruckDriverAsync**
> EmptyEnvelope deleteTruckDriverAsync(tenantId, driverId, apiVersion, xApiVersion)

Delete a truck driver

Deletes a truck driver.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TruckDriversApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TruckDriversApi apiInstance = new TruckDriversApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID driverId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteTruckDriverAsync(tenantId, driverId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TruckDriversApi#deleteTruckDriverAsync");
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
| **driverId** | **UUID**|  | |
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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getTruckDriverByIdAsync"></a>
# **getTruckDriverByIdAsync**
> TruckDriverDtoEnvelope getTruckDriverByIdAsync(tenantId, driverId, apiVersion, xApiVersion)

Get truck driver by ID

Retrieves a specific truck driver by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TruckDriversApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TruckDriversApi apiInstance = new TruckDriversApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID driverId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TruckDriverDtoEnvelope result = apiInstance.getTruckDriverByIdAsync(tenantId, driverId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TruckDriversApi#getTruckDriverByIdAsync");
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
| **driverId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**TruckDriverDtoEnvelope**](TruckDriverDtoEnvelope.md)

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

<a id="getTruckDriversAsync"></a>
# **getTruckDriversAsync**
> TruckDriverDtoListEnvelope getTruckDriversAsync(tenantId, apiVersion, xApiVersion)

Get all truck drivers

Retrieves all truck drivers for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TruckDriversApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TruckDriversApi apiInstance = new TruckDriversApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TruckDriverDtoListEnvelope result = apiInstance.getTruckDriversAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TruckDriversApi#getTruckDriversAsync");
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

[**TruckDriverDtoListEnvelope**](TruckDriverDtoListEnvelope.md)

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

<a id="getTruckDriversCountAsync"></a>
# **getTruckDriversCountAsync**
> Int32Envelope getTruckDriversCountAsync(tenantId, apiVersion, xApiVersion)

Get truck drivers count

Returns the count of truck drivers for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TruckDriversApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TruckDriversApi apiInstance = new TruckDriversApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getTruckDriversCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TruckDriversApi#getTruckDriversCountAsync");
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
| **200** | OK |  -  |

<a id="updateTruckDriverAsync"></a>
# **updateTruckDriverAsync**
> EmptyEnvelope updateTruckDriverAsync(tenantId, driverId, apiVersion, xApiVersion, truckDriverUpdateDto)

Update a truck driver

Updates an existing truck driver.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TruckDriversApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TruckDriversApi apiInstance = new TruckDriversApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID driverId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TruckDriverUpdateDto truckDriverUpdateDto = new TruckDriverUpdateDto(); // TruckDriverUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateTruckDriverAsync(tenantId, driverId, apiVersion, xApiVersion, truckDriverUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TruckDriversApi#updateTruckDriverAsync");
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
| **driverId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **truckDriverUpdateDto** | [**TruckDriverUpdateDto**](TruckDriverUpdateDto.md)|  | [optional] |

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
| **200** | OK |  -  |

