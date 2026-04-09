# ThemesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getLatestCurrencyRatesModelAsync**](ThemesApi.md#getLatestCurrencyRatesModelAsync) | **GET** /api/v2/ContentService/Themes/Update | Update base web content themes |


<a id="getLatestCurrencyRatesModelAsync"></a>
# **getLatestCurrencyRatesModelAsync**
> getLatestCurrencyRatesModelAsync(apiVersion, xApiVersion)

Update base web content themes

Triggers an update of the base web content themes.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ThemesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ThemesApi apiInstance = new ThemesApi(defaultClient);
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.getLatestCurrencyRatesModelAsync(apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThemesApi#getLatestCurrencyRatesModelAsync");
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
| **401** | Unauthorized |  -  |

