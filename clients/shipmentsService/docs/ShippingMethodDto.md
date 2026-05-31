

# ShippingMethodDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**cost** | **Double** |  |  [optional] |
|**taxable** | **Boolean** |  |  [optional] |
|**taxIncluded** | **Boolean** |  |  [optional] |
|**currencyID** | **String** |  |  [optional] |
|**businessID** | **String** |  |  [optional] |
|**shippingClassCalculationType** | [**ShippingClassCalculationTypeEnum**](#ShippingClassCalculationTypeEnum) |  |  [optional] |



## Enum: ShippingClassCalculationTypeEnum

| Name | Value |
|---- | -----|
| PER_CLASS | &quot;PerClass&quot; |
| PER_ORDER | &quot;PerOrder&quot; |



