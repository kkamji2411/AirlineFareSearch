package com.whatis.af;

import com.whatis.af.service.GenericRestGetCall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by sungji on 2017-06-02.
 */
@Controller
public class AirPortsAtCitySearch {
    @Autowired
    private GenericRestGetCall call;

    @Value("${sabre.endpoint}")
    private String endPoint;

    @RequestMapping(value="/search/city/{searchText}", method= RequestMethod.GET)
    @ResponseBody
    public String city(@PathVariable String searchText){
        //call.setUrl(endPoint+"/v1/lists/supported/cities/"+searchText+"/airports");
        call.setUrl(endPoint+"/v1/lists/supported/cities/"+searchText+"/airports");
        return call.doCall();
    }
}
