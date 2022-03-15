# ResolveApi

All URIs are relative to *http://DEFAULT*

Method | HTTP request | Description
------------- | ------------- | -------------
[**resolveBankAccount**](ResolveApi.md#resolveBankAccount) | **GET** /resolve | Resolve Bank Account


<a name="resolveBankAccount"></a>
# **resolveBankAccount**
> resolveBankAccount()

Resolve Bank Account

This endpoint resolves bank account information based the account number and bank code provided. This is only valid for Nigerian bank accounts

### Example
```java
// Import classes:
//import DEFAULT.ApiException;
//import DEFAULT.api.ResolveApi;


ResolveApi apiInstance = new ResolveApi();
try {
    apiInstance.resolveBankAccount();
} catch (ApiException e) {
    System.err.println("Exception when calling ResolveApi#resolveBankAccount");
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

