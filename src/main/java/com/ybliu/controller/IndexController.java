package com.ybliu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by linlinyeyu on 2017/8/14.
 */
@Controller
@RequestMapping("/")
public class IndexController {
    @RequestMapping("")
    public String index(){
        return "index";
    }
}
