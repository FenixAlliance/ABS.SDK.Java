

# PaymentProviderRegistrationDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**createdAtUtc** | **OffsetDateTime** |  |  [optional] |
|**lastModifiedUtc** | **OffsetDateTime** |  |  [optional] |
|**tenantId** | **String** |  |  [optional] |
|**enrollmentId** | **String** |  |  [optional] |
|**providerCode** | **String** |  |  [optional] |
|**credentialSetReference** | **String** |  |  [optional] |
|**hasCredential** | **Boolean** |  |  [optional] |
|**credentialMode** | [**CredentialModeEnum**](#CredentialModeEnum) |  |  [optional] |
|**externalAccountId** | **String** |  |  [optional] |
|**enabledCapabilities** | [**EnabledCapabilitiesEnum**](#EnabledCapabilitiesEnum) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |



## Enum: CredentialModeEnum

| Name | Value |
|---- | -----|
| TENANT_MANAGED | &quot;TenantManaged&quot; |
| PLATFORM_MANAGED | &quot;PlatformManaged&quot; |
| EXTERNAL_REFERENCE | &quot;ExternalReference&quot; |



## Enum: EnabledCapabilitiesEnum

| Name | Value |
|---- | -----|
| NONE | &quot;None&quot; |
| COLLECTION | &quot;Collection&quot; |
| AUTHORIZATION | &quot;Authorization&quot; |
| CAPTURE | &quot;Capture&quot; |
| REFUND | &quot;Refund&quot; |
| VOID | &quot;Void&quot; |
| SPLIT_PAYMENT | &quot;SplitPayment&quot; |
| TRANSFER | &quot;Transfer&quot; |
| PAYOUT | &quot;Payout&quot; |
| RECIPIENT_ONBOARDING | &quot;RecipientOnboarding&quot; |
| BALANCE_INQUIRY | &quot;BalanceInquiry&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DRAFT | &quot;Draft&quot; |
| ACTIVE | &quot;Active&quot; |
| DISABLED | &quot;Disabled&quot; |
| SUSPENDED | &quot;Suspended&quot; |



