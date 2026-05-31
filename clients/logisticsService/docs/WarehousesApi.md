# WarehousesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createWarehouseAsync**](WarehousesApi.md#createWarehouseAsync) | **POST** /api/v2/LogisticsService/Warehouses | Create a warehouse |
| [**deleteWarehouseAsync**](WarehousesApi.md#deleteWarehouseAsync) | **DELETE** /api/v2/LogisticsService/Warehouses/{warehouseId} | Delete a warehouse |
| [**getWarehouseByIdAsync**](WarehousesApi.md#getWarehouseByIdAsync) | **GET** /api/v2/LogisticsService/Warehouses/{warehouseId} | Get warehouse by ID |
| [**getWarehousesAsync**](WarehousesApi.md#getWarehousesAsync) | **GET** /api/v2/LogisticsService/Warehouses | Get all warehouses |
| [**getWarehousesCountAsync**](WarehousesApi.md#getWarehousesCountAsync) | **GET** /api/v2/LogisticsService/Warehouses/Count | Get warehouses count |
| [**updateWarehouseAsync**](WarehousesApi.md#updateWarehouseAsync) | **PUT** /api/v2/LogisticsService/Warehouses/{warehouseId} | Update a warehouse |


<a id="createWarehouseAsync"></a>
# **createWarehouseAsync**
> EmptyEnvelope createWarehouseAsync(tenantId, apiVersion, xApiVersion, warehouseCreateDto)

Create a warehouse

Creates a new warehouse.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WarehousesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WarehousesApi apiInstance = new WarehousesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    WarehouseCreateDto warehouseCreateDto = new WarehouseCreateDto(); // WarehouseCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createWarehouseAsync(tenantId, apiVersion, xApiVersion, warehouseCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WarehousesApi#createWarehouseAsync");
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
| **warehouseCreateDto** | [**WarehouseCreateDto**](WarehouseCreateDto.md)|  | [optional] |

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

<a id="deleteWarehouseAsync"></a>
# **deleteWarehouseAsync**
> EmptyEnvelope deleteWarehouseAsync(tenantId, warehouseId, apiVersion, xApiVersion)

Delete a warehouse

Deletes a warehouse.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WarehousesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WarehousesApi apiInstance = new WarehousesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID warehouseId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteWarehouseAsync(tenantId, warehouseId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WarehousesApi#deleteWarehouseAsync");
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
| **warehouseId** | **UUID**|  | |
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

<a id="getWarehouseByIdAsync"></a>
# **getWarehouseByIdAsync**
> WarehouseDtoEnvelope getWarehouseByIdAsync(tenantId, warehouseId, apiVersion, xApiVersion)

Get warehouse by ID

Retrieves a specific warehouse.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WarehousesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WarehousesApi apiInstance = new WarehousesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID warehouseId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      WarehouseDtoEnvelope result = apiInstance.getWarehouseByIdAsync(tenantId, warehouseId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WarehousesApi#getWarehouseByIdAsync");
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
| **warehouseId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**WarehouseDtoEnvelope**](WarehouseDtoEnvelope.md)

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

<a id="getWarehousesAsync"></a>
# **getWarehousesAsync**
> WarehouseDtoListEnvelope getWarehousesAsync(tenantId, apiVersion, xApiVersion)

Get all warehouses

Retrieves all warehouses for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WarehousesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WarehousesApi apiInstance = new WarehousesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      WarehouseDtoListEnvelope result = apiInstance.getWarehousesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WarehousesApi#getWarehousesAsync");
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

[**WarehouseDtoListEnvelope**](WarehouseDtoListEnvelope.md)

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

<a id="getWarehousesCountAsync"></a>
# **getWarehousesCountAsync**
> Int32Envelope getWarehousesCountAsync(tenantId, apiVersion, xApiVersion)

Get warehouses count

Returns the count of warehouses.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WarehousesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WarehousesApi apiInstance = new WarehousesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getWarehousesCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WarehousesApi#getWarehousesCountAsync");
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

<a id="updateWarehouseAsync"></a>
# **updateWarehouseAsync**
> EmptyEnvelope updateWarehouseAsync(tenantId, warehouseId, apiVersion, xApiVersion, warehouseUpdateDto)

Update a warehouse

Updates an existing warehouse.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WarehousesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WarehousesApi apiInstance = new WarehousesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID warehouseId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    WarehouseUpdateDto warehouseUpdateDto = new WarehouseUpdateDto(); // WarehouseUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateWarehouseAsync(tenantId, warehouseId, apiVersion, xApiVersion, warehouseUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WarehousesApi#updateWarehouseAsync");
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
| **warehouseId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **warehouseUpdateDto** | [**WarehouseUpdateDto**](WarehouseUpdateDto.md)|  | [optional] |

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

