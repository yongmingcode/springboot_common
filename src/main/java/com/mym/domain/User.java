package com.mym.domain;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * @author Aming
 * @date 2019/4/14 22:42
 * @desc
 */
public class User {

    private int id;
    private String name;
    private int sex; //1-男，0-女

    @JSONField(format = "yyyy-MM-dd HH")
    private Date birthday;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
