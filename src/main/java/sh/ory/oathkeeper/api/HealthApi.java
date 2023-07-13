/*
 * ORY Oathkeeper
 * ORY Oathkeeper is a reverse proxy that checks the HTTP Authorization for validity against a set of rules. This service uses Hydra to validate access tokens and policies.
 *
 * The version of the OpenAPI document: v0.40.4
 * Contact: hi@ory.am
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.oathkeeper.api;

import sh.ory.oathkeeper.ApiCallback;
import sh.ory.oathkeeper.ApiClient;
import sh.ory.oathkeeper.ApiException;
import sh.ory.oathkeeper.ApiResponse;
import sh.ory.oathkeeper.Configuration;
import sh.ory.oathkeeper.Pair;
import sh.ory.oathkeeper.ProgressRequestBody;
import sh.ory.oathkeeper.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import sh.ory.oathkeeper.model.HealthNotReadyStatus;
import sh.ory.oathkeeper.model.HealthStatus;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class HealthApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public HealthApi() {
        this(Configuration.getDefaultApiClient());
    }

    public HealthApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for isInstanceAlive
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> healthStatus </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> unexpectedError </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call isInstanceAliveCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/health/alive";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json",
            "text/plain"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call isInstanceAliveValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return isInstanceAliveCall(_callback);

    }

    /**
     * Check alive status
     * This endpoint returns a 200 status code when the HTTP server is up running. This status does currently not include checks whether the database connection is working.  If the service supports TLS Edge Termination, this endpoint does not require the &#x60;X-Forwarded-Proto&#x60; header to be set.  Be aware that if you are running multiple nodes of this service, the health status will never refer to the cluster state, only to a single instance.
     * @return HealthStatus
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> healthStatus </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> unexpectedError </td><td>  -  </td></tr>
     </table>
     */
    public HealthStatus isInstanceAlive() throws ApiException {
        ApiResponse<HealthStatus> localVarResp = isInstanceAliveWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Check alive status
     * This endpoint returns a 200 status code when the HTTP server is up running. This status does currently not include checks whether the database connection is working.  If the service supports TLS Edge Termination, this endpoint does not require the &#x60;X-Forwarded-Proto&#x60; header to be set.  Be aware that if you are running multiple nodes of this service, the health status will never refer to the cluster state, only to a single instance.
     * @return ApiResponse&lt;HealthStatus&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> healthStatus </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> unexpectedError </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<HealthStatus> isInstanceAliveWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = isInstanceAliveValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<HealthStatus>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Check alive status (asynchronously)
     * This endpoint returns a 200 status code when the HTTP server is up running. This status does currently not include checks whether the database connection is working.  If the service supports TLS Edge Termination, this endpoint does not require the &#x60;X-Forwarded-Proto&#x60; header to be set.  Be aware that if you are running multiple nodes of this service, the health status will never refer to the cluster state, only to a single instance.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> healthStatus </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> unexpectedError </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call isInstanceAliveAsync(final ApiCallback<HealthStatus> _callback) throws ApiException {

        okhttp3.Call localVarCall = isInstanceAliveValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<HealthStatus>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for isInstanceReady
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> healthStatus </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> healthNotReadyStatus </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> unexpectedError </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call isInstanceReadyCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/health/ready";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json",
            "text/plain"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call isInstanceReadyValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return isInstanceReadyCall(_callback);

    }

    /**
     * Check readiness status
     * This endpoint returns a 200 status code when the HTTP server is up running and the environment dependencies (e.g. the database) are responsive as well.  If the service supports TLS Edge Termination, this endpoint does not require the &#x60;X-Forwarded-Proto&#x60; header to be set.  Be aware that if you are running multiple nodes of this service, the health status will never refer to the cluster state, only to a single instance.
     * @return HealthStatus
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> healthStatus </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> healthNotReadyStatus </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> unexpectedError </td><td>  -  </td></tr>
     </table>
     */
    public HealthStatus isInstanceReady() throws ApiException {
        ApiResponse<HealthStatus> localVarResp = isInstanceReadyWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Check readiness status
     * This endpoint returns a 200 status code when the HTTP server is up running and the environment dependencies (e.g. the database) are responsive as well.  If the service supports TLS Edge Termination, this endpoint does not require the &#x60;X-Forwarded-Proto&#x60; header to be set.  Be aware that if you are running multiple nodes of this service, the health status will never refer to the cluster state, only to a single instance.
     * @return ApiResponse&lt;HealthStatus&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> healthStatus </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> healthNotReadyStatus </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> unexpectedError </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<HealthStatus> isInstanceReadyWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = isInstanceReadyValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<HealthStatus>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Check readiness status (asynchronously)
     * This endpoint returns a 200 status code when the HTTP server is up running and the environment dependencies (e.g. the database) are responsive as well.  If the service supports TLS Edge Termination, this endpoint does not require the &#x60;X-Forwarded-Proto&#x60; header to be set.  Be aware that if you are running multiple nodes of this service, the health status will never refer to the cluster state, only to a single instance.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> healthStatus </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> healthNotReadyStatus </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> unexpectedError </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call isInstanceReadyAsync(final ApiCallback<HealthStatus> _callback) throws ApiException {

        okhttp3.Call localVarCall = isInstanceReadyValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<HealthStatus>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
