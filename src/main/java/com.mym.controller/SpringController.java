package com.mym.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Aming
 * @date 2019/4/7 21:15
 * @desc
 */
@RestController
public class SpringController {

    @RequestMapping("/hello")
    public String yes(){
        return "hello";
    }

    //支持rest风格
    @RequestMapping("/info/{msg}")
    public String show(@PathVariable String msg){
        return "show:" + msg;
    }


}
