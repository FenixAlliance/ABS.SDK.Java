

# ExtendedOrderDto


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
|**orderLinesCount** | **Integer** |  |  [optional] |
|**quoteId** | **String** |  |  [optional] |
|**walletId** | **String** |  |  [optional] |
|**paymentTermId** | **String** |  |  [optional] |
|**parentOrderId** | **String** |  |  [optional] |
|**shippingMethodId** | **String** |  |  [optional] |
|**billingLocationId** | **String** |  |  [optional] |
|**shippingLocationId** | **String** |  |  [optional] |
|**qualifiedIdentifier** | **String** |  |  [optional] |
|**costCalculationMethod** | [**CostCalculationMethodEnum**](#CostCalculationMethodEnum) |  |  [optional] |
|**freightTerms** | [**FreightTermsEnum**](#FreightTermsEnum) |  |  [optional] |
|**orderStatus** | [**OrderStatusEnum**](#OrderStatusEnum) |  |  [optional] |
|**requestedDeliveryDate** | **OffsetDateTime** |  |  [optional] |
|**customTaxAmount** | **Double** |  |  [optional] |
|**customTotalAmount** | **Double** |  |  [optional] |
|**customDetailAmount** | **Double** |  |  [optional] |
|**customProfitAmount** | **Double** |  |  [optional] |
|**customDiscountsAmount** | **Double** |  |  [optional] |
|**customSurchargesAmount** | **Double** |  |  [optional] |
|**customShippingTaxAmount** | **Double** |  |  [optional] |
|**customShippingCostAmount** | **Double** |  |  [optional] |
|**customWithholdingTaxAmount** | **Double** |  |  [optional] |
|**user** | [**UserDto**](UserDto.md) |  |  [optional] |
|**tenant** | [**TenantDto**](TenantDto.md) |  |  [optional] |
|**individual** | [**ContactDto**](ContactDto.md) |  |  [optional] |
|**organization** | [**ContactDto**](ContactDto.md) |  |  [optional] |
|**receiverTenant** | [**TenantDto**](TenantDto.md) |  |  [optional] |
|**enrollment** | [**TenantEnrolmentDto**](TenantEnrolmentDto.md) |  |  [optional] |



## Enum: CostCalculationMethodEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



## Enum: FreightTermsEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



## Enum: OrderStatusEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |
| NUMBER_6 | 6 |
| NUMBER_7 | 7 |
| NUMBER_8 | 8 |
| NUMBER_9 | 9 |
| NUMBER_10 | 10 |



