

# TrustSigningRequestDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**signedDocumentId** | **String** |  |  [optional] |
|**signingProfileId** | **String** |  |  [optional] |
|**signingCertificateId** | **String** |  |  [optional] |
|**contactId** | **String** |  |  [optional] |
|**requestedFormat** | [**RequestedFormatEnum**](#RequestedFormatEnum) |  |  [optional] |
|**requestedPurpose** | [**RequestedPurposeEnum**](#RequestedPurposeEnum) |  |  [optional] |
|**correlationId** | **String** |  |  [optional] |
|**sourceStorageObjectId** | **String** |  |  [optional] |
|**sourceSha256** | **String** |  |  [optional] |
|**externalReference** | **String** |  |  [optional] |
|**dryRun** | **Boolean** |  |  [optional] |



## Enum: RequestedFormatEnum

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



## Enum: RequestedPurposeEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| REGULATORY_SUBMISSION | &quot;RegulatorySubmission&quot; |
| CONTRACT_EXECUTION | &quot;ContractExecution&quot; |
| EMAIL_SIGNING | &quot;EmailSigning&quot; |
| INTERNAL_APPROVAL | &quot;InternalApproval&quot; |
| EVIDENCE_SEALING | &quot;EvidenceSealing&quot; |
| AGENT_CREDENTIAL | &quot;AgentCredential&quot; |
| OTHER | &quot;Other&quot; |



