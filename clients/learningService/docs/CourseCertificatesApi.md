# CourseCertificatesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCourseCertificateAsync**](CourseCertificatesApi.md#createCourseCertificateAsync) | **POST** /api/v2/LearningService/CourseCertificates | Create a course certificate |
| [**createCourseCertificateTemplateAsync**](CourseCertificatesApi.md#createCourseCertificateTemplateAsync) | **POST** /api/v2/LearningService/CourseCertificates/Template | Create a certificate template |
| [**deleteCourseCertificateAsync**](CourseCertificatesApi.md#deleteCourseCertificateAsync) | **DELETE** /api/v2/LearningService/CourseCertificates/{courseCertificateId} | Delete a course certificate |
| [**deleteCourseCertificateTemplateAsync**](CourseCertificatesApi.md#deleteCourseCertificateTemplateAsync) | **DELETE** /api/v2/LearningService/CourseCertificates/Template/{courseCertificateTemplateId} | Delete a certificate template |
| [**getCourseCertificateAsync**](CourseCertificatesApi.md#getCourseCertificateAsync) | **GET** /api/v2/LearningService/CourseCertificates/{courseCertificateId} | Get course certificate by ID |
| [**getCourseCertificateTemplateAsync**](CourseCertificatesApi.md#getCourseCertificateTemplateAsync) | **GET** /api/v2/LearningService/CourseCertificates/Template/{courseCertificateTemplateId} | Get certificate template by ID |
| [**getCourseCertificateTemplatesAsync**](CourseCertificatesApi.md#getCourseCertificateTemplatesAsync) | **GET** /api/v2/LearningService/CourseCertificates/Template | Get all certificate templates |
| [**getCourseCertificatesAsync**](CourseCertificatesApi.md#getCourseCertificatesAsync) | **GET** /api/v2/LearningService/CourseCertificates | Get all course certificates |
| [**getCourseCertificatesCountAsync**](CourseCertificatesApi.md#getCourseCertificatesCountAsync) | **GET** /api/v2/LearningService/CourseCertificates/Count | Get course certificates count |
| [**updateCourseCertificateAsync**](CourseCertificatesApi.md#updateCourseCertificateAsync) | **PUT** /api/v2/LearningService/CourseCertificates/{courseCertificateId} | Update a course certificate |


<a id="createCourseCertificateAsync"></a>
# **createCourseCertificateAsync**
> createCourseCertificateAsync(tenantId, apiVersion, xApiVersion, courseCompletionCertificateCreateDto)

Create a course certificate

Creates a new course certificate for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseCertificatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseCertificatesApi apiInstance = new CourseCertificatesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CourseCompletionCertificateCreateDto courseCompletionCertificateCreateDto = new CourseCompletionCertificateCreateDto(); // CourseCompletionCertificateCreateDto | 
    try {
      apiInstance.createCourseCertificateAsync(tenantId, apiVersion, xApiVersion, courseCompletionCertificateCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseCertificatesApi#createCourseCertificateAsync");
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
| **courseCompletionCertificateCreateDto** | [**CourseCompletionCertificateCreateDto**](CourseCompletionCertificateCreateDto.md)|  | [optional] |

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

<a id="createCourseCertificateTemplateAsync"></a>
# **createCourseCertificateTemplateAsync**
> createCourseCertificateTemplateAsync(tenantId, apiVersion, xApiVersion, courseCertificateTemplateCreateDto)

Create a certificate template

Creates a new course certificate template for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseCertificatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseCertificatesApi apiInstance = new CourseCertificatesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CourseCertificateTemplateCreateDto courseCertificateTemplateCreateDto = new CourseCertificateTemplateCreateDto(); // CourseCertificateTemplateCreateDto | 
    try {
      apiInstance.createCourseCertificateTemplateAsync(tenantId, apiVersion, xApiVersion, courseCertificateTemplateCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseCertificatesApi#createCourseCertificateTemplateAsync");
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
| **courseCertificateTemplateCreateDto** | [**CourseCertificateTemplateCreateDto**](CourseCertificateTemplateCreateDto.md)|  | [optional] |

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

<a id="deleteCourseCertificateAsync"></a>
# **deleteCourseCertificateAsync**
> deleteCourseCertificateAsync(tenantId, courseCertificateId, apiVersion, xApiVersion)

Delete a course certificate

Deletes a course certificate for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseCertificatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseCertificatesApi apiInstance = new CourseCertificatesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID courseCertificateId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteCourseCertificateAsync(tenantId, courseCertificateId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseCertificatesApi#deleteCourseCertificateAsync");
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
| **courseCertificateId** | **UUID**|  | |
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

<a id="deleteCourseCertificateTemplateAsync"></a>
# **deleteCourseCertificateTemplateAsync**
> deleteCourseCertificateTemplateAsync(tenantId, courseCertificateTemplateId, apiVersion, xApiVersion)

Delete a certificate template

Deletes a course certificate template for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseCertificatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseCertificatesApi apiInstance = new CourseCertificatesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID courseCertificateTemplateId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteCourseCertificateTemplateAsync(tenantId, courseCertificateTemplateId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseCertificatesApi#deleteCourseCertificateTemplateAsync");
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
| **courseCertificateTemplateId** | **UUID**|  | |
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

<a id="getCourseCertificateAsync"></a>
# **getCourseCertificateAsync**
> CourseCompletionCertificateDto getCourseCertificateAsync(tenantId, courseCertificateId, apiVersion, xApiVersion)

Get course certificate by ID

Retrieves a specific course certificate by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseCertificatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseCertificatesApi apiInstance = new CourseCertificatesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID courseCertificateId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CourseCompletionCertificateDto result = apiInstance.getCourseCertificateAsync(tenantId, courseCertificateId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseCertificatesApi#getCourseCertificateAsync");
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
| **courseCertificateId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CourseCompletionCertificateDto**](CourseCompletionCertificateDto.md)

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

<a id="getCourseCertificateTemplateAsync"></a>
# **getCourseCertificateTemplateAsync**
> CourseCertificateTemplateDto getCourseCertificateTemplateAsync(tenantId, courseCertificateTemplateId, apiVersion, xApiVersion)

Get certificate template by ID

Retrieves a specific course certificate template by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseCertificatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseCertificatesApi apiInstance = new CourseCertificatesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID courseCertificateTemplateId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CourseCertificateTemplateDto result = apiInstance.getCourseCertificateTemplateAsync(tenantId, courseCertificateTemplateId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseCertificatesApi#getCourseCertificateTemplateAsync");
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
| **courseCertificateTemplateId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CourseCertificateTemplateDto**](CourseCertificateTemplateDto.md)

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

<a id="getCourseCertificateTemplatesAsync"></a>
# **getCourseCertificateTemplatesAsync**
> List&lt;CourseCertificateTemplateDto&gt; getCourseCertificateTemplatesAsync(tenantId, apiVersion, xApiVersion)

Get all certificate templates

Retrieves all course certificate templates for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseCertificatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseCertificatesApi apiInstance = new CourseCertificatesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<CourseCertificateTemplateDto> result = apiInstance.getCourseCertificateTemplatesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseCertificatesApi#getCourseCertificateTemplatesAsync");
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

[**List&lt;CourseCertificateTemplateDto&gt;**](CourseCertificateTemplateDto.md)

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

<a id="getCourseCertificatesAsync"></a>
# **getCourseCertificatesAsync**
> List&lt;CourseCompletionCertificateDto&gt; getCourseCertificatesAsync(tenantId, apiVersion, xApiVersion)

Get all course certificates

Retrieves all course certificates for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseCertificatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseCertificatesApi apiInstance = new CourseCertificatesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<CourseCompletionCertificateDto> result = apiInstance.getCourseCertificatesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseCertificatesApi#getCourseCertificatesAsync");
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

[**List&lt;CourseCompletionCertificateDto&gt;**](CourseCompletionCertificateDto.md)

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

<a id="getCourseCertificatesCountAsync"></a>
# **getCourseCertificatesCountAsync**
> Integer getCourseCertificatesCountAsync(tenantId, apiVersion, xApiVersion)

Get course certificates count

Returns the count of course certificates for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseCertificatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseCertificatesApi apiInstance = new CourseCertificatesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Integer result = apiInstance.getCourseCertificatesCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseCertificatesApi#getCourseCertificatesCountAsync");
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

<a id="updateCourseCertificateAsync"></a>
# **updateCourseCertificateAsync**
> updateCourseCertificateAsync(tenantId, courseCertificateId, apiVersion, xApiVersion, courseCompletionCertificateUpdateDto)

Update a course certificate

Updates an existing course certificate for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseCertificatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CourseCertificatesApi apiInstance = new CourseCertificatesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID courseCertificateId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CourseCompletionCertificateUpdateDto courseCompletionCertificateUpdateDto = new CourseCompletionCertificateUpdateDto(); // CourseCompletionCertificateUpdateDto | 
    try {
      apiInstance.updateCourseCertificateAsync(tenantId, courseCertificateId, apiVersion, xApiVersion, courseCompletionCertificateUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseCertificatesApi#updateCourseCertificateAsync");
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
| **courseCertificateId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **courseCompletionCertificateUpdateDto** | [**CourseCompletionCertificateUpdateDto**](CourseCompletionCertificateUpdateDto.md)|  | [optional] |

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

