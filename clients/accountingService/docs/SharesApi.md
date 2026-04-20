# SharesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createShareClass**](SharesApi.md#createShareClass) | **POST** /api/v2/AccountingService/Shares/Classes | Creates a new share class |
| [**createShareIssuance**](SharesApi.md#createShareIssuance) | **POST** /api/v2/AccountingService/Shares/Issuances | Creates a new share issuance |
| [**createShareTransfer**](SharesApi.md#createShareTransfer) | **POST** /api/v2/AccountingService/Shares/Transfers | Creates a new share transfer |
| [**createShareTransferReason**](SharesApi.md#createShareTransferReason) | **POST** /api/v2/AccountingService/Shares/TransferReasons | Creates a new share transfer reason |
| [**deleteShareClass**](SharesApi.md#deleteShareClass) | **DELETE** /api/v2/AccountingService/Shares/Classes/{shareClassId} | Deletes an existing share class |
| [**deleteShareIssuance**](SharesApi.md#deleteShareIssuance) | **DELETE** /api/v2/AccountingService/Shares/Issuances/{issuanceId} | Deletes an existing share issuance |
| [**deleteShareTransfer**](SharesApi.md#deleteShareTransfer) | **DELETE** /api/v2/AccountingService/Shares/Transfers/{transferId} | Deletes an existing share transfer |
| [**deleteShareTransferReason**](SharesApi.md#deleteShareTransferReason) | **DELETE** /api/v2/AccountingService/Shares/TransferReasons/{reasonId} | Deletes an existing share transfer reason |
| [**getShareClass**](SharesApi.md#getShareClass) | **GET** /api/v2/AccountingService/Shares/Classes/{shareClassId} | Gets a share class by id |
| [**getShareClasses**](SharesApi.md#getShareClasses) | **GET** /api/v2/AccountingService/Shares/Classes | Gets the current tenant share classes |
| [**getShareClassesCount**](SharesApi.md#getShareClassesCount) | **GET** /api/v2/AccountingService/Shares/Classes/Count | Gets the current tenant share classes count |
| [**getShareIssuance**](SharesApi.md#getShareIssuance) | **GET** /api/v2/AccountingService/Shares/Issuances/{issuanceId} | Gets a share issuance by id |
| [**getShareIssuances**](SharesApi.md#getShareIssuances) | **GET** /api/v2/AccountingService/Shares/Issuances | Gets the current tenant share issuances |
| [**getShareIssuancesCount**](SharesApi.md#getShareIssuancesCount) | **GET** /api/v2/AccountingService/Shares/Issuances/Count | Gets the current tenant share issuances count |
| [**getShareTransfer**](SharesApi.md#getShareTransfer) | **GET** /api/v2/AccountingService/Shares/Transfers/{transferId} | Gets a share transfer by id |
| [**getShareTransferReason**](SharesApi.md#getShareTransferReason) | **GET** /api/v2/AccountingService/Shares/TransferReasons/{reasonId} | Gets a share transfer reason by id |
| [**getShareTransferReasons**](SharesApi.md#getShareTransferReasons) | **GET** /api/v2/AccountingService/Shares/TransferReasons | Gets the current tenant share transfer reasons |
| [**getShareTransferReasonsCount**](SharesApi.md#getShareTransferReasonsCount) | **GET** /api/v2/AccountingService/Shares/TransferReasons/Count | Gets the current tenant share transfer reasons count |
| [**getShareTransfers**](SharesApi.md#getShareTransfers) | **GET** /api/v2/AccountingService/Shares/Transfers | Gets the current tenant share transfers |
| [**getShareTransfersCount**](SharesApi.md#getShareTransfersCount) | **GET** /api/v2/AccountingService/Shares/Transfers/Count | Gets the current tenant share transfers count |
| [**updateShareClass**](SharesApi.md#updateShareClass) | **PUT** /api/v2/AccountingService/Shares/Classes/{shareClassId} | Updates an existing share class |
| [**updateShareIssuance**](SharesApi.md#updateShareIssuance) | **PUT** /api/v2/AccountingService/Shares/Issuances/{issuanceId} | Updates an existing share issuance |
| [**updateShareTransfer**](SharesApi.md#updateShareTransfer) | **PUT** /api/v2/AccountingService/Shares/Transfers/{transferId} | Updates an existing share transfer |
| [**updateShareTransferReason**](SharesApi.md#updateShareTransferReason) | **PUT** /api/v2/AccountingService/Shares/TransferReasons/{reasonId} | Updates an existing share transfer reason |


<a id="createShareClass"></a>
# **createShareClass**
> ShareClassDtoEnvelope createShareClass(tenantId, apiVersion, xApiVersion, shareClassCreateDto)

Creates a new share class

Creates a new share class.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SharesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SharesApi apiInstance = new SharesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ShareClassCreateDto shareClassCreateDto = new ShareClassCreateDto(); // ShareClassCreateDto | 
    try {
      ShareClassDtoEnvelope result = apiInstance.createShareClass(tenantId, apiVersion, xApiVersion, shareClassCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SharesApi#createShareClass");
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
| **shareClassCreateDto** | [**ShareClassCreateDto**](ShareClassCreateDto.md)|  | [optional] |

### Return type

[**ShareClassDtoEnvelope**](ShareClassDtoEnvelope.md)

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
| **400** | Bad Request |  -  |
| **201** | Created |  -  |

<a id="createShareIssuance"></a>
# **createShareIssuance**
> ShareIssuanceDtoEnvelope createShareIssuance(tenantId, apiVersion, xApiVersion, shareIssuanceCreateDto)

Creates a new share issuance

Creates a new share issuance.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SharesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SharesApi apiInstance = new SharesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ShareIssuanceCreateDto shareIssuanceCreateDto = new ShareIssuanceCreateDto(); // ShareIssuanceCreateDto | 
    try {
      ShareIssuanceDtoEnvelope result = apiInstance.createShareIssuance(tenantId, apiVersion, xApiVersion, shareIssuanceCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SharesApi#createShareIssuance");
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
| **shareIssuanceCreateDto** | [**ShareIssuanceCreateDto**](ShareIssuanceCreateDto.md)|  | [optional] |

### Return type

[**ShareIssuanceDtoEnvelope**](ShareIssuanceDtoEnvelope.md)

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
| **400** | Bad Request |  -  |
| **201** | Created |  -  |

<a id="createShareTransfer"></a>
# **createShareTransfer**
> ShareTransferDtoEnvelope createShareTransfer(tenantId, apiVersion, xApiVersion, shareTransferCreateDto)

Creates a new share transfer

Creates a new share transfer.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SharesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SharesApi apiInstance = new SharesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ShareTransferCreateDto shareTransferCreateDto = new ShareTransferCreateDto(); // ShareTransferCreateDto | 
    try {
      ShareTransferDtoEnvelope result = apiInstance.createShareTransfer(tenantId, apiVersion, xApiVersion, shareTransferCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SharesApi#createShareTransfer");
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
| **shareTransferCreateDto** | [**ShareTransferCreateDto**](ShareTransferCreateDto.md)|  | [optional] |

### Return type

[**ShareTransferDtoEnvelope**](ShareTransferDtoEnvelope.md)

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
| **400** | Bad Request |  -  |
| **201** | Created |  -  |

<a id="createShareTransferReason"></a>
# **createShareTransferReason**
> ShareTransferReasonDtoEnvelope createShareTransferReason(tenantId, apiVersion, xApiVersion, shareTransferReasonCreateDto)

Creates a new share transfer reason

Creates a new share transfer reason.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SharesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SharesApi apiInstance = new SharesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ShareTransferReasonCreateDto shareTransferReasonCreateDto = new ShareTransferReasonCreateDto(); // ShareTransferReasonCreateDto | 
    try {
      ShareTransferReasonDtoEnvelope result = apiInstance.createShareTransferReason(tenantId, apiVersion, xApiVersion, shareTransferReasonCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SharesApi#createShareTransferReason");
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
| **shareTransferReasonCreateDto** | [**ShareTransferReasonCreateDto**](ShareTransferReasonCreateDto.md)|  | [optional] |

### Return type

[**ShareTransferReasonDtoEnvelope**](ShareTransferReasonDtoEnvelope.md)

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
| **400** | Bad Request |  -  |
| **201** | Created |  -  |

<a id="deleteShareClass"></a>
# **deleteShareClass**
> deleteShareClass(tenantId, shareClassId, apiVersion, xApiVersion)

Deletes an existing share class

Deletes an existing share class.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SharesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SharesApi apiInstance = new SharesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID shareClassId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteShareClass(tenantId, shareClassId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling SharesApi#deleteShareClass");
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
| **shareClassId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

null (empty response body)

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
| **404** | Not Found |  -  |

<a id="deleteShareIssuance"></a>
# **deleteShareIssuance**
> deleteShareIssuance(tenantId, issuanceId, apiVersion, xApiVersion)

Deletes an existing share issuance

Deletes an existing share issuance.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SharesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SharesApi apiInstance = new SharesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID issuanceId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteShareIssuance(tenantId, issuanceId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling SharesApi#deleteShareIssuance");
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
| **issuanceId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

null (empty response body)

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
| **404** | Not Found |  -  |

<a id="deleteShareTransfer"></a>
# **deleteShareTransfer**
> deleteShareTransfer(tenantId, transferId, apiVersion, xApiVersion)

Deletes an existing share transfer

Deletes an existing share transfer.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SharesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SharesApi apiInstance = new SharesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID transferId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteShareTransfer(tenantId, transferId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling SharesApi#deleteShareTransfer");
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
| **transferId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

null (empty response body)

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
| **404** | Not Found |  -  |

<a id="deleteShareTransferReason"></a>
# **deleteShareTransferReason**
> deleteShareTransferReason(tenantId, reasonId, apiVersion, xApiVersion)

Deletes an existing share transfer reason

Deletes an existing share transfer reason.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SharesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SharesApi apiInstance = new SharesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID reasonId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteShareTransferReason(tenantId, reasonId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling SharesApi#deleteShareTransferReason");
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
| **reasonId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

null (empty response body)

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
| **404** | Not Found |  -  |

<a id="getShareClass"></a>
# **getShareClass**
> ShareClassDtoEnvelope getShareClass(tenantId, shareClassId, apiVersion, xApiVersion)

Gets a share class by id

Get a specific share class by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SharesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SharesApi apiInstance = new SharesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID shareClassId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ShareClassDtoEnvelope result = apiInstance.getShareClass(tenantId, shareClassId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SharesApi#getShareClass");
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
| **shareClassId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ShareClassDtoEnvelope**](ShareClassDtoEnvelope.md)

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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getShareClasses"></a>
# **getShareClasses**
> ShareClassDtoListEnvelope getShareClasses(tenantId, apiVersion, xApiVersion)

Gets the current tenant share classes

Get the currently acting tenant share classes.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SharesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SharesApi apiInstance = new SharesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ShareClassDtoListEnvelope result = apiInstance.getShareClasses(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SharesApi#getShareClasses");
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

[**ShareClassDtoListEnvelope**](ShareClassDtoListEnvelope.md)

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

<a id="getShareClassesCount"></a>
# **getShareClassesCount**
> Int32Envelope getShareClassesCount(tenantId, apiVersion, xApiVersion)

Gets the current tenant share classes count

Get the currently acting tenant share classes count.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SharesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SharesApi apiInstance = new SharesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getShareClassesCount(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SharesApi#getShareClassesCount");
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

<a id="getShareIssuance"></a>
# **getShareIssuance**
> ShareIssuanceDtoEnvelope getShareIssuance(tenantId, issuanceId, apiVersion, xApiVersion)

Gets a share issuance by id

Get a specific share issuance by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SharesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SharesApi apiInstance = new SharesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID issuanceId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ShareIssuanceDtoEnvelope result = apiInstance.getShareIssuance(tenantId, issuanceId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SharesApi#getShareIssuance");
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
| **issuanceId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ShareIssuanceDtoEnvelope**](ShareIssuanceDtoEnvelope.md)

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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getShareIssuances"></a>
# **getShareIssuances**
> ShareIssuanceDtoListEnvelope getShareIssuances(tenantId, apiVersion, xApiVersion)

Gets the current tenant share issuances

Get the currently acting tenant share issuances.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SharesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SharesApi apiInstance = new SharesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ShareIssuanceDtoListEnvelope result = apiInstance.getShareIssuances(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SharesApi#getShareIssuances");
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

[**ShareIssuanceDtoListEnvelope**](ShareIssuanceDtoListEnvelope.md)

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

<a id="getShareIssuancesCount"></a>
# **getShareIssuancesCount**
> Int32Envelope getShareIssuancesCount(tenantId, apiVersion, xApiVersion)

Gets the current tenant share issuances count

Get the currently acting tenant share issuances count.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SharesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SharesApi apiInstance = new SharesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getShareIssuancesCount(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SharesApi#getShareIssuancesCount");
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

<a id="getShareTransfer"></a>
# **getShareTransfer**
> ShareTransferDtoEnvelope getShareTransfer(tenantId, transferId, apiVersion, xApiVersion)

Gets a share transfer by id

Get a specific share transfer by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SharesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SharesApi apiInstance = new SharesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID transferId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ShareTransferDtoEnvelope result = apiInstance.getShareTransfer(tenantId, transferId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SharesApi#getShareTransfer");
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
| **transferId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ShareTransferDtoEnvelope**](ShareTransferDtoEnvelope.md)

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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getShareTransferReason"></a>
# **getShareTransferReason**
> ShareTransferReasonDtoEnvelope getShareTransferReason(tenantId, reasonId, apiVersion, xApiVersion)

Gets a share transfer reason by id

Get a specific share transfer reason by its identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SharesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SharesApi apiInstance = new SharesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID reasonId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ShareTransferReasonDtoEnvelope result = apiInstance.getShareTransferReason(tenantId, reasonId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SharesApi#getShareTransferReason");
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
| **reasonId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ShareTransferReasonDtoEnvelope**](ShareTransferReasonDtoEnvelope.md)

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
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getShareTransferReasons"></a>
# **getShareTransferReasons**
> ShareTransferReasonDtoListEnvelope getShareTransferReasons(tenantId, apiVersion, xApiVersion)

Gets the current tenant share transfer reasons

Get the currently acting tenant share transfer reasons.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SharesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SharesApi apiInstance = new SharesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ShareTransferReasonDtoListEnvelope result = apiInstance.getShareTransferReasons(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SharesApi#getShareTransferReasons");
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

[**ShareTransferReasonDtoListEnvelope**](ShareTransferReasonDtoListEnvelope.md)

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

<a id="getShareTransferReasonsCount"></a>
# **getShareTransferReasonsCount**
> Int32Envelope getShareTransferReasonsCount(tenantId, apiVersion, xApiVersion)

Gets the current tenant share transfer reasons count

Get the currently acting tenant share transfer reasons count.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SharesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SharesApi apiInstance = new SharesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getShareTransferReasonsCount(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SharesApi#getShareTransferReasonsCount");
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

<a id="getShareTransfers"></a>
# **getShareTransfers**
> ShareTransferDtoListEnvelope getShareTransfers(tenantId, apiVersion, xApiVersion)

Gets the current tenant share transfers

Get the currently acting tenant share transfers.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SharesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SharesApi apiInstance = new SharesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ShareTransferDtoListEnvelope result = apiInstance.getShareTransfers(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SharesApi#getShareTransfers");
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

[**ShareTransferDtoListEnvelope**](ShareTransferDtoListEnvelope.md)

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

<a id="getShareTransfersCount"></a>
# **getShareTransfersCount**
> Int32Envelope getShareTransfersCount(tenantId, apiVersion, xApiVersion)

Gets the current tenant share transfers count

Get the currently acting tenant share transfers count.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SharesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SharesApi apiInstance = new SharesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.getShareTransfersCount(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SharesApi#getShareTransfersCount");
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

<a id="updateShareClass"></a>
# **updateShareClass**
> ShareClassDtoEnvelope updateShareClass(tenantId, shareClassId, apiVersion, xApiVersion, shareClassUpdateDto)

Updates an existing share class

Updates an existing share class.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SharesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SharesApi apiInstance = new SharesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID shareClassId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ShareClassUpdateDto shareClassUpdateDto = new ShareClassUpdateDto(); // ShareClassUpdateDto | 
    try {
      ShareClassDtoEnvelope result = apiInstance.updateShareClass(tenantId, shareClassId, apiVersion, xApiVersion, shareClassUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SharesApi#updateShareClass");
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
| **shareClassId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **shareClassUpdateDto** | [**ShareClassUpdateDto**](ShareClassUpdateDto.md)|  | [optional] |

### Return type

[**ShareClassDtoEnvelope**](ShareClassDtoEnvelope.md)

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
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="updateShareIssuance"></a>
# **updateShareIssuance**
> ShareIssuanceDtoEnvelope updateShareIssuance(tenantId, issuanceId, apiVersion, xApiVersion, shareIssuanceUpdateDto)

Updates an existing share issuance

Updates an existing share issuance.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SharesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SharesApi apiInstance = new SharesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID issuanceId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ShareIssuanceUpdateDto shareIssuanceUpdateDto = new ShareIssuanceUpdateDto(); // ShareIssuanceUpdateDto | 
    try {
      ShareIssuanceDtoEnvelope result = apiInstance.updateShareIssuance(tenantId, issuanceId, apiVersion, xApiVersion, shareIssuanceUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SharesApi#updateShareIssuance");
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
| **issuanceId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **shareIssuanceUpdateDto** | [**ShareIssuanceUpdateDto**](ShareIssuanceUpdateDto.md)|  | [optional] |

### Return type

[**ShareIssuanceDtoEnvelope**](ShareIssuanceDtoEnvelope.md)

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
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="updateShareTransfer"></a>
# **updateShareTransfer**
> ShareTransferDtoEnvelope updateShareTransfer(tenantId, transferId, apiVersion, xApiVersion, shareTransferUpdateDto)

Updates an existing share transfer

Updates an existing share transfer.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SharesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SharesApi apiInstance = new SharesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID transferId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ShareTransferUpdateDto shareTransferUpdateDto = new ShareTransferUpdateDto(); // ShareTransferUpdateDto | 
    try {
      ShareTransferDtoEnvelope result = apiInstance.updateShareTransfer(tenantId, transferId, apiVersion, xApiVersion, shareTransferUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SharesApi#updateShareTransfer");
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
| **transferId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **shareTransferUpdateDto** | [**ShareTransferUpdateDto**](ShareTransferUpdateDto.md)|  | [optional] |

### Return type

[**ShareTransferDtoEnvelope**](ShareTransferDtoEnvelope.md)

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
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="updateShareTransferReason"></a>
# **updateShareTransferReason**
> ShareTransferReasonDtoEnvelope updateShareTransferReason(tenantId, reasonId, apiVersion, xApiVersion, shareTransferReasonUpdateDto)

Updates an existing share transfer reason

Updates an existing share transfer reason.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SharesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    SharesApi apiInstance = new SharesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID reasonId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ShareTransferReasonUpdateDto shareTransferReasonUpdateDto = new ShareTransferReasonUpdateDto(); // ShareTransferReasonUpdateDto | 
    try {
      ShareTransferReasonDtoEnvelope result = apiInstance.updateShareTransferReason(tenantId, reasonId, apiVersion, xApiVersion, shareTransferReasonUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SharesApi#updateShareTransferReason");
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
| **reasonId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **shareTransferReasonUpdateDto** | [**ShareTransferReasonUpdateDto**](ShareTransferReasonUpdateDto.md)|  | [optional] |

### Return type

[**ShareTransferReasonDtoEnvelope**](ShareTransferReasonDtoEnvelope.md)

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
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **200** | OK |  -  |

