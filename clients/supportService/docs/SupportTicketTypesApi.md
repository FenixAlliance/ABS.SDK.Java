# SupportTicketTypesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSupportTicketTypeAsync**](SupportTicketTypesApi.md#createSupportTicketTypeAsync) | **POST** /api/v2/SupportService/SupportTicketTypes | Create a new support ticket type |
| [**deleteSupportTicketTypeAsync**](SupportTicketTypesApi.md#deleteSupportTicketTypeAsync) | **DELETE** /api/v2/SupportService/SupportTicketTypes/{supportTicketTypeId} | Delete a support ticket type |
| [**getSupportTicketTypeAsync**](SupportTicketTypesApi.md#getSupportTicketTypeAsync) | **GET** /api/v2/SupportService/SupportTicketTypes/{supportTicketTypeId} | Retrieve a support ticket type by ID |
| [**getSupportTicketTypesAsync**](SupportTicketTypesApi.md#getSupportTicketTypesAsync) | **GET** /api/v2/SupportService/SupportTicketTypes | Retrieve a list of support ticket types |
| [**getSupportTicketTypesCountAsync**](SupportTicketTypesApi.md#getSupportTicketTypesCountAsync) | **GET** /api/v2/SupportService/SupportTicketTypes/Count | Get the count of support ticket types |
| [**updateSupportTicketTypeAsync**](SupportTicketTypesApi.md#updateSupportTicketTypeAsync) | **PUT** /api/v2/SupportService/SupportTicketTypes/{supportTicketTypeId} | Update a support ticket type |


<a id="createSupportTicketTypeAsync"></a>
# **createSupportTicketTypeAsync**
> EmptyEnvelope createSupportTicketTypeAsync(tenantId, apiVersion, xApiVersion, supportTicketTypeCreateDto)

Create a new support ticket type

Creates a new support ticket type for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportTicketTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SupportTicketTypesApi apiInstance = new SupportTicketTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SupportTicketTypeCreateDto supportTicketTypeCreateDto = new SupportTicketTypeCreateDto(); // SupportTicketTypeCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createSupportTicketTypeAsync(tenantId, apiVersion, xApiVersion, supportTicketTypeCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportTicketTypesApi#createSupportTicketTypeAsync");
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
| **supportTicketTypeCreateDto** | [**SupportTicketTypeCreateDto**](SupportTicketTypeCreateDto.md)|  | [optional] |

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

<a id="deleteSupportTicketTypeAsync"></a>
# **deleteSupportTicketTypeAsync**
> EmptyEnvelope deleteSupportTicketTypeAsync(tenantId, supportTicketTypeId, apiVersion, xApiVersion)

Delete a support ticket type

Deletes a support ticket type by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportTicketTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SupportTicketTypesApi apiInstance = new SupportTicketTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID supportTicketTypeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteSupportTicketTypeAsync(tenantId, supportTicketTypeId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportTicketTypesApi#deleteSupportTicketTypeAsync");
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
| **supportTicketTypeId** | **UUID**|  | |
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

<a id="getSupportTicketTypeAsync"></a>
# **getSupportTicketTypeAsync**
> SupportTicketTypeDtoEnvelope getSupportTicketTypeAsync(tenantId, supportTicketTypeId, apiVersion, xApiVersion)

Retrieve a support ticket type by ID

Retrieves a single support ticket type by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportTicketTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SupportTicketTypesApi apiInstance = new SupportTicketTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID supportTicketTypeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SupportTicketTypeDtoEnvelope result = apiInstance.getSupportTicketTypeAsync(tenantId, supportTicketTypeId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportTicketTypesApi#getSupportTicketTypeAsync");
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
| **supportTicketTypeId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**SupportTicketTypeDtoEnvelope**](SupportTicketTypeDtoEnvelope.md)

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

<a id="getSupportTicketTypesAsync"></a>
# **getSupportTicketTypesAsync**
> SupportTicketTypeDtoListEnvelope getSupportTicketTypesAsync(tenantId, apiVersion, xApiVersion)

Retrieve a list of support ticket types

Retrieves a list of support ticket types for the specified tenant with OData query support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportTicketTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SupportTicketTypesApi apiInstance = new SupportTicketTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SupportTicketTypeDtoListEnvelope result = apiInstance.getSupportTicketTypesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportTicketTypesApi#getSupportTicketTypesAsync");
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

[**SupportTicketTypeDtoListEnvelope**](SupportTicketTypeDtoListEnvelope.md)

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

<a id="getSupportTicketTypesCountAsync"></a>
# **getSupportTicketTypesCountAsync**
> Int32Envelope getSupportTicketTypesCountAsync(tenantId, apiVersion, xApiVersion)

Get the count of support ticket types

Returns the total count of support ticket types for the specified tenant with OData query support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportTicketTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SupportTicketTypesApi apiInstance = new SupportTicketTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getSupportTicketTypesCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportTicketTypesApi#getSupportTicketTypesCountAsync");
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

<a id="updateSupportTicketTypeAsync"></a>
# **updateSupportTicketTypeAsync**
> EmptyEnvelope updateSupportTicketTypeAsync(tenantId, supportTicketTypeId, apiVersion, xApiVersion, supportTicketTypeUpdateDto)

Update a support ticket type

Updates an existing support ticket type by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportTicketTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SupportTicketTypesApi apiInstance = new SupportTicketTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID supportTicketTypeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SupportTicketTypeUpdateDto supportTicketTypeUpdateDto = new SupportTicketTypeUpdateDto(); // SupportTicketTypeUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateSupportTicketTypeAsync(tenantId, supportTicketTypeId, apiVersion, xApiVersion, supportTicketTypeUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportTicketTypesApi#updateSupportTicketTypeAsync");
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
| **supportTicketTypeId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **supportTicketTypeUpdateDto** | [**SupportTicketTypeUpdateDto**](SupportTicketTypeUpdateDto.md)|  | [optional] |

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

