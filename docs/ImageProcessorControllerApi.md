# ImageProcessorControllerApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transformImageUsingPOST**](ImageProcessorControllerApi.md#transformImageUsingPOST) | **POST** /api/transformer | Performs a sequence of transformations as specified in the request body


<a name="transformImageUsingPOST"></a>
# **transformImageUsingPOST**
> EntityModelImageProcessingDetail transformImageUsingPOST(imageProcessingDetail)

Performs a sequence of transformations as specified in the request body

### Example
```java
// Import classes:
//import com.seattleu.imageprocessor.client.invoker.ApiException;
//import com.seattleu.imageprocessor.client.api.ImageProcessorControllerApi;


ImageProcessorControllerApi apiInstance = new ImageProcessorControllerApi();
ImageProcessingDetail imageProcessingDetail = new ImageProcessingDetail(); // ImageProcessingDetail | imageProcessingDetail
try {
    EntityModelImageProcessingDetail result = apiInstance.transformImageUsingPOST(imageProcessingDetail);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImageProcessorControllerApi#transformImageUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageProcessingDetail** | [**ImageProcessingDetail**](ImageProcessingDetail.md)| imageProcessingDetail |

### Return type

[**EntityModelImageProcessingDetail**](EntityModelImageProcessingDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

