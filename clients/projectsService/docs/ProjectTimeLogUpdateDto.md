

# ProjectTimeLogUpdateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**logDate** | **OffsetDateTime** |  |  [optional] |
|**timeSpan** | **String** |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**projectTaskId** | **String** |  |  [optional] |
|**projectPeriodId** | **String** |  |  [optional] |
|**projectTimeLogRecordType** | [**ProjectTimeLogRecordTypeEnum**](#ProjectTimeLogRecordTypeEnum) |  |  [optional] |



## Enum: ProjectTimeLogRecordTypeEnum

| Name | Value |
|---- | -----|
| REGULAR_HOURS | &quot;RegularHours&quot; |
| OVERTIME_TO_PAY | &quot;OvertimeToPay&quot; |
| OVERTIME_TO_COMPENSATE | &quot;OvertimeToCompensate&quot; |



