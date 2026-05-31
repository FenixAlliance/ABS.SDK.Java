# DealUnitsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**calculateDealUnitAsync**](DealUnitsApi.md#calculateDealUnitAsync) | **PUT** /api/v2/DealsService/DealUnits/{dealUnitId}/Calculate | Calculate a deal unit |
| [**calculateDealUnitLineAsync**](DealUnitsApi.md#calculateDealUnitLineAsync) | **PUT** /api/v2/DealsService/DealUnits/{dealUnitId}/Lines/{dealUnitLineId}/Calculate | Calculate a deal unit line |
| [**createDealUnitAsync**](DealUnitsApi.md#createDealUnitAsync) | **POST** /api/v2/DealsService/DealUnits | Create a deal unit |
| [**createGetDealUnitLinesAsync**](DealUnitsApi.md#createGetDealUnitLinesAsync) | **POST** /api/v2/DealsService/DealUnits/{dealUnitId}/Lines | Create a deal unit line |
| [**deleteDealUnitAsync**](DealUnitsApi.md#deleteDealUnitAsync) | **DELETE** /api/v2/DealsService/DealUnits/{dealUnitId} | Delete a deal unit |
| [**deleteDealUnitPriceAsync**](DealUnitsApi.md#deleteDealUnitPriceAsync) | **DELETE** /api/v2/DealsService/DealUnits/{dealUnitId}/Lines/{dealUnitLineId} | Delete a deal unit line |
| [**getDealUnitAsync**](DealUnitsApi.md#getDealUnitAsync) | **GET** /api/v2/DealsService/DealUnits/{dealUnitId} | Get deal unit by ID |
| [**getDealUnitLinesAsync**](DealUnitsApi.md#getDealUnitLinesAsync) | **GET** /api/v2/DealsService/DealUnits/{dealUnitId}/Lines | Get deal unit lines |
| [**getDealUnitLinesCountAsync**](DealUnitsApi.md#getDealUnitLinesCountAsync) | **GET** /api/v2/DealsService/DealUnits/{dealUnitId}/Lines/Count | Get deal unit lines count |
| [**getDealUnitPriceAsync**](DealUnitsApi.md#getDealUnitPriceAsync) | **GET** /api/v2/DealsService/DealUnits/{dealUnitId}/Lines/{dealUnitLineId} | Get a deal unit line by ID |
| [**getDealUnitsAsync**](DealUnitsApi.md#getDealUnitsAsync) | **GET** /api/v2/DealsService/DealUnits | Get deal units |
| [**getDealUnitsCountAsync**](DealUnitsApi.md#getDealUnitsCountAsync) | **GET** /api/v2/DealsService/DealUnits/Count | Get deal units count |
| [**getExtendedDealUnitAsync**](DealUnitsApi.md#getExtendedDealUnitAsync) | **GET** /api/v2/DealsService/DealUnits/{dealUnitId}/Extended | Get extended deal unit by ID |
| [**getExtendedDealUnitsAsync**](DealUnitsApi.md#getExtendedDealUnitsAsync) | **GET** /api/v2/DealsService/DealUnits/Extended | Get extended deal units |
| [**updateDealUnitAsync**](DealUnitsApi.md#updateDealUnitAsync) | **PUT** /api/v2/DealsService/DealUnits/{dealUnitId} | Update a deal unit |
| [**updateDealUnitPriceAsync**](DealUnitsApi.md#updateDealUnitPriceAsync) | **PUT** /api/v2/DealsService/DealUnits/{dealUnitId}/Lines/{dealUnitLineId} | Update a deal unit line |


<a id="calculateDealUnitAsync"></a>
# **calculateDealUnitAsync**
> EmptyEnvelope calculateDealUnitAsync(tenantId, dealUnitId)

Calculate a deal unit

Triggers recalculation of totals and derived values for a specific deal unit.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DealUnitsApi apiInstance = new DealUnitsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID dealUnitId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.calculateDealUnitAsync(tenantId, dealUnitId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitsApi#calculateDealUnitAsync");
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
| **dealUnitId** | **UUID**|  | |

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

<a id="calculateDealUnitLineAsync"></a>
# **calculateDealUnitLineAsync**
> EmptyEnvelope calculateDealUnitLineAsync(tenantId, dealUnitId, dealUnitLineId)

Calculate a deal unit line

Triggers recalculation of totals and derived values for a specific deal unit line.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DealUnitsApi apiInstance = new DealUnitsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID dealUnitId = UUID.randomUUID(); // UUID | 
    UUID dealUnitLineId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.calculateDealUnitLineAsync(tenantId, dealUnitId, dealUnitLineId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitsApi#calculateDealUnitLineAsync");
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
| **dealUnitId** | **UUID**|  | |
| **dealUnitLineId** | **UUID**|  | |

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

<a id="createDealUnitAsync"></a>
# **createDealUnitAsync**
> EmptyEnvelope createDealUnitAsync(tenantId, dealUnitCreateDto)

Create a deal unit

Creates a new deal unit for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DealUnitsApi apiInstance = new DealUnitsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    DealUnitCreateDto dealUnitCreateDto = new DealUnitCreateDto(); // DealUnitCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createDealUnitAsync(tenantId, dealUnitCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitsApi#createDealUnitAsync");
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
| **dealUnitCreateDto** | [**DealUnitCreateDto**](DealUnitCreateDto.md)|  | [optional] |

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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="createGetDealUnitLinesAsync"></a>
# **createGetDealUnitLinesAsync**
> EmptyEnvelope createGetDealUnitLinesAsync(tenantId, dealUnitId, dealUnitLineCreateDto)

Create a deal unit line

Creates a new line within a specific deal unit.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DealUnitsApi apiInstance = new DealUnitsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID dealUnitId = UUID.randomUUID(); // UUID | 
    DealUnitLineCreateDto dealUnitLineCreateDto = new DealUnitLineCreateDto(); // DealUnitLineCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createGetDealUnitLinesAsync(tenantId, dealUnitId, dealUnitLineCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitsApi#createGetDealUnitLinesAsync");
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
| **dealUnitId** | **UUID**|  | |
| **dealUnitLineCreateDto** | [**DealUnitLineCreateDto**](DealUnitLineCreateDto.md)|  | [optional] |

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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="deleteDealUnitAsync"></a>
# **deleteDealUnitAsync**
> EmptyEnvelope deleteDealUnitAsync(tenantId, dealUnitId)

Delete a deal unit

Deletes an existing deal unit by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DealUnitsApi apiInstance = new DealUnitsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID dealUnitId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.deleteDealUnitAsync(tenantId, dealUnitId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitsApi#deleteDealUnitAsync");
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
| **dealUnitId** | **UUID**|  | |

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

<a id="deleteDealUnitPriceAsync"></a>
# **deleteDealUnitPriceAsync**
> EmptyEnvelope deleteDealUnitPriceAsync(tenantId, dealUnitId, dealUnitLineId)

Delete a deal unit line

Deletes an existing line from a specific deal unit.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DealUnitsApi apiInstance = new DealUnitsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID dealUnitId = UUID.randomUUID(); // UUID | 
    UUID dealUnitLineId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.deleteDealUnitPriceAsync(tenantId, dealUnitId, dealUnitLineId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitsApi#deleteDealUnitPriceAsync");
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
| **dealUnitId** | **UUID**|  | |
| **dealUnitLineId** | **UUID**|  | |

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

<a id="getDealUnitAsync"></a>
# **getDealUnitAsync**
> DealUnitDtoEnvelope getDealUnitAsync(tenantId, dealUnitId)

Get deal unit by ID

Retrieves a single deal unit by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DealUnitsApi apiInstance = new DealUnitsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID dealUnitId = UUID.randomUUID(); // UUID | 
    try {
      DealUnitDtoEnvelope result = apiInstance.getDealUnitAsync(tenantId, dealUnitId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitsApi#getDealUnitAsync");
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
| **dealUnitId** | **UUID**|  | |

### Return type

[**DealUnitDtoEnvelope**](DealUnitDtoEnvelope.md)

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

<a id="getDealUnitLinesAsync"></a>
# **getDealUnitLinesAsync**
> DealUnitLineDtoListEnvelope getDealUnitLinesAsync(tenantId, dealUnitId, itemId)

Get deal unit lines

Retrieves a list of lines for a specific deal unit with OData query support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DealUnitsApi apiInstance = new DealUnitsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID dealUnitId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    try {
      DealUnitLineDtoListEnvelope result = apiInstance.getDealUnitLinesAsync(tenantId, dealUnitId, itemId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitsApi#getDealUnitLinesAsync");
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
| **dealUnitId** | **UUID**|  | |
| **itemId** | **UUID**|  | [optional] |

### Return type

[**DealUnitLineDtoListEnvelope**](DealUnitLineDtoListEnvelope.md)

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

<a id="getDealUnitLinesCountAsync"></a>
# **getDealUnitLinesCountAsync**
> Int32Envelope getDealUnitLinesCountAsync(tenantId, dealUnitId)

Get deal unit lines count

Returns the total count of lines for a specific deal unit with OData filter support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DealUnitsApi apiInstance = new DealUnitsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID dealUnitId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.getDealUnitLinesCountAsync(tenantId, dealUnitId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitsApi#getDealUnitLinesCountAsync");
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
| **dealUnitId** | **UUID**|  | |

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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getDealUnitPriceAsync"></a>
# **getDealUnitPriceAsync**
> DealUnitLineDtoEnvelope getDealUnitPriceAsync(tenantId, dealUnitId, dealUnitLineId)

Get a deal unit line by ID

Retrieves a single deal unit line by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DealUnitsApi apiInstance = new DealUnitsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID dealUnitId = UUID.randomUUID(); // UUID | 
    UUID dealUnitLineId = UUID.randomUUID(); // UUID | 
    try {
      DealUnitLineDtoEnvelope result = apiInstance.getDealUnitPriceAsync(tenantId, dealUnitId, dealUnitLineId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitsApi#getDealUnitPriceAsync");
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
| **dealUnitId** | **UUID**|  | |
| **dealUnitLineId** | **UUID**|  | |

### Return type

[**DealUnitLineDtoEnvelope**](DealUnitLineDtoEnvelope.md)

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

<a id="getDealUnitsAsync"></a>
# **getDealUnitsAsync**
> DealUnitDtoListEnvelope getDealUnitsAsync(tenantId)

Get deal units

Retrieves a list of deal units for the specified tenant with OData query support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DealUnitsApi apiInstance = new DealUnitsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      DealUnitDtoListEnvelope result = apiInstance.getDealUnitsAsync(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitsApi#getDealUnitsAsync");
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

### Return type

[**DealUnitDtoListEnvelope**](DealUnitDtoListEnvelope.md)

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

<a id="getDealUnitsCountAsync"></a>
# **getDealUnitsCountAsync**
> Int32Envelope getDealUnitsCountAsync(tenantId)

Get deal units count

Returns the total count of deal units for the specified tenant with OData filter support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DealUnitsApi apiInstance = new DealUnitsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.getDealUnitsCountAsync(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitsApi#getDealUnitsCountAsync");
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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getExtendedDealUnitAsync"></a>
# **getExtendedDealUnitAsync**
> ExtendedDealUnitDtoEnvelope getExtendedDealUnitAsync(tenantId, dealUnitId)

Get extended deal unit by ID

Retrieves a single deal unit with extended details by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DealUnitsApi apiInstance = new DealUnitsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID dealUnitId = UUID.randomUUID(); // UUID | 
    try {
      ExtendedDealUnitDtoEnvelope result = apiInstance.getExtendedDealUnitAsync(tenantId, dealUnitId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitsApi#getExtendedDealUnitAsync");
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
| **dealUnitId** | **UUID**|  | |

### Return type

[**ExtendedDealUnitDtoEnvelope**](ExtendedDealUnitDtoEnvelope.md)

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

<a id="getExtendedDealUnitsAsync"></a>
# **getExtendedDealUnitsAsync**
> ExtendedDealUnitDtoListEnvelope getExtendedDealUnitsAsync(tenantId)

Get extended deal units

Retrieves a list of deal units with extended details for the specified tenant with OData query support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DealUnitsApi apiInstance = new DealUnitsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      ExtendedDealUnitDtoListEnvelope result = apiInstance.getExtendedDealUnitsAsync(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitsApi#getExtendedDealUnitsAsync");
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

### Return type

[**ExtendedDealUnitDtoListEnvelope**](ExtendedDealUnitDtoListEnvelope.md)

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

<a id="updateDealUnitAsync"></a>
# **updateDealUnitAsync**
> EmptyEnvelope updateDealUnitAsync(tenantId, dealUnitId, dealUnitUpdateDto)

Update a deal unit

Updates an existing deal unit by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DealUnitsApi apiInstance = new DealUnitsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID dealUnitId = UUID.randomUUID(); // UUID | 
    DealUnitUpdateDto dealUnitUpdateDto = new DealUnitUpdateDto(); // DealUnitUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateDealUnitAsync(tenantId, dealUnitId, dealUnitUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitsApi#updateDealUnitAsync");
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
| **dealUnitId** | **UUID**|  | |
| **dealUnitUpdateDto** | [**DealUnitUpdateDto**](DealUnitUpdateDto.md)|  | [optional] |

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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="updateDealUnitPriceAsync"></a>
# **updateDealUnitPriceAsync**
> EmptyEnvelope updateDealUnitPriceAsync(tenantId, dealUnitId, dealUnitLineId, dealUnitLineUpdateDto)

Update a deal unit line

Updates an existing line within a specific deal unit.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealUnitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DealUnitsApi apiInstance = new DealUnitsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID dealUnitId = UUID.randomUUID(); // UUID | 
    UUID dealUnitLineId = UUID.randomUUID(); // UUID | 
    DealUnitLineUpdateDto dealUnitLineUpdateDto = new DealUnitLineUpdateDto(); // DealUnitLineUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateDealUnitPriceAsync(tenantId, dealUnitId, dealUnitLineId, dealUnitLineUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealUnitsApi#updateDealUnitPriceAsync");
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
| **dealUnitId** | **UUID**|  | |
| **dealUnitLineId** | **UUID**|  | |
| **dealUnitLineUpdateDto** | [**DealUnitLineUpdateDto**](DealUnitLineUpdateDto.md)|  | [optional] |

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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

