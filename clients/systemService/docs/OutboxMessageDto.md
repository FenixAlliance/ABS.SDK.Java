

# OutboxMessageDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**tenantId** | **String** |  |  [optional] |
|**kind** | [**KindEnum**](#KindEnum) |  |  [optional] |
|**messageType** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**attempts** | **Integer** |  |  [optional] |
|**maxAttempts** | **Integer** |  |  [optional] |
|**failureCode** | **String** |  |  [optional] |
|**failureReason** | **String** |  |  [optional] |
|**idempotencyKey** | **String** |  |  [optional] |
|**correlationId** | **String** |  |  [optional] |
|**lockedBy** | **String** |  |  [optional] |
|**lockedUntilUtc** | **OffsetDateTime** |  |  [optional] |
|**availableAtUtc** | **OffsetDateTime** |  |  [optional] |
|**createdAtUtc** | **OffsetDateTime** |  |  [optional] |
|**lastAttemptAtUtc** | **OffsetDateTime** |  |  [optional] |
|**processedAtUtc** | **OffsetDateTime** |  |  [optional] |
|**failedAtUtc** | **OffsetDateTime** |  |  [optional] |



## Enum: KindEnum

| Name | Value |
|---- | -----|
| EVENT | &quot;Event&quot; |
| COMMAND | &quot;Command&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;Pending&quot; |
| PROCESSING | &quot;Processing&quot; |
| SUCCEEDED | &quot;Succeeded&quot; |
| FAILED | &quot;Failed&quot; |
| DEAD_LETTERED | &quot;DeadLettered&quot; |
| CANCELLED | &quot;Cancelled&quot; |



