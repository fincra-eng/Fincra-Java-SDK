package DEFAULT.api;

import DEFAULT.ApiException;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProfileApi
 */
public class ProfileApiTest {

    private final ProfileApi api = new ProfileApi();

    
    /**
     * Create Subaccount
     *
     * This endpoint helps you create a sub-account.  REQUEST BODY   | Field | Data Type | description | |------| ------------- | ----------- | | name | string | Customer&#39;s name| | email | string | Customer&#39;s email | | mobile | string | Customer&#39;s phone number | | country | string | Customer&#39;s country e.g NG  |  
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSubaccountTest() throws ApiException {
        String businessId = null;
        // api.createSubaccount(businessId);

        // TODO: test validations
    }
    
    /**
     * Create a Beneficiary
     *
     * This endpoint is used for creating a Beneficiary.       REQUEST BODY   | Field | Data Type | Description | |------| ------------- | ----------- | | firstName | string | required| | lastName | string | optional| | email | string |The email address of Beneficiary. required | | phoneNumber | string | optional  | | accountHolderName | string | required| | bank | object | see the information about this below. optional + name: bank name required  + code optional   + sortCode optional   + swiftCode optional  + branch  optional   + address: see the definition in address field below optional   | | type | string | The value for this field is either _corporate_ or _indivdual_required| | address | object | the physical address of the beneficiary and it comprises of the below: optional + country optional  + state optional   + zip required   + city required  + street  required  | | currency | string | The currency that Beneficiary would be paid in required| | paymentDestination | string | The value for this field is either _mobile_money_wallet_ or _bank_account_ required | | destinationAddress | string | see the definition belowrequired | | uniqueIdentifier | string | optional |   Value Description for the destinationAddress field   The table below show that a destination address should be when given a certain payment destination.  | paymentDestination | destinationAddress | |------| ------------- | | _mobile_money_wallet_ | phone number used for the wallet | | _bank_account_ | account number |
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createaBeneficiaryTest() throws ApiException {
        String businessID = null;
        // api.createaBeneficiary(businessID);

        // TODO: test validations
    }
    
    /**
     * Delete a Beneficiary
     *
     * This endpoint is used for deleting a beneficiary.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteaBeneficiaryTest() throws ApiException {
        String businessID = null;
        String beneficiaryID = null;
        // api.deleteaBeneficiary(businessID, beneficiaryID);

        // TODO: test validations
    }
    
    /**
     * Fetch Merchant Virtual Accounts
     *
     * This endpoint fetches all virtual accounts belonging to a merchant  REQUEST BODY  * * *  | Field | Data Type | Description | | --- | --- | --- | | page | string | Specify exactly what page you want to retrieve &#x60;required&#x60; | | perPage | string | Specify how many records you want to retrieve per page &#x60;required&#x60; | | filterBy | object | see note below &#x60;optional&#x60; |  The filterBy property is an object with the following attributes below that helps you filter accounts:  *   status - &#x60;pending&#x60;, &#x60;approved&#x60; or &#x60;declined&#x60; *   currency - EUR or GBP *   accountType - corporate or individual
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchMerchantVirtualAccountsTest() throws ApiException {
        // api.fetchMerchantVirtualAccounts();

        // TODO: test validations
    }
    
    /**
     * Get  All Sub-accounts
     *
     * This endpoint is used to retrieve all subaccounts for a business.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllSubAccountsTest() throws ApiException {
        String businessId = null;
        // api.getAllSubAccounts(businessId);

        // TODO: test validations
    }
    
    /**
     * Get  One Subaccount
     *
     * This endpoint is used in retrieving one subaccount.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOneSubaccountTest() throws ApiException {
        String businessId = null;
        String subAccountId = null;
        // api.getOneSubaccount(businessId, subAccountId);

        // TODO: test validations
    }
    
    /**
     * Get One Virtual Account
     *
     * This endpoint is used for retreiving a virtual account attached to a merchant
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOneVirtualAccountTest() throws ApiException {
        String virtualAccountId = null;
        // api.getOneVirtualAccount(virtualAccountId);

        // TODO: test validations
    }
    
    /**
     * Get   Subaccount  Virtual Accounts
     *
     * This endpoint is used for retrieving the virtual accounts of your Subaccounts.  REQUEST BODY  * * *  | Field | Data Type | Description | | --- | --- | --- | | page | string | Specify exactly what page you want to retrieve &#x60;required&#x60; | | perPage | string | Specify how many records you want to retrieve per page &#x60;required&#x60; | | filterBy | object | see note below &#x60;optional&#x60; |  The filterBy property is an object with the following attributes below that helps you filter accounts:  *   status - &#x60;pending&#x60;, &#x60;approved&#x60; or &#x60;declined&#x60; *   currency - EUR or GBP *   accountType - corporate or individual
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSubaccountVirtualAccountsTest() throws ApiException {
        String businessId = null;
        // api.getSubaccountVirtualAccounts(businessId);

        // TODO: test validations
    }
    
    /**
     * Get Virtual Account Requests
     *
     * This endpoint is used for getting all virtual account requests tied to a merchant
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVirtualAccountRequestsTest() throws ApiException {
        // api.getVirtualAccountRequests();

        // TODO: test validations
    }
    
    /**
     * Get a Beneficiary
     *
     * This endpoint is used for retrieving a single beneficiary attached to a business. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getaBeneficiaryTest() throws ApiException {
        String businessID = null;
        String beneficiaryID = null;
        // api.getaBeneficiary(businessID, beneficiaryID);

        // TODO: test validations
    }
    
    /**
     * Get business Information
     *
     * This endpoint is used for getting the information on the registered Merchant&#39;s business.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getbusinessInformationTest() throws ApiException {
        // api.getbusinessInformation();

        // TODO: test validations
    }
    
    /**
     * Get the Beneficiaries for a business
     *
     * This endpoint provides the ability to retrieve a list of beneficiaries attached to a business.    REQUEST BODY   | Field | Data Type | Description | |------| ------------- | ----------- | | page | string | Specify exactly what page you want to retrieve optional| | perPage | string | Specify how many records you want to retrieve per page optional|
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void gettheBeneficiariesforabusinessTest() throws ApiException {
        String businessID = null;
        // api.gettheBeneficiariesforabusiness(businessID);

        // TODO: test validations
    }
    
    /**
     * Request A Virtual Account
     *
     * This endpoint is used for requesting a single virtual account or multiple virtual accounts for the same currency.  REQUEST BODY  * * *  | Field | Data Type | Description | | --- | --- | --- | | currency | string | e.g GBP, EUR &#x60;required&#x60; for all currencies | | reason | number | This is &#x60;optional&#x60; for NGN | | monthlyVolume | string | This is &#x60;optional&#x60; for NGN | | entityName | string | This is &#x60;optional&#x60; for NGN | | KYCInformation | object | This is &#x60;optional&#x60; for NGN |  **Description of KYC Information Object**  | Field | Data type | Description | | --- | --- | --- | | businessCategory | string | &#x60;required&#x60; | | additionalInfo | string | &#x60;required&#x60; |
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void requestAVirtualAccountTest() throws ApiException {
        // api.requestAVirtualAccount();

        // TODO: test validations
    }
    
    /**
     * Request An EUR virtual Account  For A Subaccount
     *
     * This endpoint is used for creating a virtual account for your customer/customers  **Note**   The first name and last name or business name of a virtual account should always match with the name of the Receiver specified when making payments to the Virtual account. Else such payments would be blocked. Therefore, kindly pass in the right details when requesting a virtual account.  REQUEST BODY  * * *  | Field | Data type | Description | | --- | --- | --- | | currency | string | e.g EUR,GBP &#x60;required&#x60; | | accountType | string | The account type your customer wants. It should be either **individual** or **corporate** &#x60;required&#x60; | | KYCInformation | object | Verification of your customer Identity. See the tables below for KYC information for **Individual** and **Corporate** &#x60;required&#x60; | | meansOfId | file | Your means of identification from which should be a valid government ID e.g voters card, driving license .&#x60;Optional&#x60; for corporate virtual account . This should be a File Upload and not sent in Base64 format | | utilityBill | file | Electricity bills, water bills. &#x60;Optional&#x60; for corporate virtual account. This should be a File Upload and not sent in Base64 format |  **Description of KYC Information Object for Individual**  | Field | Data type | Description | | --- | --- | --- | | lastName | string | the last name of the individual &#x60;required&#x60; | | firstName | string | the first name of the individual &#x60;required&#x60; | | email | string | the email of the individual | | birthDate | dateFormat | YYYY-MM-DD &#x60;required&#x60; | | address | object | This contains all the required address information. They are:    \\+ country: country of origin &#x60;required&#x60;  \\+ zip &#x60;required&#x60;  \\+ street &#x60;required&#x60;  \\+ state &#x60;required&#x60;  \\+ city &#x60;required&#x60; | | document | object | This contains the required information in your means of identification. They are:    \\+ type: type of ID document e.g International Passport &#x60;required&#x60;  \\+ number &#x60;required&#x60;  \\+ issuedCountryCode e.g NG &#x60;required&#x60;  \\+ issuedBy &#x60;required&#x60;  \\+ issuedDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;required&#x60;  \\+ expirationDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60; | | occupation | string | &#x60;required&#x60; |  **Description of KYC Information Object for Corporate**  | Field | Data type | Description | | --- | --- | --- | | businessName | string | &#x60;required&#x60; | | businessRegistrationNumber | string | &#x60;required&#x60; | | incorporationDate | string | &#x60;required&#x60; | | expectedInboundMonthlyTurnover | string | &#x60;required&#x60; | | website | string | &#x60;optional&#x60; | | email | string | &#x60;optional&#x60; | | address | string | This field is required and has the following fields:    \\+ country: country of origin &#x60;required&#x60;  \\+ zip &#x60;required&#x60;  \\+ street &#x60;required&#x60;  \\+ state &#x60;required&#x60;  \\+ city &#x60;required&#x60; | | document | object | This field is required and has the following fields:    \\+ type: type of ID document e.g International Passport &#x60;required&#x60;  \\+ number &#x60;required&#x60;  \\+ issuedCountryCode e.g NG &#x60;required&#x60;  \\+ issuedBy &#x60;required&#x60;  \\+ issuedDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;required&#x60;  \\+ expirationDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60; | | ultimateBeneficialOwners | array of objects | This field is required and each object in it should contain the following fields:    \\+ lastName &#x60;required&#x60;  \\+ firstName &#x60;required&#x60;  \\+ ownershipPercentage &#x60;required&#x60;  \\+ politicallyExposedPerson &#x60;required&#x60; | | businessActivityDescription | string | &#x60;required&#x60; | | businessCategory | string | This is required for USD,GBP and EUR virtual accounts requests but &#x60;optional&#x60; for NGN e.g Government agencies, Joint Venture, Political parties | | additionalInfo | string | This is required for USD,GBP and EUR virtual account requests | | attachments | file | &#x60;optional&#x60; |
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void requestAnEURvirtualAccountForASubaccountTest() throws ApiException {
        String businessId = null;
        String subAccountId = null;
        // api.requestAnEURvirtualAccountForASubaccount(businessId, subAccountId);

        // TODO: test validations
    }
    
    /**
     * Update A Subaccount
     *
     * This endpoint is used to update a subaccount.  REQUEST BODY   | Field | Data Type | description | |------| ------------- | ----------- | | name | string | Customer&#39;s name required| | email | string | Customer&#39;s email  required| | mobile | string | Customer&#39;s phone number  required|
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateASubaccountTest() throws ApiException {
        String businessId = null;
        String subAccountId = null;
        // api.updateASubaccount(businessId, subAccountId);

        // TODO: test validations
    }
    
    /**
     * Update a Beneficiary
     *
     * This endpoint is used for updating the information for a beneficiary.     REQUEST BODY   | Field | Data Type | Description | |------| ------------- | ----------- | | firstName | string | required| | lastName | string | optional| | email | string |The email address of Beneficiary. required | | phoneNumber | string | optional  | | accountHolderName | string | optional| | bank | object | see the information about this below. optional + name: bank name required  + code optional   + sortCode optional   + swiftCode optional  + branch  optional   + address: see the definition in address field below optional   | | type | string | The value for this field is either _corporate_ or _indivdual_required| | address | object | the physical address of the beneficiary and it comprises of the below: optional + country optional  + state optional   + zip required   + city required  + street  required  | | currency | string | The currency that Beneficiary would be paid in required| | paymentDestination | string | The value for this field is either _mobile_money_wallet_ or _bank_account_ required | | destinationAddress | string | see the definition belowrequired | | uniqueIdentifier | string | optional |    Value Description for the destinationAddress field  The table below show that a destination address should be when given a certain payment destination.  | paymentDestination | destinationAddress | |------| ------------- | | _mobile_money_wallet_ | phone number used for the wallet | | _bank_account_ | account number |
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateaBeneficiaryTest() throws ApiException {
        String businessID = null;
        String beneficiaryID = null;
        // api.updateaBeneficiary(businessID, beneficiaryID);

        // TODO: test validations
    }
    
}
