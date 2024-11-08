/*
 * CrmService
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


import org.openapitools.client.model.ContactDtoListEnvelope;
import org.openapitools.client.model.EmptyEnvelope;
import org.openapitools.client.model.ErrorEnvelope;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SyncApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SyncApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SyncApi(ApiClient apiClient) {
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
     * Build call for apiV2CrmServiceSyncMePost
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
    public okhttp3.Call apiV2CrmServiceSyncMePostCall(UUID tenantId, String apiVersion, String xApiVersion, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v2/CrmService/Sync/Me";

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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV2CrmServiceSyncMePostValidateBeforeCall(UUID tenantId, String apiVersion, String xApiVersion, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new ApiException("Missing the required parameter 'tenantId' when calling apiV2CrmServiceSyncMePost(Async)");
        }

        return apiV2CrmServiceSyncMePostCall(tenantId, apiVersion, xApiVersion, _callback);

    }

    /**
     * 
     * 
     * @param tenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return ContactDtoListEnvelope
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ContactDtoListEnvelope apiV2CrmServiceSyncMePost(UUID tenantId, String apiVersion, String xApiVersion) throws ApiException {
        ApiResponse<ContactDtoListEnvelope> localVarResp = apiV2CrmServiceSyncMePostWithHttpInfo(tenantId, apiVersion, xApiVersion);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param tenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return ApiResponse&lt;ContactDtoListEnvelope&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ContactDtoListEnvelope> apiV2CrmServiceSyncMePostWithHttpInfo(UUID tenantId, String apiVersion, String xApiVersion) throws ApiException {
        okhttp3.Call localVarCall = apiV2CrmServiceSyncMePostValidateBeforeCall(tenantId, apiVersion, xApiVersion, null);
        Type localVarReturnType = new TypeToken<ContactDtoListEnvelope>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
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
    public okhttp3.Call apiV2CrmServiceSyncMePostAsync(UUID tenantId, String apiVersion, String xApiVersion, final ApiCallback<ContactDtoListEnvelope> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2CrmServiceSyncMePostValidateBeforeCall(tenantId, apiVersion, xApiVersion, _callback);
        Type localVarReturnType = new TypeToken<ContactDtoListEnvelope>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV2CrmServiceSyncPost
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
    public okhttp3.Call apiV2CrmServiceSyncPostCall(UUID tenantId, String apiVersion, String xApiVersion, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v2/CrmService/Sync";

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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV2CrmServiceSyncPostValidateBeforeCall(UUID tenantId, String apiVersion, String xApiVersion, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new ApiException("Missing the required parameter 'tenantId' when calling apiV2CrmServiceSyncPost(Async)");
        }

        return apiV2CrmServiceSyncPostCall(tenantId, apiVersion, xApiVersion, _callback);

    }

    /**
     * 
     * 
     * @param tenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return ContactDtoListEnvelope
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ContactDtoListEnvelope apiV2CrmServiceSyncPost(UUID tenantId, String apiVersion, String xApiVersion) throws ApiException {
        ApiResponse<ContactDtoListEnvelope> localVarResp = apiV2CrmServiceSyncPostWithHttpInfo(tenantId, apiVersion, xApiVersion);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param tenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return ApiResponse&lt;ContactDtoListEnvelope&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ContactDtoListEnvelope> apiV2CrmServiceSyncPostWithHttpInfo(UUID tenantId, String apiVersion, String xApiVersion) throws ApiException {
        okhttp3.Call localVarCall = apiV2CrmServiceSyncPostValidateBeforeCall(tenantId, apiVersion, xApiVersion, null);
        Type localVarReturnType = new TypeToken<ContactDtoListEnvelope>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
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
    public okhttp3.Call apiV2CrmServiceSyncPostAsync(UUID tenantId, String apiVersion, String xApiVersion, final ApiCallback<ContactDtoListEnvelope> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2CrmServiceSyncPostValidateBeforeCall(tenantId, apiVersion, xApiVersion, _callback);
        Type localVarReturnType = new TypeToken<ContactDtoListEnvelope>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV2CrmServiceSyncTenantPost
     * @param tenantId  (required)
     * @param relatedTenantId  (required)
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
    public okhttp3.Call apiV2CrmServiceSyncTenantPostCall(UUID tenantId, UUID relatedTenantId, String apiVersion, String xApiVersion, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v2/CrmService/Sync/Tenant";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (tenantId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("tenantId", tenantId));
        }

        if (relatedTenantId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("relatedTenantId", relatedTenantId));
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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV2CrmServiceSyncTenantPostValidateBeforeCall(UUID tenantId, UUID relatedTenantId, String apiVersion, String xApiVersion, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new ApiException("Missing the required parameter 'tenantId' when calling apiV2CrmServiceSyncTenantPost(Async)");
        }

        // verify the required parameter 'relatedTenantId' is set
        if (relatedTenantId == null) {
            throw new ApiException("Missing the required parameter 'relatedTenantId' when calling apiV2CrmServiceSyncTenantPost(Async)");
        }

        return apiV2CrmServiceSyncTenantPostCall(tenantId, relatedTenantId, apiVersion, xApiVersion, _callback);

    }

    /**
     * 
     * 
     * @param tenantId  (required)
     * @param relatedTenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return EmptyEnvelope
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public EmptyEnvelope apiV2CrmServiceSyncTenantPost(UUID tenantId, UUID relatedTenantId, String apiVersion, String xApiVersion) throws ApiException {
        ApiResponse<EmptyEnvelope> localVarResp = apiV2CrmServiceSyncTenantPostWithHttpInfo(tenantId, relatedTenantId, apiVersion, xApiVersion);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param tenantId  (required)
     * @param relatedTenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return ApiResponse&lt;EmptyEnvelope&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EmptyEnvelope> apiV2CrmServiceSyncTenantPostWithHttpInfo(UUID tenantId, UUID relatedTenantId, String apiVersion, String xApiVersion) throws ApiException {
        okhttp3.Call localVarCall = apiV2CrmServiceSyncTenantPostValidateBeforeCall(tenantId, relatedTenantId, apiVersion, xApiVersion, null);
        Type localVarReturnType = new TypeToken<EmptyEnvelope>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param tenantId  (required)
     * @param relatedTenantId  (required)
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
    public okhttp3.Call apiV2CrmServiceSyncTenantPostAsync(UUID tenantId, UUID relatedTenantId, String apiVersion, String xApiVersion, final ApiCallback<EmptyEnvelope> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2CrmServiceSyncTenantPostValidateBeforeCall(tenantId, relatedTenantId, apiVersion, xApiVersion, _callback);
        Type localVarReturnType = new TypeToken<EmptyEnvelope>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV2CrmServiceSyncUserPost
     * @param tenantId  (required)
     * @param relatedUserId  (required)
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
    public okhttp3.Call apiV2CrmServiceSyncUserPostCall(UUID tenantId, UUID relatedUserId, String apiVersion, String xApiVersion, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v2/CrmService/Sync/User";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (tenantId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("tenantId", tenantId));
        }

        if (relatedUserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("relatedUserId", relatedUserId));
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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV2CrmServiceSyncUserPostValidateBeforeCall(UUID tenantId, UUID relatedUserId, String apiVersion, String xApiVersion, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new ApiException("Missing the required parameter 'tenantId' when calling apiV2CrmServiceSyncUserPost(Async)");
        }

        // verify the required parameter 'relatedUserId' is set
        if (relatedUserId == null) {
            throw new ApiException("Missing the required parameter 'relatedUserId' when calling apiV2CrmServiceSyncUserPost(Async)");
        }

        return apiV2CrmServiceSyncUserPostCall(tenantId, relatedUserId, apiVersion, xApiVersion, _callback);

    }

    /**
     * 
     * 
     * @param tenantId  (required)
     * @param relatedUserId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return ContactDtoListEnvelope
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ContactDtoListEnvelope apiV2CrmServiceSyncUserPost(UUID tenantId, UUID relatedUserId, String apiVersion, String xApiVersion) throws ApiException {
        ApiResponse<ContactDtoListEnvelope> localVarResp = apiV2CrmServiceSyncUserPostWithHttpInfo(tenantId, relatedUserId, apiVersion, xApiVersion);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param tenantId  (required)
     * @param relatedUserId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return ApiResponse&lt;ContactDtoListEnvelope&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ContactDtoListEnvelope> apiV2CrmServiceSyncUserPostWithHttpInfo(UUID tenantId, UUID relatedUserId, String apiVersion, String xApiVersion) throws ApiException {
        okhttp3.Call localVarCall = apiV2CrmServiceSyncUserPostValidateBeforeCall(tenantId, relatedUserId, apiVersion, xApiVersion, null);
        Type localVarReturnType = new TypeToken<ContactDtoListEnvelope>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param tenantId  (required)
     * @param relatedUserId  (required)
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
    public okhttp3.Call apiV2CrmServiceSyncUserPostAsync(UUID tenantId, UUID relatedUserId, String apiVersion, String xApiVersion, final ApiCallback<ContactDtoListEnvelope> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2CrmServiceSyncUserPostValidateBeforeCall(tenantId, relatedUserId, apiVersion, xApiVersion, _callback);
        Type localVarReturnType = new TypeToken<ContactDtoListEnvelope>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
