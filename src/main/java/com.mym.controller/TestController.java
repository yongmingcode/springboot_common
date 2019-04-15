package com.mym.controller;

import com.mym.domain.Persion;
import com.mym.service.impl.AsyncService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.Charset;
import java.util.Date;
import java.util.concurrent.Future;

/**
 * @author Aming
 * @date 2019/4/11 22:49
 * @desc
 */
@RestController
public class TestController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AsyncService asyncService;

    //测试异步调用
    @RequestMapping("/async")
    public String asyncTest() throws Exception{
        long start = System.currentTimeMillis();

        Future<String> task1 = asyncService.doTast1();
        Future<String> task2 = asyncService.doTast2();
        Future<String> task3 = asyncService.doTast3();

        while(true){
            if(task1.isDone() && task2.isDone() && task3.isDone()){
                break;
            }
            Thread.sleep(1000);
        }

        long end = System.currentTimeMillis();

        return "全部执行完成，总耗时：" + (end - start) + "毫秒";
    }


    //测试全局异常处理
    @RequestMapping("/sho")
    @ResponseBody
    public String testGlobalException(){
//        int a = 5 / 0;
        int[] a = new int[3];
        System.out.println(a[3]);
        return "show";
    }

    //测试JackSon
    @RequestMapping("/showman")
    public Object showMan(){
        Persion persion = new Persion();
        persion.setDate(new Date());
        persion.setId(12);
        persion.setName("大明");
        return  persion;
    }

    //Springboot在HttpMessageConvertersAutoConfiguration中默认配置了消息转换器
    //定义消息转换器
    @Bean
    public StringHttpMessageConverter stringHttpMessageConverter(){
//        StringHttpMessageConverter converter = new StringHttpMessageConverter(Charset.forName("UTF-8"));//正常显示中文
        StringHttpMessageConverter converter = new StringHttpMessageConverter(Charset.forName("ISO8859-1"));//中文乱码
        return converter;
    }

    @RequestMapping("/show")
    public String show(){

        logger.debug("debug日志");
        logger.info("info日志");
        logger.warn("warn日志");
        logger.error("error日志jsasdk");

        return "show 日志";
    }
}
