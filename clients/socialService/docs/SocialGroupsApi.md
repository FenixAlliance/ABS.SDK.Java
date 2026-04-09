# SocialGroupsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**countSocialGroupsAsync**](SocialGroupsApi.md#countSocialGroupsAsync) | **GET** /api/v2/SocialService/SocialGroups/Count | Count social groups |
| [**createSocialGroupAsync**](SocialGroupsApi.md#createSocialGroupAsync) | **POST** /api/v2/SocialService/SocialGroups | Create a social group |
| [**deleteSocialGroupAsync**](SocialGroupsApi.md#deleteSocialGroupAsync) | **DELETE** /api/v2/SocialService/SocialGroups/{socialGroupId} | Delete a social group |
| [**getSocialGroupByIdAsync**](SocialGroupsApi.md#getSocialGroupByIdAsync) | **GET** /api/v2/SocialService/SocialGroups/{socialGroupId} | Get social group by ID |
| [**getSocialGroupsAsync**](SocialGroupsApi.md#getSocialGroupsAsync) | **GET** /api/v2/SocialService/SocialGroups | Get social groups |
| [**updateSocialGroupAsync**](SocialGroupsApi.md#updateSocialGroupAsync) | **PUT** /api/v2/SocialService/SocialGroups/{socialGroupId} | Update a social group |


<a id="countSocialGroupsAsync"></a>
# **countSocialGroupsAsync**
> Int32Envelope countSocialGroupsAsync(tenantId, apiVersion, xApiVersion)

Count social groups

Counts all social groups for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SocialGroupsApi apiInstance = new SocialGroupsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.countSocialGroupsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialGroupsApi#countSocialGroupsAsync");
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

<a id="createSocialGroupAsync"></a>
# **createSocialGroupAsync**
> EmptyEnvelope createSocialGroupAsync(tenantId, apiVersion, xApiVersion, socialGroupCreateDto)

Create a social group

Creates a new social group for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SocialGroupsApi apiInstance = new SocialGroupsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SocialGroupCreateDto socialGroupCreateDto = new SocialGroupCreateDto(); // SocialGroupCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createSocialGroupAsync(tenantId, apiVersion, xApiVersion, socialGroupCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialGroupsApi#createSocialGroupAsync");
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
| **socialGroupCreateDto** | [**SocialGroupCreateDto**](SocialGroupCreateDto.md)|  | [optional] |

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

<a id="deleteSocialGroupAsync"></a>
# **deleteSocialGroupAsync**
> EmptyEnvelope deleteSocialGroupAsync(tenantId, socialGroupId, apiVersion, xApiVersion)

Delete a social group

Deletes a social group for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SocialGroupsApi apiInstance = new SocialGroupsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID socialGroupId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteSocialGroupAsync(tenantId, socialGroupId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialGroupsApi#deleteSocialGroupAsync");
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
| **socialGroupId** | **UUID**|  | |
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

<a id="getSocialGroupByIdAsync"></a>
# **getSocialGroupByIdAsync**
> SocialGroupDtoEnvelope getSocialGroupByIdAsync(tenantId, socialGroupId, apiVersion, xApiVersion)

Get social group by ID

Retrieves a specific social group by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SocialGroupsApi apiInstance = new SocialGroupsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID socialGroupId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SocialGroupDtoEnvelope result = apiInstance.getSocialGroupByIdAsync(tenantId, socialGroupId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialGroupsApi#getSocialGroupByIdAsync");
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
| **socialGroupId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**SocialGroupDtoEnvelope**](SocialGroupDtoEnvelope.md)

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

<a id="getSocialGroupsAsync"></a>
# **getSocialGroupsAsync**
> SocialGroupDtoListEnvelope getSocialGroupsAsync(tenantId, apiVersion, xApiVersion)

Get social groups

Retrieves all social groups for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SocialGroupsApi apiInstance = new SocialGroupsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SocialGroupDtoListEnvelope result = apiInstance.getSocialGroupsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialGroupsApi#getSocialGroupsAsync");
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

[**SocialGroupDtoListEnvelope**](SocialGroupDtoListEnvelope.md)

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

<a id="updateSocialGroupAsync"></a>
# **updateSocialGroupAsync**
> EmptyEnvelope updateSocialGroupAsync(tenantId, socialGroupId, apiVersion, xApiVersion, socialGroupUpdateDto)

Update a social group

Updates an existing social group for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SocialGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SocialGroupsApi apiInstance = new SocialGroupsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID socialGroupId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SocialGroupUpdateDto socialGroupUpdateDto = new SocialGroupUpdateDto(); // SocialGroupUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateSocialGroupAsync(tenantId, socialGroupId, apiVersion, xApiVersion, socialGroupUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialGroupsApi#updateSocialGroupAsync");
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
| **socialGroupId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **socialGroupUpdateDto** | [**SocialGroupUpdateDto**](SocialGroupUpdateDto.md)|  | [optional] |

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
| **200** | OK |  -  |

