package com.mym.controller;

import com.mym.domain.User;
import com.mym.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author Aming
 * @date 2019/4/16 23:39
 * @desc
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/adduser")
    public String addUser(){
        User user = new User();
        user.setName("小明");
        user.setSex(0);
        user.setBirthday(new Date());

        userService.addUser(user);

        return "success";
    }

    @RequestMapping("/addmybatisuser")
    public String addMybatisUser(){
        User user = new User();
        user.setName("小明");
        user.setSex(0);
        user.setBirthday(new Date());

        userService.addMybatisUser(user);
        return "success";
    }
}
