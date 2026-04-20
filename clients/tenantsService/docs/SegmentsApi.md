# SegmentsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTenantSegment**](SegmentsApi.md#createTenantSegment) | **POST** /api/v2/TenantsService/Segments | Create a new tenant segment |
| [**deleteTenantSegment**](SegmentsApi.md#deleteTenantSegment) | **DELETE** /api/v2/TenantsService/Segments/{tenantSegmentId} | Delete a tenant segment |
| [**getTenantSegmentById**](SegmentsApi.md#getTenantSegmentById) | **GET** /api/v2/TenantsService/Segments/{tenantSegmentId} | Retrieve a single tenant segment by its ID |
| [**getTenantSegments**](SegmentsApi.md#getTenantSegments) | **GET** /api/v2/TenantsService/Segments | Retrieve a list of tenant segments |
| [**getTenantSegmentsCount**](SegmentsApi.md#getTenantSegmentsCount) | **GET** /api/v2/TenantsService/Segments/Count | Get the count of tenant segments |
| [**updateTenantSegment**](SegmentsApi.md#updateTenantSegment) | **PUT** /api/v2/TenantsService/Segments/{tenantSegmentId} | Update a tenant segment |


<a id="createTenantSegment"></a>
# **createTenantSegment**
> EmptyEnvelope createTenantSegment(tenantId, apiVersion, xApiVersion, tenantSegmentCreateDto)

Create a new tenant segment

Create a new tenant segment

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SegmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SegmentsApi apiInstance = new SegmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TenantSegmentCreateDto tenantSegmentCreateDto = new TenantSegmentCreateDto(); // TenantSegmentCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createTenantSegment(tenantId, apiVersion, xApiVersion, tenantSegmentCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsApi#createTenantSegment");
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
| **tenantSegmentCreateDto** | [**TenantSegmentCreateDto**](TenantSegmentCreateDto.md)|  | [optional] |

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

<a id="deleteTenantSegment"></a>
# **deleteTenantSegment**
> EmptyEnvelope deleteTenantSegment(tenantId, tenantSegmentId, apiVersion, xApiVersion)

Delete a tenant segment

Delete a tenant segment

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SegmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SegmentsApi apiInstance = new SegmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID tenantSegmentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteTenantSegment(tenantId, tenantSegmentId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsApi#deleteTenantSegment");
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
| **tenantSegmentId** | **UUID**|  | |
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

<a id="getTenantSegmentById"></a>
# **getTenantSegmentById**
> TenantSegmentDtoEnvelope getTenantSegmentById(tenantId, tenantSegmentId, apiVersion, xApiVersion)

Retrieve a single tenant segment by its ID

Retrieve a single tenant segment by its ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SegmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SegmentsApi apiInstance = new SegmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID tenantSegmentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TenantSegmentDtoEnvelope result = apiInstance.getTenantSegmentById(tenantId, tenantSegmentId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsApi#getTenantSegmentById");
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
| **tenantSegmentId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**TenantSegmentDtoEnvelope**](TenantSegmentDtoEnvelope.md)

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

<a id="getTenantSegments"></a>
# **getTenantSegments**
> TenantSegmentDtoListEnvelope getTenantSegments(tenantId, apiVersion, xApiVersion)

Retrieve a list of tenant segments

Retrieve a list of tenant segments

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SegmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SegmentsApi apiInstance = new SegmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TenantSegmentDtoListEnvelope result = apiInstance.getTenantSegments(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsApi#getTenantSegments");
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

[**TenantSegmentDtoListEnvelope**](TenantSegmentDtoListEnvelope.md)

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

<a id="getTenantSegmentsCount"></a>
# **getTenantSegmentsCount**
> Int32Envelope getTenantSegmentsCount(tenantId, apiVersion, xApiVersion)

Get the count of tenant segments

Get the count of tenant segments

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SegmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SegmentsApi apiInstance = new SegmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getTenantSegmentsCount(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsApi#getTenantSegmentsCount");
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

<a id="updateTenantSegment"></a>
# **updateTenantSegment**
> EmptyEnvelope updateTenantSegment(tenantId, tenantSegmentId, apiVersion, xApiVersion, tenantSegmentUpdateDto)

Update a tenant segment

Update a tenant segment

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SegmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SegmentsApi apiInstance = new SegmentsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID tenantSegmentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TenantSegmentUpdateDto tenantSegmentUpdateDto = new TenantSegmentUpdateDto(); // TenantSegmentUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateTenantSegment(tenantId, tenantSegmentId, apiVersion, xApiVersion, tenantSegmentUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsApi#updateTenantSegment");
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
| **tenantSegmentId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **tenantSegmentUpdateDto** | [**TenantSegmentUpdateDto**](TenantSegmentUpdateDto.md)|  | [optional] |

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

