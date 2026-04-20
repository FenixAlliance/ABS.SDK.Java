# SupportRequestsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSupportRequestAsync**](SupportRequestsApi.md#createSupportRequestAsync) | **POST** /api/v2/SupportService/SupportRequests | Create a new support request |
| [**deleteSupportRequestAsync**](SupportRequestsApi.md#deleteSupportRequestAsync) | **DELETE** /api/v2/SupportService/SupportRequests/{supportRequestId} | Delete a support request |
| [**getSupportRequestAsync**](SupportRequestsApi.md#getSupportRequestAsync) | **GET** /api/v2/SupportService/SupportRequests/{supportRequestId} | Retrieve a support request by ID |
| [**getSupportRequestAttachmentByRequest**](SupportRequestsApi.md#getSupportRequestAttachmentByRequest) | **GET** /api/v2/SupportService/SupportRequests/{supportRequestId}/Attachments/{attachmentId} | Retrieve a specific attachment for a support request |
| [**getSupportRequestAttachmentsByRequest**](SupportRequestsApi.md#getSupportRequestAttachmentsByRequest) | **GET** /api/v2/SupportService/SupportRequests/{supportRequestId}/Attachments | Retrieve attachments for a support request |
| [**getSupportRequestAttachmentsCountByRequest**](SupportRequestsApi.md#getSupportRequestAttachmentsCountByRequest) | **GET** /api/v2/SupportService/SupportRequests/{supportRequestId}/Attachments/Count | Get the count of attachments for a support request |
| [**getSupportRequestTicketsAsync**](SupportRequestsApi.md#getSupportRequestTicketsAsync) | **GET** /api/v2/SupportService/SupportRequests/{supportRequestId}/Tickets | Retrieve tickets for a support request |
| [**getSupportRequestsAsync**](SupportRequestsApi.md#getSupportRequestsAsync) | **GET** /api/v2/SupportService/SupportRequests | Retrieve a list of support requests |
| [**getSupportRequestsCountAsync**](SupportRequestsApi.md#getSupportRequestsCountAsync) | **GET** /api/v2/SupportService/SupportRequests/Count | Get the count of support requests |
| [**relateSupportRequestToAttachmentAsync**](SupportRequestsApi.md#relateSupportRequestToAttachmentAsync) | **POST** /api/v2/SupportService/SupportRequests/{supportRequestId}/Attachments | Add an attachment to a support request |
| [**updateSupportRequestAsync**](SupportRequestsApi.md#updateSupportRequestAsync) | **PUT** /api/v2/SupportService/SupportRequests/{supportRequestId} | Update a support request |


<a id="createSupportRequestAsync"></a>
# **createSupportRequestAsync**
> EmptyEnvelope createSupportRequestAsync(tenantId, apiVersion, xApiVersion, supportRequestCreateDto)

Create a new support request

Creates a new support request for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SupportRequestsApi apiInstance = new SupportRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SupportRequestCreateDto supportRequestCreateDto = new SupportRequestCreateDto(); // SupportRequestCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createSupportRequestAsync(tenantId, apiVersion, xApiVersion, supportRequestCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportRequestsApi#createSupportRequestAsync");
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
| **supportRequestCreateDto** | [**SupportRequestCreateDto**](SupportRequestCreateDto.md)|  | [optional] |

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

<a id="deleteSupportRequestAsync"></a>
# **deleteSupportRequestAsync**
> EmptyEnvelope deleteSupportRequestAsync(tenantId, supportRequestId, apiVersion, xApiVersion)

Delete a support request

Deletes a support request by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SupportRequestsApi apiInstance = new SupportRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID supportRequestId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteSupportRequestAsync(tenantId, supportRequestId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportRequestsApi#deleteSupportRequestAsync");
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
| **supportRequestId** | **UUID**|  | |
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

<a id="getSupportRequestAsync"></a>
# **getSupportRequestAsync**
> SupportRequestDtoEnvelope getSupportRequestAsync(tenantId, supportRequestId, apiVersion, xApiVersion)

Retrieve a support request by ID

Retrieves a single support request by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SupportRequestsApi apiInstance = new SupportRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID supportRequestId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SupportRequestDtoEnvelope result = apiInstance.getSupportRequestAsync(tenantId, supportRequestId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportRequestsApi#getSupportRequestAsync");
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
| **supportRequestId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**SupportRequestDtoEnvelope**](SupportRequestDtoEnvelope.md)

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

<a id="getSupportRequestAttachmentByRequest"></a>
# **getSupportRequestAttachmentByRequest**
> SupportRequestAttachmentDtoEnvelope getSupportRequestAttachmentByRequest(tenantId, supportRequestId, attachmentId, apiVersion, xApiVersion)

Retrieve a specific attachment for a support request

Retrieves a single attachment by its ID for a specific support request.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SupportRequestsApi apiInstance = new SupportRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID supportRequestId = UUID.randomUUID(); // UUID | 
    UUID attachmentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SupportRequestAttachmentDtoEnvelope result = apiInstance.getSupportRequestAttachmentByRequest(tenantId, supportRequestId, attachmentId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportRequestsApi#getSupportRequestAttachmentByRequest");
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
| **supportRequestId** | **UUID**|  | |
| **attachmentId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**SupportRequestAttachmentDtoEnvelope**](SupportRequestAttachmentDtoEnvelope.md)

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

<a id="getSupportRequestAttachmentsByRequest"></a>
# **getSupportRequestAttachmentsByRequest**
> SupportRequestAttachmentDtoListEnvelope getSupportRequestAttachmentsByRequest(tenantId, supportRequestId, apiVersion, xApiVersion)

Retrieve attachments for a support request

Retrieves the list of attachments associated with a specific support request.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SupportRequestsApi apiInstance = new SupportRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID supportRequestId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SupportRequestAttachmentDtoListEnvelope result = apiInstance.getSupportRequestAttachmentsByRequest(tenantId, supportRequestId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportRequestsApi#getSupportRequestAttachmentsByRequest");
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
| **supportRequestId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**SupportRequestAttachmentDtoListEnvelope**](SupportRequestAttachmentDtoListEnvelope.md)

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

<a id="getSupportRequestAttachmentsCountByRequest"></a>
# **getSupportRequestAttachmentsCountByRequest**
> Int32Envelope getSupportRequestAttachmentsCountByRequest(tenantId, supportRequestId, apiVersion, xApiVersion)

Get the count of attachments for a support request

Returns the total count of attachments for a specific support request.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SupportRequestsApi apiInstance = new SupportRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID supportRequestId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getSupportRequestAttachmentsCountByRequest(tenantId, supportRequestId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportRequestsApi#getSupportRequestAttachmentsCountByRequest");
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
| **supportRequestId** | **UUID**|  | |
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

<a id="getSupportRequestTicketsAsync"></a>
# **getSupportRequestTicketsAsync**
> SupportTicketDtoListEnvelope getSupportRequestTicketsAsync(tenantId, supportRequestId, apiVersion, xApiVersion)

Retrieve tickets for a support request

Retrieves the list of support tickets associated with a specific support request.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SupportRequestsApi apiInstance = new SupportRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID supportRequestId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SupportTicketDtoListEnvelope result = apiInstance.getSupportRequestTicketsAsync(tenantId, supportRequestId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportRequestsApi#getSupportRequestTicketsAsync");
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
| **supportRequestId** | **UUID**|  | |
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

<a id="getSupportRequestsAsync"></a>
# **getSupportRequestsAsync**
> SupportRequestDtoListEnvelope getSupportRequestsAsync(tenantId, apiVersion, xApiVersion)

Retrieve a list of support requests

Retrieves a list of support requests for the specified tenant with OData query support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SupportRequestsApi apiInstance = new SupportRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SupportRequestDtoListEnvelope result = apiInstance.getSupportRequestsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportRequestsApi#getSupportRequestsAsync");
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

[**SupportRequestDtoListEnvelope**](SupportRequestDtoListEnvelope.md)

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

<a id="getSupportRequestsCountAsync"></a>
# **getSupportRequestsCountAsync**
> Int32Envelope getSupportRequestsCountAsync(tenantId, apiVersion, xApiVersion)

Get the count of support requests

Returns the total count of support requests for the specified tenant with OData query support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SupportRequestsApi apiInstance = new SupportRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getSupportRequestsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportRequestsApi#getSupportRequestsCountAsync");
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

<a id="relateSupportRequestToAttachmentAsync"></a>
# **relateSupportRequestToAttachmentAsync**
> EmptyEnvelope relateSupportRequestToAttachmentAsync(tenantId, supportRequestId, apiVersion, xApiVersion, supportRequestAttachmentCreateDto)

Add an attachment to a support request

Creates a new attachment and associates it with the specified support request.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SupportRequestsApi apiInstance = new SupportRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID supportRequestId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SupportRequestAttachmentCreateDto supportRequestAttachmentCreateDto = new SupportRequestAttachmentCreateDto(); // SupportRequestAttachmentCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.relateSupportRequestToAttachmentAsync(tenantId, supportRequestId, apiVersion, xApiVersion, supportRequestAttachmentCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportRequestsApi#relateSupportRequestToAttachmentAsync");
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
| **supportRequestId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **supportRequestAttachmentCreateDto** | [**SupportRequestAttachmentCreateDto**](SupportRequestAttachmentCreateDto.md)|  | [optional] |

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

<a id="updateSupportRequestAsync"></a>
# **updateSupportRequestAsync**
> EmptyEnvelope updateSupportRequestAsync(tenantId, supportRequestId, apiVersion, xApiVersion, supportRequestUpdateDto)

Update a support request

Updates an existing support request by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SupportRequestsApi apiInstance = new SupportRequestsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID supportRequestId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SupportRequestUpdateDto supportRequestUpdateDto = new SupportRequestUpdateDto(); // SupportRequestUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateSupportRequestAsync(tenantId, supportRequestId, apiVersion, xApiVersion, supportRequestUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportRequestsApi#updateSupportRequestAsync");
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
| **supportRequestId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **supportRequestUpdateDto** | [**SupportRequestUpdateDto**](SupportRequestUpdateDto.md)|  | [optional] |

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

