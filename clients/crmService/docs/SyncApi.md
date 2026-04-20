# SyncApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**syncCurrentHolderToCurrentTenantCrm**](SyncApi.md#syncCurrentHolderToCurrentTenantCrm) | **POST** /api/v2/CrmService/Sync | Sync the current user into the current tenant&#39;s contact list |
| [**syncCurrentHolderToTenantCrm**](SyncApi.md#syncCurrentHolderToTenantCrm) | **POST** /api/v2/CrmService/Sync/Me | Sync the current user into a tenant&#39;s contact list |
| [**syncHolderToTenantCrmAsync**](SyncApi.md#syncHolderToTenantCrmAsync) | **POST** /api/v2/CrmService/Sync/User | Sync a user into a tenant&#39;s contact list |
| [**syncTenantToTenantCrm**](SyncApi.md#syncTenantToTenantCrm) | **POST** /api/v2/CrmService/Sync/Tenant | Sync a tenant into another tenant&#39;s contact list |


<a id="syncCurrentHolderToCurrentTenantCrm"></a>
# **syncCurrentHolderToCurrentTenantCrm**
> Envelope syncCurrentHolderToCurrentTenantCrm(tenantId, apiVersion, xApiVersion)

Sync the current user into the current tenant&#39;s contact list

Synchronizes the currently authenticated user into the current tenant&#39;s CRM contact list.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SyncApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SyncApi apiInstance = new SyncApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Envelope result = apiInstance.syncCurrentHolderToCurrentTenantCrm(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyncApi#syncCurrentHolderToCurrentTenantCrm");
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

[**Envelope**](Envelope.md)

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

<a id="syncCurrentHolderToTenantCrm"></a>
# **syncCurrentHolderToTenantCrm**
> Envelope syncCurrentHolderToTenantCrm(tenantId, apiVersion, xApiVersion)

Sync the current user into a tenant&#39;s contact list

Synchronizes the currently authenticated user into the specified tenant&#39;s CRM contact list.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SyncApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SyncApi apiInstance = new SyncApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Envelope result = apiInstance.syncCurrentHolderToTenantCrm(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyncApi#syncCurrentHolderToTenantCrm");
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

[**Envelope**](Envelope.md)

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

<a id="syncHolderToTenantCrmAsync"></a>
# **syncHolderToTenantCrmAsync**
> Envelope syncHolderToTenantCrmAsync(tenantId, relatedUserId, apiVersion, xApiVersion)

Sync a user into a tenant&#39;s contact list

Synchronizes a specified user into the tenant&#39;s CRM contact list.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SyncApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SyncApi apiInstance = new SyncApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID relatedUserId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Envelope result = apiInstance.syncHolderToTenantCrmAsync(tenantId, relatedUserId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyncApi#syncHolderToTenantCrmAsync");
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
| **relatedUserId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**Envelope**](Envelope.md)

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

<a id="syncTenantToTenantCrm"></a>
# **syncTenantToTenantCrm**
> EmptyEnvelope syncTenantToTenantCrm(tenantId, relatedTenantId, apiVersion, xApiVersion)

Sync a tenant into another tenant&#39;s contact list

Synchronizes a tenant into another tenant&#39;s CRM contact list.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SyncApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SyncApi apiInstance = new SyncApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID relatedTenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.syncTenantToTenantCrm(tenantId, relatedTenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyncApi#syncTenantToTenantCrm");
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
| **relatedTenantId** | **UUID**|  | |
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

