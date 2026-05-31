# ProofsOfDeliveryApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addProofOfDeliveryLineAsync**](ProofsOfDeliveryApi.md#addProofOfDeliveryLineAsync) | **POST** /api/v2/LogisticsService/ProofsOfDelivery/{podId}/Lines | Add a line to proof of delivery |
| [**attachDeliveryNoteAsync**](ProofsOfDeliveryApi.md#attachDeliveryNoteAsync) | **POST** /api/v2/LogisticsService/ProofsOfDelivery/{podId}/DeliveryNotes/{noteId} | Attach a delivery note |
| [**createProofOfDeliveryAsync**](ProofsOfDeliveryApi.md#createProofOfDeliveryAsync) | **POST** /api/v2/LogisticsService/ProofsOfDelivery | Create a proof of delivery |
| [**deleteProofOfDeliveryAsync**](ProofsOfDeliveryApi.md#deleteProofOfDeliveryAsync) | **DELETE** /api/v2/LogisticsService/ProofsOfDelivery/{podId} | Delete a proof of delivery |
| [**detachDeliveryNoteAsync**](ProofsOfDeliveryApi.md#detachDeliveryNoteAsync) | **DELETE** /api/v2/LogisticsService/ProofsOfDelivery/{podId}/DeliveryNotes/{noteId} | Detach a delivery note |
| [**disputeProofOfDeliveryAsync**](ProofsOfDeliveryApi.md#disputeProofOfDeliveryAsync) | **POST** /api/v2/LogisticsService/ProofsOfDelivery/{podId}/Dispute | Dispute a proof of delivery |
| [**getProofOfDeliveryByIdAsync**](ProofsOfDeliveryApi.md#getProofOfDeliveryByIdAsync) | **GET** /api/v2/LogisticsService/ProofsOfDelivery/{podId} | Get proof of delivery by ID |
| [**getProofOfDeliveryDeliveryNotesAsync**](ProofsOfDeliveryApi.md#getProofOfDeliveryDeliveryNotesAsync) | **GET** /api/v2/LogisticsService/ProofsOfDelivery/{podId}/DeliveryNotes | Get attached delivery notes |
| [**getProofOfDeliveryDeliveryNotesCountAsync**](ProofsOfDeliveryApi.md#getProofOfDeliveryDeliveryNotesCountAsync) | **GET** /api/v2/LogisticsService/ProofsOfDelivery/{podId}/DeliveryNotes/Count | Get delivery notes count |
| [**getProofOfDeliveryLinesAsync**](ProofsOfDeliveryApi.md#getProofOfDeliveryLinesAsync) | **GET** /api/v2/LogisticsService/ProofsOfDelivery/{podId}/Lines | Get proof of delivery lines |
| [**getProofOfDeliveryLinesCountAsync**](ProofsOfDeliveryApi.md#getProofOfDeliveryLinesCountAsync) | **GET** /api/v2/LogisticsService/ProofsOfDelivery/{podId}/Lines/Count | Get proof of delivery lines count |
| [**getProofsOfDeliveryAsync**](ProofsOfDeliveryApi.md#getProofsOfDeliveryAsync) | **GET** /api/v2/LogisticsService/ProofsOfDelivery | Get all proofs of delivery |
| [**getProofsOfDeliveryCountAsync**](ProofsOfDeliveryApi.md#getProofsOfDeliveryCountAsync) | **GET** /api/v2/LogisticsService/ProofsOfDelivery/Count | Get proofs of delivery count |
| [**rejectProofOfDeliveryAsync**](ProofsOfDeliveryApi.md#rejectProofOfDeliveryAsync) | **POST** /api/v2/LogisticsService/ProofsOfDelivery/{podId}/Reject | Reject a proof of delivery |
| [**removeProofOfDeliveryLineAsync**](ProofsOfDeliveryApi.md#removeProofOfDeliveryLineAsync) | **DELETE** /api/v2/LogisticsService/ProofsOfDelivery/{podId}/Lines/{lineId} | Remove a proof of delivery line |
| [**signProofOfDeliveryAsync**](ProofsOfDeliveryApi.md#signProofOfDeliveryAsync) | **POST** /api/v2/LogisticsService/ProofsOfDelivery/{podId}/Sign | Sign a proof of delivery |
| [**updateProofOfDeliveryAsync**](ProofsOfDeliveryApi.md#updateProofOfDeliveryAsync) | **PUT** /api/v2/LogisticsService/ProofsOfDelivery/{podId} | Update a proof of delivery |
| [**updateProofOfDeliveryLineAsync**](ProofsOfDeliveryApi.md#updateProofOfDeliveryLineAsync) | **PUT** /api/v2/LogisticsService/ProofsOfDelivery/{podId}/Lines/{lineId} | Update a proof of delivery line |


<a id="addProofOfDeliveryLineAsync"></a>
# **addProofOfDeliveryLineAsync**
> EmptyEnvelope addProofOfDeliveryLineAsync(tenantId, podId, apiVersion, xApiVersion, proofOfDeliveryLineCreateDto)

Add a line to proof of delivery

Adds a new line to a proof of delivery.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProofsOfDeliveryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ProofsOfDeliveryApi apiInstance = new ProofsOfDeliveryApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID podId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ProofOfDeliveryLineCreateDto proofOfDeliveryLineCreateDto = new ProofOfDeliveryLineCreateDto(); // ProofOfDeliveryLineCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.addProofOfDeliveryLineAsync(tenantId, podId, apiVersion, xApiVersion, proofOfDeliveryLineCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProofsOfDeliveryApi#addProofOfDeliveryLineAsync");
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
| **podId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **proofOfDeliveryLineCreateDto** | [**ProofOfDeliveryLineCreateDto**](ProofOfDeliveryLineCreateDto.md)|  | [optional] |

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

<a id="attachDeliveryNoteAsync"></a>
# **attachDeliveryNoteAsync**
> EmptyEnvelope attachDeliveryNoteAsync(tenantId, podId, noteId, apiVersion, xApiVersion)

Attach a delivery note

Attaches a delivery note to a proof of delivery.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProofsOfDeliveryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ProofsOfDeliveryApi apiInstance = new ProofsOfDeliveryApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID podId = UUID.randomUUID(); // UUID | 
    UUID noteId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.attachDeliveryNoteAsync(tenantId, podId, noteId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProofsOfDeliveryApi#attachDeliveryNoteAsync");
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
| **podId** | **UUID**|  | |
| **noteId** | **UUID**|  | |
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
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

<a id="createProofOfDeliveryAsync"></a>
# **createProofOfDeliveryAsync**
> EmptyEnvelope createProofOfDeliveryAsync(tenantId, apiVersion, xApiVersion, proofOfDeliveryCreateDto)

Create a proof of delivery

Creates a new proof of delivery for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProofsOfDeliveryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ProofsOfDeliveryApi apiInstance = new ProofsOfDeliveryApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ProofOfDeliveryCreateDto proofOfDeliveryCreateDto = new ProofOfDeliveryCreateDto(); // ProofOfDeliveryCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createProofOfDeliveryAsync(tenantId, apiVersion, xApiVersion, proofOfDeliveryCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProofsOfDeliveryApi#createProofOfDeliveryAsync");
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
| **proofOfDeliveryCreateDto** | [**ProofOfDeliveryCreateDto**](ProofOfDeliveryCreateDto.md)|  | [optional] |

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

<a id="deleteProofOfDeliveryAsync"></a>
# **deleteProofOfDeliveryAsync**
> EmptyEnvelope deleteProofOfDeliveryAsync(tenantId, podId, apiVersion, xApiVersion)

Delete a proof of delivery

Deletes a proof of delivery.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProofsOfDeliveryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ProofsOfDeliveryApi apiInstance = new ProofsOfDeliveryApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID podId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteProofOfDeliveryAsync(tenantId, podId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProofsOfDeliveryApi#deleteProofOfDeliveryAsync");
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
| **podId** | **UUID**|  | |
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

<a id="detachDeliveryNoteAsync"></a>
# **detachDeliveryNoteAsync**
> EmptyEnvelope detachDeliveryNoteAsync(tenantId, podId, noteId, apiVersion, xApiVersion)

Detach a delivery note

Detaches a delivery note from a proof of delivery.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProofsOfDeliveryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ProofsOfDeliveryApi apiInstance = new ProofsOfDeliveryApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID podId = UUID.randomUUID(); // UUID | 
    UUID noteId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.detachDeliveryNoteAsync(tenantId, podId, noteId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProofsOfDeliveryApi#detachDeliveryNoteAsync");
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
| **podId** | **UUID**|  | |
| **noteId** | **UUID**|  | |
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

<a id="disputeProofOfDeliveryAsync"></a>
# **disputeProofOfDeliveryAsync**
> EmptyEnvelope disputeProofOfDeliveryAsync(tenantId, podId, apiVersion, xApiVersion, disputeProofOfDeliveryRequest)

Dispute a proof of delivery

Disputes a proof of delivery.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProofsOfDeliveryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ProofsOfDeliveryApi apiInstance = new ProofsOfDeliveryApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID podId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    DisputeProofOfDeliveryRequest disputeProofOfDeliveryRequest = new DisputeProofOfDeliveryRequest(); // DisputeProofOfDeliveryRequest | 
    try {
      EmptyEnvelope result = apiInstance.disputeProofOfDeliveryAsync(tenantId, podId, apiVersion, xApiVersion, disputeProofOfDeliveryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProofsOfDeliveryApi#disputeProofOfDeliveryAsync");
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
| **podId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **disputeProofOfDeliveryRequest** | [**DisputeProofOfDeliveryRequest**](DisputeProofOfDeliveryRequest.md)|  | [optional] |

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

<a id="getProofOfDeliveryByIdAsync"></a>
# **getProofOfDeliveryByIdAsync**
> ProofOfDeliveryDtoEnvelope getProofOfDeliveryByIdAsync(tenantId, podId, apiVersion, xApiVersion)

Get proof of delivery by ID

Retrieves a specific proof of delivery by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProofsOfDeliveryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ProofsOfDeliveryApi apiInstance = new ProofsOfDeliveryApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID podId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ProofOfDeliveryDtoEnvelope result = apiInstance.getProofOfDeliveryByIdAsync(tenantId, podId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProofsOfDeliveryApi#getProofOfDeliveryByIdAsync");
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
| **podId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ProofOfDeliveryDtoEnvelope**](ProofOfDeliveryDtoEnvelope.md)

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

<a id="getProofOfDeliveryDeliveryNotesAsync"></a>
# **getProofOfDeliveryDeliveryNotesAsync**
> DeliveryNoteDtoListEnvelope getProofOfDeliveryDeliveryNotesAsync(tenantId, podId, apiVersion, xApiVersion)

Get attached delivery notes

Retrieves all delivery notes attached to a proof of delivery.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProofsOfDeliveryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ProofsOfDeliveryApi apiInstance = new ProofsOfDeliveryApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID podId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      DeliveryNoteDtoListEnvelope result = apiInstance.getProofOfDeliveryDeliveryNotesAsync(tenantId, podId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProofsOfDeliveryApi#getProofOfDeliveryDeliveryNotesAsync");
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
| **podId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**DeliveryNoteDtoListEnvelope**](DeliveryNoteDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **200** | OK |  -  |

<a id="getProofOfDeliveryDeliveryNotesCountAsync"></a>
# **getProofOfDeliveryDeliveryNotesCountAsync**
> Int32Envelope getProofOfDeliveryDeliveryNotesCountAsync(tenantId, podId, apiVersion, xApiVersion)

Get delivery notes count

Returns the count of delivery notes attached to a proof of delivery.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProofsOfDeliveryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ProofsOfDeliveryApi apiInstance = new ProofsOfDeliveryApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID podId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getProofOfDeliveryDeliveryNotesCountAsync(tenantId, podId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProofsOfDeliveryApi#getProofOfDeliveryDeliveryNotesCountAsync");
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
| **podId** | **UUID**|  | |
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
| **403** | Forbidden |  -  |
| **200** | OK |  -  |

<a id="getProofOfDeliveryLinesAsync"></a>
# **getProofOfDeliveryLinesAsync**
> ProofOfDeliveryLineDtoListEnvelope getProofOfDeliveryLinesAsync(tenantId, podId, apiVersion, xApiVersion)

Get proof of delivery lines

Retrieves all lines for a specific proof of delivery.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProofsOfDeliveryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ProofsOfDeliveryApi apiInstance = new ProofsOfDeliveryApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID podId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ProofOfDeliveryLineDtoListEnvelope result = apiInstance.getProofOfDeliveryLinesAsync(tenantId, podId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProofsOfDeliveryApi#getProofOfDeliveryLinesAsync");
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
| **podId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ProofOfDeliveryLineDtoListEnvelope**](ProofOfDeliveryLineDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **200** | OK |  -  |

<a id="getProofOfDeliveryLinesCountAsync"></a>
# **getProofOfDeliveryLinesCountAsync**
> Int32Envelope getProofOfDeliveryLinesCountAsync(tenantId, podId, apiVersion, xApiVersion)

Get proof of delivery lines count

Returns the count of lines for a specific proof of delivery.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProofsOfDeliveryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ProofsOfDeliveryApi apiInstance = new ProofsOfDeliveryApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID podId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getProofOfDeliveryLinesCountAsync(tenantId, podId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProofsOfDeliveryApi#getProofOfDeliveryLinesCountAsync");
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
| **podId** | **UUID**|  | |
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
| **403** | Forbidden |  -  |
| **200** | OK |  -  |

<a id="getProofsOfDeliveryAsync"></a>
# **getProofsOfDeliveryAsync**
> ProofOfDeliveryDtoListEnvelope getProofsOfDeliveryAsync(tenantId, apiVersion, xApiVersion)

Get all proofs of delivery

Retrieves all proofs of delivery for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProofsOfDeliveryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ProofsOfDeliveryApi apiInstance = new ProofsOfDeliveryApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ProofOfDeliveryDtoListEnvelope result = apiInstance.getProofsOfDeliveryAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProofsOfDeliveryApi#getProofsOfDeliveryAsync");
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

[**ProofOfDeliveryDtoListEnvelope**](ProofOfDeliveryDtoListEnvelope.md)

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

<a id="getProofsOfDeliveryCountAsync"></a>
# **getProofsOfDeliveryCountAsync**
> Int32Envelope getProofsOfDeliveryCountAsync(tenantId, apiVersion, xApiVersion)

Get proofs of delivery count

Returns the count of proofs of delivery for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProofsOfDeliveryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ProofsOfDeliveryApi apiInstance = new ProofsOfDeliveryApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getProofsOfDeliveryCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProofsOfDeliveryApi#getProofsOfDeliveryCountAsync");
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
| **403** | Forbidden |  -  |
| **200** | OK |  -  |

<a id="rejectProofOfDeliveryAsync"></a>
# **rejectProofOfDeliveryAsync**
> EmptyEnvelope rejectProofOfDeliveryAsync(tenantId, podId, apiVersion, xApiVersion, rejectProofOfDeliveryRequest)

Reject a proof of delivery

Rejects a proof of delivery.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProofsOfDeliveryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ProofsOfDeliveryApi apiInstance = new ProofsOfDeliveryApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID podId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    RejectProofOfDeliveryRequest rejectProofOfDeliveryRequest = new RejectProofOfDeliveryRequest(); // RejectProofOfDeliveryRequest | 
    try {
      EmptyEnvelope result = apiInstance.rejectProofOfDeliveryAsync(tenantId, podId, apiVersion, xApiVersion, rejectProofOfDeliveryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProofsOfDeliveryApi#rejectProofOfDeliveryAsync");
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
| **podId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **rejectProofOfDeliveryRequest** | [**RejectProofOfDeliveryRequest**](RejectProofOfDeliveryRequest.md)|  | [optional] |

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

<a id="removeProofOfDeliveryLineAsync"></a>
# **removeProofOfDeliveryLineAsync**
> EmptyEnvelope removeProofOfDeliveryLineAsync(tenantId, podId, lineId, apiVersion, xApiVersion)

Remove a proof of delivery line

Removes a line from a proof of delivery.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProofsOfDeliveryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ProofsOfDeliveryApi apiInstance = new ProofsOfDeliveryApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID podId = UUID.randomUUID(); // UUID | 
    UUID lineId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.removeProofOfDeliveryLineAsync(tenantId, podId, lineId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProofsOfDeliveryApi#removeProofOfDeliveryLineAsync");
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
| **podId** | **UUID**|  | |
| **lineId** | **UUID**|  | |
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

<a id="signProofOfDeliveryAsync"></a>
# **signProofOfDeliveryAsync**
> EmptyEnvelope signProofOfDeliveryAsync(tenantId, podId, apiVersion, xApiVersion, signProofOfDeliveryRequest)

Sign a proof of delivery

Signs a proof of delivery.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProofsOfDeliveryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ProofsOfDeliveryApi apiInstance = new ProofsOfDeliveryApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID podId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    SignProofOfDeliveryRequest signProofOfDeliveryRequest = new SignProofOfDeliveryRequest(); // SignProofOfDeliveryRequest | 
    try {
      EmptyEnvelope result = apiInstance.signProofOfDeliveryAsync(tenantId, podId, apiVersion, xApiVersion, signProofOfDeliveryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProofsOfDeliveryApi#signProofOfDeliveryAsync");
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
| **podId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **signProofOfDeliveryRequest** | [**SignProofOfDeliveryRequest**](SignProofOfDeliveryRequest.md)|  | [optional] |

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

<a id="updateProofOfDeliveryAsync"></a>
# **updateProofOfDeliveryAsync**
> EmptyEnvelope updateProofOfDeliveryAsync(tenantId, podId, apiVersion, xApiVersion, proofOfDeliveryUpdateDto)

Update a proof of delivery

Updates an existing proof of delivery.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProofsOfDeliveryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ProofsOfDeliveryApi apiInstance = new ProofsOfDeliveryApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID podId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ProofOfDeliveryUpdateDto proofOfDeliveryUpdateDto = new ProofOfDeliveryUpdateDto(); // ProofOfDeliveryUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateProofOfDeliveryAsync(tenantId, podId, apiVersion, xApiVersion, proofOfDeliveryUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProofsOfDeliveryApi#updateProofOfDeliveryAsync");
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
| **podId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **proofOfDeliveryUpdateDto** | [**ProofOfDeliveryUpdateDto**](ProofOfDeliveryUpdateDto.md)|  | [optional] |

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

<a id="updateProofOfDeliveryLineAsync"></a>
# **updateProofOfDeliveryLineAsync**
> EmptyEnvelope updateProofOfDeliveryLineAsync(tenantId, podId, lineId, apiVersion, xApiVersion, proofOfDeliveryLineUpdateDto)

Update a proof of delivery line

Updates an existing line on a proof of delivery.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProofsOfDeliveryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ProofsOfDeliveryApi apiInstance = new ProofsOfDeliveryApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID podId = UUID.randomUUID(); // UUID | 
    UUID lineId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ProofOfDeliveryLineUpdateDto proofOfDeliveryLineUpdateDto = new ProofOfDeliveryLineUpdateDto(); // ProofOfDeliveryLineUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateProofOfDeliveryLineAsync(tenantId, podId, lineId, apiVersion, xApiVersion, proofOfDeliveryLineUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProofsOfDeliveryApi#updateProofOfDeliveryLineAsync");
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
| **podId** | **UUID**|  | |
| **lineId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **proofOfDeliveryLineUpdateDto** | [**ProofOfDeliveryLineUpdateDto**](ProofOfDeliveryLineUpdateDto.md)|  | [optional] |

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

