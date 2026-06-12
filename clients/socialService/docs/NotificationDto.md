

# NotificationDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**read** | **Boolean** |  |  [optional] |
|**icon** | **String** |  |  [optional] |
|**message** | **String** |  |  [optional] |
|**imageUrl** | **String** |  |  [optional] |
|**redirectUrl** | **String** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**socialProfileId** | **String** |  |  [optional] |
|**readTimestamp** | **OffsetDateTime** |  |  [optional] |
|**issuedTimestamp** | **OffsetDateTime** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| EVENT | &quot;Event&quot; |
| ALERT | &quot;Alert&quot; |
| LOG | &quot;Log&quot; |



