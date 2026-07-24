

# AccountingEntryDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**tenantId** | **String** |  |  [optional] |
|**enrollmentId** | **String** |  |  [optional] |
|**journalEntryId** | **String** |  |  [optional] |
|**accountId** | **String** |  |  [optional] |
|**accountName** | **String** |  |  [optional] |
|**direction** | [**DirectionEnum**](#DirectionEnum) |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**transactionAmount** | **Double** |  |  [optional] |
|**transactionCurrencyId** | **String** |  |  [optional] |
|**functionalAmount** | **Double** |  |  [optional] |
|**functionalCurrencyId** | **String** |  |  [optional] |
|**accountAmount** | **Double** |  |  [optional] |
|**accountCurrencyId** | **String** |  |  [optional] |
|**reportingAmountInUsd** | **Double** |  |  [optional] |
|**forexRate** | **Double** |  |  [optional] |
|**forexRatesSnapshot** | **String** |  |  [optional] |
|**costCentreId** | **String** |  |  [optional] |
|**projectId** | **String** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**debit** | **Double** |  |  [optional] [readonly] |
|**credit** | **Double** |  |  [optional] [readonly] |
|**amount** | [**Money**](Money.md) |  |  [optional] |
|**amountInUsd** | [**Money**](Money.md) |  |  [optional] |



## Enum: DirectionEnum

| Name | Value |
|---- | -----|
| DEBIT | &quot;Debit&quot; |
| CREDIT | &quot;Credit&quot; |



