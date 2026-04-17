

# AssetCreateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**assetClass** | [**AssetClassEnum**](#AssetClassEnum) |  |  [optional] |
|**assetOwner** | [**AssetOwnerEnum**](#AssetOwnerEnum) |  |  [optional] |
|**isExistingAsset** | **Boolean** |  |  [optional] |
|**calculateDepreciation** | **Boolean** |  |  [optional] |
|**allowMonthlyDepreciation** | **Boolean** |  |  [optional] |
|**openingDepreciation** | **Double** |  |  [optional] |
|**purchaseDate** | **OffsetDateTime** |  |  [optional] |
|**purchasePrice** | **Double** |  |  [optional] |
|**currencyId** | **String** |  |  [optional] |
|**itemId** | **String** |  |  [optional] |
|**assetCategoryId** | **String** |  |  [optional] |
|**purchaseInvoiceId** | **String** |  |  [optional] |
|**purchaseReceiptId** | **String** |  |  [optional] |
|**assetLocationId** | **String** |  |  [optional] |
|**contactId** | **String** |  |  [optional] |
|**organizationDepartmentId** | **String** |  |  [optional] |



## Enum: AssetClassEnum

| Name | Value |
|---- | -----|
| FIXED | &quot;Fixed&quot; |
| STOCK | &quot;Stock&quot; |



## Enum: AssetOwnerEnum

| Name | Value |
|---- | -----|
| BUSINESS | &quot;Business&quot; |
| ORGANIZATION | &quot;Organization&quot; |
| CONTACT | &quot;Contact&quot; |
| SUPPLIER | &quot;Supplier&quot; |



