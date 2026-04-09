

# InvoiceCreateDto


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
|**paid** | **Boolean** |  |  [optional] |
|**number** | **Integer** |  |  [optional] |
|**notes** | **String** |  |  [optional] |
|**orderId** | **String** |  |  [optional] |
|**enumeration** | **String** |  |  [optional] |
|**paymentModeId** | **String** |  |  [optional] |
|**enumerationRangeId** | **String** |  |  [optional] |
|**emisorBillingProfileId** | **String** |  |  [optional] |
|**receiverBillingProfileId** | **String** |  |  [optional] |
|**emisorWalletAccountId** | **String** |  |  [optional] |
|**receiverWalletAccountId** | **String** |  |  [optional] |
|**customerNotes** | **String** |  |  [optional] |
|**invoiceType** | [**InvoiceTypeEnum**](#InvoiceTypeEnum) |  |  [optional] |
|**documentType** | [**DocumentTypeEnum**](#DocumentTypeEnum) |  |  [optional] |
|**invoiceStatus** | [**InvoiceStatusEnum**](#InvoiceStatusEnum) |  |  [optional] |
|**paymentDue** | **OffsetDateTime** |  |  [optional] |
|**validFrom** | **OffsetDateTime** |  |  [optional] |
|**validTo** | **OffsetDateTime** |  |  [optional] |
|**invoiceLines** | [**List&lt;InvoiceLineCreateDto&gt;**](InvoiceLineCreateDto.md) |  |  [optional] |
|**invoiceReferences** | [**List&lt;InvoiceReferenceCreateDto&gt;**](InvoiceReferenceCreateDto.md) |  |  [optional] |
|**invoiceAdjustments** | [**List&lt;InvoiceAdjustmentCreateDto&gt;**](InvoiceAdjustmentCreateDto.md) |  |  [optional] |



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



## Enum: InvoiceTypeEnum

| Name | Value |
|---- | -----|
| PURCHASE_INVOICE | &quot;PurchaseInvoice&quot; |
| SALES_INVOICE | &quot;SalesInvoice&quot; |
| CREDIT_NOTE | &quot;CreditNote&quot; |
| DEBIT_NOTE | &quot;DebitNote&quot; |



## Enum: DocumentTypeEnum

| Name | Value |
|---- | -----|
| STANDARD | &quot;Standard&quot; |
| DEBIT_NOTE | &quot;DebitNote&quot; |
| CREDIT_NOTE | &quot;CreditNote&quot; |



## Enum: InvoiceStatusEnum

| Name | Value |
|---- | -----|
| DRAFT | &quot;Draft&quot; |
| CLOSED | &quot;Closed&quot; |
| SIGNED | &quot;Signed&quot; |
| EXPIRED | &quot;Expired&quot; |
| PAID | &quot;Paid&quot; |



