

# OrderCreateDto


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
|**totalAmountInUsd** | **Double** |  |  [optional] |
|**effectiveTo** | **OffsetDateTime** |  |  [optional] |
|**effectiveFrom** | **OffsetDateTime** |  |  [optional] |



## Enum: OrderStatusEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |
| NUMBER_6 | 6 |
| NUMBER_7 | 7 |
| NUMBER_8 | 8 |
| NUMBER_9 | 9 |
| NUMBER_10 | 10 |



## Enum: QuoteStatusEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |



## Enum: FreightTermsEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



