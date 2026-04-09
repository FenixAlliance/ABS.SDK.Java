

# ProjectTimeLogCreateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**timeSpan** | **String** |  |  [optional] |
|**logDate** | **OffsetDateTime** |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**projectTaskID** | **String** |  |  |
|**projectPeriodID** | **String** |  |  |
|**projectTimeLogRecordType** | [**ProjectTimeLogRecordTypeEnum**](#ProjectTimeLogRecordTypeEnum) |  |  [optional] |
|**projectID** | **String** |  |  [optional] |



## Enum: ProjectTimeLogRecordTypeEnum

| Name | Value |
|---- | -----|
| REGULAR_HOURS | &quot;RegularHours&quot; |
| OVERTIME_TO_PAY | &quot;OvertimeToPay&quot; |
| OVERTIME_TO_COMPENSATE | &quot;OvertimeToCompensate&quot; |



