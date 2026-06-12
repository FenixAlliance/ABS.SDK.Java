

# PriceListDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**startDate** | **OffsetDateTime** |  |  [optional] |
|**endDate** | **OffsetDateTime** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**context** | [**ContextEnum**](#ContextEnum) |  |  [optional] |
|**currencyId** | **String** |  |  [optional] |
|**tenantId** | **String** |  |  [optional] |
|**unitId** | **String** |  |  [optional] |
|**unitGroupId** | **String** |  |  [optional] |
|**partnerVisible** | **Boolean** |  |  [optional] |
|**unitOfMeasureDependant** | **Boolean** |  |  [optional] |
|**enrollmentId** | **String** |  |  [optional] |



## Enum: ContextEnum

| Name | Value |
|---- | -----|
| SALES | &quot;Sales&quot; |
| PURCHASE | &quot;Purchase&quot; |
| COST | &quot;Cost&quot; |



