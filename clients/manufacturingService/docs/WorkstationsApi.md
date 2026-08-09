# WorkstationsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createWorkstationAsync**](WorkstationsApi.md#createWorkstationAsync) | **POST** /api/v2/ManufacturingService/Workstations | Create a new workstation |
| [**deleteWorkstationAsync**](WorkstationsApi.md#deleteWorkstationAsync) | **DELETE** /api/v2/ManufacturingService/Workstations/{id} | Delete a workstation |
| [**getWorkstationByIdAsync**](WorkstationsApi.md#getWorkstationByIdAsync) | **GET** /api/v2/ManufacturingService/Workstations/{id} | Get workstation by ID |
| [**getWorkstationsAsync**](WorkstationsApi.md#getWorkstationsAsync) | **GET** /api/v2/ManufacturingService/Workstations | Get all workstations |
| [**getWorkstationsCountAsync**](WorkstationsApi.md#getWorkstationsCountAsync) | **GET** /api/v2/ManufacturingService/Workstations/Count | Get workstations count |
| [**patchWorkstationAsync**](WorkstationsApi.md#patchWorkstationAsync) | **PATCH** /api/v2/ManufacturingService/Workstations/{id} | Patch a workstation |
| [**updateWorkstationAsync**](WorkstationsApi.md#updateWorkstationAsync) | **PUT** /api/v2/ManufacturingService/Workstations/{id} | Update a workstation |


<a id="createWorkstationAsync"></a>
# **createWorkstationAsync**
> createWorkstationAsync(tenantId, apiVersion, xApiVersion, workstationCreateDto)

Create a new workstation

Creates a new workstation for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkstationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    WorkstationsApi apiInstance = new WorkstationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    WorkstationCreateDto workstationCreateDto = new WorkstationCreateDto(); // WorkstationCreateDto | 
    try {
      apiInstance.createWorkstationAsync(tenantId, apiVersion, xApiVersion, workstationCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkstationsApi#createWorkstationAsync");
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
| **workstationCreateDto** | [**WorkstationCreateDto**](WorkstationCreateDto.md)|  | [optional] |

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

<a id="deleteWorkstationAsync"></a>
# **deleteWorkstationAsync**
> deleteWorkstationAsync(tenantId, id, apiVersion, xApiVersion)

Delete a workstation

Deletes a workstation for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkstationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    WorkstationsApi apiInstance = new WorkstationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteWorkstationAsync(tenantId, id, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkstationsApi#deleteWorkstationAsync");
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

<a id="getWorkstationByIdAsync"></a>
# **getWorkstationByIdAsync**
> WorkstationDto getWorkstationByIdAsync(tenantId, id, apiVersion, xApiVersion)

Get workstation by ID

Retrieves a specific workstation by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkstationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    WorkstationsApi apiInstance = new WorkstationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      WorkstationDto result = apiInstance.getWorkstationByIdAsync(tenantId, id, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkstationsApi#getWorkstationByIdAsync");
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

[**WorkstationDto**](WorkstationDto.md)

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

<a id="getWorkstationsAsync"></a>
# **getWorkstationsAsync**
> WorkstationDtoListEnvelope getWorkstationsAsync(tenantId, apiVersion, xApiVersion, workstationDtoCollectionQueryParameters)

Get all workstations

Retrieves all workstations for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkstationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    WorkstationsApi apiInstance = new WorkstationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    WorkstationDtoCollectionQueryParameters workstationDtoCollectionQueryParameters = new WorkstationDtoCollectionQueryParameters(); // WorkstationDtoCollectionQueryParameters | 
    try {
      WorkstationDtoListEnvelope result = apiInstance.getWorkstationsAsync(tenantId, apiVersion, xApiVersion, workstationDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkstationsApi#getWorkstationsAsync");
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
| **workstationDtoCollectionQueryParameters** | [**WorkstationDtoCollectionQueryParameters**](WorkstationDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**WorkstationDtoListEnvelope**](WorkstationDtoListEnvelope.md)

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

<a id="getWorkstationsCountAsync"></a>
# **getWorkstationsCountAsync**
> Int32Envelope getWorkstationsCountAsync(tenantId, apiVersion, xApiVersion, workstationDtoCollectionQueryParameters)

Get workstations count

Returns the count of workstations for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkstationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    WorkstationsApi apiInstance = new WorkstationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    WorkstationDtoCollectionQueryParameters workstationDtoCollectionQueryParameters = new WorkstationDtoCollectionQueryParameters(); // WorkstationDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getWorkstationsCountAsync(tenantId, apiVersion, xApiVersion, workstationDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkstationsApi#getWorkstationsCountAsync");
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
| **workstationDtoCollectionQueryParameters** | [**WorkstationDtoCollectionQueryParameters**](WorkstationDtoCollectionQueryParameters.md)|  | [optional] |

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

<a id="patchWorkstationAsync"></a>
# **patchWorkstationAsync**
> EmptyEnvelope patchWorkstationAsync(tenantId, id, apiVersion, xApiVersion, patchOperation)

Patch a workstation

Patch a workstation

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkstationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    WorkstationsApi apiInstance = new WorkstationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    List<PatchOperation> patchOperation = Arrays.asList(); // List<PatchOperation> | 
    try {
      EmptyEnvelope result = apiInstance.patchWorkstationAsync(tenantId, id, apiVersion, xApiVersion, patchOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkstationsApi#patchWorkstationAsync");
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

<a id="updateWorkstationAsync"></a>
# **updateWorkstationAsync**
> updateWorkstationAsync(tenantId, id, apiVersion, xApiVersion, workstationUpdateDto)

Update a workstation

Updates an existing workstation for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkstationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    WorkstationsApi apiInstance = new WorkstationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    WorkstationUpdateDto workstationUpdateDto = new WorkstationUpdateDto(); // WorkstationUpdateDto | 
    try {
      apiInstance.updateWorkstationAsync(tenantId, id, apiVersion, xApiVersion, workstationUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkstationsApi#updateWorkstationAsync");
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
| **workstationUpdateDto** | [**WorkstationUpdateDto**](WorkstationUpdateDto.md)|  | [optional] |

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

