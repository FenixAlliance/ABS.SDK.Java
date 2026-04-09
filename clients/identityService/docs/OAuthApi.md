# OAuthApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkPasswordSignInAsync**](OAuthApi.md#checkPasswordSignInAsync) | **GET** /api/v2/OAuth/SignIn | Check password sign-in |
| [**get**](OAuthApi.md#get) | **GET** /api/v2/OAuth/WhoAmI | Get current user identity |
| [**getJwKs**](OAuthApi.md#getJwKs) | **GET** /api/v2/OAuth/{applicationId}/Keys | Get JSON Web Key Set |
| [**getOpenIdConfiguration**](OAuthApi.md#getOpenIdConfiguration) | **GET** /api/v2/OAuth/{tenantId}/{applicationId}/.Well-Known/OpenId-Configuration | Get OpenID configuration |
| [**getPermissions**](OAuthApi.md#getPermissions) | **GET** /api/v2/OAuth/Permissions | Get user permissions |
| [**passwordSignInAsync**](OAuthApi.md#passwordSignInAsync) | **POST** /api/v2/OAuth/SignIn | Sign in with password |
| [**token**](OAuthApi.md#token) | **POST** /api/v2/OAuth/Token | Get OAuth token |


<a id="checkPasswordSignInAsync"></a>
# **checkPasswordSignInAsync**
> UserCreateDtoEnvelope checkPasswordSignInAsync(apiVersion, xApiVersion)

Check password sign-in

Verifies sign-in credentials and returns user details without creating a session.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OAuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    OAuthApi apiInstance = new OAuthApi(defaultClient);
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      UserCreateDtoEnvelope result = apiInstance.checkPasswordSignInAsync(apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OAuthApi#checkPasswordSignInAsync");
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
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**UserCreateDtoEnvelope**](UserCreateDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |

<a id="get"></a>
# **get**
> AuthorizationResultEnvelope get(tenantId, apiVersion, xApiVersion)

Get current user identity

Returns the authorization result for the authenticated user, including identity and tenant context.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OAuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    OAuthApi apiInstance = new OAuthApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      AuthorizationResultEnvelope result = apiInstance.get(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OAuthApi#get");
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
| **tenantId** | **UUID**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**AuthorizationResultEnvelope**](AuthorizationResultEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="getJwKs"></a>
# **getJwKs**
> JsonWebKeySetEnvelope getJwKs(applicationId, apiVersion, xApiVersion)

Get JSON Web Key Set

Retrieves the signing keys (JWKS) for a specific application.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OAuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    OAuthApi apiInstance = new OAuthApi(defaultClient);
    String applicationId = "applicationId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      JsonWebKeySetEnvelope result = apiInstance.getJwKs(applicationId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OAuthApi#getJwKs");
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
| **applicationId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**JsonWebKeySetEnvelope**](JsonWebKeySetEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getOpenIdConfiguration"></a>
# **getOpenIdConfiguration**
> OpenIdConfigurationEnvelope getOpenIdConfiguration(tenantId, applicationId, apiVersion, xApiVersion)

Get OpenID configuration

Retrieves the OpenID Connect discovery document for a specific application within a tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OAuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    OAuthApi apiInstance = new OAuthApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String applicationId = "applicationId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      OpenIdConfigurationEnvelope result = apiInstance.getOpenIdConfiguration(tenantId, applicationId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OAuthApi#getOpenIdConfiguration");
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

[**OpenIdConfigurationEnvelope**](OpenIdConfigurationEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getPermissions"></a>
# **getPermissions**
> StringListEnvelope getPermissions(tenantId, userId, apiVersion, xApiVersion)

Get user permissions

Retrieves the list of permission identifiers for a specific user within a tenant context.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OAuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    OAuthApi apiInstance = new OAuthApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String userId = "userId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      StringListEnvelope result = apiInstance.getPermissions(tenantId, userId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OAuthApi#getPermissions");
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

[**StringListEnvelope**](StringListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="passwordSignInAsync"></a>
# **passwordSignInAsync**
> JsonWebTokenEnvelope passwordSignInAsync(apiVersion, xApiVersion, signinModel)

Sign in with password

Authenticates a user using email and password credentials.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OAuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    OAuthApi apiInstance = new OAuthApi(defaultClient);
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SigninModel signinModel = new SigninModel(); // SigninModel | 
    try {
      JsonWebTokenEnvelope result = apiInstance.passwordSignInAsync(apiVersion, xApiVersion, signinModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OAuthApi#passwordSignInAsync");
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
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **signinModel** | [**SigninModel**](SigninModel.md)|  | [optional] |

### Return type

[**JsonWebTokenEnvelope**](JsonWebTokenEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |

<a id="token"></a>
# **token**
> JsonWebTokenEnvelope token(apiVersion, xApiVersion, oauthTokenRequest)

Get OAuth token

Generates an OAuth token based on the provided credentials or grant type.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OAuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    OAuthApi apiInstance = new OAuthApi(defaultClient);
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    OAuthTokenRequest oauthTokenRequest = new OAuthTokenRequest(); // OAuthTokenRequest | 
    try {
      JsonWebTokenEnvelope result = apiInstance.token(apiVersion, xApiVersion, oauthTokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OAuthApi#token");
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
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **oauthTokenRequest** | [**OAuthTokenRequest**](OAuthTokenRequest.md)|  | [optional] |

### Return type

[**JsonWebTokenEnvelope**](JsonWebTokenEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

