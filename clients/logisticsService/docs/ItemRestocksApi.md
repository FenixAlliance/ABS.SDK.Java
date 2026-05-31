# ItemRestocksApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createItemRestockAsync**](ItemRestocksApi.md#createItemRestockAsync) | **POST** /api/v2/LogisticsService/ItemRestocks | Create an item restock |
| [**createItemRestockEntryAsync**](ItemRestocksApi.md#createItemRestockEntryAsync) | **POST** /api/v2/LogisticsService/ItemRestocks/{restockId}/Entries | Create a restock entry |
| [**deleteItemRestockAsync**](ItemRestocksApi.md#deleteItemRestockAsync) | **DELETE** /api/v2/LogisticsService/ItemRestocks/{restockId} | Delete an item restock |
| [**deleteItemRestockEntryAsync**](ItemRestocksApi.md#deleteItemRestockEntryAsync) | **DELETE** /api/v2/LogisticsService/ItemRestocks/{restockId}/Entries/{entryId} | Delete a restock entry |
| [**getItemRestockByIdAsync**](ItemRestocksApi.md#getItemRestockByIdAsync) | **GET** /api/v2/LogisticsService/ItemRestocks/{restockId} | Get item restock by ID |
| [**getItemRestockEntriesAsync**](ItemRestocksApi.md#getItemRestockEntriesAsync) | **GET** /api/v2/LogisticsService/ItemRestocks/{restockId}/Entries | Get restock entries |
| [**getItemRestockEntriesCountAsync**](ItemRestocksApi.md#getItemRestockEntriesCountAsync) | **GET** /api/v2/LogisticsService/ItemRestocks/{restockId}/Entries/Count | Get restock entries count |
| [**getItemRestockEntryByIdAsync**](ItemRestocksApi.md#getItemRestockEntryByIdAsync) | **GET** /api/v2/LogisticsService/ItemRestocks/{restockId}/Entries/{entryId} | Get restock entry by ID |
| [**getItemRestocksAsync**](ItemRestocksApi.md#getItemRestocksAsync) | **GET** /api/v2/LogisticsService/ItemRestocks | Get all item restocks |
| [**getItemRestocksCountAsync**](ItemRestocksApi.md#getItemRestocksCountAsync) | **GET** /api/v2/LogisticsService/ItemRestocks/Count | Get item restocks count |
| [**updateItemRestockAsync**](ItemRestocksApi.md#updateItemRestockAsync) | **PUT** /api/v2/LogisticsService/ItemRestocks/{restockId} | Update an item restock |
| [**updateItemRestockEntryAsync**](ItemRestocksApi.md#updateItemRestockEntryAsync) | **PUT** /api/v2/LogisticsService/ItemRestocks/{restockId}/Entries/{entryId} | Update a restock entry |


<a id="createItemRestockAsync"></a>
# **createItemRestockAsync**
> EmptyEnvelope createItemRestockAsync(tenantId, apiVersion, xApiVersion, itemRestockCreateDto)

Create an item restock

Creates a new item restock.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemRestocksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemRestocksApi apiInstance = new ItemRestocksApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemRestockCreateDto itemRestockCreateDto = new ItemRestockCreateDto(); // ItemRestockCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createItemRestockAsync(tenantId, apiVersion, xApiVersion, itemRestockCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemRestocksApi#createItemRestockAsync");
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
| **itemRestockCreateDto** | [**ItemRestockCreateDto**](ItemRestockCreateDto.md)|  | [optional] |

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

<a id="createItemRestockEntryAsync"></a>
# **createItemRestockEntryAsync**
> EmptyEnvelope createItemRestockEntryAsync(tenantId, restockId, apiVersion, xApiVersion, itemRestockEntryCreateDto)

Create a restock entry

Creates a new restock entry.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemRestocksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemRestocksApi apiInstance = new ItemRestocksApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID restockId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemRestockEntryCreateDto itemRestockEntryCreateDto = new ItemRestockEntryCreateDto(); // ItemRestockEntryCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createItemRestockEntryAsync(tenantId, restockId, apiVersion, xApiVersion, itemRestockEntryCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemRestocksApi#createItemRestockEntryAsync");
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
| **restockId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **itemRestockEntryCreateDto** | [**ItemRestockEntryCreateDto**](ItemRestockEntryCreateDto.md)|  | [optional] |

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

<a id="deleteItemRestockAsync"></a>
# **deleteItemRestockAsync**
> EmptyEnvelope deleteItemRestockAsync(tenantId, restockId, apiVersion, xApiVersion)

Delete an item restock

Deletes an item restock.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemRestocksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemRestocksApi apiInstance = new ItemRestocksApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID restockId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteItemRestockAsync(tenantId, restockId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemRestocksApi#deleteItemRestockAsync");
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
| **restockId** | **UUID**|  | |
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

<a id="deleteItemRestockEntryAsync"></a>
# **deleteItemRestockEntryAsync**
> EmptyEnvelope deleteItemRestockEntryAsync(tenantId, restockId, entryId, apiVersion, xApiVersion)

Delete a restock entry

Deletes a restock entry.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemRestocksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemRestocksApi apiInstance = new ItemRestocksApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID restockId = UUID.randomUUID(); // UUID | 
    UUID entryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteItemRestockEntryAsync(tenantId, restockId, entryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemRestocksApi#deleteItemRestockEntryAsync");
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
| **restockId** | **UUID**|  | |
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

<a id="getItemRestockByIdAsync"></a>
# **getItemRestockByIdAsync**
> ItemRestockDtoEnvelope getItemRestockByIdAsync(tenantId, restockId, apiVersion, xApiVersion)

Get item restock by ID

Retrieves a specific item restock.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemRestocksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemRestocksApi apiInstance = new ItemRestocksApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID restockId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemRestockDtoEnvelope result = apiInstance.getItemRestockByIdAsync(tenantId, restockId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemRestocksApi#getItemRestockByIdAsync");
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
| **restockId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemRestockDtoEnvelope**](ItemRestockDtoEnvelope.md)

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

<a id="getItemRestockEntriesAsync"></a>
# **getItemRestockEntriesAsync**
> ItemRestockEntryDtoListEnvelope getItemRestockEntriesAsync(tenantId, restockId, apiVersion, xApiVersion)

Get restock entries

Retrieves all entries for the specified restock.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemRestocksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemRestocksApi apiInstance = new ItemRestocksApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID restockId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemRestockEntryDtoListEnvelope result = apiInstance.getItemRestockEntriesAsync(tenantId, restockId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemRestocksApi#getItemRestockEntriesAsync");
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
| **restockId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemRestockEntryDtoListEnvelope**](ItemRestockEntryDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getItemRestockEntriesCountAsync"></a>
# **getItemRestockEntriesCountAsync**
> Int32Envelope getItemRestockEntriesCountAsync(tenantId, restockId, apiVersion, xApiVersion)

Get restock entries count

Returns the count of restock entries.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemRestocksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemRestocksApi apiInstance = new ItemRestocksApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID restockId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getItemRestockEntriesCountAsync(tenantId, restockId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemRestocksApi#getItemRestockEntriesCountAsync");
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
| **restockId** | **UUID**|  | |
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

<a id="getItemRestockEntryByIdAsync"></a>
# **getItemRestockEntryByIdAsync**
> ItemRestockEntryDtoEnvelope getItemRestockEntryByIdAsync(tenantId, restockId, entryId, apiVersion, xApiVersion)

Get restock entry by ID

Retrieves a specific restock entry.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemRestocksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemRestocksApi apiInstance = new ItemRestocksApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID restockId = UUID.randomUUID(); // UUID | 
    UUID entryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemRestockEntryDtoEnvelope result = apiInstance.getItemRestockEntryByIdAsync(tenantId, restockId, entryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemRestocksApi#getItemRestockEntryByIdAsync");
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
| **restockId** | **UUID**|  | |
| **entryId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemRestockEntryDtoEnvelope**](ItemRestockEntryDtoEnvelope.md)

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

<a id="getItemRestocksAsync"></a>
# **getItemRestocksAsync**
> ItemRestockDtoListEnvelope getItemRestocksAsync(tenantId, apiVersion, xApiVersion)

Get all item restocks

Retrieves all item restocks for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemRestocksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemRestocksApi apiInstance = new ItemRestocksApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemRestockDtoListEnvelope result = apiInstance.getItemRestocksAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemRestocksApi#getItemRestocksAsync");
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

[**ItemRestockDtoListEnvelope**](ItemRestockDtoListEnvelope.md)

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

<a id="getItemRestocksCountAsync"></a>
# **getItemRestocksCountAsync**
> Int32Envelope getItemRestocksCountAsync(tenantId, apiVersion, xApiVersion)

Get item restocks count

Returns the count of item restocks.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemRestocksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemRestocksApi apiInstance = new ItemRestocksApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getItemRestocksCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemRestocksApi#getItemRestocksCountAsync");
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

<a id="updateItemRestockAsync"></a>
# **updateItemRestockAsync**
> EmptyEnvelope updateItemRestockAsync(tenantId, restockId, apiVersion, xApiVersion, itemRestockUpdateDto)

Update an item restock

Updates an existing item restock.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemRestocksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemRestocksApi apiInstance = new ItemRestocksApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID restockId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemRestockUpdateDto itemRestockUpdateDto = new ItemRestockUpdateDto(); // ItemRestockUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateItemRestockAsync(tenantId, restockId, apiVersion, xApiVersion, itemRestockUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemRestocksApi#updateItemRestockAsync");
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
| **restockId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **itemRestockUpdateDto** | [**ItemRestockUpdateDto**](ItemRestockUpdateDto.md)|  | [optional] |

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

<a id="updateItemRestockEntryAsync"></a>
# **updateItemRestockEntryAsync**
> EmptyEnvelope updateItemRestockEntryAsync(tenantId, restockId, entryId, apiVersion, xApiVersion, itemRestockEntryUpdateDto)

Update a restock entry

Updates an existing restock entry.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemRestocksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemRestocksApi apiInstance = new ItemRestocksApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID restockId = UUID.randomUUID(); // UUID | 
    UUID entryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemRestockEntryUpdateDto itemRestockEntryUpdateDto = new ItemRestockEntryUpdateDto(); // ItemRestockEntryUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateItemRestockEntryAsync(tenantId, restockId, entryId, apiVersion, xApiVersion, itemRestockEntryUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemRestocksApi#updateItemRestockEntryAsync");
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
| **restockId** | **UUID**|  | |
| **entryId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **itemRestockEntryUpdateDto** | [**ItemRestockEntryUpdateDto**](ItemRestockEntryUpdateDto.md)|  | [optional] |

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

