# ShippingRegionsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createShippingRegionAsync**](ShippingRegionsApi.md#createShippingRegionAsync) | **POST** /api/v2/ShipmentsService/ShippingRegions | Create a shipping region |
| [**deleteShippingRegionAsync**](ShippingRegionsApi.md#deleteShippingRegionAsync) | **DELETE** /api/v2/ShipmentsService/ShippingRegions/{regionId} | Delete a shipping region |
| [**getShippingRegionByIdAsync**](ShippingRegionsApi.md#getShippingRegionByIdAsync) | **GET** /api/v2/ShipmentsService/ShippingRegions/{regionId} | Get shipping region by ID |
| [**getShippingRegionsAsync**](ShippingRegionsApi.md#getShippingRegionsAsync) | **GET** /api/v2/ShipmentsService/ShippingRegions | Get all shipping regions |
| [**getShippingRegionsCountAsync**](ShippingRegionsApi.md#getShippingRegionsCountAsync) | **GET** /api/v2/ShipmentsService/ShippingRegions/Count | Get shipping regions count |
| [**patchShippingRegionAsync**](ShippingRegionsApi.md#patchShippingRegionAsync) | **PATCH** /api/v2/ShipmentsService/ShippingRegions/{regionId} | Patch a shipping region |
| [**updateShippingRegionAsync**](ShippingRegionsApi.md#updateShippingRegionAsync) | **PUT** /api/v2/ShipmentsService/ShippingRegions/{regionId} | Update a shipping region |


<a id="createShippingRegionAsync"></a>
# **createShippingRegionAsync**
> createShippingRegionAsync(tenantId, apiVersion, xApiVersion, shippingRegionCreateDto)

Create a shipping region

Creates a new shipping region.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShippingRegionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ShippingRegionsApi apiInstance = new ShippingRegionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ShippingRegionCreateDto shippingRegionCreateDto = new ShippingRegionCreateDto(); // ShippingRegionCreateDto | 
    try {
      apiInstance.createShippingRegionAsync(tenantId, apiVersion, xApiVersion, shippingRegionCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingRegionsApi#createShippingRegionAsync");
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
| **shippingRegionCreateDto** | [**ShippingRegionCreateDto**](ShippingRegionCreateDto.md)|  | [optional] |

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

<a id="deleteShippingRegionAsync"></a>
# **deleteShippingRegionAsync**
> deleteShippingRegionAsync(tenantId, regionId, apiVersion, xApiVersion)

Delete a shipping region

Deletes a shipping region.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShippingRegionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ShippingRegionsApi apiInstance = new ShippingRegionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID regionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteShippingRegionAsync(tenantId, regionId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingRegionsApi#deleteShippingRegionAsync");
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
| **regionId** | **UUID**|  | |
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

<a id="getShippingRegionByIdAsync"></a>
# **getShippingRegionByIdAsync**
> ShippingRegionDtoEnvelope getShippingRegionByIdAsync(tenantId, regionId, apiVersion, xApiVersion)

Get shipping region by ID

Retrieves a specific shipping region.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShippingRegionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ShippingRegionsApi apiInstance = new ShippingRegionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID regionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ShippingRegionDtoEnvelope result = apiInstance.getShippingRegionByIdAsync(tenantId, regionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingRegionsApi#getShippingRegionByIdAsync");
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
| **regionId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ShippingRegionDtoEnvelope**](ShippingRegionDtoEnvelope.md)

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

<a id="getShippingRegionsAsync"></a>
# **getShippingRegionsAsync**
> ShippingRegionDtoListEnvelope getShippingRegionsAsync(tenantId, apiVersion, xApiVersion, shippingRegionDtoCollectionQueryParameters)

Get all shipping regions

Retrieves all shipping regions for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShippingRegionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ShippingRegionsApi apiInstance = new ShippingRegionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ShippingRegionDtoCollectionQueryParameters shippingRegionDtoCollectionQueryParameters = new ShippingRegionDtoCollectionQueryParameters(); // ShippingRegionDtoCollectionQueryParameters | 
    try {
      ShippingRegionDtoListEnvelope result = apiInstance.getShippingRegionsAsync(tenantId, apiVersion, xApiVersion, shippingRegionDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingRegionsApi#getShippingRegionsAsync");
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
| **shippingRegionDtoCollectionQueryParameters** | [**ShippingRegionDtoCollectionQueryParameters**](ShippingRegionDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**ShippingRegionDtoListEnvelope**](ShippingRegionDtoListEnvelope.md)

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

<a id="getShippingRegionsCountAsync"></a>
# **getShippingRegionsCountAsync**
> Int32Envelope getShippingRegionsCountAsync(tenantId, apiVersion, xApiVersion, shippingRegionDtoCollectionQueryParameters)

Get shipping regions count

Returns the count of shipping regions.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShippingRegionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ShippingRegionsApi apiInstance = new ShippingRegionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ShippingRegionDtoCollectionQueryParameters shippingRegionDtoCollectionQueryParameters = new ShippingRegionDtoCollectionQueryParameters(); // ShippingRegionDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getShippingRegionsCountAsync(tenantId, apiVersion, xApiVersion, shippingRegionDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingRegionsApi#getShippingRegionsCountAsync");
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
| **shippingRegionDtoCollectionQueryParameters** | [**ShippingRegionDtoCollectionQueryParameters**](ShippingRegionDtoCollectionQueryParameters.md)|  | [optional] |

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
| **200** | OK |  -  |

<a id="patchShippingRegionAsync"></a>
# **patchShippingRegionAsync**
> EmptyEnvelope patchShippingRegionAsync(tenantId, regionId, apiVersion, xApiVersion, patchOperation)

Patch a shipping region

Partially updates an existing shipping region using JSON Patch.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShippingRegionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ShippingRegionsApi apiInstance = new ShippingRegionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID regionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    List<PatchOperation> patchOperation = Arrays.asList(); // List<PatchOperation> | 
    try {
      EmptyEnvelope result = apiInstance.patchShippingRegionAsync(tenantId, regionId, apiVersion, xApiVersion, patchOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingRegionsApi#patchShippingRegionAsync");
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
| **regionId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
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
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="updateShippingRegionAsync"></a>
# **updateShippingRegionAsync**
> updateShippingRegionAsync(tenantId, regionId, apiVersion, xApiVersion, shippingRegionUpdateDto)

Update a shipping region

Updates an existing shipping region.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShippingRegionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ShippingRegionsApi apiInstance = new ShippingRegionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID regionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ShippingRegionUpdateDto shippingRegionUpdateDto = new ShippingRegionUpdateDto(); // ShippingRegionUpdateDto | 
    try {
      apiInstance.updateShippingRegionAsync(tenantId, regionId, apiVersion, xApiVersion, shippingRegionUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingRegionsApi#updateShippingRegionAsync");
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
| **regionId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **shippingRegionUpdateDto** | [**ShippingRegionUpdateDto**](ShippingRegionUpdateDto.md)|  | [optional] |

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

