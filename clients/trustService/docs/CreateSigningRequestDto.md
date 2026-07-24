

# CreateSigningRequestDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**routingMode** | [**RoutingModeEnum**](#RoutingModeEnum) |  |  [optional] |
|**expiresAtUtc** | **OffsetDateTime** |  |  [optional] |
|**message** | **String** |  |  [optional] |
|**correlationId** | **String** |  |  [optional] |
|**externalReference** | **String** |  |  [optional] |



## Enum: RoutingModeEnum

| Name | Value |
|---- | -----|
| PARALLEL | &quot;Parallel&quot; |
| SEQUENTIAL | &quot;Sequential&quot; |



