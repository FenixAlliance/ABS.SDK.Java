/*
 * InvoicingService
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
import org.openapitools.client.model.ExtendedInvoiceDtoListEnvelope;
import org.openapitools.client.model.Int32Envelope;
import org.openapitools.client.model.InvoiceAdjustmentCreateDto;
import org.openapitools.client.model.InvoiceAdjustmentDtoEnvelope;
import org.openapitools.client.model.InvoiceAdjustmentDtoListEnvelope;
import org.openapitools.client.model.InvoiceAdjustmentUpdateDto;
import org.openapitools.client.model.InvoiceCreateDto;
import org.openapitools.client.model.InvoiceDtoEnvelope;
import org.openapitools.client.model.InvoiceDtoListEnvelope;
import org.openapitools.client.model.InvoiceLineAppliedTaxCreateDto;
import org.openapitools.client.model.InvoiceLineAppliedTaxDtoListEnvelope;
import org.openapitools.client.model.InvoiceLineAppliedTaxUpdateDto;
import org.openapitools.client.model.InvoiceLineCreateDto;
import org.openapitools.client.model.InvoiceLineDtoEnvelope;
import org.openapitools.client.model.InvoiceLineDtoListEnvelope;
import org.openapitools.client.model.InvoiceLineUpdateDto;
import org.openapitools.client.model.InvoiceReferenceCreateDto;
import org.openapitools.client.model.InvoiceReferenceDtoEnvelope;
import org.openapitools.client.model.InvoiceReferenceDtoListEnvelope;
import org.openapitools.client.model.InvoiceReferenceUpdateDto;
import org.openapitools.client.model.InvoiceUpdateDto;
import org.openapitools.client.model.MoneyEnvelope;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InvoicesApi
 */
@Disabled
public class InvoicesApiTest {

