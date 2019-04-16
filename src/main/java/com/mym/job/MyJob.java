package com.mym.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Aming
 * @date 2019/4/16 22:57
 * @desc
 */
@Component
public class MyJob {

    @Scheduled(fixedRate = 1000)//每隔一秒执行一次
    public void run(){
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }
}
