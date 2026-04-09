

# InvoiceDto


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
|**paid** | **Boolean** |  |  [optional] |
|**number** | **Long** |  |  [optional] |
|**notes** | **String** |  |  [optional] |
|**orderId** | **String** |  |  [optional] |
|**enumeration** | **String** |  |  [optional] |
|**paymentModeId** | **String** |  |  [optional] |
|**enumerationRangeId** | **String** |  |  [optional] |
|**emisorBillingProfileId** | **String** |  |  [optional] |
|**receiverBillingProfileId** | **String** |  |  [optional] |
|**emisorWalletAccountId** | **String** |  |  [optional] |
|**receiverWalletAccountId** | **String** |  |  [optional] |
|**paymentDue** | **OffsetDateTime** |  |  [optional] |
|**invoiceType** | [**InvoiceTypeEnum**](#InvoiceTypeEnum) |  |  [optional] |
|**documentType** | [**DocumentTypeEnum**](#DocumentTypeEnum) |  |  [optional] |
|**invoiceStatus** | [**InvoiceStatusEnum**](#InvoiceStatusEnum) |  |  [optional] |



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



