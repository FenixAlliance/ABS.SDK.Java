

# LicenseKeyRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userId** | **UUID** |  |  [optional] |
|**tenantId** | **UUID** |  |  [optional] |
|**orderId** | **UUID** |  |  [optional] |
|**paymentId** | **UUID** |  |  [optional] |
|**invoiceId** | **UUID** |  |  [optional] |
|**enrollmentId** | **UUID** |  |  [optional] |
|**entitlementId** | **UUID** |  |  [optional] |
|**seats** | **Integer** |  |  [optional] |
|**licenseType** | [**LicenseTypeEnum**](#LicenseTypeEnum) |  |  [optional] |
|**expirationDate** | **OffsetDateTime** |  |  [optional] |
|**features** | [**List&lt;LicenseFeature&gt;**](LicenseFeature.md) |  |  [optional] |
|**additionalAttributes** | [**List&lt;AdditionalAttribute&gt;**](AdditionalAttribute.md) |  |  [optional] |



## Enum: LicenseTypeEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |



