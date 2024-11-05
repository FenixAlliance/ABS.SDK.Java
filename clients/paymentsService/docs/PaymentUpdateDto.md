

# PaymentUpdateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**invoiceId** | **String** |  |  [optional] |
|**tenantId** | **String** |  |  [optional] |
|**emisorWalletId** | **String** |  |  [optional] |
|**receiverWalletId** | **String** |  |  [optional] |
|**currencyId** | **String** |  |  [optional] |
|**forexRate** | **Double** |  |  [optional] |
|**totalCost** | **Double** |  |  [optional] |
|**totalTaxes** | **Double** |  |  [optional] |
|**closed** | **Boolean** |  |  [optional] |
|**data** | **String** |  |  [optional] |
|**dataLabel** | **String** |  |  [optional] |
|**data1** | **String** |  |  [optional] |
|**data1Label** | **String** |  |  [optional] |
|**response** | **String** |  |  [optional] |
|**authorization** | **String** |  |  [optional] |
|**referenceCode** | **String** |  |  [optional] |
|**correlationCode** | **String** |  |  [optional] |
|**lastUpdated** | **OffsetDateTime** |  |  [optional] |
|**onBehalfOf** | [**OnBehalfOfEnum**](#OnBehalfOfEnum) |  |  [optional] |
|**paymentType** | [**PaymentTypeEnum**](#PaymentTypeEnum) |  |  [optional] |
|**paymentStatus** | [**PaymentStatusEnum**](#PaymentStatusEnum) |  |  [optional] |
|**baseCost** | **Double** |  |  [optional] |
|**signature** | **String** |  |  [optional] |
|**signatureMismatch** | **Boolean** |  |  [optional] |
|**isExternal** | **Boolean** |  |  [optional] |
|**markedForRevision** | **Boolean** |  |  [optional] |
|**forexRatesSnapshot** | **String** |  |  [optional] |
|**officialId** | **String** |  |  [optional] |
|**officialIdExpeditionDate** | **OffsetDateTime** |  |  [optional] |
|**fiscalIdentificationTypeId** | **String** |  |  [optional] |
|**billingAddress** | **String** |  |  [optional] |
|**phone** | **String** |  |  [optional] |
|**cellphone** | **String** |  |  [optional] |
|**department** | **String** |  |  [optional] |
|**city** | **String** |  |  [optional] |
|**countryId** | **String** |  |  [optional] |
|**locationId** | **String** |  |  [optional] |
|**entitlementId** | **String** |  |  [optional] |
|**antiFraudScore** | **Double** |  |  [optional] |
|**callRecordURL** | **String** |  |  [optional] |
|**called** | **Boolean** |  |  [optional] |
|**verified** | **Boolean** |  |  [optional] |
|**payerPictureTimestamp** | **String** |  |  [optional] |
|**payerPicture** | **String** |  |  [optional] |
|**identificationPictureTimestamp** | **String** |  |  [optional] |
|**identificationPicture** | **String** |  |  [optional] |
|**identificationBackPicture** | **String** |  |  [optional] |
|**identificationBackPictureTimestamp** | **String** |  |  [optional] |
|**ipLookupId** | **String** |  |  [optional] |
|**orderId** | **String** |  |  [optional] |
|**accountingEntryId** | **String** |  |  [optional] |
|**paymentGatewayId** | **String** |  |  [optional] |
|**bankAccountId** | **String** |  |  [optional] |
|**enrolmentId** | **String** |  |  [optional] |
|**bankId** | **String** |  |  [optional] |
|**paymentTokenId** | **String** |  |  [optional] |
|**emisorWalletAccountId** | **String** |  |  [optional] |
|**receiverWalletAccountId** | **String** |  |  [optional] |



## Enum: OnBehalfOfEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |



## Enum: PaymentTypeEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |



## Enum: PaymentStatusEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
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
| NUMBER_11 | 11 |



