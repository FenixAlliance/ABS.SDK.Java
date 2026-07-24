

# SigningParticipantDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**tenantId** | **String** |  |  [optional] |
|**signingRequestId** | **String** |  |  [optional] |
|**contactId** | **String** |  |  [optional] |
|**contactName** | **String** |  |  [optional] |
|**role** | [**RoleEnum**](#RoleEnum) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**routingOrder** | **Integer** |  |  [optional] |
|**sentAtUtc** | **OffsetDateTime** |  |  [optional] |
|**viewedAtUtc** | **OffsetDateTime** |  |  [optional] |
|**signedAtUtc** | **OffsetDateTime** |  |  [optional] |
|**approvedAtUtc** | **OffsetDateTime** |  |  [optional] |
|**declinedAtUtc** | **OffsetDateTime** |  |  [optional] |
|**declineReason** | **String** |  |  [optional] |
|**signatureId** | **String** |  |  [optional] |
|**accessTokenExpiresAtUtc** | **OffsetDateTime** |  |  [optional] |
|**correlationId** | **String** |  |  [optional] |
|**externalReference** | **String** |  |  [optional] |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| SIGNER | &quot;Signer&quot; |
| APPROVER | &quot;Approver&quot; |
| VIEWER | &quot;Viewer&quot; |
| WITNESS | &quot;Witness&quot; |
| CARBON_COPY | &quot;CarbonCopy&quot; |
| SYSTEM | &quot;System&quot; |



## Enum: StatusEnum

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



