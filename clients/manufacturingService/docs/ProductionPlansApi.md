# ProductionPlansApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createProductionPlanAsync**](ProductionPlansApi.md#createProductionPlanAsync) | **POST** /api/v2/ManufacturingService/ProductionPlans | Create a new production plan |
| [**deleteProductionPlanAsync**](ProductionPlansApi.md#deleteProductionPlanAsync) | **DELETE** /api/v2/ManufacturingService/ProductionPlans/{id} | Delete a production plan |
| [**getProductionPlanByIdAsync**](ProductionPlansApi.md#getProductionPlanByIdAsync) | **GET** /api/v2/ManufacturingService/ProductionPlans/{id} | Get production plan by ID |
| [**getProductionPlansAsync**](ProductionPlansApi.md#getProductionPlansAsync) | **GET** /api/v2/ManufacturingService/ProductionPlans | Get all production plans |
| [**getProductionPlansCountAsync**](ProductionPlansApi.md#getProductionPlansCountAsync) | **GET** /api/v2/ManufacturingService/ProductionPlans/Count | Get production plans count |
| [**patchProductionPlanAsync**](ProductionPlansApi.md#patchProductionPlanAsync) | **PATCH** /api/v2/ManufacturingService/ProductionPlans/{id} | Patch a production plan |
| [**updateProductionPlanAsync**](ProductionPlansApi.md#updateProductionPlanAsync) | **PUT** /api/v2/ManufacturingService/ProductionPlans/{id} | Update a production plan |


<a id="createProductionPlanAsync"></a>
# **createProductionPlanAsync**
> createProductionPlanAsync(tenantId, apiVersion, xApiVersion, productionPlanCreateDto)

Create a new production plan

Creates a new production plan for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductionPlansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ProductionPlansApi apiInstance = new ProductionPlansApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ProductionPlanCreateDto productionPlanCreateDto = new ProductionPlanCreateDto(); // ProductionPlanCreateDto | 
    try {
      apiInstance.createProductionPlanAsync(tenantId, apiVersion, xApiVersion, productionPlanCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductionPlansApi#createProductionPlanAsync");
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
| **productionPlanCreateDto** | [**ProductionPlanCreateDto**](ProductionPlanCreateDto.md)|  | [optional] |

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
| **403** | Forbidden |  -  |
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

<a id="deleteProductionPlanAsync"></a>
# **deleteProductionPlanAsync**
> deleteProductionPlanAsync(tenantId, id, apiVersion, xApiVersion)

Delete a production plan

Deletes a production plan for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductionPlansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ProductionPlansApi apiInstance = new ProductionPlansApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteProductionPlanAsync(tenantId, id, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductionPlansApi#deleteProductionPlanAsync");
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
| **id** | **UUID**|  | |
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
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getProductionPlanByIdAsync"></a>
# **getProductionPlanByIdAsync**
> ProductionPlanDto getProductionPlanByIdAsync(tenantId, id, apiVersion, xApiVersion)

Get production plan by ID

Retrieves a specific production plan by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductionPlansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ProductionPlansApi apiInstance = new ProductionPlansApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ProductionPlanDto result = apiInstance.getProductionPlanByIdAsync(tenantId, id, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductionPlansApi#getProductionPlanByIdAsync");
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
| **id** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ProductionPlanDto**](ProductionPlanDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getProductionPlansAsync"></a>
# **getProductionPlansAsync**
> ProductionPlanDtoListEnvelope getProductionPlansAsync(tenantId, apiVersion, xApiVersion, productionPlanDtoCollectionQueryParameters)

Get all production plans

Retrieves all production plans for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductionPlansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ProductionPlansApi apiInstance = new ProductionPlansApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ProductionPlanDtoCollectionQueryParameters productionPlanDtoCollectionQueryParameters = new ProductionPlanDtoCollectionQueryParameters(); // ProductionPlanDtoCollectionQueryParameters | 
    try {
      ProductionPlanDtoListEnvelope result = apiInstance.getProductionPlansAsync(tenantId, apiVersion, xApiVersion, productionPlanDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductionPlansApi#getProductionPlansAsync");
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
| **productionPlanDtoCollectionQueryParameters** | [**ProductionPlanDtoCollectionQueryParameters**](ProductionPlanDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**ProductionPlanDtoListEnvelope**](ProductionPlanDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **200** | OK |  -  |

<a id="getProductionPlansCountAsync"></a>
# **getProductionPlansCountAsync**
> Int32Envelope getProductionPlansCountAsync(tenantId, apiVersion, xApiVersion, productionPlanDtoCollectionQueryParameters)

Get production plans count

Returns the count of production plans for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductionPlansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ProductionPlansApi apiInstance = new ProductionPlansApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ProductionPlanDtoCollectionQueryParameters productionPlanDtoCollectionQueryParameters = new ProductionPlanDtoCollectionQueryParameters(); // ProductionPlanDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getProductionPlansCountAsync(tenantId, apiVersion, xApiVersion, productionPlanDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductionPlansApi#getProductionPlansCountAsync");
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
| **productionPlanDtoCollectionQueryParameters** | [**ProductionPlanDtoCollectionQueryParameters**](ProductionPlanDtoCollectionQueryParameters.md)|  | [optional] |

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
| **200** | OK |  -  |

<a id="patchProductionPlanAsync"></a>
# **patchProductionPlanAsync**
> EmptyEnvelope patchProductionPlanAsync(tenantId, id, apiVersion, xApiVersion, patchOperation)

Patch a production plan

Patch a production plan

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductionPlansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ProductionPlansApi apiInstance = new ProductionPlansApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    List<PatchOperation> patchOperation = Arrays.asList(); // List<PatchOperation> | 
    try {
      EmptyEnvelope result = apiInstance.patchProductionPlanAsync(tenantId, id, apiVersion, xApiVersion, patchOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductionPlansApi#patchProductionPlanAsync");
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
| **id** | **UUID**|  | |
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
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="updateProductionPlanAsync"></a>
# **updateProductionPlanAsync**
> updateProductionPlanAsync(tenantId, id, apiVersion, xApiVersion, productionPlanUpdateDto)

Update a production plan

Updates an existing production plan for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductionPlansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ProductionPlansApi apiInstance = new ProductionPlansApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ProductionPlanUpdateDto productionPlanUpdateDto = new ProductionPlanUpdateDto(); // ProductionPlanUpdateDto | 
    try {
      apiInstance.updateProductionPlanAsync(tenantId, id, apiVersion, xApiVersion, productionPlanUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductionPlansApi#updateProductionPlanAsync");
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
| **id** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **productionPlanUpdateDto** | [**ProductionPlanUpdateDto**](ProductionPlanUpdateDto.md)|  | [optional] |

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
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **200** | OK |  -  |

