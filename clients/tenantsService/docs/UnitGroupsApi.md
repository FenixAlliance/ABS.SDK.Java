# UnitGroupsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createUnitAsync**](UnitGroupsApi.md#createUnitAsync) | **POST** /api/v2/TenantsService/UnitGroups/{unitGroupId}/Units | Create a unit within a unit group |
| [**createUnitGroupAsync**](UnitGroupsApi.md#createUnitGroupAsync) | **POST** /api/v2/TenantsService/UnitGroups | Create a new unit group |
| [**deleteUnitAsync**](UnitGroupsApi.md#deleteUnitAsync) | **DELETE** /api/v2/TenantsService/UnitGroups/{unitGroupId}/Units/{unitId} | Delete a unit from a unit group |
| [**deleteUnitGroupAsync**](UnitGroupsApi.md#deleteUnitGroupAsync) | **DELETE** /api/v2/TenantsService/UnitGroups/{unitGroupId} | Delete a unit group |
| [**getUnitAsync**](UnitGroupsApi.md#getUnitAsync) | **GET** /api/v2/TenantsService/UnitGroups/{unitGroupId}/Units/{unitId} | Retrieve a unit by ID within a unit group |
| [**getUnitGroupAsync**](UnitGroupsApi.md#getUnitGroupAsync) | **GET** /api/v2/TenantsService/UnitGroups/{unitGroupId} | Retrieve a unit group by ID |
| [**getUnitGroupsAsync**](UnitGroupsApi.md#getUnitGroupsAsync) | **GET** /api/v2/TenantsService/UnitGroups | Retrieve a list of unit groups |
| [**getUnitGroupsCountAsync**](UnitGroupsApi.md#getUnitGroupsCountAsync) | **GET** /api/v2/TenantsService/UnitGroups/Count | Get the count of unit groups |
| [**getUnitsAsync**](UnitGroupsApi.md#getUnitsAsync) | **GET** /api/v2/TenantsService/UnitGroups/{unitGroupId}/Units | Retrieve units for a unit group |
| [**getUnitsCountAsync**](UnitGroupsApi.md#getUnitsCountAsync) | **GET** /api/v2/TenantsService/UnitGroups/{unitGroupId}/Units/Count | Get the count of units in a unit group |
| [**patchUnitAsync**](UnitGroupsApi.md#patchUnitAsync) | **PATCH** /api/v2/TenantsService/UnitGroups/{unitGroupId}/Units/{unitId} | Patch a unit within a unit group |
| [**patchUnitGroupAsync**](UnitGroupsApi.md#patchUnitGroupAsync) | **PATCH** /api/v2/TenantsService/UnitGroups/{unitGroupId} | Patch a unit group |
| [**updateUnitAsync**](UnitGroupsApi.md#updateUnitAsync) | **PUT** /api/v2/TenantsService/UnitGroups/{unitGroupId}/Units/{unitId} | Update a unit within a unit group |
| [**updateUnitGroupAsync**](UnitGroupsApi.md#updateUnitGroupAsync) | **PUT** /api/v2/TenantsService/UnitGroups/{unitGroupId} | Update a unit group |


<a id="createUnitAsync"></a>
# **createUnitAsync**
> EmptyEnvelope createUnitAsync(tenantId, unitGroupId, apiVersion, xApiVersion, unitCreateDto)

Create a unit within a unit group

Creates a new unit within a specific unit group.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UnitGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    UnitGroupsApi apiInstance = new UnitGroupsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String unitGroupId = "unitGroupId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    UnitCreateDto unitCreateDto = new UnitCreateDto(); // UnitCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createUnitAsync(tenantId, unitGroupId, apiVersion, xApiVersion, unitCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UnitGroupsApi#createUnitAsync");
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
| **unitGroupId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **unitCreateDto** | [**UnitCreateDto**](UnitCreateDto.md)|  | [optional] |

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

<a id="createUnitGroupAsync"></a>
# **createUnitGroupAsync**
> EmptyEnvelope createUnitGroupAsync(tenantId, apiVersion, xApiVersion, unitGroupCreateDto)

Create a new unit group

Creates a new unit group for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UnitGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    UnitGroupsApi apiInstance = new UnitGroupsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    UnitGroupCreateDto unitGroupCreateDto = new UnitGroupCreateDto(); // UnitGroupCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createUnitGroupAsync(tenantId, apiVersion, xApiVersion, unitGroupCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UnitGroupsApi#createUnitGroupAsync");
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
| **unitGroupCreateDto** | [**UnitGroupCreateDto**](UnitGroupCreateDto.md)|  | [optional] |

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

<a id="deleteUnitAsync"></a>
# **deleteUnitAsync**
> EmptyEnvelope deleteUnitAsync(tenantId, unitGroupId, unitId, apiVersion, xApiVersion)

Delete a unit from a unit group

Deletes a unit from a specific unit group.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UnitGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    UnitGroupsApi apiInstance = new UnitGroupsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String unitGroupId = "unitGroupId_example"; // String | 
    String unitId = "unitId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteUnitAsync(tenantId, unitGroupId, unitId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UnitGroupsApi#deleteUnitAsync");
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
| **unitGroupId** | **String**|  | |
| **unitId** | **String**|  | |
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

<a id="deleteUnitGroupAsync"></a>
# **deleteUnitGroupAsync**
> EmptyEnvelope deleteUnitGroupAsync(tenantId, unitGroupId, apiVersion, xApiVersion)

Delete a unit group

Deletes a unit group by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UnitGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    UnitGroupsApi apiInstance = new UnitGroupsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String unitGroupId = "unitGroupId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteUnitGroupAsync(tenantId, unitGroupId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UnitGroupsApi#deleteUnitGroupAsync");
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
| **unitGroupId** | **String**|  | |
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

<a id="getUnitAsync"></a>
# **getUnitAsync**
> UnitDtoEnvelope getUnitAsync(tenantId, unitGroupId, unitId, apiVersion, xApiVersion)

Retrieve a unit by ID within a unit group

Retrieves a single unit by its unique identifier within a specific unit group.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UnitGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    UnitGroupsApi apiInstance = new UnitGroupsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String unitGroupId = "unitGroupId_example"; // String | 
    String unitId = "unitId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      UnitDtoEnvelope result = apiInstance.getUnitAsync(tenantId, unitGroupId, unitId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UnitGroupsApi#getUnitAsync");
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
| **unitGroupId** | **String**|  | |
| **unitId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**UnitDtoEnvelope**](UnitDtoEnvelope.md)

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

<a id="getUnitGroupAsync"></a>
# **getUnitGroupAsync**
> UnitGroupDtoEnvelope getUnitGroupAsync(tenantId, unitGroupId, apiVersion, xApiVersion)

Retrieve a unit group by ID

Retrieves a single unit group by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UnitGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    UnitGroupsApi apiInstance = new UnitGroupsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String unitGroupId = "unitGroupId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      UnitGroupDtoEnvelope result = apiInstance.getUnitGroupAsync(tenantId, unitGroupId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UnitGroupsApi#getUnitGroupAsync");
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
| **unitGroupId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**UnitGroupDtoEnvelope**](UnitGroupDtoEnvelope.md)

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

<a id="getUnitGroupsAsync"></a>
# **getUnitGroupsAsync**
> UnitGroupDtoListEnvelope getUnitGroupsAsync(tenantId, apiVersion, xApiVersion, unitGroupDtoCollectionQueryParameters)

Retrieve a list of unit groups

Retrieves a list of unit groups for the specified tenant with OData query support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UnitGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    UnitGroupsApi apiInstance = new UnitGroupsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    UnitGroupDtoCollectionQueryParameters unitGroupDtoCollectionQueryParameters = new UnitGroupDtoCollectionQueryParameters(); // UnitGroupDtoCollectionQueryParameters | 
    try {
      UnitGroupDtoListEnvelope result = apiInstance.getUnitGroupsAsync(tenantId, apiVersion, xApiVersion, unitGroupDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UnitGroupsApi#getUnitGroupsAsync");
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
| **unitGroupDtoCollectionQueryParameters** | [**UnitGroupDtoCollectionQueryParameters**](UnitGroupDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**UnitGroupDtoListEnvelope**](UnitGroupDtoListEnvelope.md)

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

<a id="getUnitGroupsCountAsync"></a>
# **getUnitGroupsCountAsync**
> Int32Envelope getUnitGroupsCountAsync(tenantId, apiVersion, xApiVersion, unitGroupDtoCollectionQueryParameters)

Get the count of unit groups

Returns the total count of unit groups for the specified tenant with OData query support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UnitGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    UnitGroupsApi apiInstance = new UnitGroupsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    UnitGroupDtoCollectionQueryParameters unitGroupDtoCollectionQueryParameters = new UnitGroupDtoCollectionQueryParameters(); // UnitGroupDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getUnitGroupsCountAsync(tenantId, apiVersion, xApiVersion, unitGroupDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UnitGroupsApi#getUnitGroupsCountAsync");
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
| **unitGroupDtoCollectionQueryParameters** | [**UnitGroupDtoCollectionQueryParameters**](UnitGroupDtoCollectionQueryParameters.md)|  | [optional] |

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

<a id="getUnitsAsync"></a>
# **getUnitsAsync**
> UnitDtoListEnvelope getUnitsAsync(tenantId, unitGroupId, apiVersion, xApiVersion, unitDtoCollectionQueryParameters)

Retrieve units for a unit group

Retrieves a list of units belonging to a specific unit group.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UnitGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    UnitGroupsApi apiInstance = new UnitGroupsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String unitGroupId = "unitGroupId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    UnitDtoCollectionQueryParameters unitDtoCollectionQueryParameters = new UnitDtoCollectionQueryParameters(); // UnitDtoCollectionQueryParameters | 
    try {
      UnitDtoListEnvelope result = apiInstance.getUnitsAsync(tenantId, unitGroupId, apiVersion, xApiVersion, unitDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UnitGroupsApi#getUnitsAsync");
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
| **unitGroupId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **unitDtoCollectionQueryParameters** | [**UnitDtoCollectionQueryParameters**](UnitDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**UnitDtoListEnvelope**](UnitDtoListEnvelope.md)

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

<a id="getUnitsCountAsync"></a>
# **getUnitsCountAsync**
> Int32Envelope getUnitsCountAsync(tenantId, unitGroupId, apiVersion, xApiVersion, unitDtoCollectionQueryParameters)

Get the count of units in a unit group

Returns the total count of units in a specific unit group.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UnitGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    UnitGroupsApi apiInstance = new UnitGroupsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String unitGroupId = "unitGroupId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    UnitDtoCollectionQueryParameters unitDtoCollectionQueryParameters = new UnitDtoCollectionQueryParameters(); // UnitDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getUnitsCountAsync(tenantId, unitGroupId, apiVersion, xApiVersion, unitDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UnitGroupsApi#getUnitsCountAsync");
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
| **unitGroupId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **unitDtoCollectionQueryParameters** | [**UnitDtoCollectionQueryParameters**](UnitDtoCollectionQueryParameters.md)|  | [optional] |

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

<a id="patchUnitAsync"></a>
# **patchUnitAsync**
> EmptyEnvelope patchUnitAsync(tenantId, unitGroupId, unitId, apiVersion, xApiVersion, patchOperation)

Patch a unit within a unit group

Partially updates an existing unit within a specific unit group.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UnitGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    UnitGroupsApi apiInstance = new UnitGroupsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String unitGroupId = "unitGroupId_example"; // String | 
    String unitId = "unitId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    List<PatchOperation> patchOperation = Arrays.asList(); // List<PatchOperation> | 
    try {
      EmptyEnvelope result = apiInstance.patchUnitAsync(tenantId, unitGroupId, unitId, apiVersion, xApiVersion, patchOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UnitGroupsApi#patchUnitAsync");
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
| **unitGroupId** | **String**|  | |
| **unitId** | **String**|  | |
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

<a id="patchUnitGroupAsync"></a>
# **patchUnitGroupAsync**
> EmptyEnvelope patchUnitGroupAsync(tenantId, unitGroupId, apiVersion, xApiVersion, patchOperation)

Patch a unit group

Partially updates an existing unit group by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UnitGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    UnitGroupsApi apiInstance = new UnitGroupsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String unitGroupId = "unitGroupId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    List<PatchOperation> patchOperation = Arrays.asList(); // List<PatchOperation> | 
    try {
      EmptyEnvelope result = apiInstance.patchUnitGroupAsync(tenantId, unitGroupId, apiVersion, xApiVersion, patchOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UnitGroupsApi#patchUnitGroupAsync");
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
| **unitGroupId** | **String**|  | |
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

<a id="updateUnitAsync"></a>
# **updateUnitAsync**
> EmptyEnvelope updateUnitAsync(tenantId, unitGroupId, unitId, apiVersion, xApiVersion, unitUpdateDto)

Update a unit within a unit group

Updates an existing unit within a specific unit group.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UnitGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    UnitGroupsApi apiInstance = new UnitGroupsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String unitGroupId = "unitGroupId_example"; // String | 
    String unitId = "unitId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    UnitUpdateDto unitUpdateDto = new UnitUpdateDto(); // UnitUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateUnitAsync(tenantId, unitGroupId, unitId, apiVersion, xApiVersion, unitUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UnitGroupsApi#updateUnitAsync");
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
| **unitGroupId** | **String**|  | |
| **unitId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **unitUpdateDto** | [**UnitUpdateDto**](UnitUpdateDto.md)|  | [optional] |

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

<a id="updateUnitGroupAsync"></a>
# **updateUnitGroupAsync**
> EmptyEnvelope updateUnitGroupAsync(tenantId, unitGroupId, apiVersion, xApiVersion, unitGroupUpdateDto)

Update a unit group

Updates an existing unit group by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UnitGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    UnitGroupsApi apiInstance = new UnitGroupsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String unitGroupId = "unitGroupId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    UnitGroupUpdateDto unitGroupUpdateDto = new UnitGroupUpdateDto(); // UnitGroupUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateUnitGroupAsync(tenantId, unitGroupId, apiVersion, xApiVersion, unitGroupUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UnitGroupsApi#updateUnitGroupAsync");
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
| **unitGroupId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **unitGroupUpdateDto** | [**UnitGroupUpdateDto**](UnitGroupUpdateDto.md)|  | [optional] |

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

