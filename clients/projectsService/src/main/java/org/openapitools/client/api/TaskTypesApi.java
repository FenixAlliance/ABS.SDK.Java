/*
 * ProjectsService
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0.1.4089
 * Contact: support@fenix-alliance.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.ErrorEnvelope;
import org.openapitools.client.model.TaskTypeCreateDto;
import org.openapitools.client.model.TaskTypeDto;
import org.openapitools.client.model.TaskTypeUpdateDto;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskTypesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public TaskTypesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TaskTypesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for apiV2ProjectsServiceTaskTypesPost
     * @param tenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param taskTypeCreateDto  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2ProjectsServiceTaskTypesPostCall(UUID tenantId, String apiVersion, String xApiVersion, TaskTypeCreateDto taskTypeCreateDto, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = taskTypeCreateDto;

        // create path and map variables
        String localVarPath = "/api/v2/ProjectsService/TaskTypes";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (tenantId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("tenantId", tenantId));
        }

        if (apiVersion != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("api-version", apiVersion));
        }

        if (xApiVersion != null) {
            localVarHeaderParams.put("x-api-version", localVarApiClient.parameterToString(xApiVersion));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/xml"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json",
            "application/xml"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Bearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV2ProjectsServiceTaskTypesPostValidateBeforeCall(UUID tenantId, String apiVersion, String xApiVersion, TaskTypeCreateDto taskTypeCreateDto, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new ApiException("Missing the required parameter 'tenantId' when calling apiV2ProjectsServiceTaskTypesPost(Async)");
        }

        return apiV2ProjectsServiceTaskTypesPostCall(tenantId, apiVersion, xApiVersion, taskTypeCreateDto, _callback);

    }

    /**
     * 
     * 
     * @param tenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param taskTypeCreateDto  (optional)
     * @return TaskTypeDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public TaskTypeDto apiV2ProjectsServiceTaskTypesPost(UUID tenantId, String apiVersion, String xApiVersion, TaskTypeCreateDto taskTypeCreateDto) throws ApiException {
        ApiResponse<TaskTypeDto> localVarResp = apiV2ProjectsServiceTaskTypesPostWithHttpInfo(tenantId, apiVersion, xApiVersion, taskTypeCreateDto);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param tenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param taskTypeCreateDto  (optional)
     * @return ApiResponse&lt;TaskTypeDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TaskTypeDto> apiV2ProjectsServiceTaskTypesPostWithHttpInfo(UUID tenantId, String apiVersion, String xApiVersion, TaskTypeCreateDto taskTypeCreateDto) throws ApiException {
        okhttp3.Call localVarCall = apiV2ProjectsServiceTaskTypesPostValidateBeforeCall(tenantId, apiVersion, xApiVersion, taskTypeCreateDto, null);
        Type localVarReturnType = new TypeToken<TaskTypeDto>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param tenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param taskTypeCreateDto  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2ProjectsServiceTaskTypesPostAsync(UUID tenantId, String apiVersion, String xApiVersion, TaskTypeCreateDto taskTypeCreateDto, final ApiCallback<TaskTypeDto> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2ProjectsServiceTaskTypesPostValidateBeforeCall(tenantId, apiVersion, xApiVersion, taskTypeCreateDto, _callback);
        Type localVarReturnType = new TypeToken<TaskTypeDto>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV2ProjectsServiceTaskTypesTaskTypeIdDelete
     * @param taskTypeId  (required)
     * @param tenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2ProjectsServiceTaskTypesTaskTypeIdDeleteCall(UUID taskTypeId, UUID tenantId, String apiVersion, String xApiVersion, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v2/ProjectsService/TaskTypes/{taskTypeId}"
            .replace("{" + "taskTypeId" + "}", localVarApiClient.escapeString(taskTypeId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (tenantId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("tenantId", tenantId));
        }

        if (apiVersion != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("api-version", apiVersion));
        }

        if (xApiVersion != null) {
            localVarHeaderParams.put("x-api-version", localVarApiClient.parameterToString(xApiVersion));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/xml"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Bearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV2ProjectsServiceTaskTypesTaskTypeIdDeleteValidateBeforeCall(UUID taskTypeId, UUID tenantId, String apiVersion, String xApiVersion, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'taskTypeId' is set
        if (taskTypeId == null) {
            throw new ApiException("Missing the required parameter 'taskTypeId' when calling apiV2ProjectsServiceTaskTypesTaskTypeIdDelete(Async)");
        }

        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new ApiException("Missing the required parameter 'tenantId' when calling apiV2ProjectsServiceTaskTypesTaskTypeIdDelete(Async)");
        }

        return apiV2ProjectsServiceTaskTypesTaskTypeIdDeleteCall(taskTypeId, tenantId, apiVersion, xApiVersion, _callback);

    }

    /**
     * 
     * 
     * @param taskTypeId  (required)
     * @param tenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return TaskTypeDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public TaskTypeDto apiV2ProjectsServiceTaskTypesTaskTypeIdDelete(UUID taskTypeId, UUID tenantId, String apiVersion, String xApiVersion) throws ApiException {
        ApiResponse<TaskTypeDto> localVarResp = apiV2ProjectsServiceTaskTypesTaskTypeIdDeleteWithHttpInfo(taskTypeId, tenantId, apiVersion, xApiVersion);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param taskTypeId  (required)
     * @param tenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return ApiResponse&lt;TaskTypeDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TaskTypeDto> apiV2ProjectsServiceTaskTypesTaskTypeIdDeleteWithHttpInfo(UUID taskTypeId, UUID tenantId, String apiVersion, String xApiVersion) throws ApiException {
        okhttp3.Call localVarCall = apiV2ProjectsServiceTaskTypesTaskTypeIdDeleteValidateBeforeCall(taskTypeId, tenantId, apiVersion, xApiVersion, null);
        Type localVarReturnType = new TypeToken<TaskTypeDto>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param taskTypeId  (required)
     * @param tenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2ProjectsServiceTaskTypesTaskTypeIdDeleteAsync(UUID taskTypeId, UUID tenantId, String apiVersion, String xApiVersion, final ApiCallback<TaskTypeDto> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2ProjectsServiceTaskTypesTaskTypeIdDeleteValidateBeforeCall(taskTypeId, tenantId, apiVersion, xApiVersion, _callback);
        Type localVarReturnType = new TypeToken<TaskTypeDto>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV2ProjectsServiceTaskTypesTaskTypeIdGet
     * @param taskTypeId  (required)
     * @param tenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2ProjectsServiceTaskTypesTaskTypeIdGetCall(UUID taskTypeId, UUID tenantId, String apiVersion, String xApiVersion, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v2/ProjectsService/TaskTypes/{taskTypeId}"
            .replace("{" + "taskTypeId" + "}", localVarApiClient.escapeString(taskTypeId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (tenantId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("tenantId", tenantId));
        }

        if (apiVersion != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("api-version", apiVersion));
        }

        if (xApiVersion != null) {
            localVarHeaderParams.put("x-api-version", localVarApiClient.parameterToString(xApiVersion));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/xml"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Bearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV2ProjectsServiceTaskTypesTaskTypeIdGetValidateBeforeCall(UUID taskTypeId, UUID tenantId, String apiVersion, String xApiVersion, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'taskTypeId' is set
        if (taskTypeId == null) {
            throw new ApiException("Missing the required parameter 'taskTypeId' when calling apiV2ProjectsServiceTaskTypesTaskTypeIdGet(Async)");
        }

        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new ApiException("Missing the required parameter 'tenantId' when calling apiV2ProjectsServiceTaskTypesTaskTypeIdGet(Async)");
        }

        return apiV2ProjectsServiceTaskTypesTaskTypeIdGetCall(taskTypeId, tenantId, apiVersion, xApiVersion, _callback);

    }

    /**
     * 
     * 
     * @param taskTypeId  (required)
     * @param tenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return TaskTypeDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public TaskTypeDto apiV2ProjectsServiceTaskTypesTaskTypeIdGet(UUID taskTypeId, UUID tenantId, String apiVersion, String xApiVersion) throws ApiException {
        ApiResponse<TaskTypeDto> localVarResp = apiV2ProjectsServiceTaskTypesTaskTypeIdGetWithHttpInfo(taskTypeId, tenantId, apiVersion, xApiVersion);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param taskTypeId  (required)
     * @param tenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return ApiResponse&lt;TaskTypeDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TaskTypeDto> apiV2ProjectsServiceTaskTypesTaskTypeIdGetWithHttpInfo(UUID taskTypeId, UUID tenantId, String apiVersion, String xApiVersion) throws ApiException {
        okhttp3.Call localVarCall = apiV2ProjectsServiceTaskTypesTaskTypeIdGetValidateBeforeCall(taskTypeId, tenantId, apiVersion, xApiVersion, null);
        Type localVarReturnType = new TypeToken<TaskTypeDto>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param taskTypeId  (required)
     * @param tenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2ProjectsServiceTaskTypesTaskTypeIdGetAsync(UUID taskTypeId, UUID tenantId, String apiVersion, String xApiVersion, final ApiCallback<TaskTypeDto> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2ProjectsServiceTaskTypesTaskTypeIdGetValidateBeforeCall(taskTypeId, tenantId, apiVersion, xApiVersion, _callback);
        Type localVarReturnType = new TypeToken<TaskTypeDto>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV2ProjectsServiceTaskTypesTaskTypeIdPut
     * @param taskTypeId  (required)
     * @param tenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param taskTypeUpdateDto  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2ProjectsServiceTaskTypesTaskTypeIdPutCall(UUID taskTypeId, UUID tenantId, String apiVersion, String xApiVersion, TaskTypeUpdateDto taskTypeUpdateDto, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = taskTypeUpdateDto;

        // create path and map variables
        String localVarPath = "/api/v2/ProjectsService/TaskTypes/{taskTypeId}"
            .replace("{" + "taskTypeId" + "}", localVarApiClient.escapeString(taskTypeId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (tenantId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("tenantId", tenantId));
        }

        if (apiVersion != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("api-version", apiVersion));
        }

        if (xApiVersion != null) {
            localVarHeaderParams.put("x-api-version", localVarApiClient.parameterToString(xApiVersion));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/xml"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json",
            "application/xml"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Bearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV2ProjectsServiceTaskTypesTaskTypeIdPutValidateBeforeCall(UUID taskTypeId, UUID tenantId, String apiVersion, String xApiVersion, TaskTypeUpdateDto taskTypeUpdateDto, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'taskTypeId' is set
        if (taskTypeId == null) {
            throw new ApiException("Missing the required parameter 'taskTypeId' when calling apiV2ProjectsServiceTaskTypesTaskTypeIdPut(Async)");
        }

        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new ApiException("Missing the required parameter 'tenantId' when calling apiV2ProjectsServiceTaskTypesTaskTypeIdPut(Async)");
        }

        return apiV2ProjectsServiceTaskTypesTaskTypeIdPutCall(taskTypeId, tenantId, apiVersion, xApiVersion, taskTypeUpdateDto, _callback);

    }

    /**
     * 
     * 
     * @param taskTypeId  (required)
     * @param tenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param taskTypeUpdateDto  (optional)
     * @return TaskTypeDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public TaskTypeDto apiV2ProjectsServiceTaskTypesTaskTypeIdPut(UUID taskTypeId, UUID tenantId, String apiVersion, String xApiVersion, TaskTypeUpdateDto taskTypeUpdateDto) throws ApiException {
        ApiResponse<TaskTypeDto> localVarResp = apiV2ProjectsServiceTaskTypesTaskTypeIdPutWithHttpInfo(taskTypeId, tenantId, apiVersion, xApiVersion, taskTypeUpdateDto);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param taskTypeId  (required)
     * @param tenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param taskTypeUpdateDto  (optional)
     * @return ApiResponse&lt;TaskTypeDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TaskTypeDto> apiV2ProjectsServiceTaskTypesTaskTypeIdPutWithHttpInfo(UUID taskTypeId, UUID tenantId, String apiVersion, String xApiVersion, TaskTypeUpdateDto taskTypeUpdateDto) throws ApiException {
        okhttp3.Call localVarCall = apiV2ProjectsServiceTaskTypesTaskTypeIdPutValidateBeforeCall(taskTypeId, tenantId, apiVersion, xApiVersion, taskTypeUpdateDto, null);
        Type localVarReturnType = new TypeToken<TaskTypeDto>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param taskTypeId  (required)
     * @param tenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param taskTypeUpdateDto  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2ProjectsServiceTaskTypesTaskTypeIdPutAsync(UUID taskTypeId, UUID tenantId, String apiVersion, String xApiVersion, TaskTypeUpdateDto taskTypeUpdateDto, final ApiCallback<TaskTypeDto> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2ProjectsServiceTaskTypesTaskTypeIdPutValidateBeforeCall(taskTypeId, tenantId, apiVersion, xApiVersion, taskTypeUpdateDto, _callback);
        Type localVarReturnType = new TypeToken<TaskTypeDto>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
