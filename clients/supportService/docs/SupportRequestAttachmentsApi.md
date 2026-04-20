# SupportRequestAttachmentsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSupportRequestAttachmentAsync**](SupportRequestAttachmentsApi.md#createSupportRequestAttachmentAsync) | **POST** /api/v2/SupportService/SupportRequestAttachments | Create a new support request attachment |
| [**deleteSupportRequestAttachmentAsync**](SupportRequestAttachmentsApi.md#deleteSupportRequestAttachmentAsync) | **DELETE** /api/v2/SupportService/SupportRequestAttachments/{supportRequestAttachmentId} | Delete a support request attachment |
| [**getSupportRequestAttachmentAsync**](SupportRequestAttachmentsApi.md#getSupportRequestAttachmentAsync) | **GET** /api/v2/SupportService/SupportRequestAttachments/{supportRequestAttachmentId} | Retrieve a support request attachment by ID |
| [**getSupportRequestAttachmentsAsync**](SupportRequestAttachmentsApi.md#getSupportRequestAttachmentsAsync) | **GET** /api/v2/SupportService/SupportRequestAttachments | Retrieve a list of support request attachments |
| [**getSupportRequestAttachmentsCountAsync**](SupportRequestAttachmentsApi.md#getSupportRequestAttachmentsCountAsync) | **GET** /api/v2/SupportService/SupportRequestAttachments/Count | Get the count of support request attachments |
| [**updateSupportRequestAttachmentAsync**](SupportRequestAttachmentsApi.md#updateSupportRequestAttachmentAsync) | **PUT** /api/v2/SupportService/SupportRequestAttachments/{supportRequestAttachmentId} | Update a support request attachment |


<a id="createSupportRequestAttachmentAsync"></a>
# **createSupportRequestAttachmentAsync**
> EmptyEnvelope createSupportRequestAttachmentAsync(tenantId, apiVersion, xApiVersion, supportRequestAttachmentCreateDto)

Create a new support request attachment

Creates a new support request attachment for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportRequestAttachmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SupportRequestAttachmentsApi apiInstance = new SupportRequestAttachmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SupportRequestAttachmentCreateDto supportRequestAttachmentCreateDto = new SupportRequestAttachmentCreateDto(); // SupportRequestAttachmentCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createSupportRequestAttachmentAsync(tenantId, apiVersion, xApiVersion, supportRequestAttachmentCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportRequestAttachmentsApi#createSupportRequestAttachmentAsync");
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

<a id="deleteSupportRequestAttachmentAsync"></a>
# **deleteSupportRequestAttachmentAsync**
> EmptyEnvelope deleteSupportRequestAttachmentAsync(tenantId, supportRequestAttachmentId, apiVersion, xApiVersion)

Delete a support request attachment

Deletes a support request attachment by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportRequestAttachmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SupportRequestAttachmentsApi apiInstance = new SupportRequestAttachmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID supportRequestAttachmentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteSupportRequestAttachmentAsync(tenantId, supportRequestAttachmentId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportRequestAttachmentsApi#deleteSupportRequestAttachmentAsync");
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
| **supportRequestAttachmentId** | **UUID**|  | |
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

<a id="getSupportRequestAttachmentAsync"></a>
# **getSupportRequestAttachmentAsync**
> SupportRequestAttachmentDtoEnvelope getSupportRequestAttachmentAsync(tenantId, supportRequestAttachmentId, apiVersion, xApiVersion)

Retrieve a support request attachment by ID

Retrieves a single support request attachment by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportRequestAttachmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SupportRequestAttachmentsApi apiInstance = new SupportRequestAttachmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID supportRequestAttachmentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SupportRequestAttachmentDtoEnvelope result = apiInstance.getSupportRequestAttachmentAsync(tenantId, supportRequestAttachmentId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportRequestAttachmentsApi#getSupportRequestAttachmentAsync");
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
| **supportRequestAttachmentId** | **UUID**|  | |
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

<a id="getSupportRequestAttachmentsAsync"></a>
# **getSupportRequestAttachmentsAsync**
> SupportRequestAttachmentDtoListEnvelope getSupportRequestAttachmentsAsync(tenantId, apiVersion, xApiVersion)

Retrieve a list of support request attachments

Retrieves a list of support request attachments for the specified tenant with OData query support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportRequestAttachmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SupportRequestAttachmentsApi apiInstance = new SupportRequestAttachmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SupportRequestAttachmentDtoListEnvelope result = apiInstance.getSupportRequestAttachmentsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportRequestAttachmentsApi#getSupportRequestAttachmentsAsync");
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

<a id="getSupportRequestAttachmentsCountAsync"></a>
# **getSupportRequestAttachmentsCountAsync**
> Int32Envelope getSupportRequestAttachmentsCountAsync(tenantId, apiVersion, xApiVersion)

Get the count of support request attachments

Returns the total count of support request attachments for the specified tenant with OData query support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportRequestAttachmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SupportRequestAttachmentsApi apiInstance = new SupportRequestAttachmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getSupportRequestAttachmentsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportRequestAttachmentsApi#getSupportRequestAttachmentsCountAsync");
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

<a id="updateSupportRequestAttachmentAsync"></a>
# **updateSupportRequestAttachmentAsync**
> EmptyEnvelope updateSupportRequestAttachmentAsync(tenantId, supportRequestAttachmentId, apiVersion, xApiVersion, supportRequestAttachmentUpdateDto)

Update a support request attachment

Updates an existing support request attachment by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportRequestAttachmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SupportRequestAttachmentsApi apiInstance = new SupportRequestAttachmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID supportRequestAttachmentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SupportRequestAttachmentUpdateDto supportRequestAttachmentUpdateDto = new SupportRequestAttachmentUpdateDto(); // SupportRequestAttachmentUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateSupportRequestAttachmentAsync(tenantId, supportRequestAttachmentId, apiVersion, xApiVersion, supportRequestAttachmentUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportRequestAttachmentsApi#updateSupportRequestAttachmentAsync");
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
| **supportRequestAttachmentId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **supportRequestAttachmentUpdateDto** | [**SupportRequestAttachmentUpdateDto**](SupportRequestAttachmentUpdateDto.md)|  | [optional] |

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

