

# PrivateMessageDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**read** | **Boolean** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**message** | **String** |  |  [optional] |
|**conversationId** | **String** |  |  [optional] |
|**senderSocialProfileId** | **String** |  |  [optional] |
|**receiverSocialProfileId** | **String** |  |  [optional] |
|**sentTimestamp** | **OffsetDateTime** |  |  [optional] |
|**readTimestamp** | **OffsetDateTime** |  |  [optional] |
|**receivedTimestamp** | **OffsetDateTime** |  |  [optional] |
|**socialProfileName** | **String** |  |  [optional] |
|**socialProfileAvatarUrl** | **String** |  |  [optional] |
|**socialProfileType** | [**SocialProfileTypeEnum**](#SocialProfileTypeEnum) |  |  [optional] |



## Enum: SocialProfileTypeEnum

| Name | Value |
|---- | -----|
| USER | &quot;User&quot; |
| TENANT | &quot;Tenant&quot; |
| CONTACT | &quot;Contact&quot; |



