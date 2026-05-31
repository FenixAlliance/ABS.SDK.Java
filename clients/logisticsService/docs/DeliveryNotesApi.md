# DeliveryNotesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDeliveryNoteAsync**](DeliveryNotesApi.md#createDeliveryNoteAsync) | **POST** /api/v2/LogisticsService/DeliveryNotes | Create a delivery note |
| [**deleteDeliveryNoteAsync**](DeliveryNotesApi.md#deleteDeliveryNoteAsync) | **DELETE** /api/v2/LogisticsService/DeliveryNotes/{deliveryNoteId} | Delete a delivery note |
| [**getDeliveryNoteByIdAsync**](DeliveryNotesApi.md#getDeliveryNoteByIdAsync) | **GET** /api/v2/LogisticsService/DeliveryNotes/{deliveryNoteId} | Get delivery note by ID |
| [**getDeliveryNotesAsync**](DeliveryNotesApi.md#getDeliveryNotesAsync) | **GET** /api/v2/LogisticsService/DeliveryNotes | Get all delivery notes |
| [**getDeliveryNotesCountAsync**](DeliveryNotesApi.md#getDeliveryNotesCountAsync) | **GET** /api/v2/LogisticsService/DeliveryNotes/Count | Get delivery notes count |
| [**updateDeliveryNoteAsync**](DeliveryNotesApi.md#updateDeliveryNoteAsync) | **PUT** /api/v2/LogisticsService/DeliveryNotes/{deliveryNoteId} | Update a delivery note |


<a id="createDeliveryNoteAsync"></a>
# **createDeliveryNoteAsync**
> EmptyEnvelope createDeliveryNoteAsync(tenantId, apiVersion, xApiVersion, deliveryNoteCreateDto)

Create a delivery note

Creates a new delivery note.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DeliveryNotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DeliveryNotesApi apiInstance = new DeliveryNotesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    DeliveryNoteCreateDto deliveryNoteCreateDto = new DeliveryNoteCreateDto(); // DeliveryNoteCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createDeliveryNoteAsync(tenantId, apiVersion, xApiVersion, deliveryNoteCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeliveryNotesApi#createDeliveryNoteAsync");
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
| **deliveryNoteCreateDto** | [**DeliveryNoteCreateDto**](DeliveryNoteCreateDto.md)|  | [optional] |

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

<a id="deleteDeliveryNoteAsync"></a>
# **deleteDeliveryNoteAsync**
> EmptyEnvelope deleteDeliveryNoteAsync(tenantId, deliveryNoteId, apiVersion, xApiVersion)

Delete a delivery note

Deletes a delivery note.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DeliveryNotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DeliveryNotesApi apiInstance = new DeliveryNotesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID deliveryNoteId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteDeliveryNoteAsync(tenantId, deliveryNoteId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeliveryNotesApi#deleteDeliveryNoteAsync");
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
| **deliveryNoteId** | **UUID**|  | |
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

<a id="getDeliveryNoteByIdAsync"></a>
# **getDeliveryNoteByIdAsync**
> DeliveryNoteDtoEnvelope getDeliveryNoteByIdAsync(tenantId, deliveryNoteId, apiVersion, xApiVersion)

Get delivery note by ID

Retrieves a specific delivery note.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DeliveryNotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DeliveryNotesApi apiInstance = new DeliveryNotesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID deliveryNoteId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      DeliveryNoteDtoEnvelope result = apiInstance.getDeliveryNoteByIdAsync(tenantId, deliveryNoteId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeliveryNotesApi#getDeliveryNoteByIdAsync");
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
| **deliveryNoteId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**DeliveryNoteDtoEnvelope**](DeliveryNoteDtoEnvelope.md)

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

<a id="getDeliveryNotesAsync"></a>
# **getDeliveryNotesAsync**
> DeliveryNoteDtoListEnvelope getDeliveryNotesAsync(tenantId, apiVersion, xApiVersion)

Get all delivery notes

Retrieves all delivery notes for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DeliveryNotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DeliveryNotesApi apiInstance = new DeliveryNotesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      DeliveryNoteDtoListEnvelope result = apiInstance.getDeliveryNotesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeliveryNotesApi#getDeliveryNotesAsync");
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
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getDeliveryNotesCountAsync"></a>
# **getDeliveryNotesCountAsync**
> Int32Envelope getDeliveryNotesCountAsync(tenantId, apiVersion, xApiVersion)

Get delivery notes count

Returns the count of delivery notes.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DeliveryNotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DeliveryNotesApi apiInstance = new DeliveryNotesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getDeliveryNotesCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeliveryNotesApi#getDeliveryNotesCountAsync");
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

<a id="updateDeliveryNoteAsync"></a>
# **updateDeliveryNoteAsync**
> EmptyEnvelope updateDeliveryNoteAsync(tenantId, deliveryNoteId, apiVersion, xApiVersion, deliveryNoteUpdateDto)

Update a delivery note

Updates an existing delivery note.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DeliveryNotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DeliveryNotesApi apiInstance = new DeliveryNotesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID deliveryNoteId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    DeliveryNoteUpdateDto deliveryNoteUpdateDto = new DeliveryNoteUpdateDto(); // DeliveryNoteUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateDeliveryNoteAsync(tenantId, deliveryNoteId, apiVersion, xApiVersion, deliveryNoteUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeliveryNotesApi#updateDeliveryNoteAsync");
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
| **deliveryNoteId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **deliveryNoteUpdateDto** | [**DeliveryNoteUpdateDto**](DeliveryNoteUpdateDto.md)|  | [optional] |

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

