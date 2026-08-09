# BusinessRelationshipsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBusinessRelationshipAsync**](BusinessRelationshipsApi.md#createBusinessRelationshipAsync) | **POST** /api/v2/TenantsService/BusinessRelationships | Create a business relationship |
| [**deleteBusinessRelationshipAsync**](BusinessRelationshipsApi.md#deleteBusinessRelationshipAsync) | **DELETE** /api/v2/TenantsService/BusinessRelationships/{businessRelationshipId} | Delete a business relationship |
| [**getBusinessRelationshipByIdAsync**](BusinessRelationshipsApi.md#getBusinessRelationshipByIdAsync) | **GET** /api/v2/TenantsService/BusinessRelationships/{businessRelationshipId} | Get business relationship by ID |
| [**getBusinessRelationshipsAsync**](BusinessRelationshipsApi.md#getBusinessRelationshipsAsync) | **GET** /api/v2/TenantsService/BusinessRelationships | Get business relationships |
| [**getBusinessRelationshipsCountAsync**](BusinessRelationshipsApi.md#getBusinessRelationshipsCountAsync) | **GET** /api/v2/TenantsService/BusinessRelationships/Count | Get business relationships count |
| [**updateBusinessRelationshipAsync**](BusinessRelationshipsApi.md#updateBusinessRelationshipAsync) | **PUT** /api/v2/TenantsService/BusinessRelationships/{businessRelationshipId} | Update a business relationship |


<a id="createBusinessRelationshipAsync"></a>
# **createBusinessRelationshipAsync**
> EmptyEnvelope createBusinessRelationshipAsync(tenantId, businessRelationshipCreateDto, apiVersion, xApiVersion)

Create a business relationship

Creates a new business relationship owned by the specified parent tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BusinessRelationshipsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BusinessRelationshipsApi apiInstance = new BusinessRelationshipsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    BusinessRelationshipCreateDto businessRelationshipCreateDto = new BusinessRelationshipCreateDto(); // BusinessRelationshipCreateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.createBusinessRelationshipAsync(tenantId, businessRelationshipCreateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessRelationshipsApi#createBusinessRelationshipAsync");
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
| **businessRelationshipCreateDto** | [**BusinessRelationshipCreateDto**](BusinessRelationshipCreateDto.md)|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

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

<a id="deleteBusinessRelationshipAsync"></a>
# **deleteBusinessRelationshipAsync**
> EmptyEnvelope deleteBusinessRelationshipAsync(tenantId, businessRelationshipId, apiVersion, xApiVersion)

Delete a business relationship

Deletes a business relationship by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BusinessRelationshipsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BusinessRelationshipsApi apiInstance = new BusinessRelationshipsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID businessRelationshipId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteBusinessRelationshipAsync(tenantId, businessRelationshipId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessRelationshipsApi#deleteBusinessRelationshipAsync");
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
| **businessRelationshipId** | **UUID**|  | |
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

<a id="getBusinessRelationshipByIdAsync"></a>
# **getBusinessRelationshipByIdAsync**
> BusinessRelationshipDtoEnvelope getBusinessRelationshipByIdAsync(tenantId, businessRelationshipId, apiVersion, xApiVersion)

Get business relationship by ID

Retrieves the details of a specific business relationship by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BusinessRelationshipsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BusinessRelationshipsApi apiInstance = new BusinessRelationshipsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID businessRelationshipId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      BusinessRelationshipDtoEnvelope result = apiInstance.getBusinessRelationshipByIdAsync(tenantId, businessRelationshipId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessRelationshipsApi#getBusinessRelationshipByIdAsync");
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
| **businessRelationshipId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**BusinessRelationshipDtoEnvelope**](BusinessRelationshipDtoEnvelope.md)

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

<a id="getBusinessRelationshipsAsync"></a>
# **getBusinessRelationshipsAsync**
> BusinessRelationshipDtoListEnvelope getBusinessRelationshipsAsync(tenantId, apiVersion, xApiVersion, businessRelationshipDtoCollectionQueryParameters)

Get business relationships

Retrieves the child business relationships owned by the specified parent tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BusinessRelationshipsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BusinessRelationshipsApi apiInstance = new BusinessRelationshipsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    BusinessRelationshipDtoCollectionQueryParameters businessRelationshipDtoCollectionQueryParameters = new BusinessRelationshipDtoCollectionQueryParameters(); // BusinessRelationshipDtoCollectionQueryParameters | 
    try {
      BusinessRelationshipDtoListEnvelope result = apiInstance.getBusinessRelationshipsAsync(tenantId, apiVersion, xApiVersion, businessRelationshipDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessRelationshipsApi#getBusinessRelationshipsAsync");
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
| **businessRelationshipDtoCollectionQueryParameters** | [**BusinessRelationshipDtoCollectionQueryParameters**](BusinessRelationshipDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**BusinessRelationshipDtoListEnvelope**](BusinessRelationshipDtoListEnvelope.md)

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

<a id="getBusinessRelationshipsCountAsync"></a>
# **getBusinessRelationshipsCountAsync**
> Int32Envelope getBusinessRelationshipsCountAsync(tenantId, apiVersion, xApiVersion, businessRelationshipDtoCollectionQueryParameters)

Get business relationships count

Returns the count of child business relationships owned by the specified parent tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BusinessRelationshipsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BusinessRelationshipsApi apiInstance = new BusinessRelationshipsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    BusinessRelationshipDtoCollectionQueryParameters businessRelationshipDtoCollectionQueryParameters = new BusinessRelationshipDtoCollectionQueryParameters(); // BusinessRelationshipDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getBusinessRelationshipsCountAsync(tenantId, apiVersion, xApiVersion, businessRelationshipDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessRelationshipsApi#getBusinessRelationshipsCountAsync");
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
| **businessRelationshipDtoCollectionQueryParameters** | [**BusinessRelationshipDtoCollectionQueryParameters**](BusinessRelationshipDtoCollectionQueryParameters.md)|  | [optional] |

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

<a id="updateBusinessRelationshipAsync"></a>
# **updateBusinessRelationshipAsync**
> EmptyEnvelope updateBusinessRelationshipAsync(tenantId, businessRelationshipId, businessRelationshipUpdateDto, apiVersion, xApiVersion)

Update a business relationship

Updates an existing business relationship by its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BusinessRelationshipsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    BusinessRelationshipsApi apiInstance = new BusinessRelationshipsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID businessRelationshipId = UUID.randomUUID(); // UUID | 
    BusinessRelationshipUpdateDto businessRelationshipUpdateDto = new BusinessRelationshipUpdateDto(); // BusinessRelationshipUpdateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.updateBusinessRelationshipAsync(tenantId, businessRelationshipId, businessRelationshipUpdateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessRelationshipsApi#updateBusinessRelationshipAsync");
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
| **businessRelationshipId** | **UUID**|  | |
| **businessRelationshipUpdateDto** | [**BusinessRelationshipUpdateDto**](BusinessRelationshipUpdateDto.md)|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

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

