# OperationHandlerApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**handleUsingGET**](OperationHandlerApi.md#handleUsingGET) | **GET** /api/actuator/health | handle
[**handleUsingGET1**](OperationHandlerApi.md#handleUsingGET1) | **GET** /api/actuator/health/** | handle
[**handleUsingGET2**](OperationHandlerApi.md#handleUsingGET2) | **GET** /api/actuator/info | handle


<a name="handleUsingGET"></a>
# **handleUsingGET**
> Object handleUsingGET(body)

handle

### Example
```java
// Import classes:
//import com.seattleu.imageprocessor.client.invoker.ApiException;
//import com.seattleu.imageprocessor.client.api.OperationHandlerApi;


OperationHandlerApi apiInstance = new OperationHandlerApi();
Object body = null; // Object | body
try {
    Object result = apiInstance.handleUsingGET(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OperationHandlerApi#handleUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **Object**| body | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/vnd.spring-boot.actuator.v2+json, application/vnd.spring-boot.actuator.v3+json

<a name="handleUsingGET1"></a>
# **handleUsingGET1**
> Object handleUsingGET1(body)

handle

### Example
```java
// Import classes:
//import com.seattleu.imageprocessor.client.invoker.ApiException;
//import com.seattleu.imageprocessor.client.api.OperationHandlerApi;


OperationHandlerApi apiInstance = new OperationHandlerApi();
Object body = null; // Object | body
try {
    Object result = apiInstance.handleUsingGET1(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OperationHandlerApi#handleUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **Object**| body | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/vnd.spring-boot.actuator.v2+json, application/vnd.spring-boot.actuator.v3+json

<a name="handleUsingGET2"></a>
# **handleUsingGET2**
> Object handleUsingGET2(body)

handle

### Example
```java
// Import classes:
//import com.seattleu.imageprocessor.client.invoker.ApiException;
//import com.seattleu.imageprocessor.client.api.OperationHandlerApi;


OperationHandlerApi apiInstance = new OperationHandlerApi();
Object body = null; // Object | body
try {
    Object result = apiInstance.handleUsingGET2(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OperationHandlerApi#handleUsingGET2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **Object**| body | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/vnd.spring-boot.actuator.v2+json, application/vnd.spring-boot.actuator.v3+json

