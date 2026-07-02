

# RequiredSkillRecordCreateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**skillId** | **String** |  |  |
|**jobOfferId** | **String** |  |  [optional] |
|**employerProfileId** | **String** |  |  [optional] |
|**experienceInYears** | **Integer** |  |  [optional] |
|**priority** | **Double** |  |  [optional] |
|**requiredSkillRecordType** | [**RequiredSkillRecordTypeEnum**](#RequiredSkillRecordTypeEnum) |  |  [optional] |



## Enum: RequiredSkillRecordTypeEnum

| Name | Value |
|---- | -----|
| MUST_HAVE | &quot;MustHave&quot; |
| OPTIONAL | &quot;Optional&quot; |



