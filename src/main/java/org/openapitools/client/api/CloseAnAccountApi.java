/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.0.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.CloseAccountRequest;
import org.openapitools.client.model.UnitAccountResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CloseAnAccountApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CloseAnAccountApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CloseAnAccountApi(ApiClient apiClient) {
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
     * Build call for execute
     * @param accountId ID of the account to close (required)
     * @param closeAccountRequest Close Account Request (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call executeCall(String accountId, CloseAccountRequest closeAccountRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = closeAccountRequest;

        // create path and map variables
        String localVarPath = "/accounts/{accountId}/close"
            .replace("{" + "accountId" + "}", localVarApiClient.escapeString(accountId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/vnd.api+json; charset=utf-8"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/vnd.api+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call executeValidateBeforeCall(String accountId, CloseAccountRequest closeAccountRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling execute(Async)");
        }

        // verify the required parameter 'closeAccountRequest' is set
        if (closeAccountRequest == null) {
            throw new ApiException("Missing the required parameter 'closeAccountRequest' when calling execute(Async)");
        }

        return executeCall(accountId, closeAccountRequest, _callback);

    }

    /**
     * Close an Account by Id
     * Close an Account via API 
     * @param accountId ID of the account to close (required)
     * @param closeAccountRequest Close Account Request (required)
     * @return UnitAccountResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public UnitAccountResponse execute(String accountId, CloseAccountRequest closeAccountRequest) throws ApiException {
        ApiResponse<UnitAccountResponse> localVarResp = executeWithHttpInfo(accountId, closeAccountRequest);
        return localVarResp.getData();
    }

    /**
     * Close an Account by Id
     * Close an Account via API 
     * @param accountId ID of the account to close (required)
     * @param closeAccountRequest Close Account Request (required)
     * @return ApiResponse&lt;UnitAccountResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<UnitAccountResponse> executeWithHttpInfo(String accountId, CloseAccountRequest closeAccountRequest) throws ApiException {
        okhttp3.Call localVarCall = executeValidateBeforeCall(accountId, closeAccountRequest, null);
        Type localVarReturnType = new TypeToken<UnitAccountResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Close an Account by Id (asynchronously)
     * Close an Account via API 
     * @param accountId ID of the account to close (required)
     * @param closeAccountRequest Close Account Request (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call executeAsync(String accountId, CloseAccountRequest closeAccountRequest, final ApiCallback<UnitAccountResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = executeValidateBeforeCall(accountId, closeAccountRequest, _callback);
        Type localVarReturnType = new TypeToken<UnitAccountResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
