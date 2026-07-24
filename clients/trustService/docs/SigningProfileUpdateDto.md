

# SigningProfileUpdateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** |  |  [optional] |
|**contactId** | **String** |  |  [optional] |
|**about** | **String** |  |  [optional] |
|**avatarUrl** | **String** |  |  [optional] |
|**data** | **String** |  |  [optional] |
|**dataLabel** | **String** |  |  [optional] |
|**data1** | **String** |  |  [optional] |
|**data1Label** | **String** |  |  [optional] |
|**data2** | **String** |  |  [optional] |
|**data2Label** | **String** |  |  [optional] |
|**data3** | **String** |  |  [optional] |
|**data3Label** | **String** |  |  [optional] |
|**data4** | **String** |  |  [optional] |
|**data4Label** | **String** |  |  [optional] |
|**data5** | **String** |  |  [optional] |
|**data5Label** | **String** |  |  [optional] |
|**data6** | **String** |  |  [optional] |
|**data6Label** | **String** |  |  [optional] |
|**data7** | **String** |  |  [optional] |
|**data7Label** | **String** |  |  [optional] |
|**data8** | **String** |  |  [optional] |
|**data8Label** | **String** |  |  [optional] |
|**data9** | **String** |  |  [optional] |
|**data9Label** | **String** |  |  [optional] |
|**signatureFormat** | [**SignatureFormatEnum**](#SignatureFormatEnum) |  |  [optional] |
|**signaturePurpose** | [**SignaturePurposeEnum**](#SignaturePurposeEnum) |  |  [optional] |
|**digestAlgorithm** | **String** |  |  [optional] |
|**signatureAlgorithm** | **String** |  |  [optional] |
|**canonicalizationAlgorithm** | **String** |  |  [optional] |
|**policyIdentifier** | **String** |  |  [optional] |
|**policyUri** | **String** |  |  [optional] |
|**authorityProfile** | **String** |  |  [optional] |
|**isActive** | **Boolean** |  |  [optional] |
|**defaultForDocumentType** | **String** |  |  [optional] |



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



## Enum: SignaturePurposeEnum

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



