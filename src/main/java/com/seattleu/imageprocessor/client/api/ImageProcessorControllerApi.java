package com.seattleu.imageprocessor.client.api;

import com.seattleu.imageprocessor.client.invoker.ApiClient;

import com.seattleu.imageprocessor.client.model.EntityModelImageProcessingDetail;
import com.seattleu.imageprocessor.client.model.ImageProcessingDetail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-11T15:35:47.287-08:00")
@Component("com.seattleu.imageprocessor.client.api.ImageProcessorControllerApi")
public class ImageProcessorControllerApi {
    private ApiClient apiClient;

    public ImageProcessorControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public ImageProcessorControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Performs a sequence of transformations as specified in the request body
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param imageProcessingDetail imageProcessingDetail (required)
     * @return EntityModelImageProcessingDetail
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EntityModelImageProcessingDetail transformImageUsingPOST(ImageProcessingDetail imageProcessingDetail) throws RestClientException {
        return transformImageUsingPOSTWithHttpInfo(imageProcessingDetail).getBody();
    }

    /**
     * Performs a sequence of transformations as specified in the request body
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param imageProcessingDetail imageProcessingDetail (required)
     * @return ResponseEntity&lt;EntityModelImageProcessingDetail&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EntityModelImageProcessingDetail> transformImageUsingPOSTWithHttpInfo(ImageProcessingDetail imageProcessingDetail) throws RestClientException {
        Object postBody = imageProcessingDetail;
        
        // verify the required parameter 'imageProcessingDetail' is set
        if (imageProcessingDetail == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imageProcessingDetail' when calling transformImageUsingPOST");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/transformer").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<EntityModelImageProcessingDetail> returnType = new ParameterizedTypeReference<EntityModelImageProcessingDetail>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
