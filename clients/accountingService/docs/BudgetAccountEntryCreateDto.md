

# BudgetAccountEntryCreateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**description** | **String** |  |  |
|**date** | **OffsetDateTime** |  |  [optional] |
|**amount** | **Double** |  |  [optional] |
|**currencyId** | **String** |  |  |
|**debitAccountId** | **String** |  |  [optional] |
|**creditAccountId** | **String** |  |  [optional] |
|**journalEntryId** | **String** |  |  [optional] |
|**accountingEntryType** | [**AccountingEntryTypeEnum**](#AccountingEntryTypeEnum) |  |  [optional] |
|**budgetId** | **String** |  |  [optional] |



## Enum: AccountingEntryTypeEnum

| Name | Value |
|---- | -----|
| NONE | &quot;None&quot; |
| DEBIT | &quot;Debit&quot; |
| CREDIT | &quot;Credit&quot; |



