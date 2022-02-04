/*
 * ORY Oathkeeper
 * ORY Oathkeeper is a reverse proxy that checks the HTTP Authorization for validity against a set of rules. This service uses Hydra to validate access tokens and policies.
 *
 * The version of the OpenAPI document: v0.38.19-beta.1
 * Contact: hi@ory.am
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.oathkeeper.api;

import sh.ory.oathkeeper.ApiException;
import sh.ory.oathkeeper.model.HealthNotReadyStatus;
import sh.ory.oathkeeper.model.HealthStatus;
import sh.ory.oathkeeper.model.InlineResponse500;
import sh.ory.oathkeeper.model.JsonWebKeySet;
import sh.ory.oathkeeper.model.Rule;
import sh.ory.oathkeeper.model.Version;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApiApi
 */
@Ignore
public class ApiApiTest {

    private final ApiApi api = new ApiApi();

    
    /**
     * Access Control Decision API
     *
     * &gt; This endpoint works with all HTTP Methods (GET, POST, PUT, ...) and matches every path prefixed with /decision.  This endpoint mirrors the proxy capability of ORY Oathkeeper&#39;s proxy functionality but instead of forwarding the request to the upstream server, returns 200 (request should be allowed), 401 (unauthorized), or 403 (forbidden) status codes. This endpoint can be used to integrate with other API Proxies like Ambassador, Kong, Envoy, and many more.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void decisionsTest() throws ApiException {
        api.decisions();

        // TODO: test validations
    }
    
    /**
     * Retrieve a Rule
     *
     * Use this method to retrieve a rule from the storage. If it does not exist you will receive a 404 error.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRuleTest() throws ApiException {
        String id = null;
        Rule response = api.getRule(id);

        // TODO: test validations
    }
    
    /**
     * Get Service Version
     *
     * This endpoint returns the service version typically notated using semantic versioning.  If the service supports TLS Edge Termination, this endpoint does not require the &#x60;X-Forwarded-Proto&#x60; header to be set.  Be aware that if you are running multiple nodes of this service, the health status will never refer to the cluster state, only to a single instance.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVersionTest() throws ApiException {
        Version response = api.getVersion();

        // TODO: test validations
    }
    
    /**
     * Lists Cryptographic Keys
     *
     * This endpoint returns cryptographic keys that are required to, for example, verify signatures of ID Tokens.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWellKnownJSONWebKeysTest() throws ApiException {
        JsonWebKeySet response = api.getWellKnownJSONWebKeys();

        // TODO: test validations
    }
    
    /**
     * Check Alive Status
     *
     * This endpoint returns a 200 status code when the HTTP server is up running. This status does currently not include checks whether the database connection is working.  If the service supports TLS Edge Termination, this endpoint does not require the &#x60;X-Forwarded-Proto&#x60; header to be set.  Be aware that if you are running multiple nodes of this service, the health status will never refer to the cluster state, only to a single instance.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void isInstanceAliveTest() throws ApiException {
        HealthStatus response = api.isInstanceAlive();

        // TODO: test validations
    }
    
    /**
     * Check Readiness Status
     *
     * This endpoint returns a 200 status code when the HTTP server is up running and the environment dependencies (e.g. the database) are responsive as well.  If the service supports TLS Edge Termination, this endpoint does not require the &#x60;X-Forwarded-Proto&#x60; header to be set.  Be aware that if you are running multiple nodes of this service, the health status will never refer to the cluster state, only to a single instance.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void isInstanceReadyTest() throws ApiException {
        HealthStatus response = api.isInstanceReady();

        // TODO: test validations
    }
    
    /**
     * List All Rules
     *
     * This method returns an array of all rules that are stored in the backend. This is useful if you want to get a full view of what rules you have currently in place.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listRulesTest() throws ApiException {
        Long limit = null;
        Long offset = null;
        List<Rule> response = api.listRules(limit, offset);

        // TODO: test validations
    }
    
}
