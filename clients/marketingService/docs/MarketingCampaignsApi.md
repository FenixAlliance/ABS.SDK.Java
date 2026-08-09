# MarketingCampaignsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createMarketingCampaignAsync**](MarketingCampaignsApi.md#createMarketingCampaignAsync) | **POST** /api/v2/MarketingService/MarketingCampaigns | Create a marketing campaign |
| [**deleteMarketingCampaignAsync**](MarketingCampaignsApi.md#deleteMarketingCampaignAsync) | **DELETE** /api/v2/MarketingService/MarketingCampaigns/{marketingcampaignId} | Delete a marketing campaign |
| [**getMarketingCampaignDetailsAsync**](MarketingCampaignsApi.md#getMarketingCampaignDetailsAsync) | **GET** /api/v2/MarketingService/MarketingCampaigns/{marketingcampaignId} | Get marketing campaign by ID |
| [**getMarketingCampaignODataAsync**](MarketingCampaignsApi.md#getMarketingCampaignODataAsync) | **GET** /api/v2/MarketingService/MarketingCampaigns | Get marketing campaigns |
| [**getMarketingCampaignsCountAsync**](MarketingCampaignsApi.md#getMarketingCampaignsCountAsync) | **GET** /api/v2/MarketingService/MarketingCampaigns/Count | Get marketing campaigns count |
| [**patchMarketingCampaignAsync**](MarketingCampaignsApi.md#patchMarketingCampaignAsync) | **PATCH** /api/v2/MarketingService/MarketingCampaigns/{marketingcampaignId} | Patch a marketing campaign |
| [**updateMarketingCampaignAsync**](MarketingCampaignsApi.md#updateMarketingCampaignAsync) | **PUT** /api/v2/MarketingService/MarketingCampaigns/{marketingcampaignId} | Update a marketing campaign |


<a id="createMarketingCampaignAsync"></a>
# **createMarketingCampaignAsync**
> EmptyEnvelope createMarketingCampaignAsync(tenantId, marketingCampaignCreateDto, apiVersion, xApiVersion)

Create a marketing campaign

Creates a new marketing campaign for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MarketingCampaignsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    MarketingCampaignsApi apiInstance = new MarketingCampaignsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    MarketingCampaignCreateDto marketingCampaignCreateDto = new MarketingCampaignCreateDto(); // MarketingCampaignCreateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.createMarketingCampaignAsync(tenantId, marketingCampaignCreateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingCampaignsApi#createMarketingCampaignAsync");
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
| **marketingCampaignCreateDto** | [**MarketingCampaignCreateDto**](MarketingCampaignCreateDto.md)|  | |
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

<a id="deleteMarketingCampaignAsync"></a>
# **deleteMarketingCampaignAsync**
> EmptyEnvelope deleteMarketingCampaignAsync(tenantId, marketingcampaignId, apiVersion, xApiVersion)

Delete a marketing campaign

Deletes a marketing campaign by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MarketingCampaignsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    MarketingCampaignsApi apiInstance = new MarketingCampaignsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID marketingcampaignId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteMarketingCampaignAsync(tenantId, marketingcampaignId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingCampaignsApi#deleteMarketingCampaignAsync");
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
| **marketingcampaignId** | **UUID**|  | |
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

<a id="getMarketingCampaignDetailsAsync"></a>
# **getMarketingCampaignDetailsAsync**
> MarketingCampaignDtoEnvelope getMarketingCampaignDetailsAsync(tenantId, marketingcampaignId, apiVersion, xApiVersion)

Get marketing campaign by ID

Retrieves the details of a specific marketing campaign by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MarketingCampaignsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    MarketingCampaignsApi apiInstance = new MarketingCampaignsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID marketingcampaignId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      MarketingCampaignDtoEnvelope result = apiInstance.getMarketingCampaignDetailsAsync(tenantId, marketingcampaignId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingCampaignsApi#getMarketingCampaignDetailsAsync");
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
| **marketingcampaignId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**MarketingCampaignDtoEnvelope**](MarketingCampaignDtoEnvelope.md)

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

<a id="getMarketingCampaignODataAsync"></a>
# **getMarketingCampaignODataAsync**
> getMarketingCampaignODataAsync(tenantId, apiVersion, xApiVersion, marketingCampaignDtoCollectionQueryParameters)

Get marketing campaigns

Retrieves a collection of marketing campaigns for the specified tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MarketingCampaignsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    MarketingCampaignsApi apiInstance = new MarketingCampaignsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    MarketingCampaignDtoCollectionQueryParameters marketingCampaignDtoCollectionQueryParameters = new MarketingCampaignDtoCollectionQueryParameters(); // MarketingCampaignDtoCollectionQueryParameters | 
    try {
      apiInstance.getMarketingCampaignODataAsync(tenantId, apiVersion, xApiVersion, marketingCampaignDtoCollectionQueryParameters);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingCampaignsApi#getMarketingCampaignODataAsync");
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
| **marketingCampaignDtoCollectionQueryParameters** | [**MarketingCampaignDtoCollectionQueryParameters**](MarketingCampaignDtoCollectionQueryParameters.md)|  | [optional] |

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
| **401** | Unauthorized |  -  |
| **400** | Bad Request |  -  |

<a id="getMarketingCampaignsCountAsync"></a>
# **getMarketingCampaignsCountAsync**
> Int32Envelope getMarketingCampaignsCountAsync(tenantId, apiVersion, xApiVersion, marketingCampaignDtoCollectionQueryParameters)

Get marketing campaigns count

Returns the count of marketing campaigns for the specified tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MarketingCampaignsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    MarketingCampaignsApi apiInstance = new MarketingCampaignsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    MarketingCampaignDtoCollectionQueryParameters marketingCampaignDtoCollectionQueryParameters = new MarketingCampaignDtoCollectionQueryParameters(); // MarketingCampaignDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getMarketingCampaignsCountAsync(tenantId, apiVersion, xApiVersion, marketingCampaignDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingCampaignsApi#getMarketingCampaignsCountAsync");
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
| **marketingCampaignDtoCollectionQueryParameters** | [**MarketingCampaignDtoCollectionQueryParameters**](MarketingCampaignDtoCollectionQueryParameters.md)|  | [optional] |

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
| **401** | Unauthorized |  -  |
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

<a id="patchMarketingCampaignAsync"></a>
# **patchMarketingCampaignAsync**
> EmptyEnvelope patchMarketingCampaignAsync(tenantId, marketingcampaignId, apiVersion, xApiVersion, patchOperation)

Patch a marketing campaign

Partially updates a marketing campaign by its ID using JSON Patch.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MarketingCampaignsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    MarketingCampaignsApi apiInstance = new MarketingCampaignsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID marketingcampaignId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    List<PatchOperation> patchOperation = Arrays.asList(); // List<PatchOperation> | 
    try {
      EmptyEnvelope result = apiInstance.patchMarketingCampaignAsync(tenantId, marketingcampaignId, apiVersion, xApiVersion, patchOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingCampaignsApi#patchMarketingCampaignAsync");
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
| **marketingcampaignId** | **UUID**|  | |
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

<a id="updateMarketingCampaignAsync"></a>
# **updateMarketingCampaignAsync**
> EmptyEnvelope updateMarketingCampaignAsync(tenantId, marketingcampaignId, marketingCampaignUpdateDto, apiVersion, xApiVersion)

Update a marketing campaign

Updates an existing marketing campaign by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MarketingCampaignsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    MarketingCampaignsApi apiInstance = new MarketingCampaignsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID marketingcampaignId = UUID.randomUUID(); // UUID | 
    MarketingCampaignUpdateDto marketingCampaignUpdateDto = new MarketingCampaignUpdateDto(); // MarketingCampaignUpdateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.updateMarketingCampaignAsync(tenantId, marketingcampaignId, marketingCampaignUpdateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingCampaignsApi#updateMarketingCampaignAsync");
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
| **marketingcampaignId** | **UUID**|  | |
| **marketingCampaignUpdateDto** | [**MarketingCampaignUpdateDto**](MarketingCampaignUpdateDto.md)|  | |
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

