# SalesLiteraturesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**countSalesLiteraturesAsync**](SalesLiteraturesApi.md#countSalesLiteraturesAsync) | **GET** /api/v2/SalesService/SalesLiteratures/Count | Get sales literatures count |
| [**createSalesLiteratureAsync**](SalesLiteraturesApi.md#createSalesLiteratureAsync) | **POST** /api/v2/SalesService/SalesLiteratures | Create a sales literature |
| [**deleteSalesLiteratureAsync**](SalesLiteraturesApi.md#deleteSalesLiteratureAsync) | **DELETE** /api/v2/SalesService/SalesLiteratures/{salesLiteratureId} | Delete a sales literature |
| [**getExtendedSalesLiteraturesAsync**](SalesLiteraturesApi.md#getExtendedSalesLiteraturesAsync) | **GET** /api/v2/SalesService/SalesLiteratures/Extended | Get extended sales literatures |
| [**getSalesLiteratureAsync**](SalesLiteraturesApi.md#getSalesLiteratureAsync) | **GET** /api/v2/SalesService/SalesLiteratures/{salesLiteratureId} | Get sales literature by ID |
| [**getSalesLiteraturesAsync**](SalesLiteraturesApi.md#getSalesLiteraturesAsync) | **GET** /api/v2/SalesService/SalesLiteratures | Get sales literatures |
| [**patchSalesLiteratureAsync**](SalesLiteraturesApi.md#patchSalesLiteratureAsync) | **PATCH** /api/v2/SalesService/SalesLiteratures/{salesLiteratureId} | Patch a sales literature |
| [**updateSalesLiteratureAsync**](SalesLiteraturesApi.md#updateSalesLiteratureAsync) | **PUT** /api/v2/SalesService/SalesLiteratures/{salesLiteratureId} | Update a sales literature |


<a id="countSalesLiteraturesAsync"></a>
# **countSalesLiteraturesAsync**
> Int32Envelope countSalesLiteraturesAsync(tenantId, salesLiteratureDtoCollectionQueryParameters)

Get sales literatures count

Returns the total count of sales literatures for the specified tenant with OData filter support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SalesLiteraturesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SalesLiteraturesApi apiInstance = new SalesLiteraturesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    SalesLiteratureDtoCollectionQueryParameters salesLiteratureDtoCollectionQueryParameters = new SalesLiteratureDtoCollectionQueryParameters(); // SalesLiteratureDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.countSalesLiteraturesAsync(tenantId, salesLiteratureDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SalesLiteraturesApi#countSalesLiteraturesAsync");
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
| **salesLiteratureDtoCollectionQueryParameters** | [**SalesLiteratureDtoCollectionQueryParameters**](SalesLiteratureDtoCollectionQueryParameters.md)|  | [optional] |

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

<a id="createSalesLiteratureAsync"></a>
# **createSalesLiteratureAsync**
> EmptyEnvelope createSalesLiteratureAsync(tenantId, salesLiteratureCreateDto)

Create a sales literature

Creates a new sales literature for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SalesLiteraturesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SalesLiteraturesApi apiInstance = new SalesLiteraturesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    SalesLiteratureCreateDto salesLiteratureCreateDto = new SalesLiteratureCreateDto(); // SalesLiteratureCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createSalesLiteratureAsync(tenantId, salesLiteratureCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SalesLiteraturesApi#createSalesLiteratureAsync");
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
| **salesLiteratureCreateDto** | [**SalesLiteratureCreateDto**](SalesLiteratureCreateDto.md)|  | [optional] |

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

<a id="deleteSalesLiteratureAsync"></a>
# **deleteSalesLiteratureAsync**
> EmptyEnvelope deleteSalesLiteratureAsync(tenantId, salesLiteratureId)

Delete a sales literature

Deletes an existing sales literature by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SalesLiteraturesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SalesLiteraturesApi apiInstance = new SalesLiteraturesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID salesLiteratureId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.deleteSalesLiteratureAsync(tenantId, salesLiteratureId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SalesLiteraturesApi#deleteSalesLiteratureAsync");
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
| **salesLiteratureId** | **UUID**|  | |

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

<a id="getExtendedSalesLiteraturesAsync"></a>
# **getExtendedSalesLiteraturesAsync**
> ExtendedSalesLiteratureDtoListEnvelope getExtendedSalesLiteraturesAsync(tenantId, extendedSalesLiteratureDtoCollectionQueryParameters)

Get extended sales literatures

Retrieves a list of sales literatures with extended details for the specified tenant with OData query support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SalesLiteraturesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SalesLiteraturesApi apiInstance = new SalesLiteraturesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    ExtendedSalesLiteratureDtoCollectionQueryParameters extendedSalesLiteratureDtoCollectionQueryParameters = new ExtendedSalesLiteratureDtoCollectionQueryParameters(); // ExtendedSalesLiteratureDtoCollectionQueryParameters | 
    try {
      ExtendedSalesLiteratureDtoListEnvelope result = apiInstance.getExtendedSalesLiteraturesAsync(tenantId, extendedSalesLiteratureDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SalesLiteraturesApi#getExtendedSalesLiteraturesAsync");
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
| **extendedSalesLiteratureDtoCollectionQueryParameters** | [**ExtendedSalesLiteratureDtoCollectionQueryParameters**](ExtendedSalesLiteratureDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**ExtendedSalesLiteratureDtoListEnvelope**](ExtendedSalesLiteratureDtoListEnvelope.md)

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

<a id="getSalesLiteratureAsync"></a>
# **getSalesLiteratureAsync**
> SalesLiteratureDtoEnvelope getSalesLiteratureAsync(tenantId, salesLiteratureId)

Get sales literature by ID

Retrieves a single sales literature by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SalesLiteraturesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SalesLiteraturesApi apiInstance = new SalesLiteraturesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID salesLiteratureId = UUID.randomUUID(); // UUID | 
    try {
      SalesLiteratureDtoEnvelope result = apiInstance.getSalesLiteratureAsync(tenantId, salesLiteratureId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SalesLiteraturesApi#getSalesLiteratureAsync");
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
| **salesLiteratureId** | **UUID**|  | |

### Return type

[**SalesLiteratureDtoEnvelope**](SalesLiteratureDtoEnvelope.md)

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

<a id="getSalesLiteraturesAsync"></a>
# **getSalesLiteraturesAsync**
> SalesLiteratureDtoListEnvelope getSalesLiteraturesAsync(tenantId, salesLiteratureDtoCollectionQueryParameters)

Get sales literatures

Retrieves a list of sales literatures for the specified tenant with OData query support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SalesLiteraturesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SalesLiteraturesApi apiInstance = new SalesLiteraturesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    SalesLiteratureDtoCollectionQueryParameters salesLiteratureDtoCollectionQueryParameters = new SalesLiteratureDtoCollectionQueryParameters(); // SalesLiteratureDtoCollectionQueryParameters | 
    try {
      SalesLiteratureDtoListEnvelope result = apiInstance.getSalesLiteraturesAsync(tenantId, salesLiteratureDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SalesLiteraturesApi#getSalesLiteraturesAsync");
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
| **salesLiteratureDtoCollectionQueryParameters** | [**SalesLiteratureDtoCollectionQueryParameters**](SalesLiteratureDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**SalesLiteratureDtoListEnvelope**](SalesLiteratureDtoListEnvelope.md)

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

<a id="patchSalesLiteratureAsync"></a>
# **patchSalesLiteratureAsync**
> EmptyEnvelope patchSalesLiteratureAsync(tenantId, salesLiteratureId, patchOperation)

Patch a sales literature

Partially updates an existing sales literature using a JSON Patch document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SalesLiteraturesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SalesLiteraturesApi apiInstance = new SalesLiteraturesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID salesLiteratureId = UUID.randomUUID(); // UUID | 
    List<PatchOperation> patchOperation = Arrays.asList(); // List<PatchOperation> | 
    try {
      EmptyEnvelope result = apiInstance.patchSalesLiteratureAsync(tenantId, salesLiteratureId, patchOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SalesLiteraturesApi#patchSalesLiteratureAsync");
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
| **salesLiteratureId** | **UUID**|  | |
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

<a id="updateSalesLiteratureAsync"></a>
# **updateSalesLiteratureAsync**
> EmptyEnvelope updateSalesLiteratureAsync(tenantId, salesLiteratureId, salesLiteratureUpdateDto)

Update a sales literature

Updates an existing sales literature by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SalesLiteraturesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SalesLiteraturesApi apiInstance = new SalesLiteraturesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID salesLiteratureId = UUID.randomUUID(); // UUID | 
    SalesLiteratureUpdateDto salesLiteratureUpdateDto = new SalesLiteratureUpdateDto(); // SalesLiteratureUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateSalesLiteratureAsync(tenantId, salesLiteratureId, salesLiteratureUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SalesLiteraturesApi#updateSalesLiteratureAsync");
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
| **salesLiteratureId** | **UUID**|  | |
| **salesLiteratureUpdateDto** | [**SalesLiteratureUpdateDto**](SalesLiteratureUpdateDto.md)|  | [optional] |

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

