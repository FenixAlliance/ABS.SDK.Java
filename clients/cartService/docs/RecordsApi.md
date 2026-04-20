# RecordsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addItemToCart**](RecordsApi.md#addItemToCart) | **POST** /api/v2/CartService/Records/AddItem | Add an item to a cart |
| [**addProductToCartAsync**](RecordsApi.md#addProductToCartAsync) | **POST** /api/v2/CartService/Records | Add a product to a cart with tracking |
| [**clearCartAsync**](RecordsApi.md#clearCartAsync) | **POST** /api/v2/CartService/Records/ClearCart | Clear all items from a cart |
| [**decreaseItemCartRecord**](RecordsApi.md#decreaseItemCartRecord) | **PUT** /api/v2/CartService/Records/{recordId}/Decrease | Decrease cart record quantity |
| [**getItemCartRecord**](RecordsApi.md#getItemCartRecord) | **GET** /api/v2/CartService/Records/{recordId}/Details | Get a cart record by ID |
| [**getItemsInCartAsync**](RecordsApi.md#getItemsInCartAsync) | **GET** /api/v2/CartService/Records/{cartId} | Get all items in a cart |
| [**increaseItemCartRecord**](RecordsApi.md#increaseItemCartRecord) | **PUT** /api/v2/CartService/Records/{recordId}/Increase | Increase cart record quantity |
| [**isItemAlreadyInCart**](RecordsApi.md#isItemAlreadyInCart) | **GET** /api/v2/CartService/Records/IsInCart | Check if an item is in a cart |
| [**removeProductFromCartByParams**](RecordsApi.md#removeProductFromCartByParams) | **DELETE** /api/v2/CartService/Records | Remove a product from a cart |
| [**removeProductFromCartByRecordId**](RecordsApi.md#removeProductFromCartByRecordId) | **DELETE** /api/v2/CartService/Records/{recordId} | Remove a product from a cart by record ID |
| [**updateItemCartRecord**](RecordsApi.md#updateItemCartRecord) | **PUT** /api/v2/CartService/Records/{recordId} | Update a cart record |


<a id="addItemToCart"></a>
# **addItemToCart**
> EmptyEnvelope addItemToCart(cartId, itemId, quantity, apiVersion, xApiVersion)

Add an item to a cart

Adds an item with the specified quantity to the given cart.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    RecordsApi apiInstance = new RecordsApi(defaultClient);
    UUID cartId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    Integer quantity = 56; // Integer | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.addItemToCart(cartId, itemId, quantity, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordsApi#addItemToCart");
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
| **itemId** | **UUID**|  | [optional] |
| **quantity** | **Integer**|  | [optional] |
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
| **404** | Not Found |  -  |
| **401** | Unauthorized |  -  |

<a id="addProductToCartAsync"></a>
# **addProductToCartAsync**
> EmptyEnvelope addProductToCartAsync(apiVersion, xApiVersion, itemCartRecordCreateDto)

Add a product to a cart with tracking

Adds a product to the cart using a request body with cart ID, product ID, and quantity.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    RecordsApi apiInstance = new RecordsApi(defaultClient);
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemCartRecordCreateDto itemCartRecordCreateDto = new ItemCartRecordCreateDto(); // ItemCartRecordCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.addProductToCartAsync(apiVersion, xApiVersion, itemCartRecordCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordsApi#addProductToCartAsync");
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
| **itemCartRecordCreateDto** | [**ItemCartRecordCreateDto**](ItemCartRecordCreateDto.md)|  | [optional] |

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
| **404** | Not Found |  -  |
| **401** | Unauthorized |  -  |

<a id="clearCartAsync"></a>
# **clearCartAsync**
> EmptyEnvelope clearCartAsync(cartID, apiVersion, xApiVersion)

Clear all items from a cart

Removes all item records from the specified cart.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    RecordsApi apiInstance = new RecordsApi(defaultClient);
    UUID cartID = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.clearCartAsync(cartID, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordsApi#clearCartAsync");
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
| **cartID** | **UUID**|  | |
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
| **404** | Not Found |  -  |
| **401** | Unauthorized |  -  |

<a id="decreaseItemCartRecord"></a>
# **decreaseItemCartRecord**
> EmptyEnvelope decreaseItemCartRecord(recordId, quantity, apiVersion, xApiVersion)

Decrease cart record quantity

Decreases the quantity of the specified item cart record by the given amount.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    RecordsApi apiInstance = new RecordsApi(defaultClient);
    UUID recordId = UUID.randomUUID(); // UUID | 
    Double quantity = 1D; // Double | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.decreaseItemCartRecord(recordId, quantity, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordsApi#decreaseItemCartRecord");
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
| **quantity** | **Double**|  | [optional] [default to 1] |
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
| **404** | Not Found |  -  |
| **401** | Unauthorized |  -  |

<a id="getItemCartRecord"></a>
# **getItemCartRecord**
> EmptyEnvelope getItemCartRecord(recordId, apiVersion, xApiVersion)

Get a cart record by ID

Retrieves the details of a specific item cart record.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    RecordsApi apiInstance = new RecordsApi(defaultClient);
    UUID recordId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.getItemCartRecord(recordId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordsApi#getItemCartRecord");
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
| **404** | Not Found |  -  |
| **401** | Unauthorized |  -  |

<a id="getItemsInCartAsync"></a>
# **getItemsInCartAsync**
> ItemCartRecordDtoListEnvelope getItemsInCartAsync(cartId, apiVersion, xApiVersion)

Get all items in a cart

Retrieves all item cart records for the specified cart.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    RecordsApi apiInstance = new RecordsApi(defaultClient);
    UUID cartId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemCartRecordDtoListEnvelope result = apiInstance.getItemsInCartAsync(cartId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordsApi#getItemsInCartAsync");
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

[**ItemCartRecordDtoListEnvelope**](ItemCartRecordDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **401** | Unauthorized |  -  |

<a id="increaseItemCartRecord"></a>
# **increaseItemCartRecord**
> EmptyEnvelope increaseItemCartRecord(recordId, quantity, apiVersion, xApiVersion)

Increase cart record quantity

Increases the quantity of the specified item cart record by the given amount.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    RecordsApi apiInstance = new RecordsApi(defaultClient);
    UUID recordId = UUID.randomUUID(); // UUID | 
    Double quantity = 1D; // Double | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.increaseItemCartRecord(recordId, quantity, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordsApi#increaseItemCartRecord");
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
| **quantity** | **Double**|  | [optional] [default to 1] |
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
| **404** | Not Found |  -  |
| **401** | Unauthorized |  -  |

<a id="isItemAlreadyInCart"></a>
# **isItemAlreadyInCart**
> BooleanEnvelope isItemAlreadyInCart(itemID, cartID, apiVersion, xApiVersion)

Check if an item is in a cart

Returns a boolean indicating whether the specified item is already in the given cart.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    RecordsApi apiInstance = new RecordsApi(defaultClient);
    UUID itemID = UUID.randomUUID(); // UUID | 
    UUID cartID = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      BooleanEnvelope result = apiInstance.isItemAlreadyInCart(itemID, cartID, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordsApi#isItemAlreadyInCart");
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
| **itemID** | **UUID**|  | |
| **cartID** | **UUID**|  | |
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
| **404** | Not Found |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="removeProductFromCartByParams"></a>
# **removeProductFromCartByParams**
> EmptyEnvelope removeProductFromCartByParams(cartId, productId, apiVersion, xApiVersion)

Remove a product from a cart

Removes a product from the cart using cart ID and product ID query parameters.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    RecordsApi apiInstance = new RecordsApi(defaultClient);
    UUID cartId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.removeProductFromCartByParams(cartId, productId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordsApi#removeProductFromCartByParams");
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
| **404** | Not Found |  -  |
| **401** | Unauthorized |  -  |

<a id="removeProductFromCartByRecordId"></a>
# **removeProductFromCartByRecordId**
> EmptyEnvelope removeProductFromCartByRecordId(recordId, apiVersion, xApiVersion)

Remove a product from a cart by record ID

Removes a specific item record from the cart by its record ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    RecordsApi apiInstance = new RecordsApi(defaultClient);
    UUID recordId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.removeProductFromCartByRecordId(recordId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordsApi#removeProductFromCartByRecordId");
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
| **404** | Not Found |  -  |
| **401** | Unauthorized |  -  |

<a id="updateItemCartRecord"></a>
# **updateItemCartRecord**
> EmptyEnvelope updateItemCartRecord(recordId, apiVersion, xApiVersion, itemCartRecordUpdateDto)

Update a cart record

Updates the specified item cart record with the provided data.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    RecordsApi apiInstance = new RecordsApi(defaultClient);
    UUID recordId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemCartRecordUpdateDto itemCartRecordUpdateDto = new ItemCartRecordUpdateDto(); // ItemCartRecordUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateItemCartRecord(recordId, apiVersion, xApiVersion, itemCartRecordUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordsApi#updateItemCartRecord");
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
| **itemCartRecordUpdateDto** | [**ItemCartRecordUpdateDto**](ItemCartRecordUpdateDto.md)|  | [optional] |

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
| **404** | Not Found |  -  |
| **401** | Unauthorized |  -  |

