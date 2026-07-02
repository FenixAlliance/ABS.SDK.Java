

# SupportRequestAttachmentCreateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**notes** | **String** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**author** | **String** |  |  [optional] |
|**isFolder** | **Boolean** |  |  [optional] |
|**fileName** | **String** |  |  [optional] |
|**_abstract** | **String** |  |  [optional] |
|**keyWords** | **String** |  |  [optional] |
|**validResponse** | **Boolean** |  |  [optional] |
|**parentFileUploadId** | **String** |  |  [optional] |
|**filePath** | **String** |  |  [optional] |
|**publicAccessType** | [**PublicAccessTypeEnum**](#PublicAccessTypeEnum) |  |  [optional] |
|**metadata** | **String** |  |  [optional] |
|**supportRequestId** | **String** |  |  [optional] |



## Enum: PublicAccessTypeEnum

| Name | Value |
|---- | -----|
| FALSE | &quot;false&quot; |
| CONTAINER | &quot;Container&quot; |
| BLOB | &quot;Blob&quot; |
| UNKNOWN | &quot;Unknown&quot; |



