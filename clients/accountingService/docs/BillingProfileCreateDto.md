

# BillingProfileCreateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**contactId** | **String** |  |  [optional] |
|**taxId** | **String** |  |  |
|**phone** | **String** |  |  |
|**email** | **String** |  |  |
|**address** | **String** |  |  |
|**address1** | **String** |  |  [optional] |
|**address2** | **String** |  |  [optional] |
|**postalCode** | **String** |  |  |
|**businessName** | **String** |  |  |
|**commercialName** | **String** |  |  |
|**verificationDigit** | **String** |  |  [optional] |
|**economicActivityCode** | **String** |  |  [optional] |
|**economicActivityScheme** | **String** |  |  [optional] |
|**isPrimary** | **Boolean** |  |  [optional] |
|**establishmentCode** | **String** |  |  [optional] |
|**ticker** | **String** |  |  [optional] |
|**duns** | **String** |  |  [optional] |
|**isPublicCompany** | **Boolean** |  |  [optional] |
|**isFactaCustomer** | **Boolean** |  |  [optional] |
|**taxPayerType** | [**TaxPayerTypeEnum**](#TaxPayerTypeEnum) |  |  [optional] |
|**countryId** | **String** |  |  |
|**stateId** | **String** |  |  |
|**cityId** | **String** |  |  |
|**fiscalIdentificationTypeId** | **String** |  |  |
|**fiscalAuthorityId** | **String** |  |  |
|**fiscalRegimeId** | **String** |  |  |



## Enum: TaxPayerTypeEnum

| Name | Value |
|---- | -----|
| INDIVIDUAL | &quot;Individual&quot; |
| BUSINESS | &quot;Business&quot; |



