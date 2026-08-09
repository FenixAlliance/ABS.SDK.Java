

# InboxMessageDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**tenantId** | **String** |  |  [optional] |
|**sourceSystem** | **String** |  |  [optional] |
|**sourceRegistrationId** | **String** |  |  [optional] |
|**externalMessageId** | **String** |  |  [optional] |
|**deduplicationKey** | **String** |  |  [optional] |
|**deduplicationSignature** | **String** |  |  [optional] |
|**payloadDigest** | **String** |  |  [optional] |
|**deliveryCount** | **Integer** |  |  [optional] |
|**lastDuplicateReceivedAtUtc** | **OffsetDateTime** |  |  [optional] |
|**messageType** | **String** |  |  [optional] |
|**version** | **String** |  |  [optional] |
|**contentType** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**attempts** | **Integer** |  |  [optional] |
|**maxAttempts** | **Integer** |  |  [optional] |
|**verificationStatus** | [**VerificationStatusEnum**](#VerificationStatusEnum) |  |  [optional] |
|**verificationProfile** | **String** |  |  [optional] |
|**verificationAlgorithm** | **String** |  |  [optional] |
|**verifiedAtUtc** | **OffsetDateTime** |  |  [optional] |
|**generation** | **Integer** |  |  [optional] |
|**replayCount** | **Integer** |  |  [optional] |
|**originalInboxMessageId** | **String** |  |  [optional] |
|**failureCode** | **String** |  |  [optional] |
|**failureReason** | **String** |  |  [optional] |
|**correlationId** | **String** |  |  [optional] |
|**causationId** | **String** |  |  [optional] |
|**lockedBy** | **String** |  |  [optional] |
|**lockedUntilUtc** | **OffsetDateTime** |  |  [optional] |
|**availableAtUtc** | **OffsetDateTime** |  |  [optional] |
|**receivedAtUtc** | **OffsetDateTime** |  |  [optional] |
|**createdAtUtc** | **OffsetDateTime** |  |  [optional] |
|**lastAttemptAtUtc** | **OffsetDateTime** |  |  [optional] |
|**processedAtUtc** | **OffsetDateTime** |  |  [optional] |
|**failedAtUtc** | **OffsetDateTime** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| RECEIVED | &quot;Received&quot; |
| AUTHENTICITY_PENDING | &quot;AuthenticityPending&quot; |
| ACCEPTED | &quot;Accepted&quot; |
| PROCESSING | &quot;Processing&quot; |
| SUCCEEDED | &quot;Succeeded&quot; |
| RETRY_SCHEDULED | &quot;RetryScheduled&quot; |
| REJECTED | &quot;Rejected&quot; |
| QUARANTINED | &quot;Quarantined&quot; |
| DEAD_LETTERED | &quot;DeadLettered&quot; |
| CANCELLED | &quot;Cancelled&quot; |



## Enum: VerificationStatusEnum

| Name | Value |
|---- | -----|
| UNVERIFIED | &quot;Unverified&quot; |
| VERIFIED | &quot;Verified&quot; |
| FAILED | &quot;Failed&quot; |
| UNTRUSTED | &quot;Untrusted&quot; |
| NOT_REQUIRED | &quot;NotRequired&quot; |



