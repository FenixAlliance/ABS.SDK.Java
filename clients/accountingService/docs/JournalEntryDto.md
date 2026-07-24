

# JournalEntryDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**tenantId** | **String** |  |  [optional] |
|**enrollmentId** | **String** |  |  [optional] |
|**journalId** | **String** |  |  [optional] |
|**journalName** | **String** |  |  [optional] |
|**journalCode** | **String** |  |  [optional] |
|**fiscalPeriodId** | **String** |  |  [optional] |
|**financialBookId** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**entryType** | [**EntryTypeEnum**](#EntryTypeEnum) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**postingDate** | **OffsetDateTime** |  |  [optional] |
|**isOpeningBalance** | **Boolean** |  |  [optional] |
|**transactionCurrencyId** | **String** |  |  [optional] |
|**sourceDocumentType** | **String** |  |  [optional] |
|**sourceDocumentId** | **String** |  |  [optional] |
|**idempotencyKey** | **String** |  |  [optional] |
|**reversalOfJournalEntryId** | **String** |  |  [optional] |
|**postedBy** | **String** |  |  [optional] |
|**forexRate** | **Double** |  |  [optional] |
|**forexRatesSnapshot** | **String** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**debitInUsd** | **Double** |  |  [optional] |
|**creditInUsd** | **Double** |  |  [optional] |
|**accountingEntries** | [**List&lt;AccountingEntryDto&gt;**](AccountingEntryDto.md) |  |  [optional] |
|**totalDebit** | **Double** |  |  [optional] [readonly] |
|**totalCredit** | **Double** |  |  [optional] [readonly] |
|**totalDebitAmount** | [**Money**](Money.md) |  |  [optional] |
|**totalCreditAmount** | [**Money**](Money.md) |  |  [optional] |



## Enum: EntryTypeEnum

| Name | Value |
|---- | -----|
| SIMPLE | &quot;Simple&quot; |
| COMPOUND | &quot;Compound&quot; |
| ADJUSTING | &quot;Adjusting&quot; |
| REVERSING | &quot;Reversing&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DRAFT | &quot;Draft&quot; |
| POSTED | &quot;Posted&quot; |
| REVERSED | &quot;Reversed&quot; |
| VOIDED | &quot;Voided&quot; |



