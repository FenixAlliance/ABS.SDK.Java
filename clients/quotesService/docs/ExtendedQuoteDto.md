

# ExtendedQuoteDto


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
|**cartId** | **String** |  |  [optional] |
|**dealUnitId** | **String** |  |  [optional] |
|**effectiveTo** | **OffsetDateTime** |  |  [optional] |
|**effectiveFrom** | **OffsetDateTime** |  |  [optional] |
|**quoteStatus** | [**QuoteStatusEnum**](#QuoteStatusEnum) |  |  [optional] |
|**freightTerms** | [**FreightTermsEnum**](#FreightTermsEnum) |  |  [optional] |
|**customDiscountsAmount** | **Double** |  |  [optional] |
|**user** | [**UserDto**](UserDto.md) |  |  [optional] |
|**tenant** | [**TenantDto**](TenantDto.md) |  |  [optional] |
|**individual** | [**ContactDto**](ContactDto.md) |  |  [optional] |
|**organization** | [**ContactDto**](ContactDto.md) |  |  [optional] |
|**receiverTenant** | [**TenantDto**](TenantDto.md) |  |  [optional] |
|**enrollment** | [**TenantEnrollmentDto**](TenantEnrollmentDto.md) |  |  [optional] |



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



