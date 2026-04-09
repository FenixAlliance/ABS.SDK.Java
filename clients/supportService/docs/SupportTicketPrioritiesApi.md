# SupportTicketPrioritiesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSupportTicketPriorityAsync**](SupportTicketPrioritiesApi.md#createSupportTicketPriorityAsync) | **POST** /api/v2/SupportService/SupportTicketPriorities | Create a new support ticket priority |
| [**deleteSupportTicketPriorityAsync**](SupportTicketPrioritiesApi.md#deleteSupportTicketPriorityAsync) | **DELETE** /api/v2/SupportService/SupportTicketPriorities/{supportTicketPriorityId} | Delete a support ticket priority |
| [**getSupportTicketPrioritiesAsync**](SupportTicketPrioritiesApi.md#getSupportTicketPrioritiesAsync) | **GET** /api/v2/SupportService/SupportTicketPriorities | Retrieve a list of support ticket priorities |
| [**getSupportTicketPrioritiesCountAsync**](SupportTicketPrioritiesApi.md#getSupportTicketPrioritiesCountAsync) | **GET** /api/v2/SupportService/SupportTicketPriorities/Count | Get the count of support ticket priorities |
| [**getSupportTicketPriorityAsync**](SupportTicketPrioritiesApi.md#getSupportTicketPriorityAsync) | **GET** /api/v2/SupportService/SupportTicketPriorities/{supportTicketPriorityId} | Retrieve a support ticket priority by ID |
| [**updateSupportTicketPriorityAsync**](SupportTicketPrioritiesApi.md#updateSupportTicketPriorityAsync) | **PUT** /api/v2/SupportService/SupportTicketPriorities/{supportTicketPriorityId} | Update a support ticket priority |


<a id="createSupportTicketPriorityAsync"></a>
# **createSupportTicketPriorityAsync**
> EmptyEnvelope createSupportTicketPriorityAsync(tenantId, apiVersion, xApiVersion, supportTicketPriorityCreateDto)

Create a new support ticket priority

Creates a new support ticket priority for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportTicketPrioritiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SupportTicketPrioritiesApi apiInstance = new SupportTicketPrioritiesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SupportTicketPriorityCreateDto supportTicketPriorityCreateDto = new SupportTicketPriorityCreateDto(); // SupportTicketPriorityCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createSupportTicketPriorityAsync(tenantId, apiVersion, xApiVersion, supportTicketPriorityCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportTicketPrioritiesApi#createSupportTicketPriorityAsync");
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
| **supportTicketPriorityCreateDto** | [**SupportTicketPriorityCreateDto**](SupportTicketPriorityCreateDto.md)|  | [optional] |

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

<a id="deleteSupportTicketPriorityAsync"></a>
# **deleteSupportTicketPriorityAsync**
> EmptyEnvelope deleteSupportTicketPriorityAsync(tenantId, supportTicketPriorityId, apiVersion, xApiVersion)

Delete a support ticket priority

Deletes a support ticket priority by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportTicketPrioritiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SupportTicketPrioritiesApi apiInstance = new SupportTicketPrioritiesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID supportTicketPriorityId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteSupportTicketPriorityAsync(tenantId, supportTicketPriorityId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportTicketPrioritiesApi#deleteSupportTicketPriorityAsync");
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
| **supportTicketPriorityId** | **UUID**|  | |
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

<a id="getSupportTicketPrioritiesAsync"></a>
# **getSupportTicketPrioritiesAsync**
> SupportTicketPriorityDtoListEnvelope getSupportTicketPrioritiesAsync(tenantId, apiVersion, xApiVersion)

Retrieve a list of support ticket priorities

Retrieves a list of support ticket priorities for the specified tenant with OData query support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportTicketPrioritiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SupportTicketPrioritiesApi apiInstance = new SupportTicketPrioritiesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SupportTicketPriorityDtoListEnvelope result = apiInstance.getSupportTicketPrioritiesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportTicketPrioritiesApi#getSupportTicketPrioritiesAsync");
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

[**SupportTicketPriorityDtoListEnvelope**](SupportTicketPriorityDtoListEnvelope.md)

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

<a id="getSupportTicketPrioritiesCountAsync"></a>
# **getSupportTicketPrioritiesCountAsync**
> Int32Envelope getSupportTicketPrioritiesCountAsync(tenantId, apiVersion, xApiVersion)

Get the count of support ticket priorities

Returns the total count of support ticket priorities for the specified tenant with OData query support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportTicketPrioritiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SupportTicketPrioritiesApi apiInstance = new SupportTicketPrioritiesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getSupportTicketPrioritiesCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportTicketPrioritiesApi#getSupportTicketPrioritiesCountAsync");
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

<a id="getSupportTicketPriorityAsync"></a>
# **getSupportTicketPriorityAsync**
> SupportTicketPriorityDtoEnvelope getSupportTicketPriorityAsync(tenantId, supportTicketPriorityId, apiVersion, xApiVersion)

Retrieve a support ticket priority by ID

Retrieves a single support ticket priority by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportTicketPrioritiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SupportTicketPrioritiesApi apiInstance = new SupportTicketPrioritiesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID supportTicketPriorityId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SupportTicketPriorityDtoEnvelope result = apiInstance.getSupportTicketPriorityAsync(tenantId, supportTicketPriorityId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportTicketPrioritiesApi#getSupportTicketPriorityAsync");
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
| **supportTicketPriorityId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**SupportTicketPriorityDtoEnvelope**](SupportTicketPriorityDtoEnvelope.md)

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

<a id="updateSupportTicketPriorityAsync"></a>
# **updateSupportTicketPriorityAsync**
> EmptyEnvelope updateSupportTicketPriorityAsync(tenantId, supportTicketPriorityId, apiVersion, xApiVersion, supportTicketPriorityUpdateDto)

Update a support ticket priority

Updates an existing support ticket priority by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportTicketPrioritiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SupportTicketPrioritiesApi apiInstance = new SupportTicketPrioritiesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID supportTicketPriorityId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SupportTicketPriorityUpdateDto supportTicketPriorityUpdateDto = new SupportTicketPriorityUpdateDto(); // SupportTicketPriorityUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateSupportTicketPriorityAsync(tenantId, supportTicketPriorityId, apiVersion, xApiVersion, supportTicketPriorityUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportTicketPrioritiesApi#updateSupportTicketPriorityAsync");
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
| **supportTicketPriorityId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **supportTicketPriorityUpdateDto** | [**SupportTicketPriorityUpdateDto**](SupportTicketPriorityUpdateDto.md)|  | [optional] |

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

