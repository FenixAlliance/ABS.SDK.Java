# DiscountListsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDiscountList**](DiscountListsApi.md#createDiscountList) | **POST** /api/v2/PricingService/DiscountLists | Creates a new discount list |
| [**createDiscountListEntry**](DiscountListsApi.md#createDiscountListEntry) | **POST** /api/v2/PricingService/DiscountLists/{discountListId}/Discounts | Creates a discount list entry |
| [**deleteDiscountList**](DiscountListsApi.md#deleteDiscountList) | **DELETE** /api/v2/PricingService/DiscountLists/{discountListId} | Deletes a discount list |
| [**deleteDiscountListEntry**](DiscountListsApi.md#deleteDiscountListEntry) | **DELETE** /api/v2/PricingService/DiscountLists/{discountListId}/Discounts/{discountListEntryId} | Deletes a discount list entry |
| [**getDiscountList**](DiscountListsApi.md#getDiscountList) | **GET** /api/v2/PricingService/DiscountLists/{discountListId} | Gets a discount list by ID |
| [**getDiscountListEntries**](DiscountListsApi.md#getDiscountListEntries) | **GET** /api/v2/PricingService/DiscountLists/{discountListId}/Discounts | Retrieves discounts in a discount list |
| [**getDiscountListEntriesCount**](DiscountListsApi.md#getDiscountListEntriesCount) | **GET** /api/v2/PricingService/DiscountLists/{discountListId}/Discounts/Count | Counts discounts in a discount list |
| [**getDiscountListEntry**](DiscountListsApi.md#getDiscountListEntry) | **GET** /api/v2/PricingService/DiscountLists/{discountListId}/Discounts/{discountListEntryId} | Gets a discount list entry by ID |
| [**getDiscountLists**](DiscountListsApi.md#getDiscountLists) | **GET** /api/v2/PricingService/DiscountLists | Retrieves all discount lists |
| [**getDiscountListsCount**](DiscountListsApi.md#getDiscountListsCount) | **GET** /api/v2/PricingService/DiscountLists/Count | Counts discount lists |
| [**updateDiscountList**](DiscountListsApi.md#updateDiscountList) | **PUT** /api/v2/PricingService/DiscountLists/{discountListId} | Updates a discount list |
| [**updateDiscountListEntry**](DiscountListsApi.md#updateDiscountListEntry) | **PUT** /api/v2/PricingService/DiscountLists/{discountListId}/Discounts/{discountListEntryId} | Updates a discount list entry |


<a id="createDiscountList"></a>
# **createDiscountList**
> EmptyEnvelope createDiscountList(tenantId, discountListCreateDto)

Creates a new discount list

Creates a new discount list for the current tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscountListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    DiscountListsApi apiInstance = new DiscountListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    DiscountListCreateDto discountListCreateDto = new DiscountListCreateDto(); // DiscountListCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createDiscountList(tenantId, discountListCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountListsApi#createDiscountList");
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
| **discountListCreateDto** | [**DiscountListCreateDto**](DiscountListCreateDto.md)|  | [optional] |

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
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="createDiscountListEntry"></a>
# **createDiscountListEntry**
> EmptyEnvelope createDiscountListEntry(tenantId, discountListId, discountCreateDto)

Creates a discount list entry

Creates a new discount entry in the specified discount list.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscountListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    DiscountListsApi apiInstance = new DiscountListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID discountListId = UUID.randomUUID(); // UUID | 
    DiscountCreateDto discountCreateDto = new DiscountCreateDto(); // DiscountCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createDiscountListEntry(tenantId, discountListId, discountCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountListsApi#createDiscountListEntry");
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
| **discountListId** | **UUID**|  | |
| **discountCreateDto** | [**DiscountCreateDto**](DiscountCreateDto.md)|  | [optional] |

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
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="deleteDiscountList"></a>
# **deleteDiscountList**
> EmptyEnvelope deleteDiscountList(tenantId, discountListId)

Deletes a discount list

Deletes the specified discount list.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscountListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    DiscountListsApi apiInstance = new DiscountListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID discountListId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.deleteDiscountList(tenantId, discountListId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountListsApi#deleteDiscountList");
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
| **discountListId** | **UUID**|  | |

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
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="deleteDiscountListEntry"></a>
# **deleteDiscountListEntry**
> EmptyEnvelope deleteDiscountListEntry(tenantId, discountListId, discountListEntryId)

Deletes a discount list entry

Deletes the specified discount entry from a discount list.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscountListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    DiscountListsApi apiInstance = new DiscountListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID discountListId = UUID.randomUUID(); // UUID | 
    UUID discountListEntryId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.deleteDiscountListEntry(tenantId, discountListId, discountListEntryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountListsApi#deleteDiscountListEntry");
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
| **discountListId** | **UUID**|  | |
| **discountListEntryId** | **UUID**|  | |

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
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="getDiscountList"></a>
# **getDiscountList**
> DiscountListDtoEnvelope getDiscountList(tenantId, discountListId)

Gets a discount list by ID

Retrieves the details of a discount list using its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscountListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    DiscountListsApi apiInstance = new DiscountListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID discountListId = UUID.randomUUID(); // UUID | 
    try {
      DiscountListDtoEnvelope result = apiInstance.getDiscountList(tenantId, discountListId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountListsApi#getDiscountList");
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
| **discountListId** | **UUID**|  | |

### Return type

[**DiscountListDtoEnvelope**](DiscountListDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="getDiscountListEntries"></a>
# **getDiscountListEntries**
> DiscountDtoListEnvelope getDiscountListEntries(tenantId, discountListId)

Retrieves discounts in a discount list

Gets all discount entries for a specific discount list with OData support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscountListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    DiscountListsApi apiInstance = new DiscountListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID discountListId = UUID.randomUUID(); // UUID | 
    try {
      DiscountDtoListEnvelope result = apiInstance.getDiscountListEntries(tenantId, discountListId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountListsApi#getDiscountListEntries");
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
| **discountListId** | **UUID**|  | |

### Return type

[**DiscountDtoListEnvelope**](DiscountDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="getDiscountListEntriesCount"></a>
# **getDiscountListEntriesCount**
> Int32Envelope getDiscountListEntriesCount(tenantId, discountListId)

Counts discounts in a discount list

Gets the count of discount entries for a specific discount list.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscountListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    DiscountListsApi apiInstance = new DiscountListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID discountListId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.getDiscountListEntriesCount(tenantId, discountListId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountListsApi#getDiscountListEntriesCount");
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
| **discountListId** | **UUID**|  | |

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
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="getDiscountListEntry"></a>
# **getDiscountListEntry**
> DiscountDtoEnvelope getDiscountListEntry(tenantId, discountListId, discountListEntryId)

Gets a discount list entry by ID

Retrieves a specific discount entry from a discount list.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscountListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    DiscountListsApi apiInstance = new DiscountListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID discountListId = UUID.randomUUID(); // UUID | 
    UUID discountListEntryId = UUID.randomUUID(); // UUID | 
    try {
      DiscountDtoEnvelope result = apiInstance.getDiscountListEntry(tenantId, discountListId, discountListEntryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountListsApi#getDiscountListEntry");
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
| **discountListId** | **UUID**|  | |
| **discountListEntryId** | **UUID**|  | |

### Return type

[**DiscountDtoEnvelope**](DiscountDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="getDiscountLists"></a>
# **getDiscountLists**
> DiscountListDtoListEnvelope getDiscountLists(tenantId)

Retrieves all discount lists

Gets all discount lists for the current tenant with OData support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscountListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    DiscountListsApi apiInstance = new DiscountListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      DiscountListDtoListEnvelope result = apiInstance.getDiscountLists(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountListsApi#getDiscountLists");
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

### Return type

[**DiscountListDtoListEnvelope**](DiscountListDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="getDiscountListsCount"></a>
# **getDiscountListsCount**
> Int32Envelope getDiscountListsCount(tenantId)

Counts discount lists

Gets the count of discount lists for the current tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscountListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    DiscountListsApi apiInstance = new DiscountListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.getDiscountListsCount(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountListsApi#getDiscountListsCount");
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
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="updateDiscountList"></a>
# **updateDiscountList**
> EmptyEnvelope updateDiscountList(tenantId, discountListId, discountListUpdateDto)

Updates a discount list

Updates the specified discount list.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscountListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    DiscountListsApi apiInstance = new DiscountListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID discountListId = UUID.randomUUID(); // UUID | 
    DiscountListUpdateDto discountListUpdateDto = new DiscountListUpdateDto(); // DiscountListUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateDiscountList(tenantId, discountListId, discountListUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountListsApi#updateDiscountList");
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
| **discountListId** | **UUID**|  | |
| **discountListUpdateDto** | [**DiscountListUpdateDto**](DiscountListUpdateDto.md)|  | [optional] |

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
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="updateDiscountListEntry"></a>
# **updateDiscountListEntry**
> EmptyEnvelope updateDiscountListEntry(tenantId, discountListId, discountListEntryId, discountUpdateDto)

Updates a discount list entry

Updates the specified discount entry in a discount list.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscountListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    DiscountListsApi apiInstance = new DiscountListsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID discountListId = UUID.randomUUID(); // UUID | 
    UUID discountListEntryId = UUID.randomUUID(); // UUID | 
    DiscountUpdateDto discountUpdateDto = new DiscountUpdateDto(); // DiscountUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateDiscountListEntry(tenantId, discountListId, discountListEntryId, discountUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountListsApi#updateDiscountListEntry");
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
| **discountListId** | **UUID**|  | |
| **discountListEntryId** | **UUID**|  | |
| **discountUpdateDto** | [**DiscountUpdateDto**](DiscountUpdateDto.md)|  | [optional] |

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
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

