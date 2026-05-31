

# PaymentResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**test** | **Boolean** |  |  [optional] |
|**ip** | **String** |  |  [optional] |
|**bank** | **String** |  |  [optional] |
|**status** | **String** |  |  [optional] |
|**errors** | **Object** |  |  [optional] |
|**response** | **String** |  |  [optional] |
|**authCode** | **String** |  |  [optional] |
|**paymentID** | **String** |  |  [optional] |
|**franchise** | **String** |  |  [optional] |
|**signature** | **String** |  |  [optional] |
|**paymentStatus** | [**PaymentStatusEnum**](#PaymentStatusEnum) |  |  [optional] |



## Enum: PaymentStatusEnum

| Name | Value |
|---- | -----|
| UNSET | &quot;Unset&quot; |
| ACCEPTED | &quot;Accepted&quot; |
| REJECTED | &quot;Rejected&quot; |
| ON_HOLD | &quot;OnHold&quot; |
| FAILED | &quot;Failed&quot; |
| REVERSED | &quot;Reversed&quot; |
| RETAINED | &quot;Retained&quot; |
| INITIALIZED | &quot;Initialized&quot; |
| EXPIRED | &quot;Expired&quot; |
| ABANDONED | &quot;Abandoned&quot; |
| CANCELLED | &quot;Cancelled&quot; |
| ACCEPTED_RETAINED | &quot;AcceptedRetained&quot; |



