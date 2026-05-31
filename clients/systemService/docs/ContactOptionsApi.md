# ContactOptionsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSystemContactOption**](ContactOptionsApi.md#createSystemContactOption) | **POST** /api/v2/SystemService/Contacts/{contactId}/Options | Create a new contact option (admin) |
| [**deleteSystemContactOption**](ContactOptionsApi.md#deleteSystemContactOption) | **DELETE** /api/v2/SystemService/Contacts/{contactId}/Options/{optionId} | Delete a contact option (admin) |
| [**getSystemContactOptionById**](ContactOptionsApi.md#getSystemContactOptionById) | **GET** /api/v2/SystemService/Contacts/{contactId}/Options/{optionId} | Retrieve a single contact option by its ID (admin) |
| [**getSystemContactOptions**](ContactOptionsApi.md#getSystemContactOptions) | **GET** /api/v2/SystemService/Contacts/{contactId}/Options | Retrieve a list of contact options (admin) |
| [**getSystemContactOptionsCount**](ContactOptionsApi.md#getSystemContactOptionsCount) | **GET** /api/v2/SystemService/Contacts/{contactId}/Options/Count | Get the count of contact options (admin) |
| [**updateSystemContactOption**](ContactOptionsApi.md#updateSystemContactOption) | **PUT** /api/v2/SystemService/Contacts/{contactId}/Options/{optionId} | Update a contact option (admin) |


<a id="createSystemContactOption"></a>
# **createSystemContactOption**
> EmptyEnvelope createSystemContactOption(contactId, key, portalId, apiVersion, xApiVersion, optionCreateDto)

Create a new contact option (admin)

Admin endpoint to create an option for any contact

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactOptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ContactOptionsApi apiInstance = new ContactOptionsApi(defaultClient);
    UUID contactId = UUID.randomUUID(); // UUID | 
    String key = "key_example"; // String | 
    UUID portalId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    OptionCreateDto optionCreateDto = new OptionCreateDto(); // OptionCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createSystemContactOption(contactId, key, portalId, apiVersion, xApiVersion, optionCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactOptionsApi#createSystemContactOption");
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
| **contactId** | **UUID**|  | |
| **key** | **String**|  | |
| **portalId** | **UUID**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **optionCreateDto** | [**OptionCreateDto**](OptionCreateDto.md)|  | [optional] |

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

<a id="deleteSystemContactOption"></a>
# **deleteSystemContactOption**
> EmptyEnvelope deleteSystemContactOption(contactId, optionId, apiVersion, xApiVersion)

Delete a contact option (admin)

Admin endpoint to delete an option for any contact

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactOptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ContactOptionsApi apiInstance = new ContactOptionsApi(defaultClient);
    UUID contactId = UUID.randomUUID(); // UUID | 
    UUID optionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteSystemContactOption(contactId, optionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactOptionsApi#deleteSystemContactOption");
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
| **contactId** | **UUID**|  | |
| **optionId** | **UUID**|  | |
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

<a id="getSystemContactOptionById"></a>
# **getSystemContactOptionById**
> OptionDtoEnvelope getSystemContactOptionById(contactId, optionId, apiVersion, xApiVersion)

Retrieve a single contact option by its ID (admin)

Admin endpoint to retrieve a single option for any contact

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactOptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ContactOptionsApi apiInstance = new ContactOptionsApi(defaultClient);
    UUID contactId = UUID.randomUUID(); // UUID | 
    UUID optionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      OptionDtoEnvelope result = apiInstance.getSystemContactOptionById(contactId, optionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactOptionsApi#getSystemContactOptionById");
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
| **contactId** | **UUID**|  | |
| **optionId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**OptionDtoEnvelope**](OptionDtoEnvelope.md)

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

<a id="getSystemContactOptions"></a>
# **getSystemContactOptions**
> OptionDtoListEnvelope getSystemContactOptions(contactId, portalId, apiVersion, xApiVersion)

Retrieve a list of contact options (admin)

Admin endpoint to retrieve options for any contact

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactOptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ContactOptionsApi apiInstance = new ContactOptionsApi(defaultClient);
    UUID contactId = UUID.randomUUID(); // UUID | 
    UUID portalId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      OptionDtoListEnvelope result = apiInstance.getSystemContactOptions(contactId, portalId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactOptionsApi#getSystemContactOptions");
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
| **contactId** | **UUID**|  | |
| **portalId** | **UUID**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**OptionDtoListEnvelope**](OptionDtoListEnvelope.md)

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

<a id="getSystemContactOptionsCount"></a>
# **getSystemContactOptionsCount**
> Int32Envelope getSystemContactOptionsCount(contactId, portalId, apiVersion, xApiVersion)

Get the count of contact options (admin)

Admin endpoint to get the count of options for any contact

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactOptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ContactOptionsApi apiInstance = new ContactOptionsApi(defaultClient);
    UUID contactId = UUID.randomUUID(); // UUID | 
    UUID portalId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getSystemContactOptionsCount(contactId, portalId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactOptionsApi#getSystemContactOptionsCount");
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
| **contactId** | **UUID**|  | |
| **portalId** | **UUID**|  | [optional] |
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

<a id="updateSystemContactOption"></a>
# **updateSystemContactOption**
> EmptyEnvelope updateSystemContactOption(contactId, optionId, apiVersion, xApiVersion, optionUpdateDto)

Update a contact option (admin)

Admin endpoint to update an option for any contact

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactOptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ContactOptionsApi apiInstance = new ContactOptionsApi(defaultClient);
    UUID contactId = UUID.randomUUID(); // UUID | 
    UUID optionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    OptionUpdateDto optionUpdateDto = new OptionUpdateDto(); // OptionUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateSystemContactOption(contactId, optionId, apiVersion, xApiVersion, optionUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactOptionsApi#updateSystemContactOption");
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
| **contactId** | **UUID**|  | |
| **optionId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **optionUpdateDto** | [**OptionUpdateDto**](OptionUpdateDto.md)|  | [optional] |

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

