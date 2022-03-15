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

public class ProfileApi {
  private ApiClient apiClient;

  public ProfileApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProfileApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /* Build call for createSubaccount */
  private Call createSubaccountCall(String businessId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'businessId' is set
    if (businessId == null) {
       throw new ApiException("Missing the required parameter 'businessId' when calling createSubaccount(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/profile/business/{businessId}/sub-accounts".replaceAll("\\{format\\}","json")
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
    return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
  }

  /**
   * Create Subaccount
   * This endpoint helps you create a sub-account.  REQUEST BODY   | Field | Data Type | description | |------| ------------- | ----------- | | name | string | Customer&#39;s name| | email | string | Customer&#39;s email | | mobile | string | Customer&#39;s phone number | | country | string | Customer&#39;s country e.g NG  |  
   * @param businessId The ID of the business (required)
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public void createSubaccount(String businessId) throws ApiException {
    createSubaccountWithHttpInfo(businessId);
  }

  /**
   * Create Subaccount
   * This endpoint helps you create a sub-account.  REQUEST BODY   | Field | Data Type | description | |------| ------------- | ----------- | | name | string | Customer&#39;s name| | email | string | Customer&#39;s email | | mobile | string | Customer&#39;s phone number | | country | string | Customer&#39;s country e.g NG  |  
   * @param businessId The ID of the business (required)
   * @return ApiResponse<Void>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<Void> createSubaccountWithHttpInfo(String businessId) throws ApiException {
    Call call = createSubaccountCall(businessId, null, null);
    return apiClient.execute(call);
  }

  /**
   * Create Subaccount (asynchronously)
   * This endpoint helps you create a sub-account.  REQUEST BODY   | Field | Data Type | description | |------| ------------- | ----------- | | name | string | Customer&#39;s name| | email | string | Customer&#39;s email | | mobile | string | Customer&#39;s phone number | | country | string | Customer&#39;s country e.g NG  |  
   * @param businessId The ID of the business (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call createSubaccountAsync(String businessId, final ApiCallback<Void> callback) throws ApiException {

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

    Call call = createSubaccountCall(businessId, progressListener, progressRequestListener);
    apiClient.executeAsync(call, callback);
    return call;
  }
  /* Build call for createaBeneficiary */
  private Call createaBeneficiaryCall(String businessID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'businessID' is set
    if (businessID == null) {
       throw new ApiException("Missing the required parameter 'businessID' when calling createaBeneficiary(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/profile/beneficiaries/business/{businessID}".replaceAll("\\{format\\}","json")
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
   * Create a Beneficiary
   * This endpoint is used for creating a Beneficiary.       REQUEST BODY   | Field | Data Type | Description | |------| ------------- | ----------- | | firstName | string | required| | lastName | string | optional| | email | string |The email address of Beneficiary. required | | phoneNumber | string | optional  | | accountHolderName | string | required| | bank | object | see the information about this below. optional + name: bank name required  + code optional   + sortCode optional   + swiftCode optional  + branch  optional   + address: see the definition in address field below optional   | | type | string | The value for this field is either _corporate_ or _indivdual_required| | address | object | the physical address of the beneficiary and it comprises of the below: optional + country optional  + state optional   + zip required   + city required  + street  required  | | currency | string | The currency that Beneficiary would be paid in required| | paymentDestination | string | The value for this field is either _mobile_money_wallet_ or _bank_account_ required | | destinationAddress | string | see the definition belowrequired | | uniqueIdentifier | string | optional |   Value Description for the destinationAddress field   The table below show that a destination address should be when given a certain payment destination.  | paymentDestination | destinationAddress | |------| ------------- | | _mobile_money_wallet_ | phone number used for the wallet | | _bank_account_ | account number |
   * @param businessID businessID (required)
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public void createaBeneficiary(String businessID) throws ApiException {
    createaBeneficiaryWithHttpInfo(businessID);
  }

  /**
   * Create a Beneficiary
   * This endpoint is used for creating a Beneficiary.       REQUEST BODY   | Field | Data Type | Description | |------| ------------- | ----------- | | firstName | string | required| | lastName | string | optional| | email | string |The email address of Beneficiary. required | | phoneNumber | string | optional  | | accountHolderName | string | required| | bank | object | see the information about this below. optional + name: bank name required  + code optional   + sortCode optional   + swiftCode optional  + branch  optional   + address: see the definition in address field below optional   | | type | string | The value for this field is either _corporate_ or _indivdual_required| | address | object | the physical address of the beneficiary and it comprises of the below: optional + country optional  + state optional   + zip required   + city required  + street  required  | | currency | string | The currency that Beneficiary would be paid in required| | paymentDestination | string | The value for this field is either _mobile_money_wallet_ or _bank_account_ required | | destinationAddress | string | see the definition belowrequired | | uniqueIdentifier | string | optional |   Value Description for the destinationAddress field   The table below show that a destination address should be when given a certain payment destination.  | paymentDestination | destinationAddress | |------| ------------- | | _mobile_money_wallet_ | phone number used for the wallet | | _bank_account_ | account number |
   * @param businessID businessID (required)
   * @return ApiResponse<Void>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<Void> createaBeneficiaryWithHttpInfo(String businessID) throws ApiException {
    Call call = createaBeneficiaryCall(businessID, null, null);
    return apiClient.execute(call);
  }

  /**
   * Create a Beneficiary (asynchronously)
   * This endpoint is used for creating a Beneficiary.       REQUEST BODY   | Field | Data Type | Description | |------| ------------- | ----------- | | firstName | string | required| | lastName | string | optional| | email | string |The email address of Beneficiary. required | | phoneNumber | string | optional  | | accountHolderName | string | required| | bank | object | see the information about this below. optional + name: bank name required  + code optional   + sortCode optional   + swiftCode optional  + branch  optional   + address: see the definition in address field below optional   | | type | string | The value for this field is either _corporate_ or _indivdual_required| | address | object | the physical address of the beneficiary and it comprises of the below: optional + country optional  + state optional   + zip required   + city required  + street  required  | | currency | string | The currency that Beneficiary would be paid in required| | paymentDestination | string | The value for this field is either _mobile_money_wallet_ or _bank_account_ required | | destinationAddress | string | see the definition belowrequired | | uniqueIdentifier | string | optional |   Value Description for the destinationAddress field   The table below show that a destination address should be when given a certain payment destination.  | paymentDestination | destinationAddress | |------| ------------- | | _mobile_money_wallet_ | phone number used for the wallet | | _bank_account_ | account number |
   * @param businessID businessID (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call createaBeneficiaryAsync(String businessID, final ApiCallback<Void> callback) throws ApiException {

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

    Call call = createaBeneficiaryCall(businessID, progressListener, progressRequestListener);
    apiClient.executeAsync(call, callback);
    return call;
  }
  /* Build call for deleteaBeneficiary */
  private Call deleteaBeneficiaryCall(String businessID, String beneficiaryID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'businessID' is set
    if (businessID == null) {
       throw new ApiException("Missing the required parameter 'businessID' when calling deleteaBeneficiary(Async)");
    }
    
    // verify the required parameter 'beneficiaryID' is set
    if (beneficiaryID == null) {
       throw new ApiException("Missing the required parameter 'beneficiaryID' when calling deleteaBeneficiary(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/profile/beneficiaries/business/{businessID}/{beneficiaryID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "businessID" + "\\}", apiClient.escapeString(businessID.toString()))
      .replaceAll("\\{" + "beneficiaryID" + "\\}", apiClient.escapeString(beneficiaryID.toString()));

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
    return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
  }

  /**
   * Delete a Beneficiary
   * This endpoint is used for deleting a beneficiary.
   * @param businessID This could be the ID of the business or the ID of a sub-account of the business (required)
   * @param beneficiaryID This is the beneficiary ID of the the benficiary (required)
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public void deleteaBeneficiary(String businessID, String beneficiaryID) throws ApiException {
    deleteaBeneficiaryWithHttpInfo(businessID, beneficiaryID);
  }

  /**
   * Delete a Beneficiary
   * This endpoint is used for deleting a beneficiary.
   * @param businessID This could be the ID of the business or the ID of a sub-account of the business (required)
   * @param beneficiaryID This is the beneficiary ID of the the benficiary (required)
   * @return ApiResponse<Void>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<Void> deleteaBeneficiaryWithHttpInfo(String businessID, String beneficiaryID) throws ApiException {
    Call call = deleteaBeneficiaryCall(businessID, beneficiaryID, null, null);
    return apiClient.execute(call);
  }

  /**
   * Delete a Beneficiary (asynchronously)
   * This endpoint is used for deleting a beneficiary.
   * @param businessID This could be the ID of the business or the ID of a sub-account of the business (required)
   * @param beneficiaryID This is the beneficiary ID of the the benficiary (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call deleteaBeneficiaryAsync(String businessID, String beneficiaryID, final ApiCallback<Void> callback) throws ApiException {

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

    Call call = deleteaBeneficiaryCall(businessID, beneficiaryID, progressListener, progressRequestListener);
    apiClient.executeAsync(call, callback);
    return call;
  }
  /* Build call for fetchMerchantVirtualAccounts */
  private Call fetchMerchantVirtualAccountsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    

    // create path and map variables
    String localVarPath = "/profile/virtual-accounts".replaceAll("\\{format\\}","json");

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
   * Fetch Merchant Virtual Accounts
   * This endpoint fetches all virtual accounts belonging to a merchant  REQUEST BODY  * * *  | Field | Data Type | Description | | --- | --- | --- | | page | string | Specify exactly what page you want to retrieve &#x60;required&#x60; | | perPage | string | Specify how many records you want to retrieve per page &#x60;required&#x60; | | filterBy | object | see note below &#x60;optional&#x60; |  The filterBy property is an object with the following attributes below that helps you filter accounts:  *   status - &#x60;pending&#x60;, &#x60;approved&#x60; or &#x60;declined&#x60; *   currency - EUR or GBP *   accountType - corporate or individual
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public void fetchMerchantVirtualAccounts() throws ApiException {
    fetchMerchantVirtualAccountsWithHttpInfo();
  }

  /**
   * Fetch Merchant Virtual Accounts
   * This endpoint fetches all virtual accounts belonging to a merchant  REQUEST BODY  * * *  | Field | Data Type | Description | | --- | --- | --- | | page | string | Specify exactly what page you want to retrieve &#x60;required&#x60; | | perPage | string | Specify how many records you want to retrieve per page &#x60;required&#x60; | | filterBy | object | see note below &#x60;optional&#x60; |  The filterBy property is an object with the following attributes below that helps you filter accounts:  *   status - &#x60;pending&#x60;, &#x60;approved&#x60; or &#x60;declined&#x60; *   currency - EUR or GBP *   accountType - corporate or individual
   * @return ApiResponse<Void>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<Void> fetchMerchantVirtualAccountsWithHttpInfo() throws ApiException {
    Call call = fetchMerchantVirtualAccountsCall(null, null);
    return apiClient.execute(call);
  }

  /**
   * Fetch Merchant Virtual Accounts (asynchronously)
   * This endpoint fetches all virtual accounts belonging to a merchant  REQUEST BODY  * * *  | Field | Data Type | Description | | --- | --- | --- | | page | string | Specify exactly what page you want to retrieve &#x60;required&#x60; | | perPage | string | Specify how many records you want to retrieve per page &#x60;required&#x60; | | filterBy | object | see note below &#x60;optional&#x60; |  The filterBy property is an object with the following attributes below that helps you filter accounts:  *   status - &#x60;pending&#x60;, &#x60;approved&#x60; or &#x60;declined&#x60; *   currency - EUR or GBP *   accountType - corporate or individual
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call fetchMerchantVirtualAccountsAsync(final ApiCallback<Void> callback) throws ApiException {

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

    Call call = fetchMerchantVirtualAccountsCall(progressListener, progressRequestListener);
    apiClient.executeAsync(call, callback);
    return call;
  }
  /* Build call for getAllSubAccounts */
  private Call getAllSubAccountsCall(String businessId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'businessId' is set
    if (businessId == null) {
       throw new ApiException("Missing the required parameter 'businessId' when calling getAllSubAccounts(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/profile/business/{businessId}/sub-accounts".replaceAll("\\{format\\}","json")
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
   * Get  All Sub-accounts
   * This endpoint is used to retrieve all subaccounts for a business.
   * @param businessId The ID of the business (required)
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public void getAllSubAccounts(String businessId) throws ApiException {
    getAllSubAccountsWithHttpInfo(businessId);
  }

  /**
   * Get  All Sub-accounts
   * This endpoint is used to retrieve all subaccounts for a business.
   * @param businessId The ID of the business (required)
   * @return ApiResponse<Void>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<Void> getAllSubAccountsWithHttpInfo(String businessId) throws ApiException {
    Call call = getAllSubAccountsCall(businessId, null, null);
    return apiClient.execute(call);
  }

  /**
   * Get  All Sub-accounts (asynchronously)
   * This endpoint is used to retrieve all subaccounts for a business.
   * @param businessId The ID of the business (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getAllSubAccountsAsync(String businessId, final ApiCallback<Void> callback) throws ApiException {

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

    Call call = getAllSubAccountsCall(businessId, progressListener, progressRequestListener);
    apiClient.executeAsync(call, callback);
    return call;
  }
  /* Build call for getOneSubaccount */
  private Call getOneSubaccountCall(String businessId, String subAccountId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'businessId' is set
    if (businessId == null) {
       throw new ApiException("Missing the required parameter 'businessId' when calling getOneSubaccount(Async)");
    }
    
    // verify the required parameter 'subAccountId' is set
    if (subAccountId == null) {
       throw new ApiException("Missing the required parameter 'subAccountId' when calling getOneSubaccount(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/profile/business/{businessId}/sub-accounts/{subAccountId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "businessId" + "\\}", apiClient.escapeString(businessId.toString()))
      .replaceAll("\\{" + "subAccountId" + "\\}", apiClient.escapeString(subAccountId.toString()));

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
   * Get  One Subaccount
   * This endpoint is used in retrieving one subaccount.
   * @param businessId The ID of the business (required)
   * @param subAccountId The ID of the subaccount (required)
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public void getOneSubaccount(String businessId, String subAccountId) throws ApiException {
    getOneSubaccountWithHttpInfo(businessId, subAccountId);
  }

  /**
   * Get  One Subaccount
   * This endpoint is used in retrieving one subaccount.
   * @param businessId The ID of the business (required)
   * @param subAccountId The ID of the subaccount (required)
   * @return ApiResponse<Void>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<Void> getOneSubaccountWithHttpInfo(String businessId, String subAccountId) throws ApiException {
    Call call = getOneSubaccountCall(businessId, subAccountId, null, null);
    return apiClient.execute(call);
  }

  /**
   * Get  One Subaccount (asynchronously)
   * This endpoint is used in retrieving one subaccount.
   * @param businessId The ID of the business (required)
   * @param subAccountId The ID of the subaccount (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getOneSubaccountAsync(String businessId, String subAccountId, final ApiCallback<Void> callback) throws ApiException {

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

    Call call = getOneSubaccountCall(businessId, subAccountId, progressListener, progressRequestListener);
    apiClient.executeAsync(call, callback);
    return call;
  }
  /* Build call for getOneVirtualAccount */
  private Call getOneVirtualAccountCall(String virtualAccountId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'virtualAccountId' is set
    if (virtualAccountId == null) {
       throw new ApiException("Missing the required parameter 'virtualAccountId' when calling getOneVirtualAccount(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/profile/virtual-accounts/{virtualAccountId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "virtualAccountId" + "\\}", apiClient.escapeString(virtualAccountId.toString()));

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
   * Get One Virtual Account
   * This endpoint is used for retreiving a virtual account attached to a merchant
   * @param virtualAccountId The Id of the virtual account you want to retrieve (required)
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public void getOneVirtualAccount(String virtualAccountId) throws ApiException {
    getOneVirtualAccountWithHttpInfo(virtualAccountId);
  }

  /**
   * Get One Virtual Account
   * This endpoint is used for retreiving a virtual account attached to a merchant
   * @param virtualAccountId The Id of the virtual account you want to retrieve (required)
   * @return ApiResponse<Void>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<Void> getOneVirtualAccountWithHttpInfo(String virtualAccountId) throws ApiException {
    Call call = getOneVirtualAccountCall(virtualAccountId, null, null);
    return apiClient.execute(call);
  }

  /**
   * Get One Virtual Account (asynchronously)
   * This endpoint is used for retreiving a virtual account attached to a merchant
   * @param virtualAccountId The Id of the virtual account you want to retrieve (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getOneVirtualAccountAsync(String virtualAccountId, final ApiCallback<Void> callback) throws ApiException {

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

    Call call = getOneVirtualAccountCall(virtualAccountId, progressListener, progressRequestListener);
    apiClient.executeAsync(call, callback);
    return call;
  }
  /* Build call for getSubaccountVirtualAccounts */
  private Call getSubaccountVirtualAccountsCall(String businessId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'businessId' is set
    if (businessId == null) {
       throw new ApiException("Missing the required parameter 'businessId' when calling getSubaccountVirtualAccounts(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/profile/virtual-accounts/business/{businessId}/sub-accounts".replaceAll("\\{format\\}","json")
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
   * Get   Subaccount  Virtual Accounts
   * This endpoint is used for retrieving the virtual accounts of your Subaccounts.  REQUEST BODY  * * *  | Field | Data Type | Description | | --- | --- | --- | | page | string | Specify exactly what page you want to retrieve &#x60;required&#x60; | | perPage | string | Specify how many records you want to retrieve per page &#x60;required&#x60; | | filterBy | object | see note below &#x60;optional&#x60; |  The filterBy property is an object with the following attributes below that helps you filter accounts:  *   status - &#x60;pending&#x60;, &#x60;approved&#x60; or &#x60;declined&#x60; *   currency - EUR or GBP *   accountType - corporate or individual
   * @param businessId The ID of the business (required)
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public void getSubaccountVirtualAccounts(String businessId) throws ApiException {
    getSubaccountVirtualAccountsWithHttpInfo(businessId);
  }

  /**
   * Get   Subaccount  Virtual Accounts
   * This endpoint is used for retrieving the virtual accounts of your Subaccounts.  REQUEST BODY  * * *  | Field | Data Type | Description | | --- | --- | --- | | page | string | Specify exactly what page you want to retrieve &#x60;required&#x60; | | perPage | string | Specify how many records you want to retrieve per page &#x60;required&#x60; | | filterBy | object | see note below &#x60;optional&#x60; |  The filterBy property is an object with the following attributes below that helps you filter accounts:  *   status - &#x60;pending&#x60;, &#x60;approved&#x60; or &#x60;declined&#x60; *   currency - EUR or GBP *   accountType - corporate or individual
   * @param businessId The ID of the business (required)
   * @return ApiResponse<Void>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<Void> getSubaccountVirtualAccountsWithHttpInfo(String businessId) throws ApiException {
    Call call = getSubaccountVirtualAccountsCall(businessId, null, null);
    return apiClient.execute(call);
  }

  /**
   * Get   Subaccount  Virtual Accounts (asynchronously)
   * This endpoint is used for retrieving the virtual accounts of your Subaccounts.  REQUEST BODY  * * *  | Field | Data Type | Description | | --- | --- | --- | | page | string | Specify exactly what page you want to retrieve &#x60;required&#x60; | | perPage | string | Specify how many records you want to retrieve per page &#x60;required&#x60; | | filterBy | object | see note below &#x60;optional&#x60; |  The filterBy property is an object with the following attributes below that helps you filter accounts:  *   status - &#x60;pending&#x60;, &#x60;approved&#x60; or &#x60;declined&#x60; *   currency - EUR or GBP *   accountType - corporate or individual
   * @param businessId The ID of the business (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getSubaccountVirtualAccountsAsync(String businessId, final ApiCallback<Void> callback) throws ApiException {

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

    Call call = getSubaccountVirtualAccountsCall(businessId, progressListener, progressRequestListener);
    apiClient.executeAsync(call, callback);
    return call;
  }
  /* Build call for getVirtualAccountRequests */
  private Call getVirtualAccountRequestsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    

    // create path and map variables
    String localVarPath = "/profile/virtual-accounts/requests".replaceAll("\\{format\\}","json");

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
   * Get Virtual Account Requests
   * This endpoint is used for getting all virtual account requests tied to a merchant
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public void getVirtualAccountRequests() throws ApiException {
    getVirtualAccountRequestsWithHttpInfo();
  }

  /**
   * Get Virtual Account Requests
   * This endpoint is used for getting all virtual account requests tied to a merchant
   * @return ApiResponse<Void>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<Void> getVirtualAccountRequestsWithHttpInfo() throws ApiException {
    Call call = getVirtualAccountRequestsCall(null, null);
    return apiClient.execute(call);
  }

  /**
   * Get Virtual Account Requests (asynchronously)
   * This endpoint is used for getting all virtual account requests tied to a merchant
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getVirtualAccountRequestsAsync(final ApiCallback<Void> callback) throws ApiException {

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

    Call call = getVirtualAccountRequestsCall(progressListener, progressRequestListener);
    apiClient.executeAsync(call, callback);
    return call;
  }
  /* Build call for getaBeneficiary */
  private Call getaBeneficiaryCall(String businessID, String beneficiaryID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'businessID' is set
    if (businessID == null) {
       throw new ApiException("Missing the required parameter 'businessID' when calling getaBeneficiary(Async)");
    }
    
    // verify the required parameter 'beneficiaryID' is set
    if (beneficiaryID == null) {
       throw new ApiException("Missing the required parameter 'beneficiaryID' when calling getaBeneficiary(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/profile/beneficiaries/business/{businessID}/{beneficiaryID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "businessID" + "\\}", apiClient.escapeString(businessID.toString()))
      .replaceAll("\\{" + "beneficiaryID" + "\\}", apiClient.escapeString(beneficiaryID.toString()));

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
   * Get a Beneficiary
   * This endpoint is used for retrieving a single beneficiary attached to a business. 
   * @param businessID This could be the ID of the business or the ID of a sub-account of the business (required)
   * @param beneficiaryID The reference or ID of the beneficiary (required)
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public void getaBeneficiary(String businessID, String beneficiaryID) throws ApiException {
    getaBeneficiaryWithHttpInfo(businessID, beneficiaryID);
  }

  /**
   * Get a Beneficiary
   * This endpoint is used for retrieving a single beneficiary attached to a business. 
   * @param businessID This could be the ID of the business or the ID of a sub-account of the business (required)
   * @param beneficiaryID The reference or ID of the beneficiary (required)
   * @return ApiResponse<Void>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<Void> getaBeneficiaryWithHttpInfo(String businessID, String beneficiaryID) throws ApiException {
    Call call = getaBeneficiaryCall(businessID, beneficiaryID, null, null);
    return apiClient.execute(call);
  }

  /**
   * Get a Beneficiary (asynchronously)
   * This endpoint is used for retrieving a single beneficiary attached to a business. 
   * @param businessID This could be the ID of the business or the ID of a sub-account of the business (required)
   * @param beneficiaryID The reference or ID of the beneficiary (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getaBeneficiaryAsync(String businessID, String beneficiaryID, final ApiCallback<Void> callback) throws ApiException {

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

    Call call = getaBeneficiaryCall(businessID, beneficiaryID, progressListener, progressRequestListener);
    apiClient.executeAsync(call, callback);
    return call;
  }
  /* Build call for getbusinessInformation */
  private Call getbusinessInformationCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    

    // create path and map variables
    String localVarPath = "/profile/business/me".replaceAll("\\{format\\}","json");

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
   * Get business Information
   * This endpoint is used for getting the information on the registered Merchant&#39;s business.
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public void getbusinessInformation() throws ApiException {
    getbusinessInformationWithHttpInfo();
  }

  /**
   * Get business Information
   * This endpoint is used for getting the information on the registered Merchant&#39;s business.
   * @return ApiResponse<Void>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<Void> getbusinessInformationWithHttpInfo() throws ApiException {
    Call call = getbusinessInformationCall(null, null);
    return apiClient.execute(call);
  }

  /**
   * Get business Information (asynchronously)
   * This endpoint is used for getting the information on the registered Merchant&#39;s business.
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getbusinessInformationAsync(final ApiCallback<Void> callback) throws ApiException {

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

    Call call = getbusinessInformationCall(progressListener, progressRequestListener);
    apiClient.executeAsync(call, callback);
    return call;
  }
  /* Build call for gettheBeneficiariesforabusiness */
  private Call gettheBeneficiariesforabusinessCall(String businessID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'businessID' is set
    if (businessID == null) {
       throw new ApiException("Missing the required parameter 'businessID' when calling gettheBeneficiariesforabusiness(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/profile/beneficiaries/business/{businessID}".replaceAll("\\{format\\}","json")
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
    return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
  }

  /**
   * Get the Beneficiaries for a business
   * This endpoint provides the ability to retrieve a list of beneficiaries attached to a business.    REQUEST BODY   | Field | Data Type | Description | |------| ------------- | ----------- | | page | string | Specify exactly what page you want to retrieve optional| | perPage | string | Specify how many records you want to retrieve per page optional|
   * @param businessID This could be the ID of the business or the ID of a sub-account of the business (required)
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public void gettheBeneficiariesforabusiness(String businessID) throws ApiException {
    gettheBeneficiariesforabusinessWithHttpInfo(businessID);
  }

  /**
   * Get the Beneficiaries for a business
   * This endpoint provides the ability to retrieve a list of beneficiaries attached to a business.    REQUEST BODY   | Field | Data Type | Description | |------| ------------- | ----------- | | page | string | Specify exactly what page you want to retrieve optional| | perPage | string | Specify how many records you want to retrieve per page optional|
   * @param businessID This could be the ID of the business or the ID of a sub-account of the business (required)
   * @return ApiResponse<Void>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<Void> gettheBeneficiariesforabusinessWithHttpInfo(String businessID) throws ApiException {
    Call call = gettheBeneficiariesforabusinessCall(businessID, null, null);
    return apiClient.execute(call);
  }

  /**
   * Get the Beneficiaries for a business (asynchronously)
   * This endpoint provides the ability to retrieve a list of beneficiaries attached to a business.    REQUEST BODY   | Field | Data Type | Description | |------| ------------- | ----------- | | page | string | Specify exactly what page you want to retrieve optional| | perPage | string | Specify how many records you want to retrieve per page optional|
   * @param businessID This could be the ID of the business or the ID of a sub-account of the business (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call gettheBeneficiariesforabusinessAsync(String businessID, final ApiCallback<Void> callback) throws ApiException {

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

    Call call = gettheBeneficiariesforabusinessCall(businessID, progressListener, progressRequestListener);
    apiClient.executeAsync(call, callback);
    return call;
  }
  /* Build call for requestAVirtualAccount */
  private Call requestAVirtualAccountCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    

    // create path and map variables
    String localVarPath = "/profile/virtual-accounts/requests".replaceAll("\\{format\\}","json");

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
   * Request A Virtual Account
   * This endpoint is used for requesting a single virtual account or multiple virtual accounts for the same currency.  REQUEST BODY  * * *  | Field | Data Type | Description | | --- | --- | --- | | currency | string | e.g GBP, EUR &#x60;required&#x60; for all currencies | | reason | number | This is &#x60;optional&#x60; for NGN | | monthlyVolume | string | This is &#x60;optional&#x60; for NGN | | entityName | string | This is &#x60;optional&#x60; for NGN | | KYCInformation | object | This is &#x60;optional&#x60; for NGN |  **Description of KYC Information Object**  | Field | Data type | Description | | --- | --- | --- | | businessCategory | string | &#x60;required&#x60; | | additionalInfo | string | &#x60;required&#x60; |
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public void requestAVirtualAccount() throws ApiException {
    requestAVirtualAccountWithHttpInfo();
  }

  /**
   * Request A Virtual Account
   * This endpoint is used for requesting a single virtual account or multiple virtual accounts for the same currency.  REQUEST BODY  * * *  | Field | Data Type | Description | | --- | --- | --- | | currency | string | e.g GBP, EUR &#x60;required&#x60; for all currencies | | reason | number | This is &#x60;optional&#x60; for NGN | | monthlyVolume | string | This is &#x60;optional&#x60; for NGN | | entityName | string | This is &#x60;optional&#x60; for NGN | | KYCInformation | object | This is &#x60;optional&#x60; for NGN |  **Description of KYC Information Object**  | Field | Data type | Description | | --- | --- | --- | | businessCategory | string | &#x60;required&#x60; | | additionalInfo | string | &#x60;required&#x60; |
   * @return ApiResponse<Void>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<Void> requestAVirtualAccountWithHttpInfo() throws ApiException {
    Call call = requestAVirtualAccountCall(null, null);
    return apiClient.execute(call);
  }

  /**
   * Request A Virtual Account (asynchronously)
   * This endpoint is used for requesting a single virtual account or multiple virtual accounts for the same currency.  REQUEST BODY  * * *  | Field | Data Type | Description | | --- | --- | --- | | currency | string | e.g GBP, EUR &#x60;required&#x60; for all currencies | | reason | number | This is &#x60;optional&#x60; for NGN | | monthlyVolume | string | This is &#x60;optional&#x60; for NGN | | entityName | string | This is &#x60;optional&#x60; for NGN | | KYCInformation | object | This is &#x60;optional&#x60; for NGN |  **Description of KYC Information Object**  | Field | Data type | Description | | --- | --- | --- | | businessCategory | string | &#x60;required&#x60; | | additionalInfo | string | &#x60;required&#x60; |
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call requestAVirtualAccountAsync(final ApiCallback<Void> callback) throws ApiException {

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

    Call call = requestAVirtualAccountCall(progressListener, progressRequestListener);
    apiClient.executeAsync(call, callback);
    return call;
  }
  /* Build call for requestAnEURvirtualAccountForASubaccount */
  private Call requestAnEURvirtualAccountForASubaccountCall(String businessId, String subAccountId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'businessId' is set
    if (businessId == null) {
       throw new ApiException("Missing the required parameter 'businessId' when calling requestAnEURvirtualAccountForASubaccount(Async)");
    }
    
    // verify the required parameter 'subAccountId' is set
    if (subAccountId == null) {
       throw new ApiException("Missing the required parameter 'subAccountId' when calling requestAnEURvirtualAccountForASubaccount(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/profile/virtual-accounts/business/{businessId}/sub-accounts/{subAccountId}/requests".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "businessId" + "\\}", apiClient.escapeString(businessId.toString()))
      .replaceAll("\\{" + "subAccountId" + "\\}", apiClient.escapeString(subAccountId.toString()));

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
   * Request An EUR virtual Account  For A Subaccount
   * This endpoint is used for creating a virtual account for your customer/customers  **Note**   The first name and last name or business name of a virtual account should always match with the name of the Receiver specified when making payments to the Virtual account. Else such payments would be blocked. Therefore, kindly pass in the right details when requesting a virtual account.  REQUEST BODY  * * *  | Field | Data type | Description | | --- | --- | --- | | currency | string | e.g EUR,GBP &#x60;required&#x60; | | accountType | string | The account type your customer wants. It should be either **individual** or **corporate** &#x60;required&#x60; | | KYCInformation | object | Verification of your customer Identity. See the tables below for KYC information for **Individual** and **Corporate** &#x60;required&#x60; | | meansOfId | file | Your means of identification from which should be a valid government ID e.g voters card, driving license .&#x60;Optional&#x60; for corporate virtual account . This should be a File Upload and not sent in Base64 format | | utilityBill | file | Electricity bills, water bills. &#x60;Optional&#x60; for corporate virtual account. This should be a File Upload and not sent in Base64 format |  **Description of KYC Information Object for Individual**  | Field | Data type | Description | | --- | --- | --- | | lastName | string | the last name of the individual &#x60;required&#x60; | | firstName | string | the first name of the individual &#x60;required&#x60; | | email | string | the email of the individual | | birthDate | dateFormat | YYYY-MM-DD &#x60;required&#x60; | | address | object | This contains all the required address information. They are:    \\+ country: country of origin &#x60;required&#x60;  \\+ zip &#x60;required&#x60;  \\+ street &#x60;required&#x60;  \\+ state &#x60;required&#x60;  \\+ city &#x60;required&#x60; | | document | object | This contains the required information in your means of identification. They are:    \\+ type: type of ID document e.g International Passport &#x60;required&#x60;  \\+ number &#x60;required&#x60;  \\+ issuedCountryCode e.g NG &#x60;required&#x60;  \\+ issuedBy &#x60;required&#x60;  \\+ issuedDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;required&#x60;  \\+ expirationDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60; | | occupation | string | &#x60;required&#x60; |  **Description of KYC Information Object for Corporate**  | Field | Data type | Description | | --- | --- | --- | | businessName | string | &#x60;required&#x60; | | businessRegistrationNumber | string | &#x60;required&#x60; | | incorporationDate | string | &#x60;required&#x60; | | expectedInboundMonthlyTurnover | string | &#x60;required&#x60; | | website | string | &#x60;optional&#x60; | | email | string | &#x60;optional&#x60; | | address | string | This field is required and has the following fields:    \\+ country: country of origin &#x60;required&#x60;  \\+ zip &#x60;required&#x60;  \\+ street &#x60;required&#x60;  \\+ state &#x60;required&#x60;  \\+ city &#x60;required&#x60; | | document | object | This field is required and has the following fields:    \\+ type: type of ID document e.g International Passport &#x60;required&#x60;  \\+ number &#x60;required&#x60;  \\+ issuedCountryCode e.g NG &#x60;required&#x60;  \\+ issuedBy &#x60;required&#x60;  \\+ issuedDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;required&#x60;  \\+ expirationDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60; | | ultimateBeneficialOwners | array of objects | This field is required and each object in it should contain the following fields:    \\+ lastName &#x60;required&#x60;  \\+ firstName &#x60;required&#x60;  \\+ ownershipPercentage &#x60;required&#x60;  \\+ politicallyExposedPerson &#x60;required&#x60; | | businessActivityDescription | string | &#x60;required&#x60; | | businessCategory | string | This is required for USD,GBP and EUR virtual accounts requests but &#x60;optional&#x60; for NGN e.g Government agencies, Joint Venture, Political parties | | additionalInfo | string | This is required for USD,GBP and EUR virtual account requests | | attachments | file | &#x60;optional&#x60; |
   * @param businessId The ID of the business (required)
   * @param subAccountId The ID of the subaccount (required)
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public void requestAnEURvirtualAccountForASubaccount(String businessId, String subAccountId) throws ApiException {
    requestAnEURvirtualAccountForASubaccountWithHttpInfo(businessId, subAccountId);
  }

  /**
   * Request An EUR virtual Account  For A Subaccount
   * This endpoint is used for creating a virtual account for your customer/customers  **Note**   The first name and last name or business name of a virtual account should always match with the name of the Receiver specified when making payments to the Virtual account. Else such payments would be blocked. Therefore, kindly pass in the right details when requesting a virtual account.  REQUEST BODY  * * *  | Field | Data type | Description | | --- | --- | --- | | currency | string | e.g EUR,GBP &#x60;required&#x60; | | accountType | string | The account type your customer wants. It should be either **individual** or **corporate** &#x60;required&#x60; | | KYCInformation | object | Verification of your customer Identity. See the tables below for KYC information for **Individual** and **Corporate** &#x60;required&#x60; | | meansOfId | file | Your means of identification from which should be a valid government ID e.g voters card, driving license .&#x60;Optional&#x60; for corporate virtual account . This should be a File Upload and not sent in Base64 format | | utilityBill | file | Electricity bills, water bills. &#x60;Optional&#x60; for corporate virtual account. This should be a File Upload and not sent in Base64 format |  **Description of KYC Information Object for Individual**  | Field | Data type | Description | | --- | --- | --- | | lastName | string | the last name of the individual &#x60;required&#x60; | | firstName | string | the first name of the individual &#x60;required&#x60; | | email | string | the email of the individual | | birthDate | dateFormat | YYYY-MM-DD &#x60;required&#x60; | | address | object | This contains all the required address information. They are:    \\+ country: country of origin &#x60;required&#x60;  \\+ zip &#x60;required&#x60;  \\+ street &#x60;required&#x60;  \\+ state &#x60;required&#x60;  \\+ city &#x60;required&#x60; | | document | object | This contains the required information in your means of identification. They are:    \\+ type: type of ID document e.g International Passport &#x60;required&#x60;  \\+ number &#x60;required&#x60;  \\+ issuedCountryCode e.g NG &#x60;required&#x60;  \\+ issuedBy &#x60;required&#x60;  \\+ issuedDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;required&#x60;  \\+ expirationDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60; | | occupation | string | &#x60;required&#x60; |  **Description of KYC Information Object for Corporate**  | Field | Data type | Description | | --- | --- | --- | | businessName | string | &#x60;required&#x60; | | businessRegistrationNumber | string | &#x60;required&#x60; | | incorporationDate | string | &#x60;required&#x60; | | expectedInboundMonthlyTurnover | string | &#x60;required&#x60; | | website | string | &#x60;optional&#x60; | | email | string | &#x60;optional&#x60; | | address | string | This field is required and has the following fields:    \\+ country: country of origin &#x60;required&#x60;  \\+ zip &#x60;required&#x60;  \\+ street &#x60;required&#x60;  \\+ state &#x60;required&#x60;  \\+ city &#x60;required&#x60; | | document | object | This field is required and has the following fields:    \\+ type: type of ID document e.g International Passport &#x60;required&#x60;  \\+ number &#x60;required&#x60;  \\+ issuedCountryCode e.g NG &#x60;required&#x60;  \\+ issuedBy &#x60;required&#x60;  \\+ issuedDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;required&#x60;  \\+ expirationDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60; | | ultimateBeneficialOwners | array of objects | This field is required and each object in it should contain the following fields:    \\+ lastName &#x60;required&#x60;  \\+ firstName &#x60;required&#x60;  \\+ ownershipPercentage &#x60;required&#x60;  \\+ politicallyExposedPerson &#x60;required&#x60; | | businessActivityDescription | string | &#x60;required&#x60; | | businessCategory | string | This is required for USD,GBP and EUR virtual accounts requests but &#x60;optional&#x60; for NGN e.g Government agencies, Joint Venture, Political parties | | additionalInfo | string | This is required for USD,GBP and EUR virtual account requests | | attachments | file | &#x60;optional&#x60; |
   * @param businessId The ID of the business (required)
   * @param subAccountId The ID of the subaccount (required)
   * @return ApiResponse<Void>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<Void> requestAnEURvirtualAccountForASubaccountWithHttpInfo(String businessId, String subAccountId) throws ApiException {
    Call call = requestAnEURvirtualAccountForASubaccountCall(businessId, subAccountId, null, null);
    return apiClient.execute(call);
  }

  /**
   * Request An EUR virtual Account  For A Subaccount (asynchronously)
   * This endpoint is used for creating a virtual account for your customer/customers  **Note**   The first name and last name or business name of a virtual account should always match with the name of the Receiver specified when making payments to the Virtual account. Else such payments would be blocked. Therefore, kindly pass in the right details when requesting a virtual account.  REQUEST BODY  * * *  | Field | Data type | Description | | --- | --- | --- | | currency | string | e.g EUR,GBP &#x60;required&#x60; | | accountType | string | The account type your customer wants. It should be either **individual** or **corporate** &#x60;required&#x60; | | KYCInformation | object | Verification of your customer Identity. See the tables below for KYC information for **Individual** and **Corporate** &#x60;required&#x60; | | meansOfId | file | Your means of identification from which should be a valid government ID e.g voters card, driving license .&#x60;Optional&#x60; for corporate virtual account . This should be a File Upload and not sent in Base64 format | | utilityBill | file | Electricity bills, water bills. &#x60;Optional&#x60; for corporate virtual account. This should be a File Upload and not sent in Base64 format |  **Description of KYC Information Object for Individual**  | Field | Data type | Description | | --- | --- | --- | | lastName | string | the last name of the individual &#x60;required&#x60; | | firstName | string | the first name of the individual &#x60;required&#x60; | | email | string | the email of the individual | | birthDate | dateFormat | YYYY-MM-DD &#x60;required&#x60; | | address | object | This contains all the required address information. They are:    \\+ country: country of origin &#x60;required&#x60;  \\+ zip &#x60;required&#x60;  \\+ street &#x60;required&#x60;  \\+ state &#x60;required&#x60;  \\+ city &#x60;required&#x60; | | document | object | This contains the required information in your means of identification. They are:    \\+ type: type of ID document e.g International Passport &#x60;required&#x60;  \\+ number &#x60;required&#x60;  \\+ issuedCountryCode e.g NG &#x60;required&#x60;  \\+ issuedBy &#x60;required&#x60;  \\+ issuedDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;required&#x60;  \\+ expirationDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60; | | occupation | string | &#x60;required&#x60; |  **Description of KYC Information Object for Corporate**  | Field | Data type | Description | | --- | --- | --- | | businessName | string | &#x60;required&#x60; | | businessRegistrationNumber | string | &#x60;required&#x60; | | incorporationDate | string | &#x60;required&#x60; | | expectedInboundMonthlyTurnover | string | &#x60;required&#x60; | | website | string | &#x60;optional&#x60; | | email | string | &#x60;optional&#x60; | | address | string | This field is required and has the following fields:    \\+ country: country of origin &#x60;required&#x60;  \\+ zip &#x60;required&#x60;  \\+ street &#x60;required&#x60;  \\+ state &#x60;required&#x60;  \\+ city &#x60;required&#x60; | | document | object | This field is required and has the following fields:    \\+ type: type of ID document e.g International Passport &#x60;required&#x60;  \\+ number &#x60;required&#x60;  \\+ issuedCountryCode e.g NG &#x60;required&#x60;  \\+ issuedBy &#x60;required&#x60;  \\+ issuedDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;required&#x60;  \\+ expirationDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60; | | ultimateBeneficialOwners | array of objects | This field is required and each object in it should contain the following fields:    \\+ lastName &#x60;required&#x60;  \\+ firstName &#x60;required&#x60;  \\+ ownershipPercentage &#x60;required&#x60;  \\+ politicallyExposedPerson &#x60;required&#x60; | | businessActivityDescription | string | &#x60;required&#x60; | | businessCategory | string | This is required for USD,GBP and EUR virtual accounts requests but &#x60;optional&#x60; for NGN e.g Government agencies, Joint Venture, Political parties | | additionalInfo | string | This is required for USD,GBP and EUR virtual account requests | | attachments | file | &#x60;optional&#x60; |
   * @param businessId The ID of the business (required)
   * @param subAccountId The ID of the subaccount (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call requestAnEURvirtualAccountForASubaccountAsync(String businessId, String subAccountId, final ApiCallback<Void> callback) throws ApiException {

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

    Call call = requestAnEURvirtualAccountForASubaccountCall(businessId, subAccountId, progressListener, progressRequestListener);
    apiClient.executeAsync(call, callback);
    return call;
  }
  /* Build call for updateASubaccount */
  private Call updateASubaccountCall(String businessId, String subAccountId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'businessId' is set
    if (businessId == null) {
       throw new ApiException("Missing the required parameter 'businessId' when calling updateASubaccount(Async)");
    }
    
    // verify the required parameter 'subAccountId' is set
    if (subAccountId == null) {
       throw new ApiException("Missing the required parameter 'subAccountId' when calling updateASubaccount(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/profile/business/{businessId}/sub-accounts/{subAccountId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "businessId" + "\\}", apiClient.escapeString(businessId.toString()))
      .replaceAll("\\{" + "subAccountId" + "\\}", apiClient.escapeString(subAccountId.toString()));

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
    return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
  }

  /**
   * Update A Subaccount
   * This endpoint is used to update a subaccount.  REQUEST BODY   | Field | Data Type | description | |------| ------------- | ----------- | | name | string | Customer&#39;s name required| | email | string | Customer&#39;s email  required| | mobile | string | Customer&#39;s phone number  required|
   * @param businessId The ID of the business (required)
   * @param subAccountId The ID of the subaccount (required)
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public void updateASubaccount(String businessId, String subAccountId) throws ApiException {
    updateASubaccountWithHttpInfo(businessId, subAccountId);
  }

  /**
   * Update A Subaccount
   * This endpoint is used to update a subaccount.  REQUEST BODY   | Field | Data Type | description | |------| ------------- | ----------- | | name | string | Customer&#39;s name required| | email | string | Customer&#39;s email  required| | mobile | string | Customer&#39;s phone number  required|
   * @param businessId The ID of the business (required)
   * @param subAccountId The ID of the subaccount (required)
   * @return ApiResponse<Void>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<Void> updateASubaccountWithHttpInfo(String businessId, String subAccountId) throws ApiException {
    Call call = updateASubaccountCall(businessId, subAccountId, null, null);
    return apiClient.execute(call);
  }

  /**
   * Update A Subaccount (asynchronously)
   * This endpoint is used to update a subaccount.  REQUEST BODY   | Field | Data Type | description | |------| ------------- | ----------- | | name | string | Customer&#39;s name required| | email | string | Customer&#39;s email  required| | mobile | string | Customer&#39;s phone number  required|
   * @param businessId The ID of the business (required)
   * @param subAccountId The ID of the subaccount (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call updateASubaccountAsync(String businessId, String subAccountId, final ApiCallback<Void> callback) throws ApiException {

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

    Call call = updateASubaccountCall(businessId, subAccountId, progressListener, progressRequestListener);
    apiClient.executeAsync(call, callback);
    return call;
  }
  /* Build call for updateaBeneficiary */
  private Call updateaBeneficiaryCall(String businessID, String beneficiaryID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'businessID' is set
    if (businessID == null) {
       throw new ApiException("Missing the required parameter 'businessID' when calling updateaBeneficiary(Async)");
    }
    
    // verify the required parameter 'beneficiaryID' is set
    if (beneficiaryID == null) {
       throw new ApiException("Missing the required parameter 'beneficiaryID' when calling updateaBeneficiary(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/profile/beneficiaries/business/{businessID}/{beneficiaryID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "businessID" + "\\}", apiClient.escapeString(businessID.toString()))
      .replaceAll("\\{" + "beneficiaryID" + "\\}", apiClient.escapeString(beneficiaryID.toString()));

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
    return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
  }

  /**
   * Update a Beneficiary
   * This endpoint is used for updating the information for a beneficiary.     REQUEST BODY   | Field | Data Type | Description | |------| ------------- | ----------- | | firstName | string | required| | lastName | string | optional| | email | string |The email address of Beneficiary. required | | phoneNumber | string | optional  | | accountHolderName | string | optional| | bank | object | see the information about this below. optional + name: bank name required  + code optional   + sortCode optional   + swiftCode optional  + branch  optional   + address: see the definition in address field below optional   | | type | string | The value for this field is either _corporate_ or _indivdual_required| | address | object | the physical address of the beneficiary and it comprises of the below: optional + country optional  + state optional   + zip required   + city required  + street  required  | | currency | string | The currency that Beneficiary would be paid in required| | paymentDestination | string | The value for this field is either _mobile_money_wallet_ or _bank_account_ required | | destinationAddress | string | see the definition belowrequired | | uniqueIdentifier | string | optional |    Value Description for the destinationAddress field  The table below show that a destination address should be when given a certain payment destination.  | paymentDestination | destinationAddress | |------| ------------- | | _mobile_money_wallet_ | phone number used for the wallet | | _bank_account_ | account number |
   * @param businessID This could be the ID of the business or the ID of a sub-account of the business (required)
   * @param beneficiaryID The reference or ID of the beneficiary (required)
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public void updateaBeneficiary(String businessID, String beneficiaryID) throws ApiException {
    updateaBeneficiaryWithHttpInfo(businessID, beneficiaryID);
  }

  /**
   * Update a Beneficiary
   * This endpoint is used for updating the information for a beneficiary.     REQUEST BODY   | Field | Data Type | Description | |------| ------------- | ----------- | | firstName | string | required| | lastName | string | optional| | email | string |The email address of Beneficiary. required | | phoneNumber | string | optional  | | accountHolderName | string | optional| | bank | object | see the information about this below. optional + name: bank name required  + code optional   + sortCode optional   + swiftCode optional  + branch  optional   + address: see the definition in address field below optional   | | type | string | The value for this field is either _corporate_ or _indivdual_required| | address | object | the physical address of the beneficiary and it comprises of the below: optional + country optional  + state optional   + zip required   + city required  + street  required  | | currency | string | The currency that Beneficiary would be paid in required| | paymentDestination | string | The value for this field is either _mobile_money_wallet_ or _bank_account_ required | | destinationAddress | string | see the definition belowrequired | | uniqueIdentifier | string | optional |    Value Description for the destinationAddress field  The table below show that a destination address should be when given a certain payment destination.  | paymentDestination | destinationAddress | |------| ------------- | | _mobile_money_wallet_ | phone number used for the wallet | | _bank_account_ | account number |
   * @param businessID This could be the ID of the business or the ID of a sub-account of the business (required)
   * @param beneficiaryID The reference or ID of the beneficiary (required)
   * @return ApiResponse<Void>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<Void> updateaBeneficiaryWithHttpInfo(String businessID, String beneficiaryID) throws ApiException {
    Call call = updateaBeneficiaryCall(businessID, beneficiaryID, null, null);
    return apiClient.execute(call);
  }

  /**
   * Update a Beneficiary (asynchronously)
   * This endpoint is used for updating the information for a beneficiary.     REQUEST BODY   | Field | Data Type | Description | |------| ------------- | ----------- | | firstName | string | required| | lastName | string | optional| | email | string |The email address of Beneficiary. required | | phoneNumber | string | optional  | | accountHolderName | string | optional| | bank | object | see the information about this below. optional + name: bank name required  + code optional   + sortCode optional   + swiftCode optional  + branch  optional   + address: see the definition in address field below optional   | | type | string | The value for this field is either _corporate_ or _indivdual_required| | address | object | the physical address of the beneficiary and it comprises of the below: optional + country optional  + state optional   + zip required   + city required  + street  required  | | currency | string | The currency that Beneficiary would be paid in required| | paymentDestination | string | The value for this field is either _mobile_money_wallet_ or _bank_account_ required | | destinationAddress | string | see the definition belowrequired | | uniqueIdentifier | string | optional |    Value Description for the destinationAddress field  The table below show that a destination address should be when given a certain payment destination.  | paymentDestination | destinationAddress | |------| ------------- | | _mobile_money_wallet_ | phone number used for the wallet | | _bank_account_ | account number |
   * @param businessID This could be the ID of the business or the ID of a sub-account of the business (required)
   * @param beneficiaryID The reference or ID of the beneficiary (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call updateaBeneficiaryAsync(String businessID, String beneficiaryID, final ApiCallback<Void> callback) throws ApiException {

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

    Call call = updateaBeneficiaryCall(businessID, beneficiaryID, progressListener, progressRequestListener);
    apiClient.executeAsync(call, callback);
    return call;
  }
}
