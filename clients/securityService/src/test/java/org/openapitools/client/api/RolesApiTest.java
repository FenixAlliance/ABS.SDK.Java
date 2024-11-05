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
import org.openapitools.client.model.SecurityPermissionDtoListEnvelope;
import org.openapitools.client.model.SecurityRoleCreateDto;
import org.openapitools.client.model.SecurityRoleDtoListEnvelope;
import org.openapitools.client.model.SecurityRoleUpdateDto;
import org.openapitools.client.model.TenantEnrolmentDtoListEnvelope;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RolesApi
 */
@Disabled
public class RolesApiTest {

    private final RolesApi api = new RolesApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SecurityServiceRolesGetTest() throws ApiException {
        UUID tenantId = null;
        String apiVersion = null;
        String xApiVersion = null;
        SecurityRoleDtoListEnvelope response = api.apiV2SecurityServiceRolesGet(tenantId, apiVersion, xApiVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SecurityServiceRolesPostTest() throws ApiException {
        UUID tenantId = null;
        String apiVersion = null;
        String xApiVersion = null;
        SecurityRoleCreateDto securityRoleCreateDto = null;
        EmptyEnvelope response = api.apiV2SecurityServiceRolesPost(tenantId, apiVersion, xApiVersion, securityRoleCreateDto);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SecurityServiceRolesSecurityRoleIdApplicationsApplicationIdDeleteTest() throws ApiException {
        UUID tenantId = null;
        String securityRoleId = null;
        UUID applicationId = null;
        String apiVersion = null;
        String xApiVersion = null;
        EmptyEnvelope response = api.apiV2SecurityServiceRolesSecurityRoleIdApplicationsApplicationIdDelete(tenantId, securityRoleId, applicationId, apiVersion, xApiVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SecurityServiceRolesSecurityRoleIdApplicationsApplicationIdPostTest() throws ApiException {
        UUID tenantId = null;
        String securityRoleId = null;
        UUID applicationId = null;
        String apiVersion = null;
        String xApiVersion = null;
        EmptyEnvelope response = api.apiV2SecurityServiceRolesSecurityRoleIdApplicationsApplicationIdPost(tenantId, securityRoleId, applicationId, apiVersion, xApiVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SecurityServiceRolesSecurityRoleIdDeleteTest() throws ApiException {
        UUID tenantId = null;
        String securityRoleId = null;
        String apiVersion = null;
        String xApiVersion = null;
        EmptyEnvelope response = api.apiV2SecurityServiceRolesSecurityRoleIdDelete(tenantId, securityRoleId, apiVersion, xApiVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsEnrollmentIdDeleteTest() throws ApiException {
        UUID tenantId = null;
        String securityRoleId = null;
        String enrollmentId = null;
        String apiVersion = null;
        String xApiVersion = null;
        EmptyEnvelope response = api.apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsEnrollmentIdDelete(tenantId, securityRoleId, enrollmentId, apiVersion, xApiVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsEnrollmentIdPostTest() throws ApiException {
        UUID tenantId = null;
        String securityRoleId = null;
        String enrollmentId = null;
        String apiVersion = null;
        String xApiVersion = null;
        EmptyEnvelope response = api.apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsEnrollmentIdPost(tenantId, securityRoleId, enrollmentId, apiVersion, xApiVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsGetTest() throws ApiException {
        UUID tenantId = null;
        String securityRoleId = null;
        String apiVersion = null;
        String xApiVersion = null;
        TenantEnrolmentDtoListEnvelope response = api.apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsGet(tenantId, securityRoleId, apiVersion, xApiVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SecurityServiceRolesSecurityRoleIdGetTest() throws ApiException {
        UUID tenantId = null;
        String securityRoleId = null;
        String apiVersion = null;
        String xApiVersion = null;
        SecurityRoleDtoListEnvelope response = api.apiV2SecurityServiceRolesSecurityRoleIdGet(tenantId, securityRoleId, apiVersion, xApiVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SecurityServiceRolesSecurityRoleIdPermissionsGetTest() throws ApiException {
        UUID tenantId = null;
        String securityRoleId = null;
        String apiVersion = null;
        String xApiVersion = null;
        SecurityPermissionDtoListEnvelope response = api.apiV2SecurityServiceRolesSecurityRoleIdPermissionsGet(tenantId, securityRoleId, apiVersion, xApiVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SecurityServiceRolesSecurityRoleIdPermissionsSecurityPermissionIdDeleteTest() throws ApiException {
        UUID tenantId = null;
        String securityRoleId = null;
        String securityPermissionId = null;
        String apiVersion = null;
        String xApiVersion = null;
        EmptyEnvelope response = api.apiV2SecurityServiceRolesSecurityRoleIdPermissionsSecurityPermissionIdDelete(tenantId, securityRoleId, securityPermissionId, apiVersion, xApiVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SecurityServiceRolesSecurityRoleIdPermissionsSecurityPermissionIdPostTest() throws ApiException {
        UUID tenantId = null;
        String securityRoleId = null;
        String securityPermissionId = null;
        String apiVersion = null;
        String xApiVersion = null;
        EmptyEnvelope response = api.apiV2SecurityServiceRolesSecurityRoleIdPermissionsSecurityPermissionIdPost(tenantId, securityRoleId, securityPermissionId, apiVersion, xApiVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2SecurityServiceRolesSecurityRoleIdPutTest() throws ApiException {
        UUID tenantId = null;
        String securityRoleId = null;
        String apiVersion = null;
        String xApiVersion = null;
        SecurityRoleUpdateDto securityRoleUpdateDto = null;
        EmptyEnvelope response = api.apiV2SecurityServiceRolesSecurityRoleIdPut(tenantId, securityRoleId, apiVersion, xApiVersion, securityRoleUpdateDto);
        // TODO: test validations
    }

}