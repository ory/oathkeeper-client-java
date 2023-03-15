/*
 * ORY Oathkeeper
 * ORY Oathkeeper is a reverse proxy that checks the HTTP Authorization for validity against a set of rules. This service uses Hydra to validate access tokens and policies.
 *
 * The version of the OpenAPI document: v0.40.2
 * Contact: hi@ory.am
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.oathkeeper.api;

import sh.ory.oathkeeper.ApiException;
import sh.ory.oathkeeper.model.GenericError;
import sh.ory.oathkeeper.model.HealthNotReadyStatus;
import sh.ory.oathkeeper.model.HealthStatus;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for HealthApi
 */
@Disabled
public class HealthApiTest {

    private final HealthApi api = new HealthApi();

    /**
     * Check alive status
     *
     * This endpoint returns a 200 status code when the HTTP server is up running. This status does currently not include checks whether the database connection is working.  If the service supports TLS Edge Termination, this endpoint does not require the &#x60;X-Forwarded-Proto&#x60; header to be set.  Be aware that if you are running multiple nodes of this service, the health status will never refer to the cluster state, only to a single instance.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void isInstanceAliveTest() throws ApiException {
        HealthStatus response = api.isInstanceAlive();
        // TODO: test validations
    }

    /**
     * Check readiness status
     *
     * This endpoint returns a 200 status code when the HTTP server is up running and the environment dependencies (e.g. the database) are responsive as well.  If the service supports TLS Edge Termination, this endpoint does not require the &#x60;X-Forwarded-Proto&#x60; header to be set.  Be aware that if you are running multiple nodes of this service, the health status will never refer to the cluster state, only to a single instance.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void isInstanceReadyTest() throws ApiException {
        HealthStatus response = api.isInstanceReady();
        // TODO: test validations
    }

}
