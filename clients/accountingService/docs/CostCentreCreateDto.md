

# CostCentreCreateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**disabled** | **Boolean** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**costCentreType** | [**CostCentreTypeEnum**](#CostCentreTypeEnum) |  |  [optional] |
|**costCentresGroupId** | **String** |  |  [optional] |
|**parentCostCentreId** | **String** |  |  [optional] |



## Enum: CostCentreTypeEnum

| Name | Value |
|---- | -----|
| SERVICE | &quot;Service&quot; |
| PRODUCTION | &quot;Production&quot; |



