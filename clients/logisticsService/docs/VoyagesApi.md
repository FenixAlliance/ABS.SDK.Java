# VoyagesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelVoyageAsync**](VoyagesApi.md#cancelVoyageAsync) | **POST** /api/v2/LogisticsService/Voyages/{voyageId}/Cancel | Cancel a voyage |
| [**completeVoyageAsync**](VoyagesApi.md#completeVoyageAsync) | **POST** /api/v2/LogisticsService/Voyages/{voyageId}/Complete | Complete a voyage |
| [**createVoyageAsync**](VoyagesApi.md#createVoyageAsync) | **POST** /api/v2/LogisticsService/Voyages | Create a voyage |
| [**createVoyagePortCallAsync**](VoyagesApi.md#createVoyagePortCallAsync) | **POST** /api/v2/LogisticsService/Voyages/{voyageId}/PortCalls | Create a port call |
| [**deleteVoyageAsync**](VoyagesApi.md#deleteVoyageAsync) | **DELETE** /api/v2/LogisticsService/Voyages/{voyageId} | Delete a voyage |
| [**deleteVoyagePortCallAsync**](VoyagesApi.md#deleteVoyagePortCallAsync) | **DELETE** /api/v2/LogisticsService/Voyages/{voyageId}/PortCalls/{portCallId} | Delete a port call |
| [**getVoyageByIdAsync**](VoyagesApi.md#getVoyageByIdAsync) | **GET** /api/v2/LogisticsService/Voyages/{voyageId} | Get voyage by ID |
| [**getVoyagePortCallsAsync**](VoyagesApi.md#getVoyagePortCallsAsync) | **GET** /api/v2/LogisticsService/Voyages/{voyageId}/PortCalls | Get voyage port calls |
| [**getVoyagePortCallsCountAsync**](VoyagesApi.md#getVoyagePortCallsCountAsync) | **GET** /api/v2/LogisticsService/Voyages/{voyageId}/PortCalls/Count | Get voyage port calls count |
| [**getVoyagesAsync**](VoyagesApi.md#getVoyagesAsync) | **GET** /api/v2/LogisticsService/Voyages | Get all voyages |
| [**getVoyagesCountAsync**](VoyagesApi.md#getVoyagesCountAsync) | **GET** /api/v2/LogisticsService/Voyages/Count | Get voyages count |
| [**startVoyageAsync**](VoyagesApi.md#startVoyageAsync) | **POST** /api/v2/LogisticsService/Voyages/{voyageId}/Start | Start a voyage |
| [**updateVoyageAsync**](VoyagesApi.md#updateVoyageAsync) | **PUT** /api/v2/LogisticsService/Voyages/{voyageId} | Update a voyage |
| [**updateVoyagePortCallAsync**](VoyagesApi.md#updateVoyagePortCallAsync) | **PUT** /api/v2/LogisticsService/Voyages/{voyageId}/PortCalls/{portCallId} | Update a port call |


<a id="cancelVoyageAsync"></a>
# **cancelVoyageAsync**
> EmptyEnvelope cancelVoyageAsync(tenantId, voyageId, apiVersion, xApiVersion)

Cancel a voyage

Cancels a voyage.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VoyagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    VoyagesApi apiInstance = new VoyagesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID voyageId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.cancelVoyageAsync(tenantId, voyageId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VoyagesApi#cancelVoyageAsync");
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
| **voyageId** | **UUID**|  | |
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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

<a id="completeVoyageAsync"></a>
# **completeVoyageAsync**
> EmptyEnvelope completeVoyageAsync(tenantId, voyageId, apiVersion, xApiVersion)

Complete a voyage

Marks a voyage as completed.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VoyagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    VoyagesApi apiInstance = new VoyagesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID voyageId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.completeVoyageAsync(tenantId, voyageId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VoyagesApi#completeVoyageAsync");
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
| **voyageId** | **UUID**|  | |
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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

<a id="createVoyageAsync"></a>
# **createVoyageAsync**
> EmptyEnvelope createVoyageAsync(tenantId, apiVersion, xApiVersion, voyageCreateDto)

Create a voyage

Creates a new voyage for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VoyagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    VoyagesApi apiInstance = new VoyagesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    VoyageCreateDto voyageCreateDto = new VoyageCreateDto(); // VoyageCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createVoyageAsync(tenantId, apiVersion, xApiVersion, voyageCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VoyagesApi#createVoyageAsync");
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
| **voyageCreateDto** | [**VoyageCreateDto**](VoyageCreateDto.md)|  | [optional] |

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

<a id="createVoyagePortCallAsync"></a>
# **createVoyagePortCallAsync**
> EmptyEnvelope createVoyagePortCallAsync(tenantId, voyageId, apiVersion, xApiVersion, voyagePortCallCreateDto)

Create a port call

Creates a new port call for a voyage.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VoyagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    VoyagesApi apiInstance = new VoyagesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID voyageId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    VoyagePortCallCreateDto voyagePortCallCreateDto = new VoyagePortCallCreateDto(); // VoyagePortCallCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createVoyagePortCallAsync(tenantId, voyageId, apiVersion, xApiVersion, voyagePortCallCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VoyagesApi#createVoyagePortCallAsync");
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
| **voyageId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **voyagePortCallCreateDto** | [**VoyagePortCallCreateDto**](VoyagePortCallCreateDto.md)|  | [optional] |

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

<a id="deleteVoyageAsync"></a>
# **deleteVoyageAsync**
> EmptyEnvelope deleteVoyageAsync(tenantId, voyageId, apiVersion, xApiVersion)

Delete a voyage

Deletes a voyage.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VoyagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    VoyagesApi apiInstance = new VoyagesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID voyageId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteVoyageAsync(tenantId, voyageId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VoyagesApi#deleteVoyageAsync");
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
| **voyageId** | **UUID**|  | |
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

<a id="deleteVoyagePortCallAsync"></a>
# **deleteVoyagePortCallAsync**
> EmptyEnvelope deleteVoyagePortCallAsync(tenantId, voyageId, portCallId, apiVersion, xApiVersion)

Delete a port call

Deletes a port call.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VoyagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    VoyagesApi apiInstance = new VoyagesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID voyageId = UUID.randomUUID(); // UUID | 
    UUID portCallId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteVoyagePortCallAsync(tenantId, voyageId, portCallId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VoyagesApi#deleteVoyagePortCallAsync");
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
| **voyageId** | **UUID**|  | |
| **portCallId** | **UUID**|  | |
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

<a id="getVoyageByIdAsync"></a>
# **getVoyageByIdAsync**
> VoyageDtoEnvelope getVoyageByIdAsync(tenantId, voyageId, apiVersion, xApiVersion)

Get voyage by ID

Retrieves a specific voyage by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VoyagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    VoyagesApi apiInstance = new VoyagesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID voyageId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      VoyageDtoEnvelope result = apiInstance.getVoyageByIdAsync(tenantId, voyageId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VoyagesApi#getVoyageByIdAsync");
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
| **voyageId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**VoyageDtoEnvelope**](VoyageDtoEnvelope.md)

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

<a id="getVoyagePortCallsAsync"></a>
# **getVoyagePortCallsAsync**
> VoyagePortCallDtoListEnvelope getVoyagePortCallsAsync(tenantId, voyageId, apiVersion, xApiVersion)

Get voyage port calls

Retrieves all port calls for a specific voyage.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VoyagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    VoyagesApi apiInstance = new VoyagesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID voyageId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      VoyagePortCallDtoListEnvelope result = apiInstance.getVoyagePortCallsAsync(tenantId, voyageId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VoyagesApi#getVoyagePortCallsAsync");
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
| **voyageId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**VoyagePortCallDtoListEnvelope**](VoyagePortCallDtoListEnvelope.md)

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

<a id="getVoyagePortCallsCountAsync"></a>
# **getVoyagePortCallsCountAsync**
> Int32Envelope getVoyagePortCallsCountAsync(tenantId, voyageId, apiVersion, xApiVersion)

Get voyage port calls count

Returns the count of port calls for a specific voyage.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VoyagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    VoyagesApi apiInstance = new VoyagesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID voyageId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getVoyagePortCallsCountAsync(tenantId, voyageId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VoyagesApi#getVoyagePortCallsCountAsync");
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
| **voyageId** | **UUID**|  | |
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

<a id="getVoyagesAsync"></a>
# **getVoyagesAsync**
> VoyageDtoListEnvelope getVoyagesAsync(tenantId, apiVersion, xApiVersion)

Get all voyages

Retrieves all voyages for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VoyagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    VoyagesApi apiInstance = new VoyagesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      VoyageDtoListEnvelope result = apiInstance.getVoyagesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VoyagesApi#getVoyagesAsync");
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

[**VoyageDtoListEnvelope**](VoyageDtoListEnvelope.md)

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

<a id="getVoyagesCountAsync"></a>
# **getVoyagesCountAsync**
> Int32Envelope getVoyagesCountAsync(tenantId, apiVersion, xApiVersion)

Get voyages count

Returns the count of voyages for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VoyagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    VoyagesApi apiInstance = new VoyagesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getVoyagesCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VoyagesApi#getVoyagesCountAsync");
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

<a id="startVoyageAsync"></a>
# **startVoyageAsync**
> EmptyEnvelope startVoyageAsync(tenantId, voyageId, apiVersion, xApiVersion)

Start a voyage

Starts a voyage.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VoyagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    VoyagesApi apiInstance = new VoyagesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID voyageId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.startVoyageAsync(tenantId, voyageId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VoyagesApi#startVoyageAsync");
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
| **voyageId** | **UUID**|  | |
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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

<a id="updateVoyageAsync"></a>
# **updateVoyageAsync**
> EmptyEnvelope updateVoyageAsync(tenantId, voyageId, apiVersion, xApiVersion, voyageUpdateDto)

Update a voyage

Updates an existing voyage.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VoyagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    VoyagesApi apiInstance = new VoyagesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID voyageId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    VoyageUpdateDto voyageUpdateDto = new VoyageUpdateDto(); // VoyageUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateVoyageAsync(tenantId, voyageId, apiVersion, xApiVersion, voyageUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VoyagesApi#updateVoyageAsync");
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
| **voyageId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **voyageUpdateDto** | [**VoyageUpdateDto**](VoyageUpdateDto.md)|  | [optional] |

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

<a id="updateVoyagePortCallAsync"></a>
# **updateVoyagePortCallAsync**
> EmptyEnvelope updateVoyagePortCallAsync(tenantId, voyageId, portCallId, apiVersion, xApiVersion, voyagePortCallUpdateDto)

Update a port call

Updates an existing port call.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VoyagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    VoyagesApi apiInstance = new VoyagesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID voyageId = UUID.randomUUID(); // UUID | 
    UUID portCallId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    VoyagePortCallUpdateDto voyagePortCallUpdateDto = new VoyagePortCallUpdateDto(); // VoyagePortCallUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateVoyagePortCallAsync(tenantId, voyageId, portCallId, apiVersion, xApiVersion, voyagePortCallUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VoyagesApi#updateVoyagePortCallAsync");
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
| **voyageId** | **UUID**|  | |
| **portCallId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **voyagePortCallUpdateDto** | [**VoyagePortCallUpdateDto**](VoyagePortCallUpdateDto.md)|  | [optional] |

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

