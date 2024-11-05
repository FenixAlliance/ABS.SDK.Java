/*
 * PaymentsService
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
import org.openapitools.client.model.PaymentCreateDto;
import org.openapitools.client.model.PaymentDtoListEnvelope;
import org.openapitools.client.model.PaymentUpdateDto;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentsApi
 */
@Disabled
public class PaymentsApiTest {

    private final PaymentsApi api = new PaymentsApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2PaymentsServicePaymentsGetTest() throws ApiException {
        UUID tenantId = null;
        PaymentDtoListEnvelope response = api.apiV2PaymentsServicePaymentsGet(tenantId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2PaymentsServicePaymentsPaymentIdDeleteTest() throws ApiException {
        UUID tenantId = null;
        UUID paymentId = null;
        EmptyEnvelope response = api.apiV2PaymentsServicePaymentsPaymentIdDelete(tenantId, paymentId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2PaymentsServicePaymentsPaymentIdDetailsGetTest() throws ApiException {
        UUID paymentId = null;
        PaymentDtoListEnvelope response = api.apiV2PaymentsServicePaymentsPaymentIdDetailsGet(paymentId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2PaymentsServicePaymentsPaymentIdGetTest() throws ApiException {
        UUID paymentId = null;
        PaymentDtoListEnvelope response = api.apiV2PaymentsServicePaymentsPaymentIdGet(paymentId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2PaymentsServicePaymentsPaymentIdPutTest() throws ApiException {
        UUID tenantId = null;
        UUID paymentId = null;
        PaymentUpdateDto paymentUpdateDto = null;
        EmptyEnvelope response = api.apiV2PaymentsServicePaymentsPaymentIdPut(tenantId, paymentId, paymentUpdateDto);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2PaymentsServicePaymentsPostTest() throws ApiException {
        UUID tenantId = null;
        PaymentCreateDto paymentCreateDto = null;
        EmptyEnvelope response = api.apiV2PaymentsServicePaymentsPost(tenantId, paymentCreateDto);
        // TODO: test validations
    }

}
