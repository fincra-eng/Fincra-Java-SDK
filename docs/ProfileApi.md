# ProfileApi

All URIs are relative to *http://DEFAULT*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSubaccount**](ProfileApi.md#createSubaccount) | **POST** /profile/business/{businessId}/sub-accounts | Create Subaccount
[**createaBeneficiary**](ProfileApi.md#createaBeneficiary) | **POST** /profile/beneficiaries/business/{businessID} | Create a Beneficiary
[**deleteaBeneficiary**](ProfileApi.md#deleteaBeneficiary) | **DELETE** /profile/beneficiaries/business/{businessID}/{beneficiaryID} | Delete a Beneficiary
[**fetchMerchantVirtualAccounts**](ProfileApi.md#fetchMerchantVirtualAccounts) | **GET** /profile/virtual-accounts | Fetch Merchant Virtual Accounts
[**getAllSubAccounts**](ProfileApi.md#getAllSubAccounts) | **GET** /profile/business/{businessId}/sub-accounts | Get  All Sub-accounts
[**getOneSubaccount**](ProfileApi.md#getOneSubaccount) | **GET** /profile/business/{businessId}/sub-accounts/{subAccountId} | Get  One Subaccount
[**getOneVirtualAccount**](ProfileApi.md#getOneVirtualAccount) | **GET** /profile/virtual-accounts/{virtualAccountId} | Get One Virtual Account
[**getSubaccountVirtualAccounts**](ProfileApi.md#getSubaccountVirtualAccounts) | **GET** /profile/virtual-accounts/business/{businessId}/sub-accounts | Get   Subaccount  Virtual Accounts
[**getVirtualAccountRequests**](ProfileApi.md#getVirtualAccountRequests) | **GET** /profile/virtual-accounts/requests | Get Virtual Account Requests
[**getaBeneficiary**](ProfileApi.md#getaBeneficiary) | **GET** /profile/beneficiaries/business/{businessID}/{beneficiaryID} | Get a Beneficiary
[**getbusinessInformation**](ProfileApi.md#getbusinessInformation) | **GET** /profile/business/me | Get business Information
[**gettheBeneficiariesforabusiness**](ProfileApi.md#gettheBeneficiariesforabusiness) | **GET** /profile/beneficiaries/business/{businessID} | Get the Beneficiaries for a business
[**requestAVirtualAccount**](ProfileApi.md#requestAVirtualAccount) | **POST** /profile/virtual-accounts/requests | Request A Virtual Account
[**requestAnEURvirtualAccountForASubaccount**](ProfileApi.md#requestAnEURvirtualAccountForASubaccount) | **POST** /profile/virtual-accounts/business/{businessId}/sub-accounts/{subAccountId}/requests | Request An EUR virtual Account  For A Subaccount
[**updateASubaccount**](ProfileApi.md#updateASubaccount) | **PATCH** /profile/business/{businessId}/sub-accounts/{subAccountId} | Update A Subaccount
[**updateaBeneficiary**](ProfileApi.md#updateaBeneficiary) | **PATCH** /profile/beneficiaries/business/{businessID}/{beneficiaryID} | Update a Beneficiary


<a name="createSubaccount"></a>
# **createSubaccount**
> createSubaccount(businessId)

Create Subaccount

This endpoint helps you create a sub-account.  REQUEST BODY   | Field | Data Type | description | |------| ------------- | ----------- | | name | string | Customer&#39;s name| | email | string | Customer&#39;s email | | mobile | string | Customer&#39;s phone number | | country | string | Customer&#39;s country e.g NG  |  

### Example
```java
// Import classes:
//import DEFAULT.ApiException;
//import DEFAULT.api.ProfileApi;


ProfileApi apiInstance = new ProfileApi();
String businessId = ""; // String | The ID of the business
try {
    apiInstance.createSubaccount(businessId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileApi#createSubaccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| The ID of the business |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="createaBeneficiary"></a>
# **createaBeneficiary**
> createaBeneficiary(businessID)

Create a Beneficiary

This endpoint is used for creating a Beneficiary.       REQUEST BODY   | Field | Data Type | Description | |------| ------------- | ----------- | | firstName | string | required| | lastName | string | optional| | email | string |The email address of Beneficiary. required | | phoneNumber | string | optional  | | accountHolderName | string | required| | bank | object | see the information about this below. optional + name: bank name required  + code optional   + sortCode optional   + swiftCode optional  + branch  optional   + address: see the definition in address field below optional   | | type | string | The value for this field is either _corporate_ or _indivdual_required| | address | object | the physical address of the beneficiary and it comprises of the below: optional + country optional  + state optional   + zip required   + city required  + street  required  | | currency | string | The currency that Beneficiary would be paid in required| | paymentDestination | string | The value for this field is either _mobile_money_wallet_ or _bank_account_ required | | destinationAddress | string | see the definition belowrequired | | uniqueIdentifier | string | optional |   Value Description for the destinationAddress field   The table below show that a destination address should be when given a certain payment destination.  | paymentDestination | destinationAddress | |------| ------------- | | _mobile_money_wallet_ | phone number used for the wallet | | _bank_account_ | account number |

### Example
```java
// Import classes:
//import DEFAULT.ApiException;
//import DEFAULT.api.ProfileApi;


ProfileApi apiInstance = new ProfileApi();
String businessID = ""; // String | businessID
try {
    apiInstance.createaBeneficiary(businessID);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileApi#createaBeneficiary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessID** | **String**| businessID |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteaBeneficiary"></a>
# **deleteaBeneficiary**
> deleteaBeneficiary(businessID, beneficiaryID)

Delete a Beneficiary

This endpoint is used for deleting a beneficiary.

### Example
```java
// Import classes:
//import DEFAULT.ApiException;
//import DEFAULT.api.ProfileApi;


ProfileApi apiInstance = new ProfileApi();
String businessID = ""; // String | This could be the ID of the business or the ID of a sub-account of the business
String beneficiaryID = ""; // String | This is the beneficiary ID of the the benficiary
try {
    apiInstance.deleteaBeneficiary(businessID, beneficiaryID);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileApi#deleteaBeneficiary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessID** | **String**| This could be the ID of the business or the ID of a sub-account of the business |
 **beneficiaryID** | **String**| This is the beneficiary ID of the the benficiary |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="fetchMerchantVirtualAccounts"></a>
# **fetchMerchantVirtualAccounts**
> fetchMerchantVirtualAccounts()

Fetch Merchant Virtual Accounts

This endpoint fetches all virtual accounts belonging to a merchant  REQUEST BODY  * * *  | Field | Data Type | Description | | --- | --- | --- | | page | string | Specify exactly what page you want to retrieve &#x60;required&#x60; | | perPage | string | Specify how many records you want to retrieve per page &#x60;required&#x60; | | filterBy | object | see note below &#x60;optional&#x60; |  The filterBy property is an object with the following attributes below that helps you filter accounts:  *   status - &#x60;pending&#x60;, &#x60;approved&#x60; or &#x60;declined&#x60; *   currency - EUR or GBP *   accountType - corporate or individual

### Example
```java
// Import classes:
//import DEFAULT.ApiException;
//import DEFAULT.api.ProfileApi;


ProfileApi apiInstance = new ProfileApi();
try {
    apiInstance.fetchMerchantVirtualAccounts();
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileApi#fetchMerchantVirtualAccounts");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAllSubAccounts"></a>
# **getAllSubAccounts**
> getAllSubAccounts(businessId)

Get  All Sub-accounts

This endpoint is used to retrieve all subaccounts for a business.

### Example
```java
// Import classes:
//import DEFAULT.ApiException;
//import DEFAULT.api.ProfileApi;


ProfileApi apiInstance = new ProfileApi();
String businessId = ""; // String | The ID of the business
try {
    apiInstance.getAllSubAccounts(businessId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileApi#getAllSubAccounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| The ID of the business |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getOneSubaccount"></a>
# **getOneSubaccount**
> getOneSubaccount(businessId, subAccountId)

Get  One Subaccount

This endpoint is used in retrieving one subaccount.

### Example
```java
// Import classes:
//import DEFAULT.ApiException;
//import DEFAULT.api.ProfileApi;


ProfileApi apiInstance = new ProfileApi();
String businessId = ""; // String | The ID of the business
String subAccountId = ""; // String | The ID of the subaccount
try {
    apiInstance.getOneSubaccount(businessId, subAccountId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileApi#getOneSubaccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| The ID of the business |
 **subAccountId** | **String**| The ID of the subaccount |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getOneVirtualAccount"></a>
# **getOneVirtualAccount**
> getOneVirtualAccount(virtualAccountId)

Get One Virtual Account

This endpoint is used for retreiving a virtual account attached to a merchant

### Example
```java
// Import classes:
//import DEFAULT.ApiException;
//import DEFAULT.api.ProfileApi;


ProfileApi apiInstance = new ProfileApi();
String virtualAccountId = ""; // String | The Id of the virtual account you want to retrieve
try {
    apiInstance.getOneVirtualAccount(virtualAccountId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileApi#getOneVirtualAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **virtualAccountId** | **String**| The Id of the virtual account you want to retrieve |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getSubaccountVirtualAccounts"></a>
# **getSubaccountVirtualAccounts**
> getSubaccountVirtualAccounts(businessId)

Get   Subaccount  Virtual Accounts

This endpoint is used for retrieving the virtual accounts of your Subaccounts.  REQUEST BODY  * * *  | Field | Data Type | Description | | --- | --- | --- | | page | string | Specify exactly what page you want to retrieve &#x60;required&#x60; | | perPage | string | Specify how many records you want to retrieve per page &#x60;required&#x60; | | filterBy | object | see note below &#x60;optional&#x60; |  The filterBy property is an object with the following attributes below that helps you filter accounts:  *   status - &#x60;pending&#x60;, &#x60;approved&#x60; or &#x60;declined&#x60; *   currency - EUR or GBP *   accountType - corporate or individual

### Example
```java
// Import classes:
//import DEFAULT.ApiException;
//import DEFAULT.api.ProfileApi;


ProfileApi apiInstance = new ProfileApi();
String businessId = ""; // String | The ID of the business
try {
    apiInstance.getSubaccountVirtualAccounts(businessId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileApi#getSubaccountVirtualAccounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| The ID of the business |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getVirtualAccountRequests"></a>
# **getVirtualAccountRequests**
> getVirtualAccountRequests()

Get Virtual Account Requests

This endpoint is used for getting all virtual account requests tied to a merchant

### Example
```java
// Import classes:
//import DEFAULT.ApiException;
//import DEFAULT.api.ProfileApi;


ProfileApi apiInstance = new ProfileApi();
try {
    apiInstance.getVirtualAccountRequests();
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileApi#getVirtualAccountRequests");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getaBeneficiary"></a>
# **getaBeneficiary**
> getaBeneficiary(businessID, beneficiaryID)

Get a Beneficiary

This endpoint is used for retrieving a single beneficiary attached to a business. 

### Example
```java
// Import classes:
//import DEFAULT.ApiException;
//import DEFAULT.api.ProfileApi;


ProfileApi apiInstance = new ProfileApi();
String businessID = ""; // String | This could be the ID of the business or the ID of a sub-account of the business
String beneficiaryID = ""; // String | The reference or ID of the beneficiary
try {
    apiInstance.getaBeneficiary(businessID, beneficiaryID);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileApi#getaBeneficiary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessID** | **String**| This could be the ID of the business or the ID of a sub-account of the business |
 **beneficiaryID** | **String**| The reference or ID of the beneficiary |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getbusinessInformation"></a>
# **getbusinessInformation**
> getbusinessInformation()

Get business Information

This endpoint is used for getting the information on the registered Merchant&#39;s business.

### Example
```java
// Import classes:
//import DEFAULT.ApiException;
//import DEFAULT.api.ProfileApi;


ProfileApi apiInstance = new ProfileApi();
try {
    apiInstance.getbusinessInformation();
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileApi#getbusinessInformation");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="gettheBeneficiariesforabusiness"></a>
# **gettheBeneficiariesforabusiness**
> gettheBeneficiariesforabusiness(businessID)

Get the Beneficiaries for a business

This endpoint provides the ability to retrieve a list of beneficiaries attached to a business.    REQUEST BODY   | Field | Data Type | Description | |------| ------------- | ----------- | | page | string | Specify exactly what page you want to retrieve optional| | perPage | string | Specify how many records you want to retrieve per page optional|

### Example
```java
// Import classes:
//import DEFAULT.ApiException;
//import DEFAULT.api.ProfileApi;


ProfileApi apiInstance = new ProfileApi();
String businessID = ""; // String | This could be the ID of the business or the ID of a sub-account of the business
try {
    apiInstance.gettheBeneficiariesforabusiness(businessID);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileApi#gettheBeneficiariesforabusiness");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessID** | **String**| This could be the ID of the business or the ID of a sub-account of the business |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="requestAVirtualAccount"></a>
# **requestAVirtualAccount**
> requestAVirtualAccount()

Request A Virtual Account

This endpoint is used for requesting a single virtual account or multiple virtual accounts for the same currency.  REQUEST BODY  * * *  | Field | Data Type | Description | | --- | --- | --- | | currency | string | e.g GBP, EUR &#x60;required&#x60; for all currencies | | reason | number | This is &#x60;optional&#x60; for NGN | | monthlyVolume | string | This is &#x60;optional&#x60; for NGN | | entityName | string | This is &#x60;optional&#x60; for NGN | | KYCInformation | object | This is &#x60;optional&#x60; for NGN |  **Description of KYC Information Object**  | Field | Data type | Description | | --- | --- | --- | | businessCategory | string | &#x60;required&#x60; | | additionalInfo | string | &#x60;required&#x60; |

### Example
```java
// Import classes:
//import DEFAULT.ApiException;
//import DEFAULT.api.ProfileApi;


ProfileApi apiInstance = new ProfileApi();
try {
    apiInstance.requestAVirtualAccount();
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileApi#requestAVirtualAccount");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="requestAnEURvirtualAccountForASubaccount"></a>
# **requestAnEURvirtualAccountForASubaccount**
> requestAnEURvirtualAccountForASubaccount(businessId, subAccountId)

Request An EUR virtual Account  For A Subaccount

This endpoint is used for creating a virtual account for your customer/customers  **Note**   The first name and last name or business name of a virtual account should always match with the name of the Receiver specified when making payments to the Virtual account. Else such payments would be blocked. Therefore, kindly pass in the right details when requesting a virtual account.  REQUEST BODY  * * *  | Field | Data type | Description | | --- | --- | --- | | currency | string | e.g EUR,GBP &#x60;required&#x60; | | accountType | string | The account type your customer wants. It should be either **individual** or **corporate** &#x60;required&#x60; | | KYCInformation | object | Verification of your customer Identity. See the tables below for KYC information for **Individual** and **Corporate** &#x60;required&#x60; | | meansOfId | file | Your means of identification from which should be a valid government ID e.g voters card, driving license .&#x60;Optional&#x60; for corporate virtual account . This should be a File Upload and not sent in Base64 format | | utilityBill | file | Electricity bills, water bills. &#x60;Optional&#x60; for corporate virtual account. This should be a File Upload and not sent in Base64 format |  **Description of KYC Information Object for Individual**  | Field | Data type | Description | | --- | --- | --- | | lastName | string | the last name of the individual &#x60;required&#x60; | | firstName | string | the first name of the individual &#x60;required&#x60; | | email | string | the email of the individual | | birthDate | dateFormat | YYYY-MM-DD &#x60;required&#x60; | | address | object | This contains all the required address information. They are:    \\+ country: country of origin &#x60;required&#x60;  \\+ zip &#x60;required&#x60;  \\+ street &#x60;required&#x60;  \\+ state &#x60;required&#x60;  \\+ city &#x60;required&#x60; | | document | object | This contains the required information in your means of identification. They are:    \\+ type: type of ID document e.g International Passport &#x60;required&#x60;  \\+ number &#x60;required&#x60;  \\+ issuedCountryCode e.g NG &#x60;required&#x60;  \\+ issuedBy &#x60;required&#x60;  \\+ issuedDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;required&#x60;  \\+ expirationDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60; | | occupation | string | &#x60;required&#x60; |  **Description of KYC Information Object for Corporate**  | Field | Data type | Description | | --- | --- | --- | | businessName | string | &#x60;required&#x60; | | businessRegistrationNumber | string | &#x60;required&#x60; | | incorporationDate | string | &#x60;required&#x60; | | expectedInboundMonthlyTurnover | string | &#x60;required&#x60; | | website | string | &#x60;optional&#x60; | | email | string | &#x60;optional&#x60; | | address | string | This field is required and has the following fields:    \\+ country: country of origin &#x60;required&#x60;  \\+ zip &#x60;required&#x60;  \\+ street &#x60;required&#x60;  \\+ state &#x60;required&#x60;  \\+ city &#x60;required&#x60; | | document | object | This field is required and has the following fields:    \\+ type: type of ID document e.g International Passport &#x60;required&#x60;  \\+ number &#x60;required&#x60;  \\+ issuedCountryCode e.g NG &#x60;required&#x60;  \\+ issuedBy &#x60;required&#x60;  \\+ issuedDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;required&#x60;  \\+ expirationDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60; | | ultimateBeneficialOwners | array of objects | This field is required and each object in it should contain the following fields:    \\+ lastName &#x60;required&#x60;  \\+ firstName &#x60;required&#x60;  \\+ ownershipPercentage &#x60;required&#x60;  \\+ politicallyExposedPerson &#x60;required&#x60; | | businessActivityDescription | string | &#x60;required&#x60; | | businessCategory | string | This is required for USD,GBP and EUR virtual accounts requests but &#x60;optional&#x60; for NGN e.g Government agencies, Joint Venture, Political parties | | additionalInfo | string | This is required for USD,GBP and EUR virtual account requests | | attachments | file | &#x60;optional&#x60; |

### Example
```java
// Import classes:
//import DEFAULT.ApiException;
//import DEFAULT.api.ProfileApi;


ProfileApi apiInstance = new ProfileApi();
String businessId = ""; // String | The ID of the business
String subAccountId = ""; // String | The ID of the subaccount
try {
    apiInstance.requestAnEURvirtualAccountForASubaccount(businessId, subAccountId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileApi#requestAnEURvirtualAccountForASubaccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| The ID of the business |
 **subAccountId** | **String**| The ID of the subaccount |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateASubaccount"></a>
# **updateASubaccount**
> updateASubaccount(businessId, subAccountId)

Update A Subaccount

This endpoint is used to update a subaccount.  REQUEST BODY   | Field | Data Type | description | |------| ------------- | ----------- | | name | string | Customer&#39;s name required| | email | string | Customer&#39;s email  required| | mobile | string | Customer&#39;s phone number  required|

### Example
```java
// Import classes:
//import DEFAULT.ApiException;
//import DEFAULT.api.ProfileApi;


ProfileApi apiInstance = new ProfileApi();
String businessId = ""; // String | The ID of the business
String subAccountId = ""; // String | The ID of the subaccount
try {
    apiInstance.updateASubaccount(businessId, subAccountId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileApi#updateASubaccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| The ID of the business |
 **subAccountId** | **String**| The ID of the subaccount |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateaBeneficiary"></a>
# **updateaBeneficiary**
> updateaBeneficiary(businessID, beneficiaryID)

Update a Beneficiary

This endpoint is used for updating the information for a beneficiary.     REQUEST BODY   | Field | Data Type | Description | |------| ------------- | ----------- | | firstName | string | required| | lastName | string | optional| | email | string |The email address of Beneficiary. required | | phoneNumber | string | optional  | | accountHolderName | string | optional| | bank | object | see the information about this below. optional + name: bank name required  + code optional   + sortCode optional   + swiftCode optional  + branch  optional   + address: see the definition in address field below optional   | | type | string | The value for this field is either _corporate_ or _indivdual_required| | address | object | the physical address of the beneficiary and it comprises of the below: optional + country optional  + state optional   + zip required   + city required  + street  required  | | currency | string | The currency that Beneficiary would be paid in required| | paymentDestination | string | The value for this field is either _mobile_money_wallet_ or _bank_account_ required | | destinationAddress | string | see the definition belowrequired | | uniqueIdentifier | string | optional |    Value Description for the destinationAddress field  The table below show that a destination address should be when given a certain payment destination.  | paymentDestination | destinationAddress | |------| ------------- | | _mobile_money_wallet_ | phone number used for the wallet | | _bank_account_ | account number |

### Example
```java
// Import classes:
//import DEFAULT.ApiException;
//import DEFAULT.api.ProfileApi;


ProfileApi apiInstance = new ProfileApi();
String businessID = ""; // String | This could be the ID of the business or the ID of a sub-account of the business
String beneficiaryID = ""; // String | The reference or ID of the beneficiary
try {
    apiInstance.updateaBeneficiary(businessID, beneficiaryID);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileApi#updateaBeneficiary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessID** | **String**| This could be the ID of the business or the ID of a sub-account of the business |
 **beneficiaryID** | **String**| The reference or ID of the beneficiary |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

