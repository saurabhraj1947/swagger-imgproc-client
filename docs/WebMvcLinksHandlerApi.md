# WebMvcLinksHandlerApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**linksUsingGET**](WebMvcLinksHandlerApi.md#linksUsingGET) | **GET** /api/actuator | links


<a name="linksUsingGET"></a>
# **linksUsingGET**
> Map&lt;String, Map&lt;String, Link&gt;&gt; linksUsingGET()

links

### Example
```java
// Import classes:
//import com.seattleu.imageprocessor.client.invoker.ApiException;
//import com.seattleu.imageprocessor.client.api.WebMvcLinksHandlerApi;


WebMvcLinksHandlerApi apiInstance = new WebMvcLinksHandlerApi();
try {
    Map<String, Map<String, Link>> result = apiInstance.linksUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebMvcLinksHandlerApi#linksUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Map&lt;String, Map&lt;String, Link&gt;&gt;**](Map.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/vnd.spring-boot.actuator.v2+json, application/vnd.spring-boot.actuator.v3+json

