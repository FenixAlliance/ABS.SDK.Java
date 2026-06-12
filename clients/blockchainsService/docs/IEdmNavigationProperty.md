

# IEdmNavigationProperty


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] [readonly] |
|**propertyKind** | [**PropertyKindEnum**](#PropertyKindEnum) |  |  [optional] [readonly] |
|**type** | [**IEdmTypeReference**](IEdmTypeReference.md) |  |  [optional] |
|**declaringType** | [**IEdmStructuredType**](IEdmStructuredType.md) |  |  [optional] |
|**partner** | [**IEdmNavigationProperty**](IEdmNavigationProperty.md) |  |  [optional] |
|**onDelete** | [**OnDeleteEnum**](#OnDeleteEnum) |  |  [optional] [readonly] |
|**containsTarget** | **Boolean** |  |  [optional] [readonly] |
|**referentialConstraint** | [**IEdmReferentialConstraint**](IEdmReferentialConstraint.md) |  |  [optional] |



## Enum: PropertyKindEnum

| Name | Value |
|---- | -----|
| NONE | &quot;None&quot; |
| STRUCTURAL | &quot;Structural&quot; |
| NAVIGATION | &quot;Navigation&quot; |



## Enum: OnDeleteEnum

| Name | Value |
|---- | -----|
| NONE | &quot;None&quot; |
| CASCADE | &quot;Cascade&quot; |



