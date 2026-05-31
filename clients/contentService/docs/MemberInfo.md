

# MemberInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**memberType** | [**MemberTypeEnum**](#MemberTypeEnum) |  |  [optional] [readonly] |
|**name** | **String** |  |  [optional] [readonly] |
|**declaringType** | [**Type**](Type.md) |  |  [optional] |
|**reflectedType** | [**Type**](Type.md) |  |  [optional] |
|**module** | [**Module**](Module.md) |  |  [optional] |
|**customAttributes** | [**List&lt;CustomAttributeData&gt;**](CustomAttributeData.md) |  |  [optional] [readonly] |
|**isCollectible** | **Boolean** |  |  [optional] [readonly] |
|**metadataToken** | **Integer** |  |  [optional] [readonly] |



## Enum: MemberTypeEnum

| Name | Value |
|---- | -----|
| CONSTRUCTOR | &quot;Constructor&quot; |
| EVENT | &quot;Event&quot; |
| FIELD | &quot;Field&quot; |
| METHOD | &quot;Method&quot; |
| PROPERTY | &quot;Property&quot; |
| TYPE_INFO | &quot;TypeInfo&quot; |
| CUSTOM | &quot;Custom&quot; |
| NESTED_TYPE | &quot;NestedType&quot; |
| ALL | &quot;All&quot; |



