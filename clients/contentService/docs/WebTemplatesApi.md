# WebTemplatesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**countWebTemplatesAsync**](WebTemplatesApi.md#countWebTemplatesAsync) | **GET** /api/v2/ContentService/WebTemplates/Count | Count web templates |
| [**createWebTemplateAsync**](WebTemplatesApi.md#createWebTemplateAsync) | **POST** /api/v2/ContentService/WebTemplates | Create a web template |
| [**deleteWebTemplateAsync**](WebTemplatesApi.md#deleteWebTemplateAsync) | **DELETE** /api/v2/ContentService/WebTemplates/{webTemplateId} | Delete a web template |
| [**getWebTemplateByIdAsync**](WebTemplatesApi.md#getWebTemplateByIdAsync) | **GET** /api/v2/ContentService/WebTemplates/{webTemplateId} | Get web template by ID |
| [**getWebTemplatesAsync**](WebTemplatesApi.md#getWebTemplatesAsync) | **GET** /api/v2/ContentService/WebTemplates | Get web templates |
| [**updateWebTemplateAsync**](WebTemplatesApi.md#updateWebTemplateAsync) | **PUT** /api/v2/ContentService/WebTemplates/{webTemplateId} | Update a web template |


<a id="countWebTemplatesAsync"></a>
# **countWebTemplatesAsync**
> Int32Envelope countWebTemplatesAsync(tenantId, apiVersion, xApiVersion)

Count web templates

Counts all web templates for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    WebTemplatesApi apiInstance = new WebTemplatesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.countWebTemplatesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebTemplatesApi#countWebTemplatesAsync");
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
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="createWebTemplateAsync"></a>
# **createWebTemplateAsync**
> createWebTemplateAsync(tenantId, apiVersion, xApiVersion, webTemplateCreateDto)

Create a web template

Creates a new web template for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    WebTemplatesApi apiInstance = new WebTemplatesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    WebTemplateCreateDto webTemplateCreateDto = new WebTemplateCreateDto(); // WebTemplateCreateDto | 
    try {
      apiInstance.createWebTemplateAsync(tenantId, apiVersion, xApiVersion, webTemplateCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebTemplatesApi#createWebTemplateAsync");
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
| **webTemplateCreateDto** | [**WebTemplateCreateDto**](WebTemplateCreateDto.md)|  | [optional] |

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

<a id="deleteWebTemplateAsync"></a>
# **deleteWebTemplateAsync**
> deleteWebTemplateAsync(tenantId, webTemplateId, apiVersion, xApiVersion)

Delete a web template

Deletes a web template for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    WebTemplatesApi apiInstance = new WebTemplatesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID webTemplateId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteWebTemplateAsync(tenantId, webTemplateId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebTemplatesApi#deleteWebTemplateAsync");
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
| **webTemplateId** | **UUID**|  | |
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

<a id="getWebTemplateByIdAsync"></a>
# **getWebTemplateByIdAsync**
> WebTemplateDtoEnvelope getWebTemplateByIdAsync(tenantId, webTemplateId, apiVersion, xApiVersion)

Get web template by ID

Retrieves a specific web template by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    WebTemplatesApi apiInstance = new WebTemplatesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID webTemplateId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      WebTemplateDtoEnvelope result = apiInstance.getWebTemplateByIdAsync(tenantId, webTemplateId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebTemplatesApi#getWebTemplateByIdAsync");
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
| **webTemplateId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**WebTemplateDtoEnvelope**](WebTemplateDtoEnvelope.md)

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

<a id="getWebTemplatesAsync"></a>
# **getWebTemplatesAsync**
> WebTemplateDtoListEnvelope getWebTemplatesAsync(tenantId, apiVersion, xApiVersion)

Get web templates

Retrieves all web templates for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    WebTemplatesApi apiInstance = new WebTemplatesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      WebTemplateDtoListEnvelope result = apiInstance.getWebTemplatesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebTemplatesApi#getWebTemplatesAsync");
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

[**WebTemplateDtoListEnvelope**](WebTemplateDtoListEnvelope.md)

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

<a id="updateWebTemplateAsync"></a>
# **updateWebTemplateAsync**
> updateWebTemplateAsync(tenantId, webTemplateId, apiVersion, xApiVersion, webTemplateUpdateDto)

Update a web template

Updates an existing web template for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    WebTemplatesApi apiInstance = new WebTemplatesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID webTemplateId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    WebTemplateUpdateDto webTemplateUpdateDto = new WebTemplateUpdateDto(); // WebTemplateUpdateDto | 
    try {
      apiInstance.updateWebTemplateAsync(tenantId, webTemplateId, apiVersion, xApiVersion, webTemplateUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebTemplatesApi#updateWebTemplateAsync");
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
| **webTemplateId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **webTemplateUpdateDto** | [**WebTemplateUpdateDto**](WebTemplateUpdateDto.md)|  | [optional] |

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

