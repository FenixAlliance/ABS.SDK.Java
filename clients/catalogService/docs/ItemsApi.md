# ItemsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**countStockItemTagsByItemId**](ItemsApi.md#countStockItemTagsByItemId) | **GET** /api/v2/CatalogService/Items/{itemId}/Tags/Count | Count tags for a stock item |
| [**countStockItemsByBusiness**](ItemsApi.md#countStockItemsByBusiness) | **GET** /api/v2/CatalogService/Items/Count | Count stock items by business |
| [**createStockItem**](ItemsApi.md#createStockItem) | **POST** /api/v2/CatalogService/Items | Create a new stock item |
| [**deleteStockItem**](ItemsApi.md#deleteStockItem) | **DELETE** /api/v2/CatalogService/Items/{itemId} | Delete a stock item |
| [**getExtendedStockItemById**](ItemsApi.md#getExtendedStockItemById) | **GET** /api/v2/CatalogService/Items/{itemId}/Extended | Get extended stock item by ID |
| [**getProductPrimaryImageAsync**](ItemsApi.md#getProductPrimaryImageAsync) | **GET** /api/v2/CatalogService/Items/{itemId}/Images/Primary | Get item primary image |
| [**getStockItemAttachmentById**](ItemsApi.md#getStockItemAttachmentById) | **GET** /api/v2/CatalogService/Items/{itemId}/Attachments/{itemAttachmentId} | Get attachment by ID for a stock item |
| [**getStockItemAttachmentsByItemId**](ItemsApi.md#getStockItemAttachmentsByItemId) | **GET** /api/v2/CatalogService/Items/{itemId}/Attachments | Get attachments for a stock item |
| [**getStockItemAttributeOptionById**](ItemsApi.md#getStockItemAttributeOptionById) | **GET** /api/v2/CatalogService/Items/{itemId}/AttributeOptions/{itemAttributeOptionId} | Get attribute option by ID for a stock item |
| [**getStockItemAttributeOptionsByItemId**](ItemsApi.md#getStockItemAttributeOptionsByItemId) | **GET** /api/v2/CatalogService/Items/{itemId}/AttributeOptions | Get attribute options for a stock item |
| [**getStockItemBrandById**](ItemsApi.md#getStockItemBrandById) | **GET** /api/v2/CatalogService/Items/{itemId}/Brands/{itemBrandId} | Get brand by ID for a stock item |
| [**getStockItemBrandsByItemId**](ItemsApi.md#getStockItemBrandsByItemId) | **GET** /api/v2/CatalogService/Items/{itemId}/Brands | Get brands for a stock item |
| [**getStockItemById**](ItemsApi.md#getStockItemById) | **GET** /api/v2/CatalogService/Items/{itemId} | Get stock item by ID |
| [**getStockItemCategoriesByItemId**](ItemsApi.md#getStockItemCategoriesByItemId) | **GET** /api/v2/CatalogService/Items/{itemId}/Categories | Get categories for a stock item |
| [**getStockItemCategoryById**](ItemsApi.md#getStockItemCategoryById) | **GET** /api/v2/CatalogService/Items/{itemId}/Categories/{itemCategoryId} | Get category by ID for a stock item |
| [**getStockItemGoogleCategoriesByItemId**](ItemsApi.md#getStockItemGoogleCategoriesByItemId) | **GET** /api/v2/CatalogService/Items/{itemId}/GoogleCategories | Get Google categories for a stock item |
| [**getStockItemGoogleCategoryById**](ItemsApi.md#getStockItemGoogleCategoryById) | **GET** /api/v2/CatalogService/Items/{itemId}/GoogleCategories/{itemGoogleCategoryId} | Get Google category by ID for a stock item |
| [**getStockItemImageById**](ItemsApi.md#getStockItemImageById) | **GET** /api/v2/CatalogService/Items/{itemId}/Images/{itemImageId} | Get image by ID for a stock item |
| [**getStockItemImagesByItemId**](ItemsApi.md#getStockItemImagesByItemId) | **GET** /api/v2/CatalogService/Items/{itemId}/Images | Get images for a stock item |
| [**getStockItemPriceRuleById**](ItemsApi.md#getStockItemPriceRuleById) | **GET** /api/v2/CatalogService/Items/{itemId}/PriceRules/{itemPriceRuleId} | Get price rule by ID for a stock item |
| [**getStockItemPriceRulesByItemId**](ItemsApi.md#getStockItemPriceRulesByItemId) | **GET** /api/v2/CatalogService/Items/{itemId}/PriceRules | Get price rules for a stock item |
| [**getStockItemQuestionById**](ItemsApi.md#getStockItemQuestionById) | **GET** /api/v2/CatalogService/Items/{itemId}/Questions/{itemQuestionId} | Get question by ID for a stock item |
| [**getStockItemQuestionsByItemId**](ItemsApi.md#getStockItemQuestionsByItemId) | **GET** /api/v2/CatalogService/Items/{itemId}/Questions | Get questions for a stock item |
| [**getStockItemRefundPoliciesByItemId**](ItemsApi.md#getStockItemRefundPoliciesByItemId) | **GET** /api/v2/CatalogService/Items/{itemId}/RefundPolicies | Get refund policies for a stock item |
| [**getStockItemRefundPolicyById**](ItemsApi.md#getStockItemRefundPolicyById) | **GET** /api/v2/CatalogService/Items/{itemId}/RefundPolicies/{itemRefundPolicyId} | Get refund policy by ID for a stock item |
| [**getStockItemReturnPoliciesByItemId**](ItemsApi.md#getStockItemReturnPoliciesByItemId) | **GET** /api/v2/CatalogService/Items/{itemId}/ReturnPolicies | Get return policies for a stock item |
| [**getStockItemReturnPolicyById**](ItemsApi.md#getStockItemReturnPolicyById) | **GET** /api/v2/CatalogService/Items/{itemId}/ReturnPolicies/{itemReturnPolicyId} | Get return policy by ID for a stock item |
| [**getStockItemReviewById**](ItemsApi.md#getStockItemReviewById) | **GET** /api/v2/CatalogService/Items/{itemId}/Reviews/{itemReviewId} | Get review by ID for a stock item |
| [**getStockItemReviewsByItemId**](ItemsApi.md#getStockItemReviewsByItemId) | **GET** /api/v2/CatalogService/Items/{itemId}/Reviews | Get reviews for a stock item |
| [**getStockItemShippingPoliciesByItemId**](ItemsApi.md#getStockItemShippingPoliciesByItemId) | **GET** /api/v2/CatalogService/Items/{itemId}/ShippingPolicies | Get shipping policies for a stock item |
| [**getStockItemShippingPolicyById**](ItemsApi.md#getStockItemShippingPolicyById) | **GET** /api/v2/CatalogService/Items/{itemId}/ShippingPolicies/{itemShippingPolicyId} | Get shipping policy by ID for a stock item |
| [**getStockItemTagById**](ItemsApi.md#getStockItemTagById) | **GET** /api/v2/CatalogService/Items/{itemId}/Tags/{itemTagId} | Get tag by ID for a stock item |
| [**getStockItemTagsByItemId**](ItemsApi.md#getStockItemTagsByItemId) | **GET** /api/v2/CatalogService/Items/{itemId}/Tags | Get tags for a stock item |
| [**getStockItemTaxPoliciesByItemId**](ItemsApi.md#getStockItemTaxPoliciesByItemId) | **GET** /api/v2/CatalogService/Items/{itemId}/TaxPolicies | Get tax policies for a stock item |
| [**getStockItemTaxPolicyById**](ItemsApi.md#getStockItemTaxPolicyById) | **GET** /api/v2/CatalogService/Items/{itemId}/TaxPolicies/{itemTaxPolicyId} | Get tax policy by ID for a stock item |
| [**getStockItemTypeById**](ItemsApi.md#getStockItemTypeById) | **GET** /api/v2/CatalogService/Items/{itemId}/Types/{itemTypeId} | Get type by ID for a stock item |
| [**getStockItemTypesByItemId**](ItemsApi.md#getStockItemTypesByItemId) | **GET** /api/v2/CatalogService/Items/{itemId}/Types | Get types for a stock item |
| [**getStockItemWarrantyPoliciesByItemId**](ItemsApi.md#getStockItemWarrantyPoliciesByItemId) | **GET** /api/v2/CatalogService/Items/{itemId}/WarrantyPolicies | Get warranty policies for a stock item |
| [**getStockItemWarrantyPolicyById**](ItemsApi.md#getStockItemWarrantyPolicyById) | **GET** /api/v2/CatalogService/Items/{itemId}/WarrantyPolicies/{itemWarrantyPolicyId} | Get warranty policy by ID for a stock item |
| [**getStockItemsOdataMaxPrice**](ItemsApi.md#getStockItemsOdataMaxPrice) | **GET** /api/v2/CatalogService/Items/MaxPrice | Get max price of stock items |
| [**getStockItemsOdataMinPrice**](ItemsApi.md#getStockItemsOdataMinPrice) | **GET** /api/v2/CatalogService/Items/MinPrice | Get min price of stock items |
| [**getStockItemsQuery**](ItemsApi.md#getStockItemsQuery) | **GET** /api/v2/CatalogService/Items | Get all stock items |
| [**relateAttachmentToStockItem**](ItemsApi.md#relateAttachmentToStockItem) | **POST** /api/v2/CatalogService/Items/{itemId}/Attachments/{itemAttachmentId} | Relate attachment to stock item |
| [**relateAttributeOptionToStockItem**](ItemsApi.md#relateAttributeOptionToStockItem) | **POST** /api/v2/CatalogService/Items/{itemId}/AttributeOptions/{itemAttributeOptionId} | Relate attribute option to stock item |
| [**relateBrandToStockItem**](ItemsApi.md#relateBrandToStockItem) | **POST** /api/v2/CatalogService/Items/{itemId}/Brands/{itemBrandId} | Relate brand to stock item |
| [**relateCategoryToStockItem**](ItemsApi.md#relateCategoryToStockItem) | **POST** /api/v2/CatalogService/Items/{itemId}/Categories/{itemCategoryId} | Relate category to stock item |
| [**relateGoogleCategoryToStockItem**](ItemsApi.md#relateGoogleCategoryToStockItem) | **POST** /api/v2/CatalogService/Items/{itemId}/GoogleCategories/{itemGoogleCategoryId} | Relate Google category to stock item |
| [**relateImageToStockItem**](ItemsApi.md#relateImageToStockItem) | **POST** /api/v2/CatalogService/Items/{itemId}/Images/{itemImageId} | Relate image to stock item |
| [**relatePriceRuleToStockItem**](ItemsApi.md#relatePriceRuleToStockItem) | **POST** /api/v2/CatalogService/Items/{itemId}/PriceRules/{itemPriceRuleId} | Relate price rule to stock item |
| [**relateQuestionToStockItem**](ItemsApi.md#relateQuestionToStockItem) | **POST** /api/v2/CatalogService/Items/{itemId}/Questions | Create question for stock item |
| [**relateRefundPolicyToStockItem**](ItemsApi.md#relateRefundPolicyToStockItem) | **POST** /api/v2/CatalogService/Items/{itemId}/RefundPolicies/{itemRefundPolicyId} | Relate refund policy to stock item |
| [**relateReturnPolicyToStockItem**](ItemsApi.md#relateReturnPolicyToStockItem) | **POST** /api/v2/CatalogService/Items/{itemId}/ReturnPolicies/{itemReturnPolicyId} | Relate return policy to stock item |
| [**relateReviewToStockItem**](ItemsApi.md#relateReviewToStockItem) | **POST** /api/v2/CatalogService/Items/{itemId}/Reviews | Create review for stock item |
| [**relateShippingPolicyToStockItem**](ItemsApi.md#relateShippingPolicyToStockItem) | **POST** /api/v2/CatalogService/Items/{itemId}/ShippingPolicies/{itemShippingPolicyId} | Relate shipping policy to stock item |
| [**relateTagToStockItem**](ItemsApi.md#relateTagToStockItem) | **POST** /api/v2/CatalogService/Items/{itemId}/Tags/{itemTagId} | Relate tag to stock item |
| [**relateTaxPolicyToStockItem**](ItemsApi.md#relateTaxPolicyToStockItem) | **POST** /api/v2/CatalogService/Items/{itemId}/TaxPolicies/{itemTaxPolicyId} | Relate tax policy to stock item |
| [**relateTypeToStockItem**](ItemsApi.md#relateTypeToStockItem) | **POST** /api/v2/CatalogService/Items/{itemId}/Types/{itemTypeId} | Relate type to stock item |
| [**relateWarrantyPolicyToStockItem**](ItemsApi.md#relateWarrantyPolicyToStockItem) | **POST** /api/v2/CatalogService/Items/{itemId}/WarrantyPolicies/{itemWarrantyPolicyId} | Relate warranty policy to stock item |
| [**removeAttachmentFromStockItem**](ItemsApi.md#removeAttachmentFromStockItem) | **DELETE** /api/v2/CatalogService/Items/{itemId}/Attachments/{itemAttachmentId} | Remove attachment from stock item |
| [**removeAttributeOptionFromStockItem**](ItemsApi.md#removeAttributeOptionFromStockItem) | **DELETE** /api/v2/CatalogService/Items/{itemId}/AttributeOptions/{itemAttributeOptionId} | Remove attribute option from stock item |
| [**removeBrandFromStockItem**](ItemsApi.md#removeBrandFromStockItem) | **DELETE** /api/v2/CatalogService/Items/{itemId}/Brands/{itemBrandId} | Remove brand from stock item |
| [**removeCategoryFromStockItem**](ItemsApi.md#removeCategoryFromStockItem) | **DELETE** /api/v2/CatalogService/Items/{itemId}/Categories/{itemCategoryId} | Remove category from stock item |
| [**removeGoogleCategoryFromStockItem**](ItemsApi.md#removeGoogleCategoryFromStockItem) | **DELETE** /api/v2/CatalogService/Items/{itemId}/GoogleCategories/{itemGoogleCategoryId} | Remove Google category from stock item |
| [**removeImageFromStockItem**](ItemsApi.md#removeImageFromStockItem) | **DELETE** /api/v2/CatalogService/Items/{itemId}/Images/{itemImageId} | Remove image from stock item |
| [**removePriceRuleFromStockItem**](ItemsApi.md#removePriceRuleFromStockItem) | **DELETE** /api/v2/CatalogService/Items/{itemId}/PriceRules/{itemPriceRuleId} | Remove price rule from stock item |
| [**removeQuestionFromStockItem**](ItemsApi.md#removeQuestionFromStockItem) | **DELETE** /api/v2/CatalogService/Items/{itemId}/Questions/{itemQuestionId} | Remove question from stock item |
| [**removeRefundPolicyFromStockItem**](ItemsApi.md#removeRefundPolicyFromStockItem) | **DELETE** /api/v2/CatalogService/Items/{itemId}/RefundPolicies/{itemRefundPolicyId} | Remove refund policy from stock item |
| [**removeReturnPolicyFromStockItem**](ItemsApi.md#removeReturnPolicyFromStockItem) | **DELETE** /api/v2/CatalogService/Items/{itemId}/ReturnPolicies/{itemReturnPolicyId} | Remove return policy from stock item |
| [**removeReviewFromStockItem**](ItemsApi.md#removeReviewFromStockItem) | **DELETE** /api/v2/CatalogService/Items/{itemId}/Reviews/{itemReviewId} | Remove review from stock item |
| [**removeShippingPolicyFromStockItem**](ItemsApi.md#removeShippingPolicyFromStockItem) | **DELETE** /api/v2/CatalogService/Items/{itemId}/ShippingPolicies/{itemShippingPolicyId} | Remove shipping policy from stock item |
| [**removeTagFromStockItem**](ItemsApi.md#removeTagFromStockItem) | **DELETE** /api/v2/CatalogService/Items/{itemId}/Tags/{itemTagId} | Remove tag from stock item |
| [**removeTaxPolicyFromStockItem**](ItemsApi.md#removeTaxPolicyFromStockItem) | **DELETE** /api/v2/CatalogService/Items/{itemId}/TaxPolicies/{itemTaxPolicyId} | Remove tax policy from stock item |
| [**removeTypeFromStockItem**](ItemsApi.md#removeTypeFromStockItem) | **DELETE** /api/v2/CatalogService/Items/{itemId}/Types/{itemTypeId} | Remove type from stock item |
| [**removeWarrantyPolicyFromStockItem**](ItemsApi.md#removeWarrantyPolicyFromStockItem) | **DELETE** /api/v2/CatalogService/Items/{itemId}/WarrantyPolicies/{itemWarrantyPolicyId} | Remove warranty policy from stock item |
| [**updateProductPrimaryImageAsync**](ItemsApi.md#updateProductPrimaryImageAsync) | **POST** /api/v2/CatalogService/Items/{itemId}/Images/Primary | Update item primary image |
| [**updateStockItem**](ItemsApi.md#updateStockItem) | **PUT** /api/v2/CatalogService/Items/{itemId} | Update a stock item |


<a id="countStockItemTagsByItemId"></a>
# **countStockItemTagsByItemId**
> Int32Envelope countStockItemTagsByItemId(itemId, apiVersion, xApiVersion)

Count tags for a stock item

Counts the number of tags associated with a specific stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.countStockItemTagsByItemId(itemId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#countStockItemTagsByItemId");
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
| **itemId** | **UUID**|  | |
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

<a id="countStockItemsByBusiness"></a>
# **countStockItemsByBusiness**
> Int32Envelope countStockItemsByBusiness(tenantId, apiVersion, xApiVersion)

Count stock items by business

Counts the number of stock items for a business, optionally filtered by tenant and OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.countStockItemsByBusiness(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#countStockItemsByBusiness");
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

<a id="createStockItem"></a>
# **createStockItem**
> createStockItem(tenantId, apiVersion, xApiVersion, catalogItemCreateDto)

Create a new stock item

Creates a new stock item for the specified tenant.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CatalogItemCreateDto catalogItemCreateDto = new CatalogItemCreateDto(); // CatalogItemCreateDto | 
    try {
      apiInstance.createStockItem(tenantId, apiVersion, xApiVersion, catalogItemCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#createStockItem");
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
| **catalogItemCreateDto** | [**CatalogItemCreateDto**](CatalogItemCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

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

<a id="deleteStockItem"></a>
# **deleteStockItem**
> deleteStockItem(tenantId, itemId, apiVersion, xApiVersion)

Delete a stock item

Deletes a stock item for the specified tenant and item ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteStockItem(tenantId, itemId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#deleteStockItem");
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
| **itemId** | **UUID**|  | |
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
| **200** | OK |  -  |

<a id="getExtendedStockItemById"></a>
# **getExtendedStockItemById**
> CatalogItemDtoEnvelope getExtendedStockItemById(itemId, apiVersion, xApiVersion)

Get extended stock item by ID

Retrieves extended information for a stock item by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CatalogItemDtoEnvelope result = apiInstance.getExtendedStockItemById(itemId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getExtendedStockItemById");
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
| **itemId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CatalogItemDtoEnvelope**](CatalogItemDtoEnvelope.md)

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

<a id="getProductPrimaryImageAsync"></a>
# **getProductPrimaryImageAsync**
> EmptyEnvelope getProductPrimaryImageAsync(itemId, apiVersion, xApiVersion)

Get item primary image

Retrieves the primary image for a specific catalog item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.getProductPrimaryImageAsync(itemId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getProductPrimaryImageAsync");
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
| **401** | Unauthorized |  -  |

<a id="getStockItemAttachmentById"></a>
# **getStockItemAttachmentById**
> ItemAttachmentDtoEnvelope getStockItemAttachmentById(itemId, itemAttachmentId, apiVersion, xApiVersion)

Get attachment by ID for a stock item

Retrieves a specific attachment by ID for a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemAttachmentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemAttachmentDtoEnvelope result = apiInstance.getStockItemAttachmentById(itemId, itemAttachmentId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getStockItemAttachmentById");
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
| **itemId** | **UUID**|  | |
| **itemAttachmentId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemAttachmentDtoEnvelope**](ItemAttachmentDtoEnvelope.md)

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

<a id="getStockItemAttachmentsByItemId"></a>
# **getStockItemAttachmentsByItemId**
> ItemAttachmentDtoListEnvelope getStockItemAttachmentsByItemId(itemId, apiVersion, xApiVersion)

Get attachments for a stock item

Retrieves all attachments associated with a specific stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemAttachmentDtoListEnvelope result = apiInstance.getStockItemAttachmentsByItemId(itemId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getStockItemAttachmentsByItemId");
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
| **itemId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemAttachmentDtoListEnvelope**](ItemAttachmentDtoListEnvelope.md)

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

<a id="getStockItemAttributeOptionById"></a>
# **getStockItemAttributeOptionById**
> ItemAttributeOptionDtoEnvelope getStockItemAttributeOptionById(itemId, itemAttributeOptionId, apiVersion, xApiVersion)

Get attribute option by ID for a stock item

Retrieves a specific attribute option by ID for a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemAttributeOptionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemAttributeOptionDtoEnvelope result = apiInstance.getStockItemAttributeOptionById(itemId, itemAttributeOptionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getStockItemAttributeOptionById");
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
| **itemId** | **UUID**|  | |
| **itemAttributeOptionId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemAttributeOptionDtoEnvelope**](ItemAttributeOptionDtoEnvelope.md)

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

<a id="getStockItemAttributeOptionsByItemId"></a>
# **getStockItemAttributeOptionsByItemId**
> ItemAttributeOptionDtoListEnvelope getStockItemAttributeOptionsByItemId(itemId, apiVersion, xApiVersion)

Get attribute options for a stock item

Retrieves all attribute options associated with a specific stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemAttributeOptionDtoListEnvelope result = apiInstance.getStockItemAttributeOptionsByItemId(itemId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getStockItemAttributeOptionsByItemId");
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
| **itemId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemAttributeOptionDtoListEnvelope**](ItemAttributeOptionDtoListEnvelope.md)

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

<a id="getStockItemBrandById"></a>
# **getStockItemBrandById**
> ItemBrandDtoEnvelope getStockItemBrandById(itemId, itemBrandId, apiVersion, xApiVersion)

Get brand by ID for a stock item

Retrieves a specific brand by ID for a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemBrandId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemBrandDtoEnvelope result = apiInstance.getStockItemBrandById(itemId, itemBrandId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getStockItemBrandById");
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
| **itemId** | **UUID**|  | |
| **itemBrandId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemBrandDtoEnvelope**](ItemBrandDtoEnvelope.md)

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

<a id="getStockItemBrandsByItemId"></a>
# **getStockItemBrandsByItemId**
> ItemBrandDtoListEnvelope getStockItemBrandsByItemId(itemId, apiVersion, xApiVersion)

Get brands for a stock item

Retrieves all brands associated with a specific stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemBrandDtoListEnvelope result = apiInstance.getStockItemBrandsByItemId(itemId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getStockItemBrandsByItemId");
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
| **itemId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemBrandDtoListEnvelope**](ItemBrandDtoListEnvelope.md)

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

<a id="getStockItemById"></a>
# **getStockItemById**
> CatalogItemDtoEnvelope getStockItemById(itemId, apiVersion, xApiVersion)

Get stock item by ID

Retrieves a stock item by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CatalogItemDtoEnvelope result = apiInstance.getStockItemById(itemId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getStockItemById");
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
| **itemId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CatalogItemDtoEnvelope**](CatalogItemDtoEnvelope.md)

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

<a id="getStockItemCategoriesByItemId"></a>
# **getStockItemCategoriesByItemId**
> ItemCategoryDtoListEnvelope getStockItemCategoriesByItemId(itemId, apiVersion, xApiVersion)

Get categories for a stock item

Retrieves all categories associated with a specific stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemCategoryDtoListEnvelope result = apiInstance.getStockItemCategoriesByItemId(itemId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getStockItemCategoriesByItemId");
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
| **itemId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemCategoryDtoListEnvelope**](ItemCategoryDtoListEnvelope.md)

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

<a id="getStockItemCategoryById"></a>
# **getStockItemCategoryById**
> ItemCategoryDtoEnvelope getStockItemCategoryById(itemId, itemCategoryId, apiVersion, xApiVersion)

Get category by ID for a stock item

Retrieves a specific category by ID for a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemCategoryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemCategoryDtoEnvelope result = apiInstance.getStockItemCategoryById(itemId, itemCategoryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getStockItemCategoryById");
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
| **itemId** | **UUID**|  | |
| **itemCategoryId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemCategoryDtoEnvelope**](ItemCategoryDtoEnvelope.md)

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

<a id="getStockItemGoogleCategoriesByItemId"></a>
# **getStockItemGoogleCategoriesByItemId**
> ItemGoogleCategoryDtoListEnvelope getStockItemGoogleCategoriesByItemId(itemId, apiVersion, xApiVersion)

Get Google categories for a stock item

Retrieves all Google categories associated with a specific stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemGoogleCategoryDtoListEnvelope result = apiInstance.getStockItemGoogleCategoriesByItemId(itemId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getStockItemGoogleCategoriesByItemId");
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
| **itemId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemGoogleCategoryDtoListEnvelope**](ItemGoogleCategoryDtoListEnvelope.md)

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

<a id="getStockItemGoogleCategoryById"></a>
# **getStockItemGoogleCategoryById**
> ItemGoogleCategoryDtoEnvelope getStockItemGoogleCategoryById(itemId, itemGoogleCategoryId, apiVersion, xApiVersion)

Get Google category by ID for a stock item

Retrieves a specific Google category by ID for a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemGoogleCategoryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemGoogleCategoryDtoEnvelope result = apiInstance.getStockItemGoogleCategoryById(itemId, itemGoogleCategoryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getStockItemGoogleCategoryById");
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
| **itemId** | **UUID**|  | |
| **itemGoogleCategoryId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemGoogleCategoryDtoEnvelope**](ItemGoogleCategoryDtoEnvelope.md)

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

<a id="getStockItemImageById"></a>
# **getStockItemImageById**
> ItemImageDtoEnvelope getStockItemImageById(itemId, itemImageId, apiVersion, xApiVersion)

Get image by ID for a stock item

Retrieves a specific image by ID for a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemImageId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemImageDtoEnvelope result = apiInstance.getStockItemImageById(itemId, itemImageId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getStockItemImageById");
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
| **itemId** | **UUID**|  | |
| **itemImageId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemImageDtoEnvelope**](ItemImageDtoEnvelope.md)

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

<a id="getStockItemImagesByItemId"></a>
# **getStockItemImagesByItemId**
> ItemImageDtoListEnvelope getStockItemImagesByItemId(itemId, apiVersion, xApiVersion)

Get images for a stock item

Retrieves all images associated with a specific stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemImageDtoListEnvelope result = apiInstance.getStockItemImagesByItemId(itemId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getStockItemImagesByItemId");
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
| **itemId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemImageDtoListEnvelope**](ItemImageDtoListEnvelope.md)

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

<a id="getStockItemPriceRuleById"></a>
# **getStockItemPriceRuleById**
> PricingRuleDtoEnvelope getStockItemPriceRuleById(itemId, itemPriceRuleId, apiVersion, xApiVersion)

Get price rule by ID for a stock item

Retrieves a specific pricing rule by ID for a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemPriceRuleId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      PricingRuleDtoEnvelope result = apiInstance.getStockItemPriceRuleById(itemId, itemPriceRuleId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getStockItemPriceRuleById");
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
| **itemId** | **UUID**|  | |
| **itemPriceRuleId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**PricingRuleDtoEnvelope**](PricingRuleDtoEnvelope.md)

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

<a id="getStockItemPriceRulesByItemId"></a>
# **getStockItemPriceRulesByItemId**
> PricingRuleDtoListEnvelope getStockItemPriceRulesByItemId(itemId, apiVersion, xApiVersion)

Get price rules for a stock item

Retrieves all pricing rules associated with a specific stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      PricingRuleDtoListEnvelope result = apiInstance.getStockItemPriceRulesByItemId(itemId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getStockItemPriceRulesByItemId");
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
| **itemId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**PricingRuleDtoListEnvelope**](PricingRuleDtoListEnvelope.md)

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

<a id="getStockItemQuestionById"></a>
# **getStockItemQuestionById**
> ItemQuestionDtoEnvelope getStockItemQuestionById(itemId, itemQuestionId, apiVersion, xApiVersion)

Get question by ID for a stock item

Retrieves a specific question by ID for a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemQuestionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemQuestionDtoEnvelope result = apiInstance.getStockItemQuestionById(itemId, itemQuestionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getStockItemQuestionById");
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
| **itemId** | **UUID**|  | |
| **itemQuestionId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemQuestionDtoEnvelope**](ItemQuestionDtoEnvelope.md)

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

<a id="getStockItemQuestionsByItemId"></a>
# **getStockItemQuestionsByItemId**
> ItemQuestionDtoListEnvelope getStockItemQuestionsByItemId(itemId, apiVersion, xApiVersion)

Get questions for a stock item

Retrieves all questions associated with a specific stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemQuestionDtoListEnvelope result = apiInstance.getStockItemQuestionsByItemId(itemId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getStockItemQuestionsByItemId");
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
| **itemId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemQuestionDtoListEnvelope**](ItemQuestionDtoListEnvelope.md)

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

<a id="getStockItemRefundPoliciesByItemId"></a>
# **getStockItemRefundPoliciesByItemId**
> ItemRefundPolicyDtoListEnvelope getStockItemRefundPoliciesByItemId(itemId, apiVersion, xApiVersion)

Get refund policies for a stock item

Retrieves all refund policies associated with a specific stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemRefundPolicyDtoListEnvelope result = apiInstance.getStockItemRefundPoliciesByItemId(itemId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getStockItemRefundPoliciesByItemId");
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
| **itemId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemRefundPolicyDtoListEnvelope**](ItemRefundPolicyDtoListEnvelope.md)

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

<a id="getStockItemRefundPolicyById"></a>
# **getStockItemRefundPolicyById**
> ItemRefundPolicyDtoEnvelope getStockItemRefundPolicyById(itemId, itemRefundPolicyId, apiVersion, xApiVersion)

Get refund policy by ID for a stock item

Retrieves a specific refund policy by ID for a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemRefundPolicyId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemRefundPolicyDtoEnvelope result = apiInstance.getStockItemRefundPolicyById(itemId, itemRefundPolicyId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getStockItemRefundPolicyById");
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
| **itemId** | **UUID**|  | |
| **itemRefundPolicyId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemRefundPolicyDtoEnvelope**](ItemRefundPolicyDtoEnvelope.md)

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

<a id="getStockItemReturnPoliciesByItemId"></a>
# **getStockItemReturnPoliciesByItemId**
> ItemReturnPolicyDtoListEnvelope getStockItemReturnPoliciesByItemId(itemId, apiVersion, xApiVersion)

Get return policies for a stock item

Retrieves all return policies associated with a specific stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemReturnPolicyDtoListEnvelope result = apiInstance.getStockItemReturnPoliciesByItemId(itemId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getStockItemReturnPoliciesByItemId");
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
| **itemId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemReturnPolicyDtoListEnvelope**](ItemReturnPolicyDtoListEnvelope.md)

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

<a id="getStockItemReturnPolicyById"></a>
# **getStockItemReturnPolicyById**
> ItemReturnPolicyDtoEnvelope getStockItemReturnPolicyById(itemId, itemReturnPolicyId, apiVersion, xApiVersion)

Get return policy by ID for a stock item

Retrieves a specific return policy by ID for a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemReturnPolicyId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemReturnPolicyDtoEnvelope result = apiInstance.getStockItemReturnPolicyById(itemId, itemReturnPolicyId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getStockItemReturnPolicyById");
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
| **itemId** | **UUID**|  | |
| **itemReturnPolicyId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemReturnPolicyDtoEnvelope**](ItemReturnPolicyDtoEnvelope.md)

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

<a id="getStockItemReviewById"></a>
# **getStockItemReviewById**
> ItemReviewDtoEnvelope getStockItemReviewById(itemId, itemReviewId, apiVersion, xApiVersion)

Get review by ID for a stock item

Retrieves a specific review by ID for a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemReviewId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemReviewDtoEnvelope result = apiInstance.getStockItemReviewById(itemId, itemReviewId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getStockItemReviewById");
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
| **itemId** | **UUID**|  | |
| **itemReviewId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemReviewDtoEnvelope**](ItemReviewDtoEnvelope.md)

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

<a id="getStockItemReviewsByItemId"></a>
# **getStockItemReviewsByItemId**
> ItemReviewDtoListEnvelope getStockItemReviewsByItemId(itemId, apiVersion, xApiVersion)

Get reviews for a stock item

Retrieves all reviews associated with a specific stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemReviewDtoListEnvelope result = apiInstance.getStockItemReviewsByItemId(itemId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getStockItemReviewsByItemId");
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
| **itemId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemReviewDtoListEnvelope**](ItemReviewDtoListEnvelope.md)

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

<a id="getStockItemShippingPoliciesByItemId"></a>
# **getStockItemShippingPoliciesByItemId**
> ItemShippingPolicyDtoListEnvelope getStockItemShippingPoliciesByItemId(itemId, apiVersion, xApiVersion)

Get shipping policies for a stock item

Retrieves all shipping policies associated with a specific stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemShippingPolicyDtoListEnvelope result = apiInstance.getStockItemShippingPoliciesByItemId(itemId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getStockItemShippingPoliciesByItemId");
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
| **itemId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemShippingPolicyDtoListEnvelope**](ItemShippingPolicyDtoListEnvelope.md)

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

<a id="getStockItemShippingPolicyById"></a>
# **getStockItemShippingPolicyById**
> ItemShippingPolicyDtoEnvelope getStockItemShippingPolicyById(itemId, itemShippingPolicyId, apiVersion, xApiVersion)

Get shipping policy by ID for a stock item

Retrieves a specific shipping policy by ID for a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemShippingPolicyId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemShippingPolicyDtoEnvelope result = apiInstance.getStockItemShippingPolicyById(itemId, itemShippingPolicyId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getStockItemShippingPolicyById");
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
| **itemId** | **UUID**|  | |
| **itemShippingPolicyId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemShippingPolicyDtoEnvelope**](ItemShippingPolicyDtoEnvelope.md)

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

<a id="getStockItemTagById"></a>
# **getStockItemTagById**
> ItemTagDtoEnvelope getStockItemTagById(itemId, itemTagId, apiVersion, xApiVersion)

Get tag by ID for a stock item

Retrieves a specific tag by ID for a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemTagId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemTagDtoEnvelope result = apiInstance.getStockItemTagById(itemId, itemTagId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getStockItemTagById");
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
| **itemId** | **UUID**|  | |
| **itemTagId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemTagDtoEnvelope**](ItemTagDtoEnvelope.md)

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

<a id="getStockItemTagsByItemId"></a>
# **getStockItemTagsByItemId**
> ItemTagDtoListEnvelope getStockItemTagsByItemId(itemId, apiVersion, xApiVersion)

Get tags for a stock item

Retrieves all tags associated with a specific stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemTagDtoListEnvelope result = apiInstance.getStockItemTagsByItemId(itemId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getStockItemTagsByItemId");
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
| **itemId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemTagDtoListEnvelope**](ItemTagDtoListEnvelope.md)

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

<a id="getStockItemTaxPoliciesByItemId"></a>
# **getStockItemTaxPoliciesByItemId**
> ItemTaxPolicyDtoListEnvelope getStockItemTaxPoliciesByItemId(itemId, apiVersion, xApiVersion)

Get tax policies for a stock item

Retrieves all tax policies associated with a specific stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemTaxPolicyDtoListEnvelope result = apiInstance.getStockItemTaxPoliciesByItemId(itemId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getStockItemTaxPoliciesByItemId");
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
| **itemId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemTaxPolicyDtoListEnvelope**](ItemTaxPolicyDtoListEnvelope.md)

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

<a id="getStockItemTaxPolicyById"></a>
# **getStockItemTaxPolicyById**
> ItemTaxPolicyDtoEnvelope getStockItemTaxPolicyById(itemId, itemTaxPolicyId, apiVersion, xApiVersion)

Get tax policy by ID for a stock item

Retrieves a specific tax policy by ID for a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemTaxPolicyId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemTaxPolicyDtoEnvelope result = apiInstance.getStockItemTaxPolicyById(itemId, itemTaxPolicyId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getStockItemTaxPolicyById");
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
| **itemId** | **UUID**|  | |
| **itemTaxPolicyId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemTaxPolicyDtoEnvelope**](ItemTaxPolicyDtoEnvelope.md)

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

<a id="getStockItemTypeById"></a>
# **getStockItemTypeById**
> ItemTypeDtoEnvelope getStockItemTypeById(itemId, itemTypeId, apiVersion, xApiVersion)

Get type by ID for a stock item

Retrieves a specific type by ID for a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemTypeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemTypeDtoEnvelope result = apiInstance.getStockItemTypeById(itemId, itemTypeId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getStockItemTypeById");
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
| **itemId** | **UUID**|  | |
| **itemTypeId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemTypeDtoEnvelope**](ItemTypeDtoEnvelope.md)

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

<a id="getStockItemTypesByItemId"></a>
# **getStockItemTypesByItemId**
> ItemTypeDtoListEnvelope getStockItemTypesByItemId(itemId, apiVersion, xApiVersion)

Get types for a stock item

Retrieves all types associated with a specific stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemTypeDtoListEnvelope result = apiInstance.getStockItemTypesByItemId(itemId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getStockItemTypesByItemId");
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
| **itemId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemTypeDtoListEnvelope**](ItemTypeDtoListEnvelope.md)

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

<a id="getStockItemWarrantyPoliciesByItemId"></a>
# **getStockItemWarrantyPoliciesByItemId**
> ItemWarrantyPolicyDtoListEnvelope getStockItemWarrantyPoliciesByItemId(itemId, apiVersion, xApiVersion)

Get warranty policies for a stock item

Retrieves all warranty policies associated with a specific stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemWarrantyPolicyDtoListEnvelope result = apiInstance.getStockItemWarrantyPoliciesByItemId(itemId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getStockItemWarrantyPoliciesByItemId");
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
| **itemId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemWarrantyPolicyDtoListEnvelope**](ItemWarrantyPolicyDtoListEnvelope.md)

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

<a id="getStockItemWarrantyPolicyById"></a>
# **getStockItemWarrantyPolicyById**
> ItemWarrantyPolicyDtoEnvelope getStockItemWarrantyPolicyById(itemId, itemWarrantyPolicyId, apiVersion, xApiVersion)

Get warranty policy by ID for a stock item

Retrieves a specific warranty policy by ID for a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemWarrantyPolicyId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemWarrantyPolicyDtoEnvelope result = apiInstance.getStockItemWarrantyPolicyById(itemId, itemWarrantyPolicyId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getStockItemWarrantyPolicyById");
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
| **itemId** | **UUID**|  | |
| **itemWarrantyPolicyId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemWarrantyPolicyDtoEnvelope**](ItemWarrantyPolicyDtoEnvelope.md)

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

<a id="getStockItemsOdataMaxPrice"></a>
# **getStockItemsOdataMaxPrice**
> MoneyEnvelope getStockItemsOdataMaxPrice(tenantId, apiVersion, xApiVersion)

Get max price of stock items

Retrieves the maximum price among all stock items, optionally filtered by tenant and OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      MoneyEnvelope result = apiInstance.getStockItemsOdataMaxPrice(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getStockItemsOdataMaxPrice");
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

### Return type

[**MoneyEnvelope**](MoneyEnvelope.md)

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

<a id="getStockItemsOdataMinPrice"></a>
# **getStockItemsOdataMinPrice**
> MoneyEnvelope getStockItemsOdataMinPrice(tenantId, apiVersion, xApiVersion)

Get min price of stock items

Retrieves the minimum price among all stock items, optionally filtered by tenant and OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      MoneyEnvelope result = apiInstance.getStockItemsOdataMinPrice(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getStockItemsOdataMinPrice");
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

### Return type

[**MoneyEnvelope**](MoneyEnvelope.md)

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

<a id="getStockItemsQuery"></a>
# **getStockItemsQuery**
> CatalogItemDtoListEnvelope getStockItemsQuery(tenantId, apiVersion, xApiVersion)

Get all stock items

Retrieves all stock items, optionally filtered by tenant and OData query options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CatalogItemDtoListEnvelope result = apiInstance.getStockItemsQuery(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getStockItemsQuery");
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

### Return type

[**CatalogItemDtoListEnvelope**](CatalogItemDtoListEnvelope.md)

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

<a id="relateAttachmentToStockItem"></a>
# **relateAttachmentToStockItem**
> ItemAttachmentDtoEnvelope relateAttachmentToStockItem(tenantId, itemId, itemAttachmentId, apiVersion, xApiVersion, itemAttachmentCreateDto)

Relate attachment to stock item

Associates an attachment with a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    String itemAttachmentId = "itemAttachmentId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemAttachmentCreateDto itemAttachmentCreateDto = new ItemAttachmentCreateDto(); // ItemAttachmentCreateDto | 
    try {
      ItemAttachmentDtoEnvelope result = apiInstance.relateAttachmentToStockItem(tenantId, itemId, itemAttachmentId, apiVersion, xApiVersion, itemAttachmentCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#relateAttachmentToStockItem");
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
| **itemId** | **UUID**|  | |
| **itemAttachmentId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **itemAttachmentCreateDto** | [**ItemAttachmentCreateDto**](ItemAttachmentCreateDto.md)|  | [optional] |

### Return type

[**ItemAttachmentDtoEnvelope**](ItemAttachmentDtoEnvelope.md)

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

<a id="relateAttributeOptionToStockItem"></a>
# **relateAttributeOptionToStockItem**
> ItemAttributeOptionDtoEnvelope relateAttributeOptionToStockItem(itemId, itemAttributeOptionId, apiVersion, xApiVersion)

Relate attribute option to stock item

Associates an attribute option with a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemAttributeOptionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemAttributeOptionDtoEnvelope result = apiInstance.relateAttributeOptionToStockItem(itemId, itemAttributeOptionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#relateAttributeOptionToStockItem");
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
| **itemId** | **UUID**|  | |
| **itemAttributeOptionId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemAttributeOptionDtoEnvelope**](ItemAttributeOptionDtoEnvelope.md)

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

<a id="relateBrandToStockItem"></a>
# **relateBrandToStockItem**
> ItemBrandDtoEnvelope relateBrandToStockItem(tenantId, itemId, itemBrandId, apiVersion, xApiVersion)

Relate brand to stock item

Associates a brand with a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemBrandId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemBrandDtoEnvelope result = apiInstance.relateBrandToStockItem(tenantId, itemId, itemBrandId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#relateBrandToStockItem");
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
| **itemId** | **UUID**|  | |
| **itemBrandId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemBrandDtoEnvelope**](ItemBrandDtoEnvelope.md)

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

<a id="relateCategoryToStockItem"></a>
# **relateCategoryToStockItem**
> ItemCategoryDtoEnvelope relateCategoryToStockItem(tenantId, itemId, itemCategoryId, apiVersion, xApiVersion)

Relate category to stock item

Associates a category with a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemCategoryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemCategoryDtoEnvelope result = apiInstance.relateCategoryToStockItem(tenantId, itemId, itemCategoryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#relateCategoryToStockItem");
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
| **itemId** | **UUID**|  | |
| **itemCategoryId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemCategoryDtoEnvelope**](ItemCategoryDtoEnvelope.md)

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

<a id="relateGoogleCategoryToStockItem"></a>
# **relateGoogleCategoryToStockItem**
> ItemGoogleCategoryDtoEnvelope relateGoogleCategoryToStockItem(tenantId, itemId, itemGoogleCategoryId, apiVersion, xApiVersion)

Relate Google category to stock item

Associates a Google category with a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemGoogleCategoryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemGoogleCategoryDtoEnvelope result = apiInstance.relateGoogleCategoryToStockItem(tenantId, itemId, itemGoogleCategoryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#relateGoogleCategoryToStockItem");
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
| **itemId** | **UUID**|  | |
| **itemGoogleCategoryId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemGoogleCategoryDtoEnvelope**](ItemGoogleCategoryDtoEnvelope.md)

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

<a id="relateImageToStockItem"></a>
# **relateImageToStockItem**
> ItemImageDtoEnvelope relateImageToStockItem(tenantId, itemId, itemImageId, apiVersion, xApiVersion)

Relate image to stock item

Associates an image with a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemImageId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemImageDtoEnvelope result = apiInstance.relateImageToStockItem(tenantId, itemId, itemImageId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#relateImageToStockItem");
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
| **itemId** | **UUID**|  | |
| **itemImageId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemImageDtoEnvelope**](ItemImageDtoEnvelope.md)

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

<a id="relatePriceRuleToStockItem"></a>
# **relatePriceRuleToStockItem**
> PricingRuleDtoEnvelope relatePriceRuleToStockItem(itemId, itemPriceRuleId, apiVersion, xApiVersion)

Relate price rule to stock item

Associates a pricing rule with a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemPriceRuleId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      PricingRuleDtoEnvelope result = apiInstance.relatePriceRuleToStockItem(itemId, itemPriceRuleId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#relatePriceRuleToStockItem");
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
| **itemId** | **UUID**|  | |
| **itemPriceRuleId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**PricingRuleDtoEnvelope**](PricingRuleDtoEnvelope.md)

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

<a id="relateQuestionToStockItem"></a>
# **relateQuestionToStockItem**
> ItemQuestionDtoEnvelope relateQuestionToStockItem(tenantId, itemId, apiVersion, xApiVersion, itemQuestionRecordCreateDto)

Create question for stock item

Creates a new question for a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemQuestionRecordCreateDto itemQuestionRecordCreateDto = new ItemQuestionRecordCreateDto(); // ItemQuestionRecordCreateDto | 
    try {
      ItemQuestionDtoEnvelope result = apiInstance.relateQuestionToStockItem(tenantId, itemId, apiVersion, xApiVersion, itemQuestionRecordCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#relateQuestionToStockItem");
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
| **itemId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **itemQuestionRecordCreateDto** | [**ItemQuestionRecordCreateDto**](ItemQuestionRecordCreateDto.md)|  | [optional] |

### Return type

[**ItemQuestionDtoEnvelope**](ItemQuestionDtoEnvelope.md)

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

<a id="relateRefundPolicyToStockItem"></a>
# **relateRefundPolicyToStockItem**
> ItemRefundPolicyDtoEnvelope relateRefundPolicyToStockItem(tenantId, itemId, itemRefundPolicyId, apiVersion, xApiVersion)

Relate refund policy to stock item

Associates a refund policy with a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemRefundPolicyId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemRefundPolicyDtoEnvelope result = apiInstance.relateRefundPolicyToStockItem(tenantId, itemId, itemRefundPolicyId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#relateRefundPolicyToStockItem");
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
| **itemId** | **UUID**|  | |
| **itemRefundPolicyId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemRefundPolicyDtoEnvelope**](ItemRefundPolicyDtoEnvelope.md)

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

<a id="relateReturnPolicyToStockItem"></a>
# **relateReturnPolicyToStockItem**
> ItemReturnPolicyDtoEnvelope relateReturnPolicyToStockItem(tenantId, itemId, itemReturnPolicyId, apiVersion, xApiVersion)

Relate return policy to stock item

Associates a return policy with a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemReturnPolicyId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemReturnPolicyDtoEnvelope result = apiInstance.relateReturnPolicyToStockItem(tenantId, itemId, itemReturnPolicyId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#relateReturnPolicyToStockItem");
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
| **itemId** | **UUID**|  | |
| **itemReturnPolicyId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemReturnPolicyDtoEnvelope**](ItemReturnPolicyDtoEnvelope.md)

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

<a id="relateReviewToStockItem"></a>
# **relateReviewToStockItem**
> ItemReviewDtoEnvelope relateReviewToStockItem(tenantId, itemId, apiVersion, xApiVersion, itemReviewRecordCreateDto)

Create review for stock item

Creates a new review for a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ItemReviewRecordCreateDto itemReviewRecordCreateDto = new ItemReviewRecordCreateDto(); // ItemReviewRecordCreateDto | 
    try {
      ItemReviewDtoEnvelope result = apiInstance.relateReviewToStockItem(tenantId, itemId, apiVersion, xApiVersion, itemReviewRecordCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#relateReviewToStockItem");
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
| **itemId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **itemReviewRecordCreateDto** | [**ItemReviewRecordCreateDto**](ItemReviewRecordCreateDto.md)|  | [optional] |

### Return type

[**ItemReviewDtoEnvelope**](ItemReviewDtoEnvelope.md)

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

<a id="relateShippingPolicyToStockItem"></a>
# **relateShippingPolicyToStockItem**
> ItemShippingPolicyDtoEnvelope relateShippingPolicyToStockItem(tenantId, itemId, itemShippingPolicyId, apiVersion, xApiVersion)

Relate shipping policy to stock item

Associates a shipping policy with a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemShippingPolicyId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemShippingPolicyDtoEnvelope result = apiInstance.relateShippingPolicyToStockItem(tenantId, itemId, itemShippingPolicyId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#relateShippingPolicyToStockItem");
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
| **itemId** | **UUID**|  | |
| **itemShippingPolicyId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemShippingPolicyDtoEnvelope**](ItemShippingPolicyDtoEnvelope.md)

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

<a id="relateTagToStockItem"></a>
# **relateTagToStockItem**
> ItemTagDtoEnvelope relateTagToStockItem(tenantId, itemId, itemTagId, apiVersion, xApiVersion)

Relate tag to stock item

Associates a tag with a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemTagId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemTagDtoEnvelope result = apiInstance.relateTagToStockItem(tenantId, itemId, itemTagId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#relateTagToStockItem");
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
| **itemId** | **UUID**|  | |
| **itemTagId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemTagDtoEnvelope**](ItemTagDtoEnvelope.md)

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

<a id="relateTaxPolicyToStockItem"></a>
# **relateTaxPolicyToStockItem**
> ItemTaxPolicyDtoEnvelope relateTaxPolicyToStockItem(tenantId, itemId, itemTaxPolicyId, apiVersion, xApiVersion)

Relate tax policy to stock item

Associates a tax policy with a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemTaxPolicyId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemTaxPolicyDtoEnvelope result = apiInstance.relateTaxPolicyToStockItem(tenantId, itemId, itemTaxPolicyId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#relateTaxPolicyToStockItem");
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
| **itemId** | **UUID**|  | |
| **itemTaxPolicyId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemTaxPolicyDtoEnvelope**](ItemTaxPolicyDtoEnvelope.md)

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

<a id="relateTypeToStockItem"></a>
# **relateTypeToStockItem**
> ItemTypeDtoEnvelope relateTypeToStockItem(tenantId, itemId, itemTypeId, apiVersion, xApiVersion)

Relate type to stock item

Associates a type with a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemTypeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemTypeDtoEnvelope result = apiInstance.relateTypeToStockItem(tenantId, itemId, itemTypeId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#relateTypeToStockItem");
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
| **itemId** | **UUID**|  | |
| **itemTypeId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemTypeDtoEnvelope**](ItemTypeDtoEnvelope.md)

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

<a id="relateWarrantyPolicyToStockItem"></a>
# **relateWarrantyPolicyToStockItem**
> ItemWarrantyPolicyDtoEnvelope relateWarrantyPolicyToStockItem(tenantId, itemId, itemWarrantyPolicyId, apiVersion, xApiVersion)

Relate warranty policy to stock item

Associates a warranty policy with a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemWarrantyPolicyId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemWarrantyPolicyDtoEnvelope result = apiInstance.relateWarrantyPolicyToStockItem(tenantId, itemId, itemWarrantyPolicyId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#relateWarrantyPolicyToStockItem");
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
| **itemId** | **UUID**|  | |
| **itemWarrantyPolicyId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemWarrantyPolicyDtoEnvelope**](ItemWarrantyPolicyDtoEnvelope.md)

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

<a id="removeAttachmentFromStockItem"></a>
# **removeAttachmentFromStockItem**
> ItemAttachmentDtoEnvelope removeAttachmentFromStockItem(tenantId, itemId, itemAttachmentId, apiVersion, xApiVersion)

Remove attachment from stock item

Removes an attachment from a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemAttachmentId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemAttachmentDtoEnvelope result = apiInstance.removeAttachmentFromStockItem(tenantId, itemId, itemAttachmentId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#removeAttachmentFromStockItem");
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
| **itemId** | **UUID**|  | |
| **itemAttachmentId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemAttachmentDtoEnvelope**](ItemAttachmentDtoEnvelope.md)

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

<a id="removeAttributeOptionFromStockItem"></a>
# **removeAttributeOptionFromStockItem**
> ItemAttributeOptionDtoEnvelope removeAttributeOptionFromStockItem(itemId, itemAttributeOptionId, apiVersion, xApiVersion)

Remove attribute option from stock item

Removes an attribute option from a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemAttributeOptionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemAttributeOptionDtoEnvelope result = apiInstance.removeAttributeOptionFromStockItem(itemId, itemAttributeOptionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#removeAttributeOptionFromStockItem");
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
| **itemId** | **UUID**|  | |
| **itemAttributeOptionId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemAttributeOptionDtoEnvelope**](ItemAttributeOptionDtoEnvelope.md)

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

<a id="removeBrandFromStockItem"></a>
# **removeBrandFromStockItem**
> ItemBrandDtoEnvelope removeBrandFromStockItem(tenantId, itemId, itemBrandId, apiVersion, xApiVersion)

Remove brand from stock item

Removes a brand association from a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemBrandId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemBrandDtoEnvelope result = apiInstance.removeBrandFromStockItem(tenantId, itemId, itemBrandId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#removeBrandFromStockItem");
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
| **itemId** | **UUID**|  | |
| **itemBrandId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemBrandDtoEnvelope**](ItemBrandDtoEnvelope.md)

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

<a id="removeCategoryFromStockItem"></a>
# **removeCategoryFromStockItem**
> ItemCategoryDtoEnvelope removeCategoryFromStockItem(tenantId, itemId, itemCategoryId, apiVersion, xApiVersion)

Remove category from stock item

Removes a category association from a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemCategoryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemCategoryDtoEnvelope result = apiInstance.removeCategoryFromStockItem(tenantId, itemId, itemCategoryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#removeCategoryFromStockItem");
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
| **itemId** | **UUID**|  | |
| **itemCategoryId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemCategoryDtoEnvelope**](ItemCategoryDtoEnvelope.md)

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

<a id="removeGoogleCategoryFromStockItem"></a>
# **removeGoogleCategoryFromStockItem**
> ItemGoogleCategoryDtoEnvelope removeGoogleCategoryFromStockItem(tenantId, itemId, itemGoogleCategoryId, apiVersion, xApiVersion)

Remove Google category from stock item

Removes a Google category from a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemGoogleCategoryId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemGoogleCategoryDtoEnvelope result = apiInstance.removeGoogleCategoryFromStockItem(tenantId, itemId, itemGoogleCategoryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#removeGoogleCategoryFromStockItem");
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
| **itemId** | **UUID**|  | |
| **itemGoogleCategoryId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemGoogleCategoryDtoEnvelope**](ItemGoogleCategoryDtoEnvelope.md)

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

<a id="removeImageFromStockItem"></a>
# **removeImageFromStockItem**
> ItemImageDtoEnvelope removeImageFromStockItem(tenantId, itemId, itemImageId, apiVersion, xApiVersion)

Remove image from stock item

Removes an image association from a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemImageId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemImageDtoEnvelope result = apiInstance.removeImageFromStockItem(tenantId, itemId, itemImageId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#removeImageFromStockItem");
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
| **itemId** | **UUID**|  | |
| **itemImageId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemImageDtoEnvelope**](ItemImageDtoEnvelope.md)

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

<a id="removePriceRuleFromStockItem"></a>
# **removePriceRuleFromStockItem**
> PricingRuleDtoEnvelope removePriceRuleFromStockItem(itemId, itemPriceRuleId, apiVersion, xApiVersion)

Remove price rule from stock item

Removes a pricing rule from a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemPriceRuleId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      PricingRuleDtoEnvelope result = apiInstance.removePriceRuleFromStockItem(itemId, itemPriceRuleId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#removePriceRuleFromStockItem");
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
| **itemId** | **UUID**|  | |
| **itemPriceRuleId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**PricingRuleDtoEnvelope**](PricingRuleDtoEnvelope.md)

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

<a id="removeQuestionFromStockItem"></a>
# **removeQuestionFromStockItem**
> ItemQuestionDtoEnvelope removeQuestionFromStockItem(tenantId, itemId, itemQuestionId, apiVersion, xApiVersion)

Remove question from stock item

Removes a question from a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemQuestionId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemQuestionDtoEnvelope result = apiInstance.removeQuestionFromStockItem(tenantId, itemId, itemQuestionId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#removeQuestionFromStockItem");
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
| **itemId** | **UUID**|  | |
| **itemQuestionId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemQuestionDtoEnvelope**](ItemQuestionDtoEnvelope.md)

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

<a id="removeRefundPolicyFromStockItem"></a>
# **removeRefundPolicyFromStockItem**
> ItemRefundPolicyDtoEnvelope removeRefundPolicyFromStockItem(tenantId, itemId, itemRefundPolicyId, apiVersion, xApiVersion)

Remove refund policy from stock item

Removes a refund policy from a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemRefundPolicyId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemRefundPolicyDtoEnvelope result = apiInstance.removeRefundPolicyFromStockItem(tenantId, itemId, itemRefundPolicyId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#removeRefundPolicyFromStockItem");
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
| **itemId** | **UUID**|  | |
| **itemRefundPolicyId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemRefundPolicyDtoEnvelope**](ItemRefundPolicyDtoEnvelope.md)

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

<a id="removeReturnPolicyFromStockItem"></a>
# **removeReturnPolicyFromStockItem**
> ItemReturnPolicyDtoEnvelope removeReturnPolicyFromStockItem(tenantId, itemId, itemReturnPolicyId, apiVersion, xApiVersion)

Remove return policy from stock item

Removes a return policy from a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemReturnPolicyId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemReturnPolicyDtoEnvelope result = apiInstance.removeReturnPolicyFromStockItem(tenantId, itemId, itemReturnPolicyId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#removeReturnPolicyFromStockItem");
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
| **itemId** | **UUID**|  | |
| **itemReturnPolicyId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemReturnPolicyDtoEnvelope**](ItemReturnPolicyDtoEnvelope.md)

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

<a id="removeReviewFromStockItem"></a>
# **removeReviewFromStockItem**
> ItemReviewDtoEnvelope removeReviewFromStockItem(tenantId, itemId, itemReviewId, apiVersion, xApiVersion)

Remove review from stock item

Removes a review from a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemReviewId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemReviewDtoEnvelope result = apiInstance.removeReviewFromStockItem(tenantId, itemId, itemReviewId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#removeReviewFromStockItem");
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
| **itemId** | **UUID**|  | |
| **itemReviewId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemReviewDtoEnvelope**](ItemReviewDtoEnvelope.md)

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

<a id="removeShippingPolicyFromStockItem"></a>
# **removeShippingPolicyFromStockItem**
> ItemShippingPolicyDtoEnvelope removeShippingPolicyFromStockItem(tenantId, itemId, itemShippingPolicyId, apiVersion, xApiVersion)

Remove shipping policy from stock item

Removes a shipping policy from a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemShippingPolicyId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemShippingPolicyDtoEnvelope result = apiInstance.removeShippingPolicyFromStockItem(tenantId, itemId, itemShippingPolicyId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#removeShippingPolicyFromStockItem");
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
| **itemId** | **UUID**|  | |
| **itemShippingPolicyId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemShippingPolicyDtoEnvelope**](ItemShippingPolicyDtoEnvelope.md)

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

<a id="removeTagFromStockItem"></a>
# **removeTagFromStockItem**
> ItemTagDtoEnvelope removeTagFromStockItem(tenantId, itemId, itemTagId, apiVersion, xApiVersion)

Remove tag from stock item

Removes a tag association from a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemTagId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemTagDtoEnvelope result = apiInstance.removeTagFromStockItem(tenantId, itemId, itemTagId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#removeTagFromStockItem");
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
| **itemId** | **UUID**|  | |
| **itemTagId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemTagDtoEnvelope**](ItemTagDtoEnvelope.md)

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

<a id="removeTaxPolicyFromStockItem"></a>
# **removeTaxPolicyFromStockItem**
> ItemTaxPolicyDtoEnvelope removeTaxPolicyFromStockItem(tenantId, itemId, itemTaxPolicyId, apiVersion, xApiVersion)

Remove tax policy from stock item

Removes a tax policy from a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemTaxPolicyId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemTaxPolicyDtoEnvelope result = apiInstance.removeTaxPolicyFromStockItem(tenantId, itemId, itemTaxPolicyId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#removeTaxPolicyFromStockItem");
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
| **itemId** | **UUID**|  | |
| **itemTaxPolicyId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemTaxPolicyDtoEnvelope**](ItemTaxPolicyDtoEnvelope.md)

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

<a id="removeTypeFromStockItem"></a>
# **removeTypeFromStockItem**
> ItemTypeDtoEnvelope removeTypeFromStockItem(tenantId, itemId, itemTypeId, apiVersion, xApiVersion)

Remove type from stock item

Removes a type association from a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemTypeId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemTypeDtoEnvelope result = apiInstance.removeTypeFromStockItem(tenantId, itemId, itemTypeId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#removeTypeFromStockItem");
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
| **itemId** | **UUID**|  | |
| **itemTypeId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemTypeDtoEnvelope**](ItemTypeDtoEnvelope.md)

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

<a id="removeWarrantyPolicyFromStockItem"></a>
# **removeWarrantyPolicyFromStockItem**
> ItemWarrantyPolicyDtoEnvelope removeWarrantyPolicyFromStockItem(tenantId, itemId, itemWarrantyPolicyId, apiVersion, xApiVersion)

Remove warranty policy from stock item

Removes a warranty policy from a stock item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID itemWarrantyPolicyId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ItemWarrantyPolicyDtoEnvelope result = apiInstance.removeWarrantyPolicyFromStockItem(tenantId, itemId, itemWarrantyPolicyId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#removeWarrantyPolicyFromStockItem");
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
| **itemId** | **UUID**|  | |
| **itemWarrantyPolicyId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ItemWarrantyPolicyDtoEnvelope**](ItemWarrantyPolicyDtoEnvelope.md)

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

<a id="updateProductPrimaryImageAsync"></a>
# **updateProductPrimaryImageAsync**
> EmptyEnvelope updateProductPrimaryImageAsync(itemId, tenantId, apiVersion, xApiVersion, data)

Update item primary image

Updates the primary image for a specific catalog item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID itemId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    File data = new File("/path/to/file"); // File | 
    try {
      EmptyEnvelope result = apiInstance.updateProductPrimaryImageAsync(itemId, tenantId, apiVersion, xApiVersion, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#updateProductPrimaryImageAsync");
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
| **itemId** | **UUID**|  | |
| **tenantId** | **UUID**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **data** | **File**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data, application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="updateStockItem"></a>
# **updateStockItem**
> updateStockItem(tenantId, itemId, apiVersion, xApiVersion, catalogItemUpdateDto)

Update a stock item

Updates an existing stock item for the specified tenant and item ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID itemId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    CatalogItemUpdateDto catalogItemUpdateDto = new CatalogItemUpdateDto(); // CatalogItemUpdateDto | 
    try {
      apiInstance.updateStockItem(tenantId, itemId, apiVersion, xApiVersion, catalogItemUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#updateStockItem");
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
| **itemId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **catalogItemUpdateDto** | [**CatalogItemUpdateDto**](CatalogItemUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

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

