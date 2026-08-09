# ContactSourcesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createContactSourceAsync**](ContactSourcesApi.md#createContactSourceAsync) | **POST** /api/v2/CrmService/ContactSources | Create a new contact source |
| [**deleteContactSourceAsync**](ContactSourcesApi.md#deleteContactSourceAsync) | **DELETE** /api/v2/CrmService/ContactSources/{id} | Delete a contact source |
| [**getContactSourceByIdAsync**](ContactSourcesApi.md#getContactSourceByIdAsync) | **GET** /api/v2/CrmService/ContactSources/{id} | Get contact source by ID |
| [**getContactSourcesAsync**](ContactSourcesApi.md#getContactSourcesAsync) | **GET** /api/v2/CrmService/ContactSources | Get all contact sources |
| [**getContactSourcesCountAsync**](ContactSourcesApi.md#getContactSourcesCountAsync) | **GET** /api/v2/CrmService/ContactSources/Count | Get contact sources count |
| [**patchContactSourceAsync**](ContactSourcesApi.md#patchContactSourceAsync) | **PATCH** /api/v2/CrmService/ContactSources/{id} | Patch a contact source |
| [**updateContactSourceAsync**](ContactSourcesApi.md#updateContactSourceAsync) | **PUT** /api/v2/CrmService/ContactSources/{id} | Update a contact source |


<a id="createContactSourceAsync"></a>
# **createContactSourceAsync**
> createContactSourceAsync(tenantId, apiVersion, xApiVersion, contactSourceCreateDto)

Create a new contact source

Creates a new contact source for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactSourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactSourcesApi apiInstance = new ContactSourcesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ContactSourceCreateDto contactSourceCreateDto = new ContactSourceCreateDto(); // ContactSourceCreateDto | 
    try {
      apiInstance.createContactSourceAsync(tenantId, apiVersion, xApiVersion, contactSourceCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactSourcesApi#createContactSourceAsync");
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
| **contactSourceCreateDto** | [**ContactSourceCreateDto**](ContactSourceCreateDto.md)|  | [optional] |

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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

<a id="deleteContactSourceAsync"></a>
# **deleteContactSourceAsync**
> deleteContactSourceAsync(tenantId, id, apiVersion, xApiVersion)

Delete a contact source

Deletes a contact source for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactSourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactSourcesApi apiInstance = new ContactSourcesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteContactSourceAsync(tenantId, id, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactSourcesApi#deleteContactSourceAsync");
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
| **id** | **UUID**|  | |
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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getContactSourceByIdAsync"></a>
# **getContactSourceByIdAsync**
> ContactSourceDto getContactSourceByIdAsync(tenantId, id, apiVersion, xApiVersion)

Get contact source by ID

Retrieves a specific contact source by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactSourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactSourcesApi apiInstance = new ContactSourcesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ContactSourceDto result = apiInstance.getContactSourceByIdAsync(tenantId, id, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactSourcesApi#getContactSourceByIdAsync");
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
| **id** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ContactSourceDto**](ContactSourceDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getContactSourcesAsync"></a>
# **getContactSourcesAsync**
> ContactSourceDtoListEnvelope getContactSourcesAsync(tenantId, apiVersion, xApiVersion, contactSourceDtoCollectionQueryParameters)

Get all contact sources

Retrieves all contact sources for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactSourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactSourcesApi apiInstance = new ContactSourcesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ContactSourceDtoCollectionQueryParameters contactSourceDtoCollectionQueryParameters = new ContactSourceDtoCollectionQueryParameters(); // ContactSourceDtoCollectionQueryParameters | 
    try {
      ContactSourceDtoListEnvelope result = apiInstance.getContactSourcesAsync(tenantId, apiVersion, xApiVersion, contactSourceDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactSourcesApi#getContactSourcesAsync");
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
| **contactSourceDtoCollectionQueryParameters** | [**ContactSourceDtoCollectionQueryParameters**](ContactSourceDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**ContactSourceDtoListEnvelope**](ContactSourceDtoListEnvelope.md)

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

<a id="getContactSourcesCountAsync"></a>
# **getContactSourcesCountAsync**
> Int32Envelope getContactSourcesCountAsync(tenantId, apiVersion, xApiVersion, contactSourceDtoCollectionQueryParameters)

Get contact sources count

Returns the count of contact sources for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactSourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactSourcesApi apiInstance = new ContactSourcesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ContactSourceDtoCollectionQueryParameters contactSourceDtoCollectionQueryParameters = new ContactSourceDtoCollectionQueryParameters(); // ContactSourceDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getContactSourcesCountAsync(tenantId, apiVersion, xApiVersion, contactSourceDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactSourcesApi#getContactSourcesCountAsync");
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
| **contactSourceDtoCollectionQueryParameters** | [**ContactSourceDtoCollectionQueryParameters**](ContactSourceDtoCollectionQueryParameters.md)|  | [optional] |

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
| **200** | OK |  -  |

<a id="patchContactSourceAsync"></a>
# **patchContactSourceAsync**
> EmptyEnvelope patchContactSourceAsync(tenantId, id, apiVersion, xApiVersion, patchOperation)

Patch a contact source

Patch a contact source

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactSourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactSourcesApi apiInstance = new ContactSourcesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    List<PatchOperation> patchOperation = Arrays.asList(); // List<PatchOperation> | 
    try {
      EmptyEnvelope result = apiInstance.patchContactSourceAsync(tenantId, id, apiVersion, xApiVersion, patchOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactSourcesApi#patchContactSourceAsync");
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
| **id** | **UUID**|  | |
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
| **200** | OK |  -  |

<a id="updateContactSourceAsync"></a>
# **updateContactSourceAsync**
> updateContactSourceAsync(tenantId, id, apiVersion, xApiVersion, contactSourceUpdateDto)

Update a contact source

Updates an existing contact source for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactSourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactSourcesApi apiInstance = new ContactSourcesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ContactSourceUpdateDto contactSourceUpdateDto = new ContactSourceUpdateDto(); // ContactSourceUpdateDto | 
    try {
      apiInstance.updateContactSourceAsync(tenantId, id, apiVersion, xApiVersion, contactSourceUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactSourcesApi#updateContactSourceAsync");
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
| **id** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **contactSourceUpdateDto** | [**ContactSourceUpdateDto**](ContactSourceUpdateDto.md)|  | [optional] |

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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

