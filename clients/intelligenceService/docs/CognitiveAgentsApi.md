# CognitiveAgentsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCognitiveAgentAsync**](CognitiveAgentsApi.md#createCognitiveAgentAsync) | **POST** /api/v2/IntelligenceService/CognitiveAgents | Create a new cognitive agent |
| [**deleteCognitiveAgentAsync**](CognitiveAgentsApi.md#deleteCognitiveAgentAsync) | **DELETE** /api/v2/IntelligenceService/CognitiveAgents/{id} | Delete a cognitive agent |
| [**getCognitiveAgentByIdAsync**](CognitiveAgentsApi.md#getCognitiveAgentByIdAsync) | **GET** /api/v2/IntelligenceService/CognitiveAgents/{id} | Get cognitive agent by ID |
| [**getCognitiveAgentsAsync**](CognitiveAgentsApi.md#getCognitiveAgentsAsync) | **GET** /api/v2/IntelligenceService/CognitiveAgents | Get all cognitive agents |
| [**getCognitiveAgentsCountAsync**](CognitiveAgentsApi.md#getCognitiveAgentsCountAsync) | **GET** /api/v2/IntelligenceService/CognitiveAgents/Count | Get cognitive agents count |
| [**updateCognitiveAgentAsync**](CognitiveAgentsApi.md#updateCognitiveAgentAsync) | **PUT** /api/v2/IntelligenceService/CognitiveAgents/{id} | Update a cognitive agent |


<a id="createCognitiveAgentAsync"></a>
# **createCognitiveAgentAsync**
> createCognitiveAgentAsync(tenantId, apiVersion, xApiVersion, cognitiveAgentCreateDto)

Create a new cognitive agent

Creates a new managed cognitive agent for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CognitiveAgentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CognitiveAgentsApi apiInstance = new CognitiveAgentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CognitiveAgentCreateDto cognitiveAgentCreateDto = new CognitiveAgentCreateDto(); // CognitiveAgentCreateDto | 
    try {
      apiInstance.createCognitiveAgentAsync(tenantId, apiVersion, xApiVersion, cognitiveAgentCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CognitiveAgentsApi#createCognitiveAgentAsync");
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
| **cognitiveAgentCreateDto** | [**CognitiveAgentCreateDto**](CognitiveAgentCreateDto.md)|  | [optional] |

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

<a id="deleteCognitiveAgentAsync"></a>
# **deleteCognitiveAgentAsync**
> deleteCognitiveAgentAsync(tenantId, id, apiVersion, xApiVersion)

Delete a cognitive agent

Deletes a managed cognitive agent for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CognitiveAgentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CognitiveAgentsApi apiInstance = new CognitiveAgentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteCognitiveAgentAsync(tenantId, id, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CognitiveAgentsApi#deleteCognitiveAgentAsync");
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

<a id="getCognitiveAgentByIdAsync"></a>
# **getCognitiveAgentByIdAsync**
> CognitiveAgentDtoEnvelope getCognitiveAgentByIdAsync(tenantId, id, apiVersion, xApiVersion)

Get cognitive agent by ID

Retrieves a specific managed cognitive agent by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CognitiveAgentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CognitiveAgentsApi apiInstance = new CognitiveAgentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CognitiveAgentDtoEnvelope result = apiInstance.getCognitiveAgentByIdAsync(tenantId, id, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CognitiveAgentsApi#getCognitiveAgentByIdAsync");
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
| **id** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CognitiveAgentDtoEnvelope**](CognitiveAgentDtoEnvelope.md)

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

<a id="getCognitiveAgentsAsync"></a>
# **getCognitiveAgentsAsync**
> CognitiveAgentDtoListEnvelope getCognitiveAgentsAsync(tenantId, apiVersion, xApiVersion, cognitiveAgentDtoCollectionQueryParameters)

Get all cognitive agents

Retrieves all managed cognitive agents for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CognitiveAgentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CognitiveAgentsApi apiInstance = new CognitiveAgentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CognitiveAgentDtoCollectionQueryParameters cognitiveAgentDtoCollectionQueryParameters = new CognitiveAgentDtoCollectionQueryParameters(); // CognitiveAgentDtoCollectionQueryParameters | 
    try {
      CognitiveAgentDtoListEnvelope result = apiInstance.getCognitiveAgentsAsync(tenantId, apiVersion, xApiVersion, cognitiveAgentDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CognitiveAgentsApi#getCognitiveAgentsAsync");
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
| **cognitiveAgentDtoCollectionQueryParameters** | [**CognitiveAgentDtoCollectionQueryParameters**](CognitiveAgentDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**CognitiveAgentDtoListEnvelope**](CognitiveAgentDtoListEnvelope.md)

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

<a id="getCognitiveAgentsCountAsync"></a>
# **getCognitiveAgentsCountAsync**
> Int32Envelope getCognitiveAgentsCountAsync(tenantId, apiVersion, xApiVersion, cognitiveAgentDtoCollectionQueryParameters)

Get cognitive agents count

Returns the count of managed cognitive agents for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CognitiveAgentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CognitiveAgentsApi apiInstance = new CognitiveAgentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CognitiveAgentDtoCollectionQueryParameters cognitiveAgentDtoCollectionQueryParameters = new CognitiveAgentDtoCollectionQueryParameters(); // CognitiveAgentDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getCognitiveAgentsCountAsync(tenantId, apiVersion, xApiVersion, cognitiveAgentDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CognitiveAgentsApi#getCognitiveAgentsCountAsync");
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
| **cognitiveAgentDtoCollectionQueryParameters** | [**CognitiveAgentDtoCollectionQueryParameters**](CognitiveAgentDtoCollectionQueryParameters.md)|  | [optional] |

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

<a id="updateCognitiveAgentAsync"></a>
# **updateCognitiveAgentAsync**
> updateCognitiveAgentAsync(tenantId, id, apiVersion, xApiVersion, cognitiveAgentUpdateDto)

Update a cognitive agent

Updates an existing managed cognitive agent for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CognitiveAgentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CognitiveAgentsApi apiInstance = new CognitiveAgentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CognitiveAgentUpdateDto cognitiveAgentUpdateDto = new CognitiveAgentUpdateDto(); // CognitiveAgentUpdateDto | 
    try {
      apiInstance.updateCognitiveAgentAsync(tenantId, id, apiVersion, xApiVersion, cognitiveAgentUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CognitiveAgentsApi#updateCognitiveAgentAsync");
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
| **id** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **cognitiveAgentUpdateDto** | [**CognitiveAgentUpdateDto**](CognitiveAgentUpdateDto.md)|  | [optional] |

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

