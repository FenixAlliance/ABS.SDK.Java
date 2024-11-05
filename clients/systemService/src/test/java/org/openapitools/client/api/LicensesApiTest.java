/*
 * SystemService
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
import org.openapitools.client.model.BooleanEnvelope;
import org.openapitools.client.model.ErrorEnvelope;
import org.openapitools.client.model.LicenseAttributesListEnvelope;
import org.openapitools.client.model.LicenseKey;
import org.openapitools.client.model.LicenseKeyRequest;
import org.openapitools.client.model.LicenseValidationErrorListEnvelope;
import org.openapitools.client.model.StringEnvelope;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LicensesApi
 */
@Disabled
public class LicensesApiTest {

    private final LicensesApi api = new LicensesApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiLicensingLicensesGeneratePostTest() throws ApiException {
        UUID tenantId = null;
        String apiVersion = null;
        String xApiVersion = null;
        LicenseKeyRequest licenseKeyRequest = null;
        StringEnvelope response = api.apiLicensingLicensesGeneratePost(tenantId, apiVersion, xApiVersion, licenseKeyRequest);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiLicensingLicensesValidateAttributesGetTest() throws ApiException {
        UUID tenantId = null;
        String apiVersion = null;
        String xApiVersion = null;
        LicenseKey licenseKey = null;
        LicenseAttributesListEnvelope response = api.apiLicensingLicensesValidateAttributesGet(tenantId, apiVersion, xApiVersion, licenseKey);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiLicensingLicensesValidateErrorsGetTest() throws ApiException {
        UUID tenantId = null;
        String apiVersion = null;
        String xApiVersion = null;
        LicenseKey licenseKey = null;
        LicenseValidationErrorListEnvelope response = api.apiLicensingLicensesValidateErrorsGet(tenantId, apiVersion, xApiVersion, licenseKey);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiLicensingLicensesValidateGetTest() throws ApiException {
        UUID tenantId = null;
        String apiVersion = null;
        String xApiVersion = null;
        LicenseKey licenseKey = null;
        BooleanEnvelope response = api.apiLicensingLicensesValidateGet(tenantId, apiVersion, xApiVersion, licenseKey);
        // TODO: test validations
    }

}
