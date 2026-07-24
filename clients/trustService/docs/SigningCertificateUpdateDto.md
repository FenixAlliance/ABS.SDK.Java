

# SigningCertificateUpdateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** |  |  |
|**type** | **String** |  |  [optional] |
|**url** | **String** |  |  [optional] |
|**csr** | **String** |  |  [optional] |
|**publicKey** | **String** |  |  [optional] |
|**certificateType** | [**CertificateTypeEnum**](#CertificateTypeEnum) |  |  [optional] |
|**contactId** | **String** |  |  |
|**securityCertificateId** | **String** |  |  [optional] |



## Enum: CertificateTypeEnum

| Name | Value |
|---- | -----|
| AUTH_SIGNED_CERTIFICATE | &quot;AuthSignedCertificate&quot; |
| SELF_SIGNED_CERTIFICATE | &quot;SelfSignedCertificate&quot; |
| ALLIANCE_SIGNED_CERTIFICATE | &quot;AllianceSignedCertificate&quot; |



