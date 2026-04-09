

# ReceiptDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**paymentId** | **String** |  |  [optional] |
|**tenantId** | **String** |  |  [optional] |
|**closed** | **Boolean** |  |  [optional] |
|**accountHolderId** | **String** |  |  [optional] |
|**contactId** | **String** |  |  [optional] |
|**enrollmentId** | **String** |  |  [optional] |
|**receiptType** | [**ReceiptTypeEnum**](#ReceiptTypeEnum) |  |  [optional] |
|**orderId** | **String** |  |  [optional] |
|**invoiceId** | **String** |  |  [optional] |



## Enum: ReceiptTypeEnum

| Name | Value |
|---- | -----|
| PAYMENT_RECEIPT | &quot;PaymentReceipt&quot; |
| PURCHASE_RECEIPT | &quot;PurchaseReceipt&quot; |



