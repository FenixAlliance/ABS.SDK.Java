# UsersApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**adminPreviewUserEmailTemplate**](UsersApi.md#adminPreviewUserEmailTemplate) | **POST** /api/v2/SystemService/Users/{userId}/Emails/Preview | Preview the rendered email for a user. |
| [**adminSendUserEmail**](UsersApi.md#adminSendUserEmail) | **POST** /api/v2/SystemService/Users/{userId}/Emails/Send | Send an email to a user. |
| [**createAccountHolderAsync**](UsersApi.md#createAccountHolderAsync) | **POST** /api/v2/SystemService/Users | Create a new user |
| [**deleteAccountHolderAsync**](UsersApi.md#deleteAccountHolderAsync) | **DELETE** /api/v2/SystemService/Users/{userId} | Delete a user |
| [**getExtendedAccountHolderAsync**](UsersApi.md#getExtendedAccountHolderAsync) | **GET** /api/v2/SystemService/Users/{userId}/Extended | Retrieve an extended user by ID |
| [**getExtendedUsersAsync**](UsersApi.md#getExtendedUsersAsync) | **GET** /api/v2/SystemService/Users/Extended | Retrieve a list of extended users |
| [**getExtendedUsersCountAsync**](UsersApi.md#getExtendedUsersCountAsync) | **GET** /api/v2/SystemService/Users/Extended/Count | Get the count of extended users |
| [**getUserAsync**](UsersApi.md#getUserAsync) | **GET** /api/v2/SystemService/Users/{userId} | Retrieve a user by ID |
| [**getUsersAsync**](UsersApi.md#getUsersAsync) | **GET** /api/v2/SystemService/Users | Retrieve a list of users |
| [**getUsersCountAsync**](UsersApi.md#getUsersCountAsync) | **GET** /api/v2/SystemService/Users/Count | Get the count of users |
| [**updateAccountHolderAsync**](UsersApi.md#updateAccountHolderAsync) | **PUT** /api/v2/SystemService/Users/{userId} | Update a user |


<a id="adminPreviewUserEmailTemplate"></a>
# **adminPreviewUserEmailTemplate**
> adminPreviewUserEmailTemplate(userId, apiVersion, xApiVersion, emailDispatchRequest)

Preview the rendered email for a user.

This action is only available for users with the &#39;business_owner&#39; role (global administrators).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    UsersApi apiInstance = new UsersApi(defaultClient);
    UUID userId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    EmailDispatchRequest emailDispatchRequest = new EmailDispatchRequest(); // EmailDispatchRequest | 
    try {
      apiInstance.adminPreviewUserEmailTemplate(userId, apiVersion, xApiVersion, emailDispatchRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#adminPreviewUserEmailTemplate");
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
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **emailDispatchRequest** | [**EmailDispatchRequest**](EmailDispatchRequest.md)|  | [optional] |

### Return type

null (empty response body)

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

<a id="adminSendUserEmail"></a>
# **adminSendUserEmail**
> EmptyEnvelope adminSendUserEmail(userId, apiVersion, xApiVersion, emailDispatchRequest)

Send an email to a user.

This action is only available for users with the &#39;business_owner&#39; role (global administrators).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    UsersApi apiInstance = new UsersApi(defaultClient);
    UUID userId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    EmailDispatchRequest emailDispatchRequest = new EmailDispatchRequest(); // EmailDispatchRequest | 
    try {
      EmptyEnvelope result = apiInstance.adminSendUserEmail(userId, apiVersion, xApiVersion, emailDispatchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#adminSendUserEmail");
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
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **emailDispatchRequest** | [**EmailDispatchRequest**](EmailDispatchRequest.md)|  | [optional] |

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

<a id="createAccountHolderAsync"></a>
# **createAccountHolderAsync**
> EmptyEnvelope createAccountHolderAsync(apiVersion, xApiVersion, userCreateDto)

Create a new user

This action is only available for users with the &#39;business_owner&#39; role (global administrators).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    UserCreateDto userCreateDto = new UserCreateDto(); // UserCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createAccountHolderAsync(apiVersion, xApiVersion, userCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#createAccountHolderAsync");
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
| **userCreateDto** | [**UserCreateDto**](UserCreateDto.md)|  | [optional] |

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

<a id="deleteAccountHolderAsync"></a>
# **deleteAccountHolderAsync**
> EmptyEnvelope deleteAccountHolderAsync(userId, apiVersion, xApiVersion)

Delete a user

This action is only available for users with the &#39;business_owner&#39; role (global administrators).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    UsersApi apiInstance = new UsersApi(defaultClient);
    UUID userId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteAccountHolderAsync(userId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#deleteAccountHolderAsync");
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

<a id="getExtendedAccountHolderAsync"></a>
# **getExtendedAccountHolderAsync**
> ExtendedUserDtoEnvelope getExtendedAccountHolderAsync(userId, apiVersion, xApiVersion)

Retrieve an extended user by ID

This action is only available for users with the &#39;business_owner&#39; role (global administrators).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String userId = "userId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ExtendedUserDtoEnvelope result = apiInstance.getExtendedAccountHolderAsync(userId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getExtendedAccountHolderAsync");
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
| **userId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ExtendedUserDtoEnvelope**](ExtendedUserDtoEnvelope.md)

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

<a id="getExtendedUsersAsync"></a>
# **getExtendedUsersAsync**
> ExtendedUserDtoListEnvelope getExtendedUsersAsync(apiVersion, xApiVersion)

Retrieve a list of extended users

This action is only available for users with the &#39;business_owner&#39; role (global administrators).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ExtendedUserDtoListEnvelope result = apiInstance.getExtendedUsersAsync(apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getExtendedUsersAsync");
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

### Return type

[**ExtendedUserDtoListEnvelope**](ExtendedUserDtoListEnvelope.md)

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

<a id="getExtendedUsersCountAsync"></a>
# **getExtendedUsersCountAsync**
> Int32Envelope getExtendedUsersCountAsync(apiVersion, xApiVersion)

Get the count of extended users

This action is only available for users with the &#39;business_owner&#39; role (global administrators).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getExtendedUsersCountAsync(apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getExtendedUsersCountAsync");
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

<a id="getUserAsync"></a>
# **getUserAsync**
> UserDtoEnvelope getUserAsync(userId, apiVersion, xApiVersion)

Retrieve a user by ID

This action is only available for users with the &#39;business_owner&#39; role (global administrators).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String userId = "userId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      UserDtoEnvelope result = apiInstance.getUserAsync(userId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserAsync");
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
| **userId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**UserDtoEnvelope**](UserDtoEnvelope.md)

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

<a id="getUsersAsync"></a>
# **getUsersAsync**
> UserDtoListEnvelope getUsersAsync(apiVersion, xApiVersion)

Retrieve a list of users

This action is only available for users with the &#39;business_owner&#39; role (global administrators).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      UserDtoListEnvelope result = apiInstance.getUsersAsync(apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUsersAsync");
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

### Return type

[**UserDtoListEnvelope**](UserDtoListEnvelope.md)

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

<a id="getUsersCountAsync"></a>
# **getUsersCountAsync**
> Int32Envelope getUsersCountAsync(apiVersion, xApiVersion)

Get the count of users

This action is only available for users with the &#39;business_owner&#39; role (global administrators).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getUsersCountAsync(apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUsersCountAsync");
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

<a id="updateAccountHolderAsync"></a>
# **updateAccountHolderAsync**
> EmptyEnvelope updateAccountHolderAsync(userId, apiVersion, xApiVersion, userUpdateDto)

Update a user

This action is only available for users with the &#39;business_owner&#39; role (global administrators).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    UsersApi apiInstance = new UsersApi(defaultClient);
    UUID userId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    UserUpdateDto userUpdateDto = new UserUpdateDto(); // UserUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateAccountHolderAsync(userId, apiVersion, xApiVersion, userUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#updateAccountHolderAsync");
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
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **userUpdateDto** | [**UserUpdateDto**](UserUpdateDto.md)|  | [optional] |

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

