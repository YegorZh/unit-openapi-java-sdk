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


import org.openapitools.client.model.UnitDocumentResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UploadAJpegDocumentForAnApplicationApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public UploadAJpegDocumentForAnApplicationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UploadAJpegDocumentForAnApplicationApi(ApiClient apiClient) {
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
     * @param applicationId ID of the application to upload a file to (required)
     * @param documentId ID of the document to upload a file for (required)
     * @param body Upload JPEG File (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call executeCall(String applicationId, String documentId, Object body, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/applications/{applicationId}/documents/{documentId}/?"
            .replace("{" + "applicationId" + "}", localVarApiClient.escapeString(applicationId.toString()))
            .replace("{" + "documentId" + "}", localVarApiClient.escapeString(documentId.toString()));

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
            "image/jpeg"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call executeValidateBeforeCall(String applicationId, String documentId, Object body, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'applicationId' is set
        if (applicationId == null) {
            throw new ApiException("Missing the required parameter 'applicationId' when calling execute(Async)");
        }

        // verify the required parameter 'documentId' is set
        if (documentId == null) {
            throw new ApiException("Missing the required parameter 'documentId' when calling execute(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling execute(Async)");
        }

        return executeCall(applicationId, documentId, body, _callback);

    }

    /**
     * Upload a JPEG document
     * Upload a JPEG file via API 
     * @param applicationId ID of the application to upload a file to (required)
     * @param documentId ID of the document to upload a file for (required)
     * @param body Upload JPEG File (required)
     * @return UnitDocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
     */
    public UnitDocumentResponse execute(String applicationId, String documentId, Object body) throws ApiException {
        ApiResponse<UnitDocumentResponse> localVarResp = executeWithHttpInfo(applicationId, documentId, body);
        return localVarResp.getData();
    }

    /**
     * Upload a JPEG document
     * Upload a JPEG file via API 
     * @param applicationId ID of the application to upload a file to (required)
     * @param documentId ID of the document to upload a file for (required)
     * @param body Upload JPEG File (required)
     * @return ApiResponse&lt;UnitDocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<UnitDocumentResponse> executeWithHttpInfo(String applicationId, String documentId, Object body) throws ApiException {
        okhttp3.Call localVarCall = executeValidateBeforeCall(applicationId, documentId, body, null);
        Type localVarReturnType = new TypeToken<UnitDocumentResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Upload a JPEG document (asynchronously)
     * Upload a JPEG file via API 
     * @param applicationId ID of the application to upload a file to (required)
     * @param documentId ID of the document to upload a file for (required)
     * @param body Upload JPEG File (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call executeAsync(String applicationId, String documentId, Object body, final ApiCallback<UnitDocumentResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = executeValidateBeforeCall(applicationId, documentId, body, _callback);
        Type localVarReturnType = new TypeToken<UnitDocumentResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
