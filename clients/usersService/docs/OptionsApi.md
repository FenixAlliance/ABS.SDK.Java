# OptionsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createUserOption**](OptionsApi.md#createUserOption) | **POST** /api/v2/Me/Options | Create a new user option |
| [**deleteUserOption**](OptionsApi.md#deleteUserOption) | **DELETE** /api/v2/Me/Options/{optionId} | Delete a user option |
| [**getUserOptionById**](OptionsApi.md#getUserOptionById) | **GET** /api/v2/Me/Options/{optionId} | Retrieve a single user option by its ID |
| [**getUserOptionByKey**](OptionsApi.md#getUserOptionByKey) | **GET** /api/v2/Me/Options/Key/{key} | Retrieve a single user option by its key |
| [**getUserOptions**](OptionsApi.md#getUserOptions) | **GET** /api/v2/Me/Options | Retrieve a list of user options |
| [**getUserOptionsCount**](OptionsApi.md#getUserOptionsCount) | **GET** /api/v2/Me/Options/Count | Get the count of user options |
| [**updateUserOption**](OptionsApi.md#updateUserOption) | **PUT** /api/v2/Me/Options/{optionId} | Update a user option |
| [**upsertUserOption**](OptionsApi.md#upsertUserOption) | **PUT** /api/v2/Me/Options/Upsert/{key} | Create or update a user option by key |


<a id="createUserOption"></a>
# **createUserOption**
> EmptyEnvelope createUserOption(key, portalId, apiVersion, xApiVersion, optionCreateDto)

Create a new user option

Create a new option for the current user

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
    defaultClient.setBasePath("https://absuite.net");

    OptionsApi apiInstance = new OptionsApi(defaultClient);
    String key = "key_example"; // String | 
    UUID portalId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    OptionCreateDto optionCreateDto = new OptionCreateDto(); // OptionCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createUserOption(key, portalId, apiVersion, xApiVersion, optionCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionsApi#createUserOption");
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

<a id="deleteUserOption"></a>
# **deleteUserOption**
> EmptyEnvelope deleteUserOption(optionId, apiVersion, xApiVersion)

Delete a user option

Delete a user option

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
    defaultClient.setBasePath("https://absuite.net");

    OptionsApi apiInstance = new OptionsApi(defaultClient);
    UUID optionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteUserOption(optionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionsApi#deleteUserOption");
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

<a id="getUserOptionById"></a>
# **getUserOptionById**
> OptionDtoEnvelope getUserOptionById(optionId, apiVersion, xApiVersion)

Retrieve a single user option by its ID

Retrieve a single user option by its ID

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
    defaultClient.setBasePath("https://absuite.net");

    OptionsApi apiInstance = new OptionsApi(defaultClient);
    UUID optionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      OptionDtoEnvelope result = apiInstance.getUserOptionById(optionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionsApi#getUserOptionById");
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

<a id="getUserOptionByKey"></a>
# **getUserOptionByKey**
> OptionDtoEnvelope getUserOptionByKey(key, portalId, apiVersion, xApiVersion)

Retrieve a single user option by its key

Retrieve a single user option by its key

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
    defaultClient.setBasePath("https://absuite.net");

    OptionsApi apiInstance = new OptionsApi(defaultClient);
    String key = "key_example"; // String | 
    UUID portalId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      OptionDtoEnvelope result = apiInstance.getUserOptionByKey(key, portalId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionsApi#getUserOptionByKey");
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

<a id="getUserOptions"></a>
# **getUserOptions**
> OptionDtoListEnvelope getUserOptions(portalId, apiVersion, xApiVersion)

Retrieve a list of user options

Retrieve a list of options for the current user

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
    defaultClient.setBasePath("https://absuite.net");

    OptionsApi apiInstance = new OptionsApi(defaultClient);
    UUID portalId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      OptionDtoListEnvelope result = apiInstance.getUserOptions(portalId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionsApi#getUserOptions");
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

<a id="getUserOptionsCount"></a>
# **getUserOptionsCount**
> Int32Envelope getUserOptionsCount(portalId, apiVersion, xApiVersion)

Get the count of user options

Get the count of options for the current user

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
    defaultClient.setBasePath("https://absuite.net");

    OptionsApi apiInstance = new OptionsApi(defaultClient);
    UUID portalId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getUserOptionsCount(portalId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionsApi#getUserOptionsCount");
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

<a id="updateUserOption"></a>
# **updateUserOption**
> EmptyEnvelope updateUserOption(optionId, apiVersion, xApiVersion, optionUpdateDto)

Update a user option

Update a user option

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
    defaultClient.setBasePath("https://absuite.net");

    OptionsApi apiInstance = new OptionsApi(defaultClient);
    UUID optionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    OptionUpdateDto optionUpdateDto = new OptionUpdateDto(); // OptionUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateUserOption(optionId, apiVersion, xApiVersion, optionUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionsApi#updateUserOption");
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

<a id="upsertUserOption"></a>
# **upsertUserOption**
> EmptyEnvelope upsertUserOption(key, portalId, apiVersion, xApiVersion, optionUpdateDto)

Create or update a user option by key

Create or update a user option by key

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
    defaultClient.setBasePath("https://absuite.net");

    OptionsApi apiInstance = new OptionsApi(defaultClient);
    String key = "key_example"; // String | 
    UUID portalId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    OptionUpdateDto optionUpdateDto = new OptionUpdateDto(); // OptionUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.upsertUserOption(key, portalId, apiVersion, xApiVersion, optionUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionsApi#upsertUserOption");
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

