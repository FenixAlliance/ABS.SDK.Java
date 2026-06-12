

# SupportTicketUpdateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**supportTicketStatus** | [**SupportTicketStatusEnum**](#SupportTicketStatusEnum) |  |  [optional] |
|**contactId** | **String** |  |  [optional] |
|**supportTicketTypeId** | **String** |  |  [optional] |
|**supportEntitlementId** | **String** |  |  [optional] |
|**supportPriorityId** | **String** |  |  [optional] |



## Enum: SupportTicketStatusEnum

| Name | Value |
|---- | -----|
| NEW | &quot;New&quot; |
| OPEN_AND_WAITING_FOR_AGENT | &quot;OpenAndWaitingForAgent&quot; |
| OPEN_AND_WAITING_FOR_CUSTOMER | &quot;OpenAndWaitingForCustomer&quot; |
| CLOSED | &quot;Closed&quot; |



