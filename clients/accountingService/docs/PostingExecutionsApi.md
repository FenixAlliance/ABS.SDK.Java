# PostingExecutionsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**countPostingExecutionsAsync**](PostingExecutionsApi.md#countPostingExecutionsAsync) | **GET** /api/v2/AccountingService/PostingExecutions/Count | Count posting executions |
| [**getPostingExecutionsAsync**](PostingExecutionsApi.md#getPostingExecutionsAsync) | **GET** /api/v2/AccountingService/PostingExecutions | List posting executions |


<a id="countPostingExecutionsAsync"></a>
# **countPostingExecutionsAsync**
> Int32Envelope countPostingExecutionsAsync(tenantId, apiVersion, xApiVersion, postingExecutionDtoCollectionQueryParameters)

Count posting executions

Returns the count of the tenant&#39;s posting-inbox executions under the same OData shaping as the list read (e.g. $filter&#x3D;Status eq &#39;Rejected&#39; to count rejected intents). Requires journals_read.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PostingExecutionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PostingExecutionsApi apiInstance = new PostingExecutionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    PostingExecutionDtoCollectionQueryParameters postingExecutionDtoCollectionQueryParameters = new PostingExecutionDtoCollectionQueryParameters(); // PostingExecutionDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.countPostingExecutionsAsync(tenantId, apiVersion, xApiVersion, postingExecutionDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PostingExecutionsApi#countPostingExecutionsAsync");
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
| **postingExecutionDtoCollectionQueryParameters** | [**PostingExecutionDtoCollectionQueryParameters**](PostingExecutionDtoCollectionQueryParameters.md)|  | [optional] |

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
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="getPostingExecutionsAsync"></a>
# **getPostingExecutionsAsync**
> PostingExecutionDtoIReadOnlyListEnvelope getPostingExecutionsAsync(tenantId, apiVersion, xApiVersion, postingExecutionDtoCollectionQueryParameters)

List posting executions

Lists the tenant&#39;s posting-inbox executions (the durable evidence of every posting intent). Use OData to scope to a state — e.g. $filter&#x3D;Status eq &#39;Rejected&#39; for rejected intents, or Status eq &#39;PendingMapping&#39;/&#39;PendingPeriod&#39;/&#39;PendingRate&#39; for the retryable pending set — and to page/order. Requires journals_read.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PostingExecutionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PostingExecutionsApi apiInstance = new PostingExecutionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    PostingExecutionDtoCollectionQueryParameters postingExecutionDtoCollectionQueryParameters = new PostingExecutionDtoCollectionQueryParameters(); // PostingExecutionDtoCollectionQueryParameters | 
    try {
      PostingExecutionDtoIReadOnlyListEnvelope result = apiInstance.getPostingExecutionsAsync(tenantId, apiVersion, xApiVersion, postingExecutionDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PostingExecutionsApi#getPostingExecutionsAsync");
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
| **postingExecutionDtoCollectionQueryParameters** | [**PostingExecutionDtoCollectionQueryParameters**](PostingExecutionDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**PostingExecutionDtoIReadOnlyListEnvelope**](PostingExecutionDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

