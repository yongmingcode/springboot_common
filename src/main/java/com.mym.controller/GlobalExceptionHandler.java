package com.mym.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Aming
 * @date 2019/4/15 22:33
 * @desc 全局异常处理器
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public String handleException(Exception exception){
//        HashMap<String,Object> map = new HashMap<>();
//        map.put("errorCode",500);
//        map.put("errorMsg",exception.toString());
        System.out.println(exception.toString());
        return "error";
    }

}
