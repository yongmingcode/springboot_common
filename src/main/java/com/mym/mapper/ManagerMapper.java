package com.mym.mapper;

import com.mym.domain.Manager;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * @author Aming
 * @date 2019/5/16 22:57
 * @desc
 */
@Component
public interface ManagerMapper {

    @Select("select * from manager where name = #{name}")
    Manager findManagerByName(@Param("name") String name);
}
