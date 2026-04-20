# OAuthApplicationsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createOAuthApplicationAsync**](OAuthApplicationsApi.md#createOAuthApplicationAsync) | **POST** /api/v2/SecurityService/OAuthApplications | Create a new OAuth application |
| [**deleteOAuthApplicationAsync**](OAuthApplicationsApi.md#deleteOAuthApplicationAsync) | **DELETE** /api/v2/SecurityService/OAuthApplications/{applicationId} | Delete an OAuth application |
| [**getOAuthApplicationByIdAsync**](OAuthApplicationsApi.md#getOAuthApplicationByIdAsync) | **GET** /api/v2/SecurityService/OAuthApplications/{applicationId} | Get OAuth application by ID |
| [**getOAuthApplicationsAsync**](OAuthApplicationsApi.md#getOAuthApplicationsAsync) | **GET** /api/v2/SecurityService/OAuthApplications | Get all OAuth applications |
| [**getOAuthApplicationsCountAsync**](OAuthApplicationsApi.md#getOAuthApplicationsCountAsync) | **GET** /api/v2/SecurityService/OAuthApplications/Count | Get OAuth applications count |
| [**getOAuthAuthorizationByIdAsync**](OAuthApplicationsApi.md#getOAuthAuthorizationByIdAsync) | **GET** /api/v2/SecurityService/OAuthApplications/Authorizations/{authorizationId} | Get OAuth authorization by ID |
| [**getOAuthAuthorizationsAsync**](OAuthApplicationsApi.md#getOAuthAuthorizationsAsync) | **GET** /api/v2/SecurityService/OAuthApplications/Authorizations | Get all OAuth authorizations |
| [**getOAuthAuthorizationsCountAsync**](OAuthApplicationsApi.md#getOAuthAuthorizationsCountAsync) | **GET** /api/v2/SecurityService/OAuthApplications/Authorizations/Count | Get OAuth authorizations count |
| [**updateOAuthApplicationAsync**](OAuthApplicationsApi.md#updateOAuthApplicationAsync) | **PUT** /api/v2/SecurityService/OAuthApplications/{applicationId} | Update an existing OAuth application |


<a id="createOAuthApplicationAsync"></a>
# **createOAuthApplicationAsync**
> EmptyEnvelope createOAuthApplicationAsync(tenantId, oauthApplicationCreateDto, apiVersion, xApiVersion)

Create a new OAuth application

Creates a new OAuth application for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OAuthApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    OAuthApplicationsApi apiInstance = new OAuthApplicationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    OAuthApplicationCreateDto oauthApplicationCreateDto = new OAuthApplicationCreateDto(); // OAuthApplicationCreateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.createOAuthApplicationAsync(tenantId, oauthApplicationCreateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OAuthApplicationsApi#createOAuthApplicationAsync");
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
| **oauthApplicationCreateDto** | [**OAuthApplicationCreateDto**](OAuthApplicationCreateDto.md)|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

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
| **400** | Bad Request |  -  |
| **201** | Created |  -  |

<a id="deleteOAuthApplicationAsync"></a>
# **deleteOAuthApplicationAsync**
> EmptyEnvelope deleteOAuthApplicationAsync(tenantId, applicationId, apiVersion, xApiVersion)

Delete an OAuth application

Deletes an existing OAuth application.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OAuthApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    OAuthApplicationsApi apiInstance = new OAuthApplicationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String applicationId = "applicationId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteOAuthApplicationAsync(tenantId, applicationId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OAuthApplicationsApi#deleteOAuthApplicationAsync");
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
| **applicationId** | **String**|  | |
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
| **400** | Bad Request |  -  |
| **204** | No Content |  -  |

<a id="getOAuthApplicationByIdAsync"></a>
# **getOAuthApplicationByIdAsync**
> OAuthApplicationDtoEnvelope getOAuthApplicationByIdAsync(tenantId, applicationId, apiVersion, xApiVersion)

Get OAuth application by ID

Retrieves a specific OAuth application by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OAuthApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    OAuthApplicationsApi apiInstance = new OAuthApplicationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String applicationId = "applicationId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      OAuthApplicationDtoEnvelope result = apiInstance.getOAuthApplicationByIdAsync(tenantId, applicationId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OAuthApplicationsApi#getOAuthApplicationByIdAsync");
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
| **applicationId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**OAuthApplicationDtoEnvelope**](OAuthApplicationDtoEnvelope.md)

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

<a id="getOAuthApplicationsAsync"></a>
# **getOAuthApplicationsAsync**
> OAuthApplicationDtoListEnvelope getOAuthApplicationsAsync(tenantId, apiVersion, xApiVersion)

Get all OAuth applications

Retrieves all OAuth applications for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OAuthApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    OAuthApplicationsApi apiInstance = new OAuthApplicationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      OAuthApplicationDtoListEnvelope result = apiInstance.getOAuthApplicationsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OAuthApplicationsApi#getOAuthApplicationsAsync");
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

[**OAuthApplicationDtoListEnvelope**](OAuthApplicationDtoListEnvelope.md)

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

<a id="getOAuthApplicationsCountAsync"></a>
# **getOAuthApplicationsCountAsync**
> Int32Envelope getOAuthApplicationsCountAsync(tenantId, apiVersion, xApiVersion)

Get OAuth applications count

Retrieves the count of OAuth applications for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OAuthApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    OAuthApplicationsApi apiInstance = new OAuthApplicationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getOAuthApplicationsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OAuthApplicationsApi#getOAuthApplicationsCountAsync");
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

<a id="getOAuthAuthorizationByIdAsync"></a>
# **getOAuthAuthorizationByIdAsync**
> OAuthAuthorizationDtoEnvelope getOAuthAuthorizationByIdAsync(tenantId, authorizationId, apiVersion, xApiVersion)

Get OAuth authorization by ID

Retrieves a specific OAuth authorization by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OAuthApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    OAuthApplicationsApi apiInstance = new OAuthApplicationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String authorizationId = "authorizationId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      OAuthAuthorizationDtoEnvelope result = apiInstance.getOAuthAuthorizationByIdAsync(tenantId, authorizationId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OAuthApplicationsApi#getOAuthAuthorizationByIdAsync");
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
| **authorizationId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**OAuthAuthorizationDtoEnvelope**](OAuthAuthorizationDtoEnvelope.md)

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

<a id="getOAuthAuthorizationsAsync"></a>
# **getOAuthAuthorizationsAsync**
> OAuthAuthorizationDtoListEnvelope getOAuthAuthorizationsAsync(tenantId, userId, apiVersion, xApiVersion)

Get all OAuth authorizations

Retrieves all OAuth authorizations for the specified user.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OAuthApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    OAuthApplicationsApi apiInstance = new OAuthApplicationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String userId = "userId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      OAuthAuthorizationDtoListEnvelope result = apiInstance.getOAuthAuthorizationsAsync(tenantId, userId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OAuthApplicationsApi#getOAuthAuthorizationsAsync");
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
| **userId** | **String**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**OAuthAuthorizationDtoListEnvelope**](OAuthAuthorizationDtoListEnvelope.md)

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

<a id="getOAuthAuthorizationsCountAsync"></a>
# **getOAuthAuthorizationsCountAsync**
> Int32Envelope getOAuthAuthorizationsCountAsync(tenantId, userId, apiVersion, xApiVersion)

Get OAuth authorizations count

Retrieves the count of OAuth authorizations for the specified user.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OAuthApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    OAuthApplicationsApi apiInstance = new OAuthApplicationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String userId = "userId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getOAuthAuthorizationsCountAsync(tenantId, userId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OAuthApplicationsApi#getOAuthAuthorizationsCountAsync");
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
| **userId** | **String**|  | [optional] |
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

<a id="updateOAuthApplicationAsync"></a>
# **updateOAuthApplicationAsync**
> EmptyEnvelope updateOAuthApplicationAsync(tenantId, applicationId, oauthApplicationUpdateDto, apiVersion, xApiVersion)

Update an existing OAuth application

Updates an existing OAuth application.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OAuthApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    OAuthApplicationsApi apiInstance = new OAuthApplicationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String applicationId = "applicationId_example"; // String | 
    OAuthApplicationUpdateDto oauthApplicationUpdateDto = new OAuthApplicationUpdateDto(); // OAuthApplicationUpdateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.updateOAuthApplicationAsync(tenantId, applicationId, oauthApplicationUpdateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OAuthApplicationsApi#updateOAuthApplicationAsync");
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
| **applicationId** | **String**|  | |
| **oauthApplicationUpdateDto** | [**OAuthApplicationUpdateDto**](OAuthApplicationUpdateDto.md)|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

