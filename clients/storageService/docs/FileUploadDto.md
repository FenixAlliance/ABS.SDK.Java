

# FileUploadDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**notes** | **String** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**author** | **String** |  |  [optional] |
|**isFolder** | **Boolean** |  |  [optional] |
|**hash** | **String** |  |  [optional] |
|**fileUrl** | **String** |  |  [optional] |
|**filePath** | **String** |  |  [optional] |
|**storageKey** | **String** |  |  [optional] |
|**storageProviderKey** | **String** |  |  [optional] |
|**fileName** | **String** |  |  [optional] |
|**_abstract** | **String** |  |  [optional] |
|**keyWords** | **String** |  |  [optional] |
|**metadata** | **String** |  |  [optional] |
|**fileLength** | **Long** |  |  [optional] |
|**contentType** | **String** |  |  [optional] |
|**parentFileId** | **String** |  |  [optional] |
|**validResponse** | **Boolean** |  |  [optional] |
|**userId** | **String** |  |  [optional] |
|**tenantId** | **String** |  |  [optional] |
|**enrollmentId** | **String** |  |  [optional] |
|**socialProfileId** | **String** |  |  [optional] |
|**folderPath** | **String** |  |  [optional] |
|**scanStatus** | [**ScanStatusEnum**](#ScanStatusEnum) |  |  [optional] |
|**thumbnailStatus** | [**ThumbnailStatusEnum**](#ThumbnailStatusEnum) |  |  [optional] |
|**hasThumbnail** | **Boolean** |  |  [optional] [readonly] |
|**thumbnailStorageKey** | **String** |  |  [optional] |
|**thumbnailContentType** | **String** |  |  [optional] |
|**thumbnailWidth** | **Integer** |  |  [optional] |
|**thumbnailHeight** | **Integer** |  |  [optional] |
|**publicAccessType** | [**PublicAccessTypeEnum**](#PublicAccessTypeEnum) |  |  [optional] |



## Enum: ScanStatusEnum

| Name | Value |
|---- | -----|
| NOT_REQUIRED | &quot;NotRequired&quot; |
| PENDING | &quot;Pending&quot; |
| CLEAN | &quot;Clean&quot; |
| INFECTED | &quot;Infected&quot; |
| FAILED | &quot;Failed&quot; |
| QUARANTINED | &quot;Quarantined&quot; |



## Enum: ThumbnailStatusEnum

| Name | Value |
|---- | -----|
| NOT_REQUIRED | &quot;NotRequired&quot; |
| PENDING | &quot;Pending&quot; |
| READY | &quot;Ready&quot; |
| FAILED | &quot;Failed&quot; |
| UNSUPPORTED | &quot;Unsupported&quot; |



## Enum: PublicAccessTypeEnum

| Name | Value |
|---- | -----|
| FALSE | &quot;false&quot; |
| CONTAINER | &quot;Container&quot; |
| BLOB | &quot;Blob&quot; |
| UNKNOWN | &quot;Unknown&quot; |



