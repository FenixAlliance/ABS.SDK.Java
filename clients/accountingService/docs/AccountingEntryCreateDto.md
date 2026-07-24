

# AccountingEntryCreateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**journalEntryId** | **String** |  |  |
|**accountId** | **String** |  |  |
|**direction** | [**DirectionEnum**](#DirectionEnum) |  |  |
|**transactionAmount** | **Double** |  |  [optional] |
|**transactionCurrencyId** | **String** |  |  |
|**description** | **String** |  |  |



## Enum: DirectionEnum

| Name | Value |
|---- | -----|
| DEBIT | &quot;Debit&quot; |
| CREDIT | &quot;Credit&quot; |



