

# InvoiceAdjustmentDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**tenantId** | **String** |  |  [optional] |
|**invoiceId** | **String** |  |  [optional] |
|**currencyId** | **String** |  |  [optional] |
|**enrollmentId** | **String** |  |  [optional] |
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
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



