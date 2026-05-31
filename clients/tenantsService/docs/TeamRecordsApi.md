# TeamRecordsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTenantTeamRecord**](TeamRecordsApi.md#createTenantTeamRecord) | **POST** /api/v2/TenantsService/TeamRecords | Create a new tenant team record |
| [**deleteTenantTeamRecord**](TeamRecordsApi.md#deleteTenantTeamRecord) | **DELETE** /api/v2/TenantsService/TeamRecords/{tenantTeamRecordId} | Delete a tenant team record |
| [**getTenantTeamRecordById**](TeamRecordsApi.md#getTenantTeamRecordById) | **GET** /api/v2/TenantsService/TeamRecords/{tenantTeamRecordId} | Retrieve a single tenant team record by its ID |
| [**getTenantTeamRecords**](TeamRecordsApi.md#getTenantTeamRecords) | **GET** /api/v2/TenantsService/TeamRecords | Retrieve a list of tenant team records |
| [**getTenantTeamRecordsCount**](TeamRecordsApi.md#getTenantTeamRecordsCount) | **GET** /api/v2/TenantsService/TeamRecords/Count | Get the count of tenant team records |
| [**updateTenantTeamRecord**](TeamRecordsApi.md#updateTenantTeamRecord) | **PUT** /api/v2/TenantsService/TeamRecords/{tenantTeamRecordId} | Update a tenant team record |


<a id="createTenantTeamRecord"></a>
# **createTenantTeamRecord**
> EmptyEnvelope createTenantTeamRecord(tenantId, apiVersion, xApiVersion, tenantTeamRecordCreateDto)

Create a new tenant team record

Create a new tenant team record

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamRecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TeamRecordsApi apiInstance = new TeamRecordsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TenantTeamRecordCreateDto tenantTeamRecordCreateDto = new TenantTeamRecordCreateDto(); // TenantTeamRecordCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createTenantTeamRecord(tenantId, apiVersion, xApiVersion, tenantTeamRecordCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamRecordsApi#createTenantTeamRecord");
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
| **tenantTeamRecordCreateDto** | [**TenantTeamRecordCreateDto**](TenantTeamRecordCreateDto.md)|  | [optional] |

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
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **201** | Created |  -  |

<a id="deleteTenantTeamRecord"></a>
# **deleteTenantTeamRecord**
> EmptyEnvelope deleteTenantTeamRecord(tenantId, tenantTeamRecordId, apiVersion, xApiVersion)

Delete a tenant team record

Delete a tenant team record

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamRecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TeamRecordsApi apiInstance = new TeamRecordsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID tenantTeamRecordId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteTenantTeamRecord(tenantId, tenantTeamRecordId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamRecordsApi#deleteTenantTeamRecord");
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
| **tenantTeamRecordId** | **UUID**|  | |
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
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getTenantTeamRecordById"></a>
# **getTenantTeamRecordById**
> TenantTeamRecordDtoEnvelope getTenantTeamRecordById(tenantId, tenantTeamRecordId, apiVersion, xApiVersion)

Retrieve a single tenant team record by its ID

Retrieve a single tenant team record by its ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamRecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TeamRecordsApi apiInstance = new TeamRecordsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID tenantTeamRecordId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TenantTeamRecordDtoEnvelope result = apiInstance.getTenantTeamRecordById(tenantId, tenantTeamRecordId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamRecordsApi#getTenantTeamRecordById");
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
| **tenantTeamRecordId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**TenantTeamRecordDtoEnvelope**](TenantTeamRecordDtoEnvelope.md)

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

<a id="getTenantTeamRecords"></a>
# **getTenantTeamRecords**
> TenantTeamRecordDtoListEnvelope getTenantTeamRecords(tenantId, apiVersion, xApiVersion)

Retrieve a list of tenant team records

Retrieve a list of tenant team records

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamRecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TeamRecordsApi apiInstance = new TeamRecordsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TenantTeamRecordDtoListEnvelope result = apiInstance.getTenantTeamRecords(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamRecordsApi#getTenantTeamRecords");
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

[**TenantTeamRecordDtoListEnvelope**](TenantTeamRecordDtoListEnvelope.md)

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

<a id="getTenantTeamRecordsCount"></a>
# **getTenantTeamRecordsCount**
> Int32Envelope getTenantTeamRecordsCount(tenantId, apiVersion, xApiVersion)

Get the count of tenant team records

Get the count of tenant team records

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamRecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TeamRecordsApi apiInstance = new TeamRecordsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getTenantTeamRecordsCount(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamRecordsApi#getTenantTeamRecordsCount");
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
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="updateTenantTeamRecord"></a>
# **updateTenantTeamRecord**
> EmptyEnvelope updateTenantTeamRecord(tenantId, tenantTeamRecordId, apiVersion, xApiVersion, tenantTeamRecordUpdateDto)

Update a tenant team record

Update a tenant team record

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamRecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TeamRecordsApi apiInstance = new TeamRecordsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID tenantTeamRecordId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TenantTeamRecordUpdateDto tenantTeamRecordUpdateDto = new TenantTeamRecordUpdateDto(); // TenantTeamRecordUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateTenantTeamRecord(tenantId, tenantTeamRecordId, apiVersion, xApiVersion, tenantTeamRecordUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamRecordsApi#updateTenantTeamRecord");
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
| **tenantTeamRecordId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **tenantTeamRecordUpdateDto** | [**TenantTeamRecordUpdateDto**](TenantTeamRecordUpdateDto.md)|  | [optional] |

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
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

