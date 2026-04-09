

# SocialReactionCreateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**reaction** | [**ReactionEnum**](#ReactionEnum) |  |  [optional] |
|**reactionValue** | **String** |  |  [optional] |
|**socialProfileId** | **String** |  |  [optional] |



## Enum: ReactionEnum

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



