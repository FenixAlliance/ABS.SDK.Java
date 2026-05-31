# ShipmentsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createShipmentAsync**](ShipmentsApi.md#createShipmentAsync) | **POST** /api/v2/ShipmentsService/Shipments | Create a shipment |
| [**deleteShipmentAsync**](ShipmentsApi.md#deleteShipmentAsync) | **DELETE** /api/v2/ShipmentsService/Shipments/{shipmentId} | Delete a shipment |
| [**getShipmentByIdAsync**](ShipmentsApi.md#getShipmentByIdAsync) | **GET** /api/v2/ShipmentsService/Shipments/{shipmentId} | Get shipment by ID |
| [**getShipmentsAsync**](ShipmentsApi.md#getShipmentsAsync) | **GET** /api/v2/ShipmentsService/Shipments | Get all shipments |
| [**getShipmentsCountAsync**](ShipmentsApi.md#getShipmentsCountAsync) | **GET** /api/v2/ShipmentsService/Shipments/Count | Get shipments count |
| [**updateShipmentAsync**](ShipmentsApi.md#updateShipmentAsync) | **PUT** /api/v2/ShipmentsService/Shipments/{shipmentId} | Update a shipment |


<a id="createShipmentAsync"></a>
# **createShipmentAsync**
> createShipmentAsync(tenantId, apiVersion, xApiVersion, shipmentCreateDto)

Create a shipment

Creates a new shipment for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShipmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ShipmentsApi apiInstance = new ShipmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ShipmentCreateDto shipmentCreateDto = new ShipmentCreateDto(); // ShipmentCreateDto | 
    try {
      apiInstance.createShipmentAsync(tenantId, apiVersion, xApiVersion, shipmentCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentsApi#createShipmentAsync");
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
| **shipmentCreateDto** | [**ShipmentCreateDto**](ShipmentCreateDto.md)|  | [optional] |

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

<a id="deleteShipmentAsync"></a>
# **deleteShipmentAsync**
> deleteShipmentAsync(tenantId, shipmentId, apiVersion, xApiVersion)

Delete a shipment

Deletes a shipment.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShipmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ShipmentsApi apiInstance = new ShipmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID shipmentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteShipmentAsync(tenantId, shipmentId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentsApi#deleteShipmentAsync");
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
| **shipmentId** | **UUID**|  | |
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

<a id="getShipmentByIdAsync"></a>
# **getShipmentByIdAsync**
> ShipmentDtoEnvelope getShipmentByIdAsync(tenantId, shipmentId, apiVersion, xApiVersion)

Get shipment by ID

Retrieves a specific shipment by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShipmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ShipmentsApi apiInstance = new ShipmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID shipmentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ShipmentDtoEnvelope result = apiInstance.getShipmentByIdAsync(tenantId, shipmentId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentsApi#getShipmentByIdAsync");
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
| **shipmentId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ShipmentDtoEnvelope**](ShipmentDtoEnvelope.md)

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

<a id="getShipmentsAsync"></a>
# **getShipmentsAsync**
> ShipmentDtoListEnvelope getShipmentsAsync(tenantId, apiVersion, xApiVersion)

Get all shipments

Retrieves all shipments for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShipmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ShipmentsApi apiInstance = new ShipmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ShipmentDtoListEnvelope result = apiInstance.getShipmentsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentsApi#getShipmentsAsync");
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

[**ShipmentDtoListEnvelope**](ShipmentDtoListEnvelope.md)

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

<a id="getShipmentsCountAsync"></a>
# **getShipmentsCountAsync**
> Int32Envelope getShipmentsCountAsync(tenantId, apiVersion, xApiVersion)

Get shipments count

Returns the count of shipments for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShipmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ShipmentsApi apiInstance = new ShipmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getShipmentsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentsApi#getShipmentsCountAsync");
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

<a id="updateShipmentAsync"></a>
# **updateShipmentAsync**
> updateShipmentAsync(tenantId, shipmentId, apiVersion, xApiVersion, shipmentUpdateDto)

Update a shipment

Updates an existing shipment.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShipmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ShipmentsApi apiInstance = new ShipmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID shipmentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ShipmentUpdateDto shipmentUpdateDto = new ShipmentUpdateDto(); // ShipmentUpdateDto | 
    try {
      apiInstance.updateShipmentAsync(tenantId, shipmentId, apiVersion, xApiVersion, shipmentUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentsApi#updateShipmentAsync");
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
| **shipmentId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **shipmentUpdateDto** | [**ShipmentUpdateDto**](ShipmentUpdateDto.md)|  | [optional] |

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

