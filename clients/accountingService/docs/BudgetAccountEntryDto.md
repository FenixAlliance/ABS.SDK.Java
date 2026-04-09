

# BudgetAccountEntryDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**debit** | **Double** |  |  [optional] |
|**credit** | **Double** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**forexRate** | **Double** |  |  [optional] |
|**accountId** | **String** |  |  [optional] |
|**tenantId** | **String** |  |  [optional] |
|**date** | **OffsetDateTime** |  |  [optional] |
|**enrollmentId** | **String** |  |  [optional] |
|**currencyId** | **String** |  |  [optional] |
|**debitAccountId** | **String** |  |  [optional] |
|**creditAccountId** | **String** |  |  [optional] |
|**journalEntryId** | **String** |  |  [optional] |
|**debitAccountName** | **String** |  |  [optional] |
|**creditAccountName** | **String** |  |  [optional] |
|**accountingEntryType** | [**AccountingEntryTypeEnum**](#AccountingEntryTypeEnum) |  |  [optional] |
|**debitAmount** | [**Money**](Money.md) |  |  [optional] |
|**creditAmount** | [**Money**](Money.md) |  |  [optional] |
|**budgetId** | **String** |  |  [optional] |



## Enum: AccountingEntryTypeEnum

| Name | Value |
|---- | -----|
| NONE | &quot;None&quot; |
| DEBIT | &quot;Debit&quot; |
| CREDIT | &quot;Credit&quot; |



