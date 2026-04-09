

# ProjectTimeLogDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**projectId** | **String** |  |  [optional] |
|**projectTaskId** | **String** |  |  [optional] |
|**taskCategoryId** | **String** |  |  [optional] |
|**projectPeriodId** | **String** |  |  [optional] |
|**responsibleContactId** | **String** |  |  [optional] |
|**creatorContactId** | **String** |  |  [optional] |
|**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) |  |  [optional] |
|**timeSpan** | **String** |  |  [optional] |
|**logDate** | **OffsetDateTime** |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**type** | **String** |  |  [optional] |



## Enum: RecordTypeEnum

| Name | Value |
|---- | -----|
| REGULAR_HOURS | &quot;RegularHours&quot; |
| OVERTIME_TO_PAY | &quot;OvertimeToPay&quot; |
| OVERTIME_TO_COMPENSATE | &quot;OvertimeToCompensate&quot; |



