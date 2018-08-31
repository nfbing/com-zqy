package com.zqy.stage.member.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 会员实体类
 * author:ningfangbing
 * date:2018-8-29
 */
@Data
public class Member implements Serializable {

    /**
     * 用户ID
     */
    private int memberId;

    /**
     * 用户名称
     */
    private String userName;
}
