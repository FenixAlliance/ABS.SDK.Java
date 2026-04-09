# EmailTemplatesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEmailTemplateAsync**](EmailTemplatesApi.md#createEmailTemplateAsync) | **POST** /api/v2/MarketingService/EmailTemplates | Create an email template |
| [**deleteEmailTemplateAsync**](EmailTemplatesApi.md#deleteEmailTemplateAsync) | **DELETE** /api/v2/MarketingService/EmailTemplates/{emailTemplateId} | Delete an email template |
| [**getEmailTemplateDetailsAsync**](EmailTemplatesApi.md#getEmailTemplateDetailsAsync) | **GET** /api/v2/MarketingService/EmailTemplates/{emailTemplateId} | Get email template by ID |
| [**getEmailTemplatesCountAsync**](EmailTemplatesApi.md#getEmailTemplatesCountAsync) | **GET** /api/v2/MarketingService/EmailTemplates/Count | Get email templates count |
| [**getEmailTemplatesODataAsync**](EmailTemplatesApi.md#getEmailTemplatesODataAsync) | **GET** /api/v2/MarketingService/EmailTemplates | Get email templates |
| [**updateEmailTemplateAsync**](EmailTemplatesApi.md#updateEmailTemplateAsync) | **PUT** /api/v2/MarketingService/EmailTemplates/{emailTemplateId} | Update an email template |


<a id="createEmailTemplateAsync"></a>
# **createEmailTemplateAsync**
> EmptyEnvelope createEmailTemplateAsync(tenantId, emailTemplateCreateDto, apiVersion, xApiVersion)

Create an email template

Creates a new email template for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmailTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    EmailTemplatesApi apiInstance = new EmailTemplatesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    EmailTemplateCreateDto emailTemplateCreateDto = new EmailTemplateCreateDto(); // EmailTemplateCreateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.createEmailTemplateAsync(tenantId, emailTemplateCreateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailTemplatesApi#createEmailTemplateAsync");
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
| **emailTemplateCreateDto** | [**EmailTemplateCreateDto**](EmailTemplateCreateDto.md)|  | |
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

<a id="deleteEmailTemplateAsync"></a>
# **deleteEmailTemplateAsync**
> EmptyEnvelope deleteEmailTemplateAsync(tenantId, emailTemplateId, apiVersion, xApiVersion)

Delete an email template

Deletes an email template by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmailTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    EmailTemplatesApi apiInstance = new EmailTemplatesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID emailTemplateId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteEmailTemplateAsync(tenantId, emailTemplateId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailTemplatesApi#deleteEmailTemplateAsync");
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
| **emailTemplateId** | **UUID**|  | |
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

<a id="getEmailTemplateDetailsAsync"></a>
# **getEmailTemplateDetailsAsync**
> EmailTemplateDtoEnvelope getEmailTemplateDetailsAsync(tenantId, emailTemplateId, apiVersion, xApiVersion)

Get email template by ID

Retrieves the details of a specific email template by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmailTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    EmailTemplatesApi apiInstance = new EmailTemplatesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID emailTemplateId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmailTemplateDtoEnvelope result = apiInstance.getEmailTemplateDetailsAsync(tenantId, emailTemplateId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailTemplatesApi#getEmailTemplateDetailsAsync");
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
| **emailTemplateId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**EmailTemplateDtoEnvelope**](EmailTemplateDtoEnvelope.md)

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

<a id="getEmailTemplatesCountAsync"></a>
# **getEmailTemplatesCountAsync**
> Int32Envelope getEmailTemplatesCountAsync(tenantId, apiVersion, xApiVersion)

Get email templates count

Returns the count of email templates for the specified tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmailTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    EmailTemplatesApi apiInstance = new EmailTemplatesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getEmailTemplatesCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailTemplatesApi#getEmailTemplatesCountAsync");
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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

<a id="getEmailTemplatesODataAsync"></a>
# **getEmailTemplatesODataAsync**
> EmailTemplateDtoListEnvelope getEmailTemplatesODataAsync(tenantId, apiVersion, xApiVersion)

Get email templates

Retrieves a collection of email templates for the specified tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmailTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    EmailTemplatesApi apiInstance = new EmailTemplatesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmailTemplateDtoListEnvelope result = apiInstance.getEmailTemplatesODataAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailTemplatesApi#getEmailTemplatesODataAsync");
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

[**EmailTemplateDtoListEnvelope**](EmailTemplateDtoListEnvelope.md)

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

<a id="updateEmailTemplateAsync"></a>
# **updateEmailTemplateAsync**
> EmptyEnvelope updateEmailTemplateAsync(tenantId, emailTemplateId, emailTemplateUpdateDto, apiVersion, xApiVersion)

Update an email template

Updates an existing email template by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmailTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    EmailTemplatesApi apiInstance = new EmailTemplatesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID emailTemplateId = UUID.randomUUID(); // UUID | 
    EmailTemplateUpdateDto emailTemplateUpdateDto = new EmailTemplateUpdateDto(); // EmailTemplateUpdateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.updateEmailTemplateAsync(tenantId, emailTemplateId, emailTemplateUpdateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailTemplatesApi#updateEmailTemplateAsync");
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
| **emailTemplateId** | **UUID**|  | |
| **emailTemplateUpdateDto** | [**EmailTemplateUpdateDto**](EmailTemplateUpdateDto.md)|  | |
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

