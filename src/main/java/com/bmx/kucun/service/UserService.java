package com.bmx.kucun.service;

import com.bmx.kucun.entity.User;

/**
 * @Author: code generator
 * @Date: 2022/5/12
 */
public interface  UserService {

    User getByUserName(String userName);

    String login(String userName,String password);
}
