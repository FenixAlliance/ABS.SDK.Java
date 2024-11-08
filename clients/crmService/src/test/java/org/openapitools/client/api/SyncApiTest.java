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

import org.openapitools.client.ApiException;
import org.openapitools.client.model.ContactDtoListEnvelope;
import org.openapitools.client.model.EmptyEnvelope;
import org.openapitools.client.model.ErrorEnvelope;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SyncApi
 */
@Disabled
public class SyncApiTest {

    private final SyncApi api = new SyncApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2CrmServiceSyncMePostTest() throws ApiException {
        UUID tenantId = null;
        String apiVersion = null;
        String xApiVersion = null;
        ContactDtoListEnvelope response = api.apiV2CrmServiceSyncMePost(tenantId, apiVersion, xApiVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2CrmServiceSyncPostTest() throws ApiException {
        UUID tenantId = null;
        String apiVersion = null;
        String xApiVersion = null;
        ContactDtoListEnvelope response = api.apiV2CrmServiceSyncPost(tenantId, apiVersion, xApiVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2CrmServiceSyncTenantPostTest() throws ApiException {
        UUID tenantId = null;
        UUID relatedTenantId = null;
        String apiVersion = null;
        String xApiVersion = null;
        EmptyEnvelope response = api.apiV2CrmServiceSyncTenantPost(tenantId, relatedTenantId, apiVersion, xApiVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2CrmServiceSyncUserPostTest() throws ApiException {
        UUID tenantId = null;
        UUID relatedUserId = null;
        String apiVersion = null;
        String xApiVersion = null;
        ContactDtoListEnvelope response = api.apiV2CrmServiceSyncUserPost(tenantId, relatedUserId, apiVersion, xApiVersion);
        // TODO: test validations
    }

}
