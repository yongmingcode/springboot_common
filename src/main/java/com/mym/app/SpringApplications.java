package com.mym.app;

import com.mym.controller.SpringController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Aming
 * @date 2019/4/7 23:41
 * @desc 启动类
 */
//@EnableAutoConfiguration//启用启动配置-被组合注解替代
//@ComponentScan("com.mym.controller")//配置扫描范围-被组合注解替代
@SpringBootApplication(scanBasePackages = {"com.mym.controller"})//组合注解，默认扫描当前包及其子包
public class SpringApplications {

    public static void main(String[] args){
        SpringApplication.run(SpringApplications.class);
    }
}
