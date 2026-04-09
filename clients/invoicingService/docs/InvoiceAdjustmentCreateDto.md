

# InvoiceAdjustmentCreateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**currencyId** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**surchargePercent** | **Double** |  |  [optional] |
|**surchargeAmount** | **Double** |  |  [optional] |
|**discountPercent** | **Double** |  |  [optional] |
|**discountAmount** | **Double** |  |  [optional] |
|**totalSurcharge** | **Double** |  |  [optional] |
|**totalDiscount** | **Double** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DISCOUNT | &quot;Discount&quot; |
| SURCHARGE | &quot;Surcharge&quot; |



