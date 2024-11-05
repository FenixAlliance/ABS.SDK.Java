# RolesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2SecurityServiceRolesGet**](RolesApi.md#apiV2SecurityServiceRolesGet) | **GET** /api/v2/SecurityService/Roles |  |
| [**apiV2SecurityServiceRolesPost**](RolesApi.md#apiV2SecurityServiceRolesPost) | **POST** /api/v2/SecurityService/Roles |  |
| [**apiV2SecurityServiceRolesSecurityRoleIdApplicationsApplicationIdDelete**](RolesApi.md#apiV2SecurityServiceRolesSecurityRoleIdApplicationsApplicationIdDelete) | **DELETE** /api/v2/SecurityService/Roles/{securityRoleId}/Applications/{applicationId} |  |
| [**apiV2SecurityServiceRolesSecurityRoleIdApplicationsApplicationIdPost**](RolesApi.md#apiV2SecurityServiceRolesSecurityRoleIdApplicationsApplicationIdPost) | **POST** /api/v2/SecurityService/Roles/{securityRoleId}/Applications/{applicationId} |  |
| [**apiV2SecurityServiceRolesSecurityRoleIdDelete**](RolesApi.md#apiV2SecurityServiceRolesSecurityRoleIdDelete) | **DELETE** /api/v2/SecurityService/Roles/{securityRoleId} |  |
| [**apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsEnrollmentIdDelete**](RolesApi.md#apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsEnrollmentIdDelete) | **DELETE** /api/v2/SecurityService/Roles/{securityRoleId}/Enrollments/{enrollmentId} |  |
| [**apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsEnrollmentIdPost**](RolesApi.md#apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsEnrollmentIdPost) | **POST** /api/v2/SecurityService/Roles/{securityRoleId}/Enrollments/{enrollmentId} |  |
| [**apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsGet**](RolesApi.md#apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsGet) | **GET** /api/v2/SecurityService/Roles/{securityRoleId}/Enrollments |  |
| [**apiV2SecurityServiceRolesSecurityRoleIdGet**](RolesApi.md#apiV2SecurityServiceRolesSecurityRoleIdGet) | **GET** /api/v2/SecurityService/Roles/{securityRoleId} |  |
| [**apiV2SecurityServiceRolesSecurityRoleIdPermissionsGet**](RolesApi.md#apiV2SecurityServiceRolesSecurityRoleIdPermissionsGet) | **GET** /api/v2/SecurityService/Roles/{securityRoleId}/Permissions |  |
| [**apiV2SecurityServiceRolesSecurityRoleIdPermissionsSecurityPermissionIdDelete**](RolesApi.md#apiV2SecurityServiceRolesSecurityRoleIdPermissionsSecurityPermissionIdDelete) | **DELETE** /api/v2/SecurityService/Roles/{securityRoleId}/Permissions/{securityPermissionId} |  |
| [**apiV2SecurityServiceRolesSecurityRoleIdPermissionsSecurityPermissionIdPost**](RolesApi.md#apiV2SecurityServiceRolesSecurityRoleIdPermissionsSecurityPermissionIdPost) | **POST** /api/v2/SecurityService/Roles/{securityRoleId}/Permissions/{securityPermissionId} |  |
| [**apiV2SecurityServiceRolesSecurityRoleIdPut**](RolesApi.md#apiV2SecurityServiceRolesSecurityRoleIdPut) | **PUT** /api/v2/SecurityService/Roles/{securityRoleId} |  |


<a id="apiV2SecurityServiceRolesGet"></a>
# **apiV2SecurityServiceRolesGet**
> SecurityRoleDtoListEnvelope apiV2SecurityServiceRolesGet(tenantId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    RolesApi apiInstance = new RolesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SecurityRoleDtoListEnvelope result = apiInstance.apiV2SecurityServiceRolesGet(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#apiV2SecurityServiceRolesGet");
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

[**SecurityRoleDtoListEnvelope**](SecurityRoleDtoListEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="apiV2SecurityServiceRolesPost"></a>
# **apiV2SecurityServiceRolesPost**
> EmptyEnvelope apiV2SecurityServiceRolesPost(tenantId, apiVersion, xApiVersion, securityRoleCreateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    RolesApi apiInstance = new RolesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SecurityRoleCreateDto securityRoleCreateDto = new SecurityRoleCreateDto(); // SecurityRoleCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.apiV2SecurityServiceRolesPost(tenantId, apiVersion, xApiVersion, securityRoleCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#apiV2SecurityServiceRolesPost");
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
| **securityRoleCreateDto** | [**SecurityRoleCreateDto**](SecurityRoleCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

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

<a id="apiV2SecurityServiceRolesSecurityRoleIdApplicationsApplicationIdDelete"></a>
# **apiV2SecurityServiceRolesSecurityRoleIdApplicationsApplicationIdDelete**
> EmptyEnvelope apiV2SecurityServiceRolesSecurityRoleIdApplicationsApplicationIdDelete(tenantId, securityRoleId, applicationId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    RolesApi apiInstance = new RolesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String securityRoleId = "securityRoleId_example"; // String | 
    UUID applicationId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.apiV2SecurityServiceRolesSecurityRoleIdApplicationsApplicationIdDelete(tenantId, securityRoleId, applicationId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#apiV2SecurityServiceRolesSecurityRoleIdApplicationsApplicationIdDelete");
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
| **securityRoleId** | **String**|  | |
| **applicationId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

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

<a id="apiV2SecurityServiceRolesSecurityRoleIdApplicationsApplicationIdPost"></a>
# **apiV2SecurityServiceRolesSecurityRoleIdApplicationsApplicationIdPost**
> EmptyEnvelope apiV2SecurityServiceRolesSecurityRoleIdApplicationsApplicationIdPost(tenantId, securityRoleId, applicationId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    RolesApi apiInstance = new RolesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String securityRoleId = "securityRoleId_example"; // String | 
    UUID applicationId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.apiV2SecurityServiceRolesSecurityRoleIdApplicationsApplicationIdPost(tenantId, securityRoleId, applicationId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#apiV2SecurityServiceRolesSecurityRoleIdApplicationsApplicationIdPost");
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
| **securityRoleId** | **String**|  | |
| **applicationId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

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

<a id="apiV2SecurityServiceRolesSecurityRoleIdDelete"></a>
# **apiV2SecurityServiceRolesSecurityRoleIdDelete**
> EmptyEnvelope apiV2SecurityServiceRolesSecurityRoleIdDelete(tenantId, securityRoleId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    RolesApi apiInstance = new RolesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String securityRoleId = "securityRoleId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.apiV2SecurityServiceRolesSecurityRoleIdDelete(tenantId, securityRoleId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#apiV2SecurityServiceRolesSecurityRoleIdDelete");
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
| **securityRoleId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

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

<a id="apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsEnrollmentIdDelete"></a>
# **apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsEnrollmentIdDelete**
> EmptyEnvelope apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsEnrollmentIdDelete(tenantId, securityRoleId, enrollmentId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    RolesApi apiInstance = new RolesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String securityRoleId = "securityRoleId_example"; // String | 
    String enrollmentId = "enrollmentId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsEnrollmentIdDelete(tenantId, securityRoleId, enrollmentId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsEnrollmentIdDelete");
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
| **securityRoleId** | **String**|  | |
| **enrollmentId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

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

<a id="apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsEnrollmentIdPost"></a>
# **apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsEnrollmentIdPost**
> EmptyEnvelope apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsEnrollmentIdPost(tenantId, securityRoleId, enrollmentId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    RolesApi apiInstance = new RolesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String securityRoleId = "securityRoleId_example"; // String | 
    String enrollmentId = "enrollmentId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsEnrollmentIdPost(tenantId, securityRoleId, enrollmentId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsEnrollmentIdPost");
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
| **securityRoleId** | **String**|  | |
| **enrollmentId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

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

<a id="apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsGet"></a>
# **apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsGet**
> TenantEnrolmentDtoListEnvelope apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsGet(tenantId, securityRoleId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    RolesApi apiInstance = new RolesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String securityRoleId = "securityRoleId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TenantEnrolmentDtoListEnvelope result = apiInstance.apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsGet(tenantId, securityRoleId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsGet");
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
| **securityRoleId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**TenantEnrolmentDtoListEnvelope**](TenantEnrolmentDtoListEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="apiV2SecurityServiceRolesSecurityRoleIdGet"></a>
# **apiV2SecurityServiceRolesSecurityRoleIdGet**
> SecurityRoleDtoListEnvelope apiV2SecurityServiceRolesSecurityRoleIdGet(tenantId, securityRoleId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    RolesApi apiInstance = new RolesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String securityRoleId = "securityRoleId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SecurityRoleDtoListEnvelope result = apiInstance.apiV2SecurityServiceRolesSecurityRoleIdGet(tenantId, securityRoleId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#apiV2SecurityServiceRolesSecurityRoleIdGet");
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
| **securityRoleId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**SecurityRoleDtoListEnvelope**](SecurityRoleDtoListEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="apiV2SecurityServiceRolesSecurityRoleIdPermissionsGet"></a>
# **apiV2SecurityServiceRolesSecurityRoleIdPermissionsGet**
> SecurityPermissionDtoListEnvelope apiV2SecurityServiceRolesSecurityRoleIdPermissionsGet(tenantId, securityRoleId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    RolesApi apiInstance = new RolesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String securityRoleId = "securityRoleId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SecurityPermissionDtoListEnvelope result = apiInstance.apiV2SecurityServiceRolesSecurityRoleIdPermissionsGet(tenantId, securityRoleId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#apiV2SecurityServiceRolesSecurityRoleIdPermissionsGet");
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
| **securityRoleId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**SecurityPermissionDtoListEnvelope**](SecurityPermissionDtoListEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="apiV2SecurityServiceRolesSecurityRoleIdPermissionsSecurityPermissionIdDelete"></a>
# **apiV2SecurityServiceRolesSecurityRoleIdPermissionsSecurityPermissionIdDelete**
> EmptyEnvelope apiV2SecurityServiceRolesSecurityRoleIdPermissionsSecurityPermissionIdDelete(tenantId, securityRoleId, securityPermissionId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    RolesApi apiInstance = new RolesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String securityRoleId = "securityRoleId_example"; // String | 
    String securityPermissionId = "securityPermissionId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.apiV2SecurityServiceRolesSecurityRoleIdPermissionsSecurityPermissionIdDelete(tenantId, securityRoleId, securityPermissionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#apiV2SecurityServiceRolesSecurityRoleIdPermissionsSecurityPermissionIdDelete");
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
| **securityRoleId** | **String**|  | |
| **securityPermissionId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

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

<a id="apiV2SecurityServiceRolesSecurityRoleIdPermissionsSecurityPermissionIdPost"></a>
# **apiV2SecurityServiceRolesSecurityRoleIdPermissionsSecurityPermissionIdPost**
> EmptyEnvelope apiV2SecurityServiceRolesSecurityRoleIdPermissionsSecurityPermissionIdPost(tenantId, securityRoleId, securityPermissionId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    RolesApi apiInstance = new RolesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String securityRoleId = "securityRoleId_example"; // String | 
    String securityPermissionId = "securityPermissionId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.apiV2SecurityServiceRolesSecurityRoleIdPermissionsSecurityPermissionIdPost(tenantId, securityRoleId, securityPermissionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#apiV2SecurityServiceRolesSecurityRoleIdPermissionsSecurityPermissionIdPost");
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
| **securityRoleId** | **String**|  | |
| **securityPermissionId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

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

<a id="apiV2SecurityServiceRolesSecurityRoleIdPut"></a>
# **apiV2SecurityServiceRolesSecurityRoleIdPut**
> EmptyEnvelope apiV2SecurityServiceRolesSecurityRoleIdPut(tenantId, securityRoleId, apiVersion, xApiVersion, securityRoleUpdateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    RolesApi apiInstance = new RolesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String securityRoleId = "securityRoleId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SecurityRoleUpdateDto securityRoleUpdateDto = new SecurityRoleUpdateDto(); // SecurityRoleUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.apiV2SecurityServiceRolesSecurityRoleIdPut(tenantId, securityRoleId, apiVersion, xApiVersion, securityRoleUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#apiV2SecurityServiceRolesSecurityRoleIdPut");
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
| **securityRoleId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **securityRoleUpdateDto** | [**SecurityRoleUpdateDto**](SecurityRoleUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

[Bearer](../README.md#Bearer)

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

