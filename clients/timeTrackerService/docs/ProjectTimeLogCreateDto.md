

# ProjectTimeLogCreateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] [readonly] |
|**timestamp** | **OffsetDateTime** |  |  [optional] [readonly] |
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
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |



