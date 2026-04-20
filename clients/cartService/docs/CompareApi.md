# CompareApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addItemToCompareTableAsync**](CompareApi.md#addItemToCompareTableAsync) | **POST** /api/v2/CartService/Compare | Add an item to the compare table |
| [**getItemToCompareRecord**](CompareApi.md#getItemToCompareRecord) | **GET** /api/v2/CartService/Compare/{recordId}/Details | Get compare record details |
| [**getItemToCompareRecords**](CompareApi.md#getItemToCompareRecords) | **GET** /api/v2/CartService/Compare/{cartId} | Get items to compare in a cart |
| [**removeItemFromCompareTable**](CompareApi.md#removeItemFromCompareTable) | **DELETE** /api/v2/CartService/Compare/{recordId} | Remove an item from the compare table |


<a id="addItemToCompareTableAsync"></a>
# **addItemToCompareTableAsync**
> ItemCartRecordDto addItemToCompareTableAsync(apiVersion, xApiVersion, addProductToCompareRequest)

Add an item to the compare table

Adds a product to the compare table for the specified cart with tracking.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CompareApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CompareApi apiInstance = new CompareApi(defaultClient);
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    AddProductToCompareRequest addProductToCompareRequest = new AddProductToCompareRequest(); // AddProductToCompareRequest | 
    try {
      ItemCartRecordDto result = apiInstance.addItemToCompareTableAsync(apiVersion, xApiVersion, addProductToCompareRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompareApi#addItemToCompareTableAsync");
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
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **addProductToCompareRequest** | [**AddProductToCompareRequest**](AddProductToCompareRequest.md)|  | [optional] |

### Return type

[**ItemCartRecordDto**](ItemCartRecordDto.md)

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

<a id="getItemToCompareRecord"></a>
# **getItemToCompareRecord**
> ItemToCompareCartRecordDtoEnvelope getItemToCompareRecord(recordId, apiVersion, xApiVersion)

Get compare record details

Retrieves the details of a specific item-to-compare cart record.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CompareApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CompareApi apiInstance = new CompareApi(defaultClient);
    UUID recordId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemToCompareCartRecordDtoEnvelope result = apiInstance.getItemToCompareRecord(recordId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompareApi#getItemToCompareRecord");
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
| **recordId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemToCompareCartRecordDtoEnvelope**](ItemToCompareCartRecordDtoEnvelope.md)

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

<a id="getItemToCompareRecords"></a>
# **getItemToCompareRecords**
> ItemToCompareCartRecordDtoListEnvelope getItemToCompareRecords(cartId, apiVersion, xApiVersion)

Get items to compare in a cart

Retrieves all items added to the compare table for the specified cart.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CompareApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CompareApi apiInstance = new CompareApi(defaultClient);
    UUID cartId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemToCompareCartRecordDtoListEnvelope result = apiInstance.getItemToCompareRecords(cartId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompareApi#getItemToCompareRecords");
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
| **cartId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemToCompareCartRecordDtoListEnvelope**](ItemToCompareCartRecordDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="removeItemFromCompareTable"></a>
# **removeItemFromCompareTable**
> ItemToCompareCartRecordDto removeItemFromCompareTable(recordId, apiVersion, xApiVersion)

Remove an item from the compare table

Removes a specific record from the compare table by its record ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CompareApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CompareApi apiInstance = new CompareApi(defaultClient);
    UUID recordId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemToCompareCartRecordDto result = apiInstance.removeItemFromCompareTable(recordId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompareApi#removeItemFromCompareTable");
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
| **recordId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemToCompareCartRecordDto**](ItemToCompareCartRecordDto.md)

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

