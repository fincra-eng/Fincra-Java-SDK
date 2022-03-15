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

public class QuotesApi {
  private ApiClient apiClient;

  public QuotesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public QuotesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /* Build call for getaquote */
  private Call getaquoteCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    

    // create path and map variables
    String localVarPath = "/quotes/generate".replaceAll("\\{format\\}","json");

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
   * Get a quote
   * This endpoint is used for generating a quote.  REQUEST BODY   | Field | Data Type | Description | |------| ------------- | ----------- | | sourceCurrency | string | e.g _USD_ required| | destinationCurrency | string |  e.g _NGN_ required| | amount | string | required| | action | string | the values can be either \&quot;_send_\&quot; for conversions and disbursement or \&quot;_receive_\&quot; for collectionsrequired| | transactionType | string | the values here can be either _disbursement_ or _collection_ or _conversion_required | | business | string | This could be the ID of the business or the ID of a sub-account of the business required| | feeBearer | string | required  | | paymentDestination | string | See the note below | | paymentMethod | string | see the note below | | destinationCountry | string | This is the location where the money would be received required | | paymentScheme | string | This is the valid payment scheme for the destination currency you want to generate a quote for.Payment scheme is required for USD,EUR and GBP |  NOTE  If destination currency is either USD,EUR,GBP a payment scheme is required .  The values of the _paymentDestination_ and _paymentMethod_ are either required or optional depending on the value of the _transactiontype_ field.  When the value of the the _transactiontype_ field is _disbursement_, We will then have the below fields as: *   paymentDestination required *   paymentMethod optional   When the value of the the _transactiontype_ field is _conversion_, We will then have the below fields as: *   paymentDestination optional *   paymentMethod optional  When the value of the the _transactiontype_ field is _collection_, We will then have the below fields as: *   paymentDestination required *   paymentMethod required
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public void getaquote() throws ApiException {
    getaquoteWithHttpInfo();
  }

  /**
   * Get a quote
   * This endpoint is used for generating a quote.  REQUEST BODY   | Field | Data Type | Description | |------| ------------- | ----------- | | sourceCurrency | string | e.g _USD_ required| | destinationCurrency | string |  e.g _NGN_ required| | amount | string | required| | action | string | the values can be either \&quot;_send_\&quot; for conversions and disbursement or \&quot;_receive_\&quot; for collectionsrequired| | transactionType | string | the values here can be either _disbursement_ or _collection_ or _conversion_required | | business | string | This could be the ID of the business or the ID of a sub-account of the business required| | feeBearer | string | required  | | paymentDestination | string | See the note below | | paymentMethod | string | see the note below | | destinationCountry | string | This is the location where the money would be received required | | paymentScheme | string | This is the valid payment scheme for the destination currency you want to generate a quote for.Payment scheme is required for USD,EUR and GBP |  NOTE  If destination currency is either USD,EUR,GBP a payment scheme is required .  The values of the _paymentDestination_ and _paymentMethod_ are either required or optional depending on the value of the _transactiontype_ field.  When the value of the the _transactiontype_ field is _disbursement_, We will then have the below fields as: *   paymentDestination required *   paymentMethod optional   When the value of the the _transactiontype_ field is _conversion_, We will then have the below fields as: *   paymentDestination optional *   paymentMethod optional  When the value of the the _transactiontype_ field is _collection_, We will then have the below fields as: *   paymentDestination required *   paymentMethod required
   * @return ApiResponse<Void>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<Void> getaquoteWithHttpInfo() throws ApiException {
    Call call = getaquoteCall(null, null);
    return apiClient.execute(call);
  }

  /**
   * Get a quote (asynchronously)
   * This endpoint is used for generating a quote.  REQUEST BODY   | Field | Data Type | Description | |------| ------------- | ----------- | | sourceCurrency | string | e.g _USD_ required| | destinationCurrency | string |  e.g _NGN_ required| | amount | string | required| | action | string | the values can be either \&quot;_send_\&quot; for conversions and disbursement or \&quot;_receive_\&quot; for collectionsrequired| | transactionType | string | the values here can be either _disbursement_ or _collection_ or _conversion_required | | business | string | This could be the ID of the business or the ID of a sub-account of the business required| | feeBearer | string | required  | | paymentDestination | string | See the note below | | paymentMethod | string | see the note below | | destinationCountry | string | This is the location where the money would be received required | | paymentScheme | string | This is the valid payment scheme for the destination currency you want to generate a quote for.Payment scheme is required for USD,EUR and GBP |  NOTE  If destination currency is either USD,EUR,GBP a payment scheme is required .  The values of the _paymentDestination_ and _paymentMethod_ are either required or optional depending on the value of the _transactiontype_ field.  When the value of the the _transactiontype_ field is _disbursement_, We will then have the below fields as: *   paymentDestination required *   paymentMethod optional   When the value of the the _transactiontype_ field is _conversion_, We will then have the below fields as: *   paymentDestination optional *   paymentMethod optional  When the value of the the _transactiontype_ field is _collection_, We will then have the below fields as: *   paymentDestination required *   paymentMethod required
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getaquoteAsync(final ApiCallback<Void> callback) throws ApiException {

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

    Call call = getaquoteCall(progressListener, progressRequestListener);
    apiClient.executeAsync(call, callback);
    return call;
  }
}
