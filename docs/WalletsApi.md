# WalletsApi

All URIs are relative to *http://DEFAULT*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getallthewalletsforaBusiness**](WalletsApi.md#getallthewalletsforaBusiness) | **GET** /wallets | Get all the wallets for a Business
[**getawallet**](WalletsApi.md#getawallet) | **GET** /wallets/{walletID} | Get a wallet


<a name="getallthewalletsforaBusiness"></a>
# **getallthewalletsforaBusiness**
> getallthewalletsforaBusiness(businessID)

Get all the wallets for a Business

This endpoints lists all wallets belonging to a business.

### Example
```java
// Import classes:
//import DEFAULT.ApiException;
//import DEFAULT.api.WalletsApi;


WalletsApi apiInstance = new WalletsApi();
String businessID = ""; // String | This could be the ID of the business or the ID of a sub-account of the business
try {
    apiInstance.getallthewalletsforaBusiness(businessID);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletsApi#getallthewalletsforaBusiness");
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

<a name="getawallet"></a>
# **getawallet**
> getawallet(walletID)

Get a wallet

This endpoint provides the information regarding a specific wallet.

### Example
```java
// Import classes:
//import DEFAULT.ApiException;
//import DEFAULT.api.WalletsApi;


WalletsApi apiInstance = new WalletsApi();
String walletID = ""; // String | The ID of the wallet
try {
    apiInstance.getawallet(walletID);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletsApi#getawallet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletID** | **String**| The ID of the wallet |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

