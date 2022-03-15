package DEFAULT.api;

import DEFAULT.ApiException;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CoreApi
 */
public class CoreApiTest {

    private final CoreApi api = new CoreApi();

    
    /**
     * Get Bank code
     *
     * This endpoint provides a list of the banks and mobile money wallet providers with information like name, code and the list of branches and branch codes per bank based on a specified currency.  The **code** field in the below sample refers to the bank code for your bank account or the code of your mobile money provider.   &#x60;&#x60;&#x60;json {  {    \&quot;id\&quot;: 147,    \&quot;code\&quot;: \&quot;GH010100\&quot;,    \&quot;name\&quot;: \&quot;BANK OF GHANA\&quot;,    \&quot;isMobileVerified\&quot;: null,    \&quot;branches\&quot;: [       {         \&quot;id\&quot;: 1,         \&quot;branchCode\&quot;: \&quot;GH010101\&quot;,         \&quot;branchName\&quot;: \&quot;BANK OF GHANA-ACCRA\&quot;,         \&quot;swiftCode\&quot;: \&quot;BAGHGHAC\&quot;,         \&quot;bic\&quot;: \&quot;BAGHGHAC\&quot;        }]  },  {   \&quot;id\&quot;: 79,   \&quot;code\&quot;: \&quot;AIRTEL\&quot;,   \&quot;name\&quot;: \&quot;Airtel\&quot;,   \&quot;isMobileVerified\&quot;: true,   \&quot;branches\&quot;: null  } } &#x60;&#x60;&#x60;    
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBankcodeTest() throws ApiException {
        String currency = null;
        // api.getBankcode(currency);

        // TODO: test validations
    }
    
    /**
     * Get a disbursement transaction by customer reference
     *
     * This endpoint provides the details of a disbursement transaction through the use of a customer reference.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getadisbursementtransactionbycustomerreferenceTest() throws ApiException {
        String business = null;
        String customerReference = null;
        // api.getadisbursementtransactionbycustomerreference(business, customerReference);

        // TODO: test validations
    }
    
    /**
     * Get a disbursement transaction by reference
     *
     * This endpoint provides the details of a disbursement transaction through the use of its reference.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getadisbursementtransactionbyreferenceTest() throws ApiException {
        String business = null;
        String reference = null;
        // api.getadisbursementtransactionbyreference(business, reference);

        // TODO: test validations
    }
    
    /**
     * Get a transaction for a business
     *
     * This endpoint provides the details of a transaction through the use of its ID.        
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getatransactionforabusinessTest() throws ApiException {
        String transactionID = null;
        // api.getatransactionforabusiness(transactionID);

        // TODO: test validations
    }
    
    /**
     * Get branch Code
     *
     * This endpoint provides a list of the branches for a bank and helps you get your branch code. To get a branch Code:  + Make a request to the endpoint that provides bank code with your desired currency  + Find your bank in the list returned. + Check the id field of your bank information for your branch + use the id field to make a request to this endpoint to get the list of branches for your bank + Check the **branchCode** field of your branch information for the value of your branch code
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getbranchCodeTest() throws ApiException {
        String bankId = null;
        // api.getbranchCode(bankId);

        // TODO: test validations
    }
    
    /**
     * Get the transactions for a Business
     *
     * This endpoint provides a list of all the transactions for a business.   REQUEST BODY   | Field | Data Type | Description | |------| ------------- | ----------- | | page | string | Specify exactly what page you want to retrieve optional| | perPage | string | Specify how many records you want to retrieve per page optional| | from | string| Specify start date with format \&quot;YYYY-mm-dd\&quot;  optional| | to | string| Specify end date with format \&quot;YYYY-mm-dd\&quot; optional|  
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getthetransactionsforaBusinessTest() throws ApiException {
        String businessID = null;
        // api.getthetransactionsforaBusiness(businessID);

        // TODO: test validations
    }
    
    /**
     * Get the transactions for the sub-accounts of a Business
     *
     * This provides a list of all the transactions for the sub-accounts of a Business.   REQUEST BODY   | Field | Data Type | Description | |------| ------------- | ----------- | | page | string | Specify exactly what page you want to retrieve optional| | perPage | string | Specify how many records you want to retrieve per page optional| | from | string| Specify start date with format \&quot;YYYY-mm-dd\&quot;  optional| | to | string| Specify end date with format \&quot;YYYY-mm-dd\&quot; optional|     
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getthetransactionsforthesubAccountsofabusinessTest() throws ApiException {
        String businessID = null;
        // api.getthetransactionsforthesubAccountsofabusiness(businessID);

        // TODO: test validations
    }
    
}
