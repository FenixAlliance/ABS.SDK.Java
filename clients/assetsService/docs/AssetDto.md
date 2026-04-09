

# AssetDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**tenantId** | **String** |  |  [optional] |
|**businessName** | **String** |  |  [optional] |
|**businessProfileRecordId** | **String** |  |  [optional] |
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
|**currencyCode** | **String** |  |  [optional] |
|**itemId** | **String** |  |  [optional] |
|**itemName** | **String** |  |  [optional] |
|**assetCategoryId** | **String** |  |  [optional] |
|**assetCategoryName** | **String** |  |  [optional] |
|**purchaseInvoiceId** | **String** |  |  [optional] |
|**purchaseInvoiceNumber** | **String** |  |  [optional] |
|**assetLocationId** | **String** |  |  [optional] |
|**assetLocationName** | **String** |  |  [optional] |
|**contactId** | **String** |  |  [optional] |
|**contactName** | **String** |  |  [optional] |
|**organizationDepartmentId** | **String** |  |  [optional] |
|**organizationDepartmentName** | **String** |  |  [optional] |
|**purchaseReceiptId** | **String** |  |  [optional] |



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



