

# PostingExecutionDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**tenantId** | **String** |  |  [optional] |
|**enrollmentId** | **String** |  |  [optional] |
|**postingIntentId** | **String** |  |  [optional] |
|**postingIdempotencyKey** | **String** |  |  [optional] |
|**intentType** | **String** |  |  [optional] |
|**postingOperation** | **String** |  |  [optional] |
|**sourceDocumentType** | **String** |  |  [optional] |
|**sourceDocumentId** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**failureKind** | [**FailureKindEnum**](#FailureKindEnum) |  |  [optional] |
|**failureCode** | **String** |  |  [optional] |
|**retryable** | **Boolean** |  |  [optional] |
|**correlationId** | **String** |  |  [optional] |
|**causationId** | **String** |  |  [optional] |
|**receivedAtUtc** | **OffsetDateTime** |  |  [optional] |
|**processingStartedAtUtc** | **OffsetDateTime** |  |  [optional] |
|**completedAtUtc** | **OffsetDateTime** |  |  [optional] |
|**bookResults** | [**List&lt;PostingBookResultDto&gt;**](PostingBookResultDto.md) |  |  [optional] |
|**failureClass** | [**FailureClassEnum**](#FailureClassEnum) |  |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| RECEIVED | &quot;Received&quot; |
| PROCESSING | &quot;Processing&quot; |
| POSTED | &quot;Posted&quot; |
| DUPLICATE | &quot;Duplicate&quot; |
| PENDING_MAPPING | &quot;PendingMapping&quot; |
| PENDING_PERIOD | &quot;PendingPeriod&quot; |
| PENDING_RATE | &quot;PendingRate&quot; |
| REJECTED | &quot;Rejected&quot; |



## Enum: FailureKindEnum

| Name | Value |
|---- | -----|
| UNKNOWN_OPERATION | &quot;UnknownOperation&quot; |
| UNKNOWN_ROLE | &quot;UnknownRole&quot; |
| AMBIGUOUS_POLICY | &quot;AmbiguousPolicy&quot; |
| MISSING_ACCOUNT_MAPPING | &quot;MissingAccountMapping&quot; |
| MISSING_FINANCIAL_BOOK | &quot;MissingFinancialBook&quot; |
| MISSING_JOURNAL | &quot;MissingJournal&quot; |
| CLOSED_PERIOD | &quot;ClosedPeriod&quot; |
| MISSING_FX_RATE | &quot;MissingFxRate&quot; |
| INVALID_FX_EVIDENCE | &quot;InvalidFxEvidence&quot; |
| UNBALANCED_PLAN | &quot;UnbalancedPlan&quot; |
| DUPLICATE_INTENT | &quot;DuplicateIntent&quot; |
| DUPLICATE_BOOK_POSTING | &quot;DuplicateBookPosting&quot; |
| INVALID_PARTY_REFERENCE | &quot;InvalidPartyReference&quot; |
| INVALID_CUSTODY_CONTEXT | &quot;InvalidCustodyContext&quot; |
| POLICY_CONFIGURATION_ERROR | &quot;PolicyConfigurationError&quot; |



## Enum: FailureClassEnum

| Name | Value |
|---- | -----|
| RETRYABLE | &quot;Retryable&quot; |
| OPERATOR_ACTION_REQUIRED | &quot;OperatorActionRequired&quot; |
| CONFIGURATION_ERROR | &quot;ConfigurationError&quot; |
| PRODUCER_ERROR | &quot;ProducerError&quot; |



