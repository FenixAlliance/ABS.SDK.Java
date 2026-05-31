# CourseTeamMembershipsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCourseTeamMembershipAsync**](CourseTeamMembershipsApi.md#createCourseTeamMembershipAsync) | **POST** /api/v2/LearningService/CourseTeamMemberships | Create a course team membership |
| [**deleteCourseTeamMembershipAsync**](CourseTeamMembershipsApi.md#deleteCourseTeamMembershipAsync) | **DELETE** /api/v2/LearningService/CourseTeamMemberships/{membershipId} | Delete a course team membership |
| [**getCourseTeamMembershipByIdAsync**](CourseTeamMembershipsApi.md#getCourseTeamMembershipByIdAsync) | **GET** /api/v2/LearningService/CourseTeamMemberships/{membershipId} | Get course team membership by ID |
| [**getCourseTeamMembershipsAsync**](CourseTeamMembershipsApi.md#getCourseTeamMembershipsAsync) | **GET** /api/v2/LearningService/CourseTeamMemberships | Get all course team memberships |
| [**getCourseTeamMembershipsCountAsync**](CourseTeamMembershipsApi.md#getCourseTeamMembershipsCountAsync) | **GET** /api/v2/LearningService/CourseTeamMemberships/Count | Get course team memberships count |
| [**updateCourseTeamMembershipAsync**](CourseTeamMembershipsApi.md#updateCourseTeamMembershipAsync) | **PUT** /api/v2/LearningService/CourseTeamMemberships/{membershipId} | Update a course team membership |


<a id="createCourseTeamMembershipAsync"></a>
# **createCourseTeamMembershipAsync**
> createCourseTeamMembershipAsync(tenantId, apiVersion, xApiVersion, courseTeamMembershipCreateDto)

Create a course team membership

Creates a new course team membership for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseTeamMembershipsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseTeamMembershipsApi apiInstance = new CourseTeamMembershipsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CourseTeamMembershipCreateDto courseTeamMembershipCreateDto = new CourseTeamMembershipCreateDto(); // CourseTeamMembershipCreateDto | 
    try {
      apiInstance.createCourseTeamMembershipAsync(tenantId, apiVersion, xApiVersion, courseTeamMembershipCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseTeamMembershipsApi#createCourseTeamMembershipAsync");
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
| **courseTeamMembershipCreateDto** | [**CourseTeamMembershipCreateDto**](CourseTeamMembershipCreateDto.md)|  | [optional] |

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
| **201** | Created |  -  |

<a id="deleteCourseTeamMembershipAsync"></a>
# **deleteCourseTeamMembershipAsync**
> deleteCourseTeamMembershipAsync(tenantId, membershipId, apiVersion, xApiVersion)

Delete a course team membership

Deletes a course team membership by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseTeamMembershipsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseTeamMembershipsApi apiInstance = new CourseTeamMembershipsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String membershipId = "membershipId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteCourseTeamMembershipAsync(tenantId, membershipId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseTeamMembershipsApi#deleteCourseTeamMembershipAsync");
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
| **membershipId** | **String**|  | |
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

<a id="getCourseTeamMembershipByIdAsync"></a>
# **getCourseTeamMembershipByIdAsync**
> CourseTeamMembershipDto getCourseTeamMembershipByIdAsync(membershipId, apiVersion, xApiVersion)

Get course team membership by ID

Retrieves a specific course team membership by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseTeamMembershipsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseTeamMembershipsApi apiInstance = new CourseTeamMembershipsApi(defaultClient);
    String membershipId = "membershipId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CourseTeamMembershipDto result = apiInstance.getCourseTeamMembershipByIdAsync(membershipId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseTeamMembershipsApi#getCourseTeamMembershipByIdAsync");
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
| **membershipId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CourseTeamMembershipDto**](CourseTeamMembershipDto.md)

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

<a id="getCourseTeamMembershipsAsync"></a>
# **getCourseTeamMembershipsAsync**
> List&lt;CourseTeamMembershipDto&gt; getCourseTeamMembershipsAsync(tenantId, apiVersion, xApiVersion)

Get all course team memberships

Retrieves all course team memberships for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseTeamMembershipsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseTeamMembershipsApi apiInstance = new CourseTeamMembershipsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<CourseTeamMembershipDto> result = apiInstance.getCourseTeamMembershipsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseTeamMembershipsApi#getCourseTeamMembershipsAsync");
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

[**List&lt;CourseTeamMembershipDto&gt;**](CourseTeamMembershipDto.md)

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

<a id="getCourseTeamMembershipsCountAsync"></a>
# **getCourseTeamMembershipsCountAsync**
> Integer getCourseTeamMembershipsCountAsync(tenantId, apiVersion, xApiVersion)

Get course team memberships count

Returns the count of course team memberships for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseTeamMembershipsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseTeamMembershipsApi apiInstance = new CourseTeamMembershipsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Integer result = apiInstance.getCourseTeamMembershipsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseTeamMembershipsApi#getCourseTeamMembershipsCountAsync");
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

<a id="updateCourseTeamMembershipAsync"></a>
# **updateCourseTeamMembershipAsync**
> updateCourseTeamMembershipAsync(tenantId, membershipId, apiVersion, xApiVersion, courseTeamMembershipUpdateDto)

Update a course team membership

Updates an existing course team membership.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CourseTeamMembershipsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CourseTeamMembershipsApi apiInstance = new CourseTeamMembershipsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String membershipId = "membershipId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CourseTeamMembershipUpdateDto courseTeamMembershipUpdateDto = new CourseTeamMembershipUpdateDto(); // CourseTeamMembershipUpdateDto | 
    try {
      apiInstance.updateCourseTeamMembershipAsync(tenantId, membershipId, apiVersion, xApiVersion, courseTeamMembershipUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseTeamMembershipsApi#updateCourseTeamMembershipAsync");
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
| **membershipId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **courseTeamMembershipUpdateDto** | [**CourseTeamMembershipUpdateDto**](CourseTeamMembershipUpdateDto.md)|  | [optional] |

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

