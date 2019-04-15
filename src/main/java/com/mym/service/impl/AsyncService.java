package com.mym.service.impl;


import java.util.concurrent.Future;

/**
 * @author Aming
 * @date 2019/4/15 23:28
 * @desc
 */
public interface AsyncService {

    Future<String> doTast1() throws Exception;
    Future<String> doTast2() throws Exception;
    Future<String> doTast3() throws Exception;

}
