

# SigningCertificateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**type** | **String** |  |  [optional] |
|**url** | **String** |  |  [optional] |
|**csr** | **String** |  |  [optional] |
|**publicKey** | **String** |  |  [optional] |
|**signature** | **String** |  |  [optional] |
|**fileLengthInBits** | **Long** |  |  [optional] |
|**certificateType** | [**CertificateTypeEnum**](#CertificateTypeEnum) |  |  [optional] |
|**contactId** | **String** |  |  [optional] |
|**tenantId** | **String** |  |  [optional] |
|**userId** | **String** |  |  [optional] |
|**enrollmentId** | **String** |  |  [optional] |
|**securityCertificateId** | **String** |  |  [optional] |
|**certificateStatus** | [**CertificateStatusEnum**](#CertificateStatusEnum) |  |  [optional] |
|**thumbprint** | **String** |  |  [optional] |
|**subjectName** | **String** |  |  [optional] |
|**issuerName** | **String** |  |  [optional] |
|**serialNumber** | **String** |  |  [optional] |
|**notBeforeUtc** | **OffsetDateTime** |  |  [optional] |
|**notAfterUtc** | **OffsetDateTime** |  |  [optional] |
|**contactName** | **String** |  |  [optional] |



## Enum: CertificateTypeEnum

| Name | Value |
|---- | -----|
| AUTH_SIGNED_CERTIFICATE | &quot;AuthSignedCertificate&quot; |
| SELF_SIGNED_CERTIFICATE | &quot;SelfSignedCertificate&quot; |
| ALLIANCE_SIGNED_CERTIFICATE | &quot;AllianceSignedCertificate&quot; |



## Enum: CertificateStatusEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| ACTIVE | &quot;Active&quot; |
| EXPIRING | &quot;Expiring&quot; |
| EXPIRED | &quot;Expired&quot; |
| REVOKED | &quot;Revoked&quot; |
| DISABLED | &quot;Disabled&quot; |



