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
| [**getUserAdminDetailAsync**](UsersApi.md#getUserAdminDetailAsync) | **GET** /api/v2/SystemService/Users/{userId}/AdminDetail | Retrieve the admin detail aggregate for a user |
| [**getUserAsync**](UsersApi.md#getUserAsync) | **GET** /api/v2/SystemService/Users/{userId} | Retrieve a user by ID |
| [**getUsersAsync**](UsersApi.md#getUsersAsync) | **GET** /api/v2/SystemService/Users | Retrieve a list of users |
| [**getUsersCountAsync**](UsersApi.md#getUsersCountAsync) | **GET** /api/v2/SystemService/Users/Count | Get the count of users |
| [**patchAccountHolderAsync**](UsersApi.md#patchAccountHolderAsync) | **PATCH** /api/v2/SystemService/Users/{userId} | Partially update a user |
| [**setUserPasswordAsync**](UsersApi.md#setUserPasswordAsync) | **POST** /api/v2/SystemService/Users/{userId}/Password | Set a user&#39;s password |
| [**updateAccountHolderAdminProfileAsync**](UsersApi.md#updateAccountHolderAdminProfileAsync) | **PUT** /api/v2/SystemService/Users/{userId}/AdminProfile | Update a user&#39;s admin-managed profile |
| [**updateAccountHolderAsync**](UsersApi.md#updateAccountHolderAsync) | **PUT** /api/v2/SystemService/Users/{userId} | Update a user |


<a id="adminPreviewUserEmailTemplate"></a>
# **adminPreviewUserEmailTemplate**
> adminPreviewUserEmailTemplate(userId, apiVersion, xApiVersion, emailDispatchRequest)

Preview the rendered email for a user.

This action is only available for global administrators.

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

This action is only available for global administrators.

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

This action is only available for global administrators.

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

This action is only available for global administrators.

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

This action is only available for global administrators.

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
> ExtendedUserDtoListEnvelope getExtendedUsersAsync(apiVersion, xApiVersion, extendedUserDtoCollectionQueryParameters)

Retrieve a list of extended users

This action is only available for global administrators.

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
    ExtendedUserDtoCollectionQueryParameters extendedUserDtoCollectionQueryParameters = new ExtendedUserDtoCollectionQueryParameters(); // ExtendedUserDtoCollectionQueryParameters | 
    try {
      ExtendedUserDtoListEnvelope result = apiInstance.getExtendedUsersAsync(apiVersion, xApiVersion, extendedUserDtoCollectionQueryParameters);
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
| **extendedUserDtoCollectionQueryParameters** | [**ExtendedUserDtoCollectionQueryParameters**](ExtendedUserDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**ExtendedUserDtoListEnvelope**](ExtendedUserDtoListEnvelope.md)

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

<a id="getExtendedUsersCountAsync"></a>
# **getExtendedUsersCountAsync**
> Int32Envelope getExtendedUsersCountAsync(apiVersion, xApiVersion, extendedUserDtoCollectionQueryParameters)

Get the count of extended users

This action is only available for global administrators.

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
    ExtendedUserDtoCollectionQueryParameters extendedUserDtoCollectionQueryParameters = new ExtendedUserDtoCollectionQueryParameters(); // ExtendedUserDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getExtendedUsersCountAsync(apiVersion, xApiVersion, extendedUserDtoCollectionQueryParameters);
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
| **extendedUserDtoCollectionQueryParameters** | [**ExtendedUserDtoCollectionQueryParameters**](ExtendedUserDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

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

<a id="getUserAdminDetailAsync"></a>
# **getUserAdminDetailAsync**
> UserAdminDetailDtoEnvelope getUserAdminDetailAsync(userId, tenantId, apiVersion, xApiVersion)

Retrieve the admin detail aggregate for a user

Returns the user&#39;s orders, external logins, and — for the supplied tenant — the enrollment with its granted roles/permissions and the tenant role/permission catalogs. Global administrators only.

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
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      UserAdminDetailDtoEnvelope result = apiInstance.getUserAdminDetailAsync(userId, tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserAdminDetailAsync");
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
| **tenantId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**UserAdminDetailDtoEnvelope**](UserAdminDetailDtoEnvelope.md)

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

This action is only available for global administrators.

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
> UserDtoListEnvelope getUsersAsync(apiVersion, xApiVersion, userDtoCollectionQueryParameters)

Retrieve a list of users

This action is only available for global administrators.

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
    UserDtoCollectionQueryParameters userDtoCollectionQueryParameters = new UserDtoCollectionQueryParameters(); // UserDtoCollectionQueryParameters | 
    try {
      UserDtoListEnvelope result = apiInstance.getUsersAsync(apiVersion, xApiVersion, userDtoCollectionQueryParameters);
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
| **userDtoCollectionQueryParameters** | [**UserDtoCollectionQueryParameters**](UserDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**UserDtoListEnvelope**](UserDtoListEnvelope.md)

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

<a id="getUsersCountAsync"></a>
# **getUsersCountAsync**
> Int32Envelope getUsersCountAsync(apiVersion, xApiVersion, userDtoCollectionQueryParameters)

Get the count of users

This action is only available for global administrators.

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
    UserDtoCollectionQueryParameters userDtoCollectionQueryParameters = new UserDtoCollectionQueryParameters(); // UserDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getUsersCountAsync(apiVersion, xApiVersion, userDtoCollectionQueryParameters);
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
| **userDtoCollectionQueryParameters** | [**UserDtoCollectionQueryParameters**](UserDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

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

<a id="patchAccountHolderAsync"></a>
# **patchAccountHolderAsync**
> EmptyEnvelope patchAccountHolderAsync(userId, apiVersion, xApiVersion, patchOperation)

Partially update a user

This action is only available for global administrators.

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
    List<PatchOperation> patchOperation = Arrays.asList(); // List<PatchOperation> | 
    try {
      EmptyEnvelope result = apiInstance.patchAccountHolderAsync(userId, apiVersion, xApiVersion, patchOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#patchAccountHolderAsync");
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
| **patchOperation** | [**List&lt;PatchOperation&gt;**](PatchOperation.md)|  | [optional] |

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

<a id="setUserPasswordAsync"></a>
# **setUserPasswordAsync**
> EmptyEnvelope setUserPasswordAsync(userId, apiVersion, xApiVersion, setUserPasswordDto)

Set a user&#39;s password

Replaces the user&#39;s password with the supplied value. Global administrators only.

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
    SetUserPasswordDto setUserPasswordDto = new SetUserPasswordDto(); // SetUserPasswordDto | 
    try {
      EmptyEnvelope result = apiInstance.setUserPasswordAsync(userId, apiVersion, xApiVersion, setUserPasswordDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#setUserPasswordAsync");
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
| **setUserPasswordDto** | [**SetUserPasswordDto**](SetUserPasswordDto.md)|  | [optional] |

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

<a id="updateAccountHolderAdminProfileAsync"></a>
# **updateAccountHolderAdminProfileAsync**
> EmptyEnvelope updateAccountHolderAdminProfileAsync(userId, apiVersion, xApiVersion, userAdminUpdateDto)

Update a user&#39;s admin-managed profile

Updates the identity fields (email/username, re-normalized by Identity) and display fields a global administrator may change on a user, and toggles two-factor and lockout. Normalized email/username and the access-failed count are never accepted. This action is only available for global administrators.

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
    UserAdminUpdateDto userAdminUpdateDto = new UserAdminUpdateDto(); // UserAdminUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateAccountHolderAdminProfileAsync(userId, apiVersion, xApiVersion, userAdminUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#updateAccountHolderAdminProfileAsync");
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
| **userAdminUpdateDto** | [**UserAdminUpdateDto**](UserAdminUpdateDto.md)|  | [optional] |

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

<a id="updateAccountHolderAsync"></a>
# **updateAccountHolderAsync**
> EmptyEnvelope updateAccountHolderAsync(userId, apiVersion, xApiVersion, userUpdateDto)

Update a user

This action is only available for global administrators.

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

