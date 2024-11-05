

# InvoiceCreateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] [readonly] |
|**timestamp** | **OffsetDateTime** |  |  [optional] [readonly] |
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
|**currencyId** | **String** |  |  [optional] |
|**forexRate** | **Double** |  |  [optional] |
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
|**paid** | **Boolean** |  |  [optional] |
|**number** | **Integer** |  |  [optional] |
|**notes** | **String** |  |  [optional] |
|**customerNotes** | **String** |  |  [optional] |
|**orderId** | **String** |  |  [optional] |
|**enumeration** | **String** |  |  [optional] |
|**paymentModeId** | **String** |  |  [optional] |
|**receiverTenantId** | **String** |  |  [optional] |
|**enumerationRangeId** | **String** |  |  [optional] |
|**emisorBillingProfileId** | **String** |  |  [optional] |
|**receiverBillingProfileId** | **String** |  |  [optional] |
|**emisorWalletAccountId** | **String** |  |  [optional] |
|**receiverWalletAccountId** | **String** |  |  [optional] |
|**paymentDue** | **OffsetDateTime** |  |  [optional] |
|**invoiceType** | [**InvoiceTypeEnum**](#InvoiceTypeEnum) |  |  [optional] |
|**documentType** | [**DocumentTypeEnum**](#DocumentTypeEnum) |  |  [optional] |
|**invoiceStatus** | [**InvoiceStatusEnum**](#InvoiceStatusEnum) |  |  [optional] |
|**validFrom** | **OffsetDateTime** |  |  [optional] |
|**validTo** | **OffsetDateTime** |  |  [optional] |
|**invoiceReferences** | [**List&lt;InvoiceReferenceDto&gt;**](InvoiceReferenceDto.md) |  |  [optional] |
|**invoiceItemRecords** | [**List&lt;InvoiceItemRecordDto&gt;**](InvoiceItemRecordDto.md) |  |  [optional] |
|**invoiceAdjustments** | [**List&lt;InvoiceAdjustmentDto&gt;**](InvoiceAdjustmentDto.md) |  |  [optional] |



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



