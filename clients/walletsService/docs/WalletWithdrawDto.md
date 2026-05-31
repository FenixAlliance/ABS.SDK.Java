

# WalletWithdrawDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**withdrawStatus** | [**WithdrawStatusEnum**](#WithdrawStatusEnum) |  |  [optional] |
|**walletAccountId** | **String** |  |  [optional] |
|**walletWithdrawRequestId** | **String** |  |  [optional] |
|**balanceBeforeWithdraw** | **Double** |  |  [optional] |
|**balanceAfterWithdraw** | **Double** |  |  [optional] |
|**withdrawedAmount** | **Double** |  |  [optional] |
|**currencyId** | **String** |  |  [optional] |



## Enum: WithdrawStatusEnum

| Name | Value |
|---- | -----|
| ON_HOLD | &quot;OnHold&quot; |
| RETAINED | &quot;Retained&quot; |
| PROCESSING | &quot;Processing&quot; |
| ON_VALIDATION | &quot;OnValidation&quot; |
| PROCESSED | &quot;Processed&quot; |



