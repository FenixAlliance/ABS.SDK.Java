

# BlogAuthorDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**qualifiedName** | **String** |  |  [optional] |
|**birthday** | **OffsetDateTime** |  |  [optional] |
|**firstName** | **String** |  |  [optional] |
|**lastName** | **String** |  |  [optional] |
|**publicName** | **String** |  |  [optional] |
|**languageId** | **String** |  |  [optional] |
|**timezoneId** | **String** |  |  [optional] |
|**countryId** | **String** |  |  [optional] |
|**cityId** | **String** |  |  [optional] |
|**stateId** | **String** |  |  [optional] |
|**about** | **String** |  |  [optional] |
|**jobTitle** | **String** |  |  [optional] |
|**coverUrl** | **String** |  |  [optional] |
|**avatarUrl** | **String** |  |  [optional] |
|**gitHubUrl** | **String** |  |  [optional] |
|**websiteUrl** | **String** |  |  [optional] |
|**twitterUrl** | **String** |  |  [optional] |
|**facebookUrl** | **String** |  |  [optional] |
|**youTubeUrl** | **String** |  |  [optional] |
|**linkedInUrl** | **String** |  |  [optional] |
|**instagramUrl** | **String** |  |  [optional] |
|**socialFeedId** | **String** |  |  [optional] |
|**socialProfileId** | **String** |  |  [optional] |
|**gender** | [**GenderEnum**](#GenderEnum) |  |  [optional] |
|**walletId** | **String** |  |  [optional] |
|**status** | **String** |  |  [optional] |
|**userName** | **String** |  |  [optional] |
|**publicIdentifier** | **String** |  |  [optional] |
|**phoneNumberConfirmed** | **Boolean** |  |  [optional] |
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



