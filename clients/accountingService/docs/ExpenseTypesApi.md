# ExpenseTypesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createExpenseType**](ExpenseTypesApi.md#createExpenseType) | **POST** /api/v2/AccountingService/ExpenseTypes | Create an expense type |
| [**deleteExpenseType**](ExpenseTypesApi.md#deleteExpenseType) | **DELETE** /api/v2/AccountingService/ExpenseTypes/{expenseTypeId} | Delete an expense type |
| [**getExpenseType**](ExpenseTypesApi.md#getExpenseType) | **GET** /api/v2/AccountingService/ExpenseTypes/{expenseTypeId} | Get an expense type by id |
| [**getExpenseTypes**](ExpenseTypesApi.md#getExpenseTypes) | **GET** /api/v2/AccountingService/ExpenseTypes | Get all expense types for a tenant |
| [**getExpenseTypesCount**](ExpenseTypesApi.md#getExpenseTypesCount) | **GET** /api/v2/AccountingService/ExpenseTypes/Count | Get the count of expense types for a tenant |
| [**updateExpenseType**](ExpenseTypesApi.md#updateExpenseType) | **PUT** /api/v2/AccountingService/ExpenseTypes/{expenseTypeId} | Update an expense type |


<a id="createExpenseType"></a>
# **createExpenseType**
> EmptyEnvelope createExpenseType(tenantId, expenseTypeCreateDto, apiVersion, xApiVersion)

Create an expense type

Creates a new expense type.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ExpenseTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ExpenseTypesApi apiInstance = new ExpenseTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    ExpenseTypeCreateDto expenseTypeCreateDto = new ExpenseTypeCreateDto(); // ExpenseTypeCreateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.createExpenseType(tenantId, expenseTypeCreateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseTypesApi#createExpenseType");
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
| **expenseTypeCreateDto** | [**ExpenseTypeCreateDto**](ExpenseTypeCreateDto.md)|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

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

<a id="deleteExpenseType"></a>
# **deleteExpenseType**
> EmptyEnvelope deleteExpenseType(tenantId, expenseTypeId, apiVersion, xApiVersion)

Delete an expense type

Deletes an expense type.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ExpenseTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ExpenseTypesApi apiInstance = new ExpenseTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID expenseTypeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteExpenseType(tenantId, expenseTypeId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseTypesApi#deleteExpenseType");
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
| **expenseTypeId** | **UUID**|  | |
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

<a id="getExpenseType"></a>
# **getExpenseType**
> ExpenseTypeDtoEnvelope getExpenseType(tenantId, expenseTypeId, apiVersion, xApiVersion)

Get an expense type by id

Retrieves an expense type by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ExpenseTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ExpenseTypesApi apiInstance = new ExpenseTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID expenseTypeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ExpenseTypeDtoEnvelope result = apiInstance.getExpenseType(tenantId, expenseTypeId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseTypesApi#getExpenseType");
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
| **expenseTypeId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ExpenseTypeDtoEnvelope**](ExpenseTypeDtoEnvelope.md)

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

<a id="getExpenseTypes"></a>
# **getExpenseTypes**
> ExpenseTypeDtoListEnvelope getExpenseTypes(tenantId, apiVersion, xApiVersion)

Get all expense types for a tenant

Retrieves all expense types for the specified tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ExpenseTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ExpenseTypesApi apiInstance = new ExpenseTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ExpenseTypeDtoListEnvelope result = apiInstance.getExpenseTypes(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseTypesApi#getExpenseTypes");
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

[**ExpenseTypeDtoListEnvelope**](ExpenseTypeDtoListEnvelope.md)

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

<a id="getExpenseTypesCount"></a>
# **getExpenseTypesCount**
> Int32Envelope getExpenseTypesCount(tenantId, apiVersion, xApiVersion)

Get the count of expense types for a tenant

Retrieves the count of expense types for the specified tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ExpenseTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ExpenseTypesApi apiInstance = new ExpenseTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getExpenseTypesCount(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseTypesApi#getExpenseTypesCount");
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

<a id="updateExpenseType"></a>
# **updateExpenseType**
> EmptyEnvelope updateExpenseType(tenantId, expenseTypeId, expenseTypeUpdateDto, apiVersion, xApiVersion)

Update an expense type

Updates an existing expense type.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ExpenseTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ExpenseTypesApi apiInstance = new ExpenseTypesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID expenseTypeId = UUID.randomUUID(); // UUID | 
    ExpenseTypeUpdateDto expenseTypeUpdateDto = new ExpenseTypeUpdateDto(); // ExpenseTypeUpdateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.updateExpenseType(tenantId, expenseTypeId, expenseTypeUpdateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseTypesApi#updateExpenseType");
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
| **expenseTypeId** | **UUID**|  | |
| **expenseTypeUpdateDto** | [**ExpenseTypeUpdateDto**](ExpenseTypeUpdateDto.md)|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

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

