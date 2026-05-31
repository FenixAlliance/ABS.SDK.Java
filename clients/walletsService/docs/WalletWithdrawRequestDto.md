

# WalletWithdrawRequestDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**requestedWithdrawAmount** | **Double** |  |  [optional] |
|**requestedWithdrawAmountInUSD** | **Double** |  |  [optional] |
|**walletWithdrawRequestStatus** | [**WalletWithdrawRequestStatusEnum**](#WalletWithdrawRequestStatusEnum) |  |  [optional] |
|**currencyId** | **String** |  |  [optional] |
|**businessId** | **String** |  |  [optional] |
|**walletAccountId** | **String** |  |  [optional] |
|**bankAccountId** | **String** |  |  [optional] |



## Enum: WalletWithdrawRequestStatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;Pending&quot; |
| PROCESSED | &quot;Processed&quot; |
| CANCELLED | &quot;Cancelled&quot; |
| ON_HOLD | &quot;OnHold&quot; |
| DENIED | &quot;Denied&quot; |



