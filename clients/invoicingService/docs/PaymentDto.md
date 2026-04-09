

# PaymentDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**test** | **Boolean** |  |  [optional] |
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
|**enrollmentId** | **String** |  |  [optional] |
|**bankId** | **String** |  |  [optional] |
|**paymentTokenId** | **String** |  |  [optional] |



## Enum: OnBehalfOfEnum

| Name | Value |
|---- | -----|
| SELF | &quot;Self&quot; |
| TENANT | &quot;Tenant&quot; |
| INDIVIDUAL | &quot;Individual&quot; |
| ORGANIZATION | &quot;Organization&quot; |



## Enum: PaymentTypeEnum

| Name | Value |
|---- | -----|
| PAID | &quot;Paid&quot; |
| RECEIVED | &quot;Received&quot; |
| INTERNAL | &quot;Internal&quot; |



## Enum: PaymentStatusEnum

| Name | Value |
|---- | -----|
| UNSET | &quot;Unset&quot; |
| ACCEPTED | &quot;Accepted&quot; |
| REJECTED | &quot;Rejected&quot; |
| ON_HOLD | &quot;OnHold&quot; |
| FAILED | &quot;Failed&quot; |
| REVERSED | &quot;Reversed&quot; |
| RETAINED | &quot;Retained&quot; |
| INITIALIZED | &quot;Initialized&quot; |
| EXPIRED | &quot;Expired&quot; |
| ABANDONED | &quot;Abandoned&quot; |
| CANCELLED | &quot;Cancelled&quot; |
| ACCEPTED_RETAINED | &quot;AcceptedRetained&quot; |



