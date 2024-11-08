/*
 * TimeTrackerService
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
import org.openapitools.client.model.ProjectHoursApprovalApproverUpdateDto;
import org.openapitools.client.model.ProjectHoursApprovalCreateDto;
import org.openapitools.client.model.ProjectHoursApprovalStatusUpdateDto;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeLogApprovalsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public TimeLogApprovalsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TimeLogApprovalsApi(ApiClient apiClient) {
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
     * Build call for apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdApproverPut
     * @param approvalId  (required)
     * @param tenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param projectHoursApprovalApproverUpdateDto  (optional)
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
    public okhttp3.Call apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdApproverPutCall(UUID approvalId, UUID tenantId, String apiVersion, String xApiVersion, ProjectHoursApprovalApproverUpdateDto projectHoursApprovalApproverUpdateDto, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = projectHoursApprovalApproverUpdateDto;

        // create path and map variables
        String localVarPath = "/api/v2/TimeTrackerService/TimeLogApprovals/{approvalId}/Approver"
            .replace("{" + "approvalId" + "}", localVarApiClient.escapeString(approvalId.toString()));

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
    private okhttp3.Call apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdApproverPutValidateBeforeCall(UUID approvalId, UUID tenantId, String apiVersion, String xApiVersion, ProjectHoursApprovalApproverUpdateDto projectHoursApprovalApproverUpdateDto, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'approvalId' is set
        if (approvalId == null) {
            throw new ApiException("Missing the required parameter 'approvalId' when calling apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdApproverPut(Async)");
        }

        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new ApiException("Missing the required parameter 'tenantId' when calling apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdApproverPut(Async)");
        }

        return apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdApproverPutCall(approvalId, tenantId, apiVersion, xApiVersion, projectHoursApprovalApproverUpdateDto, _callback);

    }

    /**
     * 
     * 
     * @param approvalId  (required)
     * @param tenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param projectHoursApprovalApproverUpdateDto  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdApproverPut(UUID approvalId, UUID tenantId, String apiVersion, String xApiVersion, ProjectHoursApprovalApproverUpdateDto projectHoursApprovalApproverUpdateDto) throws ApiException {
        apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdApproverPutWithHttpInfo(approvalId, tenantId, apiVersion, xApiVersion, projectHoursApprovalApproverUpdateDto);
    }

    /**
     * 
     * 
     * @param approvalId  (required)
     * @param tenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param projectHoursApprovalApproverUpdateDto  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdApproverPutWithHttpInfo(UUID approvalId, UUID tenantId, String apiVersion, String xApiVersion, ProjectHoursApprovalApproverUpdateDto projectHoursApprovalApproverUpdateDto) throws ApiException {
        okhttp3.Call localVarCall = apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdApproverPutValidateBeforeCall(approvalId, tenantId, apiVersion, xApiVersion, projectHoursApprovalApproverUpdateDto, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * 
     * @param approvalId  (required)
     * @param tenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param projectHoursApprovalApproverUpdateDto  (optional)
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
    public okhttp3.Call apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdApproverPutAsync(UUID approvalId, UUID tenantId, String apiVersion, String xApiVersion, ProjectHoursApprovalApproverUpdateDto projectHoursApprovalApproverUpdateDto, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdApproverPutValidateBeforeCall(approvalId, tenantId, apiVersion, xApiVersion, projectHoursApprovalApproverUpdateDto, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdStatusPut
     * @param tenantId  (required)
     * @param approvalId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param projectHoursApprovalStatusUpdateDto  (optional)
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
    public okhttp3.Call apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdStatusPutCall(UUID tenantId, UUID approvalId, String apiVersion, String xApiVersion, ProjectHoursApprovalStatusUpdateDto projectHoursApprovalStatusUpdateDto, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = projectHoursApprovalStatusUpdateDto;

        // create path and map variables
        String localVarPath = "/api/v2/TimeTrackerService/TimeLogApprovals/{approvalId}/Status"
            .replace("{" + "approvalId" + "}", localVarApiClient.escapeString(approvalId.toString()));

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
    private okhttp3.Call apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdStatusPutValidateBeforeCall(UUID tenantId, UUID approvalId, String apiVersion, String xApiVersion, ProjectHoursApprovalStatusUpdateDto projectHoursApprovalStatusUpdateDto, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new ApiException("Missing the required parameter 'tenantId' when calling apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdStatusPut(Async)");
        }

        // verify the required parameter 'approvalId' is set
        if (approvalId == null) {
            throw new ApiException("Missing the required parameter 'approvalId' when calling apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdStatusPut(Async)");
        }

        return apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdStatusPutCall(tenantId, approvalId, apiVersion, xApiVersion, projectHoursApprovalStatusUpdateDto, _callback);

    }

    /**
     * 
     * 
     * @param tenantId  (required)
     * @param approvalId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param projectHoursApprovalStatusUpdateDto  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdStatusPut(UUID tenantId, UUID approvalId, String apiVersion, String xApiVersion, ProjectHoursApprovalStatusUpdateDto projectHoursApprovalStatusUpdateDto) throws ApiException {
        apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdStatusPutWithHttpInfo(tenantId, approvalId, apiVersion, xApiVersion, projectHoursApprovalStatusUpdateDto);
    }

    /**
     * 
     * 
     * @param tenantId  (required)
     * @param approvalId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param projectHoursApprovalStatusUpdateDto  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdStatusPutWithHttpInfo(UUID tenantId, UUID approvalId, String apiVersion, String xApiVersion, ProjectHoursApprovalStatusUpdateDto projectHoursApprovalStatusUpdateDto) throws ApiException {
        okhttp3.Call localVarCall = apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdStatusPutValidateBeforeCall(tenantId, approvalId, apiVersion, xApiVersion, projectHoursApprovalStatusUpdateDto, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * 
     * @param tenantId  (required)
     * @param approvalId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param projectHoursApprovalStatusUpdateDto  (optional)
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
    public okhttp3.Call apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdStatusPutAsync(UUID tenantId, UUID approvalId, String apiVersion, String xApiVersion, ProjectHoursApprovalStatusUpdateDto projectHoursApprovalStatusUpdateDto, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdStatusPutValidateBeforeCall(tenantId, approvalId, apiVersion, xApiVersion, projectHoursApprovalStatusUpdateDto, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV2TimeTrackerServiceTimeLogApprovalsPost
     * @param tenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param projectHoursApprovalCreateDto  (optional)
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
    public okhttp3.Call apiV2TimeTrackerServiceTimeLogApprovalsPostCall(UUID tenantId, String apiVersion, String xApiVersion, ProjectHoursApprovalCreateDto projectHoursApprovalCreateDto, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = projectHoursApprovalCreateDto;

        // create path and map variables
        String localVarPath = "/api/v2/TimeTrackerService/TimeLogApprovals";

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
    private okhttp3.Call apiV2TimeTrackerServiceTimeLogApprovalsPostValidateBeforeCall(UUID tenantId, String apiVersion, String xApiVersion, ProjectHoursApprovalCreateDto projectHoursApprovalCreateDto, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new ApiException("Missing the required parameter 'tenantId' when calling apiV2TimeTrackerServiceTimeLogApprovalsPost(Async)");
        }

        return apiV2TimeTrackerServiceTimeLogApprovalsPostCall(tenantId, apiVersion, xApiVersion, projectHoursApprovalCreateDto, _callback);

    }

    /**
     * 
     * 
     * @param tenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param projectHoursApprovalCreateDto  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void apiV2TimeTrackerServiceTimeLogApprovalsPost(UUID tenantId, String apiVersion, String xApiVersion, ProjectHoursApprovalCreateDto projectHoursApprovalCreateDto) throws ApiException {
        apiV2TimeTrackerServiceTimeLogApprovalsPostWithHttpInfo(tenantId, apiVersion, xApiVersion, projectHoursApprovalCreateDto);
    }

    /**
     * 
     * 
     * @param tenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param projectHoursApprovalCreateDto  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> apiV2TimeTrackerServiceTimeLogApprovalsPostWithHttpInfo(UUID tenantId, String apiVersion, String xApiVersion, ProjectHoursApprovalCreateDto projectHoursApprovalCreateDto) throws ApiException {
        okhttp3.Call localVarCall = apiV2TimeTrackerServiceTimeLogApprovalsPostValidateBeforeCall(tenantId, apiVersion, xApiVersion, projectHoursApprovalCreateDto, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * 
     * @param tenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param projectHoursApprovalCreateDto  (optional)
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
    public okhttp3.Call apiV2TimeTrackerServiceTimeLogApprovalsPostAsync(UUID tenantId, String apiVersion, String xApiVersion, ProjectHoursApprovalCreateDto projectHoursApprovalCreateDto, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2TimeTrackerServiceTimeLogApprovalsPostValidateBeforeCall(tenantId, apiVersion, xApiVersion, projectHoursApprovalCreateDto, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
