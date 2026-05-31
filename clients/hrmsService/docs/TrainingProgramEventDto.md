

# TrainingProgramEventDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**start** | **OffsetDateTime** |  |  [optional] |
|**end** | **OffsetDateTime** |  |  [optional] |
|**isBreak** | **Boolean** |  |  [optional] |
|**occustOnMonday** | **Boolean** |  |  [optional] |
|**occustOnTuesday** | **Boolean** |  |  [optional] |
|**occustOnWednesday** | **Boolean** |  |  [optional] |
|**occustOnThursday** | **Boolean** |  |  [optional] |
|**occustOnFriday** | **Boolean** |  |  [optional] |
|**occustOnSaturday** | **Boolean** |  |  [optional] |
|**occustOnSunday** | **Boolean** |  |  [optional] |
|**repeatEvery** | **Integer** |  |  [optional] |
|**repetitionCriteria** | [**RepetitionCriteriaEnum**](#RepetitionCriteriaEnum) |  |  [optional] |
|**recurrenceStart** | **OffsetDateTime** |  |  [optional] |
|**recurrenceEnd** | **OffsetDateTime** |  |  [optional] |
|**dayOfTheWeek** | [**DayOfTheWeekEnum**](#DayOfTheWeekEnum) |  |  [optional] |
|**scheduleId** | **String** |  |  [optional] |
|**parentTimeIntervalId** | **String** |  |  [optional] |
|**tenantId** | **String** |  |  [optional] |
|**enrollmentId** | **String** |  |  [optional] |
|**trainingProgramId** | **String** |  |  [optional] |



## Enum: RepetitionCriteriaEnum

| Name | Value |
|---- | -----|
| NOT_REPEAT | &quot;NotRepeat&quot; |
| WORK_WEEK | &quot;WorkWeek&quot; |
| DAY | &quot;Day&quot; |
| MONTH | &quot;Month&quot; |
| YEAR | &quot;Year&quot; |



## Enum: DayOfTheWeekEnum

| Name | Value |
|---- | -----|
| ALL | &quot;All&quot; |
| SUNDAY | &quot;Sunday&quot; |
| MONDAY | &quot;Monday&quot; |
| TUESDAY | &quot;Tuesday&quot; |
| WEDNESDAY | &quot;Wednesday&quot; |
| THURSDAY | &quot;Thursday&quot; |
| FRIDAY | &quot;Friday&quot; |
| SATURDAY | &quot;Saturday&quot; |



