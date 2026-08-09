

# CreateProviderWebhookRegistrationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**providerCode** | **String** |  |  [optional] |
|**externalAccountId** | **String** |  |  [optional] |
|**webhookSigningSecret** | **String** |  |  [optional] |
|**credentialMode** | [**CredentialModeEnum**](#CredentialModeEnum) |  |  [optional] |



## Enum: CredentialModeEnum

| Name | Value |
|---- | -----|
| TENANT_MANAGED | &quot;TenantManaged&quot; |
| PLATFORM_MANAGED | &quot;PlatformManaged&quot; |
| EXTERNAL_REFERENCE | &quot;ExternalReference&quot; |



