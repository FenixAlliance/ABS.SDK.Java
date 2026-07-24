

# JournalEntryCreateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**journalId** | **String** |  |  |
|**fiscalPeriodId** | **String** |  |  |
|**transactionCurrencyId** | **String** |  |  |
|**description** | **String** |  |  |
|**sourceDocumentType** | **String** |  |  [optional] |
|**sourceDocumentId** | **String** |  |  [optional] |
|**idempotencyKey** | **String** |  |  [optional] |
|**isOpeningBalance** | **Boolean** |  |  [optional] |
|**accountingEntries** | [**List&lt;AccountingEntryCreateDto&gt;**](AccountingEntryCreateDto.md) |  |  [optional] |



