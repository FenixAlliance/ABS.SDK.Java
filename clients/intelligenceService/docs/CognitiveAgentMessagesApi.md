# CognitiveAgentMessagesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCognitiveAgentMessageByIdAsync**](CognitiveAgentMessagesApi.md#getCognitiveAgentMessageByIdAsync) | **GET** /api/v2/IntelligenceService/CognitiveAgents/{agentId}/Conversations/{conversationId}/Messages/{id} | Get a cognitive agent conversation message by ID |
| [**getCognitiveAgentMessagesAsync**](CognitiveAgentMessagesApi.md#getCognitiveAgentMessagesAsync) | **GET** /api/v2/IntelligenceService/CognitiveAgents/{agentId}/Conversations/{conversationId}/Messages | Get all messages for a cognitive agent conversation |
| [**getCognitiveAgentMessagesCountAsync**](CognitiveAgentMessagesApi.md#getCognitiveAgentMessagesCountAsync) | **GET** /api/v2/IntelligenceService/CognitiveAgents/{agentId}/Conversations/{conversationId}/Messages/Count | Get message count for a cognitive agent conversation |


<a id="getCognitiveAgentMessageByIdAsync"></a>
# **getCognitiveAgentMessageByIdAsync**
> CognitiveAgentMessageDtoEnvelope getCognitiveAgentMessageByIdAsync(tenantId, agentId, conversationId, id, apiVersion, xApiVersion)

Get a cognitive agent conversation message by ID

Retrieves a specific durable message of a conversation by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CognitiveAgentMessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CognitiveAgentMessagesApi apiInstance = new CognitiveAgentMessagesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID agentId = UUID.randomUUID(); // UUID | 
    UUID conversationId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CognitiveAgentMessageDtoEnvelope result = apiInstance.getCognitiveAgentMessageByIdAsync(tenantId, agentId, conversationId, id, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CognitiveAgentMessagesApi#getCognitiveAgentMessageByIdAsync");
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
| **agentId** | **UUID**|  | |
| **conversationId** | **UUID**|  | |
| **id** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CognitiveAgentMessageDtoEnvelope**](CognitiveAgentMessageDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getCognitiveAgentMessagesAsync"></a>
# **getCognitiveAgentMessagesAsync**
> CognitiveAgentMessageDtoListEnvelope getCognitiveAgentMessagesAsync(tenantId, agentId, conversationId, apiVersion, xApiVersion, cognitiveAgentMessageDtoCollectionQueryParameters)

Get all messages for a cognitive agent conversation

Retrieves all durable messages for the specified conversation, agent and tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CognitiveAgentMessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CognitiveAgentMessagesApi apiInstance = new CognitiveAgentMessagesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID agentId = UUID.randomUUID(); // UUID | 
    UUID conversationId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CognitiveAgentMessageDtoCollectionQueryParameters cognitiveAgentMessageDtoCollectionQueryParameters = new CognitiveAgentMessageDtoCollectionQueryParameters(); // CognitiveAgentMessageDtoCollectionQueryParameters | 
    try {
      CognitiveAgentMessageDtoListEnvelope result = apiInstance.getCognitiveAgentMessagesAsync(tenantId, agentId, conversationId, apiVersion, xApiVersion, cognitiveAgentMessageDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CognitiveAgentMessagesApi#getCognitiveAgentMessagesAsync");
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
| **agentId** | **UUID**|  | |
| **conversationId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **cognitiveAgentMessageDtoCollectionQueryParameters** | [**CognitiveAgentMessageDtoCollectionQueryParameters**](CognitiveAgentMessageDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**CognitiveAgentMessageDtoListEnvelope**](CognitiveAgentMessageDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **200** | OK |  -  |

<a id="getCognitiveAgentMessagesCountAsync"></a>
# **getCognitiveAgentMessagesCountAsync**
> Int32Envelope getCognitiveAgentMessagesCountAsync(tenantId, agentId, conversationId, apiVersion, xApiVersion, cognitiveAgentMessageDtoCollectionQueryParameters)

Get message count for a cognitive agent conversation

Returns the count of durable messages for the specified conversation, agent and tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CognitiveAgentMessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CognitiveAgentMessagesApi apiInstance = new CognitiveAgentMessagesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID agentId = UUID.randomUUID(); // UUID | 
    UUID conversationId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CognitiveAgentMessageDtoCollectionQueryParameters cognitiveAgentMessageDtoCollectionQueryParameters = new CognitiveAgentMessageDtoCollectionQueryParameters(); // CognitiveAgentMessageDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getCognitiveAgentMessagesCountAsync(tenantId, agentId, conversationId, apiVersion, xApiVersion, cognitiveAgentMessageDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CognitiveAgentMessagesApi#getCognitiveAgentMessagesCountAsync");
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
| **agentId** | **UUID**|  | |
| **conversationId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **cognitiveAgentMessageDtoCollectionQueryParameters** | [**CognitiveAgentMessageDtoCollectionQueryParameters**](CognitiveAgentMessageDtoCollectionQueryParameters.md)|  | [optional] |

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
| **200** | OK |  -  |

