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

import org.openapitools.client.ApiException;
import org.openapitools.client.model.OrderDtoEnvelope;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TrackingPixelsApi
 */
@Disabled
public class TrackingPixelsApiTest {

    private final TrackingPixelsApi api = new TrackingPixelsApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2MarketingServiceTrackingPixelsPixelIdGetTest() throws ApiException {
        UUID pixelId = null;
        String apiVersion = null;
        String xApiVersion = null;
        OrderDtoEnvelope response = api.apiV2MarketingServiceTrackingPixelsPixelIdGet(pixelId, apiVersion, xApiVersion);
        // TODO: test validations
    }

}
