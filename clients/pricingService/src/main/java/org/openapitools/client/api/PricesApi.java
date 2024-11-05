/*
 * PricingService
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
import org.openapitools.client.model.MoneyEnvelope;
import org.openapitools.client.model.PriceCalculationDtoEnvelope;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PricesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PricesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PricesApi(ApiClient apiClient) {
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
     * Build call for apiV2PricingServicePricesItemIdFinalPriceGet
     * @param itemId  (required)
     * @param currencyId  (optional, default to USD.USA)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2PricingServicePricesItemIdFinalPriceGetCall(UUID itemId, String currencyId, String apiVersion, String xApiVersion, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v2/PricingService/Prices/{itemId}/FinalPrice"
            .replace("{" + "itemId" + "}", localVarApiClient.escapeString(itemId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (currencyId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("currencyId", currencyId));
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
    private okhttp3.Call apiV2PricingServicePricesItemIdFinalPriceGetValidateBeforeCall(UUID itemId, String currencyId, String apiVersion, String xApiVersion, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new ApiException("Missing the required parameter 'itemId' when calling apiV2PricingServicePricesItemIdFinalPriceGet(Async)");
        }

        return apiV2PricingServicePricesItemIdFinalPriceGetCall(itemId, currencyId, apiVersion, xApiVersion, _callback);

    }

    /**
     * 
     * 
     * @param itemId  (required)
     * @param currencyId  (optional, default to USD.USA)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return MoneyEnvelope
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public MoneyEnvelope apiV2PricingServicePricesItemIdFinalPriceGet(UUID itemId, String currencyId, String apiVersion, String xApiVersion) throws ApiException {
        ApiResponse<MoneyEnvelope> localVarResp = apiV2PricingServicePricesItemIdFinalPriceGetWithHttpInfo(itemId, currencyId, apiVersion, xApiVersion);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param itemId  (required)
     * @param currencyId  (optional, default to USD.USA)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return ApiResponse&lt;MoneyEnvelope&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MoneyEnvelope> apiV2PricingServicePricesItemIdFinalPriceGetWithHttpInfo(UUID itemId, String currencyId, String apiVersion, String xApiVersion) throws ApiException {
        okhttp3.Call localVarCall = apiV2PricingServicePricesItemIdFinalPriceGetValidateBeforeCall(itemId, currencyId, apiVersion, xApiVersion, null);
        Type localVarReturnType = new TypeToken<MoneyEnvelope>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param itemId  (required)
     * @param currencyId  (optional, default to USD.USA)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2PricingServicePricesItemIdFinalPriceGetAsync(UUID itemId, String currencyId, String apiVersion, String xApiVersion, final ApiCallback<MoneyEnvelope> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2PricingServicePricesItemIdFinalPriceGetValidateBeforeCall(itemId, currencyId, apiVersion, xApiVersion, _callback);
        Type localVarReturnType = new TypeToken<MoneyEnvelope>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV2PricingServicePricesItemIdPriceGet
     * @param itemId  (required)
     * @param priceListId  (optional)
     * @param discountsListId  (optional)
     * @param currencyId  (optional, default to USD.USA)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2PricingServicePricesItemIdPriceGetCall(UUID itemId, UUID priceListId, UUID discountsListId, String currencyId, String apiVersion, String xApiVersion, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v2/PricingService/Prices/{itemId}/Price"
            .replace("{" + "itemId" + "}", localVarApiClient.escapeString(itemId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (priceListId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("priceListId", priceListId));
        }

        if (discountsListId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("discountsListId", discountsListId));
        }

        if (currencyId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("currencyId", currencyId));
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
    private okhttp3.Call apiV2PricingServicePricesItemIdPriceGetValidateBeforeCall(UUID itemId, UUID priceListId, UUID discountsListId, String currencyId, String apiVersion, String xApiVersion, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new ApiException("Missing the required parameter 'itemId' when calling apiV2PricingServicePricesItemIdPriceGet(Async)");
        }

        return apiV2PricingServicePricesItemIdPriceGetCall(itemId, priceListId, discountsListId, currencyId, apiVersion, xApiVersion, _callback);

    }

    /**
     * 
     * 
     * @param itemId  (required)
     * @param priceListId  (optional)
     * @param discountsListId  (optional)
     * @param currencyId  (optional, default to USD.USA)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return PriceCalculationDtoEnvelope
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public PriceCalculationDtoEnvelope apiV2PricingServicePricesItemIdPriceGet(UUID itemId, UUID priceListId, UUID discountsListId, String currencyId, String apiVersion, String xApiVersion) throws ApiException {
        ApiResponse<PriceCalculationDtoEnvelope> localVarResp = apiV2PricingServicePricesItemIdPriceGetWithHttpInfo(itemId, priceListId, discountsListId, currencyId, apiVersion, xApiVersion);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param itemId  (required)
     * @param priceListId  (optional)
     * @param discountsListId  (optional)
     * @param currencyId  (optional, default to USD.USA)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return ApiResponse&lt;PriceCalculationDtoEnvelope&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PriceCalculationDtoEnvelope> apiV2PricingServicePricesItemIdPriceGetWithHttpInfo(UUID itemId, UUID priceListId, UUID discountsListId, String currencyId, String apiVersion, String xApiVersion) throws ApiException {
        okhttp3.Call localVarCall = apiV2PricingServicePricesItemIdPriceGetValidateBeforeCall(itemId, priceListId, discountsListId, currencyId, apiVersion, xApiVersion, null);
        Type localVarReturnType = new TypeToken<PriceCalculationDtoEnvelope>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param itemId  (required)
     * @param priceListId  (optional)
     * @param discountsListId  (optional)
     * @param currencyId  (optional, default to USD.USA)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2PricingServicePricesItemIdPriceGetAsync(UUID itemId, UUID priceListId, UUID discountsListId, String currencyId, String apiVersion, String xApiVersion, final ApiCallback<PriceCalculationDtoEnvelope> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2PricingServicePricesItemIdPriceGetValidateBeforeCall(itemId, priceListId, discountsListId, currencyId, apiVersion, xApiVersion, _callback);
        Type localVarReturnType = new TypeToken<PriceCalculationDtoEnvelope>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV2PricingServicePricesItemIdTotalSavingsGet
     * @param itemId  (required)
     * @param currencyId  (optional, default to USD.USA)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2PricingServicePricesItemIdTotalSavingsGetCall(UUID itemId, String currencyId, String apiVersion, String xApiVersion, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v2/PricingService/Prices/{itemId}/TotalSavings"
            .replace("{" + "itemId" + "}", localVarApiClient.escapeString(itemId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (currencyId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("currencyId", currencyId));
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
    private okhttp3.Call apiV2PricingServicePricesItemIdTotalSavingsGetValidateBeforeCall(UUID itemId, String currencyId, String apiVersion, String xApiVersion, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new ApiException("Missing the required parameter 'itemId' when calling apiV2PricingServicePricesItemIdTotalSavingsGet(Async)");
        }

        return apiV2PricingServicePricesItemIdTotalSavingsGetCall(itemId, currencyId, apiVersion, xApiVersion, _callback);

    }

    /**
     * 
     * 
     * @param itemId  (required)
     * @param currencyId  (optional, default to USD.USA)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return MoneyEnvelope
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public MoneyEnvelope apiV2PricingServicePricesItemIdTotalSavingsGet(UUID itemId, String currencyId, String apiVersion, String xApiVersion) throws ApiException {
        ApiResponse<MoneyEnvelope> localVarResp = apiV2PricingServicePricesItemIdTotalSavingsGetWithHttpInfo(itemId, currencyId, apiVersion, xApiVersion);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param itemId  (required)
     * @param currencyId  (optional, default to USD.USA)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return ApiResponse&lt;MoneyEnvelope&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MoneyEnvelope> apiV2PricingServicePricesItemIdTotalSavingsGetWithHttpInfo(UUID itemId, String currencyId, String apiVersion, String xApiVersion) throws ApiException {
        okhttp3.Call localVarCall = apiV2PricingServicePricesItemIdTotalSavingsGetValidateBeforeCall(itemId, currencyId, apiVersion, xApiVersion, null);
        Type localVarReturnType = new TypeToken<MoneyEnvelope>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param itemId  (required)
     * @param currencyId  (optional, default to USD.USA)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2PricingServicePricesItemIdTotalSavingsGetAsync(UUID itemId, String currencyId, String apiVersion, String xApiVersion, final ApiCallback<MoneyEnvelope> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2PricingServicePricesItemIdTotalSavingsGetValidateBeforeCall(itemId, currencyId, apiVersion, xApiVersion, _callback);
        Type localVarReturnType = new TypeToken<MoneyEnvelope>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV2PricingServicePricesItemIdTotalTaxesGet
     * @param itemId  (required)
     * @param currencyId  (optional, default to USD.USA)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2PricingServicePricesItemIdTotalTaxesGetCall(UUID itemId, String currencyId, String apiVersion, String xApiVersion, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v2/PricingService/Prices/{itemId}/TotalTaxes"
            .replace("{" + "itemId" + "}", localVarApiClient.escapeString(itemId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (currencyId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("currencyId", currencyId));
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
    private okhttp3.Call apiV2PricingServicePricesItemIdTotalTaxesGetValidateBeforeCall(UUID itemId, String currencyId, String apiVersion, String xApiVersion, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new ApiException("Missing the required parameter 'itemId' when calling apiV2PricingServicePricesItemIdTotalTaxesGet(Async)");
        }

        return apiV2PricingServicePricesItemIdTotalTaxesGetCall(itemId, currencyId, apiVersion, xApiVersion, _callback);

    }

    /**
     * 
     * 
     * @param itemId  (required)
     * @param currencyId  (optional, default to USD.USA)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return MoneyEnvelope
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public MoneyEnvelope apiV2PricingServicePricesItemIdTotalTaxesGet(UUID itemId, String currencyId, String apiVersion, String xApiVersion) throws ApiException {
        ApiResponse<MoneyEnvelope> localVarResp = apiV2PricingServicePricesItemIdTotalTaxesGetWithHttpInfo(itemId, currencyId, apiVersion, xApiVersion);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param itemId  (required)
     * @param currencyId  (optional, default to USD.USA)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return ApiResponse&lt;MoneyEnvelope&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MoneyEnvelope> apiV2PricingServicePricesItemIdTotalTaxesGetWithHttpInfo(UUID itemId, String currencyId, String apiVersion, String xApiVersion) throws ApiException {
        okhttp3.Call localVarCall = apiV2PricingServicePricesItemIdTotalTaxesGetValidateBeforeCall(itemId, currencyId, apiVersion, xApiVersion, null);
        Type localVarReturnType = new TypeToken<MoneyEnvelope>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param itemId  (required)
     * @param currencyId  (optional, default to USD.USA)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2PricingServicePricesItemIdTotalTaxesGetAsync(UUID itemId, String currencyId, String apiVersion, String xApiVersion, final ApiCallback<MoneyEnvelope> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2PricingServicePricesItemIdTotalTaxesGetValidateBeforeCall(itemId, currencyId, apiVersion, xApiVersion, _callback);
        Type localVarReturnType = new TypeToken<MoneyEnvelope>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
