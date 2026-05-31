# ItemPickListsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createItemPickListAsync**](ItemPickListsApi.md#createItemPickListAsync) | **POST** /api/v2/LogisticsService/ItemPickLists | Create an item pick list |
| [**createItemPickListEntryAsync**](ItemPickListsApi.md#createItemPickListEntryAsync) | **POST** /api/v2/LogisticsService/ItemPickLists/{pickListId}/Entries | Create a pick list entry |
| [**deleteItemPickListAsync**](ItemPickListsApi.md#deleteItemPickListAsync) | **DELETE** /api/v2/LogisticsService/ItemPickLists/{pickListId} | Delete an item pick list |
| [**deleteItemPickListEntryAsync**](ItemPickListsApi.md#deleteItemPickListEntryAsync) | **DELETE** /api/v2/LogisticsService/ItemPickLists/{pickListId}/Entries/{entryId} | Delete a pick list entry |
| [**getItemPickListByIdAsync**](ItemPickListsApi.md#getItemPickListByIdAsync) | **GET** /api/v2/LogisticsService/ItemPickLists/{pickListId} | Get item pick list by ID |
| [**getItemPickListEntriesAsync**](ItemPickListsApi.md#getItemPickListEntriesAsync) | **GET** /api/v2/LogisticsService/ItemPickLists/{pickListId}/Entries | Get pick list entries |
| [**getItemPickListEntriesCountAsync**](ItemPickListsApi.md#getItemPickListEntriesCountAsync) | **GET** /api/v2/LogisticsService/ItemPickLists/{pickListId}/Entries/Count | Get pick list entries count |
| [**getItemPickListEntryByIdAsync**](ItemPickListsApi.md#getItemPickListEntryByIdAsync) | **GET** /api/v2/LogisticsService/ItemPickLists/{pickListId}/Entries/{entryId} | Get pick list entry by ID |
| [**getItemPickListsAsync**](ItemPickListsApi.md#getItemPickListsAsync) | **GET** /api/v2/LogisticsService/ItemPickLists | Get all item pick lists |
| [**getItemPickListsCountAsync**](ItemPickListsApi.md#getItemPickListsCountAsync) | **GET** /api/v2/LogisticsService/ItemPickLists/Count | Get item pick lists count |
| [**updateItemPickListAsync**](ItemPickListsApi.md#updateItemPickListAsync) | **PUT** /api/v2/LogisticsService/ItemPickLists/{pickListId} | Update an item pick list |
| [**updateItemPickListEntryAsync**](ItemPickListsApi.md#updateItemPickListEntryAsync) | **PUT** /api/v2/LogisticsService/ItemPickLists/{pickListId}/Entries/{entryId} | Update a pick list entry |


<a id="createItemPickListAsync"></a>
# **createItemPickListAsync**
> EmptyEnvelope createItemPickListAsync(tenantId, apiVersion, xApiVersion, itemPickListCreateDto)

Create an item pick list

Creates a new item pick list.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemPickListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemPickListsApi apiInstance = new ItemPickListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemPickListCreateDto itemPickListCreateDto = new ItemPickListCreateDto(); // ItemPickListCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createItemPickListAsync(tenantId, apiVersion, xApiVersion, itemPickListCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemPickListsApi#createItemPickListAsync");
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
| **itemPickListCreateDto** | [**ItemPickListCreateDto**](ItemPickListCreateDto.md)|  | [optional] |

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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

<a id="createItemPickListEntryAsync"></a>
# **createItemPickListEntryAsync**
> EmptyEnvelope createItemPickListEntryAsync(tenantId, pickListId, apiVersion, xApiVersion, itemPickListEntryCreateDto)

Create a pick list entry

Creates a new pick list entry.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemPickListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemPickListsApi apiInstance = new ItemPickListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID pickListId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemPickListEntryCreateDto itemPickListEntryCreateDto = new ItemPickListEntryCreateDto(); // ItemPickListEntryCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createItemPickListEntryAsync(tenantId, pickListId, apiVersion, xApiVersion, itemPickListEntryCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemPickListsApi#createItemPickListEntryAsync");
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
| **pickListId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **itemPickListEntryCreateDto** | [**ItemPickListEntryCreateDto**](ItemPickListEntryCreateDto.md)|  | [optional] |

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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

<a id="deleteItemPickListAsync"></a>
# **deleteItemPickListAsync**
> EmptyEnvelope deleteItemPickListAsync(tenantId, pickListId, apiVersion, xApiVersion)

Delete an item pick list

Deletes an item pick list.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemPickListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemPickListsApi apiInstance = new ItemPickListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID pickListId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteItemPickListAsync(tenantId, pickListId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemPickListsApi#deleteItemPickListAsync");
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
| **pickListId** | **UUID**|  | |
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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="deleteItemPickListEntryAsync"></a>
# **deleteItemPickListEntryAsync**
> EmptyEnvelope deleteItemPickListEntryAsync(tenantId, pickListId, entryId, apiVersion, xApiVersion)

Delete a pick list entry

Deletes a pick list entry.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemPickListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemPickListsApi apiInstance = new ItemPickListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID pickListId = UUID.randomUUID(); // UUID | 
    UUID entryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteItemPickListEntryAsync(tenantId, pickListId, entryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemPickListsApi#deleteItemPickListEntryAsync");
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
| **pickListId** | **UUID**|  | |
| **entryId** | **UUID**|  | |
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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getItemPickListByIdAsync"></a>
# **getItemPickListByIdAsync**
> ItemPickListDtoEnvelope getItemPickListByIdAsync(tenantId, pickListId, apiVersion, xApiVersion)

Get item pick list by ID

Retrieves a specific item pick list.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemPickListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemPickListsApi apiInstance = new ItemPickListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID pickListId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemPickListDtoEnvelope result = apiInstance.getItemPickListByIdAsync(tenantId, pickListId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemPickListsApi#getItemPickListByIdAsync");
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
| **pickListId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemPickListDtoEnvelope**](ItemPickListDtoEnvelope.md)

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

<a id="getItemPickListEntriesAsync"></a>
# **getItemPickListEntriesAsync**
> ItemPickListEntryDtoListEnvelope getItemPickListEntriesAsync(tenantId, pickListId, apiVersion, xApiVersion)

Get pick list entries

Retrieves all entries for the specified pick list.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemPickListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemPickListsApi apiInstance = new ItemPickListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID pickListId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemPickListEntryDtoListEnvelope result = apiInstance.getItemPickListEntriesAsync(tenantId, pickListId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemPickListsApi#getItemPickListEntriesAsync");
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
| **pickListId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemPickListEntryDtoListEnvelope**](ItemPickListEntryDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getItemPickListEntriesCountAsync"></a>
# **getItemPickListEntriesCountAsync**
> Int32Envelope getItemPickListEntriesCountAsync(tenantId, pickListId, apiVersion, xApiVersion)

Get pick list entries count

Returns the count of pick list entries.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemPickListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemPickListsApi apiInstance = new ItemPickListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID pickListId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getItemPickListEntriesCountAsync(tenantId, pickListId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemPickListsApi#getItemPickListEntriesCountAsync");
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
| **pickListId** | **UUID**|  | |
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
| **200** | OK |  -  |

<a id="getItemPickListEntryByIdAsync"></a>
# **getItemPickListEntryByIdAsync**
> ItemPickListEntryDtoEnvelope getItemPickListEntryByIdAsync(tenantId, pickListId, entryId, apiVersion, xApiVersion)

Get pick list entry by ID

Retrieves a specific pick list entry.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemPickListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemPickListsApi apiInstance = new ItemPickListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID pickListId = UUID.randomUUID(); // UUID | 
    UUID entryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemPickListEntryDtoEnvelope result = apiInstance.getItemPickListEntryByIdAsync(tenantId, pickListId, entryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemPickListsApi#getItemPickListEntryByIdAsync");
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
| **pickListId** | **UUID**|  | |
| **entryId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemPickListEntryDtoEnvelope**](ItemPickListEntryDtoEnvelope.md)

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

<a id="getItemPickListsAsync"></a>
# **getItemPickListsAsync**
> ItemPickListDtoListEnvelope getItemPickListsAsync(tenantId, apiVersion, xApiVersion)

Get all item pick lists

Retrieves all item pick lists for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemPickListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemPickListsApi apiInstance = new ItemPickListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemPickListDtoListEnvelope result = apiInstance.getItemPickListsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemPickListsApi#getItemPickListsAsync");
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

[**ItemPickListDtoListEnvelope**](ItemPickListDtoListEnvelope.md)

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

<a id="getItemPickListsCountAsync"></a>
# **getItemPickListsCountAsync**
> Int32Envelope getItemPickListsCountAsync(tenantId, apiVersion, xApiVersion)

Get item pick lists count

Returns the count of item pick lists.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemPickListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemPickListsApi apiInstance = new ItemPickListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getItemPickListsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemPickListsApi#getItemPickListsCountAsync");
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
| **200** | OK |  -  |

<a id="updateItemPickListAsync"></a>
# **updateItemPickListAsync**
> EmptyEnvelope updateItemPickListAsync(tenantId, pickListId, apiVersion, xApiVersion, itemPickListUpdateDto)

Update an item pick list

Updates an existing item pick list.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemPickListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemPickListsApi apiInstance = new ItemPickListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID pickListId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemPickListUpdateDto itemPickListUpdateDto = new ItemPickListUpdateDto(); // ItemPickListUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateItemPickListAsync(tenantId, pickListId, apiVersion, xApiVersion, itemPickListUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemPickListsApi#updateItemPickListAsync");
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
| **pickListId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **itemPickListUpdateDto** | [**ItemPickListUpdateDto**](ItemPickListUpdateDto.md)|  | [optional] |

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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

<a id="updateItemPickListEntryAsync"></a>
# **updateItemPickListEntryAsync**
> EmptyEnvelope updateItemPickListEntryAsync(tenantId, pickListId, entryId, apiVersion, xApiVersion, itemPickListEntryUpdateDto)

Update a pick list entry

Updates an existing pick list entry.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemPickListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemPickListsApi apiInstance = new ItemPickListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID pickListId = UUID.randomUUID(); // UUID | 
    UUID entryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemPickListEntryUpdateDto itemPickListEntryUpdateDto = new ItemPickListEntryUpdateDto(); // ItemPickListEntryUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateItemPickListEntryAsync(tenantId, pickListId, entryId, apiVersion, xApiVersion, itemPickListEntryUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemPickListsApi#updateItemPickListEntryAsync");
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
| **pickListId** | **UUID**|  | |
| **entryId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **itemPickListEntryUpdateDto** | [**ItemPickListEntryUpdateDto**](ItemPickListEntryUpdateDto.md)|  | [optional] |

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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

