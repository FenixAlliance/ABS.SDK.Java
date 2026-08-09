

# PostingBookResultDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**financialBookId** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**journalEntryId** | **String** |  |  [optional] |
|**failureCode** | **String** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| POSTED | &quot;Posted&quot; |
| DUPLICATE | &quot;Duplicate&quot; |
| REJECTED | &quot;Rejected&quot; |



