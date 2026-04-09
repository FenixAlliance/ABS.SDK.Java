# WebPageTagsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createWebPageTagAsync**](WebPageTagsApi.md#createWebPageTagAsync) | **POST** /api/v2/ContentService/WebPageTags | Create a web page tag |
| [**deleteWebPageTagAsync**](WebPageTagsApi.md#deleteWebPageTagAsync) | **DELETE** /api/v2/ContentService/WebPageTags/{webPageTagId} | Delete a web page tag |
| [**getWebPageTagByIdAsync**](WebPageTagsApi.md#getWebPageTagByIdAsync) | **GET** /api/v2/ContentService/WebPageTags/{webPageTagId} | Get web page tag by ID |
| [**getWebPageTagsAsync**](WebPageTagsApi.md#getWebPageTagsAsync) | **GET** /api/v2/ContentService/WebPageTags | Get web page tags |
| [**updateWebPageTagAsync**](WebPageTagsApi.md#updateWebPageTagAsync) | **PUT** /api/v2/ContentService/WebPageTags/{webPageTagId} | Update a web page tag |


<a id="createWebPageTagAsync"></a>
# **createWebPageTagAsync**
> EmptyEnvelope createWebPageTagAsync(tenantId, apiVersion, xApiVersion, webPageTagCreateDto)

Create a web page tag

Creates a new web page tag for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebPageTagsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebPageTagsApi apiInstance = new WebPageTagsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    WebPageTagCreateDto webPageTagCreateDto = new WebPageTagCreateDto(); // WebPageTagCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createWebPageTagAsync(tenantId, apiVersion, xApiVersion, webPageTagCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebPageTagsApi#createWebPageTagAsync");
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
| **webPageTagCreateDto** | [**WebPageTagCreateDto**](WebPageTagCreateDto.md)|  | [optional] |

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
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **201** | Created |  -  |

<a id="deleteWebPageTagAsync"></a>
# **deleteWebPageTagAsync**
> EmptyEnvelope deleteWebPageTagAsync(tenantId, webPageTagId, apiVersion, xApiVersion)

Delete a web page tag

Deletes a web page tag for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebPageTagsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebPageTagsApi apiInstance = new WebPageTagsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID webPageTagId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteWebPageTagAsync(tenantId, webPageTagId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebPageTagsApi#deleteWebPageTagAsync");
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
| **webPageTagId** | **UUID**|  | |
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
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getWebPageTagByIdAsync"></a>
# **getWebPageTagByIdAsync**
> WebPageTagDtoEnvelope getWebPageTagByIdAsync(tenantId, webPageTagId, apiVersion, xApiVersion)

Get web page tag by ID

Retrieves a specific web page tag by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebPageTagsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebPageTagsApi apiInstance = new WebPageTagsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID webPageTagId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      WebPageTagDtoEnvelope result = apiInstance.getWebPageTagByIdAsync(tenantId, webPageTagId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebPageTagsApi#getWebPageTagByIdAsync");
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
| **webPageTagId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**WebPageTagDtoEnvelope**](WebPageTagDtoEnvelope.md)

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

<a id="getWebPageTagsAsync"></a>
# **getWebPageTagsAsync**
> WebPageTagDtoListEnvelope getWebPageTagsAsync(tenantId, apiVersion, xApiVersion)

Get web page tags

Retrieves all web page tags for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebPageTagsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebPageTagsApi apiInstance = new WebPageTagsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      WebPageTagDtoListEnvelope result = apiInstance.getWebPageTagsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebPageTagsApi#getWebPageTagsAsync");
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

[**WebPageTagDtoListEnvelope**](WebPageTagDtoListEnvelope.md)

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

<a id="updateWebPageTagAsync"></a>
# **updateWebPageTagAsync**
> EmptyEnvelope updateWebPageTagAsync(tenantId, webPageTagId, apiVersion, xApiVersion, webPageTagUpdateDto)

Update a web page tag

Updates an existing web page tag for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebPageTagsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebPageTagsApi apiInstance = new WebPageTagsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID webPageTagId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    WebPageTagUpdateDto webPageTagUpdateDto = new WebPageTagUpdateDto(); // WebPageTagUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateWebPageTagAsync(tenantId, webPageTagId, apiVersion, xApiVersion, webPageTagUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebPageTagsApi#updateWebPageTagAsync");
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
| **webPageTagId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **webPageTagUpdateDto** | [**WebPageTagUpdateDto**](WebPageTagUpdateDto.md)|  | [optional] |

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
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

