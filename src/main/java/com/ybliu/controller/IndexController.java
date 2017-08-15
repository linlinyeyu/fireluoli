package com.ybliu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by linlinyeyu on 2017/8/14.
 */
@Controller
@RequestMapping("index")
public class IndexController {
    @RequestMapping("index")
    public String index(){
        return "view/index";
    }
}
