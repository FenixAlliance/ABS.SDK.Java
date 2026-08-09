# ApplicationPrincipalsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**disableApplicationPrincipalAsync**](ApplicationPrincipalsApi.md#disableApplicationPrincipalAsync) | **POST** /api/v2/SecurityService/ApplicationPrincipals/{principalId}/Disable | Disable an application principal |
| [**enableApplicationPrincipalAsync**](ApplicationPrincipalsApi.md#enableApplicationPrincipalAsync) | **POST** /api/v2/SecurityService/ApplicationPrincipals/{principalId}/Enable | Enable an application principal |
| [**getApplicationPrincipalAsync**](ApplicationPrincipalsApi.md#getApplicationPrincipalAsync) | **GET** /api/v2/SecurityService/ApplicationPrincipals/{principalId} | Get application principal by ID |
| [**getApplicationPrincipalsAsync**](ApplicationPrincipalsApi.md#getApplicationPrincipalsAsync) | **GET** /api/v2/SecurityService/ApplicationPrincipals | Get all application principals |
| [**getApplicationPrincipalsCountAsync**](ApplicationPrincipalsApi.md#getApplicationPrincipalsCountAsync) | **GET** /api/v2/SecurityService/ApplicationPrincipals/Count | Get application principals count |
| [**grantPermissionAsync**](ApplicationPrincipalsApi.md#grantPermissionAsync) | **POST** /api/v2/SecurityService/ApplicationPrincipals/{principalId}/Permissions | Grant a permission to an application principal |
| [**provisionApplicationPrincipalAsync**](ApplicationPrincipalsApi.md#provisionApplicationPrincipalAsync) | **POST** /api/v2/SecurityService/ApplicationPrincipals/Provision | Provision an application principal |
| [**revokePermissionAsync**](ApplicationPrincipalsApi.md#revokePermissionAsync) | **DELETE** /api/v2/SecurityService/ApplicationPrincipals/{principalId}/Permissions/{permission} | Revoke a permission from an application principal |
| [**suspendApplicationPrincipalAsync**](ApplicationPrincipalsApi.md#suspendApplicationPrincipalAsync) | **POST** /api/v2/SecurityService/ApplicationPrincipals/{principalId}/Suspend | Suspend an application principal |


<a id="disableApplicationPrincipalAsync"></a>
# **disableApplicationPrincipalAsync**
> EmptyEnvelope disableApplicationPrincipalAsync(tenantId, principalId, apiVersion, xApiVersion)

Disable an application principal

Disables the application principal; dependent unattended execution fails closed.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApplicationPrincipalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ApplicationPrincipalsApi apiInstance = new ApplicationPrincipalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID principalId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.disableApplicationPrincipalAsync(tenantId, principalId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationPrincipalsApi#disableApplicationPrincipalAsync");
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
| **principalId** | **UUID**|  | |
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
| **200** | OK |  -  |

<a id="enableApplicationPrincipalAsync"></a>
# **enableApplicationPrincipalAsync**
> EmptyEnvelope enableApplicationPrincipalAsync(tenantId, principalId, apiVersion, xApiVersion)

Enable an application principal

Reinstates the application principal to the Active lifecycle state.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApplicationPrincipalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ApplicationPrincipalsApi apiInstance = new ApplicationPrincipalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID principalId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.enableApplicationPrincipalAsync(tenantId, principalId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationPrincipalsApi#enableApplicationPrincipalAsync");
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
| **principalId** | **UUID**|  | |
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
| **200** | OK |  -  |

<a id="getApplicationPrincipalAsync"></a>
# **getApplicationPrincipalAsync**
> ApplicationPrincipalDetailDtoEnvelope getApplicationPrincipalAsync(tenantId, principalId, apiVersion, xApiVersion)

Get application principal by ID

Retrieves a specific application principal: owning application, tenant enrollment, lifecycle status, system-locked flag, and its explicit least-privilege permission grants.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApplicationPrincipalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ApplicationPrincipalsApi apiInstance = new ApplicationPrincipalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID principalId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ApplicationPrincipalDetailDtoEnvelope result = apiInstance.getApplicationPrincipalAsync(tenantId, principalId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationPrincipalsApi#getApplicationPrincipalAsync");
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
| **principalId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ApplicationPrincipalDetailDtoEnvelope**](ApplicationPrincipalDetailDtoEnvelope.md)

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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getApplicationPrincipalsAsync"></a>
# **getApplicationPrincipalsAsync**
> ApplicationPrincipalDtoListEnvelope getApplicationPrincipalsAsync(tenantId, apiVersion, xApiVersion, applicationPrincipalDtoCollectionQueryParameters)

Get all application principals

Retrieves the non-human application principals enrolled in the specified tenant (including read-only system-locked platform principals).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApplicationPrincipalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ApplicationPrincipalsApi apiInstance = new ApplicationPrincipalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ApplicationPrincipalDtoCollectionQueryParameters applicationPrincipalDtoCollectionQueryParameters = new ApplicationPrincipalDtoCollectionQueryParameters(); // ApplicationPrincipalDtoCollectionQueryParameters | 
    try {
      ApplicationPrincipalDtoListEnvelope result = apiInstance.getApplicationPrincipalsAsync(tenantId, apiVersion, xApiVersion, applicationPrincipalDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationPrincipalsApi#getApplicationPrincipalsAsync");
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
| **applicationPrincipalDtoCollectionQueryParameters** | [**ApplicationPrincipalDtoCollectionQueryParameters**](ApplicationPrincipalDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**ApplicationPrincipalDtoListEnvelope**](ApplicationPrincipalDtoListEnvelope.md)

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

<a id="getApplicationPrincipalsCountAsync"></a>
# **getApplicationPrincipalsCountAsync**
> Int32Envelope getApplicationPrincipalsCountAsync(tenantId, apiVersion, xApiVersion, applicationPrincipalDtoCollectionQueryParameters)

Get application principals count

Retrieves the count of application principals enrolled in the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApplicationPrincipalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ApplicationPrincipalsApi apiInstance = new ApplicationPrincipalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ApplicationPrincipalDtoCollectionQueryParameters applicationPrincipalDtoCollectionQueryParameters = new ApplicationPrincipalDtoCollectionQueryParameters(); // ApplicationPrincipalDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getApplicationPrincipalsCountAsync(tenantId, apiVersion, xApiVersion, applicationPrincipalDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationPrincipalsApi#getApplicationPrincipalsCountAsync");
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
| **applicationPrincipalDtoCollectionQueryParameters** | [**ApplicationPrincipalDtoCollectionQueryParameters**](ApplicationPrincipalDtoCollectionQueryParameters.md)|  | [optional] |

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
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="grantPermissionAsync"></a>
# **grantPermissionAsync**
> EmptyEnvelope grantPermissionAsync(tenantId, principalId, applicationPrincipalPermissionRequestDto, apiVersion, xApiVersion)

Grant a permission to an application principal

Grants a single least-privilege permission to the application principal&#39;s enrollment. Owner/admin/wildcard/_*_manage permissions are rejected; system-locked principals require a platform administrator.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApplicationPrincipalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ApplicationPrincipalsApi apiInstance = new ApplicationPrincipalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID principalId = UUID.randomUUID(); // UUID | 
    ApplicationPrincipalPermissionRequestDto applicationPrincipalPermissionRequestDto = new ApplicationPrincipalPermissionRequestDto(); // ApplicationPrincipalPermissionRequestDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.grantPermissionAsync(tenantId, principalId, applicationPrincipalPermissionRequestDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationPrincipalsApi#grantPermissionAsync");
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
| **principalId** | **UUID**|  | |
| **applicationPrincipalPermissionRequestDto** | [**ApplicationPrincipalPermissionRequestDto**](ApplicationPrincipalPermissionRequestDto.md)|  | |
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

<a id="provisionApplicationPrincipalAsync"></a>
# **provisionApplicationPrincipalAsync**
> ApplicationPrincipalProvisioningResultDtoEnvelope provisionApplicationPrincipalAsync(tenantId, applicationPrincipalProvisionRequestDto, apiVersion, xApiVersion)

Provision an application principal

Idempotently provisions the application principal (and its own least-privilege enrollment) for a governed business application in the specified tenant. System-locked platform applications require a platform administrator.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApplicationPrincipalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ApplicationPrincipalsApi apiInstance = new ApplicationPrincipalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    ApplicationPrincipalProvisionRequestDto applicationPrincipalProvisionRequestDto = new ApplicationPrincipalProvisionRequestDto(); // ApplicationPrincipalProvisionRequestDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ApplicationPrincipalProvisioningResultDtoEnvelope result = apiInstance.provisionApplicationPrincipalAsync(tenantId, applicationPrincipalProvisionRequestDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationPrincipalsApi#provisionApplicationPrincipalAsync");
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
| **applicationPrincipalProvisionRequestDto** | [**ApplicationPrincipalProvisionRequestDto**](ApplicationPrincipalProvisionRequestDto.md)|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ApplicationPrincipalProvisioningResultDtoEnvelope**](ApplicationPrincipalProvisioningResultDtoEnvelope.md)

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

<a id="revokePermissionAsync"></a>
# **revokePermissionAsync**
> EmptyEnvelope revokePermissionAsync(tenantId, principalId, permission, apiVersion, xApiVersion)

Revoke a permission from an application principal

Revokes a direct permission grant from the application principal&#39;s enrollment. System-locked principals require a platform administrator.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApplicationPrincipalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ApplicationPrincipalsApi apiInstance = new ApplicationPrincipalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID principalId = UUID.randomUUID(); // UUID | 
    String permission = "permission_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.revokePermissionAsync(tenantId, principalId, permission, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationPrincipalsApi#revokePermissionAsync");
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
| **principalId** | **UUID**|  | |
| **permission** | **String**|  | |
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
| **200** | OK |  -  |

<a id="suspendApplicationPrincipalAsync"></a>
# **suspendApplicationPrincipalAsync**
> EmptyEnvelope suspendApplicationPrincipalAsync(tenantId, principalId, apiVersion, xApiVersion)

Suspend an application principal

Temporarily suspends the application principal; its identity is retained but it cannot act until reinstated.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApplicationPrincipalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ApplicationPrincipalsApi apiInstance = new ApplicationPrincipalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID principalId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.suspendApplicationPrincipalAsync(tenantId, principalId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationPrincipalsApi#suspendApplicationPrincipalAsync");
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
| **principalId** | **UUID**|  | |
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
| **200** | OK |  -  |

