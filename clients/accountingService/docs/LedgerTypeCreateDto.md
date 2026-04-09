

# LedgerTypeCreateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**name** | **String** |  |  |
|**ledgerClass** | [**LedgerClassEnum**](#LedgerClassEnum) |  |  [optional] |
|**tenantId** | **String** |  |  [optional] |
|**enrollmentId** | **String** |  |  [optional] |



## Enum: LedgerClassEnum

| Name | Value |
|---- | -----|
| ASSETS | &quot;Assets&quot; |
| EQUITY | &quot;Equity&quot; |
| GAINS | &quot;Gains&quot; |
| LOSSES | &quot;Losses&quot; |
| REVENUE | &quot;Revenue&quot; |
| EXPENSES | &quot;Expenses&quot; |
| LIABILITIES | &quot;Liabilities&quot; |



