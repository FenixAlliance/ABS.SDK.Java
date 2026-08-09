# InboxApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelInboxMessageRetry**](InboxApi.md#cancelInboxMessageRetry) | **POST** /api/v2/SystemService/Inbox/Messages/{id}/CancelRetry | Cancel a scheduled inbox retry |
| [**deadLetterInboxMessage**](InboxApi.md#deadLetterInboxMessage) | **POST** /api/v2/SystemService/Inbox/Messages/{id}/DeadLetter | Manually dead-letter an inbox message |
| [**expediteInboxMessage**](InboxApi.md#expediteInboxMessage) | **POST** /api/v2/SystemService/Inbox/Messages/{id}/Expedite | Expedite a retry-scheduled inbox message |
| [**getDuplicateInboxMessages**](InboxApi.md#getDuplicateInboxMessages) | **GET** /api/v2/SystemService/Inbox/Duplicates | List duplicate-bearing inbox messages |
| [**getDuplicateInboxMessagesCount**](InboxApi.md#getDuplicateInboxMessagesCount) | **GET** /api/v2/SystemService/Inbox/Duplicates/Count | Count duplicate-bearing inbox messages |
| [**getInboxCorrelationChain**](InboxApi.md#getInboxCorrelationChain) | **GET** /api/v2/SystemService/Inbox/Correlations/{correlationId} | Get an inbox correlation chain |
| [**getInboxHealth**](InboxApi.md#getInboxHealth) | **GET** /api/v2/SystemService/Inbox/Health | Get durable-inbox processor health |
| [**getInboxMessage**](InboxApi.md#getInboxMessage) | **GET** /api/v2/SystemService/Inbox/Messages/{id} | Get one inbox message |
| [**getInboxMessages**](InboxApi.md#getInboxMessages) | **GET** /api/v2/SystemService/Inbox/Messages | List inbox messages |
| [**getInboxMessagesCount**](InboxApi.md#getInboxMessagesCount) | **GET** /api/v2/SystemService/Inbox/Messages/Count | Count inbox messages |
| [**quarantineInboxMessage**](InboxApi.md#quarantineInboxMessage) | **POST** /api/v2/SystemService/Inbox/Messages/{id}/Quarantine | Manually quarantine an inbox message |
| [**releaseInboxMessageLease**](InboxApi.md#releaseInboxMessageLease) | **POST** /api/v2/SystemService/Inbox/Messages/{id}/ReleaseLease | Release a stuck inbox lease |
| [**replayInboxMessage**](InboxApi.md#replayInboxMessage) | **POST** /api/v2/SystemService/Inbox/Messages/{id}/Replay | Replay a terminal inbox message as a new generation |


<a id="cancelInboxMessageRetry"></a>
# **cancelInboxMessageRetry**
> EmptyEnvelope cancelInboxMessageRetry(id, apiVersion, xApiVersion, inboxAdminReasonDto)

Cancel a scheduled inbox retry

Stops a RetryScheduled message from retrying by operator decision, moving it to the terminal Cancelled state (deliberately distinct from DeadLettered so the dead-letter gauge stays honest). The reason is audit-critical. Only a RetryScheduled message can be cancelled. Global-administrator only.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InboxApi apiInstance = new InboxApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    InboxAdminReasonDto inboxAdminReasonDto = new InboxAdminReasonDto(); // InboxAdminReasonDto | 
    try {
      EmptyEnvelope result = apiInstance.cancelInboxMessageRetry(id, apiVersion, xApiVersion, inboxAdminReasonDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxApi#cancelInboxMessageRetry");
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
| **id** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **inboxAdminReasonDto** | [**InboxAdminReasonDto**](InboxAdminReasonDto.md)|  | [optional] |

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
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Content |  -  |

<a id="deadLetterInboxMessage"></a>
# **deadLetterInboxMessage**
> EmptyEnvelope deadLetterInboxMessage(id, apiVersion, xApiVersion, inboxAdminReasonDto)

Manually dead-letter an inbox message

Manually moves a non-terminal message to the terminal DeadLettered state. The reason is audit-critical. Global-administrator only.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InboxApi apiInstance = new InboxApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    InboxAdminReasonDto inboxAdminReasonDto = new InboxAdminReasonDto(); // InboxAdminReasonDto | 
    try {
      EmptyEnvelope result = apiInstance.deadLetterInboxMessage(id, apiVersion, xApiVersion, inboxAdminReasonDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxApi#deadLetterInboxMessage");
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
| **id** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **inboxAdminReasonDto** | [**InboxAdminReasonDto**](InboxAdminReasonDto.md)|  | [optional] |

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
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Content |  -  |

<a id="expediteInboxMessage"></a>
# **expediteInboxMessage**
> EmptyEnvelope expediteInboxMessage(id, apiVersion, xApiVersion)

Expedite a retry-scheduled inbox message

Pulls a RetryScheduled message&#39;s scheduled instant forward to now so the processor claims it on the next poll, bypassing the remaining backoff. Same row, retry budget untouched. Only a RetryScheduled message can be expedited. Global-administrator only.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InboxApi apiInstance = new InboxApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.expediteInboxMessage(id, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxApi#expediteInboxMessage");
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
| **id** | **UUID**|  | |
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
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Content |  -  |

<a id="getDuplicateInboxMessages"></a>
# **getDuplicateInboxMessages**
> InboxMessageDtoIReadOnlyListEnvelope getDuplicateInboxMessages(apiVersion, xApiVersion, inboxMessageDtoCollectionQueryParameters)

List duplicate-bearing inbox messages

Lists inbox messages that have observed a re-delivery (DeliveryCount &gt; 1) — durable evidence that a source is re-sending, surfaced with DeliveryCount / LastDuplicateReceivedAtUtc. Further OData filtering/paging applies. Global-administrator only.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InboxApi apiInstance = new InboxApi(defaultClient);
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    InboxMessageDtoCollectionQueryParameters inboxMessageDtoCollectionQueryParameters = new InboxMessageDtoCollectionQueryParameters(); // InboxMessageDtoCollectionQueryParameters | 
    try {
      InboxMessageDtoIReadOnlyListEnvelope result = apiInstance.getDuplicateInboxMessages(apiVersion, xApiVersion, inboxMessageDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxApi#getDuplicateInboxMessages");
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
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **inboxMessageDtoCollectionQueryParameters** | [**InboxMessageDtoCollectionQueryParameters**](InboxMessageDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**InboxMessageDtoIReadOnlyListEnvelope**](InboxMessageDtoIReadOnlyListEnvelope.md)

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

<a id="getDuplicateInboxMessagesCount"></a>
# **getDuplicateInboxMessagesCount**
> Int32Envelope getDuplicateInboxMessagesCount(apiVersion, xApiVersion, inboxMessageDtoCollectionQueryParameters)

Count duplicate-bearing inbox messages

Returns the count of duplicate-bearing inbox messages under the same OData shaping as the duplicates list. Global-administrator only.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InboxApi apiInstance = new InboxApi(defaultClient);
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    InboxMessageDtoCollectionQueryParameters inboxMessageDtoCollectionQueryParameters = new InboxMessageDtoCollectionQueryParameters(); // InboxMessageDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getDuplicateInboxMessagesCount(apiVersion, xApiVersion, inboxMessageDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxApi#getDuplicateInboxMessagesCount");
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
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **inboxMessageDtoCollectionQueryParameters** | [**InboxMessageDtoCollectionQueryParameters**](InboxMessageDtoCollectionQueryParameters.md)|  | [optional] |

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
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="getInboxCorrelationChain"></a>
# **getInboxCorrelationChain**
> InboxMessageDtoIReadOnlyListEnvelope getInboxCorrelationChain(correlationId, apiVersion, xApiVersion)

Get an inbox correlation chain

Returns every inbox message that shares a correlation id — one logical inbound interaction end-to-end, including its replay generations — oldest-received first. Global-administrator only.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InboxApi apiInstance = new InboxApi(defaultClient);
    String correlationId = "correlationId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      InboxMessageDtoIReadOnlyListEnvelope result = apiInstance.getInboxCorrelationChain(correlationId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxApi#getInboxCorrelationChain");
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
| **correlationId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**InboxMessageDtoIReadOnlyListEnvelope**](InboxMessageDtoIReadOnlyListEnvelope.md)

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
| **422** | Unprocessable Content |  -  |

<a id="getInboxHealth"></a>
# **getInboxHealth**
> InboxHealthDtoEnvelope getInboxHealth(apiVersion, xApiVersion)

Get durable-inbox processor health

Returns a single snapshot of the durable-inbox processor: whether it is enabled, the per-status counts (received/accepted/processing/retry-scheduled/rejected/quarantined/dead-lettered/cancelled), the age of the oldest accepted message, and the last successful processing instant. Global-administrator only.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InboxApi apiInstance = new InboxApi(defaultClient);
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      InboxHealthDtoEnvelope result = apiInstance.getInboxHealth(apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxApi#getInboxHealth");
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
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**InboxHealthDtoEnvelope**](InboxHealthDtoEnvelope.md)

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

<a id="getInboxMessage"></a>
# **getInboxMessage**
> InboxMessageDtoEnvelope getInboxMessage(id, apiVersion, xApiVersion)

Get one inbox message

Returns one inbox message&#39;s payload-safe detail by id — both lifecycle axes (processing status + independent verification status), the dedup lineage, attempt/generation counters, the recorded failure, and the timestamps. Global-administrator only.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InboxApi apiInstance = new InboxApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      InboxMessageDtoEnvelope result = apiInstance.getInboxMessage(id, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxApi#getInboxMessage");
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
| **id** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**InboxMessageDtoEnvelope**](InboxMessageDtoEnvelope.md)

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
| **404** | Not Found |  -  |

<a id="getInboxMessages"></a>
# **getInboxMessages**
> InboxMessageDtoIReadOnlyListEnvelope getInboxMessages(apiVersion, xApiVersion, inboxMessageDtoCollectionQueryParameters)

List inbox messages

Lists durable-inbox messages (payload-safe fields only). Use OData to scope by any projected field — e.g. $filter&#x3D;Status eq &#39;Quarantined&#39; for the quarantine review, Status eq &#39;DeadLettered&#39; for terminal failures, VerificationStatus eq &#39;Failed&#39; for forged/untrusted callbacks, SourceSystem eq &#39;stripe&#39;, or a ReceivedAtUtc range — and to page/order. Global-administrator only.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InboxApi apiInstance = new InboxApi(defaultClient);
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    InboxMessageDtoCollectionQueryParameters inboxMessageDtoCollectionQueryParameters = new InboxMessageDtoCollectionQueryParameters(); // InboxMessageDtoCollectionQueryParameters | 
    try {
      InboxMessageDtoIReadOnlyListEnvelope result = apiInstance.getInboxMessages(apiVersion, xApiVersion, inboxMessageDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxApi#getInboxMessages");
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
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **inboxMessageDtoCollectionQueryParameters** | [**InboxMessageDtoCollectionQueryParameters**](InboxMessageDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**InboxMessageDtoIReadOnlyListEnvelope**](InboxMessageDtoIReadOnlyListEnvelope.md)

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

<a id="getInboxMessagesCount"></a>
# **getInboxMessagesCount**
> Int32Envelope getInboxMessagesCount(apiVersion, xApiVersion, inboxMessageDtoCollectionQueryParameters)

Count inbox messages

Returns the count of durable-inbox messages under the same OData shaping as the list read (e.g. $filter&#x3D;Status eq &#39;Quarantined&#39;). Global-administrator only.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InboxApi apiInstance = new InboxApi(defaultClient);
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    InboxMessageDtoCollectionQueryParameters inboxMessageDtoCollectionQueryParameters = new InboxMessageDtoCollectionQueryParameters(); // InboxMessageDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getInboxMessagesCount(apiVersion, xApiVersion, inboxMessageDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxApi#getInboxMessagesCount");
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
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **inboxMessageDtoCollectionQueryParameters** | [**InboxMessageDtoCollectionQueryParameters**](InboxMessageDtoCollectionQueryParameters.md)|  | [optional] |

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
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="quarantineInboxMessage"></a>
# **quarantineInboxMessage**
> EmptyEnvelope quarantineInboxMessage(id, apiVersion, xApiVersion, inboxAdminReasonDto)

Manually quarantine an inbox message

Manually holds a non-terminal message for review in the terminal Quarantined state (e.g. an operator judges it suspicious). The reason is audit-critical. Global-administrator only.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InboxApi apiInstance = new InboxApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    InboxAdminReasonDto inboxAdminReasonDto = new InboxAdminReasonDto(); // InboxAdminReasonDto | 
    try {
      EmptyEnvelope result = apiInstance.quarantineInboxMessage(id, apiVersion, xApiVersion, inboxAdminReasonDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxApi#quarantineInboxMessage");
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
| **id** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **inboxAdminReasonDto** | [**InboxAdminReasonDto**](InboxAdminReasonDto.md)|  | [optional] |

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
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Content |  -  |

<a id="releaseInboxMessageLease"></a>
# **releaseInboxMessageLease**
> EmptyEnvelope releaseInboxMessageLease(id, apiVersion, xApiVersion)

Release a stuck inbox lease

Force-releases the lease on a message wedged in Processing (a crashed/hung processor) and returns it to the claimable Accepted state, due now, so the next poll re-drives it. The in-flight attempt is NOT counted — a crash is not a business failure. Only a Processing message can have its lease released. Global-administrator only.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InboxApi apiInstance = new InboxApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.releaseInboxMessageLease(id, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxApi#releaseInboxMessageLease");
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
| **id** | **UUID**|  | |
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
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Content |  -  |

<a id="replayInboxMessage"></a>
# **replayInboxMessage**
> InboxReplayResultDtoEnvelope replayInboxMessage(id, apiVersion, xApiVersion, inboxAdminReasonDto)

Replay a terminal inbox message as a new generation

Replays a terminal message as a NEW processing generation over its immutable received evidence — the inbox&#39;s recovery lever (distinct from the outbox&#39;s same-row requeue). A selected replay-generation row is resolved back to its lineage root before replaying, so numbering stays global and collision-free; the new row is claimable at once with a fresh retry budget, and the root&#39;s evidence and budget are never mutated. Legal only from a terminal state whose authenticity passed. Returns the new generation&#39;s identity. The reason is audit-critical. Global-administrator only.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    InboxApi apiInstance = new InboxApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    InboxAdminReasonDto inboxAdminReasonDto = new InboxAdminReasonDto(); // InboxAdminReasonDto | 
    try {
      InboxReplayResultDtoEnvelope result = apiInstance.replayInboxMessage(id, apiVersion, xApiVersion, inboxAdminReasonDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxApi#replayInboxMessage");
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
| **id** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **inboxAdminReasonDto** | [**InboxAdminReasonDto**](InboxAdminReasonDto.md)|  | [optional] |

### Return type

[**InboxReplayResultDtoEnvelope**](InboxReplayResultDtoEnvelope.md)

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
| **404** | Not Found |  -  |
| **422** | Unprocessable Content |  -  |

