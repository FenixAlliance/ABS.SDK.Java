# CartsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addItemToCartAsync**](CartsApi.md#addItemToCartAsync) | **POST** /api/v2/CartService/Carts/{cartId}/Items/{itemId} | Add an Item to a cart |
| [**addItemToCartCompareTable**](CartsApi.md#addItemToCartCompareTable) | **POST** /api/v2/CartService/Carts/{cartId}/Compare/{itemId} | Add an item to the compare table |
| [**addItemToWishList**](CartsApi.md#addItemToWishList) | **POST** /api/v2/CartService/Carts/{cartId}/WishLists/{wishListId}/Records | Add a record to a wish list |
| [**cartWishListExistsHead**](CartsApi.md#cartWishListExistsHead) | **HEAD** /api/v2/CartService/Carts/{cartId}/WishLists/{wishListId}/Exists | Assesses if a WishList exists |
| [**clearCartRecords**](CartsApi.md#clearCartRecords) | **DELETE** /api/v2/CartService/Carts/{cartId}/Items | Clear all items from a cart |
| [**createWishListAsync**](CartsApi.md#createWishListAsync) | **POST** /api/v2/CartService/Carts/{cartId}/WishLists | Create a new wish list |
| [**decreaseCartItemQuantity**](CartsApi.md#decreaseCartItemQuantity) | **PUT** /api/v2/CartService/Carts/{cartId}/Items/{itemId}/Decrease | Decrease an Item in a cart |
| [**decreaseCartLineAsync**](CartsApi.md#decreaseCartLineAsync) | **PUT** /api/v2/CartService/Carts/{cartId}/Lines/{lineId}/Decrease | Decrease the quantity of a cart line |
| [**deleteCartWishList**](CartsApi.md#deleteCartWishList) | **DELETE** /api/v2/CartService/Carts/{cartId}/WishLists/{wishListId} | Delete a wish list |
| [**deleteCartWishListRecord**](CartsApi.md#deleteCartWishListRecord) | **DELETE** /api/v2/CartService/Carts/{cartId}/WishLists/{wishListId}/Records/{recordId} | Remove a record from a wish list |
| [**getActingCart**](CartsApi.md#getActingCart) | **GET** /api/v2/CartService/Carts/ActingCart | Get the acting cart |
| [**getCartByIdAsync**](CartsApi.md#getCartByIdAsync) | **GET** /api/v2/CartService/Carts/{cartId} | Get all business owned contacts |
| [**getCartCompareRecord**](CartsApi.md#getCartCompareRecord) | **GET** /api/v2/CartService/Carts/{cartId}/Compare/{itemId} | Get an item from the compare table |
| [**getCartCompareRecords**](CartsApi.md#getCartCompareRecords) | **GET** /api/v2/CartService/Carts/{cartId}/Compare | Get all items in the compare table |
| [**getCartCountryAsync**](CartsApi.md#getCartCountryAsync) | **GET** /api/v2/CartService/Carts/{cartId}/Country | Get the country of a cart |
| [**getCartCurrencyAsync**](CartsApi.md#getCartCurrencyAsync) | **GET** /api/v2/CartService/Carts/{cartId}/Currency | Get the currency of a cart |
| [**getCartItems**](CartsApi.md#getCartItems) | **GET** /api/v2/CartService/Carts/{cartId}/Items | Get all cart lines |
| [**getCartLineAsync**](CartsApi.md#getCartLineAsync) | **GET** /api/v2/CartService/Carts/{cartId}/Lines/{lineId} | Get a cart line by ID |
| [**getCartLinesAsync**](CartsApi.md#getCartLinesAsync) | **GET** /api/v2/CartService/Carts/{cartId}/Lines | Get all cart lines |
| [**getCartWishList**](CartsApi.md#getCartWishList) | **GET** /api/v2/CartService/Carts/{cartId}/WishLists | Get all wishlists in a cart |
| [**getCartWishListDetails**](CartsApi.md#getCartWishListDetails) | **GET** /api/v2/CartService/Carts/{cartId}/WishLists/{wishListId} | Get a wish list by ID |
| [**getCartWishListItemAsync**](CartsApi.md#getCartWishListItemAsync) | **GET** /api/v2/CartService/Carts/{cartId}/WishLists/{wishListId}/Records/{recordId} | Get a record in a wish list |
| [**getCartWishListItems**](CartsApi.md#getCartWishListItems) | **GET** /api/v2/CartService/Carts/{cartId}/WishLists/{wishListId}/Records | Get all records in a wish list |
| [**getGuestCartAsync**](CartsApi.md#getGuestCartAsync) | **GET** /api/v2/CartService/Carts/GuestCart | Get the guest cart |
| [**getTenantCartAsync**](CartsApi.md#getTenantCartAsync) | **GET** /api/v2/CartService/Carts/BusinessCart/{tenantId} | Get the business cart |
| [**getUserCart**](CartsApi.md#getUserCart) | **GET** /api/v2/CartService/Carts/UserCart | Get the current user&#39;s cart |
| [**increaseCartLineAsync**](CartsApi.md#increaseCartLineAsync) | **PUT** /api/v2/CartService/Carts/{cartId}/Lines/{lineId}/Increase | Increase the quantity of a cart line |
| [**increaseItemCartRecordQuantityAsync**](CartsApi.md#increaseItemCartRecordQuantityAsync) | **PUT** /api/v2/CartService/Carts/{cartId}/Items/{itemId}/Increase | Increase an Item in a cart |
| [**isItemAlreadyInCartAsync**](CartsApi.md#isItemAlreadyInCartAsync) | **GET** /api/v2/CartService/Carts/{cartId}/Contains/{itemId} | Assesses if an Item is already in a cart |
| [**isItemInCompareTableAsync**](CartsApi.md#isItemInCompareTableAsync) | **GET** /api/v2/CartService/Carts/{cartId}/Compare/Contains/{itemId} | Assesses if an Item is already in the compare table |
| [**isItemInWishLists**](CartsApi.md#isItemInWishLists) | **GET** /api/v2/CartService/Carts/{cartId}/WishLists/Contains/{itemId} | Assesses if an Item is already in any of the cart&#39;s wishlists |
| [**removeCartLineAsync**](CartsApi.md#removeCartLineAsync) | **DELETE** /api/v2/CartService/Carts/{cartId}/Lines/{lineId} | Remove a cart line |
| [**removeItemFromCartAsync**](CartsApi.md#removeItemFromCartAsync) | **DELETE** /api/v2/CartService/Carts/{cartId}/Items/{itemId} | Remove an Item from a cart |
| [**removeItemFromCompareTableAsync**](CartsApi.md#removeItemFromCompareTableAsync) | **DELETE** /api/v2/CartService/Carts/{cartId}/Compare/{itemId} | Remove an item from the compare table |
| [**setCartCountryAsync**](CartsApi.md#setCartCountryAsync) | **PUT** /api/v2/CartService/Carts/{cartId}/Country | Set the country of a cart |
| [**setCartCurrencyAsync**](CartsApi.md#setCartCurrencyAsync) | **PUT** /api/v2/CartService/Carts/{cartId}/Currency | Set the currency of a cart |
| [**submitCartAsync**](CartsApi.md#submitCartAsync) | **POST** /api/v2/CartService/Carts/{cartId}/Submit | Submit a cart for processing |
| [**updateCartAsync**](CartsApi.md#updateCartAsync) | **PUT** /api/v2/CartService/Carts/{cartId} | Update a cart |
| [**updateCartLineAsync**](CartsApi.md#updateCartLineAsync) | **PUT** /api/v2/CartService/Carts/{cartId}/Lines/{lineId} | Update a cart line |
| [**updateItemCartRecordAsync**](CartsApi.md#updateItemCartRecordAsync) | **PUT** /api/v2/CartService/Carts/{cartId}/Items/{itemId} | Update an Item in a cart |
| [**updateItemToWishList**](CartsApi.md#updateItemToWishList) | **PUT** /api/v2/CartService/Carts/{cartId}/WishLists/{wishListId} | Update a wish list |
| [**wishListExistsAsync**](CartsApi.md#wishListExistsAsync) | **GET** /api/v2/CartService/Carts/{cartId}/WishLists/{wishListId}/Exists | Assesses if a WishList exists |


<a id="addItemToCartAsync"></a>
# **addItemToCartAsync**
> EmptyEnvelope addItemToCartAsync(cartId, itemId, quantity, apiVersion, xApiVersion)

Add an Item to a cart

Add an Item to a cart

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CartsApi apiInstance = new CartsApi(defaultClient);
    UUID cartId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    Integer quantity = 1; // Integer | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.addItemToCartAsync(cartId, itemId, quantity, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartsApi#addItemToCartAsync");
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
| **itemId** | **UUID**|  | |
| **quantity** | **Integer**|  | [optional] [default to 1] |
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

<a id="addItemToCartCompareTable"></a>
# **addItemToCartCompareTable**
> ItemCartRecordDto addItemToCartCompareTable(cartId, itemId, apiVersion, xApiVersion)

Add an item to the compare table

Add an item to the compare table

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CartsApi apiInstance = new CartsApi(defaultClient);
    UUID cartId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemCartRecordDto result = apiInstance.addItemToCartCompareTable(cartId, itemId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartsApi#addItemToCartCompareTable");
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
| **itemId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemCartRecordDto**](ItemCartRecordDto.md)

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

<a id="addItemToWishList"></a>
# **addItemToWishList**
> EmptyEnvelope addItemToWishList(cartId, wishListId, apiVersion, xApiVersion, productToWishListRequest)

Add a record to a wish list

Add a record to a wish list

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CartsApi apiInstance = new CartsApi(defaultClient);
    UUID cartId = UUID.randomUUID(); // UUID | 
    UUID wishListId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ProductToWishListRequest productToWishListRequest = new ProductToWishListRequest(); // ProductToWishListRequest | 
    try {
      EmptyEnvelope result = apiInstance.addItemToWishList(cartId, wishListId, apiVersion, xApiVersion, productToWishListRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartsApi#addItemToWishList");
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
| **wishListId** | **UUID**|  | |
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
| **404** | Not Found |  -  |
| **401** | Unauthorized |  -  |

<a id="cartWishListExistsHead"></a>
# **cartWishListExistsHead**
> EmptyEnvelope cartWishListExistsHead(cartId, wishListId, apiVersion, xApiVersion)

Assesses if a WishList exists

Assesses if a WishList exists but does not return the content

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CartsApi apiInstance = new CartsApi(defaultClient);
    UUID cartId = UUID.randomUUID(); // UUID | 
    UUID wishListId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.cartWishListExistsHead(cartId, wishListId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartsApi#cartWishListExistsHead");
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
| **404** | Not Found |  -  |
| **401** | Unauthorized |  -  |

<a id="clearCartRecords"></a>
# **clearCartRecords**
> EmptyEnvelope clearCartRecords(cartId, apiVersion, xApiVersion)

Clear all items from a cart

Clear all items from a cart

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CartsApi apiInstance = new CartsApi(defaultClient);
    UUID cartId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.clearCartRecords(cartId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartsApi#clearCartRecords");
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

<a id="createWishListAsync"></a>
# **createWishListAsync**
> EmptyEnvelope createWishListAsync(cartId, apiVersion, xApiVersion, newWishListRequest)

Create a new wish list

Create a new wish list

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CartsApi apiInstance = new CartsApi(defaultClient);
    UUID cartId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    NewWishListRequest newWishListRequest = new NewWishListRequest(); // NewWishListRequest | 
    try {
      EmptyEnvelope result = apiInstance.createWishListAsync(cartId, apiVersion, xApiVersion, newWishListRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartsApi#createWishListAsync");
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
| **404** | Not Found |  -  |
| **401** | Unauthorized |  -  |

<a id="decreaseCartItemQuantity"></a>
# **decreaseCartItemQuantity**
> EmptyEnvelope decreaseCartItemQuantity(cartId, itemId, apiVersion, xApiVersion, itemCartRecordUpdateDto)

Decrease an Item in a cart

Decrease an Item in a cart

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CartsApi apiInstance = new CartsApi(defaultClient);
    UUID cartId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemCartRecordUpdateDto itemCartRecordUpdateDto = new ItemCartRecordUpdateDto(); // ItemCartRecordUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.decreaseCartItemQuantity(cartId, itemId, apiVersion, xApiVersion, itemCartRecordUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartsApi#decreaseCartItemQuantity");
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
| **itemId** | **UUID**|  | |
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

<a id="decreaseCartLineAsync"></a>
# **decreaseCartLineAsync**
> EmptyEnvelope decreaseCartLineAsync(cartId, lineId, quantity, apiVersion, xApiVersion)

Decrease the quantity of a cart line

Decrease the quantity of a cart line

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CartsApi apiInstance = new CartsApi(defaultClient);
    UUID cartId = UUID.randomUUID(); // UUID | 
    UUID lineId = UUID.randomUUID(); // UUID | 
    Double quantity = 1D; // Double | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.decreaseCartLineAsync(cartId, lineId, quantity, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartsApi#decreaseCartLineAsync");
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
| **lineId** | **UUID**|  | |
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

<a id="deleteCartWishList"></a>
# **deleteCartWishList**
> EmptyEnvelope deleteCartWishList(cartId, wishListId, apiVersion, xApiVersion)

Delete a wish list

Delete a wish list

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CartsApi apiInstance = new CartsApi(defaultClient);
    UUID cartId = UUID.randomUUID(); // UUID | 
    UUID wishListId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteCartWishList(cartId, wishListId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartsApi#deleteCartWishList");
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
| **404** | Not Found |  -  |
| **401** | Unauthorized |  -  |

<a id="deleteCartWishListRecord"></a>
# **deleteCartWishListRecord**
> EmptyEnvelope deleteCartWishListRecord(cartId, wishListId, recordId, apiVersion, xApiVersion)

Remove a record from a wish list

Remove a record from a wish list

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CartsApi apiInstance = new CartsApi(defaultClient);
    UUID cartId = UUID.randomUUID(); // UUID | 
    UUID wishListId = UUID.randomUUID(); // UUID | 
    UUID recordId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteCartWishListRecord(cartId, wishListId, recordId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartsApi#deleteCartWishListRecord");
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
| **wishListId** | **UUID**|  | |
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

<a id="getActingCart"></a>
# **getActingCart**
> CartDtoEnvelope getActingCart(apiVersion, xApiVersion)

Get the acting cart

Get the acting cart

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CartsApi apiInstance = new CartsApi(defaultClient);
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CartDtoEnvelope result = apiInstance.getActingCart(apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartsApi#getActingCart");
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

### Return type

[**CartDtoEnvelope**](CartDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="getCartByIdAsync"></a>
# **getCartByIdAsync**
> CartDtoEnvelope getCartByIdAsync(cartId, apiVersion, xApiVersion)

Get all business owned contacts

Get all business owned contacts

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CartsApi apiInstance = new CartsApi(defaultClient);
    UUID cartId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CartDtoEnvelope result = apiInstance.getCartByIdAsync(cartId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartsApi#getCartByIdAsync");
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

[**CartDtoEnvelope**](CartDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="getCartCompareRecord"></a>
# **getCartCompareRecord**
> ItemToCompareCartRecordDtoEnvelope getCartCompareRecord(cartId, itemId, apiVersion, xApiVersion)

Get an item from the compare table

Get an item from the compare table

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CartsApi apiInstance = new CartsApi(defaultClient);
    UUID cartId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemToCompareCartRecordDtoEnvelope result = apiInstance.getCartCompareRecord(cartId, itemId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartsApi#getCartCompareRecord");
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
| **itemId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemToCompareCartRecordDtoEnvelope**](ItemToCompareCartRecordDtoEnvelope.md)

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

<a id="getCartCompareRecords"></a>
# **getCartCompareRecords**
> ItemToCompareCartRecordDtoListEnvelope getCartCompareRecords(cartId, apiVersion, xApiVersion)

Get all items in the compare table

Get all items in the compare table

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CartsApi apiInstance = new CartsApi(defaultClient);
    UUID cartId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemToCompareCartRecordDtoListEnvelope result = apiInstance.getCartCompareRecords(cartId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartsApi#getCartCompareRecords");
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

[**ItemToCompareCartRecordDtoListEnvelope**](ItemToCompareCartRecordDtoListEnvelope.md)

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

<a id="getCartCountryAsync"></a>
# **getCartCountryAsync**
> CountryDtoEnvelope getCartCountryAsync(cartId, apiVersion, xApiVersion)

Get the country of a cart

The country of a cart is used to calculate taxes and shipping costs

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CartsApi apiInstance = new CartsApi(defaultClient);
    UUID cartId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CountryDtoEnvelope result = apiInstance.getCartCountryAsync(cartId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartsApi#getCartCountryAsync");
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

[**CountryDtoEnvelope**](CountryDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="getCartCurrencyAsync"></a>
# **getCartCurrencyAsync**
> CurrencyDtoEnvelope getCartCurrencyAsync(cartId, apiVersion, xApiVersion)

Get the currency of a cart

The currency of a cart used for display purposes

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CartsApi apiInstance = new CartsApi(defaultClient);
    UUID cartId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CurrencyDtoEnvelope result = apiInstance.getCartCurrencyAsync(cartId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartsApi#getCartCurrencyAsync");
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

[**CurrencyDtoEnvelope**](CurrencyDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="getCartItems"></a>
# **getCartItems**
> ItemCartRecordDtoListEnvelope getCartItems(cartId, apiVersion, xApiVersion)

Get all cart lines

Get all cart lines

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CartsApi apiInstance = new CartsApi(defaultClient);
    UUID cartId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemCartRecordDtoListEnvelope result = apiInstance.getCartItems(cartId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartsApi#getCartItems");
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

<a id="getCartLineAsync"></a>
# **getCartLineAsync**
> EmptyEnvelope getCartLineAsync(cartId, lineId, apiVersion, xApiVersion)

Get a cart line by ID

Get a cart line by ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CartsApi apiInstance = new CartsApi(defaultClient);
    UUID cartId = UUID.randomUUID(); // UUID | 
    UUID lineId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.getCartLineAsync(cartId, lineId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartsApi#getCartLineAsync");
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
| **lineId** | **UUID**|  | |
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

<a id="getCartLinesAsync"></a>
# **getCartLinesAsync**
> ItemCartRecordDtoListEnvelope getCartLinesAsync(cartId, apiVersion, xApiVersion)

Get all cart lines

Get all cart lines

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CartsApi apiInstance = new CartsApi(defaultClient);
    UUID cartId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemCartRecordDtoListEnvelope result = apiInstance.getCartLinesAsync(cartId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartsApi#getCartLinesAsync");
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

<a id="getCartWishList"></a>
# **getCartWishList**
> List&lt;WishListDto&gt; getCartWishList(cartId, apiVersion, xApiVersion)

Get all wishlists in a cart

Get all wishlists in a cart

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CartsApi apiInstance = new CartsApi(defaultClient);
    UUID cartId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<WishListDto> result = apiInstance.getCartWishList(cartId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartsApi#getCartWishList");
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
| **404** | Not Found |  -  |
| **401** | Unauthorized |  -  |

<a id="getCartWishListDetails"></a>
# **getCartWishListDetails**
> WishListDtoEnvelope getCartWishListDetails(cartId, wishListId, apiVersion, xApiVersion)

Get a wish list by ID

Get a wish list by ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CartsApi apiInstance = new CartsApi(defaultClient);
    UUID cartId = UUID.randomUUID(); // UUID | 
    UUID wishListId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      WishListDtoEnvelope result = apiInstance.getCartWishListDetails(cartId, wishListId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartsApi#getCartWishListDetails");
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
| **wishListId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**WishListDtoEnvelope**](WishListDtoEnvelope.md)

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

<a id="getCartWishListItemAsync"></a>
# **getCartWishListItemAsync**
> List&lt;WishListItemRecordDto&gt; getCartWishListItemAsync(cartId, wishListId, recordId, apiVersion, xApiVersion)

Get a record in a wish list

Get a record in a wish list

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CartsApi apiInstance = new CartsApi(defaultClient);
    UUID cartId = UUID.randomUUID(); // UUID | 
    UUID wishListId = UUID.randomUUID(); // UUID | 
    UUID recordId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<WishListItemRecordDto> result = apiInstance.getCartWishListItemAsync(cartId, wishListId, recordId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartsApi#getCartWishListItemAsync");
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
| **wishListId** | **UUID**|  | |
| **recordId** | **UUID**|  | |
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
| **404** | Not Found |  -  |
| **401** | Unauthorized |  -  |

<a id="getCartWishListItems"></a>
# **getCartWishListItems**
> List&lt;WishListItemRecordDto&gt; getCartWishListItems(cartId, wishListId, apiVersion, xApiVersion)

Get all records in a wish list

Get all records in a wish list

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CartsApi apiInstance = new CartsApi(defaultClient);
    UUID cartId = UUID.randomUUID(); // UUID | 
    UUID wishListId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      List<WishListItemRecordDto> result = apiInstance.getCartWishListItems(cartId, wishListId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartsApi#getCartWishListItems");
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
| **404** | Not Found |  -  |
| **401** | Unauthorized |  -  |

<a id="getGuestCartAsync"></a>
# **getGuestCartAsync**
> CartDtoEnvelope getGuestCartAsync(apiVersion, xApiVersion)

Get the guest cart

Get the guest cart

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CartsApi apiInstance = new CartsApi(defaultClient);
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CartDtoEnvelope result = apiInstance.getGuestCartAsync(apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartsApi#getGuestCartAsync");
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

### Return type

[**CartDtoEnvelope**](CartDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="getTenantCartAsync"></a>
# **getTenantCartAsync**
> CartDtoEnvelope getTenantCartAsync(tenantId, apiVersion, xApiVersion)

Get the business cart

Get the business cart

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CartsApi apiInstance = new CartsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CartDtoEnvelope result = apiInstance.getTenantCartAsync(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartsApi#getTenantCartAsync");
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

[**CartDtoEnvelope**](CartDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="getUserCart"></a>
# **getUserCart**
> CartDtoEnvelope getUserCart(apiVersion, xApiVersion)

Get the current user&#39;s cart

Get the current user&#39;s cart

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CartsApi apiInstance = new CartsApi(defaultClient);
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CartDtoEnvelope result = apiInstance.getUserCart(apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartsApi#getUserCart");
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

### Return type

[**CartDtoEnvelope**](CartDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="increaseCartLineAsync"></a>
# **increaseCartLineAsync**
> EmptyEnvelope increaseCartLineAsync(cartId, lineId, quantity, apiVersion, xApiVersion)

Increase the quantity of a cart line

Increase the quantity of a cart line

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CartsApi apiInstance = new CartsApi(defaultClient);
    UUID cartId = UUID.randomUUID(); // UUID | 
    UUID lineId = UUID.randomUUID(); // UUID | 
    Double quantity = 1D; // Double | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.increaseCartLineAsync(cartId, lineId, quantity, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartsApi#increaseCartLineAsync");
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
| **lineId** | **UUID**|  | |
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

<a id="increaseItemCartRecordQuantityAsync"></a>
# **increaseItemCartRecordQuantityAsync**
> EmptyEnvelope increaseItemCartRecordQuantityAsync(cartId, itemId, apiVersion, xApiVersion, itemCartRecordUpdateDto)

Increase an Item in a cart

Increase an Item in a cart

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CartsApi apiInstance = new CartsApi(defaultClient);
    UUID cartId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemCartRecordUpdateDto itemCartRecordUpdateDto = new ItemCartRecordUpdateDto(); // ItemCartRecordUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.increaseItemCartRecordQuantityAsync(cartId, itemId, apiVersion, xApiVersion, itemCartRecordUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartsApi#increaseItemCartRecordQuantityAsync");
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
| **itemId** | **UUID**|  | |
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

<a id="isItemAlreadyInCartAsync"></a>
# **isItemAlreadyInCartAsync**
> BooleanEnvelope isItemAlreadyInCartAsync(cartId, itemId, apiVersion, xApiVersion)

Assesses if an Item is already in a cart

Assesses if an Item is already in a cart

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CartsApi apiInstance = new CartsApi(defaultClient);
    UUID cartId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      BooleanEnvelope result = apiInstance.isItemAlreadyInCartAsync(cartId, itemId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartsApi#isItemAlreadyInCartAsync");
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
| **itemId** | **UUID**|  | |
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

<a id="isItemInCompareTableAsync"></a>
# **isItemInCompareTableAsync**
> BooleanEnvelope isItemInCompareTableAsync(cartId, itemId, apiVersion, xApiVersion)

Assesses if an Item is already in the compare table

Assesses if an Item is already in the compare table

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CartsApi apiInstance = new CartsApi(defaultClient);
    UUID cartId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      BooleanEnvelope result = apiInstance.isItemInCompareTableAsync(cartId, itemId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartsApi#isItemInCompareTableAsync");
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
| **itemId** | **UUID**|  | |
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

<a id="isItemInWishLists"></a>
# **isItemInWishLists**
> BooleanEnvelope isItemInWishLists(cartId, itemId, apiVersion, xApiVersion)

Assesses if an Item is already in any of the cart&#39;s wishlists

Assesses if an Item is already in any of the cart&#39;s wishlists

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CartsApi apiInstance = new CartsApi(defaultClient);
    UUID cartId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      BooleanEnvelope result = apiInstance.isItemInWishLists(cartId, itemId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartsApi#isItemInWishLists");
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
| **itemId** | **UUID**|  | |
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
| **404** | Not Found |  -  |
| **401** | Unauthorized |  -  |

<a id="removeCartLineAsync"></a>
# **removeCartLineAsync**
> EmptyEnvelope removeCartLineAsync(cartId, lineId, apiVersion, xApiVersion)

Remove a cart line

Remove a cart line

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CartsApi apiInstance = new CartsApi(defaultClient);
    UUID cartId = UUID.randomUUID(); // UUID | 
    UUID lineId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.removeCartLineAsync(cartId, lineId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartsApi#removeCartLineAsync");
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
| **lineId** | **UUID**|  | |
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

<a id="removeItemFromCartAsync"></a>
# **removeItemFromCartAsync**
> EmptyEnvelope removeItemFromCartAsync(cartId, itemId, apiVersion, xApiVersion)

Remove an Item from a cart

Remove an Item from a cart

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CartsApi apiInstance = new CartsApi(defaultClient);
    UUID cartId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.removeItemFromCartAsync(cartId, itemId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartsApi#removeItemFromCartAsync");
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
| **itemId** | **UUID**|  | |
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

<a id="removeItemFromCompareTableAsync"></a>
# **removeItemFromCompareTableAsync**
> ItemToCompareCartRecordDto removeItemFromCompareTableAsync(cartId, itemId, apiVersion, xApiVersion)

Remove an item from the compare table

Remove an item from the compare table

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CartsApi apiInstance = new CartsApi(defaultClient);
    UUID cartId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemToCompareCartRecordDto result = apiInstance.removeItemFromCompareTableAsync(cartId, itemId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartsApi#removeItemFromCompareTableAsync");
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
| **itemId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemToCompareCartRecordDto**](ItemToCompareCartRecordDto.md)

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

<a id="setCartCountryAsync"></a>
# **setCartCountryAsync**
> EmptyEnvelope setCartCountryAsync(cartId, apiVersion, xApiVersion, countrySwitchRequest)

Set the country of a cart

Set the country of a cart

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CartsApi apiInstance = new CartsApi(defaultClient);
    String cartId = "cartId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CountrySwitchRequest countrySwitchRequest = new CountrySwitchRequest(); // CountrySwitchRequest | 
    try {
      EmptyEnvelope result = apiInstance.setCartCountryAsync(cartId, apiVersion, xApiVersion, countrySwitchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartsApi#setCartCountryAsync");
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
| **cartId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **countrySwitchRequest** | [**CountrySwitchRequest**](CountrySwitchRequest.md)|  | [optional] |

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
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="setCartCurrencyAsync"></a>
# **setCartCurrencyAsync**
> EmptyEnvelope setCartCurrencyAsync(cartId, apiVersion, xApiVersion, currencySwitchRequest)

Set the currency of a cart

Set the currency of a cart

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CartsApi apiInstance = new CartsApi(defaultClient);
    String cartId = "cartId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CurrencySwitchRequest currencySwitchRequest = new CurrencySwitchRequest(); // CurrencySwitchRequest | 
    try {
      EmptyEnvelope result = apiInstance.setCartCurrencyAsync(cartId, apiVersion, xApiVersion, currencySwitchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartsApi#setCartCurrencyAsync");
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
| **cartId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **currencySwitchRequest** | [**CurrencySwitchRequest**](CurrencySwitchRequest.md)|  | [optional] |

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
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="submitCartAsync"></a>
# **submitCartAsync**
> EmptyEnvelope submitCartAsync(cartId, tenantId, apiVersion, xApiVersion)

Submit a cart for processing

Submit a cart for processing

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CartsApi apiInstance = new CartsApi(defaultClient);
    UUID cartId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.submitCartAsync(cartId, tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartsApi#submitCartAsync");
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
| **tenantId** | **UUID**|  | [optional] |
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
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="updateCartAsync"></a>
# **updateCartAsync**
> EmptyEnvelope updateCartAsync(cartId, apiVersion, xApiVersion, cartUpdateRequest)

Update a cart

Update a cart

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CartsApi apiInstance = new CartsApi(defaultClient);
    UUID cartId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CartUpdateRequest cartUpdateRequest = new CartUpdateRequest(); // CartUpdateRequest | 
    try {
      EmptyEnvelope result = apiInstance.updateCartAsync(cartId, apiVersion, xApiVersion, cartUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartsApi#updateCartAsync");
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
| **cartUpdateRequest** | [**CartUpdateRequest**](CartUpdateRequest.md)|  | [optional] |

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
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="updateCartLineAsync"></a>
# **updateCartLineAsync**
> EmptyEnvelope updateCartLineAsync(cartId, lineId, apiVersion, xApiVersion, itemCartRecordUpdateDto)

Update a cart line

Update a cart line

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CartsApi apiInstance = new CartsApi(defaultClient);
    UUID cartId = UUID.randomUUID(); // UUID | 
    UUID lineId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemCartRecordUpdateDto itemCartRecordUpdateDto = new ItemCartRecordUpdateDto(); // ItemCartRecordUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateCartLineAsync(cartId, lineId, apiVersion, xApiVersion, itemCartRecordUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartsApi#updateCartLineAsync");
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
| **lineId** | **UUID**|  | |
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

<a id="updateItemCartRecordAsync"></a>
# **updateItemCartRecordAsync**
> EmptyEnvelope updateItemCartRecordAsync(cartId, itemId, apiVersion, xApiVersion, itemCartRecordUpdateDto)

Update an Item in a cart

Update an Item in a cart

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CartsApi apiInstance = new CartsApi(defaultClient);
    UUID cartId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemCartRecordUpdateDto itemCartRecordUpdateDto = new ItemCartRecordUpdateDto(); // ItemCartRecordUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateItemCartRecordAsync(cartId, itemId, apiVersion, xApiVersion, itemCartRecordUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartsApi#updateItemCartRecordAsync");
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
| **itemId** | **UUID**|  | |
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

<a id="updateItemToWishList"></a>
# **updateItemToWishList**
> EmptyEnvelope updateItemToWishList(cartId, wishListId, apiVersion, xApiVersion, wishListUpdateDto)

Update a wish list

Update a wish list

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CartsApi apiInstance = new CartsApi(defaultClient);
    UUID cartId = UUID.randomUUID(); // UUID | 
    UUID wishListId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    WishListUpdateDto wishListUpdateDto = new WishListUpdateDto(); // WishListUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateItemToWishList(cartId, wishListId, apiVersion, xApiVersion, wishListUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartsApi#updateItemToWishList");
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
| **404** | Not Found |  -  |
| **401** | Unauthorized |  -  |

<a id="wishListExistsAsync"></a>
# **wishListExistsAsync**
> BooleanEnvelope wishListExistsAsync(cartId, wishListId, apiVersion, xApiVersion)

Assesses if a WishList exists

Assesses if a WishList exists

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CartsApi apiInstance = new CartsApi(defaultClient);
    UUID cartId = UUID.randomUUID(); // UUID | 
    UUID wishListId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      BooleanEnvelope result = apiInstance.wishListExistsAsync(cartId, wishListId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartsApi#wishListExistsAsync");
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
| **wishListId** | **UUID**|  | |
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
| **404** | Not Found |  -  |
| **401** | Unauthorized |  -  |

