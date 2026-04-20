# InstructorProfilesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2LearningServiceInstructorProfilesCountGet**](InstructorProfilesApi.md#apiV2LearningServiceInstructorProfilesCountGet) | **GET** /api/v2/LearningService/InstructorProfiles/Count |  |
| [**apiV2LearningServiceInstructorProfilesGet**](InstructorProfilesApi.md#apiV2LearningServiceInstructorProfilesGet) | **GET** /api/v2/LearningService/InstructorProfiles |  |
| [**apiV2LearningServiceInstructorProfilesInstructorProfileIdDelete**](InstructorProfilesApi.md#apiV2LearningServiceInstructorProfilesInstructorProfileIdDelete) | **DELETE** /api/v2/LearningService/InstructorProfiles/{instructorProfileId} |  |
| [**apiV2LearningServiceInstructorProfilesInstructorProfileIdGet**](InstructorProfilesApi.md#apiV2LearningServiceInstructorProfilesInstructorProfileIdGet) | **GET** /api/v2/LearningService/InstructorProfiles/{instructorProfileId} |  |
| [**apiV2LearningServiceInstructorProfilesInstructorProfileIdPut**](InstructorProfilesApi.md#apiV2LearningServiceInstructorProfilesInstructorProfileIdPut) | **PUT** /api/v2/LearningService/InstructorProfiles/{instructorProfileId} |  |
| [**apiV2LearningServiceInstructorProfilesPost**](InstructorProfilesApi.md#apiV2LearningServiceInstructorProfilesPost) | **POST** /api/v2/LearningService/InstructorProfiles |  |


<a id="apiV2LearningServiceInstructorProfilesCountGet"></a>
# **apiV2LearningServiceInstructorProfilesCountGet**
> Integer apiV2LearningServiceInstructorProfilesCountGet(tenantId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstructorProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InstructorProfilesApi apiInstance = new InstructorProfilesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Integer result = apiInstance.apiV2LearningServiceInstructorProfilesCountGet(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstructorProfilesApi#apiV2LearningServiceInstructorProfilesCountGet");
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

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **200** | OK |  -  |

<a id="apiV2LearningServiceInstructorProfilesGet"></a>
# **apiV2LearningServiceInstructorProfilesGet**
> List&lt;InstructorProfileDto&gt; apiV2LearningServiceInstructorProfilesGet(tenantId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstructorProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InstructorProfilesApi apiInstance = new InstructorProfilesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<InstructorProfileDto> result = apiInstance.apiV2LearningServiceInstructorProfilesGet(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstructorProfilesApi#apiV2LearningServiceInstructorProfilesGet");
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

[**List&lt;InstructorProfileDto&gt;**](InstructorProfileDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **200** | OK |  -  |

<a id="apiV2LearningServiceInstructorProfilesInstructorProfileIdDelete"></a>
# **apiV2LearningServiceInstructorProfilesInstructorProfileIdDelete**
> apiV2LearningServiceInstructorProfilesInstructorProfileIdDelete(tenantId, instructorProfileId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstructorProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InstructorProfilesApi apiInstance = new InstructorProfilesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID instructorProfileId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.apiV2LearningServiceInstructorProfilesInstructorProfileIdDelete(tenantId, instructorProfileId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstructorProfilesApi#apiV2LearningServiceInstructorProfilesInstructorProfileIdDelete");
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
| **instructorProfileId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **200** | OK |  -  |

<a id="apiV2LearningServiceInstructorProfilesInstructorProfileIdGet"></a>
# **apiV2LearningServiceInstructorProfilesInstructorProfileIdGet**
> InstructorProfileDto apiV2LearningServiceInstructorProfilesInstructorProfileIdGet(tenantId, instructorProfileId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstructorProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InstructorProfilesApi apiInstance = new InstructorProfilesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID instructorProfileId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      InstructorProfileDto result = apiInstance.apiV2LearningServiceInstructorProfilesInstructorProfileIdGet(tenantId, instructorProfileId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstructorProfilesApi#apiV2LearningServiceInstructorProfilesInstructorProfileIdGet");
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
| **instructorProfileId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**InstructorProfileDto**](InstructorProfileDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **200** | OK |  -  |

<a id="apiV2LearningServiceInstructorProfilesInstructorProfileIdPut"></a>
# **apiV2LearningServiceInstructorProfilesInstructorProfileIdPut**
> apiV2LearningServiceInstructorProfilesInstructorProfileIdPut(tenantId, instructorProfileId, apiVersion, xApiVersion, instructorProfileUpdateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstructorProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InstructorProfilesApi apiInstance = new InstructorProfilesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID instructorProfileId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    InstructorProfileUpdateDto instructorProfileUpdateDto = new InstructorProfileUpdateDto(); // InstructorProfileUpdateDto | 
    try {
      apiInstance.apiV2LearningServiceInstructorProfilesInstructorProfileIdPut(tenantId, instructorProfileId, apiVersion, xApiVersion, instructorProfileUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstructorProfilesApi#apiV2LearningServiceInstructorProfilesInstructorProfileIdPut");
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
| **instructorProfileId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **instructorProfileUpdateDto** | [**InstructorProfileUpdateDto**](InstructorProfileUpdateDto.md)|  | [optional] |

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
| **200** | OK |  -  |

<a id="apiV2LearningServiceInstructorProfilesPost"></a>
# **apiV2LearningServiceInstructorProfilesPost**
> apiV2LearningServiceInstructorProfilesPost(tenantId, apiVersion, xApiVersion, instructorProfileCreateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstructorProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InstructorProfilesApi apiInstance = new InstructorProfilesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    InstructorProfileCreateDto instructorProfileCreateDto = new InstructorProfileCreateDto(); // InstructorProfileCreateDto | 
    try {
      apiInstance.apiV2LearningServiceInstructorProfilesPost(tenantId, apiVersion, xApiVersion, instructorProfileCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstructorProfilesApi#apiV2LearningServiceInstructorProfilesPost");
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
| **instructorProfileCreateDto** | [**InstructorProfileCreateDto**](InstructorProfileCreateDto.md)|  | [optional] |

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
| **200** | OK |  -  |

