

# PropertyInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] [readonly] |
|**declaringType** | [**Type**](Type.md) |  |  [optional] |
|**reflectedType** | [**Type**](Type.md) |  |  [optional] |
|**module** | [**Module**](Module.md) |  |  [optional] |
|**customAttributes** | [**List&lt;CustomAttributeData&gt;**](CustomAttributeData.md) |  |  [optional] [readonly] |
|**isCollectible** | **Boolean** |  |  [optional] [readonly] |
|**metadataToken** | **Integer** |  |  [optional] [readonly] |
|**memberType** | [**MemberTypeEnum**](#MemberTypeEnum) |  |  [optional] [readonly] |
|**propertyType** | [**Type**](Type.md) |  |  [optional] |
|**attributes** | [**AttributesEnum**](#AttributesEnum) |  |  [optional] [readonly] |
|**isSpecialName** | **Boolean** |  |  [optional] [readonly] |
|**canRead** | **Boolean** |  |  [optional] [readonly] |
|**canWrite** | **Boolean** |  |  [optional] [readonly] |
|**getMethod** | [**MethodInfo**](MethodInfo.md) |  |  [optional] |
|**setMethod** | [**MethodInfo**](MethodInfo.md) |  |  [optional] |



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



## Enum: AttributesEnum

| Name | Value |
|---- | -----|
| NONE | &quot;None&quot; |
| SPECIAL_NAME | &quot;SpecialName&quot; |
| RT_SPECIAL_NAME | &quot;RTSpecialName&quot; |
| HAS_DEFAULT | &quot;HasDefault&quot; |
| RESERVED2 | &quot;Reserved2&quot; |
| RESERVED3 | &quot;Reserved3&quot; |
| RESERVED4 | &quot;Reserved4&quot; |
| RESERVED_MASK | &quot;ReservedMask&quot; |



