# SupportEntitlementsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSupportEntitlementAsync**](SupportEntitlementsApi.md#createSupportEntitlementAsync) | **POST** /api/v2/SupportService/SupportEntitlements | Create a new support entitlement |
| [**deleteSupportEntitlementAsync**](SupportEntitlementsApi.md#deleteSupportEntitlementAsync) | **DELETE** /api/v2/SupportService/SupportEntitlements/{supportEntitlementId} | Delete a support entitlement |
| [**getSupportEntitlementAsync**](SupportEntitlementsApi.md#getSupportEntitlementAsync) | **GET** /api/v2/SupportService/SupportEntitlements/{supportEntitlementId} | Retrieve a support entitlement by ID |
| [**getSupportEntitlementsAsync**](SupportEntitlementsApi.md#getSupportEntitlementsAsync) | **GET** /api/v2/SupportService/SupportEntitlements | Retrieve a list of support entitlements |
| [**getSupportEntitlementsCountAsync**](SupportEntitlementsApi.md#getSupportEntitlementsCountAsync) | **GET** /api/v2/SupportService/SupportEntitlements/Count | Get the count of support entitlements |
| [**updateSupportEntitlementAsync**](SupportEntitlementsApi.md#updateSupportEntitlementAsync) | **PUT** /api/v2/SupportService/SupportEntitlements/{supportEntitlementId} | Update a support entitlement |


<a id="createSupportEntitlementAsync"></a>
# **createSupportEntitlementAsync**
> EmptyEnvelope createSupportEntitlementAsync(tenantId, apiVersion, xApiVersion, supportEntitlementCreateDto)

Create a new support entitlement

Creates a new support entitlement for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportEntitlementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SupportEntitlementsApi apiInstance = new SupportEntitlementsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SupportEntitlementCreateDto supportEntitlementCreateDto = new SupportEntitlementCreateDto(); // SupportEntitlementCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createSupportEntitlementAsync(tenantId, apiVersion, xApiVersion, supportEntitlementCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportEntitlementsApi#createSupportEntitlementAsync");
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
| **supportEntitlementCreateDto** | [**SupportEntitlementCreateDto**](SupportEntitlementCreateDto.md)|  | [optional] |

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

<a id="deleteSupportEntitlementAsync"></a>
# **deleteSupportEntitlementAsync**
> EmptyEnvelope deleteSupportEntitlementAsync(tenantId, supportEntitlementId, apiVersion, xApiVersion)

Delete a support entitlement

Deletes a support entitlement by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportEntitlementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SupportEntitlementsApi apiInstance = new SupportEntitlementsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID supportEntitlementId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteSupportEntitlementAsync(tenantId, supportEntitlementId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportEntitlementsApi#deleteSupportEntitlementAsync");
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
| **supportEntitlementId** | **UUID**|  | |
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

<a id="getSupportEntitlementAsync"></a>
# **getSupportEntitlementAsync**
> SupportEntitlementDtoEnvelope getSupportEntitlementAsync(tenantId, supportEntitlementId, apiVersion, xApiVersion)

Retrieve a support entitlement by ID

Retrieves a single support entitlement by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportEntitlementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SupportEntitlementsApi apiInstance = new SupportEntitlementsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID supportEntitlementId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SupportEntitlementDtoEnvelope result = apiInstance.getSupportEntitlementAsync(tenantId, supportEntitlementId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportEntitlementsApi#getSupportEntitlementAsync");
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
| **supportEntitlementId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**SupportEntitlementDtoEnvelope**](SupportEntitlementDtoEnvelope.md)

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

<a id="getSupportEntitlementsAsync"></a>
# **getSupportEntitlementsAsync**
> SupportEntitlementDtoListEnvelope getSupportEntitlementsAsync(tenantId, apiVersion, xApiVersion)

Retrieve a list of support entitlements

Retrieves a list of support entitlements for the specified tenant with OData query support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportEntitlementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SupportEntitlementsApi apiInstance = new SupportEntitlementsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SupportEntitlementDtoListEnvelope result = apiInstance.getSupportEntitlementsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportEntitlementsApi#getSupportEntitlementsAsync");
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

[**SupportEntitlementDtoListEnvelope**](SupportEntitlementDtoListEnvelope.md)

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

<a id="getSupportEntitlementsCountAsync"></a>
# **getSupportEntitlementsCountAsync**
> Int32Envelope getSupportEntitlementsCountAsync(tenantId, apiVersion, xApiVersion)

Get the count of support entitlements

Returns the total count of support entitlements for the specified tenant with OData query support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportEntitlementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SupportEntitlementsApi apiInstance = new SupportEntitlementsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getSupportEntitlementsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportEntitlementsApi#getSupportEntitlementsCountAsync");
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

<a id="updateSupportEntitlementAsync"></a>
# **updateSupportEntitlementAsync**
> EmptyEnvelope updateSupportEntitlementAsync(tenantId, supportEntitlementId, apiVersion, xApiVersion, supportEntitlementUpdateDto)

Update a support entitlement

Updates an existing support entitlement by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportEntitlementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SupportEntitlementsApi apiInstance = new SupportEntitlementsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID supportEntitlementId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SupportEntitlementUpdateDto supportEntitlementUpdateDto = new SupportEntitlementUpdateDto(); // SupportEntitlementUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateSupportEntitlementAsync(tenantId, supportEntitlementId, apiVersion, xApiVersion, supportEntitlementUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportEntitlementsApi#updateSupportEntitlementAsync");
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
| **supportEntitlementId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **supportEntitlementUpdateDto** | [**SupportEntitlementUpdateDto**](SupportEntitlementUpdateDto.md)|  | [optional] |

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

