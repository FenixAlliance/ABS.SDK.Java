

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



