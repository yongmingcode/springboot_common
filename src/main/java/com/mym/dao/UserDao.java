package com.mym.dao;

import com.mym.domain.User;
import com.mym.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author Aming
 * @date 2019/4/16 23:30
 * @desc
 */
@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private UserMapper userMapper;

    public void addUser(User user){
        jdbcTemplate.update("INSERT INTO user(name,sex,birthday) VALUES (?,?,?)",new Object[]{user.getName(),user.getSex(),user.getBirthday()});
    }

    public void addMybatisUser(User user) {
        userMapper.addMybatisUser(user);
    }
}
