# CostCentresApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCostCentre**](CostCentresApi.md#createCostCentre) | **POST** /api/v2/AccountingService/CostCentres | Create a cost centre |
| [**createCostCentreBudget**](CostCentresApi.md#createCostCentreBudget) | **POST** /api/v2/AccountingService/CostCentres/CostCentreBudgets | Create a cost centre budget |
| [**createCostCentreGroup**](CostCentresApi.md#createCostCentreGroup) | **POST** /api/v2/AccountingService/CostCentres/CostCentreGroups | Create a cost centre group |
| [**deleteCostCentre**](CostCentresApi.md#deleteCostCentre) | **DELETE** /api/v2/AccountingService/CostCentres/{costCentreId} | Delete a cost centre |
| [**deleteCostCentreBudget**](CostCentresApi.md#deleteCostCentreBudget) | **DELETE** /api/v2/AccountingService/CostCentres/CostCentreBudgets/{budgetId} | Delete a cost centre budget |
| [**deleteCostCentreGroup**](CostCentresApi.md#deleteCostCentreGroup) | **DELETE** /api/v2/AccountingService/CostCentres/CostCentreGroups/{groupId} | Delete a cost centre group |
| [**getCostCentre**](CostCentresApi.md#getCostCentre) | **GET** /api/v2/AccountingService/CostCentres/{costCentreId} | Get a cost centre by id |
| [**getCostCentreBudget**](CostCentresApi.md#getCostCentreBudget) | **GET** /api/v2/AccountingService/CostCentres/CostCentreBudgets/{budgetId} | Get a cost centre budget by id |
| [**getCostCentreBudgets**](CostCentresApi.md#getCostCentreBudgets) | **GET** /api/v2/AccountingService/CostCentres/CostCentreBudgets | Get all cost centre budgets for a tenant |
| [**getCostCentreGroup**](CostCentresApi.md#getCostCentreGroup) | **GET** /api/v2/AccountingService/CostCentres/CostCentreGroups/{groupId} | Get a cost centre group by id |
| [**getCostCentreGroups**](CostCentresApi.md#getCostCentreGroups) | **GET** /api/v2/AccountingService/CostCentres/CostCentreGroups | Get all cost centre groups for a tenant |
| [**getCostCentreGroupsCount**](CostCentresApi.md#getCostCentreGroupsCount) | **GET** /api/v2/AccountingService/CostCentres/CostCentreGroups/Count | Get the count of cost centre groups for a tenant |
| [**getCostCentres**](CostCentresApi.md#getCostCentres) | **GET** /api/v2/AccountingService/CostCentres | Get all cost centres for a tenant |
| [**getCostCentresCount**](CostCentresApi.md#getCostCentresCount) | **GET** /api/v2/AccountingService/CostCentres/Count | Get the count of cost centres for a tenant |
| [**updateCostCentre**](CostCentresApi.md#updateCostCentre) | **PUT** /api/v2/AccountingService/CostCentres/{costCentreId} | Update a cost centre |
| [**updateCostCentreBudget**](CostCentresApi.md#updateCostCentreBudget) | **PUT** /api/v2/AccountingService/CostCentres/CostCentreBudgets/{budgetId} | Update a cost centre budget |
| [**updateCostCentreGroup**](CostCentresApi.md#updateCostCentreGroup) | **PUT** /api/v2/AccountingService/CostCentres/CostCentreGroups/{groupId} | Update a cost centre group |


<a id="createCostCentre"></a>
# **createCostCentre**
> EmptyEnvelope createCostCentre(tenantId, costCentreCreateDto, apiVersion, xApiVersion)

Create a cost centre

Creates a new cost centre.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CostCentresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CostCentresApi apiInstance = new CostCentresApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    CostCentreCreateDto costCentreCreateDto = new CostCentreCreateDto(); // CostCentreCreateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.createCostCentre(tenantId, costCentreCreateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CostCentresApi#createCostCentre");
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
| **costCentreCreateDto** | [**CostCentreCreateDto**](CostCentreCreateDto.md)|  | |
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

<a id="createCostCentreBudget"></a>
# **createCostCentreBudget**
> EmptyEnvelope createCostCentreBudget(tenantId, costCentreBudgetCreateDto, apiVersion, xApiVersion)

Create a cost centre budget

Creates a new cost centre budget.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CostCentresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CostCentresApi apiInstance = new CostCentresApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    CostCentreBudgetCreateDto costCentreBudgetCreateDto = new CostCentreBudgetCreateDto(); // CostCentreBudgetCreateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.createCostCentreBudget(tenantId, costCentreBudgetCreateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CostCentresApi#createCostCentreBudget");
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
| **costCentreBudgetCreateDto** | [**CostCentreBudgetCreateDto**](CostCentreBudgetCreateDto.md)|  | |
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

<a id="createCostCentreGroup"></a>
# **createCostCentreGroup**
> EmptyEnvelope createCostCentreGroup(tenantId, costCentreGroupCreateDto, apiVersion, xApiVersion)

Create a cost centre group

Creates a new cost centre group.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CostCentresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CostCentresApi apiInstance = new CostCentresApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    CostCentreGroupCreateDto costCentreGroupCreateDto = new CostCentreGroupCreateDto(); // CostCentreGroupCreateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.createCostCentreGroup(tenantId, costCentreGroupCreateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CostCentresApi#createCostCentreGroup");
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
| **costCentreGroupCreateDto** | [**CostCentreGroupCreateDto**](CostCentreGroupCreateDto.md)|  | |
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

<a id="deleteCostCentre"></a>
# **deleteCostCentre**
> EmptyEnvelope deleteCostCentre(tenantId, costCentreId, apiVersion, xApiVersion)

Delete a cost centre

Deletes a cost centre.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CostCentresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CostCentresApi apiInstance = new CostCentresApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID costCentreId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteCostCentre(tenantId, costCentreId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CostCentresApi#deleteCostCentre");
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
| **costCentreId** | **UUID**|  | |
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

<a id="deleteCostCentreBudget"></a>
# **deleteCostCentreBudget**
> EmptyEnvelope deleteCostCentreBudget(tenantId, budgetId, apiVersion, xApiVersion)

Delete a cost centre budget

Deletes a cost centre budget.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CostCentresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CostCentresApi apiInstance = new CostCentresApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID budgetId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteCostCentreBudget(tenantId, budgetId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CostCentresApi#deleteCostCentreBudget");
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
| **budgetId** | **UUID**|  | |
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

<a id="deleteCostCentreGroup"></a>
# **deleteCostCentreGroup**
> EmptyEnvelope deleteCostCentreGroup(tenantId, groupId, apiVersion, xApiVersion)

Delete a cost centre group

Deletes a cost centre group.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CostCentresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CostCentresApi apiInstance = new CostCentresApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID groupId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteCostCentreGroup(tenantId, groupId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CostCentresApi#deleteCostCentreGroup");
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
| **groupId** | **UUID**|  | |
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

<a id="getCostCentre"></a>
# **getCostCentre**
> CostCentreDtoEnvelope getCostCentre(tenantId, costCentreId, apiVersion, xApiVersion)

Get a cost centre by id

Retrieves a cost centre by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CostCentresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CostCentresApi apiInstance = new CostCentresApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID costCentreId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CostCentreDtoEnvelope result = apiInstance.getCostCentre(tenantId, costCentreId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CostCentresApi#getCostCentre");
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
| **costCentreId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CostCentreDtoEnvelope**](CostCentreDtoEnvelope.md)

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

<a id="getCostCentreBudget"></a>
# **getCostCentreBudget**
> CostCentreBudgetDtoEnvelope getCostCentreBudget(tenantId, budgetId, apiVersion, xApiVersion)

Get a cost centre budget by id

Retrieves a cost centre budget by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CostCentresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CostCentresApi apiInstance = new CostCentresApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID budgetId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CostCentreBudgetDtoEnvelope result = apiInstance.getCostCentreBudget(tenantId, budgetId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CostCentresApi#getCostCentreBudget");
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
| **budgetId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CostCentreBudgetDtoEnvelope**](CostCentreBudgetDtoEnvelope.md)

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

<a id="getCostCentreBudgets"></a>
# **getCostCentreBudgets**
> CostCentreBudgetDtoListEnvelope getCostCentreBudgets(tenantId, apiVersion, xApiVersion)

Get all cost centre budgets for a tenant

Retrieves all cost centre budgets for the specified tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CostCentresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CostCentresApi apiInstance = new CostCentresApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CostCentreBudgetDtoListEnvelope result = apiInstance.getCostCentreBudgets(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CostCentresApi#getCostCentreBudgets");
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

[**CostCentreBudgetDtoListEnvelope**](CostCentreBudgetDtoListEnvelope.md)

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

<a id="getCostCentreGroup"></a>
# **getCostCentreGroup**
> CostCentreGroupDtoEnvelope getCostCentreGroup(tenantId, groupId, apiVersion, xApiVersion)

Get a cost centre group by id

Retrieves a cost centre group by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CostCentresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CostCentresApi apiInstance = new CostCentresApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID groupId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CostCentreGroupDtoEnvelope result = apiInstance.getCostCentreGroup(tenantId, groupId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CostCentresApi#getCostCentreGroup");
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
| **groupId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CostCentreGroupDtoEnvelope**](CostCentreGroupDtoEnvelope.md)

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

<a id="getCostCentreGroups"></a>
# **getCostCentreGroups**
> CostCentreGroupDtoListEnvelope getCostCentreGroups(tenantId, apiVersion, xApiVersion)

Get all cost centre groups for a tenant

Retrieves all cost centre groups for the specified tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CostCentresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CostCentresApi apiInstance = new CostCentresApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CostCentreGroupDtoListEnvelope result = apiInstance.getCostCentreGroups(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CostCentresApi#getCostCentreGroups");
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

[**CostCentreGroupDtoListEnvelope**](CostCentreGroupDtoListEnvelope.md)

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

<a id="getCostCentreGroupsCount"></a>
# **getCostCentreGroupsCount**
> Int32Envelope getCostCentreGroupsCount(tenantId, apiVersion, xApiVersion)

Get the count of cost centre groups for a tenant

Retrieves the count of cost centre groups for the specified tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CostCentresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CostCentresApi apiInstance = new CostCentresApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getCostCentreGroupsCount(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CostCentresApi#getCostCentreGroupsCount");
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

<a id="getCostCentres"></a>
# **getCostCentres**
> CostCentreDtoListEnvelope getCostCentres(tenantId, apiVersion, xApiVersion)

Get all cost centres for a tenant

Retrieves all cost centres for the specified tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CostCentresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CostCentresApi apiInstance = new CostCentresApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CostCentreDtoListEnvelope result = apiInstance.getCostCentres(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CostCentresApi#getCostCentres");
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

[**CostCentreDtoListEnvelope**](CostCentreDtoListEnvelope.md)

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

<a id="getCostCentresCount"></a>
# **getCostCentresCount**
> Int32Envelope getCostCentresCount(tenantId, apiVersion, xApiVersion)

Get the count of cost centres for a tenant

Retrieves the count of cost centres for the specified tenant using OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CostCentresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CostCentresApi apiInstance = new CostCentresApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getCostCentresCount(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CostCentresApi#getCostCentresCount");
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

<a id="updateCostCentre"></a>
# **updateCostCentre**
> EmptyEnvelope updateCostCentre(tenantId, costCentreId, costCentreUpdateDto, apiVersion, xApiVersion)

Update a cost centre

Updates an existing cost centre.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CostCentresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CostCentresApi apiInstance = new CostCentresApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID costCentreId = UUID.randomUUID(); // UUID | 
    CostCentreUpdateDto costCentreUpdateDto = new CostCentreUpdateDto(); // CostCentreUpdateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.updateCostCentre(tenantId, costCentreId, costCentreUpdateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CostCentresApi#updateCostCentre");
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
| **costCentreId** | **UUID**|  | |
| **costCentreUpdateDto** | [**CostCentreUpdateDto**](CostCentreUpdateDto.md)|  | |
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

<a id="updateCostCentreBudget"></a>
# **updateCostCentreBudget**
> EmptyEnvelope updateCostCentreBudget(tenantId, budgetId, costCentreBudgetUpdateDto, apiVersion, xApiVersion)

Update a cost centre budget

Updates an existing cost centre budget.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CostCentresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CostCentresApi apiInstance = new CostCentresApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID budgetId = UUID.randomUUID(); // UUID | 
    CostCentreBudgetUpdateDto costCentreBudgetUpdateDto = new CostCentreBudgetUpdateDto(); // CostCentreBudgetUpdateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.updateCostCentreBudget(tenantId, budgetId, costCentreBudgetUpdateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CostCentresApi#updateCostCentreBudget");
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
| **budgetId** | **UUID**|  | |
| **costCentreBudgetUpdateDto** | [**CostCentreBudgetUpdateDto**](CostCentreBudgetUpdateDto.md)|  | |
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

<a id="updateCostCentreGroup"></a>
# **updateCostCentreGroup**
> EmptyEnvelope updateCostCentreGroup(tenantId, groupId, costCentreGroupUpdateDto, apiVersion, xApiVersion)

Update a cost centre group

Updates an existing cost centre group.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CostCentresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CostCentresApi apiInstance = new CostCentresApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID groupId = UUID.randomUUID(); // UUID | 
    CostCentreGroupUpdateDto costCentreGroupUpdateDto = new CostCentreGroupUpdateDto(); // CostCentreGroupUpdateDto | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.updateCostCentreGroup(tenantId, groupId, costCentreGroupUpdateDto, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CostCentresApi#updateCostCentreGroup");
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
| **groupId** | **UUID**|  | |
| **costCentreGroupUpdateDto** | [**CostCentreGroupUpdateDto**](CostCentreGroupUpdateDto.md)|  | |
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

