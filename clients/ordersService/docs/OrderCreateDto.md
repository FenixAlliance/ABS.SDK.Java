

# OrderCreateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**closed** | **Boolean** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**priceListId** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**individualId** | **String** |  |  [optional] |
|**paymentTermId** | **String** |  |  [optional] |
|**organizationId** | **String** |  |  [optional] |
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
|**totalShippingCost** | **Double** |  |  [optional] |
|**totalShippingCostCurrencyId** | **String** |  |  [optional] |
|**totalShippingTax** | **Double** |  |  [optional] |
|**totalShippingTaxCurrencyId** | **String** |  |  [optional] |
|**totalWithheldTax** | **Double** |  |  [optional] |
|**totalWithheldTaxCurrencyId** | **String** |  |  [optional] |
|**totalTaxBase** | **Double** |  |  [optional] |
|**totalTaxBaseCurrencyId** | **String** |  |  [optional] |
|**totalTaxes** | **Double** |  |  [optional] |
|**totalTaxesCurrencyId** | **String** |  |  [optional] |
|**totalGlobalSurcharges** | **Double** |  |  [optional] |
|**totalGlobalSurchargesCurrencyId** | **String** |  |  [optional] |
|**totalGlobalDiscounts** | **Double** |  |  [optional] |
|**totalGlobalDiscountsCurrencyId** | **String** |  |  [optional] |
|**total** | **Double** |  |  [optional] |
|**totalCurrencyId** | **String** |  |  [optional] |
|**costCalculationMethod** | [**CostCalculationMethodEnum**](#CostCalculationMethodEnum) |  |  [optional] |
|**taxCalculationMethod** | [**TaxCalculationMethodEnum**](#TaxCalculationMethodEnum) |  |  [optional] |
|**cartId** | **String** |  |  [optional] |
|**quoteId** | **String** |  |  [optional] |
|**walletId** | **String** |  |  [optional] |
|**parentOrderId** | **String** |  |  [optional] |
|**shippingMethodId** | **String** |  |  [optional] |
|**billingLocationId** | **String** |  |  [optional] |
|**customerNotes** | **String** |  |  [optional] |
|**orderStatus** | [**OrderStatusEnum**](#OrderStatusEnum) |  |  [optional] |
|**quoteStatus** | [**QuoteStatusEnum**](#QuoteStatusEnum) |  |  [optional] |
|**freightTerms** | [**FreightTermsEnum**](#FreightTermsEnum) |  |  [optional] |
|**receiverTenantId** | **String** |  |  [optional] |
|**shippingLocationId** | **String** |  |  [optional] |
|**qualifiedIdentifier** | **String** |  |  [optional] |
|**totalTaxesInUsd** | **Double** |  |  [optional] |
|**totalDiscountsInUsd** | **Double** |  |  [optional] |
|**totalSurchargesInUsd** | **Double** |  |  [optional] |
|**totalShippingCostInUsd** | **Double** |  |  [optional] |
|**totalShippingTaxInUsd** | **Double** |  |  [optional] |
|**totalAmountInUsd** | **Double** |  |  [optional] |
|**effectiveTo** | **OffsetDateTime** |  |  [optional] |
|**effectiveFrom** | **OffsetDateTime** |  |  [optional] |
|**orderLines** | [**List&lt;OrderLineCreateDto&gt;**](OrderLineCreateDto.md) |  |  [optional] |



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



## Enum: OrderStatusEnum

| Name | Value |
|---- | -----|
| NEW | &quot;New&quot; |
| PROCESSING | &quot;Processing&quot; |
| ACCEPTED | &quot;Accepted&quot; |
| DECLINED | &quot;Declined&quot; |
| SHIPPED | &quot;Shipped&quot; |
| DELIVERED | &quot;Delivered&quot; |
| ON_HOLD | &quot;OnHold&quot; |
| FAILED | &quot;Failed&quot; |
| FULFILLED | &quot;Fulfilled&quot; |
| CANCELLED | &quot;Cancelled&quot; |



## Enum: QuoteStatusEnum

| Name | Value |
|---- | -----|
| DRAFT | &quot;Draft&quot; |
| NEW | &quot;New&quot; |
| ACCEPTED | &quot;Accepted&quot; |
| DECLINED | &quot;Declined&quot; |
| EXPIRED | &quot;Expired&quot; |



## Enum: FreightTermsEnum

| Name | Value |
|---- | -----|
| FOB | &quot;FOB&quot; |
| NO_CHARGE | &quot;NoCharge&quot; |



