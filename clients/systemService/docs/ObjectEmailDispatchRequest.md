

# ObjectEmailDispatchRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** |  |  |
|**message** | **String** |  |  |
|**buttonLink** | **URI** |  |  [optional] |
|**buttonText** | **String** |  |  [optional] |
|**alertMessage** | **String** |  |  [optional] |
|**alertType** | [**AlertTypeEnum**](#AlertTypeEnum) |  |  [optional] |
|**culture** | **String** |  |  |
|**uiCulture** | **String** |  |  |
|**recipients** | **List&lt;String&gt;** |  |  |
|**contactIds** | **List&lt;String&gt;** |  |  [optional] |
|**tenantIds** | **List&lt;String&gt;** |  |  [optional] |
|**userIds** | **List&lt;String&gt;** |  |  [optional] |
|**templateUrl** | **URI** |  |  [optional] |
|**emailTemplateId** | **String** |  |  [optional] |
|**payload** | **Object** |  |  [optional] |



## Enum: AlertTypeEnum

| Name | Value |
|---- | -----|
| NONE | &quot;None&quot; |
| INFO | &quot;Info&quot; |
| ERROR | &quot;Error&quot; |
| WARNING | &quot;Warning&quot; |
| SUCCESS | &quot;Success&quot; |
| ACTION | &quot;Action&quot; |
| ALERT | &quot;Alert&quot; |



