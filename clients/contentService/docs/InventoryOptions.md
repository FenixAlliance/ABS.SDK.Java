

# InventoryOptions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enableStockManagement** | **Boolean** |  |  [optional] |
|**hideOutOfStockProducts** | **Boolean** |  |  [optional] |
|**enableLowStockNotifications** | **Boolean** |  |  [optional] |
|**enableOutOfStockNotifications** | **Boolean** |  |  [optional] |
|**stockNotificationRecipients** | **String** |  |  [optional] |
|**holdStock** | **Integer** |  |  [optional] |
|**lowStockThreshold** | **Integer** |  |  [optional] |
|**outOfStockThreshold** | **Integer** |  |  [optional] |
|**stockDisplayFormat** | [**StockDisplayFormatEnum**](#StockDisplayFormatEnum) |  |  [optional] |



## Enum: StockDisplayFormatEnum

| Name | Value |
|---- | -----|
| ALWAYS_DISPLAY_REMAINING_QUANTITY | &quot;AlwaysDisplayRemainingQuantity&quot; |
| ONLY_DISPLAY_REMAINING_QUANTITY_WHEN_STOCK_IS_LOW | &quot;OnlyDisplayRemainingQuantityWhenStockIsLow&quot; |
| NEVER_DISPLAY_REMAINING_QUANTITY | &quot;NeverDisplayRemainingQuantity&quot; |



