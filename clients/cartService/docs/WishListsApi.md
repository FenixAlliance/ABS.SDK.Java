# WishListsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addProductToWishList**](WishListsApi.md#addProductToWishList) | **POST** /api/v2/CartService/WishLists/Records | Add a product to a wish list |
| [**createWishList**](WishListsApi.md#createWishList) | **POST** /api/v2/CartService/WishLists | Create a wish list |
| [**deleteWishList**](WishListsApi.md#deleteWishList) | **DELETE** /api/v2/CartService/WishLists/{wishListId} | Delete a wish list |
| [**deleteWishListRecord**](WishListsApi.md#deleteWishListRecord) | **DELETE** /api/v2/CartService/WishLists/Records/{recordId} | Delete a wish list record |
| [**getCartWishListDetailsAsync**](WishListsApi.md#getCartWishListDetailsAsync) | **GET** /api/v2/CartService/WishLists/{wishListId}/Details | Get wish list details |
| [**getCartWishListItemsAsync**](WishListsApi.md#getCartWishListItemsAsync) | **GET** /api/v2/CartService/WishLists/{wishListId}/Records | Get wish list item records |
| [**getWishListAsync**](WishListsApi.md#getWishListAsync) | **GET** /api/v2/CartService/WishLists/{cartId} | Get wish lists for a cart |
| [**isProductInWishLists**](WishListsApi.md#isProductInWishLists) | **GET** /api/v2/CartService/WishLists/Contains | Check if a product is in any wish list |
| [**updateProductToWishList**](WishListsApi.md#updateProductToWishList) | **PUT** /api/v2/CartService/WishLists/{wishListId} | Update a wish list |
| [**wishListExists**](WishListsApi.md#wishListExists) | **GET** /api/v2/CartService/WishLists/Exists | Check if a wish list exists |
| [**wishListExistsHeadAsync**](WishListsApi.md#wishListExistsHeadAsync) | **HEAD** /api/v2/CartService/WishLists/Exists | Check if a wish list exists (HEAD) |


<a id="addProductToWishList"></a>
# **addProductToWishList**
> EmptyEnvelope addProductToWishList(apiVersion, xApiVersion, productToWishListRequest)

Add a product to a wish list

Adds the specified product to the given wish list.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WishListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WishListsApi apiInstance = new WishListsApi(defaultClient);
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ProductToWishListRequest productToWishListRequest = new ProductToWishListRequest(); // ProductToWishListRequest | 
    try {
      EmptyEnvelope result = apiInstance.addProductToWishList(apiVersion, xApiVersion, productToWishListRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WishListsApi#addProductToWishList");
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
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **productToWishListRequest** | [**ProductToWishListRequest**](ProductToWishListRequest.md)|  | [optional] |

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

<a id="createWishList"></a>
# **createWishList**
> EmptyEnvelope createWishList(apiVersion, xApiVersion, newWishListRequest)

Create a wish list

Creates a new wish list from the provided request data.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WishListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WishListsApi apiInstance = new WishListsApi(defaultClient);
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    NewWishListRequest newWishListRequest = new NewWishListRequest(); // NewWishListRequest | 
    try {
      EmptyEnvelope result = apiInstance.createWishList(apiVersion, xApiVersion, newWishListRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WishListsApi#createWishList");
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
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **newWishListRequest** | [**NewWishListRequest**](NewWishListRequest.md)|  | [optional] |

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

<a id="deleteWishList"></a>
# **deleteWishList**
> EmptyEnvelope deleteWishList(wishListId, apiVersion, xApiVersion)

Delete a wish list

Deletes the specified wish list.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WishListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WishListsApi apiInstance = new WishListsApi(defaultClient);
    UUID wishListId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteWishList(wishListId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WishListsApi#deleteWishList");
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
| **wishListId** | **UUID**|  | |
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

<a id="deleteWishListRecord"></a>
# **deleteWishListRecord**
> deleteWishListRecord(recordId, apiVersion, xApiVersion)

Delete a wish list record

Removes a specific item record from a wish list by its record ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WishListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WishListsApi apiInstance = new WishListsApi(defaultClient);
    UUID recordId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteWishListRecord(recordId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling WishListsApi#deleteWishListRecord");
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
| **recordId** | **UUID**|  | |
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

<a id="getCartWishListDetailsAsync"></a>
# **getCartWishListDetailsAsync**
> WishListDto getCartWishListDetailsAsync(wishListId, apiVersion, xApiVersion)

Get wish list details

Retrieves the full details of the specified wish list.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WishListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WishListsApi apiInstance = new WishListsApi(defaultClient);
    UUID wishListId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      WishListDto result = apiInstance.getCartWishListDetailsAsync(wishListId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WishListsApi#getCartWishListDetailsAsync");
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
| **wishListId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**WishListDto**](WishListDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getCartWishListItemsAsync"></a>
# **getCartWishListItemsAsync**
> List&lt;WishListItemRecordDto&gt; getCartWishListItemsAsync(wishListId, apiVersion, xApiVersion)

Get wish list item records

Retrieves all item records in the specified wish list.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WishListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WishListsApi apiInstance = new WishListsApi(defaultClient);
    UUID wishListId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<WishListItemRecordDto> result = apiInstance.getCartWishListItemsAsync(wishListId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WishListsApi#getCartWishListItemsAsync");
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
| **wishListId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**List&lt;WishListItemRecordDto&gt;**](WishListItemRecordDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getWishListAsync"></a>
# **getWishListAsync**
> List&lt;WishListDto&gt; getWishListAsync(cartId, apiVersion, xApiVersion)

Get wish lists for a cart

Retrieves all wish lists associated with the specified cart.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WishListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WishListsApi apiInstance = new WishListsApi(defaultClient);
    UUID cartId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<WishListDto> result = apiInstance.getWishListAsync(cartId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WishListsApi#getWishListAsync");
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
| **cartId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**List&lt;WishListDto&gt;**](WishListDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="isProductInWishLists"></a>
# **isProductInWishLists**
> BooleanEnvelope isProductInWishLists(cartId, productId, apiVersion, xApiVersion)

Check if a product is in any wish list

Returns a boolean indicating whether the specified product exists in any wish list of the given cart.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WishListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WishListsApi apiInstance = new WishListsApi(defaultClient);
    UUID cartId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      BooleanEnvelope result = apiInstance.isProductInWishLists(cartId, productId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WishListsApi#isProductInWishLists");
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
| **cartId** | **UUID**|  | [optional] |
| **productId** | **UUID**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**BooleanEnvelope**](BooleanEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateProductToWishList"></a>
# **updateProductToWishList**
> EmptyEnvelope updateProductToWishList(wishListId, apiVersion, xApiVersion, wishListUpdateDto)

Update a wish list

Updates the specified wish list with the provided data.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WishListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WishListsApi apiInstance = new WishListsApi(defaultClient);
    UUID wishListId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    WishListUpdateDto wishListUpdateDto = new WishListUpdateDto(); // WishListUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateProductToWishList(wishListId, apiVersion, xApiVersion, wishListUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WishListsApi#updateProductToWishList");
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
| **wishListId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **wishListUpdateDto** | [**WishListUpdateDto**](WishListUpdateDto.md)|  | [optional] |

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

<a id="wishListExists"></a>
# **wishListExists**
> BooleanEnvelope wishListExists(wishListId, apiVersion, xApiVersion)

Check if a wish list exists

Returns a boolean indicating whether the specified wish list exists.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WishListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WishListsApi apiInstance = new WishListsApi(defaultClient);
    UUID wishListId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      BooleanEnvelope result = apiInstance.wishListExists(wishListId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WishListsApi#wishListExists");
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
| **wishListId** | **UUID**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**BooleanEnvelope**](BooleanEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="wishListExistsHeadAsync"></a>
# **wishListExistsHeadAsync**
> EmptyEnvelope wishListExistsHeadAsync(wishListId, apiVersion, xApiVersion)

Check if a wish list exists (HEAD)

HEAD request to check whether the specified wish list exists without returning a response body.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WishListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WishListsApi apiInstance = new WishListsApi(defaultClient);
    UUID wishListId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.wishListExistsHeadAsync(wishListId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WishListsApi#wishListExistsHeadAsync");
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
| **wishListId** | **UUID**|  | [optional] |
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

