

# SocialFeedPostDto


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
|**socialFeedId** | **String** |  |  [optional] |
|**facepile** | [**List&lt;SocialPostReactionFacepileDto&gt;**](SocialPostReactionFacepileDto.md) |  |  [optional] |
|**attachments** | [**List&lt;SocialPostAttachmentRefDto&gt;**](SocialPostAttachmentRefDto.md) |  |  [optional] |
|**myReaction** | [**MyReactionEnum**](#MyReactionEnum) |  |  [optional] |
|**myReactionId** | **String** |  |  [optional] |



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



## Enum: MyReactionEnum

| Name | Value |
|---- | -----|
| LIKE | &quot;Like&quot; |
| HAPPY | &quot;Happy&quot; |
| HA_HA | &quot;HaHa&quot; |
| LOVE | &quot;Love&quot; |
| SAD | &quot;Sad&quot; |
| ANGRY | &quot;Angry&quot; |
| WOW | &quot;Wow&quot; |
| AFRAID | &quot;Afraid&quot; |



