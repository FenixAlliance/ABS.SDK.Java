

# ExtendedDealUnitDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**closed** | **Boolean** |  |  [optional] |
|**type** | **String** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**userId** | **String** |  |  [optional] |
|**tenantId** | **String** |  |  [optional] |
|**currencyId** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**priceListId** | **String** |  |  [optional] |
|**enrollmentId** | **String** |  |  [optional] |
|**individualId** | **String** |  |  [optional] |
|**organizationId** | **String** |  |  [optional] |
|**receiverTenantId** | **String** |  |  [optional] |
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
|**customerNotes** | **String** |  |  [optional] |
|**forexRate** | **Double** |  |  [optional] |
|**total** | **Double** |  |  [optional] |
|**totalTaxes** | **Double** |  |  [optional] |
|**totalTaxBase** | **Double** |  |  [optional] |
|**totalDiscounts** | **Double** |  |  [optional] |
|**totalSurcharges** | **Double** |  |  [optional] |
|**totalGlobalDiscounts** | **Double** |  |  [optional] |
|**totalGlobalSurcharges** | **Double** |  |  [optional] |
|**totalTaxesInUsd** | **Double** |  |  [optional] |
|**totalAmountInUsd** | **Double** |  |  [optional] |
|**totalProfitInUsd** | **Double** |  |  [optional] |
|**totalTaxBaseInUsd** | **Double** |  |  [optional] |
|**totalDiscountsInUsd** | **Double** |  |  [optional] |
|**totalSurchargesInUsd** | **Double** |  |  [optional] |
|**totalDetailAmountInUsd** | **Double** |  |  [optional] |
|**totalGlobalDiscountsInUsd** | **Double** |  |  [optional] |
|**totalGlobalSurchargesInUsd** | **Double** |  |  [optional] |
|**totalWithholdingTaxesInUsd** | **Double** |  |  [optional] |
|**totalShippingCostInUsd** | **Double** |  |  [optional] |
|**totalShippingTaxesInUsd** | **Double** |  |  [optional] |
|**currency** | [**Currency**](Currency.md) |  |  [optional] |
|**totalInUsd** | [**Money**](Money.md) |  |  [optional] |
|**totalTaxAmountInUsd** | [**Money**](Money.md) |  |  [optional] |
|**totalTaxBaseAmountInUsd** | [**Money**](Money.md) |  |  [optional] |
|**totalDiscountsAmountInUsd** | [**Money**](Money.md) |  |  [optional] |
|**totalSurchargesAmountInUsd** | [**Money**](Money.md) |  |  [optional] |
|**totalGlobalDiscountsAmountInUsd** | [**Money**](Money.md) |  |  [optional] |
|**totalGlobalSurchargesAmountInUsd** | [**Money**](Money.md) |  |  [optional] |
|**totalAmount** | [**Money**](Money.md) |  |  [optional] |
|**totalTaxAmount** | [**Money**](Money.md) |  |  [optional] |
|**totalTaxBaseAmount** | [**Money**](Money.md) |  |  [optional] |
|**totalDiscountsAmount** | [**Money**](Money.md) |  |  [optional] |
|**totalSurchargesAmount** | [**Money**](Money.md) |  |  [optional] |
|**totalGlobalDiscountsAmount** | [**Money**](Money.md) |  |  [optional] |
|**totalGlobalSurchargesAmount** | [**Money**](Money.md) |  |  [optional] |
|**ordered** | **Boolean** |  |  [optional] |
|**dealUnitFeedId** | **String** |  |  [optional] |
|**dealUnitFlowId** | **String** |  |  [optional] |
|**dealUnitFlowStageId** | **String** |  |  [optional] |
|**billingLocationId** | **String** |  |  [optional] |
|**shippingLocationId** | **String** |  |  [optional] |
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
|**linesCount** | **Integer** |  |  [optional] |
|**customTotalAmount** | **Double** |  |  [optional] |
|**customDetailAmount** | **Double** |  |  [optional] |
|**customProfitAmount** | **Double** |  |  [optional] |
|**customShippingCostAmount** | **Double** |  |  [optional] |
|**customWithholdingTaxAmount** | **Double** |  |  [optional] |
|**customSurchargesAmount** | **Double** |  |  [optional] |
|**customDiscountsAmount** | **Double** |  |  [optional] |
|**customShippingTaxAmount** | **Double** |  |  [optional] |
|**user** | [**UserDto**](UserDto.md) |  |  [optional] |
|**tenant** | [**TenantDto**](TenantDto.md) |  |  [optional] |
|**individual** | [**ContactDto**](ContactDto.md) |  |  [optional] |
|**organization** | [**ContactDto**](ContactDto.md) |  |  [optional] |
|**receiverTenant** | [**TenantDto**](TenantDto.md) |  |  [optional] |
|**enrollment** | [**TenantEnrolmentDto**](TenantEnrolmentDto.md) |  |  [optional] |



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



