

# SignedDocumentAttachmentCreateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**signedDocumentId** | **String** |  |  |
|**title** | **String** |  |  |
|**fileName** | **String** |  |  [optional] |
|**contentType** | **String** |  |  [optional] |
|**fileLength** | **Long** |  |  [optional] |
|**hash** | **String** |  |  [optional] |
|**fileUploadUrl** | **String** |  |  [optional] |
|**storageKey** | **String** |  |  |
|**storageProviderKey** | **String** |  |  [optional] |
|**attachmentRole** | [**AttachmentRoleEnum**](#AttachmentRoleEnum) |  |  [optional] |



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



