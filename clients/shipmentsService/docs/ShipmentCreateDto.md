

# ShipmentCreateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**trackingCode** | **String** |  |  [optional] |
|**isInternational** | **Boolean** |  |  [optional] |
|**expectedShippingDate** | **OffsetDateTime** |  |  [optional] |
|**expectedDeliveryDate** | **OffsetDateTime** |  |  [optional] |
|**shippingTerms** | [**ShippingTermsEnum**](#ShippingTermsEnum) |  |  [optional] |
|**orderID** | **String** |  |  [optional] |



## Enum: ShippingTermsEnum

| Name | Value |
|---- | -----|
| NC | &quot;NC&quot; |
| EXW | &quot;EXW&quot; |
| FCA | &quot;FCA&quot; |
| FOB | &quot;FOB&quot; |
| FAS | &quot;FAS&quot; |
| CFR | &quot;CFR&quot; |
| CIF | &quot;CIF&quot; |
| CPT | &quot;CPT&quot; |
| CIP | &quot;CIP&quot; |
| DDP | &quot;DDP&quot; |
| DAP | &quot;DAP&quot; |
| DPU | &quot;DPU&quot; |



