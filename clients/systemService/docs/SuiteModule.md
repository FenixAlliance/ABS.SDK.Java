

# SuiteModule


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enable** | **Boolean** |  |  [optional] |
|**markedForDeletion** | **Boolean** |  |  [optional] |
|**active** | **Boolean** |  |  [optional] [readonly] |
|**order** | **Integer** |  |  [optional] |
|**id** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**fullName** | **String** |  |  [optional] [readonly] |
|**description** | **String** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**category** | [**CategoryEnum**](#CategoryEnum) |  |  [optional] |
|**_configuration** | **String** |  |  [optional] |
|**author** | **String** |  |  [optional] |
|**authorUrl** | **String** |  |  [optional] |
|**license** | **String** |  |  [optional] |
|**requireLicenseAcceptance** | **Boolean** |  |  [optional] |
|**repository** | **String** |  |  [optional] |
|**icon** | **String** |  |  [optional] |
|**image** | **String** |  |  [optional] |
|**nuSpecPath** | **String** |  |  [optional] |
|**manifest** | **String** |  |  [optional] |
|**logo** | **String** |  |  [optional] |
|**website** | **String** |  |  [optional] |
|**documentation** | **String** |  |  [optional] |
|**url** | **String** |  |  [optional] |
|**path** | **String** |  |  [optional] |
|**openApiDefinitionSpec** | [**IOpenApiDefinitionSpec**](IOpenApiDefinitionSpec.md) |  |  [optional] |
|**swaggerSpecs** | [**List&lt;IOpenApiDefinitionSpec&gt;**](IOpenApiDefinitionSpec.md) |  |  [optional] |
|**assemblyPaths** | **List&lt;String&gt;** |  |  [optional] |
|**requiredPermissions** | **List&lt;String&gt;** |  |  [optional] [readonly] |
|**version** | **String** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| MODULE | &quot;Module&quot; |
| INTEGRATION | &quot;Integration&quot; |
| STUDIO_MODULE | &quot;StudioModule&quot; |
| STUDIO_INTEGRATION | &quot;StudioIntegration&quot; |
| WASM_MODULE | &quot;WasmModule&quot; |
| WASM_INTEGRATION | &quot;WasmIntegration&quot; |



## Enum: CategoryEnum

| Name | Value |
|---- | -----|
| OTHER | &quot;Other&quot; |
| FINANCE_AND_ACCOUNTING | &quot;FinanceAndAccounting&quot; |
| SALES_AND_COMMERCE | &quot;SalesAndCommerce&quot; |
| MARKETING_AND_ENGAGEMENT | &quot;MarketingAndEngagement&quot; |
| CUSTOMER_RELATIONS | &quot;CustomerRelations&quot; |
| OPERATIONS_AND_SUPPLY_CHAIN | &quot;OperationsAndSupplyChain&quot; |
| PROJECTS_AND_PRODUCTIVITY | &quot;ProjectsAndProductivity&quot; |
| PEOPLE_AND_WORKFORCE | &quot;PeopleAndWorkforce&quot; |
| LEARNING_AND_EDUCATION | &quot;LearningAndEducation&quot; |
| CONTENT_AND_WEB | &quot;ContentAndWeb&quot; |
| DATA_AND_ANALYTICS | &quot;DataAndAnalytics&quot; |
| ARTIFICIAL_INTELLIGENCE | &quot;ArtificialIntelligence&quot; |
| SECURITY_AND_IDENTITY | &quot;SecurityAndIdentity&quot; |
| TRUST_AND_COMPLIANCE | &quot;TrustAndCompliance&quot; |
| COMMUNICATION | &quot;Communication&quot; |
| DEVELOPER_AND_PLATFORM | &quot;DeveloperAndPlatform&quot; |
| INDUSTRY_SOLUTIONS | &quot;IndustrySolutions&quot; |



