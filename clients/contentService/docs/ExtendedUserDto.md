

# ExtendedUserDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**fullName** | **String** |  |  [optional] [readonly] |
|**qualifiedName** | **String** |  |  [optional] |
|**publicName** | **String** |  |  [optional] |
|**handler** | **String** |  |  [optional] |
|**lastName** | **String** |  |  [optional] |
|**firstName** | **String** |  |  [optional] |
|**coverUrl** | **String** |  |  [optional] |
|**avatarUrl** | **String** |  |  [optional] |
|**gitHubUrl** | **String** |  |  [optional] |
|**countryId** | **String** |  |  [optional] |
|**timezoneId** | **String** |  |  [optional] |
|**websiteUrl** | **String** |  |  [optional] |
|**twitterUrl** | **String** |  |  [optional] |
|**youTubeUrl** | **String** |  |  [optional] |
|**linkedInUrl** | **String** |  |  [optional] |
|**facebookUrl** | **String** |  |  [optional] |
|**instagramUrl** | **String** |  |  [optional] |
|**socialProfileId** | **String** |  |  [optional] |
|**birthday** | **OffsetDateTime** |  |  [optional] |
|**idProvider** | **String** |  |  [optional] |
|**languageId** | **String** |  |  [optional] |
|**gender** | [**GenderEnum**](#GenderEnum) |  |  [optional] |
|**cityId** | **String** |  |  [optional] |
|**stateId** | **String** |  |  [optional] |
|**email** | **String** |  |  [optional] |
|**about** | **String** |  |  [optional] |
|**jobTitle** | **String** |  |  [optional] |
|**socialFeedId** | **String** |  |  [optional] |
|**currentTenantId** | **String** |  |  [optional] |
|**currentEnrollmentId** | **String** |  |  [optional] |
|**status** | **String** |  |  [optional] |
|**cartId** | **String** |  |  [optional] |
|**walletId** | **String** |  |  [optional] |
|**userName** | **String** |  |  [optional] |
|**currencyId** | **String** |  |  [optional] |
|**phoneNumber** | **String** |  |  [optional] |
|**publicIdentifier** | **String** |  |  [optional] |
|**identityProvider** | **String** |  |  [optional] |
|**phoneNumberConfirmed** | **Boolean** |  |  [optional] |
|**emailConfirmed** | **Boolean** |  |  [optional] |
|**availability** | [**AvailabilityEnum**](#AvailabilityEnum) |  |  [optional] |
|**lockoutEnabled** | **Boolean** |  |  [optional] |
|**lockoutEnd** | **OffsetDateTime** |  |  [optional] |
|**enrollmentsCount** | **Integer** |  |  [optional] |
|**siteTheme** | [**SiteThemeEnum**](#SiteThemeEnum) |  |  [optional] |
|**cart** | [**CartDto**](CartDto.md) |  |  [optional] |
|**wallet** | [**WalletDto**](WalletDto.md) |  |  [optional] |
|**socialProfile** | [**SocialProfileDto**](SocialProfileDto.md) |  |  [optional] |
|**settings** | [**UserSettingsDto**](UserSettingsDto.md) |  |  [optional] |



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



## Enum: SiteThemeEnum

| Name | Value |
|---- | -----|
| SYSTEM | &quot;System&quot; |
| LIGHT | &quot;Light&quot; |
| DARK | &quot;Dark&quot; |



