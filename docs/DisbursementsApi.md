# DisbursementsApi

All URIs are relative to *http://DEFAULT*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getallsettlementsforaBusiness**](DisbursementsApi.md#getallsettlementsforaBusiness) | **POST** /disbursements/settlements/search/business/{businessID} | Get all settlements for a Business
[**getasettlementforabusiness**](DisbursementsApi.md#getasettlementforabusiness) | **GET** /disbursements/settlements/{settlementId} | Get a settlement for a business
[**makeAPayout**](DisbursementsApi.md#makeAPayout) | **POST** /disbursements/payouts | Make A Payout
[**makeAnInternalPayout**](DisbursementsApi.md#makeAnInternalPayout) | **POST** /disbursements/payouts/wallets | Make  An Internal  Payout


<a name="getallsettlementsforaBusiness"></a>
# **getallsettlementsforaBusiness**
> getallsettlementsforaBusiness(businessID)

Get all settlements for a Business

This endpoint provides a list of all the settlements for a business.   REQUEST BODY   | Field | Data Type | Description | |------| ------------- | ----------- | | page | string | Specify exactly what page you want to retrieve optional| | perPage | string | Specify how many records you want to retrieve per page optional| | from | string| Specify start date with format \&quot;YYYY-mm-dd\&quot;  optional| | to | string| Specify end date with format \&quot;YYYY-mm-dd\&quot; optional|  

### Example
```java
// Import classes:
//import DEFAULT.ApiException;
//import DEFAULT.api.DisbursementsApi;


DisbursementsApi apiInstance = new DisbursementsApi();
String businessID = ""; // String | businessID
try {
    apiInstance.getallsettlementsforaBusiness(businessID);
} catch (ApiException e) {
    System.err.println("Exception when calling DisbursementsApi#getallsettlementsforaBusiness");
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

<a name="getasettlementforabusiness"></a>
# **getasettlementforabusiness**
> getasettlementforabusiness(settlementId)

Get a settlement for a business

This endpoint provides the details of a settlement through the use of its ID.        

### Example
```java
// Import classes:
//import DEFAULT.ApiException;
//import DEFAULT.api.DisbursementsApi;


DisbursementsApi apiInstance = new DisbursementsApi();
String settlementId = ""; // String | settlementId
try {
    apiInstance.getasettlementforabusiness(settlementId);
} catch (ApiException e) {
    System.err.println("Exception when calling DisbursementsApi#getasettlementforabusiness");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settlementId** | **String**| settlementId |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="makeAPayout"></a>
# **makeAPayout**
> makeAPayout()

Make A Payout

This endpoint is used for making a payment out to the beneficiaries of the business who are not registered on our platform  REQUEST BODY  * * *  | Field | Data Type | description | | --- | --- | --- | | sourceCurrency | string | The currency which the business is to send payment in &#x60;required&#x60; | | destinationCurrency | string | The currency which the beneficiary is to receive payment in&#x60;required&#x60; | | amount | string | The amount to be paid out&#x60;required&#x60; | | business | string | This could be the ID of the business or the ID of a sub-account of the business &#x60;required&#x60; | | description | string | &#x60;required&#x60; | | customerReference | string | This is the unique reference generated for the transaction on your platform &#x60;optional&#x60; | | beneficiary | object | See the description of the beneficiary object below&#x60;required&#x60; | | paymentDestination | string | This is where the payment is to be made. the value will be one of the following: *bank_account*, *mobile_money_wallet* &#x60;required&#x60; | | quoteReference | string | This is required if the payout is a cross currency payout(e.g, NGN to USD). If this is a single currency payout (e.g, EUR to EUR), a quote reference is not required. To get a quote reference, you will need to call the generate quote endpoint below | | paymentScheme | string | This is the valid payment scheme for the destination currency.Payment scheme is required for all USD,EUR and GBP payouts |  The beneficiaries information varies based on the currency and beneficiary type (individual or corporate). Find the breakdown of the beneficiaries object below:  Description of &#x60;INDIVIDUAL&#x60; or &#x60;CORPORATE&#x60; Beneficiary information for &#x60;NGN&#x60; and &#x60;KES&#x60; payout:  | Field | Data Type | description | | --- | --- | --- | | lastName | string | The last name of the beneficiary. it is &#x60;required&#x60; if type is **individual** and &#x60;optional&#x60; if type is **corporate** | | firstName | string | The first name of the beneficiary if type is **individual** or the name of the corporation if type is **corporate** &#x60;required&#x60; | | accountNumber | string | This is the bank account number of the beneficiary or phone number if the account is a mobile money wallet. &#x60;required&#x60; | | accountHolderName | string | This is the name on the bank account of the beneficiary. &#x60;required&#x60; | | bankCode | string | This value is either the code for your bank or mobile money wallet provider. To get this value, you will need to call the get bank code endpoint below &#x60;required&#x60; | | type | string | the value can either be **individual** or **corporate** &#x60;required&#x60; | | country | string | &#x60;optional&#x60; | | email | string | &#x60;optional&#x60; |  Description of &#x60;INDIVIDUAL&#x60; or &#x60;CORPORATE&#x60; Beneficiary information for &#x60;GHS&#x60; and &#x60;ZAR&#x60; payout:  | Field | Data Type | description | | --- | --- | --- | | lastName | string | The last name of the beneficiary. it is &#x60;required&#x60; if type is **individual** and &#x60;optional&#x60; if type is **corporate** | | firstName | string | The first name of the beneficiary if type is **individual** or the name of the corporation if type is **corporate** &#x60;required&#x60; | | accountHolderName | string | This is the name on the bank account of the beneficiary. &#x60;required&#x60; | | accountNumber | string | This is the bank account number of the beneficiary or phone number if the account is a mobile money wallet. &#x60;required&#x60; | | bankCode | string | This value is either the code for your bank or mobile money wallet provider. To get this value, you will need to call the get bank code endpoint below &#x60;required&#x60; | | sortCode(branchCode) | string | To get this code, you will need to call the get bank branch endpoint below &#x60;required&#x60; | | type | string | the value can either be **individual** or **corporate** &#x60;required&#x60; | | country | string | &#x60;optional&#x60; | | email | string | &#x60;optional&#x60; |  Description of &#x60;INDIVIDUAL&#x60; Beneficiary information for &#x60;EUR&#x60; payout:  | Field | Data Type | description | | --- | --- | --- | | lastName | string | The last name of the beneficiary. it is &#x60;required&#x60; | | firstName | string | The first name of the beneficiary | | accountHolderName | string | This is the name on the bank account of the beneficiary. &#x60;required&#x60; | | accountNumber | string | This value of this field will be IBAN of the beneficiary. Depending on the country, the IBAN is mostly made up of the following format: *Country code + check digits + bank code + sort code + account number*. Kindly visit this page to see the IBAN format for different countries.&#x60;required&#x60; | | type | string | the value can either be **individual** or **corporate** &#x60;required&#x60; | | country | string | &#x60;optional&#x60; | | email | string | &#x60;optional&#x60; | | mobile | string | &#x60;optional&#x60; | | bankSwiftCode | string | &#x60;optional&#x60; | | birthDate | string | &#x60;optional&#x60; | | birthPlace | string | &#x60;optional&#x60; | | address | object | This contains all the optional address information. They are:    \\+ country: country of origin &#x60;optional&#x60;  \\+ zip &#x60;optional&#x60;  \\+ street &#x60;optional&#x60;  \\+ state &#x60;optional&#x60;  \\+ city &#x60;optional&#x60; | | document | object | This contains the optional information in your means of identification. They are:    \\+ type: type of ID document e.g International Passport &#x60;optional&#x60;  \\+ number &#x60;optional&#x60;  \\+ issuedCountryCode e.g NG &#x60;optional&#x60;  \\+ issuedBy &#x60;optional&#x60;  \\+ issuedDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60;  \\+ expirationDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60; |  Description of &#x60;CORPORATE&#x60; Beneficiary information for &#x60;EUR&#x60; payout:  | Field | Data Type | description | | --- | --- | --- | | accountHolderName | string | This is the name on the bank account of the beneficiary. &#x60;required&#x60; | | accountNumber | string | This value of this field will be IBAN of the beneficiary. Depending on the country, the IBAN is mostly made up of the following format: *Country code + check digits + bank code + sort code + account number*. Kindly visit this page to see the IBAN format for different countries.&#x60;required&#x60; | | type | string | the value can either be **individual** or **corporate** &#x60;required&#x60; | | country | string | &#x60;optional&#x60; | | email | string | &#x60;optional&#x60; | | mobile | string | &#x60;optional&#x60; | | bankSwiftCode | string | &#x60;optional&#x60; | | registrationNumber | string | &#x60;optional&#x60; | | address | object | This contains all the optional address information. They are:    \\+ country: country of origin &#x60;optional&#x60;  \\+ zip &#x60;optional&#x60;  \\+ street &#x60;optional&#x60;  \\+ state &#x60;optional&#x60;  \\+ city &#x60;optional&#x60; | | document | object | This contains the optional information in your means of identification. They are:    \\+ type: type of ID document e.g International Passport &#x60;optional&#x60;  \\+ number &#x60;optional&#x60;  \\+ issuedCountryCode e.g NG &#x60;optional&#x60;  \\+ issuedBy &#x60;optional&#x60;  \\+ issuedDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60;  \\+ expirationDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60; |  Description of &#x60;CORPORATE&#x60; Beneficiary information for &#x60;GBP&#x60; payout:  | Field | Data Type | description | | --- | --- | --- | | accountHolderName | string | This is the name on the bank account of the beneficiary. &#x60;required&#x60; | | accountNumber | string | This should be the beneficiary&#39;s account number&#x60;required&#x60; | | type | string | the value can either be **individual** or **corporate** &#x60;required&#x60; | | country | string | &#x60;optional&#x60; | | email | string | &#x60;optional&#x60; | | mobile | string | &#x60;optional&#x60; | | bankSwiftCode | string | &#x60;optional&#x60; | | sortCode | string | &#x60;required&#x60; | | registrationNumber | string | &#x60;optional&#x60; | | address | object | This contains all the optional address information. They are:    \\+ country: country of origin &#x60;optional&#x60;  \\+ zip &#x60;optional&#x60;  \\+ street &#x60;optional&#x60;  \\+ state &#x60;optional&#x60;  \\+ city &#x60;optional&#x60; | | document | object | This contains the optional information in your means of identification. They are:    \\+ type: type of ID document e.g International Passport &#x60;optional&#x60;  \\+ number &#x60;optional&#x60;  \\+ issuedCountryCode e.g NG &#x60;optional&#x60;  \\+ issuedBy &#x60;optional&#x60;  \\+ issuedDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60;  \\+ expirationDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60; |  Description of &#x60;INDIVIDUAL&#x60; Beneficiary information for &#x60;GBP&#x60; payout:  | Field | Data Type | description | | --- | --- | --- | | lastName | string | The last name of the beneficiary. it is &#x60;required&#x60; | | firstName | string | The first name of the beneficiary | | accountHolderName | string | This is the name on the bank account of the beneficiary. &#x60;required&#x60; | | accountNumber | string | This should be the beneficiary&#39;s account number&#x60;required&#x60; | | type | string | the value can either be **individual** or **corporate** &#x60;required&#x60; | | country | string | &#x60;optional&#x60; | | email | string | &#x60;optional&#x60; | | mobile | string | &#x60;optional&#x60; | | bankSwiftCode | string | &#x60;optional&#x60; | | sortCode | string | &#x60;required&#x60; | | birthDate | string | &#x60;optional&#x60; | | birthPlace | string | &#x60;optional&#x60; | | address | object | This contains all the optional address information. They are:    \\+ country: country of origin &#x60;optional&#x60;  \\+ zip &#x60;optional&#x60;  \\+ street &#x60;optional&#x60;  \\+ state &#x60;optional&#x60;  \\+ city &#x60;optional&#x60; | | document | object | This contains the optional information in your means of identification. They are:    \\+ type: type of ID document e.g International Passport &#x60;optional&#x60;  \\+ number &#x60;optional&#x60;  \\+ issuedCountryCode e.g NG &#x60;optional&#x60;  \\+ issuedBy &#x60;optional&#x60;  \\+ issuedDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60;  \\+ expirationDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60; |  Description of &#x60;CORPORATE&#x60; Beneficiary information for &#x60;USD&#x60; payout:  | Field | Data Type | description | | --- | --- | --- | | accountHolderName | string | This is the name on the bank account of the beneficiary. &#x60;required&#x60; | | accountNumber | string | This should be the beneficiary&#39;s account number&#x60;required&#x60; | | type | string | the value can either be **individual** or **corporate** &#x60;required&#x60; | | country | string | &#x60;optional&#x60; | | email | string | &#x60;optional&#x60; | | mobile | string | &#x60;optional&#x60; | | bankSwiftCode | string | &#x60;required&#x60; | | sortCode | string | &#x60;required&#x60; | | registrationNumber | string | &#x60;optional&#x60; | | address | object | This contains all the optional address information. They are:    \\+ country: country of origin &#x60;optional&#x60;  \\+ zip &#x60;optional&#x60;  \\+ street &#x60;optional&#x60;  \\+ state &#x60;optional&#x60;  \\+ city &#x60;optional&#x60; | | document | object | This contains the optional information in your means of identification. They are:    \\+ type: type of ID document e.g International Passport &#x60;optional&#x60;  \\+ number &#x60;optional&#x60;  \\+ issuedCountryCode e.g NG &#x60;optional&#x60;  \\+ issuedBy &#x60;optional&#x60;  \\+ issuedDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60;  \\+ expirationDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60; |  Description of &#x60;INDIVIDUAL&#x60; Beneficiary information for &#x60;USD&#x60; payout:  | Field | Data Type | description | | --- | --- | --- | | lastName | string | The last name of the beneficiary. it is &#x60;required&#x60; | | firstName | string | The first name of the beneficiary | | accountHolderName | string | This is the name on the bank account of the beneficiary. &#x60;required&#x60; | | accountNumber | string | This should be the beneficiary&#39;s account number&#x60;required&#x60; | | type | string | the value can either be **individual** or **corporate** &#x60;required&#x60; | | country | string | &#x60;optional&#x60; | | email | string | &#x60;optional&#x60; | | mobile | string | &#x60;optional&#x60; | | bankSwiftCode | string | &#x60;required&#x60; | | sortCode | string | &#x60;required&#x60; | | birthDate | string | &#x60;optional&#x60; | | birthPlace | string | &#x60;optional&#x60; | | address | object | This contains all the optional address information. They are:    \\+ country: country of origin &#x60;optional&#x60;  \\+ zip &#x60;optional&#x60;  \\+ street &#x60;optional&#x60;  \\+ state &#x60;optional&#x60;  \\+ city &#x60;optional&#x60; | | document | object | This contains the optional information in your means of identification. They are:    \\+ type: type of ID document e.g International Passport &#x60;optional&#x60;  \\+ number &#x60;optional&#x60;  \\+ issuedCountryCode e.g NG &#x60;optional&#x60;  \\+ issuedBy &#x60;optional&#x60;  \\+ issuedDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60;  \\+ expirationDate with Format \&quot;YYYY-mm-dd\&quot; &#x60;optional&#x60; |

### Example
```java
// Import classes:
//import DEFAULT.ApiException;
//import DEFAULT.api.DisbursementsApi;


DisbursementsApi apiInstance = new DisbursementsApi();
try {
    apiInstance.makeAPayout();
} catch (ApiException e) {
    System.err.println("Exception when calling DisbursementsApi#makeAPayout");
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

<a name="makeAnInternalPayout"></a>
# **makeAnInternalPayout**
> makeAnInternalPayout()

Make  An Internal  Payout

This endpoint is used for making a payment out to a customer/user/subaccount on our platform  REQUEST BODY  * * *  | Field | Data Type | description | | --- | --- | --- | | amount | string | The amount to be paid out&#x60;required&#x60; | | business | string | This could be the ID of the business or the ID of a sub-account of the business &#x60;required&#x60; | | customerReference | string | This is the unique reference generated for the transaction on your platform. &#x60;required&#x60; | | description | string | &#x60;required&#x60; | | beneficiaryWalletNumber | string | This is the unique wallet of the beneficiary you want to pay to &#x60;required&#x60; |

### Example
```java
// Import classes:
//import DEFAULT.ApiException;
//import DEFAULT.api.DisbursementsApi;


DisbursementsApi apiInstance = new DisbursementsApi();
try {
    apiInstance.makeAnInternalPayout();
} catch (ApiException e) {
    System.err.println("Exception when calling DisbursementsApi#makeAnInternalPayout");
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

