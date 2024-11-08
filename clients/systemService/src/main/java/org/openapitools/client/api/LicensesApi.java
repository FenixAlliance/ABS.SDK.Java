/*
 * SystemService
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


import org.openapitools.client.model.BooleanEnvelope;
import org.openapitools.client.model.ErrorEnvelope;
import org.openapitools.client.model.LicenseAttributesListEnvelope;
import org.openapitools.client.model.LicenseKey;
import org.openapitools.client.model.LicenseKeyRequest;
import org.openapitools.client.model.LicenseValidationErrorListEnvelope;
import org.openapitools.client.model.StringEnvelope;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LicensesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public LicensesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LicensesApi(ApiClient apiClient) {
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
     * Build call for apiLicensingLicensesGeneratePost
     * @param tenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param licenseKeyRequest  (optional)
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
    public okhttp3.Call apiLicensingLicensesGeneratePostCall(UUID tenantId, String apiVersion, String xApiVersion, LicenseKeyRequest licenseKeyRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = licenseKeyRequest;

        // create path and map variables
        String localVarPath = "/api/Licensing/Licenses/Generate";

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
    private okhttp3.Call apiLicensingLicensesGeneratePostValidateBeforeCall(UUID tenantId, String apiVersion, String xApiVersion, LicenseKeyRequest licenseKeyRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new ApiException("Missing the required parameter 'tenantId' when calling apiLicensingLicensesGeneratePost(Async)");
        }

        return apiLicensingLicensesGeneratePostCall(tenantId, apiVersion, xApiVersion, licenseKeyRequest, _callback);

    }

    /**
     * 
     * 
     * @param tenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param licenseKeyRequest  (optional)
     * @return StringEnvelope
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public StringEnvelope apiLicensingLicensesGeneratePost(UUID tenantId, String apiVersion, String xApiVersion, LicenseKeyRequest licenseKeyRequest) throws ApiException {
        ApiResponse<StringEnvelope> localVarResp = apiLicensingLicensesGeneratePostWithHttpInfo(tenantId, apiVersion, xApiVersion, licenseKeyRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param tenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param licenseKeyRequest  (optional)
     * @return ApiResponse&lt;StringEnvelope&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<StringEnvelope> apiLicensingLicensesGeneratePostWithHttpInfo(UUID tenantId, String apiVersion, String xApiVersion, LicenseKeyRequest licenseKeyRequest) throws ApiException {
        okhttp3.Call localVarCall = apiLicensingLicensesGeneratePostValidateBeforeCall(tenantId, apiVersion, xApiVersion, licenseKeyRequest, null);
        Type localVarReturnType = new TypeToken<StringEnvelope>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param tenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param licenseKeyRequest  (optional)
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
    public okhttp3.Call apiLicensingLicensesGeneratePostAsync(UUID tenantId, String apiVersion, String xApiVersion, LicenseKeyRequest licenseKeyRequest, final ApiCallback<StringEnvelope> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiLicensingLicensesGeneratePostValidateBeforeCall(tenantId, apiVersion, xApiVersion, licenseKeyRequest, _callback);
        Type localVarReturnType = new TypeToken<StringEnvelope>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiLicensingLicensesValidateAttributesGet
     * @param tenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param licenseKey  (optional)
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
    public okhttp3.Call apiLicensingLicensesValidateAttributesGetCall(UUID tenantId, String apiVersion, String xApiVersion, LicenseKey licenseKey, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = licenseKey;

        // create path and map variables
        String localVarPath = "/api/Licensing/Licenses/Validate/Attributes";

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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiLicensingLicensesValidateAttributesGetValidateBeforeCall(UUID tenantId, String apiVersion, String xApiVersion, LicenseKey licenseKey, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new ApiException("Missing the required parameter 'tenantId' when calling apiLicensingLicensesValidateAttributesGet(Async)");
        }

        return apiLicensingLicensesValidateAttributesGetCall(tenantId, apiVersion, xApiVersion, licenseKey, _callback);

    }

    /**
     * 
     * 
     * @param tenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param licenseKey  (optional)
     * @return LicenseAttributesListEnvelope
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public LicenseAttributesListEnvelope apiLicensingLicensesValidateAttributesGet(UUID tenantId, String apiVersion, String xApiVersion, LicenseKey licenseKey) throws ApiException {
        ApiResponse<LicenseAttributesListEnvelope> localVarResp = apiLicensingLicensesValidateAttributesGetWithHttpInfo(tenantId, apiVersion, xApiVersion, licenseKey);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param tenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param licenseKey  (optional)
     * @return ApiResponse&lt;LicenseAttributesListEnvelope&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<LicenseAttributesListEnvelope> apiLicensingLicensesValidateAttributesGetWithHttpInfo(UUID tenantId, String apiVersion, String xApiVersion, LicenseKey licenseKey) throws ApiException {
        okhttp3.Call localVarCall = apiLicensingLicensesValidateAttributesGetValidateBeforeCall(tenantId, apiVersion, xApiVersion, licenseKey, null);
        Type localVarReturnType = new TypeToken<LicenseAttributesListEnvelope>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param tenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param licenseKey  (optional)
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
    public okhttp3.Call apiLicensingLicensesValidateAttributesGetAsync(UUID tenantId, String apiVersion, String xApiVersion, LicenseKey licenseKey, final ApiCallback<LicenseAttributesListEnvelope> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiLicensingLicensesValidateAttributesGetValidateBeforeCall(tenantId, apiVersion, xApiVersion, licenseKey, _callback);
        Type localVarReturnType = new TypeToken<LicenseAttributesListEnvelope>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiLicensingLicensesValidateErrorsGet
     * @param tenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param licenseKey  (optional)
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
    public okhttp3.Call apiLicensingLicensesValidateErrorsGetCall(UUID tenantId, String apiVersion, String xApiVersion, LicenseKey licenseKey, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = licenseKey;

        // create path and map variables
        String localVarPath = "/api/Licensing/Licenses/Validate/Errors";

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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiLicensingLicensesValidateErrorsGetValidateBeforeCall(UUID tenantId, String apiVersion, String xApiVersion, LicenseKey licenseKey, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new ApiException("Missing the required parameter 'tenantId' when calling apiLicensingLicensesValidateErrorsGet(Async)");
        }

        return apiLicensingLicensesValidateErrorsGetCall(tenantId, apiVersion, xApiVersion, licenseKey, _callback);

    }

    /**
     * 
     * 
     * @param tenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param licenseKey  (optional)
     * @return LicenseValidationErrorListEnvelope
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public LicenseValidationErrorListEnvelope apiLicensingLicensesValidateErrorsGet(UUID tenantId, String apiVersion, String xApiVersion, LicenseKey licenseKey) throws ApiException {
        ApiResponse<LicenseValidationErrorListEnvelope> localVarResp = apiLicensingLicensesValidateErrorsGetWithHttpInfo(tenantId, apiVersion, xApiVersion, licenseKey);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param tenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param licenseKey  (optional)
     * @return ApiResponse&lt;LicenseValidationErrorListEnvelope&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<LicenseValidationErrorListEnvelope> apiLicensingLicensesValidateErrorsGetWithHttpInfo(UUID tenantId, String apiVersion, String xApiVersion, LicenseKey licenseKey) throws ApiException {
        okhttp3.Call localVarCall = apiLicensingLicensesValidateErrorsGetValidateBeforeCall(tenantId, apiVersion, xApiVersion, licenseKey, null);
        Type localVarReturnType = new TypeToken<LicenseValidationErrorListEnvelope>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param tenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param licenseKey  (optional)
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
    public okhttp3.Call apiLicensingLicensesValidateErrorsGetAsync(UUID tenantId, String apiVersion, String xApiVersion, LicenseKey licenseKey, final ApiCallback<LicenseValidationErrorListEnvelope> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiLicensingLicensesValidateErrorsGetValidateBeforeCall(tenantId, apiVersion, xApiVersion, licenseKey, _callback);
        Type localVarReturnType = new TypeToken<LicenseValidationErrorListEnvelope>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiLicensingLicensesValidateGet
     * @param tenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param licenseKey  (optional)
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
    public okhttp3.Call apiLicensingLicensesValidateGetCall(UUID tenantId, String apiVersion, String xApiVersion, LicenseKey licenseKey, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = licenseKey;

        // create path and map variables
        String localVarPath = "/api/Licensing/Licenses/Validate";

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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiLicensingLicensesValidateGetValidateBeforeCall(UUID tenantId, String apiVersion, String xApiVersion, LicenseKey licenseKey, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new ApiException("Missing the required parameter 'tenantId' when calling apiLicensingLicensesValidateGet(Async)");
        }

        return apiLicensingLicensesValidateGetCall(tenantId, apiVersion, xApiVersion, licenseKey, _callback);

    }

    /**
     * 
     * 
     * @param tenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param licenseKey  (optional)
     * @return BooleanEnvelope
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public BooleanEnvelope apiLicensingLicensesValidateGet(UUID tenantId, String apiVersion, String xApiVersion, LicenseKey licenseKey) throws ApiException {
        ApiResponse<BooleanEnvelope> localVarResp = apiLicensingLicensesValidateGetWithHttpInfo(tenantId, apiVersion, xApiVersion, licenseKey);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param tenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param licenseKey  (optional)
     * @return ApiResponse&lt;BooleanEnvelope&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BooleanEnvelope> apiLicensingLicensesValidateGetWithHttpInfo(UUID tenantId, String apiVersion, String xApiVersion, LicenseKey licenseKey) throws ApiException {
        okhttp3.Call localVarCall = apiLicensingLicensesValidateGetValidateBeforeCall(tenantId, apiVersion, xApiVersion, licenseKey, null);
        Type localVarReturnType = new TypeToken<BooleanEnvelope>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param tenantId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param licenseKey  (optional)
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
    public okhttp3.Call apiLicensingLicensesValidateGetAsync(UUID tenantId, String apiVersion, String xApiVersion, LicenseKey licenseKey, final ApiCallback<BooleanEnvelope> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiLicensingLicensesValidateGetValidateBeforeCall(tenantId, apiVersion, xApiVersion, licenseKey, _callback);
        Type localVarReturnType = new TypeToken<BooleanEnvelope>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
