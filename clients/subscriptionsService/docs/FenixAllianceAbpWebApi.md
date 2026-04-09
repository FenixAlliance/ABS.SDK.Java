# FenixAllianceAbpWebApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**forgotPasswordPost**](FenixAllianceAbpWebApi.md#forgotPasswordPost) | **POST** /forgotPassword |  |
| [**healthGet**](FenixAllianceAbpWebApi.md#healthGet) | **GET** /health |  |
| [**helloGet**](FenixAllianceAbpWebApi.md#helloGet) | **GET** /hello |  |
| [**loginPost**](FenixAllianceAbpWebApi.md#loginPost) | **POST** /login |  |
| [**manage2faPost**](FenixAllianceAbpWebApi.md#manage2faPost) | **POST** /manage/2fa |  |
| [**manageInfoGet**](FenixAllianceAbpWebApi.md#manageInfoGet) | **GET** /manage/info |  |
| [**manageInfoPost**](FenixAllianceAbpWebApi.md#manageInfoPost) | **POST** /manage/info |  |
| [**mapIdentityApiConfirmEmail**](FenixAllianceAbpWebApi.md#mapIdentityApiConfirmEmail) | **GET** /confirmEmail |  |
| [**refreshPost**](FenixAllianceAbpWebApi.md#refreshPost) | **POST** /refresh |  |
| [**registerPost**](FenixAllianceAbpWebApi.md#registerPost) | **POST** /register |  |
| [**resendConfirmationEmailPost**](FenixAllianceAbpWebApi.md#resendConfirmationEmailPost) | **POST** /resendConfirmationEmail |  |
| [**resetPasswordPost**](FenixAllianceAbpWebApi.md#resetPasswordPost) | **POST** /resetPassword |  |
| [**versionGet**](FenixAllianceAbpWebApi.md#versionGet) | **GET** /version |  |


<a id="forgotPasswordPost"></a>
# **forgotPasswordPost**
> forgotPasswordPost(forgotPasswordRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FenixAllianceAbpWebApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FenixAllianceAbpWebApi apiInstance = new FenixAllianceAbpWebApi(defaultClient);
    ForgotPasswordRequest forgotPasswordRequest = new ForgotPasswordRequest(); // ForgotPasswordRequest | 
    try {
      apiInstance.forgotPasswordPost(forgotPasswordRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling FenixAllianceAbpWebApi#forgotPasswordPost");
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
| **forgotPasswordRequest** | [**ForgotPasswordRequest**](ForgotPasswordRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

<a id="healthGet"></a>
# **healthGet**
> healthGet()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FenixAllianceAbpWebApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FenixAllianceAbpWebApi apiInstance = new FenixAllianceAbpWebApi(defaultClient);
    try {
      apiInstance.healthGet();
    } catch (ApiException e) {
      System.err.println("Exception when calling FenixAllianceAbpWebApi#healthGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="helloGet"></a>
# **helloGet**
> helloGet()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FenixAllianceAbpWebApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FenixAllianceAbpWebApi apiInstance = new FenixAllianceAbpWebApi(defaultClient);
    try {
      apiInstance.helloGet();
    } catch (ApiException e) {
      System.err.println("Exception when calling FenixAllianceAbpWebApi#helloGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="loginPost"></a>
# **loginPost**
> AccessTokenResponse loginPost(loginRequest, useCookies, useSessionCookies)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FenixAllianceAbpWebApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FenixAllianceAbpWebApi apiInstance = new FenixAllianceAbpWebApi(defaultClient);
    LoginRequest loginRequest = new LoginRequest(); // LoginRequest | 
    Boolean useCookies = true; // Boolean | 
    Boolean useSessionCookies = true; // Boolean | 
    try {
      AccessTokenResponse result = apiInstance.loginPost(loginRequest, useCookies, useSessionCookies);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FenixAllianceAbpWebApi#loginPost");
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
| **loginRequest** | [**LoginRequest**](LoginRequest.md)|  | |
| **useCookies** | **Boolean**|  | [optional] |
| **useSessionCookies** | **Boolean**|  | [optional] |

### Return type

[**AccessTokenResponse**](AccessTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="manage2faPost"></a>
# **manage2faPost**
> TwoFactorResponse manage2faPost(twoFactorRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FenixAllianceAbpWebApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FenixAllianceAbpWebApi apiInstance = new FenixAllianceAbpWebApi(defaultClient);
    TwoFactorRequest twoFactorRequest = new TwoFactorRequest(); // TwoFactorRequest | 
    try {
      TwoFactorResponse result = apiInstance.manage2faPost(twoFactorRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FenixAllianceAbpWebApi#manage2faPost");
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
| **twoFactorRequest** | [**TwoFactorRequest**](TwoFactorRequest.md)|  | |

### Return type

[**TwoFactorResponse**](TwoFactorResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |

<a id="manageInfoGet"></a>
# **manageInfoGet**
> InfoResponse manageInfoGet()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FenixAllianceAbpWebApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FenixAllianceAbpWebApi apiInstance = new FenixAllianceAbpWebApi(defaultClient);
    try {
      InfoResponse result = apiInstance.manageInfoGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FenixAllianceAbpWebApi#manageInfoGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InfoResponse**](InfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |

<a id="manageInfoPost"></a>
# **manageInfoPost**
> InfoResponse manageInfoPost(infoRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FenixAllianceAbpWebApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FenixAllianceAbpWebApi apiInstance = new FenixAllianceAbpWebApi(defaultClient);
    InfoRequest infoRequest = new InfoRequest(); // InfoRequest | 
    try {
      InfoResponse result = apiInstance.manageInfoPost(infoRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FenixAllianceAbpWebApi#manageInfoPost");
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
| **infoRequest** | [**InfoRequest**](InfoRequest.md)|  | |

### Return type

[**InfoResponse**](InfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |

<a id="mapIdentityApiConfirmEmail"></a>
# **mapIdentityApiConfirmEmail**
> mapIdentityApiConfirmEmail(userId, code, changedEmail)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FenixAllianceAbpWebApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FenixAllianceAbpWebApi apiInstance = new FenixAllianceAbpWebApi(defaultClient);
    String userId = "userId_example"; // String | 
    String code = "code_example"; // String | 
    String changedEmail = "changedEmail_example"; // String | 
    try {
      apiInstance.mapIdentityApiConfirmEmail(userId, code, changedEmail);
    } catch (ApiException e) {
      System.err.println("Exception when calling FenixAllianceAbpWebApi#mapIdentityApiConfirmEmail");
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
| **code** | **String**|  | |
| **changedEmail** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="refreshPost"></a>
# **refreshPost**
> AccessTokenResponse refreshPost(refreshRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FenixAllianceAbpWebApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FenixAllianceAbpWebApi apiInstance = new FenixAllianceAbpWebApi(defaultClient);
    RefreshRequest refreshRequest = new RefreshRequest(); // RefreshRequest | 
    try {
      AccessTokenResponse result = apiInstance.refreshPost(refreshRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FenixAllianceAbpWebApi#refreshPost");
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
| **refreshRequest** | [**RefreshRequest**](RefreshRequest.md)|  | |

### Return type

[**AccessTokenResponse**](AccessTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="registerPost"></a>
# **registerPost**
> registerPost(registerRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FenixAllianceAbpWebApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FenixAllianceAbpWebApi apiInstance = new FenixAllianceAbpWebApi(defaultClient);
    RegisterRequest registerRequest = new RegisterRequest(); // RegisterRequest | 
    try {
      apiInstance.registerPost(registerRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling FenixAllianceAbpWebApi#registerPost");
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
| **registerRequest** | [**RegisterRequest**](RegisterRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

<a id="resendConfirmationEmailPost"></a>
# **resendConfirmationEmailPost**
> resendConfirmationEmailPost(resendConfirmationEmailRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FenixAllianceAbpWebApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FenixAllianceAbpWebApi apiInstance = new FenixAllianceAbpWebApi(defaultClient);
    ResendConfirmationEmailRequest resendConfirmationEmailRequest = new ResendConfirmationEmailRequest(); // ResendConfirmationEmailRequest | 
    try {
      apiInstance.resendConfirmationEmailPost(resendConfirmationEmailRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling FenixAllianceAbpWebApi#resendConfirmationEmailPost");
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
| **resendConfirmationEmailRequest** | [**ResendConfirmationEmailRequest**](ResendConfirmationEmailRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="resetPasswordPost"></a>
# **resetPasswordPost**
> resetPasswordPost(resetPasswordRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FenixAllianceAbpWebApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FenixAllianceAbpWebApi apiInstance = new FenixAllianceAbpWebApi(defaultClient);
    ResetPasswordRequest resetPasswordRequest = new ResetPasswordRequest(); // ResetPasswordRequest | 
    try {
      apiInstance.resetPasswordPost(resetPasswordRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling FenixAllianceAbpWebApi#resetPasswordPost");
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
| **resetPasswordRequest** | [**ResetPasswordRequest**](ResetPasswordRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

<a id="versionGet"></a>
# **versionGet**
> versionGet()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FenixAllianceAbpWebApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FenixAllianceAbpWebApi apiInstance = new FenixAllianceAbpWebApi(defaultClient);
    try {
      apiInstance.versionGet();
    } catch (ApiException e) {
      System.err.println("Exception when calling FenixAllianceAbpWebApi#versionGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

