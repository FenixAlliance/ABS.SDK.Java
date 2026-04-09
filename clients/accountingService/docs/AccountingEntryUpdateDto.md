

# AccountingEntryUpdateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tenantId** | **String** |  |  [optional] |
|**enrollmentId** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**amount** | **Double** |  |  [optional] |
|**date** | **OffsetDateTime** |  |  [optional] |
|**currencyId** | **String** |  |  [optional] |
|**debitAccountId** | **String** |  |  [optional] |
|**creditAccountId** | **String** |  |  [optional] |
|**journalEntryId** | **String** |  |  [optional] |
|**accountingEntryType** | [**AccountingEntryTypeEnum**](#AccountingEntryTypeEnum) |  |  [optional] |



## Enum: AccountingEntryTypeEnum

| Name | Value |
|---- | -----|
| NONE | &quot;None&quot; |
| DEBIT | &quot;Debit&quot; |
| CREDIT | &quot;Credit&quot; |



