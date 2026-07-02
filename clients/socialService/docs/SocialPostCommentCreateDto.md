

# SocialPostCommentCreateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**message** | **String** |  |  |
|**bodyHtml** | **String** |  |  [optional] |
|**bodyFormat** | [**BodyFormatEnum**](#BodyFormatEnum) |  |  [optional] |
|**parentCommentId** | **String** |  |  [optional] |
|**socialProfileId** | **String** |  |  [optional] |
|**socialFeedPostId** | **String** |  |  [optional] |
|**socialPostId** | **String** |  |  [optional] |



## Enum: BodyFormatEnum

| Name | Value |
|---- | -----|
| PLAIN_TEXT | &quot;PlainText&quot; |
| HTML | &quot;Html&quot; |



