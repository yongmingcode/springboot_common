package com.mym.mapper;

import com.mym.domain.User;
import org.springframework.stereotype.Component;

/**
 * @author Aming
 * @date 2019/4/23 23:30
 * @desc
 */
@Component
public interface UserMapper {

    /**
     * mybatis新增用户
     * @param user 用户类
     */
    void addMybatisUser(User user);
}
