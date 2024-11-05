# DiscountListsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2PricingServiceDiscountListsCountGet**](DiscountListsApi.md#apiV2PricingServiceDiscountListsCountGet) | **GET** /api/v2/PricingService/DiscountLists/Count |  |
| [**apiV2PricingServiceDiscountListsDiscountListIdDelete**](DiscountListsApi.md#apiV2PricingServiceDiscountListsDiscountListIdDelete) | **DELETE** /api/v2/PricingService/DiscountLists/{discountListId} |  |
| [**apiV2PricingServiceDiscountListsDiscountListIdDiscountsCountGet**](DiscountListsApi.md#apiV2PricingServiceDiscountListsDiscountListIdDiscountsCountGet) | **GET** /api/v2/PricingService/DiscountLists/{discountListId}/Discounts/Count |  |
| [**apiV2PricingServiceDiscountListsDiscountListIdDiscountsDiscountListEntryIdDelete**](DiscountListsApi.md#apiV2PricingServiceDiscountListsDiscountListIdDiscountsDiscountListEntryIdDelete) | **DELETE** /api/v2/PricingService/DiscountLists/{discountListId}/Discounts/{discountListEntryId} |  |
| [**apiV2PricingServiceDiscountListsDiscountListIdDiscountsDiscountListEntryIdPut**](DiscountListsApi.md#apiV2PricingServiceDiscountListsDiscountListIdDiscountsDiscountListEntryIdPut) | **PUT** /api/v2/PricingService/DiscountLists/{discountListId}/Discounts/{discountListEntryId} |  |
| [**apiV2PricingServiceDiscountListsDiscountListIdDiscountsGet**](DiscountListsApi.md#apiV2PricingServiceDiscountListsDiscountListIdDiscountsGet) | **GET** /api/v2/PricingService/DiscountLists/{discountListId}/Discounts |  |
| [**apiV2PricingServiceDiscountListsDiscountListIdDiscountsPost**](DiscountListsApi.md#apiV2PricingServiceDiscountListsDiscountListIdDiscountsPost) | **POST** /api/v2/PricingService/DiscountLists/{discountListId}/Discounts |  |
| [**apiV2PricingServiceDiscountListsDiscountListIdGet**](DiscountListsApi.md#apiV2PricingServiceDiscountListsDiscountListIdGet) | **GET** /api/v2/PricingService/DiscountLists/{discountListId} |  |
| [**apiV2PricingServiceDiscountListsDiscountListIdPut**](DiscountListsApi.md#apiV2PricingServiceDiscountListsDiscountListIdPut) | **PUT** /api/v2/PricingService/DiscountLists/{discountListId} |  |
| [**apiV2PricingServiceDiscountListsGet**](DiscountListsApi.md#apiV2PricingServiceDiscountListsGet) | **GET** /api/v2/PricingService/DiscountLists |  |
| [**apiV2PricingServiceDiscountListsPost**](DiscountListsApi.md#apiV2PricingServiceDiscountListsPost) | **POST** /api/v2/PricingService/DiscountLists |  |
| [**getDiscountListEntry**](DiscountListsApi.md#getDiscountListEntry) | **GET** /api/v2/PricingService/DiscountLists/{discountListId}/Discounts/{discountListEntryId} |  |


<a id="apiV2PricingServiceDiscountListsCountGet"></a>
# **apiV2PricingServiceDiscountListsCountGet**
> Int32Envelope apiV2PricingServiceDiscountListsCountGet(tenantId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscountListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DiscountListsApi apiInstance = new DiscountListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.apiV2PricingServiceDiscountListsCountGet(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountListsApi#apiV2PricingServiceDiscountListsCountGet");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="apiV2PricingServiceDiscountListsDiscountListIdDelete"></a>
# **apiV2PricingServiceDiscountListsDiscountListIdDelete**
> EmptyEnvelope apiV2PricingServiceDiscountListsDiscountListIdDelete(tenantId, discountListId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscountListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DiscountListsApi apiInstance = new DiscountListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID discountListId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.apiV2PricingServiceDiscountListsDiscountListIdDelete(tenantId, discountListId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountListsApi#apiV2PricingServiceDiscountListsDiscountListIdDelete");
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
| **discountListId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="apiV2PricingServiceDiscountListsDiscountListIdDiscountsCountGet"></a>
# **apiV2PricingServiceDiscountListsDiscountListIdDiscountsCountGet**
> Int32Envelope apiV2PricingServiceDiscountListsDiscountListIdDiscountsCountGet(tenantId, discountListId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscountListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DiscountListsApi apiInstance = new DiscountListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID discountListId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.apiV2PricingServiceDiscountListsDiscountListIdDiscountsCountGet(tenantId, discountListId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountListsApi#apiV2PricingServiceDiscountListsDiscountListIdDiscountsCountGet");
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
| **discountListId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="apiV2PricingServiceDiscountListsDiscountListIdDiscountsDiscountListEntryIdDelete"></a>
# **apiV2PricingServiceDiscountListsDiscountListIdDiscountsDiscountListEntryIdDelete**
> EmptyEnvelope apiV2PricingServiceDiscountListsDiscountListIdDiscountsDiscountListEntryIdDelete(tenantId, discountListId, discountListEntryId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscountListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DiscountListsApi apiInstance = new DiscountListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID discountListId = UUID.randomUUID(); // UUID | 
    UUID discountListEntryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.apiV2PricingServiceDiscountListsDiscountListIdDiscountsDiscountListEntryIdDelete(tenantId, discountListId, discountListEntryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountListsApi#apiV2PricingServiceDiscountListsDiscountListIdDiscountsDiscountListEntryIdDelete");
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
| **discountListId** | **UUID**|  | |
| **discountListEntryId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="apiV2PricingServiceDiscountListsDiscountListIdDiscountsDiscountListEntryIdPut"></a>
# **apiV2PricingServiceDiscountListsDiscountListIdDiscountsDiscountListEntryIdPut**
> EmptyEnvelope apiV2PricingServiceDiscountListsDiscountListIdDiscountsDiscountListEntryIdPut(tenantId, discountListId, discountListEntryId, apiVersion, xApiVersion, discountUpdateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscountListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DiscountListsApi apiInstance = new DiscountListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID discountListId = UUID.randomUUID(); // UUID | 
    UUID discountListEntryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    DiscountUpdateDto discountUpdateDto = new DiscountUpdateDto(); // DiscountUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.apiV2PricingServiceDiscountListsDiscountListIdDiscountsDiscountListEntryIdPut(tenantId, discountListId, discountListEntryId, apiVersion, xApiVersion, discountUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountListsApi#apiV2PricingServiceDiscountListsDiscountListIdDiscountsDiscountListEntryIdPut");
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
| **discountListId** | **UUID**|  | |
| **discountListEntryId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **discountUpdateDto** | [**DiscountUpdateDto**](DiscountUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="apiV2PricingServiceDiscountListsDiscountListIdDiscountsGet"></a>
# **apiV2PricingServiceDiscountListsDiscountListIdDiscountsGet**
> DiscountDtoListEnvelope apiV2PricingServiceDiscountListsDiscountListIdDiscountsGet(tenantId, discountListId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscountListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DiscountListsApi apiInstance = new DiscountListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID discountListId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      DiscountDtoListEnvelope result = apiInstance.apiV2PricingServiceDiscountListsDiscountListIdDiscountsGet(tenantId, discountListId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountListsApi#apiV2PricingServiceDiscountListsDiscountListIdDiscountsGet");
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
| **discountListId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**DiscountDtoListEnvelope**](DiscountDtoListEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="apiV2PricingServiceDiscountListsDiscountListIdDiscountsPost"></a>
# **apiV2PricingServiceDiscountListsDiscountListIdDiscountsPost**
> EmptyEnvelope apiV2PricingServiceDiscountListsDiscountListIdDiscountsPost(tenantId, discountListId, apiVersion, xApiVersion, discountCreateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscountListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DiscountListsApi apiInstance = new DiscountListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID discountListId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    DiscountCreateDto discountCreateDto = new DiscountCreateDto(); // DiscountCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.apiV2PricingServiceDiscountListsDiscountListIdDiscountsPost(tenantId, discountListId, apiVersion, xApiVersion, discountCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountListsApi#apiV2PricingServiceDiscountListsDiscountListIdDiscountsPost");
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
| **discountListId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **discountCreateDto** | [**DiscountCreateDto**](DiscountCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="apiV2PricingServiceDiscountListsDiscountListIdGet"></a>
# **apiV2PricingServiceDiscountListsDiscountListIdGet**
> DiscountListDtoEnvelope apiV2PricingServiceDiscountListsDiscountListIdGet(tenantId, discountListId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscountListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DiscountListsApi apiInstance = new DiscountListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID discountListId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      DiscountListDtoEnvelope result = apiInstance.apiV2PricingServiceDiscountListsDiscountListIdGet(tenantId, discountListId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountListsApi#apiV2PricingServiceDiscountListsDiscountListIdGet");
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
| **discountListId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**DiscountListDtoEnvelope**](DiscountListDtoEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="apiV2PricingServiceDiscountListsDiscountListIdPut"></a>
# **apiV2PricingServiceDiscountListsDiscountListIdPut**
> EmptyEnvelope apiV2PricingServiceDiscountListsDiscountListIdPut(tenantId, discountListId, apiVersion, xApiVersion, discountListUpdateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscountListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DiscountListsApi apiInstance = new DiscountListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID discountListId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    DiscountListUpdateDto discountListUpdateDto = new DiscountListUpdateDto(); // DiscountListUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.apiV2PricingServiceDiscountListsDiscountListIdPut(tenantId, discountListId, apiVersion, xApiVersion, discountListUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountListsApi#apiV2PricingServiceDiscountListsDiscountListIdPut");
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
| **discountListId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **discountListUpdateDto** | [**DiscountListUpdateDto**](DiscountListUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="apiV2PricingServiceDiscountListsGet"></a>
# **apiV2PricingServiceDiscountListsGet**
> DiscountListDtoListEnvelope apiV2PricingServiceDiscountListsGet(tenantId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscountListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DiscountListsApi apiInstance = new DiscountListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      DiscountListDtoListEnvelope result = apiInstance.apiV2PricingServiceDiscountListsGet(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountListsApi#apiV2PricingServiceDiscountListsGet");
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

[**DiscountListDtoListEnvelope**](DiscountListDtoListEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="apiV2PricingServiceDiscountListsPost"></a>
# **apiV2PricingServiceDiscountListsPost**
> EmptyEnvelope apiV2PricingServiceDiscountListsPost(tenantId, apiVersion, xApiVersion, discountListCreateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscountListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DiscountListsApi apiInstance = new DiscountListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    DiscountListCreateDto discountListCreateDto = new DiscountListCreateDto(); // DiscountListCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.apiV2PricingServiceDiscountListsPost(tenantId, apiVersion, xApiVersion, discountListCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountListsApi#apiV2PricingServiceDiscountListsPost");
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
| **discountListCreateDto** | [**DiscountListCreateDto**](DiscountListCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="getDiscountListEntry"></a>
# **getDiscountListEntry**
> DiscountDtoEnvelope getDiscountListEntry(tenantId, discountListId, discountListEntryId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscountListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DiscountListsApi apiInstance = new DiscountListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID discountListId = UUID.randomUUID(); // UUID | 
    UUID discountListEntryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      DiscountDtoEnvelope result = apiInstance.getDiscountListEntry(tenantId, discountListId, discountListEntryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountListsApi#getDiscountListEntry");
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
| **discountListId** | **UUID**|  | |
| **discountListEntryId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**DiscountDtoEnvelope**](DiscountDtoEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

