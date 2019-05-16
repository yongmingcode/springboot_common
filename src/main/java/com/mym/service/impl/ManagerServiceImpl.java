package com.mym.service.impl;

import com.mym.domain.Manager;
import com.mym.mapper.ManagerMapper;
import com.mym.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Aming
 * @date 2019/5/16 23:00
 * @desc
 */
@Service
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private ManagerMapper managerMapper;

    @Override
    public Manager findManagerByName(String name) {
        return managerMapper.findManagerByName(name);
    }
}
