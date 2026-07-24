

# SigningProfileGraphicalRepresentationDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**signingProfileId** | **String** |  |  [optional] |
|**kind** | [**KindEnum**](#KindEnum) |  |  [optional] |
|**displayName** | **String** |  |  [optional] |
|**fileUploadId** | **String** |  |  [optional] |
|**sha256** | **String** |  |  [optional] |
|**vectorDataJson** | **String** |  |  [optional] |
|**textValue** | **String** |  |  [optional] |
|**fontFamily** | **String** |  |  [optional] |
|**isDefault** | **Boolean** |  |  [optional] |
|**isActive** | **Boolean** |  |  [optional] |
|**tenantId** | **String** |  |  [optional] |
|**enrollmentId** | **String** |  |  [optional] |
|**createdById** | **String** |  |  [optional] |
|**createdAtUtc** | **OffsetDateTime** |  |  [optional] |
|**signingProfileName** | **String** |  |  [optional] |



## Enum: KindEnum

| Name | Value |
|---- | -----|
| DRAWN | &quot;Drawn&quot; |
| UPLOADED_IMAGE | &quot;UploadedImage&quot; |
| TYPED | &quot;Typed&quot; |
| INITIALS | &quot;Initials&quot; |
| SEAL | &quot;Seal&quot; |
| STAMP | &quot;Stamp&quot; |



