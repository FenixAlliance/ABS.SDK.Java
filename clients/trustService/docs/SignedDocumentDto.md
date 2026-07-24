

# SignedDocumentDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**signed** | **Boolean** |  |  [optional] |
|**url** | **String** |  |  [optional] |
|**type** | **String** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**contentType** | **String** |  |  [optional] |
|**fileLengthInBits** | **Long** |  |  [optional] |
|**tenantId** | **String** |  |  [optional] |
|**contactId** | **String** |  |  [optional] |
|**userId** | **String** |  |  [optional] |
|**enrollmentId** | **String** |  |  [optional] |
|**documentStandard** | [**DocumentStandardEnum**](#DocumentStandardEnum) |  |  [optional] |
|**trustDocumentType** | [**TrustDocumentTypeEnum**](#TrustDocumentTypeEnum) |  |  [optional] |
|**signingStatus** | [**SigningStatusEnum**](#SigningStatusEnum) |  |  [optional] |
|**verificationStatus** | [**VerificationStatusEnum**](#VerificationStatusEnum) |  |  [optional] |
|**signedAtUtc** | **OffsetDateTime** |  |  [optional] |
|**correlationId** | **String** |  |  [optional] |
|**externalReference** | **String** |  |  [optional] |
|**sourceStorageObjectId** | **String** |  |  [optional] |
|**sourceSha256** | **String** |  |  [optional] |
|**signedStorageObjectId** | **String** |  |  [optional] |
|**signedSha256** | **String** |  |  [optional] |
|**evidenceStorageObjectId** | **String** |  |  [optional] |
|**evidenceSha256** | **String** |  |  [optional] |
|**primaryFileUploadId** | **String** |  |  [optional] |
|**frozenSourceFileUploadId** | **String** |  |  [optional] |
|**signedFileUploadId** | **String** |  |  [optional] |
|**evidenceFileUploadId** | **String** |  |  [optional] |
|**lockState** | [**LockStateEnum**](#LockStateEnum) |  |  [optional] |
|**graphicalRepresentationFileUploadId** | **String** |  |  [optional] |
|**graphicalRepresentationStorageObjectId** | **String** |  |  [optional] |
|**graphicalRepresentationSha256** | **String** |  |  [optional] |
|**graphicalRepresentationContentType** | **String** |  |  [optional] |
|**graphicalRepresentationGeneratedAtUtc** | **OffsetDateTime** |  |  [optional] |
|**contactName** | **String** |  |  [optional] |



## Enum: DocumentStandardEnum

| Name | Value |
|---- | -----|
| NONE | &quot;None&quot; |
| UBL | &quot;Ubl&quot; |
| PDF | &quot;Pdf&quot; |
| XML | &quot;Xml&quot; |
| EMAIL | &quot;Email&quot; |
| JSON | &quot;Json&quot; |
| OTHER | &quot;Other&quot; |



## Enum: TrustDocumentTypeEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| INVOICE | &quot;Invoice&quot; |
| CREDIT_NOTE | &quot;CreditNote&quot; |
| DEBIT_NOTE | &quot;DebitNote&quot; |
| CONTRACT | &quot;Contract&quot; |
| CERTIFICATE | &quot;Certificate&quot; |
| EMAIL | &quot;Email&quot; |
| AUTHORITY_RESPONSE | &quot;AuthorityResponse&quot; |
| OTHER | &quot;Other&quot; |



## Enum: SigningStatusEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| DRAFT | &quot;Draft&quot; |
| SIGNED | &quot;Signed&quot; |
| FAILED | &quot;Failed&quot; |
| REVOKED | &quot;Revoked&quot; |



## Enum: VerificationStatusEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| NOT_VERIFIED | &quot;NotVerified&quot; |
| VALID | &quot;Valid&quot; |
| INVALID | &quot;Invalid&quot; |
| EXPIRED | &quot;Expired&quot; |



## Enum: LockStateEnum

| Name | Value |
|---- | -----|
| DRAFT | &quot;Draft&quot; |
| EDITABLE | &quot;Editable&quot; |
| FROZEN_FOR_SIGNATURE | &quot;FrozenForSignature&quot; |
| SIGNING_IN_PROGRESS | &quot;SigningInProgress&quot; |
| SEALED | &quot;Sealed&quot; |
| VOIDED | &quot;Voided&quot; |
| SUPERSEDED | &quot;Superseded&quot; |



