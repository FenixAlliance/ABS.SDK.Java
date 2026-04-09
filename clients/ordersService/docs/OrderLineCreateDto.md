

# OrderLineCreateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**closed** | **Boolean** |  |  [optional] |
|**itemId** | **String** |  |  [optional] |
|**itemTitle** | **String** |  |  [optional] |
|**itemShortDescription** | **String** |  |  [optional] |
|**itemPrimaryImageUrl** | **String** |  |  [optional] |
|**shippingPolicyId** | **String** |  |  [optional] |
|**tenantId** | **String** |  |  [optional] |
|**enrollmentId** | **String** |  |  [optional] |
|**currencyId** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**quantity** | **Double** |  |  [optional] |
|**free** | **Boolean** |  |  [optional] |
|**freeReason** | **String** |  |  [optional] |
|**freeReasonCode** | **String** |  |  [optional] |
|**data** | **String** |  |  [optional] |
|**dataLabel** | **String** |  |  [optional] |
|**data1** | **String** |  |  [optional] |
|**data1Label** | **String** |  |  [optional] |
|**data2** | **String** |  |  [optional] |
|**data2Label** | **String** |  |  [optional] |
|**data3** | **String** |  |  [optional] |
|**data3Label** | **String** |  |  [optional] |
|**data4** | **String** |  |  [optional] |
|**data4Label** | **String** |  |  [optional] |
|**data5** | **String** |  |  [optional] |
|**data5Label** | **String** |  |  [optional] |
|**data6** | **String** |  |  [optional] |
|**data6Label** | **String** |  |  [optional] |
|**data7** | **String** |  |  [optional] |
|**data7Label** | **String** |  |  [optional] |
|**data8** | **String** |  |  [optional] |
|**data8Label** | **String** |  |  [optional] |
|**data9** | **String** |  |  [optional] |
|**data9Label** | **String** |  |  [optional] |
|**itemPriceId** | **String** |  |  [optional] |
|**priceListItemId** | **String** |  |  [optional] |
|**unitId** | **String** |  |  [optional] |
|**unitGroupId** | **String** |  |  [optional] |
|**taxCalculationMethod** | [**TaxCalculationMethodEnum**](#TaxCalculationMethodEnum) |  |  [optional] |
|**costCalculationMethod** | [**CostCalculationMethodEnum**](#CostCalculationMethodEnum) |  |  [optional] |
|**forexRatesSnapshot** | **String** |  |  [optional] |
|**forexRate** | **Double** |  |  [optional] |
|**totalBaseAmountInUsd** | **Double** |  |  [optional] |
|**totalProfitInUsd** | **Double** |  |  [optional] |
|**totalDetailAmountInUsd** | **Double** |  |  [optional] |
|**totalTaxBaseInUsd** | **Double** |  |  [optional] |
|**totalDiscountsInUsd** | **Double** |  |  [optional] |
|**totalTaxesInUsd** | **Double** |  |  [optional] |
|**totalWithheldTaxesInUsd** | **Double** |  |  [optional] |
|**totalShippingCostInUsd** | **Double** |  |  [optional] |
|**totalShippingTaxesInUsd** | **Double** |  |  [optional] |
|**totalWarrantyCostInUsd** | **Double** |  |  [optional] |
|**totalReturnCostInUsd** | **Double** |  |  [optional] |
|**totalRefundCostInUsd** | **Double** |  |  [optional] |
|**totalSurchargesInUsd** | **Double** |  |  [optional] |
|**totalAmountInUsd** | **Double** |  |  [optional] |
|**totalGlobalDiscountsInUsd** | **Double** |  |  [optional] |
|**totalGlobalSurchargesInUsd** | **Double** |  |  [optional] |
|**customGlobalSurchargesAmount** | **Double** |  |  [optional] |
|**customGlobalSurchargesAmountCurrencyId** | **String** |  |  [optional] |
|**customGlobalDiscountsAmount** | **Double** |  |  [optional] |
|**customGlobalDiscountsAmountCurrencyId** | **String** |  |  [optional] |
|**totalDetail** | **Double** |  |  [optional] |
|**totalDetailCurrencyId** | **String** |  |  [optional] |
|**totalDiscounts** | **Double** |  |  [optional] |
|**totalDiscountsCurrencyId** | **String** |  |  [optional] |
|**totalTaxBase** | **Double** |  |  [optional] |
|**totalTaxBaseCurrencyId** | **String** |  |  [optional] |
|**totalSurcharges** | **Double** |  |  [optional] |
|**totalSurchargesCurrencyId** | **String** |  |  [optional] |
|**totalProfit** | **Double** |  |  [optional] |
|**totalProfitCurrencyId** | **String** |  |  [optional] |
|**totalShippingCost** | **Double** |  |  [optional] |
|**totalShippingCostCurrencyId** | **String** |  |  [optional] |
|**totalShippingTax** | **Double** |  |  [optional] |
|**totalShippingTaxCurrencyId** | **String** |  |  [optional] |
|**totalTaxes** | **Double** |  |  [optional] |
|**totalTaxesCurrencyId** | **String** |  |  [optional] |
|**totalWithheldTax** | **Double** |  |  [optional] |
|**totalWithheldTaxCurrencyId** | **String** |  |  [optional] |
|**totalGlobalDiscounts** | **Double** |  |  [optional] |
|**totalGlobalDiscountsCurrencyId** | **String** |  |  [optional] |
|**totalGlobalSurcharges** | **Double** |  |  [optional] |
|**totalGlobalSurchargesCurrencyId** | **String** |  |  [optional] |
|**total** | **Double** |  |  [optional] |
|**totalCurrencyId** | **String** |  |  [optional] |
|**returnPolicyId** | **String** |  |  [optional] |
|**refundPolicyId** | **String** |  |  [optional] |
|**warrantyPolicyId** | **String** |  |  [optional] |
|**shipmentPolicyId** | **String** |  |  [optional] |
|**shippingLocationId** | **String** |  |  [optional] |
|**locationId** | **String** |  |  [optional] |
|**quoteItemRecordId** | **String** |  |  [optional] |
|**businessProfileRecordId** | **String** |  |  [optional] |
|**parentBillingItemRecordId** | **String** |  |  [optional] |
|**orderId** | **String** |  |  [optional] |



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



