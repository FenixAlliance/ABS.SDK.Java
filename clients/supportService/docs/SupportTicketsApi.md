# SupportTicketsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSupportTicketAsync**](SupportTicketsApi.md#createSupportTicketAsync) | **POST** /api/v2/SupportService/SupportTickets | Create a new support ticket |
| [**deleteSupportTicketAsync**](SupportTicketsApi.md#deleteSupportTicketAsync) | **DELETE** /api/v2/SupportService/SupportTickets/{supportTicketId} | Delete a support ticket |
| [**deleteSupportTicketConversationAsync**](SupportTicketsApi.md#deleteSupportTicketConversationAsync) | **DELETE** /api/v2/SupportService/SupportTickets/{supportTicketId}/Conversations/{supportTicketConversationId} | Delete a conversation from a support ticket |
| [**getSupportTicketAsync**](SupportTicketsApi.md#getSupportTicketAsync) | **GET** /api/v2/SupportService/SupportTickets/{supportTicketId} | Retrieve a support ticket by ID |
| [**getSupportTicketConversationAsync**](SupportTicketsApi.md#getSupportTicketConversationAsync) | **GET** /api/v2/SupportService/SupportTickets/{supportTicketId}/Conversations/{supportTicketConversationId} | Retrieve a specific conversation for a support ticket |
| [**getSupportTicketConversationMessagesAsync**](SupportTicketsApi.md#getSupportTicketConversationMessagesAsync) | **GET** /api/v2/SupportService/SupportTickets/{supportTicketId}/Conversations/{supportTicketConversationId}/Messages | Retrieve messages for a support ticket conversation |
| [**getSupportTicketConversationsAsync**](SupportTicketsApi.md#getSupportTicketConversationsAsync) | **GET** /api/v2/SupportService/SupportTickets/{supportTicketId}/Conversations | Retrieve conversations for a support ticket |
| [**getSupportTicketsAsync**](SupportTicketsApi.md#getSupportTicketsAsync) | **GET** /api/v2/SupportService/SupportTickets | Retrieve a list of support tickets |
| [**getSupportTicketsCountAsync**](SupportTicketsApi.md#getSupportTicketsCountAsync) | **GET** /api/v2/SupportService/SupportTickets/Count | Get the count of support tickets |
| [**relateSupportTicketToConversationAsync**](SupportTicketsApi.md#relateSupportTicketToConversationAsync) | **POST** /api/v2/SupportService/SupportTickets/{supportTicketId}/Conversations | Create a conversation for a support ticket |
| [**updateSupportTicketAsync**](SupportTicketsApi.md#updateSupportTicketAsync) | **PUT** /api/v2/SupportService/SupportTickets/{supportTicketId} | Update a support ticket |


<a id="createSupportTicketAsync"></a>
# **createSupportTicketAsync**
> EmptyEnvelope createSupportTicketAsync(tenantId, apiVersion, xApiVersion, supportTicketCreateDto)

Create a new support ticket

Creates a new support ticket for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportTicketsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SupportTicketsApi apiInstance = new SupportTicketsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SupportTicketCreateDto supportTicketCreateDto = new SupportTicketCreateDto(); // SupportTicketCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createSupportTicketAsync(tenantId, apiVersion, xApiVersion, supportTicketCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportTicketsApi#createSupportTicketAsync");
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
| **supportTicketCreateDto** | [**SupportTicketCreateDto**](SupportTicketCreateDto.md)|  | [optional] |

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

<a id="deleteSupportTicketAsync"></a>
# **deleteSupportTicketAsync**
> EmptyEnvelope deleteSupportTicketAsync(tenantId, supportTicketId, apiVersion, xApiVersion)

Delete a support ticket

Deletes a support ticket by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportTicketsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SupportTicketsApi apiInstance = new SupportTicketsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID supportTicketId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteSupportTicketAsync(tenantId, supportTicketId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportTicketsApi#deleteSupportTicketAsync");
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
| **supportTicketId** | **UUID**|  | |
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

<a id="deleteSupportTicketConversationAsync"></a>
# **deleteSupportTicketConversationAsync**
> EmptyEnvelope deleteSupportTicketConversationAsync(tenantId, supportTicketId, supportTicketConversationId, apiVersion, xApiVersion)

Delete a conversation from a support ticket

Deletes a specific conversation from a support ticket.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportTicketsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SupportTicketsApi apiInstance = new SupportTicketsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID supportTicketId = UUID.randomUUID(); // UUID | 
    UUID supportTicketConversationId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteSupportTicketConversationAsync(tenantId, supportTicketId, supportTicketConversationId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportTicketsApi#deleteSupportTicketConversationAsync");
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
| **supportTicketId** | **UUID**|  | |
| **supportTicketConversationId** | **UUID**|  | |
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

<a id="getSupportTicketAsync"></a>
# **getSupportTicketAsync**
> SupportTicketDtoEnvelope getSupportTicketAsync(tenantId, supportTicketId, apiVersion, xApiVersion)

Retrieve a support ticket by ID

Retrieves a single support ticket by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportTicketsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SupportTicketsApi apiInstance = new SupportTicketsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID supportTicketId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SupportTicketDtoEnvelope result = apiInstance.getSupportTicketAsync(tenantId, supportTicketId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportTicketsApi#getSupportTicketAsync");
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
| **supportTicketId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**SupportTicketDtoEnvelope**](SupportTicketDtoEnvelope.md)

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

<a id="getSupportTicketConversationAsync"></a>
# **getSupportTicketConversationAsync**
> SupportTicketConversationDtoEnvelope getSupportTicketConversationAsync(tenantId, supportTicketId, supportTicketConversationId, apiVersion, xApiVersion)

Retrieve a specific conversation for a support ticket

Retrieves a single conversation by its ID for a specific support ticket.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportTicketsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SupportTicketsApi apiInstance = new SupportTicketsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID supportTicketId = UUID.randomUUID(); // UUID | 
    UUID supportTicketConversationId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SupportTicketConversationDtoEnvelope result = apiInstance.getSupportTicketConversationAsync(tenantId, supportTicketId, supportTicketConversationId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportTicketsApi#getSupportTicketConversationAsync");
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
| **supportTicketId** | **UUID**|  | |
| **supportTicketConversationId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**SupportTicketConversationDtoEnvelope**](SupportTicketConversationDtoEnvelope.md)

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

<a id="getSupportTicketConversationMessagesAsync"></a>
# **getSupportTicketConversationMessagesAsync**
> PrivateMessageDtoListEnvelope getSupportTicketConversationMessagesAsync(tenantId, supportTicketId, supportTicketConversationId, pageNumber, pageSize, apiVersion, xApiVersion)

Retrieve messages for a support ticket conversation

Retrieves the list of messages within a specific conversation of a support ticket.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportTicketsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SupportTicketsApi apiInstance = new SupportTicketsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID supportTicketId = UUID.randomUUID(); // UUID | 
    UUID supportTicketConversationId = UUID.randomUUID(); // UUID | 
    Integer pageNumber = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      PrivateMessageDtoListEnvelope result = apiInstance.getSupportTicketConversationMessagesAsync(tenantId, supportTicketId, supportTicketConversationId, pageNumber, pageSize, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportTicketsApi#getSupportTicketConversationMessagesAsync");
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
| **supportTicketId** | **UUID**|  | |
| **supportTicketConversationId** | **UUID**|  | |
| **pageNumber** | **Integer**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**PrivateMessageDtoListEnvelope**](PrivateMessageDtoListEnvelope.md)

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

<a id="getSupportTicketConversationsAsync"></a>
# **getSupportTicketConversationsAsync**
> SupportTicketConversationDtoListEnvelope getSupportTicketConversationsAsync(tenantId, supportTicketId, apiVersion, xApiVersion)

Retrieve conversations for a support ticket

Retrieves the list of conversations associated with a specific support ticket.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportTicketsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SupportTicketsApi apiInstance = new SupportTicketsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID supportTicketId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SupportTicketConversationDtoListEnvelope result = apiInstance.getSupportTicketConversationsAsync(tenantId, supportTicketId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportTicketsApi#getSupportTicketConversationsAsync");
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
| **supportTicketId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**SupportTicketConversationDtoListEnvelope**](SupportTicketConversationDtoListEnvelope.md)

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

<a id="getSupportTicketsAsync"></a>
# **getSupportTicketsAsync**
> SupportTicketDtoListEnvelope getSupportTicketsAsync(tenantId, apiVersion, xApiVersion)

Retrieve a list of support tickets

Retrieves a list of support tickets for the specified tenant with OData query support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportTicketsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SupportTicketsApi apiInstance = new SupportTicketsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SupportTicketDtoListEnvelope result = apiInstance.getSupportTicketsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportTicketsApi#getSupportTicketsAsync");
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

[**SupportTicketDtoListEnvelope**](SupportTicketDtoListEnvelope.md)

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

<a id="getSupportTicketsCountAsync"></a>
# **getSupportTicketsCountAsync**
> Int32Envelope getSupportTicketsCountAsync(tenantId, apiVersion, xApiVersion)

Get the count of support tickets

Returns the total count of support tickets for the specified tenant with OData query support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportTicketsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SupportTicketsApi apiInstance = new SupportTicketsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getSupportTicketsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportTicketsApi#getSupportTicketsCountAsync");
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

<a id="relateSupportTicketToConversationAsync"></a>
# **relateSupportTicketToConversationAsync**
> EmptyEnvelope relateSupportTicketToConversationAsync(tenantId, supportTicketId, apiVersion, xApiVersion, supportTicketConversationCreateDto)

Create a conversation for a support ticket

Creates a new conversation and associates it with the specified support ticket.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportTicketsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SupportTicketsApi apiInstance = new SupportTicketsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID supportTicketId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SupportTicketConversationCreateDto supportTicketConversationCreateDto = new SupportTicketConversationCreateDto(); // SupportTicketConversationCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.relateSupportTicketToConversationAsync(tenantId, supportTicketId, apiVersion, xApiVersion, supportTicketConversationCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportTicketsApi#relateSupportTicketToConversationAsync");
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
| **supportTicketId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **supportTicketConversationCreateDto** | [**SupportTicketConversationCreateDto**](SupportTicketConversationCreateDto.md)|  | [optional] |

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

<a id="updateSupportTicketAsync"></a>
# **updateSupportTicketAsync**
> EmptyEnvelope updateSupportTicketAsync(tenantId, supportTicketId, apiVersion, xApiVersion, supportTicketUpdateDto)

Update a support ticket

Updates an existing support ticket by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportTicketsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SupportTicketsApi apiInstance = new SupportTicketsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID supportTicketId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SupportTicketUpdateDto supportTicketUpdateDto = new SupportTicketUpdateDto(); // SupportTicketUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateSupportTicketAsync(tenantId, supportTicketId, apiVersion, xApiVersion, supportTicketUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportTicketsApi#updateSupportTicketAsync");
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
| **supportTicketId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **supportTicketUpdateDto** | [**SupportTicketUpdateDto**](SupportTicketUpdateDto.md)|  | [optional] |

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

