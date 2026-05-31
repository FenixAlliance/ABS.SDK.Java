# KnowledgeArticlesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createKnowledgeArticleAsync**](KnowledgeArticlesApi.md#createKnowledgeArticleAsync) | **POST** /api/v2/SupportService/KnowledgeArticles | Create a knowledge article |
| [**deleteKnowledgeArticleAsync**](KnowledgeArticlesApi.md#deleteKnowledgeArticleAsync) | **DELETE** /api/v2/SupportService/KnowledgeArticles/{knowledgeArticleId} | Delete a knowledge article |
| [**getKnowledgeArticleAsync**](KnowledgeArticlesApi.md#getKnowledgeArticleAsync) | **GET** /api/v2/SupportService/KnowledgeArticles/{knowledgeArticleId} | Retrieve a knowledge article by ID |
| [**getKnowledgeArticlesAsync**](KnowledgeArticlesApi.md#getKnowledgeArticlesAsync) | **GET** /api/v2/SupportService/KnowledgeArticles | Retrieve knowledge articles |
| [**getKnowledgeArticlesCountAsync**](KnowledgeArticlesApi.md#getKnowledgeArticlesCountAsync) | **GET** /api/v2/SupportService/KnowledgeArticles/Count | Get knowledge articles count |
| [**updateKnowledgeArticleAsync**](KnowledgeArticlesApi.md#updateKnowledgeArticleAsync) | **PUT** /api/v2/SupportService/KnowledgeArticles/{knowledgeArticleId} | Update a knowledge article |


<a id="createKnowledgeArticleAsync"></a>
# **createKnowledgeArticleAsync**
> EmptyEnvelope createKnowledgeArticleAsync(tenantId, apiVersion, xApiVersion, knowledgeArticleCreateDto)

Create a knowledge article

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.KnowledgeArticlesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    KnowledgeArticlesApi apiInstance = new KnowledgeArticlesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    KnowledgeArticleCreateDto knowledgeArticleCreateDto = new KnowledgeArticleCreateDto(); // KnowledgeArticleCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createKnowledgeArticleAsync(tenantId, apiVersion, xApiVersion, knowledgeArticleCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeArticlesApi#createKnowledgeArticleAsync");
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
| **knowledgeArticleCreateDto** | [**KnowledgeArticleCreateDto**](KnowledgeArticleCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteKnowledgeArticleAsync"></a>
# **deleteKnowledgeArticleAsync**
> EmptyEnvelope deleteKnowledgeArticleAsync(tenantId, knowledgeArticleId, apiVersion, xApiVersion)

Delete a knowledge article

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.KnowledgeArticlesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    KnowledgeArticlesApi apiInstance = new KnowledgeArticlesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID knowledgeArticleId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteKnowledgeArticleAsync(tenantId, knowledgeArticleId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeArticlesApi#deleteKnowledgeArticleAsync");
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
| **knowledgeArticleId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getKnowledgeArticleAsync"></a>
# **getKnowledgeArticleAsync**
> KnowledgeArticleDtoEnvelope getKnowledgeArticleAsync(tenantId, knowledgeArticleId, apiVersion, xApiVersion)

Retrieve a knowledge article by ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.KnowledgeArticlesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    KnowledgeArticlesApi apiInstance = new KnowledgeArticlesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID knowledgeArticleId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      KnowledgeArticleDtoEnvelope result = apiInstance.getKnowledgeArticleAsync(tenantId, knowledgeArticleId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeArticlesApi#getKnowledgeArticleAsync");
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
| **knowledgeArticleId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**KnowledgeArticleDtoEnvelope**](KnowledgeArticleDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getKnowledgeArticlesAsync"></a>
# **getKnowledgeArticlesAsync**
> KnowledgeArticleDtoListEnvelope getKnowledgeArticlesAsync(tenantId, apiVersion, xApiVersion)

Retrieve knowledge articles

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.KnowledgeArticlesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    KnowledgeArticlesApi apiInstance = new KnowledgeArticlesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      KnowledgeArticleDtoListEnvelope result = apiInstance.getKnowledgeArticlesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeArticlesApi#getKnowledgeArticlesAsync");
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

### Return type

[**KnowledgeArticleDtoListEnvelope**](KnowledgeArticleDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getKnowledgeArticlesCountAsync"></a>
# **getKnowledgeArticlesCountAsync**
> Int32Envelope getKnowledgeArticlesCountAsync(tenantId, apiVersion, xApiVersion)

Get knowledge articles count

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.KnowledgeArticlesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    KnowledgeArticlesApi apiInstance = new KnowledgeArticlesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getKnowledgeArticlesCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeArticlesApi#getKnowledgeArticlesCountAsync");
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

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateKnowledgeArticleAsync"></a>
# **updateKnowledgeArticleAsync**
> EmptyEnvelope updateKnowledgeArticleAsync(tenantId, knowledgeArticleId, apiVersion, xApiVersion, knowledgeArticleUpdateDto)

Update a knowledge article

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.KnowledgeArticlesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    KnowledgeArticlesApi apiInstance = new KnowledgeArticlesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID knowledgeArticleId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    KnowledgeArticleUpdateDto knowledgeArticleUpdateDto = new KnowledgeArticleUpdateDto(); // KnowledgeArticleUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateKnowledgeArticleAsync(tenantId, knowledgeArticleId, apiVersion, xApiVersion, knowledgeArticleUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeArticlesApi#updateKnowledgeArticleAsync");
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
| **knowledgeArticleId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **knowledgeArticleUpdateDto** | [**KnowledgeArticleUpdateDto**](KnowledgeArticleUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

