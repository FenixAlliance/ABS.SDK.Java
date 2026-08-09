

# AuthResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userId** | **Object** |  |  [optional] |
|**tenantId** | **Object** |  |  [optional] |
|**portalId** | **Object** |  |  [optional] |
|**applicationId** | **Object** |  |  [optional] |
|**enrollmentId** | **Object** |  |  [optional] |
|**correlationId** | **String** |  |  [optional] |
|**scopes** | **List&lt;String&gt;** |  |  [optional] |
|**error** | **String** |  |  [optional] |
|**runAs** | [**RunAsEnum**](#RunAsEnum) |  |  [optional] |
|**principalKind** | [**PrincipalKindEnum**](#PrincipalKindEnum) |  |  [optional] |
|**provenance** | [**ExecutionProvenance**](ExecutionProvenance.md) |  |  [optional] |



## Enum: RunAsEnum

| Name | Value |
|---- | -----|
| INVOKER | &quot;Invoker&quot; |
| APPLICATION | &quot;Application&quot; |
| SYSTEM | &quot;System&quot; |
| SERVICE | &quot;Service&quot; |



## Enum: PrincipalKindEnum

| Name | Value |
|---- | -----|
| HUMAN | &quot;Human&quot; |
| AGENT | &quot;Agent&quot; |
| APPLICATION | &quot;Application&quot; |
| SERVICE | &quot;Service&quot; |
| SYSTEM | &quot;System&quot; |



