# CognitiveAgentConversationAttachmentsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**uploadCognitiveAgentConversationAttachmentAsync**](CognitiveAgentConversationAttachmentsApi.md#uploadCognitiveAgentConversationAttachmentAsync) | **POST** /api/v2/IntelligenceService/CognitiveAgents/{agentId}/Conversations/{conversationId}/Attachments | Upload an attachment to a cognitive agent conversation |


<a id="uploadCognitiveAgentConversationAttachmentAsync"></a>
# **uploadCognitiveAgentConversationAttachmentAsync**
> ConversationAttachmentUploadResultDtoEnvelope uploadCognitiveAgentConversationAttachmentAsync(tenantId, agentId, conversationId, apiVersion, xApiVersion, _file)

Upload an attachment to a cognitive agent conversation

Uploads a file into the acting user&#39;s OWN conversation attachment store, scanned and catalogued through the storage spine. A conversation the caller does not own returns 404. The response carries the new file&#39;s id, name, content type and length; the chat UI passes that id as an AttachmentFileIds entry when it sends the referencing user turn.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CognitiveAgentConversationAttachmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CognitiveAgentConversationAttachmentsApi apiInstance = new CognitiveAgentConversationAttachmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID agentId = UUID.randomUUID(); // UUID | 
    UUID conversationId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    File _file = new File("/path/to/file"); // File | 
    try {
      ConversationAttachmentUploadResultDtoEnvelope result = apiInstance.uploadCognitiveAgentConversationAttachmentAsync(tenantId, agentId, conversationId, apiVersion, xApiVersion, _file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CognitiveAgentConversationAttachmentsApi#uploadCognitiveAgentConversationAttachmentAsync");
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
| **_file** | **File**|  | [optional] |

### Return type

[**ConversationAttachmentUploadResultDtoEnvelope**](ConversationAttachmentUploadResultDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **200** | OK |  -  |

