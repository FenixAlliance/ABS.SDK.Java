

# FieldInfo


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
|**attributes** | [**AttributesEnum**](#AttributesEnum) |  |  [optional] [readonly] |
|**fieldType** | [**Type**](Type.md) |  |  [optional] |
|**isInitOnly** | **Boolean** |  |  [optional] [readonly] |
|**isLiteral** | **Boolean** |  |  [optional] [readonly] |
|**isNotSerialized** | **Boolean** |  |  [optional] [readonly] |
|**isPinvokeImpl** | **Boolean** |  |  [optional] [readonly] |
|**isSpecialName** | **Boolean** |  |  [optional] [readonly] |
|**isStatic** | **Boolean** |  |  [optional] [readonly] |
|**isAssembly** | **Boolean** |  |  [optional] [readonly] |
|**isFamily** | **Boolean** |  |  [optional] [readonly] |
|**isFamilyAndAssembly** | **Boolean** |  |  [optional] [readonly] |
|**isFamilyOrAssembly** | **Boolean** |  |  [optional] [readonly] |
|**isPrivate** | **Boolean** |  |  [optional] [readonly] |
|**isPublic** | **Boolean** |  |  [optional] [readonly] |
|**isSecurityCritical** | **Boolean** |  |  [optional] [readonly] |
|**isSecuritySafeCritical** | **Boolean** |  |  [optional] [readonly] |
|**isSecurityTransparent** | **Boolean** |  |  [optional] [readonly] |
|**fieldHandle** | [**RuntimeFieldHandle**](RuntimeFieldHandle.md) |  |  [optional] |



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
| PRIVATE_SCOPE | &quot;PrivateScope&quot; |
| PRIVATE | &quot;Private&quot; |
| FAM_AND_ASSEM | &quot;FamANDAssem&quot; |
| ASSEMBLY | &quot;Assembly&quot; |
| FAMILY | &quot;Family&quot; |
| FAM_OR_ASSEM | &quot;FamORAssem&quot; |
| PUBLIC | &quot;Public&quot; |
| FIELD_ACCESS_MASK | &quot;FieldAccessMask&quot; |
| STATIC | &quot;Static&quot; |
| INIT_ONLY | &quot;InitOnly&quot; |
| LITERAL | &quot;Literal&quot; |
| NOT_SERIALIZED | &quot;NotSerialized&quot; |
| HAS_FIELD_RVA | &quot;HasFieldRVA&quot; |
| SPECIAL_NAME | &quot;SpecialName&quot; |
| RT_SPECIAL_NAME | &quot;RTSpecialName&quot; |
| HAS_FIELD_MARSHAL | &quot;HasFieldMarshal&quot; |
| PINVOKE_IMPL | &quot;PinvokeImpl&quot; |
| HAS_DEFAULT | &quot;HasDefault&quot; |
| RESERVED_MASK | &quot;ReservedMask&quot; |



