package com.bmx.kucun.entity;

import lombok.Data;

import java.util.List;

/**
 * @Author: code generator
 * @Date: 2022/5/12
 */
@Data
public class User {
    private Integer id;
    private String userName;
    private String password;
    private List<String> authorities;

    public User(Integer id, String userName, String password, List<String> authorities) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.authorities = authorities;
    }
}
