

# IEdmTerm


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] [readonly] |
|**schemaElementKind** | [**SchemaElementKindEnum**](#SchemaElementKindEnum) |  |  [optional] [readonly] |
|**namespace** | **String** |  |  [optional] [readonly] |
|**type** | [**IEdmTypeReference**](IEdmTypeReference.md) |  |  [optional] |
|**appliesTo** | **String** |  |  [optional] [readonly] |
|**defaultValue** | **String** |  |  [optional] [readonly] |



## Enum: SchemaElementKindEnum

| Name | Value |
|---- | -----|
| NONE | &quot;None&quot; |
| TYPE_DEFINITION | &quot;TypeDefinition&quot; |
| TERM | &quot;Term&quot; |
| ACTION | &quot;Action&quot; |
| ENTITY_CONTAINER | &quot;EntityContainer&quot; |
| FUNCTION | &quot;Function&quot; |



