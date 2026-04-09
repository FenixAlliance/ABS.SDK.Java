# OptionsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createContactOption**](OptionsApi.md#createContactOption) | **POST** /api/v2/CrmService/Contacts/{contactId}/Options | Create a new contact option |
| [**deleteContactOption**](OptionsApi.md#deleteContactOption) | **DELETE** /api/v2/CrmService/Contacts/{contactId}/Options/{optionId} | Delete a contact option |
| [**getContactOptionById**](OptionsApi.md#getContactOptionById) | **GET** /api/v2/CrmService/Contacts/{contactId}/Options/{optionId} | Retrieve a single contact option by its ID |
| [**getContactOptionByKey**](OptionsApi.md#getContactOptionByKey) | **GET** /api/v2/CrmService/Contacts/{contactId}/Options/Key/{key} | Retrieve a single contact option by its key |
| [**getContactOptions**](OptionsApi.md#getContactOptions) | **GET** /api/v2/CrmService/Contacts/{contactId}/Options | Retrieve a list of contact options |
| [**getContactOptionsCount**](OptionsApi.md#getContactOptionsCount) | **GET** /api/v2/CrmService/Contacts/{contactId}/Options/Count | Get the count of contact options |
| [**updateContactOption**](OptionsApi.md#updateContactOption) | **PUT** /api/v2/CrmService/Contacts/{contactId}/Options/{optionId} | Update a contact option |
| [**upsertContactOption**](OptionsApi.md#upsertContactOption) | **PUT** /api/v2/CrmService/Contacts/{contactId}/Options/Upsert/{key} | Create or update a contact option by key |


<a id="createContactOption"></a>
# **createContactOption**
> EmptyEnvelope createContactOption(tenantId, contactId, key, portalId, apiVersion, xApiVersion, optionCreateDto)

Create a new contact option

Create a new option for a contact

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    OptionsApi apiInstance = new OptionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID contactId = UUID.randomUUID(); // UUID | 
    String key = "key_example"; // String | 
    UUID portalId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    OptionCreateDto optionCreateDto = new OptionCreateDto(); // OptionCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createContactOption(tenantId, contactId, key, portalId, apiVersion, xApiVersion, optionCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionsApi#createContactOption");
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

<a id="deleteContactOption"></a>
# **deleteContactOption**
> EmptyEnvelope deleteContactOption(tenantId, contactId, optionId, apiVersion, xApiVersion)

Delete a contact option

Delete a contact option

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    OptionsApi apiInstance = new OptionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID contactId = UUID.randomUUID(); // UUID | 
    UUID optionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteContactOption(tenantId, contactId, optionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionsApi#deleteContactOption");
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

<a id="getContactOptionById"></a>
# **getContactOptionById**
> OptionDtoEnvelope getContactOptionById(tenantId, contactId, optionId, apiVersion, xApiVersion)

Retrieve a single contact option by its ID

Retrieve a single contact option by its ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    OptionsApi apiInstance = new OptionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID contactId = UUID.randomUUID(); // UUID | 
    UUID optionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      OptionDtoEnvelope result = apiInstance.getContactOptionById(tenantId, contactId, optionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionsApi#getContactOptionById");
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

<a id="getContactOptionByKey"></a>
# **getContactOptionByKey**
> OptionDtoEnvelope getContactOptionByKey(tenantId, contactId, key, portalId, apiVersion, xApiVersion)

Retrieve a single contact option by its key

Retrieve a single contact option by its key

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    OptionsApi apiInstance = new OptionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID contactId = UUID.randomUUID(); // UUID | 
    String key = "key_example"; // String | 
    UUID portalId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      OptionDtoEnvelope result = apiInstance.getContactOptionByKey(tenantId, contactId, key, portalId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionsApi#getContactOptionByKey");
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
| **contactId** | **UUID**|  | |
| **key** | **String**|  | |
| **portalId** | **UUID**|  | [optional] |
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

<a id="getContactOptions"></a>
# **getContactOptions**
> OptionDtoListEnvelope getContactOptions(tenantId, contactId, portalId, apiVersion, xApiVersion)

Retrieve a list of contact options

Retrieve a list of options for a contact

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    OptionsApi apiInstance = new OptionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID contactId = UUID.randomUUID(); // UUID | 
    UUID portalId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      OptionDtoListEnvelope result = apiInstance.getContactOptions(tenantId, contactId, portalId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionsApi#getContactOptions");
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

<a id="getContactOptionsCount"></a>
# **getContactOptionsCount**
> Int32Envelope getContactOptionsCount(tenantId, contactId, portalId, apiVersion, xApiVersion)

Get the count of contact options

Get the count of options for a contact

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    OptionsApi apiInstance = new OptionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID contactId = UUID.randomUUID(); // UUID | 
    UUID portalId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getContactOptionsCount(tenantId, contactId, portalId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionsApi#getContactOptionsCount");
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

<a id="updateContactOption"></a>
# **updateContactOption**
> EmptyEnvelope updateContactOption(tenantId, contactId, optionId, apiVersion, xApiVersion, optionUpdateDto)

Update a contact option

Update a contact option

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    OptionsApi apiInstance = new OptionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID contactId = UUID.randomUUID(); // UUID | 
    UUID optionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    OptionUpdateDto optionUpdateDto = new OptionUpdateDto(); // OptionUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateContactOption(tenantId, contactId, optionId, apiVersion, xApiVersion, optionUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionsApi#updateContactOption");
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

<a id="upsertContactOption"></a>
# **upsertContactOption**
> EmptyEnvelope upsertContactOption(tenantId, contactId, key, portalId, apiVersion, xApiVersion, optionUpdateDto)

Create or update a contact option by key

Create or update a contact option by key

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    OptionsApi apiInstance = new OptionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID contactId = UUID.randomUUID(); // UUID | 
    String key = "key_example"; // String | 
    UUID portalId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    OptionUpdateDto optionUpdateDto = new OptionUpdateDto(); // OptionUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.upsertContactOption(tenantId, contactId, key, portalId, apiVersion, xApiVersion, optionUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionsApi#upsertContactOption");
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
| **contactId** | **UUID**|  | |
| **key** | **String**|  | |
| **portalId** | **UUID**|  | [optional] |
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

