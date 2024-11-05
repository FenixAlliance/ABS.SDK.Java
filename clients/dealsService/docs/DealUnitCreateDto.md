

# DealUnitCreateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] [readonly] |
|**timestamp** | **OffsetDateTime** |  |  [optional] [readonly] |
|**closed** | **Boolean** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**userId** | **String** |  |  [optional] |
|**tenantId** | **String** |  |  [optional] |
|**priceListId** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**enrollmentId** | **String** |  |  [optional] |
|**individualId** | **String** |  |  [optional] |
|**paymentTermId** | **String** |  |  [optional] |
|**organizationId** | **String** |  |  [optional] |
|**receiverTenantId** | **String** |  |  [optional] |
|**currencyId** | **String** |  |  [optional] |
|**forexRate** | **Double** |  |  [optional] |
|**firstName** | **String** |  |  [optional] |
|**lastName** | **String** |  |  [optional] |
|**companyName** | **String** |  |  [optional] |
|**billingEmail** | **String** |  |  [optional] |
|**addressLine1** | **String** |  |  [optional] |
|**addressLine2** | **String** |  |  [optional] |
|**postalCode** | **String** |  |  [optional] |
|**countryId** | **String** |  |  [optional] |
|**stateId** | **String** |  |  [optional] |
|**cityId** | **String** |  |  [optional] |
|**dealUnitFlowId** | **String** |  |  [optional] |
|**dealUnitFlowStageId** | **String** |  |  [optional] |
|**partnerCreated** | **Boolean** |  |  [optional] |
|**partnerCollaboration** | **Boolean** |  |  [optional] |
|**proposedSolution** | **String** |  |  [optional] |
|**currentSituation** | **String** |  |  [optional] |
|**customerNeed** | **String** |  |  [optional] |
|**wonDate** | **OffsetDateTime** |  |  [optional] |
|**lostDate** | **OffsetDateTime** |  |  [optional] |
|**expiryDate** | **OffsetDateTime** |  |  [optional] |
|**deliveredDate** | **OffsetDateTime** |  |  [optional] |
|**closedTimestamp** | **OffsetDateTime** |  |  [optional] |
|**expectedCloseDate** | **OffsetDateTime** |  |  [optional] |
|**dealUnitStatus** | [**DealUnitStatusEnum**](#DealUnitStatusEnum) |  |  [optional] |
|**dealUnitPurchaseProcess** | [**DealUnitPurchaseProcessEnum**](#DealUnitPurchaseProcessEnum) |  |  [optional] |
|**dealUnitForecastCategory** | [**DealUnitForecastCategoryEnum**](#DealUnitForecastCategoryEnum) |  |  [optional] |
|**dealUnitAmountsCalculation** | [**DealUnitAmountsCalculationEnum**](#DealUnitAmountsCalculationEnum) |  |  [optional] |



## Enum: DealUnitStatusEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |



## Enum: DealUnitPurchaseProcessEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |



## Enum: DealUnitForecastCategoryEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |
| NUMBER_6 | 6 |



## Enum: DealUnitAmountsCalculationEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



