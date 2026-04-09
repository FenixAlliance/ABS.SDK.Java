# ItemQuestionsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createItemQuestionAsync**](ItemQuestionsApi.md#createItemQuestionAsync) | **POST** /api/v2/CatalogService/ItemQuestions | Create a new item question |
| [**deleteItemQuestionAsync**](ItemQuestionsApi.md#deleteItemQuestionAsync) | **DELETE** /api/v2/CatalogService/ItemQuestions/{itemQuestionId} | Delete an item question |
| [**getItemQuestionByIdAsync**](ItemQuestionsApi.md#getItemQuestionByIdAsync) | **GET** /api/v2/CatalogService/ItemQuestions/{itemQuestionId} | Get item question by ID |
| [**getItemQuestionsAsync**](ItemQuestionsApi.md#getItemQuestionsAsync) | **GET** /api/v2/CatalogService/ItemQuestions | Get all item questions |
| [**updateItemQuestionAsync**](ItemQuestionsApi.md#updateItemQuestionAsync) | **PUT** /api/v2/CatalogService/ItemQuestions/{itemQuestionId} | Update an item question |


<a id="createItemQuestionAsync"></a>
# **createItemQuestionAsync**
> ItemQuestionDtoEnvelope createItemQuestionAsync(tenantId, apiVersion, xApiVersion, itemQuestionCreateDto)

Create a new item question

Creates a new item question for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemQuestionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemQuestionsApi apiInstance = new ItemQuestionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemQuestionCreateDto itemQuestionCreateDto = new ItemQuestionCreateDto(); // ItemQuestionCreateDto | 
    try {
      ItemQuestionDtoEnvelope result = apiInstance.createItemQuestionAsync(tenantId, apiVersion, xApiVersion, itemQuestionCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemQuestionsApi#createItemQuestionAsync");
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
| **itemQuestionCreateDto** | [**ItemQuestionCreateDto**](ItemQuestionCreateDto.md)|  | [optional] |

### Return type

[**ItemQuestionDtoEnvelope**](ItemQuestionDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **201** | Created |  -  |

<a id="deleteItemQuestionAsync"></a>
# **deleteItemQuestionAsync**
> deleteItemQuestionAsync(tenantId, itemQuestionId, apiVersion, xApiVersion)

Delete an item question

Deletes an item question for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemQuestionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemQuestionsApi apiInstance = new ItemQuestionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemQuestionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteItemQuestionAsync(tenantId, itemQuestionId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemQuestionsApi#deleteItemQuestionAsync");
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
| **itemQuestionId** | **UUID**|  | |
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
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getItemQuestionByIdAsync"></a>
# **getItemQuestionByIdAsync**
> ItemQuestionDtoEnvelope getItemQuestionByIdAsync(itemQuestionId, apiVersion, xApiVersion)

Get item question by ID

Retrieves a specific item question by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemQuestionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemQuestionsApi apiInstance = new ItemQuestionsApi(defaultClient);
    UUID itemQuestionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemQuestionDtoEnvelope result = apiInstance.getItemQuestionByIdAsync(itemQuestionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemQuestionsApi#getItemQuestionByIdAsync");
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
| **itemQuestionId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemQuestionDtoEnvelope**](ItemQuestionDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getItemQuestionsAsync"></a>
# **getItemQuestionsAsync**
> ItemQuestionDtoListEnvelope getItemQuestionsAsync(tenantId, apiVersion, xApiVersion)

Get all item questions

Retrieves all item questions for the specified tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemQuestionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemQuestionsApi apiInstance = new ItemQuestionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemQuestionDtoListEnvelope result = apiInstance.getItemQuestionsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemQuestionsApi#getItemQuestionsAsync");
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

[**ItemQuestionDtoListEnvelope**](ItemQuestionDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="updateItemQuestionAsync"></a>
# **updateItemQuestionAsync**
> updateItemQuestionAsync(tenantId, itemQuestionId, apiVersion, xApiVersion, itemQuestionUpdateDto)

Update an item question

Updates an existing item question for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemQuestionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemQuestionsApi apiInstance = new ItemQuestionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemQuestionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemQuestionUpdateDto itemQuestionUpdateDto = new ItemQuestionUpdateDto(); // ItemQuestionUpdateDto | 
    try {
      apiInstance.updateItemQuestionAsync(tenantId, itemQuestionId, apiVersion, xApiVersion, itemQuestionUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemQuestionsApi#updateItemQuestionAsync");
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
| **itemQuestionId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **itemQuestionUpdateDto** | [**ItemQuestionUpdateDto**](ItemQuestionUpdateDto.md)|  | [optional] |

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
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

