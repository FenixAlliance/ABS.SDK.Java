

# ExtendedInvoiceDto


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
|**currencyId** | **String** |  |  [optional] |
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
|**forexRate** | **Double** |  |  [optional] |
|**total** | **Double** |  |  [optional] |
|**totalTaxes** | **Double** |  |  [optional] |
|**totalTaxBase** | **Double** |  |  [optional] |
|**totalDiscounts** | **Double** |  |  [optional] |
|**totalSurcharges** | **Double** |  |  [optional] |
|**totalGlobalDiscounts** | **Double** |  |  [optional] |
|**totalGlobalSurcharges** | **Double** |  |  [optional] |
|**totalTaxesInUsd** | **Double** |  |  [optional] |
|**totalAmountInUsd** | **Double** |  |  [optional] |
|**totalProfitInUsd** | **Double** |  |  [optional] |
|**totalTaxBaseInUsd** | **Double** |  |  [optional] |
|**totalDiscountsInUsd** | **Double** |  |  [optional] |
|**totalSurchargesInUsd** | **Double** |  |  [optional] |
|**totalDetailAmountInUsd** | **Double** |  |  [optional] |
|**totalGlobalDiscountsInUsd** | **Double** |  |  [optional] |
|**totalGlobalSurchargesInUsd** | **Double** |  |  [optional] |
|**totalWithholdingTaxesInUsd** | **Double** |  |  [optional] |
|**totalShippingCostInUsd** | **Double** |  |  [optional] |
|**totalShippingTaxesInUsd** | **Double** |  |  [optional] |
|**currency** | [**Currency**](Currency.md) |  |  [optional] |
|**totalInUsd** | [**Money**](Money.md) |  |  [optional] |
|**totalTaxAmountInUsd** | [**Money**](Money.md) |  |  [optional] |
|**totalTaxBaseAmountInUsd** | [**Money**](Money.md) |  |  [optional] |
|**totalDiscountsAmountInUsd** | [**Money**](Money.md) |  |  [optional] |
|**totalSurchargesAmountInUsd** | [**Money**](Money.md) |  |  [optional] |
|**totalGlobalDiscountsAmountInUsd** | [**Money**](Money.md) |  |  [optional] |
|**totalGlobalSurchargesAmountInUsd** | [**Money**](Money.md) |  |  [optional] |
|**totalAmount** | [**Money**](Money.md) |  |  [optional] |
|**totalTaxAmount** | [**Money**](Money.md) |  |  [optional] |
|**totalTaxBaseAmount** | [**Money**](Money.md) |  |  [optional] |
|**totalDiscountsAmount** | [**Money**](Money.md) |  |  [optional] |
|**totalSurchargesAmount** | [**Money**](Money.md) |  |  [optional] |
|**totalGlobalDiscountsAmount** | [**Money**](Money.md) |  |  [optional] |
|**totalGlobalSurchargesAmount** | [**Money**](Money.md) |  |  [optional] |
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
|**tenant** | [**TenantDto**](TenantDto.md) |  |  [optional] |
|**user** | [**SimpleUserDto**](SimpleUserDto.md) |  |  [optional] |
|**receiverTenant** | [**TenantDto**](TenantDto.md) |  |  [optional] |
|**individual** | [**SimpleContactDto**](SimpleContactDto.md) |  |  [optional] |
|**organization** | [**SimpleContactDto**](SimpleContactDto.md) |  |  [optional] |
|**enrollment** | [**SimpleTenantEnrolmentDto**](SimpleTenantEnrolmentDto.md) |  |  [optional] |



## Enum: InvoiceTypeEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



## Enum: DocumentTypeEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |



## Enum: InvoiceStatusEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |



