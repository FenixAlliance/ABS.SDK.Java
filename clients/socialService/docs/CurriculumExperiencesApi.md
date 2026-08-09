# CurriculumExperiencesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCurriculumExperienceAsync**](CurriculumExperiencesApi.md#createCurriculumExperienceAsync) | **POST** /api/v2/SocialService/Curriculums/{curriculumId}/Experiences | Create a curriculum experience |
| [**deleteCurriculumExperienceAsync**](CurriculumExperiencesApi.md#deleteCurriculumExperienceAsync) | **DELETE** /api/v2/SocialService/Curriculums/{curriculumId}/Experiences/{experienceId} | Delete a curriculum experience |
| [**getCurriculumExperienceAsync**](CurriculumExperiencesApi.md#getCurriculumExperienceAsync) | **GET** /api/v2/SocialService/Curriculums/{curriculumId}/Experiences/{experienceId} | Get curriculum experience by ID |
| [**getCurriculumExperiencesAsync**](CurriculumExperiencesApi.md#getCurriculumExperiencesAsync) | **GET** /api/v2/SocialService/Curriculums/{curriculumId}/Experiences | Get curriculum experiences |
| [**getCurriculumExperiencesCountAsync**](CurriculumExperiencesApi.md#getCurriculumExperiencesCountAsync) | **GET** /api/v2/SocialService/Curriculums/{curriculumId}/Experiences/Count | Count curriculum experiences |
| [**patchCurriculumExperienceAsync**](CurriculumExperiencesApi.md#patchCurriculumExperienceAsync) | **PATCH** /api/v2/SocialService/Curriculums/{curriculumId}/Experiences/{experienceId} | Patch a curriculum experience |
| [**updateCurriculumExperienceAsync**](CurriculumExperiencesApi.md#updateCurriculumExperienceAsync) | **PUT** /api/v2/SocialService/Curriculums/{curriculumId}/Experiences/{experienceId} | Update a curriculum experience |


<a id="createCurriculumExperienceAsync"></a>
# **createCurriculumExperienceAsync**
> EmptyEnvelope createCurriculumExperienceAsync(curriculumId, socialProfileId, tenantId, apiVersion, xApiVersion, curriculumExperienceCreateDto)

Create a curriculum experience

Adds a work-experience record to a curriculum authored on the specified social profile.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CurriculumExperiencesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CurriculumExperiencesApi apiInstance = new CurriculumExperiencesApi(defaultClient);
    UUID curriculumId = UUID.randomUUID(); // UUID | 
    UUID socialProfileId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CurriculumExperienceCreateDto curriculumExperienceCreateDto = new CurriculumExperienceCreateDto(); // CurriculumExperienceCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createCurriculumExperienceAsync(curriculumId, socialProfileId, tenantId, apiVersion, xApiVersion, curriculumExperienceCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurriculumExperiencesApi#createCurriculumExperienceAsync");
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
| **curriculumId** | **UUID**|  | |
| **socialProfileId** | **UUID**|  | |
| **tenantId** | **UUID**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **curriculumExperienceCreateDto** | [**CurriculumExperienceCreateDto**](CurriculumExperienceCreateDto.md)|  | [optional] |

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

<a id="deleteCurriculumExperienceAsync"></a>
# **deleteCurriculumExperienceAsync**
> EmptyEnvelope deleteCurriculumExperienceAsync(curriculumId, experienceId, socialProfileId, tenantId, apiVersion, xApiVersion)

Delete a curriculum experience

Removes a work-experience record from a curriculum.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CurriculumExperiencesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CurriculumExperiencesApi apiInstance = new CurriculumExperiencesApi(defaultClient);
    UUID curriculumId = UUID.randomUUID(); // UUID | 
    UUID experienceId = UUID.randomUUID(); // UUID | 
    UUID socialProfileId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteCurriculumExperienceAsync(curriculumId, experienceId, socialProfileId, tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurriculumExperiencesApi#deleteCurriculumExperienceAsync");
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
| **curriculumId** | **UUID**|  | |
| **experienceId** | **UUID**|  | |
| **socialProfileId** | **UUID**|  | |
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

<a id="getCurriculumExperienceAsync"></a>
# **getCurriculumExperienceAsync**
> CurriculumExperienceDtoEnvelope getCurriculumExperienceAsync(curriculumId, experienceId, socialProfileId, tenantId, apiVersion, xApiVersion)

Get curriculum experience by ID

Retrieves a specific work-experience record of a curriculum.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CurriculumExperiencesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CurriculumExperiencesApi apiInstance = new CurriculumExperiencesApi(defaultClient);
    UUID curriculumId = UUID.randomUUID(); // UUID | 
    UUID experienceId = UUID.randomUUID(); // UUID | 
    UUID socialProfileId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CurriculumExperienceDtoEnvelope result = apiInstance.getCurriculumExperienceAsync(curriculumId, experienceId, socialProfileId, tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurriculumExperiencesApi#getCurriculumExperienceAsync");
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
| **curriculumId** | **UUID**|  | |
| **experienceId** | **UUID**|  | |
| **socialProfileId** | **UUID**|  | |
| **tenantId** | **UUID**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CurriculumExperienceDtoEnvelope**](CurriculumExperienceDtoEnvelope.md)

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

<a id="getCurriculumExperiencesAsync"></a>
# **getCurriculumExperiencesAsync**
> CurriculumExperienceDtoListEnvelope getCurriculumExperiencesAsync(curriculumId, socialProfileId, tenantId, apiVersion, xApiVersion, curriculumExperienceDtoCollectionQueryParameters)

Get curriculum experiences

Retrieves the work-experience records of a curriculum authored on the specified social profile.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CurriculumExperiencesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CurriculumExperiencesApi apiInstance = new CurriculumExperiencesApi(defaultClient);
    UUID curriculumId = UUID.randomUUID(); // UUID | 
    UUID socialProfileId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CurriculumExperienceDtoCollectionQueryParameters curriculumExperienceDtoCollectionQueryParameters = new CurriculumExperienceDtoCollectionQueryParameters(); // CurriculumExperienceDtoCollectionQueryParameters | 
    try {
      CurriculumExperienceDtoListEnvelope result = apiInstance.getCurriculumExperiencesAsync(curriculumId, socialProfileId, tenantId, apiVersion, xApiVersion, curriculumExperienceDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurriculumExperiencesApi#getCurriculumExperiencesAsync");
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
| **curriculumId** | **UUID**|  | |
| **socialProfileId** | **UUID**|  | |
| **tenantId** | **UUID**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **curriculumExperienceDtoCollectionQueryParameters** | [**CurriculumExperienceDtoCollectionQueryParameters**](CurriculumExperienceDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**CurriculumExperienceDtoListEnvelope**](CurriculumExperienceDtoListEnvelope.md)

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

<a id="getCurriculumExperiencesCountAsync"></a>
# **getCurriculumExperiencesCountAsync**
> Int32Envelope getCurriculumExperiencesCountAsync(curriculumId, socialProfileId, tenantId, apiVersion, xApiVersion, curriculumExperienceDtoCollectionQueryParameters)

Count curriculum experiences

Returns the count of work-experience records of a curriculum.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CurriculumExperiencesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CurriculumExperiencesApi apiInstance = new CurriculumExperiencesApi(defaultClient);
    UUID curriculumId = UUID.randomUUID(); // UUID | 
    UUID socialProfileId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CurriculumExperienceDtoCollectionQueryParameters curriculumExperienceDtoCollectionQueryParameters = new CurriculumExperienceDtoCollectionQueryParameters(); // CurriculumExperienceDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getCurriculumExperiencesCountAsync(curriculumId, socialProfileId, tenantId, apiVersion, xApiVersion, curriculumExperienceDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurriculumExperiencesApi#getCurriculumExperiencesCountAsync");
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
| **curriculumId** | **UUID**|  | |
| **socialProfileId** | **UUID**|  | |
| **tenantId** | **UUID**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **curriculumExperienceDtoCollectionQueryParameters** | [**CurriculumExperienceDtoCollectionQueryParameters**](CurriculumExperienceDtoCollectionQueryParameters.md)|  | [optional] |

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

<a id="patchCurriculumExperienceAsync"></a>
# **patchCurriculumExperienceAsync**
> EmptyEnvelope patchCurriculumExperienceAsync(curriculumId, experienceId, socialProfileId, tenantId, apiVersion, xApiVersion, patchOperation)

Patch a curriculum experience

Partially updates an existing work-experience record of a curriculum.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CurriculumExperiencesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CurriculumExperiencesApi apiInstance = new CurriculumExperiencesApi(defaultClient);
    UUID curriculumId = UUID.randomUUID(); // UUID | 
    UUID experienceId = UUID.randomUUID(); // UUID | 
    UUID socialProfileId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    List<PatchOperation> patchOperation = Arrays.asList(); // List<PatchOperation> | 
    try {
      EmptyEnvelope result = apiInstance.patchCurriculumExperienceAsync(curriculumId, experienceId, socialProfileId, tenantId, apiVersion, xApiVersion, patchOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurriculumExperiencesApi#patchCurriculumExperienceAsync");
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
| **curriculumId** | **UUID**|  | |
| **experienceId** | **UUID**|  | |
| **socialProfileId** | **UUID**|  | |
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

<a id="updateCurriculumExperienceAsync"></a>
# **updateCurriculumExperienceAsync**
> EmptyEnvelope updateCurriculumExperienceAsync(curriculumId, experienceId, socialProfileId, tenantId, apiVersion, xApiVersion, curriculumExperienceUpdateDto)

Update a curriculum experience

Updates an existing work-experience record of a curriculum.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CurriculumExperiencesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CurriculumExperiencesApi apiInstance = new CurriculumExperiencesApi(defaultClient);
    UUID curriculumId = UUID.randomUUID(); // UUID | 
    UUID experienceId = UUID.randomUUID(); // UUID | 
    UUID socialProfileId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CurriculumExperienceUpdateDto curriculumExperienceUpdateDto = new CurriculumExperienceUpdateDto(); // CurriculumExperienceUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateCurriculumExperienceAsync(curriculumId, experienceId, socialProfileId, tenantId, apiVersion, xApiVersion, curriculumExperienceUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurriculumExperiencesApi#updateCurriculumExperienceAsync");
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
| **curriculumId** | **UUID**|  | |
| **experienceId** | **UUID**|  | |
| **socialProfileId** | **UUID**|  | |
| **tenantId** | **UUID**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **curriculumExperienceUpdateDto** | [**CurriculumExperienceUpdateDto**](CurriculumExperienceUpdateDto.md)|  | [optional] |

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

