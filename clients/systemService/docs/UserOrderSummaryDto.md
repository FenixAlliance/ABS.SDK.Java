

# UserOrderSummaryDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**orderType** | [**OrderTypeEnum**](#OrderTypeEnum) |  |  [optional] |
|**orderStatus** | [**OrderStatusEnum**](#OrderStatusEnum) |  |  [optional] |



## Enum: OrderTypeEnum

| Name | Value |
|---- | -----|
| SALES_ORDER | &quot;SalesOrder&quot; |
| PURCHASE_ORDER | &quot;PurchaseOrder&quot; |



## Enum: OrderStatusEnum

| Name | Value |
|---- | -----|
| NEW | &quot;New&quot; |
| PROCESSING | &quot;Processing&quot; |
| ACCEPTED | &quot;Accepted&quot; |
| DECLINED | &quot;Declined&quot; |
| SHIPPED | &quot;Shipped&quot; |
| DELIVERED | &quot;Delivered&quot; |
| ON_HOLD | &quot;OnHold&quot; |
| FAILED | &quot;Failed&quot; |
| FULFILLED | &quot;Fulfilled&quot; |
| CANCELLED | &quot;Cancelled&quot; |



