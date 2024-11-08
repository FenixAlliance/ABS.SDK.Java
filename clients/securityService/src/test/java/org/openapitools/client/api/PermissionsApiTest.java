/*
 * SecurityService
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
import org.openapitools.client.model.SecurityPermissionCreateDto;
import org.openapitools.client.model.SecurityPermissionUpdateDto;
import org.openapitools.client.model.SecurityRoleDtoListEnvelope;
import org.openapitools.client.model.TenantEnrolmentDtoListEnvelope;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PermissionsApi
 */
@Disabled
public class PermissionsApiTest {

    private final PermissionsApi api = new PermissionsApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SecurityServicePermissionsGetTest() throws ApiException {
        UUID tenantId = null;
        String apiVersion = null;
        String xApiVersion = null;
        SecurityRoleDtoListEnvelope response = api.apiV2SecurityServicePermissionsGet(tenantId, apiVersion, xApiVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SecurityServicePermissionsPostTest() throws ApiException {
        UUID tenantId = null;
        SecurityPermissionCreateDto securityPermissionCreateDto = null;
        String apiVersion = null;
        String xApiVersion = null;
        EmptyEnvelope response = api.apiV2SecurityServicePermissionsPost(tenantId, securityPermissionCreateDto, apiVersion, xApiVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SecurityServicePermissionsSecurityPermissionIdApplicationsApplicationIdDeleteTest() throws ApiException {
        UUID tenantId = null;
        String securityPermissionId = null;
        String applicationId = null;
        String apiVersion = null;
        String xApiVersion = null;
        EmptyEnvelope response = api.apiV2SecurityServicePermissionsSecurityPermissionIdApplicationsApplicationIdDelete(tenantId, securityPermissionId, applicationId, apiVersion, xApiVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SecurityServicePermissionsSecurityPermissionIdApplicationsApplicationIdPostTest() throws ApiException {
        UUID tenantId = null;
        String securityPermissionId = null;
        String applicationId = null;
        String apiVersion = null;
        String xApiVersion = null;
        EmptyEnvelope response = api.apiV2SecurityServicePermissionsSecurityPermissionIdApplicationsApplicationIdPost(tenantId, securityPermissionId, applicationId, apiVersion, xApiVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SecurityServicePermissionsSecurityPermissionIdDeleteTest() throws ApiException {
        UUID tenantId = null;
        String securityPermissionId = null;
        String apiVersion = null;
        String xApiVersion = null;
        EmptyEnvelope response = api.apiV2SecurityServicePermissionsSecurityPermissionIdDelete(tenantId, securityPermissionId, apiVersion, xApiVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SecurityServicePermissionsSecurityPermissionIdEnrollmentsEnrollmentIdDeleteTest() throws ApiException {
        UUID tenantId = null;
        String securityPermissionId = null;
        String enrollmentId = null;
        String apiVersion = null;
        String xApiVersion = null;
        EmptyEnvelope response = api.apiV2SecurityServicePermissionsSecurityPermissionIdEnrollmentsEnrollmentIdDelete(tenantId, securityPermissionId, enrollmentId, apiVersion, xApiVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SecurityServicePermissionsSecurityPermissionIdEnrollmentsEnrollmentIdPostTest() throws ApiException {
        UUID tenantId = null;
        String securityPermissionId = null;
        String enrollmentId = null;
        String apiVersion = null;
        String xApiVersion = null;
        EmptyEnvelope response = api.apiV2SecurityServicePermissionsSecurityPermissionIdEnrollmentsEnrollmentIdPost(tenantId, securityPermissionId, enrollmentId, apiVersion, xApiVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SecurityServicePermissionsSecurityPermissionIdEnrollmentsGetTest() throws ApiException {
        UUID tenantId = null;
        String securityPermissionId = null;
        String apiVersion = null;
        String xApiVersion = null;
        TenantEnrolmentDtoListEnvelope response = api.apiV2SecurityServicePermissionsSecurityPermissionIdEnrollmentsGet(tenantId, securityPermissionId, apiVersion, xApiVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SecurityServicePermissionsSecurityPermissionIdGetTest() throws ApiException {
        UUID tenantId = null;
        String securityPermissionId = null;
        String apiVersion = null;
        String xApiVersion = null;
        SecurityRoleDtoListEnvelope response = api.apiV2SecurityServicePermissionsSecurityPermissionIdGet(tenantId, securityPermissionId, apiVersion, xApiVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SecurityServicePermissionsSecurityPermissionIdPutTest() throws ApiException {
        UUID tenantId = null;
        String securityPermissionId = null;
        SecurityPermissionUpdateDto securityPermissionUpdateDto = null;
        String apiVersion = null;
        String xApiVersion = null;
        EmptyEnvelope response = api.apiV2SecurityServicePermissionsSecurityPermissionIdPut(tenantId, securityPermissionId, securityPermissionUpdateDto, apiVersion, xApiVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SecurityServicePermissionsSecurityPermissionIdRolesSecurityRoleIdDeleteTest() throws ApiException {
        UUID tenantId = null;
        String securityPermissionId = null;
        String securityRoleId = null;
        String apiVersion = null;
        String xApiVersion = null;
        EmptyEnvelope response = api.apiV2SecurityServicePermissionsSecurityPermissionIdRolesSecurityRoleIdDelete(tenantId, securityPermissionId, securityRoleId, apiVersion, xApiVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SecurityServicePermissionsSecurityPermissionIdRolesSecurityRoleIdPostTest() throws ApiException {
        UUID tenantId = null;
        String securityPermissionId = null;
        String securityRoleId = null;
        String apiVersion = null;
        String xApiVersion = null;
        EmptyEnvelope response = api.apiV2SecurityServicePermissionsSecurityPermissionIdRolesSecurityRoleIdPost(tenantId, securityPermissionId, securityRoleId, apiVersion, xApiVersion);
        // TODO: test validations
    }

}
