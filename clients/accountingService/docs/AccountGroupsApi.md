# AccountGroupsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAccountGroup**](AccountGroupsApi.md#createAccountGroup) | **POST** /api/v2/AccountingService/AccountGroups | Creates a new account group |
| [**deleteAccountGroup**](AccountGroupsApi.md#deleteAccountGroup) | **DELETE** /api/v2/AccountingService/AccountGroups/{accountGroupId} | Deletes an existing account group |
| [**getAccountGroup**](AccountGroupsApi.md#getAccountGroup) | **GET** /api/v2/AccountingService/AccountGroups/{accountGroupId} | Gets the current tenant account group |
| [**getAccountGroups**](AccountGroupsApi.md#getAccountGroups) | **GET** /api/v2/AccountingService/AccountGroups | Gets the current tenant account groups |
| [**getAccountGroupsCountAsync**](AccountGroupsApi.md#getAccountGroupsCountAsync) | **GET** /api/v2/AccountingService/AccountGroups/Count | Gets the current tenant accounts count |
| [**updateAccountGroup**](AccountGroupsApi.md#updateAccountGroup) | **PUT** /api/v2/AccountingService/AccountGroups/{accountGroupId} | Updates an existing account group |


<a id="createAccountGroup"></a>
# **createAccountGroup**
> AccountGroupDtoEnvelope createAccountGroup(tenantId, apiVersion, xApiVersion, accountGroupCreateDto)

Creates a new account group

Creates a new account group.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AccountGroupsApi apiInstance = new AccountGroupsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    AccountGroupCreateDto accountGroupCreateDto = new AccountGroupCreateDto(); // AccountGroupCreateDto | 
    try {
      AccountGroupDtoEnvelope result = apiInstance.createAccountGroup(tenantId, apiVersion, xApiVersion, accountGroupCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountGroupsApi#createAccountGroup");
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
| **accountGroupCreateDto** | [**AccountGroupCreateDto**](AccountGroupCreateDto.md)|  | [optional] |

### Return type

[**AccountGroupDtoEnvelope**](AccountGroupDtoEnvelope.md)

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

<a id="deleteAccountGroup"></a>
# **deleteAccountGroup**
> deleteAccountGroup(tenantId, accountGroupId, apiVersion, xApiVersion)

Deletes an existing account group

Deletes an existing account group.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AccountGroupsApi apiInstance = new AccountGroupsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID accountGroupId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteAccountGroup(tenantId, accountGroupId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountGroupsApi#deleteAccountGroup");
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
| **accountGroupId** | **UUID**|  | |
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
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |

<a id="getAccountGroup"></a>
# **getAccountGroup**
> AccountGroupDtoEnvelope getAccountGroup(tenantId, accountGroupId, apiVersion, xApiVersion)

Gets the current tenant account group

Get the currently acting tenant account group.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AccountGroupsApi apiInstance = new AccountGroupsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID accountGroupId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      AccountGroupDtoEnvelope result = apiInstance.getAccountGroup(tenantId, accountGroupId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountGroupsApi#getAccountGroup");
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
| **accountGroupId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**AccountGroupDtoEnvelope**](AccountGroupDtoEnvelope.md)

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

<a id="getAccountGroups"></a>
# **getAccountGroups**
> AccountGroupDtoListEnvelope getAccountGroups(tenantId, apiVersion, xApiVersion)

Gets the current tenant account groups

Get the currently acting tenant account groups.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AccountGroupsApi apiInstance = new AccountGroupsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      AccountGroupDtoListEnvelope result = apiInstance.getAccountGroups(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountGroupsApi#getAccountGroups");
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

[**AccountGroupDtoListEnvelope**](AccountGroupDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **200** | OK |  -  |

<a id="getAccountGroupsCountAsync"></a>
# **getAccountGroupsCountAsync**
> Int32Envelope getAccountGroupsCountAsync(tenantId, apiVersion, xApiVersion)

Gets the current tenant accounts count

Get the currently acting tenant accounts count.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AccountGroupsApi apiInstance = new AccountGroupsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getAccountGroupsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountGroupsApi#getAccountGroupsCountAsync");
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

<a id="updateAccountGroup"></a>
# **updateAccountGroup**
> AccountGroupDtoEnvelope updateAccountGroup(tenantId, accountGroupId, apiVersion, xApiVersion, accountGroupUpdateDto)

Updates an existing account group

Updates an existing account group.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    AccountGroupsApi apiInstance = new AccountGroupsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID accountGroupId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    AccountGroupUpdateDto accountGroupUpdateDto = new AccountGroupUpdateDto(); // AccountGroupUpdateDto | 
    try {
      AccountGroupDtoEnvelope result = apiInstance.updateAccountGroup(tenantId, accountGroupId, apiVersion, xApiVersion, accountGroupUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountGroupsApi#updateAccountGroup");
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
| **accountGroupId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **accountGroupUpdateDto** | [**AccountGroupUpdateDto**](AccountGroupUpdateDto.md)|  | [optional] |

### Return type

[**AccountGroupDtoEnvelope**](AccountGroupDtoEnvelope.md)

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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

