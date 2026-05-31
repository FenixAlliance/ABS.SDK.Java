# JournalTypesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createJournalTypeAsync**](JournalTypesApi.md#createJournalTypeAsync) | **POST** /api/v2/AccountingService/JournalTypes | Creates a new journal type |
| [**deleteJournalTypeAsync**](JournalTypesApi.md#deleteJournalTypeAsync) | **DELETE** /api/v2/AccountingService/JournalTypes/{journalTypeId} | Deletes a journal type |
| [**getJournalTypeDetailsAsync**](JournalTypesApi.md#getJournalTypeDetailsAsync) | **GET** /api/v2/AccountingService/JournalTypes/{journalTypeId} | Retrieves a journal type by ID |
| [**getJournalTypesAsync**](JournalTypesApi.md#getJournalTypesAsync) | **GET** /api/v2/AccountingService/JournalTypes | Retrieves all journal types |
| [**getJournalTypesCountAsync**](JournalTypesApi.md#getJournalTypesCountAsync) | **GET** /api/v2/AccountingService/JournalTypes/Count | Counts journal types |
| [**updateJournalTypeAsync**](JournalTypesApi.md#updateJournalTypeAsync) | **PUT** /api/v2/AccountingService/JournalTypes/{journalTypeId} | Updates an existing journal type |


<a id="createJournalTypeAsync"></a>
# **createJournalTypeAsync**
> EmptyEnvelope createJournalTypeAsync(tenantId, apiVersion, xApiVersion, journalTypeCreateDto)

Creates a new journal type

Adds a new journal type to the tenant&#39;s catalog.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JournalTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    JournalTypesApi apiInstance = new JournalTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    JournalTypeCreateDto journalTypeCreateDto = new JournalTypeCreateDto(); // JournalTypeCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createJournalTypeAsync(tenantId, apiVersion, xApiVersion, journalTypeCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JournalTypesApi#createJournalTypeAsync");
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
| **journalTypeCreateDto** | [**JournalTypeCreateDto**](JournalTypeCreateDto.md)|  | [optional] |

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

<a id="deleteJournalTypeAsync"></a>
# **deleteJournalTypeAsync**
> EmptyEnvelope deleteJournalTypeAsync(tenantId, journalTypeId, apiVersion, xApiVersion)

Deletes a journal type

Removes a journal type from the tenant&#39;s configuration.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JournalTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    JournalTypesApi apiInstance = new JournalTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID journalTypeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteJournalTypeAsync(tenantId, journalTypeId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JournalTypesApi#deleteJournalTypeAsync");
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
| **journalTypeId** | **UUID**|  | |
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

<a id="getJournalTypeDetailsAsync"></a>
# **getJournalTypeDetailsAsync**
> JournalTypeDtoEnvelope getJournalTypeDetailsAsync(tenantId, journalTypeId, apiVersion, xApiVersion)

Retrieves a journal type by ID

Fetches the journal type matching the specified ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JournalTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    JournalTypesApi apiInstance = new JournalTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID journalTypeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      JournalTypeDtoEnvelope result = apiInstance.getJournalTypeDetailsAsync(tenantId, journalTypeId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JournalTypesApi#getJournalTypeDetailsAsync");
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
| **journalTypeId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**JournalTypeDtoEnvelope**](JournalTypeDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getJournalTypesAsync"></a>
# **getJournalTypesAsync**
> JournalTypeDtoIReadOnlyListEnvelope getJournalTypesAsync(tenantId, apiVersion, xApiVersion)

Retrieves all journal types

Fetches all journal types for the current tenant with OData support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JournalTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    JournalTypesApi apiInstance = new JournalTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      JournalTypeDtoIReadOnlyListEnvelope result = apiInstance.getJournalTypesAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JournalTypesApi#getJournalTypesAsync");
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

[**JournalTypeDtoIReadOnlyListEnvelope**](JournalTypeDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getJournalTypesCountAsync"></a>
# **getJournalTypesCountAsync**
> Int32Envelope getJournalTypesCountAsync(tenantId, apiVersion, xApiVersion)

Counts journal types

Returns the total number of journal types available for the tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JournalTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    JournalTypesApi apiInstance = new JournalTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getJournalTypesCountAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JournalTypesApi#getJournalTypesCountAsync");
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

<a id="updateJournalTypeAsync"></a>
# **updateJournalTypeAsync**
> EmptyEnvelope updateJournalTypeAsync(tenantId, journalTypeId, apiVersion, xApiVersion, journalTypeUpdateDto)

Updates an existing journal type

Modifies the details of a specific journal type.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JournalTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    JournalTypesApi apiInstance = new JournalTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID journalTypeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    JournalTypeUpdateDto journalTypeUpdateDto = new JournalTypeUpdateDto(); // JournalTypeUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateJournalTypeAsync(tenantId, journalTypeId, apiVersion, xApiVersion, journalTypeUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JournalTypesApi#updateJournalTypeAsync");
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
| **journalTypeId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **journalTypeUpdateDto** | [**JournalTypeUpdateDto**](JournalTypeUpdateDto.md)|  | [optional] |

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