    private final InvoicesApi api = new InvoicesApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2InvoicingServiceInvoicesCountGetTest() throws ApiException {
        UUID tenantId = null;
        Int32Envelope response = api.apiV2InvoicingServiceInvoicesCountGet(tenantId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2InvoicingServiceInvoicesDiscountsAggregatePostTest() throws ApiException {
        List<UUID> UUID = null;
        String currencyId = null;
        MoneyEnvelope response = api.apiV2InvoicingServiceInvoicesDiscountsAggregatePost(UUID, currencyId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2InvoicingServiceInvoicesExtendedCountGetTest() throws ApiException {
        UUID tenantId = null;
        Int32Envelope response = api.apiV2InvoicingServiceInvoicesExtendedCountGet(tenantId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2InvoicingServiceInvoicesExtendedGetTest() throws ApiException {
        UUID tenantId = null;
        ExtendedInvoiceDtoListEnvelope response = api.apiV2InvoicingServiceInvoicesExtendedGet(tenantId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2InvoicingServiceInvoicesGetTest() throws ApiException {
        UUID tenantId = null;
        InvoiceDtoListEnvelope response = api.apiV2InvoicingServiceInvoicesGet(tenantId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2InvoicingServiceInvoicesGlobalSurchargesAggregatePostTest() throws ApiException {
        List<UUID> UUID = null;
        String currencyId = null;
        MoneyEnvelope response = api.apiV2InvoicingServiceInvoicesGlobalSurchargesAggregatePost(UUID, currencyId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsCountGetTest() throws ApiException {
        UUID tenantId = null;
        UUID invoiceId = null;
        Int32Envelope response = api.apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsCountGet(tenantId, invoiceId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsGetTest() throws ApiException {
        UUID tenantId = null;
        UUID invoiceId = null;
        InvoiceAdjustmentDtoListEnvelope response = api.apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsGet(tenantId, invoiceId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdDeleteTest() throws ApiException {
        UUID tenantId = null;
        UUID invoiceId = null;
        UUID invoiceAdjustmentId = null;
        EmptyEnvelope response = api.apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdDelete(tenantId, invoiceId, invoiceAdjustmentId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdGetTest() throws ApiException {
        UUID tenantId = null;
        UUID invoiceId = null;
        UUID invoiceAdjustmentId = null;
        InvoiceAdjustmentDtoEnvelope response = api.apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdGet(tenantId, invoiceId, invoiceAdjustmentId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdPutTest() throws ApiException {
        UUID tenantId = null;
        UUID invoiceId = null;
        UUID invoiceAdjustmentId = null;
        InvoiceAdjustmentUpdateDto invoiceAdjustmentUpdateDto = null;
        EmptyEnvelope response = api.apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdPut(tenantId, invoiceId, invoiceAdjustmentId, invoiceAdjustmentUpdateDto);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsPostTest() throws ApiException {
        UUID tenantId = null;
        UUID invoiceId = null;
        InvoiceAdjustmentCreateDto invoiceAdjustmentCreateDto = null;
        EmptyEnvelope response = api.apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsPost(tenantId, invoiceId, invoiceAdjustmentCreateDto);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2InvoicingServiceInvoicesInvoiceIdCalculatePutTest() throws ApiException {
        UUID tenantId = null;
        UUID invoiceId = null;
        EmptyEnvelope response = api.apiV2InvoicingServiceInvoicesInvoiceIdCalculatePut(tenantId, invoiceId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2InvoicingServiceInvoicesInvoiceIdDeleteTest() throws ApiException {
        UUID tenantId = null;
        UUID invoiceId = null;
        EmptyEnvelope response = api.apiV2InvoicingServiceInvoicesInvoiceIdDelete(tenantId, invoiceId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2InvoicingServiceInvoicesInvoiceIdExtendedGetTest() throws ApiException {
        UUID tenantId = null;
        UUID invoiceId = null;
        InvoiceDtoEnvelope response = api.apiV2InvoicingServiceInvoicesInvoiceIdExtendedGet(tenantId, invoiceId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2InvoicingServiceInvoicesInvoiceIdLinesCountGetTest() throws ApiException {
        UUID tenantId = null;
        UUID invoiceId = null;
        Int32Envelope response = api.apiV2InvoicingServiceInvoicesInvoiceIdLinesCountGet(tenantId, invoiceId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2InvoicingServiceInvoicesInvoiceIdLinesGetTest() throws ApiException {
        UUID tenantId = null;
        UUID invoiceId = null;
        UUID itemId = null;
        InvoiceLineDtoListEnvelope response = api.apiV2InvoicingServiceInvoicesInvoiceIdLinesGet(tenantId, invoiceId, itemId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdCalculatePutTest() throws ApiException {
        UUID tenantId = null;
        UUID invoiceId = null;
        UUID invoiceLineId = null;
        EmptyEnvelope response = api.apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdCalculatePut(tenantId, invoiceId, invoiceLineId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdDeleteTest() throws ApiException {
        UUID tenantId = null;
        UUID invoiceId = null;
        UUID invoiceLineId = null;
        EmptyEnvelope response = api.apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdDelete(tenantId, invoiceId, invoiceLineId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdGetTest() throws ApiException {
        UUID tenantId = null;
        UUID invoiceId = null;
        UUID invoiceLineId = null;
        InvoiceLineDtoEnvelope response = api.apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdGet(tenantId, invoiceId, invoiceLineId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdPutTest() throws ApiException {
        UUID tenantId = null;
        UUID invoiceId = null;
        UUID invoiceLineId = null;
        InvoiceLineUpdateDto invoiceLineUpdateDto = null;
        EmptyEnvelope response = api.apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdPut(tenantId, invoiceId, invoiceLineId, invoiceLineUpdateDto);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesCountGetTest() throws ApiException {
        UUID tenantId = null;
        UUID invoiceId = null;
        UUID invoiceLineId = null;
        Int32Envelope response = api.apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesCountGet(tenantId, invoiceId, invoiceLineId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesGetTest() throws ApiException {
        UUID tenantId = null;
        UUID invoiceId = null;
        UUID invoiceLineId = null;
        InvoiceLineAppliedTaxDtoListEnvelope response = api.apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesGet(tenantId, invoiceId, invoiceLineId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesInvoiceLineTaxIdDeleteTest() throws ApiException {
        UUID tenantId = null;
        UUID invoiceId = null;
        UUID invoiceLineId = null;
        UUID invoiceLineTaxId = null;
        EmptyEnvelope response = api.apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesInvoiceLineTaxIdDelete(tenantId, invoiceId, invoiceLineId, invoiceLineTaxId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesInvoiceLineTaxIdPutTest() throws ApiException {
        UUID tenantId = null;
        UUID invoiceId = null;
        UUID invoiceLineId = null;
        UUID invoiceLineTaxId = null;
        InvoiceLineAppliedTaxUpdateDto invoiceLineAppliedTaxUpdateDto = null;
        EmptyEnvelope response = api.apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesInvoiceLineTaxIdPut(tenantId, invoiceId, invoiceLineId, invoiceLineTaxId, invoiceLineAppliedTaxUpdateDto);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesPostTest() throws ApiException {
        UUID tenantId = null;
        UUID invoiceId = null;
        UUID invoiceLineId = null;
        InvoiceLineAppliedTaxCreateDto invoiceLineAppliedTaxCreateDto = null;
        EmptyEnvelope response = api.apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesPost(tenantId, invoiceId, invoiceLineId, invoiceLineAppliedTaxCreateDto);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2InvoicingServiceInvoicesInvoiceIdLinesPostTest() throws ApiException {
        UUID tenantId = null;
        UUID invoiceId = null;
        InvoiceLineCreateDto invoiceLineCreateDto = null;
        EmptyEnvelope response = api.apiV2InvoicingServiceInvoicesInvoiceIdLinesPost(tenantId, invoiceId, invoiceLineCreateDto);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2InvoicingServiceInvoicesInvoiceIdPaymentsCountGetTest() throws ApiException {
        UUID invoiceId = null;
        Int32Envelope response = api.apiV2InvoicingServiceInvoicesInvoiceIdPaymentsCountGet(invoiceId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2InvoicingServiceInvoicesInvoiceIdPaymentsGetTest() throws ApiException {
        UUID invoiceId = null;
        InvoiceDtoListEnvelope response = api.apiV2InvoicingServiceInvoicesInvoiceIdPaymentsGet(invoiceId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2InvoicingServiceInvoicesInvoiceIdPutTest() throws ApiException {
        UUID tenantId = null;
        UUID invoiceId = null;
        InvoiceUpdateDto invoiceUpdateDto = null;
        EmptyEnvelope response = api.apiV2InvoicingServiceInvoicesInvoiceIdPut(tenantId, invoiceId, invoiceUpdateDto);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2InvoicingServiceInvoicesInvoiceIdReferencesCountGetTest() throws ApiException {
        UUID tenantId = null;
        UUID invoiceId = null;
        Int32Envelope response = api.apiV2InvoicingServiceInvoicesInvoiceIdReferencesCountGet(tenantId, invoiceId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2InvoicingServiceInvoicesInvoiceIdReferencesGetTest() throws ApiException {
        UUID tenantId = null;
        UUID invoiceId = null;
        InvoiceReferenceDtoListEnvelope response = api.apiV2InvoicingServiceInvoicesInvoiceIdReferencesGet(tenantId, invoiceId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdDeleteTest() throws ApiException {
        UUID tenantId = null;
        UUID invoiceId = null;
        UUID invoiceReferenceId = null;
        EmptyEnvelope response = api.apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdDelete(tenantId, invoiceId, invoiceReferenceId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdGetTest() throws ApiException {
        UUID tenantId = null;
        UUID invoiceId = null;
        UUID invoiceReferenceId = null;
        InvoiceReferenceDtoEnvelope response = api.apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdGet(tenantId, invoiceId, invoiceReferenceId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdPutTest() throws ApiException {
        UUID tenantId = null;
        UUID invoiceId = null;
        UUID invoiceReferenceId = null;
        InvoiceReferenceUpdateDto invoiceReferenceUpdateDto = null;
        EmptyEnvelope response = api.apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdPut(tenantId, invoiceId, invoiceReferenceId, invoiceReferenceUpdateDto);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2InvoicingServiceInvoicesInvoiceIdReferencesPostTest() throws ApiException {
        UUID tenantId = null;
        UUID invoiceId = null;
        InvoiceReferenceCreateDto invoiceReferenceCreateDto = null;
        EmptyEnvelope response = api.apiV2InvoicingServiceInvoicesInvoiceIdReferencesPost(tenantId, invoiceId, invoiceReferenceCreateDto);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2InvoicingServiceInvoicesPostTest() throws ApiException {
        UUID tenantId = null;
        InvoiceCreateDto invoiceCreateDto = null;
        EmptyEnvelope response = api.apiV2InvoicingServiceInvoicesPost(tenantId, invoiceCreateDto);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2InvoicingServiceInvoicesTaxBasesAggregatePostTest() throws ApiException {
        List<UUID> UUID = null;
        String currencyId = null;
        MoneyEnvelope response = api.apiV2InvoicingServiceInvoicesTaxBasesAggregatePost(UUID, currencyId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2InvoicingServiceInvoicesTaxesAggregatePostTest() throws ApiException {
        List<UUID> UUID = null;
        String currencyId = null;
        MoneyEnvelope response = api.apiV2InvoicingServiceInvoicesTaxesAggregatePost(UUID, currencyId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2InvoicingServiceInvoicesTotalsAggregatePostTest() throws ApiException {
        List<UUID> UUID = null;
        String currencyId = null;
        MoneyEnvelope response = api.apiV2InvoicingServiceInvoicesTotalsAggregatePost(UUID, currencyId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getInvoiceAsyncTest() throws ApiException {
        UUID tenantId = null;
        UUID invoiceId = null;
        InvoiceDtoEnvelope response = api.getInvoiceAsync(tenantId, invoiceId);
        // TODO: test validations
    }

}