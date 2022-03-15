package DEFAULT.api;

import DEFAULT.ApiCallback;
import DEFAULT.ApiClient;
import DEFAULT.ApiException;
import DEFAULT.ApiResponse;
import DEFAULT.Configuration;
import DEFAULT.Pair;
import DEFAULT.ProgressRequestBody;
import DEFAULT.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.Response;

import java.io.IOException;


import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConversionsApi {
  private ApiClient apiClient;

  public ConversionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ConversionsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /* Build call for getaconversion */
  private Call getaconversionCall(String conversionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'conversionId' is set
    if (conversionId == null) {
       throw new ApiException("Missing the required parameter 'conversionId' when calling getaconversion(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/conversions/{conversionId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "conversionId" + "\\}", apiClient.escapeString(conversionId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    if(progressListener != null) {
      apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
      @Override
      public Response intercept(Interceptor.Chain chain) throws IOException {
        Response originalResponse = chain.proceed(chain.request());
        return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
        }
      });
    }

    String[] localVarAuthNames = new String[] {  };
    return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
  }

  /**
   * Get a conversion
   * This endpoint fetches a specific conversion performed by a business. 
   * @param conversionId The ID of the conversion (required)
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public void getaconversion(String conversionId) throws ApiException {
    getaconversionWithHttpInfo(conversionId);
  }

  /**
   * Get a conversion
   * This endpoint fetches a specific conversion performed by a business. 
   * @param conversionId The ID of the conversion (required)
   * @return ApiResponse<Void>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<Void> getaconversionWithHttpInfo(String conversionId) throws ApiException {
    Call call = getaconversionCall(conversionId, null, null);
    return apiClient.execute(call);
  }

  /**
   * Get a conversion (asynchronously)
   * This endpoint fetches a specific conversion performed by a business. 
   * @param conversionId The ID of the conversion (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getaconversionAsync(String conversionId, final ApiCallback<Void> callback) throws ApiException {

    ProgressResponseBody.ProgressListener progressListener = null;
    ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

    if (callback != null) {
      progressListener = new ProgressResponseBody.ProgressListener() {
        @Override
        public void update(long bytesRead, long contentLength, boolean done) {
          callback.onDownloadProgress(bytesRead, contentLength, done);
        }
      };

      progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
        @Override
        public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
          callback.onUploadProgress(bytesWritten, contentLength, done);
        }
      };
    }

    Call call = getaconversionCall(conversionId, progressListener, progressRequestListener);
    apiClient.executeAsync(call, callback);
    return call;
  }
  /* Build call for getallconversions */
  private Call getallconversionsCall(String businessId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'businessId' is set
    if (businessId == null) {
       throw new ApiException("Missing the required parameter 'businessId' when calling getallconversions(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/conversions/business/{businessId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "businessId" + "\\}", apiClient.escapeString(businessId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    if(progressListener != null) {
      apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
      @Override
      public Response intercept(Interceptor.Chain chain) throws IOException {
        Response originalResponse = chain.proceed(chain.request());
        return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
        }
      });
    }

    String[] localVarAuthNames = new String[] {  };
    return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
  }

  /**
   * Get all conversions
   * This endpoint provides a list of all conversions performed by a business. 
   * @param businessId This could be the ID of the business or the ID of a sub-account of the business (required)
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public void getallconversions(String businessId) throws ApiException {
    getallconversionsWithHttpInfo(businessId);
  }

  /**
   * Get all conversions
   * This endpoint provides a list of all conversions performed by a business. 
   * @param businessId This could be the ID of the business or the ID of a sub-account of the business (required)
   * @return ApiResponse<Void>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<Void> getallconversionsWithHttpInfo(String businessId) throws ApiException {
    Call call = getallconversionsCall(businessId, null, null);
    return apiClient.execute(call);
  }

  /**
   * Get all conversions (asynchronously)
   * This endpoint provides a list of all conversions performed by a business. 
   * @param businessId This could be the ID of the business or the ID of a sub-account of the business (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getallconversionsAsync(String businessId, final ApiCallback<Void> callback) throws ApiException {

    ProgressResponseBody.ProgressListener progressListener = null;
    ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

    if (callback != null) {
      progressListener = new ProgressResponseBody.ProgressListener() {
        @Override
        public void update(long bytesRead, long contentLength, boolean done) {
          callback.onDownloadProgress(bytesRead, contentLength, done);
        }
      };

      progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
        @Override
        public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
          callback.onUploadProgress(bytesWritten, contentLength, done);
        }
      };
    }

    Call call = getallconversionsCall(businessId, progressListener, progressRequestListener);
    apiClient.executeAsync(call, callback);
    return call;
  }
  /* Build call for initiateaconversion */
  private Call initiateaconversionCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    

    // create path and map variables
    String localVarPath = "/conversions/initiate".replaceAll("\\{format\\}","json");

    List<Pair> localVarQueryParams = new ArrayList<Pair>();

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    if(progressListener != null) {
      apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
      @Override
      public Response intercept(Interceptor.Chain chain) throws IOException {
        Response originalResponse = chain.proceed(chain.request());
        return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
        }
      });
    }

    String[] localVarAuthNames = new String[] {  };
    return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
  }

  /**
   * Initiate a conversion
   * This endpoint provides information on the conversion rate between two currencies e.g NGN to USD     REQUEST BODY   | Field | Data Type | Description | |------| ------------- | ----------- | | business | string | This could be the ID of the business or the ID of a sub-account of the businessRequired | | quoteReference | string | To get a quote reference, you will need to call the generate quote endpoint Required |  
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public void initiateaconversion() throws ApiException {
    initiateaconversionWithHttpInfo();
  }

  /**
   * Initiate a conversion
   * This endpoint provides information on the conversion rate between two currencies e.g NGN to USD     REQUEST BODY   | Field | Data Type | Description | |------| ------------- | ----------- | | business | string | This could be the ID of the business or the ID of a sub-account of the businessRequired | | quoteReference | string | To get a quote reference, you will need to call the generate quote endpoint Required |  
   * @return ApiResponse<Void>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<Void> initiateaconversionWithHttpInfo() throws ApiException {
    Call call = initiateaconversionCall(null, null);
    return apiClient.execute(call);
  }

  /**
   * Initiate a conversion (asynchronously)
   * This endpoint provides information on the conversion rate between two currencies e.g NGN to USD     REQUEST BODY   | Field | Data Type | Description | |------| ------------- | ----------- | | business | string | This could be the ID of the business or the ID of a sub-account of the businessRequired | | quoteReference | string | To get a quote reference, you will need to call the generate quote endpoint Required |  
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call initiateaconversionAsync(final ApiCallback<Void> callback) throws ApiException {

    ProgressResponseBody.ProgressListener progressListener = null;
    ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

    if (callback != null) {
      progressListener = new ProgressResponseBody.ProgressListener() {
        @Override
        public void update(long bytesRead, long contentLength, boolean done) {
          callback.onDownloadProgress(bytesRead, contentLength, done);
        }
      };

      progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
        @Override
        public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
          callback.onUploadProgress(bytesWritten, contentLength, done);
        }
      };
    }

    Call call = initiateaconversionCall(progressListener, progressRequestListener);
    apiClient.executeAsync(call, callback);
    return call;
  }
}
