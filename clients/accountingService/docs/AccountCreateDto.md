

# AccountCreateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**group** | **Boolean** |  |  [optional] |
|**frozen** | **Boolean** |  |  [optional] |
|**name** | **String** |  |  |
|**code** | **String** |  |  [optional] |
|**path** | **String** |  |  [optional] |
|**prefix** | **String** |  |  [optional] |
|**currencyId** | **String** |  |  |
|**contactId** | **String** |  |  [optional] |
|**accountTypeId** | **String** |  |  [optional] |
|**parentAccountId** | **String** |  |  [optional] |
|**accountCategory** | [**AccountCategoryEnum**](#AccountCategoryEnum) |  |  |
|**isContra** | **Boolean** |  |  [optional] |
|**isMonetary** | **Boolean** |  |  [optional] |
|**incomeStatementSubType** | [**IncomeStatementSubTypeEnum**](#IncomeStatementSubTypeEnum) |  |  [optional] |



## Enum: AccountCategoryEnum

| Name | Value |
|---- | -----|
| ASSETS | &quot;Assets&quot; |
| EQUITY | &quot;Equity&quot; |
| REVENUE | &quot;Revenue&quot; |
| EXPENSE | &quot;Expense&quot; |
| LIABILITIES | &quot;Liabilities&quot; |



## Enum: IncomeStatementSubTypeEnum

| Name | Value |
|---- | -----|
| OPERATING_REVENUE | &quot;OperatingRevenue&quot; |
| GAIN | &quot;Gain&quot; |
| OPERATING_EXPENSE | &quot;OperatingExpense&quot; |
| LOSS | &quot;Loss&quot; |



