/*
 * MarketingService
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


import org.openapitools.client.model.OrderDtoEnvelope;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrackingPixelsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public TrackingPixelsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TrackingPixelsApi(ApiClient apiClient) {
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
     * Build call for apiV2MarketingServiceTrackingPixelsPixelIdGet
     * @param pixelId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2MarketingServiceTrackingPixelsPixelIdGetCall(UUID pixelId, String apiVersion, String xApiVersion, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v2/MarketingService/TrackingPixels/{pixelId}"
            .replace("{" + "pixelId" + "}", localVarApiClient.escapeString(pixelId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
    private okhttp3.Call apiV2MarketingServiceTrackingPixelsPixelIdGetValidateBeforeCall(UUID pixelId, String apiVersion, String xApiVersion, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'pixelId' is set
        if (pixelId == null) {
            throw new ApiException("Missing the required parameter 'pixelId' when calling apiV2MarketingServiceTrackingPixelsPixelIdGet(Async)");
        }

        return apiV2MarketingServiceTrackingPixelsPixelIdGetCall(pixelId, apiVersion, xApiVersion, _callback);

    }

    /**
     * 
     * 
     * @param pixelId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return OrderDtoEnvelope
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public OrderDtoEnvelope apiV2MarketingServiceTrackingPixelsPixelIdGet(UUID pixelId, String apiVersion, String xApiVersion) throws ApiException {
        ApiResponse<OrderDtoEnvelope> localVarResp = apiV2MarketingServiceTrackingPixelsPixelIdGetWithHttpInfo(pixelId, apiVersion, xApiVersion);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param pixelId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return ApiResponse&lt;OrderDtoEnvelope&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<OrderDtoEnvelope> apiV2MarketingServiceTrackingPixelsPixelIdGetWithHttpInfo(UUID pixelId, String apiVersion, String xApiVersion) throws ApiException {
        okhttp3.Call localVarCall = apiV2MarketingServiceTrackingPixelsPixelIdGetValidateBeforeCall(pixelId, apiVersion, xApiVersion, null);
        Type localVarReturnType = new TypeToken<OrderDtoEnvelope>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param pixelId  (required)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2MarketingServiceTrackingPixelsPixelIdGetAsync(UUID pixelId, String apiVersion, String xApiVersion, final ApiCallback<OrderDtoEnvelope> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2MarketingServiceTrackingPixelsPixelIdGetValidateBeforeCall(pixelId, apiVersion, xApiVersion, _callback);
        Type localVarReturnType = new TypeToken<OrderDtoEnvelope>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}