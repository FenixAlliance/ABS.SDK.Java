# EmailsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**adminPreviewBasicEmailTemplate**](EmailsApi.md#adminPreviewBasicEmailTemplate) | **POST** /api/v2/SystemService/Emails/Preview | Preview a rendered basic email template. |
| [**adminSendBasicEmail**](EmailsApi.md#adminSendBasicEmail) | **POST** /api/v2/SystemService/Emails/SendBasic | Send a basic transactional email to recipients. |


<a id="adminPreviewBasicEmailTemplate"></a>
# **adminPreviewBasicEmailTemplate**
> adminPreviewBasicEmailTemplate(apiVersion, xApiVersion, objectEmailDispatchRequest)

Preview a rendered basic email template.

This action is only available for global administrators (business_owner role).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmailsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    EmailsApi apiInstance = new EmailsApi(defaultClient);
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ObjectEmailDispatchRequest objectEmailDispatchRequest = new ObjectEmailDispatchRequest(); // ObjectEmailDispatchRequest | 
    try {
      apiInstance.adminPreviewBasicEmailTemplate(apiVersion, xApiVersion, objectEmailDispatchRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailsApi#adminPreviewBasicEmailTemplate");
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
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **objectEmailDispatchRequest** | [**ObjectEmailDispatchRequest**](ObjectEmailDispatchRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="adminSendBasicEmail"></a>
# **adminSendBasicEmail**
> TenantDtoListEnvelope adminSendBasicEmail(apiVersion, xApiVersion, objectEmailDispatchRequest)

Send a basic transactional email to recipients.

This action is only available for global administrators (business_owner role).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmailsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    EmailsApi apiInstance = new EmailsApi(defaultClient);
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ObjectEmailDispatchRequest objectEmailDispatchRequest = new ObjectEmailDispatchRequest(); // ObjectEmailDispatchRequest | 
    try {
      TenantDtoListEnvelope result = apiInstance.adminSendBasicEmail(apiVersion, xApiVersion, objectEmailDispatchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailsApi#adminSendBasicEmail");
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
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **objectEmailDispatchRequest** | [**ObjectEmailDispatchRequest**](ObjectEmailDispatchRequest.md)|  | [optional] |

### Return type

[**TenantDtoListEnvelope**](TenantDtoListEnvelope.md)

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

