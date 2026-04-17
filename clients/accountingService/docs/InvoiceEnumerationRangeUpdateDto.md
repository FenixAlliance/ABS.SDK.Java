

# InvoiceEnumerationRangeUpdateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**prefix** | **String** |  |  [optional] |
|**suffix** | **String** |  |  [optional] |
|**identifier** | **String** |  |  [optional] |
|**qualifiedName** | **String** |  |  [optional] |
|**currentNumeration** | **Long** |  |  [optional] |
|**numerationFrom** | **Long** |  |  [optional] |
|**numerationTo** | **Long** |  |  [optional] |
|**validFrom** | **OffsetDateTime** |  |  [optional] |
|**validTo** | **OffsetDateTime** |  |  [optional] |
|**fiscalAuthorityId** | **String** |  |  [optional] |
|**documentType** | [**DocumentTypeEnum**](#DocumentTypeEnum) |  |  [optional] |



## Enum: DocumentTypeEnum

| Name | Value |
|---- | -----|
| STANDARD | &quot;Standard&quot; |
| DEBIT_NOTE | &quot;DebitNote&quot; |
| CREDIT_NOTE | &quot;CreditNote&quot; |



