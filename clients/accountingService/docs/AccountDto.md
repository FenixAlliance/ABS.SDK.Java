

# AccountDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**group** | **Boolean** |  |  [optional] |
|**frozen** | **Boolean** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**code** | **String** |  |  [optional] |
|**path** | **String** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**prefix** | **String** |  |  [optional] |
|**balance** | **Double** |  |  [optional] |
|**currencyId** | **String** |  |  [optional] |
|**contactId** | **String** |  |  [optional] |
|**accountType** | **String** |  |  [optional] |
|**qualifiedName** | **String** |  |  [optional] |
|**accountTypeId** | **String** |  |  [optional] |
|**debitsBalance** | **Double** |  |  [optional] |
|**creditsBalance** | **Double** |  |  [optional] |
|**balanceInUsd** | **Double** |  |  [optional] |
|**debitsBalanceInUsd** | **Double** |  |  [optional] |
|**creditsBalanceInUsd** | **Double** |  |  [optional] |
|**forexRate** | **Double** |  |  [optional] |
|**parentAccountId** | **String** |  |  [optional] |
|**tenantId** | **String** |  |  [optional] |
|**enrollmentId** | **String** |  |  [optional] |
|**childrenAccountsCount** | **Integer** |  |  [optional] |
|**accountCategory** | [**AccountCategoryEnum**](#AccountCategoryEnum) |  |  [optional] |
|**isContra** | **Boolean** |  |  [optional] |
|**isMonetary** | **Boolean** |  |  [optional] |
|**incomeStatementSubType** | [**IncomeStatementSubTypeEnum**](#IncomeStatementSubTypeEnum) |  |  [optional] |
|**normalBalance** | [**NormalBalanceEnum**](#NormalBalanceEnum) |  |  [optional] |
|**balanceAmount** | [**Money**](Money.md) |  |  [optional] |
|**creditsBalanceAmount** | [**Money**](Money.md) |  |  [optional] |
|**debitsBalanceAmount** | [**Money**](Money.md) |  |  [optional] |
|**balanceAmountInUsd** | [**Money**](Money.md) |  |  [optional] |
|**debitsBalanceAmountInUsd** | [**Money**](Money.md) |  |  [optional] |
|**creditsBalanceAmountInUsd** | [**Money**](Money.md) |  |  [optional] |



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



## Enum: NormalBalanceEnum

| Name | Value |
|---- | -----|
| DEBIT | &quot;Debit&quot; |
| CREDIT | &quot;Credit&quot; |



