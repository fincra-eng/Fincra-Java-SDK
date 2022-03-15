# CoreApi

All URIs are relative to *http://DEFAULT*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBankcode**](CoreApi.md#getBankcode) | **GET** /core/banks | Get Bank code
[**getadisbursementtransactionbycustomerreference**](CoreApi.md#getadisbursementtransactionbycustomerreference) | **GET** /core/transactions/disbursements/by-customer-reference | Get a disbursement transaction by customer reference
[**getadisbursementtransactionbyreference**](CoreApi.md#getadisbursementtransactionbyreference) | **GET** /core/transactions/disbursements/by-reference | Get a disbursement transaction by reference
[**getatransactionforabusiness**](CoreApi.md#getatransactionforabusiness) | **GET** /core/transactions/{transactionID} | Get a transaction for a business
[**getbranchCode**](CoreApi.md#getbranchCode) | **GET** /core/banks/{bankId}/branches | Get branch Code
[**getthetransactionsforaBusiness**](CoreApi.md#getthetransactionsforaBusiness) | **POST** /core/transactions/search/business/{businessID} | Get the transactions for a Business
[**getthetransactionsforthesubAccountsofabusiness**](CoreApi.md#getthetransactionsforthesubAccountsofabusiness) | **POST** /core/transactions/search/business/{businessID}/sub-accounts | Get the transactions for the sub-accounts of a Business


<a name="getBankcode"></a>
# **getBankcode**
> getBankcode(currency)

Get Bank code

This endpoint provides a list of the banks and mobile money wallet providers with information like name, code and the list of branches and branch codes per bank based on a specified currency.  The **code** field in the below sample refers to the bank code for your bank account or the code of your mobile money provider.   &#x60;&#x60;&#x60;json {  {    \&quot;id\&quot;: 147,    \&quot;code\&quot;: \&quot;GH010100\&quot;,    \&quot;name\&quot;: \&quot;BANK OF GHANA\&quot;,    \&quot;isMobileVerified\&quot;: null,    \&quot;branches\&quot;: [       {         \&quot;id\&quot;: 1,         \&quot;branchCode\&quot;: \&quot;GH010101\&quot;,         \&quot;branchName\&quot;: \&quot;BANK OF GHANA-ACCRA\&quot;,         \&quot;swiftCode\&quot;: \&quot;BAGHGHAC\&quot;,         \&quot;bic\&quot;: \&quot;BAGHGHAC\&quot;        }]  },  {   \&quot;id\&quot;: 79,   \&quot;code\&quot;: \&quot;AIRTEL\&quot;,   \&quot;name\&quot;: \&quot;Airtel\&quot;,   \&quot;isMobileVerified\&quot;: true,   \&quot;branches\&quot;: null  } } &#x60;&#x60;&#x60;    

### Example
```java
// Import classes:
//import DEFAULT.ApiException;
//import DEFAULT.api.CoreApi;


CoreApi apiInstance = new CoreApi();
String currency = ""; // String | e.g NGN, GHS, KES
try {
    apiInstance.getBankcode(currency);
} catch (ApiException e) {
    System.err.println("Exception when calling CoreApi#getBankcode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| e.g NGN, GHS, KES |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getadisbursementtransactionbycustomerreference"></a>
# **getadisbursementtransactionbycustomerreference**
> getadisbursementtransactionbycustomerreference(business, customerReference)

Get a disbursement transaction by customer reference

This endpoint provides the details of a disbursement transaction through the use of a customer reference.

### Example
```java
// Import classes:
//import DEFAULT.ApiException;
//import DEFAULT.api.CoreApi;


CoreApi apiInstance = new CoreApi();
String business = ""; // String | The ID of the business
String customerReference = ""; // String | The reference of the customer/merchant
try {
    apiInstance.getadisbursementtransactionbycustomerreference(business, customerReference);
} catch (ApiException e) {
    System.err.println("Exception when calling CoreApi#getadisbursementtransactionbycustomerreference");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business** | **String**| The ID of the business |
 **customerReference** | **String**| The reference of the customer/merchant |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getadisbursementtransactionbyreference"></a>
# **getadisbursementtransactionbyreference**
> getadisbursementtransactionbyreference(business, reference)

Get a disbursement transaction by reference

This endpoint provides the details of a disbursement transaction through the use of its reference.

### Example
```java
// Import classes:
//import DEFAULT.ApiException;
//import DEFAULT.api.CoreApi;


CoreApi apiInstance = new CoreApi();
String business = ""; // String | The ID of business
String reference = ""; // String | The reference of the transaction
try {
    apiInstance.getadisbursementtransactionbyreference(business, reference);
} catch (ApiException e) {
    System.err.println("Exception when calling CoreApi#getadisbursementtransactionbyreference");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business** | **String**| The ID of business |
 **reference** | **String**| The reference of the transaction |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getatransactionforabusiness"></a>
# **getatransactionforabusiness**
> getatransactionforabusiness(transactionID)

Get a transaction for a business

This endpoint provides the details of a transaction through the use of its ID.        

### Example
```java
// Import classes:
//import DEFAULT.ApiException;
//import DEFAULT.api.CoreApi;


CoreApi apiInstance = new CoreApi();
String transactionID = ""; // String | The reference or ID of the transaction
try {
    apiInstance.getatransactionforabusiness(transactionID);
} catch (ApiException e) {
    System.err.println("Exception when calling CoreApi#getatransactionforabusiness");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionID** | **String**| The reference or ID of the transaction |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getbranchCode"></a>
# **getbranchCode**
> getbranchCode(bankId)

Get branch Code

This endpoint provides a list of the branches for a bank and helps you get your branch code. To get a branch Code:  + Make a request to the endpoint that provides bank code with your desired currency  + Find your bank in the list returned. + Check the id field of your bank information for your branch + use the id field to make a request to this endpoint to get the list of branches for your bank + Check the **branchCode** field of your branch information for the value of your branch code

### Example
```java
// Import classes:
//import DEFAULT.ApiException;
//import DEFAULT.api.CoreApi;


CoreApi apiInstance = new CoreApi();
String bankId = ""; // String | Id of the bank
try {
    apiInstance.getbranchCode(bankId);
} catch (ApiException e) {
    System.err.println("Exception when calling CoreApi#getbranchCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bankId** | **String**| Id of the bank |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getthetransactionsforaBusiness"></a>
# **getthetransactionsforaBusiness**
> getthetransactionsforaBusiness(businessID)

Get the transactions for a Business

This endpoint provides a list of all the transactions for a business.   REQUEST BODY   | Field | Data Type | Description | |------| ------------- | ----------- | | page | string | Specify exactly what page you want to retrieve optional| | perPage | string | Specify how many records you want to retrieve per page optional| | from | string| Specify start date with format \&quot;YYYY-mm-dd\&quot;  optional| | to | string| Specify end date with format \&quot;YYYY-mm-dd\&quot; optional|  

### Example
```java
// Import classes:
//import DEFAULT.ApiException;
//import DEFAULT.api.CoreApi;


CoreApi apiInstance = new CoreApi();
String businessID = ""; // String | This could be the ID of the business or the ID of a sub-account of the business
try {
    apiInstance.getthetransactionsforaBusiness(businessID);
} catch (ApiException e) {
    System.err.println("Exception when calling CoreApi#getthetransactionsforaBusiness");
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

<a name="getthetransactionsforthesubAccountsofabusiness"></a>
# **getthetransactionsforthesubAccountsofabusiness**
> getthetransactionsforthesubAccountsofabusiness(businessID)

Get the transactions for the sub-accounts of a Business

This provides a list of all the transactions for the sub-accounts of a Business.   REQUEST BODY   | Field | Data Type | Description | |------| ------------- | ----------- | | page | string | Specify exactly what page you want to retrieve optional| | perPage | string | Specify how many records you want to retrieve per page optional| | from | string| Specify start date with format \&quot;YYYY-mm-dd\&quot;  optional| | to | string| Specify end date with format \&quot;YYYY-mm-dd\&quot; optional|     

### Example
```java
// Import classes:
//import DEFAULT.ApiException;
//import DEFAULT.api.CoreApi;


CoreApi apiInstance = new CoreApi();
String businessID = ""; // String | The is the ID of a business
try {
    apiInstance.getthetransactionsforthesubAccountsofabusiness(businessID);
} catch (ApiException e) {
    System.err.println("Exception when calling CoreApi#getthetransactionsforthesubAccountsofabusiness");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessID** | **String**| The is the ID of a business |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

