# StudentProfilesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2LearningServiceStudentProfilesCountGet**](StudentProfilesApi.md#apiV2LearningServiceStudentProfilesCountGet) | **GET** /api/v2/LearningService/StudentProfiles/Count |  |
| [**apiV2LearningServiceStudentProfilesGet**](StudentProfilesApi.md#apiV2LearningServiceStudentProfilesGet) | **GET** /api/v2/LearningService/StudentProfiles |  |
| [**apiV2LearningServiceStudentProfilesPost**](StudentProfilesApi.md#apiV2LearningServiceStudentProfilesPost) | **POST** /api/v2/LearningService/StudentProfiles |  |
| [**apiV2LearningServiceStudentProfilesStudentProfileIdAverageGet**](StudentProfilesApi.md#apiV2LearningServiceStudentProfilesStudentProfileIdAverageGet) | **GET** /api/v2/LearningService/StudentProfiles/{studentProfileId}/Average |  |
| [**apiV2LearningServiceStudentProfilesStudentProfileIdDelete**](StudentProfilesApi.md#apiV2LearningServiceStudentProfilesStudentProfileIdDelete) | **DELETE** /api/v2/LearningService/StudentProfiles/{studentProfileId} |  |
| [**apiV2LearningServiceStudentProfilesStudentProfileIdGet**](StudentProfilesApi.md#apiV2LearningServiceStudentProfilesStudentProfileIdGet) | **GET** /api/v2/LearningService/StudentProfiles/{studentProfileId} |  |
| [**apiV2LearningServiceStudentProfilesStudentProfileIdHoursCompletedGet**](StudentProfilesApi.md#apiV2LearningServiceStudentProfilesStudentProfileIdHoursCompletedGet) | **GET** /api/v2/LearningService/StudentProfiles/{studentProfileId}/HoursCompleted |  |
| [**apiV2LearningServiceStudentProfilesStudentProfileIdPut**](StudentProfilesApi.md#apiV2LearningServiceStudentProfilesStudentProfileIdPut) | **PUT** /api/v2/LearningService/StudentProfiles/{studentProfileId} |  |


<a id="apiV2LearningServiceStudentProfilesCountGet"></a>
# **apiV2LearningServiceStudentProfilesCountGet**
> Integer apiV2LearningServiceStudentProfilesCountGet(tenantId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StudentProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    StudentProfilesApi apiInstance = new StudentProfilesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Integer result = apiInstance.apiV2LearningServiceStudentProfilesCountGet(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StudentProfilesApi#apiV2LearningServiceStudentProfilesCountGet");
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

<a id="apiV2LearningServiceStudentProfilesGet"></a>
# **apiV2LearningServiceStudentProfilesGet**
> List&lt;StudentProfileDto&gt; apiV2LearningServiceStudentProfilesGet(tenantId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StudentProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    StudentProfilesApi apiInstance = new StudentProfilesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<StudentProfileDto> result = apiInstance.apiV2LearningServiceStudentProfilesGet(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StudentProfilesApi#apiV2LearningServiceStudentProfilesGet");
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

[**List&lt;StudentProfileDto&gt;**](StudentProfileDto.md)

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

<a id="apiV2LearningServiceStudentProfilesPost"></a>
# **apiV2LearningServiceStudentProfilesPost**
> apiV2LearningServiceStudentProfilesPost(tenantId, apiVersion, xApiVersion, studentProfileCreateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StudentProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    StudentProfilesApi apiInstance = new StudentProfilesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    StudentProfileCreateDto studentProfileCreateDto = new StudentProfileCreateDto(); // StudentProfileCreateDto | 
    try {
      apiInstance.apiV2LearningServiceStudentProfilesPost(tenantId, apiVersion, xApiVersion, studentProfileCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling StudentProfilesApi#apiV2LearningServiceStudentProfilesPost");
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
| **studentProfileCreateDto** | [**StudentProfileCreateDto**](StudentProfileCreateDto.md)|  | [optional] |

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

<a id="apiV2LearningServiceStudentProfilesStudentProfileIdAverageGet"></a>
# **apiV2LearningServiceStudentProfilesStudentProfileIdAverageGet**
> AverageDto apiV2LearningServiceStudentProfilesStudentProfileIdAverageGet(tenantId, studentProfileId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StudentProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    StudentProfilesApi apiInstance = new StudentProfilesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID studentProfileId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      AverageDto result = apiInstance.apiV2LearningServiceStudentProfilesStudentProfileIdAverageGet(tenantId, studentProfileId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StudentProfilesApi#apiV2LearningServiceStudentProfilesStudentProfileIdAverageGet");
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
| **studentProfileId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**AverageDto**](AverageDto.md)

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

<a id="apiV2LearningServiceStudentProfilesStudentProfileIdDelete"></a>
# **apiV2LearningServiceStudentProfilesStudentProfileIdDelete**
> apiV2LearningServiceStudentProfilesStudentProfileIdDelete(tenantId, studentProfileId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StudentProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    StudentProfilesApi apiInstance = new StudentProfilesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID studentProfileId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.apiV2LearningServiceStudentProfilesStudentProfileIdDelete(tenantId, studentProfileId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling StudentProfilesApi#apiV2LearningServiceStudentProfilesStudentProfileIdDelete");
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
| **studentProfileId** | **UUID**|  | |
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

<a id="apiV2LearningServiceStudentProfilesStudentProfileIdGet"></a>
# **apiV2LearningServiceStudentProfilesStudentProfileIdGet**
> StudentProfileDto apiV2LearningServiceStudentProfilesStudentProfileIdGet(tenantId, studentProfileId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StudentProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    StudentProfilesApi apiInstance = new StudentProfilesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID studentProfileId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      StudentProfileDto result = apiInstance.apiV2LearningServiceStudentProfilesStudentProfileIdGet(tenantId, studentProfileId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StudentProfilesApi#apiV2LearningServiceStudentProfilesStudentProfileIdGet");
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
| **studentProfileId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**StudentProfileDto**](StudentProfileDto.md)

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

<a id="apiV2LearningServiceStudentProfilesStudentProfileIdHoursCompletedGet"></a>
# **apiV2LearningServiceStudentProfilesStudentProfileIdHoursCompletedGet**
> CountDto apiV2LearningServiceStudentProfilesStudentProfileIdHoursCompletedGet(tenantId, studentProfileId, apiVersion, xApiVersion)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StudentProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    StudentProfilesApi apiInstance = new StudentProfilesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID studentProfileId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CountDto result = apiInstance.apiV2LearningServiceStudentProfilesStudentProfileIdHoursCompletedGet(tenantId, studentProfileId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StudentProfilesApi#apiV2LearningServiceStudentProfilesStudentProfileIdHoursCompletedGet");
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
| **studentProfileId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CountDto**](CountDto.md)

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

<a id="apiV2LearningServiceStudentProfilesStudentProfileIdPut"></a>
# **apiV2LearningServiceStudentProfilesStudentProfileIdPut**
> apiV2LearningServiceStudentProfilesStudentProfileIdPut(tenantId, studentProfileId, apiVersion, xApiVersion, studentProfileUpdateDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StudentProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    StudentProfilesApi apiInstance = new StudentProfilesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID studentProfileId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    StudentProfileUpdateDto studentProfileUpdateDto = new StudentProfileUpdateDto(); // StudentProfileUpdateDto | 
    try {
      apiInstance.apiV2LearningServiceStudentProfilesStudentProfileIdPut(tenantId, studentProfileId, apiVersion, xApiVersion, studentProfileUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling StudentProfilesApi#apiV2LearningServiceStudentProfilesStudentProfileIdPut");
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
| **studentProfileId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **studentProfileUpdateDto** | [**StudentProfileUpdateDto**](StudentProfileUpdateDto.md)|  | [optional] |

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

