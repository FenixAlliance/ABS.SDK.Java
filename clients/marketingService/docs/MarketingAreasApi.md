# MarketingAreasApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createMarketingAreaAsync**](MarketingAreasApi.md#createMarketingAreaAsync) | **POST** /api/v2/MarketingService/MarketingAreas | Create a marketing area |
| [**deleteMarketingAreaAsync**](MarketingAreasApi.md#deleteMarketingAreaAsync) | **DELETE** /api/v2/MarketingService/MarketingAreas/{marketingAreaId} | Delete a marketing area |
| [**getMarketingAreaByIdAsync**](MarketingAreasApi.md#getMarketingAreaByIdAsync) | **GET** /api/v2/MarketingService/MarketingAreas/{marketingAreaId} | Get marketing area by ID |
| [**getMarketingAreasAsync**](MarketingAreasApi.md#getMarketingAreasAsync) | **GET** /api/v2/MarketingService/MarketingAreas | Get marketing areas |
| [**getMarketingAreasCountAsync**](MarketingAreasApi.md#getMarketingAreasCountAsync) | **GET** /api/v2/MarketingService/MarketingAreas/Count | Count marketing areas |
| [**updateMarketingAreaAsync**](MarketingAreasApi.md#updateMarketingAreaAsync) | **PUT** /api/v2/MarketingService/MarketingAreas/{marketingAreaId} | Update a marketing area |


<a id="createMarketingAreaAsync"></a>
# **createMarketingAreaAsync**
> EmptyEnvelope createMarketingAreaAsync(tenantId, apiVersion, xApiVersion, marketingAreaCreateDto)

Create a marketing area

Creates a new marketing area for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MarketingAreasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingAreasApi apiInstance = new MarketingAreasApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    MarketingAreaCreateDto marketingAreaCreateDto = new MarketingAreaCreateDto(); // MarketingAreaCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createMarketingAreaAsync(tenantId, apiVersion, xApiVersion, marketingAreaCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingAreasApi#createMarketingAreaAsync");
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
| **marketingAreaCreateDto** | [**MarketingAreaCreateDto**](MarketingAreaCreateDto.md)|  | [optional] |

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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

<a id="deleteMarketingAreaAsync"></a>
# **deleteMarketingAreaAsync**
> EmptyEnvelope deleteMarketingAreaAsync(tenantId, marketingAreaId, apiVersion, xApiVersion)

Delete a marketing area

Deletes a marketing area for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MarketingAreasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingAreasApi apiInstance = new MarketingAreasApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID marketingAreaId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteMarketingAreaAsync(tenantId, marketingAreaId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingAreasApi#deleteMarketingAreaAsync");
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
| **marketingAreaId** | **UUID**|  | |
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
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

<a id="getMarketingAreaByIdAsync"></a>
# **getMarketingAreaByIdAsync**
> MarketingAreaDtoEnvelope getMarketingAreaByIdAsync(tenantId, marketingAreaId, apiVersion, xApiVersion)

Get marketing area by ID

Retrieves a specific marketing area by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MarketingAreasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingAreasApi apiInstance = new MarketingAreasApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID marketingAreaId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      MarketingAreaDtoEnvelope result = apiInstance.getMarketingAreaByIdAsync(tenantId, marketingAreaId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingAreasApi#getMarketingAreaByIdAsync");
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
| **marketingAreaId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**MarketingAreaDtoEnvelope**](MarketingAreaDtoEnvelope.md)

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

<a id="getMarketingAreasAsync"></a>
# **getMarketingAreasAsync**
> MarketingAreaDtoListEnvelope getMarketingAreasAsync(tenantId, apiVersion, xApiVersion)

Get marketing areas

Retrieves marketing areas for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MarketingAreasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingAreasApi apiInstance = new MarketingAreasApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      MarketingAreaDtoListEnvelope result = apiInstance.getMarketingAreasAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingAreasApi#getMarketingAreasAsync");
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

[**MarketingAreaDtoListEnvelope**](MarketingAreaDtoListEnvelope.md)

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

<a id="getMarketingAreasCountAsync"></a>
# **getMarketingAreasCountAsync**
> Int32Envelope getMarketingAreasCountAsync(tenantId, apiVersion, xApiVersion)

Count marketing areas

Counts marketing areas for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MarketingAreasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingAreasApi apiInstance = new MarketingAreasApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getMarketingAreasCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingAreasApi#getMarketingAreasCountAsync");
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
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="updateMarketingAreaAsync"></a>
# **updateMarketingAreaAsync**
> EmptyEnvelope updateMarketingAreaAsync(tenantId, marketingAreaId, apiVersion, xApiVersion, marketingAreaUpdateDto)

Update a marketing area

Updates an existing marketing area for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MarketingAreasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingAreasApi apiInstance = new MarketingAreasApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID marketingAreaId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    MarketingAreaUpdateDto marketingAreaUpdateDto = new MarketingAreaUpdateDto(); // MarketingAreaUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateMarketingAreaAsync(tenantId, marketingAreaId, apiVersion, xApiVersion, marketingAreaUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingAreasApi#updateMarketingAreaAsync");
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
| **marketingAreaId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **marketingAreaUpdateDto** | [**MarketingAreaUpdateDto**](MarketingAreaUpdateDto.md)|  | [optional] |

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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

