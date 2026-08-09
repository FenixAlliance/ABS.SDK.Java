# CurriculumsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCurriculumAsync**](CurriculumsApi.md#createCurriculumAsync) | **POST** /api/v2/SocialService/Curriculums | Create a curriculum |
| [**deleteCurriculumAsync**](CurriculumsApi.md#deleteCurriculumAsync) | **DELETE** /api/v2/SocialService/Curriculums/{curriculumId} | Delete a curriculum |
| [**getCurriculumAsync**](CurriculumsApi.md#getCurriculumAsync) | **GET** /api/v2/SocialService/Curriculums/{curriculumId} | Get curriculum by ID |
| [**getCurriculumsAsync**](CurriculumsApi.md#getCurriculumsAsync) | **GET** /api/v2/SocialService/Curriculums | Get curricula |
| [**getCurriculumsCountAsync**](CurriculumsApi.md#getCurriculumsCountAsync) | **GET** /api/v2/SocialService/Curriculums/Count | Count curricula |
| [**patchCurriculumAsync**](CurriculumsApi.md#patchCurriculumAsync) | **PATCH** /api/v2/SocialService/Curriculums/{curriculumId} | Patch a curriculum |
| [**updateCurriculumAsync**](CurriculumsApi.md#updateCurriculumAsync) | **PUT** /api/v2/SocialService/Curriculums/{curriculumId} | Update a curriculum |


<a id="createCurriculumAsync"></a>
# **createCurriculumAsync**
> EmptyEnvelope createCurriculumAsync(socialProfileId, tenantId, apiVersion, xApiVersion, curriculumCreateDto)

Create a curriculum

Creates a curriculum (CV) on the specified social profile.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CurriculumsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CurriculumsApi apiInstance = new CurriculumsApi(defaultClient);
    UUID socialProfileId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CurriculumCreateDto curriculumCreateDto = new CurriculumCreateDto(); // CurriculumCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createCurriculumAsync(socialProfileId, tenantId, apiVersion, xApiVersion, curriculumCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurriculumsApi#createCurriculumAsync");
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
| **socialProfileId** | **UUID**|  | |
| **tenantId** | **UUID**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **curriculumCreateDto** | [**CurriculumCreateDto**](CurriculumCreateDto.md)|  | [optional] |

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
| **201** | Created |  -  |

<a id="deleteCurriculumAsync"></a>
# **deleteCurriculumAsync**
> EmptyEnvelope deleteCurriculumAsync(socialProfileId, curriculumId, tenantId, apiVersion, xApiVersion)

Delete a curriculum

Deletes a curriculum authored on the specified social profile.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CurriculumsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CurriculumsApi apiInstance = new CurriculumsApi(defaultClient);
    UUID socialProfileId = UUID.randomUUID(); // UUID | 
    UUID curriculumId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteCurriculumAsync(socialProfileId, curriculumId, tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurriculumsApi#deleteCurriculumAsync");
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
| **socialProfileId** | **UUID**|  | |
| **curriculumId** | **UUID**|  | |
| **tenantId** | **UUID**|  | [optional] |
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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

<a id="getCurriculumAsync"></a>
# **getCurriculumAsync**
> CurriculumDtoEnvelope getCurriculumAsync(socialProfileId, curriculumId, tenantId, apiVersion, xApiVersion)

Get curriculum by ID

Retrieves a specific curriculum authored on the specified social profile.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CurriculumsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CurriculumsApi apiInstance = new CurriculumsApi(defaultClient);
    UUID socialProfileId = UUID.randomUUID(); // UUID | 
    UUID curriculumId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CurriculumDtoEnvelope result = apiInstance.getCurriculumAsync(socialProfileId, curriculumId, tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurriculumsApi#getCurriculumAsync");
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
| **socialProfileId** | **UUID**|  | |
| **curriculumId** | **UUID**|  | |
| **tenantId** | **UUID**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CurriculumDtoEnvelope**](CurriculumDtoEnvelope.md)

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

<a id="getCurriculumsAsync"></a>
# **getCurriculumsAsync**
> CurriculumDtoListEnvelope getCurriculumsAsync(socialProfileId, tenantId, apiVersion, xApiVersion, curriculumDtoCollectionQueryParameters)

Get curricula

Retrieves the curricula (CVs) authored on the specified social profile.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CurriculumsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CurriculumsApi apiInstance = new CurriculumsApi(defaultClient);
    UUID socialProfileId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CurriculumDtoCollectionQueryParameters curriculumDtoCollectionQueryParameters = new CurriculumDtoCollectionQueryParameters(); // CurriculumDtoCollectionQueryParameters | 
    try {
      CurriculumDtoListEnvelope result = apiInstance.getCurriculumsAsync(socialProfileId, tenantId, apiVersion, xApiVersion, curriculumDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurriculumsApi#getCurriculumsAsync");
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
| **socialProfileId** | **UUID**|  | |
| **tenantId** | **UUID**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **curriculumDtoCollectionQueryParameters** | [**CurriculumDtoCollectionQueryParameters**](CurriculumDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**CurriculumDtoListEnvelope**](CurriculumDtoListEnvelope.md)

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

<a id="getCurriculumsCountAsync"></a>
# **getCurriculumsCountAsync**
> Int32Envelope getCurriculumsCountAsync(socialProfileId, tenantId, apiVersion, xApiVersion, curriculumDtoCollectionQueryParameters)

Count curricula

Returns the count of curricula authored on the specified social profile.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CurriculumsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CurriculumsApi apiInstance = new CurriculumsApi(defaultClient);
    UUID socialProfileId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CurriculumDtoCollectionQueryParameters curriculumDtoCollectionQueryParameters = new CurriculumDtoCollectionQueryParameters(); // CurriculumDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getCurriculumsCountAsync(socialProfileId, tenantId, apiVersion, xApiVersion, curriculumDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurriculumsApi#getCurriculumsCountAsync");
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
| **socialProfileId** | **UUID**|  | |
| **tenantId** | **UUID**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **curriculumDtoCollectionQueryParameters** | [**CurriculumDtoCollectionQueryParameters**](CurriculumDtoCollectionQueryParameters.md)|  | [optional] |

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

<a id="patchCurriculumAsync"></a>
# **patchCurriculumAsync**
> EmptyEnvelope patchCurriculumAsync(socialProfileId, curriculumId, tenantId, apiVersion, xApiVersion, patchOperation)

Patch a curriculum

Partially updates an existing curriculum authored on the specified social profile.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CurriculumsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CurriculumsApi apiInstance = new CurriculumsApi(defaultClient);
    UUID socialProfileId = UUID.randomUUID(); // UUID | 
    UUID curriculumId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    List<PatchOperation> patchOperation = Arrays.asList(); // List<PatchOperation> | 
    try {
      EmptyEnvelope result = apiInstance.patchCurriculumAsync(socialProfileId, curriculumId, tenantId, apiVersion, xApiVersion, patchOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurriculumsApi#patchCurriculumAsync");
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
| **socialProfileId** | **UUID**|  | |
| **curriculumId** | **UUID**|  | |
| **tenantId** | **UUID**|  | [optional] |
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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

<a id="updateCurriculumAsync"></a>
# **updateCurriculumAsync**
> EmptyEnvelope updateCurriculumAsync(socialProfileId, curriculumId, tenantId, apiVersion, xApiVersion, curriculumUpdateDto)

Update a curriculum

Updates an existing curriculum authored on the specified social profile.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CurriculumsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CurriculumsApi apiInstance = new CurriculumsApi(defaultClient);
    UUID socialProfileId = UUID.randomUUID(); // UUID | 
    UUID curriculumId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CurriculumUpdateDto curriculumUpdateDto = new CurriculumUpdateDto(); // CurriculumUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateCurriculumAsync(socialProfileId, curriculumId, tenantId, apiVersion, xApiVersion, curriculumUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurriculumsApi#updateCurriculumAsync");
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
| **socialProfileId** | **UUID**|  | |
| **curriculumId** | **UUID**|  | |
| **tenantId** | **UUID**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **curriculumUpdateDto** | [**CurriculumUpdateDto**](CurriculumUpdateDto.md)|  | [optional] |

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

