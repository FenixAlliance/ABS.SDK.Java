# ShippingZonesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createShippingZoneAsync**](ShippingZonesApi.md#createShippingZoneAsync) | **POST** /api/v2/ShipmentsService/ShippingZones | Create a shipping zone |
| [**deleteShippingZoneAsync**](ShippingZonesApi.md#deleteShippingZoneAsync) | **DELETE** /api/v2/ShipmentsService/ShippingZones/{zoneId} | Delete a shipping zone |
| [**getShippingZoneByIdAsync**](ShippingZonesApi.md#getShippingZoneByIdAsync) | **GET** /api/v2/ShipmentsService/ShippingZones/{zoneId} | Get shipping zone by ID |
| [**getShippingZonesAsync**](ShippingZonesApi.md#getShippingZonesAsync) | **GET** /api/v2/ShipmentsService/ShippingZones | Get all shipping zones |
| [**getShippingZonesCountAsync**](ShippingZonesApi.md#getShippingZonesCountAsync) | **GET** /api/v2/ShipmentsService/ShippingZones/Count | Get shipping zones count |
| [**updateShippingZoneAsync**](ShippingZonesApi.md#updateShippingZoneAsync) | **PUT** /api/v2/ShipmentsService/ShippingZones/{zoneId} | Update a shipping zone |


<a id="createShippingZoneAsync"></a>
# **createShippingZoneAsync**
> createShippingZoneAsync(tenantId, apiVersion, xApiVersion, shippingZoneCreateDto)

Create a shipping zone

Creates a new shipping zone.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShippingZonesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ShippingZonesApi apiInstance = new ShippingZonesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ShippingZoneCreateDto shippingZoneCreateDto = new ShippingZoneCreateDto(); // ShippingZoneCreateDto | 
    try {
      apiInstance.createShippingZoneAsync(tenantId, apiVersion, xApiVersion, shippingZoneCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingZonesApi#createShippingZoneAsync");
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
| **shippingZoneCreateDto** | [**ShippingZoneCreateDto**](ShippingZoneCreateDto.md)|  | [optional] |

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
| **400** | Bad Request |  -  |
| **201** | Created |  -  |

<a id="deleteShippingZoneAsync"></a>
# **deleteShippingZoneAsync**
> deleteShippingZoneAsync(tenantId, zoneId, apiVersion, xApiVersion)

Delete a shipping zone

Deletes a shipping zone.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShippingZonesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ShippingZonesApi apiInstance = new ShippingZonesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID zoneId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteShippingZoneAsync(tenantId, zoneId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingZonesApi#deleteShippingZoneAsync");
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
| **zoneId** | **UUID**|  | |
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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getShippingZoneByIdAsync"></a>
# **getShippingZoneByIdAsync**
> ShippingZoneDtoEnvelope getShippingZoneByIdAsync(tenantId, zoneId, apiVersion, xApiVersion)

Get shipping zone by ID

Retrieves a specific shipping zone.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShippingZonesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ShippingZonesApi apiInstance = new ShippingZonesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID zoneId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ShippingZoneDtoEnvelope result = apiInstance.getShippingZoneByIdAsync(tenantId, zoneId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingZonesApi#getShippingZoneByIdAsync");
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
| **zoneId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ShippingZoneDtoEnvelope**](ShippingZoneDtoEnvelope.md)

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

<a id="getShippingZonesAsync"></a>
# **getShippingZonesAsync**
> ShippingZoneDtoListEnvelope getShippingZonesAsync(tenantId, apiVersion, xApiVersion)

Get all shipping zones

Retrieves all shipping zones for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShippingZonesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ShippingZonesApi apiInstance = new ShippingZonesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ShippingZoneDtoListEnvelope result = apiInstance.getShippingZonesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingZonesApi#getShippingZonesAsync");
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

[**ShippingZoneDtoListEnvelope**](ShippingZoneDtoListEnvelope.md)

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

<a id="getShippingZonesCountAsync"></a>
# **getShippingZonesCountAsync**
> Int32Envelope getShippingZonesCountAsync(tenantId, apiVersion, xApiVersion)

Get shipping zones count

Returns the count of shipping zones.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShippingZonesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ShippingZonesApi apiInstance = new ShippingZonesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getShippingZonesCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingZonesApi#getShippingZonesCountAsync");
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
| **200** | OK |  -  |

<a id="updateShippingZoneAsync"></a>
# **updateShippingZoneAsync**
> updateShippingZoneAsync(tenantId, zoneId, apiVersion, xApiVersion, shippingZoneUpdateDto)

Update a shipping zone

Updates an existing shipping zone.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShippingZonesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ShippingZonesApi apiInstance = new ShippingZonesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID zoneId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ShippingZoneUpdateDto shippingZoneUpdateDto = new ShippingZoneUpdateDto(); // ShippingZoneUpdateDto | 
    try {
      apiInstance.updateShippingZoneAsync(tenantId, zoneId, apiVersion, xApiVersion, shippingZoneUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingZonesApi#updateShippingZoneAsync");
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
| **zoneId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **shippingZoneUpdateDto** | [**ShippingZoneUpdateDto**](ShippingZoneUpdateDto.md)|  | [optional] |

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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

