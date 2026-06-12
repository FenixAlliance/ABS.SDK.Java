

# IEdmEntityType


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**typeKind** | [**TypeKindEnum**](#TypeKindEnum) |  |  [optional] [readonly] |
|**name** | **String** |  |  [optional] [readonly] |
|**isAbstract** | **Boolean** |  |  [optional] [readonly] |
|**isOpen** | **Boolean** |  |  [optional] [readonly] |
|**baseType** | [**IEdmStructuredType**](IEdmStructuredType.md) |  |  [optional] |
|**declaredProperties** | [**List&lt;IEdmProperty&gt;**](IEdmProperty.md) |  |  [optional] [readonly] |
|**schemaElementKind** | [**SchemaElementKindEnum**](#SchemaElementKindEnum) |  |  [optional] [readonly] |
|**namespace** | **String** |  |  [optional] [readonly] |
|**declaredKey** | [**List&lt;IEdmStructuralProperty&gt;**](IEdmStructuralProperty.md) |  |  [optional] [readonly] |
|**hasStream** | **Boolean** |  |  [optional] [readonly] |



## Enum: TypeKindEnum

| Name | Value |
|---- | -----|
| NONE | &quot;None&quot; |
| PRIMITIVE | &quot;Primitive&quot; |
| ENTITY | &quot;Entity&quot; |
| COMPLEX | &quot;Complex&quot; |
| COLLECTION | &quot;Collection&quot; |
| ENTITY_REFERENCE | &quot;EntityReference&quot; |
| ENUM | &quot;Enum&quot; |
| TYPE_DEFINITION | &quot;TypeDefinition&quot; |
| UNTYPED | &quot;Untyped&quot; |
| PATH | &quot;Path&quot; |



## Enum: SchemaElementKindEnum

| Name | Value |
|---- | -----|
| NONE | &quot;None&quot; |
| TYPE_DEFINITION | &quot;TypeDefinition&quot; |
| TERM | &quot;Term&quot; |
| ACTION | &quot;Action&quot; |
| ENTITY_CONTAINER | &quot;EntityContainer&quot; |
| FUNCTION | &quot;Function&quot; |



