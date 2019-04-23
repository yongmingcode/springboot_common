package com.mym.service.impl;

import com.mym.dao.UserDao;
import com.mym.domain.User;
import com.mym.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Aming
 * @date 2019/4/16 23:36
 * @desc
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 新增用户信息
     * @param user 用户类
     */
    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    /**
     * mybatis新增用户
     * @param user 用户类
     */
    @Override
    public void addMybatisUser(User user) {
        userDao.addMybatisUser(user);
    }

    /**
     * 分页查找用户信息
     * @param page 页码
     * @param rows 条目数
     * @return 用户列表
     */
    @Override
    public List<User> findUserList(int page, int rows) {

        return null;
    }

}
