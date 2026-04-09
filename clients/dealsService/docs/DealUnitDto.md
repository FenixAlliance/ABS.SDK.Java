

# DealUnitDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**closed** | **Boolean** |  |  [optional] |
|**type** | **String** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**userId** | **String** |  |  [optional] |
|**tenantId** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**priceListId** | **String** |  |  [optional] |
|**enrollmentId** | **String** |  |  [optional] |
|**individualId** | **String** |  |  [optional] |
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
|**customerNotes** | **String** |  |  [optional] |
|**taxCalculationMethod** | [**TaxCalculationMethodEnum**](#TaxCalculationMethodEnum) |  |  [optional] |
|**costCalculationMethod** | [**CostCalculationMethodEnum**](#CostCalculationMethodEnum) |  |  [optional] |
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
|**totalTaxBase** | **Double** |  |  [optional] |
|**totalTaxBaseCurrencyId** | **String** |  |  [optional] |
|**totalTaxes** | **Double** |  |  [optional] |
|**totalTaxesCurrencyId** | **String** |  |  [optional] |
|**totalShippingCost** | **Double** |  |  [optional] |
|**totalShippingCostCurrencyId** | **String** |  |  [optional] |
|**totalShippingTax** | **Double** |  |  [optional] |
|**totalShippingTaxCurrencyId** | **String** |  |  [optional] |
|**totalWithheldTax** | **Double** |  |  [optional] |
|**totalWithheldTaxCurrencyId** | **String** |  |  [optional] |
|**totalGlobalDiscounts** | **Double** |  |  [optional] |
|**totalGlobalDiscountsCurrencyId** | **String** |  |  [optional] |
|**totalGlobalSurcharges** | **Double** |  |  [optional] |
|**totalGlobalSurchargesCurrencyId** | **String** |  |  [optional] |
|**total** | **Double** |  |  [optional] |
|**totalCurrencyId** | **String** |  |  [optional] |
|**totalDetailInUsd** | **Double** |  |  [optional] |
|**totalProfitInUsd** | **Double** |  |  [optional] |
|**totalDiscountsInUsd** | **Double** |  |  [optional] |
|**totalSurchargesInUsd** | **Double** |  |  [optional] |
|**totalTaxBaseInUsd** | **Double** |  |  [optional] |
|**totalTaxesInUsd** | **Double** |  |  [optional] |
|**totalWithheldTaxesInUsd** | **Double** |  |  [optional] |
|**totalShippingCostInUsd** | **Double** |  |  [optional] |
|**totalShippingTaxesInUsd** | **Double** |  |  [optional] |
|**totalGlobalDiscountsInUsd** | **Double** |  |  [optional] |
|**totalGlobalSurchargesInUsd** | **Double** |  |  [optional] |
|**totalInUsd** | **Double** |  |  [optional] |
|**ordered** | **Boolean** |  |  [optional] |
|**dealUnitFeedId** | **String** |  |  [optional] |
|**dealUnitFlowId** | **String** |  |  [optional] |
|**dealUnitFlowStageId** | **String** |  |  [optional] |
|**billingLocationId** | **String** |  |  [optional] |
|**shippingLocationId** | **String** |  |  [optional] |
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
|**linesCount** | **Integer** |  |  [optional] |
|**customTotalAmount** | **Double** |  |  [optional] |
|**customDetailAmount** | **Double** |  |  [optional] |
|**customProfitAmount** | **Double** |  |  [optional] |
|**customShippingCostAmount** | **Double** |  |  [optional] |
|**customWithholdingTaxAmount** | **Double** |  |  [optional] |
|**customSurchargesAmount** | **Double** |  |  [optional] |
|**customDiscountsAmount** | **Double** |  |  [optional] |
|**customShippingTaxAmount** | **Double** |  |  [optional] |



## Enum: TaxCalculationMethodEnum

| Name | Value |
|---- | -----|
| INCLUDED | &quot;Included&quot; |
| EXCLUDED | &quot;Excluded&quot; |



## Enum: CostCalculationMethodEnum

| Name | Value |
|---- | -----|
| AUTOMATIC | &quot;Automatic&quot; |
| CUSTOM | &quot;Custom&quot; |



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



