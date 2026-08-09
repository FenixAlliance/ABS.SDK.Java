# RequiredSkillsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRequiredSkillAsync**](RequiredSkillsApi.md#createRequiredSkillAsync) | **POST** /api/v2/HrmsService/RequiredSkills | Create a required skill |
| [**deleteRequiredSkillAsync**](RequiredSkillsApi.md#deleteRequiredSkillAsync) | **DELETE** /api/v2/HrmsService/RequiredSkills/{requiredSkillId} | Delete a required skill |
| [**getRequiredSkillByIdAsync**](RequiredSkillsApi.md#getRequiredSkillByIdAsync) | **GET** /api/v2/HrmsService/RequiredSkills/{requiredSkillId} | Get required skill by ID |
| [**getRequiredSkillsAsync**](RequiredSkillsApi.md#getRequiredSkillsAsync) | **GET** /api/v2/HrmsService/RequiredSkills | Get required skills |
| [**getRequiredSkillsCountAsync**](RequiredSkillsApi.md#getRequiredSkillsCountAsync) | **GET** /api/v2/HrmsService/RequiredSkills/Count | Count required skills |
| [**patchRequiredSkillAsync**](RequiredSkillsApi.md#patchRequiredSkillAsync) | **PATCH** /api/v2/HrmsService/RequiredSkills/{requiredSkillId} | Patch a required skill |
| [**updateRequiredSkillAsync**](RequiredSkillsApi.md#updateRequiredSkillAsync) | **PUT** /api/v2/HrmsService/RequiredSkills/{requiredSkillId} | Update a required skill |


<a id="createRequiredSkillAsync"></a>
# **createRequiredSkillAsync**
> EmptyEnvelope createRequiredSkillAsync(tenantId, apiVersion, xApiVersion, requiredSkillRecordCreateDto)

Create a required skill

Creates a new required-skill record for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RequiredSkillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    RequiredSkillsApi apiInstance = new RequiredSkillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    RequiredSkillRecordCreateDto requiredSkillRecordCreateDto = new RequiredSkillRecordCreateDto(); // RequiredSkillRecordCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createRequiredSkillAsync(tenantId, apiVersion, xApiVersion, requiredSkillRecordCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RequiredSkillsApi#createRequiredSkillAsync");
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
| **requiredSkillRecordCreateDto** | [**RequiredSkillRecordCreateDto**](RequiredSkillRecordCreateDto.md)|  | [optional] |

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

<a id="deleteRequiredSkillAsync"></a>
# **deleteRequiredSkillAsync**
> EmptyEnvelope deleteRequiredSkillAsync(tenantId, requiredSkillId, apiVersion, xApiVersion)

Delete a required skill

Deletes a required-skill record for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RequiredSkillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    RequiredSkillsApi apiInstance = new RequiredSkillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID requiredSkillId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteRequiredSkillAsync(tenantId, requiredSkillId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RequiredSkillsApi#deleteRequiredSkillAsync");
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
| **requiredSkillId** | **UUID**|  | |
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

<a id="getRequiredSkillByIdAsync"></a>
# **getRequiredSkillByIdAsync**
> RequiredSkillRecordDtoEnvelope getRequiredSkillByIdAsync(tenantId, requiredSkillId, apiVersion, xApiVersion)

Get required skill by ID

Retrieves a specific required-skill record by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RequiredSkillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    RequiredSkillsApi apiInstance = new RequiredSkillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID requiredSkillId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      RequiredSkillRecordDtoEnvelope result = apiInstance.getRequiredSkillByIdAsync(tenantId, requiredSkillId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RequiredSkillsApi#getRequiredSkillByIdAsync");
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
| **requiredSkillId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**RequiredSkillRecordDtoEnvelope**](RequiredSkillRecordDtoEnvelope.md)

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

<a id="getRequiredSkillsAsync"></a>
# **getRequiredSkillsAsync**
> RequiredSkillRecordDtoListEnvelope getRequiredSkillsAsync(tenantId, apiVersion, xApiVersion, requiredSkillRecordDtoCollectionQueryParameters)

Get required skills

Retrieves required-skill records for the specified tenant. Filter by &#x60;$filter&#x3D;JobOfferId eq &#39;...&#39;&#x60; or &#x60;EmployerProfileId eq &#39;...&#39;&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RequiredSkillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    RequiredSkillsApi apiInstance = new RequiredSkillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    RequiredSkillRecordDtoCollectionQueryParameters requiredSkillRecordDtoCollectionQueryParameters = new RequiredSkillRecordDtoCollectionQueryParameters(); // RequiredSkillRecordDtoCollectionQueryParameters | 
    try {
      RequiredSkillRecordDtoListEnvelope result = apiInstance.getRequiredSkillsAsync(tenantId, apiVersion, xApiVersion, requiredSkillRecordDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RequiredSkillsApi#getRequiredSkillsAsync");
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
| **requiredSkillRecordDtoCollectionQueryParameters** | [**RequiredSkillRecordDtoCollectionQueryParameters**](RequiredSkillRecordDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**RequiredSkillRecordDtoListEnvelope**](RequiredSkillRecordDtoListEnvelope.md)

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

<a id="getRequiredSkillsCountAsync"></a>
# **getRequiredSkillsCountAsync**
> Int32Envelope getRequiredSkillsCountAsync(tenantId, apiVersion, xApiVersion, requiredSkillRecordDtoCollectionQueryParameters)

Count required skills

Counts required-skill records for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RequiredSkillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    RequiredSkillsApi apiInstance = new RequiredSkillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    RequiredSkillRecordDtoCollectionQueryParameters requiredSkillRecordDtoCollectionQueryParameters = new RequiredSkillRecordDtoCollectionQueryParameters(); // RequiredSkillRecordDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getRequiredSkillsCountAsync(tenantId, apiVersion, xApiVersion, requiredSkillRecordDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RequiredSkillsApi#getRequiredSkillsCountAsync");
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
| **requiredSkillRecordDtoCollectionQueryParameters** | [**RequiredSkillRecordDtoCollectionQueryParameters**](RequiredSkillRecordDtoCollectionQueryParameters.md)|  | [optional] |

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

<a id="patchRequiredSkillAsync"></a>
# **patchRequiredSkillAsync**
> EmptyEnvelope patchRequiredSkillAsync(tenantId, requiredSkillId, apiVersion, xApiVersion, patchOperation)

Patch a required skill

Partially updates an existing required-skill record for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RequiredSkillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    RequiredSkillsApi apiInstance = new RequiredSkillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID requiredSkillId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    List<PatchOperation> patchOperation = Arrays.asList(); // List<PatchOperation> | 
    try {
      EmptyEnvelope result = apiInstance.patchRequiredSkillAsync(tenantId, requiredSkillId, apiVersion, xApiVersion, patchOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RequiredSkillsApi#patchRequiredSkillAsync");
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
| **requiredSkillId** | **UUID**|  | |
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

<a id="updateRequiredSkillAsync"></a>
# **updateRequiredSkillAsync**
> EmptyEnvelope updateRequiredSkillAsync(tenantId, requiredSkillId, apiVersion, xApiVersion, requiredSkillRecordUpdateDto)

Update a required skill

Updates an existing required-skill record for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RequiredSkillsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    RequiredSkillsApi apiInstance = new RequiredSkillsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID requiredSkillId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    RequiredSkillRecordUpdateDto requiredSkillRecordUpdateDto = new RequiredSkillRecordUpdateDto(); // RequiredSkillRecordUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateRequiredSkillAsync(tenantId, requiredSkillId, apiVersion, xApiVersion, requiredSkillRecordUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RequiredSkillsApi#updateRequiredSkillAsync");
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
| **requiredSkillId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **requiredSkillRecordUpdateDto** | [**RequiredSkillRecordUpdateDto**](RequiredSkillRecordUpdateDto.md)|  | [optional] |

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

