# MaintenanceVisitsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createMaintenanceVisitAsync**](MaintenanceVisitsApi.md#createMaintenanceVisitAsync) | **POST** /api/v2/SupportService/MaintenanceVisits | Create a maintenance visit |
| [**deleteMaintenanceVisitAsync**](MaintenanceVisitsApi.md#deleteMaintenanceVisitAsync) | **DELETE** /api/v2/SupportService/MaintenanceVisits/{maintenanceVisitId} | Delete a maintenance visit |
| [**getMaintenanceVisitAsync**](MaintenanceVisitsApi.md#getMaintenanceVisitAsync) | **GET** /api/v2/SupportService/MaintenanceVisits/{maintenanceVisitId} | Retrieve a maintenance visit by ID |
| [**getMaintenanceVisitsAsync**](MaintenanceVisitsApi.md#getMaintenanceVisitsAsync) | **GET** /api/v2/SupportService/MaintenanceVisits | Retrieve maintenance visits |
| [**getMaintenanceVisitsCountAsync**](MaintenanceVisitsApi.md#getMaintenanceVisitsCountAsync) | **GET** /api/v2/SupportService/MaintenanceVisits/Count | Get maintenance visits count |
| [**updateMaintenanceVisitAsync**](MaintenanceVisitsApi.md#updateMaintenanceVisitAsync) | **PUT** /api/v2/SupportService/MaintenanceVisits/{maintenanceVisitId} | Update a maintenance visit |


<a id="createMaintenanceVisitAsync"></a>
# **createMaintenanceVisitAsync**
> EmptyEnvelope createMaintenanceVisitAsync(tenantId, apiVersion, xApiVersion, maintenanceVisitCreateDto)

Create a maintenance visit

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MaintenanceVisitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MaintenanceVisitsApi apiInstance = new MaintenanceVisitsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    MaintenanceVisitCreateDto maintenanceVisitCreateDto = new MaintenanceVisitCreateDto(); // MaintenanceVisitCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createMaintenanceVisitAsync(tenantId, apiVersion, xApiVersion, maintenanceVisitCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MaintenanceVisitsApi#createMaintenanceVisitAsync");
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
| **maintenanceVisitCreateDto** | [**MaintenanceVisitCreateDto**](MaintenanceVisitCreateDto.md)|  | [optional] |

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
| **200** | OK |  -  |

<a id="deleteMaintenanceVisitAsync"></a>
# **deleteMaintenanceVisitAsync**
> EmptyEnvelope deleteMaintenanceVisitAsync(tenantId, maintenanceVisitId, apiVersion, xApiVersion)

Delete a maintenance visit

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MaintenanceVisitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MaintenanceVisitsApi apiInstance = new MaintenanceVisitsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID maintenanceVisitId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteMaintenanceVisitAsync(tenantId, maintenanceVisitId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MaintenanceVisitsApi#deleteMaintenanceVisitAsync");
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
| **maintenanceVisitId** | **UUID**|  | |
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
| **200** | OK |  -  |

<a id="getMaintenanceVisitAsync"></a>
# **getMaintenanceVisitAsync**
> MaintenanceVisitDtoEnvelope getMaintenanceVisitAsync(tenantId, maintenanceVisitId, apiVersion, xApiVersion)

Retrieve a maintenance visit by ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MaintenanceVisitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MaintenanceVisitsApi apiInstance = new MaintenanceVisitsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID maintenanceVisitId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      MaintenanceVisitDtoEnvelope result = apiInstance.getMaintenanceVisitAsync(tenantId, maintenanceVisitId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MaintenanceVisitsApi#getMaintenanceVisitAsync");
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
| **maintenanceVisitId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**MaintenanceVisitDtoEnvelope**](MaintenanceVisitDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getMaintenanceVisitsAsync"></a>
# **getMaintenanceVisitsAsync**
> MaintenanceVisitDtoListEnvelope getMaintenanceVisitsAsync(tenantId, apiVersion, xApiVersion)

Retrieve maintenance visits

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MaintenanceVisitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MaintenanceVisitsApi apiInstance = new MaintenanceVisitsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      MaintenanceVisitDtoListEnvelope result = apiInstance.getMaintenanceVisitsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MaintenanceVisitsApi#getMaintenanceVisitsAsync");
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

[**MaintenanceVisitDtoListEnvelope**](MaintenanceVisitDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getMaintenanceVisitsCountAsync"></a>
# **getMaintenanceVisitsCountAsync**
> Int32Envelope getMaintenanceVisitsCountAsync(tenantId, apiVersion, xApiVersion)

Get maintenance visits count

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MaintenanceVisitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MaintenanceVisitsApi apiInstance = new MaintenanceVisitsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getMaintenanceVisitsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MaintenanceVisitsApi#getMaintenanceVisitsCountAsync");
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

<a id="updateMaintenanceVisitAsync"></a>
# **updateMaintenanceVisitAsync**
> EmptyEnvelope updateMaintenanceVisitAsync(tenantId, maintenanceVisitId, apiVersion, xApiVersion, body)

Update a maintenance visit

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MaintenanceVisitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MaintenanceVisitsApi apiInstance = new MaintenanceVisitsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID maintenanceVisitId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    Object body = null; // Object | 
    try {
      EmptyEnvelope result = apiInstance.updateMaintenanceVisitAsync(tenantId, maintenanceVisitId, apiVersion, xApiVersion, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MaintenanceVisitsApi#updateMaintenanceVisitAsync");
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
| **maintenanceVisitId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **body** | **Object**|  | [optional] |

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
| **200** | OK |  -  |

