

# MarketingListCreateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] [readonly] |
|**timestamp** | **OffsetDateTime** |  |  [optional] [readonly] |
|**locked** | **Boolean** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**purpose** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**source** | **String** |  |  [optional] |
|**cost** | **Double** |  |  [optional] |
|**modifiedOn** | **OffsetDateTime** |  |  [optional] |
|**lastUsedOn** | **OffsetDateTime** |  |  [optional] |
|**currencyId** | **String** |  |  [optional] |
|**tenantId** | **String** |  |  [optional] |
|**enrolmentId** | **String** |  |  [optional] |
|**marketingListType** | [**MarketingListTypeEnum**](#MarketingListTypeEnum) |  |  [optional] |
|**marketingListTarget** | [**MarketingListTargetEnum**](#MarketingListTargetEnum) |  |  [optional] |



## Enum: MarketingListTypeEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



## Enum: MarketingListTargetEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |


