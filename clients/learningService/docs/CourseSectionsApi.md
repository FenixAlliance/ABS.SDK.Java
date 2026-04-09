# CourseSectionsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCourseSectionAsync**](CourseSectionsApi.md#createCourseSectionAsync) | **POST** /api/v2/LearningService/CourseSections | Create a new course section |
| [**deleteCourseSectionAsync**](CourseSectionsApi.md#deleteCourseSectionAsync) | **DELETE** /api/v2/LearningService/CourseSections/{sectionId} | Delete a course section |
| [**getCourseSectionByIdAsync**](CourseSectionsApi.md#getCourseSectionByIdAsync) | **GET** /api/v2/LearningService/CourseSections/{sectionId} | Get course section by ID |
| [**getCourseSectionsAsync**](CourseSectionsApi.md#getCourseSectionsAsync) | **GET** /api/v2/LearningService/CourseSections | Get all course sections |
| [**getCourseSectionsCountAsync**](CourseSectionsApi.md#getCourseSectionsCountAsync) | **GET** /api/v2/LearningService/CourseSections/Count | Get course sections count |
| [**updateCourseSectionAsync**](CourseSectionsApi.md#updateCourseSectionAsync) | **PUT** /api/v2/LearningService/CourseSections/{sectionId} | Update a course section |


<a id="createCourseSectionAsync"></a>
# **createCourseSectionAsync**
> createCourseSectionAsync(tenantId, apiVersion, xApiVersion, courseSectionCreateDto)

Create a new course section

Creates a new course section for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseSectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseSectionsApi apiInstance = new CourseSectionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CourseSectionCreateDto courseSectionCreateDto = new CourseSectionCreateDto(); // CourseSectionCreateDto | 
    try {
      apiInstance.createCourseSectionAsync(tenantId, apiVersion, xApiVersion, courseSectionCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseSectionsApi#createCourseSectionAsync");
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
| **courseSectionCreateDto** | [**CourseSectionCreateDto**](CourseSectionCreateDto.md)|  | [optional] |

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

<a id="deleteCourseSectionAsync"></a>
# **deleteCourseSectionAsync**
> deleteCourseSectionAsync(tenantId, sectionId, apiVersion, xApiVersion)

Delete a course section

Deletes a course section for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseSectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseSectionsApi apiInstance = new CourseSectionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String sectionId = "sectionId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteCourseSectionAsync(tenantId, sectionId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseSectionsApi#deleteCourseSectionAsync");
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
| **sectionId** | **String**|  | |
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

<a id="getCourseSectionByIdAsync"></a>
# **getCourseSectionByIdAsync**
> CourseSectionDto getCourseSectionByIdAsync(sectionId, apiVersion, xApiVersion)

Get course section by ID

Retrieves a specific course section by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseSectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseSectionsApi apiInstance = new CourseSectionsApi(defaultClient);
    String sectionId = "sectionId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CourseSectionDto result = apiInstance.getCourseSectionByIdAsync(sectionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseSectionsApi#getCourseSectionByIdAsync");
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
| **sectionId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CourseSectionDto**](CourseSectionDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getCourseSectionsAsync"></a>
# **getCourseSectionsAsync**
> List&lt;CourseSectionDto&gt; getCourseSectionsAsync(tenantId, apiVersion, xApiVersion)

Get all course sections

Retrieves all course sections for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseSectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseSectionsApi apiInstance = new CourseSectionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<CourseSectionDto> result = apiInstance.getCourseSectionsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseSectionsApi#getCourseSectionsAsync");
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

[**List&lt;CourseSectionDto&gt;**](CourseSectionDto.md)

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

<a id="getCourseSectionsCountAsync"></a>
# **getCourseSectionsCountAsync**
> Integer getCourseSectionsCountAsync(tenantId, apiVersion, xApiVersion)

Get course sections count

Returns the count of course sections for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseSectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseSectionsApi apiInstance = new CourseSectionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Integer result = apiInstance.getCourseSectionsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseSectionsApi#getCourseSectionsCountAsync");
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

<a id="updateCourseSectionAsync"></a>
# **updateCourseSectionAsync**
> updateCourseSectionAsync(tenantId, sectionId, apiVersion, xApiVersion, courseSectionUpdateDto)

Update a course section

Updates an existing course section for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseSectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseSectionsApi apiInstance = new CourseSectionsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String sectionId = "sectionId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CourseSectionUpdateDto courseSectionUpdateDto = new CourseSectionUpdateDto(); // CourseSectionUpdateDto | 
    try {
      apiInstance.updateCourseSectionAsync(tenantId, sectionId, apiVersion, xApiVersion, courseSectionUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseSectionsApi#updateCourseSectionAsync");
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
| **sectionId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **courseSectionUpdateDto** | [**CourseSectionUpdateDto**](CourseSectionUpdateDto.md)|  | [optional] |

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

