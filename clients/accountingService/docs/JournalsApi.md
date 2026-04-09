# JournalsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**countJournalsAsync**](JournalsApi.md#countJournalsAsync) | **GET** /api/v2/AccountingService/Journals/Count | Count journals |
| [**createJournalAsync**](JournalsApi.md#createJournalAsync) | **POST** /api/v2/AccountingService/Journals | Create journal |
| [**createJournalEntryAsync**](JournalsApi.md#createJournalEntryAsync) | **POST** /api/v2/AccountingService/Journals/{journalId}/Entries | Create journal entry |
| [**deleteJournalAsync**](JournalsApi.md#deleteJournalAsync) | **DELETE** /api/v2/AccountingService/Journals/{journalId} | Delete journal |
| [**deleteJournalEntryAsync**](JournalsApi.md#deleteJournalEntryAsync) | **DELETE** /api/v2/AccountingService/Journals/{journalId}/Entries/{entryId} | Delete journal entry |
| [**getJournalDetailsAsync**](JournalsApi.md#getJournalDetailsAsync) | **GET** /api/v2/AccountingService/Journals/{journalId} | Get journal by ID |
| [**getJournalEntriesAsync**](JournalsApi.md#getJournalEntriesAsync) | **GET** /api/v2/AccountingService/Journals/{journalId}/Entries | Get journal entries |
| [**getJournalEntriesCountAsync**](JournalsApi.md#getJournalEntriesCountAsync) | **GET** /api/v2/AccountingService/Journals/{journalId}/Entries/Count | Count journal entries |
| [**getJournalsAsync**](JournalsApi.md#getJournalsAsync) | **GET** /api/v2/AccountingService/Journals | Get all journals |
| [**updateJournalAsync**](JournalsApi.md#updateJournalAsync) | **PUT** /api/v2/AccountingService/Journals/{journalId} | Update journal |
| [**updateJournalEntryAsync**](JournalsApi.md#updateJournalEntryAsync) | **PUT** /api/v2/AccountingService/Journals/{journalId}/Entries/{entryId} | Update journal entry |


<a id="countJournalsAsync"></a>
# **countJournalsAsync**
> Int32Envelope countJournalsAsync(tenantId, apiVersion, xApiVersion)

Count journals

Returns the count of journals for the tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JournalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    JournalsApi apiInstance = new JournalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.countJournalsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JournalsApi#countJournalsAsync");
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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="createJournalAsync"></a>
# **createJournalAsync**
> EmptyEnvelope createJournalAsync(tenantId, apiVersion, xApiVersion, journalCreateDto)

Create journal

Creates a new journal for the tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JournalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    JournalsApi apiInstance = new JournalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    JournalCreateDto journalCreateDto = new JournalCreateDto(); // JournalCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createJournalAsync(tenantId, apiVersion, xApiVersion, journalCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JournalsApi#createJournalAsync");
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
| **journalCreateDto** | [**JournalCreateDto**](JournalCreateDto.md)|  | [optional] |

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="createJournalEntryAsync"></a>
# **createJournalEntryAsync**
> EmptyEnvelope createJournalEntryAsync(tenantId, journalId, apiVersion, xApiVersion, journalEntryCreateDto)

Create journal entry

Creates a new journal entry for a given journal.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JournalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    JournalsApi apiInstance = new JournalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID journalId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    JournalEntryCreateDto journalEntryCreateDto = new JournalEntryCreateDto(); // JournalEntryCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createJournalEntryAsync(tenantId, journalId, apiVersion, xApiVersion, journalEntryCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JournalsApi#createJournalEntryAsync");
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
| **journalId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **journalEntryCreateDto** | [**JournalEntryCreateDto**](JournalEntryCreateDto.md)|  | [optional] |

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="deleteJournalAsync"></a>
# **deleteJournalAsync**
> EmptyEnvelope deleteJournalAsync(tenantId, journalId, apiVersion, xApiVersion)

Delete journal

Deletes a journal by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JournalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    JournalsApi apiInstance = new JournalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID journalId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteJournalAsync(tenantId, journalId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JournalsApi#deleteJournalAsync");
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
| **journalId** | **UUID**|  | |
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
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="deleteJournalEntryAsync"></a>
# **deleteJournalEntryAsync**
> EmptyEnvelope deleteJournalEntryAsync(tenantId, journalId, entryId, apiVersion, xApiVersion)

Delete journal entry

Deletes a specific journal entry.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JournalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    JournalsApi apiInstance = new JournalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID journalId = UUID.randomUUID(); // UUID | 
    UUID entryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteJournalEntryAsync(tenantId, journalId, entryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JournalsApi#deleteJournalEntryAsync");
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
| **journalId** | **UUID**|  | |
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
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="getJournalDetailsAsync"></a>
# **getJournalDetailsAsync**
> JournalDtoEnvelope getJournalDetailsAsync(tenantId, journalId, apiVersion, xApiVersion)

Get journal by ID

Retrieves the details of a journal.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JournalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    JournalsApi apiInstance = new JournalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID journalId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      JournalDtoEnvelope result = apiInstance.getJournalDetailsAsync(tenantId, journalId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JournalsApi#getJournalDetailsAsync");
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
| **journalId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**JournalDtoEnvelope**](JournalDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="getJournalEntriesAsync"></a>
# **getJournalEntriesAsync**
> JournalEntryDtoIReadOnlyListEnvelope getJournalEntriesAsync(tenantId, journalId, apiVersion, xApiVersion)

Get journal entries

Gets entries for the specified journal.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JournalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    JournalsApi apiInstance = new JournalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID journalId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      JournalEntryDtoIReadOnlyListEnvelope result = apiInstance.getJournalEntriesAsync(tenantId, journalId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JournalsApi#getJournalEntriesAsync");
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
| **journalId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**JournalEntryDtoIReadOnlyListEnvelope**](JournalEntryDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="getJournalEntriesCountAsync"></a>
# **getJournalEntriesCountAsync**
> Int32Envelope getJournalEntriesCountAsync(tenantId, journalId, apiVersion, xApiVersion)

Count journal entries

Returns the number of entries in the specified journal.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JournalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    JournalsApi apiInstance = new JournalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID journalId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getJournalEntriesCountAsync(tenantId, journalId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JournalsApi#getJournalEntriesCountAsync");
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
| **journalId** | **UUID**|  | |
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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="getJournalsAsync"></a>
# **getJournalsAsync**
> JournalDtoIReadOnlyListEnvelope getJournalsAsync(tenantId, apiVersion, xApiVersion)

Get all journals

Retrieves all journals for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JournalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    JournalsApi apiInstance = new JournalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      JournalDtoIReadOnlyListEnvelope result = apiInstance.getJournalsAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JournalsApi#getJournalsAsync");
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

[**JournalDtoIReadOnlyListEnvelope**](JournalDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="updateJournalAsync"></a>
# **updateJournalAsync**
> EmptyEnvelope updateJournalAsync(tenantId, journalId, apiVersion, xApiVersion, journalUpdateDto)

Update journal

Updates an existing journal.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JournalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    JournalsApi apiInstance = new JournalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID journalId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    JournalUpdateDto journalUpdateDto = new JournalUpdateDto(); // JournalUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateJournalAsync(tenantId, journalId, apiVersion, xApiVersion, journalUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JournalsApi#updateJournalAsync");
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
| **journalId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **journalUpdateDto** | [**JournalUpdateDto**](JournalUpdateDto.md)|  | [optional] |

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="updateJournalEntryAsync"></a>
# **updateJournalEntryAsync**
> EmptyEnvelope updateJournalEntryAsync(tenantId, journalId, entryId, apiVersion, xApiVersion, journalEntryUpdateDto)

Update journal entry

Updates a specific journal entry.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JournalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    JournalsApi apiInstance = new JournalsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID journalId = UUID.randomUUID(); // UUID | 
    UUID entryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    JournalEntryUpdateDto journalEntryUpdateDto = new JournalEntryUpdateDto(); // JournalEntryUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateJournalEntryAsync(tenantId, journalId, entryId, apiVersion, xApiVersion, journalEntryUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JournalsApi#updateJournalEntryAsync");
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
| **journalId** | **UUID**|  | |
| **entryId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **journalEntryUpdateDto** | [**JournalEntryUpdateDto**](JournalEntryUpdateDto.md)|  | [optional] |

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

