# PointOfSalesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**countPointOfSalesAsync**](PointOfSalesApi.md#countPointOfSalesAsync) | **GET** /api/v2/SalesService/PointOfSales/Count | Get point of sales count |
| [**createPointOfSaleAsync**](PointOfSalesApi.md#createPointOfSaleAsync) | **POST** /api/v2/SalesService/PointOfSales | Create a point of sale |
| [**deletePointOfSaleAsync**](PointOfSalesApi.md#deletePointOfSaleAsync) | **DELETE** /api/v2/SalesService/PointOfSales/{pointOfSaleId} | Delete a point of sale |
| [**getPointOfSaleAsync**](PointOfSalesApi.md#getPointOfSaleAsync) | **GET** /api/v2/SalesService/PointOfSales/{pointOfSaleId} | Get point of sale by ID |
| [**getPointOfSalesAsync**](PointOfSalesApi.md#getPointOfSalesAsync) | **GET** /api/v2/SalesService/PointOfSales | Get point of sales |
| [**updatePointOfSaleAsync**](PointOfSalesApi.md#updatePointOfSaleAsync) | **PUT** /api/v2/SalesService/PointOfSales/{pointOfSaleId} | Update a point of sale |


<a id="countPointOfSalesAsync"></a>
# **countPointOfSalesAsync**
> Int32Envelope countPointOfSalesAsync(tenantId)

Get point of sales count

Returns the total count of point of sales for the specified tenant with OData filter support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PointOfSalesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PointOfSalesApi apiInstance = new PointOfSalesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.countPointOfSalesAsync(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PointOfSalesApi#countPointOfSalesAsync");
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

<a id="createPointOfSaleAsync"></a>
# **createPointOfSaleAsync**
> EmptyEnvelope createPointOfSaleAsync(tenantId, pointOfSaleCreateDto)

Create a point of sale

Creates a new point of sale for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PointOfSalesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PointOfSalesApi apiInstance = new PointOfSalesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    PointOfSaleCreateDto pointOfSaleCreateDto = new PointOfSaleCreateDto(); // PointOfSaleCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createPointOfSaleAsync(tenantId, pointOfSaleCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PointOfSalesApi#createPointOfSaleAsync");
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
| **pointOfSaleCreateDto** | [**PointOfSaleCreateDto**](PointOfSaleCreateDto.md)|  | [optional] |

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

<a id="deletePointOfSaleAsync"></a>
# **deletePointOfSaleAsync**
> EmptyEnvelope deletePointOfSaleAsync(tenantId, pointOfSaleId)

Delete a point of sale

Deletes an existing point of sale by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PointOfSalesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PointOfSalesApi apiInstance = new PointOfSalesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID pointOfSaleId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.deletePointOfSaleAsync(tenantId, pointOfSaleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PointOfSalesApi#deletePointOfSaleAsync");
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
| **pointOfSaleId** | **UUID**|  | |

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

<a id="getPointOfSaleAsync"></a>
# **getPointOfSaleAsync**
> PointOfSaleDtoEnvelope getPointOfSaleAsync(tenantId, pointOfSaleId)

Get point of sale by ID

Retrieves a single point of sale by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PointOfSalesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PointOfSalesApi apiInstance = new PointOfSalesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID pointOfSaleId = UUID.randomUUID(); // UUID | 
    try {
      PointOfSaleDtoEnvelope result = apiInstance.getPointOfSaleAsync(tenantId, pointOfSaleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PointOfSalesApi#getPointOfSaleAsync");
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
| **pointOfSaleId** | **UUID**|  | |

### Return type

[**PointOfSaleDtoEnvelope**](PointOfSaleDtoEnvelope.md)

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

<a id="getPointOfSalesAsync"></a>
# **getPointOfSalesAsync**
> PointOfSaleDtoListEnvelope getPointOfSalesAsync(tenantId)

Get point of sales

Retrieves a list of point of sales for the specified tenant with OData query support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PointOfSalesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PointOfSalesApi apiInstance = new PointOfSalesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      PointOfSaleDtoListEnvelope result = apiInstance.getPointOfSalesAsync(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PointOfSalesApi#getPointOfSalesAsync");
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

[**PointOfSaleDtoListEnvelope**](PointOfSaleDtoListEnvelope.md)

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

<a id="updatePointOfSaleAsync"></a>
# **updatePointOfSaleAsync**
> EmptyEnvelope updatePointOfSaleAsync(tenantId, pointOfSaleId, pointOfSaleUpdateDto)

Update a point of sale

Updates an existing point of sale by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PointOfSalesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PointOfSalesApi apiInstance = new PointOfSalesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID pointOfSaleId = UUID.randomUUID(); // UUID | 
    PointOfSaleUpdateDto pointOfSaleUpdateDto = new PointOfSaleUpdateDto(); // PointOfSaleUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updatePointOfSaleAsync(tenantId, pointOfSaleId, pointOfSaleUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PointOfSalesApi#updatePointOfSaleAsync");
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
| **pointOfSaleId** | **UUID**|  | |
| **pointOfSaleUpdateDto** | [**PointOfSaleUpdateDto**](PointOfSaleUpdateDto.md)|  | [optional] |

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

