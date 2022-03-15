# ConversionsApi

All URIs are relative to *http://DEFAULT*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getaconversion**](ConversionsApi.md#getaconversion) | **GET** /conversions/{conversionId} | Get a conversion
[**getallconversions**](ConversionsApi.md#getallconversions) | **GET** /conversions/business/{businessId} | Get all conversions
[**initiateaconversion**](ConversionsApi.md#initiateaconversion) | **POST** /conversions/initiate | Initiate a conversion


<a name="getaconversion"></a>
# **getaconversion**
> getaconversion(conversionId)

Get a conversion

This endpoint fetches a specific conversion performed by a business. 

### Example
```java
// Import classes:
//import DEFAULT.ApiException;
//import DEFAULT.api.ConversionsApi;


ConversionsApi apiInstance = new ConversionsApi();
String conversionId = ""; // String | The ID of the conversion
try {
    apiInstance.getaconversion(conversionId);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversionsApi#getaconversion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversionId** | **String**| The ID of the conversion |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getallconversions"></a>
# **getallconversions**
> getallconversions(businessId)

Get all conversions

This endpoint provides a list of all conversions performed by a business. 

### Example
```java
// Import classes:
//import DEFAULT.ApiException;
//import DEFAULT.api.ConversionsApi;


ConversionsApi apiInstance = new ConversionsApi();
String businessId = ""; // String | This could be the ID of the business or the ID of a sub-account of the business
try {
    apiInstance.getallconversions(businessId);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversionsApi#getallconversions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| This could be the ID of the business or the ID of a sub-account of the business |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="initiateaconversion"></a>
# **initiateaconversion**
> initiateaconversion()

Initiate a conversion

This endpoint provides information on the conversion rate between two currencies e.g NGN to USD     REQUEST BODY   | Field | Data Type | Description | |------| ------------- | ----------- | | business | string | This could be the ID of the business or the ID of a sub-account of the businessRequired | | quoteReference | string | To get a quote reference, you will need to call the generate quote endpoint Required |  

### Example
```java
// Import classes:
//import DEFAULT.ApiException;
//import DEFAULT.api.ConversionsApi;


ConversionsApi apiInstance = new ConversionsApi();
try {
    apiInstance.initiateaconversion();
} catch (ApiException e) {
    System.err.println("Exception when calling ConversionsApi#initiateaconversion");
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

