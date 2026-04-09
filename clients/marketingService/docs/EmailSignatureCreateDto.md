

# EmailSignatureCreateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**tenantId** | **String** |  |  [optional] |
|**enrollmentId** | **String** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**code** | **String** |  |  [optional] |
|**published** | **Boolean** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**htmlContent** | **String** |  |  [optional] |
|**featuredImageUrl** | **String** |  |  [optional] |
|**codeType** | [**CodeTypeEnum**](#CodeTypeEnum) |  |  [optional] |



## Enum: CodeTypeEnum

| Name | Value |
|---- | -----|
| RAZOR | &quot;Razor&quot; |
| C_SHARP | &quot;CSharp&quot; |
| CS_HTML | &quot;CSHtml&quot; |
| LIQUID | &quot;Liquid&quot; |
| HTML5 | &quot;Html5&quot; |
| MARKDOWN | &quot;Markdown&quot; |



