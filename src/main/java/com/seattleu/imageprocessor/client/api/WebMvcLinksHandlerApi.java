package com.seattleu.imageprocessor.client.api;

import com.seattleu.imageprocessor.client.invoker.ApiClient;


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
@Component("com.seattleu.imageprocessor.client.api.WebMvcLinksHandlerApi")
public class WebMvcLinksHandlerApi {
//    private ApiClient apiClient;
//
//    public WebMvcLinksHandlerApi() {
//        this(new ApiClient());
//    }
//
//    @Autowired
//    public WebMvcLinksHandlerApi(ApiClient apiClient) {
//        this.apiClient = apiClient;
//    }
//
//    public ApiClient getApiClient() {
//        return apiClient;
//    }
//
//    public void setApiClient(ApiClient apiClient) {
//        this.apiClient = apiClient;
//    }
//
//    /**
//     * links
//     *
//     * <p><b>200</b> - OK
//     * <p><b>401</b> - Unauthorized
//     * <p><b>403</b> - Forbidden
//     * <p><b>404</b> - Not Found
//     * @return Map&lt;String, Map&lt;String, Link&gt;&gt;
//     * @throws RestClientException if an error occurs while attempting to invoke the API
//     */
//    public Map<String, Map<String, Link>> linksUsingGET() throws RestClientException {
//        return linksUsingGETWithHttpInfo().getBody();
//    }
//
//    /**
//     * links
//     *
//     * <p><b>200</b> - OK
//     * <p><b>401</b> - Unauthorized
//     * <p><b>403</b> - Forbidden
//     * <p><b>404</b> - Not Found
//     * @return ResponseEntity&lt;Map&lt;String, Map&lt;String, Link&gt;&gt;&gt;
//     * @throws RestClientException if an error occurs while attempting to invoke the API
//     */
//    public ResponseEntity<Map<String, Map<String, Link>>> linksUsingGETWithHttpInfo() throws RestClientException {
//        Object postBody = null;
//
//        String path = UriComponentsBuilder.fromPath("/api/actuator").build().toUriString();
//
//        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
//        final HttpHeaders headerParams = new HttpHeaders();
//        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
//
//        final String[] accepts = {
//            "application/json", "application/vnd.spring-boot.actuator.v2+json", "application/vnd.spring-boot.actuator.v3+json"
//        };
//        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
//        final String[] contentTypes = {
//            "application/json"
//        };
//        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);
//
//        String[] authNames = new String[] {  };
//
//        ParameterizedTypeReference<Map<String, Map<String, Link>>> returnType = new ParameterizedTypeReference<Map<String, Map<String, Link>>>() {};
//        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
//    }
}
