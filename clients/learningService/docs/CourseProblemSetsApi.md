# CourseProblemSetsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCourseProblemSetAsync**](CourseProblemSetsApi.md#createCourseProblemSetAsync) | **POST** /api/v2/LearningService/CourseProblemSets | Create a new course problem set |
| [**deleteCourseProblemSetAsync**](CourseProblemSetsApi.md#deleteCourseProblemSetAsync) | **DELETE** /api/v2/LearningService/CourseProblemSets/{problemSetId} | Delete a course problem set |
| [**getCourseProblemSetByIdAsync**](CourseProblemSetsApi.md#getCourseProblemSetByIdAsync) | **GET** /api/v2/LearningService/CourseProblemSets/{problemSetId} | Get course problem set by ID |
| [**getCourseProblemSetsAsync**](CourseProblemSetsApi.md#getCourseProblemSetsAsync) | **GET** /api/v2/LearningService/CourseProblemSets | Get all course problem sets |
| [**getCourseProblemSetsCountAsync**](CourseProblemSetsApi.md#getCourseProblemSetsCountAsync) | **GET** /api/v2/LearningService/CourseProblemSets/Count | Get course problem sets count |
| [**updateCourseProblemSetAsync**](CourseProblemSetsApi.md#updateCourseProblemSetAsync) | **PUT** /api/v2/LearningService/CourseProblemSets/{problemSetId} | Update a course problem set |


<a id="createCourseProblemSetAsync"></a>
# **createCourseProblemSetAsync**
> createCourseProblemSetAsync(tenantId, apiVersion, xApiVersion, courseProblemSetCreateDto)

Create a new course problem set

Creates a new course problem set for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseProblemSetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseProblemSetsApi apiInstance = new CourseProblemSetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CourseProblemSetCreateDto courseProblemSetCreateDto = new CourseProblemSetCreateDto(); // CourseProblemSetCreateDto | 
    try {
      apiInstance.createCourseProblemSetAsync(tenantId, apiVersion, xApiVersion, courseProblemSetCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseProblemSetsApi#createCourseProblemSetAsync");
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
| **courseProblemSetCreateDto** | [**CourseProblemSetCreateDto**](CourseProblemSetCreateDto.md)|  | [optional] |

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

<a id="deleteCourseProblemSetAsync"></a>
# **deleteCourseProblemSetAsync**
> deleteCourseProblemSetAsync(tenantId, problemSetId, apiVersion, xApiVersion)

Delete a course problem set

Deletes a course problem set for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseProblemSetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseProblemSetsApi apiInstance = new CourseProblemSetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String problemSetId = "problemSetId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteCourseProblemSetAsync(tenantId, problemSetId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseProblemSetsApi#deleteCourseProblemSetAsync");
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
| **problemSetId** | **String**|  | |
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

<a id="getCourseProblemSetByIdAsync"></a>
# **getCourseProblemSetByIdAsync**
> CourseProblemSetDto getCourseProblemSetByIdAsync(problemSetId, apiVersion, xApiVersion)

Get course problem set by ID

Retrieves a specific course problem set by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseProblemSetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseProblemSetsApi apiInstance = new CourseProblemSetsApi(defaultClient);
    String problemSetId = "problemSetId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CourseProblemSetDto result = apiInstance.getCourseProblemSetByIdAsync(problemSetId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseProblemSetsApi#getCourseProblemSetByIdAsync");
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
| **problemSetId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CourseProblemSetDto**](CourseProblemSetDto.md)

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

<a id="getCourseProblemSetsAsync"></a>
# **getCourseProblemSetsAsync**
> List&lt;CourseProblemSetDto&gt; getCourseProblemSetsAsync(tenantId, apiVersion, xApiVersion)

Get all course problem sets

Retrieves all course problem sets for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseProblemSetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseProblemSetsApi apiInstance = new CourseProblemSetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<CourseProblemSetDto> result = apiInstance.getCourseProblemSetsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseProblemSetsApi#getCourseProblemSetsAsync");
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

[**List&lt;CourseProblemSetDto&gt;**](CourseProblemSetDto.md)

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

<a id="getCourseProblemSetsCountAsync"></a>
# **getCourseProblemSetsCountAsync**
> Integer getCourseProblemSetsCountAsync(tenantId, apiVersion, xApiVersion)

Get course problem sets count

Returns the count of course problem sets for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseProblemSetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseProblemSetsApi apiInstance = new CourseProblemSetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Integer result = apiInstance.getCourseProblemSetsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseProblemSetsApi#getCourseProblemSetsCountAsync");
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

<a id="updateCourseProblemSetAsync"></a>
# **updateCourseProblemSetAsync**
> updateCourseProblemSetAsync(tenantId, problemSetId, apiVersion, xApiVersion, courseProblemSetUpdateDto)

Update a course problem set

Updates an existing course problem set for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseProblemSetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseProblemSetsApi apiInstance = new CourseProblemSetsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String problemSetId = "problemSetId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CourseProblemSetUpdateDto courseProblemSetUpdateDto = new CourseProblemSetUpdateDto(); // CourseProblemSetUpdateDto | 
    try {
      apiInstance.updateCourseProblemSetAsync(tenantId, problemSetId, apiVersion, xApiVersion, courseProblemSetUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseProblemSetsApi#updateCourseProblemSetAsync");
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
| **problemSetId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **courseProblemSetUpdateDto** | [**CourseProblemSetUpdateDto**](CourseProblemSetUpdateDto.md)|  | [optional] |

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

