

# UserUpdateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**qualifiedName** | **String** |  |  [optional] |
|**birthday** | **OffsetDateTime** |  |  [optional] |
|**firstName** | **String** |  |  [optional] |
|**lastName** | **String** |  |  [optional] |
|**publicName** | **String** |  |  [optional] |
|**idProvider** | **String** |  |  [optional] |
|**gender** | [**GenderEnum**](#GenderEnum) |  |  [optional] |
|**email** | **String** |  |  [optional] |
|**about** | **String** |  |  [optional] |
|**status** | **String** |  |  [optional] |
|**jobTitle** | **String** |  |  [optional] |
|**timezoneId** | **String** |  |  [optional] |
|**languageId** | **String** |  |  [optional] |
|**currencyId** | **String** |  |  [optional] |
|**countryId** | **String** |  |  [optional] |
|**stateId** | **String** |  |  [optional] |
|**cityId** | **String** |  |  [optional] |
|**gitHubUrl** | **String** |  |  [optional] |
|**websiteUrl** | **String** |  |  [optional] |
|**twitterUrl** | **String** |  |  [optional] |
|**facebookUrl** | **String** |  |  [optional] |
|**youTubeUrl** | **String** |  |  [optional] |
|**linkedInUrl** | **String** |  |  [optional] |
|**instagramUrl** | **String** |  |  [optional] |
|**webUrl** | **String** |  |  [optional] |
|**availability** | [**AvailabilityEnum**](#AvailabilityEnum) |  |  [optional] |



## Enum: GenderEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| MALE | &quot;Male&quot; |
| FEMALE | &quot;Female&quot; |
| PREFER_NOT_TO_SAY | &quot;PreferNotToSay&quot; |



## Enum: AvailabilityEnum

| Name | Value |
|---- | -----|
| DND | &quot;DND&quot; |
| BUSY | &quot;Busy&quot; |
| AWAY | &quot;Away&quot; |
| OFFLINE | &quot;Offline&quot; |
| AVAILABLE | &quot;Available&quot; |



