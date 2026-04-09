

# InvoiceEnumerationRangeDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**prefix** | **String** |  |  [optional] |
|**suffix** | **String** |  |  [optional] |
|**identifier** | **String** |  |  [optional] |
|**qualifiedName** | **String** |  |  [optional] |
|**currentNumeration** | **Long** |  |  [optional] |
|**numerationTo** | **Long** |  |  [optional] |
|**numerationFrom** | **Long** |  |  [optional] |
|**validFrom** | **OffsetDateTime** |  |  [optional] |
|**validTo** | **OffsetDateTime** |  |  [optional] |
|**fiscalAuthorityId** | **String** |  |  [optional] |
|**tenantId** | **String** |  |  [optional] |
|**enrollmentId** | **String** |  |  [optional] |
|**documentType** | [**DocumentTypeEnum**](#DocumentTypeEnum) |  |  [optional] |



## Enum: DocumentTypeEnum

| Name | Value |
|---- | -----|
| STANDARD | &quot;Standard&quot; |
| DEBIT_NOTE | &quot;DebitNote&quot; |
| CREDIT_NOTE | &quot;CreditNote&quot; |



