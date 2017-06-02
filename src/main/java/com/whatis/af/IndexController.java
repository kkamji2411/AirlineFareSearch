package com.whatis.af;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sungji on 2017-06-01.
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(Model model){

        return "index";
    }
}
