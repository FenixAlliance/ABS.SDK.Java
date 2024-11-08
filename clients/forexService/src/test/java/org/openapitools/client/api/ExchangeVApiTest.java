/*
 * ForexService
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
import org.openapitools.client.model.ErrorEnvelope;
import org.openapitools.client.model.ExchangeRateEnvelope;
import java.time.LocalDate;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExchangeVApi
 */
@Disabled
public class ExchangeVApiTest {

    private final ExchangeVApi api = new ExchangeVApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV3ForexServiceExchangeHistoryGetTest() throws ApiException {
        Double amount = null;
        String sourceCurrencyId = null;
        String targetCurrencyId = null;
        LocalDate date = null;
        ExchangeRateEnvelope response = api.apiV3ForexServiceExchangeHistoryGet(amount, sourceCurrencyId, targetCurrencyId, date);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV3ForexServiceExchangeLatestGetTest() throws ApiException {
        Double amount = null;
        String sourceCurrencyId = null;
        String targetCurrencyId = null;
        ExchangeRateEnvelope response = api.apiV3ForexServiceExchangeLatestGet(amount, sourceCurrencyId, targetCurrencyId);
        // TODO: test validations
    }

}
