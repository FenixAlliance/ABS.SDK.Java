# CognitiveAgentVariablesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCognitiveAgentVariableAsync**](CognitiveAgentVariablesApi.md#createCognitiveAgentVariableAsync) | **POST** /api/v2/IntelligenceService/CognitiveAgents/{agentId}/Variables | Add a variable to a cognitive agent |
| [**deleteCognitiveAgentVariableAsync**](CognitiveAgentVariablesApi.md#deleteCognitiveAgentVariableAsync) | **DELETE** /api/v2/IntelligenceService/CognitiveAgents/{agentId}/Variables/{id} | Remove a variable from a cognitive agent |
| [**getCognitiveAgentVariableByIdAsync**](CognitiveAgentVariablesApi.md#getCognitiveAgentVariableByIdAsync) | **GET** /api/v2/IntelligenceService/CognitiveAgents/{agentId}/Variables/{id} | Get a cognitive agent variable by ID |
| [**getCognitiveAgentVariablesAsync**](CognitiveAgentVariablesApi.md#getCognitiveAgentVariablesAsync) | **GET** /api/v2/IntelligenceService/CognitiveAgents/{agentId}/Variables | Get all variables for a cognitive agent |
| [**getCognitiveAgentVariablesCountAsync**](CognitiveAgentVariablesApi.md#getCognitiveAgentVariablesCountAsync) | **GET** /api/v2/IntelligenceService/CognitiveAgents/{agentId}/Variables/Count | Get variable count for a cognitive agent |
| [**updateCognitiveAgentVariableAsync**](CognitiveAgentVariablesApi.md#updateCognitiveAgentVariableAsync) | **PUT** /api/v2/IntelligenceService/CognitiveAgents/{agentId}/Variables/{id} | Update a cognitive agent variable |


<a id="createCognitiveAgentVariableAsync"></a>
# **createCognitiveAgentVariableAsync**
> createCognitiveAgentVariableAsync(tenantId, agentId, apiVersion, xApiVersion, cognitiveAgentVariableCreateDto)

Add a variable to a cognitive agent

Adds a key/value variable to the specified cognitive agent and tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CognitiveAgentVariablesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CognitiveAgentVariablesApi apiInstance = new CognitiveAgentVariablesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID agentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CognitiveAgentVariableCreateDto cognitiveAgentVariableCreateDto = new CognitiveAgentVariableCreateDto(); // CognitiveAgentVariableCreateDto | 
    try {
      apiInstance.createCognitiveAgentVariableAsync(tenantId, agentId, apiVersion, xApiVersion, cognitiveAgentVariableCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CognitiveAgentVariablesApi#createCognitiveAgentVariableAsync");
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
| **cognitiveAgentVariableCreateDto** | [**CognitiveAgentVariableCreateDto**](CognitiveAgentVariableCreateDto.md)|  | [optional] |

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

<a id="deleteCognitiveAgentVariableAsync"></a>
# **deleteCognitiveAgentVariableAsync**
> deleteCognitiveAgentVariableAsync(tenantId, agentId, id, apiVersion, xApiVersion)

Remove a variable from a cognitive agent

Removes a variable from the specified cognitive agent and tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CognitiveAgentVariablesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CognitiveAgentVariablesApi apiInstance = new CognitiveAgentVariablesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID agentId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteCognitiveAgentVariableAsync(tenantId, agentId, id, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CognitiveAgentVariablesApi#deleteCognitiveAgentVariableAsync");
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

<a id="getCognitiveAgentVariableByIdAsync"></a>
# **getCognitiveAgentVariableByIdAsync**
> CognitiveAgentVariableDtoEnvelope getCognitiveAgentVariableByIdAsync(tenantId, agentId, id, apiVersion, xApiVersion)

Get a cognitive agent variable by ID

Retrieves a specific variable of a cognitive agent by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CognitiveAgentVariablesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CognitiveAgentVariablesApi apiInstance = new CognitiveAgentVariablesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID agentId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CognitiveAgentVariableDtoEnvelope result = apiInstance.getCognitiveAgentVariableByIdAsync(tenantId, agentId, id, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CognitiveAgentVariablesApi#getCognitiveAgentVariableByIdAsync");
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

[**CognitiveAgentVariableDtoEnvelope**](CognitiveAgentVariableDtoEnvelope.md)

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

<a id="getCognitiveAgentVariablesAsync"></a>
# **getCognitiveAgentVariablesAsync**
> CognitiveAgentVariableDtoListEnvelope getCognitiveAgentVariablesAsync(tenantId, agentId, apiVersion, xApiVersion, cognitiveAgentVariableDtoCollectionQueryParameters)

Get all variables for a cognitive agent

Retrieves all key/value variables for the specified cognitive agent and tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CognitiveAgentVariablesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CognitiveAgentVariablesApi apiInstance = new CognitiveAgentVariablesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID agentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CognitiveAgentVariableDtoCollectionQueryParameters cognitiveAgentVariableDtoCollectionQueryParameters = new CognitiveAgentVariableDtoCollectionQueryParameters(); // CognitiveAgentVariableDtoCollectionQueryParameters | 
    try {
      CognitiveAgentVariableDtoListEnvelope result = apiInstance.getCognitiveAgentVariablesAsync(tenantId, agentId, apiVersion, xApiVersion, cognitiveAgentVariableDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CognitiveAgentVariablesApi#getCognitiveAgentVariablesAsync");
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
| **cognitiveAgentVariableDtoCollectionQueryParameters** | [**CognitiveAgentVariableDtoCollectionQueryParameters**](CognitiveAgentVariableDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**CognitiveAgentVariableDtoListEnvelope**](CognitiveAgentVariableDtoListEnvelope.md)

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

<a id="getCognitiveAgentVariablesCountAsync"></a>
# **getCognitiveAgentVariablesCountAsync**
> Int32Envelope getCognitiveAgentVariablesCountAsync(tenantId, agentId, apiVersion, xApiVersion, cognitiveAgentVariableDtoCollectionQueryParameters)

Get variable count for a cognitive agent

Returns the count of variables for the specified cognitive agent and tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CognitiveAgentVariablesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CognitiveAgentVariablesApi apiInstance = new CognitiveAgentVariablesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID agentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CognitiveAgentVariableDtoCollectionQueryParameters cognitiveAgentVariableDtoCollectionQueryParameters = new CognitiveAgentVariableDtoCollectionQueryParameters(); // CognitiveAgentVariableDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getCognitiveAgentVariablesCountAsync(tenantId, agentId, apiVersion, xApiVersion, cognitiveAgentVariableDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CognitiveAgentVariablesApi#getCognitiveAgentVariablesCountAsync");
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
| **cognitiveAgentVariableDtoCollectionQueryParameters** | [**CognitiveAgentVariableDtoCollectionQueryParameters**](CognitiveAgentVariableDtoCollectionQueryParameters.md)|  | [optional] |

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

<a id="updateCognitiveAgentVariableAsync"></a>
# **updateCognitiveAgentVariableAsync**
> updateCognitiveAgentVariableAsync(tenantId, agentId, id, apiVersion, xApiVersion, cognitiveAgentVariableUpdateDto)

Update a cognitive agent variable

Updates the value of a variable for the specified agent and tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CognitiveAgentVariablesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CognitiveAgentVariablesApi apiInstance = new CognitiveAgentVariablesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID agentId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CognitiveAgentVariableUpdateDto cognitiveAgentVariableUpdateDto = new CognitiveAgentVariableUpdateDto(); // CognitiveAgentVariableUpdateDto | 
    try {
      apiInstance.updateCognitiveAgentVariableAsync(tenantId, agentId, id, apiVersion, xApiVersion, cognitiveAgentVariableUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CognitiveAgentVariablesApi#updateCognitiveAgentVariableAsync");
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
| **cognitiveAgentVariableUpdateDto** | [**CognitiveAgentVariableUpdateDto**](CognitiveAgentVariableUpdateDto.md)|  | [optional] |

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

