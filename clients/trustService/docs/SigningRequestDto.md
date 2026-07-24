

# SigningRequestDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**tenantId** | **String** |  |  [optional] |
|**signedDocumentId** | **String** |  |  [optional] |
|**signedDocumentTitle** | **String** |  |  [optional] |
|**frozenSourceFileUploadId** | **String** |  |  [optional] |
|**sourceSha256** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**routingMode** | [**RoutingModeEnum**](#RoutingModeEnum) |  |  [optional] |
|**createdAtUtc** | **OffsetDateTime** |  |  [optional] |
|**sentAtUtc** | **OffsetDateTime** |  |  [optional] |
|**completedAtUtc** | **OffsetDateTime** |  |  [optional] |
|**expiresAtUtc** | **OffsetDateTime** |  |  [optional] |
|**voidedAtUtc** | **OffsetDateTime** |  |  [optional] |
|**voidedReason** | **String** |  |  [optional] |
|**message** | **String** |  |  [optional] |
|**correlationId** | **String** |  |  [optional] |
|**externalReference** | **String** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DRAFT | &quot;Draft&quot; |
| READY | &quot;Ready&quot; |
| SENT | &quot;Sent&quot; |
| IN_PROGRESS | &quot;InProgress&quot; |
| COMPLETED | &quot;Completed&quot; |
| DECLINED | &quot;Declined&quot; |
| VOIDED | &quot;Voided&quot; |
| EXPIRED | &quot;Expired&quot; |
| FAILED | &quot;Failed&quot; |



## Enum: RoutingModeEnum

| Name | Value |
|---- | -----|
| PARALLEL | &quot;Parallel&quot; |
| SEQUENTIAL | &quot;Sequential&quot; |



