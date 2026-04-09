

# AssetRepairDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**businessId** | **Object** |  |  [optional] |
|**businessProfileRecordId** | **Object** |  |  [optional] |
|**assetId** | **Object** |  |  [optional] |
|**assetName** | **String** |  |  [optional] |
|**repairStatus** | [**RepairStatusEnum**](#RepairStatusEnum) |  |  [optional] |
|**scheduledDate** | **OffsetDateTime** |  |  [optional] |
|**completionDate** | **OffsetDateTime** |  |  [optional] |
|**reportedDate** | **OffsetDateTime** |  |  [optional] |
|**estimatedCost** | **Double** |  |  [optional] |
|**actualCost** | **Double** |  |  [optional] |
|**problemDescription** | **String** |  |  [optional] |
|**repairDescription** | **String** |  |  [optional] |
|**notes** | **String** |  |  [optional] |
|**assetMaintenanceTeamId** | **String** |  |  [optional] |
|**assetMaintenanceTeamName** | **String** |  |  [optional] |



## Enum: RepairStatusEnum

| Name | Value |
|---- | -----|
| SCHEDULED | &quot;Scheduled&quot; |
| IN_PROGRESS | &quot;InProgress&quot; |
| COMPLETED | &quot;Completed&quot; |
| CANCELLED | &quot;Cancelled&quot; |



