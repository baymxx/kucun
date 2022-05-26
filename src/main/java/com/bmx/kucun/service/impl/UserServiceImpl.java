package com.bmx.kucun.service.impl;

import com.bmx.kucun.entity.User;
import com.bmx.kucun.service.UserService;
import com.bmx.kucun.utils.JwtUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: code generator
 * @Date: 2022/5/12
 */

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User getByUserName(String userName) {

        User user=new User(1,"bmx","123","1");
        return user;
    }

    @Override
    public String login(String userName, String password) {
       if(userName.equals("bmx") && password.equals("123")){
           return JwtUtils.createJwtToken(getByUserName(userName));
       }
       return "";
    }

    @Override
    public User getUser(String token) {

        return JwtUtils.getJwtTokenClaimValue(token);
    }
}
