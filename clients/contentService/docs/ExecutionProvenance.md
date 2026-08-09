

# ExecutionProvenance


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**initiation** | [**InitiationEnum**](#InitiationEnum) |  |  [optional] |
|**onBehalfOfActorId** | **Object** |  |  [optional] |
|**onBehalfOfActorKind** | [**OnBehalfOfActorKindEnum**](#OnBehalfOfActorKindEnum) |  |  [optional] |
|**causationId** | **UUID** |  |  [optional] |
|**originatingWorkflowInstanceId** | **String** |  |  [optional] |
|**eventDepth** | **Integer** |  |  [optional] |



## Enum: InitiationEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| HTTP | &quot;Http&quot; |
| WORKFLOW | &quot;Workflow&quot; |
| SCHEDULED_JOB | &quot;ScheduledJob&quot; |
| EVENT | &quot;Event&quot; |
| AI_TOOL | &quot;AiTool&quot; |
| MCP | &quot;Mcp&quot; |
| INTEGRATION | &quot;Integration&quot; |
| SYSTEM | &quot;System&quot; |
| MANUAL | &quot;Manual&quot; |



## Enum: OnBehalfOfActorKindEnum

| Name | Value |
|---- | -----|
| HUMAN | &quot;Human&quot; |
| AGENT | &quot;Agent&quot; |
| APPLICATION | &quot;Application&quot; |
| SERVICE | &quot;Service&quot; |
| SYSTEM | &quot;System&quot; |



