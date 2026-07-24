

# TrustSigningReadinessDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**canProceed** | **Boolean** |  |  [optional] |
|**blockingReasons** | **List&lt;String&gt;** |  |  [optional] |
|**warnings** | **List&lt;String&gt;** |  |  [optional] |
|**resolvedDocumentTitle** | **String** |  |  [optional] |
|**resolvedProfileDisplayName** | **String** |  |  [optional] |
|**resolvedCertificateTitle** | **String** |  |  [optional] |
|**expectedSignatureFormat** | [**ExpectedSignatureFormatEnum**](#ExpectedSignatureFormatEnum) |  |  [optional] |
|**expectedSignaturePurpose** | [**ExpectedSignaturePurposeEnum**](#ExpectedSignaturePurposeEnum) |  |  [optional] |
|**expectedDigestAlgorithm** | **String** |  |  [optional] |
|**expectedSignatureAlgorithm** | **String** |  |  [optional] |
|**expectedCanonicalizationAlgorithm** | **String** |  |  [optional] |
|**policyIdentifier** | **String** |  |  [optional] |
|**authorityProfile** | **String** |  |  [optional] |
|**requiresCustodyProvider** | **Boolean** |  |  [optional] |
|**requiresSourceArtifact** | **Boolean** |  |  [optional] |
|**requiresCertificate** | **Boolean** |  |  [optional] |
|**correlationId** | **String** |  |  [optional] |



## Enum: ExpectedSignatureFormatEnum

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



## Enum: ExpectedSignaturePurposeEnum

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



