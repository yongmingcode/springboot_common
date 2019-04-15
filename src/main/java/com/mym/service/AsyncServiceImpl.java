package com.mym.service;

import com.mym.service.impl.AsyncService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.concurrent.Future;

/**
 * @author Aming
 * @date 2019/4/15 23:27
 * @desc
 */
@Service
public class AsyncServiceImpl implements AsyncService {

    private static Random random = new Random();

    @Async
    @Override
    public Future<String> doTast1() throws Exception {
        System.out.println("任务一开始执行");

        Long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        Long end = System.currentTimeMillis();

        System.out.println("任务一结束，耗时：" + (end - start) + "毫秒");
        return new AsyncResult<>("任务一结束");
    }

    @Async
    @Override
    public Future<String> doTast2() throws Exception {
        System.out.println("任务二开始执行");

        Long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        Long end = System.currentTimeMillis();

        System.out.println("任务二结束，耗时：" + (end - start) + "毫秒");
        return new AsyncResult<>("任务二结束");
    }

    @Async
    @Override
    public Future<String> doTast3() throws Exception {
        System.out.println("任务三开始执行");

        Long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        Long end = System.currentTimeMillis();

        System.out.println("任务三结束，耗时：" + (end - start) + "毫秒");
        return new AsyncResult<>("任务三结束");
    }
}
