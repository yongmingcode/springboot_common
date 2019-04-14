package com.mym.test;

import com.mym.controller.SpringController;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author Aming
 * @date 2019/4/7 21:34
 * @desc
 */
@SpringBootTest(classes = SpringController.class)//指明测试哪个类
@RunWith(SpringJUnit4ClassRunner.class)//实现测试的类
@WebAppConfiguration//Spring整合web
public class TestSpringController {//整合测试类

    @Autowired
    private SpringController springController;

    @Test
    public void test1(){
        TestCase.assertEquals(this.springController.yes(),"hello");
    }
}
