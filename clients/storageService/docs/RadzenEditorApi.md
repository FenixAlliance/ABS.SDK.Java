# RadzenEditorApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**radzenUploadImage**](RadzenEditorApi.md#radzenUploadImage) | **POST** /api/v2/fs/radzen/tenants/{tenantId}/upload/image | Upload an editor image to tenant storage. |
| [**radzenUploadImageScoped**](RadzenEditorApi.md#radzenUploadImageScoped) | **POST** /api/v2/fs/radzen/tenants/{tenantId}/{recordType}/{recordId}/upload/image | Upload an editor image scoped to a record. |
| [**radzenUploadSingle**](RadzenEditorApi.md#radzenUploadSingle) | **POST** /api/v2/fs/radzen/tenants/{tenantId}/upload/single | Upload a single editor file to tenant storage. |
| [**radzenUploadSingleScoped**](RadzenEditorApi.md#radzenUploadSingleScoped) | **POST** /api/v2/fs/radzen/tenants/{tenantId}/{recordType}/{recordId}/upload/single | Upload a single editor file scoped to a record. |
| [**radzenUploadStream**](RadzenEditorApi.md#radzenUploadStream) | **PUT** /api/v2/fs/radzen/tenants/{tenantId}/upload/stream | Chunked editor upload (not implemented). |
| [**radzenUploadStreamScoped**](RadzenEditorApi.md#radzenUploadStreamScoped) | **PUT** /api/v2/fs/radzen/tenants/{tenantId}/{recordType}/{recordId}/upload/stream | Chunked editor upload scoped to a record (not implemented). |
| [**radzenUploadUserImage**](RadzenEditorApi.md#radzenUploadUserImage) | **POST** /api/v2/fs/radzen/users/upload/image | Upload an editor image to user storage. |
| [**radzenUploadUserImageScoped**](RadzenEditorApi.md#radzenUploadUserImageScoped) | **POST** /api/v2/fs/radzen/users/{recordType}/{recordId}/upload/image | Upload a user editor image scoped to a record. |


<a id="radzenUploadImage"></a>
# **radzenUploadImage**
> radzenUploadImage(tenantId, visibility, socialProfileId, purpose, apiVersion, xApiVersion, _file)

Upload an editor image to tenant storage.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadzenEditorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    RadzenEditorApi apiInstance = new RadzenEditorApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String visibility = "visibility_example"; // String | 
    String socialProfileId = "socialProfileId_example"; // String | 
    String purpose = "purpose_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    File _file = new File("/path/to/file"); // File | 
    try {
      apiInstance.radzenUploadImage(tenantId, visibility, socialProfileId, purpose, apiVersion, xApiVersion, _file);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadzenEditorApi#radzenUploadImage");
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
| **visibility** | **String**|  | [optional] |
| **socialProfileId** | **String**|  | [optional] |
| **purpose** | **String**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **_file** | **File**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="radzenUploadImageScoped"></a>
# **radzenUploadImageScoped**
> radzenUploadImageScoped(tenantId, recordType, recordId, visibility, socialProfileId, purpose, apiVersion, xApiVersion, _file)

Upload an editor image scoped to a record.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadzenEditorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    RadzenEditorApi apiInstance = new RadzenEditorApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String recordType = "recordType_example"; // String | 
    String recordId = "recordId_example"; // String | 
    String visibility = "visibility_example"; // String | 
    String socialProfileId = "socialProfileId_example"; // String | 
    String purpose = "purpose_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    File _file = new File("/path/to/file"); // File | 
    try {
      apiInstance.radzenUploadImageScoped(tenantId, recordType, recordId, visibility, socialProfileId, purpose, apiVersion, xApiVersion, _file);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadzenEditorApi#radzenUploadImageScoped");
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
| **recordType** | **String**|  | |
| **recordId** | **String**|  | |
| **visibility** | **String**|  | [optional] |
| **socialProfileId** | **String**|  | [optional] |
| **purpose** | **String**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **_file** | **File**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="radzenUploadSingle"></a>
# **radzenUploadSingle**
> radzenUploadSingle(tenantId, apiVersion, xApiVersion, _file)

Upload a single editor file to tenant storage.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadzenEditorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    RadzenEditorApi apiInstance = new RadzenEditorApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    File _file = new File("/path/to/file"); // File | 
    try {
      apiInstance.radzenUploadSingle(tenantId, apiVersion, xApiVersion, _file);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadzenEditorApi#radzenUploadSingle");
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
| **_file** | **File**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="radzenUploadSingleScoped"></a>
# **radzenUploadSingleScoped**
> radzenUploadSingleScoped(tenantId, recordType, recordId, apiVersion, xApiVersion, _file)

Upload a single editor file scoped to a record.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadzenEditorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    RadzenEditorApi apiInstance = new RadzenEditorApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String recordType = "recordType_example"; // String | 
    String recordId = "recordId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    File _file = new File("/path/to/file"); // File | 
    try {
      apiInstance.radzenUploadSingleScoped(tenantId, recordType, recordId, apiVersion, xApiVersion, _file);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadzenEditorApi#radzenUploadSingleScoped");
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
| **recordType** | **String**|  | |
| **recordId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **_file** | **File**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="radzenUploadStream"></a>
# **radzenUploadStream**
> radzenUploadStream(tenantId, apiVersion, xApiVersion)

Chunked editor upload (not implemented).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadzenEditorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    RadzenEditorApi apiInstance = new RadzenEditorApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.radzenUploadStream(tenantId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadzenEditorApi#radzenUploadStream");
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
| **tenantId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="radzenUploadStreamScoped"></a>
# **radzenUploadStreamScoped**
> radzenUploadStreamScoped(tenantId, recordType, recordId, apiVersion, xApiVersion)

Chunked editor upload scoped to a record (not implemented).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadzenEditorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    RadzenEditorApi apiInstance = new RadzenEditorApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String recordType = "recordType_example"; // String | 
    String recordId = "recordId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.radzenUploadStreamScoped(tenantId, recordType, recordId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadzenEditorApi#radzenUploadStreamScoped");
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
| **tenantId** | **String**|  | |
| **recordType** | **String**|  | |
| **recordId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="radzenUploadUserImage"></a>
# **radzenUploadUserImage**
> radzenUploadUserImage(visibility, socialProfileId, purpose, apiVersion, xApiVersion, _file)

Upload an editor image to user storage.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadzenEditorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    RadzenEditorApi apiInstance = new RadzenEditorApi(defaultClient);
    String visibility = "visibility_example"; // String | 
    String socialProfileId = "socialProfileId_example"; // String | 
    String purpose = "purpose_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    File _file = new File("/path/to/file"); // File | 
    try {
      apiInstance.radzenUploadUserImage(visibility, socialProfileId, purpose, apiVersion, xApiVersion, _file);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadzenEditorApi#radzenUploadUserImage");
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
| **visibility** | **String**|  | [optional] |
| **socialProfileId** | **String**|  | [optional] |
| **purpose** | **String**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **_file** | **File**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="radzenUploadUserImageScoped"></a>
# **radzenUploadUserImageScoped**
> radzenUploadUserImageScoped(recordType, recordId, visibility, socialProfileId, purpose, apiVersion, xApiVersion, _file)

Upload a user editor image scoped to a record.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadzenEditorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    RadzenEditorApi apiInstance = new RadzenEditorApi(defaultClient);
    String recordType = "recordType_example"; // String | 
    String recordId = "recordId_example"; // String | 
    String visibility = "visibility_example"; // String | 
    String socialProfileId = "socialProfileId_example"; // String | 
    String purpose = "purpose_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    File _file = new File("/path/to/file"); // File | 
    try {
      apiInstance.radzenUploadUserImageScoped(recordType, recordId, visibility, socialProfileId, purpose, apiVersion, xApiVersion, _file);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadzenEditorApi#radzenUploadUserImageScoped");
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
| **recordType** | **String**|  | |
| **recordId** | **String**|  | |
| **visibility** | **String**|  | [optional] |
| **socialProfileId** | **String**|  | [optional] |
| **purpose** | **String**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **_file** | **File**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

