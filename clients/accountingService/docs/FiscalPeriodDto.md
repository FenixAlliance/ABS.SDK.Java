

# FiscalPeriodDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**fromDate** | **OffsetDateTime** |  |  [optional] |
|**toDate** | **OffsetDateTime** |  |  [optional] |
|**tenantId** | **String** |  |  [optional] |
|**enrollmentId** | **String** |  |  [optional] |
|**fiscalYearId** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;Open&quot; |
| CLOSED | &quot;Closed&quot; |
| LOCKED | &quot;Locked&quot; |



