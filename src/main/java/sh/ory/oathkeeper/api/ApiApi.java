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


import sh.ory.oathkeeper.model.GenericError;
import sh.ory.oathkeeper.model.JsonWebKeySet;
import sh.ory.oathkeeper.model.Rule;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ApiApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ApiApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ApiApi(ApiClient apiClient) {
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
     * Build call for decisions
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> An empty response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> genericError </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call decisionsCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/decisions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
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
    private okhttp3.Call decisionsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return decisionsCall(_callback);

    }

    /**
     * Access Control Decision API
     * &gt; This endpoint works with all HTTP Methods (GET, POST, PUT, ...) and matches every path prefixed with /decisions.  This endpoint mirrors the proxy capability of ORY Oathkeeper&#39;s proxy functionality but instead of forwarding the request to the upstream server, returns 200 (request should be allowed), 401 (unauthorized), or 403 (forbidden) status codes. This endpoint can be used to integrate with other API Proxies like Ambassador, Kong, Envoy, and many more.
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> An empty response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> genericError </td><td>  -  </td></tr>
     </table>
     */
    public void decisions() throws ApiException {
        decisionsWithHttpInfo();
    }

    /**
     * Access Control Decision API
     * &gt; This endpoint works with all HTTP Methods (GET, POST, PUT, ...) and matches every path prefixed with /decisions.  This endpoint mirrors the proxy capability of ORY Oathkeeper&#39;s proxy functionality but instead of forwarding the request to the upstream server, returns 200 (request should be allowed), 401 (unauthorized), or 403 (forbidden) status codes. This endpoint can be used to integrate with other API Proxies like Ambassador, Kong, Envoy, and many more.
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> An empty response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> genericError </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> decisionsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = decisionsValidateBeforeCall(null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Access Control Decision API (asynchronously)
     * &gt; This endpoint works with all HTTP Methods (GET, POST, PUT, ...) and matches every path prefixed with /decisions.  This endpoint mirrors the proxy capability of ORY Oathkeeper&#39;s proxy functionality but instead of forwarding the request to the upstream server, returns 200 (request should be allowed), 401 (unauthorized), or 403 (forbidden) status codes. This endpoint can be used to integrate with other API Proxies like Ambassador, Kong, Envoy, and many more.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> An empty response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> genericError </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call decisionsAsync(final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = decisionsValidateBeforeCall(_callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getRule
     * @param id  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A rule </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> genericError </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getRuleCall(String id, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/rules/{id}"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
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
    private okhttp3.Call getRuleValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getRule(Async)");
        }

        return getRuleCall(id, _callback);

    }

    /**
     * Retrieve a Rule
     * Use this method to retrieve a rule from the storage. If it does not exist you will receive a 404 error.
     * @param id  (required)
     * @return Rule
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A rule </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> genericError </td><td>  -  </td></tr>
     </table>
     */
    public Rule getRule(String id) throws ApiException {
        ApiResponse<Rule> localVarResp = getRuleWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Retrieve a Rule
     * Use this method to retrieve a rule from the storage. If it does not exist you will receive a 404 error.
     * @param id  (required)
     * @return ApiResponse&lt;Rule&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A rule </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> genericError </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Rule> getRuleWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = getRuleValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<Rule>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve a Rule (asynchronously)
     * Use this method to retrieve a rule from the storage. If it does not exist you will receive a 404 error.
     * @param id  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A rule </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> genericError </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getRuleAsync(String id, final ApiCallback<Rule> _callback) throws ApiException {

        okhttp3.Call localVarCall = getRuleValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<Rule>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getWellKnownJSONWebKeys
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> jsonWebKeySet </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> genericError </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getWellKnownJSONWebKeysCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/.well-known/jwks.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
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
    private okhttp3.Call getWellKnownJSONWebKeysValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getWellKnownJSONWebKeysCall(_callback);

    }

    /**
     * Lists Cryptographic Keys
     * This endpoint returns cryptographic keys that are required to, for example, verify signatures of ID Tokens.
     * @return JsonWebKeySet
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> jsonWebKeySet </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> genericError </td><td>  -  </td></tr>
     </table>
     */
    public JsonWebKeySet getWellKnownJSONWebKeys() throws ApiException {
        ApiResponse<JsonWebKeySet> localVarResp = getWellKnownJSONWebKeysWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Lists Cryptographic Keys
     * This endpoint returns cryptographic keys that are required to, for example, verify signatures of ID Tokens.
     * @return ApiResponse&lt;JsonWebKeySet&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> jsonWebKeySet </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> genericError </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<JsonWebKeySet> getWellKnownJSONWebKeysWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getWellKnownJSONWebKeysValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<JsonWebKeySet>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Lists Cryptographic Keys (asynchronously)
     * This endpoint returns cryptographic keys that are required to, for example, verify signatures of ID Tokens.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> jsonWebKeySet </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> genericError </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getWellKnownJSONWebKeysAsync(final ApiCallback<JsonWebKeySet> _callback) throws ApiException {

        okhttp3.Call localVarCall = getWellKnownJSONWebKeysValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<JsonWebKeySet>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listRules
     * @param limit The maximum amount of rules returned. (optional)
     * @param offset The offset from where to start looking. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of rules </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> genericError </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listRulesCall(Long limit, Long offset, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/rules";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        final String[] localVarAccepts = {
            "application/json"
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
    private okhttp3.Call listRulesValidateBeforeCall(Long limit, Long offset, final ApiCallback _callback) throws ApiException {
        return listRulesCall(limit, offset, _callback);

    }

    /**
     * List All Rules
     * This method returns an array of all rules that are stored in the backend. This is useful if you want to get a full view of what rules you have currently in place.
     * @param limit The maximum amount of rules returned. (optional)
     * @param offset The offset from where to start looking. (optional)
     * @return List&lt;Rule&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of rules </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> genericError </td><td>  -  </td></tr>
     </table>
     */
    public List<Rule> listRules(Long limit, Long offset) throws ApiException {
        ApiResponse<List<Rule>> localVarResp = listRulesWithHttpInfo(limit, offset);
        return localVarResp.getData();
    }

    /**
     * List All Rules
     * This method returns an array of all rules that are stored in the backend. This is useful if you want to get a full view of what rules you have currently in place.
     * @param limit The maximum amount of rules returned. (optional)
     * @param offset The offset from where to start looking. (optional)
     * @return ApiResponse&lt;List&lt;Rule&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of rules </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> genericError </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Rule>> listRulesWithHttpInfo(Long limit, Long offset) throws ApiException {
        okhttp3.Call localVarCall = listRulesValidateBeforeCall(limit, offset, null);
        Type localVarReturnType = new TypeToken<List<Rule>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List All Rules (asynchronously)
     * This method returns an array of all rules that are stored in the backend. This is useful if you want to get a full view of what rules you have currently in place.
     * @param limit The maximum amount of rules returned. (optional)
     * @param offset The offset from where to start looking. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of rules </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> genericError </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listRulesAsync(Long limit, Long offset, final ApiCallback<List<Rule>> _callback) throws ApiException {

        okhttp3.Call localVarCall = listRulesValidateBeforeCall(limit, offset, _callback);
        Type localVarReturnType = new TypeToken<List<Rule>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
