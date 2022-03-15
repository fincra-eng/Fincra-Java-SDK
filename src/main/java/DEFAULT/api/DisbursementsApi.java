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

public class DisbursementsApi {
  private ApiClient apiClient;

  public DisbursementsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DisbursementsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /* Build call for getallsettlementsforaBusiness */
  private Call getallsettlementsforaBusinessCall(String businessID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'businessID' is set
    if (businessID == null) {
       throw new ApiException("Missing the required parameter 'businessID' when calling getallsettlementsforaBusiness(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/disbursements/settlements/search/business/{businessID}".replaceAll("\\{format\\}","json")
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
   * Get all settlements for a Business
   * This endpoint provides a list of all the settlements for a business.   REQUEST BODY   | Field | Data Type | Description | |------| ------------- | ----------- | | page | string | Specify exactly what page you want to retrieve optional| | perPage | string | Specify how many records you want to retrieve per page optional| | from | string| Specify start date with format \&quot;YYYY-mm-dd\&quot;  optional| | to | string| Specify end date with format \&quot;YYYY-mm-dd\&quot; optional|  
   * @param businessID businessID (required)
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public void getallsettlementsforaBusiness(String businessID) throws ApiException {
    getallsettlementsforaBusinessWithHttpInfo(businessID);
  }

  /**
   * Get all settlements for a Business
   * This endpoint provides a list of all the settlements for a business.   REQUEST BODY   | Field | Data Type | Description | |------| ------------- | ----------- | | page | string | Specify exactly what page you want to retrieve optional| | perPage | string | Specify how many records you want to retrieve per page optional| | from | string| Specify start date with format \&quot;YYYY-mm-dd\&quot;  optional| | to | string| Specify end date with format \&quot;YYYY-mm-dd\&quot; optional|  
   * @param businessID businessID (required)
   * @return ApiResponse<Void>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<Void> getallsettlementsforaBusinessWithHttpInfo(String businessID) throws ApiException {
    Call call = getallsettlementsforaBusinessCall(businessID, null, null);
    return apiClient.execute(call);
  }

  /**
   * Get all settlements for a Business (asynchronously)
   * This endpoint provides a list of all the settlements for a business.   REQUEST BODY   | Field | Data Type | Description | |------| ------------- | ----------- | | page | string | Specify exactly what page you want to retrieve optional| | perPage | string | Specify how many records you want to retrieve per page optional| | from | string| Specify start date with format \&quot;YYYY-mm-dd\&quot;  optional| | to | string| Specify end date with format \&quot;YYYY-mm-dd\&quot; optional|  
   * @param businessID businessID (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getallsettlementsforaBusinessAsync(String businessID, final ApiCallback<Void> callback) throws ApiException {

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

    Call call = getallsettlementsforaBusinessCall(businessID, progressListener, progressRequestListener);
    apiClient.executeAsync(call, callback);
    return call;
  }
  /* Build call for getasettlementforabusiness */
  private Call getasettlementforabusinessCall(String settlementId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'settlementId' is set
    if (settlementId == null) {
       throw new ApiException("Missing the required parameter 'settlementId' when calling getasettlementforabusiness(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/disbursements/settlements/{settlementId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "settlementId" + "\\}", apiClient.escapeString(settlementId.toString()));

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
   * Get a settlement for a business
   * This endpoint provides the details of a settlement through the use of its ID.        
   * @param settlementId settlementId (required)
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public void getasettlementforabusiness(String settlementId) throws ApiException {
    getasettlementforabusinessWithHttpInfo(settlementId);
  }

  /**
   * Get a settlement for a business
   * This endpoint provides the details of a settlement through the use of its ID.        
   * @param settlementId settlementId (required)
   * @return ApiResponse<Void>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<Void> getasettlementforabusinessWithHttpInfo(String settlementId) throws ApiException {
    Call call = getasettlementforabusinessCall(settlementId, null, null);
    return apiClient.execute(call);
  }

  /**
   * Get a settlement for a business (asynchronously)
   * This endpoint provides the details of a settlement through the use of its ID.        
   * @param settlementId settlementId (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getasettlementforabusinessAsync(String settlementId, final ApiCallback<Void> callback) throws ApiException {

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

    Call call = getasettlementforabusinessCall(settlementId, progressListener, progressRequestListener);
    apiClient.executeAsync(call, callback);
    return call;
  }
  /* Build call for makeAPayout */
  private Call makeAPayoutCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    

    // create path and map variables
    String localVarPath = "/disbursements/payouts".replaceAll("\\{format\\}","json");

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
   * Make A Payout
   * This endpoint is used for making a payment out to the beneficiaries of the business who are not registered on our platform  REQUEST BODY  * * *  | Field | Data Type | description | | --- | --- | --- | | sourceCurrency | string | The currency which the business is to send payment in &#x60;required&#x60; | | destinationCurrency | string | The currency which the beneficiary is to receive payment in&#x60;required&#x60; | | amount | string | The amount to be paid out&#x60;required&#x60; | | business | string | This could be the ID of the business or the ID of a sub-account of the business &#x60;required&#x60; | | description | string | &#x60;required&#x60; | | customerReference | string | This is the unique reference generated for the transaction on your platform &#x60;optional&#x60; | | beneficiary | object | See the description of the beneficiary object below&#x60;required&#x60; | | paymentDestination | string | This is where the payment is to be made. the value will be one of the following: *bank_account*, *mobile_money_wallet* &#x60;required&#x60; | | quoteReference | string | This is required if the payout is a cross currency payout(e.g, NGN to USD). If this is a single currency payout (e.g, EUR to EUR), a quote reference is not required. To get a quote reference, you will need to call the generate quote endpoint below | | paymentScheme | string | This is the valid payment scheme for the destination currency.Payment scheme is required for all USD,EUR and GBP payouts |  The beneficiaries information varies based on the currency and beneficiary type (individual or corporate). Find the breakdown of the beneficiaries object below:  Description of &#x60;INDIVIDUAL&#x60; or &#x60;CORPORATE&#x60; Beneficiary information for &#x60;NGN&#x60; and &#x60;KES&#x60; payout:  | Field | Data Type | description | | --- | --- | --- | | lastName | string | The last name of the beneficiary. it is &#x60;required&#x60; if type is **individual** and &#x60;optional&#x60; if type is **corporate** | | firstName | string | The first name of the beneficiary if type is **individual** or the name of the corporation if type is **corporate** &#x60;required&#x60; | | accountNumber | string | This is the bank account number of the beneficiary or phone number if the account is a mobile money wallet. &#x60;required&#x60; | | accountHolderName | string | This is the name on the bank account of the beneficiary. &#x60;required&#x60; | | bankCode | string | This value is either the code for your bank or mobile money wallet provider. To get this value, you will need to call the get bank code endpoint below &#x60;required&#x60; | | type | string | the value can either be **individual** or **corporate** &#x60;required&#x60; | | country | string | &#x60;optional&#x60; | | email | string | &#x60;optional&#x60; |  Description of &#x60;INDIVIDUAL&#x60; or &#x60;CORPORATE&#x60; Beneficiary information for &#x60;GHS&#x60; and &#x60;ZAR&#x60; payout:  | Field | Data Type | description | | --- | --- | --- | | lastName | string | The last name of the beneficiary. it is &#x60;required&#x60; if type is **individual** and &#x60;optional&#x60; if type is **corporate** | | firstName | string | The first name of the beneficiary if type is **individual** or the name of the corporation if type is **corporate** &#x60;required&#x60; | | accountHolderName | string | This is the name on the bank account of the beneficiary. &#x60;required&#x60; | | accountNumber | string | This is the bank account number of the beneficiary or phone number if the account is a mobile money wallet. &#x60;required&#x60; | | bankCode | string | This value is either the code for your bank or mobile money wallet provider. To get this value, you will need to call the get bank code endpoint below &#x60;required&#x60; | | sortCode(branchCode) | string | To get this code, you will need to call the get bank branch endpoint below &#x60;required&#x60; | | type | string | the value can either be **individual** or **corporate** &#x60;required&#x60; | | country | string | &#x60;optional&#x60; | | email | string | &#x60;optional&#x60; |  Description of &#x60;INDIVIDUAL&#x60; Beneficiary information for &#x60;EUR&#x60; payout:  | Field | Data Type | description | | --- | --- | --- | | lastName | string | The last name of the beneficiary. it is &#x60;required&#x60; | | firstName | string | The first name of the beneficiary | | accountHolderName | string | This is the name on the bank account of the beneficiary. &#x60;required&#x60; | | accountNumber | string | This value of this field will be IBAN of the beneficiary. Depending on the country, the IBAN is mostly made up of the following format: *Country code + check digits + bank code + sort code + account number*. Kindly visit this page to see the IBAN format for different countries.&#x60;required&#x60; | | type | string | the value can either be **individual** or **corporate** &#x60;required&#x60; | | country | string | &#x60;optional&#x60; | | email | string | &#x60;optional&#x60; | | mobile | string | &#x60;optional&#x60; | | bankSwiftCode | string | &#x60;optional&#x60; | | birthDate | string | &#x60;optional&#x60; | | birthPlace | string | &#x60;optional&#x60; | | address | object | This contains all the optional address information. They are:    \\+ country: country of origin &#x60;optional&#x60;  \\+ zip &#x60;optional&#x60;  \\+ street &#x60;optional&#x60;  \\+ state &#x60;optional&#x60;  \\+ city &#x60;optional&#x60; | | document | object | This contains the optional information in your means of identification. They are:    \\+ type: type of ID document e.g International Passport &#x60;optional&#x60;  \\+ number &#x60;optional&#x60;  \\+ issuedCountryCode e.g NG &#x60;optional&#x60;  \\+ issuedBy &#x60;optional&#x60;  \\+ issuedDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60;  \\+ expirationDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60; |  Description of &#x60;CORPORATE&#x60; Beneficiary information for &#x60;EUR&#x60; payout:  | Field | Data Type | description | | --- | --- | --- | | accountHolderName | string | This is the name on the bank account of the beneficiary. &#x60;required&#x60; | | accountNumber | string | This value of this field will be IBAN of the beneficiary. Depending on the country, the IBAN is mostly made up of the following format: *Country code + check digits + bank code + sort code + account number*. Kindly visit this page to see the IBAN format for different countries.&#x60;required&#x60; | | type | string | the value can either be **individual** or **corporate** &#x60;required&#x60; | | country | string | &#x60;optional&#x60; | | email | string | &#x60;optional&#x60; | | mobile | string | &#x60;optional&#x60; | | bankSwiftCode | string | &#x60;optional&#x60; | | registrationNumber | string | &#x60;optional&#x60; | | address | object | This contains all the optional address information. They are:    \\+ country: country of origin &#x60;optional&#x60;  \\+ zip &#x60;optional&#x60;  \\+ street &#x60;optional&#x60;  \\+ state &#x60;optional&#x60;  \\+ city &#x60;optional&#x60; | | document | object | This contains the optional information in your means of identification. They are:    \\+ type: type of ID document e.g International Passport &#x60;optional&#x60;  \\+ number &#x60;optional&#x60;  \\+ issuedCountryCode e.g NG &#x60;optional&#x60;  \\+ issuedBy &#x60;optional&#x60;  \\+ issuedDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60;  \\+ expirationDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60; |  Description of &#x60;CORPORATE&#x60; Beneficiary information for &#x60;GBP&#x60; payout:  | Field | Data Type | description | | --- | --- | --- | | accountHolderName | string | This is the name on the bank account of the beneficiary. &#x60;required&#x60; | | accountNumber | string | This should be the beneficiary&#39;s account number&#x60;required&#x60; | | type | string | the value can either be **individual** or **corporate** &#x60;required&#x60; | | country | string | &#x60;optional&#x60; | | email | string | &#x60;optional&#x60; | | mobile | string | &#x60;optional&#x60; | | bankSwiftCode | string | &#x60;optional&#x60; | | sortCode | string | &#x60;required&#x60; | | registrationNumber | string | &#x60;optional&#x60; | | address | object | This contains all the optional address information. They are:    \\+ country: country of origin &#x60;optional&#x60;  \\+ zip &#x60;optional&#x60;  \\+ street &#x60;optional&#x60;  \\+ state &#x60;optional&#x60;  \\+ city &#x60;optional&#x60; | | document | object | This contains the optional information in your means of identification. They are:    \\+ type: type of ID document e.g International Passport &#x60;optional&#x60;  \\+ number &#x60;optional&#x60;  \\+ issuedCountryCode e.g NG &#x60;optional&#x60;  \\+ issuedBy &#x60;optional&#x60;  \\+ issuedDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60;  \\+ expirationDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60; |  Description of &#x60;INDIVIDUAL&#x60; Beneficiary information for &#x60;GBP&#x60; payout:  | Field | Data Type | description | | --- | --- | --- | | lastName | string | The last name of the beneficiary. it is &#x60;required&#x60; | | firstName | string | The first name of the beneficiary | | accountHolderName | string | This is the name on the bank account of the beneficiary. &#x60;required&#x60; | | accountNumber | string | This should be the beneficiary&#39;s account number&#x60;required&#x60; | | type | string | the value can either be **individual** or **corporate** &#x60;required&#x60; | | country | string | &#x60;optional&#x60; | | email | string | &#x60;optional&#x60; | | mobile | string | &#x60;optional&#x60; | | bankSwiftCode | string | &#x60;optional&#x60; | | sortCode | string | &#x60;required&#x60; | | birthDate | string | &#x60;optional&#x60; | | birthPlace | string | &#x60;optional&#x60; | | address | object | This contains all the optional address information. They are:    \\+ country: country of origin &#x60;optional&#x60;  \\+ zip &#x60;optional&#x60;  \\+ street &#x60;optional&#x60;  \\+ state &#x60;optional&#x60;  \\+ city &#x60;optional&#x60; | | document | object | This contains the optional information in your means of identification. They are:    \\+ type: type of ID document e.g International Passport &#x60;optional&#x60;  \\+ number &#x60;optional&#x60;  \\+ issuedCountryCode e.g NG &#x60;optional&#x60;  \\+ issuedBy &#x60;optional&#x60;  \\+ issuedDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60;  \\+ expirationDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60; |  Description of &#x60;CORPORATE&#x60; Beneficiary information for &#x60;USD&#x60; payout:  | Field | Data Type | description | | --- | --- | --- | | accountHolderName | string | This is the name on the bank account of the beneficiary. &#x60;required&#x60; | | accountNumber | string | This should be the beneficiary&#39;s account number&#x60;required&#x60; | | type | string | the value can either be **individual** or **corporate** &#x60;required&#x60; | | country | string | &#x60;optional&#x60; | | email | string | &#x60;optional&#x60; | | mobile | string | &#x60;optional&#x60; | | bankSwiftCode | string | &#x60;required&#x60; | | sortCode | string | &#x60;required&#x60; | | registrationNumber | string | &#x60;optional&#x60; | | address | object | This contains all the optional address information. They are:    \\+ country: country of origin &#x60;optional&#x60;  \\+ zip &#x60;optional&#x60;  \\+ street &#x60;optional&#x60;  \\+ state &#x60;optional&#x60;  \\+ city &#x60;optional&#x60; | | document | object | This contains the optional information in your means of identification. They are:    \\+ type: type of ID document e.g International Passport &#x60;optional&#x60;  \\+ number &#x60;optional&#x60;  \\+ issuedCountryCode e.g NG &#x60;optional&#x60;  \\+ issuedBy &#x60;optional&#x60;  \\+ issuedDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60;  \\+ expirationDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60; |  Description of &#x60;INDIVIDUAL&#x60; Beneficiary information for &#x60;USD&#x60; payout:  | Field | Data Type | description | | --- | --- | --- | | lastName | string | The last name of the beneficiary. it is &#x60;required&#x60; | | firstName | string | The first name of the beneficiary | | accountHolderName | string | This is the name on the bank account of the beneficiary. &#x60;required&#x60; | | accountNumber | string | This should be the beneficiary&#39;s account number&#x60;required&#x60; | | type | string | the value can either be **individual** or **corporate** &#x60;required&#x60; | | country | string | &#x60;optional&#x60; | | email | string | &#x60;optional&#x60; | | mobile | string | &#x60;optional&#x60; | | bankSwiftCode | string | &#x60;required&#x60; | | sortCode | string | &#x60;required&#x60; | | birthDate | string | &#x60;optional&#x60; | | birthPlace | string | &#x60;optional&#x60; | | address | object | This contains all the optional address information. They are:    \\+ country: country of origin &#x60;optional&#x60;  \\+ zip &#x60;optional&#x60;  \\+ street &#x60;optional&#x60;  \\+ state &#x60;optional&#x60;  \\+ city &#x60;optional&#x60; | | document | object | This contains the optional information in your means of identification. They are:    \\+ type: type of ID document e.g International Passport &#x60;optional&#x60;  \\+ number &#x60;optional&#x60;  \\+ issuedCountryCode e.g NG &#x60;optional&#x60;  \\+ issuedBy &#x60;optional&#x60;  \\+ issuedDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60;  \\+ expirationDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60; |
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public void makeAPayout() throws ApiException {
    makeAPayoutWithHttpInfo();
  }

  /**
   * Make A Payout
   * This endpoint is used for making a payment out to the beneficiaries of the business who are not registered on our platform  REQUEST BODY  * * *  | Field | Data Type | description | | --- | --- | --- | | sourceCurrency | string | The currency which the business is to send payment in &#x60;required&#x60; | | destinationCurrency | string | The currency which the beneficiary is to receive payment in&#x60;required&#x60; | | amount | string | The amount to be paid out&#x60;required&#x60; | | business | string | This could be the ID of the business or the ID of a sub-account of the business &#x60;required&#x60; | | description | string | &#x60;required&#x60; | | customerReference | string | This is the unique reference generated for the transaction on your platform &#x60;optional&#x60; | | beneficiary | object | See the description of the beneficiary object below&#x60;required&#x60; | | paymentDestination | string | This is where the payment is to be made. the value will be one of the following: *bank_account*, *mobile_money_wallet* &#x60;required&#x60; | | quoteReference | string | This is required if the payout is a cross currency payout(e.g, NGN to USD). If this is a single currency payout (e.g, EUR to EUR), a quote reference is not required. To get a quote reference, you will need to call the generate quote endpoint below | | paymentScheme | string | This is the valid payment scheme for the destination currency.Payment scheme is required for all USD,EUR and GBP payouts |  The beneficiaries information varies based on the currency and beneficiary type (individual or corporate). Find the breakdown of the beneficiaries object below:  Description of &#x60;INDIVIDUAL&#x60; or &#x60;CORPORATE&#x60; Beneficiary information for &#x60;NGN&#x60; and &#x60;KES&#x60; payout:  | Field | Data Type | description | | --- | --- | --- | | lastName | string | The last name of the beneficiary. it is &#x60;required&#x60; if type is **individual** and &#x60;optional&#x60; if type is **corporate** | | firstName | string | The first name of the beneficiary if type is **individual** or the name of the corporation if type is **corporate** &#x60;required&#x60; | | accountNumber | string | This is the bank account number of the beneficiary or phone number if the account is a mobile money wallet. &#x60;required&#x60; | | accountHolderName | string | This is the name on the bank account of the beneficiary. &#x60;required&#x60; | | bankCode | string | This value is either the code for your bank or mobile money wallet provider. To get this value, you will need to call the get bank code endpoint below &#x60;required&#x60; | | type | string | the value can either be **individual** or **corporate** &#x60;required&#x60; | | country | string | &#x60;optional&#x60; | | email | string | &#x60;optional&#x60; |  Description of &#x60;INDIVIDUAL&#x60; or &#x60;CORPORATE&#x60; Beneficiary information for &#x60;GHS&#x60; and &#x60;ZAR&#x60; payout:  | Field | Data Type | description | | --- | --- | --- | | lastName | string | The last name of the beneficiary. it is &#x60;required&#x60; if type is **individual** and &#x60;optional&#x60; if type is **corporate** | | firstName | string | The first name of the beneficiary if type is **individual** or the name of the corporation if type is **corporate** &#x60;required&#x60; | | accountHolderName | string | This is the name on the bank account of the beneficiary. &#x60;required&#x60; | | accountNumber | string | This is the bank account number of the beneficiary or phone number if the account is a mobile money wallet. &#x60;required&#x60; | | bankCode | string | This value is either the code for your bank or mobile money wallet provider. To get this value, you will need to call the get bank code endpoint below &#x60;required&#x60; | | sortCode(branchCode) | string | To get this code, you will need to call the get bank branch endpoint below &#x60;required&#x60; | | type | string | the value can either be **individual** or **corporate** &#x60;required&#x60; | | country | string | &#x60;optional&#x60; | | email | string | &#x60;optional&#x60; |  Description of &#x60;INDIVIDUAL&#x60; Beneficiary information for &#x60;EUR&#x60; payout:  | Field | Data Type | description | | --- | --- | --- | | lastName | string | The last name of the beneficiary. it is &#x60;required&#x60; | | firstName | string | The first name of the beneficiary | | accountHolderName | string | This is the name on the bank account of the beneficiary. &#x60;required&#x60; | | accountNumber | string | This value of this field will be IBAN of the beneficiary. Depending on the country, the IBAN is mostly made up of the following format: *Country code + check digits + bank code + sort code + account number*. Kindly visit this page to see the IBAN format for different countries.&#x60;required&#x60; | | type | string | the value can either be **individual** or **corporate** &#x60;required&#x60; | | country | string | &#x60;optional&#x60; | | email | string | &#x60;optional&#x60; | | mobile | string | &#x60;optional&#x60; | | bankSwiftCode | string | &#x60;optional&#x60; | | birthDate | string | &#x60;optional&#x60; | | birthPlace | string | &#x60;optional&#x60; | | address | object | This contains all the optional address information. They are:    \\+ country: country of origin &#x60;optional&#x60;  \\+ zip &#x60;optional&#x60;  \\+ street &#x60;optional&#x60;  \\+ state &#x60;optional&#x60;  \\+ city &#x60;optional&#x60; | | document | object | This contains the optional information in your means of identification. They are:    \\+ type: type of ID document e.g International Passport &#x60;optional&#x60;  \\+ number &#x60;optional&#x60;  \\+ issuedCountryCode e.g NG &#x60;optional&#x60;  \\+ issuedBy &#x60;optional&#x60;  \\+ issuedDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60;  \\+ expirationDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60; |  Description of &#x60;CORPORATE&#x60; Beneficiary information for &#x60;EUR&#x60; payout:  | Field | Data Type | description | | --- | --- | --- | | accountHolderName | string | This is the name on the bank account of the beneficiary. &#x60;required&#x60; | | accountNumber | string | This value of this field will be IBAN of the beneficiary. Depending on the country, the IBAN is mostly made up of the following format: *Country code + check digits + bank code + sort code + account number*. Kindly visit this page to see the IBAN format for different countries.&#x60;required&#x60; | | type | string | the value can either be **individual** or **corporate** &#x60;required&#x60; | | country | string | &#x60;optional&#x60; | | email | string | &#x60;optional&#x60; | | mobile | string | &#x60;optional&#x60; | | bankSwiftCode | string | &#x60;optional&#x60; | | registrationNumber | string | &#x60;optional&#x60; | | address | object | This contains all the optional address information. They are:    \\+ country: country of origin &#x60;optional&#x60;  \\+ zip &#x60;optional&#x60;  \\+ street &#x60;optional&#x60;  \\+ state &#x60;optional&#x60;  \\+ city &#x60;optional&#x60; | | document | object | This contains the optional information in your means of identification. They are:    \\+ type: type of ID document e.g International Passport &#x60;optional&#x60;  \\+ number &#x60;optional&#x60;  \\+ issuedCountryCode e.g NG &#x60;optional&#x60;  \\+ issuedBy &#x60;optional&#x60;  \\+ issuedDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60;  \\+ expirationDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60; |  Description of &#x60;CORPORATE&#x60; Beneficiary information for &#x60;GBP&#x60; payout:  | Field | Data Type | description | | --- | --- | --- | | accountHolderName | string | This is the name on the bank account of the beneficiary. &#x60;required&#x60; | | accountNumber | string | This should be the beneficiary&#39;s account number&#x60;required&#x60; | | type | string | the value can either be **individual** or **corporate** &#x60;required&#x60; | | country | string | &#x60;optional&#x60; | | email | string | &#x60;optional&#x60; | | mobile | string | &#x60;optional&#x60; | | bankSwiftCode | string | &#x60;optional&#x60; | | sortCode | string | &#x60;required&#x60; | | registrationNumber | string | &#x60;optional&#x60; | | address | object | This contains all the optional address information. They are:    \\+ country: country of origin &#x60;optional&#x60;  \\+ zip &#x60;optional&#x60;  \\+ street &#x60;optional&#x60;  \\+ state &#x60;optional&#x60;  \\+ city &#x60;optional&#x60; | | document | object | This contains the optional information in your means of identification. They are:    \\+ type: type of ID document e.g International Passport &#x60;optional&#x60;  \\+ number &#x60;optional&#x60;  \\+ issuedCountryCode e.g NG &#x60;optional&#x60;  \\+ issuedBy &#x60;optional&#x60;  \\+ issuedDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60;  \\+ expirationDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60; |  Description of &#x60;INDIVIDUAL&#x60; Beneficiary information for &#x60;GBP&#x60; payout:  | Field | Data Type | description | | --- | --- | --- | | lastName | string | The last name of the beneficiary. it is &#x60;required&#x60; | | firstName | string | The first name of the beneficiary | | accountHolderName | string | This is the name on the bank account of the beneficiary. &#x60;required&#x60; | | accountNumber | string | This should be the beneficiary&#39;s account number&#x60;required&#x60; | | type | string | the value can either be **individual** or **corporate** &#x60;required&#x60; | | country | string | &#x60;optional&#x60; | | email | string | &#x60;optional&#x60; | | mobile | string | &#x60;optional&#x60; | | bankSwiftCode | string | &#x60;optional&#x60; | | sortCode | string | &#x60;required&#x60; | | birthDate | string | &#x60;optional&#x60; | | birthPlace | string | &#x60;optional&#x60; | | address | object | This contains all the optional address information. They are:    \\+ country: country of origin &#x60;optional&#x60;  \\+ zip &#x60;optional&#x60;  \\+ street &#x60;optional&#x60;  \\+ state &#x60;optional&#x60;  \\+ city &#x60;optional&#x60; | | document | object | This contains the optional information in your means of identification. They are:    \\+ type: type of ID document e.g International Passport &#x60;optional&#x60;  \\+ number &#x60;optional&#x60;  \\+ issuedCountryCode e.g NG &#x60;optional&#x60;  \\+ issuedBy &#x60;optional&#x60;  \\+ issuedDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60;  \\+ expirationDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60; |  Description of &#x60;CORPORATE&#x60; Beneficiary information for &#x60;USD&#x60; payout:  | Field | Data Type | description | | --- | --- | --- | | accountHolderName | string | This is the name on the bank account of the beneficiary. &#x60;required&#x60; | | accountNumber | string | This should be the beneficiary&#39;s account number&#x60;required&#x60; | | type | string | the value can either be **individual** or **corporate** &#x60;required&#x60; | | country | string | &#x60;optional&#x60; | | email | string | &#x60;optional&#x60; | | mobile | string | &#x60;optional&#x60; | | bankSwiftCode | string | &#x60;required&#x60; | | sortCode | string | &#x60;required&#x60; | | registrationNumber | string | &#x60;optional&#x60; | | address | object | This contains all the optional address information. They are:    \\+ country: country of origin &#x60;optional&#x60;  \\+ zip &#x60;optional&#x60;  \\+ street &#x60;optional&#x60;  \\+ state &#x60;optional&#x60;  \\+ city &#x60;optional&#x60; | | document | object | This contains the optional information in your means of identification. They are:    \\+ type: type of ID document e.g International Passport &#x60;optional&#x60;  \\+ number &#x60;optional&#x60;  \\+ issuedCountryCode e.g NG &#x60;optional&#x60;  \\+ issuedBy &#x60;optional&#x60;  \\+ issuedDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60;  \\+ expirationDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60; |  Description of &#x60;INDIVIDUAL&#x60; Beneficiary information for &#x60;USD&#x60; payout:  | Field | Data Type | description | | --- | --- | --- | | lastName | string | The last name of the beneficiary. it is &#x60;required&#x60; | | firstName | string | The first name of the beneficiary | | accountHolderName | string | This is the name on the bank account of the beneficiary. &#x60;required&#x60; | | accountNumber | string | This should be the beneficiary&#39;s account number&#x60;required&#x60; | | type | string | the value can either be **individual** or **corporate** &#x60;required&#x60; | | country | string | &#x60;optional&#x60; | | email | string | &#x60;optional&#x60; | | mobile | string | &#x60;optional&#x60; | | bankSwiftCode | string | &#x60;required&#x60; | | sortCode | string | &#x60;required&#x60; | | birthDate | string | &#x60;optional&#x60; | | birthPlace | string | &#x60;optional&#x60; | | address | object | This contains all the optional address information. They are:    \\+ country: country of origin &#x60;optional&#x60;  \\+ zip &#x60;optional&#x60;  \\+ street &#x60;optional&#x60;  \\+ state &#x60;optional&#x60;  \\+ city &#x60;optional&#x60; | | document | object | This contains the optional information in your means of identification. They are:    \\+ type: type of ID document e.g International Passport &#x60;optional&#x60;  \\+ number &#x60;optional&#x60;  \\+ issuedCountryCode e.g NG &#x60;optional&#x60;  \\+ issuedBy &#x60;optional&#x60;  \\+ issuedDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60;  \\+ expirationDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60; |
   * @return ApiResponse<Void>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<Void> makeAPayoutWithHttpInfo() throws ApiException {
    Call call = makeAPayoutCall(null, null);
    return apiClient.execute(call);
  }

  /**
   * Make A Payout (asynchronously)
   * This endpoint is used for making a payment out to the beneficiaries of the business who are not registered on our platform  REQUEST BODY  * * *  | Field | Data Type | description | | --- | --- | --- | | sourceCurrency | string | The currency which the business is to send payment in &#x60;required&#x60; | | destinationCurrency | string | The currency which the beneficiary is to receive payment in&#x60;required&#x60; | | amount | string | The amount to be paid out&#x60;required&#x60; | | business | string | This could be the ID of the business or the ID of a sub-account of the business &#x60;required&#x60; | | description | string | &#x60;required&#x60; | | customerReference | string | This is the unique reference generated for the transaction on your platform &#x60;optional&#x60; | | beneficiary | object | See the description of the beneficiary object below&#x60;required&#x60; | | paymentDestination | string | This is where the payment is to be made. the value will be one of the following: *bank_account*, *mobile_money_wallet* &#x60;required&#x60; | | quoteReference | string | This is required if the payout is a cross currency payout(e.g, NGN to USD). If this is a single currency payout (e.g, EUR to EUR), a quote reference is not required. To get a quote reference, you will need to call the generate quote endpoint below | | paymentScheme | string | This is the valid payment scheme for the destination currency.Payment scheme is required for all USD,EUR and GBP payouts |  The beneficiaries information varies based on the currency and beneficiary type (individual or corporate). Find the breakdown of the beneficiaries object below:  Description of &#x60;INDIVIDUAL&#x60; or &#x60;CORPORATE&#x60; Beneficiary information for &#x60;NGN&#x60; and &#x60;KES&#x60; payout:  | Field | Data Type | description | | --- | --- | --- | | lastName | string | The last name of the beneficiary. it is &#x60;required&#x60; if type is **individual** and &#x60;optional&#x60; if type is **corporate** | | firstName | string | The first name of the beneficiary if type is **individual** or the name of the corporation if type is **corporate** &#x60;required&#x60; | | accountNumber | string | This is the bank account number of the beneficiary or phone number if the account is a mobile money wallet. &#x60;required&#x60; | | accountHolderName | string | This is the name on the bank account of the beneficiary. &#x60;required&#x60; | | bankCode | string | This value is either the code for your bank or mobile money wallet provider. To get this value, you will need to call the get bank code endpoint below &#x60;required&#x60; | | type | string | the value can either be **individual** or **corporate** &#x60;required&#x60; | | country | string | &#x60;optional&#x60; | | email | string | &#x60;optional&#x60; |  Description of &#x60;INDIVIDUAL&#x60; or &#x60;CORPORATE&#x60; Beneficiary information for &#x60;GHS&#x60; and &#x60;ZAR&#x60; payout:  | Field | Data Type | description | | --- | --- | --- | | lastName | string | The last name of the beneficiary. it is &#x60;required&#x60; if type is **individual** and &#x60;optional&#x60; if type is **corporate** | | firstName | string | The first name of the beneficiary if type is **individual** or the name of the corporation if type is **corporate** &#x60;required&#x60; | | accountHolderName | string | This is the name on the bank account of the beneficiary. &#x60;required&#x60; | | accountNumber | string | This is the bank account number of the beneficiary or phone number if the account is a mobile money wallet. &#x60;required&#x60; | | bankCode | string | This value is either the code for your bank or mobile money wallet provider. To get this value, you will need to call the get bank code endpoint below &#x60;required&#x60; | | sortCode(branchCode) | string | To get this code, you will need to call the get bank branch endpoint below &#x60;required&#x60; | | type | string | the value can either be **individual** or **corporate** &#x60;required&#x60; | | country | string | &#x60;optional&#x60; | | email | string | &#x60;optional&#x60; |  Description of &#x60;INDIVIDUAL&#x60; Beneficiary information for &#x60;EUR&#x60; payout:  | Field | Data Type | description | | --- | --- | --- | | lastName | string | The last name of the beneficiary. it is &#x60;required&#x60; | | firstName | string | The first name of the beneficiary | | accountHolderName | string | This is the name on the bank account of the beneficiary. &#x60;required&#x60; | | accountNumber | string | This value of this field will be IBAN of the beneficiary. Depending on the country, the IBAN is mostly made up of the following format: *Country code + check digits + bank code + sort code + account number*. Kindly visit this page to see the IBAN format for different countries.&#x60;required&#x60; | | type | string | the value can either be **individual** or **corporate** &#x60;required&#x60; | | country | string | &#x60;optional&#x60; | | email | string | &#x60;optional&#x60; | | mobile | string | &#x60;optional&#x60; | | bankSwiftCode | string | &#x60;optional&#x60; | | birthDate | string | &#x60;optional&#x60; | | birthPlace | string | &#x60;optional&#x60; | | address | object | This contains all the optional address information. They are:    \\+ country: country of origin &#x60;optional&#x60;  \\+ zip &#x60;optional&#x60;  \\+ street &#x60;optional&#x60;  \\+ state &#x60;optional&#x60;  \\+ city &#x60;optional&#x60; | | document | object | This contains the optional information in your means of identification. They are:    \\+ type: type of ID document e.g International Passport &#x60;optional&#x60;  \\+ number &#x60;optional&#x60;  \\+ issuedCountryCode e.g NG &#x60;optional&#x60;  \\+ issuedBy &#x60;optional&#x60;  \\+ issuedDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60;  \\+ expirationDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60; |  Description of &#x60;CORPORATE&#x60; Beneficiary information for &#x60;EUR&#x60; payout:  | Field | Data Type | description | | --- | --- | --- | | accountHolderName | string | This is the name on the bank account of the beneficiary. &#x60;required&#x60; | | accountNumber | string | This value of this field will be IBAN of the beneficiary. Depending on the country, the IBAN is mostly made up of the following format: *Country code + check digits + bank code + sort code + account number*. Kindly visit this page to see the IBAN format for different countries.&#x60;required&#x60; | | type | string | the value can either be **individual** or **corporate** &#x60;required&#x60; | | country | string | &#x60;optional&#x60; | | email | string | &#x60;optional&#x60; | | mobile | string | &#x60;optional&#x60; | | bankSwiftCode | string | &#x60;optional&#x60; | | registrationNumber | string | &#x60;optional&#x60; | | address | object | This contains all the optional address information. They are:    \\+ country: country of origin &#x60;optional&#x60;  \\+ zip &#x60;optional&#x60;  \\+ street &#x60;optional&#x60;  \\+ state &#x60;optional&#x60;  \\+ city &#x60;optional&#x60; | | document | object | This contains the optional information in your means of identification. They are:    \\+ type: type of ID document e.g International Passport &#x60;optional&#x60;  \\+ number &#x60;optional&#x60;  \\+ issuedCountryCode e.g NG &#x60;optional&#x60;  \\+ issuedBy &#x60;optional&#x60;  \\+ issuedDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60;  \\+ expirationDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60; |  Description of &#x60;CORPORATE&#x60; Beneficiary information for &#x60;GBP&#x60; payout:  | Field | Data Type | description | | --- | --- | --- | | accountHolderName | string | This is the name on the bank account of the beneficiary. &#x60;required&#x60; | | accountNumber | string | This should be the beneficiary&#39;s account number&#x60;required&#x60; | | type | string | the value can either be **individual** or **corporate** &#x60;required&#x60; | | country | string | &#x60;optional&#x60; | | email | string | &#x60;optional&#x60; | | mobile | string | &#x60;optional&#x60; | | bankSwiftCode | string | &#x60;optional&#x60; | | sortCode | string | &#x60;required&#x60; | | registrationNumber | string | &#x60;optional&#x60; | | address | object | This contains all the optional address information. They are:    \\+ country: country of origin &#x60;optional&#x60;  \\+ zip &#x60;optional&#x60;  \\+ street &#x60;optional&#x60;  \\+ state &#x60;optional&#x60;  \\+ city &#x60;optional&#x60; | | document | object | This contains the optional information in your means of identification. They are:    \\+ type: type of ID document e.g International Passport &#x60;optional&#x60;  \\+ number &#x60;optional&#x60;  \\+ issuedCountryCode e.g NG &#x60;optional&#x60;  \\+ issuedBy &#x60;optional&#x60;  \\+ issuedDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60;  \\+ expirationDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60; |  Description of &#x60;INDIVIDUAL&#x60; Beneficiary information for &#x60;GBP&#x60; payout:  | Field | Data Type | description | | --- | --- | --- | | lastName | string | The last name of the beneficiary. it is &#x60;required&#x60; | | firstName | string | The first name of the beneficiary | | accountHolderName | string | This is the name on the bank account of the beneficiary. &#x60;required&#x60; | | accountNumber | string | This should be the beneficiary&#39;s account number&#x60;required&#x60; | | type | string | the value can either be **individual** or **corporate** &#x60;required&#x60; | | country | string | &#x60;optional&#x60; | | email | string | &#x60;optional&#x60; | | mobile | string | &#x60;optional&#x60; | | bankSwiftCode | string | &#x60;optional&#x60; | | sortCode | string | &#x60;required&#x60; | | birthDate | string | &#x60;optional&#x60; | | birthPlace | string | &#x60;optional&#x60; | | address | object | This contains all the optional address information. They are:    \\+ country: country of origin &#x60;optional&#x60;  \\+ zip &#x60;optional&#x60;  \\+ street &#x60;optional&#x60;  \\+ state &#x60;optional&#x60;  \\+ city &#x60;optional&#x60; | | document | object | This contains the optional information in your means of identification. They are:    \\+ type: type of ID document e.g International Passport &#x60;optional&#x60;  \\+ number &#x60;optional&#x60;  \\+ issuedCountryCode e.g NG &#x60;optional&#x60;  \\+ issuedBy &#x60;optional&#x60;  \\+ issuedDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60;  \\+ expirationDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60; |  Description of &#x60;CORPORATE&#x60; Beneficiary information for &#x60;USD&#x60; payout:  | Field | Data Type | description | | --- | --- | --- | | accountHolderName | string | This is the name on the bank account of the beneficiary. &#x60;required&#x60; | | accountNumber | string | This should be the beneficiary&#39;s account number&#x60;required&#x60; | | type | string | the value can either be **individual** or **corporate** &#x60;required&#x60; | | country | string | &#x60;optional&#x60; | | email | string | &#x60;optional&#x60; | | mobile | string | &#x60;optional&#x60; | | bankSwiftCode | string | &#x60;required&#x60; | | sortCode | string | &#x60;required&#x60; | | registrationNumber | string | &#x60;optional&#x60; | | address | object | This contains all the optional address information. They are:    \\+ country: country of origin &#x60;optional&#x60;  \\+ zip &#x60;optional&#x60;  \\+ street &#x60;optional&#x60;  \\+ state &#x60;optional&#x60;  \\+ city &#x60;optional&#x60; | | document | object | This contains the optional information in your means of identification. They are:    \\+ type: type of ID document e.g International Passport &#x60;optional&#x60;  \\+ number &#x60;optional&#x60;  \\+ issuedCountryCode e.g NG &#x60;optional&#x60;  \\+ issuedBy &#x60;optional&#x60;  \\+ issuedDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60;  \\+ expirationDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60; |  Description of &#x60;INDIVIDUAL&#x60; Beneficiary information for &#x60;USD&#x60; payout:  | Field | Data Type | description | | --- | --- | --- | | lastName | string | The last name of the beneficiary. it is &#x60;required&#x60; | | firstName | string | The first name of the beneficiary | | accountHolderName | string | This is the name on the bank account of the beneficiary. &#x60;required&#x60; | | accountNumber | string | This should be the beneficiary&#39;s account number&#x60;required&#x60; | | type | string | the value can either be **individual** or **corporate** &#x60;required&#x60; | | country | string | &#x60;optional&#x60; | | email | string | &#x60;optional&#x60; | | mobile | string | &#x60;optional&#x60; | | bankSwiftCode | string | &#x60;required&#x60; | | sortCode | string | &#x60;required&#x60; | | birthDate | string | &#x60;optional&#x60; | | birthPlace | string | &#x60;optional&#x60; | | address | object | This contains all the optional address information. They are:    \\+ country: country of origin &#x60;optional&#x60;  \\+ zip &#x60;optional&#x60;  \\+ street &#x60;optional&#x60;  \\+ state &#x60;optional&#x60;  \\+ city &#x60;optional&#x60; | | document | object | This contains the optional information in your means of identification. They are:    \\+ type: type of ID document e.g International Passport &#x60;optional&#x60;  \\+ number &#x60;optional&#x60;  \\+ issuedCountryCode e.g NG &#x60;optional&#x60;  \\+ issuedBy &#x60;optional&#x60;  \\+ issuedDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60;  \\+ expirationDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60; |
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call makeAPayoutAsync(final ApiCallback<Void> callback) throws ApiException {

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

    Call call = makeAPayoutCall(progressListener, progressRequestListener);
    apiClient.executeAsync(call, callback);
    return call;
  }
  /* Build call for makeAnInternalPayout */
  private Call makeAnInternalPayoutCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    

    // create path and map variables
    String localVarPath = "/disbursements/payouts/wallets".replaceAll("\\{format\\}","json");

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
   * Make  An Internal  Payout
   * This endpoint is used for making a payment out to a customer/user/subaccount on our platform  REQUEST BODY  * * *  | Field | Data Type | description | | --- | --- | --- | | amount | string | The amount to be paid out&#x60;required&#x60; | | business | string | This could be the ID of the business or the ID of a sub-account of the business &#x60;required&#x60; | | customerReference | string | This is the unique reference generated for the transaction on your platform. &#x60;required&#x60; | | description | string | &#x60;required&#x60; | | beneficiaryWalletNumber | string | This is the unique wallet of the beneficiary you want to pay to &#x60;required&#x60; |
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public void makeAnInternalPayout() throws ApiException {
    makeAnInternalPayoutWithHttpInfo();
  }

  /**
   * Make  An Internal  Payout
   * This endpoint is used for making a payment out to a customer/user/subaccount on our platform  REQUEST BODY  * * *  | Field | Data Type | description | | --- | --- | --- | | amount | string | The amount to be paid out&#x60;required&#x60; | | business | string | This could be the ID of the business or the ID of a sub-account of the business &#x60;required&#x60; | | customerReference | string | This is the unique reference generated for the transaction on your platform. &#x60;required&#x60; | | description | string | &#x60;required&#x60; | | beneficiaryWalletNumber | string | This is the unique wallet of the beneficiary you want to pay to &#x60;required&#x60; |
   * @return ApiResponse<Void>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<Void> makeAnInternalPayoutWithHttpInfo() throws ApiException {
    Call call = makeAnInternalPayoutCall(null, null);
    return apiClient.execute(call);
  }

  /**
   * Make  An Internal  Payout (asynchronously)
   * This endpoint is used for making a payment out to a customer/user/subaccount on our platform  REQUEST BODY  * * *  | Field | Data Type | description | | --- | --- | --- | | amount | string | The amount to be paid out&#x60;required&#x60; | | business | string | This could be the ID of the business or the ID of a sub-account of the business &#x60;required&#x60; | | customerReference | string | This is the unique reference generated for the transaction on your platform. &#x60;required&#x60; | | description | string | &#x60;required&#x60; | | beneficiaryWalletNumber | string | This is the unique wallet of the beneficiary you want to pay to &#x60;required&#x60; |
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call makeAnInternalPayoutAsync(final ApiCallback<Void> callback) throws ApiException {

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

    Call call = makeAnInternalPayoutCall(progressListener, progressRequestListener);
    apiClient.executeAsync(call, callback);
    return call;
  }
}
