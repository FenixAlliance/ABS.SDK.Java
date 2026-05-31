

# ParameterInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributes** | [**AttributesEnum**](#AttributesEnum) |  |  [optional] [readonly] |
|**member** | [**MemberInfo**](MemberInfo.md) |  |  [optional] |
|**name** | **String** |  |  [optional] [readonly] |
|**parameterType** | [**Type**](Type.md) |  |  [optional] |
|**position** | **Integer** |  |  [optional] [readonly] |
|**isIn** | **Boolean** |  |  [optional] [readonly] |
|**isLcid** | **Boolean** |  |  [optional] [readonly] |
|**isOptional** | **Boolean** |  |  [optional] [readonly] |
|**isOut** | **Boolean** |  |  [optional] [readonly] |
|**isRetval** | **Boolean** |  |  [optional] [readonly] |
|**defaultValue** | **Object** |  |  [optional] [readonly] |
|**rawDefaultValue** | **Object** |  |  [optional] [readonly] |
|**hasDefaultValue** | **Boolean** |  |  [optional] [readonly] |
|**customAttributes** | [**List&lt;CustomAttributeData&gt;**](CustomAttributeData.md) |  |  [optional] [readonly] |
|**metadataToken** | **Integer** |  |  [optional] [readonly] |



## Enum: AttributesEnum

| Name | Value |
|---- | -----|
| NONE | &quot;None&quot; |
| IN | &quot;In&quot; |
| OUT | &quot;Out&quot; |
| LCID | &quot;Lcid&quot; |
| RETVAL | &quot;Retval&quot; |
| OPTIONAL | &quot;Optional&quot; |
| HAS_DEFAULT | &quot;HasDefault&quot; |
| HAS_FIELD_MARSHAL | &quot;HasFieldMarshal&quot; |
| RESERVED3 | &quot;Reserved3&quot; |
| RESERVED4 | &quot;Reserved4&quot; |
| RESERVED_MASK | &quot;ReservedMask&quot; |



