# LoyaltyProgramsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**countLoyaltyProgramsAsync**](LoyaltyProgramsApi.md#countLoyaltyProgramsAsync) | **GET** /api/v2/SalesService/LoyaltyPrograms/Count | Get loyalty programs count |
| [**createLoyaltyProgramAsync**](LoyaltyProgramsApi.md#createLoyaltyProgramAsync) | **POST** /api/v2/SalesService/LoyaltyPrograms | Create a loyalty program |
| [**deleteLoyaltyProgramAsync**](LoyaltyProgramsApi.md#deleteLoyaltyProgramAsync) | **DELETE** /api/v2/SalesService/LoyaltyPrograms/{loyaltyProgramId} | Delete a loyalty program |
| [**getLoyaltyProgramAsync**](LoyaltyProgramsApi.md#getLoyaltyProgramAsync) | **GET** /api/v2/SalesService/LoyaltyPrograms/{loyaltyProgramId} | Get loyalty program by ID |
| [**getLoyaltyProgramsAsync**](LoyaltyProgramsApi.md#getLoyaltyProgramsAsync) | **GET** /api/v2/SalesService/LoyaltyPrograms | Get loyalty programs |
| [**updateLoyaltyProgramAsync**](LoyaltyProgramsApi.md#updateLoyaltyProgramAsync) | **PUT** /api/v2/SalesService/LoyaltyPrograms/{loyaltyProgramId} | Update a loyalty program |


<a id="countLoyaltyProgramsAsync"></a>
# **countLoyaltyProgramsAsync**
> Int32Envelope countLoyaltyProgramsAsync(tenantId)

Get loyalty programs count

Returns the total count of loyalty programs for the specified tenant with OData filter support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LoyaltyProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    LoyaltyProgramsApi apiInstance = new LoyaltyProgramsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.countLoyaltyProgramsAsync(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltyProgramsApi#countLoyaltyProgramsAsync");
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

<a id="createLoyaltyProgramAsync"></a>
# **createLoyaltyProgramAsync**
> EmptyEnvelope createLoyaltyProgramAsync(tenantId, loyaltyProgramCreateDto)

Create a loyalty program

Creates a new loyalty program for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LoyaltyProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    LoyaltyProgramsApi apiInstance = new LoyaltyProgramsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    LoyaltyProgramCreateDto loyaltyProgramCreateDto = new LoyaltyProgramCreateDto(); // LoyaltyProgramCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createLoyaltyProgramAsync(tenantId, loyaltyProgramCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltyProgramsApi#createLoyaltyProgramAsync");
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
| **loyaltyProgramCreateDto** | [**LoyaltyProgramCreateDto**](LoyaltyProgramCreateDto.md)|  | [optional] |

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

<a id="deleteLoyaltyProgramAsync"></a>
# **deleteLoyaltyProgramAsync**
> EmptyEnvelope deleteLoyaltyProgramAsync(tenantId, loyaltyProgramId)

Delete a loyalty program

Deletes an existing loyalty program by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LoyaltyProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    LoyaltyProgramsApi apiInstance = new LoyaltyProgramsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID loyaltyProgramId = UUID.randomUUID(); // UUID | 
    try {
      EmptyEnvelope result = apiInstance.deleteLoyaltyProgramAsync(tenantId, loyaltyProgramId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltyProgramsApi#deleteLoyaltyProgramAsync");
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
| **loyaltyProgramId** | **UUID**|  | |

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

<a id="getLoyaltyProgramAsync"></a>
# **getLoyaltyProgramAsync**
> LoyaltyProgramDtoEnvelope getLoyaltyProgramAsync(tenantId, loyaltyProgramId)

Get loyalty program by ID

Retrieves a single loyalty program by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LoyaltyProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    LoyaltyProgramsApi apiInstance = new LoyaltyProgramsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID loyaltyProgramId = UUID.randomUUID(); // UUID | 
    try {
      LoyaltyProgramDtoEnvelope result = apiInstance.getLoyaltyProgramAsync(tenantId, loyaltyProgramId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltyProgramsApi#getLoyaltyProgramAsync");
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
| **loyaltyProgramId** | **UUID**|  | |

### Return type

[**LoyaltyProgramDtoEnvelope**](LoyaltyProgramDtoEnvelope.md)

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

<a id="getLoyaltyProgramsAsync"></a>
# **getLoyaltyProgramsAsync**
> LoyaltyProgramDtoListEnvelope getLoyaltyProgramsAsync(tenantId)

Get loyalty programs

Retrieves a list of loyalty programs for the specified tenant with OData query support.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LoyaltyProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    LoyaltyProgramsApi apiInstance = new LoyaltyProgramsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      LoyaltyProgramDtoListEnvelope result = apiInstance.getLoyaltyProgramsAsync(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltyProgramsApi#getLoyaltyProgramsAsync");
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

[**LoyaltyProgramDtoListEnvelope**](LoyaltyProgramDtoListEnvelope.md)

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

<a id="updateLoyaltyProgramAsync"></a>
# **updateLoyaltyProgramAsync**
> EmptyEnvelope updateLoyaltyProgramAsync(tenantId, loyaltyProgramId, loyaltyProgramUpdateDto)

Update a loyalty program

Updates an existing loyalty program by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LoyaltyProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    LoyaltyProgramsApi apiInstance = new LoyaltyProgramsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID loyaltyProgramId = UUID.randomUUID(); // UUID | 
    LoyaltyProgramUpdateDto loyaltyProgramUpdateDto = new LoyaltyProgramUpdateDto(); // LoyaltyProgramUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateLoyaltyProgramAsync(tenantId, loyaltyProgramId, loyaltyProgramUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltyProgramsApi#updateLoyaltyProgramAsync");
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
| **loyaltyProgramId** | **UUID**|  | |
| **loyaltyProgramUpdateDto** | [**LoyaltyProgramUpdateDto**](LoyaltyProgramUpdateDto.md)|  | [optional] |

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

