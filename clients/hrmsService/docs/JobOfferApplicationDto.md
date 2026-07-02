

# JobOfferApplicationDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**start** | **OffsetDateTime** |  |  [optional] |
|**end** | **OffsetDateTime** |  |  [optional] |
|**salaryExpectation** | **Double** |  |  [optional] |
|**currencyId** | **String** |  |  [optional] |
|**curriculumId** | **String** |  |  [optional] |
|**curriculumCoverId** | **String** |  |  [optional] |
|**jobOfferId** | **String** |  |  [optional] |
|**partnerProfileId** | **String** |  |  [optional] |
|**jobApplicantProfileId** | **String** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUBMITTED | &quot;Submitted&quot; |
| UNDER_REVIEW | &quot;UnderReview&quot; |
| INTERVIEWING | &quot;Interviewing&quot; |
| OFFERED | &quot;Offered&quot; |
| HIRED | &quot;Hired&quot; |
| REJECTED | &quot;Rejected&quot; |
| WITHDRAWN | &quot;Withdrawn&quot; |



