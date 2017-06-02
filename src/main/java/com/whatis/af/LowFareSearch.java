package com.whatis.af;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.whatis.af.model.bargainfindermax.BargainFinderMaxRequest;
import com.whatis.af.service.BfmRequestServiceImpl;
import com.whatis.af.service.GenericRestPostCall;
import com.whatis.af.service.TokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by sungji on 2017-06-01.
 */
@Controller
public class LowFareSearch {
    @Autowired
    private TokenProvider tokenProvider;

    @Autowired
    BfmRequestServiceImpl bfmRequestService;

    @Autowired
    private GenericRestPostCall<BargainFinderMaxRequest> call;

    @Value("${sabre.endpoint}")
    private String endPoint;
    @RequestMapping("/flight")
    public String flight(){
        return "flight";
    }
    @RequestMapping("/flight/lowFareSearch")
    @ResponseBody
    public String lowFareSearch(/*@RequestBody BargainFinderMaxRequest bargainFinderMaxRequest*/) throws JsonProcessingException {

        //BfmResponse

        BargainFinderMaxRequest bargainFinderMaxRequest = bfmRequestService.generateRequest();
        ObjectMapper mapper = new ObjectMapper();
        String rq = mapper.writeValueAsString(bargainFinderMaxRequest);
        call.setRequest(bargainFinderMaxRequest);
        call.setUrl(endPoint + "/v3.1.0/shop/flights?mode=live");
        String bargainFinderMaxResponse = call.doCallUrlConnection(rq);

        System.out.println("result : "+ bargainFinderMaxResponse);
        return bargainFinderMaxResponse;
    }
}
