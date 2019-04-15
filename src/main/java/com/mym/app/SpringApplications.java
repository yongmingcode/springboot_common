package com.mym.app;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.mym.controller.SpringController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * @author Aming
 * @date 2019/4/7 23:41
 * @desc 启动类
 */
//@EnableAutoConfiguration//启用启动配置-被组合注解替代
//@ComponentScan("com.mym.controller")//配置扫描范围-被组合注解替代
@SpringBootApplication(scanBasePackages = {"com.mym"})//组合注解，默认扫描当前包及其子包
@EnableAsync//开启异步执行
public class SpringApplications { //第一种使用FastJson的配置方法 extends WebMvcConfigurerAdapter{

    public static void main(String[] args){
        SpringApplication.run(SpringApplications.class);
    }

//    @Override
//    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//        //创建FastJson的消息转换器
//        FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
//
//        //创建FastJson的配置对象
//        FastJsonConfig config = new FastJsonConfig();
//        //对Json数据进行格式化
//        config.setSerializerFeatures(SerializerFeature.PrettyFormat);
//
//        converter.setFastJsonConfig(config);
//        converters.add(converter);
//
//        super.configureMessageConverters(converters);
//    }

    //配置FastJson的第二种方式
    @Bean
    public HttpMessageConverters fastJsonMassageConverter(){
        //创建FastJson的消息转换器
        FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
        //创建FastJson的配置对象
        FastJsonConfig config = new FastJsonConfig();
        //对Json数据进行格式化
        config.setSerializerFeatures(SerializerFeature.PrettyFormat);

        converter.setFastJsonConfig(config);

        HttpMessageConverter<?> con = converter;
        return new HttpMessageConverters(con);
    }
}
