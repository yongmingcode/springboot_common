package com.mym.service;

import com.mym.domain.User;

import java.util.List;

/**
 * @author Aming
 * @date 2019/4/16 23:36
 * @desc
 */
public interface UserService {

    /**
     * 新增用户信息
     * @param user 用户类
     */
    void addUser(User user);

    /**
     * mybatis新增用户
     * @param user 用户类
     */
    void addMybatisUser(User user);

    /**
     * 分页查找用户信息
     * @param page 页码
     * @param rows 条目数
     * @return 用户列表
     */
    List<User> findUserList(int page, int rows);
}
