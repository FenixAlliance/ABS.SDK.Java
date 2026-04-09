

# ProjectTimeLogUpdateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**logDate** | **OffsetDateTime** |  |  [optional] |
|**timeSpan** | **String** |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**projectTaskID** | **String** |  |  [optional] |
|**projectPeriodID** | **String** |  |  [optional] |
|**projectTimeLogRecordType** | [**ProjectTimeLogRecordTypeEnum**](#ProjectTimeLogRecordTypeEnum) |  |  [optional] |



## Enum: ProjectTimeLogRecordTypeEnum

| Name | Value |
|---- | -----|
| REGULAR_HOURS | &quot;RegularHours&quot; |
| OVERTIME_TO_PAY | &quot;OvertimeToPay&quot; |
| OVERTIME_TO_COMPENSATE | &quot;OvertimeToCompensate&quot; |



