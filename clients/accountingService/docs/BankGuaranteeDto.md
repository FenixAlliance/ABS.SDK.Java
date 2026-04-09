

# BankGuaranteeDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**margin** | **Double** |  |  [optional] |
|**charges** | **Double** |  |  [optional] |
|**beneficiaryName** | **String** |  |  [optional] |
|**guaranteeNumber** | **String** |  |  [optional] |
|**guaranteeConditions** | **String** |  |  [optional] |
|**fixedDepositNumber** | **Double** |  |  [optional] |
|**startDate** | **OffsetDateTime** |  |  [optional] |
|**endDate** | **OffsetDateTime** |  |  [optional] |
|**validityInDays** | **Integer** |  |  [optional] |
|**tenantId** | **String** |  |  [optional] |
|**bankGuaranteeType** | [**BankGuaranteeTypeEnum**](#BankGuaranteeTypeEnum) |  |  [optional] |
|**enrollmentId** | **String** |  |  [optional] |
|**contactId** | **String** |  |  [optional] |
|**projectId** | **String** |  |  [optional] |
|**orderId** | **String** |  |  [optional] |
|**bankProfileId** | **String** |  |  [optional] |
|**bankAccountId** | **String** |  |  [optional] |
|**currencyId** | **String** |  |  [optional] |



## Enum: BankGuaranteeTypeEnum

| Name | Value |
|---- | -----|
| RECEIVING | &quot;Receiving&quot; |
| PROVIDING | &quot;Providing&quot; |



