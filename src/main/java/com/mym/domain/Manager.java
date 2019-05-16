package com.mym.domain;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import java.util.Date;

/**
 * @author Aming
 * @date 2019/5/16 22:50
 * @desc
 */
@lombok.Setter
@lombok.Getter
public class Manager {

    private int id;

    private String name;

    private String nickname;

    private int gender;

    private Date createTime;

}
