# WebsiteThemesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createWebsiteThemeAsync**](WebsiteThemesApi.md#createWebsiteThemeAsync) | **POST** /api/v2/ContentService/WebsiteThemes | Create a new website theme |
| [**deleteWebsiteThemeAsync**](WebsiteThemesApi.md#deleteWebsiteThemeAsync) | **DELETE** /api/v2/ContentService/WebsiteThemes/{id} | Delete a website theme |
| [**getWebsiteThemeByIdAsync**](WebsiteThemesApi.md#getWebsiteThemeByIdAsync) | **GET** /api/v2/ContentService/WebsiteThemes/{id} | Get website theme by ID |
| [**getWebsiteThemesAsync**](WebsiteThemesApi.md#getWebsiteThemesAsync) | **GET** /api/v2/ContentService/WebsiteThemes | Get all website themes |
| [**getWebsiteThemesCountAsync**](WebsiteThemesApi.md#getWebsiteThemesCountAsync) | **GET** /api/v2/ContentService/WebsiteThemes/Count | Get website themes count |
| [**updateWebsiteThemeAsync**](WebsiteThemesApi.md#updateWebsiteThemeAsync) | **PUT** /api/v2/ContentService/WebsiteThemes/{id} | Update a website theme |


<a id="createWebsiteThemeAsync"></a>
# **createWebsiteThemeAsync**
> createWebsiteThemeAsync(tenantId, apiVersion, xApiVersion, websiteThemeCreateDto)

Create a new website theme

Creates a new website theme for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebsiteThemesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebsiteThemesApi apiInstance = new WebsiteThemesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    WebsiteThemeCreateDto websiteThemeCreateDto = new WebsiteThemeCreateDto(); // WebsiteThemeCreateDto | 
    try {
      apiInstance.createWebsiteThemeAsync(tenantId, apiVersion, xApiVersion, websiteThemeCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebsiteThemesApi#createWebsiteThemeAsync");
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
| **websiteThemeCreateDto** | [**WebsiteThemeCreateDto**](WebsiteThemeCreateDto.md)|  | [optional] |

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

<a id="deleteWebsiteThemeAsync"></a>
# **deleteWebsiteThemeAsync**
> deleteWebsiteThemeAsync(tenantId, id, apiVersion, xApiVersion)

Delete a website theme

Deletes a website theme for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebsiteThemesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebsiteThemesApi apiInstance = new WebsiteThemesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteWebsiteThemeAsync(tenantId, id, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebsiteThemesApi#deleteWebsiteThemeAsync");
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

<a id="getWebsiteThemeByIdAsync"></a>
# **getWebsiteThemeByIdAsync**
> WebsiteThemeDto getWebsiteThemeByIdAsync(tenantId, id, apiVersion, xApiVersion)

Get website theme by ID

Retrieves a specific website theme by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebsiteThemesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebsiteThemesApi apiInstance = new WebsiteThemesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      WebsiteThemeDto result = apiInstance.getWebsiteThemeByIdAsync(tenantId, id, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebsiteThemesApi#getWebsiteThemeByIdAsync");
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

[**WebsiteThemeDto**](WebsiteThemeDto.md)

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

<a id="getWebsiteThemesAsync"></a>
# **getWebsiteThemesAsync**
> WebsiteThemeDtoListEnvelope getWebsiteThemesAsync(tenantId, oDataQueryOptions, apiVersion, xApiVersion)

Get all website themes

Retrieves all website themes for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebsiteThemesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebsiteThemesApi apiInstance = new WebsiteThemesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    WebsiteThemeDtoODataQueryOptions oDataQueryOptions = new WebsiteThemeDtoODataQueryOptions(); // WebsiteThemeDtoODataQueryOptions | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      WebsiteThemeDtoListEnvelope result = apiInstance.getWebsiteThemesAsync(tenantId, oDataQueryOptions, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebsiteThemesApi#getWebsiteThemesAsync");
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
| **oDataQueryOptions** | [**WebsiteThemeDtoODataQueryOptions**](.md)|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**WebsiteThemeDtoListEnvelope**](WebsiteThemeDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **200** | OK |  -  |

<a id="getWebsiteThemesCountAsync"></a>
# **getWebsiteThemesCountAsync**
> Int32Envelope getWebsiteThemesCountAsync(tenantId, oDataQueryOptions, apiVersion, xApiVersion)

Get website themes count

Returns the count of website themes for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebsiteThemesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebsiteThemesApi apiInstance = new WebsiteThemesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    WebsiteThemeDtoODataQueryOptions oDataQueryOptions = new WebsiteThemeDtoODataQueryOptions(); // WebsiteThemeDtoODataQueryOptions | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getWebsiteThemesCountAsync(tenantId, oDataQueryOptions, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebsiteThemesApi#getWebsiteThemesCountAsync");
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
| **oDataQueryOptions** | [**WebsiteThemeDtoODataQueryOptions**](.md)|  | [optional] |
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
| **200** | OK |  -  |

<a id="updateWebsiteThemeAsync"></a>
# **updateWebsiteThemeAsync**
> updateWebsiteThemeAsync(tenantId, id, apiVersion, xApiVersion, websiteThemeUpdateDto)

Update a website theme

Updates an existing website theme for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebsiteThemesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebsiteThemesApi apiInstance = new WebsiteThemesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    WebsiteThemeUpdateDto websiteThemeUpdateDto = new WebsiteThemeUpdateDto(); // WebsiteThemeUpdateDto | 
    try {
      apiInstance.updateWebsiteThemeAsync(tenantId, id, apiVersion, xApiVersion, websiteThemeUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebsiteThemesApi#updateWebsiteThemeAsync");
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
| **websiteThemeUpdateDto** | [**WebsiteThemeUpdateDto**](WebsiteThemeUpdateDto.md)|  | [optional] |

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

