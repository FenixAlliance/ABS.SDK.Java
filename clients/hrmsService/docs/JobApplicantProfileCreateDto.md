

# JobApplicantProfileCreateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**type** | **String** |  |  [optional] |
|**contactId** | **String** |  |  [optional] |
|**contact** | [**ContactCreateDto**](ContactCreateDto.md) |  |  [optional] |
|**about** | **String** |  |  [optional] |
|**avatarUrl** | **String** |  |  [optional] |
|**data** | **String** |  |  [optional] |
|**dataLabel** | **String** |  |  [optional] |
|**data1** | **String** |  |  [optional] |
|**data1Label** | **String** |  |  [optional] |
|**data2** | **String** |  |  [optional] |
|**data2Label** | **String** |  |  [optional] |
|**data3** | **String** |  |  [optional] |
|**data3Label** | **String** |  |  [optional] |
|**data4** | **String** |  |  [optional] |
|**data4Label** | **String** |  |  [optional] |
|**data5** | **String** |  |  [optional] |
|**data5Label** | **String** |  |  [optional] |
|**data6** | **String** |  |  [optional] |
|**data6Label** | **String** |  |  [optional] |
|**data7** | **String** |  |  [optional] |
|**data7Label** | **String** |  |  [optional] |
|**data8** | **String** |  |  [optional] |
|**data8Label** | **String** |  |  [optional] |
|**data9** | **String** |  |  [optional] |
|**data9Label** | **String** |  |  [optional] |
|**availableForHire** | **Boolean** |  |  [optional] |
|**careerLevel** | [**CareerLevelEnum**](#CareerLevelEnum) |  |  [optional] |
|**experienceInYears** | **Integer** |  |  [optional] |
|**currentSalary** | **Double** |  |  [optional] |
|**minSalaryExpectation** | **Double** |  |  [optional] |
|**maxSalaryExpectation** | **Double** |  |  [optional] |
|**currencyId** | **String** |  |  [optional] |



## Enum: CareerLevelEnum

| Name | Value |
|---- | -----|
| JUNIOR | &quot;Junior&quot; |
| INTERMEDIATE | &quot;Intermediate&quot; |
| MID_LEVEL | &quot;MidLevel&quot; |
| EXECUTIVE | &quot;Executive&quot; |
| SENIOR | &quot;Senior&quot; |



