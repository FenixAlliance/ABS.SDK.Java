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
import org.openapitools.client.model.SupportRequestAttachmentCreateDto;
import org.openapitools.client.model.SupportRequestAttachmentDtoEnvelope;
import org.openapitools.client.model.SupportRequestAttachmentDtoListEnvelope;
import org.openapitools.client.model.SupportRequestCreateDto;
import org.openapitools.client.model.SupportRequestDtoEnvelope;
import org.openapitools.client.model.SupportRequestDtoListEnvelope;
import org.openapitools.client.model.SupportRequestUpdateDto;
import org.openapitools.client.model.SupportTicketDtoListEnvelope;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SupportRequestsApi
 */
@Disabled
public class SupportRequestsApiTest {

    private final SupportRequestsApi api = new SupportRequestsApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SupportServiceSupportRequestsCountGetTest() throws ApiException {
        UUID tenantId = null;
        String apiVersion = null;
        String xApiVersion = null;
        Int32Envelope response = api.apiV2SupportServiceSupportRequestsCountGet(tenantId, apiVersion, xApiVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SupportServiceSupportRequestsGetTest() throws ApiException {
        UUID tenantId = null;
        String apiVersion = null;
        String xApiVersion = null;
        SupportRequestDtoListEnvelope response = api.apiV2SupportServiceSupportRequestsGet(tenantId, apiVersion, xApiVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SupportServiceSupportRequestsPostTest() throws ApiException {
        SupportRequestCreateDto supportRequestCreateDto = null;
        UUID tenantId = null;
        String apiVersion = null;
        String xApiVersion = null;
        EmptyEnvelope response = api.apiV2SupportServiceSupportRequestsPost(supportRequestCreateDto, tenantId, apiVersion, xApiVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsAttachmentIdGetTest() throws ApiException {
        UUID supportRequestId = null;
        UUID attachmentId = null;
        String apiVersion = null;
        String xApiVersion = null;
        SupportRequestAttachmentDtoEnvelope response = api.apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsAttachmentIdGet(supportRequestId, attachmentId, apiVersion, xApiVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsCountGetTest() throws ApiException {
        UUID supportRequestId = null;
        UUID tenantId = null;
        String apiVersion = null;
        String xApiVersion = null;
        Int32Envelope response = api.apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsCountGet(supportRequestId, tenantId, apiVersion, xApiVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsGetTest() throws ApiException {
        UUID supportRequestId = null;
        UUID tenantId = null;
        String apiVersion = null;
        String xApiVersion = null;
        SupportRequestAttachmentDtoListEnvelope response = api.apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsGet(supportRequestId, tenantId, apiVersion, xApiVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsPostTest() throws ApiException {
        UUID supportRequestId = null;
        SupportRequestAttachmentCreateDto supportRequestAttachmentCreateDto = null;
        String apiVersion = null;
        String xApiVersion = null;
        EmptyEnvelope response = api.apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsPost(supportRequestId, supportRequestAttachmentCreateDto, apiVersion, xApiVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SupportServiceSupportRequestsSupportRequestIdDeleteTest() throws ApiException {
        UUID supportRequestId = null;
        UUID tenantId = null;
        String apiVersion = null;
        String xApiVersion = null;
        EmptyEnvelope response = api.apiV2SupportServiceSupportRequestsSupportRequestIdDelete(supportRequestId, tenantId, apiVersion, xApiVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SupportServiceSupportRequestsSupportRequestIdGetTest() throws ApiException {
        UUID supportRequestId = null;
        String apiVersion = null;
        String xApiVersion = null;
        SupportRequestDtoEnvelope response = api.apiV2SupportServiceSupportRequestsSupportRequestIdGet(supportRequestId, apiVersion, xApiVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SupportServiceSupportRequestsSupportRequestIdPutTest() throws ApiException {
        UUID supportRequestId = null;
        SupportRequestUpdateDto supportRequestUpdateDto = null;
        UUID tenantId = null;
        String apiVersion = null;
        String xApiVersion = null;
        EmptyEnvelope response = api.apiV2SupportServiceSupportRequestsSupportRequestIdPut(supportRequestId, supportRequestUpdateDto, tenantId, apiVersion, xApiVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SupportServiceSupportRequestsSupportRequestIdTicketsGetTest() throws ApiException {
        UUID supportRequestId = null;
        UUID tenantId = null;
        String apiVersion = null;
        String xApiVersion = null;
        SupportTicketDtoListEnvelope response = api.apiV2SupportServiceSupportRequestsSupportRequestIdTicketsGet(supportRequestId, tenantId, apiVersion, xApiVersion);
        // TODO: test validations
    }

}