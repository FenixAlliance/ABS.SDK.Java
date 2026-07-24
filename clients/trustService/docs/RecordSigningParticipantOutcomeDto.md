

# RecordSigningParticipantOutcomeDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**outcome** | [**OutcomeEnum**](#OutcomeEnum) |  |  |
|**outcomeAtUtc** | **OffsetDateTime** |  |  [optional] |
|**declineReason** | **String** |  |  [optional] |
|**externalReference** | **String** |  |  [optional] |



## Enum: OutcomeEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;Pending&quot; |
| SENT | &quot;Sent&quot; |
| VIEWED | &quot;Viewed&quot; |
| SIGNED | &quot;Signed&quot; |
| APPROVED | &quot;Approved&quot; |
| DECLINED | &quot;Declined&quot; |
| SKIPPED | &quot;Skipped&quot; |
| EXPIRED | &quot;Expired&quot; |
| FAILED | &quot;Failed&quot; |



