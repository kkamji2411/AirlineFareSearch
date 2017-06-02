package com.whatis.af;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.whatis.af.model.BargainFinderMaxRequest;
import com.whatis.af.service.BfmRequestServiceImpl;
import com.whatis.af.service.TokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sungji on 2017-06-01.
 */
@RestController
public class LowFareSearch {
    @Autowired
    private TokenProvider tokenProvider;

    @Autowired
    BfmRequestServiceImpl bfmRequestService;

    @RequestMapping("/air/search")
    public String lowFareSearch() throws JsonProcessingException {

        System.out.println("AccessToken : "+tokenProvider.getToken());
        System.out.println("AccessToken Expired : "+tokenProvider.getTokenExpires());
        BargainFinderMaxRequest bargainFinderMaxRequest = bfmRequestService.generateRequest();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        objectMapper.setPropertyNamingStrategy(new PropertyNamingStrategy.PascalCaseStrategy());
        objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
        String result = objectMapper.writeValueAsString((Object)bargainFinderMaxRequest);
        System.out.println("result : "+ result);
        return "test";
    }
}
