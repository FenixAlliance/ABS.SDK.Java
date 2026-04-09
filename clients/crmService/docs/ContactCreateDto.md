

# ContactCreateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**tenantId** | **String** |  |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**firstName** | **String** |  |  |
|**lastName** | **String** |  |  [optional] |
|**email** | **String** |  |  |
|**taxId** | **String** |  |  [optional] |
|**primaryContactId** | **String** |  |  [optional] |
|**qualifiedName** | **String** |  |  [optional] [readonly] |
|**about** | **String** |  |  [optional] |
|**countryId** | **String** |  |  [optional] |
|**stateId** | **String** |  |  [optional] |
|**cityId** | **String** |  |  [optional] |
|**mobilePhone** | **String** |  |  [optional] |
|**businessPhone** | **String** |  |  [optional] |
|**postalCode** | **String** |  |  [optional] |
|**duns** | **String** |  |  [optional] |
|**jobTitle** | **String** |  |  [optional] |
|**webUrl** | **String** |  |  [optional] |
|**currencyId** | **String** |  |  [optional] |
|**languageId** | **String** |  |  [optional] |
|**timezoneId** | **String** |  |  [optional] |
|**birthday** | **OffsetDateTime** |  |  [optional] |
|**streetLine1** | **String** |  |  [optional] |
|**streetLine2** | **String** |  |  [optional] |
|**gitHubUrl** | **String** |  |  [optional] |
|**twitchUrl** | **String** |  |  [optional] |
|**redditUrl** | **String** |  |  [optional] |
|**tikTokUrl** | **String** |  |  [optional] |
|**websiteUrl** | **String** |  |  [optional] |
|**twitterUrl** | **String** |  |  [optional] |
|**facebookUrl** | **String** |  |  [optional] |
|**youTubeUrl** | **String** |  |  [optional] |
|**linkedInUrl** | **String** |  |  [optional] |
|**instagramUrl** | **String** |  |  [optional] |
|**githubUsername** | **String** |  |  [optional] |
|**instagramUsername** | **String** |  |  [optional] |
|**tikTokUsername** | **String** |  |  [optional] |
|**stackExchangeUrl** | **String** |  |  [optional] |
|**stackOverflowUrl** | **String** |  |  [optional] |
|**parentContactId** | **String** |  |  [optional] |
|**faxNumber** | **String** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| INDIVIDUAL | &quot;Individual&quot; |
| ORGANIZATION | &quot;Organization&quot; |



