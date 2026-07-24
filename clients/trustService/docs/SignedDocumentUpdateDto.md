

# SignedDocumentUpdateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**url** | **String** |  |  [optional] |
|**type** | **String** |  |  [optional] |
|**title** | **String** |  |  |
|**contentType** | **String** |  |  [optional] |
|**contactId** | **String** |  |  |
|**documentStandard** | [**DocumentStandardEnum**](#DocumentStandardEnum) |  |  [optional] |
|**trustDocumentType** | [**TrustDocumentTypeEnum**](#TrustDocumentTypeEnum) |  |  [optional] |
|**correlationId** | **String** |  |  [optional] |
|**externalReference** | **String** |  |  [optional] |



## Enum: DocumentStandardEnum

| Name | Value |
|---- | -----|
| NONE | &quot;None&quot; |
| UBL | &quot;Ubl&quot; |
| PDF | &quot;Pdf&quot; |
| XML | &quot;Xml&quot; |
| EMAIL | &quot;Email&quot; |
| JSON | &quot;Json&quot; |
| OTHER | &quot;Other&quot; |



## Enum: TrustDocumentTypeEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| INVOICE | &quot;Invoice&quot; |
| CREDIT_NOTE | &quot;CreditNote&quot; |
| DEBIT_NOTE | &quot;DebitNote&quot; |
| CONTRACT | &quot;Contract&quot; |
| CERTIFICATE | &quot;Certificate&quot; |
| EMAIL | &quot;Email&quot; |
| AUTHORITY_RESPONSE | &quot;AuthorityResponse&quot; |
| OTHER | &quot;Other&quot; |



