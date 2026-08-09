

# ApplicationPrincipalDetailDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**displayName** | **String** |  |  [optional] |
|**principalKind** | [**PrincipalKindEnum**](#PrincipalKindEnum) |  |  [optional] |
|**principalStatus** | [**PrincipalStatusEnum**](#PrincipalStatusEnum) |  |  [optional] |
|**businessApplicationId** | **String** |  |  [optional] |
|**businessApplicationName** | **String** |  |  [optional] |
|**businessApplicationNamespace** | **String** |  |  [optional] |
|**businessApplicationDisabled** | **Boolean** |  |  [optional] |
|**systemLocked** | **Boolean** |  |  [optional] |
|**tenantId** | **String** |  |  [optional] |
|**enrollmentId** | **String** |  |  [optional] |
|**enrollmentDisabled** | **Boolean** |  |  [optional] |
|**grantedPermissions** | **List&lt;String&gt;** |  |  [optional] |



## Enum: PrincipalKindEnum

| Name | Value |
|---- | -----|
| HUMAN | &quot;Human&quot; |
| AGENT | &quot;Agent&quot; |
| APPLICATION | &quot;Application&quot; |
| SERVICE | &quot;Service&quot; |
| SYSTEM | &quot;System&quot; |



## Enum: PrincipalStatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;Active&quot; |
| SUSPENDED | &quot;Suspended&quot; |
| DISABLED | &quot;Disabled&quot; |



