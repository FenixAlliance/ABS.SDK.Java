# RolesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assignPermissionToRoleAsync**](RolesApi.md#assignPermissionToRoleAsync) | **POST** /api/v2/SecurityService/Roles/{securityRoleId}/Permissions/{securityPermissionId} | Assign a permission to a role |
| [**assignRoleToBusinessApplicationAsync**](RolesApi.md#assignRoleToBusinessApplicationAsync) | **POST** /api/v2/SecurityService/Roles/{securityRoleId}/Applications/{applicationId} | Assign a role to a business application |
| [**assignRoleToEnrollmentAsync**](RolesApi.md#assignRoleToEnrollmentAsync) | **POST** /api/v2/SecurityService/Roles/{securityRoleId}/Enrollments/{enrollmentId} | Assign a role to an enrollment |
| [**createRoleAsync**](RolesApi.md#createRoleAsync) | **POST** /api/v2/SecurityService/Roles | Create a new role |
| [**deleteRoleAsync**](RolesApi.md#deleteRoleAsync) | **DELETE** /api/v2/SecurityService/Roles/{securityRoleId} | Delete an existing role |
| [**getApplicationsByRoleAsync**](RolesApi.md#getApplicationsByRoleAsync) | **GET** /api/v2/SecurityService/Roles/{securityRoleId}/Applications | Get applications by role |
| [**getEnrollmentsByRoleAsync**](RolesApi.md#getEnrollmentsByRoleAsync) | **GET** /api/v2/SecurityService/Roles/{securityRoleId}/Enrollments | Get enrollments by role |
| [**getRoleAsync**](RolesApi.md#getRoleAsync) | **GET** /api/v2/SecurityService/Roles/{securityRoleId} | Get role by ID |
| [**getRolePermissionsAsync**](RolesApi.md#getRolePermissionsAsync) | **GET** /api/v2/SecurityService/Roles/{securityRoleId}/Permissions | Get permissions by role |
| [**getRolesAsync**](RolesApi.md#getRolesAsync) | **GET** /api/v2/SecurityService/Roles | Get all roles |
| [**getRolesByEnrollmentAsync**](RolesApi.md#getRolesByEnrollmentAsync) | **GET** /api/v2/SecurityService/Roles/ByEnrollment/{enrollmentId} | Get roles by enrollment |
| [**getRolesCountAsync**](RolesApi.md#getRolesCountAsync) | **GET** /api/v2/SecurityService/Roles/Count | Get roles count |
| [**revokePermissionFromRoleAsync**](RolesApi.md#revokePermissionFromRoleAsync) | **DELETE** /api/v2/SecurityService/Roles/{securityRoleId}/Permissions/{securityPermissionId} | Revoke a permission from a role |
| [**revokeRoleFromBusinessApplicationAsync**](RolesApi.md#revokeRoleFromBusinessApplicationAsync) | **DELETE** /api/v2/SecurityService/Roles/{securityRoleId}/Applications/{applicationId} | Revoke a role from a business application |
| [**revokeRoleFromEnrollmentAsync**](RolesApi.md#revokeRoleFromEnrollmentAsync) | **DELETE** /api/v2/SecurityService/Roles/{securityRoleId}/Enrollments/{enrollmentId} | Revoke a role from an enrollment |
| [**updateRoleAsync**](RolesApi.md#updateRoleAsync) | **PUT** /api/v2/SecurityService/Roles/{securityRoleId} | Update an existing role |


<a id="assignPermissionToRoleAsync"></a>
# **assignPermissionToRoleAsync**
> EmptyEnvelope assignPermissionToRoleAsync(tenantId, securityRoleId, securityPermissionId, apiVersion, xApiVersion)

Assign a permission to a role

Assigns a security permission to a security role.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    RolesApi apiInstance = new RolesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String securityRoleId = "securityRoleId_example"; // String | 
    String securityPermissionId = "securityPermissionId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.assignPermissionToRoleAsync(tenantId, securityRoleId, securityPermissionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#assignPermissionToRoleAsync");
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
| **201** | Created |  -  |

<a id="assignRoleToBusinessApplicationAsync"></a>
# **assignRoleToBusinessApplicationAsync**
> EmptyEnvelope assignRoleToBusinessApplicationAsync(tenantId, securityRoleId, applicationId, apiVersion, xApiVersion)

Assign a role to a business application

Assigns a security role to a business application.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    RolesApi apiInstance = new RolesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String securityRoleId = "securityRoleId_example"; // String | 
    UUID applicationId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.assignRoleToBusinessApplicationAsync(tenantId, securityRoleId, applicationId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#assignRoleToBusinessApplicationAsync");
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
| **201** | Created |  -  |

<a id="assignRoleToEnrollmentAsync"></a>
# **assignRoleToEnrollmentAsync**
> EmptyEnvelope assignRoleToEnrollmentAsync(tenantId, securityRoleId, enrollmentId, apiVersion, xApiVersion)

Assign a role to an enrollment

Assigns a security role to a tenant enrollment.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    RolesApi apiInstance = new RolesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String securityRoleId = "securityRoleId_example"; // String | 
    String enrollmentId = "enrollmentId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.assignRoleToEnrollmentAsync(tenantId, securityRoleId, enrollmentId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#assignRoleToEnrollmentAsync");
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
| **201** | Created |  -  |

<a id="createRoleAsync"></a>
# **createRoleAsync**
> EmptyEnvelope createRoleAsync(tenantId, securityRoleCreateDto, apiVersion, xApiVersion)

Create a new role

Creates a new security role for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    RolesApi apiInstance = new RolesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    SecurityRoleCreateDto securityRoleCreateDto = new SecurityRoleCreateDto(); // SecurityRoleCreateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.createRoleAsync(tenantId, securityRoleCreateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#createRoleAsync");
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
| **securityRoleCreateDto** | [**SecurityRoleCreateDto**](SecurityRoleCreateDto.md)|  | |
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

<a id="deleteRoleAsync"></a>
# **deleteRoleAsync**
> EmptyEnvelope deleteRoleAsync(tenantId, securityRoleId, apiVersion, xApiVersion)

Delete an existing role

Deletes an existing security role for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    RolesApi apiInstance = new RolesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String securityRoleId = "securityRoleId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteRoleAsync(tenantId, securityRoleId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#deleteRoleAsync");
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

<a id="getApplicationsByRoleAsync"></a>
# **getApplicationsByRoleAsync**
> BusinessApplicationSimpleDtoListEnvelope getApplicationsByRoleAsync(tenantId, securityRoleId, apiVersion, xApiVersion)

Get applications by role

Retrieves all business applications that have a specific role granted.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    RolesApi apiInstance = new RolesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String securityRoleId = "securityRoleId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      BusinessApplicationSimpleDtoListEnvelope result = apiInstance.getApplicationsByRoleAsync(tenantId, securityRoleId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#getApplicationsByRoleAsync");
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

[**BusinessApplicationSimpleDtoListEnvelope**](BusinessApplicationSimpleDtoListEnvelope.md)

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

<a id="getEnrollmentsByRoleAsync"></a>
# **getEnrollmentsByRoleAsync**
> TenantEnrollmentDtoListEnvelope getEnrollmentsByRoleAsync(tenantId, securityRoleId, apiVersion, xApiVersion)

Get enrollments by role

Retrieves all tenant enrollments that have a specific role.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    RolesApi apiInstance = new RolesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String securityRoleId = "securityRoleId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TenantEnrollmentDtoListEnvelope result = apiInstance.getEnrollmentsByRoleAsync(tenantId, securityRoleId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#getEnrollmentsByRoleAsync");
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

[**TenantEnrollmentDtoListEnvelope**](TenantEnrollmentDtoListEnvelope.md)

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

<a id="getRoleAsync"></a>
# **getRoleAsync**
> SecurityRoleDtoEnvelope getRoleAsync(tenantId, securityRoleId, apiVersion, xApiVersion)

Get role by ID

Retrieves a specific security role by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    RolesApi apiInstance = new RolesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String securityRoleId = "securityRoleId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SecurityRoleDtoEnvelope result = apiInstance.getRoleAsync(tenantId, securityRoleId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#getRoleAsync");
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

[**SecurityRoleDtoEnvelope**](SecurityRoleDtoEnvelope.md)

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

<a id="getRolePermissionsAsync"></a>
# **getRolePermissionsAsync**
> SecurityPermissionDtoListEnvelope getRolePermissionsAsync(tenantId, securityRoleId, apiVersion, xApiVersion)

Get permissions by role

Retrieves all security permissions assigned to a specific role.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    RolesApi apiInstance = new RolesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String securityRoleId = "securityRoleId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SecurityPermissionDtoListEnvelope result = apiInstance.getRolePermissionsAsync(tenantId, securityRoleId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#getRolePermissionsAsync");
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

<a id="getRolesAsync"></a>
# **getRolesAsync**
> SecurityRoleDtoListEnvelope getRolesAsync(tenantId, apiVersion, xApiVersion)

Get all roles

Retrieves all security roles for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    RolesApi apiInstance = new RolesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SecurityRoleDtoListEnvelope result = apiInstance.getRolesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#getRolesAsync");
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

<a id="getRolesByEnrollmentAsync"></a>
# **getRolesByEnrollmentAsync**
> SecurityRoleDtoListEnvelope getRolesByEnrollmentAsync(tenantId, enrollmentId, apiVersion, xApiVersion)

Get roles by enrollment

Retrieves all security roles granted to a specific enrollment.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    RolesApi apiInstance = new RolesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String enrollmentId = "enrollmentId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SecurityRoleDtoListEnvelope result = apiInstance.getRolesByEnrollmentAsync(tenantId, enrollmentId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#getRolesByEnrollmentAsync");
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
| **enrollmentId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**SecurityRoleDtoListEnvelope**](SecurityRoleDtoListEnvelope.md)

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

<a id="getRolesCountAsync"></a>
# **getRolesCountAsync**
> Int32Envelope getRolesCountAsync(tenantId, apiVersion, xApiVersion)

Get roles count

Retrieves the count of security roles for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    RolesApi apiInstance = new RolesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getRolesCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#getRolesCountAsync");
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

<a id="revokePermissionFromRoleAsync"></a>
# **revokePermissionFromRoleAsync**
> EmptyEnvelope revokePermissionFromRoleAsync(tenantId, securityRoleId, securityPermissionId, apiVersion, xApiVersion)

Revoke a permission from a role

Revokes a security permission from a security role.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    RolesApi apiInstance = new RolesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String securityRoleId = "securityRoleId_example"; // String | 
    String securityPermissionId = "securityPermissionId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.revokePermissionFromRoleAsync(tenantId, securityRoleId, securityPermissionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#revokePermissionFromRoleAsync");
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

<a id="revokeRoleFromBusinessApplicationAsync"></a>
# **revokeRoleFromBusinessApplicationAsync**
> EmptyEnvelope revokeRoleFromBusinessApplicationAsync(tenantId, securityRoleId, applicationId, apiVersion, xApiVersion)

Revoke a role from a business application

Revokes a security role from a business application.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    RolesApi apiInstance = new RolesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String securityRoleId = "securityRoleId_example"; // String | 
    UUID applicationId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.revokeRoleFromBusinessApplicationAsync(tenantId, securityRoleId, applicationId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#revokeRoleFromBusinessApplicationAsync");
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

<a id="revokeRoleFromEnrollmentAsync"></a>
# **revokeRoleFromEnrollmentAsync**
> EmptyEnvelope revokeRoleFromEnrollmentAsync(tenantId, securityRoleId, enrollmentId, apiVersion, xApiVersion)

Revoke a role from an enrollment

Revokes a security role from a tenant enrollment.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    RolesApi apiInstance = new RolesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String securityRoleId = "securityRoleId_example"; // String | 
    String enrollmentId = "enrollmentId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.revokeRoleFromEnrollmentAsync(tenantId, securityRoleId, enrollmentId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#revokeRoleFromEnrollmentAsync");
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

<a id="updateRoleAsync"></a>
# **updateRoleAsync**
> EmptyEnvelope updateRoleAsync(tenantId, securityRoleId, securityRoleUpdateDto, apiVersion, xApiVersion)

Update an existing role

Updates an existing security role for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    RolesApi apiInstance = new RolesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String securityRoleId = "securityRoleId_example"; // String | 
    SecurityRoleUpdateDto securityRoleUpdateDto = new SecurityRoleUpdateDto(); // SecurityRoleUpdateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.updateRoleAsync(tenantId, securityRoleId, securityRoleUpdateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#updateRoleAsync");
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
| **securityRoleUpdateDto** | [**SecurityRoleUpdateDto**](SecurityRoleUpdateDto.md)|  | |
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

