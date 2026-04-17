

# ReceiptCreateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**priceListId** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
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
|**paymentId** | **String** |  |  [optional] |
|**forexRate** | **Double** |  |  [optional] |
|**totalAmount** | **Double** |  |  [optional] |
|**totalAmountInUSD** | **Double** |  |  [optional] |
|**closed** | **Boolean** |  |  [optional] |
|**contactId** | **String** |  |  [optional] |
|**receiptType** | [**ReceiptTypeEnum**](#ReceiptTypeEnum) |  |  [optional] |
|**orderId** | **String** |  |  [optional] |
|**invoiceId** | **String** |  |  [optional] |



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



## Enum: ReceiptTypeEnum

| Name | Value |
|---- | -----|
| PAYMENT_RECEIPT | &quot;PaymentReceipt&quot; |
| PURCHASE_RECEIPT | &quot;PurchaseReceipt&quot; |



