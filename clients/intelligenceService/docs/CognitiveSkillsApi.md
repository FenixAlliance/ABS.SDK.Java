# CognitiveSkillsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCognitiveSkillAsync**](CognitiveSkillsApi.md#createCognitiveSkillAsync) | **POST** /api/v2/IntelligenceService/CognitiveSkills | Create a new cognitive skill |
| [**deleteCognitiveSkillAsync**](CognitiveSkillsApi.md#deleteCognitiveSkillAsync) | **DELETE** /api/v2/IntelligenceService/CognitiveSkills/{id} | Delete a cognitive skill |
| [**getCognitiveSkillByIdAsync**](CognitiveSkillsApi.md#getCognitiveSkillByIdAsync) | **GET** /api/v2/IntelligenceService/CognitiveSkills/{id} | Get cognitive skill by ID |
| [**getCognitiveSkillsAsync**](CognitiveSkillsApi.md#getCognitiveSkillsAsync) | **GET** /api/v2/IntelligenceService/CognitiveSkills | Get all cognitive skills |
| [**getCognitiveSkillsCountAsync**](CognitiveSkillsApi.md#getCognitiveSkillsCountAsync) | **GET** /api/v2/IntelligenceService/CognitiveSkills/Count | Get cognitive skills count |
| [**updateCognitiveSkillAsync**](CognitiveSkillsApi.md#updateCognitiveSkillAsync) | **PUT** /api/v2/IntelligenceService/CognitiveSkills/{id} | Update a cognitive skill |


<a id="createCognitiveSkillAsync"></a>
# **createCognitiveSkillAsync**
> createCognitiveSkillAsync(tenantId, apiVersion, xApiVersion, cognitiveSkillCreateDto)

Create a new cognitive skill

Creates a new reusable cognitive skill for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CognitiveSkillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CognitiveSkillsApi apiInstance = new CognitiveSkillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CognitiveSkillCreateDto cognitiveSkillCreateDto = new CognitiveSkillCreateDto(); // CognitiveSkillCreateDto | 
    try {
      apiInstance.createCognitiveSkillAsync(tenantId, apiVersion, xApiVersion, cognitiveSkillCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CognitiveSkillsApi#createCognitiveSkillAsync");
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
| **cognitiveSkillCreateDto** | [**CognitiveSkillCreateDto**](CognitiveSkillCreateDto.md)|  | [optional] |

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

<a id="deleteCognitiveSkillAsync"></a>
# **deleteCognitiveSkillAsync**
> deleteCognitiveSkillAsync(tenantId, id, apiVersion, xApiVersion)

Delete a cognitive skill

Deletes a reusable cognitive skill for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CognitiveSkillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CognitiveSkillsApi apiInstance = new CognitiveSkillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteCognitiveSkillAsync(tenantId, id, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CognitiveSkillsApi#deleteCognitiveSkillAsync");
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

<a id="getCognitiveSkillByIdAsync"></a>
# **getCognitiveSkillByIdAsync**
> CognitiveSkillDtoEnvelope getCognitiveSkillByIdAsync(tenantId, id, apiVersion, xApiVersion)

Get cognitive skill by ID

Retrieves a specific reusable cognitive skill by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CognitiveSkillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CognitiveSkillsApi apiInstance = new CognitiveSkillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CognitiveSkillDtoEnvelope result = apiInstance.getCognitiveSkillByIdAsync(tenantId, id, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CognitiveSkillsApi#getCognitiveSkillByIdAsync");
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

[**CognitiveSkillDtoEnvelope**](CognitiveSkillDtoEnvelope.md)

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

<a id="getCognitiveSkillsAsync"></a>
# **getCognitiveSkillsAsync**
> CognitiveSkillDtoListEnvelope getCognitiveSkillsAsync(tenantId, apiVersion, xApiVersion, cognitiveSkillDtoCollectionQueryParameters)

Get all cognitive skills

Retrieves all reusable cognitive skills for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CognitiveSkillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CognitiveSkillsApi apiInstance = new CognitiveSkillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CognitiveSkillDtoCollectionQueryParameters cognitiveSkillDtoCollectionQueryParameters = new CognitiveSkillDtoCollectionQueryParameters(); // CognitiveSkillDtoCollectionQueryParameters | 
    try {
      CognitiveSkillDtoListEnvelope result = apiInstance.getCognitiveSkillsAsync(tenantId, apiVersion, xApiVersion, cognitiveSkillDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CognitiveSkillsApi#getCognitiveSkillsAsync");
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
| **cognitiveSkillDtoCollectionQueryParameters** | [**CognitiveSkillDtoCollectionQueryParameters**](CognitiveSkillDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**CognitiveSkillDtoListEnvelope**](CognitiveSkillDtoListEnvelope.md)

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

<a id="getCognitiveSkillsCountAsync"></a>
# **getCognitiveSkillsCountAsync**
> Int32Envelope getCognitiveSkillsCountAsync(tenantId, apiVersion, xApiVersion, cognitiveSkillDtoCollectionQueryParameters)

Get cognitive skills count

Returns the count of reusable cognitive skills for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CognitiveSkillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CognitiveSkillsApi apiInstance = new CognitiveSkillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CognitiveSkillDtoCollectionQueryParameters cognitiveSkillDtoCollectionQueryParameters = new CognitiveSkillDtoCollectionQueryParameters(); // CognitiveSkillDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getCognitiveSkillsCountAsync(tenantId, apiVersion, xApiVersion, cognitiveSkillDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CognitiveSkillsApi#getCognitiveSkillsCountAsync");
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
| **cognitiveSkillDtoCollectionQueryParameters** | [**CognitiveSkillDtoCollectionQueryParameters**](CognitiveSkillDtoCollectionQueryParameters.md)|  | [optional] |

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

<a id="updateCognitiveSkillAsync"></a>
# **updateCognitiveSkillAsync**
> updateCognitiveSkillAsync(tenantId, id, apiVersion, xApiVersion, cognitiveSkillUpdateDto)

Update a cognitive skill

Updates an existing reusable cognitive skill for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CognitiveSkillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CognitiveSkillsApi apiInstance = new CognitiveSkillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CognitiveSkillUpdateDto cognitiveSkillUpdateDto = new CognitiveSkillUpdateDto(); // CognitiveSkillUpdateDto | 
    try {
      apiInstance.updateCognitiveSkillAsync(tenantId, id, apiVersion, xApiVersion, cognitiveSkillUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CognitiveSkillsApi#updateCognitiveSkillAsync");
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
| **cognitiveSkillUpdateDto** | [**CognitiveSkillUpdateDto**](CognitiveSkillUpdateDto.md)|  | [optional] |

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

