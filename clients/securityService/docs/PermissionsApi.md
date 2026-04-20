# PermissionsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assignPermissionToBusinessApplicationAsync**](PermissionsApi.md#assignPermissionToBusinessApplicationAsync) | **POST** /api/v2/SecurityService/Permissions/{securityPermissionId}/Applications/{applicationId} | Assign a permission to a business application |
| [**assignPermissionToEnrollmentAsync**](PermissionsApi.md#assignPermissionToEnrollmentAsync) | **POST** /api/v2/SecurityService/Permissions/{securityPermissionId}/Enrollments/{enrollmentId} | Assign a permission to an enrollment |
| [**assignRoleToPermissionAsync**](PermissionsApi.md#assignRoleToPermissionAsync) | **POST** /api/v2/SecurityService/Permissions/{securityPermissionId}/Roles/{securityRoleId} | Assign a role to a permission |
| [**createPermissionAsync**](PermissionsApi.md#createPermissionAsync) | **POST** /api/v2/SecurityService/Permissions | Create a new permission |
| [**deletePermissionAsync**](PermissionsApi.md#deletePermissionAsync) | **DELETE** /api/v2/SecurityService/Permissions/{securityPermissionId} | Delete an existing permission |
| [**getApplicationsByPermissionAsync**](PermissionsApi.md#getApplicationsByPermissionAsync) | **GET** /api/v2/SecurityService/Permissions/{securityPermissionId}/Applications | Get applications by permission |
| [**getEnrollmentsByPermissionAsync**](PermissionsApi.md#getEnrollmentsByPermissionAsync) | **GET** /api/v2/SecurityService/Permissions/{securityPermissionId}/Enrollments | Get enrollments by permission |
| [**getPermissionAsync**](PermissionsApi.md#getPermissionAsync) | **GET** /api/v2/SecurityService/Permissions/{securityPermissionId} | Get permission by ID |
| [**getPermissionsAsync**](PermissionsApi.md#getPermissionsAsync) | **GET** /api/v2/SecurityService/Permissions | Get all permissions |
| [**getPermissionsByEnrollmentAsync**](PermissionsApi.md#getPermissionsByEnrollmentAsync) | **GET** /api/v2/SecurityService/Permissions/ByEnrollment/{enrollmentId} | Get permissions by enrollment |
| [**getPermissionsCountAsync**](PermissionsApi.md#getPermissionsCountAsync) | **GET** /api/v2/SecurityService/Permissions/Count | Get permissions count |
| [**getRolesByPermissionAsync**](PermissionsApi.md#getRolesByPermissionAsync) | **GET** /api/v2/SecurityService/Permissions/{securityPermissionId}/Roles | Get roles by permission |
| [**revokePermissionFromBusinessApplicationAsync**](PermissionsApi.md#revokePermissionFromBusinessApplicationAsync) | **DELETE** /api/v2/SecurityService/Permissions/{securityPermissionId}/Applications/{applicationId} | Revoke a permission from a business application |
| [**revokePermissionFromEnrollmentAsync**](PermissionsApi.md#revokePermissionFromEnrollmentAsync) | **DELETE** /api/v2/SecurityService/Permissions/{securityPermissionId}/Enrollments/{enrollmentId} | Revoke a permission from an enrollment |
| [**revokeRoleFromPermissionAsync**](PermissionsApi.md#revokeRoleFromPermissionAsync) | **DELETE** /api/v2/SecurityService/Permissions/{securityPermissionId}/Roles/{securityRoleId} | Revoke a role from a permission |
| [**updatePermissionAsync**](PermissionsApi.md#updatePermissionAsync) | **PUT** /api/v2/SecurityService/Permissions/{securityPermissionId} | Update an existing permission |


<a id="assignPermissionToBusinessApplicationAsync"></a>
# **assignPermissionToBusinessApplicationAsync**
> EmptyEnvelope assignPermissionToBusinessApplicationAsync(tenantId, securityPermissionId, applicationId, apiVersion, xApiVersion)

Assign a permission to a business application

Assigns a security permission to a business application.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PermissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PermissionsApi apiInstance = new PermissionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String securityPermissionId = "securityPermissionId_example"; // String | 
    String applicationId = "applicationId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.assignPermissionToBusinessApplicationAsync(tenantId, securityPermissionId, applicationId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionsApi#assignPermissionToBusinessApplicationAsync");
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
| **securityPermissionId** | **String**|  | |
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
| **201** | Created |  -  |

<a id="assignPermissionToEnrollmentAsync"></a>
# **assignPermissionToEnrollmentAsync**
> EmptyEnvelope assignPermissionToEnrollmentAsync(tenantId, securityPermissionId, enrollmentId, apiVersion, xApiVersion)

Assign a permission to an enrollment

Assigns a security permission to a tenant enrollment.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PermissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PermissionsApi apiInstance = new PermissionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String securityPermissionId = "securityPermissionId_example"; // String | 
    String enrollmentId = "enrollmentId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.assignPermissionToEnrollmentAsync(tenantId, securityPermissionId, enrollmentId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionsApi#assignPermissionToEnrollmentAsync");
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
| **securityPermissionId** | **String**|  | |
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

<a id="assignRoleToPermissionAsync"></a>
# **assignRoleToPermissionAsync**
> EmptyEnvelope assignRoleToPermissionAsync(tenantId, securityPermissionId, securityRoleId, apiVersion, xApiVersion)

Assign a role to a permission

Assigns a security role to a security permission.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PermissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PermissionsApi apiInstance = new PermissionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String securityPermissionId = "securityPermissionId_example"; // String | 
    String securityRoleId = "securityRoleId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.assignRoleToPermissionAsync(tenantId, securityPermissionId, securityRoleId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionsApi#assignRoleToPermissionAsync");
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
| **securityPermissionId** | **String**|  | |
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
| **201** | Created |  -  |

<a id="createPermissionAsync"></a>
# **createPermissionAsync**
> EmptyEnvelope createPermissionAsync(tenantId, securityPermissionCreateDto, apiVersion, xApiVersion)

Create a new permission

Creates a new security permission for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PermissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PermissionsApi apiInstance = new PermissionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    SecurityPermissionCreateDto securityPermissionCreateDto = new SecurityPermissionCreateDto(); // SecurityPermissionCreateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.createPermissionAsync(tenantId, securityPermissionCreateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionsApi#createPermissionAsync");
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
| **securityPermissionCreateDto** | [**SecurityPermissionCreateDto**](SecurityPermissionCreateDto.md)|  | |
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

<a id="deletePermissionAsync"></a>
# **deletePermissionAsync**
> EmptyEnvelope deletePermissionAsync(tenantId, securityPermissionId, apiVersion, xApiVersion)

Delete an existing permission

Deletes an existing security permission for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PermissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PermissionsApi apiInstance = new PermissionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String securityPermissionId = "securityPermissionId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deletePermissionAsync(tenantId, securityPermissionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionsApi#deletePermissionAsync");
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

<a id="getApplicationsByPermissionAsync"></a>
# **getApplicationsByPermissionAsync**
> BusinessApplicationSimpleDtoListEnvelope getApplicationsByPermissionAsync(tenantId, securityPermissionId, apiVersion, xApiVersion)

Get applications by permission

Retrieves all business applications that have a specific permission granted.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PermissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PermissionsApi apiInstance = new PermissionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String securityPermissionId = "securityPermissionId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      BusinessApplicationSimpleDtoListEnvelope result = apiInstance.getApplicationsByPermissionAsync(tenantId, securityPermissionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionsApi#getApplicationsByPermissionAsync");
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
| **securityPermissionId** | **String**|  | |
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

<a id="getEnrollmentsByPermissionAsync"></a>
# **getEnrollmentsByPermissionAsync**
> TenantEnrollmentDtoListEnvelope getEnrollmentsByPermissionAsync(tenantId, securityPermissionId, apiVersion, xApiVersion)

Get enrollments by permission

Retrieves all tenant enrollments that have a specific permission.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PermissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PermissionsApi apiInstance = new PermissionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String securityPermissionId = "securityPermissionId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TenantEnrollmentDtoListEnvelope result = apiInstance.getEnrollmentsByPermissionAsync(tenantId, securityPermissionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionsApi#getEnrollmentsByPermissionAsync");
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
| **securityPermissionId** | **String**|  | |
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

<a id="getPermissionAsync"></a>
# **getPermissionAsync**
> SecurityPermissionDtoEnvelope getPermissionAsync(tenantId, securityPermissionId, apiVersion, xApiVersion)

Get permission by ID

Retrieves a specific security permission by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PermissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PermissionsApi apiInstance = new PermissionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String securityPermissionId = "securityPermissionId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SecurityPermissionDtoEnvelope result = apiInstance.getPermissionAsync(tenantId, securityPermissionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionsApi#getPermissionAsync");
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
| **securityPermissionId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**SecurityPermissionDtoEnvelope**](SecurityPermissionDtoEnvelope.md)

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

<a id="getPermissionsAsync"></a>
# **getPermissionsAsync**
> SecurityPermissionDtoListEnvelope getPermissionsAsync(tenantId, apiVersion, xApiVersion)

Get all permissions

Retrieves all security permissions for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PermissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PermissionsApi apiInstance = new PermissionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SecurityPermissionDtoListEnvelope result = apiInstance.getPermissionsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionsApi#getPermissionsAsync");
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

<a id="getPermissionsByEnrollmentAsync"></a>
# **getPermissionsByEnrollmentAsync**
> SecurityPermissionDtoListEnvelope getPermissionsByEnrollmentAsync(tenantId, enrollmentId, apiVersion, xApiVersion)

Get permissions by enrollment

Retrieves all security permissions granted to a specific enrollment.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PermissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PermissionsApi apiInstance = new PermissionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String enrollmentId = "enrollmentId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SecurityPermissionDtoListEnvelope result = apiInstance.getPermissionsByEnrollmentAsync(tenantId, enrollmentId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionsApi#getPermissionsByEnrollmentAsync");
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

<a id="getPermissionsCountAsync"></a>
# **getPermissionsCountAsync**
> Int32Envelope getPermissionsCountAsync(tenantId, apiVersion, xApiVersion)

Get permissions count

Retrieves the count of security permissions for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PermissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PermissionsApi apiInstance = new PermissionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getPermissionsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionsApi#getPermissionsCountAsync");
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

<a id="getRolesByPermissionAsync"></a>
# **getRolesByPermissionAsync**
> SecurityRoleDtoListEnvelope getRolesByPermissionAsync(tenantId, securityPermissionId, apiVersion, xApiVersion)

Get roles by permission

Retrieves all security roles that have a specific permission granted.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PermissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PermissionsApi apiInstance = new PermissionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String securityPermissionId = "securityPermissionId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SecurityRoleDtoListEnvelope result = apiInstance.getRolesByPermissionAsync(tenantId, securityPermissionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionsApi#getRolesByPermissionAsync");
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
| **securityPermissionId** | **String**|  | |
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

<a id="revokePermissionFromBusinessApplicationAsync"></a>
# **revokePermissionFromBusinessApplicationAsync**
> EmptyEnvelope revokePermissionFromBusinessApplicationAsync(tenantId, securityPermissionId, applicationId, apiVersion, xApiVersion)

Revoke a permission from a business application

Revokes a security permission from a business application.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PermissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PermissionsApi apiInstance = new PermissionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String securityPermissionId = "securityPermissionId_example"; // String | 
    String applicationId = "applicationId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.revokePermissionFromBusinessApplicationAsync(tenantId, securityPermissionId, applicationId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionsApi#revokePermissionFromBusinessApplicationAsync");
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
| **securityPermissionId** | **String**|  | |
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
| **200** | OK |  -  |

<a id="revokePermissionFromEnrollmentAsync"></a>
# **revokePermissionFromEnrollmentAsync**
> EmptyEnvelope revokePermissionFromEnrollmentAsync(tenantId, securityPermissionId, enrollmentId, apiVersion, xApiVersion)

Revoke a permission from an enrollment

Revokes a security permission from a tenant enrollment.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PermissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PermissionsApi apiInstance = new PermissionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String securityPermissionId = "securityPermissionId_example"; // String | 
    String enrollmentId = "enrollmentId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.revokePermissionFromEnrollmentAsync(tenantId, securityPermissionId, enrollmentId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionsApi#revokePermissionFromEnrollmentAsync");
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
| **securityPermissionId** | **String**|  | |
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

<a id="revokeRoleFromPermissionAsync"></a>
# **revokeRoleFromPermissionAsync**
> EmptyEnvelope revokeRoleFromPermissionAsync(tenantId, securityPermissionId, securityRoleId, apiVersion, xApiVersion)

Revoke a role from a permission

Revokes a security role from a security permission.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PermissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PermissionsApi apiInstance = new PermissionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String securityPermissionId = "securityPermissionId_example"; // String | 
    String securityRoleId = "securityRoleId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.revokeRoleFromPermissionAsync(tenantId, securityPermissionId, securityRoleId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionsApi#revokeRoleFromPermissionAsync");
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
| **securityPermissionId** | **String**|  | |
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

<a id="updatePermissionAsync"></a>
# **updatePermissionAsync**
> EmptyEnvelope updatePermissionAsync(tenantId, securityPermissionId, securityPermissionUpdateDto, apiVersion, xApiVersion)

Update an existing permission

Updates an existing security permission for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PermissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    PermissionsApi apiInstance = new PermissionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String securityPermissionId = "securityPermissionId_example"; // String | 
    SecurityPermissionUpdateDto securityPermissionUpdateDto = new SecurityPermissionUpdateDto(); // SecurityPermissionUpdateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.updatePermissionAsync(tenantId, securityPermissionId, securityPermissionUpdateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionsApi#updatePermissionAsync");
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
| **securityPermissionId** | **String**|  | |
| **securityPermissionUpdateDto** | [**SecurityPermissionUpdateDto**](SecurityPermissionUpdateDto.md)|  | |
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

