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
import org.openapitools.client.model.SupportTicketPriorityCreateDto;
import org.openapitools.client.model.SupportTicketPriorityDtoEnvelope;
import org.openapitools.client.model.SupportTicketPriorityDtoListEnvelope;
import org.openapitools.client.model.SupportTicketPriorityUpdateDto;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SupportTicketPrioritiesApi
 */
@Disabled
public class SupportTicketPrioritiesApiTest {

    private final SupportTicketPrioritiesApi api = new SupportTicketPrioritiesApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SupportServiceSupportTicketPrioritiesCountGetTest() throws ApiException {
        UUID tenantId = null;
        String apiVersion = null;
        String xApiVersion = null;
        Int32Envelope response = api.apiV2SupportServiceSupportTicketPrioritiesCountGet(tenantId, apiVersion, xApiVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SupportServiceSupportTicketPrioritiesGetTest() throws ApiException {
        UUID tenantId = null;
        String apiVersion = null;
        String xApiVersion = null;
        SupportTicketPriorityDtoListEnvelope response = api.apiV2SupportServiceSupportTicketPrioritiesGet(tenantId, apiVersion, xApiVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SupportServiceSupportTicketPrioritiesPostTest() throws ApiException {
        SupportTicketPriorityCreateDto supportTicketPriorityCreateDto = null;
        UUID tenantId = null;
        String apiVersion = null;
        String xApiVersion = null;
        EmptyEnvelope response = api.apiV2SupportServiceSupportTicketPrioritiesPost(supportTicketPriorityCreateDto, tenantId, apiVersion, xApiVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SupportServiceSupportTicketPrioritiesSupportTicketPriorityIdDeleteTest() throws ApiException {
        UUID supportTicketPriorityId = null;
        UUID tenantId = null;
        String apiVersion = null;
        String xApiVersion = null;
        EmptyEnvelope response = api.apiV2SupportServiceSupportTicketPrioritiesSupportTicketPriorityIdDelete(supportTicketPriorityId, tenantId, apiVersion, xApiVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SupportServiceSupportTicketPrioritiesSupportTicketPriorityIdGetTest() throws ApiException {
        UUID supportTicketPriorityId = null;
        String apiVersion = null;
        String xApiVersion = null;
        SupportTicketPriorityDtoEnvelope response = api.apiV2SupportServiceSupportTicketPrioritiesSupportTicketPriorityIdGet(supportTicketPriorityId, apiVersion, xApiVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SupportServiceSupportTicketPrioritiesSupportTicketPriorityIdPutTest() throws ApiException {
        UUID supportTicketPriorityId = null;
        SupportTicketPriorityUpdateDto supportTicketPriorityUpdateDto = null;
        UUID tenantId = null;
        String apiVersion = null;
        String xApiVersion = null;
        EmptyEnvelope response = api.apiV2SupportServiceSupportTicketPrioritiesSupportTicketPriorityIdPut(supportTicketPriorityId, supportTicketPriorityUpdateDto, tenantId, apiVersion, xApiVersion);
        // TODO: test validations
    }

}