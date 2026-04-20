# MarketingListsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createMarketingListAsync**](MarketingListsApi.md#createMarketingListAsync) | **POST** /api/v2/MarketingService/MarketingLists | Create a marketing list |
| [**deleteMarketingListAsync**](MarketingListsApi.md#deleteMarketingListAsync) | **DELETE** /api/v2/MarketingService/MarketingLists/{marketinglistId} | Delete a marketing list |
| [**getMarketingListDetailsAsync**](MarketingListsApi.md#getMarketingListDetailsAsync) | **GET** /api/v2/MarketingService/MarketingLists/{marketinglistId} | Get marketing list by ID |
| [**getMarketingListODataAsync**](MarketingListsApi.md#getMarketingListODataAsync) | **GET** /api/v2/MarketingService/MarketingLists | Get marketing lists |
| [**getMarketingListsCountAsync**](MarketingListsApi.md#getMarketingListsCountAsync) | **GET** /api/v2/MarketingService/MarketingLists/Count | Get marketing lists count |
| [**updateMarketingListAsync**](MarketingListsApi.md#updateMarketingListAsync) | **PUT** /api/v2/MarketingService/MarketingLists/{marketinglistId} | Update a marketing list |


<a id="createMarketingListAsync"></a>
# **createMarketingListAsync**
> EmptyEnvelope createMarketingListAsync(tenantId, marketingListCreateDto, apiVersion, xApiVersion)

Create a marketing list

Creates a new marketing list for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MarketingListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    MarketingListsApi apiInstance = new MarketingListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    MarketingListCreateDto marketingListCreateDto = new MarketingListCreateDto(); // MarketingListCreateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.createMarketingListAsync(tenantId, marketingListCreateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingListsApi#createMarketingListAsync");
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
| **marketingListCreateDto** | [**MarketingListCreateDto**](MarketingListCreateDto.md)|  | |
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
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **400** | Bad Request |  -  |
| **201** | Created |  -  |

<a id="deleteMarketingListAsync"></a>
# **deleteMarketingListAsync**
> EmptyEnvelope deleteMarketingListAsync(tenantId, marketinglistId, apiVersion, xApiVersion)

Delete a marketing list

Deletes a marketing list by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MarketingListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    MarketingListsApi apiInstance = new MarketingListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID marketinglistId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteMarketingListAsync(tenantId, marketinglistId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingListsApi#deleteMarketingListAsync");
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
| **marketinglistId** | **UUID**|  | |
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

<a id="getMarketingListDetailsAsync"></a>
# **getMarketingListDetailsAsync**
> MarketingListDtoEnvelope getMarketingListDetailsAsync(tenantId, marketinglistId, apiVersion, xApiVersion)

Get marketing list by ID

Retrieves the details of a specific marketing list by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MarketingListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    MarketingListsApi apiInstance = new MarketingListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID marketinglistId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      MarketingListDtoEnvelope result = apiInstance.getMarketingListDetailsAsync(tenantId, marketinglistId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingListsApi#getMarketingListDetailsAsync");
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
| **marketinglistId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**MarketingListDtoEnvelope**](MarketingListDtoEnvelope.md)

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

<a id="getMarketingListODataAsync"></a>
# **getMarketingListODataAsync**
> MarketingListDtoListEnvelope getMarketingListODataAsync(tenantId, apiVersion, xApiVersion)

Get marketing lists

Retrieves a collection of marketing lists for the specified tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MarketingListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    MarketingListsApi apiInstance = new MarketingListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      MarketingListDtoListEnvelope result = apiInstance.getMarketingListODataAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingListsApi#getMarketingListODataAsync");
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

[**MarketingListDtoListEnvelope**](MarketingListDtoListEnvelope.md)

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

<a id="getMarketingListsCountAsync"></a>
# **getMarketingListsCountAsync**
> Int32Envelope getMarketingListsCountAsync(tenantId, apiVersion, xApiVersion)

Get marketing lists count

Returns the count of marketing lists for the specified tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MarketingListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    MarketingListsApi apiInstance = new MarketingListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getMarketingListsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingListsApi#getMarketingListsCountAsync");
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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

<a id="updateMarketingListAsync"></a>
# **updateMarketingListAsync**
> EmptyEnvelope updateMarketingListAsync(tenantId, marketinglistId, marketingListUpdateDto, apiVersion, xApiVersion)

Update a marketing list

Updates an existing marketing list by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MarketingListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    MarketingListsApi apiInstance = new MarketingListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID marketinglistId = UUID.randomUUID(); // UUID | 
    MarketingListUpdateDto marketingListUpdateDto = new MarketingListUpdateDto(); // MarketingListUpdateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.updateMarketingListAsync(tenantId, marketinglistId, marketingListUpdateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingListsApi#updateMarketingListAsync");
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
| **marketinglistId** | **UUID**|  | |
| **marketingListUpdateDto** | [**MarketingListUpdateDto**](MarketingListUpdateDto.md)|  | |
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
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

