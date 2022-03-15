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

public class CoreApi {
  private ApiClient apiClient;

  public CoreApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CoreApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /* Build call for getBankcode */
  private Call getBankcodeCall(String currency, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'currency' is set
    if (currency == null) {
       throw new ApiException("Missing the required parameter 'currency' when calling getBankcode(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/core/banks".replaceAll("\\{format\\}","json");

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    if (currency != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "currency", currency));

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
   * Get Bank code
   * This endpoint provides a list of the banks and mobile money wallet providers with information like name, code and the list of branches and branch codes per bank based on a specified currency.  The **code** field in the below sample refers to the bank code for your bank account or the code of your mobile money provider.   &#x60;&#x60;&#x60;json {  {    \&quot;id\&quot;: 147,    \&quot;code\&quot;: \&quot;GH010100\&quot;,    \&quot;name\&quot;: \&quot;BANK OF GHANA\&quot;,    \&quot;isMobileVerified\&quot;: null,    \&quot;branches\&quot;: [       {         \&quot;id\&quot;: 1,         \&quot;branchCode\&quot;: \&quot;GH010101\&quot;,         \&quot;branchName\&quot;: \&quot;BANK OF GHANA-ACCRA\&quot;,         \&quot;swiftCode\&quot;: \&quot;BAGHGHAC\&quot;,         \&quot;bic\&quot;: \&quot;BAGHGHAC\&quot;        }]  },  {   \&quot;id\&quot;: 79,   \&quot;code\&quot;: \&quot;AIRTEL\&quot;,   \&quot;name\&quot;: \&quot;Airtel\&quot;,   \&quot;isMobileVerified\&quot;: true,   \&quot;branches\&quot;: null  } } &#x60;&#x60;&#x60;    
   * @param currency e.g NGN, GHS, KES (required)
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public void getBankcode(String currency) throws ApiException {
    getBankcodeWithHttpInfo(currency);
  }

  /**
   * Get Bank code
   * This endpoint provides a list of the banks and mobile money wallet providers with information like name, code and the list of branches and branch codes per bank based on a specified currency.  The **code** field in the below sample refers to the bank code for your bank account or the code of your mobile money provider.   &#x60;&#x60;&#x60;json {  {    \&quot;id\&quot;: 147,    \&quot;code\&quot;: \&quot;GH010100\&quot;,    \&quot;name\&quot;: \&quot;BANK OF GHANA\&quot;,    \&quot;isMobileVerified\&quot;: null,    \&quot;branches\&quot;: [       {         \&quot;id\&quot;: 1,         \&quot;branchCode\&quot;: \&quot;GH010101\&quot;,         \&quot;branchName\&quot;: \&quot;BANK OF GHANA-ACCRA\&quot;,         \&quot;swiftCode\&quot;: \&quot;BAGHGHAC\&quot;,         \&quot;bic\&quot;: \&quot;BAGHGHAC\&quot;        }]  },  {   \&quot;id\&quot;: 79,   \&quot;code\&quot;: \&quot;AIRTEL\&quot;,   \&quot;name\&quot;: \&quot;Airtel\&quot;,   \&quot;isMobileVerified\&quot;: true,   \&quot;branches\&quot;: null  } } &#x60;&#x60;&#x60;    
   * @param currency e.g NGN, GHS, KES (required)
   * @return ApiResponse<Void>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<Void> getBankcodeWithHttpInfo(String currency) throws ApiException {
    Call call = getBankcodeCall(currency, null, null);
    return apiClient.execute(call);
  }

  /**
   * Get Bank code (asynchronously)
   * This endpoint provides a list of the banks and mobile money wallet providers with information like name, code and the list of branches and branch codes per bank based on a specified currency.  The **code** field in the below sample refers to the bank code for your bank account or the code of your mobile money provider.   &#x60;&#x60;&#x60;json {  {    \&quot;id\&quot;: 147,    \&quot;code\&quot;: \&quot;GH010100\&quot;,    \&quot;name\&quot;: \&quot;BANK OF GHANA\&quot;,    \&quot;isMobileVerified\&quot;: null,    \&quot;branches\&quot;: [       {         \&quot;id\&quot;: 1,         \&quot;branchCode\&quot;: \&quot;GH010101\&quot;,         \&quot;branchName\&quot;: \&quot;BANK OF GHANA-ACCRA\&quot;,         \&quot;swiftCode\&quot;: \&quot;BAGHGHAC\&quot;,         \&quot;bic\&quot;: \&quot;BAGHGHAC\&quot;        }]  },  {   \&quot;id\&quot;: 79,   \&quot;code\&quot;: \&quot;AIRTEL\&quot;,   \&quot;name\&quot;: \&quot;Airtel\&quot;,   \&quot;isMobileVerified\&quot;: true,   \&quot;branches\&quot;: null  } } &#x60;&#x60;&#x60;    
   * @param currency e.g NGN, GHS, KES (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getBankcodeAsync(String currency, final ApiCallback<Void> callback) throws ApiException {

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

    Call call = getBankcodeCall(currency, progressListener, progressRequestListener);
    apiClient.executeAsync(call, callback);
    return call;
  }
  /* Build call for getadisbursementtransactionbycustomerreference */
  private Call getadisbursementtransactionbycustomerreferenceCall(String business, String customerReference, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'business' is set
    if (business == null) {
       throw new ApiException("Missing the required parameter 'business' when calling getadisbursementtransactionbycustomerreference(Async)");
    }
    
    // verify the required parameter 'customerReference' is set
    if (customerReference == null) {
       throw new ApiException("Missing the required parameter 'customerReference' when calling getadisbursementtransactionbycustomerreference(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/core/transactions/disbursements/by-customer-reference".replaceAll("\\{format\\}","json");

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    if (business != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "business", business));
    if (customerReference != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "customerReference", customerReference));

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
   * Get a disbursement transaction by customer reference
   * This endpoint provides the details of a disbursement transaction through the use of a customer reference.
   * @param business The ID of the business (required)
   * @param customerReference The reference of the customer/merchant (required)
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public void getadisbursementtransactionbycustomerreference(String business, String customerReference) throws ApiException {
    getadisbursementtransactionbycustomerreferenceWithHttpInfo(business, customerReference);
  }

  /**
   * Get a disbursement transaction by customer reference
   * This endpoint provides the details of a disbursement transaction through the use of a customer reference.
   * @param business The ID of the business (required)
   * @param customerReference The reference of the customer/merchant (required)
   * @return ApiResponse<Void>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<Void> getadisbursementtransactionbycustomerreferenceWithHttpInfo(String business, String customerReference) throws ApiException {
    Call call = getadisbursementtransactionbycustomerreferenceCall(business, customerReference, null, null);
    return apiClient.execute(call);
  }

  /**
   * Get a disbursement transaction by customer reference (asynchronously)
   * This endpoint provides the details of a disbursement transaction through the use of a customer reference.
   * @param business The ID of the business (required)
   * @param customerReference The reference of the customer/merchant (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getadisbursementtransactionbycustomerreferenceAsync(String business, String customerReference, final ApiCallback<Void> callback) throws ApiException {

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

    Call call = getadisbursementtransactionbycustomerreferenceCall(business, customerReference, progressListener, progressRequestListener);
    apiClient.executeAsync(call, callback);
    return call;
  }
  /* Build call for getadisbursementtransactionbyreference */
  private Call getadisbursementtransactionbyreferenceCall(String business, String reference, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'business' is set
    if (business == null) {
       throw new ApiException("Missing the required parameter 'business' when calling getadisbursementtransactionbyreference(Async)");
    }
    
    // verify the required parameter 'reference' is set
    if (reference == null) {
       throw new ApiException("Missing the required parameter 'reference' when calling getadisbursementtransactionbyreference(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/core/transactions/disbursements/by-reference".replaceAll("\\{format\\}","json");

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    if (business != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "business", business));
    if (reference != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "reference", reference));

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
   * Get a disbursement transaction by reference
   * This endpoint provides the details of a disbursement transaction through the use of its reference.
   * @param business The ID of business (required)
   * @param reference The reference of the transaction (required)
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public void getadisbursementtransactionbyreference(String business, String reference) throws ApiException {
    getadisbursementtransactionbyreferenceWithHttpInfo(business, reference);
  }

  /**
   * Get a disbursement transaction by reference
   * This endpoint provides the details of a disbursement transaction through the use of its reference.
   * @param business The ID of business (required)
   * @param reference The reference of the transaction (required)
   * @return ApiResponse<Void>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<Void> getadisbursementtransactionbyreferenceWithHttpInfo(String business, String reference) throws ApiException {
    Call call = getadisbursementtransactionbyreferenceCall(business, reference, null, null);
    return apiClient.execute(call);
  }

  /**
   * Get a disbursement transaction by reference (asynchronously)
   * This endpoint provides the details of a disbursement transaction through the use of its reference.
   * @param business The ID of business (required)
   * @param reference The reference of the transaction (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getadisbursementtransactionbyreferenceAsync(String business, String reference, final ApiCallback<Void> callback) throws ApiException {

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

    Call call = getadisbursementtransactionbyreferenceCall(business, reference, progressListener, progressRequestListener);
    apiClient.executeAsync(call, callback);
    return call;
  }
  /* Build call for getatransactionforabusiness */
  private Call getatransactionforabusinessCall(String transactionID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'transactionID' is set
    if (transactionID == null) {
       throw new ApiException("Missing the required parameter 'transactionID' when calling getatransactionforabusiness(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/core/transactions/{transactionID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "transactionID" + "\\}", apiClient.escapeString(transactionID.toString()));

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
   * Get a transaction for a business
   * This endpoint provides the details of a transaction through the use of its ID.        
   * @param transactionID The reference or ID of the transaction (required)
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public void getatransactionforabusiness(String transactionID) throws ApiException {
    getatransactionforabusinessWithHttpInfo(transactionID);
  }

  /**
   * Get a transaction for a business
   * This endpoint provides the details of a transaction through the use of its ID.        
   * @param transactionID The reference or ID of the transaction (required)
   * @return ApiResponse<Void>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<Void> getatransactionforabusinessWithHttpInfo(String transactionID) throws ApiException {
    Call call = getatransactionforabusinessCall(transactionID, null, null);
    return apiClient.execute(call);
  }

  /**
   * Get a transaction for a business (asynchronously)
   * This endpoint provides the details of a transaction through the use of its ID.        
   * @param transactionID The reference or ID of the transaction (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getatransactionforabusinessAsync(String transactionID, final ApiCallback<Void> callback) throws ApiException {

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

    Call call = getatransactionforabusinessCall(transactionID, progressListener, progressRequestListener);
    apiClient.executeAsync(call, callback);
    return call;
  }
  /* Build call for getbranchCode */
  private Call getbranchCodeCall(String bankId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'bankId' is set
    if (bankId == null) {
       throw new ApiException("Missing the required parameter 'bankId' when calling getbranchCode(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/core/banks/{bankId}/branches".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "bankId" + "\\}", apiClient.escapeString(bankId.toString()));

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
   * Get branch Code
   * This endpoint provides a list of the branches for a bank and helps you get your branch code. To get a branch Code:  + Make a request to the endpoint that provides bank code with your desired currency  + Find your bank in the list returned. + Check the id field of your bank information for your branch + use the id field to make a request to this endpoint to get the list of branches for your bank + Check the **branchCode** field of your branch information for the value of your branch code
   * @param bankId Id of the bank (required)
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public void getbranchCode(String bankId) throws ApiException {
    getbranchCodeWithHttpInfo(bankId);
  }

  /**
   * Get branch Code
   * This endpoint provides a list of the branches for a bank and helps you get your branch code. To get a branch Code:  + Make a request to the endpoint that provides bank code with your desired currency  + Find your bank in the list returned. + Check the id field of your bank information for your branch + use the id field to make a request to this endpoint to get the list of branches for your bank + Check the **branchCode** field of your branch information for the value of your branch code
   * @param bankId Id of the bank (required)
   * @return ApiResponse<Void>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<Void> getbranchCodeWithHttpInfo(String bankId) throws ApiException {
    Call call = getbranchCodeCall(bankId, null, null);
    return apiClient.execute(call);
  }

  /**
   * Get branch Code (asynchronously)
   * This endpoint provides a list of the branches for a bank and helps you get your branch code. To get a branch Code:  + Make a request to the endpoint that provides bank code with your desired currency  + Find your bank in the list returned. + Check the id field of your bank information for your branch + use the id field to make a request to this endpoint to get the list of branches for your bank + Check the **branchCode** field of your branch information for the value of your branch code
   * @param bankId Id of the bank (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getbranchCodeAsync(String bankId, final ApiCallback<Void> callback) throws ApiException {

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

    Call call = getbranchCodeCall(bankId, progressListener, progressRequestListener);
    apiClient.executeAsync(call, callback);
    return call;
  }
  /* Build call for getthetransactionsforaBusiness */
  private Call getthetransactionsforaBusinessCall(String businessID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'businessID' is set
    if (businessID == null) {
       throw new ApiException("Missing the required parameter 'businessID' when calling getthetransactionsforaBusiness(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/core/transactions/search/business/{businessID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "businessID" + "\\}", apiClient.escapeString(businessID.toString()));

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
   * Get the transactions for a Business
   * This endpoint provides a list of all the transactions for a business.   REQUEST BODY   | Field | Data Type | Description | |------| ------------- | ----------- | | page | string | Specify exactly what page you want to retrieve optional| | perPage | string | Specify how many records you want to retrieve per page optional| | from | string| Specify start date with format \&quot;YYYY-mm-dd\&quot;  optional| | to | string| Specify end date with format \&quot;YYYY-mm-dd\&quot; optional|  
   * @param businessID This could be the ID of the business or the ID of a sub-account of the business (required)
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public void getthetransactionsforaBusiness(String businessID) throws ApiException {
    getthetransactionsforaBusinessWithHttpInfo(businessID);
  }

  /**
   * Get the transactions for a Business
   * This endpoint provides a list of all the transactions for a business.   REQUEST BODY   | Field | Data Type | Description | |------| ------------- | ----------- | | page | string | Specify exactly what page you want to retrieve optional| | perPage | string | Specify how many records you want to retrieve per page optional| | from | string| Specify start date with format \&quot;YYYY-mm-dd\&quot;  optional| | to | string| Specify end date with format \&quot;YYYY-mm-dd\&quot; optional|  
   * @param businessID This could be the ID of the business or the ID of a sub-account of the business (required)
   * @return ApiResponse<Void>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<Void> getthetransactionsforaBusinessWithHttpInfo(String businessID) throws ApiException {
    Call call = getthetransactionsforaBusinessCall(businessID, null, null);
    return apiClient.execute(call);
  }

  /**
   * Get the transactions for a Business (asynchronously)
   * This endpoint provides a list of all the transactions for a business.   REQUEST BODY   | Field | Data Type | Description | |------| ------------- | ----------- | | page | string | Specify exactly what page you want to retrieve optional| | perPage | string | Specify how many records you want to retrieve per page optional| | from | string| Specify start date with format \&quot;YYYY-mm-dd\&quot;  optional| | to | string| Specify end date with format \&quot;YYYY-mm-dd\&quot; optional|  
   * @param businessID This could be the ID of the business or the ID of a sub-account of the business (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getthetransactionsforaBusinessAsync(String businessID, final ApiCallback<Void> callback) throws ApiException {

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

    Call call = getthetransactionsforaBusinessCall(businessID, progressListener, progressRequestListener);
    apiClient.executeAsync(call, callback);
    return call;
  }
  /* Build call for getthetransactionsforthesubAccountsofabusiness */
  private Call getthetransactionsforthesubAccountsofabusinessCall(String businessID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'businessID' is set
    if (businessID == null) {
       throw new ApiException("Missing the required parameter 'businessID' when calling getthetransactionsforthesubAccountsofabusiness(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/core/transactions/search/business/{businessID}/sub-accounts".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "businessID" + "\\}", apiClient.escapeString(businessID.toString()));

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
   * Get the transactions for the sub-accounts of a Business
   * This provides a list of all the transactions for the sub-accounts of a Business.   REQUEST BODY   | Field | Data Type | Description | |------| ------------- | ----------- | | page | string | Specify exactly what page you want to retrieve optional| | perPage | string | Specify how many records you want to retrieve per page optional| | from | string| Specify start date with format \&quot;YYYY-mm-dd\&quot;  optional| | to | string| Specify end date with format \&quot;YYYY-mm-dd\&quot; optional|     
   * @param businessID The is the ID of a business (required)
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public void getthetransactionsforthesubAccountsofabusiness(String businessID) throws ApiException {
    getthetransactionsforthesubAccountsofabusinessWithHttpInfo(businessID);
  }

  /**
   * Get the transactions for the sub-accounts of a Business
   * This provides a list of all the transactions for the sub-accounts of a Business.   REQUEST BODY   | Field | Data Type | Description | |------| ------------- | ----------- | | page | string | Specify exactly what page you want to retrieve optional| | perPage | string | Specify how many records you want to retrieve per page optional| | from | string| Specify start date with format \&quot;YYYY-mm-dd\&quot;  optional| | to | string| Specify end date with format \&quot;YYYY-mm-dd\&quot; optional|     
   * @param businessID The is the ID of a business (required)
   * @return ApiResponse<Void>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<Void> getthetransactionsforthesubAccountsofabusinessWithHttpInfo(String businessID) throws ApiException {
    Call call = getthetransactionsforthesubAccountsofabusinessCall(businessID, null, null);
    return apiClient.execute(call);
  }

  /**
   * Get the transactions for the sub-accounts of a Business (asynchronously)
   * This provides a list of all the transactions for the sub-accounts of a Business.   REQUEST BODY   | Field | Data Type | Description | |------| ------------- | ----------- | | page | string | Specify exactly what page you want to retrieve optional| | perPage | string | Specify how many records you want to retrieve per page optional| | from | string| Specify start date with format \&quot;YYYY-mm-dd\&quot;  optional| | to | string| Specify end date with format \&quot;YYYY-mm-dd\&quot; optional|     
   * @param businessID The is the ID of a business (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getthetransactionsforthesubAccountsofabusinessAsync(String businessID, final ApiCallback<Void> callback) throws ApiException {

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

    Call call = getthetransactionsforthesubAccountsofabusinessCall(businessID, progressListener, progressRequestListener);
    apiClient.executeAsync(call, callback);
    return call;
  }
}
