

# DealUnitUpdateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**closed** | **Boolean** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**userId** | **String** |  |  [optional] |
|**tenantId** | **String** |  |  [optional] |
|**priceListId** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**enrollmentId** | **String** |  |  [optional] |
|**individualId** | **String** |  |  [optional] |
|**paymentTermId** | **String** |  |  [optional] |
|**organizationId** | **String** |  |  [optional] |
|**receiverTenantId** | **String** |  |  [optional] |
|**firstName** | **String** |  |  [optional] |
|**lastName** | **String** |  |  [optional] |
|**companyName** | **String** |  |  [optional] |
|**billingEmail** | **String** |  |  [optional] |
|**addressLine1** | **String** |  |  [optional] |
|**addressLine2** | **String** |  |  [optional] |
|**postalCode** | **String** |  |  [optional] |
|**countryId** | **String** |  |  [optional] |
|**stateId** | **String** |  |  [optional] |
|**cityId** | **String** |  |  [optional] |
|**billingLocationId** | **String** |  |  [optional] |
|**shippingLocationId** | **String** |  |  [optional] |
|**shippingMethodId** | **String** |  |  [optional] |
|**forexRate** | **Double** |  |  [optional] |
|**currencyId** | **String** |  |  [optional] |
|**totalDetail** | **Double** |  |  [optional] |
|**totalDetailCurrencyId** | **String** |  |  [optional] |
|**totalProfit** | **Double** |  |  [optional] |
|**totalProfitCurrencyId** | **String** |  |  [optional] |
|**totalDiscounts** | **Double** |  |  [optional] |
|**totalDiscountsCurrencyId** | **String** |  |  [optional] |
|**totalSurcharges** | **Double** |  |  [optional] |
|**totalSurchargesCurrencyId** | **String** |  |  [optional] |
|**totalShippingTax** | **Double** |  |  [optional] |
|**totalShippingTaxCurrencyId** | **String** |  |  [optional] |
|**totalShippingCost** | **Double** |  |  [optional] |
|**totalShippingCostCurrencyId** | **String** |  |  [optional] |
|**totalGlobalDiscounts** | **Double** |  |  [optional] |
|**totalGlobalDiscountsCurrencyId** | **String** |  |  [optional] |
|**totalGlobalSurcharges** | **Double** |  |  [optional] |
|**totalGlobalSurchargesCurrencyId** | **String** |  |  [optional] |
|**totalWithheldTax** | **Double** |  |  [optional] |
|**totalWithheldTaxCurrencyId** | **String** |  |  [optional] |
|**totalTaxBase** | **Double** |  |  [optional] |
|**totalTaxBaseCurrencyId** | **String** |  |  [optional] |
|**totalTaxes** | **Double** |  |  [optional] |
|**totalTaxesCurrencyId** | **String** |  |  [optional] |
|**total** | **Double** |  |  [optional] |
|**totalCurrencyId** | **String** |  |  [optional] |
|**costCalculationMethod** | [**CostCalculationMethodEnum**](#CostCalculationMethodEnum) |  |  [optional] |
|**taxCalculationMethod** | [**TaxCalculationMethodEnum**](#TaxCalculationMethodEnum) |  |  [optional] |
|**ordered** | **Boolean** |  |  [optional] |
|**cartId** | **String** |  |  [optional] |
|**dealUnitFeedId** | **String** |  |  [optional] |
|**dealUnitFlowId** | **String** |  |  [optional] |
|**dealUnitFlowStageId** | **String** |  |  [optional] |
|**partnerCreated** | **Boolean** |  |  [optional] |
|**partnerCollaboration** | **Boolean** |  |  [optional] |
|**proposedSolution** | **String** |  |  [optional] |
|**currentSituation** | **String** |  |  [optional] |
|**customerNeed** | **String** |  |  [optional] |
|**wonDate** | **OffsetDateTime** |  |  [optional] |
|**lostDate** | **OffsetDateTime** |  |  [optional] |
|**expiryDate** | **OffsetDateTime** |  |  [optional] |
|**deliveredDate** | **OffsetDateTime** |  |  [optional] |
|**closedTimestamp** | **OffsetDateTime** |  |  [optional] |
|**expectedCloseDate** | **OffsetDateTime** |  |  [optional] |
|**dealUnitStatus** | [**DealUnitStatusEnum**](#DealUnitStatusEnum) |  |  [optional] |
|**dealUnitPurchaseProcess** | [**DealUnitPurchaseProcessEnum**](#DealUnitPurchaseProcessEnum) |  |  [optional] |
|**dealUnitForecastCategory** | [**DealUnitForecastCategoryEnum**](#DealUnitForecastCategoryEnum) |  |  [optional] |
|**dealUnitAmountsCalculation** | [**DealUnitAmountsCalculationEnum**](#DealUnitAmountsCalculationEnum) |  |  [optional] |



## Enum: CostCalculationMethodEnum

| Name | Value |
|---- | -----|
| AUTOMATIC | &quot;Automatic&quot; |
| CUSTOM | &quot;Custom&quot; |



## Enum: TaxCalculationMethodEnum

| Name | Value |
|---- | -----|
| INCLUDED | &quot;Included&quot; |
| EXCLUDED | &quot;Excluded&quot; |



## Enum: DealUnitStatusEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;Open&quot; |
| WON | &quot;Won&quot; |
| LOST | &quot;Lost&quot; |
| FROZEN | &quot;Frozen&quot; |



## Enum: DealUnitPurchaseProcessEnum

| Name | Value |
|---- | -----|
| NONE | &quot;None&quot; |
| INDIVIDUAL | &quot;Individual&quot; |
| COMMITEE | &quot;Commitee&quot; |
| UNKNOWN | &quot;Unknown&quot; |



## Enum: DealUnitForecastCategoryEnum

| Name | Value |
|---- | -----|
| NONE | &quot;None&quot; |
| PIPELINE | &quot;Pipeline&quot; |
| BEST_CASE | &quot;BestCase&quot; |
| COMMITED | &quot;Commited&quot; |
| OMMITED | &quot;Ommited&quot; |
| WON | &quot;Won&quot; |
| LOST | &quot;Lost&quot; |



## Enum: DealUnitAmountsCalculationEnum

| Name | Value |
|---- | -----|
| USER_PROVIDED | &quot;UserProvided&quot; |
| SYSTEM_CALCULATED | &quot;SystemCalculated&quot; |



