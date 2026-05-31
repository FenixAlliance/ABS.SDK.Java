# MarketingLeadsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createMarketingLeadAsync**](MarketingLeadsApi.md#createMarketingLeadAsync) | **POST** /api/v2/MarketingService/MarketingLeads | Create a marketing lead |
| [**deleteMarketingLeadAsync**](MarketingLeadsApi.md#deleteMarketingLeadAsync) | **DELETE** /api/v2/MarketingService/MarketingLeads/{marketingLeadId} | Delete a marketing lead |
| [**getMarketingLeadDetailsAsync**](MarketingLeadsApi.md#getMarketingLeadDetailsAsync) | **GET** /api/v2/MarketingService/MarketingLeads/{marketingLeadId} | Get marketing lead by ID |
| [**getMarketingLeadsCountAsync**](MarketingLeadsApi.md#getMarketingLeadsCountAsync) | **GET** /api/v2/MarketingService/MarketingLeads/Count | Get marketing leads count |
| [**getMarketingLeadsODataAsync**](MarketingLeadsApi.md#getMarketingLeadsODataAsync) | **GET** /api/v2/MarketingService/MarketingLeads | Get marketing leads |
| [**updateMarketingLeadAsync**](MarketingLeadsApi.md#updateMarketingLeadAsync) | **PUT** /api/v2/MarketingService/MarketingLeads/{marketingLeadId} | Update a marketing lead |


<a id="createMarketingLeadAsync"></a>
# **createMarketingLeadAsync**
> EmptyEnvelope createMarketingLeadAsync(tenantId, marketingLeadCreateDto, apiVersion, xApiVersion)

Create a marketing lead

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MarketingLeadsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingLeadsApi apiInstance = new MarketingLeadsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    MarketingLeadCreateDto marketingLeadCreateDto = new MarketingLeadCreateDto(); // MarketingLeadCreateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.createMarketingLeadAsync(tenantId, marketingLeadCreateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingLeadsApi#createMarketingLeadAsync");
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
| **marketingLeadCreateDto** | [**MarketingLeadCreateDto**](MarketingLeadCreateDto.md)|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

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

<a id="deleteMarketingLeadAsync"></a>
# **deleteMarketingLeadAsync**
> EmptyEnvelope deleteMarketingLeadAsync(tenantId, marketingLeadId, apiVersion, xApiVersion)

Delete a marketing lead

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MarketingLeadsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingLeadsApi apiInstance = new MarketingLeadsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID marketingLeadId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteMarketingLeadAsync(tenantId, marketingLeadId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingLeadsApi#deleteMarketingLeadAsync");
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
| **marketingLeadId** | **UUID**|  | |
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

<a id="getMarketingLeadDetailsAsync"></a>
# **getMarketingLeadDetailsAsync**
> MarketingLeadDtoEnvelope getMarketingLeadDetailsAsync(tenantId, marketingLeadId, apiVersion, xApiVersion)

Get marketing lead by ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MarketingLeadsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingLeadsApi apiInstance = new MarketingLeadsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID marketingLeadId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      MarketingLeadDtoEnvelope result = apiInstance.getMarketingLeadDetailsAsync(tenantId, marketingLeadId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingLeadsApi#getMarketingLeadDetailsAsync");
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
| **marketingLeadId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**MarketingLeadDtoEnvelope**](MarketingLeadDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getMarketingLeadsCountAsync"></a>
# **getMarketingLeadsCountAsync**
> Int32Envelope getMarketingLeadsCountAsync(tenantId, apiVersion, xApiVersion)

Get marketing leads count

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MarketingLeadsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingLeadsApi apiInstance = new MarketingLeadsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getMarketingLeadsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingLeadsApi#getMarketingLeadsCountAsync");
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

<a id="getMarketingLeadsODataAsync"></a>
# **getMarketingLeadsODataAsync**
> MarketingLeadDtoListEnvelope getMarketingLeadsODataAsync(tenantId, apiVersion, xApiVersion)

Get marketing leads

Retrieves a collection of marketing leads for the specified tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MarketingLeadsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingLeadsApi apiInstance = new MarketingLeadsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      MarketingLeadDtoListEnvelope result = apiInstance.getMarketingLeadsODataAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingLeadsApi#getMarketingLeadsODataAsync");
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

[**MarketingLeadDtoListEnvelope**](MarketingLeadDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateMarketingLeadAsync"></a>
# **updateMarketingLeadAsync**
> EmptyEnvelope updateMarketingLeadAsync(tenantId, marketingLeadId, marketingLeadUpdateDto, apiVersion, xApiVersion)

Update a marketing lead

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MarketingLeadsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingLeadsApi apiInstance = new MarketingLeadsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID marketingLeadId = UUID.randomUUID(); // UUID | 
    MarketingLeadUpdateDto marketingLeadUpdateDto = new MarketingLeadUpdateDto(); // MarketingLeadUpdateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.updateMarketingLeadAsync(tenantId, marketingLeadId, marketingLeadUpdateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingLeadsApi#updateMarketingLeadAsync");
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
| **marketingLeadId** | **UUID**|  | |
| **marketingLeadUpdateDto** | [**MarketingLeadUpdateDto**](MarketingLeadUpdateDto.md)|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

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

