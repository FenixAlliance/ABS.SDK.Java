# CognitiveAgentConversationsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCognitiveAgentConversationAsync**](CognitiveAgentConversationsApi.md#createCognitiveAgentConversationAsync) | **POST** /api/v2/IntelligenceService/CognitiveAgents/{agentId}/Conversations | Create a new cognitive agent conversation |
| [**deleteCognitiveAgentConversationAsync**](CognitiveAgentConversationsApi.md#deleteCognitiveAgentConversationAsync) | **DELETE** /api/v2/IntelligenceService/CognitiveAgents/{agentId}/Conversations/{id} | Delete a cognitive agent conversation |
| [**getCognitiveAgentConversationByIdAsync**](CognitiveAgentConversationsApi.md#getCognitiveAgentConversationByIdAsync) | **GET** /api/v2/IntelligenceService/CognitiveAgents/{agentId}/Conversations/{id} | Get a cognitive agent conversation by ID |
| [**getCognitiveAgentConversationsAsync**](CognitiveAgentConversationsApi.md#getCognitiveAgentConversationsAsync) | **GET** /api/v2/IntelligenceService/CognitiveAgents/{agentId}/Conversations | Get all conversations for a cognitive agent |
| [**getCognitiveAgentConversationsCountAsync**](CognitiveAgentConversationsApi.md#getCognitiveAgentConversationsCountAsync) | **GET** /api/v2/IntelligenceService/CognitiveAgents/{agentId}/Conversations/Count | Get conversation count for a cognitive agent |
| [**updateCognitiveAgentConversationAsync**](CognitiveAgentConversationsApi.md#updateCognitiveAgentConversationAsync) | **PUT** /api/v2/IntelligenceService/CognitiveAgents/{agentId}/Conversations/{id} | Update a cognitive agent conversation |


<a id="createCognitiveAgentConversationAsync"></a>
# **createCognitiveAgentConversationAsync**
> createCognitiveAgentConversationAsync(tenantId, agentId, apiVersion, xApiVersion, cognitiveAgentConversationCreateDto)

Create a new cognitive agent conversation

Creates a new managed conversation for the specified cognitive agent and tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CognitiveAgentConversationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CognitiveAgentConversationsApi apiInstance = new CognitiveAgentConversationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID agentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CognitiveAgentConversationCreateDto cognitiveAgentConversationCreateDto = new CognitiveAgentConversationCreateDto(); // CognitiveAgentConversationCreateDto | 
    try {
      apiInstance.createCognitiveAgentConversationAsync(tenantId, agentId, apiVersion, xApiVersion, cognitiveAgentConversationCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CognitiveAgentConversationsApi#createCognitiveAgentConversationAsync");
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
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **cognitiveAgentConversationCreateDto** | [**CognitiveAgentConversationCreateDto**](CognitiveAgentConversationCreateDto.md)|  | [optional] |

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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

<a id="deleteCognitiveAgentConversationAsync"></a>
# **deleteCognitiveAgentConversationAsync**
> deleteCognitiveAgentConversationAsync(tenantId, agentId, id, apiVersion, xApiVersion)

Delete a cognitive agent conversation

Deletes a managed conversation for the specified cognitive agent and tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CognitiveAgentConversationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CognitiveAgentConversationsApi apiInstance = new CognitiveAgentConversationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID agentId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteCognitiveAgentConversationAsync(tenantId, agentId, id, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CognitiveAgentConversationsApi#deleteCognitiveAgentConversationAsync");
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
| **id** | **UUID**|  | |
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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getCognitiveAgentConversationByIdAsync"></a>
# **getCognitiveAgentConversationByIdAsync**
> CognitiveAgentConversationDtoEnvelope getCognitiveAgentConversationByIdAsync(tenantId, agentId, id, apiVersion, xApiVersion)

Get a cognitive agent conversation by ID

Retrieves a specific managed conversation of a cognitive agent by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CognitiveAgentConversationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CognitiveAgentConversationsApi apiInstance = new CognitiveAgentConversationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID agentId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CognitiveAgentConversationDtoEnvelope result = apiInstance.getCognitiveAgentConversationByIdAsync(tenantId, agentId, id, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CognitiveAgentConversationsApi#getCognitiveAgentConversationByIdAsync");
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
| **id** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CognitiveAgentConversationDtoEnvelope**](CognitiveAgentConversationDtoEnvelope.md)

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

<a id="getCognitiveAgentConversationsAsync"></a>
# **getCognitiveAgentConversationsAsync**
> CognitiveAgentConversationDtoListEnvelope getCognitiveAgentConversationsAsync(tenantId, agentId, apiVersion, xApiVersion, cognitiveAgentConversationDtoCollectionQueryParameters)

Get all conversations for a cognitive agent

Retrieves all managed conversations for the specified cognitive agent and tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CognitiveAgentConversationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CognitiveAgentConversationsApi apiInstance = new CognitiveAgentConversationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID agentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CognitiveAgentConversationDtoCollectionQueryParameters cognitiveAgentConversationDtoCollectionQueryParameters = new CognitiveAgentConversationDtoCollectionQueryParameters(); // CognitiveAgentConversationDtoCollectionQueryParameters | 
    try {
      CognitiveAgentConversationDtoListEnvelope result = apiInstance.getCognitiveAgentConversationsAsync(tenantId, agentId, apiVersion, xApiVersion, cognitiveAgentConversationDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CognitiveAgentConversationsApi#getCognitiveAgentConversationsAsync");
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
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **cognitiveAgentConversationDtoCollectionQueryParameters** | [**CognitiveAgentConversationDtoCollectionQueryParameters**](CognitiveAgentConversationDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**CognitiveAgentConversationDtoListEnvelope**](CognitiveAgentConversationDtoListEnvelope.md)

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

<a id="getCognitiveAgentConversationsCountAsync"></a>
# **getCognitiveAgentConversationsCountAsync**
> Int32Envelope getCognitiveAgentConversationsCountAsync(tenantId, agentId, apiVersion, xApiVersion, cognitiveAgentConversationDtoCollectionQueryParameters)

Get conversation count for a cognitive agent

Returns the count of managed conversations for the specified cognitive agent and tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CognitiveAgentConversationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CognitiveAgentConversationsApi apiInstance = new CognitiveAgentConversationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID agentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CognitiveAgentConversationDtoCollectionQueryParameters cognitiveAgentConversationDtoCollectionQueryParameters = new CognitiveAgentConversationDtoCollectionQueryParameters(); // CognitiveAgentConversationDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getCognitiveAgentConversationsCountAsync(tenantId, agentId, apiVersion, xApiVersion, cognitiveAgentConversationDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CognitiveAgentConversationsApi#getCognitiveAgentConversationsCountAsync");
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
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **cognitiveAgentConversationDtoCollectionQueryParameters** | [**CognitiveAgentConversationDtoCollectionQueryParameters**](CognitiveAgentConversationDtoCollectionQueryParameters.md)|  | [optional] |

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

<a id="updateCognitiveAgentConversationAsync"></a>
# **updateCognitiveAgentConversationAsync**
> updateCognitiveAgentConversationAsync(tenantId, agentId, id, apiVersion, xApiVersion, cognitiveAgentConversationUpdateDto)

Update a cognitive agent conversation

Updates an existing managed conversation for the specified cognitive agent and tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CognitiveAgentConversationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CognitiveAgentConversationsApi apiInstance = new CognitiveAgentConversationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID agentId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CognitiveAgentConversationUpdateDto cognitiveAgentConversationUpdateDto = new CognitiveAgentConversationUpdateDto(); // CognitiveAgentConversationUpdateDto | 
    try {
      apiInstance.updateCognitiveAgentConversationAsync(tenantId, agentId, id, apiVersion, xApiVersion, cognitiveAgentConversationUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CognitiveAgentConversationsApi#updateCognitiveAgentConversationAsync");
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
| **id** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **cognitiveAgentConversationUpdateDto** | [**CognitiveAgentConversationUpdateDto**](CognitiveAgentConversationUpdateDto.md)|  | [optional] |

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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

