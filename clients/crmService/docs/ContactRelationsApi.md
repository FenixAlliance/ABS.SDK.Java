# ContactRelationsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createContactRelationAsync**](ContactRelationsApi.md#createContactRelationAsync) | **POST** /api/v2/CrmService/ContactRelations | Create a new contact relation |
| [**deleteContactRelationAsync**](ContactRelationsApi.md#deleteContactRelationAsync) | **DELETE** /api/v2/CrmService/ContactRelations/{id} | Delete a contact relation |
| [**getContactRelationByIdAsync**](ContactRelationsApi.md#getContactRelationByIdAsync) | **GET** /api/v2/CrmService/ContactRelations/{id} | Get contact relation by ID |
| [**getContactRelationsAsync**](ContactRelationsApi.md#getContactRelationsAsync) | **GET** /api/v2/CrmService/ContactRelations | Get all contact relations |
| [**getContactRelationsCountAsync**](ContactRelationsApi.md#getContactRelationsCountAsync) | **GET** /api/v2/CrmService/ContactRelations/Count | Get contact relations count |
| [**patchContactRelationAsync**](ContactRelationsApi.md#patchContactRelationAsync) | **PATCH** /api/v2/CrmService/ContactRelations/{id} | Patch a contact relation |
| [**updateContactRelationAsync**](ContactRelationsApi.md#updateContactRelationAsync) | **PUT** /api/v2/CrmService/ContactRelations/{id} | Update a contact relation |


<a id="createContactRelationAsync"></a>
# **createContactRelationAsync**
> createContactRelationAsync(tenantId, apiVersion, xApiVersion, contactRelationCreateDto)

Create a new contact relation

Creates a new contact relation for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactRelationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactRelationsApi apiInstance = new ContactRelationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ContactRelationCreateDto contactRelationCreateDto = new ContactRelationCreateDto(); // ContactRelationCreateDto | 
    try {
      apiInstance.createContactRelationAsync(tenantId, apiVersion, xApiVersion, contactRelationCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactRelationsApi#createContactRelationAsync");
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
| **contactRelationCreateDto** | [**ContactRelationCreateDto**](ContactRelationCreateDto.md)|  | [optional] |

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

<a id="deleteContactRelationAsync"></a>
# **deleteContactRelationAsync**
> deleteContactRelationAsync(tenantId, id, apiVersion, xApiVersion)

Delete a contact relation

Deletes a contact relation for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactRelationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactRelationsApi apiInstance = new ContactRelationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteContactRelationAsync(tenantId, id, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactRelationsApi#deleteContactRelationAsync");
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

<a id="getContactRelationByIdAsync"></a>
# **getContactRelationByIdAsync**
> ContactRelationDto getContactRelationByIdAsync(tenantId, id, apiVersion, xApiVersion)

Get contact relation by ID

Retrieves a specific contact relation by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactRelationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactRelationsApi apiInstance = new ContactRelationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ContactRelationDto result = apiInstance.getContactRelationByIdAsync(tenantId, id, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactRelationsApi#getContactRelationByIdAsync");
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

[**ContactRelationDto**](ContactRelationDto.md)

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

<a id="getContactRelationsAsync"></a>
# **getContactRelationsAsync**
> ContactRelationDtoListEnvelope getContactRelationsAsync(tenantId, apiVersion, xApiVersion, contactRelationDtoCollectionQueryParameters)

Get all contact relations

Retrieves all contact relations for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactRelationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactRelationsApi apiInstance = new ContactRelationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ContactRelationDtoCollectionQueryParameters contactRelationDtoCollectionQueryParameters = new ContactRelationDtoCollectionQueryParameters(); // ContactRelationDtoCollectionQueryParameters | 
    try {
      ContactRelationDtoListEnvelope result = apiInstance.getContactRelationsAsync(tenantId, apiVersion, xApiVersion, contactRelationDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactRelationsApi#getContactRelationsAsync");
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
| **contactRelationDtoCollectionQueryParameters** | [**ContactRelationDtoCollectionQueryParameters**](ContactRelationDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**ContactRelationDtoListEnvelope**](ContactRelationDtoListEnvelope.md)

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

<a id="getContactRelationsCountAsync"></a>
# **getContactRelationsCountAsync**
> Int32Envelope getContactRelationsCountAsync(tenantId, apiVersion, xApiVersion, contactRelationDtoCollectionQueryParameters)

Get contact relations count

Returns the count of contact relations for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactRelationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactRelationsApi apiInstance = new ContactRelationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ContactRelationDtoCollectionQueryParameters contactRelationDtoCollectionQueryParameters = new ContactRelationDtoCollectionQueryParameters(); // ContactRelationDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getContactRelationsCountAsync(tenantId, apiVersion, xApiVersion, contactRelationDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactRelationsApi#getContactRelationsCountAsync");
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
| **contactRelationDtoCollectionQueryParameters** | [**ContactRelationDtoCollectionQueryParameters**](ContactRelationDtoCollectionQueryParameters.md)|  | [optional] |

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

<a id="patchContactRelationAsync"></a>
# **patchContactRelationAsync**
> EmptyEnvelope patchContactRelationAsync(tenantId, id, apiVersion, xApiVersion, patchOperation)

Patch a contact relation

Patch a contact relation

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactRelationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactRelationsApi apiInstance = new ContactRelationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    List<PatchOperation> patchOperation = Arrays.asList(); // List<PatchOperation> | 
    try {
      EmptyEnvelope result = apiInstance.patchContactRelationAsync(tenantId, id, apiVersion, xApiVersion, patchOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactRelationsApi#patchContactRelationAsync");
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

<a id="updateContactRelationAsync"></a>
# **updateContactRelationAsync**
> updateContactRelationAsync(tenantId, id, apiVersion, xApiVersion, contactRelationUpdateDto)

Update a contact relation

Updates an existing contact relation for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactRelationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactRelationsApi apiInstance = new ContactRelationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ContactRelationUpdateDto contactRelationUpdateDto = new ContactRelationUpdateDto(); // ContactRelationUpdateDto | 
    try {
      apiInstance.updateContactRelationAsync(tenantId, id, apiVersion, xApiVersion, contactRelationUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactRelationsApi#updateContactRelationAsync");
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
| **contactRelationUpdateDto** | [**ContactRelationUpdateDto**](ContactRelationUpdateDto.md)|  | [optional] |

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

