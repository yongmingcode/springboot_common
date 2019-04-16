package com.mym.dao;

import com.mym.domain.User;
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

    public void addUser(User user){
        jdbcTemplate.update("INSERT INTO user(name,sex,birthday) VALUES (?,?,?)",new Object[]{user.getName(),user.getSex(),user.getBirthday()});
    }

}
