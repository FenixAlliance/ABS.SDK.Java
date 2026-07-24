

# SignatureDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**type** | **String** |  |  [optional] |
|**validationCode** | **String** |  |  [optional] |
|**signatureImage** | **String** |  |  [optional] |
|**contactId** | **String** |  |  [optional] |
|**tenantId** | **String** |  |  [optional] |
|**userId** | **String** |  |  [optional] |
|**enrollmentId** | **String** |  |  [optional] |
|**signingProfileId** | **String** |  |  [optional] |
|**signingCertificateId** | **String** |  |  [optional] |
|**signedDocumentId** | **String** |  |  [optional] |
|**signedAtUtc** | **OffsetDateTime** |  |  [optional] |
|**signingStatus** | [**SigningStatusEnum**](#SigningStatusEnum) |  |  [optional] |
|**verificationStatus** | [**VerificationStatusEnum**](#VerificationStatusEnum) |  |  [optional] |
|**signatureFormat** | [**SignatureFormatEnum**](#SignatureFormatEnum) |  |  [optional] |
|**digestAlgorithm** | **String** |  |  [optional] |
|**signatureAlgorithm** | **String** |  |  [optional] |
|**canonicalizationAlgorithm** | **String** |  |  [optional] |
|**policyIdentifier** | **String** |  |  [optional] |
|**correlationId** | **String** |  |  [optional] |
|**digestValue** | **String** |  |  [optional] |
|**signatureValueHash** | **String** |  |  [optional] |
|**contactName** | **String** |  |  [optional] |
|**signingProfileDisplayName** | **String** |  |  [optional] |
|**signingCertificateTitle** | **String** |  |  [optional] |
|**signedDocumentTitle** | **String** |  |  [optional] |



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



## Enum: SignatureFormatEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| XAD_ES | &quot;XAdES&quot; |
| PAD_ES | &quot;PAdES&quot; |
| CAD_ES | &quot;CAdES&quot; |
| SMIME | &quot;SMIME&quot; |
| DETACHED_XML_D_SIG | &quot;DetachedXmlDSig&quot; |
| ENVELOPED | &quot;Enveloped&quot; |
| OTHER | &quot;Other&quot; |



