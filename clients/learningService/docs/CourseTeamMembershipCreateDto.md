

# CourseTeamMembershipCreateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**courseId** | **String** |  |  |
|**instructorProfileId** | **String** |  |  |
|**courseTeamMembershipType** | [**CourseTeamMembershipTypeEnum**](#CourseTeamMembershipTypeEnum) |  |  [optional] |



## Enum: CourseTeamMembershipTypeEnum

| Name | Value |
|---- | -----|
| ADMIN | &quot;Admin&quot; |
| STAFF | &quot;Staff&quot; |



