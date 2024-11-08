/*
 * DealsService
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
import org.openapitools.client.model.DealUnitCreateDto;
import org.openapitools.client.model.DealUnitDtoEnvelope;
import org.openapitools.client.model.DealUnitDtoListEnvelope;
import org.openapitools.client.model.DealUnitLineCreateDto;
import org.openapitools.client.model.DealUnitLineDtoEnvelope;
import org.openapitools.client.model.DealUnitLineDtoListEnvelope;
import org.openapitools.client.model.DealUnitLineUpdateDto;
import org.openapitools.client.model.DealUnitUpdateDto;
import org.openapitools.client.model.EmptyEnvelope;
import org.openapitools.client.model.ErrorEnvelope;
import org.openapitools.client.model.ExtendedDealUnitDtoEnvelope;
import org.openapitools.client.model.ExtendedDealUnitDtoListEnvelope;
import org.openapitools.client.model.Int32Envelope;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DealUnitsApi
 */
@Disabled
public class DealUnitsApiTest {

    private final DealUnitsApi api = new DealUnitsApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2DealsServiceDealUnitsCountGetTest() throws ApiException {
        UUID tenantId = null;
        Int32Envelope response = api.apiV2DealsServiceDealUnitsCountGet(tenantId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2DealsServiceDealUnitsDealUnitIdCalculatePutTest() throws ApiException {
        UUID tenantId = null;
        UUID dealUnitId = null;
        EmptyEnvelope response = api.apiV2DealsServiceDealUnitsDealUnitIdCalculatePut(tenantId, dealUnitId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2DealsServiceDealUnitsDealUnitIdDeleteTest() throws ApiException {
        UUID tenantId = null;
        UUID dealUnitId = null;
        EmptyEnvelope response = api.apiV2DealsServiceDealUnitsDealUnitIdDelete(tenantId, dealUnitId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2DealsServiceDealUnitsDealUnitIdExtendedGetTest() throws ApiException {
        UUID tenantId = null;
        UUID dealUnitId = null;
        ExtendedDealUnitDtoEnvelope response = api.apiV2DealsServiceDealUnitsDealUnitIdExtendedGet(tenantId, dealUnitId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2DealsServiceDealUnitsDealUnitIdLinesCountGetTest() throws ApiException {
        UUID tenantId = null;
        UUID dealUnitId = null;
        Int32Envelope response = api.apiV2DealsServiceDealUnitsDealUnitIdLinesCountGet(tenantId, dealUnitId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdCalculatePutTest() throws ApiException {
        UUID tenantId = null;
        UUID dealUnitId = null;
        UUID dealUnitLineId = null;
        EmptyEnvelope response = api.apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdCalculatePut(tenantId, dealUnitId, dealUnitLineId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdDeleteTest() throws ApiException {
        UUID tenantId = null;
        UUID dealUnitId = null;
        UUID dealUnitLineId = null;
        EmptyEnvelope response = api.apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdDelete(tenantId, dealUnitId, dealUnitLineId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdGetTest() throws ApiException {
        UUID tenantId = null;
        UUID dealUnitId = null;
        UUID dealUnitLineId = null;
        DealUnitLineDtoEnvelope response = api.apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdGet(tenantId, dealUnitId, dealUnitLineId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdPutTest() throws ApiException {
        UUID tenantId = null;
        UUID dealUnitId = null;
        UUID dealUnitLineId = null;
        DealUnitLineUpdateDto dealUnitLineUpdateDto = null;
        EmptyEnvelope response = api.apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdPut(tenantId, dealUnitId, dealUnitLineId, dealUnitLineUpdateDto);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2DealsServiceDealUnitsDealUnitIdLinesGetTest() throws ApiException {
        UUID tenantId = null;
        UUID dealUnitId = null;
        UUID itemId = null;
        DealUnitLineDtoListEnvelope response = api.apiV2DealsServiceDealUnitsDealUnitIdLinesGet(tenantId, dealUnitId, itemId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2DealsServiceDealUnitsDealUnitIdLinesPostTest() throws ApiException {
        UUID tenantId = null;
        UUID dealUnitId = null;
        DealUnitLineCreateDto dealUnitLineCreateDto = null;
        EmptyEnvelope response = api.apiV2DealsServiceDealUnitsDealUnitIdLinesPost(tenantId, dealUnitId, dealUnitLineCreateDto);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2DealsServiceDealUnitsDealUnitIdPutTest() throws ApiException {
        UUID tenantId = null;
        UUID dealUnitId = null;
        DealUnitUpdateDto dealUnitUpdateDto = null;
        EmptyEnvelope response = api.apiV2DealsServiceDealUnitsDealUnitIdPut(tenantId, dealUnitId, dealUnitUpdateDto);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2DealsServiceDealUnitsExtendedGetTest() throws ApiException {
        UUID tenantId = null;
        ExtendedDealUnitDtoListEnvelope response = api.apiV2DealsServiceDealUnitsExtendedGet(tenantId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2DealsServiceDealUnitsGetTest() throws ApiException {
        UUID tenantId = null;
        DealUnitDtoListEnvelope response = api.apiV2DealsServiceDealUnitsGet(tenantId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2DealsServiceDealUnitsPostTest() throws ApiException {
        UUID tenantId = null;
        DealUnitCreateDto dealUnitCreateDto = null;
        EmptyEnvelope response = api.apiV2DealsServiceDealUnitsPost(tenantId, dealUnitCreateDto);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDealUnitAsyncTest() throws ApiException {
        UUID tenantId = null;
        UUID dealUnitId = null;
        DealUnitDtoEnvelope response = api.getDealUnitAsync(tenantId, dealUnitId);
        // TODO: test validations
    }

}
