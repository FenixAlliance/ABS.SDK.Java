# CognitiveAgentSkillsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCognitiveAgentSkillAsync**](CognitiveAgentSkillsApi.md#createCognitiveAgentSkillAsync) | **POST** /api/v2/IntelligenceService/CognitiveAgents/{agentId}/Skills | Assign a skill to a cognitive agent |
| [**deleteCognitiveAgentSkillAsync**](CognitiveAgentSkillsApi.md#deleteCognitiveAgentSkillAsync) | **DELETE** /api/v2/IntelligenceService/CognitiveAgents/{agentId}/Skills/{id} | Remove a skill assignment from a cognitive agent |
| [**getCognitiveAgentSkillByIdAsync**](CognitiveAgentSkillsApi.md#getCognitiveAgentSkillByIdAsync) | **GET** /api/v2/IntelligenceService/CognitiveAgents/{agentId}/Skills/{id} | Get a cognitive agent skill assignment by ID |
| [**getCognitiveAgentSkillsAsync**](CognitiveAgentSkillsApi.md#getCognitiveAgentSkillsAsync) | **GET** /api/v2/IntelligenceService/CognitiveAgents/{agentId}/Skills | Get all skill assignments for a cognitive agent |
| [**getCognitiveAgentSkillsCountAsync**](CognitiveAgentSkillsApi.md#getCognitiveAgentSkillsCountAsync) | **GET** /api/v2/IntelligenceService/CognitiveAgents/{agentId}/Skills/Count | Get skill assignment count for a cognitive agent |
| [**updateCognitiveAgentSkillAsync**](CognitiveAgentSkillsApi.md#updateCognitiveAgentSkillAsync) | **PUT** /api/v2/IntelligenceService/CognitiveAgents/{agentId}/Skills/{id} | Update a cognitive agent skill assignment |


<a id="createCognitiveAgentSkillAsync"></a>
# **createCognitiveAgentSkillAsync**
> createCognitiveAgentSkillAsync(tenantId, agentId, apiVersion, xApiVersion, cognitiveAgentSkillCreateDto)

Assign a skill to a cognitive agent

Assigns a reusable catalog skill to the specified cognitive agent and tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CognitiveAgentSkillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CognitiveAgentSkillsApi apiInstance = new CognitiveAgentSkillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID agentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CognitiveAgentSkillCreateDto cognitiveAgentSkillCreateDto = new CognitiveAgentSkillCreateDto(); // CognitiveAgentSkillCreateDto | 
    try {
      apiInstance.createCognitiveAgentSkillAsync(tenantId, agentId, apiVersion, xApiVersion, cognitiveAgentSkillCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CognitiveAgentSkillsApi#createCognitiveAgentSkillAsync");
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
| **cognitiveAgentSkillCreateDto** | [**CognitiveAgentSkillCreateDto**](CognitiveAgentSkillCreateDto.md)|  | [optional] |

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

<a id="deleteCognitiveAgentSkillAsync"></a>
# **deleteCognitiveAgentSkillAsync**
> deleteCognitiveAgentSkillAsync(tenantId, agentId, id, apiVersion, xApiVersion)

Remove a skill assignment from a cognitive agent

Removes a skill assignment from the specified cognitive agent and tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CognitiveAgentSkillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CognitiveAgentSkillsApi apiInstance = new CognitiveAgentSkillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID agentId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteCognitiveAgentSkillAsync(tenantId, agentId, id, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CognitiveAgentSkillsApi#deleteCognitiveAgentSkillAsync");
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

<a id="getCognitiveAgentSkillByIdAsync"></a>
# **getCognitiveAgentSkillByIdAsync**
> CognitiveAgentSkillDtoEnvelope getCognitiveAgentSkillByIdAsync(tenantId, agentId, id, apiVersion, xApiVersion)

Get a cognitive agent skill assignment by ID

Retrieves a specific skill assignment of a cognitive agent by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CognitiveAgentSkillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CognitiveAgentSkillsApi apiInstance = new CognitiveAgentSkillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID agentId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CognitiveAgentSkillDtoEnvelope result = apiInstance.getCognitiveAgentSkillByIdAsync(tenantId, agentId, id, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CognitiveAgentSkillsApi#getCognitiveAgentSkillByIdAsync");
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

[**CognitiveAgentSkillDtoEnvelope**](CognitiveAgentSkillDtoEnvelope.md)

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

<a id="getCognitiveAgentSkillsAsync"></a>
# **getCognitiveAgentSkillsAsync**
> CognitiveAgentSkillDtoListEnvelope getCognitiveAgentSkillsAsync(tenantId, agentId, apiVersion, xApiVersion, cognitiveAgentSkillDtoCollectionQueryParameters)

Get all skill assignments for a cognitive agent

Retrieves all skill assignments for the specified cognitive agent and tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CognitiveAgentSkillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CognitiveAgentSkillsApi apiInstance = new CognitiveAgentSkillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID agentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CognitiveAgentSkillDtoCollectionQueryParameters cognitiveAgentSkillDtoCollectionQueryParameters = new CognitiveAgentSkillDtoCollectionQueryParameters(); // CognitiveAgentSkillDtoCollectionQueryParameters | 
    try {
      CognitiveAgentSkillDtoListEnvelope result = apiInstance.getCognitiveAgentSkillsAsync(tenantId, agentId, apiVersion, xApiVersion, cognitiveAgentSkillDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CognitiveAgentSkillsApi#getCognitiveAgentSkillsAsync");
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
| **cognitiveAgentSkillDtoCollectionQueryParameters** | [**CognitiveAgentSkillDtoCollectionQueryParameters**](CognitiveAgentSkillDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**CognitiveAgentSkillDtoListEnvelope**](CognitiveAgentSkillDtoListEnvelope.md)

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

<a id="getCognitiveAgentSkillsCountAsync"></a>
# **getCognitiveAgentSkillsCountAsync**
> Int32Envelope getCognitiveAgentSkillsCountAsync(tenantId, agentId, apiVersion, xApiVersion, cognitiveAgentSkillDtoCollectionQueryParameters)

Get skill assignment count for a cognitive agent

Returns the count of skill assignments for the specified cognitive agent and tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CognitiveAgentSkillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CognitiveAgentSkillsApi apiInstance = new CognitiveAgentSkillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID agentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CognitiveAgentSkillDtoCollectionQueryParameters cognitiveAgentSkillDtoCollectionQueryParameters = new CognitiveAgentSkillDtoCollectionQueryParameters(); // CognitiveAgentSkillDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getCognitiveAgentSkillsCountAsync(tenantId, agentId, apiVersion, xApiVersion, cognitiveAgentSkillDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CognitiveAgentSkillsApi#getCognitiveAgentSkillsCountAsync");
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
| **cognitiveAgentSkillDtoCollectionQueryParameters** | [**CognitiveAgentSkillDtoCollectionQueryParameters**](CognitiveAgentSkillDtoCollectionQueryParameters.md)|  | [optional] |

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

<a id="updateCognitiveAgentSkillAsync"></a>
# **updateCognitiveAgentSkillAsync**
> updateCognitiveAgentSkillAsync(tenantId, agentId, id, apiVersion, xApiVersion, cognitiveAgentSkillUpdateDto)

Update a cognitive agent skill assignment

Updates the per-assignment overrides of a skill assignment for the specified agent and tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CognitiveAgentSkillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CognitiveAgentSkillsApi apiInstance = new CognitiveAgentSkillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID agentId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CognitiveAgentSkillUpdateDto cognitiveAgentSkillUpdateDto = new CognitiveAgentSkillUpdateDto(); // CognitiveAgentSkillUpdateDto | 
    try {
      apiInstance.updateCognitiveAgentSkillAsync(tenantId, agentId, id, apiVersion, xApiVersion, cognitiveAgentSkillUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CognitiveAgentSkillsApi#updateCognitiveAgentSkillAsync");
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
| **cognitiveAgentSkillUpdateDto** | [**CognitiveAgentSkillUpdateDto**](CognitiveAgentSkillUpdateDto.md)|  | [optional] |

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

