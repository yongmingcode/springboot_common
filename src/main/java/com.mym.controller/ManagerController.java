package com.mym.controller;

import com.mym.domain.Manager;
import com.mym.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Aming
 * @date 2019/5/16 23:01
 * @desc
 */
@RestController
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    @RequestMapping("findmanagerbyid")
    public Manager findManagerById(String name){
        return managerService.findManagerByName(name);
    }
}
