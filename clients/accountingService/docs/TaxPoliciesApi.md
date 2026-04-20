# TaxPoliciesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAppliedTaxPolicyRecord**](TaxPoliciesApi.md#createAppliedTaxPolicyRecord) | **POST** /api/v2/AccountingService/TaxPolicies/{taxPolicyId}/AppliedTaxPolicyRecords | Create an applied tax policy record |
| [**createItemTaxPolicyRecord**](TaxPoliciesApi.md#createItemTaxPolicyRecord) | **POST** /api/v2/AccountingService/TaxPolicies/{taxPolicyId}/ItemTaxPolicyRecords | Create an item tax policy record |
| [**createTaxPolicy**](TaxPoliciesApi.md#createTaxPolicy) | **POST** /api/v2/AccountingService/TaxPolicies | Create a tax policy |
| [**deleteAppliedTaxPolicyRecord**](TaxPoliciesApi.md#deleteAppliedTaxPolicyRecord) | **DELETE** /api/v2/AccountingService/TaxPolicies/{taxPolicyId}/AppliedTaxPolicyRecords/{appliedTaxPolicyRecordId} | Delete an applied tax policy record |
| [**deleteItemTaxPolicyRecord**](TaxPoliciesApi.md#deleteItemTaxPolicyRecord) | **DELETE** /api/v2/AccountingService/TaxPolicies/{taxPolicyId}/ItemTaxPolicyRecords/{itemTaxPolicyRecordId} | Delete an item tax policy record |
| [**deleteTaxPolicy**](TaxPoliciesApi.md#deleteTaxPolicy) | **DELETE** /api/v2/AccountingService/TaxPolicies/{id} | Delete a tax policy |
| [**getAppliedTaxPolicyRecord**](TaxPoliciesApi.md#getAppliedTaxPolicyRecord) | **GET** /api/v2/AccountingService/TaxPolicies/{taxPolicyId}/AppliedTaxPolicyRecords/{appliedTaxPolicyRecordId} | Get applied tax policy record by ID |
| [**getAppliedTaxPolicyRecords**](TaxPoliciesApi.md#getAppliedTaxPolicyRecords) | **GET** /api/v2/AccountingService/TaxPolicies/{taxPolicyId}/AppliedTaxPolicyRecords | Get applied tax policy records |
| [**getAppliedTaxPolicyRecordsCount**](TaxPoliciesApi.md#getAppliedTaxPolicyRecordsCount) | **GET** /api/v2/AccountingService/TaxPolicies/{taxPolicyId}/AppliedTaxPolicyRecords/Count | Get applied tax policy records count |
| [**getItemTaxPolicyRecord**](TaxPoliciesApi.md#getItemTaxPolicyRecord) | **GET** /api/v2/AccountingService/TaxPolicies/{taxPolicyId}/ItemTaxPolicyRecords/{itemTaxPolicyRecordId} | Get item tax policy record by ID |
| [**getItemTaxPolicyRecords**](TaxPoliciesApi.md#getItemTaxPolicyRecords) | **GET** /api/v2/AccountingService/TaxPolicies/{taxPolicyId}/ItemTaxPolicyRecords | Get item tax policy records |
| [**getTaxPolicies**](TaxPoliciesApi.md#getTaxPolicies) | **GET** /api/v2/AccountingService/TaxPolicies | Get all tax policies for a tenant |
| [**getTaxPoliciesByAuthority**](TaxPoliciesApi.md#getTaxPoliciesByAuthority) | **GET** /api/v2/AccountingService/TaxPolicies/ByAuthority/{authorityId} | Get tax policies by fiscal authority |
| [**getTaxPoliciesCount**](TaxPoliciesApi.md#getTaxPoliciesCount) | **GET** /api/v2/AccountingService/TaxPolicies/Count | Get tax policies count |
| [**getTaxPolicy**](TaxPoliciesApi.md#getTaxPolicy) | **GET** /api/v2/AccountingService/TaxPolicies/{id} | Get tax policy by ID |
| [**updateAppliedTaxPolicyRecord**](TaxPoliciesApi.md#updateAppliedTaxPolicyRecord) | **PUT** /api/v2/AccountingService/TaxPolicies/{taxPolicyId}/AppliedTaxPolicyRecords/{appliedTaxPolicyRecordId} | Update an applied tax policy record |
| [**updateItemTaxPolicyRecord**](TaxPoliciesApi.md#updateItemTaxPolicyRecord) | **PUT** /api/v2/AccountingService/TaxPolicies/{taxPolicyId}/ItemTaxPolicyRecords/{itemTaxPolicyRecordId} | Update an item tax policy record |
| [**updateTaxPolicy**](TaxPoliciesApi.md#updateTaxPolicy) | **PUT** /api/v2/AccountingService/TaxPolicies/{id} | Update a tax policy |


<a id="createAppliedTaxPolicyRecord"></a>
# **createAppliedTaxPolicyRecord**
> EmptyEnvelope createAppliedTaxPolicyRecord(tenantId, taxPolicyId, apiVersion, xApiVersion, appliedTaxPolicyRecordCreateDto)

Create an applied tax policy record

Creates a new applied tax policy record for the specified tax policy.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaxPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TaxPoliciesApi apiInstance = new TaxPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID taxPolicyId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    AppliedTaxPolicyRecordCreateDto appliedTaxPolicyRecordCreateDto = new AppliedTaxPolicyRecordCreateDto(); // AppliedTaxPolicyRecordCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createAppliedTaxPolicyRecord(tenantId, taxPolicyId, apiVersion, xApiVersion, appliedTaxPolicyRecordCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxPoliciesApi#createAppliedTaxPolicyRecord");
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
| **taxPolicyId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **appliedTaxPolicyRecordCreateDto** | [**AppliedTaxPolicyRecordCreateDto**](AppliedTaxPolicyRecordCreateDto.md)|  | [optional] |

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

<a id="createItemTaxPolicyRecord"></a>
# **createItemTaxPolicyRecord**
> EmptyEnvelope createItemTaxPolicyRecord(tenantId, taxPolicyId, apiVersion, xApiVersion, itemTaxPolicyRecordCreateDto)

Create an item tax policy record

Creates a new item tax policy record for the specified tax policy.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaxPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TaxPoliciesApi apiInstance = new TaxPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID taxPolicyId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemTaxPolicyRecordCreateDto itemTaxPolicyRecordCreateDto = new ItemTaxPolicyRecordCreateDto(); // ItemTaxPolicyRecordCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createItemTaxPolicyRecord(tenantId, taxPolicyId, apiVersion, xApiVersion, itemTaxPolicyRecordCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxPoliciesApi#createItemTaxPolicyRecord");
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
| **taxPolicyId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **itemTaxPolicyRecordCreateDto** | [**ItemTaxPolicyRecordCreateDto**](ItemTaxPolicyRecordCreateDto.md)|  | [optional] |

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

<a id="createTaxPolicy"></a>
# **createTaxPolicy**
> EmptyEnvelope createTaxPolicy(tenantId, apiVersion, xApiVersion, taxPolicyCreateDto)

Create a tax policy

Creates a new tax policy for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaxPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TaxPoliciesApi apiInstance = new TaxPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TaxPolicyCreateDto taxPolicyCreateDto = new TaxPolicyCreateDto(); // TaxPolicyCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createTaxPolicy(tenantId, apiVersion, xApiVersion, taxPolicyCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxPoliciesApi#createTaxPolicy");
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
| **taxPolicyCreateDto** | [**TaxPolicyCreateDto**](TaxPolicyCreateDto.md)|  | [optional] |

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

<a id="deleteAppliedTaxPolicyRecord"></a>
# **deleteAppliedTaxPolicyRecord**
> EmptyEnvelope deleteAppliedTaxPolicyRecord(tenantId, taxPolicyId, appliedTaxPolicyRecordId, apiVersion, xApiVersion)

Delete an applied tax policy record

Deletes an applied tax policy record identified by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaxPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TaxPoliciesApi apiInstance = new TaxPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID taxPolicyId = UUID.randomUUID(); // UUID | 
    UUID appliedTaxPolicyRecordId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteAppliedTaxPolicyRecord(tenantId, taxPolicyId, appliedTaxPolicyRecordId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxPoliciesApi#deleteAppliedTaxPolicyRecord");
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
| **taxPolicyId** | **UUID**|  | |
| **appliedTaxPolicyRecordId** | **UUID**|  | |
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
| **204** | No Content |  -  |

<a id="deleteItemTaxPolicyRecord"></a>
# **deleteItemTaxPolicyRecord**
> EmptyEnvelope deleteItemTaxPolicyRecord(tenantId, taxPolicyId, itemTaxPolicyRecordId, apiVersion, xApiVersion)

Delete an item tax policy record

Deletes an item tax policy record identified by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaxPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TaxPoliciesApi apiInstance = new TaxPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID taxPolicyId = UUID.randomUUID(); // UUID | 
    UUID itemTaxPolicyRecordId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteItemTaxPolicyRecord(tenantId, taxPolicyId, itemTaxPolicyRecordId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxPoliciesApi#deleteItemTaxPolicyRecord");
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
| **taxPolicyId** | **UUID**|  | |
| **itemTaxPolicyRecordId** | **UUID**|  | |
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
| **204** | No Content |  -  |

<a id="deleteTaxPolicy"></a>
# **deleteTaxPolicy**
> EmptyEnvelope deleteTaxPolicy(tenantId, id, apiVersion, xApiVersion)

Delete a tax policy

Deletes a tax policy identified by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaxPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TaxPoliciesApi apiInstance = new TaxPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteTaxPolicy(tenantId, id, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxPoliciesApi#deleteTaxPolicy");
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
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **204** | No Content |  -  |

<a id="getAppliedTaxPolicyRecord"></a>
# **getAppliedTaxPolicyRecord**
> AppliedTaxPolicyRecordDtoEnvelope getAppliedTaxPolicyRecord(tenantId, taxPolicyId, appliedTaxPolicyRecordId, apiVersion, xApiVersion)

Get applied tax policy record by ID

Retrieves a specific applied tax policy record by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaxPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TaxPoliciesApi apiInstance = new TaxPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID taxPolicyId = UUID.randomUUID(); // UUID | 
    UUID appliedTaxPolicyRecordId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      AppliedTaxPolicyRecordDtoEnvelope result = apiInstance.getAppliedTaxPolicyRecord(tenantId, taxPolicyId, appliedTaxPolicyRecordId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxPoliciesApi#getAppliedTaxPolicyRecord");
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
| **taxPolicyId** | **UUID**|  | |
| **appliedTaxPolicyRecordId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**AppliedTaxPolicyRecordDtoEnvelope**](AppliedTaxPolicyRecordDtoEnvelope.md)

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

<a id="getAppliedTaxPolicyRecords"></a>
# **getAppliedTaxPolicyRecords**
> AppliedTaxPolicyRecordDtoListEnvelope getAppliedTaxPolicyRecords(tenantId, taxPolicyId, apiVersion, xApiVersion)

Get applied tax policy records

Retrieves all applied tax policy records for the specified tax policy.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaxPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TaxPoliciesApi apiInstance = new TaxPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID taxPolicyId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      AppliedTaxPolicyRecordDtoListEnvelope result = apiInstance.getAppliedTaxPolicyRecords(tenantId, taxPolicyId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxPoliciesApi#getAppliedTaxPolicyRecords");
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
| **taxPolicyId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**AppliedTaxPolicyRecordDtoListEnvelope**](AppliedTaxPolicyRecordDtoListEnvelope.md)

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

<a id="getAppliedTaxPolicyRecordsCount"></a>
# **getAppliedTaxPolicyRecordsCount**
> Int32Envelope getAppliedTaxPolicyRecordsCount(tenantId, taxPolicyId, apiVersion, xApiVersion)

Get applied tax policy records count

Returns the total count of applied tax policy records for the specified tax policy.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaxPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TaxPoliciesApi apiInstance = new TaxPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID taxPolicyId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getAppliedTaxPolicyRecordsCount(tenantId, taxPolicyId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxPoliciesApi#getAppliedTaxPolicyRecordsCount");
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
| **taxPolicyId** | **UUID**|  | |
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

<a id="getItemTaxPolicyRecord"></a>
# **getItemTaxPolicyRecord**
> ItemTaxPolicyRecordDtoEnvelope getItemTaxPolicyRecord(tenantId, taxPolicyId, itemTaxPolicyRecordId, apiVersion, xApiVersion)

Get item tax policy record by ID

Retrieves a specific item tax policy record by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaxPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TaxPoliciesApi apiInstance = new TaxPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID taxPolicyId = UUID.randomUUID(); // UUID | 
    UUID itemTaxPolicyRecordId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemTaxPolicyRecordDtoEnvelope result = apiInstance.getItemTaxPolicyRecord(tenantId, taxPolicyId, itemTaxPolicyRecordId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxPoliciesApi#getItemTaxPolicyRecord");
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
| **taxPolicyId** | **UUID**|  | |
| **itemTaxPolicyRecordId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemTaxPolicyRecordDtoEnvelope**](ItemTaxPolicyRecordDtoEnvelope.md)

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

<a id="getItemTaxPolicyRecords"></a>
# **getItemTaxPolicyRecords**
> ItemTaxPolicyRecordDtoListEnvelope getItemTaxPolicyRecords(tenantId, taxPolicyId, apiVersion, xApiVersion)

Get item tax policy records

Retrieves all item tax policy records for the specified tax policy.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaxPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TaxPoliciesApi apiInstance = new TaxPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID taxPolicyId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemTaxPolicyRecordDtoListEnvelope result = apiInstance.getItemTaxPolicyRecords(tenantId, taxPolicyId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxPoliciesApi#getItemTaxPolicyRecords");
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
| **taxPolicyId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemTaxPolicyRecordDtoListEnvelope**](ItemTaxPolicyRecordDtoListEnvelope.md)

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

<a id="getTaxPolicies"></a>
# **getTaxPolicies**
> TaxPolicyDtoListEnvelope getTaxPolicies(tenantId, apiVersion, xApiVersion)

Get all tax policies for a tenant

Retrieves all tax policies for the specified tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaxPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TaxPoliciesApi apiInstance = new TaxPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TaxPolicyDtoListEnvelope result = apiInstance.getTaxPolicies(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxPoliciesApi#getTaxPolicies");
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

[**TaxPolicyDtoListEnvelope**](TaxPolicyDtoListEnvelope.md)

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

<a id="getTaxPoliciesByAuthority"></a>
# **getTaxPoliciesByAuthority**
> TaxPolicyDtoListEnvelope getTaxPoliciesByAuthority(tenantId, authorityId, apiVersion, xApiVersion)

Get tax policies by fiscal authority

Retrieves all tax policies associated with the specified fiscal authority.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaxPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TaxPoliciesApi apiInstance = new TaxPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID authorityId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TaxPolicyDtoListEnvelope result = apiInstance.getTaxPoliciesByAuthority(tenantId, authorityId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxPoliciesApi#getTaxPoliciesByAuthority");
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
| **authorityId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**TaxPolicyDtoListEnvelope**](TaxPolicyDtoListEnvelope.md)

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

<a id="getTaxPoliciesCount"></a>
# **getTaxPoliciesCount**
> Int32Envelope getTaxPoliciesCount(tenantId, apiVersion, xApiVersion)

Get tax policies count

Returns the count of tax policies for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaxPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TaxPoliciesApi apiInstance = new TaxPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getTaxPoliciesCount(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxPoliciesApi#getTaxPoliciesCount");
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

<a id="getTaxPolicy"></a>
# **getTaxPolicy**
> TaxPolicyDtoEnvelope getTaxPolicy(tenantId, id, apiVersion, xApiVersion)

Get tax policy by ID

Retrieves a specific tax policy by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaxPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TaxPoliciesApi apiInstance = new TaxPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TaxPolicyDtoEnvelope result = apiInstance.getTaxPolicy(tenantId, id, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxPoliciesApi#getTaxPolicy");
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
| **id** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**TaxPolicyDtoEnvelope**](TaxPolicyDtoEnvelope.md)

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

<a id="updateAppliedTaxPolicyRecord"></a>
# **updateAppliedTaxPolicyRecord**
> EmptyEnvelope updateAppliedTaxPolicyRecord(tenantId, taxPolicyId, appliedTaxPolicyRecordId, apiVersion, xApiVersion, appliedTaxPolicyRecordUpdateDto)

Update an applied tax policy record

Updates an existing applied tax policy record identified by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaxPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TaxPoliciesApi apiInstance = new TaxPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID taxPolicyId = UUID.randomUUID(); // UUID | 
    UUID appliedTaxPolicyRecordId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    AppliedTaxPolicyRecordUpdateDto appliedTaxPolicyRecordUpdateDto = new AppliedTaxPolicyRecordUpdateDto(); // AppliedTaxPolicyRecordUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateAppliedTaxPolicyRecord(tenantId, taxPolicyId, appliedTaxPolicyRecordId, apiVersion, xApiVersion, appliedTaxPolicyRecordUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxPoliciesApi#updateAppliedTaxPolicyRecord");
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
| **taxPolicyId** | **UUID**|  | |
| **appliedTaxPolicyRecordId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **appliedTaxPolicyRecordUpdateDto** | [**AppliedTaxPolicyRecordUpdateDto**](AppliedTaxPolicyRecordUpdateDto.md)|  | [optional] |

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
| **204** | No Content |  -  |

<a id="updateItemTaxPolicyRecord"></a>
# **updateItemTaxPolicyRecord**
> EmptyEnvelope updateItemTaxPolicyRecord(tenantId, taxPolicyId, itemTaxPolicyRecordId, apiVersion, xApiVersion, itemTaxPolicyRecordUpdateDto)

Update an item tax policy record

Updates an existing item tax policy record identified by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaxPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TaxPoliciesApi apiInstance = new TaxPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID taxPolicyId = UUID.randomUUID(); // UUID | 
    UUID itemTaxPolicyRecordId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemTaxPolicyRecordUpdateDto itemTaxPolicyRecordUpdateDto = new ItemTaxPolicyRecordUpdateDto(); // ItemTaxPolicyRecordUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateItemTaxPolicyRecord(tenantId, taxPolicyId, itemTaxPolicyRecordId, apiVersion, xApiVersion, itemTaxPolicyRecordUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxPoliciesApi#updateItemTaxPolicyRecord");
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
| **taxPolicyId** | **UUID**|  | |
| **itemTaxPolicyRecordId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **itemTaxPolicyRecordUpdateDto** | [**ItemTaxPolicyRecordUpdateDto**](ItemTaxPolicyRecordUpdateDto.md)|  | [optional] |

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
| **204** | No Content |  -  |

<a id="updateTaxPolicy"></a>
# **updateTaxPolicy**
> EmptyEnvelope updateTaxPolicy(tenantId, id, apiVersion, xApiVersion, taxPolicyUpdateDto)

Update a tax policy

Updates an existing tax policy identified by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaxPoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    TaxPoliciesApi apiInstance = new TaxPoliciesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID id = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    TaxPolicyUpdateDto taxPolicyUpdateDto = new TaxPolicyUpdateDto(); // TaxPolicyUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateTaxPolicy(tenantId, id, apiVersion, xApiVersion, taxPolicyUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxPoliciesApi#updateTaxPolicy");
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
| **id** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **taxPolicyUpdateDto** | [**TaxPolicyUpdateDto**](TaxPolicyUpdateDto.md)|  | [optional] |

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
| **204** | No Content |  -  |

