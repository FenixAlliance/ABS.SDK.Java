

# ServicesOptions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dripDownloadableContent** | **Boolean** |  |  [optional] |
|**retryFailedPayments** | **Boolean** |  |  [optional] |
|**allow0InitialCheckout** | **Boolean** |  |  [optional] |
|**allowMixedCheckout** | **Boolean** |  |  [optional] |
|**synchroniseRenewals** | **Boolean** |  |  [optional] |
|**addToCartButtonText** | **String** |  |  [optional] |
|**placeOrderButtonText** | **String** |  |  [optional] |
|**newSubscriberRole** | **String** |  |  [optional] |
|**inactiveSubscriberRole** | **String** |  |  [optional] |
|**enableAutomaticPayments** | **Integer** |  |  [optional] |
|**enableManualRenewals** | **Integer** |  |  [optional] |
|**displayAutoRenewalToggle** | **Integer** |  |  [optional] |
|**acceptEarlyRenewals** | **Integer** |  |  [optional] |
|**customerSuspensions** | **Integer** |  |  [optional] |
|**enableSubscriptionSwitchingBetweenGroups** | **Integer** |  |  [optional] |
|**enableSubscriptionSwitchingBetweenVariations** | **Integer** |  |  [optional] |
|**prorateFirstRenewal** | [**ProrateFirstRenewalEnum**](#ProrateFirstRenewalEnum) |  |  [optional] |



## Enum: ProrateFirstRenewalEnum

| Name | Value |
|---- | -----|
| ALWAYS_AND_NO_CHARGE | &quot;AlwaysAndNoCharge&quot; |
| NEVER_AND_NO_CHARGE | &quot;NeverAndNoCharge&quot; |
| NEVER_AND_FULL_CHARGE | &quot;NeverAndFullCharge&quot; |
| ALWAYS_AND_FULL_CHARGE | &quot;AlwaysAndFullCharge&quot; |
| FOR_VIRTUAL_PRODUCTS_ONLY | &quot;ForVirtualProductsOnly&quot; |
| FOR_SERVICE_PRODUCTS_ONLY | &quot;ForServiceProductsOnly&quot; |
| FOR_SUBSCRIPTION_PRODUCTS_ONLY | &quot;ForSubscriptionProductsOnly&quot; |



