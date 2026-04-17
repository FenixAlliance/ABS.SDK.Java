

# MarketingListCreateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**locked** | **Boolean** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**purpose** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**source** | **String** |  |  [optional] |
|**cost** | **Double** |  |  [optional] |
|**modifiedOn** | **OffsetDateTime** |  |  [optional] |
|**lastUsedOn** | **OffsetDateTime** |  |  [optional] |
|**currencyId** | **String** |  |  [optional] |
|**marketingListType** | [**MarketingListTypeEnum**](#MarketingListTypeEnum) |  |  [optional] |
|**marketingListTarget** | [**MarketingListTargetEnum**](#MarketingListTargetEnum) |  |  [optional] |



## Enum: MarketingListTypeEnum

| Name | Value |
|---- | -----|
| STATIC | &quot;Static&quot; |
| DYNAMIC | &quot;Dynamic&quot; |



## Enum: MarketingListTargetEnum

| Name | Value |
|---- | -----|
| INDIVIDUAL | &quot;Individual&quot; |
| ORGANIZATION | &quot;Organization&quot; |
| LEAD | &quot;Lead&quot; |



