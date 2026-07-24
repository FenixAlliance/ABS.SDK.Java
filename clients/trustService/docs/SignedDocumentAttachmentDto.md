

# SignedDocumentAttachmentDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**signedDocumentId** | **String** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**fileName** | **String** |  |  [optional] |
|**contentType** | **String** |  |  [optional] |
|**fileLength** | **Long** |  |  [optional] |
|**hash** | **String** |  |  [optional] |
|**fileUploadUrl** | **String** |  |  [optional] |
|**storageKey** | **String** |  |  [optional] |
|**storageProviderKey** | **String** |  |  [optional] |
|**scanStatus** | [**ScanStatusEnum**](#ScanStatusEnum) |  |  [optional] |
|**mutability** | [**MutabilityEnum**](#MutabilityEnum) |  |  [optional] |
|**attachmentRole** | [**AttachmentRoleEnum**](#AttachmentRoleEnum) |  |  [optional] |
|**tenantId** | **String** |  |  [optional] |
|**userId** | **String** |  |  [optional] |
|**enrollmentId** | **String** |  |  [optional] |
|**signedDocumentTitle** | **String** |  |  [optional] |



## Enum: ScanStatusEnum

| Name | Value |
|---- | -----|
| NOT_REQUIRED | &quot;NotRequired&quot; |
| PENDING | &quot;Pending&quot; |
| CLEAN | &quot;Clean&quot; |
| INFECTED | &quot;Infected&quot; |
| FAILED | &quot;Failed&quot; |
| QUARANTINED | &quot;Quarantined&quot; |



## Enum: MutabilityEnum

| Name | Value |
|---- | -----|
| EDITABLE | &quot;Editable&quot; |
| MANAGED | &quot;Managed&quot; |
| SEALED_EVIDENCE | &quot;SealedEvidence&quot; |



## Enum: AttachmentRoleEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| SOURCE | &quot;Source&quot; |
| SUPPORTING_EVIDENCE | &quot;SupportingEvidence&quot; |
| AUTHORITY_RESPONSE | &quot;AuthorityResponse&quot; |
| HUMAN_READABLE_PDF | &quot;HumanReadablePdf&quot; |
| XML_PAYLOAD | &quot;XmlPayload&quot; |
| VALIDATION_REPORT | &quot;ValidationReport&quot; |
| OTHER | &quot;Other&quot; |



