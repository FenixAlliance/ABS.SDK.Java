# LocalizationStringsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**countLocalizationStringsAsync**](LocalizationStringsApi.md#countLocalizationStringsAsync) | **GET** /api/v2/ContentService/LocalizationStrings/Count | Count localization strings |
| [**createLocalizationStringAsync**](LocalizationStringsApi.md#createLocalizationStringAsync) | **POST** /api/v2/ContentService/LocalizationStrings | Create a localization string |
| [**deleteLocalizationStringAsync**](LocalizationStringsApi.md#deleteLocalizationStringAsync) | **DELETE** /api/v2/ContentService/LocalizationStrings/{localizationStringId} | Delete a localization string |
| [**getLocalizationStringByIdAsync**](LocalizationStringsApi.md#getLocalizationStringByIdAsync) | **GET** /api/v2/ContentService/LocalizationStrings/{localizationStringId} | Get localization string by ID |
| [**getLocalizationStringsAsync**](LocalizationStringsApi.md#getLocalizationStringsAsync) | **GET** /api/v2/ContentService/LocalizationStrings | Get localization strings |
| [**updateLocalizationStringAsync**](LocalizationStringsApi.md#updateLocalizationStringAsync) | **PUT** /api/v2/ContentService/LocalizationStrings/{localizationStringId} | Update a localization string |


<a id="countLocalizationStringsAsync"></a>
# **countLocalizationStringsAsync**
> Int32Envelope countLocalizationStringsAsync(tenantId, apiVersion, xApiVersion)

Count localization strings

Counts all localization strings for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LocalizationStringsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    LocalizationStringsApi apiInstance = new LocalizationStringsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.countLocalizationStringsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalizationStringsApi#countLocalizationStringsAsync");
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

<a id="createLocalizationStringAsync"></a>
# **createLocalizationStringAsync**
> EmptyEnvelope createLocalizationStringAsync(tenantId, localizationStringCreateDto, apiVersion, xApiVersion)

Create a localization string

Creates a new localization string for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LocalizationStringsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    LocalizationStringsApi apiInstance = new LocalizationStringsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    LocalizationStringCreateDto localizationStringCreateDto = new LocalizationStringCreateDto(); // LocalizationStringCreateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.createLocalizationStringAsync(tenantId, localizationStringCreateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalizationStringsApi#createLocalizationStringAsync");
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
| **localizationStringCreateDto** | [**LocalizationStringCreateDto**](LocalizationStringCreateDto.md)|  | |
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
| **201** | Created |  -  |

<a id="deleteLocalizationStringAsync"></a>
# **deleteLocalizationStringAsync**
> EmptyEnvelope deleteLocalizationStringAsync(tenantId, localizationStringId, apiVersion, xApiVersion)

Delete a localization string

Deletes a localization string for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LocalizationStringsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    LocalizationStringsApi apiInstance = new LocalizationStringsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID localizationStringId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteLocalizationStringAsync(tenantId, localizationStringId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalizationStringsApi#deleteLocalizationStringAsync");
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
| **localizationStringId** | **UUID**|  | |
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

<a id="getLocalizationStringByIdAsync"></a>
# **getLocalizationStringByIdAsync**
> LocalizationStringDtoEnvelope getLocalizationStringByIdAsync(tenantId, localizationStringId, apiVersion, xApiVersion)

Get localization string by ID

Retrieves a specific localization string by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LocalizationStringsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    LocalizationStringsApi apiInstance = new LocalizationStringsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID localizationStringId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      LocalizationStringDtoEnvelope result = apiInstance.getLocalizationStringByIdAsync(tenantId, localizationStringId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalizationStringsApi#getLocalizationStringByIdAsync");
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
| **localizationStringId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**LocalizationStringDtoEnvelope**](LocalizationStringDtoEnvelope.md)

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

<a id="getLocalizationStringsAsync"></a>
# **getLocalizationStringsAsync**
> LocalizationStringDtoListEnvelope getLocalizationStringsAsync(tenantId, apiVersion, xApiVersion)

Get localization strings

Retrieves all localization strings for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LocalizationStringsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    LocalizationStringsApi apiInstance = new LocalizationStringsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      LocalizationStringDtoListEnvelope result = apiInstance.getLocalizationStringsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalizationStringsApi#getLocalizationStringsAsync");
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

[**LocalizationStringDtoListEnvelope**](LocalizationStringDtoListEnvelope.md)

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

<a id="updateLocalizationStringAsync"></a>
# **updateLocalizationStringAsync**
> EmptyEnvelope updateLocalizationStringAsync(tenantId, localizationStringId, localizationStringUpdateDto, apiVersion, xApiVersion)

Update a localization string

Updates an existing localization string for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LocalizationStringsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    LocalizationStringsApi apiInstance = new LocalizationStringsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID localizationStringId = UUID.randomUUID(); // UUID | 
    LocalizationStringUpdateDto localizationStringUpdateDto = new LocalizationStringUpdateDto(); // LocalizationStringUpdateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.updateLocalizationStringAsync(tenantId, localizationStringId, localizationStringUpdateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalizationStringsApi#updateLocalizationStringAsync");
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
| **localizationStringId** | **UUID**|  | |
| **localizationStringUpdateDto** | [**LocalizationStringUpdateDto**](LocalizationStringUpdateDto.md)|  | |
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
| **200** | OK |  -  |

