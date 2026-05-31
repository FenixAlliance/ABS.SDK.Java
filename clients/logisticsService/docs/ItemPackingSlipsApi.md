# ItemPackingSlipsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createItemPackingSlipAsync**](ItemPackingSlipsApi.md#createItemPackingSlipAsync) | **POST** /api/v2/LogisticsService/ItemPackingSlips | Create an item packing slip |
| [**createItemPackingSlipEntryAsync**](ItemPackingSlipsApi.md#createItemPackingSlipEntryAsync) | **POST** /api/v2/LogisticsService/ItemPackingSlips/{packingSlipId}/Entries | Create a packing slip entry |
| [**deleteItemPackingSlipAsync**](ItemPackingSlipsApi.md#deleteItemPackingSlipAsync) | **DELETE** /api/v2/LogisticsService/ItemPackingSlips/{packingSlipId} | Delete an item packing slip |
| [**deleteItemPackingSlipEntryAsync**](ItemPackingSlipsApi.md#deleteItemPackingSlipEntryAsync) | **DELETE** /api/v2/LogisticsService/ItemPackingSlips/{packingSlipId}/Entries/{entryId} | Delete a packing slip entry |
| [**getItemPackingSlipByIdAsync**](ItemPackingSlipsApi.md#getItemPackingSlipByIdAsync) | **GET** /api/v2/LogisticsService/ItemPackingSlips/{packingSlipId} | Get item packing slip by ID |
| [**getItemPackingSlipEntriesAsync**](ItemPackingSlipsApi.md#getItemPackingSlipEntriesAsync) | **GET** /api/v2/LogisticsService/ItemPackingSlips/{packingSlipId}/Entries | Get packing slip entries |
| [**getItemPackingSlipEntriesCountAsync**](ItemPackingSlipsApi.md#getItemPackingSlipEntriesCountAsync) | **GET** /api/v2/LogisticsService/ItemPackingSlips/{packingSlipId}/Entries/Count | Get packing slip entries count |
| [**getItemPackingSlipEntryByIdAsync**](ItemPackingSlipsApi.md#getItemPackingSlipEntryByIdAsync) | **GET** /api/v2/LogisticsService/ItemPackingSlips/{packingSlipId}/Entries/{entryId} | Get packing slip entry by ID |
| [**getItemPackingSlipsAsync**](ItemPackingSlipsApi.md#getItemPackingSlipsAsync) | **GET** /api/v2/LogisticsService/ItemPackingSlips | Get all item packing slips |
| [**getItemPackingSlipsCountAsync**](ItemPackingSlipsApi.md#getItemPackingSlipsCountAsync) | **GET** /api/v2/LogisticsService/ItemPackingSlips/Count | Get item packing slips count |
| [**updateItemPackingSlipAsync**](ItemPackingSlipsApi.md#updateItemPackingSlipAsync) | **PUT** /api/v2/LogisticsService/ItemPackingSlips/{packingSlipId} | Update an item packing slip |
| [**updateItemPackingSlipEntryAsync**](ItemPackingSlipsApi.md#updateItemPackingSlipEntryAsync) | **PUT** /api/v2/LogisticsService/ItemPackingSlips/{packingSlipId}/Entries/{entryId} | Update a packing slip entry |


<a id="createItemPackingSlipAsync"></a>
# **createItemPackingSlipAsync**
> EmptyEnvelope createItemPackingSlipAsync(tenantId, apiVersion, xApiVersion, itemPackingSlipCreateDto)

Create an item packing slip

Creates a new item packing slip.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemPackingSlipsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemPackingSlipsApi apiInstance = new ItemPackingSlipsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemPackingSlipCreateDto itemPackingSlipCreateDto = new ItemPackingSlipCreateDto(); // ItemPackingSlipCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createItemPackingSlipAsync(tenantId, apiVersion, xApiVersion, itemPackingSlipCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemPackingSlipsApi#createItemPackingSlipAsync");
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
| **itemPackingSlipCreateDto** | [**ItemPackingSlipCreateDto**](ItemPackingSlipCreateDto.md)|  | [optional] |

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

<a id="createItemPackingSlipEntryAsync"></a>
# **createItemPackingSlipEntryAsync**
> EmptyEnvelope createItemPackingSlipEntryAsync(tenantId, packingSlipId, apiVersion, xApiVersion, itemPackingSlipEntryCreateDto)

Create a packing slip entry

Creates a new packing slip entry.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemPackingSlipsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemPackingSlipsApi apiInstance = new ItemPackingSlipsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID packingSlipId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemPackingSlipEntryCreateDto itemPackingSlipEntryCreateDto = new ItemPackingSlipEntryCreateDto(); // ItemPackingSlipEntryCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createItemPackingSlipEntryAsync(tenantId, packingSlipId, apiVersion, xApiVersion, itemPackingSlipEntryCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemPackingSlipsApi#createItemPackingSlipEntryAsync");
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
| **packingSlipId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **itemPackingSlipEntryCreateDto** | [**ItemPackingSlipEntryCreateDto**](ItemPackingSlipEntryCreateDto.md)|  | [optional] |

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

<a id="deleteItemPackingSlipAsync"></a>
# **deleteItemPackingSlipAsync**
> EmptyEnvelope deleteItemPackingSlipAsync(tenantId, packingSlipId, apiVersion, xApiVersion)

Delete an item packing slip

Deletes an item packing slip.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemPackingSlipsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemPackingSlipsApi apiInstance = new ItemPackingSlipsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID packingSlipId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteItemPackingSlipAsync(tenantId, packingSlipId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemPackingSlipsApi#deleteItemPackingSlipAsync");
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
| **packingSlipId** | **UUID**|  | |
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

<a id="deleteItemPackingSlipEntryAsync"></a>
# **deleteItemPackingSlipEntryAsync**
> EmptyEnvelope deleteItemPackingSlipEntryAsync(tenantId, packingSlipId, entryId, apiVersion, xApiVersion)

Delete a packing slip entry

Deletes a packing slip entry.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemPackingSlipsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemPackingSlipsApi apiInstance = new ItemPackingSlipsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID packingSlipId = UUID.randomUUID(); // UUID | 
    UUID entryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteItemPackingSlipEntryAsync(tenantId, packingSlipId, entryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemPackingSlipsApi#deleteItemPackingSlipEntryAsync");
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
| **packingSlipId** | **UUID**|  | |
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

<a id="getItemPackingSlipByIdAsync"></a>
# **getItemPackingSlipByIdAsync**
> ItemPackingSlipDtoEnvelope getItemPackingSlipByIdAsync(tenantId, packingSlipId, apiVersion, xApiVersion)

Get item packing slip by ID

Retrieves a specific item packing slip.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemPackingSlipsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemPackingSlipsApi apiInstance = new ItemPackingSlipsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID packingSlipId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemPackingSlipDtoEnvelope result = apiInstance.getItemPackingSlipByIdAsync(tenantId, packingSlipId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemPackingSlipsApi#getItemPackingSlipByIdAsync");
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
| **packingSlipId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemPackingSlipDtoEnvelope**](ItemPackingSlipDtoEnvelope.md)

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

<a id="getItemPackingSlipEntriesAsync"></a>
# **getItemPackingSlipEntriesAsync**
> ItemPackingSlipEntryDtoListEnvelope getItemPackingSlipEntriesAsync(tenantId, packingSlipId, apiVersion, xApiVersion)

Get packing slip entries

Retrieves all entries for the specified packing slip.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemPackingSlipsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemPackingSlipsApi apiInstance = new ItemPackingSlipsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID packingSlipId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemPackingSlipEntryDtoListEnvelope result = apiInstance.getItemPackingSlipEntriesAsync(tenantId, packingSlipId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemPackingSlipsApi#getItemPackingSlipEntriesAsync");
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
| **packingSlipId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemPackingSlipEntryDtoListEnvelope**](ItemPackingSlipEntryDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getItemPackingSlipEntriesCountAsync"></a>
# **getItemPackingSlipEntriesCountAsync**
> Int32Envelope getItemPackingSlipEntriesCountAsync(tenantId, packingSlipId, apiVersion, xApiVersion)

Get packing slip entries count

Returns the count of packing slip entries.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemPackingSlipsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemPackingSlipsApi apiInstance = new ItemPackingSlipsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID packingSlipId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getItemPackingSlipEntriesCountAsync(tenantId, packingSlipId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemPackingSlipsApi#getItemPackingSlipEntriesCountAsync");
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
| **packingSlipId** | **UUID**|  | |
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

<a id="getItemPackingSlipEntryByIdAsync"></a>
# **getItemPackingSlipEntryByIdAsync**
> ItemPackingSlipEntryDtoEnvelope getItemPackingSlipEntryByIdAsync(tenantId, packingSlipId, entryId, apiVersion, xApiVersion)

Get packing slip entry by ID

Retrieves a specific packing slip entry.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemPackingSlipsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemPackingSlipsApi apiInstance = new ItemPackingSlipsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID packingSlipId = UUID.randomUUID(); // UUID | 
    UUID entryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemPackingSlipEntryDtoEnvelope result = apiInstance.getItemPackingSlipEntryByIdAsync(tenantId, packingSlipId, entryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemPackingSlipsApi#getItemPackingSlipEntryByIdAsync");
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
| **packingSlipId** | **UUID**|  | |
| **entryId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemPackingSlipEntryDtoEnvelope**](ItemPackingSlipEntryDtoEnvelope.md)

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

<a id="getItemPackingSlipsAsync"></a>
# **getItemPackingSlipsAsync**
> ItemPackingSlipDtoListEnvelope getItemPackingSlipsAsync(tenantId, apiVersion, xApiVersion)

Get all item packing slips

Retrieves all item packing slips for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemPackingSlipsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemPackingSlipsApi apiInstance = new ItemPackingSlipsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemPackingSlipDtoListEnvelope result = apiInstance.getItemPackingSlipsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemPackingSlipsApi#getItemPackingSlipsAsync");
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

[**ItemPackingSlipDtoListEnvelope**](ItemPackingSlipDtoListEnvelope.md)

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

<a id="getItemPackingSlipsCountAsync"></a>
# **getItemPackingSlipsCountAsync**
> Int32Envelope getItemPackingSlipsCountAsync(tenantId, apiVersion, xApiVersion)

Get item packing slips count

Returns the count of item packing slips.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemPackingSlipsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemPackingSlipsApi apiInstance = new ItemPackingSlipsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getItemPackingSlipsCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemPackingSlipsApi#getItemPackingSlipsCountAsync");
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

<a id="updateItemPackingSlipAsync"></a>
# **updateItemPackingSlipAsync**
> EmptyEnvelope updateItemPackingSlipAsync(tenantId, packingSlipId, apiVersion, xApiVersion, itemPackingSlipUpdateDto)

Update an item packing slip

Updates an existing item packing slip.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemPackingSlipsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemPackingSlipsApi apiInstance = new ItemPackingSlipsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID packingSlipId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemPackingSlipUpdateDto itemPackingSlipUpdateDto = new ItemPackingSlipUpdateDto(); // ItemPackingSlipUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateItemPackingSlipAsync(tenantId, packingSlipId, apiVersion, xApiVersion, itemPackingSlipUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemPackingSlipsApi#updateItemPackingSlipAsync");
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
| **packingSlipId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **itemPackingSlipUpdateDto** | [**ItemPackingSlipUpdateDto**](ItemPackingSlipUpdateDto.md)|  | [optional] |

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

<a id="updateItemPackingSlipEntryAsync"></a>
# **updateItemPackingSlipEntryAsync**
> EmptyEnvelope updateItemPackingSlipEntryAsync(tenantId, packingSlipId, entryId, apiVersion, xApiVersion, itemPackingSlipEntryUpdateDto)

Update a packing slip entry

Updates an existing packing slip entry.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemPackingSlipsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemPackingSlipsApi apiInstance = new ItemPackingSlipsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID packingSlipId = UUID.randomUUID(); // UUID | 
    UUID entryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemPackingSlipEntryUpdateDto itemPackingSlipEntryUpdateDto = new ItemPackingSlipEntryUpdateDto(); // ItemPackingSlipEntryUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateItemPackingSlipEntryAsync(tenantId, packingSlipId, entryId, apiVersion, xApiVersion, itemPackingSlipEntryUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemPackingSlipsApi#updateItemPackingSlipEntryAsync");
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
| **packingSlipId** | **UUID**|  | |
| **entryId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **itemPackingSlipEntryUpdateDto** | [**ItemPackingSlipEntryUpdateDto**](ItemPackingSlipEntryUpdateDto.md)|  | [optional] |

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

