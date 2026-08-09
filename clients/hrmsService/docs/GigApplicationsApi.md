# GigApplicationsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**acceptGigApplicationAsync**](GigApplicationsApi.md#acceptGigApplicationAsync) | **POST** /api/v2/HrmsService/GigApplications/{gigApplicationId}/Accept | Accept a gig application |
| [**createGigApplicationAsync**](GigApplicationsApi.md#createGigApplicationAsync) | **POST** /api/v2/HrmsService/GigApplications | Create a gig application |
| [**deleteGigApplicationAsync**](GigApplicationsApi.md#deleteGigApplicationAsync) | **DELETE** /api/v2/HrmsService/GigApplications/{gigApplicationId} | Delete a gig application |
| [**getGigApplicationByIdAsync**](GigApplicationsApi.md#getGigApplicationByIdAsync) | **GET** /api/v2/HrmsService/GigApplications/{gigApplicationId} | Get gig application by ID |
| [**getGigApplicationsAsync**](GigApplicationsApi.md#getGigApplicationsAsync) | **GET** /api/v2/HrmsService/GigApplications | Get gig applications |
| [**getGigApplicationsCountAsync**](GigApplicationsApi.md#getGigApplicationsCountAsync) | **GET** /api/v2/HrmsService/GigApplications/Count | Count gig applications |
| [**patchGigApplicationAsync**](GigApplicationsApi.md#patchGigApplicationAsync) | **PATCH** /api/v2/HrmsService/GigApplications/{gigApplicationId} | Patch a gig application |
| [**updateGigApplicationAsync**](GigApplicationsApi.md#updateGigApplicationAsync) | **PUT** /api/v2/HrmsService/GigApplications/{gigApplicationId} | Update a gig application |


<a id="acceptGigApplicationAsync"></a>
# **acceptGigApplicationAsync**
> EmptyEnvelope acceptGigApplicationAsync(tenantId, gigApplicationId, apiVersion, xApiVersion)

Accept a gig application

Accepts the candidate&#39;s gig proposal, forming an engagement (raises GigApplicationAccepted). A proposal cannot be accepted twice.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GigApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    GigApplicationsApi apiInstance = new GigApplicationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID gigApplicationId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.acceptGigApplicationAsync(tenantId, gigApplicationId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GigApplicationsApi#acceptGigApplicationAsync");
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
| **gigApplicationId** | **UUID**|  | |
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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

<a id="createGigApplicationAsync"></a>
# **createGigApplicationAsync**
> EmptyEnvelope createGigApplicationAsync(tenantId, apiVersion, xApiVersion, gigApplicationCreateDto)

Create a gig application

Records a candidate&#39;s proposal against one of the tenant&#39;s gigs. The targeted gig must belong to the tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GigApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    GigApplicationsApi apiInstance = new GigApplicationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    GigApplicationCreateDto gigApplicationCreateDto = new GigApplicationCreateDto(); // GigApplicationCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createGigApplicationAsync(tenantId, apiVersion, xApiVersion, gigApplicationCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GigApplicationsApi#createGigApplicationAsync");
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
| **gigApplicationCreateDto** | [**GigApplicationCreateDto**](GigApplicationCreateDto.md)|  | [optional] |

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

<a id="deleteGigApplicationAsync"></a>
# **deleteGigApplicationAsync**
> EmptyEnvelope deleteGigApplicationAsync(tenantId, gigApplicationId, apiVersion, xApiVersion)

Delete a gig application

Removes a proposal submitted against one of the tenant&#39;s gigs.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GigApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    GigApplicationsApi apiInstance = new GigApplicationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID gigApplicationId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteGigApplicationAsync(tenantId, gigApplicationId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GigApplicationsApi#deleteGigApplicationAsync");
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
| **gigApplicationId** | **UUID**|  | |
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

<a id="getGigApplicationByIdAsync"></a>
# **getGigApplicationByIdAsync**
> GigApplicationDtoEnvelope getGigApplicationByIdAsync(tenantId, gigApplicationId, apiVersion, xApiVersion)

Get gig application by ID

Retrieves a specific proposal submitted against one of the tenant&#39;s gigs.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GigApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    GigApplicationsApi apiInstance = new GigApplicationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID gigApplicationId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      GigApplicationDtoEnvelope result = apiInstance.getGigApplicationByIdAsync(tenantId, gigApplicationId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GigApplicationsApi#getGigApplicationByIdAsync");
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
| **gigApplicationId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**GigApplicationDtoEnvelope**](GigApplicationDtoEnvelope.md)

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

<a id="getGigApplicationsAsync"></a>
# **getGigApplicationsAsync**
> GigApplicationDtoListEnvelope getGigApplicationsAsync(tenantId, apiVersion, xApiVersion, gigApplicationDtoCollectionQueryParameters)

Get gig applications

Retrieves proposals submitted against the tenant&#39;s gigs. Filter with &#x60;$filter&#x3D;GigId eq &#39;...&#39;&#x60; or &#x60;JobApplicantProfileId eq &#39;...&#39;&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GigApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    GigApplicationsApi apiInstance = new GigApplicationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    GigApplicationDtoCollectionQueryParameters gigApplicationDtoCollectionQueryParameters = new GigApplicationDtoCollectionQueryParameters(); // GigApplicationDtoCollectionQueryParameters | 
    try {
      GigApplicationDtoListEnvelope result = apiInstance.getGigApplicationsAsync(tenantId, apiVersion, xApiVersion, gigApplicationDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GigApplicationsApi#getGigApplicationsAsync");
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
| **gigApplicationDtoCollectionQueryParameters** | [**GigApplicationDtoCollectionQueryParameters**](GigApplicationDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**GigApplicationDtoListEnvelope**](GigApplicationDtoListEnvelope.md)

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

<a id="getGigApplicationsCountAsync"></a>
# **getGigApplicationsCountAsync**
> Int32Envelope getGigApplicationsCountAsync(tenantId, apiVersion, xApiVersion, gigApplicationDtoCollectionQueryParameters)

Count gig applications

Counts proposals submitted against the tenant&#39;s gigs.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GigApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    GigApplicationsApi apiInstance = new GigApplicationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    GigApplicationDtoCollectionQueryParameters gigApplicationDtoCollectionQueryParameters = new GigApplicationDtoCollectionQueryParameters(); // GigApplicationDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getGigApplicationsCountAsync(tenantId, apiVersion, xApiVersion, gigApplicationDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GigApplicationsApi#getGigApplicationsCountAsync");
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
| **gigApplicationDtoCollectionQueryParameters** | [**GigApplicationDtoCollectionQueryParameters**](GigApplicationDtoCollectionQueryParameters.md)|  | [optional] |

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

<a id="patchGigApplicationAsync"></a>
# **patchGigApplicationAsync**
> EmptyEnvelope patchGigApplicationAsync(tenantId, gigApplicationId, apiVersion, xApiVersion, patchOperation)

Patch a gig application

Partially updates an existing proposal submitted against one of the tenant&#39;s gigs.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GigApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    GigApplicationsApi apiInstance = new GigApplicationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID gigApplicationId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    List<PatchOperation> patchOperation = Arrays.asList(); // List<PatchOperation> | 
    try {
      EmptyEnvelope result = apiInstance.patchGigApplicationAsync(tenantId, gigApplicationId, apiVersion, xApiVersion, patchOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GigApplicationsApi#patchGigApplicationAsync");
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
| **gigApplicationId** | **UUID**|  | |
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

<a id="updateGigApplicationAsync"></a>
# **updateGigApplicationAsync**
> EmptyEnvelope updateGigApplicationAsync(tenantId, gigApplicationId, apiVersion, xApiVersion, gigApplicationUpdateDto)

Update a gig application

Updates an existing proposal submitted against one of the tenant&#39;s gigs (e.g. accept it).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GigApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    GigApplicationsApi apiInstance = new GigApplicationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID gigApplicationId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    GigApplicationUpdateDto gigApplicationUpdateDto = new GigApplicationUpdateDto(); // GigApplicationUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateGigApplicationAsync(tenantId, gigApplicationId, apiVersion, xApiVersion, gigApplicationUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GigApplicationsApi#updateGigApplicationAsync");
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
| **gigApplicationId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **gigApplicationUpdateDto** | [**GigApplicationUpdateDto**](GigApplicationUpdateDto.md)|  | [optional] |

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

