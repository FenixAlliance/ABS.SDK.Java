# InvitationsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**acceptTenantInvitation**](InvitationsApi.md#acceptTenantInvitation) | **POST** /api/v2/TenantsService/Invitations/{invitationId}/Accept | Accept an invitation to join a tenant |
| [**declineTenantInvitation**](InvitationsApi.md#declineTenantInvitation) | **POST** /api/v2/TenantsService/Invitations/{invitationId}/Decline | Decline an invitation to join a tenant |
| [**deleteTenantInvitation**](InvitationsApi.md#deleteTenantInvitation) | **DELETE** /api/v2/TenantsService/Invitations/{invitationId} | Delete a tenant invitation |
| [**getTenantInvitationById**](InvitationsApi.md#getTenantInvitationById) | **GET** /api/v2/TenantsService/Invitations/{invitationId} | Get a tenant invitation by its ID |
| [**getTenantInvitations**](InvitationsApi.md#getTenantInvitations) | **GET** /api/v2/TenantsService/Invitations | Retrieve a list of tenant invitations |
| [**getTenantInvitationsCount**](InvitationsApi.md#getTenantInvitationsCount) | **GET** /api/v2/TenantsService/Invitations/Count | Get the count of tenant invitations |
| [**sendTenantInvitation**](InvitationsApi.md#sendTenantInvitation) | **POST** /api/v2/TenantsService/Invitations | Send an invitation to a user to join a tenant |


<a id="acceptTenantInvitation"></a>
# **acceptTenantInvitation**
> EmptyEnvelope acceptTenantInvitation(invitationId, apiVersion, xApiVersion)

Accept an invitation to join a tenant

Accept an invitation to join a tenant

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvitationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvitationsApi apiInstance = new InvitationsApi(defaultClient);
    UUID invitationId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.acceptTenantInvitation(invitationId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvitationsApi#acceptTenantInvitation");
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
| **invitationId** | **UUID**|  | |
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

<a id="declineTenantInvitation"></a>
# **declineTenantInvitation**
> EmptyEnvelope declineTenantInvitation(invitationId, apiVersion, xApiVersion)

Decline an invitation to join a tenant

Decline an invitation to join a tenant

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvitationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvitationsApi apiInstance = new InvitationsApi(defaultClient);
    UUID invitationId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.declineTenantInvitation(invitationId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvitationsApi#declineTenantInvitation");
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
| **invitationId** | **UUID**|  | |
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

<a id="deleteTenantInvitation"></a>
# **deleteTenantInvitation**
> EmptyEnvelope deleteTenantInvitation(tenantId, invitationId, apiVersion, xApiVersion)

Delete a tenant invitation

Delete a tenant invitation

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvitationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvitationsApi apiInstance = new InvitationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invitationId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteTenantInvitation(tenantId, invitationId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvitationsApi#deleteTenantInvitation");
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
| **invitationId** | **UUID**|  | |
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

<a id="getTenantInvitationById"></a>
# **getTenantInvitationById**
> TenantInvitationDtoEnvelope getTenantInvitationById(tenantId, invitationId, apiVersion, xApiVersion)

Get a tenant invitation by its ID

Get a tenant invitation by its ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvitationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvitationsApi apiInstance = new InvitationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID invitationId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TenantInvitationDtoEnvelope result = apiInstance.getTenantInvitationById(tenantId, invitationId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvitationsApi#getTenantInvitationById");
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
| **invitationId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**TenantInvitationDtoEnvelope**](TenantInvitationDtoEnvelope.md)

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

<a id="getTenantInvitations"></a>
# **getTenantInvitations**
> TenantInvitationDtoListEnvelope getTenantInvitations(tenantId, apiVersion, xApiVersion)

Retrieve a list of tenant invitations

Retrieve a list of tenant invitations

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvitationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvitationsApi apiInstance = new InvitationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TenantInvitationDtoListEnvelope result = apiInstance.getTenantInvitations(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvitationsApi#getTenantInvitations");
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

[**TenantInvitationDtoListEnvelope**](TenantInvitationDtoListEnvelope.md)

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

<a id="getTenantInvitationsCount"></a>
# **getTenantInvitationsCount**
> Int32Envelope getTenantInvitationsCount(tenantId, apiVersion, xApiVersion)

Get the count of tenant invitations

Get the count of tenant invitations

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvitationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvitationsApi apiInstance = new InvitationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getTenantInvitationsCount(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvitationsApi#getTenantInvitationsCount");
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

<a id="sendTenantInvitation"></a>
# **sendTenantInvitation**
> EmptyEnvelope sendTenantInvitation(tenantId, apiVersion, xApiVersion, tenantInvitationCreateDto)

Send an invitation to a user to join a tenant

Send an invitation to a user to join a tenant

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvitationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InvitationsApi apiInstance = new InvitationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TenantInvitationCreateDto tenantInvitationCreateDto = new TenantInvitationCreateDto(); // TenantInvitationCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.sendTenantInvitation(tenantId, apiVersion, xApiVersion, tenantInvitationCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvitationsApi#sendTenantInvitation");
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
| **tenantInvitationCreateDto** | [**TenantInvitationCreateDto**](TenantInvitationCreateDto.md)|  | [optional] |

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

