# ApplicationPrincipalsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**disableGlobalApplicationPrincipal**](ApplicationPrincipalsApi.md#disableGlobalApplicationPrincipal) | **POST** /api/v2/SystemService/ApplicationPrincipals/{principalId}/Disable | Disable an application principal (global) |
| [**enableGlobalApplicationPrincipal**](ApplicationPrincipalsApi.md#enableGlobalApplicationPrincipal) | **POST** /api/v2/SystemService/ApplicationPrincipals/{principalId}/Enable | Enable an application principal (global) |
| [**getGlobalApplicationPrincipal**](ApplicationPrincipalsApi.md#getGlobalApplicationPrincipal) | **GET** /api/v2/SystemService/ApplicationPrincipals/{principalId} | Get one application principal (any tenant) |
| [**getGlobalApplicationPrincipals**](ApplicationPrincipalsApi.md#getGlobalApplicationPrincipals) | **GET** /api/v2/SystemService/ApplicationPrincipals | List application principals across all tenants |
| [**getGlobalApplicationPrincipalsCount**](ApplicationPrincipalsApi.md#getGlobalApplicationPrincipalsCount) | **GET** /api/v2/SystemService/ApplicationPrincipals/Count | Count application principals across all tenants |
| [**grantGlobalApplicationPrincipalPermission**](ApplicationPrincipalsApi.md#grantGlobalApplicationPrincipalPermission) | **POST** /api/v2/SystemService/ApplicationPrincipals/{principalId}/Permissions | Grant a permission to an application principal (any tenant) |
| [**provisionGlobalApplicationPrincipal**](ApplicationPrincipalsApi.md#provisionGlobalApplicationPrincipal) | **POST** /api/v2/SystemService/ApplicationPrincipals/Provision | Provision an application principal (any tenant, incl. system-locked) |
| [**provisionPaymentsConnector**](ApplicationPrincipalsApi.md#provisionPaymentsConnector) | **POST** /api/v2/SystemService/ApplicationPrincipals/PaymentsConnector | Provision the platform payments-connector identity |
| [**revokeGlobalApplicationPrincipalPermission**](ApplicationPrincipalsApi.md#revokeGlobalApplicationPrincipalPermission) | **DELETE** /api/v2/SystemService/ApplicationPrincipals/{principalId}/Permissions/{permission} | Revoke a permission from an application principal (any tenant) |
| [**suspendGlobalApplicationPrincipal**](ApplicationPrincipalsApi.md#suspendGlobalApplicationPrincipal) | **POST** /api/v2/SystemService/ApplicationPrincipals/{principalId}/Suspend | Suspend an application principal (global) |


<a id="disableGlobalApplicationPrincipal"></a>
# **disableGlobalApplicationPrincipal**
> EmptyEnvelope disableGlobalApplicationPrincipal(principalId, tenantId, apiVersion, xApiVersion)

Disable an application principal (global)

Disables the application principal; dependent unattended execution fails closed (applies to system-locked principals here). tenantId scopes the action to a tenant the principal is enrolled in (required). Global-administrator only.

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
    UUID principalId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.disableGlobalApplicationPrincipal(principalId, tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationPrincipalsApi#disableGlobalApplicationPrincipal");
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
| **principalId** | **UUID**|  | |
| **tenantId** | **UUID**|  | |
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
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="enableGlobalApplicationPrincipal"></a>
# **enableGlobalApplicationPrincipal**
> EmptyEnvelope enableGlobalApplicationPrincipal(principalId, tenantId, apiVersion, xApiVersion)

Enable an application principal (global)

Reinstates the application principal to the Active lifecycle state (applies to system-locked principals here). tenantId scopes the action to a tenant the principal is enrolled in (required). Global-administrator only.

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
    UUID principalId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.enableGlobalApplicationPrincipal(principalId, tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationPrincipalsApi#enableGlobalApplicationPrincipal");
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
| **principalId** | **UUID**|  | |
| **tenantId** | **UUID**|  | |
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
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="getGlobalApplicationPrincipal"></a>
# **getGlobalApplicationPrincipal**
> ApplicationPrincipalDetailDtoEnvelope getGlobalApplicationPrincipal(principalId, tenantId, apiVersion, xApiVersion)

Get one application principal (any tenant)

Returns one application principal&#39;s detail by id: owning application, an enrollment, the system-locked flag, lifecycle status, and that enrollment&#39;s explicit least-privilege grants. Pass tenantId to select the enrollment for a multi-tenant principal; when omitted the principal&#39;s first enrollment is used. Global-administrator only.

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
    UUID principalId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ApplicationPrincipalDetailDtoEnvelope result = apiInstance.getGlobalApplicationPrincipal(principalId, tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationPrincipalsApi#getGlobalApplicationPrincipal");
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
| **principalId** | **UUID**|  | |
| **tenantId** | **UUID**|  | [optional] |
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
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="getGlobalApplicationPrincipals"></a>
# **getGlobalApplicationPrincipals**
> ApplicationPrincipalDtoIReadOnlyListEnvelope getGlobalApplicationPrincipals(apiVersion, xApiVersion, applicationPrincipalDtoCollectionQueryParameters)

List application principals across all tenants

Lists every non-human application principal enrollment across ALL tenants (payload-safe fields only), including the platform-managed (system-locked) connectors. Use OData to scope — e.g. $filter&#x3D;SystemLocked eq true for the platform connectors or TenantId eq &#39;{guid}&#39; for one tenant — and to page/order. Global-administrator only.

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
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ApplicationPrincipalDtoCollectionQueryParameters applicationPrincipalDtoCollectionQueryParameters = new ApplicationPrincipalDtoCollectionQueryParameters(); // ApplicationPrincipalDtoCollectionQueryParameters | 
    try {
      ApplicationPrincipalDtoIReadOnlyListEnvelope result = apiInstance.getGlobalApplicationPrincipals(apiVersion, xApiVersion, applicationPrincipalDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationPrincipalsApi#getGlobalApplicationPrincipals");
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
| **applicationPrincipalDtoCollectionQueryParameters** | [**ApplicationPrincipalDtoCollectionQueryParameters**](ApplicationPrincipalDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**ApplicationPrincipalDtoIReadOnlyListEnvelope**](ApplicationPrincipalDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="getGlobalApplicationPrincipalsCount"></a>
# **getGlobalApplicationPrincipalsCount**
> Int32Envelope getGlobalApplicationPrincipalsCount(apiVersion, xApiVersion, applicationPrincipalDtoCollectionQueryParameters)

Count application principals across all tenants

Returns the count of application principal enrollments across ALL tenants under the same OData shaping as the list read (e.g. $filter&#x3D;SystemLocked eq true). Global-administrator only.

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
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ApplicationPrincipalDtoCollectionQueryParameters applicationPrincipalDtoCollectionQueryParameters = new ApplicationPrincipalDtoCollectionQueryParameters(); // ApplicationPrincipalDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getGlobalApplicationPrincipalsCount(apiVersion, xApiVersion, applicationPrincipalDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationPrincipalsApi#getGlobalApplicationPrincipalsCount");
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
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="grantGlobalApplicationPrincipalPermission"></a>
# **grantGlobalApplicationPrincipalPermission**
> EmptyEnvelope grantGlobalApplicationPrincipalPermission(principalId, tenantId, applicationPrincipalPermissionRequestDto, apiVersion, xApiVersion)

Grant a permission to an application principal (any tenant)

Grants a single least-privilege permission to the application principal&#39;s enrollment in the tenantId tenant (grants are per-tenant, so tenantId is required). Owner/admin/wildcard/_*_manage permissions are rejected even for a global admin (least-privilege by construction). Global-administrator only.

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
    UUID principalId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    ApplicationPrincipalPermissionRequestDto applicationPrincipalPermissionRequestDto = new ApplicationPrincipalPermissionRequestDto(); // ApplicationPrincipalPermissionRequestDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.grantGlobalApplicationPrincipalPermission(principalId, tenantId, applicationPrincipalPermissionRequestDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationPrincipalsApi#grantGlobalApplicationPrincipalPermission");
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
| **principalId** | **UUID**|  | |
| **tenantId** | **UUID**|  | |
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
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Content |  -  |

<a id="provisionGlobalApplicationPrincipal"></a>
# **provisionGlobalApplicationPrincipal**
> ApplicationPrincipalProvisioningResultDtoEnvelope provisionGlobalApplicationPrincipal(applicationPrincipalProvisionRequestDto, tenantId, apiVersion, xApiVersion)

Provision an application principal (any tenant, incl. system-locked)

Idempotently provisions the application principal (and its own least-privilege enrollment) for a governed business application. tenantId selects the target tenant (defaults to the platform/root tenant). Unlike the per-tenant lane, a system-locked platform application is provisionable here. Global-administrator only.

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
    ApplicationPrincipalProvisionRequestDto applicationPrincipalProvisionRequestDto = new ApplicationPrincipalProvisionRequestDto(); // ApplicationPrincipalProvisionRequestDto | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ApplicationPrincipalProvisioningResultDtoEnvelope result = apiInstance.provisionGlobalApplicationPrincipal(applicationPrincipalProvisionRequestDto, tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationPrincipalsApi#provisionGlobalApplicationPrincipal");
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
| **applicationPrincipalProvisionRequestDto** | [**ApplicationPrincipalProvisionRequestDto**](ApplicationPrincipalProvisionRequestDto.md)|  | |
| **tenantId** | **UUID**|  | [optional] |
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
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |

<a id="provisionPaymentsConnector"></a>
# **provisionPaymentsConnector**
> ApplicationPrincipalProvisioningResultDtoEnvelope provisionPaymentsConnector(tenantId, apiVersion, xApiVersion)

Provision the platform payments-connector identity

Idempotently stands up the platform payments-connector identity — its well-known business application, its application principal, and its own least-privilege enrollment (payments_create/payments_update/journals_post). tenantId selects the target tenant (defaults to the platform/root tenant). The provisioned connector then appears in this global list and (for its tenant) the per-tenant list. Global-administrator only.

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
    try {
      ApplicationPrincipalProvisioningResultDtoEnvelope result = apiInstance.provisionPaymentsConnector(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationPrincipalsApi#provisionPaymentsConnector");
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

[**ApplicationPrincipalProvisioningResultDtoEnvelope**](ApplicationPrincipalProvisioningResultDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="revokeGlobalApplicationPrincipalPermission"></a>
# **revokeGlobalApplicationPrincipalPermission**
> EmptyEnvelope revokeGlobalApplicationPrincipalPermission(principalId, permission, tenantId, apiVersion, xApiVersion)

Revoke a permission from an application principal (any tenant)

Revokes a direct permission grant from the application principal&#39;s enrollment in the tenantId tenant (required). Idempotent. Global-administrator only.

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
    UUID principalId = UUID.randomUUID(); // UUID | 
    String permission = "permission_example"; // String | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.revokeGlobalApplicationPrincipalPermission(principalId, permission, tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationPrincipalsApi#revokeGlobalApplicationPrincipalPermission");
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
| **principalId** | **UUID**|  | |
| **permission** | **String**|  | |
| **tenantId** | **UUID**|  | |
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
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="suspendGlobalApplicationPrincipal"></a>
# **suspendGlobalApplicationPrincipal**
> EmptyEnvelope suspendGlobalApplicationPrincipal(principalId, tenantId, apiVersion, xApiVersion)

Suspend an application principal (global)

Temporarily suspends the application principal; its identity is retained but it cannot act until reinstated (applies to system-locked principals here). tenantId scopes the action to a tenant the principal is enrolled in (required). Global-administrator only.

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
    UUID principalId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.suspendGlobalApplicationPrincipal(principalId, tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationPrincipalsApi#suspendGlobalApplicationPrincipal");
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
| **principalId** | **UUID**|  | |
| **tenantId** | **UUID**|  | |
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
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

