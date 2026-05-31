

# HttpRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**httpContext** | [**HttpContext**](HttpContext.md) |  |  [optional] |
|**method** | **String** |  |  [optional] |
|**scheme** | **String** |  |  [optional] |
|**isHttps** | **Boolean** |  |  [optional] |
|**host** | [**HostString**](HostString.md) |  |  [optional] |
|**pathBase** | [**PathString**](PathString.md) |  |  [optional] |
|**path** | [**PathString**](PathString.md) |  |  [optional] |
|**queryString** | [**QueryString**](QueryString.md) |  |  [optional] |
|**query** | [**List&lt;StringStringValuesKeyValuePair&gt;**](StringStringValuesKeyValuePair.md) |  |  [optional] |
|**protocol** | **String** |  |  [optional] |
|**headers** | **Map&lt;String, List&lt;String&gt;&gt;** |  |  [optional] [readonly] |
|**cookies** | [**List&lt;StringStringKeyValuePair&gt;**](StringStringKeyValuePair.md) |  |  [optional] |
|**contentLength** | **Long** |  |  [optional] |
|**contentType** | **String** |  |  [optional] |
|**body** | **File** |  |  [optional] |
|**bodyReader** | **File** |  |  [optional] [readonly] |
|**hasFormContentType** | **Boolean** |  |  [optional] [readonly] |
|**form** | [**List&lt;StringStringValuesKeyValuePair&gt;**](StringStringValuesKeyValuePair.md) |  |  [optional] |
|**routeValues** | **Map&lt;String, Object&gt;** |  |  [optional] |



