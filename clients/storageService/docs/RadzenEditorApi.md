# RadzenEditorApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**image**](RadzenEditorApi.md#image) | **POST** /api/v2/StorageService/RadzenEditor/Uploads/Image | Upload an image file |
| [**multiple**](RadzenEditorApi.md#multiple) | **POST** /api/v2/StorageService/RadzenEditor/Uploads/Multiple | Upload multiple files |
| [**post**](RadzenEditorApi.md#post) | **POST** /api/v2/StorageService/RadzenEditor/Uploads/{id} | Upload files by ID |
| [**single**](RadzenEditorApi.md#single) | **POST** /api/v2/StorageService/RadzenEditor/Uploads/Single | Upload a single file |
| [**specific**](RadzenEditorApi.md#specific) | **POST** /api/v2/StorageService/RadzenEditor/Uploads/Specific | Upload a specific file |


<a id="image"></a>
# **image**
> image(tenantId, apiVersion, xApiVersion, _file)

Upload an image file

Uploads an image file and returns its URL for editor embedding.

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
      apiInstance.image(tenantId, apiVersion, xApiVersion, _file);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadzenEditorApi#image");
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
| **tenantId** | **UUID**|  | [optional] |
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

<a id="multiple"></a>
# **multiple**
> multiple(tenantId, apiVersion, xApiVersion, files)

Upload multiple files

Uploads multiple files to tenant or user storage.

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
    List<File> files = Arrays.asList(); // List<File> | 
    try {
      apiInstance.multiple(tenantId, apiVersion, xApiVersion, files);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadzenEditorApi#multiple");
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
| **tenantId** | **UUID**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **files** | **List&lt;File&gt;**|  | [optional] |

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

<a id="post"></a>
# **post**
> post(id, tenantId, apiVersion, xApiVersion, files)

Upload files by ID

Uploads files associated with a specific resource ID.

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
    Integer id = 56; // Integer | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    List<File> files = Arrays.asList(); // List<File> | 
    try {
      apiInstance.post(id, tenantId, apiVersion, xApiVersion, files);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadzenEditorApi#post");
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
| **id** | **Integer**|  | |
| **tenantId** | **UUID**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **files** | **List&lt;File&gt;**|  | [optional] |

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

<a id="single"></a>
# **single**
> single(tenantId, apiVersion, xApiVersion, _file)

Upload a single file

Uploads a single file to tenant or user storage.

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
      apiInstance.single(tenantId, apiVersion, xApiVersion, _file);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadzenEditorApi#single");
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
| **tenantId** | **UUID**|  | [optional] |
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

<a id="specific"></a>
# **specific**
> specific(tenantId, apiVersion, xApiVersion, _file)

Upload a specific file

Uploads a specific file to tenant or user storage.

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
      apiInstance.specific(tenantId, apiVersion, xApiVersion, _file);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadzenEditorApi#specific");
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
| **tenantId** | **UUID**|  | [optional] |
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

