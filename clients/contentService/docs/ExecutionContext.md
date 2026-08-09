

# ExecutionContext


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**isAuthenticated** | **Boolean** |  |  [optional] |
|**currentCartId** | **String** |  |  [optional] [readonly] |
|**currentUserId** | **String** |  |  [optional] [readonly] |
|**currentTenantId** | **String** |  |  [optional] [readonly] |
|**currentPortalId** | **String** |  |  [optional] [readonly] |
|**currentEnrollmentId** | **String** |  |  [optional] [readonly] |
|**currencyId** | **String** |  |  [optional] [readonly] |
|**pageSize** | **Integer** |  |  [optional] |
|**dateFormat** | **String** |  |  [optional] |
|**currencyFormat** | **String** |  |  [optional] |
|**dateTimeFormat** | **String** |  |  [optional] |
|**toDateDataSummaries** | **OffsetDateTime** |  |  [optional] |
|**fromDateDataSummaries** | **OffsetDateTime** |  |  [optional] |
|**authorization** | [**AuthResult**](AuthResult.md) |  |  [optional] |
|**user** | [**ExtendedUserDto**](ExtendedUserDto.md) |  |  [optional] |
|**currentTenant** | [**ExtendedTenantDto**](ExtendedTenantDto.md) |  |  [optional] |
|**currentEnrollment** | [**TenantEnrollmentDto**](TenantEnrollmentDto.md) |  |  [optional] |
|**selectedTenantMappings** | [**CrmContext**](CrmContext.md) |  |  [optional] |
|**portalOwnerMappings** | [**CrmContext**](CrmContext.md) |  |  [optional] |
|**rootTenantMappings** | [**CrmContext**](CrmContext.md) |  |  [optional] |
|**cart** | [**CartDto**](CartDto.md) |  |  [optional] |
|**currency** | [**CurrencyDto**](CurrencyDto.md) |  |  [optional] |
|**forexRates** | [**ForexRatesDto**](ForexRatesDto.md) |  |  [optional] |
|**exchangeRate** | [**Money**](Money.md) |  |  [optional] |
|**country** | [**CountryDto**](CountryDto.md) |  |  [optional] |
|**rootTenant** | [**TenantDto**](TenantDto.md) |  |  [optional] |
|**currentPortal** | [**WebPortalDto**](WebPortalDto.md) |  |  [optional] |
|**tenants** | [**List&lt;ExtendedTenantDto&gt;**](ExtendedTenantDto.md) |  |  [optional] |
|**enrollments** | [**List&lt;ExtendedTenantEnrollmentDto&gt;**](ExtendedTenantEnrollmentDto.md) |  |  [optional] |
|**availablePortals** | [**List&lt;WebPortalDto&gt;**](WebPortalDto.md) |  |  [optional] |
|**invitations** | [**List&lt;ExtendedInviteDto&gt;**](ExtendedInviteDto.md) |  |  [optional] |
|**grantedPermissions** | **List&lt;String&gt;** |  |  [optional] |
|**accessibleFeatures** | [**List&lt;SuiteLicenseFeatureDto&gt;**](SuiteLicenseFeatureDto.md) |  |  [optional] |
|**cultureName** | **String** |  |  [optional] [readonly] |
|**timezoneId** | **String** |  |  [optional] |



