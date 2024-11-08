/*
 * SupportService
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
import org.openapitools.client.model.EmptyEnvelope;
import org.openapitools.client.model.ErrorEnvelope;
import org.openapitools.client.model.Int32Envelope;
import org.openapitools.client.model.SupportTicketTypeCreateDto;
import org.openapitools.client.model.SupportTicketTypeDtoEnvelope;
import org.openapitools.client.model.SupportTicketTypeDtoListEnvelope;
import org.openapitools.client.model.SupportTicketTypeUpdateDto;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SupportTicketTypesApi
 */
@Disabled
public class SupportTicketTypesApiTest {

    private final SupportTicketTypesApi api = new SupportTicketTypesApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SupportServiceSupportTicketTypesCountGetTest() throws ApiException {
        UUID tenantId = null;
        String apiVersion = null;
        String xApiVersion = null;
        Int32Envelope response = api.apiV2SupportServiceSupportTicketTypesCountGet(tenantId, apiVersion, xApiVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SupportServiceSupportTicketTypesGetTest() throws ApiException {
        UUID tenantId = null;
        String apiVersion = null;
        String xApiVersion = null;
        SupportTicketTypeDtoListEnvelope response = api.apiV2SupportServiceSupportTicketTypesGet(tenantId, apiVersion, xApiVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SupportServiceSupportTicketTypesPostTest() throws ApiException {
        SupportTicketTypeCreateDto supportTicketTypeCreateDto = null;
        UUID tenantId = null;
        String apiVersion = null;
        String xApiVersion = null;
        EmptyEnvelope response = api.apiV2SupportServiceSupportTicketTypesPost(supportTicketTypeCreateDto, tenantId, apiVersion, xApiVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdDeleteTest() throws ApiException {
        UUID supportTicketTypeId = null;
        UUID tenantId = null;
        String apiVersion = null;
        String xApiVersion = null;
        EmptyEnvelope response = api.apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdDelete(supportTicketTypeId, tenantId, apiVersion, xApiVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdGetTest() throws ApiException {
        UUID supportTicketTypeId = null;
        String apiVersion = null;
        String xApiVersion = null;
        SupportTicketTypeDtoEnvelope response = api.apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdGet(supportTicketTypeId, apiVersion, xApiVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdPutTest() throws ApiException {
        UUID supportTicketTypeId = null;
        SupportTicketTypeUpdateDto supportTicketTypeUpdateDto = null;
        UUID tenantId = null;
        String apiVersion = null;
        String xApiVersion = null;
        EmptyEnvelope response = api.apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdPut(supportTicketTypeId, supportTicketTypeUpdateDto, tenantId, apiVersion, xApiVersion);
        // TODO: test validations
    }

}
