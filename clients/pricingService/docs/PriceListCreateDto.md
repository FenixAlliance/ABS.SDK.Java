

# PriceListCreateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**name** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**context** | [**ContextEnum**](#ContextEnum) |  |  [optional] |
|**startDate** | **OffsetDateTime** |  |  [optional] |
|**endDate** | **OffsetDateTime** |  |  [optional] |
|**currencyId** | **String** |  |  [optional] |
|**unitId** | **String** |  |  [optional] |
|**unitGroupId** | **String** |  |  [optional] |
|**partnerVisible** | **Boolean** |  |  [optional] |
|**unitOfMeasureDependant** | **Boolean** |  |  [optional] |



## Enum: ContextEnum

| Name | Value |
|---- | -----|
| SALES | &quot;Sales&quot; |
| PURCHASE | &quot;Purchase&quot; |
| COST | &quot;Cost&quot; |



