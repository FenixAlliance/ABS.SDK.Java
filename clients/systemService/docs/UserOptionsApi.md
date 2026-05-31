# UserOptionsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSystemUserOption**](UserOptionsApi.md#createSystemUserOption) | **POST** /api/v2/SystemService/Users/{userId}/Options | Create a new user option (admin) |
| [**deleteSystemUserOption**](UserOptionsApi.md#deleteSystemUserOption) | **DELETE** /api/v2/SystemService/Users/{userId}/Options/{optionId} | Delete a user option (admin) |
| [**getSystemUserOptionById**](UserOptionsApi.md#getSystemUserOptionById) | **GET** /api/v2/SystemService/Users/{userId}/Options/{optionId} | Retrieve a single user option by its ID (admin) |
| [**getSystemUserOptions**](UserOptionsApi.md#getSystemUserOptions) | **GET** /api/v2/SystemService/Users/{userId}/Options | Retrieve a list of user options (admin) |
| [**getSystemUserOptionsCount**](UserOptionsApi.md#getSystemUserOptionsCount) | **GET** /api/v2/SystemService/Users/{userId}/Options/Count | Get the count of user options (admin) |
| [**updateSystemUserOption**](UserOptionsApi.md#updateSystemUserOption) | **PUT** /api/v2/SystemService/Users/{userId}/Options/{optionId} | Update a user option (admin) |


<a id="createSystemUserOption"></a>
# **createSystemUserOption**
> EmptyEnvelope createSystemUserOption(userId, key, portalId, apiVersion, xApiVersion, optionCreateDto)

Create a new user option (admin)

Admin endpoint to create an option for any user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserOptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    UserOptionsApi apiInstance = new UserOptionsApi(defaultClient);
    UUID userId = UUID.randomUUID(); // UUID | 
    String key = "key_example"; // String | 
    UUID portalId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    OptionCreateDto optionCreateDto = new OptionCreateDto(); // OptionCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createSystemUserOption(userId, key, portalId, apiVersion, xApiVersion, optionCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserOptionsApi#createSystemUserOption");
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
| **userId** | **UUID**|  | |
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

<a id="deleteSystemUserOption"></a>
# **deleteSystemUserOption**
> EmptyEnvelope deleteSystemUserOption(userId, optionId, apiVersion, xApiVersion)

Delete a user option (admin)

Admin endpoint to delete an option for any user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserOptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    UserOptionsApi apiInstance = new UserOptionsApi(defaultClient);
    UUID userId = UUID.randomUUID(); // UUID | 
    UUID optionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteSystemUserOption(userId, optionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserOptionsApi#deleteSystemUserOption");
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
| **userId** | **UUID**|  | |
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

<a id="getSystemUserOptionById"></a>
# **getSystemUserOptionById**
> OptionDtoEnvelope getSystemUserOptionById(userId, optionId, apiVersion, xApiVersion)

Retrieve a single user option by its ID (admin)

Admin endpoint to retrieve a single option for any user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserOptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    UserOptionsApi apiInstance = new UserOptionsApi(defaultClient);
    UUID userId = UUID.randomUUID(); // UUID | 
    UUID optionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      OptionDtoEnvelope result = apiInstance.getSystemUserOptionById(userId, optionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserOptionsApi#getSystemUserOptionById");
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
| **userId** | **UUID**|  | |
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

<a id="getSystemUserOptions"></a>
# **getSystemUserOptions**
> OptionDtoListEnvelope getSystemUserOptions(userId, portalId, apiVersion, xApiVersion)

Retrieve a list of user options (admin)

Admin endpoint to retrieve options for any user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserOptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    UserOptionsApi apiInstance = new UserOptionsApi(defaultClient);
    UUID userId = UUID.randomUUID(); // UUID | 
    UUID portalId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      OptionDtoListEnvelope result = apiInstance.getSystemUserOptions(userId, portalId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserOptionsApi#getSystemUserOptions");
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
| **userId** | **UUID**|  | |
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

<a id="getSystemUserOptionsCount"></a>
# **getSystemUserOptionsCount**
> Int32Envelope getSystemUserOptionsCount(userId, portalId, apiVersion, xApiVersion)

Get the count of user options (admin)

Admin endpoint to get the count of options for any user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserOptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    UserOptionsApi apiInstance = new UserOptionsApi(defaultClient);
    UUID userId = UUID.randomUUID(); // UUID | 
    UUID portalId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getSystemUserOptionsCount(userId, portalId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserOptionsApi#getSystemUserOptionsCount");
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
| **userId** | **UUID**|  | |
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

<a id="updateSystemUserOption"></a>
# **updateSystemUserOption**
> EmptyEnvelope updateSystemUserOption(userId, optionId, apiVersion, xApiVersion, optionUpdateDto)

Update a user option (admin)

Admin endpoint to update an option for any user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserOptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    UserOptionsApi apiInstance = new UserOptionsApi(defaultClient);
    UUID userId = UUID.randomUUID(); // UUID | 
    UUID optionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    OptionUpdateDto optionUpdateDto = new OptionUpdateDto(); // OptionUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateSystemUserOption(userId, optionId, apiVersion, xApiVersion, optionUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserOptionsApi#updateSystemUserOption");
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
| **userId** | **UUID**|  | |
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

