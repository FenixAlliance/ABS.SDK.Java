# TrucksApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**arriveTripAsync**](TrucksApi.md#arriveTripAsync) | **POST** /api/v2/LogisticsService/Trucks/{truckId}/Trips/{tripId}/Arrive | Arrive a trip |
| [**cancelTripAsync**](TrucksApi.md#cancelTripAsync) | **POST** /api/v2/LogisticsService/Trucks/{truckId}/Trips/{tripId}/Cancel | Cancel a trip |
| [**createTruckAsync**](TrucksApi.md#createTruckAsync) | **POST** /api/v2/LogisticsService/Trucks | Create a truck |
| [**createTruckTripAsync**](TrucksApi.md#createTruckTripAsync) | **POST** /api/v2/LogisticsService/Trucks/{truckId}/Trips | Create a truck trip |
| [**deleteTruckAsync**](TrucksApi.md#deleteTruckAsync) | **DELETE** /api/v2/LogisticsService/Trucks/{truckId} | Delete a truck |
| [**deleteTruckTripAsync**](TrucksApi.md#deleteTruckTripAsync) | **DELETE** /api/v2/LogisticsService/Trucks/{truckId}/Trips/{tripId} | Delete a truck trip |
| [**deliverTripAsync**](TrucksApi.md#deliverTripAsync) | **POST** /api/v2/LogisticsService/Trucks/{truckId}/Trips/{tripId}/Deliver | Deliver a trip |
| [**departTripAsync**](TrucksApi.md#departTripAsync) | **POST** /api/v2/LogisticsService/Trucks/{truckId}/Trips/{tripId}/Depart | Depart a trip |
| [**dispatchTripAsync**](TrucksApi.md#dispatchTripAsync) | **POST** /api/v2/LogisticsService/Trucks/{truckId}/Trips/{tripId}/Dispatch | Dispatch a trip |
| [**getTruckByIdAsync**](TrucksApi.md#getTruckByIdAsync) | **GET** /api/v2/LogisticsService/Trucks/{truckId} | Get truck by ID |
| [**getTruckTripsAsync**](TrucksApi.md#getTruckTripsAsync) | **GET** /api/v2/LogisticsService/Trucks/{truckId}/Trips | Get truck trips |
| [**getTruckTripsCountAsync**](TrucksApi.md#getTruckTripsCountAsync) | **GET** /api/v2/LogisticsService/Trucks/{truckId}/Trips/Count | Get truck trips count |
| [**getTrucksAsync**](TrucksApi.md#getTrucksAsync) | **GET** /api/v2/LogisticsService/Trucks | Get all trucks |
| [**getTrucksCountAsync**](TrucksApi.md#getTrucksCountAsync) | **GET** /api/v2/LogisticsService/Trucks/Count | Get trucks count |
| [**updateTruckAsync**](TrucksApi.md#updateTruckAsync) | **PUT** /api/v2/LogisticsService/Trucks/{truckId} | Update a truck |
| [**updateTruckTripAsync**](TrucksApi.md#updateTruckTripAsync) | **PUT** /api/v2/LogisticsService/Trucks/{truckId}/Trips/{tripId} | Update a truck trip |


<a id="arriveTripAsync"></a>
# **arriveTripAsync**
> EmptyEnvelope arriveTripAsync(tenantId, truckId, tripId, apiVersion, xApiVersion)

Arrive a trip

Marks a truck trip as arrived.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TrucksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TrucksApi apiInstance = new TrucksApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID truckId = UUID.randomUUID(); // UUID | 
    UUID tripId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.arriveTripAsync(tenantId, truckId, tripId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrucksApi#arriveTripAsync");
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
| **truckId** | **UUID**|  | |
| **tripId** | **UUID**|  | |
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

<a id="cancelTripAsync"></a>
# **cancelTripAsync**
> EmptyEnvelope cancelTripAsync(tenantId, truckId, tripId, apiVersion, xApiVersion)

Cancel a trip

Cancels a truck trip.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TrucksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TrucksApi apiInstance = new TrucksApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID truckId = UUID.randomUUID(); // UUID | 
    UUID tripId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.cancelTripAsync(tenantId, truckId, tripId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrucksApi#cancelTripAsync");
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
| **truckId** | **UUID**|  | |
| **tripId** | **UUID**|  | |
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

<a id="createTruckAsync"></a>
# **createTruckAsync**
> EmptyEnvelope createTruckAsync(tenantId, apiVersion, xApiVersion, truckCreateDto)

Create a truck

Creates a new truck for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TrucksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TrucksApi apiInstance = new TrucksApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TruckCreateDto truckCreateDto = new TruckCreateDto(); // TruckCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createTruckAsync(tenantId, apiVersion, xApiVersion, truckCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrucksApi#createTruckAsync");
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
| **truckCreateDto** | [**TruckCreateDto**](TruckCreateDto.md)|  | [optional] |

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

<a id="createTruckTripAsync"></a>
# **createTruckTripAsync**
> EmptyEnvelope createTruckTripAsync(tenantId, truckId, apiVersion, xApiVersion, truckTripCreateDto)

Create a truck trip

Creates a new trip for a truck.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TrucksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TrucksApi apiInstance = new TrucksApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID truckId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TruckTripCreateDto truckTripCreateDto = new TruckTripCreateDto(); // TruckTripCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createTruckTripAsync(tenantId, truckId, apiVersion, xApiVersion, truckTripCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrucksApi#createTruckTripAsync");
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
| **truckId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **truckTripCreateDto** | [**TruckTripCreateDto**](TruckTripCreateDto.md)|  | [optional] |

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

<a id="deleteTruckAsync"></a>
# **deleteTruckAsync**
> EmptyEnvelope deleteTruckAsync(tenantId, truckId, apiVersion, xApiVersion)

Delete a truck

Deletes a truck.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TrucksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TrucksApi apiInstance = new TrucksApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID truckId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteTruckAsync(tenantId, truckId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrucksApi#deleteTruckAsync");
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
| **truckId** | **UUID**|  | |
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

<a id="deleteTruckTripAsync"></a>
# **deleteTruckTripAsync**
> EmptyEnvelope deleteTruckTripAsync(tenantId, truckId, tripId, apiVersion, xApiVersion)

Delete a truck trip

Deletes a truck trip.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TrucksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TrucksApi apiInstance = new TrucksApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID truckId = UUID.randomUUID(); // UUID | 
    UUID tripId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteTruckTripAsync(tenantId, truckId, tripId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrucksApi#deleteTruckTripAsync");
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
| **truckId** | **UUID**|  | |
| **tripId** | **UUID**|  | |
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

<a id="deliverTripAsync"></a>
# **deliverTripAsync**
> EmptyEnvelope deliverTripAsync(tenantId, truckId, tripId, apiVersion, xApiVersion)

Deliver a trip

Marks a truck trip as delivered.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TrucksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TrucksApi apiInstance = new TrucksApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID truckId = UUID.randomUUID(); // UUID | 
    UUID tripId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deliverTripAsync(tenantId, truckId, tripId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrucksApi#deliverTripAsync");
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
| **truckId** | **UUID**|  | |
| **tripId** | **UUID**|  | |
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

<a id="departTripAsync"></a>
# **departTripAsync**
> EmptyEnvelope departTripAsync(tenantId, truckId, tripId, apiVersion, xApiVersion)

Depart a trip

Marks a truck trip as departed.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TrucksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TrucksApi apiInstance = new TrucksApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID truckId = UUID.randomUUID(); // UUID | 
    UUID tripId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.departTripAsync(tenantId, truckId, tripId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrucksApi#departTripAsync");
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
| **truckId** | **UUID**|  | |
| **tripId** | **UUID**|  | |
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

<a id="dispatchTripAsync"></a>
# **dispatchTripAsync**
> EmptyEnvelope dispatchTripAsync(tenantId, truckId, tripId, apiVersion, xApiVersion)

Dispatch a trip

Dispatches a truck trip.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TrucksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TrucksApi apiInstance = new TrucksApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID truckId = UUID.randomUUID(); // UUID | 
    UUID tripId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.dispatchTripAsync(tenantId, truckId, tripId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrucksApi#dispatchTripAsync");
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
| **truckId** | **UUID**|  | |
| **tripId** | **UUID**|  | |
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

<a id="getTruckByIdAsync"></a>
# **getTruckByIdAsync**
> TruckDtoEnvelope getTruckByIdAsync(tenantId, truckId, apiVersion, xApiVersion)

Get truck by ID

Retrieves a specific truck by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TrucksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TrucksApi apiInstance = new TrucksApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID truckId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TruckDtoEnvelope result = apiInstance.getTruckByIdAsync(tenantId, truckId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrucksApi#getTruckByIdAsync");
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
| **truckId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**TruckDtoEnvelope**](TruckDtoEnvelope.md)

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

<a id="getTruckTripsAsync"></a>
# **getTruckTripsAsync**
> TruckTripDtoListEnvelope getTruckTripsAsync(tenantId, truckId, apiVersion, xApiVersion)

Get truck trips

Retrieves all trips for a specific truck.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TrucksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TrucksApi apiInstance = new TrucksApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID truckId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TruckTripDtoListEnvelope result = apiInstance.getTruckTripsAsync(tenantId, truckId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrucksApi#getTruckTripsAsync");
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
| **truckId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**TruckTripDtoListEnvelope**](TruckTripDtoListEnvelope.md)

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

<a id="getTruckTripsCountAsync"></a>
# **getTruckTripsCountAsync**
> Int32Envelope getTruckTripsCountAsync(tenantId, truckId, apiVersion, xApiVersion)

Get truck trips count

Returns the count of trips for a specific truck.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TrucksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TrucksApi apiInstance = new TrucksApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID truckId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getTruckTripsCountAsync(tenantId, truckId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrucksApi#getTruckTripsCountAsync");
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
| **truckId** | **UUID**|  | |
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

<a id="getTrucksAsync"></a>
# **getTrucksAsync**
> TruckDtoListEnvelope getTrucksAsync(tenantId, apiVersion, xApiVersion)

Get all trucks

Retrieves all trucks for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TrucksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TrucksApi apiInstance = new TrucksApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TruckDtoListEnvelope result = apiInstance.getTrucksAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrucksApi#getTrucksAsync");
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

[**TruckDtoListEnvelope**](TruckDtoListEnvelope.md)

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

<a id="getTrucksCountAsync"></a>
# **getTrucksCountAsync**
> Int32Envelope getTrucksCountAsync(tenantId, apiVersion, xApiVersion)

Get trucks count

Returns the count of trucks for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TrucksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TrucksApi apiInstance = new TrucksApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getTrucksCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrucksApi#getTrucksCountAsync");
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

<a id="updateTruckAsync"></a>
# **updateTruckAsync**
> EmptyEnvelope updateTruckAsync(tenantId, truckId, apiVersion, xApiVersion, truckUpdateDto)

Update a truck

Updates an existing truck.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TrucksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TrucksApi apiInstance = new TrucksApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID truckId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TruckUpdateDto truckUpdateDto = new TruckUpdateDto(); // TruckUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateTruckAsync(tenantId, truckId, apiVersion, xApiVersion, truckUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrucksApi#updateTruckAsync");
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
| **truckId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **truckUpdateDto** | [**TruckUpdateDto**](TruckUpdateDto.md)|  | [optional] |

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

<a id="updateTruckTripAsync"></a>
# **updateTruckTripAsync**
> EmptyEnvelope updateTruckTripAsync(tenantId, truckId, tripId, apiVersion, xApiVersion, truckTripUpdateDto)

Update a truck trip

Updates an existing truck trip.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TrucksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TrucksApi apiInstance = new TrucksApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID truckId = UUID.randomUUID(); // UUID | 
    UUID tripId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TruckTripUpdateDto truckTripUpdateDto = new TruckTripUpdateDto(); // TruckTripUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateTruckTripAsync(tenantId, truckId, tripId, apiVersion, xApiVersion, truckTripUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrucksApi#updateTruckTripAsync");
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
| **truckId** | **UUID**|  | |
| **tripId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **truckTripUpdateDto** | [**TruckTripUpdateDto**](TruckTripUpdateDto.md)|  | [optional] |

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

