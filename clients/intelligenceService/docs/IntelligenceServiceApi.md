# IntelligenceServiceApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**invokeAgentSurfaceAsync**](IntelligenceServiceApi.md#invokeAgentSurfaceAsync) | **POST** /api/v2/IntelligenceService/Agents/{agentId}/agui | Run a governed agent over the AG-UI protocol |


<a id="invokeAgentSurfaceAsync"></a>
# **invokeAgentSurfaceAsync**
> invokeAgentSurfaceAsync(agentId)

Run a governed agent over the AG-UI protocol

Streams a governed agent run as AG-UI server-sent events. Feature-flagged on ABP.Cognitive.AgentSurface.Enable; returns 503 when disabled, 401 when unauthorized and 404 when the agent cannot be resolved. An optional ?projectId&#x3D; binds the run to a project (resolved tenant-scoped): the project id + name are surfaced to the model as context so it can call the governed project-storage tools; it is never auto-filled into a tool&#39;s arguments.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IntelligenceServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    IntelligenceServiceApi apiInstance = new IntelligenceServiceApi(defaultClient);
    String agentId = "agentId_example"; // String | 
    try {
      apiInstance.invokeAgentSurfaceAsync(agentId);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntelligenceServiceApi#invokeAgentSurfaceAsync");
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
| **agentId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

