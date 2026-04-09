

# IdentityAndPrivacyOptions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowGuestOrders** | **Boolean** |  |  [optional] |
|**allowGuestCartRecognition** | **Boolean** |  |  [optional] |
|**allowRemoveDownloadAccessOnRequest** | **Boolean** |  |  [optional] |
|**allowRemovePersonalDataFromOrdersOnRequest** | **Boolean** |  |  [optional] |
|**allowRemovePersonalDataFromSubscriptionsOnRequest** | **Boolean** |  |  [optional] |
|**storeCheckoutPrivacyPolicyNotice** | **String** |  |  [optional] |
|**storeRegistrationPrivacyPolicyNotice** | **String** |  |  [optional] |
|**defaultCustomerLocation** | [**DefaultCustomerLocationEnum**](#DefaultCustomerLocationEnum) |  |  [optional] |
|**inactiveCartsRetentionPolicy** | [**StoreDataRetentionPolicy**](StoreDataRetentionPolicy.md) |  |  [optional] |
|**pendingOrdersRetentionPolicy** | [**StoreDataRetentionPolicy**](StoreDataRetentionPolicy.md) |  |  [optional] |
|**failedOrdersRetentionPolicy** | [**StoreDataRetentionPolicy**](StoreDataRetentionPolicy.md) |  |  [optional] |
|**cancelledOrdersRetentionPolicy** | [**StoreDataRetentionPolicy**](StoreDataRetentionPolicy.md) |  |  [optional] |
|**completedOrdersRetentionPolicy** | [**StoreDataRetentionPolicy**](StoreDataRetentionPolicy.md) |  |  [optional] |



## Enum: DefaultCustomerLocationEnum

| Name | Value |
|---- | -----|
| NONE | &quot;None&quot; |
| GEOLOCATE | &quot;Geolocate&quot; |
| STORE_ADDRESS_BASED | &quot;StoreAddressBased&quot; |
| GEOLOCATE_WITH_CACHING | &quot;GeolocateWithCaching&quot; |



