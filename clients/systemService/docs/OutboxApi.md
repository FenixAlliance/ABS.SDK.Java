# OutboxApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelOutboxMessage**](OutboxApi.md#cancelOutboxMessage) | **POST** /api/v2/SystemService/Outbox/Messages/{id}/Cancel | Cancel an outbox message |
| [**deadLetterOutboxMessage**](OutboxApi.md#deadLetterOutboxMessage) | **POST** /api/v2/SystemService/Outbox/Messages/{id}/DeadLetter | Manually dead-letter an outbox message |
| [**expediteOutboxMessage**](OutboxApi.md#expediteOutboxMessage) | **POST** /api/v2/SystemService/Outbox/Messages/{id}/Expedite | Expedite a failed (retry-eligible) outbox message |
| [**getOutboxCorrelationChain**](OutboxApi.md#getOutboxCorrelationChain) | **GET** /api/v2/SystemService/Outbox/Correlations/{correlationId} | Get an outbox correlation chain |
| [**getOutboxHealth**](OutboxApi.md#getOutboxHealth) | **GET** /api/v2/SystemService/Outbox/Health | Get durable-outbox relay health |
| [**getOutboxMessage**](OutboxApi.md#getOutboxMessage) | **GET** /api/v2/SystemService/Outbox/Messages/{id} | Get one outbox message |
| [**getOutboxMessages**](OutboxApi.md#getOutboxMessages) | **GET** /api/v2/SystemService/Outbox/Messages | List outbox messages |
| [**getOutboxMessagesCount**](OutboxApi.md#getOutboxMessagesCount) | **GET** /api/v2/SystemService/Outbox/Messages/Count | Count outbox messages |
| [**releaseOutboxMessageLease**](OutboxApi.md#releaseOutboxMessageLease) | **POST** /api/v2/SystemService/Outbox/Messages/{id}/ReleaseLease | Release a stuck outbox lease |
| [**replayOutboxMessage**](OutboxApi.md#replayOutboxMessage) | **POST** /api/v2/SystemService/Outbox/Messages/{id}/Replay | Replay a dead-lettered or failed outbox message |


<a id="cancelOutboxMessage"></a>
# **cancelOutboxMessage**
> EmptyEnvelope cancelOutboxMessage(id, apiVersion, xApiVersion, outboxAdminReasonDto)

Cancel an outbox message

Stops a Pending or Failed message by operator decision, moving it to the terminal Cancelled state (deliberately distinct from DeadLettered so the dead-letter gauge stays honest). The reason is audit-critical. An in-flight (Processing) or already-terminal message is rejected. Global-administrator only.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OutboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    OutboxApi apiInstance = new OutboxApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    OutboxAdminReasonDto outboxAdminReasonDto = new OutboxAdminReasonDto(); // OutboxAdminReasonDto | 
    try {
      EmptyEnvelope result = apiInstance.cancelOutboxMessage(id, apiVersion, xApiVersion, outboxAdminReasonDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutboxApi#cancelOutboxMessage");
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
| **outboxAdminReasonDto** | [**OutboxAdminReasonDto**](OutboxAdminReasonDto.md)|  | [optional] |

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

<a id="deadLetterOutboxMessage"></a>
# **deadLetterOutboxMessage**
> EmptyEnvelope deadLetterOutboxMessage(id, apiVersion, xApiVersion, outboxAdminReasonDto)

Manually dead-letter an outbox message

Manually moves a Processing or Failed message to the terminal DeadLettered state. The reason is audit-critical. Global-administrator only.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OutboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    OutboxApi apiInstance = new OutboxApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    OutboxAdminReasonDto outboxAdminReasonDto = new OutboxAdminReasonDto(); // OutboxAdminReasonDto | 
    try {
      EmptyEnvelope result = apiInstance.deadLetterOutboxMessage(id, apiVersion, xApiVersion, outboxAdminReasonDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutboxApi#deadLetterOutboxMessage");
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
| **outboxAdminReasonDto** | [**OutboxAdminReasonDto**](OutboxAdminReasonDto.md)|  | [optional] |

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

<a id="expediteOutboxMessage"></a>
# **expediteOutboxMessage**
> EmptyEnvelope expediteOutboxMessage(id, apiVersion, xApiVersion)

Expedite a failed (retry-eligible) outbox message

Pulls a Failed message&#39;s scheduled instant forward to now so the relay claims it on the next poll, bypassing the remaining backoff. Same row, retry budget untouched (the lighter-touch counterpart to Replay, which also clears the recorded error). Only a Failed message can be expedited. Global-administrator only.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OutboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    OutboxApi apiInstance = new OutboxApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.expediteOutboxMessage(id, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutboxApi#expediteOutboxMessage");
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

<a id="getOutboxCorrelationChain"></a>
# **getOutboxCorrelationChain**
> OutboxMessageDtoIReadOnlyListEnvelope getOutboxCorrelationChain(correlationId, apiVersion, xApiVersion)

Get an outbox correlation chain

Returns every outbox message that shares a correlation id — one logical unit of async work end-to-end (e.g. a command and the events its handler in turn staged) — oldest-created first. Global-administrator only.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OutboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    OutboxApi apiInstance = new OutboxApi(defaultClient);
    String correlationId = "correlationId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      OutboxMessageDtoIReadOnlyListEnvelope result = apiInstance.getOutboxCorrelationChain(correlationId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutboxApi#getOutboxCorrelationChain");
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

[**OutboxMessageDtoIReadOnlyListEnvelope**](OutboxMessageDtoIReadOnlyListEnvelope.md)

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

<a id="getOutboxHealth"></a>
# **getOutboxHealth**
> OutboxHealthDtoEnvelope getOutboxHealth(apiVersion, xApiVersion)

Get durable-outbox relay health

Returns a single snapshot of the durable-outbox relay: whether it is enabled, the per-status counts (pending/processing/failed/dead-lettered), the age of the oldest pending message, and the last successful dispatch instant. Global-administrator only.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OutboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    OutboxApi apiInstance = new OutboxApi(defaultClient);
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      OutboxHealthDtoEnvelope result = apiInstance.getOutboxHealth(apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutboxApi#getOutboxHealth");
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

[**OutboxHealthDtoEnvelope**](OutboxHealthDtoEnvelope.md)

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

<a id="getOutboxMessage"></a>
# **getOutboxMessage**
> OutboxMessageDtoEnvelope getOutboxMessage(id, apiVersion, xApiVersion)

Get one outbox message

Returns one outbox message&#39;s payload-safe detail by id — its lifecycle status, the two classification axes (kind + message type), the attempt/ceiling budget, the recorded failure, the idempotency + correlation lineage, and the timestamps. Global-administrator only.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OutboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    OutboxApi apiInstance = new OutboxApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      OutboxMessageDtoEnvelope result = apiInstance.getOutboxMessage(id, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutboxApi#getOutboxMessage");
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

[**OutboxMessageDtoEnvelope**](OutboxMessageDtoEnvelope.md)

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

<a id="getOutboxMessages"></a>
# **getOutboxMessages**
> OutboxMessageDtoIReadOnlyListEnvelope getOutboxMessages(apiVersion, xApiVersion, outboxMessageDtoCollectionQueryParameters)

List outbox messages

Lists durable-outbox messages (payload-safe fields only). Use OData to scope to a state — e.g. $filter&#x3D;Status eq &#39;DeadLettered&#39; for the dead-letter set or Status eq &#39;Failed&#39; for retry-eligible rows — and to page/order. Global-administrator only.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OutboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    OutboxApi apiInstance = new OutboxApi(defaultClient);
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    OutboxMessageDtoCollectionQueryParameters outboxMessageDtoCollectionQueryParameters = new OutboxMessageDtoCollectionQueryParameters(); // OutboxMessageDtoCollectionQueryParameters | 
    try {
      OutboxMessageDtoIReadOnlyListEnvelope result = apiInstance.getOutboxMessages(apiVersion, xApiVersion, outboxMessageDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutboxApi#getOutboxMessages");
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
| **outboxMessageDtoCollectionQueryParameters** | [**OutboxMessageDtoCollectionQueryParameters**](OutboxMessageDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**OutboxMessageDtoIReadOnlyListEnvelope**](OutboxMessageDtoIReadOnlyListEnvelope.md)

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

<a id="getOutboxMessagesCount"></a>
# **getOutboxMessagesCount**
> Int32Envelope getOutboxMessagesCount(apiVersion, xApiVersion, outboxMessageDtoCollectionQueryParameters)

Count outbox messages

Returns the count of durable-outbox messages under the same OData shaping as the list read (e.g. $filter&#x3D;Status eq &#39;DeadLettered&#39;). Global-administrator only.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OutboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    OutboxApi apiInstance = new OutboxApi(defaultClient);
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    OutboxMessageDtoCollectionQueryParameters outboxMessageDtoCollectionQueryParameters = new OutboxMessageDtoCollectionQueryParameters(); // OutboxMessageDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getOutboxMessagesCount(apiVersion, xApiVersion, outboxMessageDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutboxApi#getOutboxMessagesCount");
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
| **outboxMessageDtoCollectionQueryParameters** | [**OutboxMessageDtoCollectionQueryParameters**](OutboxMessageDtoCollectionQueryParameters.md)|  | [optional] |

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

<a id="releaseOutboxMessageLease"></a>
# **releaseOutboxMessageLease**
> EmptyEnvelope releaseOutboxMessageLease(id, apiVersion, xApiVersion)

Release a stuck outbox lease

Force-releases the lease on a message wedged in Processing (a crashed/hung relay) and returns it to the claimable Pending state, due now, so the next poll re-drives it. The in-flight attempt is NOT counted — a crash is not a business failure. The relay auto-reclaims a crashed row once its lease expires; this manual lever forces the release immediately. Only a Processing message can have its lease released. Global-administrator only.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OutboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    OutboxApi apiInstance = new OutboxApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.releaseOutboxMessageLease(id, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutboxApi#releaseOutboxMessageLease");
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

<a id="replayOutboxMessage"></a>
# **replayOutboxMessage**
> EmptyEnvelope replayOutboxMessage(id, apiVersion, xApiVersion)

Replay a dead-lettered or failed outbox message

Requeues a DeadLettered or Failed message back to Pending so the relay re-drives it immediately (clearing the lease and recorded error, and bypassing the remaining backoff). The attempt budget is preserved — a replay grants one more pass, not a fresh budget. Replaying a message that is already Pending/Processing or is Succeeded/Cancelled is rejected. Global-administrator only.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OutboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    OutboxApi apiInstance = new OutboxApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.replayOutboxMessage(id, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutboxApi#replayOutboxMessage");
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

