

# SocialPostDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**message** | **String** |  |  [optional] |
|**socialProfileId** | **String** |  |  [optional] |
|**socialProfileName** | **String** |  |  [optional] |
|**socialProfileAvatarUrl** | **String** |  |  [optional] |
|**commentsCount** | **Integer** |  |  [optional] |
|**reactionsCount** | **Integer** |  |  [optional] |
|**socialProfileType** | [**SocialProfileTypeEnum**](#SocialProfileTypeEnum) |  |  [optional] |
|**bodyHtml** | **String** |  |  [optional] |
|**bodyFormat** | [**BodyFormatEnum**](#BodyFormatEnum) |  |  [optional] |
|**backgroundStyle** | **String** |  |  [optional] |



## Enum: SocialProfileTypeEnum

| Name | Value |
|---- | -----|
| USER | &quot;User&quot; |
| TENANT | &quot;Tenant&quot; |
| CONTACT | &quot;Contact&quot; |



## Enum: BodyFormatEnum

| Name | Value |
|---- | -----|
| PLAIN_TEXT | &quot;PlainText&quot; |
| HTML | &quot;Html&quot; |



