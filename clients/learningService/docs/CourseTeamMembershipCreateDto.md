

# CourseTeamMembershipCreateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**courseID** | **String** |  |  |
|**instructorProfileID** | **String** |  |  |
|**courseTeamMembershipType** | [**CourseTeamMembershipTypeEnum**](#CourseTeamMembershipTypeEnum) |  |  [optional] |



## Enum: CourseTeamMembershipTypeEnum

| Name | Value |
|---- | -----|
| ADMIN | &quot;Admin&quot; |
| STAFF | &quot;Staff&quot; |



