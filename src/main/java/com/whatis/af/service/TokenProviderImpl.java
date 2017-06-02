package com.whatis.af.service;

import com.whatis.af.model.SabreToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by sungji on 2017-06-01.
 */
@Service
public class TokenProviderImpl implements TokenProvider {

    @Autowired
    private CredentialsBuilder credentialsBuilder;

    @Value("${sabre.endpoint}")
    private String sabreEndPoint;

    private SabreToken sabreToken;

    private Date expirationDate;

    @Override
    public String getToken() {
        if (expirationDate == null || new Date().getTime() > expirationDate.getTime()) {
            RestTemplate restTemplate = new RestTemplate();

            MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
            map.add("grant_type", "client_credentials");

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
            headers.add("Authorization", "Basic " + credentialsBuilder.getCredentialsString());
            headers.add("Accept", "*/*");

            HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<>(map, headers);
            List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
            messageConverters.add(new FormHttpMessageConverter());
            messageConverters.add(new MappingJackson2HttpMessageConverter());
            restTemplate.setMessageConverters(messageConverters);

            sabreToken = restTemplate.postForObject(sabreEndPoint + "/v2/auth/token", requestEntity, SabreToken.class);


            if (sabreToken.getError() == null) {
                Calendar cal = Calendar.getInstance();
                cal.add(Calendar.SECOND, Integer.parseInt(sabreToken.getExpires_in()));
                expirationDate = cal.getTime();
            }
        }

        return sabreToken.getAccess_token();
    }

    @Override
    public String getTokenExpires() {
        if(sabreToken != null) return sabreToken.getExpires_in();
        return null;
    }
}
