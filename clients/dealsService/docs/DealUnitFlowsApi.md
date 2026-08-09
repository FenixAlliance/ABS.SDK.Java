# DealUnitFlowsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDealUnitFlowAsync**](DealUnitFlowsApi.md#createDealUnitFlowAsync) | **POST** /api/v2/DealsService/DealUnitFlows | Create a deal unit flow |
| [**createDealUnitFlowStageAsync**](DealUnitFlowsApi.md#createDealUnitFlowStageAsync) | **POST** /api/v2/DealsService/DealUnitFlows/{dealUnitFlowId}/Stages | Create a deal unit flow stage |
| [**deleteDealUnitFlowAsync**](DealUnitFlowsApi.md#deleteDealUnitFlowAsync) | **DELETE** /api/v2/DealsService/DealUnitFlows/{dealUnitFlowId} | Delete a deal unit flow |
| [**deleteDealUnitFlowStageAsync**](DealUnitFlowsApi.md#deleteDealUnitFlowStageAsync) | **DELETE** /api/v2/DealsService/DealUnitFlows/{dealUnitFlowId}/Stages/{dealUnitFlowStageId} | Delete a deal unit flow stage |
| [**getDealUnitFlowAsync**](DealUnitFlowsApi.md#getDealUnitFlowAsync) | **GET** /api/v2/DealsService/DealUnitFlows/{dealUnitFlowId} | Get deal unit flow by ID |
| [**getDealUnitFlowStageAsync**](DealUnitFlowsApi.md#getDealUnitFlowStageAsync) | **GET** /api/v2/DealsService/DealUnitFlows/{dealUnitFlowId}/Stages/{dealUnitFlowStageId} | Get a deal unit flow stage by ID |
| [**getDealUnitFlowStagesAsync**](DealUnitFlowsApi.md#getDealUnitFlowStagesAsync) | **GET** /api/v2/DealsService/DealUnitFlows/{dealUnitFlowId}/Stages | Get stages for a deal unit flow |
| [**getDealUnitFlowStagesCountAsync**](DealUnitFlowsApi.md#getDealUnitFlowStagesCountAsync) | **GET** /api/v2/DealsService/DealUnitFlows/{dealUnitFlowId}/Stages/Count | Get stages count for a deal unit flow |
| [**getDealUnitFlowsAsync**](DealUnitFlowsApi.md#getDealUnitFlowsAsync) | **GET** /api/v2/DealsService/DealUnitFlows | Get deal unit flows |
| [**getDealUnitFlowsCountAsync**](DealUnitFlowsApi.md#getDealUnitFlowsCountAsync) | **GET** /api/v2/DealsService/DealUnitFlows/Count | Get deal unit flows count |
| [**patchDealUnitFlowAsync**](DealUnitFlowsApi.md#patchDealUnitFlowAsync) | **PATCH** /api/v2/DealsService/DealUnitFlows/{dealUnitFlowId} | Patch a deal unit flow |
| [**patchDealUnitFlowStageAsync**](DealUnitFlowsApi.md#patchDealUnitFlowStageAsync) | **PATCH** /api/v2/DealsService/DealUnitFlows/{dealUnitFlowId}/Stages/{dealUnitFlowStageId} | Patch a deal unit flow stage |
| [**updateDealUnitFlowAsync**](DealUnitFlowsApi.md#updateDealUnitFlowAsync) | **PUT** /api/v2/DealsService/DealUnitFlows/{dealUnitFlowId} | Update a deal unit flow |
| [**updateDealUnitFlowStageAsync**](DealUnitFlowsApi.md#updateDealUnitFlowStageAsync) | **PUT** /api/v2/DealsService/DealUnitFlows/{dealUnitFlowId}/Stages/{dealUnitFlowStageId} | Update a deal unit flow stage |


<a id="createDealUnitFlowAsync"></a>
# **createDealUnitFlowAsync**
> EmptyEnvelope createDealUnitFlowAsync(tenantId, dealUnitFlowCreateDto)

Create a deal unit flow

Creates a new deal unit flow for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitFlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    DealUnitFlowsApi apiInstance = new DealUnitFlowsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    DealUnitFlowCreateDto dealUnitFlowCreateDto = new DealUnitFlowCreateDto(); // DealUnitFlowCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createDealUnitFlowAsync(tenantId, dealUnitFlowCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitFlowsApi#createDealUnitFlowAsync");
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
| **dealUnitFlowCreateDto** | [**DealUnitFlowCreateDto**](DealUnitFlowCreateDto.md)|  | [optional] |

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

<a id="createDealUnitFlowStageAsync"></a>
# **createDealUnitFlowStageAsync**
> EmptyEnvelope createDealUnitFlowStageAsync(tenantId, dealUnitFlowId, dealUnitFlowStageCreateDto)

Create a deal unit flow stage

Creates a new stage within a specific deal unit flow.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitFlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    DealUnitFlowsApi apiInstance = new DealUnitFlowsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID dealUnitFlowId = UUID.randomUUID(); // UUID | 
    DealUnitFlowStageCreateDto dealUnitFlowStageCreateDto = new DealUnitFlowStageCreateDto(); // DealUnitFlowStageCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createDealUnitFlowStageAsync(tenantId, dealUnitFlowId, dealUnitFlowStageCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitFlowsApi#createDealUnitFlowStageAsync");
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
| **dealUnitFlowId** | **UUID**|  | |
| **dealUnitFlowStageCreateDto** | [**DealUnitFlowStageCreateDto**](DealUnitFlowStageCreateDto.md)|  | [optional] |

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

<a id="deleteDealUnitFlowAsync"></a>
# **deleteDealUnitFlowAsync**
> EmptyEnvelope deleteDealUnitFlowAsync(tenantId, dealUnitFlowId)

Delete a deal unit flow

Deletes an existing deal unit flow by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitFlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    DealUnitFlowsApi apiInstance = new DealUnitFlowsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID dealUnitFlowId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.deleteDealUnitFlowAsync(tenantId, dealUnitFlowId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitFlowsApi#deleteDealUnitFlowAsync");
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
| **dealUnitFlowId** | **UUID**|  | |

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

<a id="deleteDealUnitFlowStageAsync"></a>
# **deleteDealUnitFlowStageAsync**
> EmptyEnvelope deleteDealUnitFlowStageAsync(tenantId, dealUnitFlowId, dealUnitFlowStageId)

Delete a deal unit flow stage

Deletes an existing stage from a specific deal unit flow.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitFlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    DealUnitFlowsApi apiInstance = new DealUnitFlowsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID dealUnitFlowId = UUID.randomUUID(); // UUID | 
    UUID dealUnitFlowStageId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.deleteDealUnitFlowStageAsync(tenantId, dealUnitFlowId, dealUnitFlowStageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitFlowsApi#deleteDealUnitFlowStageAsync");
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
| **dealUnitFlowId** | **UUID**|  | |
| **dealUnitFlowStageId** | **UUID**|  | |

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

<a id="getDealUnitFlowAsync"></a>
# **getDealUnitFlowAsync**
> DealUnitFlowDtoEnvelope getDealUnitFlowAsync(tenantId, dealUnitFlowId)

Get deal unit flow by ID

Retrieves a single deal unit flow by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitFlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    DealUnitFlowsApi apiInstance = new DealUnitFlowsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID dealUnitFlowId = UUID.randomUUID(); // UUID | 
    try {
      DealUnitFlowDtoEnvelope result = apiInstance.getDealUnitFlowAsync(tenantId, dealUnitFlowId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitFlowsApi#getDealUnitFlowAsync");
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
| **dealUnitFlowId** | **UUID**|  | |

### Return type

[**DealUnitFlowDtoEnvelope**](DealUnitFlowDtoEnvelope.md)

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

<a id="getDealUnitFlowStageAsync"></a>
# **getDealUnitFlowStageAsync**
> DealUnitFlowStageDtoEnvelope getDealUnitFlowStageAsync(tenantId, dealUnitFlowId, dealUnitFlowStageId)

Get a deal unit flow stage by ID

Retrieves a single stage for a specific deal unit flow by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitFlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    DealUnitFlowsApi apiInstance = new DealUnitFlowsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID dealUnitFlowId = UUID.randomUUID(); // UUID | 
    UUID dealUnitFlowStageId = UUID.randomUUID(); // UUID | 
    try {
      DealUnitFlowStageDtoEnvelope result = apiInstance.getDealUnitFlowStageAsync(tenantId, dealUnitFlowId, dealUnitFlowStageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitFlowsApi#getDealUnitFlowStageAsync");
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
| **dealUnitFlowId** | **UUID**|  | |
| **dealUnitFlowStageId** | **UUID**|  | |

### Return type

[**DealUnitFlowStageDtoEnvelope**](DealUnitFlowStageDtoEnvelope.md)

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

<a id="getDealUnitFlowStagesAsync"></a>
# **getDealUnitFlowStagesAsync**
> DealUnitFlowStageDtoListEnvelope getDealUnitFlowStagesAsync(tenantId, dealUnitFlowId, dealUnitFlowStageDtoCollectionQueryParameters)

Get stages for a deal unit flow

Retrieves a list of stages for a specific deal unit flow with OData query support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitFlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    DealUnitFlowsApi apiInstance = new DealUnitFlowsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID dealUnitFlowId = UUID.randomUUID(); // UUID | 
    DealUnitFlowStageDtoCollectionQueryParameters dealUnitFlowStageDtoCollectionQueryParameters = new DealUnitFlowStageDtoCollectionQueryParameters(); // DealUnitFlowStageDtoCollectionQueryParameters | 
    try {
      DealUnitFlowStageDtoListEnvelope result = apiInstance.getDealUnitFlowStagesAsync(tenantId, dealUnitFlowId, dealUnitFlowStageDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitFlowsApi#getDealUnitFlowStagesAsync");
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
| **dealUnitFlowId** | **UUID**|  | |
| **dealUnitFlowStageDtoCollectionQueryParameters** | [**DealUnitFlowStageDtoCollectionQueryParameters**](DealUnitFlowStageDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**DealUnitFlowStageDtoListEnvelope**](DealUnitFlowStageDtoListEnvelope.md)

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

<a id="getDealUnitFlowStagesCountAsync"></a>
# **getDealUnitFlowStagesCountAsync**
> Int32Envelope getDealUnitFlowStagesCountAsync(tenantId, dealUnitFlowId, dealUnitFlowStageDtoCollectionQueryParameters)

Get stages count for a deal unit flow

Returns the total count of stages for a specific deal unit flow with OData filter support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitFlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    DealUnitFlowsApi apiInstance = new DealUnitFlowsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID dealUnitFlowId = UUID.randomUUID(); // UUID | 
    DealUnitFlowStageDtoCollectionQueryParameters dealUnitFlowStageDtoCollectionQueryParameters = new DealUnitFlowStageDtoCollectionQueryParameters(); // DealUnitFlowStageDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getDealUnitFlowStagesCountAsync(tenantId, dealUnitFlowId, dealUnitFlowStageDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitFlowsApi#getDealUnitFlowStagesCountAsync");
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
| **dealUnitFlowId** | **UUID**|  | |
| **dealUnitFlowStageDtoCollectionQueryParameters** | [**DealUnitFlowStageDtoCollectionQueryParameters**](DealUnitFlowStageDtoCollectionQueryParameters.md)|  | [optional] |

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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getDealUnitFlowsAsync"></a>
# **getDealUnitFlowsAsync**
> DealUnitFlowDtoListEnvelope getDealUnitFlowsAsync(tenantId, dealUnitFlowDtoCollectionQueryParameters)

Get deal unit flows

Retrieves a list of deal unit flows for the specified tenant with OData query support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitFlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    DealUnitFlowsApi apiInstance = new DealUnitFlowsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    DealUnitFlowDtoCollectionQueryParameters dealUnitFlowDtoCollectionQueryParameters = new DealUnitFlowDtoCollectionQueryParameters(); // DealUnitFlowDtoCollectionQueryParameters | 
    try {
      DealUnitFlowDtoListEnvelope result = apiInstance.getDealUnitFlowsAsync(tenantId, dealUnitFlowDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitFlowsApi#getDealUnitFlowsAsync");
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
| **dealUnitFlowDtoCollectionQueryParameters** | [**DealUnitFlowDtoCollectionQueryParameters**](DealUnitFlowDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**DealUnitFlowDtoListEnvelope**](DealUnitFlowDtoListEnvelope.md)

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

<a id="getDealUnitFlowsCountAsync"></a>
# **getDealUnitFlowsCountAsync**
> Int32Envelope getDealUnitFlowsCountAsync(tenantId, dealUnitFlowDtoCollectionQueryParameters)

Get deal unit flows count

Returns the total count of deal unit flows for the specified tenant with OData filter support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitFlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    DealUnitFlowsApi apiInstance = new DealUnitFlowsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    DealUnitFlowDtoCollectionQueryParameters dealUnitFlowDtoCollectionQueryParameters = new DealUnitFlowDtoCollectionQueryParameters(); // DealUnitFlowDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getDealUnitFlowsCountAsync(tenantId, dealUnitFlowDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitFlowsApi#getDealUnitFlowsCountAsync");
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
| **dealUnitFlowDtoCollectionQueryParameters** | [**DealUnitFlowDtoCollectionQueryParameters**](DealUnitFlowDtoCollectionQueryParameters.md)|  | [optional] |

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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="patchDealUnitFlowAsync"></a>
# **patchDealUnitFlowAsync**
> EmptyEnvelope patchDealUnitFlowAsync(tenantId, dealUnitFlowId, patchOperation)

Patch a deal unit flow

Partially updates an existing deal unit flow by its unique identifier using a JSON Patch document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitFlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    DealUnitFlowsApi apiInstance = new DealUnitFlowsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID dealUnitFlowId = UUID.randomUUID(); // UUID | 
    List<PatchOperation> patchOperation = Arrays.asList(); // List<PatchOperation> | 
    try {
      EmptyEnvelope result = apiInstance.patchDealUnitFlowAsync(tenantId, dealUnitFlowId, patchOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitFlowsApi#patchDealUnitFlowAsync");
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
| **dealUnitFlowId** | **UUID**|  | |
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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="patchDealUnitFlowStageAsync"></a>
# **patchDealUnitFlowStageAsync**
> EmptyEnvelope patchDealUnitFlowStageAsync(tenantId, dealUnitFlowId, dealUnitFlowStageId, patchOperation)

Patch a deal unit flow stage

Partially updates an existing stage within a specific deal unit flow using a JSON Patch document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitFlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    DealUnitFlowsApi apiInstance = new DealUnitFlowsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID dealUnitFlowId = UUID.randomUUID(); // UUID | 
    UUID dealUnitFlowStageId = UUID.randomUUID(); // UUID | 
    List<PatchOperation> patchOperation = Arrays.asList(); // List<PatchOperation> | 
    try {
      EmptyEnvelope result = apiInstance.patchDealUnitFlowStageAsync(tenantId, dealUnitFlowId, dealUnitFlowStageId, patchOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitFlowsApi#patchDealUnitFlowStageAsync");
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
| **dealUnitFlowId** | **UUID**|  | |
| **dealUnitFlowStageId** | **UUID**|  | |
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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="updateDealUnitFlowAsync"></a>
# **updateDealUnitFlowAsync**
> EmptyEnvelope updateDealUnitFlowAsync(tenantId, dealUnitFlowId, dealUnitFlowUpdateDto)

Update a deal unit flow

Updates an existing deal unit flow by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitFlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    DealUnitFlowsApi apiInstance = new DealUnitFlowsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID dealUnitFlowId = UUID.randomUUID(); // UUID | 
    DealUnitFlowUpdateDto dealUnitFlowUpdateDto = new DealUnitFlowUpdateDto(); // DealUnitFlowUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateDealUnitFlowAsync(tenantId, dealUnitFlowId, dealUnitFlowUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitFlowsApi#updateDealUnitFlowAsync");
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
| **dealUnitFlowId** | **UUID**|  | |
| **dealUnitFlowUpdateDto** | [**DealUnitFlowUpdateDto**](DealUnitFlowUpdateDto.md)|  | [optional] |

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

<a id="updateDealUnitFlowStageAsync"></a>
# **updateDealUnitFlowStageAsync**
> EmptyEnvelope updateDealUnitFlowStageAsync(tenantId, dealUnitFlowId, dealUnitFlowStageId, dealUnitFlowStageUpdateDto)

Update a deal unit flow stage

Updates an existing stage within a specific deal unit flow.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitFlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    DealUnitFlowsApi apiInstance = new DealUnitFlowsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID dealUnitFlowId = UUID.randomUUID(); // UUID | 
    UUID dealUnitFlowStageId = UUID.randomUUID(); // UUID | 
    DealUnitFlowStageUpdateDto dealUnitFlowStageUpdateDto = new DealUnitFlowStageUpdateDto(); // DealUnitFlowStageUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateDealUnitFlowStageAsync(tenantId, dealUnitFlowId, dealUnitFlowStageId, dealUnitFlowStageUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitFlowsApi#updateDealUnitFlowStageAsync");
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
| **dealUnitFlowId** | **UUID**|  | |
| **dealUnitFlowStageId** | **UUID**|  | |
| **dealUnitFlowStageUpdateDto** | [**DealUnitFlowStageUpdateDto**](DealUnitFlowStageUpdateDto.md)|  | [optional] |

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

